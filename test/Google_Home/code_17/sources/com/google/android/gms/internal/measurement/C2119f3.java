package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2119f3 extends AbstractC2091c5 implements K5 {
    private static final C2119f3 zzc;
    private static volatile P5 zzd;
    private int zze;
    private int zzf;
    private InterfaceC2180l5 zzg = AbstractC2091c5.C();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* renamed from: com.google.android.gms.internal.measurement.f3$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(C2119f3.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f3$b */
    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2141h5 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16635a;

        b(int i8) {
            this.f16635a = i8;
        }

        public static b a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                return null;
                            }
                            return STATEMENT;
                        }
                        return BOOLEAN;
                    }
                    return NUMBER;
                }
                return STRING;
            }
            return UNKNOWN;
        }

        public static InterfaceC2131g5 b() {
            return C2196n3.f16735a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16635a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2141h5
        public final int w() {
            return this.f16635a;
        }
    }

    static {
        C2119f3 c2119f3 = new C2119f3();
        zzc = c2119f3;
        AbstractC2091c5.r(C2119f3.class, c2119f3);
    }

    private C2119f3() {
    }

    public final double G() {
        return this.zzk;
    }

    public final b H() {
        b a8 = b.a(this.zzf);
        if (a8 == null) {
            return b.UNKNOWN;
        }
        return a8;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2139h3.f16658a[i8 - 1]) {
            case 1:
                return new C2119f3();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.b(), "zzg", C2119f3.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2119f3.class) {
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
