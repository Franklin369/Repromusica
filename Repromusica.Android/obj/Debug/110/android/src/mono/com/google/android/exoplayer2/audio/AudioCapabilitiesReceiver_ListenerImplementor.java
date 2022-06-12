package mono.com.google.android.exoplayer2.audio;


public class AudioCapabilitiesReceiver_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioCapabilitiesChanged:(Lcom/google/android/exoplayer2/audio/AudioCapabilities;)V:GetOnAudioCapabilitiesChanged_Lcom_google_android_exoplayer2_audio_AudioCapabilities_Handler:Com.Google.Android.Exoplayer2.Audio.AudioCapabilitiesReceiver/IListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Audio.AudioCapabilitiesReceiver+IListenerImplementor, ExoPlayer.Core", AudioCapabilitiesReceiver_ListenerImplementor.class, __md_methods);
	}


	public AudioCapabilitiesReceiver_ListenerImplementor ()
	{
		super ();
		if (getClass () == AudioCapabilitiesReceiver_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Audio.AudioCapabilitiesReceiver+IListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onAudioCapabilitiesChanged (com.google.android.exoplayer2.audio.AudioCapabilities p0)
	{
		n_onAudioCapabilitiesChanged (p0);
	}

	private native void n_onAudioCapabilitiesChanged (com.google.android.exoplayer2.audio.AudioCapabilities p0);

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
