package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f12413f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f12414g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f12415h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzma f12416i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y00(zzma zzmaVar, int i2, long j2, long j3) {
        this.f12416i = zzmaVar;
        this.f12413f = i2;
        this.f12414g = j2;
        this.f12415h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlz zzlzVar;
        zzlzVar = this.f12416i.f15279b;
        zzlzVar.c(this.f12413f, this.f12414g, this.f12415h);
    }
}
