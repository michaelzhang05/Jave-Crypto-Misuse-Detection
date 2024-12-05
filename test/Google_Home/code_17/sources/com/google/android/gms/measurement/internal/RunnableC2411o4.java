package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2411o4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17747a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17748b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17749c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f17750d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17751e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2411o4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.R0 r02, String str, String str2, boolean z8) {
        this.f17747a = r02;
        this.f17748b = str;
        this.f17749c = str2;
        this.f17750d = z8;
        this.f17751e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17751e.f16967a.J().G(this.f17747a, this.f17748b, this.f17749c, this.f17750d);
    }
}
