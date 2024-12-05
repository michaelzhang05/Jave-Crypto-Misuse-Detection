package com.google.android.gms.measurement.internal;

import l0.EnumC3280o;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC2468x {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17890a;

    static {
        int[] iArr = new int[EnumC3280o.values().length];
        f17890a = iArr;
        try {
            iArr[EnumC3280o.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17890a[EnumC3280o.POLICY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17890a[EnumC3280o.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17890a[EnumC3280o.GRANTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
