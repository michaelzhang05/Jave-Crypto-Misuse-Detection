package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2114e8 implements InterfaceC2084b8 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16622a;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        e8.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f16622a = e8.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e8.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2084b8
    public final boolean w() {
        return ((Boolean) f16622a.e()).booleanValue();
    }
}
