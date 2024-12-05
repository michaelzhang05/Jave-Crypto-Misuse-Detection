package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class N4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17270a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17271b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.R0 r02) {
        this.f17270a = r02;
        this.f17271b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17271b.f16967a.L().U(this.f17270a, this.f17271b.f16967a.l());
    }
}
