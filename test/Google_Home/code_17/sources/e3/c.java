package E3;

import B3.f;
import O5.C1352h;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
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
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.M;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.g f2339b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E3.d f2340c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0028a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E3.d f2341a;

            C0028a(E3.d dVar) {
                this.f2341a = dVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(f.e.d dVar, S5.d dVar2) {
                if (dVar != null) {
                    this.f2341a.g().invoke(dVar);
                }
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E3.g gVar, E3.d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f2339b = gVar;
            this.f2340c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f2339b, this.f2340c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f2338a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3706f u8 = this.f2339b.u();
                C0028a c0028a = new C0028a(this.f2340c);
                this.f2338a = 1;
                if (u8.collect(c0028a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2342a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.g f2343b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E3.d f2344c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E3.d f2345a;

            a(E3.d dVar) {
                this.f2345a = dVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.navigation.d dVar, S5.d dVar2) {
                Function1 f8;
                if (dVar != null && (f8 = this.f2345a.f()) != null) {
                    f8.invoke(dVar);
                }
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E3.g gVar, E3.d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f2343b = gVar;
            this.f2344c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f2343b, this.f2344c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f2342a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3706f m8 = this.f2343b.m();
                a aVar = new a(this.f2344c);
                this.f2342a = 1;
                if (m8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0029c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2346a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.g f2347b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E3.d f2348c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E3.d f2349a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: E3.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0030a extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f2350a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0030a(boolean z8) {
                    super(1);
                    this.f2350a = z8;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
                    if (bVar != null) {
                        return PrimaryButton.b.b(bVar, null, null, this.f2350a, false, 11, null);
                    }
                    return null;
                }
            }

            a(E3.d dVar) {
                this.f2349a = dVar;
            }

            public final Object a(boolean z8, S5.d dVar) {
                this.f2349a.k().invoke(new C0030a(z8));
                return I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0029c(E3.g gVar, E3.d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f2347b = gVar;
            this.f2348c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0029c(this.f2347b, this.f2348c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f2346a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3698L t8 = this.f2347b.t();
                a aVar = new a(this.f2348c);
                this.f2346a = 1;
                if (t8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0029c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2351a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.g f2352b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f2353c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E3.d f2354d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f2355e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E3.g f2356a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E3.d f2357b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f2358c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ State f2359d;

            a(E3.g gVar, E3.d dVar, Context context, State state) {
                this.f2356a = gVar;
                this.f2357b = dVar;
                this.f2358c = context;
                this.f2359d = state;
            }

            public final Object a(boolean z8, S5.d dVar) {
                String k8 = this.f2356a.k();
                j.b(this.f2357b, this.f2358c, c.b(this.f2359d), i.f2566a.a(k8, z8, this.f2357b.d(), !this.f2357b.p()), k8);
                return I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f f2360a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ State f2361b;

            /* loaded from: classes4.dex */
            public static final class a implements InterfaceC3707g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3707g f2362a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f2363b;

                /* renamed from: E3.c$d$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0031a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f2364a;

                    /* renamed from: b, reason: collision with root package name */
                    int f2365b;

                    public C0031a(S5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f2364a = obj;
                        this.f2365b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC3707g interfaceC3707g, State state) {
                    this.f2362a = interfaceC3707g;
                    this.f2363b = state;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // o6.InterfaceC3707g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, S5.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof E3.c.d.b.a.C0031a
                        if (r0 == 0) goto L13
                        r0 = r6
                        E3.c$d$b$a$a r0 = (E3.c.d.b.a.C0031a) r0
                        int r1 = r0.f2365b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f2365b = r1
                        goto L18
                    L13:
                        E3.c$d$b$a$a r0 = new E3.c$d$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f2364a
                        java.lang.Object r1 = T5.b.e()
                        int r2 = r0.f2365b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        O5.t.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        O5.t.b(r6)
                        o6.g r6 = r4.f2362a
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        r2.booleanValue()
                        androidx.compose.runtime.State r2 = r4.f2363b
                        E3.f r2 = E3.c.d(r2)
                        boolean r2 = r2 instanceof E3.f.a
                        if (r2 != 0) goto L4f
                        r0.f2365b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        O5.I r5 = O5.I.f8278a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: E3.c.d.b.a.emit(java.lang.Object, S5.d):java.lang.Object");
                }
            }

            public b(InterfaceC3706f interfaceC3706f, State state) {
                this.f2360a = interfaceC3706f;
                this.f2361b = state;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                Object collect = this.f2360a.collect(new a(interfaceC3707g, this.f2361b), dVar);
                if (collect == T5.b.e()) {
                    return collect;
                }
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(E3.g gVar, State state, E3.d dVar, Context context, S5.d dVar2) {
            super(2, dVar2);
            this.f2352b = gVar;
            this.f2353c = state;
            this.f2354d = dVar;
            this.f2355e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f2352b, this.f2353c, this.f2354d, this.f2355e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f2351a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = new b(this.f2352b.w(), this.f2353c);
                a aVar = new a(this.f2352b, this.f2354d, this.f2355e, this.f2353c);
                this.f2351a = 1;
                if (bVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2367a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.d f2368b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f2369c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E3.g f2370d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f2371e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ State f2372f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3252v implements Function1 {
            a(Object obj) {
                super(1, obj, E3.g.class, "handlePrimaryButtonClick", "handlePrimaryButtonClick(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V", 0);
            }

            public final void d(E3.f p02) {
                AbstractC3255y.i(p02, "p0");
                ((E3.g) this.receiver).D(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((E3.f) obj);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(E3.d dVar, Context context, E3.g gVar, State state, State state2, S5.d dVar2) {
            super(2, dVar2);
            this.f2368b = dVar;
            this.f2369c = context;
            this.f2370d = gVar;
            this.f2371e = state;
            this.f2372f = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f2368b, this.f2369c, this.f2370d, this.f2371e, this.f2372f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            T5.b.e();
            if (this.f2367a == 0) {
                t.b(obj);
                E3.d dVar = this.f2368b;
                Context context = this.f2369c;
                E3.f b8 = c.b(this.f2371e);
                if (c.c(this.f2372f) && !c.b(this.f2371e).h()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                j.a(dVar, context, b8, z8, this.f2370d.k(), new a(this.f2370d));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E3.g f2373a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistryOwner f2374b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ E3.d f2375c;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2376a = new a();

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
            final /* synthetic */ E3.d f2377a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E3.g f2378b;

            public b(E3.d dVar, E3.g gVar) {
                this.f2377a = dVar;
                this.f2378b = gVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f2377a.k().invoke(a.f2376a);
                this.f2378b.F();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(E3.g gVar, ActivityResultRegistryOwner activityResultRegistryOwner, E3.d dVar) {
            super(1);
            this.f2373a = gVar;
            this.f2374b = activityResultRegistryOwner;
            this.f2375c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            AbstractC3255y.i(DisposableEffect, "$this$DisposableEffect");
            E3.g gVar = this.f2373a;
            ActivityResultRegistryOwner activityResultRegistryOwner = this.f2374b;
            AbstractC3255y.f(activityResultRegistryOwner);
            gVar.G(activityResultRegistryOwner);
            return new b(this.f2375c, this.f2373a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E3.g f2379a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.d f2380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2381c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(E3.g gVar, E3.d dVar, int i8) {
            super(2);
            this.f2379a = gVar;
            this.f2380b = dVar;
            this.f2381c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            c.a(this.f2379a, this.f2380b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2381c | 1));
        }
    }

    public static final void a(E3.g viewModel, E3.d usBankAccountFormArgs, Composer composer, int i8) {
        AbstractC3255y.i(viewModel, "viewModel");
        AbstractC3255y.i(usBankAccountFormArgs, "usBankAccountFormArgs");
        Composer startRestartGroup = composer.startRestartGroup(356178850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(356178850, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmitters (USBankAccountEmitters.kt:15)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        State a8 = y4.f.a(viewModel.n(), startRestartGroup, 8);
        State a9 = y4.f.a(viewModel.t(), startRestartGroup, 8);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(startRestartGroup, LocalActivityResultRegistryOwner.$stable);
        I i9 = I.f8278a;
        EffectsKt.LaunchedEffect(i9, new a(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(i9, new b(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(i9, new C0029c(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
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
    public static final E3.f b(State state) {
        return (E3.f) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
