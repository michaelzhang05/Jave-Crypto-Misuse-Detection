package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdev extends zzdob<zzdev, zza> implements zzdpm {
    private static volatile zzdpv<zzdev> zzdv;
    private static final zzdev zzgrp;
    private int zzgqu;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdev, zza> implements zzdpm {
        private zza() {
            super(zzdev.zzgrp);
        }

        /* synthetic */ zza(is isVar) {
            this();
        }
    }

    static {
        zzdev zzdevVar = new zzdev();
        zzgrp = zzdevVar;
        zzdob.t(zzdev.class, zzdevVar);
    }

    private zzdev() {
    }

    public static zzdev y(zzdmr zzdmrVar) throws zzdok {
        return (zzdev) zzdob.k(zzgrp, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        is isVar = null;
        switch (is.a[i2 - 1]) {
            case 1:
                return new zzdev();
            case 2:
                return new zza(isVar);
            case 3:
                return zzdob.r(zzgrp, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzgqu"});
            case 4:
                return zzgrp;
            case 5:
                zzdpv<zzdev> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdev.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgrp);
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

    public final int x() {
        return this.zzgqu;
    }
}
