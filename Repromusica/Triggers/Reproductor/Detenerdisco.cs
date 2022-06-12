using System;
using System.Collections.Generic;
using System.Text;

using Xamarin.Forms;

namespace Repromusica.Triggers.Reproductor
  {
  public class Detenerdisco:TriggerAction<View>
    {

    protected override void Invoke(View sender)
      {
      var page = (App.Current.MainPage as NavigationPage).CurrentPage;
      page.AbortAnimation("rotate");
      }
    }
  }
