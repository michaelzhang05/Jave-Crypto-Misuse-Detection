package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.B2;
import j$.util.DesugarCollections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2302z2 extends AbstractC2091c5 implements K5 {
    private static final C2302z2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private InterfaceC2180l5 zzf = AbstractC2091c5.C();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* renamed from: com.google.android.gms.internal.measurement.z2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final long A() {
            return ((C2302z2) this.f16584b).Q();
        }

        public final a B(long j8) {
            l();
            C2302z2.P((C2302z2) this.f16584b, j8);
            return this;
        }

        public final B2 C(int i8) {
            return ((C2302z2) this.f16584b).G(i8);
        }

        public final long D() {
            return ((C2302z2) this.f16584b).R();
        }

        public final a E() {
            l();
            C2302z2.H((C2302z2) this.f16584b);
            return this;
        }

        public final String F() {
            return ((C2302z2) this.f16584b).U();
        }

        public final List G() {
            return DesugarCollections.unmodifiableList(((C2302z2) this.f16584b).V());
        }

        public final boolean H() {
            return ((C2302z2) this.f16584b).Y();
        }

        public final int o() {
            return ((C2302z2) this.f16584b).O();
        }

        public final a p(int i8) {
            l();
            C2302z2.I((C2302z2) this.f16584b, i8);
            return this;
        }

        public final a q(int i8, B2.a aVar) {
            l();
            C2302z2.J((C2302z2) this.f16584b, i8, (B2) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final a r(int i8, B2 b22) {
            l();
            C2302z2.J((C2302z2) this.f16584b, i8, b22);
            return this;
        }

        public final a s(long j8) {
            l();
            C2302z2.K((C2302z2) this.f16584b, j8);
            return this;
        }

        public final a t(B2.a aVar) {
            l();
            C2302z2.L((C2302z2) this.f16584b, (B2) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final a w(B2 b22) {
            l();
            C2302z2.L((C2302z2) this.f16584b, b22);
            return this;
        }

        public final a x(Iterable iterable) {
            l();
            C2302z2.M((C2302z2) this.f16584b, iterable);
            return this;
        }

        public final a z(String str) {
            l();
            C2302z2.N((C2302z2) this.f16584b, str);
            return this;
        }

        private a() {
            super(C2302z2.zzc);
        }
    }

    static {
        C2302z2 c2302z2 = new C2302z2();
        zzc = c2302z2;
        AbstractC2091c5.r(C2302z2.class, c2302z2);
    }

    private C2302z2() {
    }

    static /* synthetic */ void H(C2302z2 c2302z2) {
        c2302z2.zzf = AbstractC2091c5.C();
    }

    static /* synthetic */ void I(C2302z2 c2302z2, int i8) {
        c2302z2.Z();
        c2302z2.zzf.remove(i8);
    }

    static /* synthetic */ void J(C2302z2 c2302z2, int i8, B2 b22) {
        b22.getClass();
        c2302z2.Z();
        c2302z2.zzf.set(i8, b22);
    }

    static /* synthetic */ void K(C2302z2 c2302z2, long j8) {
        c2302z2.zze |= 4;
        c2302z2.zzi = j8;
    }

    static /* synthetic */ void L(C2302z2 c2302z2, B2 b22) {
        b22.getClass();
        c2302z2.Z();
        c2302z2.zzf.add(b22);
    }

    static /* synthetic */ void M(C2302z2 c2302z2, Iterable iterable) {
        c2302z2.Z();
        AbstractC2160j4.f(iterable, c2302z2.zzf);
    }

    static /* synthetic */ void N(C2302z2 c2302z2, String str) {
        str.getClass();
        c2302z2.zze |= 1;
        c2302z2.zzg = str;
    }

    static /* synthetic */ void P(C2302z2 c2302z2, long j8) {
        c2302z2.zze |= 2;
        c2302z2.zzh = j8;
    }

    public static a S() {
        return (a) zzc.w();
    }

    private final void Z() {
        InterfaceC2180l5 interfaceC2180l5 = this.zzf;
        if (!interfaceC2180l5.b()) {
            this.zzf = AbstractC2091c5.n(interfaceC2180l5);
        }
    }

    public final B2 G(int i8) {
        return (B2) this.zzf.get(i8);
    }

    public final int O() {
        return this.zzf.size();
    }

    public final long Q() {
        return this.zzi;
    }

    public final long R() {
        return this.zzh;
    }

    public final String U() {
        return this.zzg;
    }

    public final List V() {
        return this.zzf;
    }

    public final boolean W() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new C2302z2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", B2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2302z2.class) {
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
