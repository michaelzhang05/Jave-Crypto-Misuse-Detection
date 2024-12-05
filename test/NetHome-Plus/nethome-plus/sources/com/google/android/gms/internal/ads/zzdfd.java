package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzdfd implements zzdoe {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private static final zzdof<zzdfd> f14713k = new zzdof<zzdfd>() { // from class: com.google.android.gms.internal.ads.ks
    };
    private final int m;

    zzdfd(int i2) {
        this.m = i2;
    }

    public static zzdfd d(int i2) {
        if (i2 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i2 == 1) {
            return UNCOMPRESSED;
        }
        if (i2 == 2) {
            return COMPRESSED;
        }
        if (i2 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
