package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2458v3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17862a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17863b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2458v3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.R0 r02) {
        this.f17862a = r02;
        this.f17863b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17863b.f16967a.J().D(this.f17862a);
    }
}
