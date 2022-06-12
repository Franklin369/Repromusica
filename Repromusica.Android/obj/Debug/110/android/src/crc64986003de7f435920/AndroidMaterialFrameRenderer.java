package crc64986003de7f435920;


public class AndroidMaterialFrameRenderer
	extends crc64720bb2db43a66fe9.FrameRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onSizeChanged:(IIII)V:GetOnSizeChanged_IIIIHandler\n" +
			"";
		mono.android.Runtime.register ("Sharpnado.MaterialFrame.Droid.AndroidMaterialFrameRenderer, Sharpnado.MaterialFrame.Android", AndroidMaterialFrameRenderer.class, __md_methods);
	}


	public AndroidMaterialFrameRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == AndroidMaterialFrameRenderer.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.AndroidMaterialFrameRenderer, Sharpnado.MaterialFrame.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public AndroidMaterialFrameRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == AndroidMaterialFrameRenderer.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.AndroidMaterialFrameRenderer, Sharpnado.MaterialFrame.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public AndroidMaterialFrameRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == AndroidMaterialFrameRenderer.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.AndroidMaterialFrameRenderer, Sharpnado.MaterialFrame.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onSizeChanged (int p0, int p1, int p2, int p3)
	{
		n_onSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onSizeChanged (int p0, int p1, int p2, int p3);

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
