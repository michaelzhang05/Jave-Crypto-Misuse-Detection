package com.stripe.android.view;

import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.view.O;
import h6.InterfaceC2963c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.C3347b0;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class O extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f28499a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.m f28500b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.I f28501c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f28502d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f28503e;

    /* renamed from: f, reason: collision with root package name */
    private String f28504f;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Context f28505a;

        /* renamed from: com.stripe.android.view.O$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0687a extends AbstractC3256z implements Function0 {
            C0687a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return m2.r.f35037c.a(a.this.c()).g();
            }
        }

        public a(Context context) {
            AbstractC3255y.i(context, "context");
            this.f28505a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m2.r b(a this$0) {
            AbstractC3255y.i(this$0, "this$0");
            return m2.r.f35037c.a(this$0.f28505a);
        }

        public final Context c() {
            return this.f28505a;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            return new O(new L5.a() { // from class: com.stripe.android.view.N
                @Override // L5.a
                public final Object get() {
                    m2.r b8;
                    b8 = O.a.b(O.a.this);
                    return b8;
                }
            }, new com.stripe.android.networking.a(this.f28505a, new C0687a(), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28507a;

        /* renamed from: c, reason: collision with root package name */
        int f28509c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28507a = obj;
            this.f28509c |= Integer.MIN_VALUE;
            return O.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f28510a;

        /* renamed from: b, reason: collision with root package name */
        int f28511b;

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o6.w wVar;
            Object e8 = T5.b.e();
            int i8 = this.f28511b;
            if (i8 != 0) {
                if (i8 == 1) {
                    wVar = (o6.w) this.f28510a;
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                o6.w wVar2 = O.this.f28502d;
                O o8 = O.this;
                this.f28510a = wVar2;
                this.f28511b = 1;
                Object c8 = o8.c(this);
                if (c8 == e8) {
                    return e8;
                }
                wVar = wVar2;
                obj = c8;
            }
            wVar.setValue(obj);
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public /* synthetic */ O(L5.a aVar, h3.m mVar, l6.I i8, int i9, AbstractC3247p abstractC3247p) {
        this(aVar, mVar, (i9 & 4) != 0 ? C3347b0.b() : i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(S5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.stripe.android.view.O.b
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.view.O$b r0 = (com.stripe.android.view.O.b) r0
            int r1 = r0.f28509c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28509c = r1
            goto L18
        L13:
            com.stripe.android.view.O$b r0 = new com.stripe.android.view.O$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f28507a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f28509c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            O5.t.b(r13)
            O5.s r13 = (O5.s) r13
            java.lang.Object r13 = r13.j()
            goto L71
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            O5.t.b(r13)
            L5.a r13 = r12.f28499a
            java.lang.Object r13 = r13.get()
            m2.r r13 = (m2.r) r13
            h3.m r2 = r12.f28500b
            A2.j$c r11 = new A2.j$c
            java.lang.String r6 = r13.g()
            java.lang.String r7 = r13.h()
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r13 = r12.e()
            if (r13 == 0) goto L67
            java.lang.String r5 = "on_behalf_of"
            O5.r r13 = O5.x.a(r5, r13)
            java.util.Map r13 = P5.Q.e(r13)
            goto L68
        L67:
            r13 = r3
        L68:
            r0.f28509c = r4
            java.lang.Object r13 = r2.a(r11, r13, r0)
            if (r13 != r1) goto L71
            return r1
        L71:
            boolean r0 = O5.s.g(r13)
            if (r0 == 0) goto L78
            goto L79
        L78:
            r3 = r13
        L79:
            e3.A r3 = (e3.C2777A) r3
            r13 = 0
            if (r3 == 0) goto L8b
            e3.A$a r0 = r3.a()
            if (r0 == 0) goto L8b
            boolean r0 = r0.a()
            if (r0 == 0) goto L8b
            goto L8c
        L8b:
            r4 = 0
        L8c:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.O.c(S5.d):java.lang.Object");
    }

    private final void d() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f28501c, null, new c(null), 2, null);
    }

    public final String e() {
        return this.f28504f;
    }

    public final InterfaceC3698L f() {
        return this.f28503e;
    }

    public final void g(String str) {
        this.f28504f = str;
        d();
    }

    public O(L5.a paymentConfigProvider, h3.m stripeRepository, l6.I dispatcher) {
        AbstractC3255y.i(paymentConfigProvider, "paymentConfigProvider");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(dispatcher, "dispatcher");
        this.f28499a = paymentConfigProvider;
        this.f28500b = stripeRepository;
        this.f28501c = dispatcher;
        o6.w a8 = AbstractC3700N.a(Boolean.FALSE);
        this.f28502d = a8;
        this.f28503e = a8;
        d();
    }
}
