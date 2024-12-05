package com.stripe.android.paymentsheet;

import A2.j;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.f;
import com.stripe.android.paymentsheet.u;
import e3.InterfaceC2795i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3419e;
import t3.InterfaceC4027a;

/* renamed from: com.stripe.android.paymentsheet.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2626a implements f {

    /* renamed from: f, reason: collision with root package name */
    private static final C0573a f26570f = new C0573a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f26571g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final int f26572h = t3.w.f39788h0;

    /* renamed from: b, reason: collision with root package name */
    private final h3.m f26573b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26574c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f26575d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f26576e;

    /* renamed from: com.stripe.android.paymentsheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0573a {
        private C0573a() {
        }

        public /* synthetic */ C0573a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26577a;

        /* renamed from: c, reason: collision with root package name */
        int f26579c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26577a = obj;
            this.f26579c |= Integer.MIN_VALUE;
            Object h8 = C2626a.this.h(null, this);
            return h8 == T5.b.e() ? h8 : O5.s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26580a;

        /* renamed from: b, reason: collision with root package name */
        Object f26581b;

        /* renamed from: c, reason: collision with root package name */
        Object f26582c;

        /* renamed from: d, reason: collision with root package name */
        Object f26583d;

        /* renamed from: e, reason: collision with root package name */
        boolean f26584e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f26585f;

        /* renamed from: h, reason: collision with root package name */
        int f26587h;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26585f = obj;
            this.f26587h |= Integer.MIN_VALUE;
            return C2626a.this.k(null, null, null, null, false, this);
        }
    }

    public C2626a(h3.m stripeRepository, boolean z8, Function0 publishableKeyProvider, Function0 stripeAccountIdProvider) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.f26573b = stripeRepository;
        this.f26574c = z8;
        this.f26575d = publishableKeyProvider;
        this.f26576e = stripeAccountIdProvider;
    }

    private final f.b.C0605b e(String str, b.d dVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, boolean z8) {
        return new f.b.C0605b(AbstractC3419e.f34946a.a(str, dVar).a(oVar, rVar), z8);
    }

    private final f.b.C0605b f(String str, b.d dVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar) {
        InterfaceC2795i b8;
        AbstractC3419e a8 = AbstractC3419e.f34946a.a(str, dVar);
        String w8 = pVar.w();
        if (w8 != null) {
            b8 = a8.c(w8, o.p.f25586h, rVar);
        } else {
            b8 = a8.b(pVar, rVar);
        }
        return new f.b.C0605b(b8, false);
    }

    static /* synthetic */ f.b.C0605b g(C2626a c2626a, String str, b.d dVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            rVar = null;
        }
        return c2626a.f(str, dVar, pVar, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.stripe.android.model.p r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.C2626a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.paymentsheet.a$b r0 = (com.stripe.android.paymentsheet.C2626a.b) r0
            int r1 = r0.f26579c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26579c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.a$b r0 = new com.stripe.android.paymentsheet.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26577a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26579c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r6)
            O5.s r6 = (O5.s) r6
            java.lang.Object r5 = r6.j()
            goto L49
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r6)
            h3.m r6 = r4.f26573b
            A2.j$c r2 = r4.i()
            r0.f26579c = r3
            java.lang.Object r5 = r6.n(r5, r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2626a.h(com.stripe.android.model.p, S5.d):java.lang.Object");
    }

    private final j.c i() {
        return new j.c((String) this.f26575d.invoke(), (String) this.f26576e.invoke(), null, 4, null);
    }

    private final Object j(u.m mVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, S5.d dVar2) {
        f.f27025a.a();
        throw new IllegalStateException((InterfaceC4027a.class.getSimpleName() + " must be implemented when using IntentConfiguration with PaymentSheet").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.stripe.android.paymentsheet.u.m r34, com.stripe.android.model.p r35, com.stripe.android.model.r r36, com.stripe.android.model.b.d r37, boolean r38, S5.d r39) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2626a.k(com.stripe.android.paymentsheet.u$m, com.stripe.android.model.p, com.stripe.android.model.r, com.stripe.android.model.b$d, boolean, S5.d):java.lang.Object");
    }

    @Override // com.stripe.android.paymentsheet.f
    public Object a(u.l lVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, S5.d dVar2) {
        if (lVar instanceof u.l.a) {
            return k(((u.l.a) lVar).b(), pVar, rVar, dVar, z8, dVar2);
        }
        if (lVar instanceof u.l.b) {
            return f(((u.l.b) lVar).d(), dVar, pVar, rVar);
        }
        if (lVar instanceof u.l.c) {
            return g(this, ((u.l.c) lVar).d(), dVar, pVar, null, 8, null);
        }
        throw new O5.p();
    }

    @Override // com.stripe.android.paymentsheet.f
    public Object b(u.l lVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, S5.d dVar2) {
        b.c cVar;
        boolean z8;
        if (lVar instanceof u.l.a) {
            b.c cVar2 = b.c.f25285c;
            u.m b8 = ((u.l.a) lVar).b();
            if (rVar != null) {
                cVar = com.stripe.android.model.s.a(rVar);
            } else {
                cVar = null;
            }
            if (cVar == cVar2) {
                z8 = true;
            } else {
                z8 = false;
            }
            return j(b8, oVar, rVar, dVar, z8, dVar2);
        }
        if (lVar instanceof u.l.b) {
            return e(((u.l.b) lVar).d(), dVar, oVar, rVar, false);
        }
        if (lVar instanceof u.l.c) {
            return e(((u.l.c) lVar).d(), dVar, oVar, rVar, false);
        }
        throw new O5.p();
    }
}
