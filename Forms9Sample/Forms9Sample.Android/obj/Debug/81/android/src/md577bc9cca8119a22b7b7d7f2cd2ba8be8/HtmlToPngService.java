package md577bc9cca8119a22b7b7d7f2cd2ba8be8;


public class HtmlToPngService
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Forms9Patch.Droid.HtmlToPngService, Forms9Patch.Droid", HtmlToPngService.class, __md_methods);
	}


	public HtmlToPngService ()
	{
		super ();
		if (getClass () == HtmlToPngService.class)
			mono.android.TypeManager.Activate ("Forms9Patch.Droid.HtmlToPngService, Forms9Patch.Droid", "", this, new java.lang.Object[] {  });
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
