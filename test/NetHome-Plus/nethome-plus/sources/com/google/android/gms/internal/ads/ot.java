package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class ot {
    static final /* synthetic */ int[] a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f11951b;

    static {
        int[] iArr = new int[zzdkt.values().length];
        f11951b = iArr;
        try {
            iArr[zzdkt.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11951b[zzdkt.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11951b[zzdkt.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzdkv.values().length];
        a = iArr2;
        try {
            iArr2[zzdkv.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[zzdkv.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[zzdkv.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
