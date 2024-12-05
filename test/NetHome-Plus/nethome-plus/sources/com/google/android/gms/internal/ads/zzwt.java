package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzdob;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzwt {

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob<zza, zzb> implements zzdpm {
        private static final zza zzbzk;
        private static volatile zzdpv<zza> zzdv;
        private int zzbzi;
        private zzl zzbzj;
        private int zzdj;

        /* renamed from: com.google.android.gms.internal.ads.zzwt$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0184zza implements zzdoe {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            private static final zzdof<EnumC0184zza> q = new l50();
            private final int s;

            EnumC0184zza(int i2) {
                this.s = i2;
            }

            public static zzdog d() {
                return m50.a;
            }

            public static EnumC0184zza f(int i2) {
                switch (i2) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.s;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzb extends zzdob.zza<zza, zzb> implements zzdpm {
            private zzb() {
                super(zza.zzbzk);
            }

            /* synthetic */ zzb(k50 k50Var) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzbzk = zzaVar;
            zzdob.t(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(k50Var);
                case 3:
                    return zzdob.r(zzbzk, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzbzi", EnumC0184zza.d(), "zzbzj"});
                case 4:
                    return zzbzk;
                case 5:
                    zzdpv<zza> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zza.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzbzk);
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

    /* loaded from: classes2.dex */
    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static final zzb zzcaa;
        private static volatile zzdpv<zzb> zzdv;
        private String zzbzx = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoj<zza> zzbzy = zzdob.v();
        private int zzbzz;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzcaa);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzcaa = zzbVar;
            zzdob.t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcaa, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"zzdj", "zzbzx", "zzbzy", zza.class, "zzbzz", zzwx.d()});
                case 4:
                    return zzcaa;
                case 5:
                    zzdpv<zzb> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzb.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcaa);
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

    /* loaded from: classes2.dex */
    public static final class zzc extends zzdob<zzc, zza> implements zzdpm {
        private static final zzc zzcah;
        private static volatile zzdpv<zzc> zzdv;
        private int zzcab;
        private zzn zzcac;
        private zzn zzcad;
        private zzn zzcae;
        private zzdoj<zzn> zzcaf = zzdob.v();
        private int zzcag;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
            private zza() {
                super(zzc.zzcah);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzcah = zzcVar;
            zzdob.t(zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcah, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"zzdj", "zzcab", "zzcac", "zzcad", "zzcae", "zzcaf", zzn.class, "zzcag"});
                case 4:
                    return zzcah;
                case 5:
                    zzdpv<zzc> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzc.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcah);
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

    /* loaded from: classes2.dex */
    public static final class zzd extends zzdob<zzd, zza> implements zzdpm {
        private static final zzd zzcaq;
        private static volatile zzdpv<zzd> zzdv;
        private int zzcan;
        private zzn zzcap;
        private int zzdj;
        private String zzcam = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoh zzcao = zzdob.u();

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzd, zza> implements zzdpm {
            private zza() {
                super(zzd.zzcaq);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzcaq = zzdVar;
            zzdob.t(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcaq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", new Object[]{"zzdj", "zzcam", "zzcan", zzwx.d(), "zzcao", "zzcap"});
                case 4:
                    return zzcaq;
                case 5:
                    zzdpv<zzd> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzd.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcaq);
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

    /* loaded from: classes2.dex */
    public static final class zze extends zzdob<zze, zza> implements zzdpm {
        private static final zze zzcas;
        private static volatile zzdpv<zze> zzdv;
        private zzdoh zzcao = zzdob.u();
        private int zzcar;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zze, zza> implements zzdpm {
            private zza() {
                super(zze.zzcas);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzcas = zzeVar;
            zzdob.t(zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcas, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzdj", "zzcar", zzwx.d(), "zzcao"});
                case 4:
                    return zzcas;
                case 5:
                    zzdpv<zze> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zze.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcas);
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

    /* loaded from: classes2.dex */
    public static final class zzf extends zzdob<zzf, zza> implements zzdpm {
        private static final zzf zzcav;
        private static volatile zzdpv<zzf> zzdv;
        private zzn zzcap;
        private int zzcar;
        private zzd zzcat;
        private zzdoj<zzm> zzcau = zzdob.v();
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzf, zza> implements zzdpm {
            private zza() {
                super(zzf.zzcav);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzcav = zzfVar;
            zzdob.t(zzf.class, zzfVar);
        }

        private zzf() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcav, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", new Object[]{"zzdj", "zzcat", "zzcau", zzm.class, "zzcar", zzwx.d(), "zzcap"});
                case 4:
                    return zzcav;
                case 5:
                    zzdpv<zzf> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzf.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcav);
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

    /* loaded from: classes2.dex */
    public static final class zzg extends zzdob<zzg, zza> implements zzdpm {
        private static final zzg zzcax;
        private static volatile zzdpv<zzg> zzdv;
        private int zzbzi;
        private int zzcaw;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzg, zza> implements zzdpm {
            private zza() {
                super(zzg.zzcax);
            }

            public final zza u(zzb zzbVar) {
                p();
                ((zzg) this.f14842g).x(zzbVar);
                return this;
            }

            public final zza v(zzc zzcVar) {
                p();
                ((zzg) this.f14842g).y(zzcVar);
                return this;
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzdoe {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);


            /* renamed from: j, reason: collision with root package name */
            private static final zzdof<zzb> f15717j = new p50();
            private final int l;

            zzb(int i2) {
                this.l = i2;
            }

            public static zzdog d() {
                return q50.a;
            }

            public static zzb f(int i2) {
                if (i2 == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return TWO_G;
                }
                if (i2 == 2) {
                    return THREE_G;
                }
                if (i2 != 4) {
                    return null;
                }
                return LTE;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.l;
            }
        }

        /* loaded from: classes2.dex */
        public enum zzc implements zzdoe {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);


            /* renamed from: i, reason: collision with root package name */
            private static final zzdof<zzc> f15722i = new r50();

            /* renamed from: k, reason: collision with root package name */
            private final int f15724k;

            zzc(int i2) {
                this.f15724k = i2;
            }

            public static zzdog d() {
                return s50.a;
            }

            public static zzc f(int i2) {
                if (i2 == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CELL;
                }
                if (i2 != 2) {
                    return null;
                }
                return WIFI;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.f15724k;
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzcax = zzgVar;
            zzdob.t(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zza C() {
            return (zza) ((zzdob.zza) zzcax.q(zzdob.zze.f14848e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void x(zzb zzbVar) {
            zzbVar.getClass();
            this.zzdj |= 2;
            this.zzcaw = zzbVar.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void y(zzc zzcVar) {
            zzcVar.getClass();
            this.zzdj |= 1;
            this.zzbzi = zzcVar.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcax, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzdj", "zzbzi", zzc.d(), "zzcaw", zzb.d()});
                case 4:
                    return zzcax;
                case 5:
                    zzdpv<zzg> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzg.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcax);
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

    /* loaded from: classes2.dex */
    public static final class zzh extends zzdob<zzh, zza> implements zzdpm {
        private static final zzh zzcbj;
        private static volatile zzdpv<zzh> zzdv;
        private int zzcbh;
        private zzn zzcbi;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzh, zza> implements zzdpm {
            private zza() {
                super(zzh.zzcbj);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzcbj = zzhVar;
            zzdob.t(zzh.class, zzhVar);
        }

        private zzh() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcbj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzcbh", zzwx.d(), "zzcbi"});
                case 4:
                    return zzcbj;
                case 5:
                    zzdpv<zzh> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzh.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcbj);
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

    /* loaded from: classes2.dex */
    public static final class zzi extends zzdob<zzi, zzb> implements zzdpm {
        private static final zzi zzcbq;
        private static volatile zzdpv<zzi> zzdv;
        private int zzcbl;
        private int zzcbm;
        private long zzcbn;
        private long zzcbp;
        private int zzdj;
        private zzdoj<zza> zzcbk = zzdob.v();
        private String zzdk = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzcbo = HttpUrl.FRAGMENT_ENCODE_SET;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob<zza, C0185zza> implements zzdpm {
            private static final zzdoi<Integer, zza.EnumC0184zza> zzcbw = new t50();
            private static final zza zzcce;
            private static volatile zzdpv<zza> zzdv;
            private long zzcbr;
            private int zzcbs;
            private long zzcbt;
            private long zzcbu;
            private zzdoh zzcbv = zzdob.u();
            private zzg zzcbx;
            private int zzcby;
            private int zzcbz;
            private int zzcca;
            private int zzccb;
            private int zzccc;
            private int zzccd;
            private int zzdj;

            /* renamed from: com.google.android.gms.internal.ads.zzwt$zzi$zza$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0185zza extends zzdob.zza<zza, C0185zza> implements zzdpm {
                private C0185zza() {
                    super(zza.zzcce);
                }

                public final C0185zza A(long j2) {
                    p();
                    ((zza) this.f14842g).x(j2);
                    return this;
                }

                public final C0185zza B(long j2) {
                    p();
                    ((zza) this.f14842g).V(j2);
                    return this;
                }

                public final C0185zza C(long j2) {
                    p();
                    ((zza) this.f14842g).W(j2);
                    return this;
                }

                public final C0185zza E(zzwx zzwxVar) {
                    p();
                    ((zza) this.f14842g).H(zzwxVar);
                    return this;
                }

                public final C0185zza F(zzwx zzwxVar) {
                    p();
                    ((zza) this.f14842g).L(zzwxVar);
                    return this;
                }

                public final C0185zza G(zzwx zzwxVar) {
                    p();
                    ((zza) this.f14842g).P(zzwxVar);
                    return this;
                }

                public final C0185zza H(zzwx zzwxVar) {
                    p();
                    ((zza) this.f14842g).S(zzwxVar);
                    return this;
                }

                public final C0185zza I(zzwx zzwxVar) {
                    p();
                    ((zza) this.f14842g).U(zzwxVar);
                    return this;
                }

                public final C0185zza u(zzg zzgVar) {
                    p();
                    ((zza) this.f14842g).y(zzgVar);
                    return this;
                }

                public final C0185zza v(zzc zzcVar) {
                    p();
                    ((zza) this.f14842g).G(zzcVar);
                    return this;
                }

                public final C0185zza x(Iterable<? extends zza.EnumC0184zza> iterable) {
                    p();
                    ((zza) this.f14842g).M(iterable);
                    return this;
                }

                public final C0185zza y(int i2) {
                    p();
                    ((zza) this.f14842g).Q(i2);
                    return this;
                }

                /* synthetic */ C0185zza(k50 k50Var) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzcce = zzaVar;
                zzdob.t(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void G(zzc zzcVar) {
                zzcVar.getClass();
                this.zzdj |= 1024;
                this.zzccd = zzcVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void H(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 2;
                this.zzcbs = zzwxVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void L(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 32;
                this.zzcby = zzwxVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void M(Iterable<? extends zza.EnumC0184zza> iterable) {
                if (!this.zzcbv.s()) {
                    zzdoh zzdohVar = this.zzcbv;
                    int size = zzdohVar.size();
                    this.zzcbv = zzdohVar.l(size == 0 ? 10 : size << 1);
                }
                Iterator<? extends zza.EnumC0184zza> it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzcbv.F(it.next().b());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void P(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 64;
                this.zzcbz = zzwxVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void Q(int i2) {
                this.zzdj |= 256;
                this.zzccb = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void S(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= 128;
                this.zzcca = zzwxVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void U(zzwx zzwxVar) {
                zzwxVar.getClass();
                this.zzdj |= AdRequest.MAX_CONTENT_URL_LENGTH;
                this.zzccc = zzwxVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void V(long j2) {
                this.zzdj |= 4;
                this.zzcbt = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void W(long j2) {
                this.zzdj |= 8;
                this.zzcbu = j2;
            }

            public static zza X(byte[] bArr) throws zzdok {
                return (zza) zzdob.n(zzcce, bArr);
            }

            public static C0185zza Z() {
                return (C0185zza) ((zzdob.zza) zzcce.q(zzdob.zze.f14848e, null, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void x(long j2) {
                this.zzdj |= 1;
                this.zzcbr = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void y(zzg zzgVar) {
                zzgVar.getClass();
                this.zzcbx = zzgVar;
                this.zzdj |= 16;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                k50 k50Var = null;
                switch (k50.a[i2 - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0185zza(k50Var);
                    case 3:
                        return zzdob.r(zzcce, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u001e\u0006\t\u0004\u0007\f\u0005\b\f\u0006\t\f\u0007\n\u0004\b\u000b\f\t\f\f\n", new Object[]{"zzdj", "zzcbr", "zzcbs", zzwx.d(), "zzcbt", "zzcbu", "zzcbv", zza.EnumC0184zza.d(), "zzcbx", "zzcby", zzwx.d(), "zzcbz", zzwx.d(), "zzcca", zzwx.d(), "zzccb", "zzccc", zzwx.d(), "zzccd", zzc.d()});
                    case 4:
                        return zzcce;
                    case 5:
                        zzdpv<zza> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zza.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzcce);
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

        /* loaded from: classes2.dex */
        public static final class zzb extends zzdob.zza<zzi, zzb> implements zzdpm {
            private zzb() {
                super(zzi.zzcbq);
            }

            public final zzb A(Iterable<? extends zza> iterable) {
                p();
                ((zzi) this.f14842g).C(iterable);
                return this;
            }

            public final zzb B(long j2) {
                p();
                ((zzi) this.f14842g).I(j2);
                return this;
            }

            public final zzb u(String str) {
                p();
                ((zzi) this.f14842g).K(str);
                return this;
            }

            public final zzb v(String str) {
                p();
                ((zzi) this.f14842g).F(str);
                return this;
            }

            public final zzb x(int i2) {
                p();
                ((zzi) this.f14842g).G(i2);
                return this;
            }

            public final zzb y(int i2) {
                p();
                ((zzi) this.f14842g).H(i2);
                return this;
            }

            /* synthetic */ zzb(k50 k50Var) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzc implements zzdoe {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            private static final zzdof<zzc> l = new u50();
            private final int n;

            zzc(int i2) {
                this.n = i2;
            }

            public static zzdog d() {
                return v50.a;
            }

            public static zzc f(int i2) {
                if (i2 == 0) {
                    return UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CONNECTING;
                }
                if (i2 == 2) {
                    return CONNECTED;
                }
                if (i2 == 3) {
                    return DISCONNECTING;
                }
                if (i2 == 4) {
                    return DISCONNECTED;
                }
                if (i2 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.n;
            }
        }

        static {
            zzi zziVar = new zzi();
            zzcbq = zziVar;
            zzdob.t(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C(Iterable<? extends zza> iterable) {
            if (!this.zzcbk.s()) {
                zzdoj<zza> zzdojVar = this.zzcbk;
                int size = zzdojVar.size();
                this.zzcbk = zzdojVar.l(size == 0 ? 10 : size << 1);
            }
            zzdmi.a(iterable, this.zzcbk);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(String str) {
            str.getClass();
            this.zzdj |= 16;
            this.zzcbo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(int i2) {
            this.zzdj |= 1;
            this.zzcbl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(int i2) {
            this.zzdj |= 2;
            this.zzcbm = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I(long j2) {
            this.zzdj |= 4;
            this.zzcbn = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(String str) {
            str.getClass();
            this.zzdj |= 8;
            this.zzdk = str;
        }

        public static zzb L() {
            return (zzb) ((zzdob.zza) zzcbq.q(zzdob.zze.f14848e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zzb(k50Var);
                case 3:
                    return zzdob.r(zzcbq, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0002\u0002\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005", new Object[]{"zzdj", "zzcbk", zza.class, "zzcbl", "zzcbm", "zzcbn", "zzdk", "zzcbo", "zzcbp"});
                case 4:
                    return zzcbq;
                case 5:
                    zzdpv<zzi> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzi.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcbq);
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

    /* loaded from: classes2.dex */
    public static final class zzj extends zzdob<zzj, zza> implements zzdpm {
        private static final zzj zzccx;
        private static volatile zzdpv<zzj> zzdv;
        private int zzccm = 1000;
        private int zzccn = 1000;
        private int zzcco;
        private int zzccp;
        private int zzccq;
        private int zzccr;
        private int zzccs;
        private int zzcct;
        private int zzccu;
        private int zzccv;
        private zzk zzccw;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzj, zza> implements zzdpm {
            private zza() {
                super(zzj.zzccx);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzccx = zzjVar;
            zzdob.t(zzj.class, zzjVar);
        }

        private zzj() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzccx, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", new Object[]{"zzdj", "zzccm", zzwx.d(), "zzccn", zzwx.d(), "zzcco", "zzccp", "zzccq", "zzccr", "zzccs", "zzcct", "zzccu", "zzccv", "zzccw"});
                case 4:
                    return zzccx;
                case 5:
                    zzdpv<zzj> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzj.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzccx);
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

    /* loaded from: classes2.dex */
    public static final class zzk extends zzdob<zzk, zza> implements zzdpm {
        private static final zzk zzcda;
        private static volatile zzdpv<zzk> zzdv;
        private int zzccy;
        private int zzccz;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzk, zza> implements zzdpm {
            private zza() {
                super(zzk.zzcda);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzcda = zzkVar;
            zzdob.t(zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcda, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzccy", "zzccz"});
                case 4:
                    return zzcda;
                case 5:
                    zzdpv<zzk> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzk.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcda);
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

    /* loaded from: classes2.dex */
    public static final class zzl extends zzdob<zzl, zza> implements zzdpm {
        private static final zzl zzcdd;
        private static volatile zzdpv<zzl> zzdv;
        private int zzcdb;
        private int zzcdc;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzl, zza> implements zzdpm {
            private zza() {
                super(zzl.zzcdd);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzcdd = zzlVar;
            zzdob.t(zzl.class, zzlVar);
        }

        private zzl() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzcdb", "zzcdc"});
                case 4:
                    return zzcdd;
                case 5:
                    zzdpv<zzl> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzl.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdd);
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

    /* loaded from: classes2.dex */
    public static final class zzm extends zzdob<zzm, zza> implements zzdpm {
        private static final zzm zzcde;
        private static volatile zzdpv<zzm> zzdv;
        private String zzcam = HttpUrl.FRAGMENT_ENCODE_SET;
        private int zzcan;
        private zzn zzcap;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzm, zza> implements zzdpm {
            private zza() {
                super(zzm.zzcde);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzcde = zzmVar;
            zzdob.t(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcde, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcam", "zzcan", zzwx.d(), "zzcap"});
                case 4:
                    return zzcde;
                case 5:
                    zzdpv<zzm> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzm.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcde);
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

    /* loaded from: classes2.dex */
    public static final class zzn extends zzdob<zzn, zza> implements zzdpm {
        private static final zzn zzcdh;
        private static volatile zzdpv<zzn> zzdv;
        private int zzcdf;
        private int zzcdg;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzn, zza> implements zzdpm {
            private zza() {
                super(zzn.zzcdh);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzn zznVar = new zzn();
            zzcdh = zznVar;
            zzdob.t(zzn.class, zznVar);
        }

        private zzn() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzcdf", "zzcdg"});
                case 4:
                    return zzcdh;
                case 5:
                    zzdpv<zzn> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzn.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdh);
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

    /* loaded from: classes2.dex */
    public static final class zzo extends zzdob<zzo, zza> implements zzdpm {
        private static final zzo zzcdk;
        private static volatile zzdpv<zzo> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private zzn zzcdj;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzo, zza> implements zzdpm {
            private zza() {
                super(zzo.zzcdk);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzcdk = zzoVar;
            zzdob.t(zzo.class, zzoVar);
        }

        private zzo() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcar", zzwx.d(), "zzcdi", "zzcdj"});
                case 4:
                    return zzcdk;
                case 5:
                    zzdpv<zzo> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzo.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdk);
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

    /* loaded from: classes2.dex */
    public static final class zzp extends zzdob<zzp, zza> implements zzdpm {
        private static final zzp zzcdm;
        private static volatile zzdpv<zzp> zzdv;
        private int zzcdl;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzp, zza> implements zzdpm {
            private zza() {
                super(zzp.zzcdm);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzdoe {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);


            /* renamed from: j, reason: collision with root package name */
            private static final zzdof<zzb> f15735j = new w50();
            private final int l;

            zzb(int i2) {
                this.l = i2;
            }

            public static zzdog d() {
                return x50.a;
            }

            public static zzb f(int i2) {
                if (i2 == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i2 == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i2 != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.l;
            }
        }

        static {
            zzp zzpVar = new zzp();
            zzcdm = zzpVar;
            zzdob.t(zzp.class, zzpVar);
        }

        private zzp() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdm, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzdj", "zzcdl", zzb.d()});
                case 4:
                    return zzcdm;
                case 5:
                    zzdpv<zzp> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzp.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdm);
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

    /* loaded from: classes2.dex */
    public static final class zzq extends zzdob<zzq, zza> implements zzdpm {
        private static final zzq zzcdv;
        private static volatile zzdpv<zzq> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private int zzcds;
        private int zzcdt;
        private int zzcdu;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzq, zza> implements zzdpm {
            private zza() {
                super(zzq.zzcdv);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzq zzqVar = new zzq();
            zzcdv = zzqVar;
            zzdob.t(zzq.class, zzqVar);
        }

        private zzq() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdv, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"zzdj", "zzcar", zzwx.d(), "zzcdi", "zzcds", "zzcdt", "zzcdu"});
                case 4:
                    return zzcdv;
                case 5:
                    zzdpv<zzq> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzq.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdv);
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

    /* loaded from: classes2.dex */
    public static final class zzr extends zzdob<zzr, zza> implements zzdpm {
        private static final zzr zzcdw;
        private static volatile zzdpv<zzr> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private zzn zzcdj;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzr, zza> implements zzdpm {
            private zza() {
                super(zzr.zzcdw);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzcdw = zzrVar;
            zzdob.t(zzr.class, zzrVar);
        }

        private zzr() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdw, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcar", zzwx.d(), "zzcdi", "zzcdj"});
                case 4:
                    return zzcdw;
                case 5:
                    zzdpv<zzr> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzr.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdw);
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

    /* loaded from: classes2.dex */
    public static final class zzs extends zzdob<zzs, zza> implements zzdpm {
        private static final zzs zzcdy;
        private static volatile zzdpv<zzs> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private int zzcds;
        private int zzcdt;
        private int zzcdu;
        private long zzcdx;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzs, zza> implements zzdpm {
            private zza() {
                super(zzs.zzcdy);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzs zzsVar = new zzs();
            zzcdy = zzsVar;
            zzdob.t(zzs.class, zzsVar);
        }

        private zzs() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdy, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0003\u0005", new Object[]{"zzdj", "zzcar", zzwx.d(), "zzcdi", "zzcds", "zzcdt", "zzcdu", "zzcdx"});
                case 4:
                    return zzcdy;
                case 5:
                    zzdpv<zzs> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzs.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdy);
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

    /* loaded from: classes2.dex */
    public static final class zzt extends zzdob<zzt, zza> implements zzdpm {
        private static final zzt zzcdz;
        private static volatile zzdpv<zzt> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private zzn zzcdj;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzt, zza> implements zzdpm {
            private zza() {
                super(zzt.zzcdz);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzt zztVar = new zzt();
            zzcdz = zztVar;
            zzdob.t(zzt.class, zztVar);
        }

        private zzt() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcdz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzdj", "zzcar", zzwx.d(), "zzcdi", "zzcdj"});
                case 4:
                    return zzcdz;
                case 5:
                    zzdpv<zzt> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzt.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcdz);
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

    /* loaded from: classes2.dex */
    public static final class zzu extends zzdob<zzu, zza> implements zzdpm {
        private static final zzu zzcea;
        private static volatile zzdpv<zzu> zzdv;
        private int zzcar = 1000;
        private zzp zzcdi;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzu, zza> implements zzdpm {
            private zza() {
                super(zzu.zzcea);
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzu zzuVar = new zzu();
            zzcea = zzuVar;
            zzdob.t(zzu.class, zzuVar);
        }

        private zzu() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzcea, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzdj", "zzcar", zzwx.d(), "zzcdi"});
                case 4:
                    return zzcea;
                case 5:
                    zzdpv<zzu> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzu.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzcea);
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

    /* loaded from: classes2.dex */
    public static final class zzv extends zzdob<zzv, zza> implements zzdpm {
        private static final zzv zzced;
        private static volatile zzdpv<zzv> zzdv;
        private boolean zzceb;
        private int zzcec;
        private int zzdj;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzv, zza> implements zzdpm {
            private zza() {
                super(zzv.zzced);
            }

            public final zza u(int i2) {
                p();
                ((zzv) this.f14842g).A(i2);
                return this;
            }

            public final boolean v() {
                return ((zzv) this.f14842g).B();
            }

            public final zza x(boolean z) {
                p();
                ((zzv) this.f14842g).E(z);
                return this;
            }

            /* synthetic */ zza(k50 k50Var) {
                this();
            }
        }

        static {
            zzv zzvVar = new zzv();
            zzced = zzvVar;
            zzdob.t(zzv.class, zzvVar);
        }

        private zzv() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A(int i2) {
            this.zzdj |= 2;
            this.zzcec = i2;
        }

        public static zza C() {
            return (zza) ((zzdob.zza) zzced.q(zzdob.zze.f14848e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E(boolean z) {
            this.zzdj |= 1;
            this.zzceb = z;
        }

        public final boolean B() {
            return this.zzceb;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            k50 k50Var = null;
            switch (k50.a[i2 - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza(k50Var);
                case 3:
                    return zzdob.r(zzced, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001", new Object[]{"zzdj", "zzceb", "zzcec"});
                case 4:
                    return zzced;
                case 5:
                    zzdpv<zzv> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzv.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzced);
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
}
