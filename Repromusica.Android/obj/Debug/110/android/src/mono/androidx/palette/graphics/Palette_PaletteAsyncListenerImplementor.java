package mono.androidx.palette.graphics;


public class Palette_PaletteAsyncListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.palette.graphics.Palette.PaletteAsyncListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGenerated:(Landroidx/palette/graphics/Palette;)V:GetOnGenerated_Landroidx_palette_graphics_Palette_Handler:AndroidX.Palette.Graphics.Palette/IPaletteAsyncListenerInvoker, Xamarin.AndroidX.Palette\n" +
			"";
		mono.android.Runtime.register ("AndroidX.Palette.Graphics.Palette+IPaletteAsyncListenerImplementor, Xamarin.AndroidX.Palette", Palette_PaletteAsyncListenerImplementor.class, __md_methods);
	}


	public Palette_PaletteAsyncListenerImplementor ()
	{
		super ();
		if (getClass () == Palette_PaletteAsyncListenerImplementor.class)
			mono.android.TypeManager.Activate ("AndroidX.Palette.Graphics.Palette+IPaletteAsyncListenerImplementor, Xamarin.AndroidX.Palette", "", this, new java.lang.Object[] {  });
	}


	public void onGenerated (androidx.palette.graphics.Palette p0)
	{
		n_onGenerated (p0);
	}

	private native void n_onGenerated (androidx.palette.graphics.Palette p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
