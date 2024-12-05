package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class h implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference<zaak> a;

    /* renamed from: b, reason: collision with root package name */
    private final Api<?> f10626b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10627c;

    public h(zaak zaakVar, Api<?> api, boolean z) {
        this.a = new WeakReference<>(zaakVar);
        this.f10626b = api;
        this.f10627c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        zabe zabeVar;
        Lock lock;
        Lock lock2;
        boolean t;
        boolean i2;
        zaak zaakVar = this.a.get();
        if (zaakVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        zabeVar = zaakVar.a;
        Preconditions.m(myLooper == zabeVar.s.o(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaakVar.f10674b;
        lock.lock();
        try {
            t = zaakVar.t(0);
            if (t) {
                if (!connectionResult.L()) {
                    zaakVar.p(connectionResult, this.f10626b, this.f10627c);
                }
                i2 = zaakVar.i();
                if (i2) {
                    zaakVar.j();
                }
            }
        } finally {
            lock2 = zaakVar.f10674b;
            lock2.unlock();
        }
    }
}
