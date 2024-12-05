package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class f1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11377f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzajy f11378g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(zzajy zzajyVar, String str) {
        this.f11378g = zzajyVar;
        this.f11377f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbgz zzbgzVar;
        zzbgzVar = this.f11378g.f12751f;
        zzbgzVar.loadData(this.f11377f, "text/html", "UTF-8");
    }
}
