package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* loaded from: classes3.dex */
public final class H2 extends AbstractC2091c5 implements K5 {
    private static final H2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private InterfaceC2151i5 zzg = AbstractC2091c5.B();

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(int i8) {
            l();
            H2.H((H2) this.f16584b, i8);
            return this;
        }

        public final a p(Iterable iterable) {
            l();
            H2.I((H2) this.f16584b, iterable);
            return this;
        }

        private a() {
            super(H2.zzc);
        }
    }

    static {
        H2 h22 = new H2();
        zzc = h22;
        AbstractC2091c5.r(H2.class, h22);
    }

    private H2() {
    }

    static /* synthetic */ void H(H2 h22, int i8) {
        h22.zze |= 1;
        h22.zzf = i8;
    }

    static /* synthetic */ void I(H2 h22, Iterable iterable) {
        InterfaceC2151i5 interfaceC2151i5 = h22.zzg;
        if (!interfaceC2151i5.b()) {
            h22.zzg = AbstractC2091c5.m(interfaceC2151i5);
        }
        AbstractC2160j4.f(iterable, h22.zzg);
    }

    public static a K() {
        return (a) zzc.w();
    }

    public final long G(int i8) {
        return this.zzg.g(i8);
    }

    public final int J() {
        return this.zzf;
    }

    public final List M() {
        return this.zzg;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzg.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new H2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (H2.class) {
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
