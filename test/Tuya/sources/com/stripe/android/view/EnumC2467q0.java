package com.stripe.android.view;

import j2.AbstractC3053E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.stripe.android.view.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2467q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2467q0 f27904b = new EnumC2467q0("ShippingInfo", 0, AbstractC3053E.f32845I0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2467q0 f27905c = new EnumC2467q0("ShippingMethod", 1, AbstractC3053E.f32849K0);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2467q0[] f27906d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f27907e;

    /* renamed from: a, reason: collision with root package name */
    private final int f27908a;

    static {
        EnumC2467q0[] a8 = a();
        f27906d = a8;
        f27907e = R5.b.a(a8);
    }

    private EnumC2467q0(String str, int i8, int i9) {
        this.f27908a = i9;
    }

    private static final /* synthetic */ EnumC2467q0[] a() {
        return new EnumC2467q0[]{f27904b, f27905c};
    }

    public static EnumC2467q0 valueOf(String str) {
        return (EnumC2467q0) Enum.valueOf(EnumC2467q0.class, str);
    }

    public static EnumC2467q0[] values() {
        return (EnumC2467q0[]) f27906d.clone();
    }

    public final int b() {
        return this.f27908a;
    }
}
