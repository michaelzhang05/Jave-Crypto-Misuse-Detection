package o6;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3714n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.n$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36655a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36656b;

        /* renamed from: c, reason: collision with root package name */
        int f36657c;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36656b = obj;
            this.f36657c |= Integer.MIN_VALUE;
            return AbstractC3714n.c(null, null, null, this);
        }
    }

    /* renamed from: o6.n$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f36659b;

        /* renamed from: o6.n$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36660a;

            /* renamed from: b, reason: collision with root package name */
            int f36661b;

            /* renamed from: d, reason: collision with root package name */
            Object f36663d;

            /* renamed from: e, reason: collision with root package name */
            Object f36664e;

            public a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36660a = obj;
                this.f36661b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC3706f interfaceC3706f, InterfaceC1669o interfaceC1669o) {
            this.f36658a = interfaceC3706f;
            this.f36659b = interfaceC1669o;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // o6.InterfaceC3706f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(o6.InterfaceC3707g r9, S5.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof o6.AbstractC3714n.b.a
                if (r0 == 0) goto L13
                r0 = r10
                o6.n$b$a r0 = (o6.AbstractC3714n.b.a) r0
                int r1 = r0.f36661b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36661b = r1
                goto L18
            L13:
                o6.n$b$a r0 = new o6.n$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f36660a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36661b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f36663d
                p6.t r9 = (p6.t) r9
                O5.t.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f36663d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                O5.t.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f36664e
                o6.g r9 = (o6.InterfaceC3707g) r9
                java.lang.Object r2 = r0.f36663d
                o6.n$b r2 = (o6.AbstractC3714n.b) r2
                O5.t.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                O5.t.b(r10)
                o6.f r10 = r8.f36658a     // Catch: java.lang.Throwable -> L96
                r0.f36663d = r8     // Catch: java.lang.Throwable -> L96
                r0.f36664e = r9     // Catch: java.lang.Throwable -> L96
                r0.f36661b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                p6.t r10 = new p6.t
                S5.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                a6.o r9 = r2.f36659b     // Catch: java.lang.Throwable -> L8e
                r0.f36663d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f36664e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f36661b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.AbstractC3253w.c(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.AbstractC3253w.c(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                O5.I r9 = O5.I.f8278a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                o6.P r10 = new o6.P
                r10.<init>(r9)
                a6.o r2 = r2.f36659b
                r0.f36663d = r9
                r0.f36664e = r6
                r0.f36661b = r4
                java.lang.Object r10 = o6.AbstractC3714n.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3714n.b.collect(o6.g, S5.d):java.lang.Object");
        }
    }

    /* renamed from: o6.n$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36666b;

        /* renamed from: o6.n$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36667a;

            /* renamed from: b, reason: collision with root package name */
            int f36668b;

            /* renamed from: d, reason: collision with root package name */
            Object f36670d;

            /* renamed from: e, reason: collision with root package name */
            Object f36671e;

            /* renamed from: f, reason: collision with root package name */
            Object f36672f;

            public a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36667a = obj;
                this.f36668b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(InterfaceC1668n interfaceC1668n, InterfaceC3706f interfaceC3706f) {
            this.f36665a = interfaceC1668n;
            this.f36666b = interfaceC3706f;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // o6.InterfaceC3706f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(o6.InterfaceC3707g r7, S5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o6.AbstractC3714n.c.a
                if (r0 == 0) goto L13
                r0 = r8
                o6.n$c$a r0 = (o6.AbstractC3714n.c.a) r0
                int r1 = r0.f36668b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36668b = r1
                goto L18
            L13:
                o6.n$c$a r0 = new o6.n$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f36667a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36668b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                O5.t.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f36672f
                p6.t r7 = (p6.t) r7
                java.lang.Object r2 = r0.f36671e
                o6.g r2 = (o6.InterfaceC3707g) r2
                java.lang.Object r4 = r0.f36670d
                o6.n$c r4 = (o6.AbstractC3714n.c) r4
                O5.t.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                O5.t.b(r8)
                p6.t r8 = new p6.t
                S5.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                a6.n r2 = r6.f36665a     // Catch: java.lang.Throwable -> L86
                r0.f36670d = r6     // Catch: java.lang.Throwable -> L86
                r0.f36671e = r7     // Catch: java.lang.Throwable -> L86
                r0.f36672f = r8     // Catch: java.lang.Throwable -> L86
                r0.f36668b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.AbstractC3253w.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.AbstractC3253w.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                o6.f r7 = r4.f36666b
                r8 = 0
                r0.f36670d = r8
                r0.f36671e = r8
                r0.f36672f = r8
                r0.f36668b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                O5.I r7 = O5.I.f8278a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3714n.c.collect(o6.g, S5.d):java.lang.Object");
        }
    }

    public static final void b(InterfaceC3707g interfaceC3707g) {
        if (!(interfaceC3707g instanceof P)) {
        } else {
            throw ((P) interfaceC3707g).f36619a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(o6.InterfaceC3707g r4, a6.InterfaceC1669o r5, java.lang.Throwable r6, S5.d r7) {
        /*
            boolean r0 = r7 instanceof o6.AbstractC3714n.a
            if (r0 == 0) goto L13
            r0 = r7
            o6.n$a r0 = (o6.AbstractC3714n.a) r0
            int r1 = r0.f36657c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36657c = r1
            goto L18
        L13:
            o6.n$a r0 = new o6.n$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36656b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36657c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f36655a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            O5.t.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            O5.t.b(r7)
            r0.f36655a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f36657c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            O5.I r4 = O5.I.f8278a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            O5.AbstractC1349e.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3714n.c(o6.g, a6.o, java.lang.Throwable, S5.d):java.lang.Object");
    }

    public static final InterfaceC3706f d(InterfaceC3706f interfaceC3706f, InterfaceC1669o interfaceC1669o) {
        return new b(interfaceC3706f, interfaceC1669o);
    }

    public static final InterfaceC3706f e(InterfaceC3706f interfaceC3706f, InterfaceC1668n interfaceC1668n) {
        return new c(interfaceC1668n, interfaceC3706f);
    }
}
