package mono.com.google.android.exoplayer2.audio;


public class AudioListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.audio.AudioListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioAttributesChanged:(Lcom/google/android/exoplayer2/audio/AudioAttributes;)V:GetOnAudioAttributesChanged_Lcom_google_android_exoplayer2_audio_AudioAttributes_Handler:Com.Google.Android.Exoplayer2.Audio.IAudioListener, ExoPlayer.Core\n" +
			"n_onAudioSessionId:(I)V:GetOnAudioSessionId_IHandler:Com.Google.Android.Exoplayer2.Audio.IAudioListener, ExoPlayer.Core\n" +
			"n_onVolumeChanged:(F)V:GetOnVolumeChanged_FHandler:Com.Google.Android.Exoplayer2.Audio.IAudioListener, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Audio.IAudioListenerImplementor, ExoPlayer.Core", AudioListenerImplementor.class, __md_methods);
	}


	public AudioListenerImplementor ()
	{
		super ();
		if (getClass () == AudioListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Audio.IAudioListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onAudioAttributesChanged (com.google.android.exoplayer2.audio.AudioAttributes p0)
	{
		n_onAudioAttributesChanged (p0);
	}

	private native void n_onAudioAttributesChanged (com.google.android.exoplayer2.audio.AudioAttributes p0);


	public void onAudioSessionId (int p0)
	{
		n_onAudioSessionId (p0);
	}

	private native void n_onAudioSessionId (int p0);


	public void onVolumeChanged (float p0)
	{
		n_onVolumeChanged (p0);
	}

	private native void n_onVolumeChanged (float p0);

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
