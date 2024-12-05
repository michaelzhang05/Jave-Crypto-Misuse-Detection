package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdgy extends zzdob<zzdgy, zza> implements zzdpm {
    private static volatile zzdpv<zzdgy> zzdv;
    private static final zzdgy zzguw;
    private int zzgut;
    private boolean zzguu;
    private String zzgus = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgtz = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzguv = HttpUrl.FRAGMENT_ENCODE_SET;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdgy, zza> implements zzdpm {
        private zza() {
            super(zzdgy.zzguw);
        }

        public final zza A(String str) {
            p();
            ((zzdgy) this.f14842g).P(str);
            return this;
        }

        public final zza u(boolean z) {
            p();
            ((zzdgy) this.f14842g).K(true);
            return this;
        }

        public final zza v(int i2) {
            p();
            ((zzdgy) this.f14842g).M(0);
            return this;
        }

        public final zza x(String str) {
            p();
            ((zzdgy) this.f14842g).O(str);
            return this;
        }

        public final zza y(String str) {
            p();
            ((zzdgy) this.f14842g).N(str);
            return this;
        }

        /* synthetic */ zza(bt btVar) {
            this();
        }
    }

    static {
        zzdgy zzdgyVar = new zzdgy();
        zzguw = zzdgyVar;
        zzdob.t(zzdgy.class, zzdgyVar);
    }

    private zzdgy() {
    }

    public static zza G() {
        return (zza) ((zzdob.zza) zzguw.q(zzdob.zze.f14848e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(boolean z) {
        this.zzguu = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i2) {
        this.zzgut = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(String str) {
        str.getClass();
        this.zzgtz = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(String str) {
        str.getClass();
        this.zzgus = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(String str) {
        str.getClass();
        this.zzguv = str;
    }

    public final String B() {
        return this.zzgtz;
    }

    public final String C() {
        return this.zzgus;
    }

    public final int D() {
        return this.zzgut;
    }

    public final boolean E() {
        return this.zzguu;
    }

    public final String F() {
        return this.zzguv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        bt btVar = null;
        switch (bt.a[i2 - 1]) {
            case 1:
                return new zzdgy();
            case 2:
                return new zza(btVar);
            case 3:
                return zzdob.r(zzguw, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzgus", "zzgtz", "zzgut", "zzguu", "zzguv"});
            case 4:
                return zzguw;
            case 5:
                zzdpv<zzdgy> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdgy.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzguw);
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
