package com.stripe.android.view;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import e3.C2779C;
import e3.C2780D;
import h6.InterfaceC2963c;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import m2.AbstractC3420f;
import m2.u;

/* renamed from: com.stripe.android.view.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2664s0 extends ViewModel {

    /* renamed from: h, reason: collision with root package name */
    public static final a f28987h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f28988i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final Set f28989j = P5.a0.i("PaymentSession", "PaymentFlowActivity", "ShippingInfoScreen");

    /* renamed from: a, reason: collision with root package name */
    private m2.v f28990a;

    /* renamed from: b, reason: collision with root package name */
    private final S5.g f28991b;

    /* renamed from: c, reason: collision with root package name */
    private List f28992c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28993d;

    /* renamed from: e, reason: collision with root package name */
    private C2780D f28994e;

    /* renamed from: f, reason: collision with root package name */
    private C2779C f28995f;

    /* renamed from: g, reason: collision with root package name */
    private int f28996g;

    /* renamed from: com.stripe.android.view.s0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.s0$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final m2.v f28997a;

        public b(AbstractC3420f customerSession, m2.v paymentSessionData) {
            AbstractC3255y.i(customerSession, "customerSession");
            AbstractC3255y.i(paymentSessionData, "paymentSessionData");
            this.f28997a = paymentSessionData;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3255y.i(modelClass, "modelClass");
            return new C2664s0(null, this.f28997a, C3347b0.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28998a;

        /* renamed from: b, reason: collision with root package name */
        Object f28999b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29000c;

        /* renamed from: e, reason: collision with root package name */
        int f29002e;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29000c = obj;
            this.f29002e |= Integer.MIN_VALUE;
            Object g8 = C2664s0.this.g(null, this);
            return g8 == T5.b.e() ? g8 : O5.s.a(g8);
        }
    }

    /* renamed from: com.stripe.android.view.s0$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S5.d f29004b;

        d(S5.d dVar) {
            this.f29004b = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29005a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29006b;

        /* renamed from: d, reason: collision with root package name */
        int f29008d;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29006b = obj;
            this.f29008d |= Integer.MIN_VALUE;
            Object l8 = C2664s0.this.l(null, null, null, this);
            return l8 == T5.b.e() ? l8 : O5.s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29009a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29010b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2779C f29011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(u.c cVar, C2779C c2779c, u.d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f29011c = c2779c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            f fVar = new f(null, this.f29011c, null, dVar);
            fVar.f29010b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29009a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O5.t.b(obj);
            throw null;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public C2664s0(AbstractC3420f customerSession, m2.v paymentSessionData, S5.g workContext) {
        AbstractC3255y.i(customerSession, "customerSession");
        AbstractC3255y.i(paymentSessionData, "paymentSessionData");
        AbstractC3255y.i(workContext, "workContext");
        this.f28990a = paymentSessionData;
        this.f28991b = workContext;
        this.f28992c = AbstractC1378t.m();
    }

    public final int a() {
        return this.f28996g;
    }

    public final m2.v b() {
        return this.f28990a;
    }

    public final C2780D c() {
        return this.f28994e;
    }

    public final List d() {
        return this.f28992c;
    }

    public final C2779C e() {
        return this.f28995f;
    }

    public final boolean f() {
        return this.f28993d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object g(e3.C2779C r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.view.C2664s0.c
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.view.s0$c r0 = (com.stripe.android.view.C2664s0.c) r0
            int r1 = r0.f29002e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29002e = r1
            goto L18
        L13:
            com.stripe.android.view.s0$c r0 = new com.stripe.android.view.s0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29000c
            T5.b.e()
            int r1 = r0.f29002e
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r5 = r0.f28999b
            e3.C r5 = (e3.C2779C) r5
            java.lang.Object r5 = r0.f28998a
            com.stripe.android.view.s0 r5 = (com.stripe.android.view.C2664s0) r5
            O5.t.b(r6)
            O5.s r6 = (O5.s) r6
            java.lang.Object r5 = r6.j()
            return r5
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            O5.t.b(r6)
            r0.f28998a = r4
            r0.f28999b = r5
            r0.f29002e = r2
            S5.i r6 = new S5.i
            S5.d r0 = T5.b.c(r0)
            r6.<init>(r0)
            r4.f28995f = r5
            com.stripe.android.view.s0$d r5 = new com.stripe.android.view.s0$d
            r5.<init>(r6)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2664s0.g(e3.C, S5.d):java.lang.Object");
    }

    public final void h(int i8) {
        this.f28996g = i8;
    }

    public final void i(m2.v vVar) {
        AbstractC3255y.i(vVar, "<set-?>");
        this.f28990a = vVar;
    }

    public final void j(C2780D c2780d) {
        this.f28994e = c2780d;
    }

    public final void k(boolean z8) {
        this.f28993d = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object l(m2.u.c r6, m2.u.d r7, e3.C2779C r8, S5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.view.C2664s0.e
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.view.s0$e r0 = (com.stripe.android.view.C2664s0.e) r0
            int r1 = r0.f29008d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29008d = r1
            goto L18
        L13:
            com.stripe.android.view.s0$e r0 = new com.stripe.android.view.s0$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29006b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f29008d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f29005a
            com.stripe.android.view.s0 r6 = (com.stripe.android.view.C2664s0) r6
            O5.t.b(r9)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            O5.t.b(r9)
            S5.g r9 = r5.f28991b
            com.stripe.android.view.s0$f r2 = new com.stripe.android.view.s0$f
            r4 = 0
            r2.<init>(r6, r8, r7, r4)
            r0.f29005a = r5
            r0.f29008d = r3
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r2, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r6 = r5
        L4c:
            O5.s r9 = (O5.s) r9
            java.lang.Object r7 = r9.j()
            java.util.List r8 = P5.AbstractC1378t.m()
            boolean r9 = O5.s.g(r7)
            if (r9 == 0) goto L5d
            goto L5e
        L5d:
            r8 = r7
        L5e:
            java.util.List r8 = (java.util.List) r8
            r6.f28992c = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2664s0.l(m2.u$c, m2.u$d, e3.C, S5.d):java.lang.Object");
    }
}
