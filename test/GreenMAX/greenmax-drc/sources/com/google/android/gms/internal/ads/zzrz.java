package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzrz implements zzrt {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15513b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f15514c;

    /* renamed from: d, reason: collision with root package name */
    private final zzrs[] f15515d;

    /* renamed from: e, reason: collision with root package name */
    private int f15516e;

    /* renamed from: f, reason: collision with root package name */
    private int f15517f;

    /* renamed from: g, reason: collision with root package name */
    private int f15518g;

    /* renamed from: h, reason: collision with root package name */
    private zzrs[] f15519h;

    public zzrz(boolean z, int i2) {
        this(true, 65536, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final int a() {
        return this.f15513b;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final synchronized void b(zzrs[] zzrsVarArr) {
        boolean z;
        int i2 = this.f15518g;
        int length = zzrsVarArr.length + i2;
        zzrs[] zzrsVarArr2 = this.f15519h;
        if (length >= zzrsVarArr2.length) {
            this.f15519h = (zzrs[]) Arrays.copyOf(zzrsVarArr2, Math.max(zzrsVarArr2.length << 1, i2 + zzrsVarArr.length));
        }
        for (zzrs zzrsVar : zzrsVarArr) {
            byte[] bArr = zzrsVar.a;
            if (bArr != null && bArr.length != this.f15513b) {
                z = false;
                zzsk.a(z);
                zzrs[] zzrsVarArr3 = this.f15519h;
                int i3 = this.f15518g;
                this.f15518g = i3 + 1;
                zzrsVarArr3[i3] = zzrsVar;
            }
            z = true;
            zzsk.a(z);
            zzrs[] zzrsVarArr32 = this.f15519h;
            int i32 = this.f15518g;
            this.f15518g = i32 + 1;
            zzrsVarArr32[i32] = zzrsVar;
        }
        this.f15517f -= zzrsVarArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final synchronized void c() {
        int max = Math.max(0, zzsy.j(this.f15516e, this.f15513b) - this.f15517f);
        int i2 = this.f15518g;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.f15519h, max, i2, (Object) null);
        this.f15518g = max;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final synchronized zzrs d() {
        zzrs zzrsVar;
        this.f15517f++;
        int i2 = this.f15518g;
        if (i2 > 0) {
            zzrs[] zzrsVarArr = this.f15519h;
            int i3 = i2 - 1;
            this.f15518g = i3;
            zzrsVar = zzrsVarArr[i3];
            zzrsVarArr[i3] = null;
        } else {
            zzrsVar = new zzrs(new byte[this.f15513b], 0);
        }
        return zzrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    public final synchronized void e(zzrs zzrsVar) {
        zzrs[] zzrsVarArr = this.f15515d;
        zzrsVarArr[0] = zzrsVar;
        b(zzrsVarArr);
    }

    public final synchronized void f() {
        if (this.a) {
            g(0);
        }
    }

    public final synchronized void g(int i2) {
        boolean z = i2 < this.f15516e;
        this.f15516e = i2;
        if (z) {
            c();
        }
    }

    public final synchronized int h() {
        return this.f15517f * this.f15513b;
    }

    private zzrz(boolean z, int i2, int i3) {
        zzsk.a(true);
        zzsk.a(true);
        this.a = true;
        this.f15513b = 65536;
        this.f15518g = 0;
        this.f15519h = new zzrs[100];
        this.f15514c = null;
        this.f15515d = new zzrs[1];
    }
}
