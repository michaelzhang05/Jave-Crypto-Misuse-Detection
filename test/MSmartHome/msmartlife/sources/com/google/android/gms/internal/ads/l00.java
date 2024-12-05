package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class l00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final zzr f11742f;

    /* renamed from: g, reason: collision with root package name */
    private final zzy f11743g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f11744h;

    public l00(zzr zzrVar, zzy zzyVar, Runnable runnable) {
        this.f11742f = zzrVar;
        this.f11743g = zzyVar;
        this.f11744h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11742f.n();
        zzy zzyVar = this.f11743g;
        zzaf zzafVar = zzyVar.f15798c;
        if (zzafVar == null) {
            this.f11742f.E(zzyVar.a);
        } else {
            this.f11742f.G(zzafVar);
        }
        if (this.f11743g.f15799d) {
            this.f11742f.H("intermediate-response");
        } else {
            this.f11742f.I("done");
        }
        Runnable runnable = this.f11744h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
