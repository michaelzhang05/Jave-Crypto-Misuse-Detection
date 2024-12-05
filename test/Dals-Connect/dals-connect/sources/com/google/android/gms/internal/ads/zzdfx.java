package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdfx extends zzdob<zzdfx, zza> implements zzdpm {
    private static volatile zzdpv<zzdfx> zzdv;
    private static final zzdfx zzgsz;
    private int zzgqk;
    private zzdmr zzgsh;
    private zzdmr zzgsi;
    private zzdft zzgsr;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdfx, zza> implements zzdpm {
        private zza() {
            super(zzdfx.zzgsz);
        }

        public final zza u(zzdmr zzdmrVar) {
            p();
            ((zzdfx) this.f14842g).K(zzdmrVar);
            return this;
        }

        public final zza v(zzdmr zzdmrVar) {
            p();
            ((zzdfx) this.f14842g).L(zzdmrVar);
            return this;
        }

        public final zza x(zzdft zzdftVar) {
            p();
            ((zzdfx) this.f14842g).M(zzdftVar);
            return this;
        }

        public final zza y(int i2) {
            p();
            ((zzdfx) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(ps psVar) {
            this();
        }
    }

    static {
        zzdfx zzdfxVar = new zzdfx();
        zzgsz = zzdfxVar;
        zzdob.t(zzdfx.class, zzdfxVar);
    }

    private zzdfx() {
        zzdmr zzdmrVar = zzdmr.f14805f;
        this.zzgsh = zzdmrVar;
        this.zzgsi = zzdmrVar;
    }

    public static zza G() {
        return (zza) ((zzdob.zza) zzgsz.q(zzdob.zze.f14848e, null, null));
    }

    public static zzdfx H() {
        return zzgsz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgsh = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgsi = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(zzdft zzdftVar) {
        zzdftVar.getClass();
        this.zzgsr = zzdftVar;
    }

    public static zzdfx O(zzdmr zzdmrVar) throws zzdok {
        return (zzdfx) zzdob.k(zzgsz, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzgqk = i2;
    }

    public final zzdmr D() {
        return this.zzgsh;
    }

    public final zzdmr E() {
        return this.zzgsi;
    }

    public final zzdft F() {
        zzdft zzdftVar = this.zzgsr;
        return zzdftVar == null ? zzdft.B() : zzdftVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        ps psVar = null;
        switch (ps.a[i2 - 1]) {
            case 1:
                return new zzdfx();
            case 2:
                return new zza(psVar);
            case 3:
                return zzdob.r(zzgsz, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzgqk", "zzgsr", "zzgsh", "zzgsi"});
            case 4:
                return zzgsz;
            case 5:
                zzdpv<zzdfx> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdfx.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgsz);
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
