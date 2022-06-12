package mono.com.google.android.exoplayer2.ui;


public class PlayerNotificationManager_NotificationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNotificationCancelled:(IZ)V:GetOnNotificationCancelled_IZHandler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/INotificationListener, ExoPlayer.UI\n" +
			"n_onNotificationPosted:(ILandroid/app/Notification;Z)V:GetOnNotificationPosted_ILandroid_app_Notification_ZHandler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/INotificationListener, ExoPlayer.UI\n" +
			"n_onNotificationStarted:(ILandroid/app/Notification;)V:GetOnNotificationStarted_ILandroid_app_Notification_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/INotificationListener, ExoPlayer.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+INotificationListenerImplementor, ExoPlayer.UI", PlayerNotificationManager_NotificationListenerImplementor.class, __md_methods);
	}


	public PlayerNotificationManager_NotificationListenerImplementor ()
	{
		super ();
		if (getClass () == PlayerNotificationManager_NotificationListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+INotificationListenerImplementor, ExoPlayer.UI", "", this, new java.lang.Object[] {  });
	}


	public void onNotificationCancelled (int p0, boolean p1)
	{
		n_onNotificationCancelled (p0, p1);
	}

	private native void n_onNotificationCancelled (int p0, boolean p1);


	public void onNotificationPosted (int p0, android.app.Notification p1, boolean p2)
	{
		n_onNotificationPosted (p0, p1, p2);
	}

	private native void n_onNotificationPosted (int p0, android.app.Notification p1, boolean p2);


	public void onNotificationStarted (int p0, android.app.Notification p1)
	{
		n_onNotificationStarted (p0, p1);
	}

	private native void n_onNotificationStarted (int p0, android.app.Notification p1);

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
