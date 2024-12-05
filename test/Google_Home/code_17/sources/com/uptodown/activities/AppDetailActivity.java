package com.uptodown.activities;

import P5.AbstractC1378t;
import X4.C1531b;
import X4.L0;
import X4.V0;
import a5.C1638e;
import a5.C1641h;
import a5.C1644k;
import a5.C1648o;
import a5.O;
import a6.InterfaceC1668n;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;
import o5.C3674n;
import s5.C4002f;

/* loaded from: classes4.dex */
public final class AppDetailActivity extends AbstractActivityC2683a {

    /* renamed from: U, reason: collision with root package name */
    public static final a f29148U = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f29149N = new ArrayList();

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f29150O = new ArrayList();

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f29151P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    private final C4002f f29152Q = new C4002f();

    /* renamed from: R, reason: collision with root package name */
    private RelativeLayout f29153R;

    /* renamed from: S, reason: collision with root package name */
    private final ActivityResultLauncher f29154S;

    /* renamed from: T, reason: collision with root package name */
    private final e f29155T;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29156a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29157b;

        public b(int i8, String str) {
            this.f29156a = i8;
            this.f29157b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            L0 m32;
            String str;
            if (this.f29157b != null && (m32 = AppDetailActivity.this.m3()) != null && m32.isResumed()) {
                C1641h I32 = m32.I3();
                if (I32 != null) {
                    str = I32.y0();
                } else {
                    str = null;
                }
                if (j6.n.t(str, this.f29157b, false, 2, null)) {
                    C3674n.a aVar = C3674n.f36505t;
                    Context baseContext = AppDetailActivity.this.getBaseContext();
                    AbstractC3255y.h(baseContext, "baseContext");
                    C3674n a8 = aVar.a(baseContext);
                    a8.a();
                    O u02 = a8.u0(this.f29157b);
                    a8.l();
                    if (u02 != null) {
                        AppDetailActivity.this.runOnUiThread(new L0.RunnableC1503b(this.f29156a, u02));
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f29159a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29160b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppDetailActivity f29161c;

        public c(AppDetailActivity appDetailActivity, String packagename, int i8) {
            AbstractC3255y.i(packagename, "packagename");
            this.f29161c = appDetailActivity;
            this.f29159a = packagename;
            this.f29160b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f29161c.getSupportFragmentManager().getFragments();
            AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
            Fragment fragment = (Fragment) AbstractC1378t.y0(fragments);
            if (fragment != null && (fragment instanceof L0)) {
                new L0.RunnableC1504c((L0) fragment, this.f29159a, this.f29160b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29162a;

        /* renamed from: b, reason: collision with root package name */
        private final C1648o f29163b;

        public d(int i8, C1648o c1648o) {
            this.f29162a = i8;
            this.f29163b = c1648o;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            L0 m32 = AppDetailActivity.this.m3();
            if (m32 != null && m32.isResumed()) {
                AppDetailActivity.this.runOnUiThread(new L0.RunnableC1506e(this.f29162a, this.f29163b));
            }
            String str2 = null;
            if (AppDetailActivity.this.n3() != null) {
                V0 n32 = AppDetailActivity.this.n3();
                AbstractC3255y.f(n32);
                C1648o c1648o = this.f29163b;
                if (c1648o != null) {
                    str = c1648o.Y();
                } else {
                    str = null;
                }
                n32.I(str);
            }
            if (AppDetailActivity.this.l3() != null) {
                C1531b l32 = AppDetailActivity.this.l3();
                AbstractC3255y.f(l32);
                C1648o c1648o2 = this.f29163b;
                if (c1648o2 != null) {
                    str2 = c1648o2.Y();
                }
                l32.y(str2);
            }
            if (this.f29163b != null) {
                AppDetailActivity.this.j3().W(this.f29163b, AppDetailActivity.this.k3(), this.f29162a, AppDetailActivity.this);
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
                C4002f j32 = AppDetailActivity.this.j3();
                AppDetailActivity appDetailActivity = AppDetailActivity.this;
                RelativeLayout k33 = appDetailActivity.k3();
                AbstractC3255y.f(k33);
                j32.f(appDetailActivity, k33);
                return;
            }
            Log.d("utd_debug", "topByCategoryFragmentStack.size: " + AppDetailActivity.this.f29150O.size() + " appDetailsFragmentStack.size: " + AppDetailActivity.this.f29149N.size());
            if (AppDetailActivity.this.f29150O.size() > 0) {
                AppDetailActivity.this.f29150O.remove(AbstractC1378t.o(AppDetailActivity.this.f29150O));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                return;
            }
            if (AppDetailActivity.this.f29151P.size() > 0) {
                AppDetailActivity.this.f29151P.remove(AbstractC1378t.o(AppDetailActivity.this.f29151P));
                AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
            } else {
                if (AppDetailActivity.this.f29149N.size() > 0) {
                    AppDetailActivity.this.f29149N.remove(AbstractC1378t.o(AppDetailActivity.this.f29149N));
                    AppDetailActivity.this.getSupportFragmentManager().popBackStackImmediate();
                    if (AppDetailActivity.this.f29149N.size() == 0) {
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
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29166a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, S5.d dVar) {
            super(2, dVar);
            this.f29168c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f29168c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29166a == 0) {
                O5.t.b(obj);
                L0 m32 = AppDetailActivity.this.m3();
                if (m32 != null && m32.isResumed()) {
                    m32.Q6(this.f29168c);
                    m32.O6(this.f29168c);
                }
                if (!AppDetailActivity.this.f29150O.isEmpty()) {
                    ((V0) AbstractC1378t.y0(AppDetailActivity.this.f29150O)).I(this.f29168c);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29169a;

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29169a == 0) {
                O5.t.b(obj);
                L0 m32 = AppDetailActivity.this.m3();
                if (m32 != null && m32.isResumed()) {
                    AppDetailActivity.this.runOnUiThread(new L0.RunnableC1505d());
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public AppDetailActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AppDetailActivity.i3(AppDetailActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…Activity)\n        }\n    }");
        this.f29154S = registerForActivityResult;
        this.f29155T = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(AppDetailActivity this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            UptodownApp.a.N0(UptodownApp.f29058B, this$0, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1531b l3() {
        if (this.f29151P.size() > 0) {
            return (C1531b) AbstractC1378t.y0(this.f29151P);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L0 m3() {
        if (this.f29149N.size() > 0) {
            return (L0) AbstractC1378t.y0(this.f29149N);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V0 n3() {
        if (this.f29150O.size() > 0) {
            return (V0) AbstractC1378t.y0(this.f29150O);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(AppDetailActivity this$0, C1641h appInfo, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f29153R;
        AbstractC3255y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f29152Q.E(0L);
        this$0.X2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(AppDetailActivity this$0, C1641h appInfo, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f29153R;
        AbstractC3255y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f29152Q.E(0L);
        this$0.X2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(AppDetailActivity this$0, C1641h appInfo, Function0 updateCard, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(appInfo, "$appInfo");
        AbstractC3255y.i(updateCard, "$updateCard");
        this$0.f29152Q.g(appInfo, this$0);
        C4002f c4002f = this$0.f29152Q;
        RelativeLayout relativeLayout = this$0.f29153R;
        AbstractC3255y.f(relativeLayout);
        c4002f.f(this$0, relativeLayout);
        updateCard.invoke();
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a
    public void X2(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        L0 a8 = L0.f12856K.a(appInfo, appInfo.i());
        getSupportFragmentManager().beginTransaction().add(R.id.content, a8, (String) null).addToBackStack(String.valueOf(appInfo.i())).commit();
        this.f29149N.add(a8);
    }

    public final C4002f j3() {
        return this.f29152Q;
    }

    public final RelativeLayout k3() {
        return this.f29153R;
    }

    public final ActivityResultLauncher o3() {
        return this.f29154S;
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C1641h c1641h;
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
                    parcelable2 = extras.getParcelable("appInfo", C1641h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                c1641h = (C1641h) parcelable;
                if (c1641h != null) {
                    j8 = c1641h.i();
                }
                L0 a8 = L0.f12856K.a(c1641h, j8);
                getSupportFragmentManager().beginTransaction().add(R.id.content, a8, (String) null).commit();
                getOnBackPressedDispatcher().addCallback(this, this.f29155T);
                this.f29149N.add(a8);
            }
        }
        c1641h = null;
        L0 a82 = L0.f12856K.a(c1641h, j8);
        getSupportFragmentManager().beginTransaction().add(R.id.content, a82, (String) null).commit();
        getOnBackPressedDispatcher().addCallback(this, this.f29155T);
        this.f29149N.add(a82);
    }

    public final void p3() {
        L0 m32 = m3();
        if (m32 != null) {
            m32.O5();
        }
    }

    public final void q3(RelativeLayout relativeLayout) {
        this.f29153R = relativeLayout;
    }

    public final void r3(final C1641h appInfo, final Function0 updateCard) {
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f29153R;
        if (relativeLayout != null) {
            C4002f c4002f = this.f29152Q;
            AbstractC3255y.f(relativeLayout);
            c4002f.H(appInfo, this, relativeLayout);
            this.f29152Q.m().setOnClickListener(new View.OnClickListener() { // from class: D4.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.s3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f29152Q.s().setOnClickListener(new View.OnClickListener() { // from class: D4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.t3(AppDetailActivity.this, appInfo, view);
                }
            });
            this.f29152Q.q().setOnClickListener(new View.OnClickListener() { // from class: D4.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppDetailActivity.u3(AppDetailActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f29153R;
            AbstractC3255y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f29153R;
                AbstractC3255y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f30353b.N(this) && !UptodownApp.f29058B.S()) {
                    this.f29152Q.p().startAnimation(AnimationUtils.loadAnimation(this, com.uptodown.R.anim.slide_in_bottom));
                }
                this.f29152Q.p().setVisibility(0);
            }
            this.f29152Q.p().setVisibility(0);
        }
    }

    public final Object v3(String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new f(str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    public final Object w3(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new g(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    public final void x3(C1638e alternatives) {
        AbstractC3255y.i(alternatives, "alternatives");
        C1531b a8 = C1531b.f13279f.a(alternatives);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(com.uptodown.R.anim.slide_next_in, com.uptodown.R.anim.slide_back_out).add(R.id.content, a8, (String) null).addToBackStack(alternatives.c()).commit();
        this.f29151P.add(a8);
    }

    public final void y3(C1644k category) {
        AbstractC3255y.i(category, "category");
        V0 a8 = V0.f13193i.a(category);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(com.uptodown.R.anim.slide_next_in, com.uptodown.R.anim.slide_back_out).add(R.id.content, a8, (String) null).addToBackStack(String.valueOf(category.b())).commit();
        this.f29150O.add(a8);
    }
}
