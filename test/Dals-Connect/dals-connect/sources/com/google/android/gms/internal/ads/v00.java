package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zznc f12252f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzma f12253g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v00(zzma zzmaVar, zznc zzncVar) {
        this.f12253g = zzmaVar;
        this.f12252f = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlz zzlzVar;
        zzlzVar = this.f12253g.f15279b;
        zzlzVar.e(this.f12252f);
    }
}
