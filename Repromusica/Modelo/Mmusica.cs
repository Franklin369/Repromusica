using System;
using System.Collections.Generic;
using System.Text;

using Repromusica.VistaModelo;

namespace Repromusica.Modelo
  {
  public class Mmusica : BaseViewModel
    {
    public Mmusica()
      {
      Id=Guid.NewGuid().ToString();
      }
    public string Id { get; set; }
    public string Nombre { get; set; }
    public string Autor { get; set; }
    public string Icono { get; set; }
    public string Url { get; set; }
    //Objetos
    public TimeSpan duracion { get; set; }
    public TimeSpan Duracion
      {
      get { return duracion; }
      set { duracion=value; OnPropertyChanged(); }
      }
    TimeSpan posicion { get; set; }
    public TimeSpan Posicion
      {
      get { return posicion; }
      set { posicion=value; OnPropertyChanged(); }
      }
    double progress = 100f;
    public double Progress
      {
      get { return progress; }
      set {
        if (value>0)
          {
          progress=value;
          OnPropertyChanged();
          }
        }
      }
    }
  }
