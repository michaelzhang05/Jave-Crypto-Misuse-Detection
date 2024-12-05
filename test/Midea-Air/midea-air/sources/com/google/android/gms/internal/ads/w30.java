package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zznc f12317f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzto f12318g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w30(zzto zztoVar, zznc zzncVar) {
        this.f12318g = zztoVar;
        this.f12317f = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zztn zztnVar;
        zztnVar = this.f12318g.f15598b;
        zztnVar.r(this.f12317f);
    }
}
