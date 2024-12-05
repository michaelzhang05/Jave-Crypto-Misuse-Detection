package com.stripe.android.payments;

import A2.InterfaceC0945c;
import A2.m;
import O5.p;
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
import h6.InterfaceC2963c;
import i3.C2980c;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import m2.r;
import v2.C4097b;
import v2.EnumC4096a;
import w2.C4141h;

/* loaded from: classes4.dex */
public final class a extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final C0531a f26106g = new C0531a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f26107h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0945c f26108a;

    /* renamed from: b, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26109b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4096a f26110c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26111d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26112e;

    /* renamed from: f, reason: collision with root package name */
    private final SavedStateHandle f26113f;

    /* renamed from: com.stripe.android.payments.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0531a {
        private C0531a() {
        }

        public /* synthetic */ C0531a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {
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
            Application a8 = D2.b.a(extras);
            SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            r a9 = r.f35037c.a(a8);
            C4097b c4097b = new C4097b(a8);
            m mVar = new m();
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(a8, a9.g(), null, 4, null);
            EnumC4096a a10 = c4097b.a();
            String string = a8.getString(AbstractC3407E.f34831N0);
            AbstractC3255y.h(string, "getString(...)");
            String string2 = a8.getString(AbstractC3407E.f34871n0);
            AbstractC3255y.h(string2, "getString(...)");
            return new a(mVar, paymentAnalyticsRequestFactory, a10, string, string2, createSavedStateHandle);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26114a;

        static {
            int[] iArr = new int[EnumC4096a.values().length];
            try {
                iArr[EnumC4096a.f40115a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4096a.f40116b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26114a = iArr;
        }
    }

    public a(InterfaceC0945c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, EnumC4096a browserCapabilities, String intentChooserTitle, String resolveErrorMessage, SavedStateHandle savedStateHandle) {
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(browserCapabilities, "browserCapabilities");
        AbstractC3255y.i(intentChooserTitle, "intentChooserTitle");
        AbstractC3255y.i(resolveErrorMessage, "resolveErrorMessage");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        this.f26108a = analyticsRequestExecutor;
        this.f26109b = paymentAnalyticsRequestFactory;
        this.f26110c = browserCapabilities;
        this.f26111d = intentChooserTitle;
        this.f26112e = resolveErrorMessage;
        this.f26113f = savedStateHandle;
    }

    private final CustomTabsIntent a(PaymentBrowserAuthContract.a aVar, Uri uri) {
        CustomTabColorSchemeParams customTabColorSchemeParams;
        Integer v8 = aVar.v();
        if (v8 != null) {
            customTabColorSchemeParams = new CustomTabColorSchemeParams.Builder().setToolbarColor(v8.intValue()).build();
        } else {
            customTabColorSchemeParams = null;
        }
        CustomTabsIntent.Builder shareState = new CustomTabsIntent.Builder().setShareState(2);
        if (customTabColorSchemeParams != null) {
            shareState.setDefaultColorSchemeParams(customTabColorSchemeParams);
        }
        CustomTabsIntent build = shareState.build();
        AbstractC3255y.h(build, "build(...)");
        build.intent.setData(uri);
        return build;
    }

    private final void f() {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        int i8 = c.f26114a[this.f26110c.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                paymentAnalyticsEvent = PaymentAnalyticsEvent.f25879M;
            } else {
                throw new p();
            }
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.f25878L;
        }
        this.f26108a.a(PaymentAnalyticsRequestFactory.v(this.f26109b, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    public final Intent b(PaymentBrowserAuthContract.a args) {
        Intent intent;
        AbstractC3255y.i(args, "args");
        Uri parse = Uri.parse(args.y());
        f();
        int i8 = c.f26114a[this.f26110c.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                intent = new Intent("android.intent.action.VIEW", parse);
            } else {
                throw new p();
            }
        } else {
            AbstractC3255y.f(parse);
            intent = a(args, parse).intent;
        }
        AbstractC3255y.f(intent);
        Intent createChooser = Intent.createChooser(intent, this.f26111d);
        AbstractC3255y.h(createChooser, "createChooser(...)");
        return createChooser;
    }

    public final Intent c(PaymentBrowserAuthContract.a args) {
        AbstractC3255y.i(args, "args");
        Uri parse = Uri.parse(args.y());
        C4141h c4141h = new C4141h(this.f26112e, "failedBrowserLaunchError");
        Intent intent = new Intent();
        String d8 = args.d();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String w8 = args.w();
        Intent putExtras = intent.putExtras(new C2980c(d8, 2, c4141h, args.u(), lastPathSegment, null, w8, 32, null).u());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final boolean d() {
        Boolean bool = (Boolean) this.f26113f.get("has_launched");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Intent e(PaymentBrowserAuthContract.a args) {
        AbstractC3255y.i(args, "args");
        Uri parse = Uri.parse(args.y());
        Intent intent = new Intent();
        String d8 = args.d();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String w8 = args.w();
        Intent putExtras = intent.putExtras(new C2980c(d8, 0, null, args.u(), lastPathSegment, null, w8, 38, null).u());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    public final void g(boolean z8) {
        this.f26113f.set("has_launched", Boolean.valueOf(z8));
    }
}
