package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2119f3;

/* renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC2303z3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f16918a;

    static {
        int[] iArr = new int[C2119f3.b.values().length];
        f16918a = iArr;
        try {
            iArr[C2119f3.b.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f16918a[C2119f3.b.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f16918a[C2119f3.b.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f16918a[C2119f3.b.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f16918a[C2119f3.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
