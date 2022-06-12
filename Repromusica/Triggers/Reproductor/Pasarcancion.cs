using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
namespace Repromusica.Triggers.Reproductor
  {
  public class Pasarcancion : TriggerAction<View>
    {
    protected override async void Invoke(View sender)
      {
      await sender.ScaleTo(0,500,Easing.CubicInOut);
      await sender.FadeTo(1,400,Easing.CubicInOut);
      await sender.FadeTo(0,250,Easing.CubicInOut);
      await sender.FadeTo(1,100,Easing.CubicInOut);
      await sender.ScaleTo(1,300,Easing.BounceOut);
      }
    }
  }
