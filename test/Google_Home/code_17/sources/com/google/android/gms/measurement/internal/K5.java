package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ T5 f17241a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ I5 f17242b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K5(I5 i52, T5 t52) {
        this.f17241a = t52;
        this.f17242b = i52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5.u(this.f17242b, this.f17241a);
        this.f17242b.D0();
    }
}
