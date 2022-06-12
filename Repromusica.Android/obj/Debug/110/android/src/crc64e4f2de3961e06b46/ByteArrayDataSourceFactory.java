package crc64e4f2de3961e06b46;


public class ByteArrayDataSourceFactory
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.upstream.DataSource.Factory
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createDataSource:()Lcom/google/android/exoplayer2/upstream/DataSource;:GetCreateDataSourceHandler:Com.Google.Android.Exoplayer2.Upstream.IDataSourceFactoryInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Player.ByteArrayDataSourceFactory, MediaManager", ByteArrayDataSourceFactory.class, __md_methods);
	}


	public ByteArrayDataSourceFactory ()
	{
		super ();
		if (getClass () == ByteArrayDataSourceFactory.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Player.ByteArrayDataSourceFactory, MediaManager", "", this, new java.lang.Object[] {  });
	}

	public ByteArrayDataSourceFactory (byte[] p0)
	{
		super ();
		if (getClass () == ByteArrayDataSourceFactory.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Player.ByteArrayDataSourceFactory, MediaManager", "System.Byte[], mscorlib", this, new java.lang.Object[] { p0 });
	}


	public com.google.android.exoplayer2.upstream.DataSource createDataSource ()
	{
		return n_createDataSource ();
	}

	private native com.google.android.exoplayer2.upstream.DataSource n_createDataSource ();

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
