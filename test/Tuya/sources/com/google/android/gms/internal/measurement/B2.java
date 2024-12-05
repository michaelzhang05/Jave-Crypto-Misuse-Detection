package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
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
public final class B2 implements F2 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f15257h = new ArrayMap();

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f15258i = {LeanbackPreferenceDialogFragment.ARG_KEY, "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f15259a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f15260b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f15261c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f15262d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f15263e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f15264f;

    /* renamed from: g, reason: collision with root package name */
    private final List f15265g;

    private B2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        A2 a22 = new A2(this, null);
        this.f15262d = a22;
        this.f15263e = new Object();
        this.f15265g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f15259a = contentResolver;
        this.f15260b = uri;
        this.f15261c = runnable;
        contentResolver.registerContentObserver(uri, false, a22);
    }

    public static B2 b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        B2 b22;
        synchronized (B2.class) {
            Map map = f15257h;
            b22 = (B2) map.get(uri);
            if (b22 == null) {
                try {
                    B2 b23 = new B2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, b23);
                    } catch (SecurityException unused) {
                    }
                    b22 = b23;
                } catch (SecurityException unused2) {
                }
            }
        }
        return b22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        synchronized (B2.class) {
            try {
                for (B2 b22 : f15257h.values()) {
                    b22.f15259a.unregisterContentObserver(b22.f15262d);
                }
                f15257h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.F2
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map c() {
        Map map;
        Map map2;
        Map map3 = this.f15264f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f15263e) {
                Map map5 = this.f15264f;
                if (map5 != null) {
                    map2 = map5;
                } else {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) D2.a(new E2() { // from class: com.google.android.gms.internal.measurement.z2
                                @Override // com.google.android.gms.internal.measurement.E2
                                public final Object a() {
                                    return B2.this.d();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.f15264f = map;
                        allowThreadDiskReads = map;
                        map2 = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map2;
        }
        if (map4 != null) {
            return map4;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map d() {
        Map hashMap;
        Cursor query = this.f15259a.query(this.f15260b, f15258i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void f() {
        synchronized (this.f15263e) {
            this.f15264f = null;
            this.f15261c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f15265g.iterator();
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
