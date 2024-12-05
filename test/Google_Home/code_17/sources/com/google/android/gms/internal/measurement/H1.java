package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* loaded from: classes3.dex */
public final class H1 extends AbstractC2091c5 implements K5 {
    private static final H1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC2180l5 zzh = AbstractC2091c5.C();
    private boolean zzi;
    private J1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final int o() {
            return ((H1) this.f16584b).j();
        }

        public final a p(int i8, I1 i12) {
            l();
            H1.H((H1) this.f16584b, i8, i12);
            return this;
        }

        public final a q(String str) {
            l();
            H1.I((H1) this.f16584b, str);
            return this;
        }

        public final I1 r(int i8) {
            return ((H1) this.f16584b).G(i8);
        }

        public final String s() {
            return ((H1) this.f16584b).N();
        }

        private a() {
            super(H1.zzc);
        }
    }

    static {
        H1 h12 = new H1();
        zzc = h12;
        AbstractC2091c5.r(H1.class, h12);
    }

    private H1() {
    }

    static /* synthetic */ void H(H1 h12, int i8, I1 i12) {
        i12.getClass();
        InterfaceC2180l5 interfaceC2180l5 = h12.zzh;
        if (!interfaceC2180l5.b()) {
            h12.zzh = AbstractC2091c5.n(interfaceC2180l5);
        }
        h12.zzh.set(i8, i12);
    }

    static /* synthetic */ void I(H1 h12, String str) {
        str.getClass();
        h12.zze |= 2;
        h12.zzg = str;
    }

    public static a K() {
        return (a) zzc.w();
    }

    public final I1 G(int i8) {
        return (I1) this.zzh.get(i8);
    }

    public final int J() {
        return this.zzf;
    }

    public final J1 M() {
        J1 j12 = this.zzj;
        if (j12 == null) {
            return J1.I();
        }
        return j12;
    }

    public final String N() {
        return this.zzg;
    }

    public final List O() {
        return this.zzh;
    }

    public final boolean P() {
        return this.zzk;
    }

    public final boolean Q() {
        return this.zzl;
    }

    public final boolean R() {
        return this.zzm;
    }

    public final boolean S() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if ((this.zze & 64) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzh.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (F1.f16129a[i8 - 1]) {
            case 1:
                return new H1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", I1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (H1.class) {
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
