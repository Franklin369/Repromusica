package crc64986003de7f435920;


public class RealtimeBlurView
	extends android.view.View
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVisibilityChanged:(Landroid/view/View;I)V:GetOnVisibilityChanged_Landroid_view_View_IHandler\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView, Sharpnado.MaterialFrame.Android", RealtimeBlurView.class, __md_methods);
	}


	public RealtimeBlurView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RealtimeBlurView.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView, Sharpnado.MaterialFrame.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public RealtimeBlurView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RealtimeBlurView.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView, Sharpnado.MaterialFrame.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public RealtimeBlurView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RealtimeBlurView.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView, Sharpnado.MaterialFrame.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public RealtimeBlurView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == RealtimeBlurView.class)
			mono.android.TypeManager.Activate ("Sharpnado.MaterialFrame.Droid.RealtimeBlurView, Sharpnado.MaterialFrame.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onVisibilityChanged (android.view.View p0, int p1)
	{
		n_onVisibilityChanged (p0, p1);
	}

	private native void n_onVisibilityChanged (android.view.View p0, int p1);


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);

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
