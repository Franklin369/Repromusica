package mono.com.google.android.exoplayer2.util;


public class EGLSurfaceTexture_TextureImageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.util.EGLSurfaceTexture.TextureImageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFrameAvailable:()V:GetOnFrameAvailableHandler:Com.Google.Android.Exoplayer2.Util.EGLSurfaceTexture/ITextureImageListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Util.EGLSurfaceTexture+ITextureImageListenerImplementor, ExoPlayer.Core", EGLSurfaceTexture_TextureImageListenerImplementor.class, __md_methods);
	}


	public EGLSurfaceTexture_TextureImageListenerImplementor ()
	{
		super ();
		if (getClass () == EGLSurfaceTexture_TextureImageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Util.EGLSurfaceTexture+ITextureImageListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onFrameAvailable ()
	{
		n_onFrameAvailable ();
	}

	private native void n_onFrameAvailable ();

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
