package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzdgj implements zzdoe {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private static final zzdof<zzdgj> f14725k = new zzdof<zzdgj>() { // from class: com.google.android.gms.internal.ads.ts
    };
    private final int m;

    zzdgj(int i2) {
        this.m = i2;
    }

    public static zzdgj d(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
