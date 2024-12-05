package com.stripe.android.customersheet;

import L5.I;
import L5.s;
import L5.t;
import M5.AbstractC1246t;
import M5.a0;
import X5.n;
import com.stripe.android.model.o;
import i6.M;
import i6.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class f implements B2.b {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f23713a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f23714b;

    /* renamed from: c, reason: collision with root package name */
    private final H3.e f23715c;

    /* renamed from: d, reason: collision with root package name */
    private final o3.d f23716d;

    /* renamed from: e, reason: collision with root package name */
    private final X2.d f23717e;

    /* renamed from: f, reason: collision with root package name */
    private final U f23718f;

    /* renamed from: g, reason: collision with root package name */
    private final k3.i f23719g;

    /* renamed from: h, reason: collision with root package name */
    private final P5.g f23720h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23721a;

        /* renamed from: b, reason: collision with root package name */
        Object f23722b;

        /* renamed from: c, reason: collision with root package name */
        Object f23723c;

        /* renamed from: d, reason: collision with root package name */
        Object f23724d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f23725e;

        /* renamed from: g, reason: collision with root package name */
        int f23727g;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23725e = obj;
            this.f23727g |= Integer.MIN_VALUE;
            return f.this.g(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23728a;

        /* renamed from: b, reason: collision with root package name */
        Object f23729b;

        /* renamed from: c, reason: collision with root package name */
        Object f23730c;

        /* renamed from: d, reason: collision with root package name */
        Object f23731d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f23732e;

        /* renamed from: g, reason: collision with root package name */
        int f23734g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23732e = obj;
            this.f23734g |= Integer.MIN_VALUE;
            Object a8 = f.this.a(null, this);
            return a8 == Q5.b.e() ? a8 : s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23735a;

        /* renamed from: c, reason: collision with root package name */
        int f23737c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23735a = obj;
            this.f23737c |= Integer.MIN_VALUE;
            Object j8 = f.this.j(null, null, null, this);
            return j8 == Q5.b.e() ? j8 : s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23738a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f23740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f23741d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B2.a f23742e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f23743a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.f23743a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o invoke(String id) {
                Object obj;
                AbstractC3159y.i(id, "id");
                Iterator it = this.f23743a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((o) obj).f24408a, id)) {
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
        public static final class b extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f23744a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(o oVar) {
                super(2);
                this.f23744a = oVar;
            }

            @Override // X5.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(o oVar, o oVar2) {
                String str;
                int i8;
                String str2 = oVar.f24408a;
                o oVar3 = this.f23744a;
                String str3 = null;
                if (oVar3 != null) {
                    str = oVar3.f24408a;
                } else {
                    str = null;
                }
                if (AbstractC3159y.d(str2, str)) {
                    i8 = -1;
                } else {
                    String str4 = oVar2.f24408a;
                    o oVar4 = this.f23744a;
                    if (oVar4 != null) {
                        str3 = oVar4.f24408a;
                    }
                    if (AbstractC3159y.d(str4, str3)) {
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
        public static final class c extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f23745a;

            c(com.stripe.android.customersheet.a aVar, P5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(null, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                int i8 = this.f23745a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f23745a = 1;
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.customersheet.f$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0464d extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f23746a;

            C0464d(com.stripe.android.customersheet.a aVar, P5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0464d(null, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0464d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                int i8 = this.f23746a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f23746a = 1;
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.customersheet.a aVar, h hVar, f fVar, B2.a aVar2, P5.d dVar) {
            super(2, dVar);
            this.f23740c = hVar;
            this.f23741d = fVar;
            this.f23742e = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int h(n nVar, Object obj, Object obj2) {
            return ((Number) nVar.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(null, this.f23740c, this.f23741d, this.f23742e, dVar);
            dVar2.f23739b = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23747a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23748b;

        /* renamed from: d, reason: collision with root package name */
        int f23750d;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23748b = obj;
            this.f23750d |= Integer.MIN_VALUE;
            Object k8 = f.this.k(this);
            return k8 == Q5.b.e() ? k8 : s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.customersheet.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0465f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0465f f23751a = new C0465f();

        C0465f() {
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
        Object f23752a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23753b;

        /* renamed from: d, reason: collision with root package name */
        int f23755d;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23753b = obj;
            this.f23755d |= Integer.MIN_VALUE;
            Object l8 = f.this.l(null, this);
            return l8 == Q5.b.e() ? l8 : s.a(l8);
        }
    }

    public f(Function0 isLiveModeProvider, Function1 googlePayRepositoryFactory, H3.e elementsSessionRepository, o3.d isFinancialConnectionsAvailable, X2.d lpmRepository, U customerAdapterProvider, k3.i errorReporter, P5.g workContext) {
        AbstractC3159y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3159y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3159y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3159y.i(lpmRepository, "lpmRepository");
        AbstractC3159y.i(customerAdapterProvider, "customerAdapterProvider");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        this.f23713a = isLiveModeProvider;
        this.f23714b = googlePayRepositoryFactory;
        this.f23715c = elementsSessionRepository;
        this.f23716d = isFinancialConnectionsAvailable;
        this.f23717e = lpmRepository;
        this.f23718f = customerAdapterProvider;
        this.f23719g = errorReporter;
        this.f23720h = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(B2.a r12, com.stripe.android.model.j r13, P5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.customersheet.f.a
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.customersheet.f$a r0 = (com.stripe.android.customersheet.f.a) r0
            int r1 = r0.f23727g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23727g = r1
            goto L18
        L13:
            com.stripe.android.customersheet.f$a r0 = new com.stripe.android.customersheet.f$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f23725e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23727g
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r12 = r0.f23724d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.f23723c
            com.stripe.android.model.j r13 = (com.stripe.android.model.j) r13
            java.lang.Object r1 = r0.f23722b
            B2.a r1 = (B2.a) r1
            java.lang.Object r0 = r0.f23721a
            com.stripe.android.customersheet.f r0 = (com.stripe.android.customersheet.f) r0
            L5.t.b(r14)
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
            L5.t.b(r14)
            X2.d r14 = r11.f23717e
            com.stripe.android.model.StripeIntent r2 = r13.s()
            java.lang.String r4 = r13.n()
            X2.d$a r14 = r14.b(r2, r4)
            java.util.List r14 = r14.c()
            boolean r2 = r12.i()
            if (r2 == 0) goto L9f
            kotlin.jvm.functions.Function1 r2 = r11.f23714b
            kotlin.jvm.functions.Function0 r4 = r11.f23713a
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L74
            I2.d r4 = I2.d.f3910b
            goto L76
        L74:
            I2.d r4 = I2.d.f3911c
        L76:
            java.lang.Object r2 = r2.invoke(r4)
            I2.g r2 = (I2.g) r2
            l6.f r2 = r2.isReady()
            r0.f23721a = r11
            r0.f23722b = r12
            r0.f23723c = r13
            r0.f23724d = r14
            r0.f23727g = r3
            java.lang.Object r0 = l6.AbstractC3360h.u(r2, r0)
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
            Y2.d$a r4 = Y2.d.f13031q
            o3.d r9 = r1.f23716d
            Y2.d r12 = r4.a(r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.g(B2.a, com.stripe.android.model.j, P5.d):java.lang.Object");
    }

    private final List h(com.stripe.android.customersheet.a aVar) {
        if (aVar.h()) {
            List g8 = aVar.g();
            if (g8 == null) {
                return AbstractC1246t.m();
            }
            return g8;
        }
        return AbstractC1246t.e("card");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List i(List list) {
        Set k8 = a0.k(o.p.f24532i.f24550a, o.p.f24522O.f24550a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (k8.contains(((X2.g) obj).d())) {
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
    public final java.lang.Object j(com.stripe.android.customersheet.a r11, B2.a r12, com.stripe.android.customersheet.h r13, P5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.stripe.android.customersheet.f.c
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.customersheet.f$c r0 = (com.stripe.android.customersheet.f.c) r0
            int r1 = r0.f23737c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23737c = r1
            goto L18
        L13:
            com.stripe.android.customersheet.f$c r0 = new com.stripe.android.customersheet.f$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f23735a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23737c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r14)
            goto L48
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            L5.t.b(r14)
            com.stripe.android.customersheet.f$d r14 = new com.stripe.android.customersheet.f$d
            r9 = 0
            r4 = r14
            r5 = r11
            r6 = r13
            r7 = r10
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f23737c = r3
            java.lang.Object r14 = i6.N.e(r14, r0)
            if (r14 != r1) goto L48
            return r1
        L48:
            L5.s r14 = (L5.s) r14
            java.lang.Object r11 = r14.k()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.j(com.stripe.android.customersheet.a, B2.a, com.stripe.android.customersheet.h, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.stripe.android.customersheet.f.e
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.customersheet.f$e r0 = (com.stripe.android.customersheet.f.e) r0
            int r1 = r0.f23750d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23750d = r1
            goto L18
        L13:
            com.stripe.android.customersheet.f$e r0 = new com.stripe.android.customersheet.f$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23748b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23750d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f23747a
            com.stripe.android.customersheet.f r0 = (com.stripe.android.customersheet.f) r0
            L5.t.b(r9)
            L5.s r9 = (L5.s) r9
            java.lang.Object r9 = r9.k()
            goto L57
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            L5.t.b(r9)
            i6.U r9 = r8.f23718f
            h6.a$a r2 = h6.C2758a.f31409b
            r2 = 5
            h6.d r4 = h6.EnumC2761d.f31419e
            long r4 = h6.AbstractC2760c.s(r2, r4)
            com.stripe.android.customersheet.f$f r2 = com.stripe.android.customersheet.f.C0465f.f23751a
            r0.f23747a = r8
            r0.f23750d = r3
            java.lang.Object r9 = B2.c.a(r9, r4, r2, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r0 = r8
        L57:
            java.lang.Throwable r1 = L5.s.e(r9)
            if (r1 == 0) goto L6d
            k3.i r2 = r0.f23719g
            k3.i$d r3 = k3.i.d.f33401g
            t2.k$a r0 = t2.AbstractC3790k.f38229e
            t2.k r4 = r0.b(r1)
            r6 = 4
            r7 = 0
            r5 = 0
            k3.i.b.a(r2, r3, r4, r5, r6, r7)
        L6d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.k(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.stripe.android.customersheet.a r17, P5.d r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.stripe.android.customersheet.f.g
            if (r2 == 0) goto L18
            r2 = r1
            com.stripe.android.customersheet.f$g r2 = (com.stripe.android.customersheet.f.g) r2
            int r3 = r2.f23755d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f23755d = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            com.stripe.android.customersheet.f$g r2 = new com.stripe.android.customersheet.f$g
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f23753b
            java.lang.Object r2 = Q5.b.e()
            int r3 = r8.f23755d
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            java.lang.Object r2 = r8.f23752a
            com.stripe.android.customersheet.f r2 = (com.stripe.android.customersheet.f) r2
            L5.t.b(r1)
            L5.s r1 = (L5.s) r1
            java.lang.Object r1 = r1.k()
            goto L74
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            L5.t.b(r1)
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
            H3.e r3 = r0.f23715c
            java.util.List r6 = M5.AbstractC1246t.m()
            r8.f23752a = r0
            r8.f23755d = r4
            r5 = 0
            r7 = 0
            r4 = r1
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r8)
            if (r1 != r2) goto L73
            return r2
        L73:
            r2 = r0
        L74:
            java.lang.Throwable r3 = L5.s.e(r1)
            if (r3 == 0) goto L8a
            k3.i r4 = r2.f23719g
            k3.i$d r5 = k3.i.d.f33399e
            t2.k$a r2 = t2.AbstractC3790k.f38229e
            t2.k r6 = r2.b(r3)
            r8 = 4
            r9 = 0
            r7 = 0
            k3.i.b.a(r4, r5, r6, r7, r8, r9)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.l(com.stripe.android.customersheet.a, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0033, B:15:0x00e4, B:17:0x00ea, B:18:0x00fa, B:25:0x005a, B:27:0x00cc, B:31:0x006f, B:32:0x00b3, B:37:0x0081, B:38:0x009e, B:42:0x008e), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // B2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(B2.a r10, P5.d r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.f.a(B2.a, P5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Function0 isLiveModeProvider, Function1 googlePayRepositoryFactory, H3.e elementsSessionRepository, o3.d isFinancialConnectionsAvailable, X2.d lpmRepository, k3.i errorReporter, P5.g workContext) {
        this(isLiveModeProvider, googlePayRepositoryFactory, elementsSessionRepository, isFinancialConnectionsAvailable, lpmRepository, F2.a.f2440a.a(), errorReporter, workContext);
        AbstractC3159y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3159y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3159y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3159y.i(lpmRepository, "lpmRepository");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
    }
}
