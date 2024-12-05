package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2080b4 implements F3 {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f16569g = new ArrayMap();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f16570a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f16571b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f16572c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f16573d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map f16574e;

    /* renamed from: f, reason: collision with root package name */
    private final List f16575f;

    private C2080b4(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.e4
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                C2080b4.this.e(sharedPreferences2, str);
            }
        };
        this.f16572c = onSharedPreferenceChangeListener;
        this.f16573d = new Object();
        this.f16575f = new ArrayList();
        this.f16570a = sharedPreferences;
        this.f16571b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (B3.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences a8 = AbstractC2273w0.a(context, str.substring(12), 0, AbstractC2237s0.f16810a);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a8;
            }
            SharedPreferences a9 = AbstractC2273w0.a(context, str, 0, AbstractC2237s0.f16810a);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a9;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2080b4 b(Context context, String str, Runnable runnable) {
        boolean z8;
        C2080b4 c2080b4;
        if (B3.a() && !str.startsWith("direct_boot:")) {
            z8 = B3.c(context);
        } else {
            z8 = true;
        }
        if (!z8) {
            return null;
        }
        synchronized (C2080b4.class) {
            try {
                Map map = f16569g;
                c2080b4 = (C2080b4) map.get(str);
                if (c2080b4 == null) {
                    c2080b4 = new C2080b4(a(context, str), runnable);
                    map.put(str, c2080b4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2080b4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (C2080b4.class) {
            try {
                for (C2080b4 c2080b4 : f16569g.values()) {
                    c2080b4.f16570a.unregisterOnSharedPreferenceChangeListener(c2080b4.f16572c);
                }
                f16569g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.F3
    public final Object c(String str) {
        Map<String, ?> map = this.f16574e;
        if (map == null) {
            synchronized (this.f16573d) {
                try {
                    map = this.f16574e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f16570a.getAll();
                            this.f16574e = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f16573d) {
            this.f16574e = null;
            this.f16571b.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f16575f.iterator();
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
