package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z4 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzawv f12503f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z4(zzawv zzawvVar) {
        this.f12503f = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12503f.zzdut = Thread.currentThread();
        this.f12503f.zzto();
    }
}
