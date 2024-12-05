package com.stripe.android.paymentsheet;

import M3.AbstractActivityC1310e;
import O5.I;
import O5.InterfaceC1355k;
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
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.t;
import com.stripe.android.paymentsheet.u;
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
public final class PaymentOptionsActivity extends AbstractActivityC1310e {

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f26511b = new t.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f26512c = new ViewModelLazy(U.b(t.class), new b(this), new e(), new c(null, this));

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1355k f26513d = O5.l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0563a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentOptionsActivity f26515a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0564a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f26516a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f26517b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3850g f26518c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0565a implements InterfaceC3707g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentOptionsActivity f26519a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3850g f26520b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0566a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: a, reason: collision with root package name */
                        Object f26521a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f26522b;

                        /* renamed from: d, reason: collision with root package name */
                        int f26524d;

                        C0566a(S5.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f26522b = obj;
                            this.f26524d |= Integer.MIN_VALUE;
                            return C0565a.this.emit(null, this);
                        }
                    }

                    C0565a(PaymentOptionsActivity paymentOptionsActivity, C3850g c3850g) {
                        this.f26519a = paymentOptionsActivity;
                        this.f26520b = c3850g;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // o6.InterfaceC3707g
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.stripe.android.paymentsheet.o r5, S5.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0563a.C0564a.C0565a.C0566a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a r0 = (com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0563a.C0564a.C0565a.C0566a) r0
                            int r1 = r0.f26524d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f26524d = r1
                            goto L18
                        L13:
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a r0 = new com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f26522b
                            java.lang.Object r1 = T5.b.e()
                            int r2 = r0.f26524d
                            r3 = 1
                            if (r2 == 0) goto L35
                            if (r2 != r3) goto L2d
                            java.lang.Object r5 = r0.f26521a
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a r5 = (com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0563a.C0564a.C0565a) r5
                            O5.t.b(r6)
                            goto L4b
                        L2d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L35:
                            O5.t.b(r6)
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r6 = r4.f26519a
                            r6.v(r5)
                            q4.g r5 = r4.f26520b
                            r0.f26521a = r4
                            r0.f26524d = r3
                            java.lang.Object r5 = r5.c(r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            r5 = r4
                        L4b:
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r6 = r5.f26519a
                            com.stripe.android.paymentsheet.t r6 = r6.n()
                            C3.b r6 = r6.r()
                            r6.d()
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r5 = r5.f26519a
                            r5.finish()
                            O5.I r5 = O5.I.f8278a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0563a.C0564a.C0565a.emit(com.stripe.android.paymentsheet.o, S5.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0564a(PaymentOptionsActivity paymentOptionsActivity, C3850g c3850g, S5.d dVar) {
                    super(2, dVar);
                    this.f26517b = paymentOptionsActivity;
                    this.f26518c = c3850g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0564a(this.f26517b, this.f26518c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f26516a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3706f v8 = AbstractC3708h.v(this.f26517b.n().R());
                        C0565a c0565a = new C0565a(this.f26517b, this.f26518c);
                        this.f26516a = 1;
                        if (v8.collect(c0565a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0564a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$b */
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends C3252v implements Function0 {
                b(Object obj) {
                    super(0, obj, t.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5516invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5516invoke() {
                    ((t) this.receiver).H();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f26525a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentOptionsActivity paymentOptionsActivity) {
                    super(2);
                    this.f26525a = paymentOptionsActivity;
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
                        ComposerKt.traceEventStart(713072409, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:71)");
                    }
                    com.stripe.android.paymentsheet.ui.b.g(this.f26525a.n(), composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$d */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f26526a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(State state) {
                    super(1);
                    this.f26526a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3255y.i(it, "it");
                    return Boolean.valueOf(!C0563a.b(this.f26526a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0563a(PaymentOptionsActivity paymentOptionsActivity) {
                super(2);
                this.f26515a = paymentOptionsActivity;
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
                    ComposerKt.traceEventStart(526390752, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:52)");
                }
                State a8 = y4.f.a(this.f26515a.n().v(), composer, 8);
                composer.startReplaceableGroup(1788261935);
                boolean changed = composer.changed(a8);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d(a8);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3850g b8 = AbstractC3851h.b(null, (Function1) rememberedValue, composer, 0, 1);
                EffectsKt.LaunchedEffect(I.f8278a, new C0564a(this.f26515a, b8, null), composer, 70);
                AbstractC4026a.a(b8, null, new b(this.f26515a.n()), ComposableLambdaKt.composableLambda(composer, 713072409, true, new c(this.f26515a)), composer, C3850g.f38287e | 3072, 2);
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
                ComposerKt.traceEventStart(-1719713842, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous> (PaymentOptionsActivity.kt:51)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 526390752, true, new C0563a(PaymentOptionsActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26527a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26527a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26527a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26529b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26528a = function0;
            this.f26529b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26528a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26529b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentOptionContract.a invoke() {
            PaymentOptionContract.a.C0562a c0562a = PaymentOptionContract.a.f26505e;
            Intent intent = PaymentOptionsActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return c0562a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentOptionsActivity.this.t();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
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
        return (PaymentOptionContract.a) this.f26513d.getValue();
    }

    private final PaymentOptionContract.a u() {
        boolean z8;
        L3.l b8;
        u.g a8;
        u.b h8;
        PaymentOptionContract.a r8 = r();
        if (r8 != null && (b8 = r8.b()) != null && (a8 = b8.a()) != null && (h8 = a8.h()) != null) {
            v.a(h8);
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
    @Override // M3.AbstractActivityC1310e, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PaymentOptionContract.a u8 = u();
        super.onCreate(bundle);
        if (u8 == null) {
            finish();
            return;
        }
        if (!N3.a.a(this)) {
            n().c().b();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1719713842, true, new a()), 1, null);
    }

    @Override // M3.AbstractActivityC1310e
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public t n() {
        return (t) this.f26512c.getValue();
    }

    public final ViewModelProvider.Factory t() {
        return this.f26511b;
    }

    public void v(o result) {
        AbstractC3255y.i(result, "result");
        setResult(result.a(), new Intent().putExtras(result.b()));
    }
}
