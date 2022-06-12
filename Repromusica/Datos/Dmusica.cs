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
                    Nombre="Provenza",
                    Autor="Karol G",
                    Icono= "prov.jpg",
                    Url= "https://firebasestorage.googleapis.com/v0/b/registrosruc.appspot.com/o/KAROL%20G%20-%20PROVENZA%20(Official%20Video).mp3?alt=media&token=90705445-dff2-414b-90b9-d3c49aa8f581"
                },
                 new Mmusica
                 {
                     Nombre = "Cold Heart",
                     Autor = "Elton John - Dua L",
                     Icono = "elton.png"
                ,
                     Url = "https://firebasestorage.googleapis.com/v0/b/registrosruc.appspot.com/o/Elton%20John%2C%20Dua%20Lipa%20-%20Cold%20Heart%20(PNAU%20Remix)%20(Official%20Video).mp3?alt=media&token=d488cd06-1f65-450a-ab77-cdc1f5d93a4b"
                 },
                  new Mmusica
                  {
                      Nombre = "Heart Of Glass",
                      Autor = "Miley Cyrus",
                      Icono = "mm.jpeg"
                     ,
                      Url = "https://firebasestorage.googleapis.com/v0/b/registrosruc.appspot.com/o/Miley%20Cyrus%20-%20Heart%20Of%20Glass%20(Live%20from%20the%20iHeart%20Festival).mp3?alt=media&token=06896f7c-a662-4b93-94cd-b050a2fb2db8"
                  },
                  new Mmusica
                  {
                      Nombre = "Mi amor",
                      Autor = "Dread mar",
                      Icono = "dd.jpg"
                     ,
                      Url = "https://firebasestorage.googleapis.com/v0/b/registrosruc.appspot.com/o/Dread%20Mar%20I%20-%20Mi%20Amor%20(En%20Vivo).mp3?alt=media&token=d133bfba-d3fa-4788-9155-7febb821a29b"
                  }

            };
            return lista;
        }
    }
}
