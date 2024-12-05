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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.C3657j;
import v4.C3829a;

/* renamed from: com.stripe.android.paymentsheet.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2433b implements w {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResultLauncher f25886a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f25887b;

    /* renamed from: c, reason: collision with root package name */
    private final LifecycleOwner f25888c;

    /* renamed from: d, reason: collision with root package name */
    private final Application f25889d;

    /* renamed from: e, reason: collision with root package name */
    private final q3.p f25890e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25891f;

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
            AbstractC3159y.i(owner, "owner");
            f.f25970a.b(null);
            C3657j.f37338a.c(null);
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

    public C2433b(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, q3.p callback, boolean z8) {
        AbstractC3159y.i(activityResultLauncher, "activityResultLauncher");
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(lifecycleOwner, "lifecycleOwner");
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(callback, "callback");
        this.f25886a = activityResultLauncher;
        this.f25887b = activity;
        this.f25888c = lifecycleOwner;
        this.f25889d = application;
        this.f25890e = callback;
        this.f25891f = z8;
        lifecycleOwner.getLifecycle().addObserver(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(q3.p callback, x xVar) {
        AbstractC3159y.i(callback, "$callback");
        AbstractC3159y.f(xVar);
        callback.a(xVar);
    }

    @Override // com.stripe.android.paymentsheet.w
    public void a(u.l mode, u.g gVar) {
        Integer num;
        AbstractC3159y.i(mode, "mode");
        if (gVar == null) {
            gVar = u.g.f26416q.a(this.f25887b);
        }
        Window window = this.f25887b.getWindow();
        if (window != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        } else {
            num = null;
        }
        PaymentSheetContractV2.a aVar = new PaymentSheetContractV2.a(mode, gVar, num, this.f25891f);
        Context applicationContext = this.f25889d.getApplicationContext();
        C3829a c3829a = C3829a.f38797a;
        ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(applicationContext, c3829a.a(), c3829a.b());
        AbstractC3159y.h(makeCustomAnimation, "makeCustomAnimation(...)");
        try {
            this.f25886a.launch(aVar, makeCustomAnimation);
        } catch (IllegalStateException e8) {
            this.f25890e.a(new x.c(new IllegalStateException("The host activity is not in a valid state (" + this.f25888c.getLifecycle().getCurrentState() + ").", e8)));
        }
    }

    public /* synthetic */ C2433b(ActivityResultLauncher activityResultLauncher, Activity activity, LifecycleOwner lifecycleOwner, Application application, q3.p pVar, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this(activityResultLauncher, activity, lifecycleOwner, application, pVar, (i8 & 32) != 0 ? false : z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2433b(androidx.activity.ComponentActivity r12, final q3.p r13) {
        /*
            r11 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.AbstractC3159y.i(r12, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.AbstractC3159y.i(r13, r0)
            com.stripe.android.paymentsheet.PaymentSheetContractV2 r0 = new com.stripe.android.paymentsheet.PaymentSheetContractV2
            r0.<init>()
            q3.d r1 = new q3.d
            r1.<init>()
            androidx.activity.result.ActivityResultLauncher r3 = r12.registerForActivityResult(r0, r1)
            java.lang.String r0 = "registerForActivityResult(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r3, r0)
            android.app.Application r6 = r12.getApplication()
            java.lang.String r0 = "getApplication(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r6, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.C2433b.<init>(androidx.activity.ComponentActivity, q3.p):void");
    }
}
