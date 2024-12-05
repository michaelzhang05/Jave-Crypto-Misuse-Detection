package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x00 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzlh f12365f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzma f12366g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x00(zzma zzmaVar, zzlh zzlhVar) {
        this.f12366g = zzmaVar;
        this.f12365f = zzlhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlz zzlzVar;
        zzlzVar = this.f12366g.f15279b;
        zzlzVar.f(this.f12365f);
    }
}
