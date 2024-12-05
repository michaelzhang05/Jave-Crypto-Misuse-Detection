package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dz implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzgv f11327f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzgr f11328g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dz(zzgr zzgrVar, zzgv zzgvVar) {
        this.f11328g = zzgrVar;
        this.f11327f = zzgvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgw zzgwVar;
        zzgwVar = this.f11328g.f15083j;
        zzgwVar.d(this.f11327f);
    }
}
