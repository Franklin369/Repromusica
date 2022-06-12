package mono.com.google.android.exoplayer2.scheduler;


public class RequirementsWatcher_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRequirementsStateChanged:(Lcom/google/android/exoplayer2/scheduler/RequirementsWatcher;I)V:GetOnRequirementsStateChanged_Lcom_google_android_exoplayer2_scheduler_RequirementsWatcher_IHandler:Com.Google.Android.Exoplayer2.Scheduler.RequirementsWatcher/IListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Scheduler.RequirementsWatcher+IListenerImplementor, ExoPlayer.Core", RequirementsWatcher_ListenerImplementor.class, __md_methods);
	}


	public RequirementsWatcher_ListenerImplementor ()
	{
		super ();
		if (getClass () == RequirementsWatcher_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Scheduler.RequirementsWatcher+IListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onRequirementsStateChanged (com.google.android.exoplayer2.scheduler.RequirementsWatcher p0, int p1)
	{
		n_onRequirementsStateChanged (p0, p1);
	}

	private native void n_onRequirementsStateChanged (com.google.android.exoplayer2.scheduler.RequirementsWatcher p0, int p1);

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
