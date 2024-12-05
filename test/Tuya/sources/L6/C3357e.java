package l6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3357e implements InterfaceC3358f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3358f f34632a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f34633b;

    /* renamed from: c, reason: collision with root package name */
    public final X5.n f34634c;

    /* renamed from: l6.e$a */
    /* loaded from: classes5.dex */
    static final class a implements InterfaceC3359g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f34636b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3359g f34637c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l6.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0786a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f34638a;

            /* renamed from: c, reason: collision with root package name */
            int f34640c;

            C0786a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f34638a = obj;
                this.f34640c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(T t8, InterfaceC3359g interfaceC3359g) {
            this.f34636b = t8;
            this.f34637c = interfaceC3359g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // l6.InterfaceC3359g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, P5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l6.C3357e.a.C0786a
                if (r0 == 0) goto L13
                r0 = r7
                l6.e$a$a r0 = (l6.C3357e.a.C0786a) r0
                int r1 = r0.f34640c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34640c = r1
                goto L18
            L13:
                l6.e$a$a r0 = new l6.e$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f34638a
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f34640c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                L5.t.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                L5.t.b(r7)
                l6.e r7 = l6.C3357e.this
                kotlin.jvm.functions.Function1 r7 = r7.f34633b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.T r2 = r5.f34636b
                java.lang.Object r2 = r2.f33761a
                n6.F r4 = m6.s.f35934a
                if (r2 == r4) goto L58
                l6.e r4 = l6.C3357e.this
                X5.n r4 = r4.f34634c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                L5.I r6 = L5.I.f6487a
                return r6
            L58:
                kotlin.jvm.internal.T r2 = r5.f34636b
                r2.f33761a = r7
                l6.g r7 = r5.f34637c
                r0.f34640c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                L5.I r6 = L5.I.f6487a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.C3357e.a.emit(java.lang.Object, P5.d):java.lang.Object");
        }
    }

    public C3357e(InterfaceC3358f interfaceC3358f, Function1 function1, X5.n nVar) {
        this.f34632a = interfaceC3358f;
        this.f34633b = function1;
        this.f34634c = nVar;
    }

    @Override // l6.InterfaceC3358f
    public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        T t8 = new T();
        t8.f33761a = m6.s.f35934a;
        Object collect = this.f34632a.collect(new a(t8, interfaceC3359g), dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return L5.I.f6487a;
    }
}
