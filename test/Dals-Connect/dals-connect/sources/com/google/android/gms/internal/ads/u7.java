package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class u7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbcd f12216f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u7(zzbcd zzbcdVar) {
        this.f12216f = zzbcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcn zzbcnVar;
        zzbcn zzbcnVar2;
        zzbcnVar = this.f12216f.w;
        if (zzbcnVar != null) {
            zzbcnVar2 = this.f12216f.w;
            zzbcnVar2.j();
        }
    }
}
