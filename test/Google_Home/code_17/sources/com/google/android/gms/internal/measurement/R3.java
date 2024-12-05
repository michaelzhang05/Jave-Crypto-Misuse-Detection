package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import w0.InterfaceC4120c;

/* loaded from: classes3.dex */
public abstract class R3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f16257h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile Y3 f16258i;

    /* renamed from: j, reason: collision with root package name */
    private static C2100d4 f16259j;

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f16260k;

    /* renamed from: a, reason: collision with root package name */
    private final Z3 f16261a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16262b;

    /* renamed from: c, reason: collision with root package name */
    private Object f16263c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f16264d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f16265e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16266f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f16267g;

    static {
        new AtomicReference();
        f16259j = new C2100d4(new InterfaceC2130g4() { // from class: com.google.android.gms.internal.measurement.S3
            @Override // com.google.android.gms.internal.measurement.InterfaceC2130g4
            public final boolean w() {
                return R3.n();
            }
        });
        f16260k = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ R3 a(Z3 z32, String str, Boolean bool, boolean z8) {
        return new U3(z32, str, bool, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ R3 b(Z3 z32, String str, Double d8, boolean z8) {
        return new X3(z32, str, d8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ R3 c(Z3 z32, String str, Long l8, boolean z8) {
        return new V3(z32, str, l8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ R3 d(Z3 z32, String str, String str2, boolean z8) {
        return new W3(z32, str, str2, true);
    }

    private final Object f(Y3 y32) {
        InterfaceC4120c interfaceC4120c;
        String h8;
        Z3 z32 = this.f16261a;
        if (!z32.f16530e && ((interfaceC4120c = z32.f16534i) == null || ((Boolean) interfaceC4120c.apply(y32.a())).booleanValue())) {
            K3 a8 = K3.a(y32.a());
            Z3 z33 = this.f16261a;
            if (z33.f16530e) {
                h8 = null;
            } else {
                h8 = h(z33.f16528c);
            }
            Object c8 = a8.c(h8);
            if (c8 != null) {
                return g(c8);
            }
        }
        return null;
    }

    private final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.f16262b;
        }
        return str + this.f16262b;
    }

    private final Object j(Y3 y32) {
        F3 b8;
        Object c8;
        if (this.f16261a.f16527b != null) {
            if (P3.b(y32.a(), this.f16261a.f16527b)) {
                if (this.f16261a.f16533h) {
                    b8 = D3.a(y32.a().getContentResolver(), O3.a(O3.b(y32.a(), this.f16261a.f16527b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.Q3
                        @Override // java.lang.Runnable
                        public final void run() {
                            R3.m();
                        }
                    });
                } else {
                    b8 = D3.a(y32.a().getContentResolver(), this.f16261a.f16527b, new Runnable() { // from class: com.google.android.gms.internal.measurement.Q3
                        @Override // java.lang.Runnable
                        public final void run() {
                            R3.m();
                        }
                    });
                }
            } else {
                b8 = null;
            }
        } else {
            b8 = C2080b4.b(y32.a(), this.f16261a.f16526a, new Runnable() { // from class: com.google.android.gms.internal.measurement.Q3
                @Override // java.lang.Runnable
                public final void run() {
                    R3.m();
                }
            });
        }
        if (b8 == null || (c8 = b8.c(k())) == null) {
            return null;
        }
        return g(c8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.Y3 r0 = com.google.android.gms.internal.measurement.R3.f16258i
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.R3.f16257h
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.Y3 r1 = com.google.android.gms.internal.measurement.R3.f16258i     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.Y3 r1 = com.google.android.gms.internal.measurement.R3.f16258i     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.D3.e()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C2080b4.d()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.K3.b()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.T3 r1 = new com.google.android.gms.internal.measurement.T3     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            w0.k r1 = w0.l.a(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.y3 r2 = new com.google.android.gms.internal.measurement.y3     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.R3.f16258i = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.R3.f16260k     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R3.l(android.content.Context):void");
    }

    public static void m() {
        f16260k.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean n() {
        return true;
    }

    private final Object o() {
        return this.f16263c;
    }

    public final Object e() {
        boolean z8;
        Object j8;
        if (!this.f16266f) {
            w0.h.o(f16259j.a(this.f16262b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i8 = f16260k.get();
        if (this.f16264d < i8) {
            synchronized (this) {
                try {
                    if (this.f16264d < i8) {
                        Y3 y32 = f16258i;
                        w0.g a8 = w0.g.a();
                        String str = null;
                        if (y32 != null) {
                            a8 = (w0.g) y32.b().get();
                            if (a8.c()) {
                                L3 l32 = (L3) a8.b();
                                Z3 z32 = this.f16261a;
                                str = l32.a(z32.f16527b, z32.f16526a, z32.f16529d, this.f16262b);
                            }
                        }
                        if (y32 != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        w0.h.o(z8, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (!this.f16261a.f16531f ? (j8 = j(y32)) == null && (j8 = f(y32)) == null : (j8 = f(y32)) == null && (j8 = j(y32)) == null) {
                            j8 = o();
                        }
                        if (a8.c()) {
                            if (str == null) {
                                j8 = o();
                            } else {
                                j8 = g(str);
                            }
                        }
                        this.f16265e = j8;
                        this.f16264d = i8;
                    }
                } finally {
                }
            }
        }
        return this.f16265e;
    }

    abstract Object g(Object obj);

    public final String k() {
        return h(this.f16261a.f16529d);
    }

    private R3(Z3 z32, String str, Object obj, boolean z8) {
        this.f16264d = -1;
        String str2 = z32.f16526a;
        if (str2 == null && z32.f16527b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && z32.f16527b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f16261a = z32;
        this.f16262b = str;
        this.f16263c = obj;
        this.f16266f = z8;
        this.f16267g = false;
    }
}
