package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdrz {

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob<zza, C0176zza> implements zzdpm {
        private static volatile zzdpv<zza> zzdv;
        private static final zza zzhoq;
        private int zzdj;
        private int zzhoj;
        private zzb zzhok;
        private zzdmr zzhol;
        private zzdmr zzhom;
        private boolean zzhon;
        private boolean zzhoo;
        private byte zzhop = 2;

        /* renamed from: com.google.android.gms.internal.ads.zzdrz$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0176zza extends zzdob.zza<zza, C0176zza> implements zzdpm {
            private C0176zza() {
                super(zza.zzhoq);
            }

            /* synthetic */ C0176zza(yx yxVar) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzb extends zzdob<zzb, C0177zza> implements zzdpm {
            private static volatile zzdpv<zzb> zzdv;
            private static final zzb zzhov;
            private int zzdj;
            private String zzhor = HttpUrl.FRAGMENT_ENCODE_SET;
            private String zzhos = HttpUrl.FRAGMENT_ENCODE_SET;
            private String zzhot = HttpUrl.FRAGMENT_ENCODE_SET;
            private int zzhou;

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zza$zzb$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0177zza extends zzdob.zza<zzb, C0177zza> implements zzdpm {
                private C0177zza() {
                    super(zzb.zzhov);
                }

                /* synthetic */ C0177zza(yx yxVar) {
                    this();
                }
            }

            static {
                zzb zzbVar = new zzb();
                zzhov = zzbVar;
                zzdob.t(zzb.class, zzbVar);
            }

            private zzb() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0177zza(yxVar);
                    case 3:
                        return zzdob.r(zzhov, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", new Object[]{"zzdj", "zzhor", "zzhos", "zzhot", "zzhou"});
                    case 4:
                        return zzhov;
                    case 5:
                        zzdpv<zzb> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zzb.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhov);
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
        public enum zzc implements zzdoe {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);


            /* renamed from: k, reason: collision with root package name */
            private static final zzdof<zzc> f14915k = new zx();
            private final int m;

            zzc(int i2) {
                this.m = i2;
            }

            public static zzdog d() {
                return ay.a;
            }

            public static zzc f(int i2) {
                if (i2 == 0) {
                    return SAFE;
                }
                if (i2 == 1) {
                    return DANGEROUS;
                }
                if (i2 == 2) {
                    return UNKNOWN;
                }
                if (i2 == 3) {
                    return POTENTIALLY_UNWANTED;
                }
                if (i2 != 4) {
                    return null;
                }
                return DANGEROUS_HOST;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.m;
            }
        }

        static {
            zza zzaVar = new zza();
            zzhoq = zzaVar;
            zzdob.t(zza.class, zzaVar);
        }

        private zza() {
            zzdmr zzdmrVar = zzdmr.f14805f;
            this.zzhol = zzdmrVar;
            this.zzhom = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            yx yxVar = null;
            switch (yx.a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0176zza(yxVar);
                case 3:
                    return zzdob.r(zzhoq, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzdj", "zzhoj", zzc.d(), "zzhok", "zzhol", "zzhom", "zzhon", "zzhoo"});
                case 4:
                    return zzhoq;
                case 5:
                    zzdpv<zza> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zza.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzhoq);
                                zzdv = zzdpvVar;
                            }
                        }
                    }
                    return zzdpvVar;
                case 6:
                    return Byte.valueOf(this.zzhop);
                case 7:
                    this.zzhop = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzdob<zzb, zza> implements zzdpm {
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzhpr;
        private int zzbzi;
        private int zzdj;
        private int zzhpc;
        private C0178zzb zzhpf;
        private zzf zzhpi;
        private boolean zzhpj;
        private boolean zzhpm;
        private boolean zzhpn;
        private zzi zzhpo;
        private byte zzhop = 2;
        private String zzhos = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzhpd = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzhpe = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoj<zzh> zzhpg = zzdob.v();
        private String zzhph = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdoj<String> zzhpk = zzdob.v();
        private String zzhpl = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdmr zzhol = zzdmr.f14805f;
        private zzdoj<String> zzhpp = zzdob.v();
        private zzdoj<String> zzhpq = zzdob.v();

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzhpr);
            }

            /* synthetic */ zza(yx yxVar) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzb, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0178zzb extends zzdob<C0178zzb, zza> implements zzdpm {
            private static volatile zzdpv<C0178zzb> zzdv;
            private static final C0178zzb zzhpt;
            private int zzdj;
            private String zzhps = HttpUrl.FRAGMENT_ENCODE_SET;

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzb$zza */
            /* loaded from: classes2.dex */
            public static final class zza extends zzdob.zza<C0178zzb, zza> implements zzdpm {
                private zza() {
                    super(C0178zzb.zzhpt);
                }

                /* synthetic */ zza(yx yxVar) {
                    this();
                }
            }

            static {
                C0178zzb c0178zzb = new C0178zzb();
                zzhpt = c0178zzb;
                zzdob.t(C0178zzb.class, c0178zzb);
            }

            private C0178zzb() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new C0178zzb();
                    case 2:
                        return new zza(yxVar);
                    case 3:
                        return zzdob.r(zzhpt, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdj", "zzhps"});
                    case 4:
                        return zzhpt;
                    case 5:
                        zzdpv<C0178zzb> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (C0178zzb.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhpt);
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
            private static volatile zzdpv<zzc> zzdv;
            private static final zzc zzhpv;
            private int zzdj;
            private zzdmr zzgua;
            private byte zzhop = 2;
            private zzdmr zzhpu;

            /* loaded from: classes2.dex */
            public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
                private zza() {
                    super(zzc.zzhpv);
                }

                /* synthetic */ zza(yx yxVar) {
                    this();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzhpv = zzcVar;
                zzdob.t(zzc.class, zzcVar);
            }

            private zzc() {
                zzdmr zzdmrVar = zzdmr.f14805f;
                this.zzhpu = zzdmrVar;
                this.zzgua = zzdmrVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(yxVar);
                    case 3:
                        return zzdob.r(zzhpv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", new Object[]{"zzdj", "zzhpu", "zzgua"});
                    case 4:
                        return zzhpv;
                    case 5:
                        zzdpv<zzc> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zzc.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhpv);
                                    zzdv = zzdpvVar;
                                }
                            }
                        }
                        return zzdpvVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzd extends zzdob<zzd, zza> implements zzdpm {
            private static volatile zzdpv<zzd> zzdv;
            private static final zzd zzhqb;
            private int zzdj;
            private C0179zzb zzhpw;
            private zzdmr zzhpy;
            private zzdmr zzhpz;
            private int zzhqa;
            private byte zzhop = 2;
            private zzdoj<zzc> zzhpx = zzdob.v();

            /* loaded from: classes2.dex */
            public static final class zza extends zzdob.zza<zzd, zza> implements zzdpm {
                private zza() {
                    super(zzd.zzhqb);
                }

                /* synthetic */ zza(yx yxVar) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzd$zzb, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0179zzb extends zzdob<C0179zzb, zza> implements zzdpm {
                private static volatile zzdpv<C0179zzb> zzdv;
                private static final C0179zzb zzhqf;
                private int zzdj;
                private zzdmr zzhqc;
                private zzdmr zzhqd;
                private zzdmr zzhqe;

                /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzd$zzb$zza */
                /* loaded from: classes2.dex */
                public static final class zza extends zzdob.zza<C0179zzb, zza> implements zzdpm {
                    private zza() {
                        super(C0179zzb.zzhqf);
                    }

                    /* synthetic */ zza(yx yxVar) {
                        this();
                    }
                }

                static {
                    C0179zzb c0179zzb = new C0179zzb();
                    zzhqf = c0179zzb;
                    zzdob.t(C0179zzb.class, c0179zzb);
                }

                private C0179zzb() {
                    zzdmr zzdmrVar = zzdmr.f14805f;
                    this.zzhqc = zzdmrVar;
                    this.zzhqd = zzdmrVar;
                    this.zzhqe = zzdmrVar;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzdob
                public final Object q(int i2, Object obj, Object obj2) {
                    yx yxVar = null;
                    switch (yx.a[i2 - 1]) {
                        case 1:
                            return new C0179zzb();
                        case 2:
                            return new zza(yxVar);
                        case 3:
                            return zzdob.r(zzhqf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzhqc", "zzhqd", "zzhqe"});
                        case 4:
                            return zzhqf;
                        case 5:
                            zzdpv<C0179zzb> zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                synchronized (C0179zzb.class) {
                                    zzdpvVar = zzdv;
                                    if (zzdpvVar == null) {
                                        zzdpvVar = new zzdob.zzb<>(zzhqf);
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

            static {
                zzd zzdVar = new zzd();
                zzhqb = zzdVar;
                zzdob.t(zzd.class, zzdVar);
            }

            private zzd() {
                zzdmr zzdmrVar = zzdmr.f14805f;
                this.zzhpy = zzdmrVar;
                this.zzhpz = zzdmrVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza(yxVar);
                    case 3:
                        return zzdob.r(zzhqb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", new Object[]{"zzdj", "zzhpw", "zzhpx", zzc.class, "zzhpy", "zzhpz", "zzhqa"});
                    case 4:
                        return zzhqb;
                    case 5:
                        zzdpv<zzd> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zzd.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhqb);
                                    zzdv = zzdpvVar;
                                }
                            }
                        }
                        return zzdpvVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class zze extends zzdob<zze, zza> implements zzdpm {
            private static volatile zzdpv<zze> zzdv;
            private static final zze zzhqi;
            private int zzdj;
            private byte zzhop = 2;
            private zzdoj<zzc> zzhpx = zzdob.v();
            private zzdmr zzhpy;
            private zzdmr zzhpz;
            private int zzhqa;
            private C0180zzb zzhqg;
            private zzdmr zzhqh;

            /* loaded from: classes2.dex */
            public static final class zza extends zzdob.zza<zze, zza> implements zzdpm {
                private zza() {
                    super(zze.zzhqi);
                }

                /* synthetic */ zza(yx yxVar) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zze$zzb, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0180zzb extends zzdob<C0180zzb, zza> implements zzdpm {
                private static volatile zzdpv<C0180zzb> zzdv;
                private static final C0180zzb zzhql;
                private int zzdj;
                private zzdmr zzhqe;
                private int zzhqj;
                private zzdmr zzhqk;

                /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zze$zzb$zza */
                /* loaded from: classes2.dex */
                public static final class zza extends zzdob.zza<C0180zzb, zza> implements zzdpm {
                    private zza() {
                        super(C0180zzb.zzhql);
                    }

                    /* synthetic */ zza(yx yxVar) {
                        this();
                    }
                }

                static {
                    C0180zzb c0180zzb = new C0180zzb();
                    zzhql = c0180zzb;
                    zzdob.t(C0180zzb.class, c0180zzb);
                }

                private C0180zzb() {
                    zzdmr zzdmrVar = zzdmr.f14805f;
                    this.zzhqk = zzdmrVar;
                    this.zzhqe = zzdmrVar;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzdob
                public final Object q(int i2, Object obj, Object obj2) {
                    yx yxVar = null;
                    switch (yx.a[i2 - 1]) {
                        case 1:
                            return new C0180zzb();
                        case 2:
                            return new zza(yxVar);
                        case 3:
                            return zzdob.r(zzhql, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzhqj", "zzhqk", "zzhqe"});
                        case 4:
                            return zzhql;
                        case 5:
                            zzdpv<C0180zzb> zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                synchronized (C0180zzb.class) {
                                    zzdpvVar = zzdv;
                                    if (zzdpvVar == null) {
                                        zzdpvVar = new zzdob.zzb<>(zzhql);
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

            static {
                zze zzeVar = new zze();
                zzhqi = zzeVar;
                zzdob.t(zze.class, zzeVar);
            }

            private zze() {
                zzdmr zzdmrVar = zzdmr.f14805f;
                this.zzhpy = zzdmrVar;
                this.zzhpz = zzdmrVar;
                this.zzhqh = zzdmrVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza(yxVar);
                    case 3:
                        return zzdob.r(zzhqi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", new Object[]{"zzdj", "zzhqg", "zzhpx", zzc.class, "zzhpy", "zzhpz", "zzhqa", "zzhqh"});
                    case 4:
                        return zzhqi;
                    case 5:
                        zzdpv<zze> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zze.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhqi);
                                    zzdv = zzdpvVar;
                                }
                            }
                        }
                        return zzdpvVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzf extends zzdob<zzf, zza> implements zzdpm {
            private static volatile zzdpv<zzf> zzdv;
            private static final zzf zzhqo;
            private int zzbzi;
            private int zzdj;
            private String zzhqm = HttpUrl.FRAGMENT_ENCODE_SET;
            private zzdmr zzhqn = zzdmr.f14805f;

            /* loaded from: classes2.dex */
            public static final class zza extends zzdob.zza<zzf, zza> implements zzdpm {
                private zza() {
                    super(zzf.zzhqo);
                }

                /* synthetic */ zza(yx yxVar) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzf$zzb, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public enum EnumC0181zzb implements zzdoe {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);


                /* renamed from: h, reason: collision with root package name */
                private static final zzdof<EnumC0181zzb> f14918h = new by();

                /* renamed from: j, reason: collision with root package name */
                private final int f14920j;

                EnumC0181zzb(int i2) {
                    this.f14920j = i2;
                }

                public static zzdog d() {
                    return cy.a;
                }

                public static EnumC0181zzb f(int i2) {
                    if (i2 == 0) {
                        return TYPE_UNKNOWN;
                    }
                    if (i2 != 1) {
                        return null;
                    }
                    return TYPE_CREATIVE;
                }

                @Override // com.google.android.gms.internal.ads.zzdoe
                public final int b() {
                    return this.f14920j;
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzhqo = zzfVar;
                zzdob.t(zzf.class, zzfVar);
            }

            private zzf() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new zza(yxVar);
                    case 3:
                        return zzdob.r(zzhqo, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"zzdj", "zzbzi", EnumC0181zzb.d(), "zzhqm", "zzhqn"});
                    case 4:
                        return zzhqo;
                    case 5:
                        zzdpv<zzf> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zzf.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhqo);
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
        public enum zzg implements zzdoe {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);

            private static final zzdof<zzg> p = new dy();
            private final int r;

            zzg(int i2) {
                this.r = i2;
            }

            public static zzdog d() {
                return ey.a;
            }

            public static zzg f(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.r;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzh extends zzdob<zzh, C0182zzb> implements zzdpm {
            private static volatile zzdpv<zzh> zzdv;
            private static final zzh zzhrl;
            private int zzdj;
            private int zzhrd;
            private zzd zzhre;
            private zze zzhrf;
            private int zzhrg;
            private int zzhrj;
            private byte zzhop = 2;
            private String zzhos = HttpUrl.FRAGMENT_ENCODE_SET;
            private zzdoh zzhrh = zzdob.u();
            private String zzhri = HttpUrl.FRAGMENT_ENCODE_SET;
            private zzdoj<String> zzhrk = zzdob.v();

            /* loaded from: classes2.dex */
            public enum zza implements zzdoe {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);


                /* renamed from: j, reason: collision with root package name */
                private static final zzdof<zza> f14931j = new fy();
                private final int l;

                zza(int i2) {
                    this.l = i2;
                }

                public static zzdog d() {
                    return gy.a;
                }

                public static zza f(int i2) {
                    if (i2 == 0) {
                        return AD_RESOURCE_UNKNOWN;
                    }
                    if (i2 == 1) {
                        return AD_RESOURCE_CREATIVE;
                    }
                    if (i2 == 2) {
                        return AD_RESOURCE_POST_CLICK;
                    }
                    if (i2 != 3) {
                        return null;
                    }
                    return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                }

                @Override // com.google.android.gms.internal.ads.zzdoe
                public final int b() {
                    return this.l;
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzdrz$zzb$zzh$zzb, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0182zzb extends zzdob.zza<zzh, C0182zzb> implements zzdpm {
                private C0182zzb() {
                    super(zzh.zzhrl);
                }

                /* synthetic */ C0182zzb(yx yxVar) {
                    this();
                }
            }

            static {
                zzh zzhVar = new zzh();
                zzhrl = zzhVar;
                zzdob.t(zzh.class, zzhVar);
            }

            private zzh() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C0182zzb(yxVar);
                    case 3:
                        return zzdob.r(zzhrl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", new Object[]{"zzdj", "zzhrd", "zzhos", "zzhre", "zzhrf", "zzhrg", "zzhrh", "zzhri", "zzhrj", zza.d(), "zzhrk"});
                    case 4:
                        return zzhrl;
                    case 5:
                        zzdpv<zzh> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zzh.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhrl);
                                    zzdv = zzdpvVar;
                                }
                            }
                        }
                        return zzdpvVar;
                    case 6:
                        return Byte.valueOf(this.zzhop);
                    case 7:
                        this.zzhop = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class zzi extends zzdob<zzi, zza> implements zzdpm {
            private static volatile zzdpv<zzi> zzdv;
            private static final zzi zzhru;
            private int zzdj;
            private String zzhrr = HttpUrl.FRAGMENT_ENCODE_SET;
            private long zzhrs;
            private boolean zzhrt;

            /* loaded from: classes2.dex */
            public static final class zza extends zzdob.zza<zzi, zza> implements zzdpm {
                private zza() {
                    super(zzi.zzhru);
                }

                /* synthetic */ zza(yx yxVar) {
                    this();
                }
            }

            static {
                zzi zziVar = new zzi();
                zzhru = zziVar;
                zzdob.t(zzi.class, zziVar);
            }

            private zzi() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                yx yxVar = null;
                switch (yx.a[i2 - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza(yxVar);
                    case 3:
                        return zzdob.r(zzhru, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", new Object[]{"zzdj", "zzhrr", "zzhrs", "zzhrt"});
                    case 4:
                        return zzhru;
                    case 5:
                        zzdpv<zzi> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zzi.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzhru);
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

        static {
            zzb zzbVar = new zzb();
            zzhpr = zzbVar;
            zzdob.t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            yx yxVar = null;
            switch (yx.a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(yxVar);
                case 3:
                    return zzdob.r(zzhpr, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", new Object[]{"zzdj", "zzhos", "zzhpd", "zzhpe", "zzhpg", zzh.class, "zzhpj", "zzhpk", "zzhpl", "zzhpm", "zzhpn", "zzbzi", zzg.d(), "zzhpc", zza.zzc.d(), "zzhpf", "zzhph", "zzhpi", "zzhol", "zzhpo", "zzhpp", "zzhpq"});
                case 4:
                    return zzhpr;
                case 5:
                    zzdpv<zzb> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzb.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzhpr);
                                zzdv = zzdpvVar;
                            }
                        }
                    }
                    return zzdpvVar;
                case 6:
                    return Byte.valueOf(this.zzhop);
                case 7:
                    this.zzhop = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
