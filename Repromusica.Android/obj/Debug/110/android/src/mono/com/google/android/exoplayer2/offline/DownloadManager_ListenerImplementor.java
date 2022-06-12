package mono.com.google.android.exoplayer2.offline;


public class DownloadManager_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.offline.DownloadManager.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDownloadChanged:(Lcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/Download;)V:GetOnDownloadChanged_Lcom_google_android_exoplayer2_offline_DownloadManager_Lcom_google_android_exoplayer2_offline_Download_Handler:Com.Google.Android.Exoplayer2.Offline.DownloadManager/IListener, ExoPlayer.Core\n" +
			"n_onDownloadRemoved:(Lcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/Download;)V:GetOnDownloadRemoved_Lcom_google_android_exoplayer2_offline_DownloadManager_Lcom_google_android_exoplayer2_offline_Download_Handler:Com.Google.Android.Exoplayer2.Offline.DownloadManager/IListener, ExoPlayer.Core\n" +
			"n_onDownloadsPausedChanged:(Lcom/google/android/exoplayer2/offline/DownloadManager;Z)V:GetOnDownloadsPausedChanged_Lcom_google_android_exoplayer2_offline_DownloadManager_ZHandler:Com.Google.Android.Exoplayer2.Offline.DownloadManager/IListener, ExoPlayer.Core\n" +
			"n_onIdle:(Lcom/google/android/exoplayer2/offline/DownloadManager;)V:GetOnIdle_Lcom_google_android_exoplayer2_offline_DownloadManager_Handler:Com.Google.Android.Exoplayer2.Offline.DownloadManager/IListener, ExoPlayer.Core\n" +
			"n_onInitialized:(Lcom/google/android/exoplayer2/offline/DownloadManager;)V:GetOnInitialized_Lcom_google_android_exoplayer2_offline_DownloadManager_Handler:Com.Google.Android.Exoplayer2.Offline.DownloadManager/IListener, ExoPlayer.Core\n" +
			"n_onRequirementsStateChanged:(Lcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/scheduler/Requirements;I)V:GetOnRequirementsStateChanged_Lcom_google_android_exoplayer2_offline_DownloadManager_Lcom_google_android_exoplayer2_scheduler_Requirements_IHandler:Com.Google.Android.Exoplayer2.Offline.DownloadManager/IListener, ExoPlayer.Core\n" +
			"n_onWaitingForRequirementsChanged:(Lcom/google/android/exoplayer2/offline/DownloadManager;Z)V:GetOnWaitingForRequirementsChanged_Lcom_google_android_exoplayer2_offline_DownloadManager_ZHandler:Com.Google.Android.Exoplayer2.Offline.DownloadManager/IListener, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Offline.DownloadManager+IListenerImplementor, ExoPlayer.Core", DownloadManager_ListenerImplementor.class, __md_methods);
	}


	public DownloadManager_ListenerImplementor ()
	{
		super ();
		if (getClass () == DownloadManager_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Offline.DownloadManager+IListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onDownloadChanged (com.google.android.exoplayer2.offline.DownloadManager p0, com.google.android.exoplayer2.offline.Download p1)
	{
		n_onDownloadChanged (p0, p1);
	}

	private native void n_onDownloadChanged (com.google.android.exoplayer2.offline.DownloadManager p0, com.google.android.exoplayer2.offline.Download p1);


	public void onDownloadRemoved (com.google.android.exoplayer2.offline.DownloadManager p0, com.google.android.exoplayer2.offline.Download p1)
	{
		n_onDownloadRemoved (p0, p1);
	}

	private native void n_onDownloadRemoved (com.google.android.exoplayer2.offline.DownloadManager p0, com.google.android.exoplayer2.offline.Download p1);


	public void onDownloadsPausedChanged (com.google.android.exoplayer2.offline.DownloadManager p0, boolean p1)
	{
		n_onDownloadsPausedChanged (p0, p1);
	}

	private native void n_onDownloadsPausedChanged (com.google.android.exoplayer2.offline.DownloadManager p0, boolean p1);


	public void onIdle (com.google.android.exoplayer2.offline.DownloadManager p0)
	{
		n_onIdle (p0);
	}

	private native void n_onIdle (com.google.android.exoplayer2.offline.DownloadManager p0);


	public void onInitialized (com.google.android.exoplayer2.offline.DownloadManager p0)
	{
		n_onInitialized (p0);
	}

	private native void n_onInitialized (com.google.android.exoplayer2.offline.DownloadManager p0);


	public void onRequirementsStateChanged (com.google.android.exoplayer2.offline.DownloadManager p0, com.google.android.exoplayer2.scheduler.Requirements p1, int p2)
	{
		n_onRequirementsStateChanged (p0, p1, p2);
	}

	private native void n_onRequirementsStateChanged (com.google.android.exoplayer2.offline.DownloadManager p0, com.google.android.exoplayer2.scheduler.Requirements p1, int p2);


	public void onWaitingForRequirementsChanged (com.google.android.exoplayer2.offline.DownloadManager p0, boolean p1)
	{
		n_onWaitingForRequirementsChanged (p0, p1);
	}

	private native void n_onWaitingForRequirementsChanged (com.google.android.exoplayer2.offline.DownloadManager p0, boolean p1);

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
