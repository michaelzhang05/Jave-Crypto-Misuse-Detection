package com.stripe.android.googlepaylauncher;

import A2.F;
import A2.InterfaceC0945c;
import A2.j;
import O5.I;
import O5.t;
import P5.a0;
import a6.InterfaceC1668n;
import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.d;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.b;
import com.stripe.android.model.c;
import com.stripe.android.model.p;
import com.stripe.android.model.u;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.InterfaceC2658p;
import e3.InterfaceC2795i;
import h3.m;
import h6.InterfaceC2963c;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import m2.C3426l;
import m2.C3427m;
import m2.InterfaceC3423i;
import m2.r;
import m2.s;
import n3.i;
import o6.AbstractC3689C;
import o6.AbstractC3708h;
import o6.InterfaceC3687A;
import o6.v;
import r0.C3905m;
import u2.C4056c;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class g extends ViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static final b f24929o = new b(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f24930p = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3905m f24931a;

    /* renamed from: b, reason: collision with root package name */
    private final j.c f24932b;

    /* renamed from: c, reason: collision with root package name */
    private final GooglePayLauncherContract.a f24933c;

    /* renamed from: d, reason: collision with root package name */
    private final m f24934d;

    /* renamed from: e, reason: collision with root package name */
    private final s f24935e;

    /* renamed from: f, reason: collision with root package name */
    private final C3427m f24936f;

    /* renamed from: g, reason: collision with root package name */
    private final L2.g f24937g;

    /* renamed from: h, reason: collision with root package name */
    private final SavedStateHandle f24938h;

    /* renamed from: i, reason: collision with root package name */
    private final n3.i f24939i;

    /* renamed from: j, reason: collision with root package name */
    private final S5.g f24940j;

    /* renamed from: k, reason: collision with root package name */
    private final v f24941k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3687A f24942l;

    /* renamed from: m, reason: collision with root package name */
    private final v f24943m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3687A f24944n;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24945a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r4.f24945a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                O5.t.b(r5)
                goto L59
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                O5.t.b(r5)
                O5.s r5 = (O5.s) r5
                java.lang.Object r5 = r5.j()
                goto L3a
            L24:
                O5.t.b(r5)
                com.stripe.android.googlepaylauncher.g r5 = com.stripe.android.googlepaylauncher.g.this
                boolean r5 = com.stripe.android.googlepaylauncher.g.b(r5)
                if (r5 != 0) goto L59
                com.stripe.android.googlepaylauncher.g r5 = com.stripe.android.googlepaylauncher.g.this
                r4.f24945a = r3
                java.lang.Object r5 = com.stripe.android.googlepaylauncher.g.g(r5, r4)
                if (r5 != r0) goto L3a
                return r0
            L3a:
                com.stripe.android.googlepaylauncher.g r1 = com.stripe.android.googlepaylauncher.g.this
                java.lang.Throwable r3 = O5.s.e(r5)
                if (r3 != 0) goto L51
                com.google.android.gms.tasks.Task r5 = (com.google.android.gms.tasks.Task) r5
                o6.v r1 = com.stripe.android.googlepaylauncher.g.e(r1)
                r4.f24945a = r2
                java.lang.Object r5 = r1.emit(r5, r4)
                if (r5 != r0) goto L59
                return r0
            L51:
                com.stripe.android.googlepaylauncher.f$c r5 = new com.stripe.android.googlepaylauncher.f$c
                r5.<init>(r3)
                r1.u(r5)
            L59:
                O5.I r5 = O5.I.f8278a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayLauncherContract.a f24947a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f24948b;

        /* renamed from: c, reason: collision with root package name */
        private final S5.g f24949c;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24950a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f24950a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f24950a;
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24951a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.f24951a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f24951a;
            }
        }

        public c(GooglePayLauncherContract.a args, boolean z8, S5.g workContext) {
            AbstractC3255y.i(args, "args");
            AbstractC3255y.i(workContext, "workContext");
            this.f24947a = args;
            this.f24948b = z8;
            this.f24949c = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            Application a8 = D2.b.a(extras);
            L2.d g8 = this.f24947a.b().g();
            InterfaceC4057d a9 = InterfaceC4057d.f39950a.a(this.f24948b);
            r a10 = r.f35037c.a(a8);
            String g9 = a10.g();
            String h8 = a10.h();
            Set d8 = a0.d("GooglePayLauncher");
            C4056c c4056c = null;
            F f8 = null;
            InterfaceC0945c interfaceC0945c = null;
            InterfaceC3423i interfaceC3423i = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            com.stripe.android.networking.a aVar = new com.stripe.android.networking.a(a8, new b(g9), c4056c, a9, this.f24949c, d8, f8, interfaceC0945c, interfaceC3423i, objArr, new PaymentAnalyticsRequestFactory(a8, g9, d8), objArr2, objArr3, null, null, 31684, null);
            com.stripe.android.googlepaylauncher.b bVar = new com.stripe.android.googlepaylauncher.b(a8, this.f24947a.b().g(), com.stripe.android.googlepaylauncher.a.a(this.f24947a.b().b()), this.f24947a.b().h(), this.f24947a.b().a(), null, a9, 32, null);
            n3.i b8 = i.a.b(n3.i.f35386a, a8, null, 2, null);
            return new g(new L2.a(a8).a(g8), new j.c(g9, h8, null, 4, null), this.f24947a, aVar, new com.stripe.android.b(a8, new a(g9), aVar, this.f24948b, this.f24949c, null, null, null, null, 480, 0 == true ? 1 : 0), new C3427m(new C3426l(g9, h8), this.f24947a.b().s()), bVar, SavedStateHandleSupport.createSavedStateHandle(extras), b8, this.f24949c);
        }

        public /* synthetic */ c(GooglePayLauncherContract.a aVar, boolean z8, S5.g gVar, int i8, AbstractC3247p abstractC3247p) {
            this(aVar, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? C3347b0.b() : gVar);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24952a;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.f24914b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.f24915c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24952a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24953a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f24955c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2658p f24956d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p pVar, InterfaceC2658p interfaceC2658p, S5.d dVar) {
            super(2, dVar);
            this.f24955c = pVar;
            this.f24956d = interfaceC2658p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f24955c, this.f24956d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2795i c8;
            Object e8 = T5.b.e();
            int i8 = this.f24953a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayLauncherContract.a aVar = g.this.f24933c;
                if (aVar instanceof GooglePayLauncherContract.c) {
                    c8 = b.a.c(com.stripe.android.model.b.f25268o, this.f24955c, g.this.f24933c.a(), null, null, null, null, null, null, 252, null);
                } else if (aVar instanceof GooglePayLauncherContract.d) {
                    c8 = c.a.c(com.stripe.android.model.c.f25296h, this.f24955c, g.this.f24933c.a(), null, null, 12, null);
                } else {
                    throw new O5.p();
                }
                s sVar = g.this.f24935e;
                InterfaceC2658p interfaceC2658p = this.f24956d;
                j.c cVar = g.this.f24932b;
                this.f24953a = 1;
                if (sVar.e(interfaceC2658p, c8, cVar, this) == e8) {
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
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24957a;

        /* renamed from: b, reason: collision with root package name */
        Object f24958b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24959c;

        /* renamed from: e, reason: collision with root package name */
        int f24961e;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24959c = obj;
            this.f24961e |= Integer.MIN_VALUE;
            Object i8 = g.this.i(null, this);
            return i8 == T5.b.e() ? i8 : O5.s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0471g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24962a;

        /* renamed from: c, reason: collision with root package name */
        int f24964c;

        C0471g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24962a = obj;
            this.f24964c |= Integer.MIN_VALUE;
            return g.this.o(0, null, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24965a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f24967c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Intent f24968d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, Intent intent, S5.d dVar) {
            super(2, dVar);
            this.f24967c = i8;
            this.f24968d = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f24967c, this.f24968d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f24965a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                g gVar = g.this;
                int i9 = this.f24967c;
                Intent intent = this.f24968d;
                this.f24965a = 1;
                obj = gVar.o(i9, intent, this);
                if (obj == e8) {
                    return e8;
                }
            }
            v vVar = g.this.f24941k;
            this.f24965a = 2;
            if (vVar.emit((com.stripe.android.googlepaylauncher.f) obj, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24969a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24970b;

        /* renamed from: d, reason: collision with root package name */
        int f24972d;

        i(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24970b = obj;
            this.f24972d |= Integer.MIN_VALUE;
            Object s8 = g.this.s(this);
            return s8 == T5.b.e() ? s8 : O5.s.a(s8);
        }
    }

    public g(C3905m paymentsClient, j.c requestOptions, GooglePayLauncherContract.a args, m stripeRepository, s paymentController, C3427m googlePayJsonFactory, L2.g googlePayRepository, SavedStateHandle savedStateHandle, n3.i errorReporter, S5.g workContext) {
        AbstractC3255y.i(paymentsClient, "paymentsClient");
        AbstractC3255y.i(requestOptions, "requestOptions");
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(paymentController, "paymentController");
        AbstractC3255y.i(googlePayJsonFactory, "googlePayJsonFactory");
        AbstractC3255y.i(googlePayRepository, "googlePayRepository");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        this.f24931a = paymentsClient;
        this.f24932b = requestOptions;
        this.f24933c = args;
        this.f24934d = stripeRepository;
        this.f24935e = paymentController;
        this.f24936f = googlePayJsonFactory;
        this.f24937g = googlePayRepository;
        this.f24938h = savedStateHandle;
        this.f24939i = errorReporter;
        this.f24940j = workContext;
        v b8 = AbstractC3689C.b(1, 0, null, 6, null);
        this.f24941k = b8;
        this.f24942l = AbstractC3708h.a(b8);
        v b9 = AbstractC3689C.b(1, 0, null, 6, null);
        this.f24943m = b9;
        this.f24944n = AbstractC3708h.a(b9);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), workContext, null, new a(null), 2, null);
    }

    public static /* synthetic */ C3427m.e k(g gVar, StripeIntent stripeIntent, String str, Long l8, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            l8 = null;
        }
        if ((i8 & 8) != 0) {
            str2 = null;
        }
        return gVar.j(stripeIntent, str, l8, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        return AbstractC3255y.d(this.f24938h.get("has_launched"), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:34:0x004a, B:35:0x0061, B:37:0x0069, B:44:0x0070, B:45:0x007b), top: B:33:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:34:0x004a, B:35:0x0061, B:37:0x0069, B:44:0x0070, B:45:0x007b), top: B:33:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(S5.d r8) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.s(S5.d):java.lang.Object");
    }

    private final void t(boolean z8) {
        this.f24938h.set("has_launched", Boolean.valueOf(z8));
    }

    public final void h(InterfaceC2658p host, p params) {
        AbstractC3255y.i(host, "host");
        AbstractC3255y.i(params, "params");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24940j, null, new e(params, host, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a r23, S5.d r24) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.i(com.stripe.android.googlepaylauncher.GooglePayLauncherContract$a, S5.d):java.lang.Object");
    }

    public final C3427m.e j(StripeIntent stripeIntent, String currencyCode, Long l8, String str) {
        long j8;
        AbstractC3255y.i(stripeIntent, "stripeIntent");
        AbstractC3255y.i(currencyCode, "currencyCode");
        if (stripeIntent instanceof com.stripe.android.model.n) {
            return new C3427m.e(currencyCode, C3427m.e.c.f35010d, this.f24933c.b().i(), stripeIntent.getId(), ((com.stripe.android.model.n) stripeIntent).g(), null, C3427m.e.a.f35004c);
        }
        if (stripeIntent instanceof u) {
            C3427m.e.c cVar = C3427m.e.c.f35009c;
            String i8 = this.f24933c.b().i();
            String id = stripeIntent.getId();
            if (l8 != null) {
                j8 = l8.longValue();
            } else {
                j8 = 0;
            }
            return new C3427m.e(currencyCode, cVar, i8, id, Long.valueOf(j8), str, C3427m.e.a.f35003b);
        }
        throw new O5.p();
    }

    public final InterfaceC3687A l() {
        return this.f24944n;
    }

    public final InterfaceC3687A m() {
        return this.f24942l;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r6, android.content.Intent r7, S5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.googlepaylauncher.g.C0471g
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.googlepaylauncher.g$g r0 = (com.stripe.android.googlepaylauncher.g.C0471g) r0
            int r1 = r0.f24964c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24964c = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.g$g r0 = new com.stripe.android.googlepaylauncher.g$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24962a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24964c
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
            goto L90
        L3b:
            O5.t.b(r8)
            m2.s r8 = r5.f24935e
            boolean r8 = r8.c(r6, r7)
            if (r8 == 0) goto L51
            m2.s r6 = r5.f24935e
            r0.f24964c = r4
            java.lang.Object r6 = r6.d(r7, r0)
            if (r6 != r1) goto L90
            return r1
        L51:
            m2.s r8 = r5.f24935e
            boolean r8 = r8.a(r6, r7)
            if (r8 == 0) goto L64
            m2.s r6 = r5.f24935e
            r0.f24964c = r3
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r1) goto L90
            return r1
        L64:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unexpected confirmation result."
            r7.<init>(r8)
            n3.i r8 = r5.f24939i
            n3.i$f r0 = n3.i.f.f35423g
            w2.k$a r1 = w2.AbstractC4144k.f40356e
            w2.k r1 = r1.b(r7)
            java.lang.String r2 = "request_code"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            O5.r r6 = O5.x.a(r2, r6)
            java.util.Map r6 = P5.Q.e(r6)
            r8.a(r0, r1, r6)
            O5.s$a r6 = O5.s.f8302b
            java.lang.Object r6 = O5.t.a(r7)
            java.lang.Object r6 = O5.s.b(r6)
        L90:
            java.lang.Throwable r7 = O5.s.e(r6)
            if (r7 != 0) goto L9b
            m2.K r6 = (m2.AbstractC3413K) r6
            com.stripe.android.googlepaylauncher.f$b r6 = com.stripe.android.googlepaylauncher.f.b.f24927a
            goto La0
        L9b:
            com.stripe.android.googlepaylauncher.f$c r6 = new com.stripe.android.googlepaylauncher.f$c
            r6.<init>(r7)
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.g.o(int, android.content.Intent, S5.d):java.lang.Object");
    }

    public final Object p(S5.d dVar) {
        return AbstractC3708h.w(this.f24937g.isReady(), dVar);
    }

    public final void q() {
        t(true);
        this.f24943m.e(null);
    }

    public final void r(int i8, Intent data) {
        AbstractC3255y.i(data, "data");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24940j, null, new h(i8, data, null), 2, null);
    }

    public final void u(com.stripe.android.googlepaylauncher.f result) {
        AbstractC3255y.i(result, "result");
        this.f24941k.e(result);
    }
}
