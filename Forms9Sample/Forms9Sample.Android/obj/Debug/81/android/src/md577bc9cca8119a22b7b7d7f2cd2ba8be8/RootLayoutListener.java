package md577bc9cca8119a22b7b7d7f2cd2ba8be8;


public class RootLayoutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Forms9Patch.Droid.RootLayoutListener, Forms9Patch.Droid", RootLayoutListener.class, __md_methods);
	}


	public RootLayoutListener ()
	{
		super ();
		if (getClass () == RootLayoutListener.class)
			mono.android.TypeManager.Activate ("Forms9Patch.Droid.RootLayoutListener, Forms9Patch.Droid", "", this, new java.lang.Object[] {  });
	}

	public RootLayoutListener (android.view.View p0)
	{
		super ();
		if (getClass () == RootLayoutListener.class)
			mono.android.TypeManager.Activate ("Forms9Patch.Droid.RootLayoutListener, Forms9Patch.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

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
