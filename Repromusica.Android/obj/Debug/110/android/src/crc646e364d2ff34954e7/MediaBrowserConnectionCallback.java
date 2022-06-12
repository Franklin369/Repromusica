package crc646e364d2ff34954e7;


public class MediaBrowserConnectionCallback
	extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnected:()V:GetOnConnectedHandler\n" +
			"n_onConnectionFailed:()V:GetOnConnectionFailedHandler\n" +
			"n_onConnectionSuspended:()V:GetOnConnectionSuspendedHandler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.MediaSession.MediaBrowserConnectionCallback, MediaManager", MediaBrowserConnectionCallback.class, __md_methods);
	}


	public MediaBrowserConnectionCallback ()
	{
		super ();
		if (getClass () == MediaBrowserConnectionCallback.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.MediaSession.MediaBrowserConnectionCallback, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onConnected ()
	{
		n_onConnected ();
	}

	private native void n_onConnected ();


	public void onConnectionFailed ()
	{
		n_onConnectionFailed ();
	}

	private native void n_onConnectionFailed ();


	public void onConnectionSuspended ()
	{
		n_onConnectionSuspended ();
	}

	private native void n_onConnectionSuspended ();

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
