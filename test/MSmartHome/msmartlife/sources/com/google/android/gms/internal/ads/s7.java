package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class s7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f12154f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f12155g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzbcd f12156h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s7(zzbcd zzbcdVar, int i2, int i3) {
        this.f12156h = zzbcdVar;
        this.f12154f = i2;
        this.f12155g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcn zzbcnVar;
        zzbcn zzbcnVar2;
        zzbcnVar = this.f12156h.w;
        if (zzbcnVar != null) {
            zzbcnVar2 = this.f12156h.w;
            zzbcnVar2.l(this.f12154f, this.f12155g);
        }
    }
}
