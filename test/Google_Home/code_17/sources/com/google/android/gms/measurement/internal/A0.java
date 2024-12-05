package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import l0.EnumC3280o;

/* loaded from: classes3.dex */
final class A0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3280o f16938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A0(EnumC3280o enumC3280o) {
        this.f16938a = enumC3280o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A0 a(String str) {
        EnumC3280o enumC3280o;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            enumC3280o = C2472x3.i(str.charAt(0));
        } else {
            enumC3280o = EnumC3280o.UNINITIALIZED;
        }
        return new A0(enumC3280o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC3280o b() {
        return this.f16938a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return String.valueOf(C2472x3.a(this.f16938a));
    }
}
