package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zznc f12484f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzma f12485g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z00(zzma zzmaVar, zznc zzncVar) {
        this.f12485g = zzmaVar;
        this.f12484f = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlz zzlzVar;
        this.f12484f.a();
        zzlzVar = this.f12485g.f15279b;
        zzlzVar.b(this.f12484f);
    }
}
