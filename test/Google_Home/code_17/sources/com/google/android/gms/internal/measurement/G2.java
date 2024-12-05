package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* loaded from: classes3.dex */
public final class G2 extends AbstractC2091c5 implements K5 {
    private static final G2 zzc;
    private static volatile P5 zzd;
    private InterfaceC2151i5 zze = AbstractC2091c5.B();
    private InterfaceC2151i5 zzf = AbstractC2091c5.B();
    private InterfaceC2180l5 zzg = AbstractC2091c5.C();
    private InterfaceC2180l5 zzh = AbstractC2091c5.C();

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o() {
            l();
            G2.G((G2) this.f16584b);
            return this;
        }

        public final a p(Iterable iterable) {
            l();
            G2.H((G2) this.f16584b, iterable);
            return this;
        }

        public final a q() {
            l();
            G2.J((G2) this.f16584b);
            return this;
        }

        public final a r(Iterable iterable) {
            l();
            G2.K((G2) this.f16584b, iterable);
            return this;
        }

        public final a s() {
            l();
            G2.M((G2) this.f16584b);
            return this;
        }

        public final a t(Iterable iterable) {
            l();
            G2.N((G2) this.f16584b, iterable);
            return this;
        }

        public final a w() {
            l();
            G2.P((G2) this.f16584b);
            return this;
        }

        public final a x(Iterable iterable) {
            l();
            G2.Q((G2) this.f16584b, iterable);
            return this;
        }

        private a() {
            super(G2.zzc);
        }
    }

    static {
        G2 g22 = new G2();
        zzc = g22;
        AbstractC2091c5.r(G2.class, g22);
    }

    private G2() {
    }

    static /* synthetic */ void G(G2 g22) {
        g22.zzg = AbstractC2091c5.C();
    }

    static /* synthetic */ void H(G2 g22, Iterable iterable) {
        InterfaceC2180l5 interfaceC2180l5 = g22.zzg;
        if (!interfaceC2180l5.b()) {
            g22.zzg = AbstractC2091c5.n(interfaceC2180l5);
        }
        AbstractC2160j4.f(iterable, g22.zzg);
    }

    static /* synthetic */ void J(G2 g22) {
        g22.zzf = AbstractC2091c5.B();
    }

    static /* synthetic */ void K(G2 g22, Iterable iterable) {
        InterfaceC2151i5 interfaceC2151i5 = g22.zzf;
        if (!interfaceC2151i5.b()) {
            g22.zzf = AbstractC2091c5.m(interfaceC2151i5);
        }
        AbstractC2160j4.f(iterable, g22.zzf);
    }

    static /* synthetic */ void M(G2 g22) {
        g22.zzh = AbstractC2091c5.C();
    }

    static /* synthetic */ void N(G2 g22, Iterable iterable) {
        InterfaceC2180l5 interfaceC2180l5 = g22.zzh;
        if (!interfaceC2180l5.b()) {
            g22.zzh = AbstractC2091c5.n(interfaceC2180l5);
        }
        AbstractC2160j4.f(iterable, g22.zzh);
    }

    static /* synthetic */ void P(G2 g22) {
        g22.zze = AbstractC2091c5.B();
    }

    static /* synthetic */ void Q(G2 g22, Iterable iterable) {
        InterfaceC2151i5 interfaceC2151i5 = g22.zze;
        if (!interfaceC2151i5.b()) {
            g22.zze = AbstractC2091c5.m(interfaceC2151i5);
        }
        AbstractC2160j4.f(iterable, g22.zze);
    }

    public static a R() {
        return (a) zzc.w();
    }

    public static G2 T() {
        return zzc;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final int L() {
        return this.zzh.size();
    }

    public final int O() {
        return this.zze.size();
    }

    public final List U() {
        return this.zzg;
    }

    public final List V() {
        return this.zzf;
    }

    public final List W() {
        return this.zzh;
    }

    public final List X() {
        return this.zze;
    }

    public final int j() {
        return this.zzg.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new G2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C2293y2.class, "zzh", H2.class});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (G2.class) {
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
