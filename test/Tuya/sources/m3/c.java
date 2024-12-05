package M3;

import L5.I;
import L5.t;
import P5.d;
import X5.o;
import X5.q;
import X5.s;
import b4.C1880b;
import b4.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final u.g f6963a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6964b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f6965c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f6966d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f6967e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f6968f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f6969g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f6970h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f6971i;

    /* loaded from: classes4.dex */
    public static final class a extends l implements o {

        /* renamed from: a, reason: collision with root package name */
        int f6972a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6973b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6974c;

        public a(d dVar) {
            super(3, dVar);
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3359g interfaceC3359g, Object obj, d dVar) {
            a aVar = new a(dVar);
            aVar.f6973b = interfaceC3359g;
            aVar.f6974c = obj;
            return aVar.invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6972a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f6973b;
                InterfaceC3358f interfaceC3358f = (InterfaceC3358f) this.f6974c;
                this.f6972a = 1;
                if (AbstractC3360h.r(interfaceC3359g, interfaceC3358f, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements s {

        /* renamed from: a, reason: collision with root package name */
        int f6975a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6976b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f6977c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f6978d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6979e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6980f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ boolean f6981g;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f6983a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.b f6984b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f6985c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C1880b f6986d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f6987e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC3991f f6988f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC4021c f6989g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f6990h;

            /* renamed from: M3.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0145a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3359g f6991a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PrimaryButton.b f6992b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ c f6993c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C1880b f6994d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f6995e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ AbstractC3991f f6996f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC4021c f6997g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f6998h;

                /* renamed from: M3.c$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0146a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f6999a;

                    /* renamed from: b, reason: collision with root package name */
                    int f7000b;

                    public C0146a(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6999a = obj;
                        this.f7000b |= Integer.MIN_VALUE;
                        return C0145a.this.emit(null, this);
                    }
                }

                public C0145a(InterfaceC3359g interfaceC3359g, PrimaryButton.b bVar, c cVar, C1880b c1880b, boolean z8, AbstractC3991f abstractC3991f, InterfaceC4021c interfaceC4021c, boolean z9) {
                    this.f6991a = interfaceC3359g;
                    this.f6992b = bVar;
                    this.f6993c = cVar;
                    this.f6994d = c1880b;
                    this.f6995e = z8;
                    this.f6996f = abstractC3991f;
                    this.f6997g = interfaceC4021c;
                    this.f6998h = z9;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // l6.InterfaceC3359g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, P5.d r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof M3.c.b.a.C0145a.C0146a
                        if (r0 == 0) goto L13
                        r0 = r12
                        M3.c$b$a$a$a r0 = (M3.c.b.a.C0145a.C0146a) r0
                        int r1 = r0.f7000b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7000b = r1
                        goto L18
                    L13:
                        M3.c$b$a$a$a r0 = new M3.c$b$a$a$a
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.f6999a
                        java.lang.Object r1 = Q5.b.e()
                        int r2 = r0.f7000b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        L5.t.b(r12)
                        goto L90
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        L5.t.b(r12)
                        l6.g r12 = r10.f6991a
                        z3.a r11 = (z3.C4019a) r11
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = r10.f6992b
                        if (r2 == 0) goto L3d
                        goto L87
                    L3d:
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = new com.stripe.android.paymentsheet.ui.PrimaryButton$b
                        z3.a$a r4 = r11.a()
                        if (r4 == 0) goto L4b
                        y2.b r4 = r4.a()
                        if (r4 != 0) goto L53
                    L4b:
                        M3.c r4 = r10.f6993c
                        b4.b r5 = r10.f6994d
                        y2.b r4 = M3.c.a(r4, r5)
                    L53:
                        M3.c r5 = r10.f6993c
                        kotlin.jvm.functions.Function0 r5 = M3.c.d(r5)
                        boolean r6 = r10.f6995e
                        if (r6 == 0) goto L6f
                        y3.f r6 = r10.f6996f
                        if (r6 == 0) goto L6f
                        M3.c r7 = r10.f6993c
                        z3.c r8 = r10.f6997g
                        boolean r9 = r10.f6998h
                        boolean r6 = M3.c.c(r7, r8, r9, r6)
                        if (r6 == 0) goto L6f
                        r6 = 1
                        goto L70
                    L6f:
                        r6 = 0
                    L70:
                        z3.a$a r7 = r11.a()
                        if (r7 == 0) goto L7b
                        boolean r7 = r7.b()
                        goto L7c
                    L7b:
                        r7 = 1
                    L7c:
                        r2.<init>(r4, r5, r6, r7)
                        boolean r11 = r11.b()
                        if (r11 == 0) goto L86
                        goto L87
                    L86:
                        r2 = 0
                    L87:
                        r0.f7000b = r3
                        java.lang.Object r11 = r12.emit(r2, r0)
                        if (r11 != r1) goto L90
                        return r1
                    L90:
                        L5.I r11 = L5.I.f6487a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: M3.c.b.a.C0145a.emit(java.lang.Object, P5.d):java.lang.Object");
                }
            }

            public a(InterfaceC3358f interfaceC3358f, PrimaryButton.b bVar, c cVar, C1880b c1880b, boolean z8, AbstractC3991f abstractC3991f, InterfaceC4021c interfaceC4021c, boolean z9) {
                this.f6983a = interfaceC3358f;
                this.f6984b = bVar;
                this.f6985c = cVar;
                this.f6986d = c1880b;
                this.f6987e = z8;
                this.f6988f = abstractC3991f;
                this.f6989g = interfaceC4021c;
                this.f6990h = z9;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, d dVar) {
                Object collect = this.f6983a.collect(new C0145a(interfaceC3359g, this.f6984b, this.f6985c, this.f6986d, this.f6987e, this.f6988f, this.f6989g, this.f6990h), dVar);
                if (collect == Q5.b.e()) {
                    return collect;
                }
                return I.f6487a;
            }
        }

        b(d dVar) {
            super(7, dVar);
        }

        public final Object g(InterfaceC4021c interfaceC4021c, boolean z8, C1880b c1880b, AbstractC3991f abstractC3991f, PrimaryButton.b bVar, boolean z9, d dVar) {
            b bVar2 = new b(dVar);
            bVar2.f6976b = interfaceC4021c;
            bVar2.f6977c = z8;
            bVar2.f6978d = c1880b;
            bVar2.f6979e = abstractC3991f;
            bVar2.f6980f = bVar;
            bVar2.f6981g = z9;
            return bVar2.invokeSuspend(I.f6487a);
        }

        @Override // X5.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            return g((InterfaceC4021c) obj, ((Boolean) obj2).booleanValue(), (C1880b) obj3, (AbstractC3991f) obj4, (PrimaryButton.b) obj5, ((Boolean) obj6).booleanValue(), (d) obj7);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f6975a == 0) {
                t.b(obj);
                InterfaceC4021c interfaceC4021c = (InterfaceC4021c) this.f6976b;
                boolean z8 = this.f6977c;
                C1880b c1880b = (C1880b) this.f6978d;
                AbstractC3991f abstractC3991f = (AbstractC3991f) this.f6979e;
                return new a(interfaceC4021c.a(), (PrimaryButton.b) this.f6980f, c.this, c1880b, z8, abstractC3991f, interfaceC4021c, this.f6981g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0147c extends l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f7002a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7003b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f7004c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f7005d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f7006e;

        C0147c(d dVar) {
            super(5, dVar);
        }

        public final Object g(InterfaceC4021c interfaceC4021c, boolean z8, AbstractC3991f abstractC3991f, PrimaryButton.b bVar, d dVar) {
            C0147c c0147c = new C0147c(dVar);
            c0147c.f7003b = interfaceC4021c;
            c0147c.f7004c = z8;
            c0147c.f7005d = abstractC3991f;
            c0147c.f7006e = bVar;
            return c0147c.invokeSuspend(I.f6487a);
        }

        @Override // X5.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return g((InterfaceC4021c) obj, ((Boolean) obj2).booleanValue(), (AbstractC3991f) obj3, (PrimaryButton.b) obj4, (d) obj5);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Q5.b.e();
            if (this.f7002a == 0) {
                t.b(obj);
                InterfaceC4021c interfaceC4021c = (InterfaceC4021c) this.f7003b;
                boolean z9 = this.f7004c;
                AbstractC3991f abstractC3991f = (AbstractC3991f) this.f7005d;
                PrimaryButton.b bVar = (PrimaryButton.b) this.f7006e;
                if (bVar == null) {
                    InterfaceC3983b f8 = c.this.f();
                    Function0 function0 = c.this.f6971i;
                    if (z9 && abstractC3991f != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    PrimaryButton.b bVar2 = new PrimaryButton.b(f8, function0, z8, false);
                    if (!interfaceC4021c.e()) {
                        if (abstractC3991f == null || !abstractC3991f.b()) {
                            return null;
                        }
                        return bVar2;
                    }
                    return bVar2;
                }
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(u.g config, boolean z8, InterfaceC3349K currentScreenFlow, InterfaceC3349K buttonsEnabledFlow, InterfaceC3349K amountFlow, InterfaceC3349K selectionFlow, InterfaceC3349K customPrimaryButtonUiStateFlow, InterfaceC3349K cvcCompleteFlow, Function0 onClick) {
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(currentScreenFlow, "currentScreenFlow");
        AbstractC3159y.i(buttonsEnabledFlow, "buttonsEnabledFlow");
        AbstractC3159y.i(amountFlow, "amountFlow");
        AbstractC3159y.i(selectionFlow, "selectionFlow");
        AbstractC3159y.i(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        AbstractC3159y.i(cvcCompleteFlow, "cvcCompleteFlow");
        AbstractC3159y.i(onClick, "onClick");
        this.f6963a = config;
        this.f6964b = z8;
        this.f6965c = currentScreenFlow;
        this.f6966d = buttonsEnabledFlow;
        this.f6967e = amountFlow;
        this.f6968f = selectionFlow;
        this.f6969g = customPrimaryButtonUiStateFlow;
        this.f6970h = cvcCompleteFlow;
        this.f6971i = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3983b e(C1880b c1880b) {
        InterfaceC3983b a8;
        InterfaceC3983b b8;
        String L8 = this.f6963a.L();
        if (L8 == null || (b8 = AbstractC3984c.b(L8)) == null) {
            if (this.f6964b) {
                InterfaceC3983b a9 = AbstractC3984c.a(w.f37443S);
                if (c1880b == null || (a8 = c1880b.b()) == null) {
                    return a9;
                }
            } else {
                a8 = AbstractC3984c.a(n.f14689C0);
            }
            return a8;
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3983b f() {
        InterfaceC3983b b8;
        String L8 = this.f6963a.L();
        if (L8 == null || (b8 = AbstractC3984c.b(L8)) == null) {
            return AbstractC3984c.a(n.f14742o);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(InterfaceC4021c interfaceC4021c, boolean z8, AbstractC3991f abstractC3991f) {
        InterfaceC4021c.j jVar;
        InterfaceC4021c.j.b bVar;
        AbstractC3991f.C0916f c0916f;
        com.stripe.android.model.o v8;
        o.p pVar = null;
        if (interfaceC4021c instanceof InterfaceC4021c.j) {
            jVar = (InterfaceC4021c.j) interfaceC4021c;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            bVar = jVar.w();
        } else {
            bVar = null;
        }
        if (bVar instanceof InterfaceC4021c.j.b.C0928b) {
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                c0916f = (AbstractC3991f.C0916f) abstractC3991f;
            } else {
                c0916f = null;
            }
            if (c0916f != null && (v8 = c0916f.v()) != null) {
                pVar = v8.f24412e;
            }
            if (pVar == o.p.f24532i) {
                return z8;
            }
        }
        return true;
    }

    public final InterfaceC3358f h() {
        return AbstractC3360h.K(K3.c.a(this.f6965c, this.f6966d, this.f6967e, this.f6968f, this.f6969g, this.f6970h, new b(null)), new a(null));
    }

    public final InterfaceC3358f i() {
        return AbstractC3360h.k(this.f6965c, this.f6966d, this.f6968f, this.f6969g, new C0147c(null));
    }
}
