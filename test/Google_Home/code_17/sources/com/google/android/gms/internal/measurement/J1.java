package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class J1 extends AbstractC2091c5 implements K5 {
    private static final J1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(J1.zzc);
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2141h5 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16155a;

        b(int i8) {
            this.f16155a = i8;
        }

        public static b a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                return null;
                            }
                            return BETWEEN;
                        }
                        return EQUAL;
                    }
                    return GREATER_THAN;
                }
                return LESS_THAN;
            }
            return UNKNOWN_COMPARISON_TYPE;
        }

        public static InterfaceC2131g5 b() {
            return Q1.f16253a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16155a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2141h5
        public final int w() {
            return this.f16155a;
        }
    }

    static {
        J1 j12 = new J1();
        zzc = j12;
        AbstractC2091c5.r(J1.class, j12);
    }

    private J1() {
    }

    public static J1 I() {
        return zzc;
    }

    public final b G() {
        b a8 = b.a(this.zzf);
        if (a8 == null) {
            return b.UNKNOWN_COMPARISON_TYPE;
        }
        return a8;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzj;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (F1.f16129a[i8 - 1]) {
            case 1:
                return new J1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.b(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (J1.class) {
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
