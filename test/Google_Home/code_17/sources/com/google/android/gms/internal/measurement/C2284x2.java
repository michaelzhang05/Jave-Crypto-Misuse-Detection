package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.G2;

/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2284x2 extends AbstractC2091c5 implements K5 {
    private static final C2284x2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private G2 zzg;
    private G2 zzh;
    private boolean zzi;

    /* renamed from: com.google.android.gms.internal.measurement.x2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(int i8) {
            l();
            C2284x2.G((C2284x2) this.f16584b, i8);
            return this;
        }

        public final a p(G2.a aVar) {
            l();
            C2284x2.H((C2284x2) this.f16584b, (G2) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final a q(G2 g22) {
            l();
            C2284x2.K((C2284x2) this.f16584b, g22);
            return this;
        }

        public final a r(boolean z8) {
            l();
            C2284x2.I((C2284x2) this.f16584b, z8);
            return this;
        }

        private a() {
            super(C2284x2.zzc);
        }
    }

    static {
        C2284x2 c2284x2 = new C2284x2();
        zzc = c2284x2;
        AbstractC2091c5.r(C2284x2.class, c2284x2);
    }

    private C2284x2() {
    }

    static /* synthetic */ void G(C2284x2 c2284x2, int i8) {
        c2284x2.zze |= 1;
        c2284x2.zzf = i8;
    }

    static /* synthetic */ void H(C2284x2 c2284x2, G2 g22) {
        g22.getClass();
        c2284x2.zzg = g22;
        c2284x2.zze |= 2;
    }

    static /* synthetic */ void I(C2284x2 c2284x2, boolean z8) {
        c2284x2.zze |= 8;
        c2284x2.zzi = z8;
    }

    public static a J() {
        return (a) zzc.w();
    }

    static /* synthetic */ void K(C2284x2 c2284x2, G2 g22) {
        g22.getClass();
        c2284x2.zzh = g22;
        c2284x2.zze |= 4;
    }

    public final G2 M() {
        G2 g22 = this.zzg;
        if (g22 == null) {
            return G2.T();
        }
        return g22;
    }

    public final G2 N() {
        G2 g22 = this.zzh;
        if (g22 == null) {
            return G2.T();
        }
        return g22;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new C2284x2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2284x2.class) {
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
