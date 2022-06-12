package mono.com.google.android.exoplayer2.drm;


public class DefaultDrmSessionEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDrmKeysLoaded:()V:GetOnDrmKeysLoadedHandler:Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListener, ExoPlayer.Core\n" +
			"n_onDrmKeysRemoved:()V:GetOnDrmKeysRemovedHandler:Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListener, ExoPlayer.Core\n" +
			"n_onDrmKeysRestored:()V:GetOnDrmKeysRestoredHandler:Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListener, ExoPlayer.Core\n" +
			"n_onDrmSessionAcquired:()V:GetOnDrmSessionAcquiredHandler:Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListener, ExoPlayer.Core\n" +
			"n_onDrmSessionManagerError:(Ljava/lang/Exception;)V:GetOnDrmSessionManagerError_Ljava_lang_Exception_Handler:Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListener, ExoPlayer.Core\n" +
			"n_onDrmSessionReleased:()V:GetOnDrmSessionReleasedHandler:Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListener, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListenerImplementor, ExoPlayer.Core", DefaultDrmSessionEventListenerImplementor.class, __md_methods);
	}


	public DefaultDrmSessionEventListenerImplementor ()
	{
		super ();
		if (getClass () == DefaultDrmSessionEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Drm.IDefaultDrmSessionEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onDrmKeysLoaded ()
	{
		n_onDrmKeysLoaded ();
	}

	private native void n_onDrmKeysLoaded ();


	public void onDrmKeysRemoved ()
	{
		n_onDrmKeysRemoved ();
	}

	private native void n_onDrmKeysRemoved ();


	public void onDrmKeysRestored ()
	{
		n_onDrmKeysRestored ();
	}

	private native void n_onDrmKeysRestored ();


	public void onDrmSessionAcquired ()
	{
		n_onDrmSessionAcquired ();
	}

	private native void n_onDrmSessionAcquired ();


	public void onDrmSessionManagerError (java.lang.Exception p0)
	{
		n_onDrmSessionManagerError (p0);
	}

	private native void n_onDrmSessionManagerError (java.lang.Exception p0);


	public void onDrmSessionReleased ()
	{
		n_onDrmSessionReleased ();
	}

	private native void n_onDrmSessionReleased ();

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
