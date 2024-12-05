package com.google.android.gms.internal.ads;

/* JADX INFO: Add missing generic type declarations: [O] */
/* loaded from: classes2.dex */
final class kq<O> implements zzban<O> {
    private final /* synthetic */ zzcze a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzczl f11735b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kq(zzczl zzczlVar, zzcze zzczeVar) {
        this.f11735b = zzczlVar;
        this.a = zzczeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        zzczf.f(this.f11735b.f14626f).L(this.a, th);
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void b(O o) {
        zzczf.f(this.f11735b.f14626f).B(this.a);
    }
}
