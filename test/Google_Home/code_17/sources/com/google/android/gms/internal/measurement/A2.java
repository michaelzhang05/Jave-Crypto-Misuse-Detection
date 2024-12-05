package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class A2 extends AbstractC2091c5 implements K5 {
    private static final A2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(long j8) {
            l();
            A2.H((A2) this.f16584b, j8);
            return this;
        }

        public final a p(String str) {
            l();
            A2.I((A2) this.f16584b, str);
            return this;
        }

        private a() {
            super(A2.zzc);
        }
    }

    static {
        A2 a22 = new A2();
        zzc = a22;
        AbstractC2091c5.r(A2.class, a22);
    }

    private A2() {
    }

    public static a G() {
        return (a) zzc.w();
    }

    static /* synthetic */ void H(A2 a22, long j8) {
        a22.zze |= 2;
        a22.zzg = j8;
    }

    static /* synthetic */ void I(A2 a22, String str) {
        str.getClass();
        a22.zze |= 1;
        a22.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new A2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (A2.class) {
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
