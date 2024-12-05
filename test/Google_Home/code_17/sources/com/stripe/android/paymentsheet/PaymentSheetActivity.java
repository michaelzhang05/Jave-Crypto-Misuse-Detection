package com.stripe.android.paymentsheet;

import M3.AbstractActivityC1310e;
import O5.I;
import O5.InterfaceC1355k;
import O5.s;
import a6.InterfaceC1668n;
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
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.x;
import com.stripe.android.paymentsheet.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.U;
import l6.M;
import m4.AbstractC3441m;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import q4.AbstractC3851h;
import q4.C3850g;
import t2.AbstractC4026a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentSheetActivity extends AbstractActivityC1310e {

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f26533b = new y.d(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f26534c = new ViewModelLazy(U.b(y.class), new b(this), new e(), new c(null, this));

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1355k f26535d = O5.l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0567a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentSheetActivity f26537a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0568a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f26538a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f26539b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3850g f26540c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0569a implements InterfaceC3707g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentSheetActivity f26541a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3850g f26542b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0570a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: a, reason: collision with root package name */
                        Object f26543a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f26544b;

                        /* renamed from: d, reason: collision with root package name */
                        int f26546d;

                        C0570a(S5.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f26544b = obj;
                            this.f26546d |= Integer.MIN_VALUE;
                            return C0569a.this.emit(null, this);
                        }
                    }

                    C0569a(PaymentSheetActivity paymentSheetActivity, C3850g c3850g) {
                        this.f26541a = paymentSheetActivity;
                        this.f26542b = c3850g;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // o6.InterfaceC3707g
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.stripe.android.paymentsheet.x r5, S5.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0567a.C0568a.C0569a.C0570a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a r0 = (com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0567a.C0568a.C0569a.C0570a) r0
                            int r1 = r0.f26546d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f26546d = r1
                            goto L18
                        L13:
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a r0 = new com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f26544b
                            java.lang.Object r1 = T5.b.e()
                            int r2 = r0.f26546d
                            r3 = 1
                            if (r2 == 0) goto L35
                            if (r2 != r3) goto L2d
                            java.lang.Object r5 = r0.f26543a
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a r5 = (com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0567a.C0568a.C0569a) r5
                            O5.t.b(r6)
                            goto L4b
                        L2d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L35:
                            O5.t.b(r6)
                            com.stripe.android.paymentsheet.PaymentSheetActivity r6 = r4.f26541a
                            r6.x(r5)
                            q4.g r5 = r4.f26542b
                            r0.f26543a = r4
                            r0.f26546d = r3
                            java.lang.Object r5 = r5.c(r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            r5 = r4
                        L4b:
                            com.stripe.android.paymentsheet.PaymentSheetActivity r6 = r5.f26541a
                            com.stripe.android.paymentsheet.y r6 = r6.n()
                            C3.b r6 = r6.r()
                            r6.d()
                            com.stripe.android.paymentsheet.PaymentSheetActivity r5 = r5.f26541a
                            r5.finish()
                            O5.I r5 = O5.I.f8278a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0567a.C0568a.C0569a.emit(com.stripe.android.paymentsheet.x, S5.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0568a(PaymentSheetActivity paymentSheetActivity, C3850g c3850g, S5.d dVar) {
                    super(2, dVar);
                    this.f26539b = paymentSheetActivity;
                    this.f26540c = c3850g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0568a(this.f26539b, this.f26540c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f26538a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3706f v8 = AbstractC3708h.v(this.f26539b.n().r0());
                        C0569a c0569a = new C0569a(this.f26539b, this.f26540c);
                        this.f26538a = 1;
                        if (v8.collect(c0569a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0568a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$b */
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends C3252v implements Function0 {
                b(Object obj) {
                    super(0, obj, y.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5517invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5517invoke() {
                    ((y) this.receiver).H();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f26547a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentSheetActivity paymentSheetActivity) {
                    super(2);
                    this.f26547a = paymentSheetActivity;
                }

                @Override // a6.InterfaceC1668n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f8278a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1652456663, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentSheetActivity.kt:75)");
                    }
                    com.stripe.android.paymentsheet.ui.b.h(this.f26547a.n(), composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$d */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f26548a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(State state) {
                    super(1);
                    this.f26548a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3255y.i(it, "it");
                    return Boolean.valueOf(!C0567a.b(this.f26548a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0567a(PaymentSheetActivity paymentSheetActivity) {
                super(2);
                this.f26537a = paymentSheetActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean b(State state) {
                return ((Boolean) state.getValue()).booleanValue();
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(952004382, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous> (PaymentSheetActivity.kt:56)");
                }
                State a8 = y4.f.a(this.f26537a.n().v(), composer, 8);
                composer.startReplaceableGroup(2130490094);
                boolean changed = composer.changed(a8);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d(a8);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3850g b8 = AbstractC3851h.b(null, (Function1) rememberedValue, composer, 0, 1);
                EffectsKt.LaunchedEffect(I.f8278a, new C0568a(this.f26537a, b8, null), composer, 70);
                AbstractC4026a.a(b8, null, new b(this.f26537a.n()), ComposableLambdaKt.composableLambda(composer, 1652456663, true, new c(this.f26537a)), composer, C3850g.f38287e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(485212172, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous> (PaymentSheetActivity.kt:55)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 952004382, true, new C0567a(PaymentSheetActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26549a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26549a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26549a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26550a = function0;
            this.f26551b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26550a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26551b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.a invoke() {
            PaymentSheetContractV2.a.C0572a c0572a = PaymentSheetContractV2.a.f26563e;
            Intent intent = PaymentSheetActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return c0572a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentSheetActivity.this.v();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.a invoke() {
            PaymentSheetContractV2.a t8 = PaymentSheetActivity.this.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final IllegalArgumentException r() {
        return new IllegalArgumentException("PaymentSheet started without arguments.");
    }

    private final void s(Throwable th) {
        if (th == null) {
            th = r();
        }
        x(new x.c(th));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetContractV2.a t() {
        return (PaymentSheetContractV2.a) this.f26535d.getValue();
    }

    private final Object w() {
        Object b8;
        PaymentSheetContractV2.a t8 = t();
        if (t8 == null) {
            s.a aVar = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(r()));
        } else {
            try {
                t8.g().a();
                v.b(t8.a());
                v.a(t8.a().h());
                b8 = O5.s.b(t8);
            } catch (IllegalArgumentException e8) {
                s.a aVar2 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(e8));
            }
        }
        p(O5.s.g(b8));
        return b8;
    }

    @Override // M3.AbstractActivityC1310e, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Object obj;
        Object w8 = w();
        super.onCreate(bundle);
        if (O5.s.g(w8)) {
            obj = null;
        } else {
            obj = w8;
        }
        if (((PaymentSheetContractV2.a) obj) == null) {
            s(O5.s.e(w8));
            return;
        }
        n().K0(this, this);
        if (!N3.a.a(this)) {
            n().c().b();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(485212172, true, new a()), 1, null);
    }

    @Override // M3.AbstractActivityC1310e
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public y n() {
        return (y) this.f26534c.getValue();
    }

    public final ViewModelProvider.Factory v() {
        return this.f26533b;
    }

    public void x(x result) {
        AbstractC3255y.i(result, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContractV2.c(result).b()));
    }
}
