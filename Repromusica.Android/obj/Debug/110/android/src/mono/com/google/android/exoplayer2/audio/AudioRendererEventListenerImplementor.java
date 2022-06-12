package mono.com.google.android.exoplayer2.audio;


public class AudioRendererEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.audio.AudioRendererEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioDecoderInitialized:(Ljava/lang/String;JJ)V:GetOnAudioDecoderInitialized_Ljava_lang_String_JJHandler:Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListener, ExoPlayer.Core\n" +
			"n_onAudioDisabled:(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V:GetOnAudioDisabled_Lcom_google_android_exoplayer2_decoder_DecoderCounters_Handler:Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListener, ExoPlayer.Core\n" +
			"n_onAudioEnabled:(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V:GetOnAudioEnabled_Lcom_google_android_exoplayer2_decoder_DecoderCounters_Handler:Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListener, ExoPlayer.Core\n" +
			"n_onAudioInputFormatChanged:(Lcom/google/android/exoplayer2/Format;)V:GetOnAudioInputFormatChanged_Lcom_google_android_exoplayer2_Format_Handler:Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListener, ExoPlayer.Core\n" +
			"n_onAudioSessionId:(I)V:GetOnAudioSessionId_IHandler:Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListener, ExoPlayer.Core\n" +
			"n_onAudioSinkUnderrun:(IJJ)V:GetOnAudioSinkUnderrun_IJJHandler:Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListener, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListenerImplementor, ExoPlayer.Core", AudioRendererEventListenerImplementor.class, __md_methods);
	}


	public AudioRendererEventListenerImplementor ()
	{
		super ();
		if (getClass () == AudioRendererEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Audio.IAudioRendererEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onAudioDecoderInitialized (java.lang.String p0, long p1, long p2)
	{
		n_onAudioDecoderInitialized (p0, p1, p2);
	}

	private native void n_onAudioDecoderInitialized (java.lang.String p0, long p1, long p2);


	public void onAudioDisabled (com.google.android.exoplayer2.decoder.DecoderCounters p0)
	{
		n_onAudioDisabled (p0);
	}

	private native void n_onAudioDisabled (com.google.android.exoplayer2.decoder.DecoderCounters p0);


	public void onAudioEnabled (com.google.android.exoplayer2.decoder.DecoderCounters p0)
	{
		n_onAudioEnabled (p0);
	}

	private native void n_onAudioEnabled (com.google.android.exoplayer2.decoder.DecoderCounters p0);


	public void onAudioInputFormatChanged (com.google.android.exoplayer2.Format p0)
	{
		n_onAudioInputFormatChanged (p0);
	}

	private native void n_onAudioInputFormatChanged (com.google.android.exoplayer2.Format p0);


	public void onAudioSessionId (int p0)
	{
		n_onAudioSessionId (p0);
	}

	private native void n_onAudioSessionId (int p0);


	public void onAudioSinkUnderrun (int p0, long p1, long p2)
	{
		n_onAudioSinkUnderrun (p0, p1, p2);
	}

	private native void n_onAudioSinkUnderrun (int p0, long p1, long p2);

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
