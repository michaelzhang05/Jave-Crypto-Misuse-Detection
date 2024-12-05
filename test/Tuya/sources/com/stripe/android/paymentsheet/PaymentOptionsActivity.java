package com.stripe.android.paymentsheet;

import J3.AbstractActivityC1197e;
import L5.I;
import L5.InterfaceC1227k;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.t;
import com.stripe.android.paymentsheet.u;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.U;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentOptionsActivity extends AbstractActivityC1197e {

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f25456b = new t.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f25457c = new ViewModelLazy(U.b(t.class), new b(this), new e(), new c(null, this));

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f25458d = L5.l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0567a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentOptionsActivity f25460a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0568a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f25461a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f25462b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3471g f25463c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0569a implements InterfaceC3359g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentOptionsActivity f25464a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3471g f25465b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0570a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: a, reason: collision with root package name */
                        Object f25466a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f25467b;

                        /* renamed from: d, reason: collision with root package name */
                        int f25469d;

                        C0570a(P5.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f25467b = obj;
                            this.f25469d |= Integer.MIN_VALUE;
                            return C0569a.this.emit(null, this);
                        }
                    }

                    C0569a(PaymentOptionsActivity paymentOptionsActivity, C3471g c3471g) {
                        this.f25464a = paymentOptionsActivity;
                        this.f25465b = c3471g;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // l6.InterfaceC3359g
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.stripe.android.paymentsheet.o r5, P5.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0567a.C0568a.C0569a.C0570a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a r0 = (com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0567a.C0568a.C0569a.C0570a) r0
                            int r1 = r0.f25469d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f25469d = r1
                            goto L18
                        L13:
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a r0 = new com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f25467b
                            java.lang.Object r1 = Q5.b.e()
                            int r2 = r0.f25469d
                            r3 = 1
                            if (r2 == 0) goto L35
                            if (r2 != r3) goto L2d
                            java.lang.Object r5 = r0.f25466a
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a r5 = (com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0567a.C0568a.C0569a) r5
                            L5.t.b(r6)
                            goto L4b
                        L2d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L35:
                            L5.t.b(r6)
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r6 = r4.f25464a
                            r6.v(r5)
                            n4.g r5 = r4.f25465b
                            r0.f25466a = r4
                            r0.f25469d = r3
                            java.lang.Object r5 = r5.c(r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            r5 = r4
                        L4b:
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r6 = r5.f25464a
                            com.stripe.android.paymentsheet.t r6 = r6.n()
                            z3.b r6 = r6.r()
                            r6.d()
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r5 = r5.f25464a
                            r5.finish()
                            L5.I r5 = L5.I.f6487a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0567a.C0568a.C0569a.emit(com.stripe.android.paymentsheet.o, P5.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0568a(PaymentOptionsActivity paymentOptionsActivity, C3471g c3471g, P5.d dVar) {
                    super(2, dVar);
                    this.f25462b = paymentOptionsActivity;
                    this.f25463c = c3471g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0568a(this.f25462b, this.f25463c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0568a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f25461a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3358f t8 = AbstractC3360h.t(this.f25462b.n().R());
                        C0569a c0569a = new C0569a(this.f25462b, this.f25463c);
                        this.f25461a = 1;
                        if (t8.collect(c0569a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$b */
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends C3156v implements Function0 {
                b(Object obj) {
                    super(0, obj, t.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5512invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5512invoke() {
                    ((t) this.receiver).H();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f25470a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentOptionsActivity paymentOptionsActivity) {
                    super(2);
                    this.f25470a = paymentOptionsActivity;
                }

                @Override // X5.n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f6487a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(713072409, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:71)");
                    }
                    com.stripe.android.paymentsheet.ui.b.g(this.f25470a.n(), composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$d */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f25471a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(State state) {
                    super(1);
                    this.f25471a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3159y.i(it, "it");
                    return Boolean.valueOf(!C0567a.b(this.f25471a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0567a(PaymentOptionsActivity paymentOptionsActivity) {
                super(2);
                this.f25460a = paymentOptionsActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean b(State state) {
                return ((Boolean) state.getValue()).booleanValue();
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(526390752, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:52)");
                }
                State a8 = v4.f.a(this.f25460a.n().v(), composer, 8);
                composer.startReplaceableGroup(1788261935);
                boolean changed = composer.changed(a8);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d(a8);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3471g b8 = AbstractC3472h.b(null, (Function1) rememberedValue, composer, 0, 1);
                EffectsKt.LaunchedEffect(I.f6487a, new C0568a(this.f25460a, b8, null), composer, 70);
                AbstractC3647a.a(b8, null, new b(this.f25460a.n()), ComposableLambdaKt.composableLambda(composer, 713072409, true, new c(this.f25460a)), composer, C3471g.f36159e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        a() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719713842, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous> (PaymentOptionsActivity.kt:51)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 526390752, true, new C0567a(PaymentOptionsActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25472a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f25472a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f25472a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f25473a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f25473a = function0;
            this.f25474b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25473a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f25474b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentOptionContract.a invoke() {
            PaymentOptionContract.a.C0566a c0566a = PaymentOptionContract.a.f25450e;
            Intent intent = PaymentOptionsActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return c0566a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentOptionsActivity.this.t();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentOptionContract.a invoke() {
            PaymentOptionContract.a r8 = PaymentOptionsActivity.this.r();
            if (r8 != null) {
                return r8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionContract.a r() {
        return (PaymentOptionContract.a) this.f25458d.getValue();
    }

    private final PaymentOptionContract.a u() {
        boolean z8;
        I3.l c8;
        u.g b8;
        u.b f8;
        PaymentOptionContract.a r8 = r();
        if (r8 != null && (c8 = r8.c()) != null && (b8 = c8.b()) != null && (f8 = b8.f()) != null) {
            v.a(f8);
        }
        if (r() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        p(z8);
        return r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // J3.AbstractActivityC1197e, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PaymentOptionContract.a u8 = u();
        super.onCreate(bundle);
        if (u8 == null) {
            finish();
            return;
        }
        if (!K3.a.a(this)) {
            n().c().b();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1719713842, true, new a()), 1, null);
    }

    @Override // J3.AbstractActivityC1197e
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public t n() {
        return (t) this.f25457c.getValue();
    }

    public final ViewModelProvider.Factory t() {
        return this.f25456b;
    }

    public void v(o result) {
        AbstractC3159y.i(result, "result");
        setResult(result.b(), new Intent().putExtras(result.c()));
    }
}
