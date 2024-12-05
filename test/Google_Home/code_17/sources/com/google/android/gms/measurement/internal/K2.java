package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.y8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class K2 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f17235a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f17236b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f17237c;

    static {
        int[] iArr = new int[V1.d.values().length];
        f17237c = iArr;
        try {
            iArr[V1.d.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17237c[V1.d.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[V1.e.values().length];
        f17236b = iArr2;
        try {
            iArr2[V1.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17236b[V1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17236b[V1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17236b[V1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[y8.values().length];
        f17235a = iArr3;
        try {
            iArr3[y8.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17235a[y8.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f17235a[y8.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f17235a[y8.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
