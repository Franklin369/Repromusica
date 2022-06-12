package mono.com.google.android.exoplayer2.ui;


public class PlayerControlView_ProgressUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ui.PlayerControlView.ProgressUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgressUpdate:(JJ)V:GetOnProgressUpdate_JJHandler:Com.Google.Android.Exoplayer2.UI.PlayerControlView/IProgressUpdateListenerInvoker, ExoPlayer.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.UI.PlayerControlView+IProgressUpdateListenerImplementor, ExoPlayer.UI", PlayerControlView_ProgressUpdateListenerImplementor.class, __md_methods);
	}


	public PlayerControlView_ProgressUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == PlayerControlView_ProgressUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.PlayerControlView+IProgressUpdateListenerImplementor, ExoPlayer.UI", "", this, new java.lang.Object[] {  });
	}


	public void onProgressUpdate (long p0, long p1)
	{
		n_onProgressUpdate (p0, p1);
	}

	private native void n_onProgressUpdate (long p0, long p1);

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
