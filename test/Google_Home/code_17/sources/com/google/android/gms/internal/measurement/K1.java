package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class K1 extends AbstractC2091c5 implements K5 {
    private static final K1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private I1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(String str) {
            l();
            K1.G((K1) this.f16584b, str);
            return this;
        }

        private a() {
            super(K1.zzc);
        }
    }

    static {
        K1 k12 = new K1();
        zzc = k12;
        AbstractC2091c5.r(K1.class, k12);
    }

    private K1() {
    }

    static /* synthetic */ void G(K1 k12, String str) {
        str.getClass();
        k12.zze |= 2;
        k12.zzg = str;
    }

    public static a I() {
        return (a) zzc.w();
    }

    public final I1 H() {
        I1 i12 = this.zzh;
        if (i12 == null) {
            return I1.I();
        }
        return i12;
    }

    public final String K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean O() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 32) != 0) {
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
        switch (F1.f16129a[i8 - 1]) {
            case 1:
                return new K1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (K1.class) {
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
