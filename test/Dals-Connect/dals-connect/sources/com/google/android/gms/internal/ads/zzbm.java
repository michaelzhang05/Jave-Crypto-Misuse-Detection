package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzbm implements zzdoe {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);


    /* renamed from: k, reason: collision with root package name */
    private static final zzdof<zzbm> f13350k = new zzdof<zzbm>() { // from class: com.google.android.gms.internal.ads.xc
    };
    private final int m;

    zzbm(int i2) {
        this.m = i2;
    }

    public static zzdog d() {
        return cd.a;
    }

    public static zzbm f(int i2) {
        if (i2 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i2 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i2 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i2 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i2 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final int b() {
        return this.m;
    }
}
