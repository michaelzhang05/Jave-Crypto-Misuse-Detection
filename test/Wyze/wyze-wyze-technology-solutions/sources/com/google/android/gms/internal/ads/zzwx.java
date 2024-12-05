package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzwx implements zzdoe {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* renamed from: i, reason: collision with root package name */
    private static final zzdof<zzwx> f15740i = new zzdof<zzwx>() { // from class: com.google.android.gms.internal.ads.n50
    };

    /* renamed from: k, reason: collision with root package name */
    private final int f15742k;

    zzwx(int i2) {
        this.f15742k = i2;
    }

    public static zzdog d() {
        return o50.a;
    }

    public static zzwx f(int i2) {
        if (i2 == 0) {
            return ENUM_FALSE;
        }
        if (i2 == 1) {
            return ENUM_TRUE;
        }
        if (i2 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final int b() {
        return this.f15742k;
    }
}
