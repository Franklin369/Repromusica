using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
using Xamarin.Forms;
using Repromusica.Datos;
using Repromusica.Modelo;
namespace Repromusica.VistaModelo
{
    public class VMlistamusica:BaseViewModel
    {
        #region VARIABLES
        List<Mmusica> _listamusica;

        #endregion
        #region CONSTRUCTOR
        public VMlistamusica(INavigation navigation)
        {
            Navigation = navigation;
            Mostrarmusica();
        }
        #endregion
        #region OBJETOS
        public List<Mmusica> Listamusica
        {
            get { return _listamusica; }
            set { SetValue(ref _listamusica, value); }
        }
        #endregion
        #region PROCESOS
        public async Task Mostrarmusica()
        {
            var funcion = new Dmusica();
            Listamusica = await funcion.Listarmusica();
        }
        public void ProcesoSimple()
        {

        }
        #endregion
        #region COMANDOS
       // public ICommand ProcesoAsyncommand => new Command(async () => await ProcesoAsyncrono());
        public ICommand ProcesoSimpcommand => new Command(ProcesoSimple);
        #endregion
    }
}
