using System;
using System.Collections.Generic;
using System.Text;

using Plugin.SharedTransitions;

using Xamarin.Forms;

namespace Repromusica.Triggers.Reproductor
  {
  public class Rotardisco : TriggerAction<View>
    {
  
    protected override  void Invoke(View sender)
      {
      var page = (App.Current.MainPage as NavigationPage).CurrentPage;
      var rotacion = new Animation(v => sender.Rotation=v,0,360,Easing.Linear);
      rotacion.Commit(page,"rotate",16,1000,Easing.Linear,(v,c) => sender.Rotation=0,() => true);
      }
    }
  }
