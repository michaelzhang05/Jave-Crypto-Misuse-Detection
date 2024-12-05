package com.stripe.android.view;

import M5.AbstractC1246t;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.C1858C;
import b3.C1859D;
import e6.InterfaceC2643c;
import i6.C2812b0;
import j2.AbstractC3066f;
import j2.u;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2470s0 extends ViewModel {

    /* renamed from: h, reason: collision with root package name */
    public static final a f27932h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f27933i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final Set f27934j = M5.a0.i("PaymentSession", "PaymentFlowActivity", "ShippingInfoScreen");

    /* renamed from: a, reason: collision with root package name */
    private j2.v f27935a;

    /* renamed from: b, reason: collision with root package name */
    private final P5.g f27936b;

    /* renamed from: c, reason: collision with root package name */
    private List f27937c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27938d;

    /* renamed from: e, reason: collision with root package name */
    private C1859D f27939e;

    /* renamed from: f, reason: collision with root package name */
    private C1858C f27940f;

    /* renamed from: g, reason: collision with root package name */
    private int f27941g;

    /* renamed from: com.stripe.android.view.s0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.s0$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final j2.v f27942a;

        public b(AbstractC3066f customerSession, j2.v paymentSessionData) {
            AbstractC3159y.i(customerSession, "customerSession");
            AbstractC3159y.i(paymentSessionData, "paymentSessionData");
            this.f27942a = paymentSessionData;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            return new C2470s0(null, this.f27942a, C2812b0.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27943a;

        /* renamed from: b, reason: collision with root package name */
        Object f27944b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27945c;

        /* renamed from: e, reason: collision with root package name */
        int f27947e;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27945c = obj;
            this.f27947e |= Integer.MIN_VALUE;
            Object g8 = C2470s0.this.g(null, this);
            return g8 == Q5.b.e() ? g8 : L5.s.a(g8);
        }
    }

    /* renamed from: com.stripe.android.view.s0$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P5.d f27949b;

        d(P5.d dVar) {
            this.f27949b = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27950a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27951b;

        /* renamed from: d, reason: collision with root package name */
        int f27953d;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27951b = obj;
            this.f27953d |= Integer.MIN_VALUE;
            Object l8 = C2470s0.this.l(null, null, null, this);
            return l8 == Q5.b.e() ? l8 : L5.s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.s0$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27954a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27955b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1858C f27956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(u.c cVar, C1858C c1858c, u.d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f27956c = c1858c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            f fVar = new f(null, this.f27956c, null, dVar);
            fVar.f27955b = obj;
            return fVar;
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f27954a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            L5.t.b(obj);
            throw null;
        }
    }

    public C2470s0(AbstractC3066f customerSession, j2.v paymentSessionData, P5.g workContext) {
        AbstractC3159y.i(customerSession, "customerSession");
        AbstractC3159y.i(paymentSessionData, "paymentSessionData");
        AbstractC3159y.i(workContext, "workContext");
        this.f27935a = paymentSessionData;
        this.f27936b = workContext;
        this.f27937c = AbstractC1246t.m();
    }

    public final int a() {
        return this.f27941g;
    }

    public final j2.v b() {
        return this.f27935a;
    }

    public final C1859D c() {
        return this.f27939e;
    }

    public final List d() {
        return this.f27937c;
    }

    public final C1858C e() {
        return this.f27940f;
    }

    public final boolean f() {
        return this.f27938d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object g(b3.C1858C r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.stripe.android.view.C2470s0.c
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.view.s0$c r0 = (com.stripe.android.view.C2470s0.c) r0
            int r1 = r0.f27947e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27947e = r1
            goto L18
        L13:
            com.stripe.android.view.s0$c r0 = new com.stripe.android.view.s0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27945c
            Q5.b.e()
            int r1 = r0.f27947e
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r5 = r0.f27944b
            b3.C r5 = (b3.C1858C) r5
            java.lang.Object r5 = r0.f27943a
            com.stripe.android.view.s0 r5 = (com.stripe.android.view.C2470s0) r5
            L5.t.b(r6)
            L5.s r6 = (L5.s) r6
            java.lang.Object r5 = r6.k()
            return r5
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            L5.t.b(r6)
            r0.f27943a = r4
            r0.f27944b = r5
            r0.f27947e = r2
            P5.i r6 = new P5.i
            P5.d r0 = Q5.b.c(r0)
            r6.<init>(r0)
            r4.f27940f = r5
            com.stripe.android.view.s0$d r5 = new com.stripe.android.view.s0$d
            r5.<init>(r6)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2470s0.g(b3.C, P5.d):java.lang.Object");
    }

    public final void h(int i8) {
        this.f27941g = i8;
    }

    public final void i(j2.v vVar) {
        AbstractC3159y.i(vVar, "<set-?>");
        this.f27935a = vVar;
    }

    public final void j(C1859D c1859d) {
        this.f27939e = c1859d;
    }

    public final void k(boolean z8) {
        this.f27938d = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object l(j2.u.c r6, j2.u.d r7, b3.C1858C r8, P5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.view.C2470s0.e
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.view.s0$e r0 = (com.stripe.android.view.C2470s0.e) r0
            int r1 = r0.f27953d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27953d = r1
            goto L18
        L13:
            com.stripe.android.view.s0$e r0 = new com.stripe.android.view.s0$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27951b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f27953d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f27950a
            com.stripe.android.view.s0 r6 = (com.stripe.android.view.C2470s0) r6
            L5.t.b(r9)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            L5.t.b(r9)
            P5.g r9 = r5.f27936b
            com.stripe.android.view.s0$f r2 = new com.stripe.android.view.s0$f
            r4 = 0
            r2.<init>(r6, r8, r7, r4)
            r0.f27950a = r5
            r0.f27953d = r3
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r2, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r6 = r5
        L4c:
            L5.s r9 = (L5.s) r9
            java.lang.Object r7 = r9.k()
            java.util.List r8 = M5.AbstractC1246t.m()
            boolean r9 = L5.s.g(r7)
            if (r9 == 0) goto L5d
            goto L5e
        L5d:
            r8 = r7
        L5e:
            java.util.List r8 = (java.util.List) r8
            r6.f27937c = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2470s0.l(j2.u$c, j2.u$d, b3.C, P5.d):java.lang.Object");
    }
}
