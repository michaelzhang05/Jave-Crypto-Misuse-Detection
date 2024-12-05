package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzws {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f15704b;

    /* renamed from: c, reason: collision with root package name */
    private int f15705c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzwo f15706d;

    private zzws(zzwo zzwoVar, byte[] bArr) {
        this.f15706d = zzwoVar;
        this.a = bArr;
    }

    public final zzws a(int i2) {
        this.f15704b = i2;
        return this;
    }

    public final zzws b(int i2) {
        this.f15705c = i2;
        return this;
    }

    public final synchronized void c() {
        try {
            zzwo zzwoVar = this.f15706d;
            if (zzwoVar.f15703b) {
                zzwoVar.a.y0(this.a);
                this.f15706d.a.u3(this.f15704b);
                this.f15706d.a.G0(this.f15705c);
                this.f15706d.a.S2(null);
                this.f15706d.a.t6();
            }
        } catch (RemoteException e2) {
            zzbad.b("Clearcut log failed", e2);
        }
    }
}
