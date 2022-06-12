package crc644484e57e99aaaad6;


public class LottieAndroidComposition
	extends com.airbnb.lottie.LottieComposition
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Lottie.Forms.Platforms.Android.LottieAndroidComposition, Lottie.Forms", LottieAndroidComposition.class, __md_methods);
	}


	public LottieAndroidComposition ()
	{
		super ();
		if (getClass () == LottieAndroidComposition.class)
			mono.android.TypeManager.Activate ("Lottie.Forms.Platforms.Android.LottieAndroidComposition, Lottie.Forms", "", this, new java.lang.Object[] {  });
	}

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
