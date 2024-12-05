package com.stripe.android.view;

import O5.C1352h;
import O5.InterfaceC1355k;
import a6.InterfaceC1668n;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c4.C2043a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.view.C2655n0;
import i3.C2980c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import m2.AbstractC3403A;
import m2.AbstractC3406D;
import n3.i;
import o6.AbstractC3700N;
import o6.InterfaceC3707g;
import u2.InterfaceC4057d;
import w2.AbstractC4144k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentAuthWebViewActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f28517a = O5.l.b(new j());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f28518b = O5.l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f28519c = O5.l.b(new b());

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1355k f28520d = new ViewModelLazy(kotlin.jvm.internal.U.b(C2655n0.class), new h(this), new k(), new i(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentBrowserAuthContract.a invoke() {
            PaymentBrowserAuthContract.b bVar = PaymentBrowserAuthContract.f24504a;
            Intent intent = PaymentAuthWebViewActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return bVar.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4057d invoke() {
            InterfaceC4057d.a aVar = InterfaceC4057d.f39950a;
            PaymentBrowserAuthContract.a x8 = PaymentAuthWebViewActivity.this.x();
            boolean z8 = false;
            if (x8 != null && x8.g()) {
                z8 = true;
            }
            return aVar.a(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return O5.I.f8278a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3255y.i(addCallback, "$this$addCallback");
            if (PaymentAuthWebViewActivity.this.v().f4880d.canGoBack()) {
                PaymentAuthWebViewActivity.this.v().f4880d.goBack();
            } else {
                PaymentAuthWebViewActivity.this.r();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o6.w f28525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PaymentAuthWebViewActivity f28526c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentAuthWebViewActivity f28527a;

            a(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
                this.f28527a = paymentAuthWebViewActivity;
            }

            public final Object a(boolean z8, S5.d dVar) {
                if (z8) {
                    CircularProgressIndicator progressBar = this.f28527a.v().f4878b;
                    AbstractC3255y.h(progressBar, "progressBar");
                    progressBar.setVisibility(8);
                }
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o6.w wVar, PaymentAuthWebViewActivity paymentAuthWebViewActivity, S5.d dVar) {
            super(2, dVar);
            this.f28525b = wVar;
            this.f28526c = paymentAuthWebViewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f28525b, this.f28526c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f28524a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                o6.w wVar = this.f28525b;
                a aVar = new a(this.f28526c);
                this.f28524a = 1;
                if (wVar.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2657o0 f28528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2657o0 c2657o0) {
            super(0);
            this.f28528a = c2657o0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5563invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5563invoke() {
            this.f28528a.j(true);
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class f extends C3252v implements Function1 {
        f(Object obj) {
            super(1, obj, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
        }

        public final void d(Intent intent) {
            ((PaymentAuthWebViewActivity) this.receiver).startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Intent) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class g extends C3252v implements Function1 {
        g(Object obj) {
            super(1, obj, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", 0);
        }

        public final void d(Throwable th) {
            ((PaymentAuthWebViewActivity) this.receiver).y(th);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28529a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28529a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28530a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28530a = function0;
            this.f28531b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28530a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28531b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J2.o invoke() {
            J2.o c8 = J2.o.c(PaymentAuthWebViewActivity.this.getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3256z implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            Application application = PaymentAuthWebViewActivity.this.getApplication();
            AbstractC3255y.h(application, "getApplication(...)");
            InterfaceC4057d u8 = PaymentAuthWebViewActivity.this.u();
            PaymentBrowserAuthContract.a x8 = PaymentAuthWebViewActivity.this.x();
            if (x8 != null) {
                return new C2655n0.a(application, u8, x8);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        setResult(-1, w().d());
        finish();
    }

    private final Intent s(C2980c c2980c) {
        Intent putExtras = new Intent().putExtras(c2980c.u());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    private final void t() {
        u().b("PaymentAuthWebViewActivity#customizeToolbar()");
        C2655n0.b h8 = w().h();
        if (h8 != null) {
            u().b("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            v().f4879c.setTitle(C2043a.f15724a.b(this, h8.a(), h8.b()));
        }
        String g8 = w().g();
        if (g8 != null) {
            u().b("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int parseColor = Color.parseColor(g8);
            v().f4879c.setBackgroundColor(parseColor);
            C2043a.f15724a.e(this, parseColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC4057d u() {
        return (InterfaceC4057d) this.f28519c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J2.o v() {
        return (J2.o) this.f28517a.getValue();
    }

    private final C2655n0 w() {
        return (C2655n0) this.f28520d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentBrowserAuthContract.a x() {
        return (PaymentBrowserAuthContract.a) this.f28518b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.a x8 = x();
        if (x8 == null) {
            setResult(0);
            finish();
            i.a aVar = n3.i.f35386a;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar, applicationContext, null, 2, null), i.d.f35389c, null, null, 6, null);
            return;
        }
        u().b("PaymentAuthWebViewActivity#onCreate()");
        setContentView(v().getRoot());
        setSupportActionBar(v().f4879c);
        t();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3255y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new c(), 3, null);
        String d8 = x8.d();
        setResult(-1, s(w().f()));
        if (j6.n.u(d8)) {
            u().b("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            i.a aVar2 = n3.i.f35386a;
            Context applicationContext2 = getApplicationContext();
            AbstractC3255y.h(applicationContext2, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar2, applicationContext2, null, 2, null), i.f.f35418b, null, null, 6, null);
            return;
        }
        u().b("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        o6.w a8 = AbstractC3700N.a(Boolean.FALSE);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(a8, this, null), 3, null);
        C2657o0 c2657o0 = new C2657o0(u(), a8, d8, x8.A(), new f(this), new g(this));
        v().f4880d.setOnLoadBlank$payments_core_release(new e(c2657o0));
        v().f4880d.setWebViewClient(c2657o0);
        v().f4880d.setWebChromeClient(new C2653m0(this, u()));
        w().k();
        v().f4880d.loadUrl(x8.y(), w().e());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3255y.i(menu, "menu");
        u().b("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(AbstractC3406D.f34803b, menu);
        String c8 = w().c();
        if (c8 != null) {
            u().b("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(AbstractC3403A.f34739a).setTitle(c8);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        v().f4881e.removeAllViews();
        v().f4880d.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC3255y.i(item, "item");
        u().b("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() == AbstractC3403A.f34739a) {
            r();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public final void y(Throwable th) {
        if (th != null) {
            i.a aVar = n3.i.f35386a;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            n3.i b8 = i.a.b(aVar, applicationContext, null, 2, null);
            i.d dVar = i.d.f35388b;
            AbstractC4144k.a aVar2 = AbstractC4144k.f40356e;
            i.b.a(b8, dVar, aVar2.b(th), null, 4, null);
            w().j();
            setResult(-1, s(C2980c.b(w().f(), null, 2, aVar2.b(th), true, null, null, null, 113, null)));
        } else {
            w().i();
        }
        finish();
    }
}
