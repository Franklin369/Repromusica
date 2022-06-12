using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

using MediaManager;

using Plugin.SharedTransitions;

using Repromusica.Modelo;

using Xamarin.Forms;

namespace Repromusica.VistaModelo
  {
  public class VMreproductor : BaseViewModel
    {
    #region VARIABLES
    public Mmusica parametrosRecibe { get; set; }
    private bool isPlay;
    List<Mmusica> _listarecibe;
    bool _ispasar;
    public string PlayIcon { get => isPlay ? "pause.png" : "play.png"; }
    private Mmusica selectMusic;
    #endregion
    #region CONSTRUCTOR
    public VMreproductor(INavigation navigation,Mmusica parametrosTrae,List<Mmusica> Listatrae)
      {
      Navigation=navigation;
      ParametrosRecibe=parametrosTrae;
      PlayMusic(ParametrosRecibe);
      IsPlay=true;
      _listarecibe=Listatrae;
      //Rotar(o);
      }
    #endregion
    #region OBJETOS
    public bool Ispasar
      {
      get { return _ispasar; }
      set {
        _ispasar=value;
        OnPropertyChanged();
        }
      }

    public Mmusica ParametrosRecibe
      {
      get { return parametrosRecibe; }
      set {
        parametrosRecibe=value;
        OnPropertyChanged();
        }
      }

    public bool IsPlay
      {
      get { return isPlay; }
      set {
        isPlay=value;
        OnPropertyChanged();
        OnPropertyChanged(nameof(PlayIcon));
        }
      }
    #endregion
    #region PROCESOS
    private void Previus()
      {
      Ispasar=false;
      var currentIndex = _listarecibe.IndexOf(selectMusic);
      if (currentIndex>0)
        {
        Ispasar=true;
        selectMusic=_listarecibe[currentIndex-1];
        var t = Task.Run(async delegate
          {
            await Task.Delay(1000);
            ParametrosRecibe=selectMusic;
            });
        PlayMusic(selectMusic);
        }
      }
    private void Next()
      {
      //Index canciones 0 1 2 3
      //count 4
      Ispasar=false;
      var currentIndex = _listarecibe.IndexOf(selectMusic);
      if (currentIndex<_listarecibe.Count-1)
        {
        Ispasar=true;
        selectMusic=_listarecibe[currentIndex+1];
        var t = Task.Run(async delegate
          {
            await Task.Delay(1000);
            ParametrosRecibe=selectMusic;
            });

        PlayMusic(selectMusic);
        // 
        }
      }
    private async Task Play()
      {
      if (isPlay)
        {
        await CrossMediaManager.Current.Pause();
        IsPlay=false;
        }
      else
        {
        await CrossMediaManager.Current.Play();
        IsPlay=true;
        }
      }
    private async void PlayMusic(Mmusica parametros)
      {
      // Isnext=false;
      var mediInfo = CrossMediaManager.Current;
      await mediInfo.Play(parametros?.Url);
     
      Device.StartTimer(TimeSpan.FromMilliseconds(500),() =>
      {
        parametrosRecibe.Duracion=mediInfo.Duration;
        parametrosRecibe.Progress=mediInfo.Position.TotalSeconds;
        parametrosRecibe.Posicion=mediInfo.Position;
        return true;
      });
      }
    private void ChangeMusic(object obj)
      {
      if ((string)obj=="P")
        Previus();
      else if ((string)obj=="N")
        Next();
      }
    private void Rotar(object o)
      {
      Image myimage = (Image)o;
      var page = (App.Current.MainPage as NavigationPage).CurrentPage;
      var rotacion = new Animation(v => myimage.Rotation=v,0,360,Easing.Linear);
      rotacion.Commit(page,"rotate",16,1000,Easing.Linear,(v,c) => myimage.Rotation=0,() => true);
      }
 
    #endregion
    #region COMANDOS
    public ICommand Rotarcommand => new Command((o) => Rotar(o));
    public ICommand ChangeCommand => new Command(ChangeMusic);
    public ICommand Playcommand => new Command(async p => await Play());
    public ICommand Previuscommand => new Command(Previus);
    public ICommand Nextcommand => new Command(Next);

    #endregion
    }
  }
