package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class r7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbcd f12100f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r7(zzbcd zzbcdVar) {
        this.f12100f = zzbcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcn zzbcnVar;
        zzbcn zzbcnVar2;
        zzbcnVar = this.f12100f.w;
        if (zzbcnVar != null) {
            zzbcnVar2 = this.f12100f.w;
            zzbcnVar2.k();
        }
    }
}
