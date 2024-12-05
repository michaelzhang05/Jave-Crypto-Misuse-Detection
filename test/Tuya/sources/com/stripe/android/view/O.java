package com.stripe.android.view;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.view.O;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.C2812b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class O extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f27444a;

    /* renamed from: b, reason: collision with root package name */
    private final e3.m f27445b;

    /* renamed from: c, reason: collision with root package name */
    private final i6.I f27446c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f27447d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f27448e;

    /* renamed from: f, reason: collision with root package name */
    private String f27449f;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Context f27450a;

        /* renamed from: com.stripe.android.view.O$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0691a extends AbstractC3160z implements Function0 {
            C0691a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return j2.r.f33061c.a(a.this.c()).e();
            }
        }

        public a(Context context) {
            AbstractC3159y.i(context, "context");
            this.f27450a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j2.r b(a this$0) {
            AbstractC3159y.i(this$0, "this$0");
            return j2.r.f33061c.a(this$0.f27450a);
        }

        public final Context c() {
            return this.f27450a;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            return new O(new I5.a() { // from class: com.stripe.android.view.N
                @Override // I5.a
                public final Object get() {
                    j2.r b8;
                    b8 = O.a.b(O.a.this);
                    return b8;
                }
            }, new com.stripe.android.networking.a(this.f27450a, new C0691a(), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27452a;

        /* renamed from: c, reason: collision with root package name */
        int f27454c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27452a = obj;
            this.f27454c |= Integer.MIN_VALUE;
            return O.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f27455a;

        /* renamed from: b, reason: collision with root package name */
        int f27456b;

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l6.v vVar;
            Object e8 = Q5.b.e();
            int i8 = this.f27456b;
            if (i8 != 0) {
                if (i8 == 1) {
                    vVar = (l6.v) this.f27455a;
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                l6.v vVar2 = O.this.f27447d;
                O o8 = O.this;
                this.f27455a = vVar2;
                this.f27456b = 1;
                Object c8 = o8.c(this);
                if (c8 == e8) {
                    return e8;
                }
                vVar = vVar2;
                obj = c8;
            }
            vVar.setValue(obj);
            return L5.I.f6487a;
        }
    }

    public /* synthetic */ O(I5.a aVar, e3.m mVar, i6.I i8, int i9, AbstractC3151p abstractC3151p) {
        this(aVar, mVar, (i9 & 4) != 0 ? C2812b0.b() : i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(P5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.stripe.android.view.O.b
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.view.O$b r0 = (com.stripe.android.view.O.b) r0
            int r1 = r0.f27454c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27454c = r1
            goto L18
        L13:
            com.stripe.android.view.O$b r0 = new com.stripe.android.view.O$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f27452a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f27454c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            L5.t.b(r13)
            L5.s r13 = (L5.s) r13
            java.lang.Object r13 = r13.k()
            goto L71
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            L5.t.b(r13)
            I5.a r13 = r12.f27444a
            java.lang.Object r13 = r13.get()
            j2.r r13 = (j2.r) r13
            e3.m r2 = r12.f27445b
            x2.j$c r11 = new x2.j$c
            java.lang.String r6 = r13.e()
            java.lang.String r7 = r13.f()
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r13 = r12.e()
            if (r13 == 0) goto L67
            java.lang.String r5 = "on_behalf_of"
            L5.r r13 = L5.x.a(r5, r13)
            java.util.Map r13 = M5.Q.e(r13)
            goto L68
        L67:
            r13 = r3
        L68:
            r0.f27454c = r4
            java.lang.Object r13 = r2.r(r11, r13, r0)
            if (r13 != r1) goto L71
            return r1
        L71:
            boolean r0 = L5.s.g(r13)
            if (r0 == 0) goto L78
            goto L79
        L78:
            r3 = r13
        L79:
            b3.A r3 = (b3.C1856A) r3
            r13 = 0
            if (r3 == 0) goto L8b
            b3.A$a r0 = r3.b()
            if (r0 == 0) goto L8b
            boolean r0 = r0.b()
            if (r0 == 0) goto L8b
            goto L8c
        L8b:
            r4 = 0
        L8c:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.O.c(P5.d):java.lang.Object");
    }

    private final void d() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f27446c, null, new c(null), 2, null);
    }

    public final String e() {
        return this.f27449f;
    }

    public final InterfaceC3349K f() {
        return this.f27448e;
    }

    public final void g(String str) {
        this.f27449f = str;
        d();
    }

    public O(I5.a paymentConfigProvider, e3.m stripeRepository, i6.I dispatcher) {
        AbstractC3159y.i(paymentConfigProvider, "paymentConfigProvider");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(dispatcher, "dispatcher");
        this.f27444a = paymentConfigProvider;
        this.f27445b = stripeRepository;
        this.f27446c = dispatcher;
        l6.v a8 = AbstractC3351M.a(Boolean.FALSE);
        this.f27447d = a8;
        this.f27448e = a8;
        d();
    }
}
