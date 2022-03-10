using Repromusica.Modelo;
using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

namespace Repromusica.Datos
{
    public class Dmusica
    {
        public async Task <List<Mmusica>> Listarmusica()
        {
            var lista = new List<Mmusica>()
            {
                new Mmusica
                {
                    Nombre="Pepas",
                    Autor="Farruco",
                    Icono= "https://i.ibb.co/YQ7H56Q/maxresdefault.jpg",
                    Url= "https://firebasestorage.googleapis.com/v0/b/musicaapp-7c86f.appspot.com/o/pepas.mp3?alt=media&token=1ec33539-2930-4ef4-88d1-ee3d679e9232"
                },
                 new Mmusica
                 {
                     Nombre = "Tengo reservado el hotel ",
                     Autor = "Rauw Alejandro",
                     Icono = "https://i.ibb.co/2dZvz5t/image.jpg"
                ,
                     Url = "https://firebasestorage.googleapis.com/v0/b/dragonball-91cc7.appspot.com/o/hotel.mp3?alt=media&token=23f75ebd-9a0b-43da-85a7-cebd4d5b3b4e"
                 },
                  new Mmusica
                  {
                      Nombre = "Lo Siento BB",
                      Autor = "Julieta Venegas, Bad Bunny",
                      Icono = "https://i.ibb.co/2W563k7/julieta-venegas.jpg"
                     ,
                      Url = "https://firebasestorage.googleapis.com/v0/b/dragonball-91cc7.appspot.com/o/Losiento.mp3?alt=media&token=8af3ab4b-e695-4ef9-a749-0020207abed7"
                  },
                  new Mmusica
                  {
                      Nombre = "Programando",
                      Autor = "Lofi",
                      Icono = "https://i.ibb.co/MR0q2n5/Chilled-Cow-snap.jpg"
                     ,
                      Url = "https://firebasestorage.googleapis.com/v0/b/musicaapp-7c86f.appspot.com/o/queda.mp3?alt=media&token=69ae6fb6-ecb2-4574-a867-ff96b05465f5"
                  }

            };
            return lista;
        }
    }
}
