package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2274v3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2270v f16894a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16895b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16896c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K3 f16897d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2274v3(K3 k32, C2270v c2270v, String str, InterfaceC2029k0 interfaceC2029k0) {
        this.f16897d = k32;
        this.f16894a = c2270v;
        this.f16895b = str;
        this.f16896c = interfaceC2029k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y1 y12;
        InterfaceC3391d interfaceC3391d;
        byte[] bArr = null;
        try {
            try {
                K3 k32 = this.f16897d;
                interfaceC3391d = k32.f16202d;
                if (interfaceC3391d == null) {
                    k32.f16777a.d().r().a("Discarding data. Failed to send event to service to bundle");
                    y12 = this.f16897d.f16777a;
                } else {
                    bArr = interfaceC3391d.g0(this.f16894a, this.f16895b);
                    this.f16897d.E();
                    y12 = this.f16897d.f16777a;
                }
            } catch (RemoteException e8) {
                this.f16897d.f16777a.d().r().b("Failed to send event to the service to bundle", e8);
                y12 = this.f16897d.f16777a;
            }
            y12.N().H(this.f16896c, bArr);
        } catch (Throwable th) {
            this.f16897d.f16777a.N().H(this.f16896c, bArr);
            throw th;
        }
    }
}
