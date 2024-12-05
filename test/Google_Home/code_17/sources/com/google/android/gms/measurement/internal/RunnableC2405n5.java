package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2405n5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17740a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17741b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17742c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17743d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2405n5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.R0 r02, String str, String str2) {
        this.f17740a = r02;
        this.f17741b = str;
        this.f17742c = str2;
        this.f17743d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17743d.f16967a.J().F(this.f17740a, this.f17741b, this.f17742c);
    }
}
