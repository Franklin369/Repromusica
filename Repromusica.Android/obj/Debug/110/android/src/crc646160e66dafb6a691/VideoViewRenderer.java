package crc646160e66dafb6a691;


public class VideoViewRenderer
	extends crc64720bb2db43a66fe9.ViewRenderer_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Forms.Platforms.Android.VideoViewRenderer, MediaManager.Forms", VideoViewRenderer.class, __md_methods);
	}


	public VideoViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == VideoViewRenderer.class)
			mono.android.TypeManager.Activate ("MediaManager.Forms.Platforms.Android.VideoViewRenderer, MediaManager.Forms", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public VideoViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == VideoViewRenderer.class)
			mono.android.TypeManager.Activate ("MediaManager.Forms.Platforms.Android.VideoViewRenderer, MediaManager.Forms", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public VideoViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == VideoViewRenderer.class)
			mono.android.TypeManager.Activate ("MediaManager.Forms.Platforms.Android.VideoViewRenderer, MediaManager.Forms", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);

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
