package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdap;
import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdau extends zzdob<zzdau, zza> implements zzdpm {
    private static volatile zzdpv<zzdau> zzdv;
    private static final zzdau zzgoq;
    private int zzdj;
    private int zzgon;
    private zzdap zzgop;
    private String zzdk = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgoo = HttpUrl.FRAGMENT_ENCODE_SET;

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob.zza<zzdau, zza> implements zzdpm {
        private zza() {
            super(zzdau.zzgoq);
        }

        public final zza u(zzdap.zzb zzbVar) {
            p();
            ((zzdau) this.f14842g).x(zzbVar);
            return this;
        }

        public final zza v(zzb zzbVar) {
            p();
            ((zzdau) this.f14842g).y(zzbVar);
            return this;
        }

        public final zza x(String str) {
            p();
            ((zzdau) this.f14842g).F(str);
            return this;
        }

        /* synthetic */ zza(xq xqVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public enum zzb implements zzdoe {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);


        /* renamed from: h, reason: collision with root package name */
        private static final zzdof<zzb> f14669h = new yq();

        /* renamed from: j, reason: collision with root package name */
        private final int f14671j;

        zzb(int i2) {
            this.f14671j = i2;
        }

        public static zzdog d() {
            return zq.a;
        }

        public static zzb f(int i2) {
            if (i2 == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i2 != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        @Override // com.google.android.gms.internal.ads.zzdoe
        public final int b() {
            return this.f14671j;
        }
    }

    static {
        zzdau zzdauVar = new zzdau();
        zzgoq = zzdauVar;
        zzdob.t(zzdau.class, zzdauVar);
    }

    private zzdau() {
    }

    public static zza D() {
        return (zza) ((zzdob.zza) zzgoq.q(zzdob.zze.f14848e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str) {
        str.getClass();
        this.zzdj |= 2;
        this.zzdk = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(zzdap.zzb zzbVar) {
        this.zzgop = (zzdap) ((zzdob) zzbVar.J());
        this.zzdj |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(zzb zzbVar) {
        zzbVar.getClass();
        this.zzdj |= 1;
        this.zzgon = zzbVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        xq xqVar = null;
        switch (xq.a[i2 - 1]) {
            case 1:
                return new zzdau();
            case 2:
                return new zza(xqVar);
            case 3:
                return zzdob.r(zzgoq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{"zzdj", "zzgon", zzb.d(), "zzdk", "zzgoo", "zzgop"});
            case 4:
                return zzgoq;
            case 5:
                zzdpv<zzdau> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdau.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgoq);
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
