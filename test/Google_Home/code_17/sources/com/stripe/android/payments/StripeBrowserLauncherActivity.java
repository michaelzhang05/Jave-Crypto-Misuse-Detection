package com.stripe.android.payments;

import O5.InterfaceC1355k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.payments.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import n3.i;
import w2.AbstractC4144k;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StripeBrowserLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f26100a;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26101a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f26101a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f26101a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26102a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26102a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26102a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26104b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26103a = function0;
            this.f26104b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26103a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26104b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f26105a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new a.b();
        }
    }

    public StripeBrowserLauncherActivity() {
        Function0 function0 = d.f26105a;
        this.f26100a = new ViewModelLazy(U.b(com.stripe.android.payments.a.class), new b(this), function0 == null ? new a(this) : function0, new c(null, this));
    }

    private final void o(PaymentBrowserAuthContract.a aVar) {
        setResult(-1, q().c(aVar));
        finish();
    }

    private final void p(PaymentBrowserAuthContract.a aVar) {
        setResult(-1, q().e(aVar));
        finish();
    }

    private final com.stripe.android.payments.a q() {
        return (com.stripe.android.payments.a) this.f26100a.getValue();
    }

    private final void r(final PaymentBrowserAuthContract.a aVar) {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: i3.l
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                StripeBrowserLauncherActivity.s(StripeBrowserLauncherActivity.this, aVar, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResult(...)");
        try {
            registerForActivityResult.launch(q().b(aVar));
            q().g(true);
        } catch (ActivityNotFoundException e8) {
            i.a aVar2 = i.f35386a;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar2, applicationContext, null, 2, null), i.d.f35400n, AbstractC4144k.f40356e.b(e8), null, 4, null);
            o(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(StripeBrowserLauncherActivity this$0, PaymentBrowserAuthContract.a args, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(args, "$args");
        this$0.p(args);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.b bVar = PaymentBrowserAuthContract.f24504a;
        Intent intent = getIntent();
        AbstractC3255y.h(intent, "getIntent(...)");
        PaymentBrowserAuthContract.a a8 = bVar.a(intent);
        if (a8 == null) {
            finish();
            i.a aVar = i.f35386a;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            i.b.a(i.a.b(aVar, applicationContext, null, 2, null), i.d.f35401o, null, null, 6, null);
            return;
        }
        if (q().d()) {
            p(a8);
        } else {
            r(a8);
        }
    }
}
