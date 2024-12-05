package com.stripe.android.stripe3ds2.views;

import O5.I;
import O5.InterfaceC1351g;
import O5.InterfaceC1355k;
import O5.r;
import O5.x;
import P5.Q;
import W3.q;
import a4.v;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import b4.C1975a;
import b4.b;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.d;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.views.b;
import d4.C2739c;
import d4.C2746j;
import d4.C2747k;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.InterfaceC3249s;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public final class c extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public static final a f28108s = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final W3.m f28109a;

    /* renamed from: b, reason: collision with root package name */
    private final v f28110b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f28111c;

    /* renamed from: d, reason: collision with root package name */
    private final X3.c f28112d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f28113e;

    /* renamed from: f, reason: collision with root package name */
    private final b4.g f28114f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f28115g;

    /* renamed from: h, reason: collision with root package name */
    private final S5.g f28116h;

    /* renamed from: i, reason: collision with root package name */
    private b4.b f28117i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1355k f28118j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1355k f28119k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1355k f28120l;

    /* renamed from: m, reason: collision with root package name */
    private T3.c f28121m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1355k f28122n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1355k f28123o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1355k f28124p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC1355k f28125q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC1355k f28126r;

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
        public static final /* synthetic */ int[] f28127a;

        static {
            int[] iArr = new int[b4.g.values().length];
            try {
                iArr[b4.g.f15459d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b4.g.f15460e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b4.g.f15461f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b4.g.f15463h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b4.g.f15462g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f28127a = iArr;
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.views.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0679c extends AbstractC3256z implements Function0 {
        C0679c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrandZoneView invoke() {
            BrandZoneView caBrandZone = c.this.H().f10020b;
            AbstractC3255y.h(caBrandZone, "caBrandZone");
            return caBrandZone;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2739c invoke() {
            FragmentActivity requireActivity = c.this.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity(...)");
            return new C2739c(requireActivity);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2746j invoke() {
            b4.b bVar = c.this.f28117i;
            b4.b bVar2 = null;
            if (bVar == null) {
                AbstractC3255y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() != b4.g.f15460e) {
                b4.b bVar3 = c.this.f28117i;
                if (bVar3 == null) {
                    AbstractC3255y.y("cresData");
                    bVar3 = null;
                }
                if (bVar3.b0() != b4.g.f15461f) {
                    return null;
                }
            }
            C2739c A8 = c.this.A();
            b4.b bVar4 = c.this.f28117i;
            if (bVar4 == null) {
                AbstractC3255y.y("cresData");
            } else {
                bVar2 = bVar4;
            }
            return A8.a(bVar2, c.this.f28109a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2747k invoke() {
            b4.b bVar = c.this.f28117i;
            b4.b bVar2 = null;
            if (bVar == null) {
                AbstractC3255y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() == b4.g.f15459d) {
                C2739c A8 = c.this.A();
                b4.b bVar3 = c.this.f28117i;
                if (bVar3 == null) {
                    AbstractC3255y.y("cresData");
                } else {
                    bVar2 = bVar3;
                }
                return A8.b(bVar2, c.this.f28109a);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallengeZoneView invoke() {
            ChallengeZoneView caChallengeZone = c.this.H().f10021c;
            AbstractC3255y.h(caChallengeZone, "caChallengeZone");
            return caChallengeZone;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.e invoke() {
            b4.b bVar = c.this.f28117i;
            b4.b bVar2 = null;
            if (bVar == null) {
                AbstractC3255y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() == b4.g.f15463h) {
                C2739c A8 = c.this.A();
                b4.b bVar3 = c.this.f28117i;
                if (bVar3 == null) {
                    AbstractC3255y.y("cresData");
                } else {
                    bVar2 = bVar3;
                }
                return A8.c(bVar2);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f8278a;
        }

        public final void invoke(String str) {
            C2747k C8 = c.this.C();
            if (C8 != null) {
                AbstractC3255y.f(str);
                C8.setText(str);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements Function1 {
        j() {
            super(1);
        }

        public final void a(I i8) {
            c.this.O();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3256z implements Function1 {
        k() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.d dVar) {
            if (dVar != null) {
                c.this.J(dVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.d) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l implements Observer, InterfaceC3249s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f28137a;

        l(Function1 function) {
            AbstractC3255y.i(function, "function");
            this.f28137a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return this.f28137a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28137a.invoke(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28138a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f28138a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.f28138a.requireActivity().getViewModelStore();
            AbstractC3255y.h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f28140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, Fragment fragment) {
            super(0);
            this.f28139a = function0;
            this.f28140b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28139a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.f28140b.requireActivity().getDefaultViewModelCreationExtras();
            AbstractC3255y.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3256z implements Function0 {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            b4.b bVar = c.this.f28117i;
            if (bVar == null) {
                AbstractC3255y.y("cresData");
                bVar = null;
            }
            b4.g b02 = bVar.b0();
            String b8 = b02 != null ? b02.b() : null;
            return b8 == null ? "" : b8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f28142a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ImageView imageView) {
            super(1);
            this.f28142a = imageView;
        }

        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f28142a.setVisibility(0);
                this.f28142a.setImageBitmap(bitmap);
            } else {
                this.f28142a.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Bitmap) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class q extends AbstractC3256z implements Function0 {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new b.C0678b(c.this.f28113e, c.this.f28110b, c.this.f28112d, c.this.f28116h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(W3.m uiCustomization, v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, X3.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, b4.g gVar, com.stripe.android.stripe3ds2.transaction.n intentData, S5.g workContext) {
        super(S3.e.f9799c);
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        AbstractC3255y.i(transactionTimer, "transactionTimer");
        AbstractC3255y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3255y.i(intentData, "intentData");
        AbstractC3255y.i(workContext, "workContext");
        this.f28109a = uiCustomization;
        this.f28110b = transactionTimer;
        this.f28111c = errorRequestExecutor;
        this.f28112d = errorReporter;
        this.f28113e = challengeActionHandler;
        this.f28114f = gVar;
        this.f28115g = intentData;
        this.f28116h = workContext;
        this.f28118j = O5.l.b(new o());
        this.f28119k = FragmentViewModelLazyKt.createViewModelLazy(this, U.b(com.stripe.android.stripe3ds2.views.b.class), new m(this), new n(null, this), new q());
        this.f28120l = O5.l.b(new d());
        this.f28122n = O5.l.b(new g());
        this.f28123o = O5.l.b(new C0679c());
        this.f28124p = O5.l.b(new f());
        this.f28125q = O5.l.b(new e());
        this.f28126r = O5.l.b(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2739c A() {
        return (C2739c) this.f28120l.getValue();
    }

    private final ChallengeZoneView D() {
        return (ChallengeZoneView) this.f28122n.getValue();
    }

    private final String F() {
        return (String) this.f28118j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.stripe3ds2.transaction.d dVar) {
        if (dVar instanceof d.C0675d) {
            d.C0675d c0675d = (d.C0675d) dVar;
            M(c0675d.a(), c0675d.b());
        } else if (dVar instanceof d.b) {
            K(((d.b) dVar).a());
        } else if (dVar instanceof d.c) {
            L(((d.c) dVar).a());
        } else if (dVar instanceof d.e) {
            N(((d.e) dVar).a());
        }
    }

    private final void K(b4.d dVar) {
        I().n(new h.d(dVar, this.f28114f, this.f28115g));
        I().t();
        this.f28111c.a(dVar);
    }

    private final void L(Throwable th) {
        I().n(new h.e(th, this.f28114f, this.f28115g));
    }

    private final void M(C1975a c1975a, b4.b bVar) {
        com.stripe.android.stripe3ds2.transaction.h cVar;
        if (bVar.f0()) {
            I().t();
            if (c1975a.h() != null) {
                cVar = new h.a(F(), this.f28114f, this.f28115g);
            } else {
                String a02 = bVar.a0();
                if (a02 == null) {
                    a02 = "";
                }
                if (AbstractC3255y.d("Y", a02)) {
                    cVar = new h.f(F(), this.f28114f, this.f28115g);
                } else {
                    cVar = new h.c(F(), this.f28114f, this.f28115g);
                }
            }
            I().n(cVar);
            return;
        }
        I().p(bVar);
    }

    private final void N(b4.d dVar) {
        I().t();
        this.f28111c.a(dVar);
        I().n(new h.g(F(), this.f28114f, this.f28115g));
    }

    private final void P() {
        BrandZoneView caBrandZone = H().f10020b;
        AbstractC3255y.h(caBrandZone, "caBrandZone");
        ImageView issuerImageView$3ds2sdk_release = caBrandZone.getIssuerImageView$3ds2sdk_release();
        b4.b bVar = this.f28117i;
        b4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3255y.y("cresData");
            bVar = null;
        }
        r a8 = x.a(issuerImageView$3ds2sdk_release, bVar.y());
        ImageView paymentSystemImageView$3ds2sdk_release = caBrandZone.getPaymentSystemImageView$3ds2sdk_release();
        b4.b bVar3 = this.f28117i;
        if (bVar3 == null) {
            AbstractC3255y.y("cresData");
        } else {
            bVar2 = bVar3;
        }
        for (Map.Entry entry : Q.k(a8, x.a(paymentSystemImageView$3ds2sdk_release, bVar2.J())).entrySet()) {
            I().g((b.d) entry.getValue(), getResources().getDisplayMetrics().densityDpi).observe(getViewLifecycleOwner(), new l(new p((ImageView) entry.getKey())));
        }
    }

    private final void s(C2747k c2747k, C2746j c2746j, com.stripe.android.stripe3ds2.views.e eVar) {
        b4.b bVar = null;
        if (c2747k != null) {
            D().setChallengeEntryView(c2747k);
            ChallengeZoneView D8 = D();
            b4.b bVar2 = this.f28117i;
            if (bVar2 == null) {
                AbstractC3255y.y("cresData");
                bVar2 = null;
            }
            D8.d(bVar2.Z(), this.f28109a.g(q.a.SUBMIT));
            ChallengeZoneView D9 = D();
            b4.b bVar3 = this.f28117i;
            if (bVar3 == null) {
                AbstractC3255y.y("cresData");
            } else {
                bVar = bVar3;
            }
            D9.c(bVar.U(), this.f28109a.g(q.a.RESEND));
        } else if (c2746j != null) {
            D().setChallengeEntryView(c2746j);
            ChallengeZoneView D10 = D();
            b4.b bVar4 = this.f28117i;
            if (bVar4 == null) {
                AbstractC3255y.y("cresData");
                bVar4 = null;
            }
            D10.d(bVar4.Z(), this.f28109a.g(q.a.NEXT));
            ChallengeZoneView D11 = D();
            b4.b bVar5 = this.f28117i;
            if (bVar5 == null) {
                AbstractC3255y.y("cresData");
            } else {
                bVar = bVar5;
            }
            D11.c(bVar.U(), this.f28109a.g(q.a.RESEND));
        } else if (eVar != null) {
            D().setChallengeEntryView(eVar);
            D().a(null, null);
            D().b(null, null);
            D().d(null, null);
            eVar.setOnClickListener(new View.OnClickListener() { // from class: d4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.stripe.android.stripe3ds2.views.c.t(com.stripe.android.stripe3ds2.views.c.this, view);
                }
            });
            y().setVisibility(8);
        } else {
            b4.b bVar6 = this.f28117i;
            if (bVar6 == null) {
                AbstractC3255y.y("cresData");
                bVar6 = null;
            }
            if (bVar6.b0() == b4.g.f15462g) {
                ChallengeZoneView D12 = D();
                b4.b bVar7 = this.f28117i;
                if (bVar7 == null) {
                    AbstractC3255y.y("cresData");
                } else {
                    bVar = bVar7;
                }
                D12.d(bVar.H(), this.f28109a.g(q.a.CONTINUE));
            }
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(c this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.I().r(this$0.z());
    }

    private final void u() {
        int i8;
        ChallengeZoneView D8 = D();
        b4.b bVar = this.f28117i;
        b4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3255y.y("cresData");
            bVar = null;
        }
        D8.a(bVar.p(), this.f28109a.a());
        ChallengeZoneView D9 = D();
        b4.b bVar3 = this.f28117i;
        if (bVar3 == null) {
            AbstractC3255y.y("cresData");
            bVar3 = null;
        }
        D9.b(bVar3.u(), this.f28109a.a());
        ChallengeZoneView D10 = D();
        b4.b bVar4 = this.f28117i;
        if (bVar4 == null) {
            AbstractC3255y.y("cresData");
            bVar4 = null;
        }
        if (bVar4.Y()) {
            i8 = S3.c.f9762d;
        } else {
            i8 = 0;
        }
        D10.setInfoTextIndicator(i8);
        ChallengeZoneView D11 = D();
        b4.b bVar5 = this.f28117i;
        if (bVar5 == null) {
            AbstractC3255y.y("cresData");
        } else {
            bVar2 = bVar5;
        }
        D11.e(bVar2.c0(), this.f28109a.a(), this.f28109a.g(q.a.SELECT));
        D().setSubmitButtonClickListener(new View.OnClickListener() { // from class: d4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.stripe.android.stripe3ds2.views.c.v(com.stripe.android.stripe3ds2.views.c.this, view);
            }
        });
        D().setResendButtonClickListener(new View.OnClickListener() { // from class: d4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.stripe.android.stripe3ds2.views.c.w(com.stripe.android.stripe3ds2.views.c.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(c this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.I().r(this$0.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(c this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.I().u(a.e.f27857a);
    }

    private final void x() {
        InformationZoneView caInformationZone = H().f10022d;
        AbstractC3255y.h(caInformationZone, "caInformationZone");
        b4.b bVar = this.f28117i;
        b4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3255y.y("cresData");
            bVar = null;
        }
        String d02 = bVar.d0();
        b4.b bVar3 = this.f28117i;
        if (bVar3 == null) {
            AbstractC3255y.y("cresData");
            bVar3 = null;
        }
        caInformationZone.g(d02, bVar3.e0(), this.f28109a.a());
        b4.b bVar4 = this.f28117i;
        if (bVar4 == null) {
            AbstractC3255y.y("cresData");
            bVar4 = null;
        }
        String w8 = bVar4.w();
        b4.b bVar5 = this.f28117i;
        if (bVar5 == null) {
            AbstractC3255y.y("cresData");
        } else {
            bVar2 = bVar5;
        }
        caInformationZone.f(w8, bVar2.x(), this.f28109a.a());
        String h8 = this.f28109a.h();
        if (h8 != null) {
            caInformationZone.setToggleColor$3ds2sdk_release(Color.parseColor(h8));
        }
    }

    private final BrandZoneView y() {
        return (BrandZoneView) this.f28123o.getValue();
    }

    private final com.stripe.android.stripe3ds2.transaction.a z() {
        int i8;
        b4.b bVar = this.f28117i;
        if (bVar == null) {
            AbstractC3255y.y("cresData");
            bVar = null;
        }
        b4.g b02 = bVar.b0();
        if (b02 == null) {
            i8 = -1;
        } else {
            i8 = b.f28127a[b02.ordinal()];
        }
        if (i8 != 4) {
            if (i8 != 5) {
                return new a.c(G());
            }
            return a.d.f27856a;
        }
        return new a.b(G());
    }

    public final C2746j B() {
        return (C2746j) this.f28125q.getValue();
    }

    public final C2747k C() {
        return (C2747k) this.f28124p.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.e E() {
        return (com.stripe.android.stripe3ds2.views.e) this.f28126r.getValue();
    }

    public final String G() {
        int i8;
        b4.b bVar = this.f28117i;
        String str = null;
        if (bVar == null) {
            AbstractC3255y.y("cresData");
            bVar = null;
        }
        b4.g b02 = bVar.b0();
        if (b02 == null) {
            i8 = -1;
        } else {
            i8 = b.f28127a[b02.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                if (i8 != 4) {
                    str = "";
                } else {
                    com.stripe.android.stripe3ds2.views.e E8 = E();
                    if (E8 != null) {
                        str = E8.getUserEntry();
                    }
                }
            } else {
                C2746j B8 = B();
                if (B8 != null) {
                    str = B8.getUserEntry();
                }
            }
        } else {
            C2747k C8 = C();
            if (C8 != null) {
                str = C8.getUserEntry();
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final T3.c H() {
        T3.c cVar = this.f28121m;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final com.stripe.android.stripe3ds2.views.b I() {
        return (com.stripe.android.stripe3ds2.views.b) this.f28119k.getValue();
    }

    public final void O() {
        b4.b bVar = this.f28117i;
        b4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3255y.y("cresData");
            bVar = null;
        }
        if (bVar.b0() == b4.g.f15463h) {
            b4.b bVar3 = this.f28117i;
            if (bVar3 == null) {
                AbstractC3255y.y("cresData");
                bVar3 = null;
            }
            String h8 = bVar3.h();
            if (h8 != null && !j6.n.u(h8)) {
                com.stripe.android.stripe3ds2.views.e E8 = E();
                if (E8 != null) {
                    b4.b bVar4 = this.f28117i;
                    if (bVar4 == null) {
                        AbstractC3255y.y("cresData");
                    } else {
                        bVar2 = bVar4;
                    }
                    E8.c(bVar2.h());
                    return;
                }
                return;
            }
        }
        b4.b bVar5 = this.f28117i;
        if (bVar5 == null) {
            AbstractC3255y.y("cresData");
            bVar5 = null;
        }
        if (bVar5.b0() == b4.g.f15462g) {
            b4.b bVar6 = this.f28117i;
            if (bVar6 == null) {
                AbstractC3255y.y("cresData");
                bVar6 = null;
            }
            String l8 = bVar6.l();
            if (l8 != null && !j6.n.u(l8)) {
                ChallengeZoneView D8 = D();
                b4.b bVar7 = this.f28117i;
                if (bVar7 == null) {
                    AbstractC3255y.y("cresData");
                } else {
                    bVar2 = bVar7;
                }
                D8.b(bVar2.l(), this.f28109a.a());
                D().setInfoTextIndicator(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28121m = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        b4.b bVar;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            bVar = (b4.b) BundleCompat.getParcelable(arguments, "arg_cres", b4.b.class);
        } else {
            bVar = null;
        }
        if (bVar == null) {
            L(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.f28117i = bVar;
        this.f28121m = T3.c.a(view);
        I().f().observe(getViewLifecycleOwner(), new l(new i()));
        I().i().observe(getViewLifecycleOwner(), new l(new j()));
        I().e().observe(getViewLifecycleOwner(), new l(new k()));
        P();
        s(C(), B(), E());
        x();
    }
}
