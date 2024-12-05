package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzavg {
    private final AtomicReference<ThreadPoolExecutor> a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f13010b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f13011c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f13012d = null;

    /* renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    private final AtomicBoolean f13013e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    private final AtomicInteger f13014f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Object> f13015g = new AtomicReference<>(null);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<Object> f13016h = new AtomicReference<>(null);

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentMap<String, Method> f13017i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<zzbjf> f13018j = new AtomicReference<>(null);

    /* renamed from: k, reason: collision with root package name */
    private final List<FutureTask> f13019k = new ArrayList();

    private final Method A(Context context, String str) {
        Method method = this.f13017i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f13017i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, str, false);
            return null;
        }
    }

    private final Method B(Context context, String str) {
        Method method = this.f13017i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.f13017i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, str, false);
            return null;
        }
    }

    private final ThreadPoolExecutor C() {
        if (this.a.get() == null) {
            AtomicReference<ThreadPoolExecutor> atomicReference = this.a;
            zzacj<Integer> zzacjVar = zzacu.F0;
            atomicReference.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzyt.e().c(zzacjVar)).intValue(), ((Integer) zzyt.e().c(zzacjVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new q4(this)));
        }
        return this.a.get();
    }

    @VisibleForTesting
    private static boolean E(Context context) {
        if (!((Boolean) zzyt.e().c(zzacu.G0)).booleanValue()) {
            if (!((Boolean) zzyt.e().c(zzacu.H0)).booleanValue()) {
                return false;
            }
        }
        if (((Boolean) zzyt.e().c(zzacu.I0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object b(String str, Context context) {
        if (!k(context, "com.google.android.gms.measurement.AppMeasurement", this.f13015g, true)) {
            return null;
        }
        try {
            return A(context, str).invoke(this.f13015g.get(), new Object[0]);
        } catch (Exception e2) {
            i(e2, str, true);
            return null;
        }
    }

    private final <T> T c(String str, T t, r4<T> r4Var) {
        synchronized (this.f13018j) {
            if (this.f13018j.get() != null) {
                try {
                    return r4Var.a(this.f13018j.get());
                } catch (Exception e2) {
                    i(e2, str, false);
                }
            }
            return t;
        }
    }

    private final <T> Future<T> d(final String str, final r4<T> r4Var) {
        FutureTask futureTask;
        synchronized (this.f13018j) {
            futureTask = new FutureTask(new Callable(this, r4Var, str) { // from class: com.google.android.gms.internal.ads.h4

                /* renamed from: f, reason: collision with root package name */
                private final zzavg f11510f;

                /* renamed from: g, reason: collision with root package name */
                private final r4 f11511g;

                /* renamed from: h, reason: collision with root package name */
                private final String f11512h;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11510f = this;
                    this.f11511g = r4Var;
                    this.f11512h = str;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f11510f.a(this.f11511g, this.f11512h);
                }
            });
            if (this.f13018j.get() != null) {
                C().submit(futureTask);
            } else {
                this.f13019k.add(futureTask);
            }
        }
        return futureTask;
    }

    private final void e(Context context, String str, String str2) {
        if (k(context, "com.google.android.gms.measurement.AppMeasurement", this.f13015g, true)) {
            try {
                z(context, str2).invoke(this.f13015g.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzawz.m(sb.toString());
            } catch (Exception e2) {
                i(e2, str2, false);
            }
        }
    }

    private final void f(Context context, final String str, String str2, Bundle bundle) {
        if (D(context)) {
            final Bundle x = x(str2, str);
            if (bundle != null) {
                x.putAll(bundle);
            }
            if (E(context)) {
                j("logEventInternal", new s4(str, x) { // from class: com.google.android.gms.internal.ads.f4
                    private final String a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Bundle f11392b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = str;
                        this.f11392b = x;
                    }

                    @Override // com.google.android.gms.internal.ads.s4
                    public final void a(zzbjf zzbjfVar) {
                        zzbjfVar.w3("am", this.a, this.f11392b);
                    }
                });
                return;
            }
            if (k(context, "com.google.android.gms.measurement.AppMeasurement", this.f13015g, true)) {
                try {
                    p(context).invoke(this.f13015g.get(), "am", str, x);
                } catch (Exception e2) {
                    i(e2, "logEventInternal", true);
                }
            }
        }
    }

    private final void i(Exception exc, String str, boolean z) {
        if (this.f13013e.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        zzbad.i(sb.toString());
        if (z) {
            zzbad.i("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f13013e.set(true);
        }
    }

    private final void j(final String str, final s4 s4Var) {
        synchronized (this.f13018j) {
            FutureTask futureTask = new FutureTask(new Runnable(this, s4Var, str) { // from class: com.google.android.gms.internal.ads.g4

                /* renamed from: f, reason: collision with root package name */
                private final zzavg f11462f;

                /* renamed from: g, reason: collision with root package name */
                private final s4 f11463g;

                /* renamed from: h, reason: collision with root package name */
                private final String f11464h;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11462f = this;
                    this.f11463g = s4Var;
                    this.f11464h = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f11462f.h(this.f11463g, this.f11464h);
                }
            }, null);
            if (this.f13018j.get() != null) {
                futureTask.run();
            } else {
                this.f13019k.add(futureTask);
            }
        }
    }

    private final boolean k(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e2) {
                i(e2, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final Method p(Context context) {
        Method method = this.f13017i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.f13017i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, "logEventInternal", true);
            return null;
        }
    }

    private static Bundle x(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String valueOf = String.valueOf(str);
            zzbad.c(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e2);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method z(Context context, String str) {
        Method method = this.f13017i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.f13017i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            i(e2, str, false);
            return null;
        }
    }

    public final boolean D(Context context) {
        if (((Boolean) zzyt.e().c(zzacu.z0)).booleanValue() && !this.f13013e.get()) {
            if (((Boolean) zzyt.e().c(zzacu.J0)).booleanValue()) {
                return true;
            }
            if (this.f13014f.get() == -1) {
                zzyt.a();
                if (!zzazt.s(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzyt.a();
                    if (zzazt.n(context)) {
                        zzbad.i("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f13014f.set(0);
                    }
                }
                this.f13014f.set(1);
            }
            if (this.f13014f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final String F(Context context) {
        if (!D(context)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (E(context)) {
            return (String) c("getCurrentScreenNameOrScreenClass", HttpUrl.FRAGMENT_ENCODE_SET, i4.a);
        }
        if (!k(context, "com.google.android.gms.measurement.AppMeasurement", this.f13015g, true)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            String str = (String) A(context, "getCurrentScreenName").invoke(this.f13015g.get(), new Object[0]);
            if (str == null) {
                str = (String) A(context, "getCurrentScreenClass").invoke(this.f13015g.get(), new Object[0]);
            }
            return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Exception e2) {
            i(e2, "getCurrentScreenName", false);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object a(r4 r4Var, String str) throws Exception {
        try {
            return r4Var.a(this.f13018j.get());
        } catch (Exception e2) {
            i(e2, str, false);
            throw e2;
        }
    }

    public final void g(Context context, String str, String str2, String str3, int i2) {
        if (D(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("type", str3);
            bundle.putInt("value", i2);
            f(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            zzawz.m(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(s4 s4Var, String str) {
        if (this.f13018j.get() != null) {
            try {
                s4Var.a(this.f13018j.get());
            } catch (Exception e2) {
                i(e2, str, false);
            }
        }
    }

    public final String l(Context context) {
        if (!D(context)) {
            return null;
        }
        synchronized (this.f13010b) {
            String str = this.f13011c;
            if (str != null) {
                return str;
            }
            if (E(context)) {
                this.f13011c = (String) c("getGmpAppId", this.f13011c, k4.a);
            } else {
                this.f13011c = (String) b("getGmpAppId", context);
            }
            return this.f13011c;
        }
    }

    public final String m(final Context context) {
        if (!D(context)) {
            return null;
        }
        long longValue = ((Long) zzyt.e().c(zzacu.E0)).longValue();
        if (E(context)) {
            try {
                if (longValue < 0) {
                    return (String) d("getAppInstanceId", l4.a).get();
                }
                return (String) d("getAppInstanceId", m4.a).get(longValue, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                if (e2 instanceof TimeoutException) {
                    return "TIME_OUT";
                }
                return null;
            }
        }
        if (longValue < 0) {
            return (String) b("getAppInstanceId", context);
        }
        Future submit = C().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.n4

            /* renamed from: f, reason: collision with root package name */
            private final zzavg f11843f;

            /* renamed from: g, reason: collision with root package name */
            private final Context f11844g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11843f = this;
                this.f11844g = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11843f.q(this.f11844g);
            }
        });
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e3) {
            submit.cancel(true);
            if (e3 instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    public final String n(Context context) {
        if (!D(context)) {
            return null;
        }
        if (E(context)) {
            Long l = (Long) c("getAdEventId", null, o4.a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object b2 = b("generateEventId", context);
        if (b2 != null) {
            return b2.toString();
        }
        return null;
    }

    public final String o(Context context) {
        if (!D(context)) {
            return null;
        }
        synchronized (this.f13010b) {
            String str = this.f13012d;
            if (str != null) {
                return str;
            }
            if (E(context)) {
                this.f13012d = (String) c("getAppIdOrigin", this.f13012d, p4.a);
            } else {
                this.f13012d = "fa";
            }
            return this.f13012d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String q(Context context) throws Exception {
        return (String) b("getAppInstanceId", context);
    }

    public final void r(Context context, final String str) {
        if (D(context)) {
            if (E(context)) {
                j("beginAdUnitExposure", new s4(str) { // from class: com.google.android.gms.internal.ads.d4
                    private final String a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.s4
                    public final void a(zzbjf zzbjfVar) {
                        zzbjfVar.f6(this.a);
                    }
                });
            } else {
                e(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void s(Context context, final String str) {
        if (D(context)) {
            if (E(context)) {
                j("endAdUnitExposure", new s4(str) { // from class: com.google.android.gms.internal.ads.e4
                    private final String a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.s4
                    public final void a(zzbjf zzbjfVar) {
                        zzbjfVar.w7(this.a);
                    }
                });
            } else {
                e(context, str, "endAdUnitExposure");
            }
        }
    }

    public final void t(final Context context, final String str) {
        if (D(context) && (context instanceof Activity)) {
            if (E(context)) {
                j("setScreenName", new s4(context, str) { // from class: com.google.android.gms.internal.ads.j4
                    private final Context a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f11635b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = context;
                        this.f11635b = str;
                    }

                    @Override // com.google.android.gms.internal.ads.s4
                    public final void a(zzbjf zzbjfVar) {
                        Context context2 = this.a;
                        zzbjfVar.F4(ObjectWrapper.i0(context2), this.f11635b, context2.getPackageName());
                    }
                });
                return;
            }
            if (k(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f13016h, false)) {
                try {
                    B(context, "setCurrentScreen").invoke(this.f13016h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception e2) {
                    i(e2, "setCurrentScreen", false);
                }
            }
        }
    }

    public final void u(Context context, String str) {
        f(context, "_ac", str, null);
    }

    public final void v(Context context, String str) {
        f(context, "_ai", str, null);
    }

    public final void w(Context context, String str) {
        f(context, "_aq", str, null);
    }

    public final void y(Context context, String str) {
        f(context, "_aa", str, null);
    }
}
