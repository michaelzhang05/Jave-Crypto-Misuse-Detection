package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ab implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbhk f11072f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(zzbhk zzbhkVar) {
        this.f11072f = zzbhkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbgz zzbgzVar;
        zzbgzVar = this.f11072f.f13282f;
        zzbgzVar.destroy();
    }
}
