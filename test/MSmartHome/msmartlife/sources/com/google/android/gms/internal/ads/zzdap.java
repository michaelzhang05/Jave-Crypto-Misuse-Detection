package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzdap extends zzdob<zzdap, zzb> implements zzdpm {
    private static volatile zzdpv<zzdap> zzdv;
    private static final zzdoi<Integer, zza> zzgof = new tq();
    private static final zzdap zzgoj;
    private int zzdj;
    private zzdoh zzgoe = zzdob.u();
    private String zzgog = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgoh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzgoi = HttpUrl.FRAGMENT_ENCODE_SET;

    /* loaded from: classes2.dex */
    public enum zza implements zzdoe {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);


        /* renamed from: h, reason: collision with root package name */
        private static final zzdof<zza> f14664h = new vq();

        /* renamed from: j, reason: collision with root package name */
        private final int f14666j;

        zza(int i2) {
            this.f14666j = i2;
        }

        public static zzdog d() {
            return wq.a;
        }

        public static zza f(int i2) {
            if (i2 == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i2 != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        @Override // com.google.android.gms.internal.ads.zzdoe
        public final int b() {
            return this.f14666j;
        }
    }

    /* loaded from: classes2.dex */
    public static final class zzb extends zzdob.zza<zzdap, zzb> implements zzdpm {
        private zzb() {
            super(zzdap.zzgoj);
        }

        public final zzb u(zza zzaVar) {
            p();
            ((zzdap) this.f14842g).x(zzaVar);
            return this;
        }

        public final zzb v(String str) {
            p();
            ((zzdap) this.f14842g).D(str);
            return this;
        }

        /* synthetic */ zzb(tq tqVar) {
            this();
        }
    }

    static {
        zzdap zzdapVar = new zzdap();
        zzgoj = zzdapVar;
        zzdob.t(zzdap.class, zzdapVar);
    }

    private zzdap() {
    }

    public static zzb B() {
        return (zzb) ((zzdob.zza) zzgoj.q(zzdob.zze.f14848e, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(String str) {
        str.getClass();
        this.zzdj |= 1;
        this.zzgog = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(zza zzaVar) {
        zzaVar.getClass();
        if (!this.zzgoe.s()) {
            zzdoh zzdohVar = this.zzgoe;
            int size = zzdohVar.size();
            this.zzgoe = zzdohVar.l(size == 0 ? 10 : size << 1);
        }
        this.zzgoe.F(zzaVar.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdob
    public final Object q(int i2, Object obj, Object obj2) {
        tq tqVar = null;
        switch (uq.a[i2 - 1]) {
            case 1:
                return new zzdap();
            case 2:
                return new zzb(tqVar);
            case 3:
                return zzdob.r(zzgoj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"zzdj", "zzgoe", zza.d(), "zzgog", "zzgoh", "zzgoi"});
            case 4:
                return zzgoj;
            case 5:
                zzdpv<zzdap> zzdpvVar = zzdv;
                if (zzdpvVar == null) {
                    synchronized (zzdap.class) {
                        zzdpvVar = zzdv;
                        if (zzdpvVar == null) {
                            zzdpvVar = new zzdob.zzb<>(zzgoj);
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
