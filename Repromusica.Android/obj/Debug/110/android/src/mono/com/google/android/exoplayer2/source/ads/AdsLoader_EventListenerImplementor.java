package mono.com.google.android.exoplayer2.source.ads;


public class AdsLoader_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:()V:GetOnAdClickedHandler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListener, ExoPlayer.Core\n" +
			"n_onAdLoadError:(Lcom/google/android/exoplayer2/source/ads/AdsMediaSource$AdLoadException;Lcom/google/android/exoplayer2/upstream/DataSpec;)V:GetOnAdLoadError_Lcom_google_android_exoplayer2_source_ads_AdsMediaSource_AdLoadException_Lcom_google_android_exoplayer2_upstream_DataSpec_Handler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListener, ExoPlayer.Core\n" +
			"n_onAdPlaybackState:(Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;)V:GetOnAdPlaybackState_Lcom_google_android_exoplayer2_source_ads_AdPlaybackState_Handler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListener, ExoPlayer.Core\n" +
			"n_onAdTapped:()V:GetOnAdTappedHandler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListener, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerImplementor, ExoPlayer.Core", AdsLoader_EventListenerImplementor.class, __md_methods);
	}


	public AdsLoader_EventListenerImplementor ()
	{
		super ();
		if (getClass () == AdsLoader_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onAdClicked ()
	{
		n_onAdClicked ();
	}

	private native void n_onAdClicked ();


	public void onAdLoadError (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException p0, com.google.android.exoplayer2.upstream.DataSpec p1)
	{
		n_onAdLoadError (p0, p1);
	}

	private native void n_onAdLoadError (com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException p0, com.google.android.exoplayer2.upstream.DataSpec p1);


	public void onAdPlaybackState (com.google.android.exoplayer2.source.ads.AdPlaybackState p0)
	{
		n_onAdPlaybackState (p0);
	}

	private native void n_onAdPlaybackState (com.google.android.exoplayer2.source.ads.AdPlaybackState p0);


	public void onAdTapped ()
	{
		n_onAdTapped ();
	}

	private native void n_onAdTapped ();

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
