package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzbw implements zzdoe {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3);


    /* renamed from: j, reason: collision with root package name */
    private static final zzdof<zzbw> f13589j = new zzdof<zzbw>() { // from class: com.google.android.gms.internal.ads.mf
    };
    private final int l;

    zzbw(int i2) {
        this.l = i2;
    }

    public static zzdog d() {
        return rf.a;
    }

    public static zzbw f(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i2 == 1) {
            return BITSLICER;
        }
        if (i2 == 2) {
            return TINK_HYBRID;
        }
        if (i2 != 3) {
            return null;
        }
        return UNENCRYPTED;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final int b() {
        return this.l;
    }
}
