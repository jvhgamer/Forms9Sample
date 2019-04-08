package md577bc9cca8119a22b7b7d7f2cd2ba8be8;


public class PrimativeCursor
	extends android.database.AbstractCursor
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_getColumnCount:()I:GetGetColumnCountHandler\n" +
			"n_getColumnNames:()[Ljava/lang/String;:GetGetColumnNamesHandler\n" +
			"n_getDouble:(I)D:GetGetDouble_IHandler\n" +
			"n_getFloat:(I)F:GetGetFloat_IHandler\n" +
			"n_getInt:(I)I:GetGetInt_IHandler\n" +
			"n_getLong:(I)J:GetGetLong_IHandler\n" +
			"n_getShort:(I)S:GetGetShort_IHandler\n" +
			"n_getString:(I)Ljava/lang/String;:GetGetString_IHandler\n" +
			"n_isNull:(I)Z:GetIsNull_IHandler\n" +
			"n_getBlob:(I)[B:GetGetBlob_IHandler\n" +
			"n_getType:(I)I:GetGetType_IHandler\n" +
			"";
		mono.android.Runtime.register ("Forms9Patch.Droid.PrimativeCursor, Forms9Patch.Droid", PrimativeCursor.class, __md_methods);
	}


	public PrimativeCursor ()
	{
		super ();
		if (getClass () == PrimativeCursor.class)
			mono.android.TypeManager.Activate ("Forms9Patch.Droid.PrimativeCursor, Forms9Patch.Droid", "", this, new java.lang.Object[] {  });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public int getColumnCount ()
	{
		return n_getColumnCount ();
	}

	private native int n_getColumnCount ();


	public java.lang.String[] getColumnNames ()
	{
		return n_getColumnNames ();
	}

	private native java.lang.String[] n_getColumnNames ();


	public double getDouble (int p0)
	{
		return n_getDouble (p0);
	}

	private native double n_getDouble (int p0);


	public float getFloat (int p0)
	{
		return n_getFloat (p0);
	}

	private native float n_getFloat (int p0);


	public int getInt (int p0)
	{
		return n_getInt (p0);
	}

	private native int n_getInt (int p0);


	public long getLong (int p0)
	{
		return n_getLong (p0);
	}

	private native long n_getLong (int p0);


	public short getShort (int p0)
	{
		return n_getShort (p0);
	}

	private native short n_getShort (int p0);


	public java.lang.String getString (int p0)
	{
		return n_getString (p0);
	}

	private native java.lang.String n_getString (int p0);


	public boolean isNull (int p0)
	{
		return n_isNull (p0);
	}

	private native boolean n_isNull (int p0);


	public byte[] getBlob (int p0)
	{
		return n_getBlob (p0);
	}

	private native byte[] n_getBlob (int p0);


	public int getType (int p0)
	{
		return n_getType (p0);
	}

	private native int n_getType (int p0);

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
