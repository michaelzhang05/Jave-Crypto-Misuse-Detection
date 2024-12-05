package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2398m5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ I5 f17726a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f17727b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2398m5(C2370i5 c2370i5, I5 i52, Runnable runnable) {
        this.f17726a = i52;
        this.f17727b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17726a.z0();
        this.f17726a.z(this.f17727b);
        this.f17726a.E0();
    }
}
