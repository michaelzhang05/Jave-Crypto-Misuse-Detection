package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import l0.InterfaceC3258A;

/* renamed from: com.google.android.gms.measurement.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2370i5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17648a;

    public C2370i5(Context context) {
        AbstractC1400p.l(context);
        this.f17648a = context;
    }

    private final void f(Runnable runnable) {
        I5 j8 = I5.j(this.f17648a);
        j8.e().D(new RunnableC2398m5(this, j8, runnable));
    }

    private final C2367i2 j() {
        return R2.a(this.f17648a, null, null).c();
    }

    public final int a(final Intent intent, int i8, final int i9) {
        final C2367i2 c8 = R2.a(this.f17648a, null, null).c();
        if (intent == null) {
            c8.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c8.K().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i9), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.k5
                @Override // java.lang.Runnable
                public final void run() {
                    C2370i5.this.d(i9, c8, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new W2(I5.j(this.f17648a));
        }
        j().L().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        R2.a(this.f17648a, null, null).c().K().a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i8, C2367i2 c2367i2, Intent intent) {
        if (((InterfaceC3258A) this.f17648a).a(i8)) {
            c2367i2.K().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i8));
            j().K().a("Completed wakeful intent.");
            ((InterfaceC3258A) this.f17648a).b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(C2367i2 c2367i2, JobParameters jobParameters) {
        c2367i2.K().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC3258A) this.f17648a).c(jobParameters, false);
    }

    public final boolean g(final JobParameters jobParameters) {
        final C2367i2 c8 = R2.a(this.f17648a, null, null).c();
        String string = jobParameters.getExtras().getString("action");
        c8.K().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.l5
                @Override // java.lang.Runnable
                public final void run() {
                    C2370i5.this.e(c8, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final void h() {
        R2.a(this.f17648a, null, null).c().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
        } else {
            j().K().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
