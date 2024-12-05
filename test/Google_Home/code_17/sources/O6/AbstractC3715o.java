package o6;

import a6.InterfaceC1669o;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.InterfaceC3390x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3715o {

    /* renamed from: o6.o$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f36673a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f36674b;

        /* renamed from: o6.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0816a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36675a;

            /* renamed from: b, reason: collision with root package name */
            int f36676b;

            /* renamed from: d, reason: collision with root package name */
            Object f36678d;

            /* renamed from: e, reason: collision with root package name */
            Object f36679e;

            public C0816a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36675a = obj;
                this.f36676b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(InterfaceC3706f interfaceC3706f, InterfaceC1669o interfaceC1669o) {
            this.f36673a = interfaceC3706f;
            this.f36674b = interfaceC1669o;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // o6.InterfaceC3706f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(o6.InterfaceC3707g r6, S5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o6.AbstractC3715o.a.C0816a
                if (r0 == 0) goto L13
                r0 = r7
                o6.o$a$a r0 = (o6.AbstractC3715o.a.C0816a) r0
                int r1 = r0.f36676b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36676b = r1
                goto L18
            L13:
                o6.o$a$a r0 = new o6.o$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f36675a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36676b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                O5.t.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f36679e
                o6.g r6 = (o6.InterfaceC3707g) r6
                java.lang.Object r2 = r0.f36678d
                o6.o$a r2 = (o6.AbstractC3715o.a) r2
                O5.t.b(r7)
                goto L53
            L40:
                O5.t.b(r7)
                o6.f r7 = r5.f36673a
                r0.f36678d = r5
                r0.f36679e = r6
                r0.f36676b = r4
                java.lang.Object r7 = o6.AbstractC3708h.g(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                a6.o r2 = r2.f36674b
                r4 = 0
                r0.f36678d = r4
                r0.f36679e = r4
                r0.f36676b = r3
                r3 = 6
                kotlin.jvm.internal.AbstractC3253w.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.AbstractC3253w.c(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3715o.a.collect(o6.g, S5.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.o$b */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36680a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36681b;

        /* renamed from: c, reason: collision with root package name */
        int f36682c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36681b = obj;
            this.f36682c |= Integer.MIN_VALUE;
            return AbstractC3708h.g(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.o$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f36683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f36684b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o6.o$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f36685a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f36686b;

            /* renamed from: d, reason: collision with root package name */
            int f36688d;

            a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36686b = obj;
                this.f36688d |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        c(InterfaceC3707g interfaceC3707g, T t8) {
            this.f36683a = interfaceC3707g;
            this.f36684b = t8;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, S5.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o6.AbstractC3715o.c.a
                if (r0 == 0) goto L13
                r0 = r6
                o6.o$c$a r0 = (o6.AbstractC3715o.c.a) r0
                int r1 = r0.f36688d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36688d = r1
                goto L18
            L13:
                o6.o$c$a r0 = new o6.o$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f36686b
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36688d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f36685a
                o6.o$c r5 = (o6.AbstractC3715o.c) r5
                O5.t.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                O5.t.b(r6)
                o6.g r6 = r4.f36683a     // Catch: java.lang.Throwable -> L4a
                r0.f36685a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f36688d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                O5.I r5 = O5.I.f8278a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.T r5 = r5.f36684b
                r5.f34162a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3715o.c.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    public static final InterfaceC3706f a(InterfaceC3706f interfaceC3706f, InterfaceC1669o interfaceC1669o) {
        return new a(interfaceC3706f, interfaceC1669o);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(o6.InterfaceC3706f r4, o6.InterfaceC3707g r5, S5.d r6) {
        /*
            boolean r0 = r6 instanceof o6.AbstractC3715o.b
            if (r0 == 0) goto L13
            r0 = r6
            o6.o$b r0 = (o6.AbstractC3715o.b) r0
            int r1 = r0.f36682c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36682c = r1
            goto L18
        L13:
            o6.o$b r0 = new o6.o$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36681b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36682c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f36680a
            kotlin.jvm.internal.T r4 = (kotlin.jvm.internal.T) r4
            O5.t.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            O5.t.b(r6)
            kotlin.jvm.internal.T r6 = new kotlin.jvm.internal.T
            r6.<init>()
            o6.o$c r2 = new o6.o$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f36680a = r6     // Catch: java.lang.Throwable -> L51
            r0.f36682c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f34162a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            S5.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            O5.AbstractC1349e.a(r4, r5)
            throw r4
        L72:
            O5.AbstractC1349e.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3715o.b(o6.f, o6.g, S5.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, S5.g gVar) {
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) gVar.get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null && interfaceC3390x0.isCancelled()) {
            return d(th, interfaceC3390x0.o());
        }
        return false;
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null && AbstractC3255y.d(th2, th)) {
            return true;
        }
        return false;
    }
}
