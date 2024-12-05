package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2267v3 implements InterfaceC2285x3 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2285x3
    public final Map a(ContentResolver contentResolver, String[] strArr, InterfaceC2258u3 interfaceC2258u3) {
        Uri uri = AbstractC2214p3.f16764b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                    try {
                        if (query != null) {
                            Map a8 = interfaceC2258u3.a(query.getCount());
                            while (query.moveToNext()) {
                                a8.put(query.getString(0), query.getString(1));
                            }
                            if (query.isAfterLast()) {
                                query.close();
                                return a8;
                            }
                            throw new C2276w3("Cursor read incomplete (ContentProvider dead?)");
                        }
                        throw new C2276w3("ContentProvider query returned null cursor");
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RemoteException e8) {
                    throw new C2276w3("ContentProvider query failed", e8);
                }
            } finally {
                acquireUnstableContentProviderClient.release();
            }
        }
        throw new C2276w3("Unable to acquire ContentProviderClient");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2285x3
    public final String b(ContentResolver contentResolver, String str) {
        Uri uri = AbstractC2214p3.f16763a;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient != null) {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (query != null) {
                            if (query.moveToFirst()) {
                                String string = query.getString(1);
                                query.close();
                                return string;
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            return null;
                        }
                        throw new C2276w3("ContentProvider query returned null cursor");
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RemoteException e8) {
                    throw new C2276w3("ContentProvider query failed", e8);
                }
            }
            throw new C2276w3("Unable to acquire ContentProviderClient");
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }
}
