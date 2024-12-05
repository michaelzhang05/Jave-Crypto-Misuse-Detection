package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class V2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17371a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ G f17372b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17373c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17374d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.R0 r02, G g8, String str) {
        this.f17371a = r02;
        this.f17372b = g8;
        this.f17373c = str;
        this.f17374d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17374d.f16967a.J().E(this.f17371a, this.f17372b, this.f17373c);
    }
}
