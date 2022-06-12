package mono.com.google.android.exoplayer2.offline;


public class Downloader_ProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.offline.Downloader.ProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgress:(JJF)V:GetOnProgress_JJFHandler:Com.Google.Android.Exoplayer2.Offline.IDownloaderProgressListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Offline.IDownloaderProgressListenerImplementor, ExoPlayer.Core", Downloader_ProgressListenerImplementor.class, __md_methods);
	}


	public Downloader_ProgressListenerImplementor ()
	{
		super ();
		if (getClass () == Downloader_ProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Offline.IDownloaderProgressListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onProgress (long p0, long p1, float p2)
	{
		n_onProgress (p0, p1, p2);
	}

	private native void n_onProgress (long p0, long p1, float p2);

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
