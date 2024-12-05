package r2;

import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import l6.M;
import l6.N;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3916a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0867a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38575a;

        /* renamed from: b, reason: collision with root package name */
        int f38576b;

        C0867a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38575a = obj;
            this.f38576b |= Integer.MIN_VALUE;
            Object a8 = AbstractC3916a.a(null, null, null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f38577a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38579c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f38580d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r2.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0868a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f38581a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38582b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC1668n f38583c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0868a(InterfaceC1668n interfaceC1668n, S5.d dVar) {
                super(2, dVar);
                this.f38583c = interfaceC1668n;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                C0868a c0868a = new C0868a(this.f38583c, dVar);
                c0868a.f38582b = obj;
                return c0868a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f38581a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    M m8 = (M) this.f38582b;
                    InterfaceC1668n interfaceC1668n = this.f38583c;
                    this.f38581a = 1;
                    obj = interfaceC1668n.invoke(m8, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0868a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1668n interfaceC1668n, Function1 function1, S5.d dVar) {
            super(2, dVar);
            this.f38579c = interfaceC1668n;
            this.f38580d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(this.f38579c, this.f38580d, dVar);
            bVar.f38578b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f38577a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC1668n interfaceC1668n = this.f38579c;
                    s.a aVar = s.f8302b;
                    C0868a c0868a = new C0868a(interfaceC1668n, null);
                    this.f38577a = 1;
                    obj = N.e(c0868a, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = s.b(obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            Function1 function1 = this.f38580d;
            Throwable e9 = s.e(b8);
            if (e9 != null && function1 != null) {
                function1.invoke(e9);
            }
            return s.a(b8);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(S5.g r4, kotlin.jvm.functions.Function1 r5, a6.InterfaceC1668n r6, S5.d r7) {
        /*
            boolean r0 = r7 instanceof r2.AbstractC3916a.C0867a
            if (r0 == 0) goto L13
            r0 = r7
            r2.a$a r0 = (r2.AbstractC3916a.C0867a) r0
            int r1 = r0.f38576b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38576b = r1
            goto L18
        L13:
            r2.a$a r0 = new r2.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38575a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f38576b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            O5.t.b(r7)
            r2.a$b r7 = new r2.a$b
            r2 = 0
            r7.<init>(r6, r5, r2)
            r0.f38576b = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r4, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            O5.s r7 = (O5.s) r7
            java.lang.Object r4 = r7.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.AbstractC3916a.a(S5.g, kotlin.jvm.functions.Function1, a6.n, S5.d):java.lang.Object");
    }
}
