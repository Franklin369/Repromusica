package crc64b3caa80b73acb1ef;


public class QueueNavigator
	extends com.google.android.exoplayer2.ext.mediasession.TimelineQueueNavigator
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getMediaDescription:(Lcom/google/android/exoplayer2/Player;I)Landroid/support/v4/media/MediaDescriptionCompat;:GetGetMediaDescription_Lcom_google_android_exoplayer2_Player_IHandler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Queue.QueueNavigator, MediaManager", QueueNavigator.class, __md_methods);
	}


	public QueueNavigator (android.support.v4.media.session.MediaSessionCompat p0)
	{
		super (p0);
		if (getClass () == QueueNavigator.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Queue.QueueNavigator, MediaManager", "Android.Support.V4.Media.Session.MediaSessionCompat, Xamarin.AndroidX.Media", this, new java.lang.Object[] { p0 });
	}


	public QueueNavigator (android.support.v4.media.session.MediaSessionCompat p0, int p1)
	{
		super (p0, p1);
		if (getClass () == QueueNavigator.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Queue.QueueNavigator, MediaManager", "Android.Support.V4.Media.Session.MediaSessionCompat, Xamarin.AndroidX.Media:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public android.support.v4.media.MediaDescriptionCompat getMediaDescription (com.google.android.exoplayer2.Player p0, int p1)
	{
		return n_getMediaDescription (p0, p1);
	}

	private native android.support.v4.media.MediaDescriptionCompat n_getMediaDescription (com.google.android.exoplayer2.Player p0, int p1);

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
