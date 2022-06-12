package mono.com.google.android.exoplayer2.video;


public class VideoFrameMetadataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.video.VideoFrameMetadataListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVideoFrameAboutToBeRendered:(JJLcom/google/android/exoplayer2/Format;Landroid/media/MediaFormat;)V:GetOnVideoFrameAboutToBeRendered_JJLcom_google_android_exoplayer2_Format_Landroid_media_MediaFormat_Handler:Com.Google.Android.Exoplayer2.Video.IVideoFrameMetadataListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Video.IVideoFrameMetadataListenerImplementor, ExoPlayer.Core", VideoFrameMetadataListenerImplementor.class, __md_methods);
	}


	public VideoFrameMetadataListenerImplementor ()
	{
		super ();
		if (getClass () == VideoFrameMetadataListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Video.IVideoFrameMetadataListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onVideoFrameAboutToBeRendered (long p0, long p1, com.google.android.exoplayer2.Format p2, android.media.MediaFormat p3)
	{
		n_onVideoFrameAboutToBeRendered (p0, p1, p2, p3);
	}

	private native void n_onVideoFrameAboutToBeRendered (long p0, long p1, com.google.android.exoplayer2.Format p2, android.media.MediaFormat p3);

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
