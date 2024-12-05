package com.stripe.android.view;

import m2.AbstractC3407E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.stripe.android.view.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2661q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2661q0 f28959b = new EnumC2661q0("ShippingInfo", 0, AbstractC3407E.f34821I0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2661q0 f28960c = new EnumC2661q0("ShippingMethod", 1, AbstractC3407E.f34825K0);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2661q0[] f28961d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f28962e;

    /* renamed from: a, reason: collision with root package name */
    private final int f28963a;

    static {
        EnumC2661q0[] a8 = a();
        f28961d = a8;
        f28962e = U5.b.a(a8);
    }

    private EnumC2661q0(String str, int i8, int i9) {
        this.f28963a = i9;
    }

    private static final /* synthetic */ EnumC2661q0[] a() {
        return new EnumC2661q0[]{f28959b, f28960c};
    }

    public static EnumC2661q0 valueOf(String str) {
        return (EnumC2661q0) Enum.valueOf(EnumC2661q0.class, str);
    }

    public static EnumC2661q0[] values() {
        return (EnumC2661q0[]) f28961d.clone();
    }

    public final int b() {
        return this.f28963a;
    }
}
