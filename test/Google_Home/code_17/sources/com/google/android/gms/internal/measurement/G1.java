package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.K1;
import java.util.List;

/* loaded from: classes3.dex */
public final class G1 extends AbstractC2091c5 implements K5 {
    private static final G1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private InterfaceC2180l5 zzg = AbstractC2091c5.C();
    private InterfaceC2180l5 zzh = AbstractC2091c5.C();
    private boolean zzi;
    private boolean zzj;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final int o() {
            return ((G1) this.f16584b).J();
        }

        public final a p(int i8, H1.a aVar) {
            l();
            G1.H((G1) this.f16584b, i8, (H1) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final a q(int i8, K1.a aVar) {
            l();
            G1.I((G1) this.f16584b, i8, (K1) ((AbstractC2091c5) aVar.k()));
            return this;
        }

        public final H1 r(int i8) {
            return ((G1) this.f16584b).G(i8);
        }

        public final int s() {
            return ((G1) this.f16584b).L();
        }

        public final K1 t(int i8) {
            return ((G1) this.f16584b).K(i8);
        }

        private a() {
            super(G1.zzc);
        }
    }

    static {
        G1 g12 = new G1();
        zzc = g12;
        AbstractC2091c5.r(G1.class, g12);
    }

    private G1() {
    }

    static /* synthetic */ void H(G1 g12, int i8, H1 h12) {
        h12.getClass();
        InterfaceC2180l5 interfaceC2180l5 = g12.zzh;
        if (!interfaceC2180l5.b()) {
            g12.zzh = AbstractC2091c5.n(interfaceC2180l5);
        }
        g12.zzh.set(i8, h12);
    }

    static /* synthetic */ void I(G1 g12, int i8, K1 k12) {
        k12.getClass();
        InterfaceC2180l5 interfaceC2180l5 = g12.zzg;
        if (!interfaceC2180l5.b()) {
            g12.zzg = AbstractC2091c5.n(interfaceC2180l5);
        }
        g12.zzg.set(i8, k12);
    }

    public final H1 G(int i8) {
        return (H1) this.zzh.get(i8);
    }

    public final int J() {
        return this.zzh.size();
    }

    public final K1 K(int i8) {
        return (K1) this.zzg.get(i8);
    }

    public final int L() {
        return this.zzg.size();
    }

    public final List N() {
        return this.zzh;
    }

    public final List O() {
        return this.zzg;
    }

    public final boolean P() {
        if ((this.zze & 1) != 0) {
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
                return new G1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", K1.class, "zzh", H1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (G1.class) {
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
