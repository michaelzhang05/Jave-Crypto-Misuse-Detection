package com.stripe.android.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.stripe.android.view.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2666u {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2666u f29023a = new EnumC2666u("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2666u f29024b = new EnumC2666u("PostalCode", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2666u f29025c = new EnumC2666u("Full", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2666u[] f29026d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f29027e;

    static {
        EnumC2666u[] a8 = a();
        f29026d = a8;
        f29027e = U5.b.a(a8);
    }

    private EnumC2666u(String str, int i8) {
    }

    private static final /* synthetic */ EnumC2666u[] a() {
        return new EnumC2666u[]{f29023a, f29024b, f29025c};
    }

    public static EnumC2666u valueOf(String str) {
        return (EnumC2666u) Enum.valueOf(EnumC2666u.class, str);
    }

    public static EnumC2666u[] values() {
        return (EnumC2666u[]) f29026d.clone();
    }
}
