package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class R3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16269a;

    public R3(Context context) {
        AbstractC1319p.l(context);
        this.f16269a = context;
    }

    private final C2267u1 k() {
        return Y1.H(this.f16269a, null, null).d();
    }

    public final int a(final Intent intent, int i8, final int i9) {
        Y1 H8 = Y1.H(this.f16269a, null, null);
        final C2267u1 d8 = H8.d();
        if (intent == null) {
            d8.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H8.b();
        d8.v().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i9), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.P3
                @Override // java.lang.Runnable
                public final void run() {
                    R3.this.c(i9, d8, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().r().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC2249q2(r4.f0(this.f16269a), null);
        }
        k().w().b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i8, C2267u1 c2267u1, Intent intent) {
        if (((m0.y) this.f16269a).a(i8)) {
            c2267u1.v().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i8));
            k().v().a("Completed wakeful intent.");
            ((m0.y) this.f16269a).b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(C2267u1 c2267u1, JobParameters jobParameters) {
        c2267u1.v().a("AppMeasurementJobService processed last upload request.");
        ((m0.y) this.f16269a).c(jobParameters, false);
    }

    public final void e() {
        Y1 H8 = Y1.H(this.f16269a, null, null);
        C2267u1 d8 = H8.d();
        H8.b();
        d8.v().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        Y1 H8 = Y1.H(this.f16269a, null, null);
        C2267u1 d8 = H8.d();
        H8.b();
        d8.v().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().r().a("onRebind called with null intent");
        } else {
            k().v().b("onRebind called. action", intent.getAction());
        }
    }

    public final void h(Runnable runnable) {
        r4 f02 = r4.f0(this.f16269a);
        f02.f().z(new Q3(this, f02, runnable));
    }

    public final boolean i(final JobParameters jobParameters) {
        Y1 H8 = Y1.H(this.f16269a, null, null);
        final C2267u1 d8 = H8.d();
        String string = jobParameters.getExtras().getString("action");
        H8.b();
        d8.v().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.O3
                @Override // java.lang.Runnable
                public final void run() {
                    R3.this.d(d8, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().r().a("onUnbind called with null intent");
            return true;
        }
        k().v().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
