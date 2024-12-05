package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class g1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11447f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzajy f11448g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(zzajy zzajyVar, String str) {
        this.f11448g = zzajyVar;
        this.f11447f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbgz zzbgzVar;
        zzbgzVar = this.f11448g.f12751f;
        zzbgzVar.loadUrl(this.f11447f);
    }
}
