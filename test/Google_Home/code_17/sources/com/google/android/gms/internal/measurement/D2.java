package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.E2;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes3.dex */
public final class D2 extends AbstractC2091c5 implements K5 {
    private static final D2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private InterfaceC2180l5 zzf = AbstractC2091c5.C();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final int o() {
            return ((D2) this.f16584b).j();
        }

        public final a p(E2.a aVar) {
            l();
            D2.I((D2) this.f16584b, (E2) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final a q(Iterable iterable) {
            l();
            D2.J((D2) this.f16584b, iterable);
            return this;
        }

        public final a r(String str) {
            l();
            D2.K((D2) this.f16584b, str);
            return this;
        }

        public final E2 s(int i8) {
            return ((D2) this.f16584b).H(0);
        }

        public final a t() {
            l();
            D2.M((D2) this.f16584b);
            return this;
        }

        public final a w(String str) {
            l();
            D2.N((D2) this.f16584b, str);
            return this;
        }

        public final String x() {
            return ((D2) this.f16584b).P();
        }

        public final List z() {
            return DesugarCollections.unmodifiableList(((D2) this.f16584b).R());
        }

        private a() {
            super(D2.zzc);
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2141h5 {
        SDK(0),
        SGTM(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f16104a;

        b(int i8) {
            this.f16104a = i8;
        }

        public static b a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    return null;
                }
                return SGTM;
            }
            return SDK;
        }

        public static InterfaceC2131g5 b() {
            return W2.f16429a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16104a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2141h5
        public final int w() {
            return this.f16104a;
        }
    }

    static {
        D2 d22 = new D2();
        zzc = d22;
        AbstractC2091c5.r(D2.class, d22);
    }

    private D2() {
    }

    public static a G(D2 d22) {
        return (a) zzc.k(d22);
    }

    static /* synthetic */ void I(D2 d22, E2 e22) {
        e22.getClass();
        d22.U();
        d22.zzf.add(e22);
    }

    static /* synthetic */ void J(D2 d22, Iterable iterable) {
        d22.U();
        AbstractC2160j4.f(iterable, d22.zzf);
    }

    static /* synthetic */ void K(D2 d22, String str) {
        str.getClass();
        d22.zze |= 1;
        d22.zzg = str;
    }

    public static a L() {
        return (a) zzc.w();
    }

    static /* synthetic */ void M(D2 d22) {
        d22.zzf = AbstractC2091c5.C();
    }

    static /* synthetic */ void N(D2 d22, String str) {
        str.getClass();
        d22.zze |= 2;
        d22.zzh = str;
    }

    private final void U() {
        InterfaceC2180l5 interfaceC2180l5 = this.zzf;
        if (!interfaceC2180l5.b()) {
            this.zzf = AbstractC2091c5.n(interfaceC2180l5);
        }
    }

    public final E2 H(int i8) {
        return (E2) this.zzf.get(0);
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzf;
    }

    public final boolean S() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzf.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new D2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", E2.class, "zzg", "zzh", "zzi", b.b()});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (D2.class) {
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
