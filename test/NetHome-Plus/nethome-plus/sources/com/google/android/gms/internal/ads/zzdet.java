package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdet extends zzdob<zzdet, zza> implements zzdpm {
    private static volatile zzdpv<zzdet> zzdv;
    private static final zzdet zzgro;
    private int zzgqk;
    private zzdmr zzgqs = zzdmr.f14805f;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdet, zza> implements zzdpm {
        private zza() {
            super(zzdet.zzgro);
        }

        public final zza u(zzdmr zzdmrVar) {
            p();
            ((zzdet) this.f14842g).G(zzdmrVar);
            return this;
        }

        public final zza v(int i2) {
            p();
            ((zzdet) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(hs hsVar) {
            this();
        }
    }

    static {
        zzdet zzdetVar = new zzdet();
        zzgro = zzdetVar;
        zzdob.t(zzdet.class, zzdetVar);
    }

    private zzdet() {
    }

    public static zzdet C(zzdmr zzdmrVar) throws zzdok {
        return (zzdet) zzdob.k(zzgro, zzdmrVar);
    }

    public static zza E() {
        return (zza) ((zzdob.zza) zzgro.q(zzdob.zze.f14848e, null, null));
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

    public final zzdmr D() {
        return this.zzgqs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        hs hsVar = null;
        switch (hs.a[i2 - 1]) {
            case 1:
                return new zzdet();
            case 2:
                return new zza(hsVar);
            case 3:
                return zzdob.r(zzgro, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzgqk", "zzgqs"});
            case 4:
                return zzgro;
            case 5:
                zzdpv<zzdet> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdet.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgro);
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
