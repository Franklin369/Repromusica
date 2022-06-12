package crc646e364d2ff34954e7;


public class MediaBrowserService
	extends androidx.media.MediaBrowserServiceCompat
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:()V:GetOnCreateHandler\n" +
			"n_onStartCommand:(Landroid/content/Intent;II)I:GetOnStartCommand_Landroid_content_Intent_IIHandler\n" +
			"n_onTaskRemoved:(Landroid/content/Intent;)V:GetOnTaskRemoved_Landroid_content_Intent_Handler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onGetRoot:(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;:GetOnGetRoot_Ljava_lang_String_ILandroid_os_Bundle_Handler\n" +
			"n_onLoadChildren:(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$Result;)V:GetOnLoadChildren_Ljava_lang_String_Landroidx_media_MediaBrowserServiceCompat_Result_Handler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.MediaSession.MediaBrowserService, MediaManager", MediaBrowserService.class, __md_methods);
	}


	public MediaBrowserService ()
	{
		super ();
		if (getClass () == MediaBrowserService.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.MediaSession.MediaBrowserService, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onCreate ()
	{
		n_onCreate ();
	}

	private native void n_onCreate ();


	public int onStartCommand (android.content.Intent p0, int p1, int p2)
	{
		return n_onStartCommand (p0, p1, p2);
	}

	private native int n_onStartCommand (android.content.Intent p0, int p1, int p2);


	public void onTaskRemoved (android.content.Intent p0)
	{
		n_onTaskRemoved (p0);
	}

	private native void n_onTaskRemoved (android.content.Intent p0);


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot (java.lang.String p0, int p1, android.os.Bundle p2)
	{
		return n_onGetRoot (p0, p1, p2);
	}

	private native androidx.media.MediaBrowserServiceCompat.BrowserRoot n_onGetRoot (java.lang.String p0, int p1, android.os.Bundle p2);


	public void onLoadChildren (java.lang.String p0, androidx.media.MediaBrowserServiceCompat.Result p1)
	{
		n_onLoadChildren (p0, p1);
	}

	private native void n_onLoadChildren (java.lang.String p0, androidx.media.MediaBrowserServiceCompat.Result p1);

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
