package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdhi extends zzdob<zzdhi, zza> implements zzdpm {
    private static volatile zzdpv<zzdhi> zzdv;
    private static final zzdhi zzgvm;
    private int zzgqk;
    private zzdhk zzgvl;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdhi, zza> implements zzdpm {
        private zza() {
            super(zzdhi.zzgvm);
        }

        public final zza u(zzdhk zzdhkVar) {
            p();
            ((zzdhi) this.f14842g).C(zzdhkVar);
            return this;
        }

        public final zza v(int i2) {
            p();
            ((zzdhi) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(gt gtVar) {
            this();
        }
    }

    static {
        zzdhi zzdhiVar = new zzdhi();
        zzgvm = zzdhiVar;
        zzdob.t(zzdhi.class, zzdhiVar);
    }

    private zzdhi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(zzdhk zzdhkVar) {
        zzdhkVar.getClass();
        this.zzgvl = zzdhkVar;
    }

    public static zza E() {
        return (zza) ((zzdob.zza) zzgvm.q(zzdob.zze.f14848e, null, null));
    }

    public static zzdhi G(zzdmr zzdmrVar) throws zzdok {
        return (zzdhi) zzdob.k(zzgvm, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzgqk = i2;
    }

    public final zzdhk D() {
        zzdhk zzdhkVar = this.zzgvl;
        return zzdhkVar == null ? zzdhk.A() : zzdhkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        gt gtVar = null;
        switch (gt.a[i2 - 1]) {
            case 1:
                return new zzdhi();
            case 2:
                return new zza(gtVar);
            case 3:
                return zzdob.r(zzgvm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgqk", "zzgvl"});
            case 4:
                return zzgvm;
            case 5:
                zzdpv<zzdhi> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdhi.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgvm);
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
