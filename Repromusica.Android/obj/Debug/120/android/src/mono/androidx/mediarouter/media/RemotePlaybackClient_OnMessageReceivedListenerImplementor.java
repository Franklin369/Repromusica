package mono.androidx.mediarouter.media;


public class RemotePlaybackClient_OnMessageReceivedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.mediarouter.media.RemotePlaybackClient.OnMessageReceivedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMessageReceived:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnMessageReceived_Ljava_lang_String_Landroid_os_Bundle_Handler:AndroidX.MediaRouter.Media.RemotePlaybackClient/IOnMessageReceivedListenerInvoker, Xamarin.AndroidX.MediaRouter\n" +
			"";
		mono.android.Runtime.register ("AndroidX.MediaRouter.Media.RemotePlaybackClient+IOnMessageReceivedListenerImplementor, Xamarin.AndroidX.MediaRouter", RemotePlaybackClient_OnMessageReceivedListenerImplementor.class, __md_methods);
	}


	public RemotePlaybackClient_OnMessageReceivedListenerImplementor ()
	{
		super ();
		if (getClass () == RemotePlaybackClient_OnMessageReceivedListenerImplementor.class)
			mono.android.TypeManager.Activate ("AndroidX.MediaRouter.Media.RemotePlaybackClient+IOnMessageReceivedListenerImplementor, Xamarin.AndroidX.MediaRouter", "", this, new java.lang.Object[] {  });
	}


	public void onMessageReceived (java.lang.String p0, android.os.Bundle p1)
	{
		n_onMessageReceived (p0, p1);
	}

	private native void n_onMessageReceived (java.lang.String p0, android.os.Bundle p1);

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
