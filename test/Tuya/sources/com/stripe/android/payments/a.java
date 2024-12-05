package com.stripe.android.payments;

import L5.p;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import e6.InterfaceC2643c;
import f3.C2662c;
import j2.AbstractC3053E;
import j2.r;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import s2.C3744b;
import s2.EnumC3743a;
import t2.C3787h;
import x2.InterfaceC3873c;
import x2.m;

/* loaded from: classes4.dex */
public final class a extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final C0535a f25051g = new C0535a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25052h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3873c f25053a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f25054b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3743a f25055c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25056d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25057e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f25058f;

    /* renamed from: com.stripe.android.payments.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0535a {
        private C0535a() {
        }

        public /* synthetic */ C0535a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            Application a8 = A2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            r a9 = r.f33061c.a(a8);
            C3744b c3744b = new C3744b(a8);
            m mVar = new m();
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(a8, a9.e(), null, 4, null);
            EnumC3743a a10 = c3744b.a();
            String string = a8.getString(AbstractC3053E.f32855N0);
            AbstractC3159y.h(string, "getString(...)");
            String string2 = a8.getString(AbstractC3053E.f32895n0);
            AbstractC3159y.h(string2, "getString(...)");
            return new a(mVar, paymentAnalyticsRequestFactory, a10, string, string2, createSavedStateHandle);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25059a;

        static {
            int[] iArr = new int[EnumC3743a.values().length];
            try {
                iArr[EnumC3743a.f37842a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3743a.f37843b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25059a = iArr;
        }
    }

    public a(InterfaceC3873c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, EnumC3743a browserCapabilities, String intentChooserTitle, String resolveErrorMessage, SavedStateHandle savedStateHandle) {
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(browserCapabilities, "browserCapabilities");
        AbstractC3159y.i(intentChooserTitle, "intentChooserTitle");
        AbstractC3159y.i(resolveErrorMessage, "resolveErrorMessage");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        this.f25053a = analyticsRequestExecutor;
        this.f25054b = paymentAnalyticsRequestFactory;
        this.f25055c = browserCapabilities;
        this.f25056d = intentChooserTitle;
        this.f25057e = resolveErrorMessage;
        this.f25058f = savedStateHandle;
    }

    private final CustomTabsIntent a(PaymentBrowserAuthContract.a aVar, Uri uri) {
        CustomTabColorSchemeParams customTabColorSchemeParams;
        Integer s8 = aVar.s();
        if (s8 != null) {
            customTabColorSchemeParams = new CustomTabColorSchemeParams.Builder().setToolbarColor(s8.intValue()).build();
        } else {
            customTabColorSchemeParams = null;
        }
        CustomTabsIntent.Builder shareState = new CustomTabsIntent.Builder().setShareState(2);
        if (customTabColorSchemeParams != null) {
            shareState.setDefaultColorSchemeParams(customTabColorSchemeParams);
        }
        CustomTabsIntent build = shareState.build();
        AbstractC3159y.h(build, "build(...)");
        build.intent.setData(uri);
        return build;
    }

    private final void f() {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        int i8 = c.f25059a[this.f25055c.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                paymentAnalyticsEvent = PaymentAnalyticsEvent.f24824M;
            } else {
                throw new p();
            }
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f24823L;
        }
        this.f25053a.a(PaymentAnalyticsRequestFactory.v(this.f25054b, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    public final Intent b(PaymentBrowserAuthContract.a args) {
        Intent intent;
        AbstractC3159y.i(args, "args");
        Uri parse = Uri.parse(args.G());
        f();
        int i8 = c.f25059a[this.f25055c.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                intent = new Intent("android.intent.action.VIEW", parse);
            } else {
                throw new p();
            }
        } else {
            AbstractC3159y.f(parse);
            intent = a(args, parse).intent;
        }
        AbstractC3159y.f(intent);
        Intent createChooser = Intent.createChooser(intent, this.f25056d);
        AbstractC3159y.h(createChooser, "createChooser(...)");
        return createChooser;
    }

    public final Intent c(PaymentBrowserAuthContract.a args) {
        AbstractC3159y.i(args, "args");
        Uri parse = Uri.parse(args.G());
        C3787h c3787h = new C3787h(this.f25057e, "failedBrowserLaunchError");
        Intent intent = new Intent();
        String d8 = args.d();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String u8 = args.u();
        Intent putExtras = intent.putExtras(new C2662c(d8, 2, c3787h, args.o(), lastPathSegment, null, u8, 32, null).o());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final boolean d() {
        Boolean bool = (Boolean) this.f25058f.get("has_launched");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Intent e(PaymentBrowserAuthContract.a args) {
        AbstractC3159y.i(args, "args");
        Uri parse = Uri.parse(args.G());
        Intent intent = new Intent();
        String d8 = args.d();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String u8 = args.u();
        Intent putExtras = intent.putExtras(new C2662c(d8, 0, null, args.o(), lastPathSegment, null, u8, 38, null).o());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final void g(boolean z8) {
        this.f25058f.set("has_launched", Boolean.valueOf(z8));
    }
}
