package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzcc implements zzdoe {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);


    /* renamed from: j, reason: collision with root package name */
    private static final zzdof<zzcc> f13861j = new zzdof<zzcc>() { // from class: com.google.android.gms.internal.ads.sh
    };
    private final int l;

    zzcc(int i2) {
        this.l = i2;
    }

    public static zzdog d() {
        return ei.a;
    }

    public static zzcc f(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PROTO;
        }
        if (i2 == 1) {
            return AFMA_SIGNALS;
        }
        if (i2 == 2) {
            return UNITY_SIGNALS;
        }
        if (i2 != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final int b() {
        return this.l;
    }
}
