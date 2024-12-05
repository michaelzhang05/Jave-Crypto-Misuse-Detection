package P3;

import B3.f;
import C3.c;
import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1669o;
import a6.InterfaceC1671q;
import a6.InterfaceC1673s;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import e4.C2801b;
import e4.n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import t3.w;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final u.g f8787a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8788b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f8789c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f8790d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f8791e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f8792f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f8793g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f8794h;

    /* renamed from: i, reason: collision with root package name */
    private final Function0 f8795i;

    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f8796a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f8797b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f8798c;

        public a(d dVar) {
            super(3, dVar);
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3707g interfaceC3707g, Object obj, d dVar) {
            a aVar = new a(dVar);
            aVar.f8797b = interfaceC3707g;
            aVar.f8798c = obj;
            return aVar.invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f8796a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f8797b;
                InterfaceC3706f interfaceC3706f = (InterfaceC3706f) this.f8798c;
                this.f8796a = 1;
                if (AbstractC3708h.t(interfaceC3707g, interfaceC3706f, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1673s {

        /* renamed from: a, reason: collision with root package name */
        int f8799a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8800b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f8801c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f8802d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f8803e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f8804f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ boolean f8805g;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f f8807a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.b f8808b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f8809c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C2801b f8810d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f8811e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f8812f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C3.c f8813g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f8814h;

            /* renamed from: P3.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0173a implements InterfaceC3707g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3707g f8815a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PrimaryButton.b f8816b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ c f8817c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C2801b f8818d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f8819e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ f f8820f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C3.c f8821g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f8822h;

                /* renamed from: P3.c$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0174a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f8823a;

                    /* renamed from: b, reason: collision with root package name */
                    int f8824b;

                    public C0174a(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f8823a = obj;
                        this.f8824b |= Integer.MIN_VALUE;
                        return C0173a.this.emit(null, this);
                    }
                }

                public C0173a(InterfaceC3707g interfaceC3707g, PrimaryButton.b bVar, c cVar, C2801b c2801b, boolean z8, f fVar, C3.c cVar2, boolean z9) {
                    this.f8815a = interfaceC3707g;
                    this.f8816b = bVar;
                    this.f8817c = cVar;
                    this.f8818d = c2801b;
                    this.f8819e = z8;
                    this.f8820f = fVar;
                    this.f8821g = cVar2;
                    this.f8822h = z9;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // o6.InterfaceC3707g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, S5.d r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof P3.c.b.a.C0173a.C0174a
                        if (r0 == 0) goto L13
                        r0 = r12
                        P3.c$b$a$a$a r0 = (P3.c.b.a.C0173a.C0174a) r0
                        int r1 = r0.f8824b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8824b = r1
                        goto L18
                    L13:
                        P3.c$b$a$a$a r0 = new P3.c$b$a$a$a
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.f8823a
                        java.lang.Object r1 = T5.b.e()
                        int r2 = r0.f8824b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        O5.t.b(r12)
                        goto L90
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        O5.t.b(r12)
                        o6.g r12 = r10.f8815a
                        C3.a r11 = (C3.a) r11
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = r10.f8816b
                        if (r2 == 0) goto L3d
                        goto L87
                    L3d:
                        com.stripe.android.paymentsheet.ui.PrimaryButton$b r2 = new com.stripe.android.paymentsheet.ui.PrimaryButton$b
                        C3.a$a r4 = r11.a()
                        if (r4 == 0) goto L4b
                        B2.b r4 = r4.a()
                        if (r4 != 0) goto L53
                    L4b:
                        P3.c r4 = r10.f8817c
                        e4.b r5 = r10.f8818d
                        B2.b r4 = P3.c.a(r4, r5)
                    L53:
                        P3.c r5 = r10.f8817c
                        kotlin.jvm.functions.Function0 r5 = P3.c.d(r5)
                        boolean r6 = r10.f8819e
                        if (r6 == 0) goto L6f
                        B3.f r6 = r10.f8820f
                        if (r6 == 0) goto L6f
                        P3.c r7 = r10.f8817c
                        C3.c r8 = r10.f8821g
                        boolean r9 = r10.f8822h
                        boolean r6 = P3.c.c(r7, r8, r9, r6)
                        if (r6 == 0) goto L6f
                        r6 = 1
                        goto L70
                    L6f:
                        r6 = 0
                    L70:
                        C3.a$a r7 = r11.a()
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
                        r0.f8824b = r3
                        java.lang.Object r11 = r12.emit(r2, r0)
                        if (r11 != r1) goto L90
                        return r1
                    L90:
                        O5.I r11 = O5.I.f8278a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: P3.c.b.a.C0173a.emit(java.lang.Object, S5.d):java.lang.Object");
                }
            }

            public a(InterfaceC3706f interfaceC3706f, PrimaryButton.b bVar, c cVar, C2801b c2801b, boolean z8, f fVar, C3.c cVar2, boolean z9) {
                this.f8807a = interfaceC3706f;
                this.f8808b = bVar;
                this.f8809c = cVar;
                this.f8810d = c2801b;
                this.f8811e = z8;
                this.f8812f = fVar;
                this.f8813g = cVar2;
                this.f8814h = z9;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, d dVar) {
                Object collect = this.f8807a.collect(new C0173a(interfaceC3707g, this.f8808b, this.f8809c, this.f8810d, this.f8811e, this.f8812f, this.f8813g, this.f8814h), dVar);
                if (collect == T5.b.e()) {
                    return collect;
                }
                return I.f8278a;
            }
        }

        b(d dVar) {
            super(7, dVar);
        }

        public final Object a(C3.c cVar, boolean z8, C2801b c2801b, f fVar, PrimaryButton.b bVar, boolean z9, d dVar) {
            b bVar2 = new b(dVar);
            bVar2.f8800b = cVar;
            bVar2.f8801c = z8;
            bVar2.f8802d = c2801b;
            bVar2.f8803e = fVar;
            bVar2.f8804f = bVar;
            bVar2.f8805g = z9;
            return bVar2.invokeSuspend(I.f8278a);
        }

        @Override // a6.InterfaceC1673s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            return a((C3.c) obj, ((Boolean) obj2).booleanValue(), (C2801b) obj3, (f) obj4, (PrimaryButton.b) obj5, ((Boolean) obj6).booleanValue(), (d) obj7);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f8799a == 0) {
                t.b(obj);
                C3.c cVar = (C3.c) this.f8800b;
                boolean z8 = this.f8801c;
                C2801b c2801b = (C2801b) this.f8802d;
                f fVar = (f) this.f8803e;
                return new a(cVar.a(), (PrimaryButton.b) this.f8804f, c.this, c2801b, z8, fVar, cVar, this.f8805g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0175c extends l implements InterfaceC1671q {

        /* renamed from: a, reason: collision with root package name */
        int f8826a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8827b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f8828c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f8829d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f8830e;

        C0175c(d dVar) {
            super(5, dVar);
        }

        public final Object a(C3.c cVar, boolean z8, f fVar, PrimaryButton.b bVar, d dVar) {
            C0175c c0175c = new C0175c(dVar);
            c0175c.f8827b = cVar;
            c0175c.f8828c = z8;
            c0175c.f8829d = fVar;
            c0175c.f8830e = bVar;
            return c0175c.invokeSuspend(I.f8278a);
        }

        @Override // a6.InterfaceC1671q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return a((C3.c) obj, ((Boolean) obj2).booleanValue(), (f) obj3, (PrimaryButton.b) obj4, (d) obj5);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            T5.b.e();
            if (this.f8826a == 0) {
                t.b(obj);
                C3.c cVar = (C3.c) this.f8827b;
                boolean z9 = this.f8828c;
                f fVar = (f) this.f8829d;
                PrimaryButton.b bVar = (PrimaryButton.b) this.f8830e;
                if (bVar == null) {
                    B2.b f8 = c.this.f();
                    Function0 function0 = c.this.f8795i;
                    if (z9 && fVar != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    PrimaryButton.b bVar2 = new PrimaryButton.b(f8, function0, z8, false);
                    if (!cVar.f()) {
                        if (fVar == null || !fVar.a()) {
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

    public c(u.g config, boolean z8, InterfaceC3698L currentScreenFlow, InterfaceC3698L buttonsEnabledFlow, InterfaceC3698L amountFlow, InterfaceC3698L selectionFlow, InterfaceC3698L customPrimaryButtonUiStateFlow, InterfaceC3698L cvcCompleteFlow, Function0 onClick) {
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(currentScreenFlow, "currentScreenFlow");
        AbstractC3255y.i(buttonsEnabledFlow, "buttonsEnabledFlow");
        AbstractC3255y.i(amountFlow, "amountFlow");
        AbstractC3255y.i(selectionFlow, "selectionFlow");
        AbstractC3255y.i(customPrimaryButtonUiStateFlow, "customPrimaryButtonUiStateFlow");
        AbstractC3255y.i(cvcCompleteFlow, "cvcCompleteFlow");
        AbstractC3255y.i(onClick, "onClick");
        this.f8787a = config;
        this.f8788b = z8;
        this.f8789c = currentScreenFlow;
        this.f8790d = buttonsEnabledFlow;
        this.f8791e = amountFlow;
        this.f8792f = selectionFlow;
        this.f8793g = customPrimaryButtonUiStateFlow;
        this.f8794h = cvcCompleteFlow;
        this.f8795i = onClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B2.b e(C2801b c2801b) {
        B2.b a8;
        B2.b b8;
        String H8 = this.f8787a.H();
        if (H8 == null || (b8 = B2.c.b(H8)) == null) {
            if (this.f8788b) {
                B2.b a9 = B2.c.a(w.f39765S);
                if (c2801b == null || (a8 = c2801b.a()) == null) {
                    return a9;
                }
            } else {
                a8 = B2.c.a(n.f31695C0);
            }
            return a8;
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B2.b f() {
        B2.b b8;
        String H8 = this.f8787a.H();
        if (H8 == null || (b8 = B2.c.b(H8)) == null) {
            return B2.c.a(n.f31748o);
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(C3.c cVar, boolean z8, f fVar) {
        c.j jVar;
        c.j.b bVar;
        f.C0009f c0009f;
        o r8;
        o.p pVar = null;
        if (cVar instanceof c.j) {
            jVar = (c.j) cVar;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            bVar = jVar.y();
        } else {
            bVar = null;
        }
        if (bVar instanceof c.j.b.C0021b) {
            if (fVar instanceof f.C0009f) {
                c0009f = (f.C0009f) fVar;
            } else {
                c0009f = null;
            }
            if (c0009f != null && (r8 = c0009f.r()) != null) {
                pVar = r8.f25467e;
            }
            if (pVar == o.p.f25587i) {
                return z8;
            }
        }
        return true;
    }

    public final InterfaceC3706f h() {
        return AbstractC3708h.M(N3.c.a(this.f8789c, this.f8790d, this.f8791e, this.f8792f, this.f8793g, this.f8794h, new b(null)), new a(null));
    }

    public final InterfaceC3706f i() {
        return AbstractC3708h.m(this.f8789c, this.f8790d, this.f8792f, this.f8793g, new C0175c(null));
    }
}
