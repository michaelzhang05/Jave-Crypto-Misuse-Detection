package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
public final class zzdhe extends zzdob<zzdhe, zza> implements zzdpm {
    private static volatile zzdpv<zzdhe> zzdv;
    private static final zzdhe zzgvi;
    private int zzgqk;
    private zzdhg zzgvh;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdhe, zza> implements zzdpm {
        private zza() {
            super(zzdhe.zzgvi);
        }

        public final zza u(zzdhg zzdhgVar) {
            p();
            ((zzdhe) this.f14842g).C(zzdhgVar);
            return this;
        }

        public final zza v(int i2) {
            p();
            ((zzdhe) this.f14842g).y(0);
            return this;
        }

        /* synthetic */ zza(et etVar) {
            this();
        }
    }

    static {
        zzdhe zzdheVar = new zzdhe();
        zzgvi = zzdheVar;
        zzdob.t(zzdhe.class, zzdheVar);
    }

    private zzdhe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(zzdhg zzdhgVar) {
        zzdhgVar.getClass();
        this.zzgvh = zzdhgVar;
    }

    public static zza E() {
        return (zza) ((zzdob.zza) zzgvi.q(zzdob.zze.f14848e, null, null));
    }

    public static zzdhe G(zzdmr zzdmrVar) throws zzdok {
        return (zzdhe) zzdob.k(zzgvi, zzdmrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i2) {
        this.zzgqk = i2;
    }

    public final zzdhg D() {
        zzdhg zzdhgVar = this.zzgvh;
        return zzdhgVar == null ? zzdhg.y() : zzdhgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        et etVar = null;
        switch (et.a[i2 - 1]) {
            case 1:
                return new zzdhe();
            case 2:
                return new zza(etVar);
            case 3:
                return zzdob.r(zzgvi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzgqk", "zzgvh"});
            case 4:
                return zzgvi;
            case 5:
                zzdpv<zzdhe> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdhe.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgvi);
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
