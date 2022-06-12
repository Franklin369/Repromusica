package crc6479820c45fd9c6153;


public class SharedTransitionShellItemRenderer
	extends crc643f46942d9dd1fff9.ShellItemRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Plugin.SharedTransitions.Platforms.Android.SharedTransitionShellItemRenderer, Plugin.SharedTransitions", SharedTransitionShellItemRenderer.class, __md_methods);
	}


	public SharedTransitionShellItemRenderer ()
	{
		super ();
		if (getClass () == SharedTransitionShellItemRenderer.class)
			mono.android.TypeManager.Activate ("Plugin.SharedTransitions.Platforms.Android.SharedTransitionShellItemRenderer, Plugin.SharedTransitions", "", this, new java.lang.Object[] {  });
	}


	public SharedTransitionShellItemRenderer (int p0)
	{
		super (p0);
		if (getClass () == SharedTransitionShellItemRenderer.class)
			mono.android.TypeManager.Activate ("Plugin.SharedTransitions.Platforms.Android.SharedTransitionShellItemRenderer, Plugin.SharedTransitions", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}

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
