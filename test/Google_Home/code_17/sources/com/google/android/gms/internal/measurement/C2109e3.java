package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2109e3 extends AbstractC2091c5 implements K5 {
    private static final C2109e3 zzc;
    private static volatile P5 zzd;
    private int zze;
    private InterfaceC2180l5 zzf = AbstractC2091c5.C();
    private C2089c3 zzg;

    /* renamed from: com.google.android.gms.internal.measurement.e3$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(C2109e3.zzc);
        }
    }

    static {
        C2109e3 c2109e3 = new C2109e3();
        zzc = c2109e3;
        AbstractC2091c5.r(C2109e3.class, c2109e3);
    }

    private C2109e3() {
    }

    public final C2089c3 G() {
        C2089c3 c2089c3 = this.zzg;
        if (c2089c3 == null) {
            return C2089c3.H();
        }
        return c2089c3;
    }

    public final List I() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2139h3.f16658a[i8 - 1]) {
            case 1:
                return new C2109e3();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C2119f3.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2109e3.class) {
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
