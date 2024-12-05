package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.x;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import t3.C4036j;
import y4.C4206a;

/* renamed from: com.stripe.android.paymentsheet.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2627b implements w {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f26941a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f26942b;

    /* renamed from: c, reason: collision with root package name */
    private final LifecycleOwner f26943c;

    /* renamed from: d, reason: collision with root package name */
    private final Application f26944d;

    /* renamed from: e, reason: collision with root package name */
    private final t3.p f26945e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26946f;

    /* renamed from: com.stripe.android.paymentsheet.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3255y.i(owner, "owner");
            f.f27025a.b(null);
            C4036j.f39660a.c(null);
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

    public C2627b(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, t3.p callback, boolean z8) {
        AbstractC3255y.i(activityResultLauncher, "activityResultLauncher");
        AbstractC3255y.i(activity, "activity");
        AbstractC3255y.i(lifecycleOwner, "lifecycleOwner");
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(callback, "callback");
        this.f26941a = activityResultLauncher;
        this.f26942b = activity;
        this.f26943c = lifecycleOwner;
        this.f26944d = application;
        this.f26945e = callback;
        this.f26946f = z8;
        lifecycleOwner.getLifecycle().addObserver(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(t3.p callback, x xVar) {
        AbstractC3255y.i(callback, "$callback");
        AbstractC3255y.f(xVar);
        callback.a(xVar);
    }

    @Override // com.stripe.android.paymentsheet.w
    public void a(u.l mode, u.g gVar) {
        Integer num;
        AbstractC3255y.i(mode, "mode");
        if (gVar == null) {
            gVar = u.g.f27471q.a(this.f26942b);
        }
        Window window = this.f26942b.getWindow();
        if (window != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        } else {
            num = null;
        }
        PaymentSheetContractV2.a aVar = new PaymentSheetContractV2.a(mode, gVar, num, this.f26946f);
        Context applicationContext = this.f26944d.getApplicationContext();
        C4206a c4206a = C4206a.f40928a;
        ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(applicationContext, c4206a.a(), c4206a.b());
        AbstractC3255y.h(makeCustomAnimation, "makeCustomAnimation(...)");
        try {
            this.f26941a.launch(aVar, makeCustomAnimation);
        } catch (IllegalStateException e8) {
            this.f26945e.a(new x.c(new IllegalStateException("The host activity is not in a valid state (" + this.f26943c.getLifecycle().getCurrentState() + ").", e8)));
        }
    }

    public /* synthetic */ C2627b(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, t3.p pVar, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this(activityResultLauncher, activity, lifecycleOwner, application, pVar, (i8 & 32) != 0 ? false : z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2627b(androidx.activity.ComponentActivity r12, final t3.p r13) {
        /*
            r11 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.AbstractC3255y.i(r12, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.AbstractC3255y.i(r13, r0)
            com.stripe.android.paymentsheet.PaymentSheetContractV2 r0 = new com.stripe.android.paymentsheet.PaymentSheetContractV2
            r0.<init>()
            t3.d r1 = new t3.d
            r1.<init>()
            androidx.activity.result.ActivityResultLauncher r3 = r12.registerForActivityResult(r0, r1)
            java.lang.String r0 = "registerForActivityResult(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r3, r0)
            android.app.Application r6 = r12.getApplication()
            java.lang.String r0 = "getApplication(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r6, r0)
            r9 = 32
            r10 = 0
            r8 = 0
            r2 = r11
            r4 = r12
            r5 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2627b.<init>(androidx.activity.ComponentActivity, t3.p):void");
    }
}
