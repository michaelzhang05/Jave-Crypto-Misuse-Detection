package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdgl extends zzdob<zzdgl, zza> implements zzdpm {
    private static volatile zzdpv<zzdgl> zzdv;
    private static final zzdgl zzgtu;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f14805f;
    private zzdgp zzgtt;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdgl, zza> implements zzdpm {
        private zza() {
            super(zzdgl.zzgtu);
        }

        public final zza u(zzdmr zzdmrVar) {
            p();
            ((zzdgl) this.f14842g).L(zzdmrVar);
            return this;
        }

        public final zza v(zzdgp zzdgpVar) {
            p();
            ((zzdgl) this.f14842g).I(zzdgpVar);
            return this;
        }

        public final zza x(int i2) {
            p();
            ((zzdgl) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(us usVar) {
            this();
        }
    }

    static {
        zzdgl zzdglVar = new zzdgl();
        zzgtu = zzdglVar;
        zzdob.t(zzdgl.class, zzdglVar);
    }

    private zzdgl() {
    }

    public static zza F() {
        return (zza) ((zzdob.zza) zzgtu.q(zzdob.zze.f14848e, null, null));
    }

    public static zzdgl G() {
        return zzgtu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(zzdgp zzdgpVar) {
        zzdgpVar.getClass();
        this.zzgtt = zzdgpVar;
    }

    public static zzdgl K(zzdmr zzdmrVar) throws zzdok {
        return (zzdgl) zzdob.k(zzgtu, zzdmrVar);
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

    public final zzdmr D() {
        return this.zzgqs;
    }

    public final zzdgp E() {
        zzdgp zzdgpVar = this.zzgtt;
        return zzdgpVar == null ? zzdgp.A() : zzdgpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        us usVar = null;
        switch (us.a[i2 - 1]) {
            case 1:
                return new zzdgl();
            case 2:
                return new zza(usVar);
            case 3:
                return zzdob.r(zzgtu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzgqk", "zzgtt", "zzgqs"});
            case 4:
                return zzgtu;
            case 5:
                zzdpv<zzdgl> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdgl.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgtu);
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
