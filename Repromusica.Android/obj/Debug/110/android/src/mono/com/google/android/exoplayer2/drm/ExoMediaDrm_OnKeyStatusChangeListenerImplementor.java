package mono.com.google.android.exoplayer2.drm;


public class ExoMediaDrm_OnKeyStatusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.drm.ExoMediaDrm.OnKeyStatusChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onKeyStatusChange:(Lcom/google/android/exoplayer2/drm/ExoMediaDrm;[BLjava/util/List;Z)V:GetOnKeyStatusChange_Lcom_google_android_exoplayer2_drm_ExoMediaDrm_arrayBLjava_util_List_ZHandler:Com.Google.Android.Exoplayer2.Drm.IExoMediaDrmOnKeyStatusChangeListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Drm.IExoMediaDrmOnKeyStatusChangeListenerImplementor, ExoPlayer.Core", ExoMediaDrm_OnKeyStatusChangeListenerImplementor.class, __md_methods);
	}


	public ExoMediaDrm_OnKeyStatusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ExoMediaDrm_OnKeyStatusChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Drm.IExoMediaDrmOnKeyStatusChangeListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onKeyStatusChange (com.google.android.exoplayer2.drm.ExoMediaDrm p0, byte[] p1, java.util.List p2, boolean p3)
	{
		n_onKeyStatusChange (p0, p1, p2, p3);
	}

	private native void n_onKeyStatusChange (com.google.android.exoplayer2.drm.ExoMediaDrm p0, byte[] p1, java.util.List p2, boolean p3);

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
