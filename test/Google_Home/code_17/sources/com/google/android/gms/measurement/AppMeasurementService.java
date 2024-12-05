package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C2370i5;
import l0.InterfaceC3258A;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements InterfaceC3258A {

    /* renamed from: a, reason: collision with root package name */
    private C2370i5 f16928a;

    private final C2370i5 d() {
        if (this.f16928a == null) {
            this.f16928a = new C2370i5(this);
        }
        return this.f16928a;
    }

    @Override // l0.InterfaceC3258A
    public final boolean a(int i8) {
        return stopSelfResult(i8);
    }

    @Override // l0.InterfaceC3258A
    public final void b(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // l0.InterfaceC3258A
    public final void c(JobParameters jobParameters, boolean z8) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return d().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i8, int i9) {
        return d().a(intent, i8, i9);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().k(intent);
    }
}
