package crc646e364d2ff34954e7;


public class MediaSessionCallback
	extends android.support.v4.media.session.MediaSessionCompat.Callback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAddQueueItem:(Landroid/support/v4/media/MediaDescriptionCompat;)V:GetOnAddQueueItem_Landroid_support_v4_media_MediaDescriptionCompat_Handler\n" +
			"n_onAddQueueItem:(Landroid/support/v4/media/MediaDescriptionCompat;I)V:GetOnAddQueueItem_Landroid_support_v4_media_MediaDescriptionCompat_IHandler\n" +
			"n_onFastForward:()V:GetOnFastForwardHandler\n" +
			"n_onMediaButtonEvent:(Landroid/content/Intent;)Z:GetOnMediaButtonEvent_Landroid_content_Intent_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onPlay:()V:GetOnPlayHandler\n" +
			"n_onPlayFromMediaId:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnPlayFromMediaId_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_onPlayFromSearch:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnPlayFromSearch_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_onPlayFromUri:(Landroid/net/Uri;Landroid/os/Bundle;)V:GetOnPlayFromUri_Landroid_net_Uri_Landroid_os_Bundle_Handler\n" +
			"n_onPrepare:()V:GetOnPrepareHandler\n" +
			"n_onPrepareFromMediaId:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnPrepareFromMediaId_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_onPrepareFromSearch:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnPrepareFromSearch_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_onPrepareFromUri:(Landroid/net/Uri;Landroid/os/Bundle;)V:GetOnPrepareFromUri_Landroid_net_Uri_Landroid_os_Bundle_Handler\n" +
			"n_onRemoveQueueItem:(Landroid/support/v4/media/MediaDescriptionCompat;)V:GetOnRemoveQueueItem_Landroid_support_v4_media_MediaDescriptionCompat_Handler\n" +
			"n_onRemoveQueueItemAt:(I)V:GetOnRemoveQueueItemAt_IHandler\n" +
			"n_onRewind:()V:GetOnRewindHandler\n" +
			"n_onSeekTo:(J)V:GetOnSeekTo_JHandler\n" +
			"n_onSetCaptioningEnabled:(Z)V:GetOnSetCaptioningEnabled_ZHandler\n" +
			"n_onSetRating:(Landroid/support/v4/media/RatingCompat;)V:GetOnSetRating_Landroid_support_v4_media_RatingCompat_Handler\n" +
			"n_onSetRating:(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V:GetOnSetRating_Landroid_support_v4_media_RatingCompat_Landroid_os_Bundle_Handler\n" +
			"n_onSetRepeatMode:(I)V:GetOnSetRepeatMode_IHandler\n" +
			"n_onSetShuffleMode:(I)V:GetOnSetShuffleMode_IHandler\n" +
			"n_onSkipToNext:()V:GetOnSkipToNextHandler\n" +
			"n_onSkipToPrevious:()V:GetOnSkipToPreviousHandler\n" +
			"n_onSkipToQueueItem:(J)V:GetOnSkipToQueueItem_JHandler\n" +
			"n_onStop:()V:GetOnStopHandler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.MediaSession.MediaSessionCallback, MediaManager", MediaSessionCallback.class, __md_methods);
	}


	public MediaSessionCallback ()
	{
		super ();
		if (getClass () == MediaSessionCallback.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.MediaSession.MediaSessionCallback, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onAddQueueItem (android.support.v4.media.MediaDescriptionCompat p0)
	{
		n_onAddQueueItem (p0);
	}

	private native void n_onAddQueueItem (android.support.v4.media.MediaDescriptionCompat p0);


	public void onAddQueueItem (android.support.v4.media.MediaDescriptionCompat p0, int p1)
	{
		n_onAddQueueItem (p0, p1);
	}

	private native void n_onAddQueueItem (android.support.v4.media.MediaDescriptionCompat p0, int p1);


	public void onFastForward ()
	{
		n_onFastForward ();
	}

	private native void n_onFastForward ();


	public boolean onMediaButtonEvent (android.content.Intent p0)
	{
		return n_onMediaButtonEvent (p0);
	}

	private native boolean n_onMediaButtonEvent (android.content.Intent p0);


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onPlay ()
	{
		n_onPlay ();
	}

	private native void n_onPlay ();


	public void onPlayFromMediaId (java.lang.String p0, android.os.Bundle p1)
	{
		n_onPlayFromMediaId (p0, p1);
	}

	private native void n_onPlayFromMediaId (java.lang.String p0, android.os.Bundle p1);


	public void onPlayFromSearch (java.lang.String p0, android.os.Bundle p1)
	{
		n_onPlayFromSearch (p0, p1);
	}

	private native void n_onPlayFromSearch (java.lang.String p0, android.os.Bundle p1);


	public void onPlayFromUri (android.net.Uri p0, android.os.Bundle p1)
	{
		n_onPlayFromUri (p0, p1);
	}

	private native void n_onPlayFromUri (android.net.Uri p0, android.os.Bundle p1);


	public void onPrepare ()
	{
		n_onPrepare ();
	}

	private native void n_onPrepare ();


	public void onPrepareFromMediaId (java.lang.String p0, android.os.Bundle p1)
	{
		n_onPrepareFromMediaId (p0, p1);
	}

	private native void n_onPrepareFromMediaId (java.lang.String p0, android.os.Bundle p1);


	public void onPrepareFromSearch (java.lang.String p0, android.os.Bundle p1)
	{
		n_onPrepareFromSearch (p0, p1);
	}

	private native void n_onPrepareFromSearch (java.lang.String p0, android.os.Bundle p1);


	public void onPrepareFromUri (android.net.Uri p0, android.os.Bundle p1)
	{
		n_onPrepareFromUri (p0, p1);
	}

	private native void n_onPrepareFromUri (android.net.Uri p0, android.os.Bundle p1);


	public void onRemoveQueueItem (android.support.v4.media.MediaDescriptionCompat p0)
	{
		n_onRemoveQueueItem (p0);
	}

	private native void n_onRemoveQueueItem (android.support.v4.media.MediaDescriptionCompat p0);


	public void onRemoveQueueItemAt (int p0)
	{
		n_onRemoveQueueItemAt (p0);
	}

	private native void n_onRemoveQueueItemAt (int p0);


	public void onRewind ()
	{
		n_onRewind ();
	}

	private native void n_onRewind ();


	public void onSeekTo (long p0)
	{
		n_onSeekTo (p0);
	}

	private native void n_onSeekTo (long p0);


	public void onSetCaptioningEnabled (boolean p0)
	{
		n_onSetCaptioningEnabled (p0);
	}

	private native void n_onSetCaptioningEnabled (boolean p0);


	public void onSetRating (android.support.v4.media.RatingCompat p0)
	{
		n_onSetRating (p0);
	}

	private native void n_onSetRating (android.support.v4.media.RatingCompat p0);


	public void onSetRating (android.support.v4.media.RatingCompat p0, android.os.Bundle p1)
	{
		n_onSetRating (p0, p1);
	}

	private native void n_onSetRating (android.support.v4.media.RatingCompat p0, android.os.Bundle p1);


	public void onSetRepeatMode (int p0)
	{
		n_onSetRepeatMode (p0);
	}

	private native void n_onSetRepeatMode (int p0);


	public void onSetShuffleMode (int p0)
	{
		n_onSetShuffleMode (p0);
	}

	private native void n_onSetShuffleMode (int p0);


	public void onSkipToNext ()
	{
		n_onSkipToNext ();
	}

	private native void n_onSkipToNext ();


	public void onSkipToPrevious ()
	{
		n_onSkipToPrevious ();
	}

	private native void n_onSkipToPrevious ();


	public void onSkipToQueueItem (long p0)
	{
		n_onSkipToQueueItem (p0);
	}

	private native void n_onSkipToQueueItem (long p0);


	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();

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
