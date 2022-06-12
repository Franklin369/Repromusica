package crc646e364d2ff34954e7;


public class MediaBrowserSubscriptionCallback
	extends android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChildrenLoaded:(Ljava/lang/String;Ljava/util/List;)V:GetOnChildrenLoaded_Ljava_lang_String_Ljava_util_List_Handler\n" +
			"n_onChildrenLoaded:(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V:GetOnChildrenLoaded_Ljava_lang_String_Ljava_util_List_Landroid_os_Bundle_Handler\n" +
			"n_onError:(Ljava/lang/String;)V:GetOnError_Ljava_lang_String_Handler\n" +
			"n_onError:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnError_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.MediaSession.MediaBrowserSubscriptionCallback, MediaManager", MediaBrowserSubscriptionCallback.class, __md_methods);
	}


	public MediaBrowserSubscriptionCallback ()
	{
		super ();
		if (getClass () == MediaBrowserSubscriptionCallback.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.MediaSession.MediaBrowserSubscriptionCallback, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onChildrenLoaded (java.lang.String p0, java.util.List p1)
	{
		n_onChildrenLoaded (p0, p1);
	}

	private native void n_onChildrenLoaded (java.lang.String p0, java.util.List p1);


	public void onChildrenLoaded (java.lang.String p0, java.util.List p1, android.os.Bundle p2)
	{
		n_onChildrenLoaded (p0, p1, p2);
	}

	private native void n_onChildrenLoaded (java.lang.String p0, java.util.List p1, android.os.Bundle p2);


	public void onError (java.lang.String p0)
	{
		n_onError (p0);
	}

	private native void n_onError (java.lang.String p0);


	public void onError (java.lang.String p0, android.os.Bundle p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (java.lang.String p0, android.os.Bundle p1);

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
