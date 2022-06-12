using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Repromusica.Modelo;
using Repromusica.VistaModelo;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Repromusica.Vistas.Reproductor
  {
  [XamlCompilation(XamlCompilationOptions.Compile)]
  public partial class Reproductor : ContentPage
    {
    public Reproductor(Mmusica parametros,List<Mmusica> lista)
      {
      InitializeComponent();
      BindingContext=new VMreproductor(Navigation,parametros,lista);
     
      }
    }
  }