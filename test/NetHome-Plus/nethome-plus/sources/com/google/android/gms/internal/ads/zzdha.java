package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdha extends zzdob<zzdha, zza> implements zzdpm {
    private static volatile zzdpv<zzdha> zzdv;
    private static final zzdha zzguz;
    private int zzdj;
    private int zzgux;
    private zzdoj<zzb> zzguy = zzdob.v();

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdha, zza> implements zzdpm {
        private zza() {
            super(zzdha.zzguz);
        }

        /* synthetic */ zza(ct ctVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzgvd;
        private int zzguq;
        private zzdgr zzgva;
        private int zzgvb;
        private int zzgvc;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzgvd);
            }

            /* synthetic */ zza(ct ctVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzgvd = zzbVar;
            zzdob.t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public final zzdgr A() {
            zzdgr zzdgrVar = this.zzgva;
            return zzdgrVar == null ? zzdgr.G() : zzdgrVar;
        }

        public final zzdgu B() {
            zzdgu d2 = zzdgu.d(this.zzgvb);
            return d2 == null ? zzdgu.UNRECOGNIZED : d2;
        }

        public final int C() {
            return this.zzgvc;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            ct ctVar = null;
            switch (ct.a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(ctVar);
                case 3:
                    return zzdob.r(zzgvd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzgva", "zzgvb", "zzgvc", "zzguq"});
                case 4:
                    return zzgvd;
                case 5:
                    zzdpv<zzb> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzb.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzgvd);
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

        public final zzdhm x() {
            zzdhm d2 = zzdhm.d(this.zzguq);
            return d2 == null ? zzdhm.UNRECOGNIZED : d2;
        }

        public final boolean y() {
            return this.zzgva != null;
        }
    }

    static {
        zzdha zzdhaVar = new zzdha();
        zzguz = zzdhaVar;
        zzdob.t(zzdha.class, zzdhaVar);
    }

    private zzdha() {
    }

    public static zzdha C(byte[] bArr) throws zzdok {
        return (zzdha) zzdob.n(zzguz, bArr);
    }

    public final int A() {
        return this.zzguy.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        ct ctVar = null;
        switch (ct.a[i2 - 1]) {
            case 1:
                return new zzdha();
            case 2:
                return new zza(ctVar);
            case 3:
                return zzdob.r(zzguz, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzdj", "zzgux", "zzguy", zzb.class});
            case 4:
                return zzguz;
            case 5:
                zzdpv<zzdha> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdha.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzguz);
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
        return this.zzgux;
    }

    public final List<zzb> y() {
        return this.zzguy;
    }
}
