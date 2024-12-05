package com.stripe.android.view;

import L5.InterfaceC1227k;
import L5.s;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.model.o;
import com.stripe.android.view.A;
import com.stripe.android.view.AbstractC2442e;
import com.stripe.android.view.C2440d;
import com.stripe.android.view.C2456l;
import i6.AbstractC2829k;
import j2.AbstractC3049A;
import j2.AbstractC3051C;
import j2.AbstractC3053E;
import j2.AbstractC3066f;
import j2.C3057I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import w4.AbstractC3848a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AddPaymentMethodActivity extends M0 {

    /* renamed from: n, reason: collision with root package name */
    public static final a f27116n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f27117o = 8;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1227k f27118g = L5.l.b(new d());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1227k f27119h = L5.l.b(new m());

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1227k f27120i = L5.l.b(new i());

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1227k f27121j = L5.l.b(new j());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1227k f27122k = L5.l.b(new c());

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1227k f27123l = new ViewModelLazy(kotlin.jvm.internal.U.b(C2456l.class), new k(this), new n(), new l(null, this));

    /* renamed from: m, reason: collision with root package name */
    private final f f27124m = new f();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27125a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f24532i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f24534k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f24508A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27125a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2454k invoke() {
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            AbstractC2454k J8 = addPaymentMethodActivity.J(addPaymentMethodActivity.N());
            J8.setId(AbstractC3049A.f32754R);
            return J8;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2440d invoke() {
            C2440d.b bVar = C2440d.f27656h;
            Intent intent = AddPaymentMethodActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return bVar.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27128a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f27130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC3066f abstractC3066f, com.stripe.android.model.o oVar, P5.d dVar) {
            super(2, dVar);
            this.f27130c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(null, this.f27130c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f27128a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    a8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C2456l S7 = AddPaymentMethodActivity.this.S();
                com.stripe.android.model.o oVar = this.f27130c;
                this.f27128a = 1;
                a8 = S7.a(null, oVar, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            Throwable e9 = L5.s.e(a8);
            if (e9 == null) {
                addPaymentMethodActivity.K((com.stripe.android.model.o) a8);
            } else {
                addPaymentMethodActivity.v(false);
                String message = e9.getMessage();
                if (message == null) {
                    message = "";
                }
                addPaymentMethodActivity.w(message);
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements A {
        f() {
        }

        @Override // com.stripe.android.view.A
        public void a() {
        }

        @Override // com.stripe.android.view.A
        public void b() {
        }

        @Override // com.stripe.android.view.A
        public void c() {
        }

        @Override // com.stripe.android.view.A
        public void d(A.a focusField) {
            AbstractC3159y.i(focusField, "focusField");
        }

        @Override // com.stripe.android.view.A
        public void e() {
            AddPaymentMethodActivity.this.S().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2456l f27133b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f27134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AddPaymentMethodActivity f27135d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C2456l c2456l, com.stripe.android.model.p pVar, AddPaymentMethodActivity addPaymentMethodActivity, P5.d dVar) {
            super(2, dVar);
            this.f27133b = c2456l;
            this.f27134c = pVar;
            this.f27135d = addPaymentMethodActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f27133b, this.f27134c, this.f27135d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f27132a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    b8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C2456l c2456l = this.f27133b;
                com.stripe.android.model.p pVar = this.f27134c;
                this.f27132a = 1;
                b8 = c2456l.b(pVar, this);
                if (b8 == e8) {
                    return e8;
                }
            }
            AddPaymentMethodActivity addPaymentMethodActivity = this.f27135d;
            Throwable e9 = L5.s.e(b8);
            if (e9 == null) {
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) b8;
                if (addPaymentMethodActivity.P()) {
                    addPaymentMethodActivity.F(oVar);
                } else {
                    addPaymentMethodActivity.K(oVar);
                }
            } else {
                addPaymentMethodActivity.v(false);
                String message = e9.getMessage();
                if (message == null) {
                    message = "";
                }
                addPaymentMethodActivity.w(message);
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5551invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5551invoke() {
            AddPaymentMethodActivity.this.N();
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o.p invoke() {
            return AddPaymentMethodActivity.this.N().f();
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3160z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AddPaymentMethodActivity.this.O().f24551b && AddPaymentMethodActivity.this.N().i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27139a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f27139a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27139a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27141b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27140a = function0;
            this.f27141b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27140a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27141b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3160z implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3057I invoke() {
            j2.r e8 = AddPaymentMethodActivity.this.N().e();
            if (e8 == null) {
                e8 = j2.r.f33061c.a(AddPaymentMethodActivity.this);
            }
            Context applicationContext = AddPaymentMethodActivity.this.getApplicationContext();
            AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
            return new C3057I(applicationContext, e8.e(), e8.f(), false, null, 24, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3160z implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new C2456l.b(AddPaymentMethodActivity.this.Q(), AddPaymentMethodActivity.this.N());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(com.stripe.android.model.o oVar) {
        Object b8;
        try {
            s.a aVar = L5.s.f6511b;
            AbstractC3066f.f32971a.a();
            b8 = L5.s.b(null);
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        Throwable e8 = L5.s.e(b8);
        if (e8 == null) {
            android.support.v4.media.a.a(b8);
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null, oVar, null), 3, null);
        } else {
            L(new AbstractC2442e.c(e8));
        }
    }

    private final void G(C2440d c2440d) {
        Integer j8 = c2440d.j();
        if (j8 != null) {
            getWindow().addFlags(j8.intValue());
        }
        s().setLayoutResource(AbstractC3051C.f32804c);
        View inflate = s().inflate();
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        G2.c a8 = G2.c.a((ViewGroup) inflate);
        AbstractC3159y.h(a8, "bind(...)");
        a8.f3103b.addView(M());
        LinearLayout root = a8.f3103b;
        AbstractC3159y.h(root, "root");
        View H8 = H(root);
        if (H8 != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                M().setAccessibilityTraversalBefore(H8.getId());
                H8.setAccessibilityTraversalAfter(M().getId());
            }
            a8.f3103b.addView(H8);
        }
        setTitle(R());
    }

    private final View H(ViewGroup viewGroup) {
        if (N().b() > 0) {
            View inflate = getLayoutInflater().inflate(N().b(), viewGroup, false);
            inflate.setId(AbstractC3049A.f32753Q);
            if (inflate instanceof TextView) {
                TextView textView = (TextView) inflate;
                LinkifyCompat.addLinks(textView, 15);
                ViewCompat.enableAccessibleClickableSpanSupport(inflate);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return inflate;
            }
            return inflate;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC2454k J(C2440d c2440d) {
        int i8 = b.f27125a[O().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return C2452j.f27743c.a(this);
                }
                throw new IllegalArgumentException("Unsupported Payment Method type: " + O().f24550a);
            }
            return C2446g.f27708d.a(this);
        }
        C2444f c2444f = new C2444f(this, null, 0, c2440d.c(), 6, null);
        c2444f.setCardInputListener(this.f27124m);
        return c2444f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(com.stripe.android.model.o oVar) {
        L(new AbstractC2442e.d(oVar));
    }

    private final void L(AbstractC2442e abstractC2442e) {
        v(false);
        setResult(-1, new Intent().putExtras(abstractC2442e.b()));
        finish();
    }

    private final AbstractC2454k M() {
        return (AbstractC2454k) this.f27122k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2440d N() {
        return (C2440d) this.f27118g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.p O() {
        return (o.p) this.f27120i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P() {
        return ((Boolean) this.f27121j.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3057I Q() {
        return (C3057I) this.f27119h.getValue();
    }

    private final int R() {
        int i8 = b.f27125a[O().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return AbstractC3053E.f32847J0;
                }
                throw new IllegalArgumentException("Unsupported Payment Method type: " + O().f24550a);
            }
            return AbstractC3053E.f32847J0;
        }
        return AbstractC3053E.f32843H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2456l S() {
        return (C2456l) this.f27123l.getValue();
    }

    public final void I(C2456l viewModel, com.stripe.android.model.p pVar) {
        AbstractC3159y.i(viewModel, "viewModel");
        if (pVar == null) {
            return;
        }
        v(true);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(viewModel, pVar, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.view.M0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AbstractC3848a.a(this, new h())) {
            return;
        }
        S().g();
        G(N());
        setResult(-1, new Intent().putExtras(AbstractC2442e.a.f27672b.b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        M().requestFocus();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        S().f();
    }

    @Override // com.stripe.android.view.M0
    public void t() {
        S().h();
        I(S(), M().getCreateParams());
    }

    @Override // com.stripe.android.view.M0
    protected void u(boolean z8) {
        M().setCommunicatingProgress(z8);
    }
}
