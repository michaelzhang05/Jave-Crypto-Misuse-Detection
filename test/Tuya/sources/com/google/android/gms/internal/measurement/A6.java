package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class A6 implements InterfaceC2154z6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15250a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15251b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15252c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15253d;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15250a = a8.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f15251b = a8.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f15252c = a8.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f15253d = a8.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2154z6
    public final boolean a() {
        return ((Boolean) f15252c.b()).booleanValue();
    }
}
