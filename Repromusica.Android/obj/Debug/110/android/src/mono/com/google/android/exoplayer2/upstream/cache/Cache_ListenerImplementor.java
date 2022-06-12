package mono.com.google.android.exoplayer2.upstream.cache;


public class Cache_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.upstream.cache.Cache.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSpanAdded:(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)V:GetOnSpanAdded_Lcom_google_android_exoplayer2_upstream_cache_Cache_Lcom_google_android_exoplayer2_upstream_cache_CacheSpan_Handler:Com.Google.Android.Exoplayer2.Upstream.Cache.ICacheListenerInvoker, ExoPlayer.Core\n" +
			"n_onSpanRemoved:(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)V:GetOnSpanRemoved_Lcom_google_android_exoplayer2_upstream_cache_Cache_Lcom_google_android_exoplayer2_upstream_cache_CacheSpan_Handler:Com.Google.Android.Exoplayer2.Upstream.Cache.ICacheListenerInvoker, ExoPlayer.Core\n" +
			"n_onSpanTouched:(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)V:GetOnSpanTouched_Lcom_google_android_exoplayer2_upstream_cache_Cache_Lcom_google_android_exoplayer2_upstream_cache_CacheSpan_Lcom_google_android_exoplayer2_upstream_cache_CacheSpan_Handler:Com.Google.Android.Exoplayer2.Upstream.Cache.ICacheListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Upstream.Cache.ICacheListenerImplementor, ExoPlayer.Core", Cache_ListenerImplementor.class, __md_methods);
	}


	public Cache_ListenerImplementor ()
	{
		super ();
		if (getClass () == Cache_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Upstream.Cache.ICacheListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onSpanAdded (com.google.android.exoplayer2.upstream.cache.Cache p0, com.google.android.exoplayer2.upstream.cache.CacheSpan p1)
	{
		n_onSpanAdded (p0, p1);
	}

	private native void n_onSpanAdded (com.google.android.exoplayer2.upstream.cache.Cache p0, com.google.android.exoplayer2.upstream.cache.CacheSpan p1);


	public void onSpanRemoved (com.google.android.exoplayer2.upstream.cache.Cache p0, com.google.android.exoplayer2.upstream.cache.CacheSpan p1)
	{
		n_onSpanRemoved (p0, p1);
	}

	private native void n_onSpanRemoved (com.google.android.exoplayer2.upstream.cache.Cache p0, com.google.android.exoplayer2.upstream.cache.CacheSpan p1);


	public void onSpanTouched (com.google.android.exoplayer2.upstream.cache.Cache p0, com.google.android.exoplayer2.upstream.cache.CacheSpan p1, com.google.android.exoplayer2.upstream.cache.CacheSpan p2)
	{
		n_onSpanTouched (p0, p1, p2);
	}

	private native void n_onSpanTouched (com.google.android.exoplayer2.upstream.cache.Cache p0, com.google.android.exoplayer2.upstream.cache.CacheSpan p1, com.google.android.exoplayer2.upstream.cache.CacheSpan p2);

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
