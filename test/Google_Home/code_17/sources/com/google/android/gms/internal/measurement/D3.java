package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class D3 implements F3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f16105h = new ArrayMap();

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f16106i = {LeanbackPreferenceDialogFragment.ARG_KEY, "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f16107a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f16108b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f16109c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f16110d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f16111e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f16112f;

    /* renamed from: g, reason: collision with root package name */
    private final List f16113g;

    private D3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        E3 e32 = new E3(this, null);
        this.f16110d = e32;
        this.f16111e = new Object();
        this.f16113g = new ArrayList();
        w0.h.i(contentResolver);
        w0.h.i(uri);
        this.f16107a = contentResolver;
        this.f16108b = uri;
        this.f16109c = runnable;
        contentResolver.registerContentObserver(uri, false, e32);
    }

    public static D3 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        D3 d32;
        synchronized (D3.class) {
            Map map = f16105h;
            d32 = (D3) map.get(uri);
            if (d32 == null) {
                try {
                    D3 d33 = new D3(contentResolver, uri, runnable);
                    try {
                        map.put(uri, d33);
                    } catch (SecurityException unused) {
                    }
                    d32 = d33;
                } catch (SecurityException unused2) {
                }
            }
        }
        return d32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        synchronized (D3.class) {
            try {
                for (D3 d32 : f16105h.values()) {
                    d32.f16107a.unregisterContentObserver(d32.f16110d);
                }
                f16105h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Map g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) I3.a(new H3() { // from class: com.google.android.gms.internal.measurement.C3
                    @Override // com.google.android.gms.internal.measurement.H3
                    public final Object w() {
                        return D3.this.d();
                    }
                });
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (SQLiteException | IllegalStateException | SecurityException e8) {
            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e8);
            return Collections.emptyMap();
        }
    }

    public final Map b() {
        Map map = this.f16112f;
        if (map == null) {
            synchronized (this.f16111e) {
                try {
                    map = this.f16112f;
                    if (map == null) {
                        map = g();
                        this.f16112f = map;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.measurement.F3
    public final /* synthetic */ Object c(String str) {
        return (String) b().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map d() {
        Map hashMap;
        ContentProviderClient acquireUnstableContentProviderClient = this.f16107a.acquireUnstableContentProviderClient(this.f16108b);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            Cursor query = acquireUnstableContentProviderClient.query(this.f16108b, f16106i, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    Map emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map emptyMap2 = Collections.emptyMap();
                    query.close();
                    return emptyMap2;
                }
                if (count <= 256) {
                    hashMap = new ArrayMap(count);
                } else {
                    hashMap = new HashMap(count, 1.0f);
                }
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                if (!query.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map emptyMap3 = Collections.emptyMap();
                    query.close();
                    return emptyMap3;
                }
                query.close();
                return hashMap;
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
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e8);
            return Collections.emptyMap();
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public final void f() {
        synchronized (this.f16111e) {
            this.f16112f = null;
            this.f16109c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f16113g.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
