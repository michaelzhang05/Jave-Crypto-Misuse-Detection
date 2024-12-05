package com.google.android.gms.internal.measurement;

import Q.AbstractC1400p;
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
import k0.C3210a;
import l0.C3278m;
import l0.InterfaceC3285t;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2077b1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C2077b1 f16553j;

    /* renamed from: a, reason: collision with root package name */
    private final String f16554a;

    /* renamed from: b, reason: collision with root package name */
    protected final V.d f16555b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f16556c;

    /* renamed from: d, reason: collision with root package name */
    private final C3210a f16557d;

    /* renamed from: e, reason: collision with root package name */
    private final List f16558e;

    /* renamed from: f, reason: collision with root package name */
    private int f16559f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16560g;

    /* renamed from: h, reason: collision with root package name */
    private String f16561h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Q0 f16562i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.b1$a */
    /* loaded from: classes3.dex */
    public abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final long f16563a;

        /* renamed from: b, reason: collision with root package name */
        final long f16564b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16565c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(C2077b1 c2077b1) {
            this(true);
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2077b1.this.f16560g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e8) {
                C2077b1.this.p(e8, false, this.f16565c);
                b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(boolean z8) {
            this.f16563a = C2077b1.this.f16555b.currentTimeMillis();
            this.f16564b = C2077b1.this.f16555b.elapsedRealtime();
            this.f16565c = z8;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.b1$b */
    /* loaded from: classes3.dex */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2077b1.this.l(new C2301z1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C2077b1.this.l(new E1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C2077b1.this.l(new A1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C2077b1.this.l(new B1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            O0 o02 = new O0();
            C2077b1.this.l(new C1(this, activity, o02));
            Bundle i8 = o02.i(50L);
            if (i8 != null) {
                bundle.putAll(i8);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C2077b1.this.l(new C2292y1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C2077b1.this.l(new D1(this, activity));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.b1$c */
    /* loaded from: classes3.dex */
    public static class c extends V0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3285t f16568a;

        c(InterfaceC3285t interfaceC3285t) {
            this.f16568a = interfaceC3285t;
        }

        @Override // com.google.android.gms.internal.measurement.W0
        public final void c0(String str, String str2, Bundle bundle, long j8) {
            this.f16568a.a(str, str2, bundle, j8);
        }

        @Override // com.google.android.gms.internal.measurement.W0
        public final int w() {
            return System.identityHashCode(this.f16568a);
        }
    }

    private C2077b1(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z8;
        if (str != null && D(str2, str3)) {
            this.f16554a = str;
        } else {
            this.f16554a = "FA";
        }
        this.f16555b = V.g.b();
        this.f16556c = E0.a().a(new ThreadFactoryC2167k1(this), 1);
        this.f16557d = new C3210a(this);
        this.f16558e = new ArrayList();
        if (A(context) && !I()) {
            this.f16561h = null;
            this.f16560g = true;
            Log.w(this.f16554a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!D(str2, str3)) {
            this.f16561h = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f16554a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                if (str2 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 ^ (str3 == null)) {
                    Log.w(this.f16554a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f16561h = str2;
        }
        l(new C2107e1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f16554a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    private static boolean A(Context context) {
        if (new C3278m(context, C3278m.a(context)).b("google_app_id") == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(String str, String str2) {
        if (str2 != null && str != null && !I()) {
            return true;
        }
        return false;
    }

    private final boolean I() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static C2077b1 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static C2077b1 f(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC1400p.l(context);
        if (f16553j == null) {
            synchronized (C2077b1.class) {
                try {
                    if (f16553j == null) {
                        f16553j = new C2077b1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f16553j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a aVar) {
        this.f16556c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Exception exc, boolean z8, boolean z9) {
        this.f16560g |= z8;
        if (z8) {
            Log.w(this.f16554a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z9) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f16554a, "Error with data collection. Data lost.", exc);
    }

    private final void s(String str, String str2, Bundle bundle, boolean z8, boolean z9, Long l8) {
        l(new C2283x1(this, l8, str, str2, bundle, z8, z9));
    }

    public final void B(String str) {
        l(new C2194n1(this, str));
    }

    public final String E() {
        O0 o02 = new O0();
        l(new C2212p1(this, o02));
        return o02.t0(50L);
    }

    public final String F() {
        O0 o02 = new O0();
        l(new C2221q1(this, o02));
        return o02.t0(500L);
    }

    public final String G() {
        O0 o02 = new O0();
        l(new C2229r1(this, o02));
        return o02.t0(500L);
    }

    public final String H() {
        O0 o02 = new O0();
        l(new C2185m1(this, o02));
        return o02.t0(500L);
    }

    public final int a(String str) {
        O0 o02 = new O0();
        l(new C2256u1(this, str, o02));
        Integer num = (Integer) O0.k(o02.i(WorkRequest.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        O0 o02 = new O0();
        l(new C2203o1(this, o02));
        Long s02 = o02.s0(500L);
        if (s02 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f16555b.currentTimeMillis()).nextLong();
            int i8 = this.f16559f + 1;
            this.f16559f = i8;
            return nextLong + i8;
        }
        return s02.longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Q0 c(Context context, boolean z8) {
        try {
            return P0.asInterface(DynamiteModule.e(context, DynamiteModule.f16013e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e8) {
            p(e8, true, false);
            return null;
        }
    }

    public final List g(String str, String str2) {
        O0 o02 = new O0();
        l(new C2147i1(this, str, str2, o02));
        List list = (List) O0.k(o02.i(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public final Map h(String str, String str2, boolean z8) {
        O0 o02 = new O0();
        l(new C2247t1(this, str, str2, z8, o02));
        Bundle i8 = o02.i(5000L);
        if (i8 != null && i8.size() != 0) {
            HashMap hashMap = new HashMap(i8.size());
            for (String str3 : i8.keySet()) {
                Object obj = i8.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void i(int i8, String str, Object obj, Object obj2, Object obj3) {
        l(new C2238s1(this, false, 5, str, obj, null, null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new C2157j1(this, activity, str, str2));
    }

    public final void k(Bundle bundle) {
        l(new C2137h1(this, bundle));
    }

    public final void q(String str, Bundle bundle) {
        s(null, str, bundle, false, true, null);
    }

    public final void r(String str, String str2, Bundle bundle) {
        l(new C2117f1(this, str, str2, bundle));
    }

    public final void t(String str, String str2, Object obj, boolean z8) {
        l(new C2097d1(this, str, str2, obj, z8));
    }

    public final void u(InterfaceC3285t interfaceC3285t) {
        AbstractC1400p.l(interfaceC3285t);
        synchronized (this.f16558e) {
            for (int i8 = 0; i8 < this.f16558e.size(); i8++) {
                try {
                    if (interfaceC3285t.equals(((Pair) this.f16558e.get(i8)).first)) {
                        Log.w(this.f16554a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c cVar = new c(interfaceC3285t);
            this.f16558e.add(new Pair(interfaceC3285t, cVar));
            if (this.f16562i != null) {
                try {
                    this.f16562i.registerOnMeasurementEventListener(cVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f16554a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            l(new C2274w1(this, cVar));
        }
    }

    public final C3210a x() {
        return this.f16557d;
    }

    public final void y(String str) {
        l(new C2176l1(this, str));
    }

    public final void z(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, null);
    }
}
