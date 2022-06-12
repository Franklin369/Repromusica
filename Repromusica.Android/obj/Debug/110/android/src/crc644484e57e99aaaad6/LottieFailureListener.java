package crc644484e57e99aaaad6;


public class LottieFailureListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.airbnb.lottie.LottieListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Ljava/lang/Object;)V:GetOnResult_Ljava_lang_Object_Handler:Com.Airbnb.Lottie.ILottieListenerInvoker, Lottie.Android\n" +
			"";
		mono.android.Runtime.register ("Lottie.Forms.Platforms.Android.LottieFailureListener, Lottie.Forms", LottieFailureListener.class, __md_methods);
	}


	public LottieFailureListener ()
	{
		super ();
		if (getClass () == LottieFailureListener.class)
			mono.android.TypeManager.Activate ("Lottie.Forms.Platforms.Android.LottieFailureListener, Lottie.Forms", "", this, new java.lang.Object[] {  });
	}


	public void onResult (java.lang.Object p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (java.lang.Object p0);

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
