package crc644484e57e99aaaad6;


public class LottieOnCompositionLoadedListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.airbnb.lottie.LottieOnCompositionLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCompositionLoaded:(Lcom/airbnb/lottie/LottieComposition;)V:GetOnCompositionLoaded_Lcom_airbnb_lottie_LottieComposition_Handler:Com.Airbnb.Lottie.ILottieOnCompositionLoadedListenerInvoker, Lottie.Android\n" +
			"";
		mono.android.Runtime.register ("Lottie.Forms.Platforms.Android.LottieOnCompositionLoadedListener, Lottie.Forms", LottieOnCompositionLoadedListener.class, __md_methods);
	}


	public LottieOnCompositionLoadedListener ()
	{
		super ();
		if (getClass () == LottieOnCompositionLoadedListener.class)
			mono.android.TypeManager.Activate ("Lottie.Forms.Platforms.Android.LottieOnCompositionLoadedListener, Lottie.Forms", "", this, new java.lang.Object[] {  });
	}


	public void onCompositionLoaded (com.airbnb.lottie.LottieComposition p0)
	{
		n_onCompositionLoaded (p0);
	}

	private native void n_onCompositionLoaded (com.airbnb.lottie.LottieComposition p0);

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
