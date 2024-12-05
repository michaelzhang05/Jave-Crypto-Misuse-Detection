package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzddr extends zzdob<zzddr, zza> implements zzdpm {
    private static volatile zzdpv<zzddr> zzdv;
    private static final zzddr zzgqn;
    private int zzgqk;
    private zzdeb zzgql;
    private zzdgl zzgqm;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzddr, zza> implements zzdpm {
        private zza() {
            super(zzddr.zzgqn);
        }

        public final zza u(zzdeb zzdebVar) {
            p();
            ((zzddr) this.f14842g).D(zzdebVar);
            return this;
        }

        public final zza v(zzdgl zzdglVar) {
            p();
            ((zzddr) this.f14842g).E(zzdglVar);
            return this;
        }

        public final zza x(int i2) {
            p();
            ((zzddr) this.f14842g).y(i2);
            return this;
        }

        /* synthetic */ zza(zr zrVar) {
            this();
        }
    }

    static {
        zzddr zzddrVar = new zzddr();
        zzgqn = zzddrVar;
        zzdob.t(zzddr.class, zzddrVar);
    }

    private zzddr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(zzdeb zzdebVar) {
        zzdebVar.getClass();
        this.zzgql = zzdebVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(zzdgl zzdglVar) {
        zzdglVar.getClass();
        this.zzgqm = zzdglVar;
    }

    public static zza H() {
        return (zza) ((zzdob.zza) zzgqn.q(zzdob.zze.f14848e, null, null));
    }

    public static zzddr K(zzdmr zzdmrVar) throws zzdok {
        return (zzddr) zzdob.k(zzgqn, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzgqk = i2;
    }

    public final zzdeb F() {
        zzdeb zzdebVar = this.zzgql;
        return zzdebVar == null ? zzdeb.H() : zzdebVar;
    }

    public final zzdgl G() {
        zzdgl zzdglVar = this.zzgqm;
        return zzdglVar == null ? zzdgl.G() : zzdglVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        zr zrVar = null;
        switch (zr.a[i2 - 1]) {
            case 1:
                return new zzddr();
            case 2:
                return new zza(zrVar);
            case 3:
                return zzdob.r(zzgqn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzgqk", "zzgql", "zzgqm"});
            case 4:
                return zzgqn;
            case 5:
                zzdpv<zzddr> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzddr.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgqn);
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
