package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2228r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2228r0 f16791a;

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC2228r0 f16792b;

    static {
        AbstractC2220q0 d8 = new C2146i0().e("").b(false).d(false);
        EnumC2246t0 enumC2246t0 = EnumC2246t0.READ_AND_WRITE;
        f16791a = d8.a(enumC2246t0).c();
        f16792b = new C2146i0().e("").b(false).d(true).a(enumC2246t0).c();
    }

    public abstract InterfaceC2136h0 a();

    public abstract InterfaceC2126g0 b();

    public abstract EnumC2246t0 c();

    public abstract String d();

    public abstract boolean e();

    public abstract boolean f();
}
