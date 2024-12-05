package J3;

import J3.C1207o;
import J3.InterfaceC1205m;
import J3.InterfaceC1206n;
import J3.InterfaceC1211t;
import M5.AbstractC1246t;
import b3.EnumC1870e;
import com.stripe.android.model.o;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.U0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import y2.InterfaceC3983b;

/* renamed from: J3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1202j implements InterfaceC1211t {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f5222a;

    /* renamed from: b, reason: collision with root package name */
    private final X5.n f5223b;

    /* renamed from: c, reason: collision with root package name */
    private final X5.o f5224c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5225d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5226e;

    /* renamed from: f, reason: collision with root package name */
    private final l6.v f5227f;

    /* renamed from: g, reason: collision with root package name */
    private final l6.v f5228g;

    /* renamed from: h, reason: collision with root package name */
    private final l6.v f5229h;

    /* renamed from: i, reason: collision with root package name */
    private final l6.v f5230i;

    /* renamed from: j, reason: collision with root package name */
    private final l6.v f5231j;

    /* renamed from: k, reason: collision with root package name */
    private final i6.M f5232k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3349K f5233l;

    /* renamed from: J3.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1211t.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5234a = new a();

        private a() {
        }

        @Override // J3.InterfaceC1211t.a
        public InterfaceC1211t a(com.stripe.android.model.o initialPaymentMethod, Function1 eventHandler, X5.n removeExecutor, X5.o updateExecutor, InterfaceC3983b displayName, boolean z8, boolean z9) {
            AbstractC3159y.i(initialPaymentMethod, "initialPaymentMethod");
            AbstractC3159y.i(eventHandler, "eventHandler");
            AbstractC3159y.i(removeExecutor, "removeExecutor");
            AbstractC3159y.i(updateExecutor, "updateExecutor");
            AbstractC3159y.i(displayName, "displayName");
            return new C1202j(initialPaymentMethod, displayName, eventHandler, removeExecutor, updateExecutor, z8, z9, null, 128, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.j$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5235a;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f5235a
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
                L5.t.b(r9)
                goto L9b
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                L5.t.b(r9)
                goto L8a
            L29:
                L5.t.b(r9)
                goto L73
            L2d:
                L5.t.b(r9)
                goto L58
            L31:
                L5.t.b(r9)
                goto L47
            L35:
                L5.t.b(r9)
                J3.j r9 = J3.C1202j.this
                l6.v r9 = J3.C1202j.f(r9)
                r8.f5235a = r7
                java.lang.Object r9 = r9.emit(r2, r8)
                if (r9 != r0) goto L47
                return r0
            L47:
                J3.j r9 = J3.C1202j.this
                l6.v r9 = J3.C1202j.k(r9)
                J3.o$b r1 = J3.C1207o.b.f5355c
                r8.f5235a = r6
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L58
                return r0
            L58:
                J3.j r9 = J3.C1202j.this
                l6.v r9 = J3.C1202j.h(r9)
                java.lang.Object r9 = r9.getValue()
                com.stripe.android.model.o r9 = (com.stripe.android.model.o) r9
                J3.j r1 = J3.C1202j.this
                X5.n r1 = J3.C1202j.j(r1)
                r8.f5235a = r5
                java.lang.Object r9 = r1.invoke(r9, r8)
                if (r9 != r0) goto L73
                return r0
            L73:
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                J3.j r1 = J3.C1202j.this
                l6.v r1 = J3.C1202j.f(r1)
                if (r9 == 0) goto L81
                y2.b r2 = p2.AbstractC3598a.a(r9)
            L81:
                r8.f5235a = r4
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L8a
                return r0
            L8a:
                J3.j r9 = J3.C1202j.this
                l6.v r9 = J3.C1202j.k(r9)
                J3.o$b r1 = J3.C1207o.b.f5353a
                r8.f5235a = r3
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L9b
                return r0
            L9b:
                L5.I r9 = L5.I.f6487a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: J3.C1202j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.j$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f5237a;

        /* renamed from: b, reason: collision with root package name */
        int f5238b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1207o.a f5240d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1207o.a aVar, P5.d dVar) {
            super(2, dVar);
            this.f5240d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f5240d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r5.f5238b
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
                L5.t.b(r6)
                goto Lc5
            L17:
                L5.t.b(r6)
                goto Lb1
            L1c:
                java.lang.Object r1 = r5.f5237a
                L5.t.b(r6)
                goto L95
            L23:
                L5.t.b(r6)
                goto L74
            L27:
                L5.t.b(r6)
                goto L54
            L2b:
                L5.t.b(r6)
                goto L42
            L2f:
                L5.t.b(r6)
                J3.j r6 = J3.C1202j.this
                l6.v r6 = J3.C1202j.f(r6)
                r1 = 1
                r5.f5238b = r1
                java.lang.Object r6 = r6.emit(r2, r5)
                if (r6 != r0) goto L42
                return r0
            L42:
                J3.j r6 = J3.C1202j.this
                l6.v r6 = J3.C1202j.k(r6)
                J3.o$b r1 = J3.C1207o.b.f5354b
                r3 = 2
                r5.f5238b = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
                return r0
            L54:
                J3.j r6 = J3.C1202j.this
                X5.o r6 = J3.C1202j.l(r6)
                J3.j r1 = J3.C1202j.this
                l6.v r1 = J3.C1202j.h(r1)
                java.lang.Object r1 = r1.getValue()
                J3.o$a r3 = r5.f5240d
                b3.e r3 = r3.a()
                r4 = 3
                r5.f5238b = r4
                java.lang.Object r6 = r6.invoke(r1, r3, r5)
                if (r6 != r0) goto L74
                return r0
            L74:
                L5.s r6 = (L5.s) r6
                java.lang.Object r1 = r6.k()
                J3.j r6 = J3.C1202j.this
                boolean r3 = L5.s.h(r1)
                if (r3 == 0) goto L95
                r3 = r1
                com.stripe.android.model.o r3 = (com.stripe.android.model.o) r3
                l6.v r6 = J3.C1202j.h(r6)
                r5.f5237a = r1
                r4 = 4
                r5.f5238b = r4
                java.lang.Object r6 = r6.emit(r3, r5)
                if (r6 != r0) goto L95
                return r0
            L95:
                J3.j r6 = J3.C1202j.this
                java.lang.Throwable r3 = L5.s.e(r1)
                if (r3 == 0) goto Lb1
                l6.v r6 = J3.C1202j.f(r6)
                y2.b r3 = p2.AbstractC3598a.a(r3)
                r5.f5237a = r1
                r1 = 5
                r5.f5238b = r1
                java.lang.Object r6 = r6.emit(r3, r5)
                if (r6 != r0) goto Lb1
                return r0
            Lb1:
                J3.j r6 = J3.C1202j.this
                l6.v r6 = J3.C1202j.k(r6)
                J3.o$b r1 = J3.C1207o.b.f5353a
                r5.f5237a = r2
                r2 = 6
                r5.f5238b = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto Lc5
                return r0
            Lc5:
                L5.I r6 = L5.I.f6487a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: J3.C1202j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: J3.j$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements X5.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3983b f5242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3983b interfaceC3983b) {
            super(5);
            this.f5242b = interfaceC3983b;
        }

        public final C1207o a(com.stripe.android.model.o paymentMethod, C1207o.a choice, C1207o.b status, boolean z8, InterfaceC3983b interfaceC3983b) {
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            AbstractC3159y.i(choice, "choice");
            AbstractC3159y.i(status, "status");
            C1207o.a p8 = C1202j.this.p(paymentMethod);
            return new C1207o(status, C1202j.this.o(paymentMethod), this.f5242b, !AbstractC3159y.d(p8, choice), choice, C1202j.this.m(paymentMethod), C1202j.this.f5225d, z8, interfaceC3983b);
        }

        @Override // X5.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return a((com.stripe.android.model.o) obj, (C1207o.a) obj2, (C1207o.b) obj3, ((Boolean) obj4).booleanValue(), (InterfaceC3983b) obj5);
        }
    }

    public C1202j(com.stripe.android.model.o initialPaymentMethod, InterfaceC3983b displayName, Function1 eventHandler, X5.n removeExecutor, X5.o updateExecutor, boolean z8, boolean z9, P5.g workContext) {
        AbstractC3159y.i(initialPaymentMethod, "initialPaymentMethod");
        AbstractC3159y.i(displayName, "displayName");
        AbstractC3159y.i(eventHandler, "eventHandler");
        AbstractC3159y.i(removeExecutor, "removeExecutor");
        AbstractC3159y.i(updateExecutor, "updateExecutor");
        AbstractC3159y.i(workContext, "workContext");
        this.f5222a = eventHandler;
        this.f5223b = removeExecutor;
        this.f5224c = updateExecutor;
        this.f5225d = z8;
        this.f5226e = z9;
        l6.v a8 = AbstractC3351M.a(p(initialPaymentMethod));
        this.f5227f = a8;
        l6.v a9 = AbstractC3351M.a(C1207o.b.f5353a);
        this.f5228g = a9;
        l6.v a10 = AbstractC3351M.a(initialPaymentMethod);
        this.f5229h = a10;
        l6.v a11 = AbstractC3351M.a(Boolean.FALSE);
        this.f5230i = a11;
        l6.v a12 = AbstractC3351M.a(null);
        this.f5231j = a12;
        this.f5232k = i6.N.a(workContext.plus(U0.b(null, 1, null)));
        this.f5233l = v4.g.g(a10, a8, a9, a11, a12, new d(displayName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List m(com.stripe.android.model.o oVar) {
        Set b8;
        o.g.c cVar = n(oVar).f24485k;
        if (cVar != null && (b8 = cVar.b()) != null) {
            Set set = b8;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(x(EnumC1870e.f14436m.b((String) it.next())));
            }
            return arrayList;
        }
        return AbstractC1246t.m();
    }

    private final o.g n(com.stripe.android.model.o oVar) {
        o.g gVar = oVar.f24415h;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("Payment method must be a card in order to be edited");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(com.stripe.android.model.o oVar) {
        String str = n(oVar).f24482h;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Card payment method must contain last 4 digits");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1207o.a p(com.stripe.android.model.o oVar) {
        return x(EnumC1870e.f14436m.b(n(oVar).f24486l));
    }

    private final void q(C1207o.a aVar) {
        this.f5227f.setValue(aVar);
        this.f5222a.invoke(new InterfaceC1206n.a.C0106a(aVar.a()));
    }

    private final void r() {
        this.f5222a.invoke(new InterfaceC1206n.a.C0106a(null));
    }

    private final void s() {
        this.f5222a.invoke(new InterfaceC1206n.a.b(((C1207o.a) this.f5227f.getValue()).a()));
    }

    private final void t() {
        this.f5230i.setValue(Boolean.FALSE);
    }

    private final void u() {
        this.f5230i.setValue(Boolean.FALSE);
        AbstractC2829k.d(this.f5232k, null, null, new b(null), 3, null);
    }

    private final void v() {
        this.f5230i.setValue(Boolean.TRUE);
    }

    private final void w() {
        com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f5229h.getValue();
        C1207o.a aVar = (C1207o.a) this.f5227f.getValue();
        if (!AbstractC3159y.d(p(oVar), aVar)) {
            AbstractC2829k.d(this.f5232k, null, null, new c(aVar, null), 3, null);
        }
    }

    private final C1207o.a x(EnumC1870e enumC1870e) {
        return new C1207o.a(enumC1870e);
    }

    @Override // J3.InterfaceC1211t
    public boolean a() {
        return this.f5226e;
    }

    @Override // J3.InterfaceC1206n
    public InterfaceC3349K b() {
        return this.f5233l;
    }

    @Override // J3.InterfaceC1206n
    public void c(InterfaceC1205m viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof InterfaceC1205m.f) {
            v();
            return;
        }
        if (viewAction instanceof InterfaceC1205m.e) {
            u();
            return;
        }
        if (viewAction instanceof InterfaceC1205m.g) {
            w();
            return;
        }
        if (viewAction instanceof InterfaceC1205m.c) {
            s();
            return;
        }
        if (viewAction instanceof InterfaceC1205m.b) {
            r();
        } else if (viewAction instanceof InterfaceC1205m.a) {
            q(((InterfaceC1205m.a) viewAction).a());
        } else if (viewAction instanceof InterfaceC1205m.d) {
            t();
        }
    }

    @Override // J3.InterfaceC1211t
    public void close() {
        i6.N.d(this.f5232k, null, 1, null);
    }

    public /* synthetic */ C1202j(com.stripe.android.model.o oVar, InterfaceC3983b interfaceC3983b, Function1 function1, X5.n nVar, X5.o oVar2, boolean z8, boolean z9, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
        this(oVar, interfaceC3983b, function1, nVar, oVar2, z8, z9, (i8 & 128) != 0 ? C2812b0.a() : gVar);
    }
}
