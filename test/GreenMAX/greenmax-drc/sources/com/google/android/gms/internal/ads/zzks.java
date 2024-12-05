package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzks implements zzlo, zzlp {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private zzlq f15223b;

    /* renamed from: c, reason: collision with root package name */
    private int f15224c;

    /* renamed from: d, reason: collision with root package name */
    private int f15225d;

    /* renamed from: e, reason: collision with root package name */
    private zzqw f15226e;

    /* renamed from: f, reason: collision with root package name */
    private long f15227f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15228g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15229h;

    public zzks(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void A(long j2) throws zzku {
        this.f15229h = false;
        this.f15228g = false;
        l(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final zzqw B() {
        return this.f15226e;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void D(zzlh[] zzlhVarArr, zzqw zzqwVar, long j2) throws zzku {
        zzsk.e(!this.f15229h);
        this.f15226e = zzqwVar;
        this.f15228g = false;
        this.f15227f = j2;
        k(zzlhVarArr, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final boolean E() {
        return this.f15228g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlq F() {
        return this.f15223b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean G() {
        return this.f15228g ? this.f15229h : this.f15226e.p();
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public int a() throws zzku {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public void c(int i2, Object obj) throws zzku {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g() {
        return this.f15224c;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final int getState() {
        return this.f15225d;
    }

    protected void h() throws zzku {
    }

    protected void i() throws zzku {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int j(zzlj zzljVar, zznd zzndVar, boolean z) {
        int c2 = this.f15226e.c(zzljVar, zzndVar, z);
        if (c2 == -4) {
            if (zzndVar.f()) {
                this.f15228g = true;
                return this.f15229h ? -4 : -3;
            }
            zzndVar.f15326d += this.f15227f;
        } else if (c2 == -5) {
            zzlh zzlhVar = zzljVar.a;
            long j2 = zzlhVar.B;
            if (j2 != Long.MAX_VALUE) {
                zzljVar.a = zzlhVar.l(j2 + this.f15227f);
            }
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(zzlh[] zzlhVarArr, long j2) throws zzku {
    }

    protected void l(long j2, boolean z) throws zzku {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(long j2) {
        this.f15226e.b(j2 - this.f15227f);
    }

    protected void n() {
    }

    protected void o(boolean z) throws zzku {
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void r(int i2) {
        this.f15224c = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzlo, com.google.android.gms.internal.ads.zzlp
    public final int s() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void start() throws zzku {
        zzsk.e(this.f15225d == 1);
        this.f15225d = 2;
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void stop() throws zzku {
        zzsk.e(this.f15225d == 2);
        this.f15225d = 1;
        i();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void t(zzlq zzlqVar, zzlh[] zzlhVarArr, zzqw zzqwVar, long j2, boolean z, long j3) throws zzku {
        zzsk.e(this.f15225d == 0);
        this.f15223b = zzlqVar;
        this.f15225d = 1;
        o(z);
        D(zzlhVarArr, zzqwVar, j3);
        l(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final zzlp u() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public zzso v() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void w() throws IOException {
        this.f15226e.a();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void x() {
        this.f15229h = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final boolean y() {
        return this.f15229h;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void z() {
        zzsk.e(this.f15225d == 1);
        this.f15225d = 0;
        this.f15226e = null;
        this.f15229h = false;
        n();
    }
}
