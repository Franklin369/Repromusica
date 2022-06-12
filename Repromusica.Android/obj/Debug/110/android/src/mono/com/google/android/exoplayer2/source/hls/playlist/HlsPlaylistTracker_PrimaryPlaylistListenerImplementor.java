package mono.com.google.android.exoplayer2.source.hls.playlist;


public class HlsPlaylistTracker_PrimaryPlaylistListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrimaryPlaylistRefreshed:(Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;)V:GetOnPrimaryPlaylistRefreshed_Lcom_google_android_exoplayer2_source_hls_playlist_HlsMediaPlaylist_Handler:Com.Google.Android.Exoplayer2.Source.Hls.Playlist.IHlsPlaylistTrackerPrimaryPlaylistListenerInvoker, ExoPlayer.Hls\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Source.Hls.Playlist.IHlsPlaylistTrackerPrimaryPlaylistListenerImplementor, ExoPlayer.Hls", HlsPlaylistTracker_PrimaryPlaylistListenerImplementor.class, __md_methods);
	}


	public HlsPlaylistTracker_PrimaryPlaylistListenerImplementor ()
	{
		super ();
		if (getClass () == HlsPlaylistTracker_PrimaryPlaylistListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Source.Hls.Playlist.IHlsPlaylistTrackerPrimaryPlaylistListenerImplementor, ExoPlayer.Hls", "", this, new java.lang.Object[] {  });
	}


	public void onPrimaryPlaylistRefreshed (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist p0)
	{
		n_onPrimaryPlaylistRefreshed (p0);
	}

	private native void n_onPrimaryPlaylistRefreshed (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist p0);

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
