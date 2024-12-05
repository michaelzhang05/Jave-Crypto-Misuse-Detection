package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2363h5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2314a5 f17617a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2363h5(ServiceConnectionC2314a5 serviceConnectionC2314a5) {
        this.f17617a = serviceConnectionC2314a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17617a.f17452c.f17004d = null;
        this.f17617a.f17452c.l0();
    }
}
