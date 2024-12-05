package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2068a2 extends AbstractC2091c5 implements K5 {
    private static final C2068a2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* renamed from: com.google.android.gms.internal.measurement.a2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(C2068a2.zzc);
        }
    }

    static {
        C2068a2 c2068a2 = new C2068a2();
        zzc = c2068a2;
        AbstractC2091c5.r(C2068a2.class, c2068a2);
    }

    private C2068a2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (U1.f16343a[i8 - 1]) {
            case 1:
                return new C2068a2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2068a2.class) {
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
