package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class S3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16285a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2160a4 f16286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S3(C2160a4 c2160a4, long j8) {
        this.f16286b = c2160a4;
        this.f16285a = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2160a4.r(this.f16286b, this.f16285a);
    }
}
