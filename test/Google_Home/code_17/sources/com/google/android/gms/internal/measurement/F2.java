package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class F2 extends AbstractC2091c5 implements K5 {
    private static final F2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf = 1;
    private InterfaceC2180l5 zzg = AbstractC2091c5.C();

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(A2.a aVar) {
            l();
            F2.H((F2) this.f16584b, (A2) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        private a() {
            super(F2.zzc);
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2141h5 {
        RADS(1),
        PROVISIONING(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f16133a;

        b(int i8) {
            this.f16133a = i8;
        }

        public static b a(int i8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return null;
                }
                return PROVISIONING;
            }
            return RADS;
        }

        public static InterfaceC2131g5 b() {
            return Z2.f16525a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16133a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2141h5
        public final int w() {
            return this.f16133a;
        }
    }

    static {
        F2 f22 = new F2();
        zzc = f22;
        AbstractC2091c5.r(F2.class, f22);
    }

    private F2() {
    }

    public static a G() {
        return (a) zzc.w();
    }

    static /* synthetic */ void H(F2 f22, A2 a22) {
        a22.getClass();
        InterfaceC2180l5 interfaceC2180l5 = f22.zzg;
        if (!interfaceC2180l5.b()) {
            f22.zzg = AbstractC2091c5.n(interfaceC2180l5);
        }
        f22.zzg.add(a22);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new F2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", b.b(), "zzg", A2.class});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (F2.class) {
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
