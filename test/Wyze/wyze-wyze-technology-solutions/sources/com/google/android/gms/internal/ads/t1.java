package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t1 implements zzbbt {
    private final /* synthetic */ zzala a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzakh f12187b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(zzakh zzakhVar, zzala zzalaVar) {
        this.f12187b = zzakhVar;
        this.a = zzalaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbt
    public final void run() {
        Object obj;
        obj = this.f12187b.a;
        synchronized (obj) {
            this.f12187b.f12762h = 1;
            zzawz.m("Failed loading new engine. Marking new engine destroyable.");
            this.a.i();
        }
    }
}
