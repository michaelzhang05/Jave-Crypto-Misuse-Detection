package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdej extends zzdob<zzdej, zza> implements zzdpm {
    private static volatile zzdpv<zzdej> zzdv;
    private static final zzdej zzgri;
    private int zzgqu;
    private zzdel zzgrg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdej, zza> implements zzdpm {
        private zza() {
            super(zzdej.zzgri);
        }

        /* synthetic */ zza(fs fsVar) {
            this();
        }
    }

    static {
        zzdej zzdejVar = new zzdej();
        zzgri = zzdejVar;
        zzdob.t(zzdej.class, zzdejVar);
    }

    private zzdej() {
    }

    public static zzdej y(zzdmr zzdmrVar) throws zzdok {
        return (zzdej) zzdob.k(zzgri, zzdmrVar);
    }

    public final zzdel A() {
        zzdel zzdelVar = this.zzgrg;
        return zzdelVar == null ? zzdel.y() : zzdelVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        fs fsVar = null;
        switch (fs.a[i2 - 1]) {
            case 1:
                return new zzdej();
            case 2:
                return new zza(fsVar);
            case 3:
                return zzdob.r(zzgri, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzgrg", "zzgqu"});
            case 4:
                return zzgri;
            case 5:
                zzdpv<zzdej> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdej.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgri);
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
