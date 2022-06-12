package mono.com.google.android.exoplayer2.ui;


public class TimeBar_OnScrubListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrubMove:(Lcom/google/android/exoplayer2/ui/TimeBar;J)V:GetOnScrubMove_Lcom_google_android_exoplayer2_ui_TimeBar_JHandler:Com.Google.Android.Exoplayer2.UI.ITimeBarOnScrubListenerInvoker, ExoPlayer.UI\n" +
			"n_onScrubStart:(Lcom/google/android/exoplayer2/ui/TimeBar;J)V:GetOnScrubStart_Lcom_google_android_exoplayer2_ui_TimeBar_JHandler:Com.Google.Android.Exoplayer2.UI.ITimeBarOnScrubListenerInvoker, ExoPlayer.UI\n" +
			"n_onScrubStop:(Lcom/google/android/exoplayer2/ui/TimeBar;JZ)V:GetOnScrubStop_Lcom_google_android_exoplayer2_ui_TimeBar_JZHandler:Com.Google.Android.Exoplayer2.UI.ITimeBarOnScrubListenerInvoker, ExoPlayer.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.UI.ITimeBarOnScrubListenerImplementor, ExoPlayer.UI", TimeBar_OnScrubListenerImplementor.class, __md_methods);
	}


	public TimeBar_OnScrubListenerImplementor ()
	{
		super ();
		if (getClass () == TimeBar_OnScrubListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.ITimeBarOnScrubListenerImplementor, ExoPlayer.UI", "", this, new java.lang.Object[] {  });
	}


	public void onScrubMove (com.google.android.exoplayer2.ui.TimeBar p0, long p1)
	{
		n_onScrubMove (p0, p1);
	}

	private native void n_onScrubMove (com.google.android.exoplayer2.ui.TimeBar p0, long p1);


	public void onScrubStart (com.google.android.exoplayer2.ui.TimeBar p0, long p1)
	{
		n_onScrubStart (p0, p1);
	}

	private native void n_onScrubStart (com.google.android.exoplayer2.ui.TimeBar p0, long p1);


	public void onScrubStop (com.google.android.exoplayer2.ui.TimeBar p0, long p1, boolean p2)
	{
		n_onScrubStop (p0, p1, p2);
	}

	private native void n_onScrubStop (com.google.android.exoplayer2.ui.TimeBar p0, long p1, boolean p2);

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
