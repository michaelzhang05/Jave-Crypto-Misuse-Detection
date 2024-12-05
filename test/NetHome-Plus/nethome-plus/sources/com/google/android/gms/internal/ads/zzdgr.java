package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdgr extends zzdob<zzdgr, zza> implements zzdpm {
    private static volatile zzdpv<zzdgr> zzdv;
    private static final zzdgr zzguc;
    private String zzgtz = HttpUrl.FRAGMENT_ENCODE_SET;
    private zzdmr zzgua = zzdmr.f14805f;
    private int zzgub;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdgr, zza> implements zzdpm {
        private zza() {
            super(zzdgr.zzguc);
        }

        public final zza u(zzb zzbVar) {
            p();
            ((zzdgr) this.f14842g).x(zzbVar);
            return this;
        }

        public final zza v(zzdmr zzdmrVar) {
            p();
            ((zzdgr) this.f14842g).I(zzdmrVar);
            return this;
        }

        public final zza x(String str) {
            p();
            ((zzdgr) this.f14842g).K(str);
            return this;
        }

        /* synthetic */ zza(xs xsVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public enum zzb implements zzdoe {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private static final zzdof<zzb> l = new ys();
        private final int n;

        zzb(int i2) {
            this.n = i2;
        }

        public static zzb d(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.android.gms.internal.ads.zzdoe
        public final int b() {
            if (this != UNRECOGNIZED) {
                return this.n;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        zzdgr zzdgrVar = new zzdgr();
        zzguc = zzdgrVar;
        zzdob.t(zzdgr.class, zzdgrVar);
    }

    private zzdgr() {
    }

    public static zza F() {
        return (zza) ((zzdob.zza) zzguc.q(zzdob.zze.f14848e, null, null));
    }

    public static zzdgr G() {
        return zzguc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(zzdmr zzdmrVar) {
        zzdmrVar.getClass();
        this.zzgua = zzdmrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zzgtz = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(zzb zzbVar) {
        zzbVar.getClass();
        this.zzgub = zzbVar.b();
    }

    public final String C() {
        return this.zzgtz;
    }

    public final zzdmr D() {
        return this.zzgua;
    }

    public final zzb E() {
        zzb d2 = zzb.d(this.zzgub);
        return d2 == null ? zzb.UNRECOGNIZED : d2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        xs xsVar = null;
        switch (xs.a[i2 - 1]) {
            case 1:
                return new zzdgr();
            case 2:
                return new zza(xsVar);
            case 3:
                return zzdob.r(zzguc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzgtz", "zzgua", "zzgub"});
            case 4:
                return zzguc;
            case 5:
                zzdpv<zzdgr> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdgr.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzguc);
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
}
