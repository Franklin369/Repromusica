package crc646e364d2ff34954e7;


public class MediaControllerCallback
	extends android.support.v4.media.session.MediaControllerCompat.Callback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPlaybackStateChanged:(Landroid/support/v4/media/session/PlaybackStateCompat;)V:GetOnPlaybackStateChanged_Landroid_support_v4_media_session_PlaybackStateCompat_Handler\n" +
			"n_onMetadataChanged:(Landroid/support/v4/media/MediaMetadataCompat;)V:GetOnMetadataChanged_Landroid_support_v4_media_MediaMetadataCompat_Handler\n" +
			"n_onSessionEvent:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnSessionEvent_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_binderDied:()V:GetBinderDiedHandler\n" +
			"n_onAudioInfoChanged:(Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;)V:GetOnAudioInfoChanged_Landroid_support_v4_media_session_MediaControllerCompat_PlaybackInfo_Handler\n" +
			"n_onCaptioningEnabledChanged:(Z)V:GetOnCaptioningEnabledChanged_ZHandler\n" +
			"n_onExtrasChanged:(Landroid/os/Bundle;)V:GetOnExtrasChanged_Landroid_os_Bundle_Handler\n" +
			"n_onQueueChanged:(Ljava/util/List;)V:GetOnQueueChanged_Ljava_util_List_Handler\n" +
			"n_onQueueTitleChanged:(Ljava/lang/CharSequence;)V:GetOnQueueTitleChanged_Ljava_lang_CharSequence_Handler\n" +
			"n_onRepeatModeChanged:(I)V:GetOnRepeatModeChanged_IHandler\n" +
			"n_onSessionDestroyed:()V:GetOnSessionDestroyedHandler\n" +
			"n_onSessionReady:()V:GetOnSessionReadyHandler\n" +
			"n_onShuffleModeChanged:(I)V:GetOnShuffleModeChanged_IHandler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.MediaSession.MediaControllerCallback, MediaManager", MediaControllerCallback.class, __md_methods);
	}


	public MediaControllerCallback ()
	{
		super ();
		if (getClass () == MediaControllerCallback.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.MediaSession.MediaControllerCallback, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onPlaybackStateChanged (android.support.v4.media.session.PlaybackStateCompat p0)
	{
		n_onPlaybackStateChanged (p0);
	}

	private native void n_onPlaybackStateChanged (android.support.v4.media.session.PlaybackStateCompat p0);


	public void onMetadataChanged (android.support.v4.media.MediaMetadataCompat p0)
	{
		n_onMetadataChanged (p0);
	}

	private native void n_onMetadataChanged (android.support.v4.media.MediaMetadataCompat p0);


	public void onSessionEvent (java.lang.String p0, android.os.Bundle p1)
	{
		n_onSessionEvent (p0, p1);
	}

	private native void n_onSessionEvent (java.lang.String p0, android.os.Bundle p1);


	public void binderDied ()
	{
		n_binderDied ();
	}

	private native void n_binderDied ();


	public void onAudioInfoChanged (android.support.v4.media.session.MediaControllerCompat.PlaybackInfo p0)
	{
		n_onAudioInfoChanged (p0);
	}

	private native void n_onAudioInfoChanged (android.support.v4.media.session.MediaControllerCompat.PlaybackInfo p0);


	public void onCaptioningEnabledChanged (boolean p0)
	{
		n_onCaptioningEnabledChanged (p0);
	}

	private native void n_onCaptioningEnabledChanged (boolean p0);


	public void onExtrasChanged (android.os.Bundle p0)
	{
		n_onExtrasChanged (p0);
	}

	private native void n_onExtrasChanged (android.os.Bundle p0);


	public void onQueueChanged (java.util.List p0)
	{
		n_onQueueChanged (p0);
	}

	private native void n_onQueueChanged (java.util.List p0);


	public void onQueueTitleChanged (java.lang.CharSequence p0)
	{
		n_onQueueTitleChanged (p0);
	}

	private native void n_onQueueTitleChanged (java.lang.CharSequence p0);


	public void onRepeatModeChanged (int p0)
	{
		n_onRepeatModeChanged (p0);
	}

	private native void n_onRepeatModeChanged (int p0);


	public void onSessionDestroyed ()
	{
		n_onSessionDestroyed ();
	}

	private native void n_onSessionDestroyed ();


	public void onSessionReady ()
	{
		n_onSessionReady ();
	}

	private native void n_onSessionReady ();


	public void onShuffleModeChanged (int p0)
	{
		n_onShuffleModeChanged (p0);
	}

	private native void n_onShuffleModeChanged (int p0);

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
