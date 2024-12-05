package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.work.WorkRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l0.C3162a;

/* loaded from: classes3.dex */
public final class X0 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile X0 f15601j;

    /* renamed from: a, reason: collision with root package name */
    private final String f15602a;

    /* renamed from: b, reason: collision with root package name */
    protected final W.d f15603b;

    /* renamed from: c, reason: collision with root package name */
    protected final ExecutorService f15604c;

    /* renamed from: d, reason: collision with root package name */
    private final C3162a f15605d;

    /* renamed from: e, reason: collision with root package name */
    private final List f15606e;

    /* renamed from: f, reason: collision with root package name */
    private int f15607f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15608g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15609h;

    /* renamed from: i, reason: collision with root package name */
    private volatile InterfaceC2005h0 f15610i;

    protected X0(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z8;
        if (str != null && l(str2, str3)) {
            this.f15602a = str;
        } else {
            this.f15602a = "FA";
        }
        this.f15603b = W.g.b();
        AbstractC1951b0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new H0(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15604c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f15605d = new C3162a(this);
        this.f15606e = new ArrayList();
        try {
            if (m0.w.b(context, "google_app_id", m0.k.a(context)) != null && !h()) {
                this.f15609h = null;
                this.f15608g = true;
                Log.w(this.f15602a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!l(str2, str3)) {
            this.f15609h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f15602a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                if (str2 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 ^ (str3 == null)) {
                    Log.w(this.f15602a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f15609h = str2;
        }
        k(new C2124w0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f15602a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new W0(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Exception exc, boolean z8, boolean z9) {
        this.f15608g |= z8;
        if (z8) {
            Log.w(this.f15602a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z9) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f15602a, "Error with data collection. Data lost.", exc);
    }

    private final void j(String str, String str2, Bundle bundle, boolean z8, boolean z9, Long l8) {
        k(new K0(this, l8, str, str2, bundle, z8, z9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(M0 m02) {
        this.f15604c.execute(m02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(String str, String str2) {
        if (str2 != null && str != null && !h()) {
            return true;
        }
        return false;
    }

    public static X0 r(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC1319p.l(context);
        if (f15601j == null) {
            synchronized (X0.class) {
                try {
                    if (f15601j == null) {
                        f15601j = new X0(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f15601j;
    }

    public final void C(String str) {
        k(new C2132x0(this, str));
    }

    public final void D(String str, String str2, Bundle bundle) {
        k(new C2100t0(this, str, str2, bundle));
    }

    public final void E(String str) {
        k(new C2140y0(this, str));
    }

    public final void F(String str, Bundle bundle) {
        j(null, str, bundle, false, true, null);
    }

    public final void G(String str, String str2, Bundle bundle) {
        j(str, str2, bundle, true, true, null);
    }

    public final void a(int i8, String str, Object obj, Object obj2, Object obj3) {
        k(new G0(this, false, 5, str, obj, null, null));
    }

    public final void b(m0.u uVar) {
        AbstractC1319p.l(uVar);
        synchronized (this.f15606e) {
            for (int i8 = 0; i8 < this.f15606e.size(); i8++) {
                try {
                    if (uVar.equals(((Pair) this.f15606e.get(i8)).first)) {
                        Log.w(this.f15602a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            N0 n02 = new N0(uVar);
            this.f15606e.add(new Pair(uVar, n02));
            if (this.f15610i != null) {
                try {
                    this.f15610i.registerOnMeasurementEventListener(n02);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f15602a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            k(new J0(this, n02));
        }
    }

    public final void c(Bundle bundle) {
        k(new C2092s0(this, bundle));
    }

    public final void d(Activity activity, String str, String str2) {
        k(new C2116v0(this, activity, str, str2));
    }

    public final void e(String str, String str2, Object obj, boolean z8) {
        k(new L0(this, str, str2, obj, z8));
    }

    protected final boolean h() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, X0.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int m(String str) {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new I0(this, str, binderC1969d0));
        Integer num = (Integer) BinderC1969d0.n0(binderC1969d0.j(WorkRequest.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long n() {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new C0(this, binderC1969d0));
        Long l8 = binderC1969d0.l(500L);
        if (l8 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f15603b.currentTimeMillis()).nextLong();
            int i8 = this.f15607f + 1;
            this.f15607f = i8;
            return nextLong + i8;
        }
        return l8.longValue();
    }

    public final C3162a o() {
        return this.f15605d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC2005h0 q(Context context, boolean z8) {
        try {
            return AbstractBinderC1996g0.asInterface(DynamiteModule.e(context, DynamiteModule.f15212e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e8) {
            i(e8, true, false);
            return null;
        }
    }

    public final String t() {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new B0(this, binderC1969d0));
        return binderC1969d0.m0(50L);
    }

    public final String u() {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new E0(this, binderC1969d0));
        return binderC1969d0.m0(500L);
    }

    public final String v() {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new D0(this, binderC1969d0));
        return binderC1969d0.m0(500L);
    }

    public final String w() {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new A0(this, binderC1969d0));
        return binderC1969d0.m0(500L);
    }

    public final List x(String str, String str2) {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new C2108u0(this, str, str2, binderC1969d0));
        List list = (List) BinderC1969d0.n0(binderC1969d0.j(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final Map y(String str, String str2, boolean z8) {
        BinderC1969d0 binderC1969d0 = new BinderC1969d0();
        k(new F0(this, str, str2, z8, binderC1969d0));
        Bundle j8 = binderC1969d0.j(5000L);
        if (j8 != null && j8.size() != 0) {
            HashMap hashMap = new HashMap(j8.size());
            for (String str3 : j8.keySet()) {
                Object obj = j8.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
