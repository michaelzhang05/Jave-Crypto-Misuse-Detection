package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdeh extends zzdob<zzdeh, zza> implements zzdpm {
    private static volatile zzdpv<zzdeh> zzdv;
    private static final zzdeh zzgrh;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f14805f;
    private zzdel zzgrg;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdeh, zza> implements zzdpm {
        private zza() {
            super(zzdeh.zzgrh);
        }

        public final zza u(zzdmr zzdmrVar) {
            p();
            ((zzdeh) this.f14842g).K(zzdmrVar);
            return this;
        }

        public final zza v(zzdel zzdelVar) {
            p();
            ((zzdeh) this.f14842g).D(zzdelVar);
            return this;
        }

        public final zza x(int i2) {
            p();
            ((zzdeh) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(es esVar) {
            this();
        }
    }

    static {
        zzdeh zzdehVar = new zzdeh();
        zzgrh = zzdehVar;
        zzdob.t(zzdeh.class, zzdehVar);
    }

    private zzdeh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(zzdel zzdelVar) {
        zzdelVar.getClass();
        this.zzgrg = zzdelVar;
    }

    public static zzdeh E(zzdmr zzdmrVar) throws zzdok {
        return (zzdeh) zzdob.k(zzgrh, zzdmrVar);
    }

    public static zza H() {
        return (zza) ((zzdob.zza) zzgrh.q(zzdob.zze.f14848e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzgqk = i2;
    }

    public final zzdmr F() {
        return this.zzgqs;
    }

    public final zzdel G() {
        zzdel zzdelVar = this.zzgrg;
        return zzdelVar == null ? zzdel.y() : zzdelVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        es esVar = null;
        switch (es.a[i2 - 1]) {
            case 1:
                return new zzdeh();
            case 2:
                return new zza(esVar);
            case 3:
                return zzdob.r(zzgrh, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgrg", "zzgqs"});
            case 4:
                return zzgrh;
            case 5:
                zzdpv<zzdeh> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdeh.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgrh);
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
