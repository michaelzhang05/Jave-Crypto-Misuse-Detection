package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2370i5;
import l0.InterfaceC3258A;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC3258A {

    /* renamed from: a, reason: collision with root package name */
    private C2370i5 f16926a;

    private final C2370i5 d() {
        if (this.f16926a == null) {
            this.f16926a = new C2370i5(this);
        }
        return this.f16926a;
    }

    @Override // l0.InterfaceC3258A
    public final boolean a(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // l0.InterfaceC3258A
    public final void b(Intent intent) {
    }

    @Override // l0.InterfaceC3258A
    public final void c(JobParameters jobParameters, boolean z8) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return d().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().k(intent);
    }
}
