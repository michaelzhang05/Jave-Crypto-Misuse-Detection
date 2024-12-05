package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.R3;
import m0.y;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements y {

    /* renamed from: a, reason: collision with root package name */
    private R3 f15990a;

    private final R3 d() {
        if (this.f15990a == null) {
            this.f15990a = new R3(this);
        }
        return this.f15990a;
    }

    @Override // m0.y
    public final boolean a(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // m0.y
    public final void b(Intent intent) {
    }

    @Override // m0.y
    public final void c(JobParameters jobParameters, boolean z8) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d().g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
