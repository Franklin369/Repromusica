package mono.com.google.android.exoplayer2.source;


public class MediaSourceEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.source.MediaSourceEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDownstreamFormatChanged:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;)V:GetOnDownstreamFormatChanged_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_MediaLoadData_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onLoadCanceled:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$LoadEventInfo;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;)V:GetOnLoadCanceled_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_LoadEventInfo_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_MediaLoadData_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onLoadCompleted:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$LoadEventInfo;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;)V:GetOnLoadCompleted_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_LoadEventInfo_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_MediaLoadData_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onLoadError:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$LoadEventInfo;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;Ljava/io/IOException;Z)V:GetOnLoadError_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_LoadEventInfo_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_MediaLoadData_Ljava_io_IOException_ZHandler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onLoadStarted:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$LoadEventInfo;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;)V:GetOnLoadStarted_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_LoadEventInfo_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_MediaLoadData_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onMediaPeriodCreated:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)V:GetOnMediaPeriodCreated_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onMediaPeriodReleased:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)V:GetOnMediaPeriodReleased_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onReadingStarted:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;)V:GetOnReadingStarted_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"n_onUpstreamDiscarded:(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;)V:GetOnUpstreamDiscarded_ILcom_google_android_exoplayer2_source_MediaSource_MediaPeriodId_Lcom_google_android_exoplayer2_source_MediaSourceEventListener_MediaLoadData_Handler:Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListener, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListenerImplementor, ExoPlayer.Core", MediaSourceEventListenerImplementor.class, __md_methods);
	}


	public MediaSourceEventListenerImplementor ()
	{
		super ();
		if (getClass () == MediaSourceEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Source.IMediaSourceEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onDownstreamFormatChanged (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p2)
	{
		n_onDownstreamFormatChanged (p0, p1, p2);
	}

	private native void n_onDownstreamFormatChanged (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p2);


	public void onLoadCanceled (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3)
	{
		n_onLoadCanceled (p0, p1, p2, p3);
	}

	private native void n_onLoadCanceled (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3);


	public void onLoadCompleted (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3)
	{
		n_onLoadCompleted (p0, p1, p2, p3);
	}

	private native void n_onLoadCompleted (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3);


	public void onLoadError (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3, java.io.IOException p4, boolean p5)
	{
		n_onLoadError (p0, p1, p2, p3, p4, p5);
	}

	private native void n_onLoadError (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3, java.io.IOException p4, boolean p5);


	public void onLoadStarted (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3)
	{
		n_onLoadStarted (p0, p1, p2, p3);
	}

	private native void n_onLoadStarted (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo p2, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p3);


	public void onMediaPeriodCreated (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1)
	{
		n_onMediaPeriodCreated (p0, p1);
	}

	private native void n_onMediaPeriodCreated (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1);


	public void onMediaPeriodReleased (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1)
	{
		n_onMediaPeriodReleased (p0, p1);
	}

	private native void n_onMediaPeriodReleased (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1);


	public void onReadingStarted (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1)
	{
		n_onReadingStarted (p0, p1);
	}

	private native void n_onReadingStarted (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1);


	public void onUpstreamDiscarded (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p2)
	{
		n_onUpstreamDiscarded (p0, p1, p2);
	}

	private native void n_onUpstreamDiscarded (int p0, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId p1, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData p2);

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
