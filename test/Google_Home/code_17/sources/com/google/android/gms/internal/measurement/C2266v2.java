package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2266v2 extends AbstractC2091c5 implements K5 {
    private static final C2266v2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* renamed from: com.google.android.gms.internal.measurement.v2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(C2266v2.zzc);
        }
    }

    static {
        C2266v2 c2266v2 = new C2266v2();
        zzc = c2266v2;
        AbstractC2091c5.r(C2266v2.class, c2266v2);
    }

    private C2266v2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new C2266v2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2266v2.class) {
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
