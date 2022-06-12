package mono.com.google.android.exoplayer2.upstream;


public class BandwidthMeter_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBandwidthSample:(IJJ)V:GetOnBandwidthSample_IJJHandler:Com.Google.Android.Exoplayer2.Upstream.IBandwidthMeterEventListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Upstream.IBandwidthMeterEventListenerImplementor, ExoPlayer.Core", BandwidthMeter_EventListenerImplementor.class, __md_methods);
	}


	public BandwidthMeter_EventListenerImplementor ()
	{
		super ();
		if (getClass () == BandwidthMeter_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Upstream.IBandwidthMeterEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onBandwidthSample (int p0, long p1, long p2)
	{
		n_onBandwidthSample (p0, p1, p2);
	}

	private native void n_onBandwidthSample (int p0, long p1, long p2);

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
