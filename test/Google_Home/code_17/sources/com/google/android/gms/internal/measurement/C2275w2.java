package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2275w2 extends AbstractC2091c5 implements K5 {
    private static final C2275w2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* renamed from: com.google.android.gms.internal.measurement.w2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(boolean z8) {
            l();
            C2275w2.H((C2275w2) this.f16584b, z8);
            return this;
        }

        public final a p(boolean z8) {
            l();
            C2275w2.J((C2275w2) this.f16584b, z8);
            return this;
        }

        public final a q(boolean z8) {
            l();
            C2275w2.L((C2275w2) this.f16584b, z8);
            return this;
        }

        public final a r(boolean z8) {
            l();
            C2275w2.M((C2275w2) this.f16584b, z8);
            return this;
        }

        public final a s(boolean z8) {
            l();
            C2275w2.O((C2275w2) this.f16584b, z8);
            return this;
        }

        public final a t(boolean z8) {
            l();
            C2275w2.Q((C2275w2) this.f16584b, z8);
            return this;
        }

        public final a w(boolean z8) {
            l();
            C2275w2.S((C2275w2) this.f16584b, z8);
            return this;
        }

        private a() {
            super(C2275w2.zzc);
        }
    }

    static {
        C2275w2 c2275w2 = new C2275w2();
        zzc = c2275w2;
        AbstractC2091c5.r(C2275w2.class, c2275w2);
    }

    private C2275w2() {
    }

    public static a G() {
        return (a) zzc.w();
    }

    static /* synthetic */ void H(C2275w2 c2275w2, boolean z8) {
        c2275w2.zze |= 32;
        c2275w2.zzk = z8;
    }

    static /* synthetic */ void J(C2275w2 c2275w2, boolean z8) {
        c2275w2.zze |= 16;
        c2275w2.zzj = z8;
    }

    public static C2275w2 K() {
        return zzc;
    }

    static /* synthetic */ void L(C2275w2 c2275w2, boolean z8) {
        c2275w2.zze |= 1;
        c2275w2.zzf = z8;
    }

    static /* synthetic */ void M(C2275w2 c2275w2, boolean z8) {
        c2275w2.zze |= 64;
        c2275w2.zzl = z8;
    }

    static /* synthetic */ void O(C2275w2 c2275w2, boolean z8) {
        c2275w2.zze |= 2;
        c2275w2.zzg = z8;
    }

    static /* synthetic */ void Q(C2275w2 c2275w2, boolean z8) {
        c2275w2.zze |= 4;
        c2275w2.zzh = z8;
    }

    static /* synthetic */ void S(C2275w2 c2275w2, boolean z8) {
        c2275w2.zze |= 8;
        c2275w2.zzi = z8;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean R() {
        return this.zzf;
    }

    public final boolean T() {
        return this.zzl;
    }

    public final boolean U() {
        return this.zzg;
    }

    public final boolean V() {
        return this.zzh;
    }

    public final boolean W() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new C2275w2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2275w2.class) {
                        try {
                            p52 = zzd;
                            if (p52 == null) {
                                p52 = new AbstractC2091c5.a(zzc);
                                zzd = p52;
                            }
                        } finally {
                        }
                    }
                }
                return p52;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
