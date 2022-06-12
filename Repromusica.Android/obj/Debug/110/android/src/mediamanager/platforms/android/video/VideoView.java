package mediamanager.platforms.android.video;


public class VideoView
	extends com.google.android.exoplayer2.ui.PlayerView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Video.VideoView, MediaManager", VideoView.class, __md_methods);
	}


	public VideoView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == VideoView.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Video.VideoView, MediaManager", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public VideoView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == VideoView.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Video.VideoView, MediaManager", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public VideoView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == VideoView.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Video.VideoView, MediaManager", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
