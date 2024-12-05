package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class cz implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzhv f11266f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzgn f11267g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cz(zzgn zzgnVar, zzhv zzhvVar) {
        this.f11267g = zzgnVar;
        this.f11266f = zzhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgq zzgqVar;
        zzgqVar = this.f11267g.G;
        zzgqVar.h(this.f11266f);
    }
}
