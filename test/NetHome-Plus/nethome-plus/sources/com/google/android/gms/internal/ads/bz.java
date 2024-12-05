package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class bz implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzhu f11183f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzgn f11184g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bz(zzgn zzgnVar, zzhu zzhuVar) {
        this.f11184g = zzgnVar;
        this.f11183f = zzhuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgq zzgqVar;
        zzgqVar = this.f11184g.G;
        zzgqVar.f(this.f11183f);
    }
}
