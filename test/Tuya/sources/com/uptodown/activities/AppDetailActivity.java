package com.uptodown.activities;

import M5.AbstractC1246t;
import U4.C1422b;
import U4.L0;
import U4.V0;
import X4.C1495e;
import X4.C1498h;
import X4.C1501k;
import X4.C1505o;
import X4.O;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;
import p5.C3608f;

/* loaded from: classes4.dex */
public final class AppDetailActivity extends AbstractActivityC2489a {

    /* renamed from: U, reason: collision with root package name */
    public static final a f28093U = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f28094N = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f28095O = new ArrayList();

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f28096P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    private final C3608f f28097Q = new C3608f();

    /* renamed from: R, reason: collision with root package name */
    private RelativeLayout f28098R;

    /* renamed from: S, reason: collision with root package name */
    private final ActivityResultLauncher f28099S;

    /* renamed from: T, reason: collision with root package name */
    private final e f28100T;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28101a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28102b;

        public b(int i8, String str) {
            this.f28101a = i8;
            this.f28102b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            L0 m32;
            String str;
            if (this.f28102b != null && (m32 = AppDetailActivity.this.m3()) != null && m32.isResumed()) {
                C1498h I32 = m32.I3();
                if (I32 != null) {
                    str = I32.y0();
                } else {
                    str = null;
                }
                if (g6.n.t(str, this.f28102b, false, 2, null)) {
                    C3326n.a aVar = C3326n.f34504t;
                    Context baseContext = AppDetailActivity.this.getBaseContext();
                    AbstractC3159y.h(baseContext, "baseContext");
                    C3326n a8 = aVar.a(baseContext);
                    a8.a();
                    O u02 = a8.u0(this.f28102b);
                    a8.g();
                    if (u02 != null) {
                        AppDetailActivity.this.runOnUiThread(new L0.RunnableC1394b(this.f28101a, u02));
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f28104a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppDetailActivity f28106c;

        public c(AppDetailActivity appDetailActivity, String packagename, int i8) {
            AbstractC3159y.i(packagename, "packagename");
            this.f28106c = appDetailActivity;
            this.f28104a = packagename;
            this.f28105b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f28106c.getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            Fragment fragment = (Fragment) AbstractC1246t.y0(fragments);
            if (fragment != null && (fragment instanceof L0)) {
                new L0.RunnableC1395c((L0) fragment, this.f28104a, this.f28105b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28107a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f28108b;

        public d(int i8, C1505o c1505o) {
            this.f28107a = i8;
            this.f28108b = c1505o;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            L0 m32 = AppDetailActivity.this.m3();
            if (m32 != null && m32.isResumed()) {
                AppDetailActivity.this.runOnUiThread(new L0.RunnableC1397e(this.f28107a, this.f28108b));
            }
            String str2 = null;
            if (AppDetailActivity.this.n3() != null) {
                V0 n32 = AppDetailActivity.this.n3();
                AbstractC3159y.f(n32);
                C1505o c1505o = this.f28108b;
                if (c1505o != null) {
                    str = c1505o.Y();
                } else {
                    str = null;
                }
                n32.I(str);
            }
            if (AppDetailActivity.this.l3() != null) {
                C1422b l32 = AppDetailActivity.this.l3();
                AbstractC3159y.f(l32);
                C1505o c1505o2 = this.f28108b;
                if (c1505o2 != null) {
                    str2 = c1505o2.Y();
                }
                l32.y(str2);
            }
            if (this.f28108b != null) {
                AppDetailActivity.this.j3().W(this.f28108b, AppDetailActivity.this.k3(), this.f28107a, AppDetailActivity.this);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends OnBackPressedCallback {
        e() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            RelativeLayout k32 = AppDetailActivity.this.k3();
            if (k32 != null && k32.getVisibility() == 0) {
                C3608f j32 = AppDetailActivity.this.j3();
                AppDetailActivity appDetailActivity = AppDetailActivity.this;
                RelativeLayout k33 = appDetailActivity.k3();
                AbstractC3159y.f(k33);
                j32.f(appDetailActivity, k33);
                return;
            }
            Log.d("utd_debug", "topByCategoryFragmentStack.size: " + AppDetailActivity.this.f28095O.size() + " appDetailsFragmentStack.size: " + AppDetailActivity.this.f28094N.size());
            if (AppDetailActivity.this.f28095O.size() > 0) {
                AppDetailActivity.this.f28095O.remove(AbstractC1246t.o(AppDetailActivity.this.f28095O));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                return;
            }
            if (AppDetailActivity.this.f28096P.size() > 0) {
                AppDetailActivity.this.f28096P.remove(AbstractC1246t.o(AppDetailActivity.this.f28096P));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
            } else {
                if (AppDetailActivity.this.f28094N.size() > 0) {
                    AppDetailActivity.this.f28094N.remove(AbstractC1246t.o(AppDetailActivity.this.f28094N));
                    AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                    if (AppDetailActivity.this.f28094N.size() == 0) {
                        AppDetailActivity.this.finish();
                        return;
                    }
                    return;
                }
                AppDetailActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28111a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, P5.d dVar) {
            super(2, dVar);
            this.f28113c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f28113c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28111a == 0) {
                L5.t.b(obj);
                L0 m32 = AppDetailActivity.this.m3();
                if (m32 != null && m32.isResumed()) {
                    m32.Q6(this.f28113c);
                    m32.O6(this.f28113c);
                }
                if (!AppDetailActivity.this.f28095O.isEmpty()) {
                    ((V0) AbstractC1246t.y0(AppDetailActivity.this.f28095O)).I(this.f28113c);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28114a;

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28114a == 0) {
                L5.t.b(obj);
                L0 m32 = AppDetailActivity.this.m3();
                if (m32 != null && m32.isResumed()) {
                    AppDetailActivity.this.runOnUiThread(new L0.RunnableC1396d());
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AppDetailActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AppDetailActivity.i3(AppDetailActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…Activity)\n        }\n    }");
        this.f28099S = registerForActivityResult;
        this.f28100T = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(AppDetailActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            UptodownApp.a.N0(UptodownApp.f28003B, this$0, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1422b l3() {
        if (this.f28096P.size() > 0) {
            return (C1422b) AbstractC1246t.y0(this.f28096P);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L0 m3() {
        if (this.f28094N.size() > 0) {
            return (L0) AbstractC1246t.y0(this.f28094N);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V0 n3() {
        if (this.f28095O.size() > 0) {
            return (V0) AbstractC1246t.y0(this.f28095O);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(AppDetailActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28098R;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28097Q.E(0L);
        this$0.X2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(AppDetailActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28098R;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28097Q.E(0L);
        this$0.X2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(AppDetailActivity this$0, C1498h appInfo, Function0 updateCard, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        AbstractC3159y.i(updateCard, "$updateCard");
        this$0.f28097Q.g(appInfo, this$0);
        C3608f c3608f = this$0.f28097Q;
        RelativeLayout relativeLayout = this$0.f28098R;
        AbstractC3159y.f(relativeLayout);
        c3608f.f(this$0, relativeLayout);
        updateCard.invoke();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void X2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        L0 a8 = L0.f11186K.a(appInfo, appInfo.i());
        getSupportFragmentManager().beginTransaction().add(R.id.content, a8, (String) null).addToBackStack(String.valueOf(appInfo.i())).commit();
        this.f28094N.add(a8);
    }

    public final C3608f j3() {
        return this.f28097Q;
    }

    public final RelativeLayout k3() {
        return this.f28098R;
    }

    public final ActivityResultLauncher o3() {
        return this.f28099S;
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C1498h c1498h;
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        long j8 = -1;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appId")) {
                j8 = extras.getLong("appId");
            }
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C1498h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                c1498h = (C1498h) parcelable;
                if (c1498h != null) {
                    j8 = c1498h.i();
                }
                L0 a8 = L0.f11186K.a(c1498h, j8);
                getSupportFragmentManager().beginTransaction().add(R.id.content, a8, (String) null).commit();
                getOnBackPressedDispatcher().addCallback(this, this.f28100T);
                this.f28094N.add(a8);
            }
        }
        c1498h = null;
        L0 a82 = L0.f11186K.a(c1498h, j8);
        getSupportFragmentManager().beginTransaction().add(R.id.content, a82, (String) null).commit();
        getOnBackPressedDispatcher().addCallback(this, this.f28100T);
        this.f28094N.add(a82);
    }

    public final void p3() {
        L0 m32 = m3();
        if (m32 != null) {
            m32.O5();
        }
    }

    public final void q3(RelativeLayout relativeLayout) {
        this.f28098R = relativeLayout;
    }

    public final void r3(final C1498h appInfo, final Function0 updateCard) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f28098R;
        if (relativeLayout != null) {
            C3608f c3608f = this.f28097Q;
            AbstractC3159y.f(relativeLayout);
            c3608f.H(appInfo, this, relativeLayout);
            this.f28097Q.m().setOnClickListener(new View.OnClickListener() { // from class: A4.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.s3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f28097Q.s().setOnClickListener(new View.OnClickListener() { // from class: A4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.t3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f28097Q.q().setOnClickListener(new View.OnClickListener() { // from class: A4.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.u3(AppDetailActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f28098R;
            AbstractC3159y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f28098R;
                AbstractC3159y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f29323b.N(this) && !UptodownApp.f28003B.S()) {
                    this.f28097Q.p().startAnimation(AnimationUtils.loadAnimation(this, com.uptodown.R.anim.slide_in_bottom));
                }
                this.f28097Q.p().setVisibility(0);
            }
            this.f28097Q.p().setVisibility(0);
        }
    }

    public final Object v3(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new f(str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    public final Object w3(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new g(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    public final void x3(C1495e alternatives) {
        AbstractC3159y.i(alternatives, "alternatives");
        C1422b a8 = C1422b.f11609f.a(alternatives);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(com.uptodown.R.anim.slide_next_in, com.uptodown.R.anim.slide_back_out).add(R.id.content, a8, (String) null).addToBackStack(alternatives.c()).commit();
        this.f28096P.add(a8);
    }

    public final void y3(C1501k category) {
        AbstractC3159y.i(category, "category");
        V0 a8 = V0.f11523i.a(category);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(com.uptodown.R.anim.slide_next_in, com.uptodown.R.anim.slide_back_out).add(R.id.content, a8, (String) null).addToBackStack(String.valueOf(category.c())).commit();
        this.f28095O.add(a8);
    }
}
