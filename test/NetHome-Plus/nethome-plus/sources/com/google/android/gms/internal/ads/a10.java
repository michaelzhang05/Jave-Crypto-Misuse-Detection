package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a10 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f11046f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzma f11047g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a10(zzma zzmaVar, int i2) {
        this.f11047g = zzmaVar;
        this.f11046f = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlz zzlzVar;
        zzlzVar = this.f11047g.f15279b;
        zzlzVar.a(this.f11046f);
    }
}
