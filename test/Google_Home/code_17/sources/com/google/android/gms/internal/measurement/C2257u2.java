package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2257u2 extends AbstractC2091c5 implements K5 {
    private static final C2257u2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* renamed from: com.google.android.gms.internal.measurement.u2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a A(String str) {
            l();
            C2257u2.T((C2257u2) this.f16584b, str);
            return this;
        }

        public final a B() {
            l();
            C2257u2.P((C2257u2) this.f16584b);
            return this;
        }

        public final a C(String str) {
            l();
            C2257u2.W((C2257u2) this.f16584b, str);
            return this;
        }

        public final a D() {
            l();
            C2257u2.S((C2257u2) this.f16584b);
            return this;
        }

        public final a E(String str) {
            l();
            C2257u2.Z((C2257u2) this.f16584b, str);
            return this;
        }

        public final a F() {
            l();
            C2257u2.V((C2257u2) this.f16584b);
            return this;
        }

        public final a G() {
            l();
            C2257u2.Y((C2257u2) this.f16584b);
            return this;
        }

        public final long o() {
            return ((C2257u2) this.f16584b).G();
        }

        public final a p(long j8) {
            l();
            C2257u2.I((C2257u2) this.f16584b, j8);
            return this;
        }

        public final a q(String str) {
            l();
            C2257u2.J((C2257u2) this.f16584b, str);
            return this;
        }

        public final long r() {
            return ((C2257u2) this.f16584b).K();
        }

        public final a s(long j8) {
            l();
            C2257u2.M((C2257u2) this.f16584b, j8);
            return this;
        }

        public final a t(String str) {
            l();
            C2257u2.N((C2257u2) this.f16584b, str);
            return this;
        }

        public final a w() {
            l();
            C2257u2.H((C2257u2) this.f16584b);
            return this;
        }

        public final a x(String str) {
            l();
            C2257u2.Q((C2257u2) this.f16584b, str);
            return this;
        }

        public final a z() {
            l();
            C2257u2.L((C2257u2) this.f16584b);
            return this;
        }

        private a() {
            super(C2257u2.zzc);
        }
    }

    static {
        C2257u2 c2257u2 = new C2257u2();
        zzc = c2257u2;
        AbstractC2091c5.r(C2257u2.class, c2257u2);
    }

    private C2257u2() {
    }

    static /* synthetic */ void H(C2257u2 c2257u2) {
        c2257u2.zze &= -5;
        c2257u2.zzh = zzc.zzh;
    }

    static /* synthetic */ void I(C2257u2 c2257u2, long j8) {
        c2257u2.zze |= 8;
        c2257u2.zzi = j8;
    }

    static /* synthetic */ void J(C2257u2 c2257u2, String str) {
        str.getClass();
        c2257u2.zze |= 4;
        c2257u2.zzh = str;
    }

    static /* synthetic */ void L(C2257u2 c2257u2) {
        c2257u2.zze &= -3;
        c2257u2.zzg = zzc.zzg;
    }

    static /* synthetic */ void M(C2257u2 c2257u2, long j8) {
        c2257u2.zze |= 128;
        c2257u2.zzm = j8;
    }

    static /* synthetic */ void N(C2257u2 c2257u2, String str) {
        str.getClass();
        c2257u2.zze |= 2;
        c2257u2.zzg = str;
    }

    public static a O() {
        return (a) zzc.w();
    }

    static /* synthetic */ void P(C2257u2 c2257u2) {
        c2257u2.zze &= -2;
        c2257u2.zzf = zzc.zzf;
    }

    static /* synthetic */ void Q(C2257u2 c2257u2, String str) {
        str.getClass();
        c2257u2.zze |= 1;
        c2257u2.zzf = str;
    }

    static /* synthetic */ void S(C2257u2 c2257u2) {
        c2257u2.zze &= -65;
        c2257u2.zzl = zzc.zzl;
    }

    static /* synthetic */ void T(C2257u2 c2257u2, String str) {
        str.getClass();
        c2257u2.zze |= 64;
        c2257u2.zzl = str;
    }

    public static C2257u2 U() {
        return zzc;
    }

    static /* synthetic */ void V(C2257u2 c2257u2) {
        c2257u2.zze &= -33;
        c2257u2.zzk = zzc.zzk;
    }

    static /* synthetic */ void W(C2257u2 c2257u2, String str) {
        str.getClass();
        c2257u2.zze |= 32;
        c2257u2.zzk = str;
    }

    static /* synthetic */ void Y(C2257u2 c2257u2) {
        c2257u2.zze &= -17;
        c2257u2.zzj = zzc.zzj;
    }

    static /* synthetic */ void Z(C2257u2 c2257u2, String str) {
        str.getClass();
        c2257u2.zze |= 16;
        c2257u2.zzj = str;
    }

    public final long G() {
        return this.zzi;
    }

    public final long K() {
        return this.zzm;
    }

    public final String X() {
        return this.zzh;
    }

    public final String a0() {
        return this.zzg;
    }

    public final String b0() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzl;
    }

    public final String d0() {
        return this.zzk;
    }

    public final String e0() {
        return this.zzj;
    }

    public final boolean f0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j0() {
        if ((this.zze & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k0() {
        if ((this.zze & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new C2257u2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2257u2.class) {
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
