package mono.com.google.android.exoplayer2.upstream.cache;


public class CacheUtil_ProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.upstream.cache.CacheUtil.ProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgress:(JJJ)V:GetOnProgress_JJJHandler:Com.Google.Android.Exoplayer2.Upstream.Cache.CacheUtil/IProgressListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Upstream.Cache.CacheUtil+IProgressListenerImplementor, ExoPlayer.Core", CacheUtil_ProgressListenerImplementor.class, __md_methods);
	}


	public CacheUtil_ProgressListenerImplementor ()
	{
		super ();
		if (getClass () == CacheUtil_ProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Upstream.Cache.CacheUtil+IProgressListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onProgress (long p0, long p1, long p2)
	{
		n_onProgress (p0, p1, p2);
	}

	private native void n_onProgress (long p0, long p1, long p2);

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
