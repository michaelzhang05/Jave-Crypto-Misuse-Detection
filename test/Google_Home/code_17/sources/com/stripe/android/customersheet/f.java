package com.stripe.android.customersheet;

import O5.I;
import O5.s;
import O5.t;
import P5.AbstractC1378t;
import P5.a0;
import a3.C1622d;
import a3.C1625g;
import a6.InterfaceC1668n;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;
import l6.U;

/* loaded from: classes4.dex */
public final class f implements E2.b {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f24768a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f24769b;

    /* renamed from: c, reason: collision with root package name */
    private final K3.e f24770c;

    /* renamed from: d, reason: collision with root package name */
    private final r3.d f24771d;

    /* renamed from: e, reason: collision with root package name */
    private final C1622d f24772e;

    /* renamed from: f, reason: collision with root package name */
    private final U f24773f;

    /* renamed from: g, reason: collision with root package name */
    private final n3.i f24774g;

    /* renamed from: h, reason: collision with root package name */
    private final S5.g f24775h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24776a;

        /* renamed from: b, reason: collision with root package name */
        Object f24777b;

        /* renamed from: c, reason: collision with root package name */
        Object f24778c;

        /* renamed from: d, reason: collision with root package name */
        Object f24779d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24780e;

        /* renamed from: g, reason: collision with root package name */
        int f24782g;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24780e = obj;
            this.f24782g |= Integer.MIN_VALUE;
            return f.this.g(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24783a;

        /* renamed from: b, reason: collision with root package name */
        Object f24784b;

        /* renamed from: c, reason: collision with root package name */
        Object f24785c;

        /* renamed from: d, reason: collision with root package name */
        Object f24786d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24787e;

        /* renamed from: g, reason: collision with root package name */
        int f24789g;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24787e = obj;
            this.f24789g |= Integer.MIN_VALUE;
            Object a8 = f.this.a(null, this);
            return a8 == T5.b.e() ? a8 : s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24790a;

        /* renamed from: c, reason: collision with root package name */
        int f24792c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24790a = obj;
            this.f24792c |= Integer.MIN_VALUE;
            Object j8 = f.this.j(null, null, null, this);
            return j8 == T5.b.e() ? j8 : s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24793a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24794b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f24795c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f24796d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ E2.a f24797e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f24798a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.f24798a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o invoke(String id) {
                Object obj;
                AbstractC3255y.i(id, "id");
                Iterator it = this.f24798a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((o) obj).f25463a, id)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (o) obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f24799a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(o oVar) {
                super(2);
                this.f24799a = oVar;
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(o oVar, o oVar2) {
                String str;
                int i8;
                String str2 = oVar.f25463a;
                o oVar3 = this.f24799a;
                String str3 = null;
                if (oVar3 != null) {
                    str = oVar3.f25463a;
                } else {
                    str = null;
                }
                if (AbstractC3255y.d(str2, str)) {
                    i8 = -1;
                } else {
                    String str4 = oVar2.f25463a;
                    o oVar4 = this.f24799a;
                    if (oVar4 != null) {
                        str3 = oVar4.f25463a;
                    }
                    if (AbstractC3255y.d(str4, str3)) {
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                }
                return Integer.valueOf(i8);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f24800a;

            c(com.stripe.android.customersheet.a aVar, S5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                int i8 = this.f24800a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f24800a = 1;
                throw null;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.customersheet.f$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0460d extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f24801a;

            C0460d(com.stripe.android.customersheet.a aVar, S5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0460d(null, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                int i8 = this.f24801a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f24801a = 1;
                throw null;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0460d) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.customersheet.a aVar, h hVar, f fVar, E2.a aVar2, S5.d dVar) {
            super(2, dVar);
            this.f24795c = hVar;
            this.f24796d = fVar;
            this.f24797e = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int m(InterfaceC1668n interfaceC1668n, Object obj, Object obj2) {
            return ((Number) interfaceC1668n.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(null, this.f24795c, this.f24796d, this.f24797e, dVar);
            dVar2.f24794b = obj;
            return dVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24802a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24803b;

        /* renamed from: d, reason: collision with root package name */
        int f24805d;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24803b = obj;
            this.f24805d |= Integer.MIN_VALUE;
            Object k8 = f.this.k(this);
            return k8 == T5.b.e() ? k8 : s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.customersheet.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0461f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0461f f24806a = new C0461f();

        C0461f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Couldn't find an instance of CustomerAdapter. Are you instantiating CustomerSheet unconditionally in your app?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24807a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24808b;

        /* renamed from: d, reason: collision with root package name */
        int f24810d;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24808b = obj;
            this.f24810d |= Integer.MIN_VALUE;
            Object l8 = f.this.l(null, this);
            return l8 == T5.b.e() ? l8 : s.a(l8);
        }
    }

    public f(Function0 isLiveModeProvider, Function1 googlePayRepositoryFactory, K3.e elementsSessionRepository, r3.d isFinancialConnectionsAvailable, C1622d lpmRepository, U customerAdapterProvider, n3.i errorReporter, S5.g workContext) {
        AbstractC3255y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3255y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3255y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3255y.i(lpmRepository, "lpmRepository");
        AbstractC3255y.i(customerAdapterProvider, "customerAdapterProvider");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        this.f24768a = isLiveModeProvider;
        this.f24769b = googlePayRepositoryFactory;
        this.f24770c = elementsSessionRepository;
        this.f24771d = isFinancialConnectionsAvailable;
        this.f24772e = lpmRepository;
        this.f24773f = customerAdapterProvider;
        this.f24774g = errorReporter;
        this.f24775h = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(E2.a r12, com.stripe.android.model.j r13, S5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.customersheet.f.a
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.customersheet.f$a r0 = (com.stripe.android.customersheet.f.a) r0
            int r1 = r0.f24782g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24782g = r1
            goto L18
        L13:
            com.stripe.android.customersheet.f$a r0 = new com.stripe.android.customersheet.f$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24780e
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24782g
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r12 = r0.f24779d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.f24778c
            com.stripe.android.model.j r13 = (com.stripe.android.model.j) r13
            java.lang.Object r1 = r0.f24777b
            E2.a r1 = (E2.a) r1
            java.lang.Object r0 = r0.f24776a
            com.stripe.android.customersheet.f r0 = (com.stripe.android.customersheet.f) r0
            O5.t.b(r14)
            r10 = r14
            r14 = r12
            r12 = r1
            r1 = r0
            r0 = r10
            goto L92
        L3e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L46:
            O5.t.b(r14)
            a3.d r14 = r11.f24772e
            com.stripe.android.model.StripeIntent r2 = r13.v()
            java.lang.String r4 = r13.s()
            a3.d$a r14 = r14.b(r2, r4)
            java.util.List r14 = r14.c()
            boolean r2 = r12.i()
            if (r2 == 0) goto L9f
            kotlin.jvm.functions.Function1 r2 = r11.f24769b
            kotlin.jvm.functions.Function0 r4 = r11.f24768a
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L74
            L2.d r4 = L2.d.f5905b
            goto L76
        L74:
            L2.d r4 = L2.d.f5906c
        L76:
            java.lang.Object r2 = r2.invoke(r4)
            L2.g r2 = (L2.g) r2
            o6.f r2 = r2.isReady()
            r0.f24776a = r11
            r0.f24777b = r12
            r0.f24778c = r13
            r0.f24779d = r14
            r0.f24782g = r3
            java.lang.Object r0 = o6.AbstractC3708h.w(r2, r0)
            if (r0 != r1) goto L91
            return r1
        L91:
            r1 = r11
        L92:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La0
            r6 = r12
            r5 = r13
            r7 = r14
            r8 = 1
            goto La5
        L9f:
            r1 = r11
        La0:
            r3 = 0
            r6 = r12
            r5 = r13
            r7 = r14
            r8 = 0
        La5:
            b3.d$a r4 = b3.C1970d.f15316q
            r3.d r9 = r1.f24771d
            b3.d r12 = r4.a(r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.g(E2.a, com.stripe.android.model.j, S5.d):java.lang.Object");
    }

    private final List h(com.stripe.android.customersheet.a aVar) {
        if (aVar.f()) {
            List e8 = aVar.e();
            if (e8 == null) {
                return AbstractC1378t.m();
            }
            return e8;
        }
        return AbstractC1378t.e("card");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List i(List list) {
        Set k8 = a0.k(o.p.f25587i.f25605a, o.p.f25577O.f25605a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (k8.contains(((C1625g) obj).d())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.stripe.android.customersheet.a r11, E2.a r12, com.stripe.android.customersheet.h r13, S5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.stripe.android.customersheet.f.c
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.customersheet.f$c r0 = (com.stripe.android.customersheet.f.c) r0
            int r1 = r0.f24792c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24792c = r1
            goto L18
        L13:
            com.stripe.android.customersheet.f$c r0 = new com.stripe.android.customersheet.f$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24790a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24792c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r14)
            goto L48
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            O5.t.b(r14)
            com.stripe.android.customersheet.f$d r14 = new com.stripe.android.customersheet.f$d
            r9 = 0
            r4 = r14
            r5 = r11
            r6 = r13
            r7 = r10
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f24792c = r3
            java.lang.Object r14 = l6.N.e(r14, r0)
            if (r14 != r1) goto L48
            return r1
        L48:
            O5.s r14 = (O5.s) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.j(com.stripe.android.customersheet.a, E2.a, com.stripe.android.customersheet.h, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.stripe.android.customersheet.f.e
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.customersheet.f$e r0 = (com.stripe.android.customersheet.f.e) r0
            int r1 = r0.f24805d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24805d = r1
            goto L18
        L13:
            com.stripe.android.customersheet.f$e r0 = new com.stripe.android.customersheet.f$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f24803b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24805d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f24802a
            com.stripe.android.customersheet.f r0 = (com.stripe.android.customersheet.f) r0
            O5.t.b(r9)
            O5.s r9 = (O5.s) r9
            java.lang.Object r9 = r9.j()
            goto L57
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            O5.t.b(r9)
            l6.U r9 = r8.f24773f
            k6.a$a r2 = k6.C3225a.f34131b
            r2 = 5
            k6.d r4 = k6.EnumC3228d.f34141e
            long r4 = k6.AbstractC3227c.s(r2, r4)
            com.stripe.android.customersheet.f$f r2 = com.stripe.android.customersheet.f.C0461f.f24806a
            r0.f24802a = r8
            r0.f24805d = r3
            java.lang.Object r9 = E2.c.a(r9, r4, r2, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r0 = r8
        L57:
            java.lang.Throwable r1 = O5.s.e(r9)
            if (r1 == 0) goto L6d
            n3.i r2 = r0.f24774g
            n3.i$d r3 = n3.i.d.f35393g
            w2.k$a r0 = w2.AbstractC4144k.f40356e
            w2.k r4 = r0.b(r1)
            r6 = 4
            r7 = 0
            r5 = 0
            n3.i.b.a(r2, r3, r4, r5, r6, r7)
        L6d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.k(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.stripe.android.customersheet.a r17, S5.d r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.stripe.android.customersheet.f.g
            if (r2 == 0) goto L18
            r2 = r1
            com.stripe.android.customersheet.f$g r2 = (com.stripe.android.customersheet.f.g) r2
            int r3 = r2.f24810d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f24810d = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            com.stripe.android.customersheet.f$g r2 = new com.stripe.android.customersheet.f$g
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f24808b
            java.lang.Object r2 = T5.b.e()
            int r3 = r8.f24810d
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            java.lang.Object r2 = r8.f24807a
            com.stripe.android.customersheet.f r2 = (com.stripe.android.customersheet.f) r2
            O5.t.b(r1)
            O5.s r1 = (O5.s) r1
            java.lang.Object r1 = r1.j()
            goto L74
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            O5.t.b(r1)
            java.util.List r11 = r16.h(r17)
            com.stripe.android.paymentsheet.u$l$a r1 = new com.stripe.android.paymentsheet.u$l$a
            com.stripe.android.paymentsheet.u$m r3 = new com.stripe.android.paymentsheet.u$m
            com.stripe.android.paymentsheet.u$m$d$b r10 = new com.stripe.android.paymentsheet.u$m$d$b
            r5 = 3
            r6 = 0
            r10.<init>(r6, r6, r5, r6)
            r14 = 12
            r15 = 0
            r12 = 0
            r13 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.<init>(r3)
            K3.e r3 = r0.f24770c
            java.util.List r6 = P5.AbstractC1378t.m()
            r8.f24807a = r0
            r8.f24810d = r4
            r5 = 0
            r7 = 0
            r4 = r1
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r8)
            if (r1 != r2) goto L73
            return r2
        L73:
            r2 = r0
        L74:
            java.lang.Throwable r3 = O5.s.e(r1)
            if (r3 == 0) goto L8a
            n3.i r4 = r2.f24774g
            n3.i$d r5 = n3.i.d.f35391e
            w2.k$a r2 = w2.AbstractC4144k.f40356e
            w2.k r6 = r2.b(r3)
            r8 = 4
            r9 = 0
            r7 = 0
            n3.i.b.a(r4, r5, r6, r7, r8, r9)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.l(com.stripe.android.customersheet.a, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0033, B:15:0x00e4, B:17:0x00ea, B:18:0x00fa, B:25:0x005a, B:27:0x00cc, B:31:0x006f, B:32:0x00b3, B:37:0x0081, B:38:0x009e, B:42:0x008e), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // E2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(E2.a r10, S5.d r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.a(E2.a, S5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Function0 isLiveModeProvider, Function1 googlePayRepositoryFactory, K3.e elementsSessionRepository, r3.d isFinancialConnectionsAvailable, C1622d lpmRepository, n3.i errorReporter, S5.g workContext) {
        this(isLiveModeProvider, googlePayRepositoryFactory, elementsSessionRepository, isFinancialConnectionsAvailable, lpmRepository, I2.a.f3980a.a(), errorReporter, workContext);
        AbstractC3255y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3255y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3255y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3255y.i(lpmRepository, "lpmRepository");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
    }
}
