package o6;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3716p {

    /* renamed from: o6.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36690b;

        public a(InterfaceC3706f interfaceC3706f, int i8) {
            this.f36689a = interfaceC3706f;
            this.f36690b = i8;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f36689a.collect(new b(new Q(), this.f36690b, interfaceC3707g), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return O5.I.f8278a;
        }
    }

    /* renamed from: o6.p$b */
    /* loaded from: classes5.dex */
    static final class b implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f36691a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36692b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f36693c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o6.p$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36694a;

            /* renamed from: c, reason: collision with root package name */
            int f36696c;

            a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36694a = obj;
                this.f36696c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(Q q8, int i8, InterfaceC3707g interfaceC3707g) {
            this.f36691a = q8;
            this.f36692b = i8;
            this.f36693c = interfaceC3707g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, S5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o6.AbstractC3716p.b.a
                if (r0 == 0) goto L13
                r0 = r7
                o6.p$b$a r0 = (o6.AbstractC3716p.b.a) r0
                int r1 = r0.f36696c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36696c = r1
                goto L18
            L13:
                o6.p$b$a r0 = new o6.p$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f36694a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36696c
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
                kotlin.jvm.internal.Q r7 = r5.f36691a
                int r2 = r7.f34160a
                int r4 = r5.f36692b
                if (r2 < r4) goto L4a
                o6.g r7 = r5.f36693c
                r0.f36696c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                O5.I r6 = O5.I.f8278a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f34160a = r2
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3716p.b.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    /* renamed from: o6.p$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36697a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36698b;

        public c(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
            this.f36697a = interfaceC3706f;
            this.f36698b = interfaceC1668n;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f36697a.collect(new d(new kotlin.jvm.internal.O(), interfaceC3707g, this.f36698b), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return O5.I.f8278a;
        }
    }

    /* renamed from: o6.p$d */
    /* loaded from: classes5.dex */
    static final class d implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f36699a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f36700b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36701c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o6.p$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f36702a;

            /* renamed from: b, reason: collision with root package name */
            Object f36703b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f36704c;

            /* renamed from: e, reason: collision with root package name */
            int f36706e;

            a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36704c = obj;
                this.f36706e |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(kotlin.jvm.internal.O o8, InterfaceC3707g interfaceC3707g, InterfaceC1668n interfaceC1668n) {
            this.f36699a = o8;
            this.f36700b = interfaceC3707g;
            this.f36701c = interfaceC1668n;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, S5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o6.AbstractC3716p.d.a
                if (r0 == 0) goto L13
                r0 = r8
                o6.p$d$a r0 = (o6.AbstractC3716p.d.a) r0
                int r1 = r0.f36706e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36706e = r1
                goto L18
            L13:
                o6.p$d$a r0 = new o6.p$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f36704c
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36706e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                O5.t.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f36703b
                java.lang.Object r2 = r0.f36702a
                o6.p$d r2 = (o6.AbstractC3716p.d) r2
                O5.t.b(r8)
                goto L6c
            L41:
                O5.t.b(r8)
                goto L59
            L45:
                O5.t.b(r8)
                kotlin.jvm.internal.O r8 = r6.f36699a
                boolean r8 = r8.f34158a
                if (r8 == 0) goto L5c
                o6.g r8 = r6.f36700b
                r0.f36706e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                O5.I r7 = O5.I.f8278a
                return r7
            L5c:
                a6.n r8 = r6.f36701c
                r0.f36702a = r6
                r0.f36703b = r7
                r0.f36706e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.O r8 = r2.f36699a
                r8.f34158a = r5
                o6.g r8 = r2.f36700b
                r2 = 0
                r0.f36702a = r2
                r0.f36703b = r2
                r0.f36706e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                O5.I r7 = O5.I.f8278a
                return r7
            L8b:
                O5.I r7 = O5.I.f8278a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3716p.d.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.p$e */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36707a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36708b;

        /* renamed from: c, reason: collision with root package name */
        int f36709c;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36708b = obj;
            this.f36709c |= Integer.MIN_VALUE;
            return AbstractC3716p.d(null, null, this);
        }
    }

    /* renamed from: o6.p$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36710a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36711b;

        /* renamed from: o6.p$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36712a;

            /* renamed from: b, reason: collision with root package name */
            int f36713b;

            /* renamed from: d, reason: collision with root package name */
            Object f36715d;

            public a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36712a = obj;
                this.f36713b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(InterfaceC3706f interfaceC3706f, int i8) {
            this.f36710a = interfaceC3706f;
            this.f36711b = i8;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
        
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        
            p6.o.a(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // o6.InterfaceC3706f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(o6.InterfaceC3707g r7, S5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o6.AbstractC3716p.f.a
                if (r0 == 0) goto L13
                r0 = r8
                o6.p$f$a r0 = (o6.AbstractC3716p.f.a) r0
                int r1 = r0.f36713b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36713b = r1
                goto L18
            L13:
                o6.p$f$a r0 = new o6.p$f$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f36712a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36713b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f36715d
                o6.g r7 = (o6.InterfaceC3707g) r7
                O5.t.b(r8)     // Catch: p6.C3783a -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L53
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                O5.t.b(r8)
                kotlin.jvm.internal.Q r8 = new kotlin.jvm.internal.Q
                r8.<init>()
                o6.f r2 = r6.f36710a     // Catch: p6.C3783a -> L2d
                o6.p$g r4 = new o6.p$g     // Catch: p6.C3783a -> L2d
                int r5 = r6.f36711b     // Catch: p6.C3783a -> L2d
                r4.<init>(r8, r5, r7)     // Catch: p6.C3783a -> L2d
                r0.f36715d = r7     // Catch: p6.C3783a -> L2d
                r0.f36713b = r3     // Catch: p6.C3783a -> L2d
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: p6.C3783a -> L2d
                if (r7 != r1) goto L56
                return r1
            L53:
                p6.o.a(r8, r7)
            L56:
                O5.I r7 = O5.I.f8278a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3716p.f.collect(o6.g, S5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.p$g */
    /* loaded from: classes5.dex */
    public static final class g implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f36716a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36717b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f36718c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o6.p$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36719a;

            /* renamed from: c, reason: collision with root package name */
            int f36721c;

            a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36719a = obj;
                this.f36721c |= Integer.MIN_VALUE;
                return g.this.emit(null, this);
            }
        }

        g(Q q8, int i8, InterfaceC3707g interfaceC3707g) {
            this.f36716a = q8;
            this.f36717b = i8;
            this.f36718c = interfaceC3707g;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, S5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o6.AbstractC3716p.g.a
                if (r0 == 0) goto L13
                r0 = r7
                o6.p$g$a r0 = (o6.AbstractC3716p.g.a) r0
                int r1 = r0.f36721c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36721c = r1
                goto L18
            L13:
                o6.p$g$a r0 = new o6.p$g$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f36719a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36721c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                O5.t.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                O5.t.b(r7)
                goto L51
            L38:
                O5.t.b(r7)
                kotlin.jvm.internal.Q r7 = r5.f36716a
                int r2 = r7.f34160a
                int r2 = r2 + r4
                r7.f34160a = r2
                int r7 = r5.f36717b
                if (r2 >= r7) goto L54
                o6.g r7 = r5.f36718c
                r0.f36721c = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                O5.I r6 = O5.I.f8278a
                return r6
            L54:
                o6.g r7 = r5.f36718c
                r0.f36721c = r3
                java.lang.Object r6 = o6.AbstractC3716p.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3716p.g.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    /* renamed from: o6.p$h */
    /* loaded from: classes5.dex */
    public static final class h implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36722a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36723b;

        /* renamed from: o6.p$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36724a;

            /* renamed from: b, reason: collision with root package name */
            int f36725b;

            /* renamed from: d, reason: collision with root package name */
            Object f36727d;

            public a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36724a = obj;
                this.f36725b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
            this.f36722a = interfaceC3706f;
            this.f36723b = interfaceC1668n;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // o6.InterfaceC3706f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(o6.InterfaceC3707g r6, S5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o6.AbstractC3716p.h.a
                if (r0 == 0) goto L13
                r0 = r7
                o6.p$h$a r0 = (o6.AbstractC3716p.h.a) r0
                int r1 = r0.f36725b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36725b = r1
                goto L18
            L13:
                o6.p$h$a r0 = new o6.p$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f36724a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36725b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f36727d
                o6.p$i r6 = (o6.AbstractC3716p.i) r6
                O5.t.b(r7)     // Catch: p6.C3783a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                O5.t.b(r7)
                o6.f r7 = r5.f36722a
                o6.p$i r2 = new o6.p$i
                a6.n r4 = r5.f36723b
                r2.<init>(r4, r6)
                r0.f36727d = r2     // Catch: p6.C3783a -> L4e
                r0.f36725b = r3     // Catch: p6.C3783a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: p6.C3783a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                p6.o.a(r7, r6)
            L53:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3716p.h.collect(o6.g, S5.d):java.lang.Object");
        }
    }

    /* renamed from: o6.p$i */
    /* loaded from: classes5.dex */
    public static final class i implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f36729b;

        /* renamed from: o6.p$i$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f36730a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f36731b;

            /* renamed from: c, reason: collision with root package name */
            int f36732c;

            /* renamed from: e, reason: collision with root package name */
            Object f36734e;

            public a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36731b = obj;
                this.f36732c |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(InterfaceC1668n interfaceC1668n, InterfaceC3707g interfaceC3707g) {
            this.f36728a = interfaceC1668n;
            this.f36729b = interfaceC3707g;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r8, S5.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o6.AbstractC3716p.i.a
                if (r0 == 0) goto L13
                r0 = r9
                o6.p$i$a r0 = (o6.AbstractC3716p.i.a) r0
                int r1 = r0.f36732c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36732c = r1
                goto L18
            L13:
                o6.p$i$a r0 = new o6.p$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f36731b
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36732c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f36730a
                o6.p$i r8 = (o6.AbstractC3716p.i) r8
                O5.t.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f36734e
                java.lang.Object r2 = r0.f36730a
                o6.p$i r2 = (o6.AbstractC3716p.i) r2
                O5.t.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                O5.t.b(r9)
                a6.n r9 = r7.f36728a
                r0.f36730a = r7
                r0.f36734e = r8
                r0.f36732c = r4
                r2 = 6
                kotlin.jvm.internal.AbstractC3253w.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.AbstractC3253w.c(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                o6.g r2 = r8.f36729b
                r0.f36730a = r8
                r5 = 0
                r0.f36734e = r5
                r0.f36732c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                O5.I r8 = O5.I.f8278a
                return r8
            L81:
                p6.a r9 = new p6.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3716p.i.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    public static final InterfaceC3706f b(InterfaceC3706f interfaceC3706f, int i8) {
        if (i8 >= 0) {
            return new a(interfaceC3706f, i8);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i8).toString());
    }

    public static final InterfaceC3706f c(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
        return new c(interfaceC3706f, interfaceC1668n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(o6.InterfaceC3707g r4, java.lang.Object r5, S5.d r6) {
        /*
            boolean r0 = r6 instanceof o6.AbstractC3716p.e
            if (r0 == 0) goto L13
            r0 = r6
            o6.p$e r0 = (o6.AbstractC3716p.e) r0
            int r1 = r0.f36709c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36709c = r1
            goto L18
        L13:
            o6.p$e r0 = new o6.p$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36708b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36709c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f36707a
            o6.g r4 = (o6.InterfaceC3707g) r4
            O5.t.b(r6)
            goto L43
        L35:
            O5.t.b(r6)
            r0.f36707a = r4
            r0.f36709c = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            p6.a r5 = new p6.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3716p.d(o6.g, java.lang.Object, S5.d):java.lang.Object");
    }

    public static final InterfaceC3706f e(InterfaceC3706f interfaceC3706f, int i8) {
        if (i8 > 0) {
            return new f(interfaceC3706f, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " should be positive").toString());
    }

    public static final InterfaceC3706f f(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
        return new h(interfaceC3706f, interfaceC1668n);
    }
}
