package v4;

import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Context;
import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;
import u2.InterfaceC4057d;

/* renamed from: v4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4108g {

    /* renamed from: f, reason: collision with root package name */
    private static final a f40211f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f40212g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4057d f40213a;

    /* renamed from: b, reason: collision with root package name */
    private final C4104c f40214b;

    /* renamed from: c, reason: collision with root package name */
    private final C4106e f40215c;

    /* renamed from: d, reason: collision with root package name */
    private final C4103b f40216d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap f40217e;

    /* renamed from: v4.g$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40218a;

        /* renamed from: c, reason: collision with root package name */
        int f40220c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40218a = obj;
            this.f40220c |= Integer.MIN_VALUE;
            Object g8 = C4108g.this.g(null, 0, 0, this);
            if (g8 == T5.b.e()) {
                return g8;
            }
            return s.a(g8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40221a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40223c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40224d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f40225e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v4.g$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            int f40226a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4108g f40227b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f40228c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f40229d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f40230e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4108g c4108g, String str, int i8, int i9, S5.d dVar) {
                super(1, dVar);
                this.f40227b = c4108g;
                this.f40228c = str;
                this.f40229d = i8;
                this.f40230e = i9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(S5.d dVar) {
                return new a(this.f40227b, this.f40228c, this.f40229d, this.f40230e, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(S5.d dVar) {
                return ((a) create(dVar)).invokeSuspend(I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object k8;
                Object e8 = T5.b.e();
                int i8 = this.f40226a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        k8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    s j8 = this.f40227b.j(this.f40228c);
                    if (j8 != null || (j8 = this.f40227b.i(this.f40228c)) != null) {
                        k8 = j8.j();
                    } else {
                        C4108g c4108g = this.f40227b;
                        String str = this.f40228c;
                        int i9 = this.f40229d;
                        int i10 = this.f40230e;
                        this.f40226a = 1;
                        k8 = c4108g.k(str, i9, i10, this);
                        if (k8 == e8) {
                            return e8;
                        }
                    }
                }
                return s.a(k8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i8, int i9, S5.d dVar) {
            super(2, dVar);
            this.f40223c = str;
            this.f40224d = i8;
            this.f40225e = i9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f40223c, this.f40224d, this.f40225e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f40221a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C4108g c4108g = C4108g.this;
                String str = this.f40223c;
                a aVar = new a(c4108g, str, this.f40224d, this.f40225e, null);
                this.f40221a = 1;
                obj = c4108g.m(str, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40231a;

        /* renamed from: c, reason: collision with root package name */
        int f40233c;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40231a = obj;
            this.f40233c |= Integer.MIN_VALUE;
            Object h8 = C4108g.this.h(null, this);
            if (h8 == T5.b.e()) {
                return h8;
            }
            return s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40234a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40236c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v4.g$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            int f40237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4108g f40238b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f40239c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4108g c4108g, String str, S5.d dVar) {
                super(1, dVar);
                this.f40238b = c4108g;
                this.f40239c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(S5.d dVar) {
                return new a(this.f40238b, this.f40239c, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(S5.d dVar) {
                return ((a) create(dVar)).invokeSuspend(I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object l8;
                Object e8 = T5.b.e();
                int i8 = this.f40237a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        l8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    s j8 = this.f40238b.j(this.f40239c);
                    if (j8 != null || (j8 = this.f40238b.i(this.f40239c)) != null) {
                        l8 = j8.j();
                    } else {
                        C4108g c4108g = this.f40238b;
                        String str = this.f40239c;
                        this.f40237a = 1;
                        l8 = c4108g.l(str, this);
                        if (l8 == e8) {
                            return e8;
                        }
                    }
                }
                return s.a(l8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, S5.d dVar) {
            super(2, dVar);
            this.f40236c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f40236c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f40234a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C4108g c4108g = C4108g.this;
                String str = this.f40236c;
                a aVar = new a(c4108g, str, null);
                this.f40234a = 1;
                obj = c4108g.m(str, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40240a;

        /* renamed from: b, reason: collision with root package name */
        Object f40241b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40242c;

        /* renamed from: e, reason: collision with root package name */
        int f40244e;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40242c = obj;
            this.f40244e |= Integer.MIN_VALUE;
            Object k8 = C4108g.this.k(null, 0, 0, this);
            if (k8 == T5.b.e()) {
                return k8;
            }
            return s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0913g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40245a;

        /* renamed from: b, reason: collision with root package name */
        Object f40246b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40247c;

        /* renamed from: e, reason: collision with root package name */
        int f40249e;

        C0913g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40247c = obj;
            this.f40249e |= Integer.MIN_VALUE;
            Object l8 = C4108g.this.l(null, this);
            if (l8 == T5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.g$h */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40250a;

        /* renamed from: b, reason: collision with root package name */
        Object f40251b;

        /* renamed from: c, reason: collision with root package name */
        Object f40252c;

        /* renamed from: d, reason: collision with root package name */
        Object f40253d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40254e;

        /* renamed from: g, reason: collision with root package name */
        int f40256g;

        h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40254e = obj;
            this.f40256g |= Integer.MIN_VALUE;
            return C4108g.this.m(null, null, this);
        }
    }

    public C4108g(Context context, InterfaceC4057d logger, C4104c c4104c, C4106e networkImageDecoder, C4103b c4103b) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(networkImageDecoder, "networkImageDecoder");
        this.f40213a = logger;
        this.f40214b = c4104c;
        this.f40215c = networkImageDecoder;
        this.f40216d = c4103b;
        this.f40217e = new ConcurrentHashMap();
    }

    private final void f(String str) {
        this.f40213a.b("StripeImageLoader: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s i(String str) {
        Bitmap bitmap;
        C4103b c4103b = this.f40216d;
        if (c4103b != null) {
            bitmap = c4103b.e(str);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            f("Image loaded from disk cache");
        } else {
            f("Image not found on disk cache");
        }
        if (bitmap == null) {
            return null;
        }
        C4104c c4104c = this.f40214b;
        if (c4104c != null) {
            c4104c.b(str, bitmap);
        }
        return s.a(s.b(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s j(String str) {
        Bitmap bitmap;
        C4104c c4104c = this.f40214b;
        if (c4104c != null) {
            bitmap = c4104c.a(str);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            f("Image loaded from memory cache");
        } else {
            f("Image not found on memory cache");
        }
        if (bitmap == null) {
            return null;
        }
        C4103b c4103b = this.f40216d;
        if (c4103b != null) {
            c4103b.h(str, bitmap);
        }
        return s.a(s.b(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0079, B:14:0x007d, B:16:0x0081, B:17:0x0084, B:19:0x0088, B:20:0x008d), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r5, int r6, int r7, S5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof v4.C4108g.f
            if (r0 == 0) goto L13
            r0 = r8
            v4.g$f r0 = (v4.C4108g.f) r0
            int r1 = r0.f40244e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40244e = r1
            goto L18
        L13:
            v4.g$f r0 = new v4.g$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40242c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f40244e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f40241b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.f40240a
            v4.g r6 = (v4.C4108g) r6
            O5.t.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L79
        L31:
            r5 = move-exception
            goto L94
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            O5.t.b(r8)
            O5.s$a r8 = O5.s.f8302b     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r8.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = "Image "
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            r8.append(r5)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = " loading from internet ("
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            r8.append(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = " x "
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            r8.append(r7)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = ")"
            r8.append(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L92
            r4.f(r8)     // Catch: java.lang.Throwable -> L92
            v4.e r8 = r4.f40215c     // Catch: java.lang.Throwable -> L92
            r0.f40240a = r4     // Catch: java.lang.Throwable -> L92
            r0.f40241b = r5     // Catch: java.lang.Throwable -> L92
            r0.f40244e = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = r8.c(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L92
            if (r8 != r1) goto L78
            return r1
        L78:
            r6 = r4
        L79:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L8c
            v4.b r7 = r6.f40216d     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L84
            r7.h(r5, r8)     // Catch: java.lang.Throwable -> L31
        L84:
            v4.c r7 = r6.f40214b     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L8d
            r7.b(r5, r8)     // Catch: java.lang.Throwable -> L31
            goto L8d
        L8c:
            r8 = 0
        L8d:
            java.lang.Object r5 = O5.s.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L9e
        L92:
            r5 = move-exception
            r6 = r4
        L94:
            O5.s$a r7 = O5.s.f8302b
            java.lang.Object r5 = O5.t.a(r5)
            java.lang.Object r5 = O5.s.b(r5)
        L9e:
            java.lang.Throwable r7 = O5.s.e(r5)
            if (r7 == 0) goto Lab
            u2.d r6 = r6.f40213a
            java.lang.String r8 = "StripeImageLoader: Could not load image from network"
            r6.a(r8, r7)
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4108g.k(java.lang.String, int, int, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0069, B:14:0x006d, B:16:0x0071, B:17:0x0074, B:19:0x0078, B:20:0x007d), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v4.C4108g.C0913g
            if (r0 == 0) goto L13
            r0 = r6
            v4.g$g r0 = (v4.C4108g.C0913g) r0
            int r1 = r0.f40249e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40249e = r1
            goto L18
        L13:
            v4.g$g r0 = new v4.g$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40247c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f40249e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f40246b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f40245a
            v4.g r0 = (v4.C4108g) r0
            O5.t.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L84
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            O5.t.b(r6)
            O5.s$a r6 = O5.s.f8302b     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r6.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Image "
            r6.append(r2)     // Catch: java.lang.Throwable -> L82
            r6.append(r5)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = " loading from internet"
            r6.append(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L82
            r4.f(r6)     // Catch: java.lang.Throwable -> L82
            v4.e r6 = r4.f40215c     // Catch: java.lang.Throwable -> L82
            r0.f40245a = r4     // Catch: java.lang.Throwable -> L82
            r0.f40246b = r5     // Catch: java.lang.Throwable -> L82
            r0.f40249e = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = r6.d(r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r6 != r1) goto L68
            return r1
        L68:
            r0 = r4
        L69:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L7c
            v4.b r1 = r0.f40216d     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L74
            r1.h(r5, r6)     // Catch: java.lang.Throwable -> L31
        L74:
            v4.c r1 = r0.f40214b     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L7d
            r1.b(r5, r6)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L7c:
            r6 = 0
        L7d:
            java.lang.Object r5 = O5.s.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L8e
        L82:
            r5 = move-exception
            r0 = r4
        L84:
            O5.s$a r6 = O5.s.f8302b
            java.lang.Object r5 = O5.t.a(r5)
            java.lang.Object r5 = O5.s.b(r5)
        L8e:
            java.lang.Throwable r6 = O5.s.e(r5)
            if (r6 == 0) goto L9b
            u2.d r0 = r0.f40213a
            java.lang.String r1 = "StripeImageLoader: Could not load image from network"
            r0.a(r1, r6)
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4108g.l(java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r8, kotlin.jvm.functions.Function1 r9, S5.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof v4.C4108g.h
            if (r0 == 0) goto L13
            r0 = r10
            v4.g$h r0 = (v4.C4108g.h) r0
            int r1 = r0.f40256g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40256g = r1
            goto L18
        L13:
            v4.g$h r0 = new v4.g$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f40254e
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f40256g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r8 = r0.f40252c
            u6.a r8 = (u6.InterfaceC4063a) r8
            java.lang.Object r9 = r0.f40251b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f40250a
            v4.g r0 = (v4.C4108g) r0
            O5.t.b(r10)     // Catch: java.lang.Throwable -> L3a
            goto La1
        L3a:
            r9 = move-exception
            goto Lac
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            java.lang.Object r8 = r0.f40253d
            u6.a r8 = (u6.InterfaceC4063a) r8
            java.lang.Object r9 = r0.f40252c
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r2 = r0.f40251b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f40250a
            v4.g r4 = (v4.C4108g) r4
            O5.t.b(r10)
            r6 = r2
            r2 = r8
            r8 = r6
            goto L8d
        L5c:
            O5.t.b(r10)
            j$.util.concurrent.ConcurrentHashMap r10 = r7.f40217e
            java.lang.Object r2 = r10.get(r8)
            if (r2 != 0) goto L74
            r2 = 0
            u6.a r2 = u6.AbstractC4065c.b(r2, r4, r5)
            java.lang.Object r10 = r10.putIfAbsent(r8, r2)
            if (r10 != 0) goto L73
            goto L74
        L73:
            r2 = r10
        L74:
            java.lang.String r10 = "getOrPut(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r10)
            u6.a r2 = (u6.InterfaceC4063a) r2
            r0.f40250a = r7
            r0.f40251b = r8
            r0.f40252c = r9
            r0.f40253d = r2
            r0.f40256g = r4
            java.lang.Object r10 = r2.a(r5, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            r4 = r7
        L8d:
            r0.f40250a = r4     // Catch: java.lang.Throwable -> Laa
            r0.f40251b = r8     // Catch: java.lang.Throwable -> Laa
            r0.f40252c = r2     // Catch: java.lang.Throwable -> Laa
            r0.f40253d = r5     // Catch: java.lang.Throwable -> Laa
            r0.f40256g = r3     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r10 = r9.invoke(r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 != r1) goto L9e
            return r1
        L9e:
            r9 = r8
            r8 = r2
            r0 = r4
        La1:
            r8.d(r5)
            j$.util.concurrent.ConcurrentHashMap r8 = r0.f40217e
            r8.remove(r9)
            return r10
        Laa:
            r9 = move-exception
            r8 = r2
        Lac:
            r8.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4108g.m(java.lang.String, kotlin.jvm.functions.Function1, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r11, int r12, int r13, S5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof v4.C4108g.b
            if (r0 == 0) goto L13
            r0 = r14
            v4.g$b r0 = (v4.C4108g.b) r0
            int r1 = r0.f40220c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40220c = r1
            goto L18
        L13:
            v4.g$b r0 = new v4.g$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f40218a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f40220c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            O5.t.b(r14)
            l6.I r14 = l6.C3347b0.b()
            v4.g$c r2 = new v4.g$c
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f40220c = r3
            java.lang.Object r14 = l6.AbstractC3360i.g(r14, r2, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            O5.s r14 = (O5.s) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4108g.g(java.lang.String, int, int, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r6, S5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v4.C4108g.d
            if (r0 == 0) goto L13
            r0 = r7
            v4.g$d r0 = (v4.C4108g.d) r0
            int r1 = r0.f40233c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40233c = r1
            goto L18
        L13:
            v4.g$d r0 = new v4.g$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f40231a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f40233c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            v4.g$e r2 = new v4.g$e
            r4 = 0
            r2.<init>(r6, r4)
            r0.f40233c = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            O5.s r7 = (O5.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4108g.h(java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C4108g(android.content.Context r12, u2.InterfaceC4057d r13, v4.C4104c r14, v4.C4106e r15, v4.C4103b r16, int r17, kotlin.jvm.internal.AbstractC3247p r18) {
        /*
            r11 = this;
            r0 = r17 & 2
            if (r0 == 0) goto Lf
            u2.d$a r0 = u2.InterfaceC4057d.f39950a
            boolean r1 = v4.AbstractC4109h.a(r12)
            u2.d r0 = r0.a(r1)
            goto L10
        Lf:
            r0 = r13
        L10:
            r1 = r17 & 4
            if (r1 == 0) goto L1d
            v4.c r1 = new v4.c
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            goto L1e
        L1d:
            r1 = r14
        L1e:
            r2 = r17 & 8
            if (r2 == 0) goto L28
            v4.e r2 = new v4.e
            r2.<init>()
            goto L29
        L28:
            r2 = r15
        L29:
            r3 = r17 & 16
            if (r3 == 0) goto L3b
            v4.b r3 = new v4.b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "stripe_image_cache"
            r7 = 0
            r4 = r3
            r5 = r12
            r4.<init>(r5, r6, r7, r9, r10)
            goto L3d
        L3b:
            r3 = r16
        L3d:
            r13 = r11
            r14 = r12
            r15 = r0
            r16 = r1
            r17 = r2
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4108g.<init>(android.content.Context, u2.d, v4.c, v4.e, v4.b, int, kotlin.jvm.internal.p):void");
    }
}
