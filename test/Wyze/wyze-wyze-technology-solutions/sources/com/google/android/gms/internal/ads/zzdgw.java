package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdgw extends zzdob<zzdgw, zza> implements zzdpm {
    private static volatile zzdpv<zzdgw> zzdv;
    private static final zzdgw zzgur;
    private String zzgtz = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdmr zzgua = zzdmr.f14805f;
    private int zzguq;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdgw, zza> implements zzdpm {
        private zza() {
            super(zzdgw.zzgur);
        }

        /* synthetic */ zza(at atVar) {
            this();
        }
    }

    static {
        zzdgw zzdgwVar = new zzdgw();
        zzgur = zzdgwVar;
        zzdob.t(zzdgw.class, zzdgwVar);
    }

    private zzdgw() {
    }

    public static zzdgw A() {
        return zzgur;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        at atVar = null;
        switch (at.a[i2 - 1]) {
            case 1:
                return new zzdgw();
            case 2:
                return new zza(atVar);
            case 3:
                return zzdob.r(zzgur, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgtz", "zzgua", "zzguq"});
            case 4:
                return zzgur;
            case 5:
                zzdpv<zzdgw> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdgw.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgur);
                            zzdv = zzdpvVar;
                        }
                    }
                }
                return zzdpvVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String x() {
        return this.zzgtz;
    }

    public final zzdmr y() {
        return this.zzgua;
    }
}
