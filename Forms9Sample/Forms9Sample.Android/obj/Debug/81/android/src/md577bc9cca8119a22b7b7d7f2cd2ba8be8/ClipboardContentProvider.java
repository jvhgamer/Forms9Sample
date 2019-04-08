package md577bc9cca8119a22b7b7d7f2cd2ba8be8;


public class ClipboardContentProvider
	extends android.content.ContentProvider
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_delete:(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I:GetDelete_Landroid_net_Uri_Ljava_lang_String_arrayLjava_lang_String_Handler\n" +
			"n_getType:(Landroid/net/Uri;)Ljava/lang/String;:GetGetType_Landroid_net_Uri_Handler\n" +
			"n_insert:(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;:GetInsert_Landroid_net_Uri_Landroid_content_ContentValues_Handler\n" +
			"n_onCreate:()Z:GetOnCreateHandler\n" +
			"n_query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;:GetQuery_Landroid_net_Uri_arrayLjava_lang_String_Ljava_lang_String_arrayLjava_lang_String_Ljava_lang_String_Handler\n" +
			"n_query:(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;:GetQuery_Landroid_net_Uri_arrayLjava_lang_String_Landroid_os_Bundle_Landroid_os_CancellationSignal_Handler\n" +
			"n_query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;:GetQuery_Landroid_net_Uri_arrayLjava_lang_String_Ljava_lang_String_arrayLjava_lang_String_Ljava_lang_String_Landroid_os_CancellationSignal_Handler\n" +
			"n_update:(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I:GetUpdate_Landroid_net_Uri_Landroid_content_ContentValues_Ljava_lang_String_arrayLjava_lang_String_Handler\n" +
			"n_canonicalize:(Landroid/net/Uri;)Landroid/net/Uri;:GetCanonicalize_Landroid_net_Uri_Handler\n" +
			"n_getStreamTypes:(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;:GetGetStreamTypes_Landroid_net_Uri_Ljava_lang_String_Handler\n" +
			"n_isTemporary:()Z:GetIsTemporaryHandler\n" +
			"n_applyBatch:(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;:GetApplyBatch_Ljava_util_ArrayList_Handler\n" +
			"n_attachInfo:(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V:GetAttachInfo_Landroid_content_Context_Landroid_content_pm_ProviderInfo_Handler\n" +
			"n_bulkInsert:(Landroid/net/Uri;[Landroid/content/ContentValues;)I:GetBulkInsert_Landroid_net_Uri_arrayLandroid_content_ContentValues_Handler\n" +
			"n_call:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;:GetCall_Ljava_lang_String_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_dump:(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V:GetDump_Ljava_io_FileDescriptor_Ljava_io_PrintWriter_arrayLjava_lang_String_Handler\n" +
			"n_openPipeHelper:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;Landroid/content/ContentProvider$PipeDataWriter;)Landroid/os/ParcelFileDescriptor;:GetOpenPipeHelper_Landroid_net_Uri_Ljava_lang_String_Landroid_os_Bundle_Ljava_lang_Object_Landroid_content_ContentProvider_PipeDataWriter_Handler\n" +
			"n_shutdown:()V:GetShutdownHandler\n" +
			"n_openTypedAssetFile:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;:GetOpenTypedAssetFile_Landroid_net_Uri_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_openTypedAssetFile:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/content/res/AssetFileDescriptor;:GetOpenTypedAssetFile_Landroid_net_Uri_Ljava_lang_String_Landroid_os_Bundle_Landroid_os_CancellationSignal_Handler\n" +
			"n_openAssetFile:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;:GetOpenAssetFile_Landroid_net_Uri_Ljava_lang_String_Handler\n" +
			"n_openAssetFile:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/content/res/AssetFileDescriptor;:GetOpenAssetFile_Landroid_net_Uri_Ljava_lang_String_Landroid_os_CancellationSignal_Handler\n" +
			"n_openFile:(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;:GetOpenFile_Landroid_net_Uri_Ljava_lang_String_Handler\n" +
			"n_openFile:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;:GetOpenFile_Landroid_net_Uri_Ljava_lang_String_Landroid_os_CancellationSignal_Handler\n" +
			"n_uncanonicalize:(Landroid/net/Uri;)Landroid/net/Uri;:GetUncanonicalize_Landroid_net_Uri_Handler\n" +
			"n_refresh:(Landroid/net/Uri;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Z:GetRefresh_Landroid_net_Uri_Landroid_os_Bundle_Landroid_os_CancellationSignal_Handler\n" +
			"n_onConfigurationChanged:(Landroid/content/res/Configuration;)V:GetOnConfigurationChanged_Landroid_content_res_Configuration_Handler\n" +
			"";
		mono.android.Runtime.register ("Forms9Patch.Droid.ClipboardContentProvider, Forms9Patch.Droid", ClipboardContentProvider.class, __md_methods);
	}


	public ClipboardContentProvider ()
	{
		super ();
		if (getClass () == ClipboardContentProvider.class)
			mono.android.TypeManager.Activate ("Forms9Patch.Droid.ClipboardContentProvider, Forms9Patch.Droid", "", this, new java.lang.Object[] {  });
	}


	public int delete (android.net.Uri p0, java.lang.String p1, java.lang.String[] p2)
	{
		return n_delete (p0, p1, p2);
	}

	private native int n_delete (android.net.Uri p0, java.lang.String p1, java.lang.String[] p2);


	public java.lang.String getType (android.net.Uri p0)
	{
		return n_getType (p0);
	}

	private native java.lang.String n_getType (android.net.Uri p0);


	public android.net.Uri insert (android.net.Uri p0, android.content.ContentValues p1)
	{
		return n_insert (p0, p1);
	}

	private native android.net.Uri n_insert (android.net.Uri p0, android.content.ContentValues p1);


	public boolean onCreate ()
	{
		return n_onCreate ();
	}

	private native boolean n_onCreate ();


	public android.database.Cursor query (android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4)
	{
		return n_query (p0, p1, p2, p3, p4);
	}

	private native android.database.Cursor n_query (android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4);


	public android.database.Cursor query (android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3)
	{
		return n_query (p0, p1, p2, p3);
	}

	private native android.database.Cursor n_query (android.net.Uri p0, java.lang.String[] p1, android.os.Bundle p2, android.os.CancellationSignal p3);


	public android.database.Cursor query (android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5)
	{
		return n_query (p0, p1, p2, p3, p4, p5);
	}

	private native android.database.Cursor n_query (android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4, android.os.CancellationSignal p5);


	public int update (android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3)
	{
		return n_update (p0, p1, p2, p3);
	}

	private native int n_update (android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3);


	public android.net.Uri canonicalize (android.net.Uri p0)
	{
		return n_canonicalize (p0);
	}

	private native android.net.Uri n_canonicalize (android.net.Uri p0);


	public java.lang.String[] getStreamTypes (android.net.Uri p0, java.lang.String p1)
	{
		return n_getStreamTypes (p0, p1);
	}

	private native java.lang.String[] n_getStreamTypes (android.net.Uri p0, java.lang.String p1);


	public boolean isTemporary ()
	{
		return n_isTemporary ();
	}

	private native boolean n_isTemporary ();


	public android.content.ContentProviderResult[] applyBatch (java.util.ArrayList p0)
	{
		return n_applyBatch (p0);
	}

	private native android.content.ContentProviderResult[] n_applyBatch (java.util.ArrayList p0);


	public void attachInfo (android.content.Context p0, android.content.pm.ProviderInfo p1)
	{
		n_attachInfo (p0, p1);
	}

	private native void n_attachInfo (android.content.Context p0, android.content.pm.ProviderInfo p1);


	public int bulkInsert (android.net.Uri p0, android.content.ContentValues[] p1)
	{
		return n_bulkInsert (p0, p1);
	}

	private native int n_bulkInsert (android.net.Uri p0, android.content.ContentValues[] p1);


	public android.os.Bundle call (java.lang.String p0, java.lang.String p1, android.os.Bundle p2)
	{
		return n_call (p0, p1, p2);
	}

	private native android.os.Bundle n_call (java.lang.String p0, java.lang.String p1, android.os.Bundle p2);


	public void dump (java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2)
	{
		n_dump (p0, p1, p2);
	}

	private native void n_dump (java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2);


	public android.os.ParcelFileDescriptor openPipeHelper (android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, java.lang.Object p3, android.content.ContentProvider.PipeDataWriter p4)
	{
		return n_openPipeHelper (p0, p1, p2, p3, p4);
	}

	private native android.os.ParcelFileDescriptor n_openPipeHelper (android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, java.lang.Object p3, android.content.ContentProvider.PipeDataWriter p4);


	public void shutdown ()
	{
		n_shutdown ();
	}

	private native void n_shutdown ();


	public android.content.res.AssetFileDescriptor openTypedAssetFile (android.net.Uri p0, java.lang.String p1, android.os.Bundle p2)
	{
		return n_openTypedAssetFile (p0, p1, p2);
	}

	private native android.content.res.AssetFileDescriptor n_openTypedAssetFile (android.net.Uri p0, java.lang.String p1, android.os.Bundle p2);


	public android.content.res.AssetFileDescriptor openTypedAssetFile (android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3)
	{
		return n_openTypedAssetFile (p0, p1, p2, p3);
	}

	private native android.content.res.AssetFileDescriptor n_openTypedAssetFile (android.net.Uri p0, java.lang.String p1, android.os.Bundle p2, android.os.CancellationSignal p3);


	public android.content.res.AssetFileDescriptor openAssetFile (android.net.Uri p0, java.lang.String p1)
	{
		return n_openAssetFile (p0, p1);
	}

	private native android.content.res.AssetFileDescriptor n_openAssetFile (android.net.Uri p0, java.lang.String p1);


	public android.content.res.AssetFileDescriptor openAssetFile (android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2)
	{
		return n_openAssetFile (p0, p1, p2);
	}

	private native android.content.res.AssetFileDescriptor n_openAssetFile (android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2);


	public android.os.ParcelFileDescriptor openFile (android.net.Uri p0, java.lang.String p1)
	{
		return n_openFile (p0, p1);
	}

	private native android.os.ParcelFileDescriptor n_openFile (android.net.Uri p0, java.lang.String p1);


	public android.os.ParcelFileDescriptor openFile (android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2)
	{
		return n_openFile (p0, p1, p2);
	}

	private native android.os.ParcelFileDescriptor n_openFile (android.net.Uri p0, java.lang.String p1, android.os.CancellationSignal p2);


	public android.net.Uri uncanonicalize (android.net.Uri p0)
	{
		return n_uncanonicalize (p0);
	}

	private native android.net.Uri n_uncanonicalize (android.net.Uri p0);


	public boolean refresh (android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2)
	{
		return n_refresh (p0, p1, p2);
	}

	private native boolean n_refresh (android.net.Uri p0, android.os.Bundle p1, android.os.CancellationSignal p2);


	public void onConfigurationChanged (android.content.res.Configuration p0)
	{
		n_onConfigurationChanged (p0);
	}

	private native void n_onConfigurationChanged (android.content.res.Configuration p0);

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
