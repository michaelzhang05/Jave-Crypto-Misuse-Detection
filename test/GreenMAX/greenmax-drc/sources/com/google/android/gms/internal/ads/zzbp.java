package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class zzbp {

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob<zza, C0173zza> implements zzdpm {
        private static volatile zzdpv<zza> zzdv;
        private static final zza zzhj;
        private int zzdj;
        private int zzeq;
        private int zzer;
        private long zzet;
        private long zzeu;
        private long zzev;
        private long zzew;
        private long zzex;
        private long zzey;
        private long zzez;
        private long zzfa;
        private long zzfb;
        private long zzfc;
        private long zzfe;
        private long zzff;
        private long zzfg;
        private long zzfh;
        private long zzfi;
        private long zzfj;
        private long zzfk;
        private long zzfl;
        private long zzfm;
        private long zzfo;
        private long zzfp;
        private long zzfq;
        private long zzfr;
        private zzb zzfu;
        private zze zzgj;
        private zzf zzgl;
        private int zzgw;
        private int zzgx;
        private int zzgy;
        private zzf zzgz;
        private long zzhc;
        private boolean zzhf;
        private long zzhh;
        private zze zzhi;
        private String zzes = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdt = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzfd = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzej = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzfn = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzel = HttpUrl.FRAGMENT_ENCODE_SET;
        private long zzfs = -1;
        private long zzft = -1;
        private long zzfv = -1;
        private long zzfw = -1;
        private long zzfx = -1;
        private long zzfy = -1;
        private long zzfz = -1;
        private long zzga = -1;
        private String zzem = "D";
        private String zzen = "D";
        private int zzgb = 1000;
        private int zzgc = 1000;
        private long zzgd = -1;
        private long zzge = -1;
        private long zzgf = -1;
        private long zzgg = -1;
        private long zzgh = -1;
        private int zzgi = 1000;
        private zzdoj<zze> zzgk = zzdob.v();
        private long zzgm = -1;
        private long zzgn = -1;
        private long zzgo = -1;
        private long zzgp = -1;
        private long zzgq = -1;
        private long zzgr = -1;
        private long zzgs = -1;
        private long zzgt = -1;
        private String zzgu = "D";
        private long zzgv = -1;
        private long zzha = -1;
        private int zzhb = 1000;
        private String zzhd = HttpUrl.FRAGMENT_ENCODE_SET;
        private int zzhe = 2;
        private String zzhg = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: com.google.android.gms.internal.ads.zzbp$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0173zza extends zzdob.zza<zza, C0173zza> implements zzdpm {
            private C0173zza() {
                super(zza.zzhj);
            }

            public final C0173zza A(String str) {
                p();
                ((zza) this.f14842g).A1(str);
                return this;
            }

            public final C0173zza A0(String str) {
                p();
                ((zza) this.f14842g).f1(str);
                return this;
            }

            public final C0173zza B(String str) {
                p();
                ((zza) this.f14842g).D1(str);
                return this;
            }

            public final C0173zza B0(String str) {
                p();
                ((zza) this.f14842g).i1(str);
                return this;
            }

            public final C0173zza C(long j2) {
                p();
                ((zza) this.f14842g).E0(j2);
                return this;
            }

            public final C0173zza C0(String str) {
                p();
                ((zza) this.f14842g).l1(str);
                return this;
            }

            public final C0173zza E(long j2) {
                p();
                ((zza) this.f14842g).H0(j2);
                return this;
            }

            public final C0173zza F(long j2) {
                p();
                ((zza) this.f14842g).K0(j2);
                return this;
            }

            public final C0173zza G() {
                p();
                ((zza) this.f14842g).h0();
                return this;
            }

            public final C0173zza H(long j2) {
                p();
                ((zza) this.f14842g).N0(j2);
                return this;
            }

            public final C0173zza I(long j2) {
                p();
                ((zza) this.f14842g).Q0(j2);
                return this;
            }

            public final C0173zza K(long j2) {
                p();
                ((zza) this.f14842g).T0(j2);
                return this;
            }

            public final C0173zza M(long j2) {
                p();
                ((zza) this.f14842g).V0(j2);
                return this;
            }

            public final C0173zza N(long j2) {
                p();
                ((zza) this.f14842g).X0(j2);
                return this;
            }

            public final C0173zza O(long j2) {
                p();
                ((zza) this.f14842g).Z0(j2);
                return this;
            }

            public final C0173zza Q(long j2) {
                p();
                ((zza) this.f14842g).b1(j2);
                return this;
            }

            public final C0173zza R(long j2) {
                p();
                ((zza) this.f14842g).d1(j2);
                return this;
            }

            public final C0173zza S(long j2) {
                p();
                ((zza) this.f14842g).g1(j2);
                return this;
            }

            public final C0173zza T(long j2) {
                p();
                ((zza) this.f14842g).j1(j2);
                return this;
            }

            public final C0173zza U(long j2) {
                p();
                ((zza) this.f14842g).m1(j2);
                return this;
            }

            public final C0173zza V(long j2) {
                p();
                ((zza) this.f14842g).p1(j2);
                return this;
            }

            public final C0173zza W(zzc zzcVar) {
                p();
                ((zza) this.f14842g).x(zzcVar);
                return this;
            }

            public final C0173zza X(zzf zzfVar) {
                p();
                ((zza) this.f14842g).A(zzfVar);
                return this;
            }

            public final C0173zza Z(zzf zzfVar) {
                p();
                ((zza) this.f14842g).L(zzfVar);
                return this;
            }

            public final C0173zza a0(boolean z) {
                p();
                ((zza) this.f14842g).N(z);
                return this;
            }

            public final C0173zza b0(long j2) {
                p();
                ((zza) this.f14842g).s1(j2);
                return this;
            }

            @Deprecated
            public final C0173zza c0(long j2) {
                p();
                ((zza) this.f14842g).v1(j2);
                return this;
            }

            public final C0173zza d0(long j2) {
                p();
                ((zza) this.f14842g).y1(j2);
                return this;
            }

            public final C0173zza e0(long j2) {
                p();
                ((zza) this.f14842g).B1(j2);
                return this;
            }

            public final C0173zza f0(long j2) {
                p();
                ((zza) this.f14842g).E1(j2);
                return this;
            }

            public final C0173zza g0(long j2) {
                p();
                ((zza) this.f14842g).G1(j2);
                return this;
            }

            public final C0173zza h0(long j2) {
                p();
                ((zza) this.f14842g).I1(j2);
                return this;
            }

            public final C0173zza j0(long j2) {
                p();
                ((zza) this.f14842g).O(j2);
                return this;
            }

            public final C0173zza k0(long j2) {
                p();
                ((zza) this.f14842g).Q(j2);
                return this;
            }

            public final C0173zza l0(long j2) {
                p();
                ((zza) this.f14842g).S(j2);
                return this;
            }

            public final C0173zza m0(long j2) {
                p();
                ((zza) this.f14842g).U(j2);
                return this;
            }

            public final C0173zza n0(long j2) {
                p();
                ((zza) this.f14842g).X(j2);
                return this;
            }

            public final C0173zza o0(long j2) {
                p();
                ((zza) this.f14842g).a0(j2);
                return this;
            }

            public final C0173zza p0(long j2) {
                p();
                ((zza) this.f14842g).c0(j2);
                return this;
            }

            public final C0173zza q0(long j2) {
                p();
                ((zza) this.f14842g).e0(j2);
                return this;
            }

            public final C0173zza r0(long j2) {
                p();
                ((zza) this.f14842g).f0(j2);
                return this;
            }

            public final C0173zza s0(long j2) {
                p();
                ((zza) this.f14842g).j0(j2);
                return this;
            }

            public final C0173zza t0(long j2) {
                p();
                ((zza) this.f14842g).k0(j2);
                return this;
            }

            public final C0173zza u(String str) {
                p();
                ((zza) this.f14842g).o1(str);
                return this;
            }

            public final C0173zza u0(zze zzeVar) {
                p();
                ((zza) this.f14842g).y(zzeVar);
                return this;
            }

            public final C0173zza v(String str) {
                p();
                ((zza) this.f14842g).r1(str);
                return this;
            }

            public final C0173zza v0(zze zzeVar) {
                p();
                ((zza) this.f14842g).q0(zzeVar);
                return this;
            }

            public final C0173zza w0(zzbz zzbzVar) {
                p();
                ((zza) this.f14842g).M(zzbzVar);
                return this;
            }

            public final C0173zza x(String str) {
                p();
                ((zza) this.f14842g).u1(str);
                return this;
            }

            public final C0173zza x0(zzbz zzbzVar) {
                p();
                ((zza) this.f14842g).v0(zzbzVar);
                return this;
            }

            public final C0173zza y(String str) {
                p();
                ((zza) this.f14842g).x1(str);
                return this;
            }

            public final C0173zza y0(zzbz zzbzVar) {
                p();
                ((zza) this.f14842g).z0(zzbzVar);
                return this;
            }

            public final C0173zza z0(zzbz zzbzVar) {
                p();
                ((zza) this.f14842g).D0(zzbzVar);
                return this;
            }

            /* synthetic */ C0173zza(md mdVar) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public enum zzb implements zzdoe {
            DEBUGGER_STATE_UNSPECIFIED(0),
            DEBUGGER_STATE_NOT_INSTALLED(1),
            DEBUGGER_STATE_INSTALLED(2),
            DEBUGGER_STATE_ACTIVE(3);


            /* renamed from: j, reason: collision with root package name */
            private static final zzdof<zzb> f13472j = new pd();
            private final int l;

            zzb(int i2) {
                this.l = i2;
            }

            public static zzdog d() {
                return vd.a;
            }

            public static zzb f(int i2) {
                if (i2 == 0) {
                    return DEBUGGER_STATE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return DEBUGGER_STATE_NOT_INSTALLED;
                }
                if (i2 == 2) {
                    return DEBUGGER_STATE_INSTALLED;
                }
                if (i2 != 3) {
                    return null;
                }
                return DEBUGGER_STATE_ACTIVE;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.l;
            }
        }

        /* loaded from: classes2.dex */
        public enum zzc implements zzdoe {
            DEVICE_IDENTIFIER_NO_ID(0),
            DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
            DEVICE_IDENTIFIER_GLOBAL_ID(2),
            DEVICE_IDENTIFIER_ADVERTISER_ID(3),
            DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
            DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
            DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);

            private static final zzdof<zzc> m = new le();
            private final int o;

            zzc(int i2) {
                this.o = i2;
            }

            public static zzdog d() {
                return ve.a;
            }

            public static zzc f(int i2) {
                switch (i2) {
                    case 0:
                        return DEVICE_IDENTIFIER_NO_ID;
                    case 1:
                        return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                    case 2:
                        return DEVICE_IDENTIFIER_GLOBAL_ID;
                    case 3:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID;
                    case 4:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                    case 5:
                        return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    case 6:
                        return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                    default:
                        return null;
                }
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.o;
            }
        }

        /* loaded from: classes2.dex */
        public enum zzd implements zzdoe {
            ERROR_ENCODE_SIZE_FAIL(1),
            ERROR_UNKNOWN(3),
            ERROR_NO_SIGNALS(5),
            ERROR_ENCRYPTION(7),
            ERROR_MEMORY(9),
            ERROR_SIMULATOR(11),
            ERROR_SERVICE(13),
            ERROR_THREAD(15),
            PSN_WEB64_FAIL(2),
            PSN_DECRYPT_SIZE_FAIL(4),
            PSN_MD5_CHECK_FAIL(8),
            PSN_MD5_SIZE_FAIL(16),
            PSN_MD5_FAIL(32),
            PSN_DECODE_FAIL(64),
            PSN_SALT_FAIL(128),
            PSN_BITSLICER_FAIL(256),
            PSN_REQUEST_TYPE_FAIL(AdRequest.MAX_CONTENT_URL_LENGTH),
            PSN_INVALID_ERROR_CODE(1024),
            PSN_TIMESTAMP_EXPIRED(RecyclerView.l.FLAG_MOVED),
            PSN_ENCODE_SIZE_FAIL(RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT),
            PSN_BLANK_VALUE(8192),
            PSN_INITIALIZATION_FAIL(Http2.INITIAL_MAX_FRAME_SIZE),
            PSN_GASS_CLIENT_FAIL(32768),
            PSN_SIGNALS_TIMEOUT(65536),
            PSN_TINK_FAIL(131072);

            private static final zzdof<zzd> E = new ze();
            private final int G;

            zzd(int i2) {
                this.G = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzdoe
            public final int b() {
                return this.G;
            }
        }

        /* loaded from: classes2.dex */
        public static final class zze extends zzdob<zze, C0174zza> implements zzdpm {
            private static volatile zzdpv<zze> zzdv;
            private static final zze zzjq;
            private int zzdj;
            private long zzjk;
            private long zzjl;
            private long zzfe = -1;
            private long zzff = -1;
            private long zzix = -1;
            private long zziy = -1;
            private long zziz = -1;
            private long zzja = -1;
            private int zzjb = 1000;
            private long zzjc = -1;
            private long zzjd = -1;
            private long zzje = -1;
            private int zzjf = 1000;
            private long zzjg = -1;
            private long zzjh = -1;
            private long zzji = -1;
            private long zzjj = -1;
            private long zzjm = -1;
            private long zzjn = -1;
            private long zzjo = -1;
            private long zzjp = -1;

            /* renamed from: com.google.android.gms.internal.ads.zzbp$zza$zze$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0174zza extends zzdob.zza<zze, C0174zza> implements zzdpm {
                private C0174zza() {
                    super(zze.zzjq);
                }

                public final C0174zza A(long j2) {
                    p();
                    ((zze) this.f14842g).G(j2);
                    return this;
                }

                public final C0174zza B(long j2) {
                    p();
                    ((zze) this.f14842g).H(j2);
                    return this;
                }

                public final C0174zza C(long j2) {
                    p();
                    ((zze) this.f14842g).I(j2);
                    return this;
                }

                public final C0174zza E(long j2) {
                    p();
                    ((zze) this.f14842g).K(j2);
                    return this;
                }

                public final C0174zza F(long j2) {
                    p();
                    ((zze) this.f14842g).L(j2);
                    return this;
                }

                public final C0174zza G(long j2) {
                    p();
                    ((zze) this.f14842g).M(j2);
                    return this;
                }

                public final C0174zza H(long j2) {
                    p();
                    ((zze) this.f14842g).N(j2);
                    return this;
                }

                public final C0174zza I(long j2) {
                    p();
                    ((zze) this.f14842g).P(j2);
                    return this;
                }

                public final C0174zza K(long j2) {
                    p();
                    ((zze) this.f14842g).Q(j2);
                    return this;
                }

                public final C0174zza M(long j2) {
                    p();
                    ((zze) this.f14842g).R(j2);
                    return this;
                }

                public final C0174zza N(long j2) {
                    p();
                    ((zze) this.f14842g).S(j2);
                    return this;
                }

                public final C0174zza O(long j2) {
                    p();
                    ((zze) this.f14842g).T(j2);
                    return this;
                }

                public final C0174zza Q(long j2) {
                    p();
                    ((zze) this.f14842g).U(j2);
                    return this;
                }

                public final C0174zza R(long j2) {
                    p();
                    ((zze) this.f14842g).V(j2);
                    return this;
                }

                public final C0174zza S(zzbz zzbzVar) {
                    p();
                    ((zze) this.f14842g).e0(zzbzVar);
                    return this;
                }

                public final C0174zza T(zzbz zzbzVar) {
                    p();
                    ((zze) this.f14842g).h0(zzbzVar);
                    return this;
                }

                public final C0174zza u() {
                    p();
                    ((zze) this.f14842g).A();
                    return this;
                }

                public final C0174zza v(long j2) {
                    p();
                    ((zze) this.f14842g).f0(j2);
                    return this;
                }

                public final C0174zza x(long j2) {
                    p();
                    ((zze) this.f14842g).j0(j2);
                    return this;
                }

                public final C0174zza y(long j2) {
                    p();
                    ((zze) this.f14842g).F(j2);
                    return this;
                }

                /* synthetic */ C0174zza(md mdVar) {
                    this();
                }
            }

            static {
                zze zzeVar = new zze();
                zzjq = zzeVar;
                zzdob.t(zze.class, zzeVar);
            }

            private zze() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void A() {
                this.zzdj &= -9;
                this.zziy = -1L;
            }

            public static C0174zza B() {
                return (C0174zza) ((zzdob.zza) zzjq.q(zzdob.zze.f14848e, null, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void F(long j2) {
                this.zzdj |= 4;
                this.zzix = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void G(long j2) {
                this.zzdj |= 8;
                this.zziy = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void H(long j2) {
                this.zzdj |= 16;
                this.zziz = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void I(long j2) {
                this.zzdj |= 32;
                this.zzja = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void K(long j2) {
                this.zzdj |= 128;
                this.zzjc = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void L(long j2) {
                this.zzdj |= 256;
                this.zzjd = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void M(long j2) {
                this.zzdj |= AdRequest.MAX_CONTENT_URL_LENGTH;
                this.zzje = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void N(long j2) {
                this.zzdj |= RecyclerView.l.FLAG_MOVED;
                this.zzjg = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void P(long j2) {
                this.zzdj |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
                this.zzjh = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void Q(long j2) {
                this.zzdj |= 8192;
                this.zzji = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void R(long j2) {
                this.zzdj |= Http2.INITIAL_MAX_FRAME_SIZE;
                this.zzjj = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void S(long j2) {
                this.zzdj |= 32768;
                this.zzjk = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void T(long j2) {
                this.zzdj |= 65536;
                this.zzjl = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void U(long j2) {
                this.zzdj |= 131072;
                this.zzjm = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void V(long j2) {
                this.zzdj |= 262144;
                this.zzjn = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void e0(zzbz zzbzVar) {
                zzbzVar.getClass();
                this.zzdj |= 64;
                this.zzjb = zzbzVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void f0(long j2) {
                this.zzdj |= 1;
                this.zzfe = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void h0(zzbz zzbzVar) {
                zzbzVar.getClass();
                this.zzdj |= 1024;
                this.zzjf = zzbzVar.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void j0(long j2) {
                this.zzdj |= 2;
                this.zzff = j2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                md mdVar = null;
                switch (md.a[i2 - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0174zza(mdVar);
                    case 3:
                        return zzdob.r(zzjq, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\f\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\f\n\f\u0002\u000b\r\u0002\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002\u0014", new Object[]{"zzdj", "zzfe", "zzff", "zzix", "zziy", "zziz", "zzja", "zzjb", zzbz.d(), "zzjc", "zzjd", "zzje", "zzjf", zzbz.d(), "zzjg", "zzjh", "zzji", "zzjj", "zzjk", "zzjl", "zzjm", "zzjn", "zzjo", "zzjp"});
                    case 4:
                        return zzjq;
                    case 5:
                        zzdpv<zze> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zze.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzjq);
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
        public static final class zzf extends zzdob<zzf, C0175zza> implements zzdpm {
            private static volatile zzdpv<zzf> zzdv;
            private static final zzf zzjv;
            private int zzdj;
            private long zzgg = -1;
            private long zzgh = -1;
            private long zzjr = -1;
            private long zzjs = -1;
            private long zzjt = -1;
            private long zzju = -1;

            /* renamed from: com.google.android.gms.internal.ads.zzbp$zza$zzf$zza, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0175zza extends zzdob.zza<zzf, C0175zza> implements zzdpm {
                private C0175zza() {
                    super(zzf.zzjv);
                }

                public final C0175zza u(long j2) {
                    p();
                    ((zzf) this.f14842g).D(j2);
                    return this;
                }

                public final C0175zza v(long j2) {
                    p();
                    ((zzf) this.f14842g).E(j2);
                    return this;
                }

                public final C0175zza x(long j2) {
                    p();
                    ((zzf) this.f14842g).G(j2);
                    return this;
                }

                public final C0175zza y(long j2) {
                    p();
                    ((zzf) this.f14842g).H(j2);
                    return this;
                }

                /* synthetic */ C0175zza(md mdVar) {
                    this();
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzjv = zzfVar;
                zzdob.t(zzf.class, zzfVar);
            }

            private zzf() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void D(long j2) {
                this.zzdj |= 4;
                this.zzjr = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void E(long j2) {
                this.zzdj |= 8;
                this.zzjs = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void G(long j2) {
                this.zzdj |= 16;
                this.zzjt = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void H(long j2) {
                this.zzdj |= 32;
                this.zzju = j2;
            }

            public static C0175zza y() {
                return (C0175zza) ((zzdob.zza) zzjv.q(zzdob.zze.f14848e, null, null));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzdob
            public final Object q(int i2, Object obj, Object obj2) {
                md mdVar = null;
                switch (md.a[i2 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0175zza(mdVar);
                    case 3:
                        return zzdob.r(zzjv, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"zzdj", "zzgg", "zzgh", "zzjr", "zzjs", "zzjt", "zzju"});
                    case 4:
                        return zzjv;
                    case 5:
                        zzdpv<zzf> zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            synchronized (zzf.class) {
                                zzdpvVar = zzdv;
                                if (zzdpvVar == null) {
                                    zzdpvVar = new zzdob.zzb<>(zzjv);
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
            zza zzaVar = new zza();
            zzhj = zzaVar;
            zzdob.t(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A(zzf zzfVar) {
            zzfVar.getClass();
            this.zzgl = zzfVar;
            this.zzeq |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A1(String str) {
            str.getClass();
            this.zzeq |= 67108864;
            this.zzgu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void B1(long j2) {
            this.zzeq |= 1;
            this.zzfv = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D0(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzer |= 2;
            this.zzhb = zzbzVar.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D1(String str) {
            str.getClass();
            this.zzer |= 8;
            this.zzhd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E0(long j2) {
            this.zzdj |= 4;
            this.zzet = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E1(long j2) {
            this.zzeq |= 2;
            this.zzfw = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G1(long j2) {
            this.zzeq |= 4;
            this.zzfx = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H0(long j2) {
            this.zzdj |= 16;
            this.zzev = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I1(long j2) {
            this.zzeq |= 8;
            this.zzfy = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K0(long j2) {
            this.zzdj |= 32;
            this.zzew = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L(zzf zzfVar) {
            zzfVar.getClass();
            this.zzgz = zzfVar;
            this.zzeq |= Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzeq |= 256;
            this.zzgb = zzbzVar.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(boolean z) {
            this.zzer |= 32;
            this.zzhf = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N0(long j2) {
            this.zzdj |= 1024;
            this.zzfb = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O(long j2) {
            this.zzeq |= 16;
            this.zzfz = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q(long j2) {
            this.zzeq |= 32;
            this.zzga = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q0(long j2) {
            this.zzdj |= RecyclerView.l.FLAG_MOVED;
            this.zzfc = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(long j2) {
            this.zzeq |= 1024;
            this.zzgd = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T0(long j2) {
            this.zzdj |= 8192;
            this.zzfe = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U(long j2) {
            this.zzeq |= RecyclerView.l.FLAG_MOVED;
            this.zzge = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void V0(long j2) {
            this.zzdj |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.zzff = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void X(long j2) {
            this.zzeq |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.zzgf = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void X0(long j2) {
            this.zzdj |= 32768;
            this.zzfg = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Z0(long j2) {
            this.zzdj |= 65536;
            this.zzfh = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a0(long j2) {
            this.zzeq |= 524288;
            this.zzgn = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b1(long j2) {
            this.zzdj |= 524288;
            this.zzfk = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c0(long j2) {
            this.zzeq |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            this.zzgo = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d1(long j2) {
            this.zzdj |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            this.zzfl = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e0(long j2) {
            this.zzeq |= 2097152;
            this.zzgp = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f0(long j2) {
            this.zzeq |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            this.zzgs = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f1(String str) {
            str.getClass();
            this.zzdj |= 1;
            this.zzes = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g1(long j2) {
            this.zzdj |= 2097152;
            this.zzfm = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h0() {
            this.zzgk = zzdob.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i1(String str) {
            str.getClass();
            this.zzdj |= 2;
            this.zzdt = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j0(long j2) {
            this.zzeq |= 33554432;
            this.zzgt = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j1(long j2) {
            this.zzdj |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            this.zzfo = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k0(long j2) {
            this.zzer |= 128;
            this.zzhh = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l1(String str) {
            str.getClass();
            this.zzdj |= 4194304;
            this.zzej = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m1(long j2) {
            this.zzdj |= 33554432;
            this.zzfp = j2;
        }

        public static C0173zza n0() {
            return (C0173zza) ((zzdob.zza) zzhj.q(zzdob.zze.f14848e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o1(String str) {
            str.getClass();
            this.zzdj |= 8388608;
            this.zzfn = str;
        }

        public static zza p0(byte[] bArr, zzdno zzdnoVar) throws zzdok {
            return (zza) zzdob.p(zzhj, bArr, zzdnoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void p1(long j2) {
            this.zzdj |= 67108864;
            this.zzfq = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q0(zze zzeVar) {
            zzeVar.getClass();
            if (!this.zzgk.s()) {
                zzdoj<zze> zzdojVar = this.zzgk;
                int size = zzdojVar.size();
                this.zzgk = zzdojVar.l(size == 0 ? 10 : size << 1);
            }
            this.zzgk.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r1(String str) {
            str.getClass();
            this.zzdj |= 134217728;
            this.zzel = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s1(long j2) {
            this.zzdj |= 268435456;
            this.zzfr = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void u1(String str) {
            str.getClass();
            this.zzeq |= 64;
            this.zzem = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void v0(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzeq |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.zzgc = zzbzVar.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void v1(long j2) {
            this.zzdj |= 536870912;
            this.zzfs = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void x(zzc zzcVar) {
            zzcVar.getClass();
            this.zzer |= 16;
            this.zzhe = zzcVar.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void x1(String str) {
            str.getClass();
            this.zzeq |= 128;
            this.zzen = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void y(zze zzeVar) {
            zzeVar.getClass();
            this.zzgj = zzeVar;
            this.zzeq |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void y1(long j2) {
            this.zzdj |= 1073741824;
            this.zzft = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z0(zzbz zzbzVar) {
            zzbzVar.getClass();
            this.zzeq |= 32768;
            this.zzgi = zzbzVar.b();
        }

        public final String W() {
            return this.zzej;
        }

        public final boolean g0() {
            return (this.zzdj & 4194304) == 4194304;
        }

        public final boolean l0() {
            return (this.zzer & 256) == 256;
        }

        public final zze m0() {
            zze zzeVar = this.zzhi;
            return zzeVar == null ? zze.A() : zzeVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            md mdVar = null;
            switch (md.a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0173zza(mdVar);
                case 3:
                    return zzdob.r(zzhj, "\u0001J\u0000\u0003\u0001ÉJ\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\u0002\n\f\u0002\u000b\r\b\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002B\u0016\u0002\u0014\u0017\u0002\u0015\u0018\bC\u0019\u0002G\u001a\fD\u001b\b\u0016\u001c\u0007E\u001d\b\u0017\u001e\bF\u001f\u0002\u0018 \u0002\u0019!\u0002\u001a\"\b\u001b#\u0002\u001c$\u0002\u001d%\u0002\u001e&\t\u001f'\u0002 (\u0002!)\u0002\"*\u0002#+\u001b,\u0002$-\u0002%.\b&/\b'0\f(1\f)2\t03\u0002*4\u0002+5\u0002,6\u0002-7\u0002.8\f/9\t1:\u00022;\u00023<\u00024=\u00025>\u00028?\u00029@\u0002;A\f<B\f=C\b:D\f>E\t?F\u0002@G\u00026H\u00027I\fAÉ\tH", new Object[]{"zzdj", "zzeq", "zzer", "zzes", "zzdt", "zzet", "zzeu", "zzev", "zzew", "zzex", "zzey", "zzez", "zzfa", "zzfb", "zzfc", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzhc", "zzfl", "zzfm", "zzhd", "zzhh", "zzhe", zzc.d(), "zzej", "zzhf", "zzfn", "zzhg", "zzfo", "zzfp", "zzfq", "zzel", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzfx", "zzfy", "zzgk", zze.class, "zzfz", "zzga", "zzem", "zzen", "zzgb", zzbz.d(), "zzgc", zzbz.d(), "zzgj", "zzgd", "zzge", "zzgf", "zzgg", "zzgh", "zzgi", zzbz.d(), "zzgl", "zzgm", "zzgn", "zzgo", "zzgp", "zzgs", "zzgt", "zzgv", "zzgw", zzbw.d(), "zzgx", zzcc.d(), "zzgu", "zzgy", zzb.d(), "zzgz", "zzha", "zzgq", "zzgr", "zzhb", zzbz.d(), "zzhi"});
                case 4:
                    return zzhj;
                case 5:
                    zzdpv<zza> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zza.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzhj);
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
        private static volatile zzdpv<zzb> zzdv;
        private static final zzb zzkb;
        private int zzdj;
        private long zzjw;
        private int zzjx;
        private boolean zzjy;
        private zzdoh zzjz = zzdob.u();
        private long zzka;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzb, zza> implements zzdpm {
            private zza() {
                super(zzb.zzkb);
            }

            /* synthetic */ zza(md mdVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzkb = zzbVar;
            zzdob.t(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            md mdVar = null;
            switch (md.a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(mdVar);
                case 3:
                    return zzdob.r(zzkb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0016\u0005\u0003\u0003", new Object[]{"zzdj", "zzjw", "zzjx", "zzjy", "zzjz", "zzka"});
                case 4:
                    return zzkb;
                case 5:
                    zzdpv<zzb> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzb.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzkb);
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
        private static final zzc zzke;
        private int zzdj;
        private zzdmr zzkc;
        private zzdmr zzkd;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzc, zza> implements zzdpm {
            private zza() {
                super(zzc.zzke);
            }

            /* synthetic */ zza(md mdVar) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzke = zzcVar;
            zzdob.t(zzc.class, zzcVar);
        }

        private zzc() {
            zzdmr zzdmrVar = zzdmr.f14805f;
            this.zzkc = zzdmrVar;
            this.zzkd = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            md mdVar = null;
            switch (md.a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(mdVar);
                case 3:
                    return zzdob.r(zzke, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001", new Object[]{"zzdj", "zzkc", "zzkd"});
                case 4:
                    return zzke;
                case 5:
                    zzdpv<zzc> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzc.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzke);
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
        private static volatile zzdpv<zzd> zzdv;
        private static final zzd zzkj;
        private int zzdj;
        private zzdmr zzkf;
        private zzdmr zzkg;
        private zzdmr zzkh;
        private zzdmr zzki;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzd, zza> implements zzdpm {
            private zza() {
                super(zzd.zzkj);
            }

            public final zza u(zzdmr zzdmrVar) {
                p();
                ((zzd) this.f14842g).K(zzdmrVar);
                return this;
            }

            public final zza v(zzdmr zzdmrVar) {
                p();
                ((zzd) this.f14842g).L(zzdmrVar);
                return this;
            }

            public final zza x(zzdmr zzdmrVar) {
                p();
                ((zzd) this.f14842g).M(zzdmrVar);
                return this;
            }

            public final zza y(zzdmr zzdmrVar) {
                p();
                ((zzd) this.f14842g).N(zzdmrVar);
                return this;
            }

            /* synthetic */ zza(md mdVar) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzkj = zzdVar;
            zzdob.t(zzd.class, zzdVar);
        }

        private zzd() {
            zzdmr zzdmrVar = zzdmr.f14805f;
            this.zzkf = zzdmrVar;
            this.zzkg = zzdmrVar;
            this.zzkh = zzdmrVar;
            this.zzki = zzdmrVar;
        }

        public static zza E() {
            return (zza) ((zzdob.zza) zzkj.q(zzdob.zze.f14848e, null, null));
        }

        public static zzd G(byte[] bArr, zzdno zzdnoVar) throws zzdok {
            return (zzd) zzdob.p(zzkj, bArr, zzdnoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 1;
            this.zzkf = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 2;
            this.zzkg = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 4;
            this.zzkh = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 8;
            this.zzki = zzdmrVar;
        }

        public final zzdmr A() {
            return this.zzkg;
        }

        public final zzdmr C() {
            return this.zzkh;
        }

        public final zzdmr D() {
            return this.zzki;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            md mdVar = null;
            switch (md.a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(mdVar);
                case 3:
                    return zzdob.r(zzkj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\n\u0003", new Object[]{"zzdj", "zzkf", "zzkg", "zzkh", "zzki"});
                case 4:
                    return zzkj;
                case 5:
                    zzdpv<zzd> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzd.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzkj);
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

        public final zzdmr y() {
            return this.zzkf;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zze extends zzdob<zze, zza> implements zzdpm {
        private static volatile zzdpv<zze> zzdv;
        private static final zze zzlb;
        private int zzdj;
        private long zzjw;
        private String zzkz = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzdmr zzla = zzdmr.f14805f;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zze, zza> implements zzdpm {
            private zza() {
                super(zze.zzlb);
            }

            /* synthetic */ zza(md mdVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzlb = zzeVar;
            zzdob.t(zze.class, zzeVar);
        }

        private zze() {
        }

        public static zze A() {
            return zzlb;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            md mdVar = null;
            switch (md.a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(mdVar);
                case 3:
                    return zzdob.r(zzlb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", new Object[]{"zzdj", "zzjw", "zzkz", "zzla"});
                case 4:
                    return zzlb;
                case 5:
                    zzdpv<zze> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zze.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzlb);
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

        public final boolean x() {
            return (this.zzdj & 1) == 1;
        }

        public final long y() {
            return this.zzjw;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzf extends zzdob<zzf, zza> implements zzdpm {
        private static volatile zzdpv<zzf> zzdv;
        private static final zzf zzlc;
        private int zzdj;
        private String zzeo = HttpUrl.FRAGMENT_ENCODE_SET;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzf, zza> implements zzdpm {
            private zza() {
                super(zzf.zzlc);
            }

            public final zza u(String str) {
                p();
                ((zzf) this.f14842g).y(str);
                return this;
            }

            /* synthetic */ zza(md mdVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzlc = zzfVar;
            zzdob.t(zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zza A() {
            return (zza) ((zzdob.zza) zzlc.q(zzdob.zze.f14848e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void y(String str) {
            str.getClass();
            this.zzdj |= 1;
            this.zzeo = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            md mdVar = null;
            switch (md.a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(mdVar);
                case 3:
                    return zzdob.r(zzlc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdj", "zzeo"});
                case 4:
                    return zzlc;
                case 5:
                    zzdpv<zzf> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzf.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzlc);
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
        private static volatile zzdpv<zzg> zzdv;
        private static final zzg zzle;
        private int zzdj;
        private zzdoj<zzdmr> zzld = zzdob.v();
        private zzdmr zzkg = zzdmr.f14805f;
        private int zzgx = 1;
        private int zzgw = 1;

        /* loaded from: classes2.dex */
        public static final class zza extends zzdob.zza<zzg, zza> implements zzdpm {
            private zza() {
                super(zzg.zzle);
            }

            public final zza u(zzbw zzbwVar) {
                p();
                ((zzg) this.f14842g).A(zzbwVar);
                return this;
            }

            public final zza v(zzdmr zzdmrVar) {
                p();
                ((zzg) this.f14842g).F(zzdmrVar);
                return this;
            }

            public final zza x(zzdmr zzdmrVar) {
                p();
                ((zzg) this.f14842g).E(zzdmrVar);
                return this;
            }

            /* synthetic */ zza(md mdVar) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzle = zzgVar;
            zzdob.t(zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A(zzbw zzbwVar) {
            zzbwVar.getClass();
            this.zzdj |= 4;
            this.zzgw = zzbwVar.b();
        }

        public static zza C() {
            return (zza) ((zzdob.zza) zzle.q(zzdob.zze.f14848e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            this.zzdj |= 1;
            this.zzkg = zzdmrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(zzdmr zzdmrVar) {
            zzdmrVar.getClass();
            if (!this.zzld.s()) {
                zzdoj<zzdmr> zzdojVar = this.zzld;
                int size = zzdojVar.size();
                this.zzld = zzdojVar.l(size == 0 ? 10 : size << 1);
            }
            this.zzld.add(zzdmrVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            md mdVar = null;
            switch (md.a[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(mdVar);
                case 3:
                    return zzdob.r(zzle, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\n\u0000\u0003\f\u0001\u0004\f\u0002", new Object[]{"zzdj", "zzld", "zzkg", "zzgx", zzcc.d(), "zzgw", zzbw.d()});
                case 4:
                    return zzle;
                case 5:
                    zzdpv<zzg> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zzg.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzle);
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
