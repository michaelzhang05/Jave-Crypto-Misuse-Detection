package com.stripe.android.view;

import O5.InterfaceC1355k;
import O5.s;
import a6.InterfaceC1668n;
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
import com.stripe.android.view.AbstractC2636e;
import com.stripe.android.view.C2634d;
import com.stripe.android.view.C2650l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import m2.AbstractC3403A;
import m2.AbstractC3405C;
import m2.AbstractC3407E;
import m2.AbstractC3420f;
import m2.C3411I;
import z4.AbstractC4228a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AddPaymentMethodActivity extends M0 {

    /* renamed from: n, reason: collision with root package name */
    public static final a f28171n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f28172o = 8;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1355k f28173g = O5.l.b(new d());

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1355k f28174h = O5.l.b(new m());

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1355k f28175i = O5.l.b(new i());

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1355k f28176j = O5.l.b(new j());

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1355k f28177k = O5.l.b(new c());

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1355k f28178l = new ViewModelLazy(kotlin.jvm.internal.U.b(C2650l.class), new k(this), new n(), new l(null, this));

    /* renamed from: m, reason: collision with root package name */
    private final f f28179m = new f();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28180a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25587i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25589k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25563A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28180a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2648k invoke() {
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            AbstractC2648k J8 = addPaymentMethodActivity.J(addPaymentMethodActivity.N());
            J8.setId(AbstractC3403A.f34730R);
            return J8;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2634d invoke() {
            C2634d.b bVar = C2634d.f28711h;
            Intent intent = AddPaymentMethodActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return bVar.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28183a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f28185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC3420f abstractC3420f, com.stripe.android.model.o oVar, S5.d dVar) {
            super(2, dVar);
            this.f28185c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(null, this.f28185c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = T5.b.e();
            int i8 = this.f28183a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    a8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C2650l S8 = AddPaymentMethodActivity.this.S();
                com.stripe.android.model.o oVar = this.f28185c;
                this.f28183a = 1;
                a8 = S8.a(null, oVar, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            Throwable e9 = O5.s.e(a8);
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
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
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
            AbstractC3255y.i(focusField, "focusField");
        }

        @Override // com.stripe.android.view.A
        public void e() {
            AddPaymentMethodActivity.this.S().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28187a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2650l f28188b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f28189c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AddPaymentMethodActivity f28190d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C2650l c2650l, com.stripe.android.model.p pVar, AddPaymentMethodActivity addPaymentMethodActivity, S5.d dVar) {
            super(2, dVar);
            this.f28188b = c2650l;
            this.f28189c = pVar;
            this.f28190d = addPaymentMethodActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f28188b, this.f28189c, this.f28190d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f28187a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    b8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C2650l c2650l = this.f28188b;
                com.stripe.android.model.p pVar = this.f28189c;
                this.f28187a = 1;
                b8 = c2650l.b(pVar, this);
                if (b8 == e8) {
                    return e8;
                }
            }
            AddPaymentMethodActivity addPaymentMethodActivity = this.f28190d;
            Throwable e9 = O5.s.e(b8);
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
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5555invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5555invoke() {
            AddPaymentMethodActivity.this.N();
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o.p invoke() {
            return AddPaymentMethodActivity.this.N().h();
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AddPaymentMethodActivity.this.O().f25606b && AddPaymentMethodActivity.this.N().i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28194a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f28194a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28194a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28195a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28196b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28195a = function0;
            this.f28196b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28195a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28196b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3256z implements Function0 {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3411I invoke() {
            m2.r g8 = AddPaymentMethodActivity.this.N().g();
            if (g8 == null) {
                g8 = m2.r.f35037c.a(AddPaymentMethodActivity.this);
            }
            Context applicationContext = AddPaymentMethodActivity.this.getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            return new C3411I(applicationContext, g8.g(), g8.h(), false, null, 24, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3256z implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new C2650l.b(AddPaymentMethodActivity.this.Q(), AddPaymentMethodActivity.this.N());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(com.stripe.android.model.o oVar) {
        Object b8;
        try {
            s.a aVar = O5.s.f8302b;
            AbstractC3420f.f34947a.a();
            b8 = O5.s.b(null);
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        Throwable e8 = O5.s.e(b8);
        if (e8 == null) {
            android.support.v4.media.a.a(b8);
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null, oVar, null), 3, null);
        } else {
            L(new AbstractC2636e.c(e8));
        }
    }

    private final void G(C2634d c2634d) {
        Integer l8 = c2634d.l();
        if (l8 != null) {
            getWindow().addFlags(l8.intValue());
        }
        s().setLayoutResource(AbstractC3405C.f34780c);
        View inflate = s().inflate();
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        J2.c a8 = J2.c.a((ViewGroup) inflate);
        AbstractC3255y.h(a8, "bind(...)");
        a8.f4822b.addView(M());
        LinearLayout root = a8.f4822b;
        AbstractC3255y.h(root, "root");
        View H8 = H(root);
        if (H8 != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                M().setAccessibilityTraversalBefore(H8.getId());
                H8.setAccessibilityTraversalAfter(M().getId());
            }
            a8.f4822b.addView(H8);
        }
        setTitle(R());
    }

    private final View H(ViewGroup viewGroup) {
        if (N().a() > 0) {
            View inflate = getLayoutInflater().inflate(N().a(), viewGroup, false);
            inflate.setId(AbstractC3403A.f34729Q);
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
    public final AbstractC2648k J(C2634d c2634d) {
        int i8 = b.f28180a[O().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return C2646j.f28798c.a(this);
                }
                throw new IllegalArgumentException("Unsupported Payment Method type: " + O().f25605a);
            }
            return C2640g.f28763d.a(this);
        }
        C2638f c2638f = new C2638f(this, null, 0, c2634d.b(), 6, null);
        c2638f.setCardInputListener(this.f28179m);
        return c2638f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(com.stripe.android.model.o oVar) {
        L(new AbstractC2636e.d(oVar));
    }

    private final void L(AbstractC2636e abstractC2636e) {
        v(false);
        setResult(-1, new Intent().putExtras(abstractC2636e.a()));
        finish();
    }

    private final AbstractC2648k M() {
        return (AbstractC2648k) this.f28177k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2634d N() {
        return (C2634d) this.f28173g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.p O() {
        return (o.p) this.f28175i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P() {
        return ((Boolean) this.f28176j.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3411I Q() {
        return (C3411I) this.f28174h.getValue();
    }

    private final int R() {
        int i8 = b.f28180a[O().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return AbstractC3407E.f34823J0;
                }
                throw new IllegalArgumentException("Unsupported Payment Method type: " + O().f25605a);
            }
            return AbstractC3407E.f34823J0;
        }
        return AbstractC3407E.f34819H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2650l S() {
        return (C2650l) this.f28178l.getValue();
    }

    public final void I(C2650l viewModel, com.stripe.android.model.p pVar) {
        AbstractC3255y.i(viewModel, "viewModel");
        if (pVar == null) {
            return;
        }
        v(true);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(viewModel, pVar, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.stripe.android.view.M0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AbstractC4228a.a(this, new h())) {
            return;
        }
        S().g();
        G(N());
        setResult(-1, new Intent().putExtras(AbstractC2636e.a.f28727b.a()));
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
