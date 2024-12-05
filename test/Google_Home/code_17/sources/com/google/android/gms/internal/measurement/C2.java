package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* loaded from: classes3.dex */
public final class C2 extends AbstractC2091c5 implements K5 {
    private static final C2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C2266v2 zzh;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(C2.zzc);
        }
    }

    static {
        C2 c22 = new C2();
        zzc = c22;
        AbstractC2091c5.r(C2.class, c22);
    }

    private C2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new C2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2.class) {
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
