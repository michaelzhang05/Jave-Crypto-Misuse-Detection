package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.L1;

/* loaded from: classes3.dex */
abstract /* synthetic */ class f6 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17576a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f17577b;

    static {
        int[] iArr = new int[J1.b.values().length];
        f17577b = iArr;
        try {
            iArr[J1.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17577b[J1.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17577b[J1.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17577b[J1.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[L1.b.values().length];
        f17576a = iArr2;
        try {
            iArr2[L1.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17576a[L1.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f17576a[L1.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17576a[L1.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f17576a[L1.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f17576a[L1.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
