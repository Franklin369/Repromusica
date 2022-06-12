package crc64e4f2de3961e06b46;


public class RatingCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.RatingCallback,
		com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CommandReceiver
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSetRating:(Lcom/google/android/exoplayer2/Player;Landroid/support/v4/media/RatingCompat;)V:GetOnSetRating_Lcom_google_android_exoplayer2_Player_Landroid_support_v4_media_RatingCompat_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/IRatingCallbackInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_onSetRating:(Lcom/google/android/exoplayer2/Player;Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V:GetOnSetRating_Lcom_google_android_exoplayer2_Player_Landroid_support_v4_media_RatingCompat_Landroid_os_Bundle_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/IRatingCallbackInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_onCommand:(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/ControlDispatcher;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)Z:GetOnCommand_Lcom_google_android_exoplayer2_Player_Lcom_google_android_exoplayer2_ControlDispatcher_Ljava_lang_String_Landroid_os_Bundle_Landroid_os_ResultReceiver_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/ICommandReceiverInvoker, ExoPlayer.Ext.MediaSession\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Player.RatingCallback, MediaManager", RatingCallback.class, __md_methods);
	}


	public RatingCallback ()
	{
		super ();
		if (getClass () == RatingCallback.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Player.RatingCallback, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onSetRating (com.google.android.exoplayer2.Player p0, android.support.v4.media.RatingCompat p1)
	{
		n_onSetRating (p0, p1);
	}

	private native void n_onSetRating (com.google.android.exoplayer2.Player p0, android.support.v4.media.RatingCompat p1);


	public void onSetRating (com.google.android.exoplayer2.Player p0, android.support.v4.media.RatingCompat p1, android.os.Bundle p2)
	{
		n_onSetRating (p0, p1, p2);
	}

	private native void n_onSetRating (com.google.android.exoplayer2.Player p0, android.support.v4.media.RatingCompat p1, android.os.Bundle p2);


	public boolean onCommand (com.google.android.exoplayer2.Player p0, com.google.android.exoplayer2.ControlDispatcher p1, java.lang.String p2, android.os.Bundle p3, android.os.ResultReceiver p4)
	{
		return n_onCommand (p0, p1, p2, p3, p4);
	}

	private native boolean n_onCommand (com.google.android.exoplayer2.Player p0, com.google.android.exoplayer2.ControlDispatcher p1, java.lang.String p2, android.os.Bundle p3, android.os.ResultReceiver p4);

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
