package M3;

import M3.C1320o;
import M3.InterfaceC1318m;
import M3.InterfaceC1319n;
import M3.InterfaceC1324t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1671q;
import com.stripe.android.model.o;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.U0;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* renamed from: M3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1315j implements InterfaceC1324t {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f6928a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1668n f6929b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1669o f6930c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6931d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6932e;

    /* renamed from: f, reason: collision with root package name */
    private final o6.w f6933f;

    /* renamed from: g, reason: collision with root package name */
    private final o6.w f6934g;

    /* renamed from: h, reason: collision with root package name */
    private final o6.w f6935h;

    /* renamed from: i, reason: collision with root package name */
    private final o6.w f6936i;

    /* renamed from: j, reason: collision with root package name */
    private final o6.w f6937j;

    /* renamed from: k, reason: collision with root package name */
    private final l6.M f6938k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3698L f6939l;

    /* renamed from: M3.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1324t.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6940a = new a();

        private a() {
        }

        @Override // M3.InterfaceC1324t.a
        public InterfaceC1324t a(com.stripe.android.model.o initialPaymentMethod, Function1 eventHandler, InterfaceC1668n removeExecutor, InterfaceC1669o updateExecutor, B2.b displayName, boolean z8, boolean z9) {
            AbstractC3255y.i(initialPaymentMethod, "initialPaymentMethod");
            AbstractC3255y.i(eventHandler, "eventHandler");
            AbstractC3255y.i(removeExecutor, "removeExecutor");
            AbstractC3255y.i(updateExecutor, "updateExecutor");
            AbstractC3255y.i(displayName, "displayName");
            return new C1315j(initialPaymentMethod, displayName, eventHandler, removeExecutor, updateExecutor, z8, z9, null, 128, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.j$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6941a;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r8.f6941a
                r2 = 0
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L35
                if (r1 == r7) goto L31
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L29
                if (r1 == r4) goto L25
                if (r1 != r3) goto L1d
                O5.t.b(r9)
                goto L9b
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                O5.t.b(r9)
                goto L8a
            L29:
                O5.t.b(r9)
                goto L73
            L2d:
                O5.t.b(r9)
                goto L58
            L31:
                O5.t.b(r9)
                goto L47
            L35:
                O5.t.b(r9)
                M3.j r9 = M3.C1315j.this
                o6.w r9 = M3.C1315j.f(r9)
                r8.f6941a = r7
                java.lang.Object r9 = r9.emit(r2, r8)
                if (r9 != r0) goto L47
                return r0
            L47:
                M3.j r9 = M3.C1315j.this
                o6.w r9 = M3.C1315j.k(r9)
                M3.o$b r1 = M3.C1320o.b.f7061c
                r8.f6941a = r6
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L58
                return r0
            L58:
                M3.j r9 = M3.C1315j.this
                o6.w r9 = M3.C1315j.h(r9)
                java.lang.Object r9 = r9.getValue()
                com.stripe.android.model.o r9 = (com.stripe.android.model.o) r9
                M3.j r1 = M3.C1315j.this
                a6.n r1 = M3.C1315j.j(r1)
                r8.f6941a = r5
                java.lang.Object r9 = r1.invoke(r9, r8)
                if (r9 != r0) goto L73
                return r0
            L73:
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                M3.j r1 = M3.C1315j.this
                o6.w r1 = M3.C1315j.f(r1)
                if (r9 == 0) goto L81
                B2.b r2 = s2.AbstractC3992a.a(r9)
            L81:
                r8.f6941a = r4
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L8a
                return r0
            L8a:
                M3.j r9 = M3.C1315j.this
                o6.w r9 = M3.C1315j.k(r9)
                M3.o$b r1 = M3.C1320o.b.f7059a
                r8.f6941a = r3
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L9b
                return r0
            L9b:
                O5.I r9 = O5.I.f8278a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: M3.C1315j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.j$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f6943a;

        /* renamed from: b, reason: collision with root package name */
        int f6944b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1320o.a f6946d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1320o.a aVar, S5.d dVar) {
            super(2, dVar);
            this.f6946d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f6946d, dVar);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0053 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r5.f6944b
                r2 = 0
                switch(r1) {
                    case 0: goto L2f;
                    case 1: goto L2b;
                    case 2: goto L27;
                    case 3: goto L23;
                    case 4: goto L1c;
                    case 5: goto L17;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L12:
                O5.t.b(r6)
                goto Lc5
            L17:
                O5.t.b(r6)
                goto Lb1
            L1c:
                java.lang.Object r1 = r5.f6943a
                O5.t.b(r6)
                goto L95
            L23:
                O5.t.b(r6)
                goto L74
            L27:
                O5.t.b(r6)
                goto L54
            L2b:
                O5.t.b(r6)
                goto L42
            L2f:
                O5.t.b(r6)
                M3.j r6 = M3.C1315j.this
                o6.w r6 = M3.C1315j.f(r6)
                r1 = 1
                r5.f6944b = r1
                java.lang.Object r6 = r6.emit(r2, r5)
                if (r6 != r0) goto L42
                return r0
            L42:
                M3.j r6 = M3.C1315j.this
                o6.w r6 = M3.C1315j.k(r6)
                M3.o$b r1 = M3.C1320o.b.f7060b
                r3 = 2
                r5.f6944b = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
                return r0
            L54:
                M3.j r6 = M3.C1315j.this
                a6.o r6 = M3.C1315j.l(r6)
                M3.j r1 = M3.C1315j.this
                o6.w r1 = M3.C1315j.h(r1)
                java.lang.Object r1 = r1.getValue()
                M3.o$a r3 = r5.f6946d
                e3.e r3 = r3.a()
                r4 = 3
                r5.f6944b = r4
                java.lang.Object r6 = r6.invoke(r1, r3, r5)
                if (r6 != r0) goto L74
                return r0
            L74:
                O5.s r6 = (O5.s) r6
                java.lang.Object r1 = r6.j()
                M3.j r6 = M3.C1315j.this
                boolean r3 = O5.s.h(r1)
                if (r3 == 0) goto L95
                r3 = r1
                com.stripe.android.model.o r3 = (com.stripe.android.model.o) r3
                o6.w r6 = M3.C1315j.h(r6)
                r5.f6943a = r1
                r4 = 4
                r5.f6944b = r4
                java.lang.Object r6 = r6.emit(r3, r5)
                if (r6 != r0) goto L95
                return r0
            L95:
                M3.j r6 = M3.C1315j.this
                java.lang.Throwable r3 = O5.s.e(r1)
                if (r3 == 0) goto Lb1
                o6.w r6 = M3.C1315j.f(r6)
                B2.b r3 = s2.AbstractC3992a.a(r3)
                r5.f6943a = r1
                r1 = 5
                r5.f6944b = r1
                java.lang.Object r6 = r6.emit(r3, r5)
                if (r6 != r0) goto Lb1
                return r0
            Lb1:
                M3.j r6 = M3.C1315j.this
                o6.w r6 = M3.C1315j.k(r6)
                M3.o$b r1 = M3.C1320o.b.f7059a
                r5.f6943a = r2
                r2 = 6
                r5.f6944b = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto Lc5
                return r0
            Lc5:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: M3.C1315j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: M3.j$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements InterfaceC1671q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B2.b f6948b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B2.b bVar) {
            super(5);
            this.f6948b = bVar;
        }

        public final C1320o a(com.stripe.android.model.o paymentMethod, C1320o.a choice, C1320o.b status, boolean z8, B2.b bVar) {
            AbstractC3255y.i(paymentMethod, "paymentMethod");
            AbstractC3255y.i(choice, "choice");
            AbstractC3255y.i(status, "status");
            C1320o.a p8 = C1315j.this.p(paymentMethod);
            return new C1320o(status, C1315j.this.o(paymentMethod), this.f6948b, !AbstractC3255y.d(p8, choice), choice, C1315j.this.m(paymentMethod), C1315j.this.f6931d, z8, bVar);
        }

        @Override // a6.InterfaceC1671q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return a((com.stripe.android.model.o) obj, (C1320o.a) obj2, (C1320o.b) obj3, ((Boolean) obj4).booleanValue(), (B2.b) obj5);
        }
    }

    public C1315j(com.stripe.android.model.o initialPaymentMethod, B2.b displayName, Function1 eventHandler, InterfaceC1668n removeExecutor, InterfaceC1669o updateExecutor, boolean z8, boolean z9, S5.g workContext) {
        AbstractC3255y.i(initialPaymentMethod, "initialPaymentMethod");
        AbstractC3255y.i(displayName, "displayName");
        AbstractC3255y.i(eventHandler, "eventHandler");
        AbstractC3255y.i(removeExecutor, "removeExecutor");
        AbstractC3255y.i(updateExecutor, "updateExecutor");
        AbstractC3255y.i(workContext, "workContext");
        this.f6928a = eventHandler;
        this.f6929b = removeExecutor;
        this.f6930c = updateExecutor;
        this.f6931d = z8;
        this.f6932e = z9;
        o6.w a8 = AbstractC3700N.a(p(initialPaymentMethod));
        this.f6933f = a8;
        o6.w a9 = AbstractC3700N.a(C1320o.b.f7059a);
        this.f6934g = a9;
        o6.w a10 = AbstractC3700N.a(initialPaymentMethod);
        this.f6935h = a10;
        o6.w a11 = AbstractC3700N.a(Boolean.FALSE);
        this.f6936i = a11;
        o6.w a12 = AbstractC3700N.a(null);
        this.f6937j = a12;
        this.f6938k = l6.N.a(workContext.plus(U0.b(null, 1, null)));
        this.f6939l = y4.g.g(a10, a8, a9, a11, a12, new d(displayName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List m(com.stripe.android.model.o oVar) {
        Set a8;
        o.g.c cVar = n(oVar).f25540k;
        if (cVar != null && (a8 = cVar.a()) != null) {
            Set set = a8;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(x(EnumC2791e.f31442m.b((String) it.next())));
            }
            return arrayList;
        }
        return AbstractC1378t.m();
    }

    private final o.g n(com.stripe.android.model.o oVar) {
        o.g gVar = oVar.f25470h;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("Payment method must be a card in order to be edited");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(com.stripe.android.model.o oVar) {
        String str = n(oVar).f25537h;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Card payment method must contain last 4 digits");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1320o.a p(com.stripe.android.model.o oVar) {
        return x(EnumC2791e.f31442m.b(n(oVar).f25541l));
    }

    private final void q(C1320o.a aVar) {
        this.f6933f.setValue(aVar);
        this.f6928a.invoke(new InterfaceC1319n.a.C0131a(aVar.a()));
    }

    private final void r() {
        this.f6928a.invoke(new InterfaceC1319n.a.C0131a(null));
    }

    private final void s() {
        this.f6928a.invoke(new InterfaceC1319n.a.b(((C1320o.a) this.f6933f.getValue()).a()));
    }

    private final void t() {
        this.f6936i.setValue(Boolean.FALSE);
    }

    private final void u() {
        this.f6936i.setValue(Boolean.FALSE);
        AbstractC3364k.d(this.f6938k, null, null, new b(null), 3, null);
    }

    private final void v() {
        this.f6936i.setValue(Boolean.TRUE);
    }

    private final void w() {
        com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f6935h.getValue();
        C1320o.a aVar = (C1320o.a) this.f6933f.getValue();
        if (!AbstractC3255y.d(p(oVar), aVar)) {
            AbstractC3364k.d(this.f6938k, null, null, new c(aVar, null), 3, null);
        }
    }

    private final C1320o.a x(EnumC2791e enumC2791e) {
        return new C1320o.a(enumC2791e);
    }

    @Override // M3.InterfaceC1319n
    public InterfaceC3698L a() {
        return this.f6939l;
    }

    @Override // M3.InterfaceC1319n
    public void b(InterfaceC1318m viewAction) {
        AbstractC3255y.i(viewAction, "viewAction");
        if (viewAction instanceof InterfaceC1318m.f) {
            v();
            return;
        }
        if (viewAction instanceof InterfaceC1318m.e) {
            u();
            return;
        }
        if (viewAction instanceof InterfaceC1318m.g) {
            w();
            return;
        }
        if (viewAction instanceof InterfaceC1318m.c) {
            s();
            return;
        }
        if (viewAction instanceof InterfaceC1318m.b) {
            r();
        } else if (viewAction instanceof InterfaceC1318m.a) {
            q(((InterfaceC1318m.a) viewAction).a());
        } else if (viewAction instanceof InterfaceC1318m.d) {
            t();
        }
    }

    @Override // M3.InterfaceC1324t
    public boolean c() {
        return this.f6932e;
    }

    @Override // M3.InterfaceC1324t
    public void close() {
        l6.N.d(this.f6938k, null, 1, null);
    }

    public /* synthetic */ C1315j(com.stripe.android.model.o oVar, B2.b bVar, Function1 function1, InterfaceC1668n interfaceC1668n, InterfaceC1669o interfaceC1669o, boolean z8, boolean z9, S5.g gVar, int i8, AbstractC3247p abstractC3247p) {
        this(oVar, bVar, function1, interfaceC1668n, interfaceC1669o, z8, z9, (i8 & 128) != 0 ? C3347b0.a() : gVar);
    }
}
