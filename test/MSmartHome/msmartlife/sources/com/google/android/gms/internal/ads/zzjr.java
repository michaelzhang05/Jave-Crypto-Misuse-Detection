package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzjr implements zzjl {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private int f15186b;

    /* renamed from: c, reason: collision with root package name */
    private int f15187c;

    /* renamed from: d, reason: collision with root package name */
    private zzjk[] f15188d;

    public zzjr(int i2) {
        zzkh.a(true);
        this.a = 262144;
        this.f15188d = new zzjk[100];
    }

    private final synchronized int e() {
        return this.f15186b * this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzjl
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzjl
    public final synchronized zzjk b() {
        this.f15186b++;
        int i2 = this.f15187c;
        if (i2 <= 0) {
            return new zzjk(new byte[this.a], 0);
        }
        zzjk[] zzjkVarArr = this.f15188d;
        int i3 = i2 - 1;
        this.f15187c = i3;
        return zzjkVarArr[i3];
    }

    @Override // com.google.android.gms.internal.ads.zzjl
    public final synchronized void c(zzjk zzjkVar) {
        zzkh.a(zzjkVar.a.length == this.a);
        this.f15186b--;
        int i2 = this.f15187c;
        zzjk[] zzjkVarArr = this.f15188d;
        if (i2 == zzjkVarArr.length) {
            this.f15188d = (zzjk[]) Arrays.copyOf(zzjkVarArr, zzjkVarArr.length << 1);
        }
        zzjk[] zzjkVarArr2 = this.f15188d;
        int i3 = this.f15187c;
        this.f15187c = i3 + 1;
        zzjkVarArr2[i3] = zzjkVar;
        notifyAll();
    }

    public final synchronized void d(int i2) throws InterruptedException {
        while (e() > i2) {
            wait();
        }
    }

    public final synchronized void f(int i2) {
        int max = Math.max(0, zzkq.g(0, this.a) - this.f15186b);
        int i3 = this.f15187c;
        if (max < i3) {
            Arrays.fill(this.f15188d, max, i3, (Object) null);
            this.f15187c = max;
        }
    }
}
