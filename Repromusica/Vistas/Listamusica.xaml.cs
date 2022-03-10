using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using Repromusica.VistaModelo;
namespace Repromusica.Vistas
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Listamusica : ContentPage
    {
        public Listamusica()
        {
            InitializeComponent();
            BindingContext = new VMlistamusica(Navigation);
        }
    }
}