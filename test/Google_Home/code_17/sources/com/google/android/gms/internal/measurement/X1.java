package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class X1 extends AbstractC2091c5 implements K5 {
    private static final X1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final int o() {
            return ((X1) this.f16584b).j();
        }

        public final a p(String str) {
            l();
            X1.G((X1) this.f16584b, str);
            return this;
        }

        public final String q() {
            return ((X1) this.f16584b).I();
        }

        public final boolean r() {
            return ((X1) this.f16584b).J();
        }

        public final boolean s() {
            return ((X1) this.f16584b).K();
        }

        public final boolean t() {
            return ((X1) this.f16584b).L();
        }

        public final boolean w() {
            return ((X1) this.f16584b).M();
        }

        public final boolean x() {
            return ((X1) this.f16584b).N();
        }

        private a() {
            super(X1.zzc);
        }
    }

    static {
        X1 x12 = new X1();
        zzc = x12;
        AbstractC2091c5.r(X1.class, x12);
    }

    private X1() {
    }

    static /* synthetic */ void G(X1 x12, String str) {
        str.getClass();
        x12.zze |= 1;
        x12.zzf = str;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (U1.f16343a[i8 - 1]) {
            case 1:
                return new X1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (X1.class) {
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
