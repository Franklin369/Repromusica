package mono.com.google.android.exoplayer2.upstream;


public class TransferListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.upstream.TransferListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBytesTransferred:(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;ZI)V:GetOnBytesTransferred_Lcom_google_android_exoplayer2_upstream_DataSource_Lcom_google_android_exoplayer2_upstream_DataSpec_ZIHandler:Com.Google.Android.Exoplayer2.Upstream.ITransferListenerInvoker, ExoPlayer.Core\n" +
			"n_onTransferEnd:(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;Z)V:GetOnTransferEnd_Lcom_google_android_exoplayer2_upstream_DataSource_Lcom_google_android_exoplayer2_upstream_DataSpec_ZHandler:Com.Google.Android.Exoplayer2.Upstream.ITransferListenerInvoker, ExoPlayer.Core\n" +
			"n_onTransferInitializing:(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;Z)V:GetOnTransferInitializing_Lcom_google_android_exoplayer2_upstream_DataSource_Lcom_google_android_exoplayer2_upstream_DataSpec_ZHandler:Com.Google.Android.Exoplayer2.Upstream.ITransferListenerInvoker, ExoPlayer.Core\n" +
			"n_onTransferStart:(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;Z)V:GetOnTransferStart_Lcom_google_android_exoplayer2_upstream_DataSource_Lcom_google_android_exoplayer2_upstream_DataSpec_ZHandler:Com.Google.Android.Exoplayer2.Upstream.ITransferListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Upstream.ITransferListenerImplementor, ExoPlayer.Core", TransferListenerImplementor.class, __md_methods);
	}


	public TransferListenerImplementor ()
	{
		super ();
		if (getClass () == TransferListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Upstream.ITransferListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onBytesTransferred (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2, int p3)
	{
		n_onBytesTransferred (p0, p1, p2, p3);
	}

	private native void n_onBytesTransferred (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2, int p3);


	public void onTransferEnd (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2)
	{
		n_onTransferEnd (p0, p1, p2);
	}

	private native void n_onTransferEnd (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2);


	public void onTransferInitializing (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2)
	{
		n_onTransferInitializing (p0, p1, p2);
	}

	private native void n_onTransferInitializing (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2);


	public void onTransferStart (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2)
	{
		n_onTransferStart (p0, p1, p2);
	}

	private native void n_onTransferStart (com.google.android.exoplayer2.upstream.DataSource p0, com.google.android.exoplayer2.upstream.DataSpec p1, boolean p2);

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
