package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class e1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11331f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzajy f11332g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(zzajy zzajyVar, String str) {
        this.f11332g = zzajyVar;
        this.f11331f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbgz zzbgzVar;
        zzbgzVar = this.f11332g.f12751f;
        zzbgzVar.loadData(this.f11331f, "text/html", "UTF-8");
    }
}
