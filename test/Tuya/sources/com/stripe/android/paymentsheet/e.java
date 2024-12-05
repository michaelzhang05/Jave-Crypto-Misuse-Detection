package com.stripe.android.paymentsheet;

import L5.I;
import L5.InterfaceC1223g;
import L5.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import b3.InterfaceC1874i;
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
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import i6.AbstractC2829k;
import i6.M;
import i6.X;
import j2.AbstractC3053E;
import k3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.InterfaceC3153s;
import kotlin.jvm.internal.U;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import p2.AbstractC3598a;
import p3.AbstractC3601c;
import p3.InterfaceC3599a;
import q3.C3657j;
import q3.EnumC3653f;
import t2.AbstractC3790k;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: r, reason: collision with root package name */
    public static final c f25899r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f25900s = 8;

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.f f25901a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f25902b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b f25903c;

    /* renamed from: d, reason: collision with root package name */
    private final J2.h f25904d;

    /* renamed from: e, reason: collision with root package name */
    private final M f25905e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f25906f;

    /* renamed from: g, reason: collision with root package name */
    private final k3.i f25907g;

    /* renamed from: h, reason: collision with root package name */
    private final A2.h f25908h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3599a f25909i;

    /* renamed from: j, reason: collision with root package name */
    private ActivityResultLauncher f25910j;

    /* renamed from: k, reason: collision with root package name */
    private D3.d f25911k;

    /* renamed from: l, reason: collision with root package name */
    private ActivityResultLauncher f25912l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f25913m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f25914n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f25915o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f25916p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f25917q;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25918a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25918a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C2758a.C0756a c0756a = C2758a.f31409b;
                long s8 = AbstractC2760c.s(1, EnumC2761d.f31419e);
                this.f25918a = 1;
                if (X.c(s8, this) == e8) {
                    return e8;
                }
            }
            if (e.this.f25916p.getValue() instanceof InterfaceC0608e.b) {
                e.this.M(new n.a(q3.n.f37376c));
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f25920a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.l f25921b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b((StripeIntent) parcel.readParcelable(b.class.getClassLoader()), (com.stripe.android.paymentsheet.l) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(StripeIntent intent, com.stripe.android.paymentsheet.l confirmationOption) {
            AbstractC3159y.i(intent, "intent");
            AbstractC3159y.i(confirmationOption, "confirmationOption");
            this.f25920a = intent;
            this.f25921b = confirmationOption;
        }

        public static /* synthetic */ b c(b bVar, StripeIntent stripeIntent, com.stripe.android.paymentsheet.l lVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                stripeIntent = bVar.f25920a;
            }
            if ((i8 & 2) != 0) {
                lVar = bVar.f25921b;
            }
            return bVar.b(stripeIntent, lVar);
        }

        public final b b(StripeIntent intent, com.stripe.android.paymentsheet.l confirmationOption) {
            AbstractC3159y.i(intent, "intent");
            AbstractC3159y.i(confirmationOption, "confirmationOption");
            return new b(intent, confirmationOption);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final com.stripe.android.paymentsheet.l e() {
            return this.f25921b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f25920a, bVar.f25920a) && AbstractC3159y.d(this.f25921b, bVar.f25921b);
        }

        public final StripeIntent f() {
            return this.f25920a;
        }

        public int hashCode() {
            return (this.f25920a.hashCode() * 31) + this.f25921b.hashCode();
        }

        public String toString() {
            return "Args(intent=" + this.f25920a + ", confirmationOption=" + this.f25921b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25920a, i8);
            out.writeParcelable(this.f25921b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.f f25922a;

        /* renamed from: b, reason: collision with root package name */
        private final I5.a f25923b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b f25924c;

        /* renamed from: d, reason: collision with root package name */
        private final com.stripe.android.payments.paymentlauncher.d f25925d;

        /* renamed from: e, reason: collision with root package name */
        private final J2.h f25926e;

        /* renamed from: f, reason: collision with root package name */
        private final SavedStateHandle f25927f;

        /* renamed from: g, reason: collision with root package name */
        private final Function0 f25928g;

        /* renamed from: h, reason: collision with root package name */
        private final k3.i f25929h;

        /* renamed from: i, reason: collision with root package name */
        private final A2.h f25930i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.e$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0607a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f25932a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0607a(d dVar) {
                    super(0);
                    this.f25932a = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return ((j2.r) this.f25932a.f25923b.get()).e();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f25933a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(d dVar) {
                    super(0);
                    this.f25933a = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return ((j2.r) this.f25933a.f25923b.get()).f();
                }
            }

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3599a invoke(ActivityResultLauncher hostActivityLauncher) {
                AbstractC3159y.i(hostActivityLauncher, "hostActivityLauncher");
                return d.this.f25925d.a(new C0607a(d.this), new b(d.this), (Integer) d.this.f25928g.invoke(), true, hostActivityLauncher);
            }
        }

        public d(com.stripe.android.paymentsheet.f intentConfirmationInterceptor, I5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, J2.h hVar, SavedStateHandle savedStateHandle, Function0 statusBarColor, k3.i errorReporter, A2.h hVar2) {
            AbstractC3159y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            AbstractC3159y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
            AbstractC3159y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            AbstractC3159y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            AbstractC3159y.i(savedStateHandle, "savedStateHandle");
            AbstractC3159y.i(statusBarColor, "statusBarColor");
            AbstractC3159y.i(errorReporter, "errorReporter");
            this.f25922a = intentConfirmationInterceptor;
            this.f25923b = paymentConfigurationProvider;
            this.f25924c = bacsMandateConfirmationLauncherFactory;
            this.f25925d = stripePaymentLauncherAssistedFactory;
            this.f25926e = hVar;
            this.f25927f = savedStateHandle;
            this.f25928g = statusBarColor;
            this.f25929h = errorReporter;
            this.f25930i = hVar2;
        }

        public final e d(M scope) {
            AbstractC3159y.i(scope, "scope");
            com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar = this.f25924c;
            J2.h hVar = this.f25926e;
            com.stripe.android.paymentsheet.f fVar = this.f25922a;
            k3.i iVar = this.f25929h;
            return new e(fVar, new a(), bVar, hVar, scope, this.f25927f, iVar, this.f25930i);
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0608e {

        /* renamed from: com.stripe.android.paymentsheet.e$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC0608e {

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.paymentsheet.n f25934a;

            public a(com.stripe.android.paymentsheet.n result) {
                AbstractC3159y.i(result, "result");
                this.f25934a = result;
            }

            public final com.stripe.android.paymentsheet.n a() {
                return this.f25934a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3159y.d(this.f25934a, ((a) obj).f25934a);
            }

            public int hashCode() {
                return this.f25934a.hashCode();
            }

            public String toString() {
                return "Complete(result=" + this.f25934a + ")";
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.e$e$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC0608e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f25935a = new b();

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
        public static final class c implements InterfaceC0608e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f25936a = new c();

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
        public static final class d implements InterfaceC0608e {

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.paymentsheet.l f25937a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25938b;

            public d(com.stripe.android.paymentsheet.l lVar, boolean z8) {
                this.f25937a = lVar;
                this.f25938b = z8;
            }

            public final com.stripe.android.paymentsheet.l a() {
                return this.f25937a;
            }

            public final boolean b() {
                return this.f25938b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC3159y.d(this.f25937a, dVar.f25937a) && this.f25938b == dVar.f25938b;
            }

            public int hashCode() {
                com.stripe.android.paymentsheet.l lVar = this.f25937a;
                return ((lVar == null ? 0 : lVar.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25938b);
            }

            public String toString() {
                return "Preconfirming(confirmationOption=" + this.f25937a + ", inPreconfirmFlow=" + this.f25938b + ")";
            }
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25939a;

        static {
            int[] iArr = new int[u.k.c.values().length];
            try {
                iArr[u.k.c.f26462a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25939a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25940a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25941b;

        public g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            g gVar = new g(dVar);
            gVar.f25941b = obj;
            return gVar;
        }

        @Override // X5.n
        public final Object invoke(Object obj, P5.d dVar) {
            return ((g) create(obj, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f25940a == 0) {
                L5.t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f25941b instanceof InterfaceC0608e.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25942a;

        /* renamed from: c, reason: collision with root package name */
        int f25944c;

        h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25942a = obj;
            this.f25944c |= Integer.MIN_VALUE;
            return e.this.s(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3156v implements Function1 {
        i(Object obj) {
            super(1, obj, e.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final void d(AbstractC3601c p02) {
            AbstractC3159y.i(p02, "p0");
            ((e) this.receiver).K(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((AbstractC3601c) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25945a;

        /* renamed from: b, reason: collision with root package name */
        Object f25946b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25947c;

        /* renamed from: e, reason: collision with root package name */
        int f25949e;

        j(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25947c = obj;
            this.f25949e |= Integer.MIN_VALUE;
            return e.this.v(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1874i f25951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC1874i interfaceC1874i) {
            super(1);
            this.f25951b = interfaceC1874i;
        }

        public final void a(InterfaceC3599a launcher) {
            AbstractC3159y.i(launcher, "launcher");
            e.this.V();
            InterfaceC1874i interfaceC1874i = this.f25951b;
            if (interfaceC1874i instanceof com.stripe.android.model.b) {
                launcher.a((com.stripe.android.model.b) interfaceC1874i);
            } else if (interfaceC1874i instanceof com.stripe.android.model.c) {
                launcher.c((com.stripe.android.model.c) interfaceC1874i);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3599a) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StripeIntent f25953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25954c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(StripeIntent stripeIntent, String str) {
            super(1);
            this.f25953b = stripeIntent;
            this.f25954c = str;
        }

        public final void a(InterfaceC3599a launcher) {
            AbstractC3159y.i(launcher, "launcher");
            e.this.V();
            StripeIntent stripeIntent = this.f25953b;
            if (stripeIntent instanceof com.stripe.android.model.n) {
                launcher.b(this.f25954c);
            } else if (stripeIntent instanceof com.stripe.android.model.u) {
                launcher.d(this.f25954c);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3599a) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25955a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.bacs.c f25957c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar, P5.d dVar) {
            super(2, dVar);
            this.f25957c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(this.f25957c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.paymentsheet.l lVar;
            l.a aVar;
            Object e8 = Q5.b.e();
            int i8 = this.f25955a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                e.this.R();
                com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar = this.f25957c;
                if (cVar instanceof c.C0627c) {
                    b z8 = e.this.z();
                    if (z8 != null) {
                        lVar = z8.e();
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
                        b c8 = b.c(z8, null, new l.d.a(aVar.B(), aVar.t(), aVar.c(), null, false), 1, null);
                        this.f25955a = 1;
                        if (eVar.t(c8, this) == e8) {
                            return e8;
                        }
                    }
                } else if (cVar instanceof c.d) {
                    e.this.M(new n.a(q3.n.f37375b));
                } else if (cVar instanceof c.a) {
                    e.this.M(new n.a(q3.n.f37376c));
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.f f25959b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f25960c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(h.f fVar, e eVar, P5.d dVar) {
            super(2, dVar);
            this.f25959b = fVar;
            this.f25960c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new n(this.f25959b, this.f25960c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3983b a8;
            com.stripe.android.paymentsheet.l lVar;
            l.c cVar;
            Object e8 = Q5.b.e();
            int i8 = this.f25958a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                h.f fVar = this.f25959b;
                if (fVar instanceof h.f.b) {
                    b z8 = this.f25960c.z();
                    if (z8 != null) {
                        lVar = z8.e();
                    } else {
                        lVar = null;
                    }
                    if (lVar instanceof l.c) {
                        cVar = (l.c) lVar;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        h.f fVar2 = this.f25959b;
                        e eVar = this.f25960c;
                        b c8 = b.c(z8, null, new l.d.b(cVar.B(), cVar.t(), ((h.f.b) fVar2).v(), null), 1, null);
                        this.f25958a = 1;
                        if (eVar.t(c8, this) == e8) {
                            return e8;
                        }
                    }
                } else if (fVar instanceof h.f.c) {
                    e eVar2 = this.f25960c;
                    Throwable b8 = ((h.f.c) this.f25959b).b();
                    if (((h.f.c) this.f25959b).c() == 3) {
                        a8 = AbstractC3984c.a(AbstractC3053E.f32893m0);
                    } else {
                        a8 = AbstractC3984c.a(AbstractC3053E.f32905s0);
                    }
                    eVar2.M(new n.b(b8, a8, new k.c(((h.f.c) this.f25959b).c())));
                } else if (fVar instanceof h.f.a) {
                    this.f25960c.M(new n.a(q3.n.f37374a));
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class o implements ActivityResultCallback, InterfaceC3153s {
        o() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.payments.paymentlauncher.a p02) {
            AbstractC3159y.i(p02, "p0");
            e.this.N(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(1, e.this, e.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class p implements ActivityResultCallback, InterfaceC3153s {
        p() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(AbstractC3601c p02) {
            AbstractC3159y.i(p02, "p0");
            e.this.K(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(1, e.this, e.class, "onExternalPaymentMethodResult", "onExternalPaymentMethodResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class q implements ActivityResultCallback, InterfaceC3153s {
        q() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(h.f p02) {
            AbstractC3159y.i(p02, "p0");
            e.this.L(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(1, e.this, e.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements DefaultLifecycleObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f25965b;

        r(ActivityResultLauncher activityResultLauncher) {
            this.f25965b = activityResultLauncher;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3159y.i(owner, "owner");
            e.this.f25909i = null;
            e.this.f25910j = null;
            e.this.f25911k = null;
            e.this.f25912l = null;
            this.f25965b.unregister();
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
    public /* synthetic */ class s implements ActivityResultCallback, InterfaceC3153s {
        s() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c p02) {
            AbstractC3159y.i(p02, "p0");
            e.this.J(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(1, e.this, e.class, "onBacsMandateResult", "onBacsMandateResult(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25967a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f25969c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(b bVar, P5.d dVar) {
            super(2, dVar);
            this.f25969c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new t(this.f25969c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25967a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                e eVar = e.this;
                b bVar = this.f25969c;
                this.f25967a = 1;
                if (eVar.O(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public e(com.stripe.android.paymentsheet.f intentConfirmationInterceptor, Function1 paymentLauncherFactory, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, J2.h hVar, M coroutineScope, SavedStateHandle savedStateHandle, k3.i errorReporter, A2.h hVar2) {
        boolean z8;
        Object obj;
        com.stripe.android.paymentsheet.l lVar;
        AbstractC3159y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        AbstractC3159y.i(paymentLauncherFactory, "paymentLauncherFactory");
        AbstractC3159y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f25901a = intentConfirmationInterceptor;
        this.f25902b = paymentLauncherFactory;
        this.f25903c = bacsMandateConfirmationLauncherFactory;
        this.f25904d = hVar;
        this.f25905e = coroutineScope;
        this.f25906f = savedStateHandle;
        this.f25907g = errorReporter;
        this.f25908h = hVar2;
        boolean F8 = F();
        this.f25913m = F8;
        boolean E8 = E();
        this.f25914n = E8;
        if (!F8 && !E8) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f25915o = z8;
        if (F8) {
            b z9 = z();
            if (z9 != null) {
                lVar = z9.e();
            } else {
                lVar = null;
            }
            obj = new InterfaceC0608e.d(lVar, true);
        } else if (E8) {
            obj = InterfaceC0608e.b.f25935a;
        } else {
            obj = InterfaceC0608e.c.f25936a;
        }
        l6.v a8 = AbstractC3351M.a(obj);
        this.f25916p = a8;
        this.f25917q = AbstractC3360h.b(a8);
        if (E8) {
            AbstractC2829k.d(coroutineScope, null, null, new a(null), 3, null);
        }
    }

    private final EnumC3653f A() {
        return (EnumC3653f) this.f25906f.get("DeferredIntentConfirmationType");
    }

    private final void D(String str, StripeIntent stripeIntent) {
        X(new l(stripeIntent, str));
    }

    private final boolean E() {
        Boolean bool = (Boolean) this.f25906f.get("AwaitingPaymentResult");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean F() {
        Boolean bool = (Boolean) this.f25906f.get("AwaitingPreConfirmResult");
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
            return ((u.l.a) lVar).c().b() instanceof u.m.d.a;
        }
        throw new L5.p();
    }

    private final void H(l.a aVar) {
        Object b8;
        D3.d dVar;
        D3.f a8 = D3.f.f1477e.a(aVar);
        if (a8 != null) {
            try {
                s.a aVar2 = L5.s.f6511b;
                dVar = this.f25911k;
            } catch (Throwable th) {
                s.a aVar3 = L5.s.f6511b;
                b8 = L5.s.b(L5.t.a(th));
            }
            if (dVar != null) {
                b8 = L5.s.b(dVar);
                if (L5.s.h(b8)) {
                    this.f25916p.setValue(new InterfaceC0608e.d(aVar, true));
                    W();
                    ((D3.d) b8).a(a8, aVar.b());
                }
                Throwable e8 = L5.s.e(b8);
                if (e8 != null) {
                    M(new n.b(e8, AbstractC3984c.a(q3.w.f37466h0), k.d.f26034a));
                }
                L5.s.a(b8);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        M(new n.b(new IllegalArgumentException("Given payment selection could not be converted to Bacs data!"), AbstractC3984c.a(q3.w.f37466h0), k.d.f26034a));
    }

    private final void I(l.c cVar, StripeIntent stripeIntent) {
        Object b8;
        Object b9;
        String j8;
        J2.h hVar;
        ActivityResultLauncher activityResultLauncher;
        if (cVar.b().j() == null && !G(cVar.B())) {
            A2.h hVar2 = this.f25908h;
            if (hVar2 != null) {
                hVar2.a("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            }
            M(new n.b(new IllegalStateException("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent"), AbstractC3984c.a(q3.w.f37466h0), k.e.f26035a));
            return;
        }
        try {
            s.a aVar = L5.s.f6511b;
            activityResultLauncher = this.f25912l;
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        if (activityResultLauncher != null) {
            b8 = L5.s.b(activityResultLauncher);
            Throwable e8 = L5.s.e(b8);
            if (e8 == null) {
                ActivityResultLauncher activityResultLauncher2 = (ActivityResultLauncher) b8;
                try {
                    hVar = this.f25904d;
                } catch (Throwable th2) {
                    s.a aVar3 = L5.s.f6511b;
                    b9 = L5.s.b(L5.t.a(th2));
                }
                if (hVar != null) {
                    b9 = L5.s.b(hVar);
                    Throwable e9 = L5.s.e(b9);
                    if (e9 == null) {
                        l.c.a b10 = cVar.b();
                        com.stripe.android.googlepaylauncher.h x8 = x((J2.h) b9, activityResultLauncher2, b10);
                        W();
                        this.f25916p.setValue(new InterfaceC0608e.d(cVar, true));
                        com.stripe.android.model.n r8 = r(stripeIntent);
                        if ((r8 == null || (j8 = r8.K()) == null) && (j8 = b10.j()) == null) {
                            j8 = "";
                        }
                        String str = j8;
                        long j9 = 0;
                        if (stripeIntent instanceof com.stripe.android.model.n) {
                            Long e10 = ((com.stripe.android.model.n) stripeIntent).e();
                            if (e10 != null) {
                                j9 = e10.longValue();
                            }
                        } else if (stripeIntent instanceof com.stripe.android.model.u) {
                            Long c8 = b10.c();
                            if (c8 != null) {
                                j9 = c8.longValue();
                            }
                        } else {
                            throw new L5.p();
                        }
                        x8.e(str, j9, stripeIntent.getId(), b10.e());
                        return;
                    }
                    M(new n.b(e9, AbstractC3984c.a(q3.w.f37466h0), k.d.f26034a));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            M(new n.b(e8, AbstractC3984c.a(q3.w.f37466h0), k.d.f26034a));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.paymentsheet.paymentdatacollection.bacs.c cVar) {
        AbstractC2829k.d(this.f25905e, null, null, new m(cVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(AbstractC3601c abstractC3601c) {
        n.b bVar;
        com.stripe.android.paymentsheet.n nVar;
        b z8 = z();
        if (z8 != null) {
            if (abstractC3601c instanceof AbstractC3601c.C0846c) {
                nVar = new n.c(z8.f(), null);
            } else if (abstractC3601c instanceof AbstractC3601c.d) {
                AbstractC3601c.d dVar = (AbstractC3601c.d) abstractC3601c;
                bVar = new n.b(dVar.b(), AbstractC3598a.a(dVar.b()), k.a.f26031a);
            } else if (abstractC3601c instanceof AbstractC3601c.a) {
                nVar = new n.a(q3.n.f37376c);
            } else {
                throw new L5.p();
            }
            M(nVar);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Arguments should have been initialized before handling EPM result!");
        bVar = new n.b(illegalStateException, AbstractC3598a.a(illegalStateException), k.a.f26031a);
        nVar = bVar;
        M(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(h.f fVar) {
        AbstractC2829k.d(this.f25905e, null, null, new n(fVar, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(com.stripe.android.paymentsheet.n nVar) {
        T(null);
        S(null);
        this.f25916p.setValue(new InterfaceC0608e.a(nVar));
        Q();
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(com.stripe.android.payments.paymentlauncher.a aVar) {
        com.stripe.android.paymentsheet.n aVar2;
        if (aVar instanceof a.c) {
            aVar2 = new n.c(((a.c) aVar).c(), A());
        } else if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            aVar2 = new n.b(dVar.c(), AbstractC3598a.a(dVar.c()), k.f.f26036a);
        } else if (aVar instanceof a.C0556a) {
            aVar2 = new n.a(q3.n.f37374a);
        } else {
            throw new L5.p();
        }
        M(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(b bVar, P5.d dVar) {
        com.stripe.android.paymentsheet.l e8 = bVar.e();
        if (e8 instanceof l.c) {
            I((l.c) e8, bVar.f());
        } else if (e8 instanceof l.a) {
            H((l.a) e8);
        } else {
            Object t8 = t(bVar, dVar);
            if (t8 == Q5.b.e()) {
                return t8;
            }
            return I.f6487a;
        }
        return I.f6487a;
    }

    private final void Q() {
        this.f25906f.remove("AwaitingPaymentResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        this.f25906f.remove("AwaitingPreConfirmResult");
    }

    private final void S(b bVar) {
        this.f25906f.set("IntentConfirmationArguments", bVar);
    }

    private final void T(EnumC3653f enumC3653f) {
        this.f25906f.set("DeferredIntentConfirmationType", enumC3653f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        this.f25906f.set("AwaitingPaymentResult", Boolean.TRUE);
    }

    private final void W() {
        this.f25906f.set("AwaitingPreConfirmResult", Boolean.TRUE);
    }

    private final void X(Function1 function1) {
        I i8;
        InterfaceC3599a interfaceC3599a = this.f25909i;
        if (interfaceC3599a != null) {
            function1.invoke(interfaceC3599a);
            i8 = I.f6487a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            M(new n.b(new IllegalArgumentException("No 'PaymentLauncher' instance was created before starting confirmation. Did you call register?"), AbstractC3984c.f(q3.w.f37466h0, new Object[0], null, 4, null), k.b.f26032a));
        }
    }

    private final com.stripe.android.model.n r(StripeIntent stripeIntent) {
        if (stripeIntent instanceof com.stripe.android.model.n) {
            return (com.stripe.android.model.n) stripeIntent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(b bVar, P5.d dVar) {
        this.f25916p.setValue(InterfaceC0608e.b.f25935a);
        com.stripe.android.paymentsheet.l e8 = bVar.e();
        if (e8 instanceof l.b) {
            u((l.b) e8);
        } else {
            if (e8 instanceof l.d) {
                Object v8 = v((l.d) e8, bVar.f(), dVar);
                if (v8 == Q5.b.e()) {
                    return v8;
                }
                return I.f6487a;
            }
            i.b.a(this.f25907g, i.f.f33442r, AbstractC3790k.f38229e.b(new IllegalStateException("Attempting to confirm intent for invalid confirmation option: " + e8)), null, 4, null);
            M(new n.b(new IllegalStateException("Attempted to confirm invalid " + U.b(e8.getClass()).a() + " confirmation type"), AbstractC3984c.a(q3.w.f37466h0), k.d.f26034a));
        }
        return I.f6487a;
    }

    private final void u(l.b bVar) {
        V();
        C3657j.f37338a.b(bVar.getType(), bVar.b(), new i(this), this.f25910j, this.f25907g);
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
    public final java.lang.Object v(com.stripe.android.paymentsheet.l.d r5, com.stripe.android.model.StripeIntent r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.e.j
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.e$j r0 = (com.stripe.android.paymentsheet.e.j) r0
            int r1 = r0.f25949e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25949e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.e$j r0 = new com.stripe.android.paymentsheet.e$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25947c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25949e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f25946b
            r6 = r5
            com.stripe.android.model.StripeIntent r6 = (com.stripe.android.model.StripeIntent) r6
            java.lang.Object r5 = r0.f25945a
            com.stripe.android.paymentsheet.e r5 = (com.stripe.android.paymentsheet.e) r5
            L5.t.b(r7)
            goto L4d
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            L5.t.b(r7)
            com.stripe.android.paymentsheet.f r7 = r4.f25901a
            r0.f25945a = r4
            r0.f25946b = r6
            r0.f25949e = r3
            java.lang.Object r7 = com.stripe.android.paymentsheet.g.a(r7, r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            com.stripe.android.paymentsheet.f$b r7 = (com.stripe.android.paymentsheet.f.b) r7
            q3.f r0 = r7.a()
            r5.T(r0)
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.d
            if (r0 == 0) goto L64
            com.stripe.android.paymentsheet.f$b$d r7 = (com.stripe.android.paymentsheet.f.b.d) r7
            java.lang.String r7 = r7.b()
            r5.D(r7, r6)
            goto L9d
        L64:
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.C0609b
            if (r0 == 0) goto L72
            com.stripe.android.paymentsheet.f$b$b r7 = (com.stripe.android.paymentsheet.f.b.C0609b) r7
            b3.i r6 = r7.b()
            r5.w(r6)
            goto L9d
        L72:
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.c
            if (r0 == 0) goto L8b
            com.stripe.android.paymentsheet.n$b r6 = new com.stripe.android.paymentsheet.n$b
            com.stripe.android.paymentsheet.f$b$c r7 = (com.stripe.android.paymentsheet.f.b.c) r7
            java.lang.Throwable r0 = r7.b()
            y2.b r7 = r7.c()
            com.stripe.android.paymentsheet.k$f r1 = com.stripe.android.paymentsheet.k.f.f26036a
            r6.<init>(r0, r7, r1)
            r5.M(r6)
            goto L9d
        L8b:
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.f.b.a
            if (r0 == 0) goto L9d
            com.stripe.android.paymentsheet.n$c r0 = new com.stripe.android.paymentsheet.n$c
            com.stripe.android.paymentsheet.f$b$a r7 = (com.stripe.android.paymentsheet.f.b.a) r7
            q3.f r7 = r7.a()
            r0.<init>(r6, r7)
            r5.M(r0)
        L9d:
            L5.I r5 = L5.I.f6487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.e.v(com.stripe.android.paymentsheet.l$d, com.stripe.android.model.StripeIntent, P5.d):java.lang.Object");
    }

    private final void w(InterfaceC1874i interfaceC1874i) {
        X(new k(interfaceC1874i));
    }

    private final com.stripe.android.googlepaylauncher.h x(J2.h hVar, ActivityResultLauncher activityResultLauncher, l.c.a aVar) {
        int i8;
        I2.d dVar;
        M m8 = this.f25905e;
        u.k.c f8 = aVar.f();
        if (f8 == null) {
            i8 = -1;
        } else {
            i8 = f.f25939a[f8.ordinal()];
        }
        if (i8 == 1) {
            dVar = I2.d.f3910b;
        } else {
            dVar = I2.d.f3911c;
        }
        return hVar.a(m8, new h.d(dVar, aVar.i(), aVar.k(), aVar.b().f(), aVar.b().s(), false, false, 96, null), new h.e() { // from class: q3.l
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
        return (b) this.f25906f.get("IntentConfirmationArguments");
    }

    public final boolean B() {
        return this.f25915o;
    }

    public final InterfaceC3349K C() {
        return this.f25917q;
    }

    public final void P(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(lifecycleOwner, "lifecycleOwner");
        Function1 function1 = this.f25902b;
        ActivityResultLauncher registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new o());
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f25909i = (InterfaceC3599a) function1.invoke(registerForActivityResult);
        this.f25910j = activityResultCaller.registerForActivityResult(new ExternalPaymentMethodContract(this.f25907g), new p());
        ActivityResultLauncher registerForActivityResult2 = activityResultCaller.registerForActivityResult(new BacsMandateConfirmationContract(), new s());
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.f25911k = this.f25903c.a(registerForActivityResult2);
        this.f25912l = activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new q());
        lifecycleOwner.getLifecycle().addObserver(new r(registerForActivityResult2));
    }

    public final void U(b arguments) {
        AbstractC3159y.i(arguments, "arguments");
        InterfaceC0608e interfaceC0608e = (InterfaceC0608e) this.f25916p.getValue();
        if (!(interfaceC0608e instanceof InterfaceC0608e.d) && !(interfaceC0608e instanceof InterfaceC0608e.b)) {
            this.f25916p.setValue(new InterfaceC0608e.d(arguments.e(), false));
            S(arguments);
            AbstractC2829k.d(this.f25905e, null, null, new t(arguments, null), 3, null);
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
    public final java.lang.Object s(P5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.e.h
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.paymentsheet.e$h r0 = (com.stripe.android.paymentsheet.e.h) r0
            int r1 = r0.f25944c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25944c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.e$h r0 = new com.stripe.android.paymentsheet.e$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25942a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25944c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r6)
            goto L67
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            L5.t.b(r6)
            l6.v r6 = r5.f25916p
            java.lang.Object r6 = r6.getValue()
            com.stripe.android.paymentsheet.e$e r6 = (com.stripe.android.paymentsheet.e.InterfaceC0608e) r6
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0608e.c
            r4 = 0
            if (r2 == 0) goto L42
            goto L6f
        L42:
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0608e.a
            if (r2 == 0) goto L4d
            com.stripe.android.paymentsheet.e$e$a r6 = (com.stripe.android.paymentsheet.e.InterfaceC0608e.a) r6
            com.stripe.android.paymentsheet.n r4 = r6.a()
            goto L6f
        L4d:
            boolean r2 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0608e.d
            if (r2 == 0) goto L53
            r6 = 1
            goto L55
        L53:
            boolean r6 = r6 instanceof com.stripe.android.paymentsheet.e.InterfaceC0608e.b
        L55:
            if (r6 == 0) goto L78
            l6.v r6 = r5.f25916p
            com.stripe.android.paymentsheet.e$g r2 = new com.stripe.android.paymentsheet.e$g
            r2.<init>(r4)
            r0.f25944c = r3
            java.lang.Object r6 = l6.AbstractC3360h.v(r6, r2, r0)
            if (r6 != r1) goto L67
            return r1
        L67:
            if (r6 == 0) goto L70
            com.stripe.android.paymentsheet.e$e$a r6 = (com.stripe.android.paymentsheet.e.InterfaceC0608e.a) r6
            com.stripe.android.paymentsheet.n r4 = r6.a()
        L6f:
            return r4
        L70:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.stripe.android.paymentsheet.IntentConfirmationHandler.State.Complete"
            r6.<init>(r0)
            throw r6
        L78:
            L5.p r6 = new L5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.e.s(P5.d):java.lang.Object");
    }
}
