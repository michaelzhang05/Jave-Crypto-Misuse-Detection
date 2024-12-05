package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class l4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B4 f16666a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16667b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l4(AppMeasurementDynamiteService appMeasurementDynamiteService, B4 b42) {
        this.f16667b = appMeasurementDynamiteService;
        this.f16666a = b42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16667b.f16009a.I().H(this.f16666a);
    }
}
