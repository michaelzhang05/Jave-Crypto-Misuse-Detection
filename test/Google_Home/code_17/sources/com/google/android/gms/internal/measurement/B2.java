package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* loaded from: classes3.dex */
public final class B2 extends AbstractC2091c5 implements K5 {
    private static final B2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC2180l5 zzk = AbstractC2091c5.C();

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a A() {
            l();
            B2.R((B2) this.f16584b);
            return this;
        }

        public final a B() {
            l();
            B2.T((B2) this.f16584b);
            return this;
        }

        public final String C() {
            return ((B2) this.f16584b).W();
        }

        public final String D() {
            return ((B2) this.f16584b).X();
        }

        public final int o() {
            return ((B2) this.f16584b).Q();
        }

        public final a p(double d8) {
            l();
            B2.I((B2) this.f16584b, d8);
            return this;
        }

        public final a q(long j8) {
            l();
            B2.J((B2) this.f16584b, j8);
            return this;
        }

        public final a r(a aVar) {
            l();
            B2.K((B2) this.f16584b, (B2) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final a s(Iterable iterable) {
            l();
            B2.L((B2) this.f16584b, iterable);
            return this;
        }

        public final a t(String str) {
            l();
            B2.M((B2) this.f16584b, str);
            return this;
        }

        public final a w() {
            l();
            B2.H((B2) this.f16584b);
            return this;
        }

        public final a x(String str) {
            l();
            B2.P((B2) this.f16584b, str);
            return this;
        }

        public final a z() {
            l();
            B2.O((B2) this.f16584b);
            return this;
        }

        private a() {
            super(B2.zzc);
        }
    }

    static {
        B2 b22 = new B2();
        zzc = b22;
        AbstractC2091c5.r(B2.class, b22);
    }

    private B2() {
    }

    static /* synthetic */ void H(B2 b22) {
        b22.zze &= -17;
        b22.zzj = 0.0d;
    }

    static /* synthetic */ void I(B2 b22, double d8) {
        b22.zze |= 16;
        b22.zzj = d8;
    }

    static /* synthetic */ void J(B2 b22, long j8) {
        b22.zze |= 4;
        b22.zzh = j8;
    }

    static /* synthetic */ void K(B2 b22, B2 b23) {
        b23.getClass();
        b22.e0();
        b22.zzk.add(b23);
    }

    static /* synthetic */ void L(B2 b22, Iterable iterable) {
        b22.e0();
        AbstractC2160j4.f(iterable, b22.zzk);
    }

    static /* synthetic */ void M(B2 b22, String str) {
        str.getClass();
        b22.zze |= 1;
        b22.zzf = str;
    }

    static /* synthetic */ void O(B2 b22) {
        b22.zze &= -5;
        b22.zzh = 0L;
    }

    static /* synthetic */ void P(B2 b22, String str) {
        str.getClass();
        b22.zze |= 2;
        b22.zzg = str;
    }

    static /* synthetic */ void R(B2 b22) {
        b22.zzk = AbstractC2091c5.C();
    }

    static /* synthetic */ void T(B2 b22) {
        b22.zze &= -3;
        b22.zzg = zzc.zzg;
    }

    public static a U() {
        return (a) zzc.w();
    }

    private final void e0() {
        InterfaceC2180l5 interfaceC2180l5 = this.zzk;
        if (!interfaceC2180l5.b()) {
            this.zzk = AbstractC2091c5.n(interfaceC2180l5);
        }
    }

    public final double G() {
        return this.zzj;
    }

    public final float N() {
        return this.zzi;
    }

    public final int Q() {
        return this.zzk.size();
    }

    public final long S() {
        return this.zzh;
    }

    public final String W() {
        return this.zzf;
    }

    public final String X() {
        return this.zzg;
    }

    public final List Y() {
        return this.zzk;
    }

    public final boolean Z() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new B2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", B2.class});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (B2.class) {
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
