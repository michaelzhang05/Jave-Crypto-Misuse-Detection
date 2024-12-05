package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzcy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class zzea {
    private static volatile zzea a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16084b;

    /* renamed from: c, reason: collision with root package name */
    protected final Clock f16085c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f16086d;

    /* renamed from: e, reason: collision with root package name */
    private final AppMeasurementSdk f16087e;

    /* renamed from: f, reason: collision with root package name */
    private Map<zzcy, ?> f16088f;

    /* renamed from: g, reason: collision with root package name */
    private int f16089g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16090h;

    /* renamed from: i, reason: collision with root package name */
    private String f16091i;

    /* renamed from: j, reason: collision with root package name */
    private zzdn f16092j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends zzdr {

        /* renamed from: f, reason: collision with root package name */
        private final AtomicReference<Bundle> f16093f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        private boolean f16094g;

        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
        
            r9 = r9.get("r");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final <T> T C(android.os.Bundle r9, java.lang.Class<T> r10) {
            /*
                r8 = this;
                r0 = 0
                if (r9 == 0) goto L46
                java.lang.String r1 = "r"
                java.lang.Object r9 = r9.get(r1)
                if (r9 == 0) goto L46
                java.lang.Object r9 = r10.cast(r9)     // Catch: java.lang.ClassCastException -> L10
                return r9
            L10:
                r6 = move-exception
                java.lang.String r7 = "Unexpected object type. Expected, Received"
                java.lang.String r10 = r10.getCanonicalName()
                java.lang.Class r9 = r9.getClass()
                java.lang.String r9 = r9.getCanonicalName()
                com.google.android.gms.internal.measurement.zzea r0 = com.google.android.gms.internal.measurement.zzea.this
                r1 = 5
                r2 = r7
                r3 = r10
                r4 = r9
                r5 = r6
                r0.C(r1, r2, r3, r4, r5)
                com.google.android.gms.internal.measurement.zzea r0 = com.google.android.gms.internal.measurement.zzea.this
                java.lang.String r0 = com.google.android.gms.internal.measurement.zzea.B(r0)
                java.lang.String r1 = ": %s, %s"
                java.lang.String r1 = r7.concat(r1)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r10
                r10 = 1
                r2[r10] = r9
                java.lang.String r9 = java.lang.String.format(r1, r2)
                android.util.Log.w(r0, r9, r6)
                throw r6
            L46:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzea.a.C(android.os.Bundle, java.lang.Class):java.lang.Object");
        }

        final String R(long j2) {
            return (String) C(i0(j2), String.class);
        }

        final Bundle i0(long j2) {
            Bundle bundle;
            synchronized (this.f16093f) {
                if (!this.f16094g) {
                    try {
                        this.f16093f.wait(j2);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = this.f16093f.get();
            }
            return bundle;
        }

        @Override // com.google.android.gms.internal.measurement.zzdq
        public final void zzb(Bundle bundle) {
            synchronized (this.f16093f) {
                try {
                    this.f16093f.set(bundle);
                    this.f16094g = true;
                } finally {
                    this.f16093f.notify();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final long f16096f;

        /* renamed from: g, reason: collision with root package name */
        final long f16097g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f16098h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(zzea zzeaVar) {
            this(true);
        }

        abstract void a() throws RemoteException;

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zzea.this.f16090h) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                zzea.this.v(e2, false, this.f16098h);
                b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(boolean z) {
            this.f16096f = zzea.this.f16085c.a();
            this.f16097g = zzea.this.f16085c.b();
            this.f16098h = z;
        }
    }

    /* loaded from: classes2.dex */
    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzea.this.s(new t(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzea.this.s(new z(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzea.this.s(new w(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzea.this.s(new v(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            a aVar = new a();
            zzea.this.s(new y(this, activity, aVar));
            Bundle i0 = aVar.i0(50L);
            if (i0 != null) {
                bundle.putAll(i0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzea.this.s(new u(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzea.this.s(new x(this, activity));
        }
    }

    private zzea(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str != null && D(str2, str3)) {
            this.f16084b = str;
        } else {
            this.f16084b = "FA";
        }
        this.f16085c = DefaultClock.c();
        this.f16086d = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f16084b, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
        this.f16087e = new AppMeasurementSdk(this);
        if (!(!E(context) || H())) {
            this.f16091i = null;
            this.f16090h = true;
            Log.w(this.f16084b, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!D(str2, str3)) {
            this.f16091i = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f16084b, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.f16090h = true;
                return;
            } else {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f16084b, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.f16091i = str2;
        }
        s(new com.google.android.gms.internal.measurement.b(this, context, str2, str3, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(String str, String str2) {
        return (str2 == null || str == null || H()) ? false : true;
    }

    private static boolean E(Context context) {
        try {
            GoogleServices.c(context);
        } catch (IllegalStateException unused) {
        }
        return GoogleServices.b() != null;
    }

    private static boolean H() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int J(Context context) {
        return DynamiteModule.c(context, "com.google.android.gms.measurement.dynamite");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(Context context) {
        return DynamiteModule.a(context, "com.google.android.gms.measurement.dynamite");
    }

    public static zzea q(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.j(context);
        if (a == null) {
            synchronized (zzea.class) {
                if (a == null) {
                    a = new zzea(context, str, str2, str3, bundle);
                }
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(b bVar) {
        this.f16086d.execute(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Exception exc, boolean z, boolean z2) {
        this.f16090h |= z;
        if (z) {
            Log.w(this.f16084b, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            C(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f16084b, "Error with data collection. Data lost.", exc);
    }

    private final void w(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        s(new q(this, l, str, str2, bundle, true, z2));
    }

    public final void C(int i2, String str, Object obj, Object obj2, Object obj3) {
        s(new n(this, false, 5, str, obj, obj2, obj3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzdn F(Context context) {
        try {
            return zzdo.C(DynamiteModule.e(context, DynamiteModule.l, "com.google.android.gms.measurement.dynamite").d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e2) {
            v(e2, true, false);
            return null;
        }
    }

    public final AppMeasurementSdk G() {
        return this.f16087e;
    }

    public final String I() {
        a aVar = new a();
        s(new i(this, aVar));
        return aVar.R(50L);
    }

    public final void a(String str) {
        s(new f(this, str));
    }

    public final void b(String str, String str2, Bundle bundle) {
        s(new com.google.android.gms.internal.measurement.c(this, str, str2, bundle));
    }

    public final void c(String str) {
        s(new g(this, str));
    }

    public final long d() {
        a aVar = new a();
        s(new j(this, aVar));
        Long l = (Long) aVar.C(aVar.i0(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f16085c.a()).nextLong();
            int i2 = this.f16089g + 1;
            this.f16089g = i2;
            return nextLong + i2;
        }
        return l.longValue();
    }

    public final String e() {
        return this.f16091i;
    }

    public final List<Bundle> f(String str, String str2) {
        a aVar = new a();
        s(new d(this, str, str2, aVar));
        List<Bundle> list = (List) aVar.C(aVar.i0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final String g() {
        a aVar = new a();
        s(new l(this, aVar));
        return aVar.R(500L);
    }

    public final String h() {
        a aVar = new a();
        s(new k(this, aVar));
        return aVar.R(500L);
    }

    public final String i() {
        a aVar = new a();
        s(new h(this, aVar));
        return aVar.R(500L);
    }

    public final int j(String str) {
        a aVar = new a();
        s(new p(this, str, aVar));
        Integer num = (Integer) aVar.C(aVar.i0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final Map<String, Object> k(String str, String str2, boolean z) {
        a aVar = new a();
        s(new m(this, str, str2, z, aVar));
        Bundle i0 = aVar.i0(5000L);
        if (i0 != null && i0.size() != 0) {
            HashMap hashMap = new HashMap(i0.size());
            for (String str3 : i0.keySet()) {
                Object obj = i0.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void l(String str, String str2, Bundle bundle) {
        w(str, str2, bundle, true, true, null);
    }

    public final void m(Bundle bundle) {
        s(new s(this, bundle));
    }

    public final void n(Activity activity, String str, String str2) {
        s(new e(this, activity, str, str2));
    }

    public final Bundle o(Bundle bundle, boolean z) {
        a aVar = new a();
        s(new o(this, bundle, aVar));
        if (z) {
            return aVar.i0(5000L);
        }
        return null;
    }

    public final void x(String str, String str2, Object obj, boolean z) {
        s(new r(this, str, str2, obj, true));
    }
}
