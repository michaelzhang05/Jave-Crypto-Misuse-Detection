package o6;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.T;
import p6.C3783a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class r {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T f36740a;

        public a(T t8) {
            this.f36740a = t8;
        }

        @Override // o6.InterfaceC3707g
        public Object emit(Object obj, S5.d dVar) {
            this.f36740a.f34162a = obj;
            throw new C3783a(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36741a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f36742b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f36743a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f36744b;

            /* renamed from: c, reason: collision with root package name */
            int f36745c;

            /* renamed from: e, reason: collision with root package name */
            Object f36747e;

            public a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36744b = obj;
                this.f36745c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(InterfaceC1668n interfaceC1668n, T t8) {
            this.f36741a = interfaceC1668n;
            this.f36742b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r5, S5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o6.r.b.a
                if (r0 == 0) goto L13
                r0 = r6
                o6.r$b$a r0 = (o6.r.b.a) r0
                int r1 = r0.f36745c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36745c = r1
                goto L18
            L13:
                o6.r$b$a r0 = new o6.r$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f36744b
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36745c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f36747e
                java.lang.Object r0 = r0.f36743a
                o6.r$b r0 = (o6.r.b) r0
                O5.t.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                O5.t.b(r6)
                a6.n r6 = r4.f36741a
                r0.f36743a = r4
                r0.f36747e = r5
                r0.f36745c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC3253w.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC3253w.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                O5.I r5 = O5.I.f8278a
                return r5
            L5d:
                kotlin.jvm.internal.T r6 = r0.f36742b
                r6.f34162a = r5
                p6.a r5 = new p6.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.r.b.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36748a;

        /* renamed from: b, reason: collision with root package name */
        Object f36749b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36750c;

        /* renamed from: d, reason: collision with root package name */
        int f36751d;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36750c = obj;
            this.f36751d |= Integer.MIN_VALUE;
            return AbstractC3708h.w(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36752a;

        /* renamed from: b, reason: collision with root package name */
        Object f36753b;

        /* renamed from: c, reason: collision with root package name */
        Object f36754c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f36755d;

        /* renamed from: e, reason: collision with root package name */
        int f36756e;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36755d = obj;
            this.f36756e |= Integer.MIN_VALUE;
            return AbstractC3708h.x(null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f36757a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f36758b;

        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f36759a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f36760b;

            /* renamed from: c, reason: collision with root package name */
            int f36761c;

            /* renamed from: e, reason: collision with root package name */
            Object f36763e;

            public a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36760b = obj;
                this.f36761c |= Integer.MIN_VALUE;
                return e.this.emit(null, this);
            }
        }

        public e(InterfaceC1668n interfaceC1668n, T t8) {
            this.f36757a = interfaceC1668n;
            this.f36758b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r5, S5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o6.r.e.a
                if (r0 == 0) goto L13
                r0 = r6
                o6.r$e$a r0 = (o6.r.e.a) r0
                int r1 = r0.f36761c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36761c = r1
                goto L18
            L13:
                o6.r$e$a r0 = new o6.r$e$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f36760b
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36761c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f36763e
                java.lang.Object r0 = r0.f36759a
                o6.r$e r0 = (o6.r.e) r0
                O5.t.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                O5.t.b(r6)
                a6.n r6 = r4.f36757a
                r0.f36759a = r4
                r0.f36763e = r5
                r0.f36761c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC3253w.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC3253w.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                O5.I r5 = O5.I.f8278a
                return r5
            L5d:
                kotlin.jvm.internal.T r6 = r0.f36758b
                r6.f34162a = r5
                p6.a r5 = new p6.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.r.e.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36764a;

        /* renamed from: b, reason: collision with root package name */
        Object f36765b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36766c;

        /* renamed from: d, reason: collision with root package name */
        int f36767d;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36766c = obj;
            this.f36767d |= Integer.MIN_VALUE;
            return AbstractC3708h.y(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(o6.InterfaceC3706f r4, S5.d r5) {
        /*
            boolean r0 = r5 instanceof o6.r.c
            if (r0 == 0) goto L13
            r0 = r5
            o6.r$c r0 = (o6.r.c) r0
            int r1 = r0.f36751d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36751d = r1
            goto L18
        L13:
            o6.r$c r0 = new o6.r$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f36750c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36751d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f36749b
            o6.r$a r4 = (o6.r.a) r4
            java.lang.Object r0 = r0.f36748a
            kotlin.jvm.internal.T r0 = (kotlin.jvm.internal.T) r0
            O5.t.b(r5)     // Catch: p6.C3783a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            O5.t.b(r5)
            kotlin.jvm.internal.T r5 = new kotlin.jvm.internal.T
            r5.<init>()
            q6.F r2 = p6.s.f37960a
            r5.f34162a = r2
            o6.r$a r2 = new o6.r$a
            r2.<init>(r5)
            r0.f36748a = r5     // Catch: p6.C3783a -> L5b
            r0.f36749b = r2     // Catch: p6.C3783a -> L5b
            r0.f36751d = r3     // Catch: p6.C3783a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p6.C3783a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            p6.o.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.f34162a
            q6.F r5 = p6.s.f37960a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.r.a(o6.f, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(o6.InterfaceC3706f r4, a6.InterfaceC1668n r5, S5.d r6) {
        /*
            boolean r0 = r6 instanceof o6.r.d
            if (r0 == 0) goto L13
            r0 = r6
            o6.r$d r0 = (o6.r.d) r0
            int r1 = r0.f36756e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36756e = r1
            goto L18
        L13:
            o6.r$d r0 = new o6.r$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36755d
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36756e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f36754c
            o6.r$b r4 = (o6.r.b) r4
            java.lang.Object r5 = r0.f36753b
            kotlin.jvm.internal.T r5 = (kotlin.jvm.internal.T) r5
            java.lang.Object r0 = r0.f36752a
            a6.n r0 = (a6.InterfaceC1668n) r0
            O5.t.b(r6)     // Catch: p6.C3783a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            O5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            q6.F r2 = p6.s.f37960a
            r6.f34162a = r2
            o6.r$b r2 = new o6.r$b
            r2.<init>(r5, r6)
            r0.f36752a = r5     // Catch: p6.C3783a -> L62
            r0.f36753b = r6     // Catch: p6.C3783a -> L62
            r0.f36754c = r2     // Catch: p6.C3783a -> L62
            r0.f36756e = r3     // Catch: p6.C3783a -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p6.C3783a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            p6.o.a(r6, r4)
        L6a:
            java.lang.Object r4 = r5.f34162a
            q6.F r5 = p6.s.f37960a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.r.b(o6.f, a6.n, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(o6.InterfaceC3706f r4, a6.InterfaceC1668n r5, S5.d r6) {
        /*
            boolean r0 = r6 instanceof o6.r.f
            if (r0 == 0) goto L13
            r0 = r6
            o6.r$f r0 = (o6.r.f) r0
            int r1 = r0.f36767d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36767d = r1
            goto L18
        L13:
            o6.r$f r0 = new o6.r$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36766c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36767d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f36765b
            o6.r$e r4 = (o6.r.e) r4
            java.lang.Object r5 = r0.f36764a
            kotlin.jvm.internal.T r5 = (kotlin.jvm.internal.T) r5
            O5.t.b(r6)     // Catch: p6.C3783a -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            O5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            o6.r$e r2 = new o6.r$e
            r2.<init>(r5, r6)
            r0.f36764a = r6     // Catch: p6.C3783a -> L57
            r0.f36765b = r2     // Catch: p6.C3783a -> L57
            r0.f36767d = r3     // Catch: p6.C3783a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: p6.C3783a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            p6.o.a(r6, r4)
        L5e:
            java.lang.Object r4 = r5.f34162a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.r.c(o6.f, a6.n, S5.d):java.lang.Object");
    }
}
