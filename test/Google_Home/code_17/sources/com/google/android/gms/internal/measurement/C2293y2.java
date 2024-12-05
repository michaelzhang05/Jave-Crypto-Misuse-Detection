package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;

/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2293y2 extends AbstractC2091c5 implements K5 {
    private static final C2293y2 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.y2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        public final a o(int i8) {
            l();
            C2293y2.G((C2293y2) this.f16584b, i8);
            return this;
        }

        public final a p(long j8) {
            l();
            C2293y2.H((C2293y2) this.f16584b, j8);
            return this;
        }

        private a() {
            super(C2293y2.zzc);
        }
    }

    static {
        C2293y2 c2293y2 = new C2293y2();
        zzc = c2293y2;
        AbstractC2091c5.r(C2293y2.class, c2293y2);
    }

    private C2293y2() {
    }

    static /* synthetic */ void G(C2293y2 c2293y2, int i8) {
        c2293y2.zze |= 1;
        c2293y2.zzf = i8;
    }

    static /* synthetic */ void H(C2293y2 c2293y2, long j8) {
        c2293y2.zze |= 2;
        c2293y2.zzg = j8;
    }

    public static a J() {
        return (a) zzc.w();
    }

    public final long I() {
        return this.zzg;
    }

    public final boolean L() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean M() {
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
        switch (AbstractC2248t2.f16848a[i8 - 1]) {
            case 1:
                return new C2293y2();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2293y2.class) {
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
