package com.stripe.android.payments.paymentlauncher;

import A2.InterfaceC0945c;
import A2.j;
import O5.I;
import O5.InterfaceC1351g;
import O5.p;
import O5.r;
import O5.s;
import O5.t;
import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import a6.InterfaceC1668n;
import android.app.Application;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.a;
import com.stripe.android.view.InterfaceC2658p;
import e3.AbstractC2796j;
import e3.InterfaceC2795i;
import h3.m;
import h6.InterfaceC2963c;
import i3.AbstractC2982e;
import i3.C2978a;
import i3.C2980c;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.InterfaceC3249s;
import l6.AbstractC3360i;
import l6.M;
import m2.AbstractC3413K;
import n3.i;
import o3.AbstractC3524f;
import o3.InterfaceC3526h;
import o6.AbstractC3700N;
import o6.w;
import q3.AbstractC3838e;
import q3.y;
import s3.AbstractC3994b;
import w2.AbstractC4144k;
import w2.C4141h;
import w5.InterfaceC4149a;
import z4.AbstractC4229b;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static final a f26359o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f26360p = 8;

    /* renamed from: q, reason: collision with root package name */
    private static final List f26361q = AbstractC1378t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26362a;

    /* renamed from: b, reason: collision with root package name */
    private final m f26363b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3526h f26364c;

    /* renamed from: d, reason: collision with root package name */
    private final C2978a f26365d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f26366e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f26367f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4149a f26368g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC4149a f26369h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC0945c f26370i;

    /* renamed from: j, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26371j;

    /* renamed from: k, reason: collision with root package name */
    private final S5.g f26372k;

    /* renamed from: l, reason: collision with root package name */
    private final SavedStateHandle f26373l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f26374m;

    /* renamed from: n, reason: collision with root package name */
    private final w f26375n;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.payments.paymentlauncher.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0556b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26376a;

        /* renamed from: com.stripe.android.payments.paymentlauncher.b$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f26377a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentLauncherContract.a aVar) {
                super(0);
                this.f26377a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f26377a.h();
            }
        }

        /* renamed from: com.stripe.android.payments.paymentlauncher.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0557b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentLauncherContract.a f26378a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0557b(PaymentLauncherContract.a aVar) {
                super(0);
                this.f26378a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f26378a.l();
            }
        }

        public C0556b(Function0 argsSupplier) {
            AbstractC3255y.i(argsSupplier, "argsSupplier");
            this.f26376a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            PaymentLauncherContract.a aVar = (PaymentLauncherContract.a) this.f26376a.invoke();
            Application a8 = D2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            y.a a9 = AbstractC3838e.a().a(a8).d(aVar.a()).c(new a(aVar)).e(new C0557b(aVar)).b(aVar.g()).f(aVar.b()).build().a();
            boolean z8 = false;
            if (aVar instanceof PaymentLauncherContract.a.b) {
                InterfaceC2795i s8 = ((PaymentLauncherContract.a.b) aVar).s();
                if (!(s8 instanceof com.stripe.android.model.b)) {
                    if (!(s8 instanceof com.stripe.android.model.c)) {
                        throw new p();
                    }
                    b a10 = a9.b(z8).a(createSavedStateHandle).build().a();
                    AbstractC3255y.g(a10, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                    return a10;
                }
                z8 = true;
                b a102 = a9.b(z8).a(createSavedStateHandle).build().a();
                AbstractC3255y.g(a102, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                return a102;
            }
            if (!(aVar instanceof PaymentLauncherContract.a.c)) {
                if (!(aVar instanceof PaymentLauncherContract.a.d)) {
                    throw new p();
                }
                b a1022 = a9.b(z8).a(createSavedStateHandle).build().a();
                AbstractC3255y.g(a1022, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
                return a1022;
            }
            z8 = true;
            b a10222 = a9.b(z8).a(createSavedStateHandle).build().a();
            AbstractC3255y.g(a10222, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
            return a10222;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26379a;

        /* renamed from: c, reason: collision with root package name */
        int f26381c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26379a = obj;
            this.f26381c |= Integer.MIN_VALUE;
            Object q8 = b.this.q(null, null, this);
            return q8 == T5.b.e() ? q8 : s.a(q8);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f26382a;

        /* renamed from: b, reason: collision with root package name */
        Object f26383b;

        /* renamed from: c, reason: collision with root package name */
        int f26384c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2795i f26386e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2658p f26387f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f26388a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26389b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ StripeIntent f26390c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, StripeIntent stripeIntent, S5.d dVar) {
                super(2, dVar);
                this.f26389b = bVar;
                this.f26390c = stripeIntent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f26389b, this.f26390c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f26388a == 0) {
                    t.b(obj);
                    b.B(this.f26389b, new a.c(this.f26390c), this.f26390c, null, 4, null);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.payments.paymentlauncher.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0558b extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f26391a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26392b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f26393c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f26394d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0558b(b bVar, Throwable th, Map map, S5.d dVar) {
                super(2, dVar);
                this.f26392b = bVar;
                this.f26393c = th;
                this.f26394d = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0558b(this.f26392b, this.f26393c, this.f26394d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f26391a == 0) {
                    t.b(obj);
                    b.B(this.f26392b, new a.d(this.f26393c), null, this.f26394d, 2, null);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0558b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC2795i interfaceC2795i, InterfaceC2658p interfaceC2658p, S5.d dVar) {
            super(2, dVar);
            this.f26386e = interfaceC2795i;
            this.f26387f = interfaceC2658p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f26386e, this.f26387f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String A8;
            Map map;
            Object obj2;
            String id;
            Object e8 = T5.b.e();
            int i8 = this.f26384c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3 && i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f8278a;
                }
                A8 = (String) this.f26383b;
                map = (Map) this.f26382a;
                t.b(obj);
                obj2 = ((s) obj).j();
            } else {
                t.b(obj);
                b.this.f26373l.set("key_has_started", kotlin.coroutines.jvm.internal.b.a(true));
                b.this.f26373l.set("confirm_action_requested", kotlin.coroutines.jvm.internal.b.a(true));
                Map w8 = b.this.w(this.f26386e);
                b.this.y(this.f26386e.A());
                if (b.this.f26374m) {
                    A8 = this.f26386e.A();
                } else {
                    A8 = this.f26386e.A();
                    if (A8 == null || j6.n.u(A8)) {
                        A8 = null;
                    }
                    if (A8 == null) {
                        A8 = b.this.f26365d.a();
                    }
                }
                b bVar = b.this;
                InterfaceC2795i interfaceC2795i = this.f26386e;
                this.f26382a = w8;
                this.f26383b = A8;
                this.f26384c = 1;
                Object q8 = bVar.q(interfaceC2795i, A8, this);
                if (q8 == e8) {
                    return e8;
                }
                map = w8;
                obj2 = q8;
            }
            b bVar2 = b.this;
            InterfaceC2658p interfaceC2658p = this.f26387f;
            Throwable e9 = s.e(obj2);
            if (e9 != null) {
                S5.g gVar = bVar2.f26372k;
                C0558b c0558b = new C0558b(bVar2, e9, map, null);
                this.f26382a = null;
                this.f26383b = null;
                this.f26384c = 4;
                if (AbstractC3360i.g(gVar, c0558b, this) == e8) {
                    return e8;
                }
            } else {
                StripeIntent stripeIntent = (StripeIntent) obj2;
                StripeIntent.a j8 = stripeIntent.j();
                if (j8 != null && (j8 instanceof StripeIntent.a.j.C0485a) && (id = stripeIntent.getId()) != null) {
                    Map map2 = bVar2.f26367f;
                    if (A8 == null) {
                        A8 = "";
                    }
                    map2.put(id, A8);
                }
                if (!stripeIntent.t()) {
                    S5.g gVar2 = bVar2.f26372k;
                    a aVar = new a(bVar2, stripeIntent, null);
                    this.f26382a = null;
                    this.f26383b = null;
                    this.f26384c = 2;
                    if (AbstractC3360i.g(gVar2, aVar, this) == e8) {
                        return e8;
                    }
                } else {
                    AbstractC3524f a8 = bVar2.f26364c.a(stripeIntent);
                    Object obj3 = bVar2.f26366e.get();
                    AbstractC3255y.h(obj3, "get(...)");
                    this.f26382a = null;
                    this.f26383b = null;
                    this.f26384c = 3;
                    if (a8.d(interfaceC2658p, stripeIntent, (j.c) obj3, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f26395a;

        /* renamed from: b, reason: collision with root package name */
        int f26396b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26398d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2658p f26399e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f26400a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26401b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f26402c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f26403d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Throwable th, Map map, S5.d dVar) {
                super(2, dVar);
                this.f26401b = bVar;
                this.f26402c = th;
                this.f26403d = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f26401b, this.f26402c, this.f26403d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f26400a == 0) {
                    t.b(obj);
                    b.B(this.f26401b, new a.d(this.f26402c), null, this.f26403d, 2, null);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, InterfaceC2658p interfaceC2658p, S5.d dVar) {
            super(2, dVar);
            this.f26398d = str;
            this.f26399e = interfaceC2658p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f26398d, this.f26399e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map x8;
            Object d8;
            Object e8 = T5.b.e();
            int i8 = this.f26396b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f8278a;
                }
                x8 = (Map) this.f26395a;
                t.b(obj);
                d8 = ((s) obj).j();
            } else {
                t.b(obj);
                b.this.f26373l.set("key_has_started", kotlin.coroutines.jvm.internal.b.a(true));
                b.this.f26373l.set("confirm_action_requested", kotlin.coroutines.jvm.internal.b.a(false));
                x8 = b.this.x(this.f26398d);
                m mVar = b.this.f26363b;
                String str = this.f26398d;
                Object obj2 = b.this.f26366e.get();
                AbstractC3255y.h(obj2, "get(...)");
                this.f26395a = x8;
                this.f26396b = 1;
                d8 = m.a.d(mVar, str, (j.c) obj2, null, this, 4, null);
                if (d8 == e8) {
                    return e8;
                }
            }
            b bVar = b.this;
            InterfaceC2658p interfaceC2658p = this.f26399e;
            Throwable e9 = s.e(d8);
            if (e9 != null) {
                S5.g gVar = bVar.f26372k;
                a aVar = new a(bVar, e9, x8, null);
                this.f26395a = null;
                this.f26396b = 3;
                if (AbstractC3360i.g(gVar, aVar, this) == e8) {
                    return e8;
                }
            } else {
                StripeIntent stripeIntent = (StripeIntent) d8;
                AbstractC3524f a8 = bVar.f26364c.a(stripeIntent);
                Object obj3 = bVar.f26366e.get();
                AbstractC3255y.h(obj3, "get(...)");
                this.f26395a = null;
                this.f26396b = 2;
                if (a8.d(interfaceC2658p, stripeIntent, (j.c) obj3, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26404a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2980c f26406c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f26407a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26408b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC3413K f26409c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, AbstractC3413K abstractC3413K, S5.d dVar) {
                super(2, dVar);
                this.f26408b = bVar;
                this.f26409c = abstractC3413K;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f26408b, this.f26409c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f26407a == 0) {
                    t.b(obj);
                    this.f26408b.C(this.f26409c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.payments.paymentlauncher.b$f$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0559b extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f26410a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f26411b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f26412c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0559b(b bVar, Throwable th, S5.d dVar) {
                super(2, dVar);
                this.f26411b = bVar;
                this.f26412c = th;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0559b(this.f26411b, this.f26412c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f26410a == 0) {
                    t.b(obj);
                    b.B(this.f26411b, new a.d(this.f26412c), null, null, 6, null);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0559b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C2980c c2980c, S5.d dVar) {
            super(2, dVar);
            this.f26406c = c2980c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f26406c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2982e abstractC2982e;
            Object p8;
            Object e8 = T5.b.e();
            int i8 = this.f26404a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return I.f8278a;
                }
                t.b(obj);
                p8 = ((s) obj).j();
            } else {
                t.b(obj);
                if (b.this.f26362a) {
                    abstractC2982e = (AbstractC2982e) b.this.f26368g.get();
                } else {
                    abstractC2982e = (AbstractC2982e) b.this.f26369h.get();
                }
                C2980c c2980c = this.f26406c;
                this.f26404a = 1;
                p8 = abstractC2982e.p(c2980c, this);
                if (p8 == e8) {
                    return e8;
                }
            }
            b bVar = b.this;
            Throwable e9 = s.e(p8);
            if (e9 == null) {
                S5.g gVar = bVar.f26372k;
                a aVar = new a(bVar, (AbstractC3413K) p8, null);
                this.f26404a = 2;
                if (AbstractC3360i.g(gVar, aVar, this) == e8) {
                    return e8;
                }
            } else {
                S5.g gVar2 = bVar.f26372k;
                C0559b c0559b = new C0559b(bVar, e9, null);
                this.f26404a = 3;
                if (AbstractC3360i.g(gVar2, c0559b, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class g implements ActivityResultCallback, InterfaceC3249s {
        g() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(C2980c p02) {
            AbstractC3255y.i(p02, "p0");
            b.this.z(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(1, b.this, b.class, "onPaymentFlowResult", "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements DefaultLifecycleObserver {
        h() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3255y.i(owner, "owner");
            b.this.f26364c.c();
            androidx.lifecycle.c.b(this, owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.d(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.f(this, lifecycleOwner);
        }
    }

    public b(boolean z8, m stripeApiRepository, InterfaceC3526h nextActionHandlerRegistry, C2978a defaultReturnUrl, L5.a apiRequestOptionsProvider, Map threeDs1IntentReturnUrlMap, InterfaceC4149a lazyPaymentIntentFlowResultProcessor, InterfaceC4149a lazySetupIntentFlowResultProcessor, InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, S5.g uiContext, SavedStateHandle savedStateHandle, boolean z9) {
        AbstractC3255y.i(stripeApiRepository, "stripeApiRepository");
        AbstractC3255y.i(nextActionHandlerRegistry, "nextActionHandlerRegistry");
        AbstractC3255y.i(defaultReturnUrl, "defaultReturnUrl");
        AbstractC3255y.i(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        AbstractC3255y.i(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        AbstractC3255y.i(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        AbstractC3255y.i(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        this.f26362a = z8;
        this.f26363b = stripeApiRepository;
        this.f26364c = nextActionHandlerRegistry;
        this.f26365d = defaultReturnUrl;
        this.f26366e = apiRequestOptionsProvider;
        this.f26367f = threeDs1IntentReturnUrlMap;
        this.f26368g = lazyPaymentIntentFlowResultProcessor;
        this.f26369h = lazySetupIntentFlowResultProcessor;
        this.f26370i = analyticsRequestExecutor;
        this.f26371j = paymentAnalyticsRequestFactory;
        this.f26372k = uiContext;
        this.f26373l = savedStateHandle;
        this.f26374m = z9;
        this.f26375n = AbstractC3700N.a(null);
    }

    private final void A(com.stripe.android.payments.paymentlauncher.a aVar, StripeIntent stripeIntent, Map map) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        String str;
        String str2;
        Map h8;
        o r8;
        o.p pVar;
        StripeIntent.Status status;
        String d8;
        w wVar = this.f26375n;
        if (s()) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25865C;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25869E;
        }
        String str3 = null;
        if (stripeIntent != null && (d8 = stripeIntent.d()) != null) {
            str = AbstractC3994b.a(d8);
        } else {
            str = null;
        }
        r a8 = x.a("intent_id", str);
        if (stripeIntent != null && (status = stripeIntent.getStatus()) != null) {
            str2 = status.b();
        } else {
            str2 = null;
        }
        r a9 = x.a(NotificationCompat.CATEGORY_STATUS, str2);
        if (stripeIntent != null && (r8 = stripeIntent.r()) != null && (pVar = r8.f25467e) != null) {
            str3 = pVar.f25605a;
        }
        Map a10 = AbstractC4229b.a(Q.k(a8, a9, x.a("payment_method_type", str3)));
        if (aVar instanceof a.d) {
            h8 = i.f35386a.d(AbstractC4144k.f40356e.b(((a.d) aVar).b()));
        } else {
            h8 = Q.h();
        }
        this.f26370i.a(this.f26371j.g(paymentAnalyticsEvent, Q.q(Q.q(map, a10), h8)));
        wVar.setValue(aVar);
    }

    static /* synthetic */ void B(b bVar, com.stripe.android.payments.paymentlauncher.a aVar, StripeIntent stripeIntent, Map map, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            stripeIntent = null;
        }
        if ((i8 & 4) != 0) {
            map = Q.h();
        }
        bVar.A(aVar, stripeIntent, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(AbstractC3413K abstractC3413K) {
        com.stripe.android.payments.paymentlauncher.a cVar;
        int h8 = abstractC3413K.h();
        if (h8 != 1) {
            if (h8 != 2) {
                if (h8 != 3) {
                    if (h8 != 4) {
                        cVar = new a.d(new C4141h("Payment fails due to unknown error. \n" + abstractC3413K.b(), "unknownIntentOutcomeError"));
                    } else {
                        cVar = new a.d(new C4141h("Payment fails due to time out. \n" + abstractC3413K.b(), "timedOutIntentOutcomeError"));
                    }
                } else {
                    cVar = a.C0552a.f26356b;
                }
            } else {
                cVar = new a.d(new C4141h(abstractC3413K.b(), "failedIntentOutcomeError"));
            }
        } else {
            cVar = new a.c(abstractC3413K.g());
        }
        B(this, cVar, abstractC3413K.g(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(e3.InterfaceC2795i r6, java.lang.String r7, S5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.payments.paymentlauncher.b.c
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.payments.paymentlauncher.b$c r0 = (com.stripe.android.payments.paymentlauncher.b.c) r0
            int r1 = r0.f26381c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26381c = r1
            goto L18
        L13:
            com.stripe.android.payments.paymentlauncher.b$c r0 = new com.stripe.android.payments.paymentlauncher.b$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26379a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26381c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            O5.t.b(r8)
            O5.s r8 = (O5.s) r8
            java.lang.Object r6 = r8.j()
            goto L83
        L3b:
            O5.t.b(r8)
            r6.V(r7)
            e3.i r6 = r6.E(r4)
            boolean r7 = r6 instanceof com.stripe.android.model.b
            java.lang.String r8 = "get(...)"
            if (r7 == 0) goto L65
            h3.m r7 = r5.f26363b
            com.stripe.android.model.b r6 = (com.stripe.android.model.b) r6
            L5.a r2 = r5.f26366e
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.AbstractC3255y.h(r2, r8)
            A2.j$c r2 = (A2.j.c) r2
            java.util.List r8 = com.stripe.android.payments.paymentlauncher.b.f26361q
            r0.f26381c = r4
            java.lang.Object r6 = r7.v(r6, r2, r8, r0)
            if (r6 != r1) goto L83
            return r1
        L65:
            boolean r7 = r6 instanceof com.stripe.android.model.c
            if (r7 == 0) goto L84
            h3.m r7 = r5.f26363b
            com.stripe.android.model.c r6 = (com.stripe.android.model.c) r6
            L5.a r2 = r5.f26366e
            java.lang.Object r2 = r2.get()
            kotlin.jvm.internal.AbstractC3255y.h(r2, r8)
            A2.j$c r2 = (A2.j.c) r2
            java.util.List r8 = com.stripe.android.payments.paymentlauncher.b.f26361q
            r0.f26381c = r3
            java.lang.Object r6 = r7.A(r6, r2, r8, r0)
            if (r6 != r1) goto L83
            return r1
        L83:
            return r6
        L84:
            O5.p r6 = new O5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.paymentlauncher.b.q(e3.i, java.lang.String, S5.d):java.lang.Object");
    }

    private final boolean s() {
        Boolean bool = (Boolean) this.f26373l.get("confirm_action_requested");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean t() {
        Boolean bool = (Boolean) this.f26373l.get("key_has_started");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map w(InterfaceC2795i interfaceC2795i) {
        String str;
        com.stripe.android.model.p a8 = AbstractC2796j.a(interfaceC2795i);
        if (a8 != null) {
            str = a8.p();
        } else {
            str = null;
        }
        Map a9 = AbstractC4229b.a(Q.k(x.a("payment_method_type", str), x.a("intent_id", AbstractC3994b.a(interfaceC2795i.d()))));
        this.f26370i.a(this.f26371j.g(PaymentAnalyticsEvent.f25863B, a9));
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map x(String str) {
        Map e8 = Q.e(x.a("intent_id", AbstractC3994b.a(str)));
        this.f26370i.a(this.f26371j.g(PaymentAnalyticsEvent.f25867D, e8));
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (AbstractC3255y.d(str, this.f26365d.a())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25881O;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25880N;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25882P;
        }
        this.f26370i.a(PaymentAnalyticsRequestFactory.v(this.f26371j, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    public final void D(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(lifecycleOwner, "lifecycleOwner");
        this.f26364c.b(activityResultCaller, new g());
        lifecycleOwner.getLifecycle().addObserver(new h());
    }

    public final void r(InterfaceC2795i confirmStripeIntentParams, InterfaceC2658p host) {
        AbstractC3255y.i(confirmStripeIntentParams, "confirmStripeIntentParams");
        AbstractC3255y.i(host, "host");
        if (t()) {
            return;
        }
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), null, null, new d(confirmStripeIntentParams, host, null), 3, null);
    }

    public final w u() {
        return this.f26375n;
    }

    public final void v(String clientSecret, InterfaceC2658p host) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(host, "host");
        if (t()) {
            return;
        }
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), null, null, new e(clientSecret, host, null), 3, null);
    }

    public final void z(C2980c paymentFlowResult) {
        AbstractC3255y.i(paymentFlowResult, "paymentFlowResult");
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), null, null, new f(paymentFlowResult, null), 3, null);
    }
}
