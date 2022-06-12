using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using Xamarin.Forms;
using Repromusica.Datos;
using Repromusica.Modelo;
using Repromusica.Vistas.Reproductor;
using Plugin.SharedTransitions;
namespace Repromusica.VistaModelo
  {
  public class VMlistamusica : BaseViewModel
    {
    #region VARIABLES
    List<Mmusica> _listamusica;

    #endregion
    #region CONSTRUCTOR
    public VMlistamusica(INavigation navigation)
      {
      Navigation=navigation;
      Mostrarmusica();
      }
    #endregion
    #region OBJETOS
    public List<Mmusica> Listamusica
      {
      get { return _listamusica; }
      set { SetValue(ref _listamusica,value); }
      }
    #endregion
    #region PROCESOS
    public async Task Mostrarmusica()
      {
      var funcion = new Dmusica();
      Listamusica=await funcion.Listarmusica();
      }
    public async void Irreproductor(Mmusica parametros)
      {
    
      var page = (App.Current.MainPage as SharedTransitionNavigationPage).CurrentPage;
      SharedTransitionNavigationPage.SetBackgroundAnimation(page,BackgroundAnimation.SlideFromLeft);
      SharedTransitionNavigationPage.SetTransitionDuration(page,1000);
      SharedTransitionNavigationPage.SetTransitionSelectedGroup(page,parametros.Id);
      await Navigation.PushAsync(new Reproductor(parametros,Listamusica));
      }
    #endregion
    #region COMANDOS

    public ICommand Irreproductorcommand => new Command<Mmusica>(Irreproductor);
    
    #endregion
    }
  }
