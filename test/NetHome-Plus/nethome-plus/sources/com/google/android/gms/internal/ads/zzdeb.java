package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdeb extends zzdob<zzdeb, zza> implements zzdpm {
    private static volatile zzdpv<zzdeb> zzdv;
    private static final zzdeb zzgrc;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f14805f;
    private zzdef zzgrb;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdeb, zza> implements zzdpm {
        private zza() {
            super(zzdeb.zzgrc);
        }

        public final zza u(zzdmr zzdmrVar) {
            p();
            ((zzdeb) this.f14842g).L(zzdmrVar);
            return this;
        }

        public final zza v(zzdef zzdefVar) {
            p();
            ((zzdeb) this.f14842g).K(zzdefVar);
            return this;
        }

        public final zza x(int i2) {
            p();
            ((zzdeb) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(bs bsVar) {
            this();
        }
    }

    static {
        zzdeb zzdebVar = new zzdeb();
        zzgrc = zzdebVar;
        zzdob.t(zzdeb.class, zzdebVar);
    }

    private zzdeb() {
    }

    public static zzdeb D(zzdmr zzdmrVar) throws zzdok {
        return (zzdeb) zzdob.k(zzgrc, zzdmrVar);
    }

    public static zza G() {
        return (zza) ((zzdob.zza) zzgrc.q(zzdob.zze.f14848e, null, null));
    }

    public static zzdeb H() {
        return zzgrc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(zzdef zzdefVar) {
        zzdefVar.getClass();
        this.zzgrb = zzdefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgqs = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzgqk = i2;
    }

    public final zzdmr E() {
        return this.zzgqs;
    }

    public final zzdef F() {
        zzdef zzdefVar = this.zzgrb;
        return zzdefVar == null ? zzdef.y() : zzdefVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        bs bsVar = null;
        switch (bs.a[i2 - 1]) {
            case 1:
                return new zzdeb();
            case 2:
                return new zza(bsVar);
            case 3:
                return zzdob.r(zzgrc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgrb", "zzgqs"});
            case 4:
                return zzgrc;
            case 5:
                zzdpv<zzdeb> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdeb.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgrc);
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
