package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.R3;
import m0.y;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements y {

    /* renamed from: a, reason: collision with root package name */
    private R3 f15992a;

    private final R3 d() {
        if (this.f15992a == null) {
            this.f15992a = new R3(this);
        }
        return this.f15992a;
    }

    @Override // m0.y
    public final boolean a(int i8) {
        return stopSelfResult(i8);
    }

    @Override // m0.y
    public final void b(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // m0.y
    public final void c(JobParameters jobParameters, boolean z8) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().b(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        d().a(intent, i8, i9);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
