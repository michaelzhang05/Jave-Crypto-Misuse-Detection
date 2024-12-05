package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class o7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbcd f11925f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o7(zzbcd zzbcdVar) {
        this.f11925f = zzbcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcn zzbcnVar;
        zzbcn zzbcnVar2;
        zzbcnVar = this.f11925f.w;
        if (zzbcnVar != null) {
            zzbcnVar2 = this.f11925f.w;
            zzbcnVar2.a();
        }
    }
}
