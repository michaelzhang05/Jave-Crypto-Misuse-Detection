package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ld implements zzban<zzbpc> {
    private final /* synthetic */ zzban a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzbpk f11770b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ld(zzbpk zzbpkVar, zzban zzbanVar) {
        this.f11770b = zzbpkVar;
        this.a = zzbanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void a(Throwable th) {
        this.a.a(th);
        this.f11770b.g();
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void b(zzbpc zzbpcVar) {
        this.a.b(zzbpcVar);
        this.f11770b.g();
    }
}
