package com.stripe.android.paymentsheet;

import O5.I;
import O5.InterfaceC1351g;
import O5.s;
import a6.InterfaceC1668n;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.a;
import com.stripe.android.paymentsheet.k;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.n;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.c;
import com.stripe.android.paymentsheet.u;
import e3.InterfaceC2795i;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.InterfaceC3249s;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.M;
import l6.X;
import m2.AbstractC3407E;
import n3.i;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import s2.AbstractC3992a;
import s3.AbstractC3995c;
import s3.InterfaceC3993a;
import t3.C4036j;
import t3.EnumC4032f;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: r, reason: collision with root package name */
    public static final c f26954r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f26955s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.f f26956a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f26957b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b f26958c;

    /* renamed from: d, reason: collision with root package name */
    private final M2.h f26959d;

    /* renamed from: e, reason: collision with root package name */
    private final M f26960e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f26961f;

    /* renamed from: g, reason: collision with root package name */
    private final n3.i f26962g;

    /* renamed from: h, reason: collision with root package name */
    private final D2.h f26963h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3993a f26964i;

    /* renamed from: j, reason: collision with root package name */
    private ActivityResultLauncher f26965j;

    /* renamed from: k, reason: collision with root package name */
    private G3.c f26966k;

    /* renamed from: l, reason: collision with root package name */
    private ActivityResultLauncher f26967l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f26968m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f26969n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f26970o;

    /* renamed from: p, reason: collision with root package name */
    private final o6.w f26971p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f26972q;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26973a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26973a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C3225a.C0782a c0782a = C3225a.f34131b;
                long s8 = AbstractC3227c.s(1, EnumC3228d.f34141e);
                this.f26973a = 1;
                if (X.c(s8, this) == e8) {
                    return e8;
                }
            }
            if (e.this.f26971p.getValue() instanceof InterfaceC0604e.b) {
                e.this.M(new n.a(t3.n.f39698c));
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f26975a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.l f26976b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b((StripeIntent) parcel.readParcelable(b.class.getClassLoader()), (com.stripe.android.paymentsheet.l) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(StripeIntent intent, com.stripe.android.paymentsheet.l confirmationOption) {
            AbstractC3255y.i(intent, "intent");
            AbstractC3255y.i(confirmationOption, "confirmationOption");
            this.f26975a = intent;
            this.f26976b = confirmationOption;
        }

        public static /* synthetic */ b b(b bVar, StripeIntent stripeIntent, com.stripe.android.paymentsheet.l lVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                stripeIntent = bVar.f26975a;
            }
            if ((i8 & 2) != 0) {
                lVar = bVar.f26976b;
            }
            return bVar.a(stripeIntent, lVar);
        }

        public final b a(StripeIntent intent, com.stripe.android.paymentsheet.l confirmationOption) {
            AbstractC3255y.i(intent, "intent");
            AbstractC3255y.i(confirmationOption, "confirmationOption");
            return new b(intent, confirmationOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f26975a, bVar.f26975a) && AbstractC3255y.d(this.f26976b, bVar.f26976b);
        }

        public final com.stripe.android.paymentsheet.l g() {
            return this.f26976b;
        }

        public final StripeIntent h() {
            return this.f26975a;
        }

        public int hashCode() {
            return (this.f26975a.hashCode() * 31) + this.f26976b.hashCode();
        }

        public String toString() {
            return "Args(intent=" + this.f26975a + ", confirmationOption=" + this.f26976b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f26975a, i8);
            out.writeParcelable(this.f26976b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.f f26977a;

        /* renamed from: b, reason: collision with root package name */
        private final L5.a f26978b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b f26979c;

        /* renamed from: d, reason: collision with root package name */
        private final com.stripe.android.payments.paymentlauncher.d f26980d;

        /* renamed from: e, reason: collision with root package name */
        private final M2.h f26981e;

        /* renamed from: f, reason: collision with root package name */
        private final SavedStateHandle f26982f;

        /* renamed from: g, reason: collision with root package name */
        private final Function0 f26983g;

        /* renamed from: h, reason: collision with root package name */
        private final n3.i f26984h;

        /* renamed from: i, reason: collision with root package name */
        private final D2.h f26985i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.e$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0603a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f26987a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0603a(d dVar) {
                    super(0);
                    this.f26987a = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return ((m2.r) this.f26987a.f26978b.get()).g();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f26988a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(d dVar) {
                    super(0);
                    this.f26988a = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return ((m2.r) this.f26988a.f26978b.get()).h();
                }
            }

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3993a invoke(ActivityResultLauncher hostActivityLauncher) {
                AbstractC3255y.i(hostActivityLauncher, "hostActivityLauncher");
                return d.this.f26980d.a(new C0603a(d.this), new b(d.this), (Integer) d.this.f26983g.invoke(), true, hostActivityLauncher);
            }
        }

        public d(com.stripe.android.paymentsheet.f intentConfirmationInterceptor, L5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, M2.h hVar, SavedStateHandle savedStateHandle, Function0 statusBarColor, n3.i errorReporter, D2.h hVar2) {
            AbstractC3255y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            AbstractC3255y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
            AbstractC3255y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            AbstractC3255y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            AbstractC3255y.i(savedStateHandle, "savedStateHandle");
            AbstractC3255y.i(statusBarColor, "statusBarColor");
            AbstractC3255y.i(errorReporter, "errorReporter");
            this.f26977a = intentConfirmationInterceptor;
            this.f26978b = paymentConfigurationProvider;
            this.f26979c = bacsMandateConfirmationLauncherFactory;
            this.f26980d = stripePaymentLauncherAssistedFactory;
            this.f26981e = hVar;
            this.f26982f = savedStateHandle;
            this.f26983g = statusBarColor;
            this.f26984h = errorReporter;
            this.f26985i = hVar2;
        }

        public final e d(M scope) {
            AbstractC3255y.i(scope, "scope");
            com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar = this.f26979c;
            M2.h hVar = this.f26981e;
            com.stripe.android.paymentsheet.f fVar = this.f26977a;
            n3.i iVar = this.f26984h;
            return new e(fVar, new a(), bVar, hVar, scope, this.f26982f, iVar, this.f26985i);
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0604e {

        /* renamed from: com.stripe.android.paymentsheet.e$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC0604e {

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.paymentsheet.n f26989a;

            public a(com.stripe.android.paymentsheet.n result) {
                AbstractC3255y.i(result, "result");
                this.f26989a = result;
            }

            public final com.stripe.android.paymentsheet.n a() {
                return this.f26989a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3255y.d(this.f26989a, ((a) obj).f26989a);
            }

            public int hashCode() {
                return this.f26989a.hashCode();
            }

            public String toString() {
                return "Complete(result=" + this.f26989a + ")";
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.e$e$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC0604e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f26990a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 296413718;
            }

            public String toString() {
                return "Confirming";
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.e$e$c */
        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC0604e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f26991a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -43337784;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.e$e$d */
        /* loaded from: classes4.dex */
        public static final class d implements InterfaceC0604e {

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.paymentsheet.l f26992a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f26993b;

            public d(com.stripe.android.paymentsheet.l lVar, boolean z8) {
                this.f26992a = lVar;
                this.f26993b = z8;
            }

            public final com.stripe.android.paymentsheet.l a() {
                return this.f26992a;
            }

            public final boolean b() {
                return this.f26993b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC3255y.d(this.f26992a, dVar.f26992a) && this.f26993b == dVar.f26993b;
            }

            public int hashCode() {
                com.stripe.android.paymentsheet.l lVar = this.f26992a;
                return ((lVar == null ? 0 : lVar.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26993b);
            }

            public String toString() {
                return "Preconfirming(confirmationOption=" + this.f26992a + ", inPreconfirmFlow=" + this.f26993b + ")";
            }
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26994a;

        static {
            int[] iArr = new int[u.k.c.values().length];
            try {
                iArr[u.k.c.f27517a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26994a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26995a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26996b;

        public g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            g gVar = new g(dVar);
            gVar.f26996b = obj;
            return gVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(Object obj, S5.d dVar) {
            return ((g) create(obj, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f26995a == 0) {
                O5.t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f26996b instanceof InterfaceC0604e.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26997a;

        /* renamed from: c, reason: collision with root package name */
        int f26999c;

        h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26997a = obj;
            this.f26999c |= Integer.MIN_VALUE;
            return e.this.s(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3252v implements Function1 {
        i(Object obj) {
            super(1, obj, e.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final void d(AbstractC3995c p02) {
            AbstractC3255y.i(p02, "p0");
            ((e) this.receiver).K(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((AbstractC3995c) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27000a;

        /* renamed from: b, reason: collision with root package name */
        Object f27001b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27002c;

        /* renamed from: e, reason: collision with root package name */
        int f27004e;

        j(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27002c = obj;
            this.f27004e |= Integer.MIN_VALUE;
            return e.this.v(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2795i f27006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC2795i interfaceC2795i) {
            super(1);
            this.f27006b = interfaceC2795i;
        }

        public final void a(InterfaceC3993a launcher) {
            AbstractC3255y.i(launcher, "launcher");
            e.this.V();
            InterfaceC2795i interfaceC2795i = this.f27006b;
            if (interfaceC2795i instanceof com.stripe.android.model.b) {
                launcher.a((com.stripe.android.model.b) interfaceC2795i);
            } else if (interfaceC2795i instanceof com.stripe.android.model.c) {
                launcher.c((com.stripe.android.model.c) interfaceC2795i);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3993a) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StripeIntent f27008b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(StripeIntent stripeIntent, String str) {
            super(1);
            this.f27008b = stripeIntent;
            this.f27009c = str;
        }

        public final void a(InterfaceC3993a launcher) {
            AbstractC3255y.i(launcher, "launcher");
            e.this.V();
            StripeIntent stripeIntent = this.f27008b;
            if (stripeIntent instanceof com.stripe.android.model.n) {
                launcher.b(this.f27009c);
            } else if (stripeIntent instanceof com.stripe.android.model.u) {
                launcher.d(this.f27009c);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3993a) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27010a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.bacs.c f27012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar, S5.d dVar) {
            super(2, dVar);
            this.f27012c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(this.f27012c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.paymentsheet.l lVar;
            l.a aVar;
            Object e8 = T5.b.e();
            int i8 = this.f27010a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                e.this.R();
                com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar = this.f27012c;
                if (cVar instanceof c.C0623c) {
                    b z8 = e.this.z();
                    if (z8 != null) {
                        lVar = z8.g();
                    } else {
                        lVar = null;
                    }
                    if (lVar instanceof l.a) {
                        aVar = (l.a) lVar;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        e eVar = e.this;
                        b b8 = b.b(z8, null, new l.d.a(aVar.D(), aVar.q(), aVar.b(), null, false), 1, null);
                        this.f27010a = 1;
                        if (eVar.t(b8, this) == e8) {
                            return e8;
                        }
                    }
                } else if (cVar instanceof c.d) {
                    e.this.M(new n.a(t3.n.f39697b));
                } else if (cVar instanceof c.a) {
                    e.this.M(new n.a(t3.n.f39698c));
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27013a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.f f27014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f27015c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(h.f fVar, e eVar, S5.d dVar) {
            super(2, dVar);
            this.f27014b = fVar;
            this.f27015c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new n(this.f27014b, this.f27015c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            B2.b a8;
            com.stripe.android.paymentsheet.l lVar;
            l.c cVar;
            Object e8 = T5.b.e();
            int i8 = this.f27013a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                h.f fVar = this.f27014b;
                if (fVar instanceof h.f.b) {
                    b z8 = this.f27015c.z();
                    if (z8 != null) {
                        lVar = z8.g();
                    } else {
                        lVar = null;
                    }
                    if (lVar instanceof l.c) {
                        cVar = (l.c) lVar;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        h.f fVar2 = this.f27014b;
                        e eVar = this.f27015c;
                        b b8 = b.b(z8, null, new l.d.b(cVar.D(), cVar.q(), ((h.f.b) fVar2).r(), null), 1, null);
                        this.f27013a = 1;
                        if (eVar.t(b8, this) == e8) {
                            return e8;
                        }
                    }
                } else if (fVar instanceof h.f.c) {
                    e eVar2 = this.f27015c;
                    Throwable a9 = ((h.f.c) this.f27014b).a();
                    if (((h.f.c) this.f27014b).b() == 3) {
                        a8 = B2.c.a(AbstractC3407E.f34869m0);
                    } else {
                        a8 = B2.c.a(AbstractC3407E.f34881s0);
                    }
                    eVar2.M(new n.b(a9, a8, new k.c(((h.f.c) this.f27014b).b())));
                } else if (fVar instanceof h.f.a) {
                    this.f27015c.M(new n.a(t3.n.f39696a));
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class o implements ActivityResultCallback, InterfaceC3249s {
        o() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.payments.paymentlauncher.a p02) {
            AbstractC3255y.i(p02, "p0");
            e.this.N(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(1, e.this, e.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class p implements ActivityResultCallback, InterfaceC3249s {
        p() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(AbstractC3995c p02) {
            AbstractC3255y.i(p02, "p0");
            e.this.K(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(1, e.this, e.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class q implements ActivityResultCallback, InterfaceC3249s {
        q() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(h.f p02) {
            AbstractC3255y.i(p02, "p0");
            e.this.L(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(1, e.this, e.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements DefaultLifecycleObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f27020b;

        r(ActivityResultLauncher activityResultLauncher) {
            this.f27020b = activityResultLauncher;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3255y.i(owner, "owner");
            e.this.f26964i = null;
            e.this.f26965j = null;
            e.this.f26966k = null;
            e.this.f26967l = null;
            this.f27020b.unregister();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class s implements ActivityResultCallback, InterfaceC3249s {
        s() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c p02) {
            AbstractC3255y.i(p02, "p0");
            e.this.J(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(1, e.this, e.class, "onBacsMandateResult", "onBacsMandateResult(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27022a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f27024c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(b bVar, S5.d dVar) {
            super(2, dVar);
            this.f27024c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new t(this.f27024c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27022a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                e eVar = e.this;
                b bVar = this.f27024c;
                this.f27022a = 1;
                if (eVar.O(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public e(com.stripe.android.paymentsheet.f intentConfirmationInterceptor, Function1 paymentLauncherFactory, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, M2.h hVar, M coroutineScope, SavedStateHandle savedStateHandle, n3.i errorReporter, D2.h hVar2) {
        boolean z8;
        Object obj;
        com.stripe.android.paymentsheet.l lVar;
        AbstractC3255y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        AbstractC3255y.i(paymentLauncherFactory, "paymentLauncherFactory");
        AbstractC3255y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f26956a = intentConfirmationInterceptor;
        this.f26957b = paymentLauncherFactory;
        this.f26958c = bacsMandateConfirmationLauncherFactory;
        this.f26959d = hVar;
        this.f26960e = coroutineScope;
        this.f26961f = savedStateHandle;
        this.f26962g = errorReporter;
        this.f26963h = hVar2;
        boolean F8 = F();
        this.f26968m = F8;
        boolean E8 = E();
        this.f26969n = E8;
        if (!F8 && !E8) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f26970o = z8;
        if (F8) {
            b z9 = z();
            if (z9 != null) {
                lVar = z9.g();
            } else {
                lVar = null;
            }
            obj = new InterfaceC0604e.d(lVar, true);
        } else if (E8) {
            obj = InterfaceC0604e.b.f26990a;
        } else {
            obj = InterfaceC0604e.c.f26991a;
        }
        o6.w a8 = AbstractC3700N.a(obj);
        this.f26971p = a8;
        this.f26972q = AbstractC3708h.b(a8);
        if (E8) {
            AbstractC3364k.d(coroutineScope, null, null, new a(null), 3, null);
        }
    }

    private final EnumC4032f A() {
        return (EnumC4032f) this.f26961f.get("DeferredIntentConfirmationType");
    }

    private final void D(String str, StripeIntent stripeIntent) {
        X(new l(stripeIntent, str));
    }

    private final boolean E() {
        Boolean bool = (Boolean) this.f26961f.get("AwaitingPaymentResult");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean F() {
        Boolean bool = (Boolean) this.f26961f.get("AwaitingPreConfirmResult");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean G(u.l lVar) {
        if (lVar instanceof u.l.b) {
            return true;
        }
        if (lVar instanceof u.l.c) {
            return false;
        }
        if (lVar instanceof u.l.a) {
            return ((u.l.a) lVar).b().a() instanceof u.m.d.a;
        }
        throw new O5.p();
    }

    private final void H(l.a aVar) {
        Object b8;
        G3.c cVar;
        G3.e a8 = G3.e.f3019e.a(aVar);
        if (a8 != null) {
            try {
                s.a aVar2 = O5.s.f8302b;
                cVar = this.f26966k;
            } catch (Throwable th) {
                s.a aVar3 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(th));
            }
            if (cVar != null) {
                b8 = O5.s.b(cVar);
                if (O5.s.h(b8)) {
                    this.f26971p.setValue(new InterfaceC0604e.d(aVar, true));
                    W();
                    ((G3.c) b8).a(a8, aVar.a());
                }
                Throwable e8 = O5.s.e(b8);
                if (e8 != null) {
                    M(new n.b(e8, B2.c.a(t3.w.f39788h0), k.d.f27089a));
                }
                O5.s.a(b8);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        M(new n.b(new IllegalArgumentException("Given payment selection could not be converted to Bacs data!"), B2.c.a(t3.w.f39788h0), k.d.f27089a));
    }

    private final void I(l.c cVar, StripeIntent stripeIntent) {
        Object b8;
        Object b9;
        String l8;
        M2.h hVar;
        ActivityResultLauncher activityResultLauncher;
        if (cVar.a().l() == null && !G(cVar.D())) {
            D2.h hVar2 = this.f26963h;
            if (hVar2 != null) {
                hVar2.a("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            }
            M(new n.b(new IllegalStateException("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent"), B2.c.a(t3.w.f39788h0), k.e.f27090a));
            return;
        }
        try {
            s.a aVar = O5.s.f8302b;
            activityResultLauncher = this.f26967l;
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        if (activityResultLauncher != null) {
            b8 = O5.s.b(activityResultLauncher);
            Throwable e8 = O5.s.e(b8);
            if (e8 == null) {
                ActivityResultLauncher activityResultLauncher2 = (ActivityResultLauncher) b8;
                try {
                    hVar = this.f26959d;
                } catch (Throwable th2) {
                    s.a aVar3 = O5.s.f8302b;
                    b9 = O5.s.b(O5.t.a(th2));
                }
                if (hVar != null) {
                    b9 = O5.s.b(hVar);
                    Throwable e9 = O5.s.e(b9);
                    if (e9 == null) {
                        l.c.a a8 = cVar.a();
                        com.stripe.android.googlepaylauncher.h x8 = x((M2.h) b9, activityResultLauncher2, a8);
                        W();
                        this.f26971p.setValue(new InterfaceC0604e.d(cVar, true));
                        com.stripe.android.model.n r8 = r(stripeIntent);
                        if ((r8 == null || (l8 = r8.M()) == null) && (l8 = a8.l()) == null) {
                            l8 = "";
                        }
                        String str = l8;
                        long j8 = 0;
                        if (stripeIntent instanceof com.stripe.android.model.n) {
                            Long g8 = ((com.stripe.android.model.n) stripeIntent).g();
                            if (g8 != null) {
                                j8 = g8.longValue();
                            }
                        } else if (stripeIntent instanceof com.stripe.android.model.u) {
                            Long b10 = a8.b();
                            if (b10 != null) {
                                j8 = b10.longValue();
                            }
                        } else {
                            throw new O5.p();
                        }
                        x8.e(str, j8, stripeIntent.getId(), a8.g());
                        return;
                    }
                    M(new n.b(e9, B2.c.a(t3.w.f39788h0), k.d.f27089a));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            M(new n.b(e8, B2.c.a(t3.w.f39788h0), k.d.f27089a));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar) {
        AbstractC3364k.d(this.f26960e, null, null, new m(cVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(AbstractC3995c abstractC3995c) {
        n.b bVar;
        com.stripe.android.paymentsheet.n nVar;
        b z8 = z();
        if (z8 != null) {
            if (abstractC3995c instanceof AbstractC3995c.C0877c) {
                nVar = new n.c(z8.h(), null);
            } else if (abstractC3995c instanceof AbstractC3995c.d) {
                AbstractC3995c.d dVar = (AbstractC3995c.d) abstractC3995c;
                bVar = new n.b(dVar.a(), AbstractC3992a.a(dVar.a()), k.a.f27086a);
            } else if (abstractC3995c instanceof AbstractC3995c.a) {
                nVar = new n.a(t3.n.f39698c);
            } else {
                throw new O5.p();
            }
            M(nVar);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Arguments should have been initialized before handling EPM result!");
        bVar = new n.b(illegalStateException, AbstractC3992a.a(illegalStateException), k.a.f27086a);
        nVar = bVar;
        M(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(h.f fVar) {
        AbstractC3364k.d(this.f26960e, null, null, new n(fVar, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(com.stripe.android.paymentsheet.n nVar) {
        T(null);
        S(null);
        this.f26971p.setValue(new InterfaceC0604e.a(nVar));
        Q();
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(com.stripe.android.payments.paymentlauncher.a aVar) {
        com.stripe.android.paymentsheet.n aVar2;
        if (aVar instanceof a.c) {
            aVar2 = new n.c(((a.c) aVar).b(), A());
        } else if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            aVar2 = new n.b(dVar.b(), AbstractC3992a.a(dVar.b()), k.f.f27091a);
        } else if (aVar instanceof a.C0552a) {
            aVar2 = new n.a(t3.n.f39696a);
        } else {
            throw new O5.p();
        }
        M(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(b bVar, S5.d dVar) {
        com.stripe.android.paymentsheet.l g8 = bVar.g();
        if (g8 instanceof l.c) {
            I((l.c) g8, bVar.h());
        } else if (g8 instanceof l.a) {
            H((l.a) g8);
        } else {
            Object t8 = t(bVar, dVar);
            if (t8 == T5.b.e()) {
                return t8;
            }
            return I.f8278a;
        }
        return I.f8278a;
    }

    private final void Q() {
        this.f26961f.remove("AwaitingPaymentResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        this.f26961f.remove("AwaitingPreConfirmResult");
    }

    private final void S(b bVar) {
        this.f26961f.set("IntentConfirmationArguments", bVar);
    }

    private final void T(EnumC4032f enumC4032f) {
        this.f26961f.set("DeferredIntentConfirmationType", enumC4032f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        this.f26961f.set("AwaitingPaymentResult", Boolean.TRUE);
    }

    private final void W() {
        this.f26961f.set("AwaitingPreConfirmResult", Boolean.TRUE);
    }

    private final void X(Function1 function1) {
        I i8;
        InterfaceC3993a interfaceC3993a = this.f26964i;
        if (interfaceC3993a != null) {
            function1.invoke(interfaceC3993a);
            i8 = I.f8278a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            M(new n.b(new IllegalArgumentException("No 'PaymentLauncher' instance was created before starting confirmation. Did you call register?"), B2.c.f(t3.w.f39788h0, new Object[0], null, 4, null), k.b.f27087a));
        }
    }

    private final com.stripe.android.model.n r(StripeIntent stripeIntent) {
        if (stripeIntent instanceof com.stripe.android.model.n) {
            return (com.stripe.android.model.n) stripeIntent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(b bVar, S5.d dVar) {
        this.f26971p.setValue(InterfaceC0604e.b.f26990a);
        com.stripe.android.paymentsheet.l g8 = bVar.g();
        if (g8 instanceof l.b) {
            u((l.b) g8);
        } else {
            if (g8 instanceof l.d) {
                Object v8 = v((l.d) g8, bVar.h(), dVar);
                if (v8 == T5.b.e()) {
                    return v8;
                }
                return I.f8278a;
            }
            i.b.a(this.f26962g, i.f.f35434r, AbstractC4144k.f40356e.b(new IllegalStateException("Attempting to confirm intent for invalid confirmation option: " + g8)), null, 4, null);
            M(new n.b(new IllegalStateException("Attempted to confirm invalid " + U.b(g8.getClass()).a() + " confirmation type"), B2.c.a(t3.w.f39788h0), k.d.f27089a));
        }
        return I.f8278a;
    }

    private final void u(l.b bVar) {
        V();
        C4036j.f39660a.b(bVar.getType(), bVar.a(), new i(this), this.f26965j, this.f26962g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.stripe.android.paymentsheet.l.d r5, com.stripe.android.model.StripeIntent r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.e.j
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.e$j r0 = (com.stripe.android.paymentsheet.e.j) r0
            int r1 = r0.f27004e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27004e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.e$j r0 = new com.stripe.android.paymentsheet.e$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27002c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27004e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f27001b
            r6 = r5
            com.stripe.android.model.StripeIntent r6 = (com.stripe.android.model.StripeIntent) r6
            java.lang.Object r5 = r0.f27000a
            com.stripe.android.paymentsheet.e r5 = (com.stripe.android.paymentsheet.e) r5
            O5.t.b(r7)
            goto L4d
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            O5.t.b(r7)
            com.stripe.android.paymentsheet.f r7 = r4.f26956a
            r0.f27000a = r4
            r0.f27001b = r6
            r0.f27004e = r3
            java.lang.Object r7 = com.stripe.android.paymentsheet.g.a(r7, r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            com.stripe.android.paymentsheet.f$b r7 = (com.stripe.android.paymentsheet.f.b) r7
            t3.f r0 = r7.a()
            r5.T(r0)
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.d
            if (r0 == 0) goto L64
            com.stripe.android.paymentsheet.f$b$d r7 = (com.stripe.android.paymentsheet.f.b.d) r7
            java.lang.String r7 = r7.b()
            r5.D(r7, r6)
            goto L9d
        L64:
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.C0605b
            if (r0 == 0) goto L72
            com.stripe.android.paymentsheet.f$b$b r7 = (com.stripe.android.paymentsheet.f.b.C0605b) r7
            e3.i r6 = r7.b()
            r5.w(r6)
            goto L9d
        L72:
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.c
            if (r0 == 0) goto L8b
            com.stripe.android.paymentsheet.n$b r6 = new com.stripe.android.paymentsheet.n$b
            com.stripe.android.paymentsheet.f$b$c r7 = (com.stripe.android.paymentsheet.f.b.c) r7
            java.lang.Throwable r0 = r7.b()
            B2.b r7 = r7.c()
            com.stripe.android.paymentsheet.k$f r1 = com.stripe.android.paymentsheet.k.f.f27091a
            r6.<init>(r0, r7, r1)
            r5.M(r6)
            goto L9d
        L8b:
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.a
            if (r0 == 0) goto L9d
            com.stripe.android.paymentsheet.n$c r0 = new com.stripe.android.paymentsheet.n$c
            com.stripe.android.paymentsheet.f$b$a r7 = (com.stripe.android.paymentsheet.f.b.a) r7
            t3.f r7 = r7.a()
            r0.<init>(r6, r7)
            r5.M(r0)
        L9d:
            O5.I r5 = O5.I.f8278a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.e.v(com.stripe.android.paymentsheet.l$d, com.stripe.android.model.StripeIntent, S5.d):java.lang.Object");
    }

    private final void w(InterfaceC2795i interfaceC2795i) {
        X(new k(interfaceC2795i));
    }

    private final com.stripe.android.googlepaylauncher.h x(M2.h hVar, ActivityResultLauncher activityResultLauncher, l.c.a aVar) {
        int i8;
        L2.d dVar;
        M m8 = this.f26960e;
        u.k.c h8 = aVar.h();
        if (h8 == null) {
            i8 = -1;
        } else {
            i8 = f.f26994a[h8.ordinal()];
        }
        if (i8 == 1) {
            dVar = L2.d.f5905b;
        } else {
            dVar = L2.d.f5906c;
        }
        return hVar.a(m8, new h.d(dVar, aVar.i(), aVar.p(), aVar.a().h(), aVar.a().v(), false, false, 96, null), new h.e() { // from class: t3.l
            @Override // com.stripe.android.googlepaylauncher.h.e
            public final void a(boolean z8) {
                com.stripe.android.paymentsheet.e.y(z8);
            }
        }, activityResultLauncher, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(boolean z8) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b z() {
        return (b) this.f26961f.get("IntentConfirmationArguments");
    }

    public final boolean B() {
        return this.f26970o;
    }

    public final InterfaceC3698L C() {
        return this.f26972q;
    }

    public final void P(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(lifecycleOwner, "lifecycleOwner");
        Function1 function1 = this.f26957b;
        ActivityResultLauncher registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new o());
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f26964i = (InterfaceC3993a) function1.invoke(registerForActivityResult);
        this.f26965j = activityResultCaller.registerForActivityResult(new ExternalPaymentMethodContract(this.f26962g), new p());
        ActivityResultLauncher registerForActivityResult2 = activityResultCaller.registerForActivityResult(new BacsMandateConfirmationContract(), new s());
        AbstractC3255y.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.f26966k = this.f26958c.a(registerForActivityResult2);
        this.f26967l = activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new q());
        lifecycleOwner.getLifecycle().addObserver(new r(registerForActivityResult2));
    }

    public final void U(b arguments) {
        AbstractC3255y.i(arguments, "arguments");
        InterfaceC0604e interfaceC0604e = (InterfaceC0604e) this.f26971p.getValue();
        if (!(interfaceC0604e instanceof InterfaceC0604e.d) && !(interfaceC0604e instanceof InterfaceC0604e.b)) {
            this.f26971p.setValue(new InterfaceC0604e.d(arguments.g(), false));
            S(arguments);
            AbstractC3364k.d(this.f26960e, null, null, new t(arguments, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(S5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.e.h
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.paymentsheet.e$h r0 = (com.stripe.android.paymentsheet.e.h) r0
            int r1 = r0.f26999c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26999c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.e$h r0 = new com.stripe.android.paymentsheet.e$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26997a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26999c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r6)
            goto L67
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            O5.t.b(r6)
            o6.w r6 = r5.f26971p
            java.lang.Object r6 = r6.getValue()
            com.stripe.android.paymentsheet.e$e r6 = (com.stripe.android.paymentsheet.e.InterfaceC0604e) r6
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0604e.c
            r4 = 0
            if (r2 == 0) goto L42
            goto L6f
        L42:
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0604e.a
            if (r2 == 0) goto L4d
            com.stripe.android.paymentsheet.e$e$a r6 = (com.stripe.android.paymentsheet.e.InterfaceC0604e.a) r6
            com.stripe.android.paymentsheet.n r4 = r6.a()
            goto L6f
        L4d:
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0604e.d
            if (r2 == 0) goto L53
            r6 = 1
            goto L55
        L53:
            boolean r6 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0604e.b
        L55:
            if (r6 == 0) goto L78
            o6.w r6 = r5.f26971p
            com.stripe.android.paymentsheet.e$g r2 = new com.stripe.android.paymentsheet.e$g
            r2.<init>(r4)
            r0.f26999c = r3
            java.lang.Object r6 = o6.AbstractC3708h.x(r6, r2, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            if (r6 == 0) goto L70
            com.stripe.android.paymentsheet.e$e$a r6 = (com.stripe.android.paymentsheet.e.InterfaceC0604e.a) r6
            com.stripe.android.paymentsheet.n r4 = r6.a()
        L6f:
            return r4
        L70:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.stripe.android.paymentsheet.IntentConfirmationHandler.State.Complete"
            r6.<init>(r0)
            throw r6
        L78:
            O5.p r6 = new O5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.e.s(S5.d):java.lang.Object");
    }
}
