using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using Repromusica.Vistas.Reproductor;
using Repromusica.Vistas;
using Plugin.SharedTransitions;
namespace Repromusica
  {
  public partial class App : Application
    {
    public App()
      {
      InitializeComponent();
      MainPage=new SharedTransitionNavigationPage(new Listamusica());
      }

    protected override void OnStart()
      {
      }

    protected override void OnSleep()
      {
      }

    protected override void OnResume()
      {
      }
    }
  }
