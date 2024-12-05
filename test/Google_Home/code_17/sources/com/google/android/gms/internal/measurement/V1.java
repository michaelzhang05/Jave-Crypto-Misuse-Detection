package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* loaded from: classes3.dex */
public final class V1 extends AbstractC2091c5 implements K5 {
    private static final V1 zzc;
    private static volatile P5 zzd;
    private int zze;
    private boolean zzi;
    private InterfaceC2180l5 zzf = AbstractC2091c5.C();
    private InterfaceC2180l5 zzg = AbstractC2091c5.C();
    private InterfaceC2180l5 zzh = AbstractC2091c5.C();
    private InterfaceC2180l5 zzj = AbstractC2091c5.C();

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(V1.zzc);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC2091c5 implements K5 {
        private static final b zzc;
        private static volatile P5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public static final class a extends AbstractC2091c5.b implements K5 {
            private a() {
                super(b.zzc);
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            AbstractC2091c5.r(b.class, bVar);
        }

        private b() {
        }

        public final d H() {
            d a8 = d.a(this.zzg);
            if (a8 == null) {
                return d.CONSENT_STATUS_UNSPECIFIED;
            }
            return a8;
        }

        public final e I() {
            e a8 = e.a(this.zzf);
            if (a8 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a8;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
        public final Object o(int i8, Object obj, Object obj2) {
            switch (U1.f16343a[i8 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.b(), "zzg", d.b()});
                case 4:
                    return zzc;
                case 5:
                    P5 p52 = zzd;
                    if (p52 == null) {
                        synchronized (b.class) {
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

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC2091c5 implements K5 {
        private static final c zzc;
        private static volatile P5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public static final class a extends AbstractC2091c5.b implements K5 {
            private a() {
                super(c.zzc);
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            AbstractC2091c5.r(c.class, cVar);
        }

        private c() {
        }

        public final e H() {
            e a8 = e.a(this.zzg);
            if (a8 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a8;
        }

        public final e I() {
            e a8 = e.a(this.zzf);
            if (a8 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a8;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
        public final Object o(int i8, Object obj, Object obj2) {
            switch (U1.f16343a[i8 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.b(), "zzg", e.b()});
                case 4:
                    return zzc;
                case 5:
                    P5 p52 = zzd;
                    if (p52 == null) {
                        synchronized (c.class) {
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

    /* loaded from: classes3.dex */
    public enum d implements InterfaceC2141h5 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f16358a;

        d(int i8) {
            this.f16358a = i8;
        }

        public static d a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        return null;
                    }
                    return DENIED;
                }
                return GRANTED;
            }
            return CONSENT_STATUS_UNSPECIFIED;
        }

        public static InterfaceC2131g5 b() {
            return C2148i2.f16671a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16358a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2141h5
        public final int w() {
            return this.f16358a;
        }
    }

    /* loaded from: classes3.dex */
    public enum e implements InterfaceC2141h5 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16365a;

        e(int i8) {
            this.f16365a = i8;
        }

        public static e a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                return null;
                            }
                            return AD_PERSONALIZATION;
                        }
                        return AD_USER_DATA;
                    }
                    return ANALYTICS_STORAGE;
                }
                return AD_STORAGE;
            }
            return CONSENT_TYPE_UNSPECIFIED;
        }

        public static InterfaceC2131g5 b() {
            return C2158j2.f16686a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16365a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2141h5
        public final int w() {
            return this.f16365a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends AbstractC2091c5 implements K5 {
        private static final f zzc;
        private static volatile P5 zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes3.dex */
        public static final class a extends AbstractC2091c5.b implements K5 {
            private a() {
                super(f.zzc);
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            AbstractC2091c5.r(f.class, fVar);
        }

        private f() {
        }

        public final String H() {
            return this.zzf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
        public final Object o(int i8, Object obj, Object obj2) {
            switch (U1.f16343a[i8 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2091c5.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    P5 p52 = zzd;
                    if (p52 == null) {
                        synchronized (f.class) {
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

    static {
        V1 v12 = new V1();
        zzc = v12;
        AbstractC2091c5.r(V1.class, v12);
    }

    private V1() {
    }

    public static V1 H() {
        return zzc;
    }

    public final List I() {
        return this.zzh;
    }

    public final List J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final List L() {
        return this.zzj;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (U1.f16343a[i8 - 1]) {
            case 1:
                return new V1();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (V1.class) {
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
