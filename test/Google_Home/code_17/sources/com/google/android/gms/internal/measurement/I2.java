package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class I2 extends AbstractC2091c5 implements K5 {
    private static final I2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o() {
            l();
            I2.H((I2) this.f16584b);
            return this;
        }

        public final a p(double d8) {
            l();
            I2.I((I2) this.f16584b, d8);
            return this;
        }

        public final a q(long j8) {
            l();
            I2.J((I2) this.f16584b, j8);
            return this;
        }

        public final a r(String str) {
            l();
            I2.K((I2) this.f16584b, str);
            return this;
        }

        public final a s() {
            l();
            I2.M((I2) this.f16584b);
            return this;
        }

        public final a t(long j8) {
            l();
            I2.N((I2) this.f16584b, j8);
            return this;
        }

        public final a w(String str) {
            l();
            I2.O((I2) this.f16584b, str);
            return this;
        }

        public final a x() {
            l();
            I2.Q((I2) this.f16584b);
            return this;
        }

        private a() {
            super(I2.zzc);
        }
    }

    static {
        I2 i22 = new I2();
        zzc = i22;
        AbstractC2091c5.r(I2.class, i22);
    }

    private I2() {
    }

    static /* synthetic */ void H(I2 i22) {
        i22.zze &= -33;
        i22.zzk = 0.0d;
    }

    static /* synthetic */ void I(I2 i22, double d8) {
        i22.zze |= 32;
        i22.zzk = d8;
    }

    static /* synthetic */ void J(I2 i22, long j8) {
        i22.zze |= 8;
        i22.zzi = j8;
    }

    static /* synthetic */ void K(I2 i22, String str) {
        str.getClass();
        i22.zze |= 2;
        i22.zzg = str;
    }

    static /* synthetic */ void M(I2 i22) {
        i22.zze &= -9;
        i22.zzi = 0L;
    }

    static /* synthetic */ void N(I2 i22, long j8) {
        i22.zze |= 1;
        i22.zzf = j8;
    }

    static /* synthetic */ void O(I2 i22, String str) {
        str.getClass();
        i22.zze |= 4;
        i22.zzh = str;
    }

    static /* synthetic */ void Q(I2 i22) {
        i22.zze &= -5;
        i22.zzh = zzc.zzh;
    }

    public static a S() {
        return (a) zzc.w();
    }

    public final double G() {
        return this.zzk;
    }

    public final float L() {
        return this.zzj;
    }

    public final long P() {
        return this.zzi;
    }

    public final long R() {
        return this.zzf;
    }

    public final String U() {
        return this.zzg;
    }

    public final String V() {
        return this.zzh;
    }

    public final boolean W() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new I2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (I2.class) {
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
