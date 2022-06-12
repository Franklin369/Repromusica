package mono.com.google.android.exoplayer2.video.spherical;


public class CameraMotionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.video.spherical.CameraMotionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraMotion:(J[F)V:GetOnCameraMotion_JarrayFHandler:Com.Google.Android.Exoplayer2.Video.Spherical.ICameraMotionListenerInvoker, ExoPlayer.Core\n" +
			"n_onCameraMotionReset:()V:GetOnCameraMotionResetHandler:Com.Google.Android.Exoplayer2.Video.Spherical.ICameraMotionListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Video.Spherical.ICameraMotionListenerImplementor, ExoPlayer.Core", CameraMotionListenerImplementor.class, __md_methods);
	}


	public CameraMotionListenerImplementor ()
	{
		super ();
		if (getClass () == CameraMotionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Video.Spherical.ICameraMotionListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onCameraMotion (long p0, float[] p1)
	{
		n_onCameraMotion (p0, p1);
	}

	private native void n_onCameraMotion (long p0, float[] p1);


	public void onCameraMotionReset ()
	{
		n_onCameraMotionReset ();
	}

	private native void n_onCameraMotionReset ();

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
