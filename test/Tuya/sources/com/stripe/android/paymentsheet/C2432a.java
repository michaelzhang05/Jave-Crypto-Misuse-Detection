package com.stripe.android.paymentsheet;

import b3.InterfaceC1874i;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.f;
import com.stripe.android.paymentsheet.u;
import j2.AbstractC3065e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.InterfaceC3648a;
import x2.j;

/* renamed from: com.stripe.android.paymentsheet.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2432a implements f {

    /* renamed from: f, reason: collision with root package name */
    private static final C0577a f25515f = new C0577a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f25516g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final int f25517h = q3.w.f37466h0;

    /* renamed from: b, reason: collision with root package name */
    private final e3.m f25518b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25519c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f25520d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f25521e;

    /* renamed from: com.stripe.android.paymentsheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0577a {
        private C0577a() {
        }

        public /* synthetic */ C0577a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25522a;

        /* renamed from: c, reason: collision with root package name */
        int f25524c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25522a = obj;
            this.f25524c |= Integer.MIN_VALUE;
            Object h8 = C2432a.this.h(null, this);
            return h8 == Q5.b.e() ? h8 : L5.s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25525a;

        /* renamed from: b, reason: collision with root package name */
        Object f25526b;

        /* renamed from: c, reason: collision with root package name */
        Object f25527c;

        /* renamed from: d, reason: collision with root package name */
        Object f25528d;

        /* renamed from: e, reason: collision with root package name */
        boolean f25529e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f25530f;

        /* renamed from: h, reason: collision with root package name */
        int f25532h;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25530f = obj;
            this.f25532h |= Integer.MIN_VALUE;
            return C2432a.this.k(null, null, null, null, false, this);
        }
    }

    public C2432a(e3.m stripeRepository, boolean z8, Function0 publishableKeyProvider, Function0 stripeAccountIdProvider) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.f25518b = stripeRepository;
        this.f25519c = z8;
        this.f25520d = publishableKeyProvider;
        this.f25521e = stripeAccountIdProvider;
    }

    private final f.b.C0609b e(String str, b.d dVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, boolean z8) {
        return new f.b.C0609b(AbstractC3065e.f32970a.a(str, dVar).a(oVar, rVar), z8);
    }

    private final f.b.C0609b f(String str, b.d dVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar) {
        InterfaceC1874i b8;
        AbstractC3065e a8 = AbstractC3065e.f32970a.a(str, dVar);
        String u8 = pVar.u();
        if (u8 != null) {
            b8 = a8.c(u8, o.p.f24531h, rVar);
        } else {
            b8 = a8.b(pVar, rVar);
        }
        return new f.b.C0609b(b8, false);
    }

    static /* synthetic */ f.b.C0609b g(C2432a c2432a, String str, b.d dVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            rVar = null;
        }
        return c2432a.f(str, dVar, pVar, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.stripe.android.model.p r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.C2432a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.paymentsheet.a$b r0 = (com.stripe.android.paymentsheet.C2432a.b) r0
            int r1 = r0.f25524c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25524c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.a$b r0 = new com.stripe.android.paymentsheet.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25522a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25524c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r6)
            L5.s r6 = (L5.s) r6
            java.lang.Object r5 = r6.k()
            goto L49
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r6)
            e3.m r6 = r4.f25518b
            x2.j$c r2 = r4.i()
            r0.f25524c = r3
            java.lang.Object r5 = r6.B(r5, r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2432a.h(com.stripe.android.model.p, P5.d):java.lang.Object");
    }

    private final j.c i() {
        return new j.c((String) this.f25520d.invoke(), (String) this.f25521e.invoke(), null, 4, null);
    }

    private final Object j(u.m mVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, P5.d dVar2) {
        f.f25970a.a();
        throw new IllegalStateException((InterfaceC3648a.class.getSimpleName() + " must be implemented when using IntentConfiguration with PaymentSheet").toString());
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
    public final java.lang.Object k(com.stripe.android.paymentsheet.u.m r34, com.stripe.android.model.p r35, com.stripe.android.model.r r36, com.stripe.android.model.b.d r37, boolean r38, P5.d r39) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2432a.k(com.stripe.android.paymentsheet.u$m, com.stripe.android.model.p, com.stripe.android.model.r, com.stripe.android.model.b$d, boolean, P5.d):java.lang.Object");
    }

    @Override // com.stripe.android.paymentsheet.f
    public Object a(u.l lVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, P5.d dVar2) {
        b.c cVar;
        boolean z8;
        if (lVar instanceof u.l.a) {
            b.c cVar2 = b.c.f24230c;
            u.m c8 = ((u.l.a) lVar).c();
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
            return j(c8, oVar, rVar, dVar, z8, dVar2);
        }
        if (lVar instanceof u.l.b) {
            return e(((u.l.b) lVar).d(), dVar, oVar, rVar, false);
        }
        if (lVar instanceof u.l.c) {
            return e(((u.l.c) lVar).d(), dVar, oVar, rVar, false);
        }
        throw new L5.p();
    }

    @Override // com.stripe.android.paymentsheet.f
    public Object b(u.l lVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, P5.d dVar2) {
        if (lVar instanceof u.l.a) {
            return k(((u.l.a) lVar).c(), pVar, rVar, dVar, z8, dVar2);
        }
        if (lVar instanceof u.l.b) {
            return f(((u.l.b) lVar).d(), dVar, pVar, rVar);
        }
        if (lVar instanceof u.l.c) {
            return g(this, ((u.l.c) lVar).d(), dVar, pVar, null, 8, null);
        }
        throw new L5.p();
    }
}
