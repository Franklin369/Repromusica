using System;
using System.Collections.Generic;
using System.Text;

using Lottie.Forms;

using Xamarin.Forms;
namespace Repromusica.Triggers.Reproductor
  {
  public class Startlottie : TriggerAction<AnimationView>
    {
    protected override void Invoke(AnimationView sender)
      {
      sender.PlayAnimation();
      }
    }
  }
