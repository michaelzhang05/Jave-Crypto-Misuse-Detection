package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class I1 extends AbstractC2091c5 implements K5 {
    private static final I1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private L1 zzf;
    private J1 zzg;
    private boolean zzh;
    private String zzi = "";

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(String str) {
            l();
            I1.H((I1) this.f16584b, str);
            return this;
        }

        private a() {
            super(I1.zzc);
        }
    }

    static {
        I1 i12 = new I1();
        zzc = i12;
        AbstractC2091c5.r(I1.class, i12);
    }

    private I1() {
    }

    static /* synthetic */ void H(I1 i12, String str) {
        str.getClass();
        i12.zze |= 8;
        i12.zzi = str;
    }

    public static I1 I() {
        return zzc;
    }

    public final J1 J() {
        J1 j12 = this.zzg;
        if (j12 == null) {
            return J1.I();
        }
        return j12;
    }

    public final L1 K() {
        L1 l12 = this.zzf;
        if (l12 == null) {
            return L1.I();
        }
        return l12;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (F1.f16129a[i8 - 1]) {
            case 1:
                return new I1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (I1.class) {
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
