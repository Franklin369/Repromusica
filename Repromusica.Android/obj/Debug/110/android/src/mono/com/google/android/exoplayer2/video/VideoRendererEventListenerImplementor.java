package mono.com.google.android.exoplayer2.video;


public class VideoRendererEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.video.VideoRendererEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDroppedFrames:(IJ)V:GetOnDroppedFrames_IJHandler:Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListener, ExoPlayer.Core\n" +
			"n_onRenderedFirstFrame:(Landroid/view/Surface;)V:GetOnRenderedFirstFrame_Landroid_view_Surface_Handler:Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListener, ExoPlayer.Core\n" +
			"n_onVideoDecoderInitialized:(Ljava/lang/String;JJ)V:GetOnVideoDecoderInitialized_Ljava_lang_String_JJHandler:Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListener, ExoPlayer.Core\n" +
			"n_onVideoDisabled:(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V:GetOnVideoDisabled_Lcom_google_android_exoplayer2_decoder_DecoderCounters_Handler:Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListener, ExoPlayer.Core\n" +
			"n_onVideoEnabled:(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V:GetOnVideoEnabled_Lcom_google_android_exoplayer2_decoder_DecoderCounters_Handler:Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListener, ExoPlayer.Core\n" +
			"n_onVideoInputFormatChanged:(Lcom/google/android/exoplayer2/Format;)V:GetOnVideoInputFormatChanged_Lcom_google_android_exoplayer2_Format_Handler:Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListener, ExoPlayer.Core\n" +
			"n_onVideoSizeChanged:(IIIF)V:GetOnVideoSizeChanged_IIIFHandler:Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListener, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListenerImplementor, ExoPlayer.Core", VideoRendererEventListenerImplementor.class, __md_methods);
	}


	public VideoRendererEventListenerImplementor ()
	{
		super ();
		if (getClass () == VideoRendererEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Video.IVideoRendererEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onDroppedFrames (int p0, long p1)
	{
		n_onDroppedFrames (p0, p1);
	}

	private native void n_onDroppedFrames (int p0, long p1);


	public void onRenderedFirstFrame (android.view.Surface p0)
	{
		n_onRenderedFirstFrame (p0);
	}

	private native void n_onRenderedFirstFrame (android.view.Surface p0);


	public void onVideoDecoderInitialized (java.lang.String p0, long p1, long p2)
	{
		n_onVideoDecoderInitialized (p0, p1, p2);
	}

	private native void n_onVideoDecoderInitialized (java.lang.String p0, long p1, long p2);


	public void onVideoDisabled (com.google.android.exoplayer2.decoder.DecoderCounters p0)
	{
		n_onVideoDisabled (p0);
	}

	private native void n_onVideoDisabled (com.google.android.exoplayer2.decoder.DecoderCounters p0);


	public void onVideoEnabled (com.google.android.exoplayer2.decoder.DecoderCounters p0)
	{
		n_onVideoEnabled (p0);
	}

	private native void n_onVideoEnabled (com.google.android.exoplayer2.decoder.DecoderCounters p0);


	public void onVideoInputFormatChanged (com.google.android.exoplayer2.Format p0)
	{
		n_onVideoInputFormatChanged (p0);
	}

	private native void n_onVideoInputFormatChanged (com.google.android.exoplayer2.Format p0);


	public void onVideoSizeChanged (int p0, int p1, int p2, float p3)
	{
		n_onVideoSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onVideoSizeChanged (int p0, int p1, int p2, float p3);

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
