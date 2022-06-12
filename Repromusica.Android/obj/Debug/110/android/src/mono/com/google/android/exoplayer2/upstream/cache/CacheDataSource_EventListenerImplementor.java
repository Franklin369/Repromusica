package mono.com.google.android.exoplayer2.upstream.cache;


public class CacheDataSource_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCacheIgnored:(I)V:GetOnCacheIgnored_IHandler:Com.Google.Android.Exoplayer2.Upstream.Cache.CacheDataSource/IEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onCachedBytesRead:(JJ)V:GetOnCachedBytesRead_JJHandler:Com.Google.Android.Exoplayer2.Upstream.Cache.CacheDataSource/IEventListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Upstream.Cache.CacheDataSource+IEventListenerImplementor, ExoPlayer.Core", CacheDataSource_EventListenerImplementor.class, __md_methods);
	}


	public CacheDataSource_EventListenerImplementor ()
	{
		super ();
		if (getClass () == CacheDataSource_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Upstream.Cache.CacheDataSource+IEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onCacheIgnored (int p0)
	{
		n_onCacheIgnored (p0);
	}

	private native void n_onCacheIgnored (int p0);


	public void onCachedBytesRead (long p0, long p1)
	{
		n_onCachedBytesRead (p0, p1);
	}

	private native void n_onCachedBytesRead (long p0, long p1);

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
