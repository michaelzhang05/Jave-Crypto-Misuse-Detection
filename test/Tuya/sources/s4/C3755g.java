package s4;

import L5.I;
import L5.s;
import L5.t;
import X5.n;
import android.content.Context;
import android.graphics.Bitmap;
import i6.M;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;

/* renamed from: s4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3755g {

    /* renamed from: f, reason: collision with root package name */
    private static final a f37938f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f37939g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3684d f37940a;

    /* renamed from: b, reason: collision with root package name */
    private final C3751c f37941b;

    /* renamed from: c, reason: collision with root package name */
    private final C3753e f37942c;

    /* renamed from: d, reason: collision with root package name */
    private final C3750b f37943d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap f37944e;

    /* renamed from: s4.g$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f37945a;

        /* renamed from: c, reason: collision with root package name */
        int f37947c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37945a = obj;
            this.f37947c |= Integer.MIN_VALUE;
            Object g8 = C3755g.this.g(null, 0, 0, this);
            if (g8 == Q5.b.e()) {
                return g8;
            }
            return s.a(g8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f37948a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37950c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37951d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37952e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s4.g$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            int f37953a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3755g f37954b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f37955c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f37956d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f37957e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3755g c3755g, String str, int i8, int i9, P5.d dVar) {
                super(1, dVar);
                this.f37954b = c3755g;
                this.f37955c = str;
                this.f37956d = i8;
                this.f37957e = i9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(P5.d dVar) {
                return new a(this.f37954b, this.f37955c, this.f37956d, this.f37957e, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(P5.d dVar) {
                return ((a) create(dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object k8;
                Object e8 = Q5.b.e();
                int i8 = this.f37953a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        k8 = ((s) obj).k();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    s j8 = this.f37954b.j(this.f37955c);
                    if (j8 != null || (j8 = this.f37954b.i(this.f37955c)) != null) {
                        k8 = j8.k();
                    } else {
                        C3755g c3755g = this.f37954b;
                        String str = this.f37955c;
                        int i9 = this.f37956d;
                        int i10 = this.f37957e;
                        this.f37953a = 1;
                        k8 = c3755g.k(str, i9, i10, this);
                        if (k8 == e8) {
                            return e8;
                        }
                    }
                }
                return s.a(k8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i8, int i9, P5.d dVar) {
            super(2, dVar);
            this.f37950c = str;
            this.f37951d = i8;
            this.f37952e = i9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f37950c, this.f37951d, this.f37952e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f37948a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3755g c3755g = C3755g.this;
                String str = this.f37950c;
                a aVar = new a(c3755g, str, this.f37951d, this.f37952e, null);
                this.f37948a = 1;
                obj = c3755g.m(str, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f37958a;

        /* renamed from: c, reason: collision with root package name */
        int f37960c;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37958a = obj;
            this.f37960c |= Integer.MIN_VALUE;
            Object h8 = C3755g.this.h(null, this);
            if (h8 == Q5.b.e()) {
                return h8;
            }
            return s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f37961a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37963c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s4.g$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            int f37964a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3755g f37965b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f37966c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3755g c3755g, String str, P5.d dVar) {
                super(1, dVar);
                this.f37965b = c3755g;
                this.f37966c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(P5.d dVar) {
                return new a(this.f37965b, this.f37966c, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(P5.d dVar) {
                return ((a) create(dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object l8;
                Object e8 = Q5.b.e();
                int i8 = this.f37964a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        l8 = ((s) obj).k();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    s j8 = this.f37965b.j(this.f37966c);
                    if (j8 != null || (j8 = this.f37965b.i(this.f37966c)) != null) {
                        l8 = j8.k();
                    } else {
                        C3755g c3755g = this.f37965b;
                        String str = this.f37966c;
                        this.f37964a = 1;
                        l8 = c3755g.l(str, this);
                        if (l8 == e8) {
                            return e8;
                        }
                    }
                }
                return s.a(l8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, P5.d dVar) {
            super(2, dVar);
            this.f37963c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f37963c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f37961a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3755g c3755g = C3755g.this;
                String str = this.f37963c;
                a aVar = new a(c3755g, str, null);
                this.f37961a = 1;
                obj = c3755g.m(str, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37967a;

        /* renamed from: b, reason: collision with root package name */
        Object f37968b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37969c;

        /* renamed from: e, reason: collision with root package name */
        int f37971e;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37969c = obj;
            this.f37971e |= Integer.MIN_VALUE;
            Object k8 = C3755g.this.k(null, 0, 0, this);
            if (k8 == Q5.b.e()) {
                return k8;
            }
            return s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0877g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37972a;

        /* renamed from: b, reason: collision with root package name */
        Object f37973b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f37974c;

        /* renamed from: e, reason: collision with root package name */
        int f37976e;

        C0877g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37974c = obj;
            this.f37976e |= Integer.MIN_VALUE;
            Object l8 = C3755g.this.l(null, this);
            if (l8 == Q5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.g$h */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37977a;

        /* renamed from: b, reason: collision with root package name */
        Object f37978b;

        /* renamed from: c, reason: collision with root package name */
        Object f37979c;

        /* renamed from: d, reason: collision with root package name */
        Object f37980d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f37981e;

        /* renamed from: g, reason: collision with root package name */
        int f37983g;

        h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37981e = obj;
            this.f37983g |= Integer.MIN_VALUE;
            return C3755g.this.m(null, null, this);
        }
    }

    public C3755g(Context context, InterfaceC3684d logger, C3751c c3751c, C3753e networkImageDecoder, C3750b c3750b) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(networkImageDecoder, "networkImageDecoder");
        this.f37940a = logger;
        this.f37941b = c3751c;
        this.f37942c = networkImageDecoder;
        this.f37943d = c3750b;
        this.f37944e = new ConcurrentHashMap();
    }

    private final void f(String str) {
        this.f37940a.b("StripeImageLoader: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s i(String str) {
        Bitmap bitmap;
        C3750b c3750b = this.f37943d;
        if (c3750b != null) {
            bitmap = c3750b.e(str);
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
        C3751c c3751c = this.f37941b;
        if (c3751c != null) {
            c3751c.b(str, bitmap);
        }
        return s.a(s.b(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s j(String str) {
        Bitmap bitmap;
        C3751c c3751c = this.f37941b;
        if (c3751c != null) {
            bitmap = c3751c.a(str);
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
        C3750b c3750b = this.f37943d;
        if (c3750b != null) {
            c3750b.h(str, bitmap);
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
    public final java.lang.Object k(java.lang.String r5, int r6, int r7, P5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof s4.C3755g.f
            if (r0 == 0) goto L13
            r0 = r8
            s4.g$f r0 = (s4.C3755g.f) r0
            int r1 = r0.f37971e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37971e = r1
            goto L18
        L13:
            s4.g$f r0 = new s4.g$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f37969c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f37971e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f37968b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.f37967a
            s4.g r6 = (s4.C3755g) r6
            L5.t.b(r8)     // Catch: java.lang.Throwable -> L31
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
            L5.t.b(r8)
            L5.s$a r8 = L5.s.f6511b     // Catch: java.lang.Throwable -> L92
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
            s4.e r8 = r4.f37942c     // Catch: java.lang.Throwable -> L92
            r0.f37967a = r4     // Catch: java.lang.Throwable -> L92
            r0.f37968b = r5     // Catch: java.lang.Throwable -> L92
            r0.f37971e = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = r8.c(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L92
            if (r8 != r1) goto L78
            return r1
        L78:
            r6 = r4
        L79:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L8c
            s4.b r7 = r6.f37943d     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L84
            r7.h(r5, r8)     // Catch: java.lang.Throwable -> L31
        L84:
            s4.c r7 = r6.f37941b     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L8d
            r7.b(r5, r8)     // Catch: java.lang.Throwable -> L31
            goto L8d
        L8c:
            r8 = 0
        L8d:
            java.lang.Object r5 = L5.s.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L9e
        L92:
            r5 = move-exception
            r6 = r4
        L94:
            L5.s$a r7 = L5.s.f6511b
            java.lang.Object r5 = L5.t.a(r5)
            java.lang.Object r5 = L5.s.b(r5)
        L9e:
            java.lang.Throwable r7 = L5.s.e(r5)
            if (r7 == 0) goto Lab
            r2.d r6 = r6.f37940a
            java.lang.String r8 = "StripeImageLoader: Could not load image from network"
            r6.a(r8, r7)
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3755g.k(java.lang.String, int, int, P5.d):java.lang.Object");
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
    public final java.lang.Object l(java.lang.String r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s4.C3755g.C0877g
            if (r0 == 0) goto L13
            r0 = r6
            s4.g$g r0 = (s4.C3755g.C0877g) r0
            int r1 = r0.f37976e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37976e = r1
            goto L18
        L13:
            s4.g$g r0 = new s4.g$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37974c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f37976e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f37973b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f37972a
            s4.g r0 = (s4.C3755g) r0
            L5.t.b(r6)     // Catch: java.lang.Throwable -> L31
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
            L5.t.b(r6)
            L5.s$a r6 = L5.s.f6511b     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r6.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Image "
            r6.append(r2)     // Catch: java.lang.Throwable -> L82
            r6.append(r5)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = " loading from internet"
            r6.append(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L82
            r4.f(r6)     // Catch: java.lang.Throwable -> L82
            s4.e r6 = r4.f37942c     // Catch: java.lang.Throwable -> L82
            r0.f37972a = r4     // Catch: java.lang.Throwable -> L82
            r0.f37973b = r5     // Catch: java.lang.Throwable -> L82
            r0.f37976e = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = r6.d(r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r6 != r1) goto L68
            return r1
        L68:
            r0 = r4
        L69:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L7c
            s4.b r1 = r0.f37943d     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L74
            r1.h(r5, r6)     // Catch: java.lang.Throwable -> L31
        L74:
            s4.c r1 = r0.f37941b     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L7d
            r1.b(r5, r6)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L7c:
            r6 = 0
        L7d:
            java.lang.Object r5 = L5.s.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L8e
        L82:
            r5 = move-exception
            r0 = r4
        L84:
            L5.s$a r6 = L5.s.f6511b
            java.lang.Object r5 = L5.t.a(r5)
            java.lang.Object r5 = L5.s.b(r5)
        L8e:
            java.lang.Throwable r6 = L5.s.e(r5)
            if (r6 == 0) goto L9b
            r2.d r0 = r0.f37940a
            java.lang.String r1 = "StripeImageLoader: Could not load image from network"
            r0.a(r1, r6)
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3755g.l(java.lang.String, P5.d):java.lang.Object");
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
    public final java.lang.Object m(java.lang.String r8, kotlin.jvm.functions.Function1 r9, P5.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof s4.C3755g.h
            if (r0 == 0) goto L13
            r0 = r10
            s4.g$h r0 = (s4.C3755g.h) r0
            int r1 = r0.f37983g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37983g = r1
            goto L18
        L13:
            s4.g$h r0 = new s4.g$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f37981e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f37983g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r8 = r0.f37979c
            r6.a r8 = (r6.InterfaceC3690a) r8
            java.lang.Object r9 = r0.f37978b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f37977a
            s4.g r0 = (s4.C3755g) r0
            L5.t.b(r10)     // Catch: java.lang.Throwable -> L3a
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
            java.lang.Object r8 = r0.f37980d
            r6.a r8 = (r6.InterfaceC3690a) r8
            java.lang.Object r9 = r0.f37979c
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r2 = r0.f37978b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f37977a
            s4.g r4 = (s4.C3755g) r4
            L5.t.b(r10)
            r6 = r2
            r2 = r8
            r8 = r6
            goto L8d
        L5c:
            L5.t.b(r10)
            j$.util.concurrent.ConcurrentHashMap r10 = r7.f37944e
            java.lang.Object r2 = r10.get(r8)
            if (r2 != 0) goto L74
            r2 = 0
            r6.a r2 = r6.AbstractC3692c.b(r2, r4, r5)
            java.lang.Object r10 = r10.putIfAbsent(r8, r2)
            if (r10 != 0) goto L73
            goto L74
        L73:
            r2 = r10
        L74:
            java.lang.String r10 = "getOrPut(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r10)
            r6.a r2 = (r6.InterfaceC3690a) r2
            r0.f37977a = r7
            r0.f37978b = r8
            r0.f37979c = r9
            r0.f37980d = r2
            r0.f37983g = r4
            java.lang.Object r10 = r2.b(r5, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            r4 = r7
        L8d:
            r0.f37977a = r4     // Catch: java.lang.Throwable -> Laa
            r0.f37978b = r8     // Catch: java.lang.Throwable -> Laa
            r0.f37979c = r2     // Catch: java.lang.Throwable -> Laa
            r0.f37980d = r5     // Catch: java.lang.Throwable -> Laa
            r0.f37983g = r3     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r10 = r9.invoke(r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 != r1) goto L9e
            return r1
        L9e:
            r9 = r8
            r8 = r2
            r0 = r4
        La1:
            r8.d(r5)
            j$.util.concurrent.ConcurrentHashMap r8 = r0.f37944e
            r8.remove(r9)
            return r10
        Laa:
            r9 = move-exception
            r8 = r2
        Lac:
            r8.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3755g.m(java.lang.String, kotlin.jvm.functions.Function1, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r11, int r12, int r13, P5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof s4.C3755g.b
            if (r0 == 0) goto L13
            r0 = r14
            s4.g$b r0 = (s4.C3755g.b) r0
            int r1 = r0.f37947c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37947c = r1
            goto L18
        L13:
            s4.g$b r0 = new s4.g$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f37945a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f37947c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            L5.t.b(r14)
            i6.I r14 = i6.C2812b0.b()
            s4.g$c r2 = new s4.g$c
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f37947c = r3
            java.lang.Object r14 = i6.AbstractC2825i.g(r14, r2, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            L5.s r14 = (L5.s) r14
            java.lang.Object r11 = r14.k()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3755g.g(java.lang.String, int, int, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r6, P5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s4.C3755g.d
            if (r0 == 0) goto L13
            r0 = r7
            s4.g$d r0 = (s4.C3755g.d) r0
            int r1 = r0.f37960c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37960c = r1
            goto L18
        L13:
            s4.g$d r0 = new s4.g$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37958a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f37960c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            s4.g$e r2 = new s4.g$e
            r4 = 0
            r2.<init>(r6, r4)
            r0.f37960c = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            L5.s r7 = (L5.s) r7
            java.lang.Object r6 = r7.k()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C3755g.h(java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C3755g(android.content.Context r12, r2.InterfaceC3684d r13, s4.C3751c r14, s4.C3753e r15, s4.C3750b r16, int r17, kotlin.jvm.internal.AbstractC3151p r18) {
        /*
            r11 = this;
            r0 = r17 & 2
            if (r0 == 0) goto Lf
            r2.d$a r0 = r2.InterfaceC3684d.f37570a
            boolean r1 = s4.AbstractC3756h.a(r12)
            r2.d r0 = r0.a(r1)
            goto L10
        Lf:
            r0 = r13
        L10:
            r1 = r17 & 4
            if (r1 == 0) goto L1d
            s4.c r1 = new s4.c
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
            s4.e r2 = new s4.e
            r2.<init>()
            goto L29
        L28:
            r2 = r15
        L29:
            r3 = r17 & 16
            if (r3 == 0) goto L3b
            s4.b r3 = new s4.b
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
        throw new UnsupportedOperationException("Method not decompiled: s4.C3755g.<init>(android.content.Context, r2.d, s4.c, s4.e, s4.b, int, kotlin.jvm.internal.p):void");
    }
}
