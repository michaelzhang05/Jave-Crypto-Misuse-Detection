package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f12049f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f12050g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzbcd f12051h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q7(zzbcd zzbcdVar, String str, String str2) {
        this.f12051h = zzbcdVar;
        this.f12049f = str;
        this.f12050g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcn zzbcnVar;
        zzbcn zzbcnVar2;
        zzbcnVar = this.f12051h.w;
        if (zzbcnVar != null) {
            zzbcnVar2 = this.f12051h.w;
            zzbcnVar2.h(this.f12049f, this.f12050g);
        }
    }
}
