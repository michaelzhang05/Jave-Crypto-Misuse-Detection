package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class tr {
    static final /* synthetic */ int[] a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f12204b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f12205c;

    static {
        int[] iArr = new int[zzdfd.values().length];
        f12205c = iArr;
        try {
            iArr[zzdfd.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12205c[zzdfd.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12205c[zzdfd.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzdgf.values().length];
        f12204b = iArr2;
        try {
            iArr2[zzdgf.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12204b[zzdgf.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12204b[zzdgf.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzdgj.values().length];
        a = iArr3;
        try {
            iArr3[zzdgj.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[zzdgj.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[zzdgj.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
