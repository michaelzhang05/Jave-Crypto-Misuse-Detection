package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class fz implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11442f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f11443g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f11444h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzgr f11445i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fz(zzgr zzgrVar, String str, long j2, long j3) {
        this.f11445i = zzgrVar;
        this.f11442f = str;
        this.f11443g = j2;
        this.f11444h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgw zzgwVar;
        zzgwVar = this.f11445i.f15083j;
        zzgwVar.c(this.f11442f, this.f11443g, this.f11444h);
    }
}
