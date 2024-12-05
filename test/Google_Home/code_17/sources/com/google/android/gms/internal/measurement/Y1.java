package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.X1;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Y1 extends AbstractC2091c5 implements K5 {
    private static final Y1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private V1 zzr;
    private C2068a2 zzs;
    private C2098d2 zzt;
    private C2078b2 zzu;
    private Z1 zzv;
    private String zzg = "";
    private InterfaceC2180l5 zzi = AbstractC2091c5.C();
    private InterfaceC2180l5 zzj = AbstractC2091c5.C();
    private InterfaceC2180l5 zzk = AbstractC2091c5.C();
    private String zzl = "";
    private InterfaceC2180l5 zzn = AbstractC2091c5.C();
    private InterfaceC2180l5 zzo = AbstractC2091c5.C();
    private String zzp = "";
    private String zzq = "";

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final int o() {
            return ((Y1) this.f16584b).J();
        }

        public final X1 p(int i8) {
            return ((Y1) this.f16584b).G(i8);
        }

        public final a q(int i8, X1.a aVar) {
            l();
            Y1.I((Y1) this.f16584b, i8, (X1) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final a r() {
            l();
            Y1.H((Y1) this.f16584b);
            return this;
        }

        public final String s() {
            return ((Y1) this.f16584b).R();
        }

        public final List t() {
            return DesugarCollections.unmodifiableList(((Y1) this.f16584b).S());
        }

        public final List w() {
            return DesugarCollections.unmodifiableList(((Y1) this.f16584b).T());
        }

        private a() {
            super(Y1.zzc);
        }
    }

    static {
        Y1 y12 = new Y1();
        zzc = y12;
        AbstractC2091c5.r(Y1.class, y12);
    }

    private Y1() {
    }

    static /* synthetic */ void H(Y1 y12) {
        y12.zzk = AbstractC2091c5.C();
    }

    static /* synthetic */ void I(Y1 y12, int i8, X1 x12) {
        x12.getClass();
        InterfaceC2180l5 interfaceC2180l5 = y12.zzj;
        if (!interfaceC2180l5.b()) {
            y12.zzj = AbstractC2091c5.n(interfaceC2180l5);
        }
        y12.zzj.set(i8, x12);
    }

    public static a M() {
        return (a) zzc.w();
    }

    public static Y1 O() {
        return zzc;
    }

    public final X1 G(int i8) {
        return (X1) this.zzj.get(i8);
    }

    public final int J() {
        return this.zzj.size();
    }

    public final long K() {
        return this.zzf;
    }

    public final V1 L() {
        V1 v12 = this.zzr;
        if (v12 == null) {
            return V1.H();
        }
        return v12;
    }

    public final C2098d2 P() {
        C2098d2 c2098d2 = this.zzt;
        if (c2098d2 == null) {
            return C2098d2.H();
        }
        return c2098d2;
    }

    public final String Q() {
        return this.zzg;
    }

    public final String R() {
        return this.zzp;
    }

    public final List S() {
        return this.zzk;
    }

    public final List T() {
        return this.zzo;
    }

    public final List U() {
        return this.zzn;
    }

    public final List V() {
        return this.zzi;
    }

    public final boolean W() {
        return this.zzm;
    }

    public final boolean X() {
        if ((this.zze & 128) != 0) {
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

    public final boolean Z() {
        if ((this.zze & 512) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzn.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (U1.f16343a[i8 - 1]) {
            case 1:
                return new Y1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C2088c2.class, "zzj", X1.class, "zzk", G1.class, "zzl", "zzm", "zzn", C2109e3.class, "zzo", W1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (Y1.class) {
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
