package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdig extends zzdob<zzdig, zza> implements zzdpm {
    private static volatile zzdpv<zzdig> zzdv;
    private static final zzdig zzgwz;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f14805f;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdig, zza> implements zzdpm {
        private zza() {
            super(zzdig.zzgwz);
        }

        public final zza u(zzdmr zzdmrVar) {
            p();
            ((zzdig) this.f14842g).G(zzdmrVar);
            return this;
        }

        public final zza v(int i2) {
            p();
            ((zzdig) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(kt ktVar) {
            this();
        }
    }

    static {
        zzdig zzdigVar = new zzdig();
        zzgwz = zzdigVar;
        zzdob.t(zzdig.class, zzdigVar);
    }

    private zzdig() {
    }

    public static zza D() {
        return (zza) ((zzdob.zza) zzgwz.q(zzdob.zze.f14848e, null, null));
    }

    public static zzdig F(zzdmr zzdmrVar) throws zzdok {
        return (zzdig) zzdob.k(zzgwz, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzgqk = i2;
    }

    public final zzdmr C() {
        return this.zzgqs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        kt ktVar = null;
        switch (kt.a[i2 - 1]) {
            case 1:
                return new zzdig();
            case 2:
                return new zza(ktVar);
            case 3:
                return zzdob.r(zzgwz, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgwz;
            case 5:
                zzdpv<zzdig> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdig.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgwz);
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
        return this.zzgqk;
    }
}
