package mono.com.google.android.exoplayer2.drm;


public class ExoMediaDrm_OnEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEvent:(Lcom/google/android/exoplayer2/drm/ExoMediaDrm;[BII[B)V:GetOnEvent_Lcom_google_android_exoplayer2_drm_ExoMediaDrm_arrayBIIarrayBHandler:Com.Google.Android.Exoplayer2.Drm.IExoMediaDrmOnEventListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Drm.IExoMediaDrmOnEventListenerImplementor, ExoPlayer.Core", ExoMediaDrm_OnEventListenerImplementor.class, __md_methods);
	}


	public ExoMediaDrm_OnEventListenerImplementor ()
	{
		super ();
		if (getClass () == ExoMediaDrm_OnEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Drm.IExoMediaDrmOnEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onEvent (com.google.android.exoplayer2.drm.ExoMediaDrm p0, byte[] p1, int p2, int p3, byte[] p4)
	{
		n_onEvent (p0, p1, p2, p3, p4);
	}

	private native void n_onEvent (com.google.android.exoplayer2.drm.ExoMediaDrm p0, byte[] p1, int p2, int p3, byte[] p4);

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
