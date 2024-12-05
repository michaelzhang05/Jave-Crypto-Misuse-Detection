package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.zad;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class o implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zaak f10644f;

    private o(zaak zaakVar) {
        this.f10644f = zaakVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void C(Bundle bundle) {
        ClientSettings clientSettings;
        zad zadVar;
        Lock lock;
        Lock lock2;
        zad zadVar2;
        zad zadVar3;
        clientSettings = this.f10644f.r;
        if (clientSettings.m()) {
            lock = this.f10644f.f10674b;
            lock.lock();
            try {
                zadVar2 = this.f10644f.f10683k;
                if (zadVar2 == null) {
                    return;
                }
                zadVar3 = this.f10644f.f10683k;
                zadVar3.e(new m(this.f10644f));
                return;
            } finally {
                lock2 = this.f10644f.f10674b;
                lock2.unlock();
            }
        }
        zadVar = this.f10644f.f10683k;
        zadVar.e(new m(this.f10644f));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean x;
        lock = this.f10644f.f10674b;
        lock.lock();
        try {
            x = this.f10644f.x(connectionResult);
            if (x) {
                this.f10644f.l();
                this.f10644f.j();
            } else {
                this.f10644f.y(connectionResult);
            }
        } finally {
            lock2 = this.f10644f.f10674b;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void u(int i2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(zaak zaakVar, g gVar) {
        this(zaakVar);
    }
}
