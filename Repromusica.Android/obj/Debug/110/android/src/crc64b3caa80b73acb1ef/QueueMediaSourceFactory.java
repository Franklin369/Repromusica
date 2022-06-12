package crc64b3caa80b73acb1ef;


public class QueueMediaSourceFactory
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ext.mediasession.TimelineQueueEditor.MediaSourceFactory
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createMediaSource:(Landroid/support/v4/media/MediaDescriptionCompat;)Lcom/google/android/exoplayer2/source/MediaSource;:GetCreateMediaSource_Landroid_support_v4_media_MediaDescriptionCompat_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.TimelineQueueEditor/IMediaSourceFactoryInvoker, ExoPlayer.Ext.MediaSession\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Queue.QueueMediaSourceFactory, MediaManager", QueueMediaSourceFactory.class, __md_methods);
	}


	public QueueMediaSourceFactory ()
	{
		super ();
		if (getClass () == QueueMediaSourceFactory.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Queue.QueueMediaSourceFactory, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public com.google.android.exoplayer2.source.MediaSource createMediaSource (android.support.v4.media.MediaDescriptionCompat p0)
	{
		return n_createMediaSource (p0);
	}

	private native com.google.android.exoplayer2.source.MediaSource n_createMediaSource (android.support.v4.media.MediaDescriptionCompat p0);

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
