package mono.com.google.android.exoplayer2.source;


public class SingleSampleMediaSource_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.source.SingleSampleMediaSource.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadError:(ILjava/io/IOException;)V:GetOnLoadError_ILjava_io_IOException_Handler:Com.Google.Android.Exoplayer2.Source.SingleSampleMediaSource/IEventListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Source.SingleSampleMediaSource+IEventListenerImplementor, ExoPlayer.Core", SingleSampleMediaSource_EventListenerImplementor.class, __md_methods);
	}


	public SingleSampleMediaSource_EventListenerImplementor ()
	{
		super ();
		if (getClass () == SingleSampleMediaSource_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Source.SingleSampleMediaSource+IEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onLoadError (int p0, java.io.IOException p1)
	{
		n_onLoadError (p0, p1);
	}

	private native void n_onLoadError (int p0, java.io.IOException p1);

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
