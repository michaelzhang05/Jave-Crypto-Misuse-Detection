package com.google.android.gms.measurement.internal;

import l0.EnumC3280o;

/* loaded from: classes3.dex */
abstract /* synthetic */ class Q5 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17296a;

    static {
        int[] iArr = new int[EnumC3280o.values().length];
        f17296a = iArr;
        try {
            iArr[EnumC3280o.POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17296a[EnumC3280o.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17296a[EnumC3280o.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17296a[EnumC3280o.UNINITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
