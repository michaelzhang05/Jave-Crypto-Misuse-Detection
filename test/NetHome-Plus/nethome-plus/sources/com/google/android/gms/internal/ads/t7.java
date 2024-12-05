package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class t7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbcd f12194f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t7(zzbcd zzbcdVar) {
        this.f12194f = zzbcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcn zzbcnVar;
        zzbcn zzbcnVar2;
        zzbcn zzbcnVar3;
        zzbcnVar = this.f12194f.w;
        if (zzbcnVar != null) {
            zzbcnVar2 = this.f12194f.w;
            zzbcnVar2.m();
            zzbcnVar3 = this.f12194f.w;
            zzbcnVar3.g();
        }
    }
}
