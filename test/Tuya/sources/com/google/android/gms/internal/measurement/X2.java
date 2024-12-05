package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class X2 {

    /* renamed from: g, reason: collision with root package name */
    private static volatile U2 f15612g;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f15616k = 0;

    /* renamed from: a, reason: collision with root package name */
    final T2 f15617a;

    /* renamed from: b, reason: collision with root package name */
    final String f15618b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f15619c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f15620d = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f15621e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f15611f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReference f15613h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    private static final Z2 f15614i = new Z2(new Object() { // from class: com.google.android.gms.internal.measurement.O2
    });

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f15615j = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ X2(T2 t22, String str, Object obj, boolean z8, W2 w22) {
        if (t22.f15558a != null) {
            this.f15617a = t22;
            this.f15618b = str;
            this.f15619c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void c() {
        f15615j.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.U2 r0 = com.google.android.gms.internal.measurement.X2.f15612g
            if (r0 != 0) goto L4b
            if (r3 != 0) goto L7
            goto L4b
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.X2.f15611f
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.U2 r1 = com.google.android.gms.internal.measurement.X2.f15612g     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L47
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.measurement.U2 r1 = com.google.android.gms.internal.measurement.X2.f15612g     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r1 == r3) goto L41
            goto L23
        L21:
            r3 = move-exception
            goto L43
        L23:
            com.google.android.gms.internal.measurement.B2.e()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.Y2.c()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.I2.e()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.N2 r1 = new com.google.android.gms.internal.measurement.N2     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.i3 r1 = com.google.android.gms.internal.measurement.AbstractC2056n3.a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.y2 r2 = new com.google.android.gms.internal.measurement.y2     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.X2.f15612g = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.X2.f15615j     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L47
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L45
        L45:
            r3 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r3
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.X2.d(android.content.Context):void");
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.X2.f15615j
            int r0 = r0.get()
            int r1 = r8.f15620d
            if (r1 >= r0) goto Lca
            monitor-enter(r8)
            int r1 = r8.f15620d     // Catch: java.lang.Throwable -> L3b
            if (r1 >= r0) goto Lc6
            com.google.android.gms.internal.measurement.U2 r1 = com.google.android.gms.internal.measurement.X2.f15612g     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.e3 r2 = com.google.android.gms.internal.measurement.AbstractC1981e3.c()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            if (r1 == 0) goto L3e
            com.google.android.gms.internal.measurement.i3 r2 = r1.b()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.e3 r2 = (com.google.android.gms.internal.measurement.AbstractC1981e3) r2     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.C2 r4 = (com.google.android.gms.internal.measurement.C2) r4     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.T2 r5 = r8.f15617a     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r6 = r5.f15558a     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r5.f15560c     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = r8.f15618b     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.a(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            goto Lc8
        L3e:
            r4 = r3
        L3f:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto Lc0
            com.google.android.gms.internal.measurement.T2 r5 = r8.f15617a     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r5 = r5.f15558a     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L68
            android.content.Context r6 = r1.a()     // Catch: java.lang.Throwable -> L3b
            boolean r5 = com.google.android.gms.internal.measurement.K2.a(r6, r5)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L66
            android.content.Context r5 = r1.a()     // Catch: java.lang.Throwable -> L3b
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.T2 r6 = r8.f15617a     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r6 = r6.f15558a     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.M2 r7 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.M2
                static {
                    /*
                        com.google.android.gms.internal.measurement.M2 r0 = new com.google.android.gms.internal.measurement.M2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.measurement.M2) com.google.android.gms.internal.measurement.M2.a com.google.android.gms.internal.measurement.M2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M2.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.measurement.X2.c()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.M2.run():void");
                }
            }     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.B2 r5 = com.google.android.gms.internal.measurement.B2.b(r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            goto L72
        L66:
            r5 = r3
            goto L72
        L68:
            android.content.Context r5 = r1.a()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.M2 r6 = com.google.android.gms.internal.measurement.M2.f15394a     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.Y2.b(r5, r3, r6)     // Catch: java.lang.Throwable -> L3b
            goto L66
        L72:
            if (r5 == 0) goto L81
            java.lang.String r6 = r8.f15618b     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L81
            java.lang.Object r5 = r8.a(r5)     // Catch: java.lang.Throwable -> L3b
            goto L82
        L81:
            r5 = r3
        L82:
            if (r5 != 0) goto Lac
            com.google.android.gms.internal.measurement.T2 r5 = r8.f15617a     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.f15561d     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto La6
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.I2 r1 = com.google.android.gms.internal.measurement.I2.b(r1)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.measurement.T2 r5 = r8.f15617a     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.f15561d     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L9a
            r5 = r3
            goto L9c
        L9a:
            java.lang.String r5 = r8.f15618b     // Catch: java.lang.Throwable -> L3b
        L9c:
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto La6
            java.lang.Object r3 = r8.a(r1)     // Catch: java.lang.Throwable -> L3b
        La6:
            if (r3 != 0) goto Lab
            java.lang.Object r5 = r8.f15619c     // Catch: java.lang.Throwable -> L3b
            goto Lac
        Lab:
            r5 = r3
        Lac:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Lbb
            if (r4 != 0) goto Lb7
            java.lang.Object r5 = r8.f15619c     // Catch: java.lang.Throwable -> L3b
            goto Lbb
        Lb7:
            java.lang.Object r5 = r8.a(r4)     // Catch: java.lang.Throwable -> L3b
        Lbb:
            r8.f15621e = r5     // Catch: java.lang.Throwable -> L3b
            r8.f15620d = r0     // Catch: java.lang.Throwable -> L3b
            goto Lc6
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        Lc6:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            goto Lca
        Lc8:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            throw r0
        Lca:
            java.lang.Object r0 = r8.f15621e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.X2.b():java.lang.Object");
    }
}
