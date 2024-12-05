package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzbi {

    /* loaded from: classes2.dex */
    public static final class zza extends zzdob<zza, C0171zza> implements zzdpm {
        private static final zza zzdu;
        private static volatile zzdpv<zza> zzdv;
        private int zzdj;
        private long zzdl;
        private long zzdp;
        private long zzdq;
        private long zzds;
        private String zzdk = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdm = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdn = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdo = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdr = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzdt = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: com.google.android.gms.internal.ads.zzbi$zza$zza, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0171zza extends zzdob.zza<zza, C0171zza> implements zzdpm {
            private C0171zza() {
                super(zza.zzdu);
            }

            public final C0171zza u(long j2) {
                p();
                ((zza) this.f14842g).B(j2);
                return this;
            }

            public final C0171zza v(String str) {
                p();
                ((zza) this.f14842g).D(str);
                return this;
            }

            public final C0171zza x(String str) {
                p();
                ((zza) this.f14842g).E(str);
                return this;
            }

            public final C0171zza y(String str) {
                p();
                ((zza) this.f14842g).F(str);
                return this;
            }

            /* synthetic */ C0171zza(sb sbVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzdu = zzaVar;
            zzdob.t(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void B(long j2) {
            this.zzdj |= 2;
            this.zzdl = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(String str) {
            str.getClass();
            this.zzdj |= 1;
            this.zzdk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E(String str) {
            str.getClass();
            this.zzdj |= 4;
            this.zzdm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(String str) {
            str.getClass();
            this.zzdj |= 8;
            this.zzdn = str;
        }

        public static C0171zza G() {
            return (C0171zza) ((zzdob.zza) zzdu.q(zzdob.zze.f14848e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzdob
        public final Object q(int i2, Object obj, Object obj2) {
            sb sbVar = null;
            switch (sb.a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0171zza(sbVar);
                case 3:
                    return zzdob.r(zzdu, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t", new Object[]{"zzdj", "zzdk", "zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt"});
                case 4:
                    return zzdu;
                case 5:
                    zzdpv<zza> zzdpvVar = zzdv;
                    if (zzdpvVar == null) {
                        synchronized (zza.class) {
                            zzdpvVar = zzdv;
                            if (zzdpvVar == null) {
                                zzdpvVar = new zzdob.zzb<>(zzdu);
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
