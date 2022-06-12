package mono.com.google.android.exoplayer2.ui;


public class TrackSelectionView_TrackSelectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ui.TrackSelectionView.TrackSelectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTrackSelectionChanged:(ZLjava/util/List;)V:GetOnTrackSelectionChanged_ZLjava_util_List_Handler:Com.Google.Android.Exoplayer2.UI.TrackSelectionView/ITrackSelectionListenerInvoker, ExoPlayer.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.UI.TrackSelectionView+ITrackSelectionListenerImplementor, ExoPlayer.UI", TrackSelectionView_TrackSelectionListenerImplementor.class, __md_methods);
	}


	public TrackSelectionView_TrackSelectionListenerImplementor ()
	{
		super ();
		if (getClass () == TrackSelectionView_TrackSelectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.TrackSelectionView+ITrackSelectionListenerImplementor, ExoPlayer.UI", "", this, new java.lang.Object[] {  });
	}


	public void onTrackSelectionChanged (boolean p0, java.util.List p1)
	{
		n_onTrackSelectionChanged (p0, p1);
	}

	private native void n_onTrackSelectionChanged (boolean p0, java.util.List p1);

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
