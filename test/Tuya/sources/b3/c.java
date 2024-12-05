package B3;

import L5.C1224h;
import L5.I;
import L5.t;
import X5.n;
import android.content.Context;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f743a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.g f744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B3.d f745c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: B3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0003a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B3.d f746a;

            C0003a(B3.d dVar) {
                this.f746a = dVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3991f.e.d dVar, P5.d dVar2) {
                if (dVar != null) {
                    this.f746a.g().invoke(dVar);
                }
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B3.g gVar, B3.d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f744b = gVar;
            this.f745c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f744b, this.f745c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f743a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f u8 = this.f744b.u();
                C0003a c0003a = new C0003a(this.f745c);
                this.f743a = 1;
                if (u8.collect(c0003a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.g f748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B3.d f749c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B3.d f750a;

            a(B3.d dVar) {
                this.f750a = dVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.navigation.d dVar, P5.d dVar2) {
                Function1 f8;
                if (dVar != null && (f8 = this.f750a.f()) != null) {
                    f8.invoke(dVar);
                }
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B3.g gVar, B3.d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f748b = gVar;
            this.f749c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f748b, this.f749c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f747a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f m8 = this.f748b.m();
                a aVar = new a(this.f749c);
                this.f747a = 1;
                if (m8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0004c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.g f752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B3.d f753c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: B3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B3.d f754a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: B3.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0005a extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f755a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0005a(boolean z8) {
                    super(1);
                    this.f755a = z8;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
                    if (bVar != null) {
                        return PrimaryButton.b.b(bVar, null, null, this.f755a, false, 11, null);
                    }
                    return null;
                }
            }

            a(B3.d dVar) {
                this.f754a = dVar;
            }

            public final Object b(boolean z8, P5.d dVar) {
                this.f754a.k().invoke(new C0005a(z8));
                return I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0004c(B3.g gVar, B3.d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f752b = gVar;
            this.f753c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0004c(this.f752b, this.f753c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0004c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f751a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3349K t8 = this.f752b.t();
                a aVar = new a(this.f753c);
                this.f751a = 1;
                if (t8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f756a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.g f757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B3.d f759d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f760e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B3.g f761a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ B3.d f762b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f763c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ State f764d;

            a(B3.g gVar, B3.d dVar, Context context, State state) {
                this.f761a = gVar;
                this.f762b = dVar;
                this.f763c = context;
                this.f764d = state;
            }

            public final Object b(boolean z8, P5.d dVar) {
                String k8 = this.f761a.k();
                j.b(this.f762b, this.f763c, c.b(this.f764d), i.f971a.a(k8, z8, this.f762b.d(), !this.f762b.p()), k8);
                return I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f765a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ State f766b;

            /* loaded from: classes4.dex */
            public static final class a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3359g f767a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f768b;

                /* renamed from: B3.c$d$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0006a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f769a;

                    /* renamed from: b, reason: collision with root package name */
                    int f770b;

                    public C0006a(P5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f769a = obj;
                        this.f770b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC3359g interfaceC3359g, State state) {
                    this.f767a = interfaceC3359g;
                    this.f768b = state;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // l6.InterfaceC3359g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, P5.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof B3.c.d.b.a.C0006a
                        if (r0 == 0) goto L13
                        r0 = r6
                        B3.c$d$b$a$a r0 = (B3.c.d.b.a.C0006a) r0
                        int r1 = r0.f770b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f770b = r1
                        goto L18
                    L13:
                        B3.c$d$b$a$a r0 = new B3.c$d$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f769a
                        java.lang.Object r1 = Q5.b.e()
                        int r2 = r0.f770b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        L5.t.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        L5.t.b(r6)
                        l6.g r6 = r4.f767a
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        r2.booleanValue()
                        androidx.compose.runtime.State r2 = r4.f768b
                        B3.f r2 = B3.c.d(r2)
                        boolean r2 = r2 instanceof B3.f.a
                        if (r2 != 0) goto L4f
                        r0.f770b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        L5.I r5 = L5.I.f6487a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: B3.c.d.b.a.emit(java.lang.Object, P5.d):java.lang.Object");
                }
            }

            public b(InterfaceC3358f interfaceC3358f, State state) {
                this.f765a = interfaceC3358f;
                this.f766b = state;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                Object collect = this.f765a.collect(new a(interfaceC3359g, this.f766b), dVar);
                if (collect == Q5.b.e()) {
                    return collect;
                }
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B3.g gVar, State state, B3.d dVar, Context context, P5.d dVar2) {
            super(2, dVar2);
            this.f757b = gVar;
            this.f758c = state;
            this.f759d = dVar;
            this.f760e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f757b, this.f758c, this.f759d, this.f760e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f756a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = new b(this.f757b.w(), this.f758c);
                a aVar = new a(this.f757b, this.f759d, this.f760e, this.f758c);
                this.f756a = 1;
                if (bVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f772a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.d f773b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f774c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B3.g f775d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f776e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ State f777f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements Function1 {
            a(Object obj) {
                super(1, obj, B3.g.class, "handlePrimaryButtonClick", "handlePrimaryButtonClick(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V", 0);
            }

            public final void d(B3.f p02) {
                AbstractC3159y.i(p02, "p0");
                ((B3.g) this.receiver).D(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((B3.f) obj);
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(B3.d dVar, Context context, B3.g gVar, State state, State state2, P5.d dVar2) {
            super(2, dVar2);
            this.f773b = dVar;
            this.f774c = context;
            this.f775d = gVar;
            this.f776e = state;
            this.f777f = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f773b, this.f774c, this.f775d, this.f776e, this.f777f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Q5.b.e();
            if (this.f772a == 0) {
                t.b(obj);
                B3.d dVar = this.f773b;
                Context context = this.f774c;
                B3.f b8 = c.b(this.f776e);
                if (c.c(this.f777f) && !c.b(this.f776e).f()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                j.a(dVar, context, b8, z8, this.f775d.k(), new a(this.f775d));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B3.g f778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistryOwner f779b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B3.d f780c;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f781a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
                return null;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B3.d f782a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ B3.g f783b;

            public b(B3.d dVar, B3.g gVar) {
                this.f782a = dVar;
                this.f783b = gVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f782a.k().invoke(a.f781a);
                this.f783b.F();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(B3.g gVar, ActivityResultRegistryOwner activityResultRegistryOwner, B3.d dVar) {
            super(1);
            this.f778a = gVar;
            this.f779b = activityResultRegistryOwner;
            this.f780c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            AbstractC3159y.i(DisposableEffect, "$this$DisposableEffect");
            B3.g gVar = this.f778a;
            ActivityResultRegistryOwner activityResultRegistryOwner = this.f779b;
            AbstractC3159y.f(activityResultRegistryOwner);
            gVar.G(activityResultRegistryOwner);
            return new b(this.f780c, this.f778a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B3.g f784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.d f785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(B3.g gVar, B3.d dVar, int i8) {
            super(2);
            this.f784a = gVar;
            this.f785b = dVar;
            this.f786c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            c.a(this.f784a, this.f785b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f786c | 1));
        }
    }

    public static final void a(B3.g viewModel, B3.d usBankAccountFormArgs, Composer composer, int i8) {
        AbstractC3159y.i(viewModel, "viewModel");
        AbstractC3159y.i(usBankAccountFormArgs, "usBankAccountFormArgs");
        Composer startRestartGroup = composer.startRestartGroup(356178850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(356178850, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmitters (USBankAccountEmitters.kt:15)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        State a8 = v4.f.a(viewModel.n(), startRestartGroup, 8);
        State a9 = v4.f.a(viewModel.t(), startRestartGroup, 8);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(startRestartGroup, LocalActivityResultRegistryOwner.$stable);
        I i9 = I.f6487a;
        EffectsKt.LaunchedEffect(i9, new a(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(i9, new b(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(i9, new C0004c(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(i9, new d(viewModel, a8, usBankAccountFormArgs, context, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(b(a8), Boolean.valueOf(c(a9)), new e(usBankAccountFormArgs, context, viewModel, a8, a9, null), startRestartGroup, 520);
        EffectsKt.DisposableEffect(i9, new f(viewModel, current, usBankAccountFormArgs), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(viewModel, usBankAccountFormArgs, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B3.f b(State state) {
        return (B3.f) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
