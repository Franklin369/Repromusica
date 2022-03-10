package crc64986003de7f435920;


public class RealtimeBlurView_PreDrawListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnPreDrawListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPreDraw:()Z:GetOnPreDrawHandler:Android.Views.ViewTreeObserver/IOnPreDrawListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView+PreDrawListener, Sharpnado.MaterialFrame.Android", RealtimeBlurView_PreDrawListener.class, __md_methods);
	}


	public RealtimeBlurView_PreDrawListener ()
	{
		super ();
		if (getClass () == RealtimeBlurView_PreDrawListener.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView+PreDrawListener, Sharpnado.MaterialFrame.Android", "", this, new java.lang.Object[] {  });
	}

	public RealtimeBlurView_PreDrawListener (crc64986003de7f435920.RealtimeBlurView p0)
	{
		super ();
		if (getClass () == RealtimeBlurView_PreDrawListener.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView+PreDrawListener, Sharpnado.MaterialFrame.Android", "Sharpnado.MaterialFrame.Droid.RealtimeBlurView, Sharpnado.MaterialFrame.Android", this, new java.lang.Object[] { p0 });
	}


	public boolean onPreDraw ()
	{
		return n_onPreDraw ();
	}

	private native boolean n_onPreDraw ();

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
