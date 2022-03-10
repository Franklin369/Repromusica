using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using Repromusica.Vistas;
namespace Repromusica
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            MainPage = new NavigationPage(new Listamusica());
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
