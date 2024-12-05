package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class K1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f16194a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L1 f16195b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(L1 l12, String str) {
        this.f16195b = l12;
        this.f16194a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                com.google.android.gms.internal.measurement.V j8 = com.google.android.gms.internal.measurement.U.j(iBinder);
                if (j8 == null) {
                    this.f16195b.f16212a.d().w().a("Install Referrer Service implementation was not found");
                    return;
                } else {
                    this.f16195b.f16212a.d().v().a("Install Referrer Service connected");
                    this.f16195b.f16212a.f().z(new J1(this, j8, this));
                    return;
                }
            } catch (RuntimeException e8) {
                this.f16195b.f16212a.d().w().b("Exception occurred while calling Install Referrer API", e8);
                return;
            }
        }
        this.f16195b.f16212a.d().w().a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16195b.f16212a.d().v().a("Install Referrer Service disconnected");
    }
}
