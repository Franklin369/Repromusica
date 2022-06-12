package crc6479820c45fd9c6153;


public class NavigationTransitionListener
	extends androidx.transition.TransitionListenerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTransitionStart:(Landroidx/transition/Transition;)V:GetOnTransitionStart_Landroidx_transition_Transition_Handler\n" +
			"n_onTransitionEnd:(Landroidx/transition/Transition;)V:GetOnTransitionEnd_Landroidx_transition_Transition_Handler\n" +
			"n_onTransitionCancel:(Landroidx/transition/Transition;)V:GetOnTransitionCancel_Landroidx_transition_Transition_Handler\n" +
			"";
		mono.android.Runtime.register ("Plugin.SharedTransitions.Platforms.Android.NavigationTransitionListener, Plugin.SharedTransitions", NavigationTransitionListener.class, __md_methods);
	}


	public NavigationTransitionListener ()
	{
		super ();
		if (getClass () == NavigationTransitionListener.class)
			mono.android.TypeManager.Activate ("Plugin.SharedTransitions.Platforms.Android.NavigationTransitionListener, Plugin.SharedTransitions", "", this, new java.lang.Object[] {  });
	}


	public void onTransitionStart (androidx.transition.Transition p0)
	{
		n_onTransitionStart (p0);
	}

	private native void n_onTransitionStart (androidx.transition.Transition p0);


	public void onTransitionEnd (androidx.transition.Transition p0)
	{
		n_onTransitionEnd (p0);
	}

	private native void n_onTransitionEnd (androidx.transition.Transition p0);


	public void onTransitionCancel (androidx.transition.Transition p0)
	{
		n_onTransitionCancel (p0);
	}

	private native void n_onTransitionCancel (androidx.transition.Transition p0);

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
