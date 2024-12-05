package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2244s7 implements InterfaceC2218p7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16834a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16835b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.dma_consent.client", true);
        e8.d("measurement.dma_consent.client_bow_check2", true);
        e8.d("measurement.dma_consent.separate_service_calls_fix", true);
        e8.d("measurement.dma_consent.service", true);
        f16834a = e8.d("measurement.dma_consent.service_database_update_fix", true);
        e8.d("measurement.dma_consent.service_dcu_event", true);
        f16835b = e8.d("measurement.dma_consent.service_dcu_event2", true);
        e8.d("measurement.dma_consent.service_npa_remote_default", true);
        e8.d("measurement.dma_consent.service_split_batch_on_consent", true);
        e8.d("measurement.dma_consent.set_consent_inline_on_worker", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2218p7
    public final boolean w() {
        return ((Boolean) f16834a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2218p7
    public final boolean x() {
        return ((Boolean) f16835b.e()).booleanValue();
    }
}
