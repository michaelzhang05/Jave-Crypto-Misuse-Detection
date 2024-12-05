package com.uptodown.activities;

import E4.j;
import M5.AbstractC1246t;
import T4.k0;
import T4.s0;
import T4.t0;
import U4.C1422b;
import U4.F1;
import U4.L0;
import U4.S0;
import U4.T0;
import U4.V0;
import W4.InterfaceC1490m;
import X4.C1495e;
import X4.C1498h;
import X4.C1500j;
import X4.C1501k;
import X4.C1503m;
import X4.C1505o;
import X4.O;
import X4.V;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.views.ScrollableTextView;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.GetUserDataWorker;
import i2.InterfaceC2774b;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.X;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.C3307A;
import l5.C3312F;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3335w;
import p5.C3608f;

/* loaded from: classes4.dex */
public final class MainActivity extends AbstractActivityC2493e {

    /* renamed from: X0, reason: collision with root package name */
    public static final C2479b f28399X0 = new C2479b(null);

    /* renamed from: A0, reason: collision with root package name */
    private T0 f28400A0;

    /* renamed from: B0, reason: collision with root package name */
    private V0 f28401B0;

    /* renamed from: C0, reason: collision with root package name */
    private S0 f28402C0;

    /* renamed from: D0, reason: collision with root package name */
    private F1 f28403D0;

    /* renamed from: I0, reason: collision with root package name */
    private FrameLayout f28408I0;

    /* renamed from: J0, reason: collision with root package name */
    private k0 f28409J0;

    /* renamed from: K0, reason: collision with root package name */
    private FrameLayout f28410K0;

    /* renamed from: L0, reason: collision with root package name */
    private FrameLayout f28411L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f28412M0;

    /* renamed from: O0, reason: collision with root package name */
    private RelativeLayout f28414O0;

    /* renamed from: R0, reason: collision with root package name */
    private final ActivityResultLauncher f28417R0;

    /* renamed from: S0, reason: collision with root package name */
    private final ActivityResultLauncher f28418S0;

    /* renamed from: T0, reason: collision with root package name */
    private final ActivityResultLauncher f28419T0;

    /* renamed from: U0, reason: collision with root package name */
    private final ActivityResultLauncher f28420U0;

    /* renamed from: V, reason: collision with root package name */
    private RelativeLayout f28421V;

    /* renamed from: V0, reason: collision with root package name */
    private final q f28422V0;

    /* renamed from: W, reason: collision with root package name */
    private int f28423W;

    /* renamed from: W0, reason: collision with root package name */
    private final ActivityResultLauncher f28424W0;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f28426Y;

    /* renamed from: Z, reason: collision with root package name */
    private RelativeLayout f28427Z;

    /* renamed from: p0, reason: collision with root package name */
    private Toolbar f28428p0;

    /* renamed from: q0, reason: collision with root package name */
    private AppBarLayout f28429q0;

    /* renamed from: r0, reason: collision with root package name */
    private SwitchCompat f28430r0;

    /* renamed from: s0, reason: collision with root package name */
    private SwitchCompat f28431s0;

    /* renamed from: t0, reason: collision with root package name */
    private TabLayout f28432t0;

    /* renamed from: u0, reason: collision with root package name */
    private C1498h f28433u0;

    /* renamed from: v0, reason: collision with root package name */
    private ViewPager2 f28434v0;

    /* renamed from: w0, reason: collision with root package name */
    private RelativeLayout f28435w0;

    /* renamed from: x0, reason: collision with root package name */
    private RelativeLayout f28436x0;

    /* renamed from: y0, reason: collision with root package name */
    private ProgressBar f28437y0;

    /* renamed from: z0, reason: collision with root package name */
    private TabLayout f28438z0;

    /* renamed from: X, reason: collision with root package name */
    private ArrayList f28425X = new ArrayList();

    /* renamed from: E0, reason: collision with root package name */
    private ArrayList f28404E0 = new ArrayList();

    /* renamed from: F0, reason: collision with root package name */
    private ArrayList f28405F0 = new ArrayList();

    /* renamed from: G0, reason: collision with root package name */
    private long f28406G0 = -1;

    /* renamed from: H0, reason: collision with root package name */
    private final int f28407H0 = 4;

    /* renamed from: N0, reason: collision with root package name */
    private final C3608f f28413N0 = new C3608f();

    /* renamed from: P0, reason: collision with root package name */
    private final m f28415P0 = new m();

    /* renamed from: Q0, reason: collision with root package name */
    private InterfaceC1490m f28416Q0 = new C2488k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final A f28439a = new A();

        A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class B extends ClickableSpan {
        B() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(E4.j.f2274g.t());
            ds.setUnderlineText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f28441a = new C();

        C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class D extends ClickableSpan {
        D() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.turbo_text_featured));
            ds.setTypeface(E4.j.f2274g.t());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f28443a = new E();

        E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28444a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(String str, P5.d dVar) {
            super(2, dVar);
            this.f28446c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new F(this.f28446c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((F) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28444a == 0) {
                L5.t.b(obj);
                Fragment E52 = MainActivity.this.E5();
                if (E52 instanceof L0) {
                    ((L0) E52).Q6(this.f28446c);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class G extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28447a;

        G(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new G(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((G) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28447a == 0) {
                L5.t.b(obj);
                Fragment E52 = MainActivity.this.E5();
                if (E52 instanceof L0) {
                    MainActivity.this.runOnUiThread(new L0.RunnableC1396d());
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28449a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f28451c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f28452d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28453a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f28454b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f28455c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ MainActivity f28456d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, Q q9, MainActivity mainActivity, P5.d dVar) {
                super(2, dVar);
                this.f28454b = q8;
                this.f28455c = q9;
                this.f28456d = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28454b, this.f28455c, this.f28456d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28453a == 0) {
                    L5.t.b(obj);
                    if (this.f28454b.f33759a + this.f28455c.f33759a > 0) {
                        TabLayout tabLayout = this.f28456d.f28438z0;
                        AbstractC3159y.f(tabLayout);
                        TabLayout.Tab tabAt = tabLayout.getTabAt(3);
                        AbstractC3159y.f(tabAt);
                        return tabAt.setIcon(R.drawable.vector_user_profile_notification);
                    }
                    TabLayout tabLayout2 = this.f28456d.f28438z0;
                    AbstractC3159y.f(tabLayout2);
                    TabLayout.Tab tabAt2 = tabLayout2.getTabAt(3);
                    AbstractC3159y.f(tabAt2);
                    return tabAt2.setIcon(R.drawable.vector_user_profile);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28457a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28458b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity, P5.d dVar) {
                super(2, dVar);
                this.f28458b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f28458b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28457a == 0) {
                    L5.t.b(obj);
                    TabLayout tabLayout = this.f28458b.f28438z0;
                    AbstractC3159y.f(tabLayout);
                    TabLayout.Tab tabAt = tabLayout.getTabAt(3);
                    AbstractC3159y.f(tabAt);
                    return tabAt.setIcon(R.drawable.vector_user_profile);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(Q q8, Q q9, P5.d dVar) {
            super(2, dVar);
            this.f28451c = q8;
            this.f28452d = q9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new H(this.f28451c, this.f28452d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int Z7;
            Object e8 = Q5.b.e();
            int i8 = this.f28449a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return (TabLayout.Tab) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
                return (TabLayout.Tab) obj;
            }
            L5.t.b(obj);
            if (MainActivity.this.getApplicationContext() != null) {
                Q q8 = this.f28451c;
                O.b bVar = O.f12422l;
                Context applicationContext = MainActivity.this.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                q8.f33759a = bVar.a(applicationContext);
                C3326n.a aVar = C3326n.f34504t;
                Context applicationContext2 = MainActivity.this.getApplicationContext();
                AbstractC3159y.h(applicationContext2, "applicationContext");
                C3326n a8 = aVar.a(applicationContext2);
                a8.a();
                ArrayList c02 = a8.c0();
                a8.g();
                Iterator it = c02.iterator();
                while (it.hasNext()) {
                    C1505o c1505o = (C1505o) it.next();
                    if (c1505o.k() == 0 && (1 > (Z7 = c1505o.Z()) || Z7 >= 100 || c1505o.I() != 0)) {
                        this.f28452d.f33759a++;
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar2 = new a(this.f28452d, this.f28451c, MainActivity.this, null);
                this.f28449a = 1;
                obj = AbstractC2825i.g(c8, aVar2, this);
                if (obj == e8) {
                    return e8;
                }
                return (TabLayout.Tab) obj;
            }
            J0 c9 = C2812b0.c();
            b bVar2 = new b(MainActivity.this, null);
            this.f28449a = 2;
            obj = AbstractC2825i.g(c9, bVar2, this);
            if (obj == e8) {
                return e8;
            }
            return (TabLayout.Tab) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28459a;

        I(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new I(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((I) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28459a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                this.f28459a = 1;
                if (X.b(1000L, this) == e8) {
                    return e8;
                }
            }
            MainActivity mainActivity = MainActivity.this;
            this.f28459a = 2;
            if (mainActivity.G7(this) == e8) {
                return e8;
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28461a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f28463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(K k8, P5.d dVar) {
            super(2, dVar);
            this.f28463c = k8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new J(this.f28463c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28461a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f30034b;
                MainActivity mainActivity = MainActivity.this;
                K k8 = this.f28463c;
                this.f28461a = 1;
                if (aVar.b(mainActivity, k8, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class K implements W4.I {
        K() {
        }

        @Override // W4.I
        public void a() {
            X4.Q e8 = X4.Q.f12437k.e(MainActivity.this);
            if (e8 != null && MainActivity.this.f28403D0 != null) {
                F1 f12 = MainActivity.this.f28403D0;
                AbstractC3159y.f(f12);
                f12.R0(e8);
                MainActivity.this.w7();
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2478a implements Runnable {
        public RunnableC2478a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = (LinearLayout) MainActivity.this.findViewById(R.id.ll_auto_update);
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                MainActivity.this.P6();
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2479b {
        private C2479b() {
        }

        public /* synthetic */ C2479b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2480c implements Runnable {
        public RunnableC2480c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.T6();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2481d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28467a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28468b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f28469c;

        public RunnableC2481d(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3159y.i(packagename, "packagename");
            this.f28469c = mainActivity;
            this.f28467a = i8;
            this.f28468b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment E52 = this.f28469c.E5();
            if (E52 instanceof L0) {
                this.f28469c.runOnUiThread(new L0.RunnableC1395c((L0) E52, this.f28468b, this.f28467a));
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2482e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28470a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28471b;

        public RunnableC2482e(int i8, String str) {
            this.f28470a = i8;
            this.f28471b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            O o8;
            if (this.f28471b != null) {
                C3326n.a aVar = C3326n.f34504t;
                Context baseContext = MainActivity.this.getBaseContext();
                AbstractC3159y.h(baseContext, "baseContext");
                C3326n a8 = aVar.a(baseContext);
                a8.a();
                o8 = a8.u0(this.f28471b);
                a8.g();
            } else {
                o8 = null;
            }
            MainActivity.this.E7(this.f28470a, o8);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2483f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28473a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f28474b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f28475c;

        public RunnableC2483f(MainActivity mainActivity, int i8, C1505o download) {
            AbstractC3159y.i(download, "download");
            this.f28475c = mainActivity;
            this.f28473a = i8;
            this.f28474b = download;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
        
            if (r0.i() == r5.f28474b.f()) goto L19;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                int r0 = r5.f28473a
                r1 = 202(0xca, float:2.83E-43)
                if (r0 == r1) goto La
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 != r1) goto Lf
            La:
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                r0.H7()
            Lf:
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                int r1 = r5.f28473a
                X4.o r2 = r5.f28474b
                r0.D7(r1, r2)
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                X4.o r1 = r5.f28474b
                java.lang.String r1 = r1.Y()
                r0.J7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                X4.o r1 = r5.f28474b
                java.lang.String r1 = r1.Y()
                r0.F7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                X4.o r1 = r5.f28474b
                java.lang.String r1 = r1.Y()
                r0.I7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                X4.o r1 = r5.f28474b
                java.lang.String r1 = r1.Y()
                r0.A7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                p5.f r0 = com.uptodown.activities.MainActivity.v4(r0)
                X4.o r1 = r5.f28474b
                com.uptodown.activities.MainActivity r2 = r5.f28475c
                android.widget.RelativeLayout r2 = com.uptodown.activities.MainActivity.w4(r2)
                int r3 = r5.f28473a
                com.uptodown.activities.MainActivity r4 = r5.f28475c
                r0.W(r1, r2, r3, r4)
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                androidx.fragment.app.Fragment r0 = r0.E5()
                boolean r0 = r0 instanceof U4.L0
                if (r0 != 0) goto L71
                l5.A r0 = l5.C3307A.f34473a
                java.util.ArrayList r0 = r0.d()
                java.lang.Object r0 = M5.AbstractC1246t.y0(r0)
                boolean r0 = r0 instanceof com.uptodown.activities.MainActivity
                if (r0 != 0) goto L9d
            L71:
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                androidx.fragment.app.Fragment r0 = r0.E5()
                boolean r0 = r0 instanceof U4.L0
                if (r0 == 0) goto L9f
                com.uptodown.activities.MainActivity r0 = r5.f28475c
                androidx.fragment.app.Fragment r0 = r0.E5()
                java.lang.String r1 = "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment"
                kotlin.jvm.internal.AbstractC3159y.g(r0, r1)
                U4.L0 r0 = (U4.L0) r0
                X4.h r0 = r0.I3()
                if (r0 == 0) goto L9d
                long r0 = r0.i()
                X4.o r2 = r5.f28474b
                long r2 = r2.f()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L9d
                goto L9f
            L9d:
                r0 = 1
                goto La0
            L9f:
                r0 = 0
            La0:
                com.uptodown.activities.MainActivity r1 = r5.f28475c
                int r2 = r5.f28473a
                X4.o r3 = r5.f28474b
                r1.W2(r2, r3, r0)
                if (r0 == 0) goto Lbe
                X4.o r0 = r5.f28474b
                int r0 = r0.Z()
                r1 = 100
                if (r0 != r1) goto Lbe
                l5.w r0 = l5.C3335w.f34546a
                com.uptodown.activities.MainActivity r1 = r5.f28475c
                X4.o r2 = r5.f28474b
                r0.j(r1, r2)
            Lbe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MainActivity.RunnableC2483f.run():void");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2484g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28476a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f28478c;

        public RunnableC2484g(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3159y.i(packagename, "packagename");
            this.f28478c = mainActivity;
            this.f28476a = i8;
            this.f28477b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C3326n a8 = C3326n.f34504t.a(this.f28478c);
            a8.a();
            C1505o a02 = a8.a0(this.f28477b);
            a8.g();
            this.f28478c.D7(this.f28476a, a02);
            this.f28478c.F7(this.f28477b);
            this.f28478c.I7(this.f28477b);
            this.f28478c.J7(this.f28477b);
            this.f28478c.A7(this.f28477b);
            if (this.f28478c.E5() instanceof L0) {
                if (this.f28478c.E5() instanceof L0) {
                    Fragment E52 = this.f28478c.E5();
                    AbstractC3159y.g(E52, "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment");
                    C1498h I32 = ((L0) E52).I3();
                    if (I32 != null) {
                        str = I32.y0();
                    } else {
                        str = null;
                    }
                    if (AbstractC3159y.d(str, this.f28477b)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C3335w.f34546a.k(this.f28478c, this.f28477b);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2485h implements Animation.AnimationListener {
        AnimationAnimationListenerC2485h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            int B52 = MainActivity.this.B5();
            if (B52 >= 0 && B52 < MainActivity.this.f28425X.size()) {
                RelativeLayout relativeLayout = MainActivity.this.f28427Z;
                if (relativeLayout != null) {
                    relativeLayout.removeAllViews();
                }
                RelativeLayout c8 = ((V) MainActivity.this.f28425X.get(B52)).c();
                RelativeLayout relativeLayout2 = MainActivity.this.f28427Z;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(c8);
                }
                c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_back_in));
            } else {
                ((V) MainActivity.this.f28425X.get(MainActivity.this.f28423W)).c().setVisibility(8);
                MainActivity.this.finish();
            }
            MainActivity.this.f28426Y = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            MainActivity.this.f28426Y = true;
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2486i implements Animation.AnimationListener {
        AnimationAnimationListenerC2486i() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            int F52 = MainActivity.this.F5();
            if (F52 < 0 || F52 >= MainActivity.this.f28425X.size()) {
                MainActivity.this.N6();
                return;
            }
            RelativeLayout relativeLayout = MainActivity.this.f28427Z;
            AbstractC3159y.f(relativeLayout);
            relativeLayout.removeAllViews();
            RelativeLayout c8 = ((V) MainActivity.this.f28425X.get(F52)).c();
            RelativeLayout relativeLayout2 = MainActivity.this.f28427Z;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.addView(c8);
            Bundle bundle = new Bundle();
            bundle.putString("type", ((V) MainActivity.this.f28425X.get(F52)).b());
            C3330r t22 = MainActivity.this.t2();
            if (t22 != null) {
                t22.b("wizard", bundle);
            }
            if (((V) MainActivity.this.f28425X.get(MainActivity.this.f28423W)).a() == 2 && ((V) MainActivity.this.f28425X.get(0)).a() == 1) {
                ((V) MainActivity.this.f28425X.get(0)).c().removeAllViews();
                MainActivity.this.f28425X.remove(0);
                MainActivity.this.f28423W = 0;
            }
            MainActivity.this.K7();
            c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_next_in));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2487j implements Animation.AnimationListener {
        AnimationAnimationListenerC2487j() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f28408I0;
            AbstractC3159y.f(frameLayout);
            frameLayout.removeAllViews();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2488k implements InterfaceC1490m {
        C2488k() {
        }

        @Override // W4.InterfaceC1490m
        public void a() {
            FrameLayout frameLayout = MainActivity.this.f28411L0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // W4.InterfaceC1490m
        public void b() {
            MainActivity.this.Z5();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28483a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28485a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28486b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f28487c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, T t8, P5.d dVar) {
                super(2, dVar);
                this.f28486b = mainActivity;
                this.f28487c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28486b, this.f28487c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28485a == 0) {
                    L5.t.b(obj);
                    TabLayout tabLayout = this.f28486b.f28432t0;
                    AbstractC3159y.f(tabLayout);
                    TabLayout.Tab newTab = tabLayout.newTab();
                    AbstractC3159y.h(newTab, "parentCategoriesTabsLayout!!.newTab()");
                    View inflate = LayoutInflater.from(this.f28486b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f28486b.f28428p0, false);
                    AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) inflate;
                    textView.setTypeface(E4.j.f2274g.t());
                    textView.setText(this.f28486b.getString(R.string.for_you_category));
                    newTab.setCustomView(textView);
                    newTab.setTag(kotlin.coroutines.jvm.internal.b.c(0));
                    TabLayout tabLayout2 = this.f28486b.f28432t0;
                    AbstractC3159y.f(tabLayout2);
                    tabLayout2.addTab(newTab);
                    Iterator it = ((ArrayList) this.f28487c.f33761a).iterator();
                    while (it.hasNext()) {
                        C1501k c1501k = (C1501k) it.next();
                        TabLayout tabLayout3 = this.f28486b.f28432t0;
                        AbstractC3159y.f(tabLayout3);
                        TabLayout.Tab newTab2 = tabLayout3.newTab();
                        AbstractC3159y.h(newTab2, "parentCategoriesTabsLayout!!.newTab()");
                        View inflate2 = LayoutInflater.from(this.f28486b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f28486b.f28428p0, false);
                        AbstractC3159y.g(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView2 = (TextView) inflate2;
                        textView2.setTypeface(E4.j.f2274g.u());
                        textView2.setText(c1501k.f());
                        newTab2.setCustomView(textView2);
                        newTab2.setTag(c1501k);
                        TabLayout tabLayout4 = this.f28486b.f28432t0;
                        AbstractC3159y.f(tabLayout4);
                        tabLayout4.addTab(newTab2);
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements TabLayout.OnTabSelectedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MainActivity f28488a;

            b(MainActivity mainActivity) {
                this.f28488a = mainActivity;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                AbstractC3159y.i(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                AbstractC3159y.i(tab, "tab");
                TabLayout tabLayout = this.f28488a.f28432t0;
                AbstractC3159y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3159y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3159y.h(findViewById, "parentCategoriesTabsLayo…e_header_parent_category)");
                ((TextView) findViewById).setTypeface(E4.j.f2274g.t());
                this.f28488a.q7();
                S0 s02 = this.f28488a.f28402C0;
                if (s02 != null) {
                    s02.B();
                }
                if (AbstractC3159y.d(tab.getTag(), 0)) {
                    this.f28488a.R7();
                    return;
                }
                Object tag = tab.getTag();
                AbstractC3159y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                C1501k c1501k = (C1501k) tag;
                if (c1501k.c() != 523) {
                    this.f28488a.f28412M0 = tab.getPosition();
                }
                this.f28488a.T7(c1501k);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                AbstractC3159y.i(tab, "tab");
                TabLayout tabLayout = this.f28488a.f28432t0;
                AbstractC3159y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3159y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3159y.h(findViewById, "parentCategoriesTabsLayo…e_header_parent_category)");
                ((TextView) findViewById).setTypeface(E4.j.f2274g.u());
            }
        }

        l(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28483a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                T t8 = new T();
                t8.f33761a = new ArrayList();
                C3326n a8 = C3326n.f34504t.a(MainActivity.this);
                a8.a();
                X4.J s02 = a8.s0("categories");
                if (s02 != null && s02.a()) {
                    t8.f33761a = C1501k.b.b(C1501k.f12634g, s02.b(), 0, 2, null);
                } else {
                    X4.I p8 = new C3312F(MainActivity.this).p();
                    if (p8.f()) {
                        C1501k.b bVar = C1501k.f12634g;
                        String d8 = p8.d();
                        AbstractC3159y.f(d8);
                        t8.f33761a = C1501k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3159y.f(d9);
                        X4.J j8 = new X4.J("categories", d9);
                        a8.L("categories");
                        a8.O0(j8);
                    }
                }
                a8.g();
                if (!((Collection) t8.f33761a).isEmpty()) {
                    J0 c8 = C2812b0.c();
                    a aVar = new a(MainActivity.this, t8, null);
                    this.f28483a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            TabLayout tabLayout = MainActivity.this.f28432t0;
            AbstractC3159y.f(tabLayout);
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b(MainActivity.this));
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements W4.r {
        m() {
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (MainActivity.this.S5()) {
                MainActivity.this.O7(appInfo, 0);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements Animation.AnimationListener {
        n() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f28410K0;
            AbstractC3159y.f(frameLayout);
            frameLayout.removeAllViews();
            MainActivity.this.f28410K0 = null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28491a;

        /* loaded from: classes4.dex */
        public static final class a implements W4.p {
            a() {
            }

            @Override // W4.p
            public void a() {
            }

            @Override // W4.p
            public void b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28493a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f28494b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity, P5.d dVar) {
                super(2, dVar);
                this.f28494b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f28494b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28493a == 0) {
                    L5.t.b(obj);
                    this.f28494b.Z5();
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        o(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new o(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1500j d8;
            Object e8 = Q5.b.e();
            int i8 = this.f28491a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    d8 = C1500j.f12630n.d(MainActivity.this);
                    if (d8 == null && !d8.d()) {
                        J0 c8 = C2812b0.c();
                        b bVar = new b(MainActivity.this, null);
                        this.f28491a = 2;
                        if (AbstractC2825i.g(c8, bVar, this) == e8) {
                            return e8;
                        }
                    } else {
                        MainActivity mainActivity = MainActivity.this;
                        new S4.b(mainActivity, mainActivity.f28416Q0, LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                        new S4.e(MainActivity.this, new a(), LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                    }
                }
            } else {
                L5.t.b(obj);
                X4.Q e9 = X4.Q.f12437k.e(MainActivity.this);
                if (e9 == null || !e9.G()) {
                    this.f28491a = 1;
                    if (X.b(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, this) == e8) {
                        return e8;
                    }
                    d8 = C1500j.f12630n.d(MainActivity.this);
                    if (d8 == null) {
                    }
                    MainActivity mainActivity2 = MainActivity.this;
                    new S4.b(mainActivity2, mainActivity2.f28416Q0, LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                    new S4.e(MainActivity.this, new a(), LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                }
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements InterfaceC2774b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1500j f28495a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f28496b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f28497c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImageView f28498d;

        p(C1500j c1500j, MainActivity mainActivity, View view, ImageView imageView) {
            this.f28495a = c1500j;
            this.f28496b = mainActivity;
            this.f28497c = view;
            this.f28498d = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ImageView ivBanner, C1500j c1500j, MainActivity this$0) {
            AbstractC3159y.i(ivBanner, "$ivBanner");
            AbstractC3159y.i(this$0, "this$0");
            if (new C3323k().p(ivBanner)) {
                c1500j.j(this$0);
            }
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception exc) {
            this.f28495a.g(this.f28496b);
            FrameLayout frameLayout = this.f28496b.f28411L0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            this.f28495a.h(this.f28496b);
            FrameLayout frameLayout = this.f28496b.f28411L0;
            if (frameLayout != null) {
                frameLayout.addView(this.f28497c);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f28498d;
            final C1500j c1500j = this.f28495a;
            final MainActivity mainActivity = this.f28496b;
            handler.postDelayed(new Runnable() { // from class: A4.j1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.p.d(imageView, c1500j, mainActivity);
                }
            }, 500L);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends OnBackPressedCallback {
        q() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            RelativeLayout relativeLayout = MainActivity.this.f28414O0;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                C3608f c3608f = MainActivity.this.f28413N0;
                MainActivity mainActivity = MainActivity.this;
                RelativeLayout relativeLayout2 = mainActivity.f28414O0;
                AbstractC3159y.f(relativeLayout2);
                c3608f.f(mainActivity, relativeLayout2);
                return;
            }
            boolean popBackStackImmediate = MainActivity.this.getSupportFragmentManager().popBackStackImmediate();
            int backStackEntryCount = MainActivity.this.getSupportFragmentManager().getBackStackEntryCount();
            if (popBackStackImmediate && backStackEntryCount >= 0) {
                if (MainActivity.this.E5() instanceof L0) {
                    RelativeLayout G52 = MainActivity.this.G5();
                    if (G52 != null) {
                        G52.setVisibility(0);
                        return;
                    }
                    return;
                }
                RelativeLayout G53 = MainActivity.this.G5();
                if (G53 != null) {
                    G53.setVisibility(8);
                }
                if (MainActivity.this.E5() == null || (MainActivity.this.E5() instanceof S0) || (MainActivity.this.E5() instanceof T0)) {
                    TabLayout tabLayout = MainActivity.this.f28438z0;
                    if (tabLayout == null || tabLayout.getSelectedTabPosition() != 2) {
                        MainActivity.this.q7();
                        return;
                    }
                    return;
                }
                return;
            }
            RelativeLayout G54 = MainActivity.this.G5();
            if (G54 != null) {
                G54.setVisibility(8);
            }
            int size = MainActivity.this.f28404E0.size();
            if (size > 0) {
                Fragment fragment = (Fragment) AbstractC1246t.y0(MainActivity.this.f28404E0);
                MainActivity.this.f28404E0.remove(size - 1);
                if (fragment instanceof T0) {
                    T0 t02 = (T0) fragment;
                    if (t02.r() != null) {
                        C1501k r8 = t02.r();
                        AbstractC3159y.f(r8);
                        if (r8.c() == 523) {
                            MainActivity.this.r5(1);
                            return;
                        }
                    }
                    MainActivity.this.R7();
                    return;
                }
                if (!MainActivity.this.S5()) {
                    MainActivity.this.finish();
                    return;
                }
                if (MainActivity.this.f28427Z != null) {
                    RelativeLayout relativeLayout3 = MainActivity.this.f28427Z;
                    AbstractC3159y.f(relativeLayout3);
                    if (relativeLayout3.getVisibility() == 0) {
                        MainActivity.this.o5();
                        return;
                    }
                }
                ViewPager2 viewPager2 = MainActivity.this.f28434v0;
                if (viewPager2 != null && viewPager2.getCurrentItem() == 0) {
                    MainActivity.this.finish();
                    return;
                } else {
                    MainActivity.this.r5(0);
                    return;
                }
            }
            if (!MainActivity.this.S5()) {
                MainActivity.this.finish();
                return;
            }
            if (MainActivity.this.f28427Z != null) {
                RelativeLayout relativeLayout4 = MainActivity.this.f28427Z;
                AbstractC3159y.f(relativeLayout4);
                if (relativeLayout4.getVisibility() == 0) {
                    MainActivity.this.o5();
                    return;
                }
            }
            ViewPager2 viewPager22 = MainActivity.this.f28434v0;
            if (viewPager22 != null && viewPager22.getCurrentItem() == 0) {
                MainActivity.this.finish();
            } else {
                MainActivity.this.r5(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28500a;

        r(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new r(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28500a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                MainActivity mainActivity = MainActivity.this;
                this.f28500a = 1;
                if (mainActivity.C5(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements W4.r {
        s() {
        }

        @Override // W4.r
        public void c(int i8) {
            MainActivity.this.f28406G0 = -1L;
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            MainActivity.this.O7(appInfo, 1);
            MainActivity.this.f28406G0 = -1L;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28503a;

        t(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new t(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28503a == 0) {
                L5.t.b(obj);
                Fragment E52 = MainActivity.this.E5();
                if (E52 instanceof L0) {
                    ((L0) E52).O5();
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class u implements Animation.AnimationListener {
        u() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            MainActivity.this.J5();
            MainActivity.this.M6();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class v implements TabLayout.OnTabSelectedListener {
        v() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            V0 v02;
            AbstractC3159y.i(tab, "tab");
            if (tab.getPosition() == 0) {
                if (MainActivity.this.f28402C0 != null) {
                    MainActivity.this.R7();
                    MainActivity.this.q7();
                    S0 s02 = MainActivity.this.f28402C0;
                    AbstractC3159y.f(s02);
                    s02.B();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 1) {
                if (MainActivity.this.f28400A0 != null) {
                    MainActivity.this.q7();
                    T0 t02 = MainActivity.this.f28400A0;
                    AbstractC3159y.f(t02);
                    t02.s();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 2 && (v02 = MainActivity.this.f28401B0) != null) {
                v02.F();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            AbstractC3159y.i(tab, "tab");
            ViewPager2 viewPager2 = MainActivity.this.f28434v0;
            AbstractC3159y.f(viewPager2);
            viewPager2.setCurrentItem(tab.getPosition(), false);
            MainActivity.this.L6();
            TabLayout tabLayout = MainActivity.this.f28432t0;
            if (tabLayout != null) {
                tabLayout.setVisibility(0);
            }
            MainActivity.this.U2();
            MainActivity.this.q7();
            MainActivity.this.I5();
            int position = tab.getPosition();
            if (position == 0) {
                TabLayout tabLayout2 = MainActivity.this.f28432t0;
                AbstractC3159y.f(tabLayout2);
                if (tabLayout2.getSelectedTabPosition() != 0) {
                    TabLayout tabLayout3 = MainActivity.this.f28432t0;
                    AbstractC3159y.f(tabLayout3);
                    TabLayout tabLayout4 = MainActivity.this.f28432t0;
                    AbstractC3159y.f(tabLayout4);
                    tabLayout3.selectTab(tabLayout4.getTabAt(MainActivity.this.f28412M0));
                } else {
                    MainActivity.this.R7();
                }
                MainActivity.this.h7();
                return;
            }
            if (position == 1) {
                TabLayout tabLayout5 = MainActivity.this.f28432t0;
                AbstractC3159y.f(tabLayout5);
                int tabCount = tabLayout5.getTabCount();
                int i8 = 0;
                for (int i9 = 0; i9 < tabCount; i9++) {
                    TabLayout tabLayout6 = MainActivity.this.f28432t0;
                    AbstractC3159y.f(tabLayout6);
                    TabLayout.Tab tabAt = tabLayout6.getTabAt(i9);
                    AbstractC3159y.f(tabAt);
                    if (tabAt.getTag() instanceof C1501k) {
                        Object tag = tabAt.getTag();
                        AbstractC3159y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                        if (((C1501k) tag).c() == 523) {
                            i8 = i9;
                        }
                    }
                }
                TabLayout tabLayout7 = MainActivity.this.f28432t0;
                AbstractC3159y.f(tabLayout7);
                TabLayout tabLayout8 = MainActivity.this.f28432t0;
                AbstractC3159y.f(tabLayout8);
                tabLayout7.selectTab(tabLayout8.getTabAt(i8));
                return;
            }
            if (position == 2) {
                MainActivity.this.K5();
                TabLayout tabLayout9 = MainActivity.this.f28432t0;
                if (tabLayout9 != null) {
                    tabLayout9.setVisibility(8);
                    return;
                }
                return;
            }
            MainActivity.this.v2();
            MainActivity.this.K5();
            TabLayout tabLayout10 = MainActivity.this.f28432t0;
            if (tabLayout10 != null) {
                tabLayout10.setVisibility(8);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            AbstractC3159y.i(tab, "tab");
        }
    }

    /* loaded from: classes4.dex */
    public static final class w extends FragmentStateAdapter {
        w(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        MainActivity.this.f28403D0 = new F1();
                        F1 f12 = MainActivity.this.f28403D0;
                        AbstractC3159y.f(f12);
                        return f12;
                    }
                    C1501k c1501k = new C1501k(0, null, null, 7, null);
                    c1501k.Q(-1);
                    c1501k.T(MainActivity.this.getString(R.string.top_downloads_title));
                    MainActivity.this.f28401B0 = V0.f11523i.a(c1501k);
                    V0 v02 = MainActivity.this.f28401B0;
                    AbstractC3159y.f(v02);
                    return v02;
                }
                C1501k c1501k2 = new C1501k(0, null, null, 7, null);
                c1501k2.Q(523);
                c1501k2.T(MainActivity.this.getString(R.string.top_games_title));
                MainActivity.this.f28400A0 = T0.f11495n.a(c1501k2);
                T0 t02 = MainActivity.this.f28400A0;
                AbstractC3159y.f(t02);
                return t02;
            }
            MainActivity.this.f28402C0 = new S0();
            S0 s02 = MainActivity.this.f28402C0;
            AbstractC3159y.f(s02);
            return s02;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MainActivity.this.f28407H0;
        }
    }

    /* loaded from: classes4.dex */
    public static final class x implements W4.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f28508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f28509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O f28510c;

        x(TextView textView, MainActivity mainActivity, O o8) {
            this.f28508a = textView;
            this.f28509b = mainActivity;
            this.f28510c = o8;
        }

        @Override // W4.r
        public void c(int i8) {
            this.f28508a.setText(this.f28509b.getResources().getString(R.string.msg_no_version_details, this.f28509b.getResources().getString(R.string.app_name) + " v." + this.f28510c.z()));
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && t02.length() != 0) {
                this.f28508a.setText(appInfo.t0());
                return;
            }
            this.f28508a.setText(this.f28509b.getResources().getString(R.string.msg_no_version_details, this.f28509b.getResources().getString(R.string.app_name) + " v." + this.f28510c.z()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class y implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f28511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f28512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f28513c;

        y(ImageView imageView, Animation animation, ImageView imageView2) {
            this.f28511a = imageView;
            this.f28512b = animation;
            this.f28513c = imageView2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(ImageView imageView, Animation animation, ImageView imageView2, Animation animation2) {
            imageView.startAnimation(animation);
            imageView2.startAnimation(animation2);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(final Animation animation) {
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f28511a;
            final Animation animation2 = this.f28512b;
            final ImageView imageView2 = this.f28513c;
            handler.postDelayed(new Runnable() { // from class: A4.k1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.y.b(imageView, animation2, imageView2, animation);
                }
            }, 1500L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class z extends ClickableSpan {
        z() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(E4.j.f2274g.t());
            ds.setUnderlineText(false);
        }
    }

    public MainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.z0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.A5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…ing(this)\n        }\n    }");
        this.f28417R0 = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.A0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.M7(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResul…tivity, callback) }\n    }");
        this.f28418S0 = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.B0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.Y6(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult3, "registerForActivityResul…        }\n        }\n    }");
        this.f28419T0 = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.C0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.C6(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult4, "registerForActivityResul…lse -> {}\n        }\n    }");
        this.f28420U0 = registerForActivityResult4;
        this.f28422V0 = new q();
        ActivityResultLauncher registerForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.D0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.Q5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult5, "registerForActivityResul…        }\n        }\n    }");
        this.f28424W0 = registerForActivityResult5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A5(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.O2();
            UptodownApp.a.N0(UptodownApp.f28003B, this$0, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.J6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B5() {
        int i8 = this.f28423W;
        if (i8 <= 0 || i8 >= this.f28425X.size()) {
            return -1;
        }
        int i9 = this.f28423W - 1;
        this.f28423W = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.t4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C5(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new l(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(MainActivity this$0, ActivityResult activityResult) {
        X4.Q i32;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1 && (i32 = this$0.i3()) != null) {
            if (this$0.f28427Z != null) {
                int size = this$0.f28425X.size();
                int i8 = this$0.f28423W;
                if (size > i8 && ((V) this$0.f28425X.get(i8)).a() == 5) {
                    this$0.p5();
                }
            }
            UptodownApp.a aVar = UptodownApp.f28003B;
            aVar.j0(this$0);
            aVar.i0(this$0);
            F1 f12 = this$0.f28403D0;
            if (f12 != null) {
                AbstractC3159y.f(f12);
                f12.R0(i32);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D6(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E6(MainActivity this$0, View view) {
        Integer num;
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f28003B.a0()) {
            TabLayout tabLayout = this$0.f28438z0;
            if (tabLayout != null) {
                num = Integer.valueOf(tabLayout.getSelectedTabPosition());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                S0 s02 = this$0.f28402C0;
                if (s02 != null) {
                    s02.B();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 1) {
                S0 s03 = this$0.f28402C0;
                if (s03 != null) {
                    s03.B();
                }
                this$0.r5(0);
                T0 t02 = this$0.f28400A0;
                if (t02 != null) {
                    t02.s();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 2) {
                S0 s04 = this$0.f28402C0;
                if (s04 != null) {
                    s04.B();
                }
                this$0.r5(0);
                V0 v02 = this$0.f28401B0;
                if (v02 != null) {
                    v02.F();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 3) {
                S0 s05 = this$0.f28402C0;
                if (s05 != null) {
                    s05.B();
                }
                this$0.r5(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F5() {
        int i8 = this.f28423W;
        if (i8 >= 0 && i8 < this.f28425X.size() - 1) {
            int i9 = this.f28423W + 1;
            this.f28423W = i9;
            return i9;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SearchActivity.class), UptodownApp.f28003B.a(this$0));
        this$0.N5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.r7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G7(P5.d dVar) {
        Q q8 = new Q();
        Object g8 = AbstractC2825i.g(C2812b0.b(), new H(new Q(), q8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    private final Bitmap H5(Bitmap bitmap, int i8) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3159y.h(createBitmap, "createBitmap(bitmap.widt…height, Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f8 = i8;
        paint.setAntiAlias(true);
        canvas.drawRoundRect(rectF, f8, f8, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H6(final MainActivity this$0) {
        AbstractC3159y.i(this$0, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: A4.X0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.I6(MainActivity.this);
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I5() {
        FrameLayout frameLayout = this.f28411L0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f28411L0;
                AbstractC3159y.f(frameLayout2);
                frameLayout2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I6(MainActivity this$0) {
        AbstractC3159y.i(this$0, "this$0");
        ProgressBar progressBar = (ProgressBar) this$0.findViewById(R.id.pb_splash);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J5() {
        RelativeLayout relativeLayout = this.f28421V;
        if (relativeLayout != null) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            RelativeLayout relativeLayout2 = this.f28421V;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            this.f28421V = null;
        }
    }

    private final void J6() {
        this.f28417R0.launch(new Intent(this, (Class<?>) GdprPrivacySettings.class), UptodownApp.f28003B.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K5() {
        AppBarLayout appBarLayout = this.f28429q0;
        AbstractC3159y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f28429q0;
        AbstractC3159y.f(appBarLayout2);
        appBarLayout2.setExpanded(false);
        TabLayout tabLayout = this.f28432t0;
        AbstractC3159y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    private final void K6() {
        String string = getString(R.string.tos_title);
        AbstractC3159y.h(string, "getString(R.string.tos_title)");
        String string2 = getString(R.string.url_privacy);
        AbstractC3159y.h(string2, "getString(R.string.url_privacy)");
        new C3323k().q(this, string2, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K7() {
        if (this.f28427Z != null && this.f28423W >= 0) {
            int size = this.f28425X.size();
            int i8 = this.f28423W;
            if (size > i8 && ((V) this.f28425X.get(i8)).a() == 4 && W() && V() && SettingsPreferences.f29323b.P(this)) {
                ((TextView) findViewById(R.id.tv_next_wp)).setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
                ((TextView) findViewById(R.id.tv_next_wp)).setTextColor(ContextCompat.getColor(this, R.color.text_color_wizard_button));
            }
        }
    }

    private final void L5() {
        AppBarLayout appBarLayout = this.f28429q0;
        AbstractC3159y.f(appBarLayout);
        appBarLayout.setVisibility(8);
        TabLayout tabLayout = this.f28432t0;
        AbstractC3159y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    private final void L7() {
        TextView textView = (TextView) findViewById(R.id.tv_accept_wizard_welcome);
        if (textView != null) {
            textView.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
        }
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    private final void M5(Bundle bundle) {
        FrameLayout frameLayout = this.f28410K0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                new C3330r(this).b("turbo_popup", bundle);
                if (SettingsPreferences.f29323b.N(this) && !UptodownApp.f28003B.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.popup_turbo_out);
                    loadAnimation.setAnimationListener(new n());
                    FrameLayout frameLayout2 = this.f28410K0;
                    AbstractC3159y.f(frameLayout2);
                    frameLayout2.startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout3 = this.f28410K0;
                AbstractC3159y.f(frameLayout3);
                frameLayout3.removeAllViews();
                this.f28410K0 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M6() {
        if (!X5()) {
            u5();
            w7();
            n7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M7(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C2812b0.b(), null, new J(new K(), null), 2, null);
    }

    private final void N5() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "ignored");
        v5(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "ignored");
        M5(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N6() {
        if (!X5()) {
            return;
        }
        Iterator it = this.f28425X.iterator();
        while (it.hasNext()) {
            ((V) it.next()).c().removeAllViews();
        }
        RelativeLayout relativeLayout = this.f28427Z;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f28427Z;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
        }
        this.f28427Z = null;
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        boolean p02 = aVar.p0(4, this);
        boolean p03 = aVar.p0(5, this);
        if (p02 && p03) {
            aVar.m1(this, true);
        }
        Y5();
        M6();
    }

    private final void O5() {
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        String e8 = aVar.e(this);
        if (e8 != null) {
            C1498h c1498h = new C1498h();
            c1498h.t1(Long.parseLong(e8));
            X2(c1498h);
            aVar.x0(this, null);
            return;
        }
        if (!aVar.o0(this)) {
            aVar.b1(this, System.currentTimeMillis());
            RelativeLayout relativeLayout = this.f28427Z;
            AbstractC3159y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f28427Z;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: A4.Y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.P5(view);
                }
            });
            if (U()) {
                V1();
            } else {
                o0();
            }
            if (aVar.p0(1, this) && aVar.V(this)) {
                c6();
                if (!aVar.p0(4, this)) {
                    p6();
                }
                if (!aVar.p0(5, this)) {
                    k6();
                }
            } else {
                x6();
            }
            this.f28423W = 0;
            RelativeLayout relativeLayout3 = this.f28427Z;
            if (relativeLayout3 != null) {
                relativeLayout3.addView(((V) this.f28425X.get(0)).c());
                return;
            }
            return;
        }
        V1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q5(MainActivity this$0, ActivityResult activityResult) {
        String str;
        Bundle extras;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 10) {
            Intent data = activityResult.getData();
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("realPath");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                AbstractActivityC2489a.A2(this$0, new File(str), null, 2, null);
            }
        }
    }

    private final void Q6() {
        if (this.f28421V != null) {
            if (SettingsPreferences.f29323b.N(this)) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out_splash);
                loadAnimation.setAnimationListener(new u());
                RelativeLayout relativeLayout = this.f28421V;
                if (relativeLayout != null) {
                    relativeLayout.startAnimation(loadAnimation);
                    return;
                }
                return;
            }
            J5();
            M6();
        }
    }

    private final boolean R5() {
        TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private final void R6() {
        int i8;
        if (!isFinishing() && this.f28427Z != null && !SettingsPreferences.f29323b.o0(this)) {
            RelativeLayout relativeLayout = this.f28427Z;
            AbstractC3159y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f28427Z;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: A4.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.S6(view);
                }
            });
            Iterator it = this.f28425X.iterator();
            while (it.hasNext()) {
                V v8 = (V) it.next();
                int a8 = v8.a();
                if (a8 != 1) {
                    if (a8 != 2) {
                        if (a8 != 3) {
                            if (a8 != 4) {
                                if (a8 == 5) {
                                    v8.e(l6());
                                }
                            } else {
                                v8.e(q6());
                            }
                        } else {
                            v8.e(d6());
                        }
                    } else {
                        C1498h c1498h = this.f28433u0;
                        if (c1498h != null) {
                            AbstractC3159y.f(c1498h);
                            v8.e(g6(c1498h));
                        }
                    }
                } else {
                    v8.e(y6());
                }
            }
            if (this.f28425X.size() > 0 && (i8 = this.f28423W) >= 0 && i8 < this.f28425X.size()) {
                RelativeLayout relativeLayout3 = this.f28427Z;
                AbstractC3159y.f(relativeLayout3);
                relativeLayout3.removeAllViews();
                RelativeLayout relativeLayout4 = this.f28427Z;
                AbstractC3159y.f(relativeLayout4);
                relativeLayout4.addView(((V) this.f28425X.get(this.f28423W)).c());
                return;
            }
            N6();
            return;
        }
        N6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S5() {
        if (!R5() && !V5()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S6(View view) {
    }

    private final void S7(S0 s02) {
        TabLayout tabLayout = this.f28432t0;
        AbstractC3159y.f(tabLayout);
        TabLayout tabLayout2 = this.f28432t0;
        AbstractC3159y.f(tabLayout2);
        tabLayout.selectTab(tabLayout2.getTabAt(0));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.fl_home_fragment, s02);
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        this.f28412M0 = 0;
        r5(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T6() {
        ProgressBar progressBar = this.f28437y0;
        if (progressBar != null) {
            AbstractC3159y.f(progressBar);
            if (progressBar.getVisibility() != 0) {
                ProgressBar progressBar2 = this.f28437y0;
                AbstractC3159y.f(progressBar2);
                progressBar2.setVisibility(0);
                S0 s02 = this.f28402C0;
                if (s02 != null) {
                    s02.y();
                }
                T0 t02 = this.f28400A0;
                if (t02 != null) {
                    t02.q();
                }
                V0 v02 = this.f28401B0;
                if (v02 != null) {
                    v02.y();
                }
            }
        }
    }

    private final boolean U5() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    private final void U6() {
        w wVar = new w(getSupportFragmentManager(), getLifecycle());
        ViewPager2 viewPager2 = this.f28434v0;
        if (viewPager2 != null) {
            viewPager2.setAdapter(wVar);
        }
        TabLayout tabLayout = this.f28438z0;
        if (tabLayout != null && this.f28434v0 != null) {
            AbstractC3159y.f(tabLayout);
            ViewPager2 viewPager22 = this.f28434v0;
            AbstractC3159y.f(viewPager22);
            new TabLayoutMediator(tabLayout, viewPager22, new TabLayoutMediator.TabConfigurationStrategy() { // from class: A4.T0
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i8) {
                    MainActivity.V6(MainActivity.this, tab, i8);
                }
            }).attach();
            TabLayout tabLayout2 = this.f28438z0;
            AbstractC3159y.f(tabLayout2);
            tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new v());
        }
    }

    private final boolean U7(Intent intent) {
        if ((intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    private final boolean V5() {
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V6(MainActivity this$0, TabLayout.Tab tab, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(tab, "tab");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        tab.setContentDescription(this$0.getString(R.string.profile_title));
                        tab.setIcon(R.drawable.vector_user_profile);
                        return;
                    }
                    return;
                }
                tab.setContentDescription(this$0.getString(R.string.top_downloads_title));
                tab.setIcon(R.drawable.selector_icon_tab_top);
                return;
            }
            tab.setContentDescription(this$0.getString(R.string.top_games_title));
            tab.setIcon(R.drawable.selector_icon_tab_games);
            return;
        }
        tab.setContentDescription(this$0.getString(R.string.cd_home_tab));
        tab.setIcon(R.drawable.selector_icon_tab_home);
    }

    private final boolean W5() {
        File n8 = new C3323k().n(this);
        if (SettingsPreferences.f29323b.j0(this)) {
            W6();
            return true;
        }
        if (n8 != null) {
            d7();
            return true;
        }
        return false;
    }

    private final void W6() {
        setContentView(R.layout.status_526);
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        textView.setText(C3307A.f34473a.c(getString(R.string.msg_update_app_status_526)));
        TextView textView2 = (TextView) findViewById(R.id.tv_update_status_526);
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.X6(MainActivity.this, view);
            }
        });
    }

    private final boolean X5() {
        RelativeLayout relativeLayout = this.f28427Z;
        if (relativeLayout != null) {
            AbstractC3159y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                RelativeLayout relativeLayout2 = this.f28427Z;
                AbstractC3159y.f(relativeLayout2);
                if (relativeLayout2.getChildCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        File n8 = new C3323k().n(this$0);
        if (n8 != null) {
            UptodownApp.a.Z(UptodownApp.f28003B, n8, this$0, null, 4, null);
        } else {
            this$0.y7();
        }
    }

    private final void Y5() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y6(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != 1003) {
            if (resultCode != 1004) {
                this$0.w2();
                return;
            }
            UptodownApp.f28003B.e(this$0);
            this$0.finish();
            this$0.startActivity(this$0.getIntent());
            return;
        }
        C3326n a8 = C3326n.f34504t.a(this$0);
        a8.a();
        a8.o();
        a8.g();
        this$0.finish();
        this$0.startActivity(this$0.getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z5() {
        X4.Q e8 = X4.Q.f12437k.e(this);
        if ((e8 == null || !e8.G()) && this.f28411L0 != null) {
            final C1500j d8 = C1500j.f12630n.d(this);
            if (d8 != null && d8.a(this)) {
                View inflate = getLayoutInflater().inflate(R.layout.ad_banner_floating, (ViewGroup) this.f28411L0, false);
                View findViewById = inflate.findViewById(R.id.tv_download_banner);
                AbstractC3159y.h(findViewById, "bannerView.findViewById(R.id.tv_download_banner)");
                ((TextView) findViewById).setTypeface(E4.j.f2274g.t());
                View findViewById2 = inflate.findViewById(R.id.rl_close_banner);
                AbstractC3159y.h(findViewById2, "bannerView.findViewById(R.id.rl_close_banner)");
                ((RelativeLayout) findViewById2).setOnClickListener(new View.OnClickListener() { // from class: A4.p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.a6(C1500j.this, this, view);
                    }
                });
                View findViewById3 = inflate.findViewById(R.id.iv_banner);
                AbstractC3159y.h(findViewById3, "bannerView.findViewById(R.id.iv_banner)");
                ImageView imageView = (ImageView) findViewById3;
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                Resources resources = getResources();
                AbstractC3159y.h(resources, "resources");
                h8.l(d8.A(resources)).n(UptodownApp.f28003B.e0(this)).j(imageView, new p(d8, this, inflate, imageView));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: A4.q0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.b6(C1500j.this, this, view);
                    }
                });
                return;
            }
            FrameLayout frameLayout = this.f28411L0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a6(C1500j c1500j, MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        c1500j.f(this$0);
        FrameLayout frameLayout = this$0.f28411L0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a7(MainActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28414O0;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28413N0.E(0L);
        this$0.X2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b6(C1500j c1500j, MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f28003B.a0()) {
            c1500j.e(this$0);
            FrameLayout frameLayout = this$0.f28411L0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this$0.F2(c1500j.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b7(MainActivity this$0, C1498h appInfo, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f28414O0;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f28413N0.E(0L);
        this$0.X2(appInfo);
    }

    private final void c6() {
        n5(d6(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c7(MainActivity this$0, C1498h appInfo, Function0 updateCard, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(appInfo, "$appInfo");
        AbstractC3159y.i(updateCard, "$updateCard");
        this$0.f28413N0.g(appInfo, this$0);
        C3608f c3608f = this$0.f28413N0;
        RelativeLayout relativeLayout = this$0.f28414O0;
        AbstractC3159y.f(relativeLayout);
        c3608f.f(this$0, relativeLayout);
        updateCard.invoke();
    }

    private final RelativeLayout d6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_continue, (ViewGroup) this.f28427Z, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_continue);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_continue)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_continue_to_wizard_continue)).setTypeface(aVar.u());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_next_wizard_continue);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.e6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    private final void d7() {
        C3326n a8 = C3326n.f34504t.a(this);
        a8.a();
        String packageName = getPackageName();
        AbstractC3159y.h(packageName, "packageName");
        O u02 = a8.u0(packageName);
        a8.g();
        if (u02 != null && u02.o() == 100) {
            setContentView(R.layout.dialog_auto_update);
            TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            ((TextView) findViewById(R.id.tv_desc_auto_update)).setTypeface(aVar.u());
            ((TextView) findViewById(R.id.tv_info_auto_update)).setTypeface(aVar.u());
            TextView textView2 = (TextView) findViewById(R.id.tv_installed_version_auto_update);
            textView2.setTypeface(aVar.u());
            PackageManager packageManager = getPackageManager();
            AbstractC3159y.h(packageManager, "packageManager");
            String packageName2 = getPackageName();
            AbstractC3159y.h(packageName2, "packageName");
            textView2.setText(getString(R.string.autoupdate_installed_version, N4.q.d(packageManager, packageName2, 0).versionName));
            TextView textView3 = (TextView) findViewById(R.id.tv_update_version_auto_update);
            textView3.setTypeface(aVar.t());
            textView3.setText(getString(R.string.autoupdate_update_version, u02.z()));
            TextView textView4 = (TextView) findViewById(R.id.tv_update_size_auto_update);
            textView4.setTypeface(aVar.u());
            textView4.setText(getString(R.string.autoupdate_update_size, new N4.g().c(u02.s())));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_uptodown_version_details);
            ((TextView) findViewById(R.id.tv_uptodown_version_details_label)).setTypeface(aVar.u());
            final ImageView imageView = (ImageView) findViewById(R.id.iv_uptodown_version_details_label);
            final TextView textView5 = (TextView) findViewById(R.id.tv_uptodown_version_details);
            textView5.setTypeface(aVar.u());
            new S4.j(this, u02.n(), new x(textView5, this, u02), LifecycleOwnerKt.getLifecycleScope(this));
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: A4.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.e7(textView5, imageView, view);
                }
            });
            ((TextView) findViewById(R.id.tv_update)).setTypeface(aVar.t());
            ((RelativeLayout) findViewById(R.id.rl_update)).setOnClickListener(new View.OnClickListener() { // from class: A4.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.f7(MainActivity.this, view);
                }
            });
            ((TextView) findViewById(R.id.tv_cancel)).setTypeface(aVar.t());
            ((RelativeLayout) findViewById(R.id.rl_cancel)).setOnClickListener(new View.OnClickListener() { // from class: A4.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.g7(MainActivity.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.p5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e7(TextView textView, ImageView imageView, View view) {
        if (textView.getVisibility() == 0) {
            textView.setVisibility(8);
            imageView.setScaleY(1.0f);
        } else {
            textView.setVisibility(0);
            imageView.setScaleY(-1.0f);
        }
    }

    private final void f6(C1498h c1498h) {
        this.f28433u0 = c1498h;
        n5(g6(c1498h), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        try {
            File n8 = new C3323k().n(this$0);
            if (n8 != null && n8.exists()) {
                this$0.c2(n8);
            } else {
                this$0.P6();
            }
        } catch (Exception unused) {
            this$0.y7();
        }
    }

    private final RelativeLayout g6(C1498h c1498h) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_deep_link, (ViewGroup) this.f28427Z, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_header_feature_wizard_deep_link);
        ImageView imageView2 = (ImageView) relativeLayout.findViewById(R.id.iv_logo_wizard_deep_link);
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(c1498h.l0());
        UptodownApp.a aVar = UptodownApp.f28003B;
        l8.n(aVar.f0(this)).i(imageView2);
        com.squareup.picasso.s.h().l(c1498h.e0()).n(aVar.e0(this)).i(imageView);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_name_app_wizard_deep_link);
        j.a aVar2 = E4.j.f2274g;
        textView.setTypeface(aVar2.t());
        textView.setText(c1498h.s0());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_author_wizard_deep_link);
        textView2.setTypeface(aVar2.u());
        textView2.setText(c1498h.k());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_deep_link)).setTypeface(aVar2.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_deep_link)).setTypeface(aVar2.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_deep_link)).setTypeface(aVar2.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_deep_link)).setTypeface(aVar2.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: A4.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.h6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_deep_link)).setTypeface(aVar2.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: A4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.i6(MainActivity.this, view);
            }
        });
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_deep_link);
        textView3.setTypeface(aVar2.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.j6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.K6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h7() {
        FrameLayout frameLayout = this.f28411L0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f28411L0;
                AbstractC3159y.f(frameLayout2);
                frameLayout2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.J6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.t4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.N6();
    }

    private final void k6() {
        n5(l6(), 5);
    }

    private final boolean k7() {
        boolean z8;
        FrameLayout frameLayout;
        X4.Q e8 = X4.Q.f12437k.e(this);
        if (System.currentTimeMillis() - SettingsPreferences.f29323b.D(this) >= TimeUnit.DAYS.toMillis(14L)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (e8 != null || !z8 || (frameLayout = this.f28408I0) == null) {
            return false;
        }
        AbstractC3159y.f(frameLayout);
        frameLayout.removeAllViews();
        k0 c8 = k0.c(getLayoutInflater());
        this.f28409J0 = c8;
        AbstractC3159y.f(c8);
        TextView textView = c8.f10739h;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        c8.f10737f.setTypeface(aVar.u());
        c8.f10738g.setTypeface(aVar.t());
        c8.f10736e.setTypeface(aVar.t());
        String string = getString(R.string.reminder_login_msg_1);
        AbstractC3159y.h(string, "getString(R.string.reminder_login_msg_1)");
        List<C1503m> a8 = C1503m.f12644f.a(string, "\\[xx](.*?)\\[/xx]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new g6.j("\\[xx](.*?)\\[/xx]").g(string, A.f28439a));
        for (C1503m c1503m : a8) {
            int S7 = g6.n.S(spannableStringBuilder, c1503m.d(), 0, false, 6, null);
            int length = c1503m.d().length() + S7;
            if (S7 >= 0) {
                spannableStringBuilder.setSpan(new z(), S7, length, 33);
            }
        }
        c8.f10737f.setText(spannableStringBuilder);
        c8.f10736e.setOnClickListener(new View.OnClickListener() { // from class: A4.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.l7(MainActivity.this, view);
            }
        });
        c8.f10734c.setOnClickListener(new View.OnClickListener() { // from class: A4.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m7(MainActivity.this, view);
            }
        });
        FrameLayout frameLayout2 = this.f28408I0;
        AbstractC3159y.f(frameLayout2);
        k0 k0Var = this.f28409J0;
        AbstractC3159y.f(k0Var);
        frameLayout2.addView(k0Var.getRoot());
        SettingsPreferences.a aVar2 = SettingsPreferences.f29323b;
        if (aVar2.N(this) && !UptodownApp.f28003B.S()) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom);
            k0 k0Var2 = this.f28409J0;
            AbstractC3159y.f(k0Var2);
            k0Var2.getRoot().startAnimation(loadAnimation);
        }
        aVar2.b1(this, System.currentTimeMillis());
        return true;
    }

    private final RelativeLayout l6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_login, (ViewGroup) this.f28427Z, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wl);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(E4.j.f2274g.t());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wl);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_login_google_wl);
        if (UptodownApp.f28003B.S()) {
            textView2.setVisibility(8);
        } else {
            textView2.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.m6(MainActivity.this, view);
                }
            });
        }
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_login_email_wl);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.n6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setOnClickListener(new View.OnClickListener() { // from class: A4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.o6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) LoginActivity.class), UptodownApp.f28003B.a(this$0));
        Bundle bundle = new Bundle();
        bundle.putString("type", "continue");
        this$0.v5(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.m3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        this$0.v5(bundle);
    }

    private final void n5(RelativeLayout relativeLayout, int i8) {
        V v8 = new V();
        v8.d(i8);
        v8.e(relativeLayout);
        this.f28425X.add(v8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f28420U0.launch(new Intent(this$0, (Class<?>) LoginActivity.class), UptodownApp.f28003B.b(this$0));
    }

    private final void n7() {
        X4.Q e8 = X4.Q.f12437k.e(this);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (!SettingsPreferences.f29323b.a0(this) && e8 != null && e8.s() < 1720483200 && currentTimeMillis < 1723161600 && !isFinishing()) {
            AlertDialog r22 = r2();
            if (r22 != null) {
                r22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            String string = getString(R.string.terms_conditions_updated_popup);
            AbstractC3159y.h(string, "getString(R.string.terms_conditions_updated_popup)");
            List<C1503m> a8 = C1503m.f12644f.a(string, "\\[xx](.*?)\\[/xx]");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new g6.j("\\[xx](.*?)\\[/xx]").g(string, C.f28441a));
            for (C1503m c1503m : a8) {
                int S7 = g6.n.S(spannableStringBuilder, c1503m.d(), 0, false, 6, null);
                int length = c1503m.d().length() + S7;
                if (S7 >= 0) {
                    spannableStringBuilder.setSpan(new B(), S7, length, 33);
                }
            }
            TextView textView = c8.f10821d;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.u());
            c8.f10821d.setText(spannableStringBuilder);
            c8.f10821d.setOnClickListener(new View.OnClickListener() { // from class: A4.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.o7(MainActivity.this, view);
                }
            });
            c8.f10820c.setVisibility(8);
            c8.f10822e.setTypeface(aVar.t());
            c8.f10822e.setOnClickListener(new View.OnClickListener() { // from class: A4.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.p7(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            N2(builder.create());
            T2();
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3330r(this).b("new_terms_popup", bundle);
            SettingsPreferences.f29323b.S0(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o5() {
        int i8;
        if (!this.f28426Y && this.f28425X.size() > 0 && (i8 = this.f28423W) >= 0) {
            RelativeLayout c8 = ((V) this.f28425X.get(i8)).c();
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_back_out);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC2485h());
            c8.startAnimation(loadAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.p5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C3323k c3323k = new C3323k();
        String string = this$0.getString(R.string.url_tos);
        AbstractC3159y.h(string, "getString(R.string.url_tos)");
        c3323k.q(this$0, string, this$0.getString(R.string.tos_title));
        AlertDialog r22 = this$0.r2();
        if (r22 != null) {
            r22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "opened");
        new C3330r(this$0).b("new_terms_popup", bundle);
    }

    private final void p5() {
        SettingsPreferences.f29323b.n1(this, ((V) this.f28425X.get(this.f28423W)).a());
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_next_out);
        loadAnimation.setAnimationListener(new AnimationAnimationListenerC2486i());
        ((V) this.f28425X.get(this.f28423W)).c().startAnimation(loadAnimation);
    }

    private final void p6() {
        n5(q6(), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        if (r22 != null) {
            r22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        new C3330r(this$0).b("new_terms_popup", bundle);
    }

    private final void q5(C1498h c1498h, boolean z8, int i8) {
        C3330r t22;
        C3330r t23;
        L0 a8 = L0.f11186K.a(c1498h, c1498h.i());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.replace(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(null);
                if (z8) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        if (i8 != -1 && (t22 = t2()) != null) {
                            t22.a("app_detail_transaction_commit_" + i8);
                        }
                        String string = getString(R.string.error_generico);
                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                        d2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3159y.h(string2, "getString(R.string.error_generico)");
                d2(string2);
                return;
            }
        }
        if (i8 != -1 && (t23 = t2()) != null) {
            t23.a("container_view_not_found_" + i8);
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3159y.h(string3, "getString(R.string.error_generico)");
        d2(string3);
    }

    private final RelativeLayout q6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_permissions, (ViewGroup) this.f28427Z, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wp);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(E4.j.f2274g.t());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wp);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        RelativeLayout relativeLayout3 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_notifications_wp);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_title_wp)).setTypeface(aVar.t());
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_msg_wp)).setTypeface(aVar.u());
            SwitchCompat switchCompat = (SwitchCompat) relativeLayout.findViewById(R.id.sc_notifications_wp);
            this.f28431s0 = switchCompat;
            AbstractC3159y.f(switchCompat);
            switchCompat.setChecked(U5());
            SwitchCompat switchCompat2 = this.f28431s0;
            AbstractC3159y.f(switchCompat2);
            switchCompat2.setClickable(false);
            relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: A4.I0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.r6(MainActivity.this, view);
                }
            });
        } else if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_unknown_sources_wp);
        ((ScrollableTextView) relativeLayout.findViewById(R.id.tv_unknown_sources_title_wp)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_badge_wp)).setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_unknown_sources_msg_wp);
        textView2.setText(getString(R.string.msg_install_from_unknown_source, getString(R.string.app_name)));
        textView2.setTypeface(aVar.u());
        SwitchCompat switchCompat3 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_unknown_sources_wp);
        this.f28430r0 = switchCompat3;
        AbstractC3159y.f(switchCompat3);
        switchCompat3.setChecked(W());
        SwitchCompat switchCompat4 = this.f28430r0;
        AbstractC3159y.f(switchCompat4);
        switchCompat4.setClickable(false);
        relativeLayout4.setOnClickListener(new View.OnClickListener() { // from class: A4.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.s6(MainActivity.this, view);
            }
        });
        boolean x8 = new C3319g().x(this);
        RelativeLayout relativeLayout5 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_autoupdate_wp);
        if (i8 > 31 && !UptodownApp.f28003B.S() && !x8) {
            SettingsPreferences.a aVar2 = SettingsPreferences.f29323b;
            if (!aVar2.P(this)) {
                aVar2.y0(this, true);
            }
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_title_wp)).setTypeface(aVar.t());
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_msg_wp)).setTypeface(aVar.u());
            final SwitchCompat switchCompat5 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_autoupdate_wp);
            switchCompat5.setChecked(aVar2.O(this));
            switchCompat5.setClickable(false);
            relativeLayout5.setOnClickListener(new View.OnClickListener() { // from class: A4.K0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.t6(SwitchCompat.this, this, view);
                }
            });
        } else {
            SettingsPreferences.a aVar3 = SettingsPreferences.f29323b;
            if (!aVar3.P(this)) {
                aVar3.y0(this, false);
            }
            relativeLayout5.setVisibility(8);
            relativeLayout.findViewById(R.id.v_notifications_wp).setVisibility(4);
        }
        if (relativeLayout3.getVisibility() == 8 && relativeLayout5.getVisibility() == 8) {
            relativeLayout.findViewById(R.id.v_unknown_sources_separator).setVisibility(4);
        }
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_next_wp);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.u6(MainActivity.this, view);
            }
        });
        TextView textView4 = (TextView) relativeLayout.findViewById(R.id.tv_back_wp);
        textView4.setTypeface(aVar.t());
        textView4.setOnClickListener(new View.OnClickListener() { // from class: A4.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.v6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q7() {
        AppBarLayout appBarLayout = this.f28429q0;
        AbstractC3159y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f28429q0;
        AbstractC3159y.f(appBarLayout2);
        appBarLayout2.setExpanded(true);
        TabLayout tabLayout = this.f28438z0;
        AbstractC3159y.f(tabLayout);
        int selectedTabPosition = tabLayout.getSelectedTabPosition();
        if (selectedTabPosition != 2 && selectedTabPosition != 3) {
            TabLayout tabLayout2 = this.f28432t0;
            AbstractC3159y.f(tabLayout2);
            tabLayout2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.f28431s0;
        if (switchCompat != null && !switchCompat.isChecked()) {
            this$0.l0();
        }
    }

    private final void r7() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        AbstractC3159y.h(build, "builder.build()");
        build.intent.setData(Uri.parse(new C3323k().c(C3312F.f34485c.c(this))));
        this.f28418S0.launch(build.intent, UptodownApp.f28003B.b(this));
    }

    private final void s5() {
        long currentTimeMillis = System.currentTimeMillis();
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        if (currentTimeMillis - aVar.C(this) >= TimeUnit.DAYS.toMillis(7L)) {
            aVar.V0(this, System.currentTimeMillis());
            if (Build.VERSION.SDK_INT >= 33) {
                if (!U5()) {
                    w5();
                    return;
                }
            } else if (!aVar.b0(this)) {
                w5();
                return;
            }
        }
        k7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.f28430r0;
        if (switchCompat != null && !switchCompat.isChecked() && !this$0.W()) {
            this$0.n0();
        }
    }

    private final void s7() {
        Float f8;
        if (!isFinishing()) {
            s0 c8 = s0.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10890f;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            float height = c8.f10890f.getHeight();
            int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
            int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
            TextPaint paint = c8.f10890f.getPaint();
            if (paint != null) {
                f8 = Float.valueOf(paint.measureText(c8.f10890f.getText().toString()));
            } else {
                f8 = null;
            }
            AbstractC3159y.f(f8);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f8.floatValue(), height, new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            TextPaint paint2 = c8.f10890f.getPaint();
            if (paint2 != null) {
                paint2.setShader(linearGradient);
            }
            float dimension = getResources().getDimension(R.dimen.turbo_popup_lines_max_width);
            int i8 = getResources().getDisplayMetrics().widthPixels;
            float dimension2 = getResources().getDimension(R.dimen.margin_l);
            float f9 = (i8 - dimension2) - dimension2;
            if (dimension > f9) {
                int i9 = (int) f9;
                c8.f10888d.setMaxWidth(i9);
                c8.f10889e.setMaxWidth(i9);
            }
            c8.f10888d.setTypeface(aVar.u());
            String obj = c8.f10888d.getText().toString();
            List<C1503m> a8 = C1503m.f12644f.a(obj, "\\[xx](.*?)\\[/xx]");
            SpannableString spannableString = new SpannableString(new g6.j("\\[xx](.*?)\\[/xx]").g(obj, E.f28443a));
            for (C1503m c1503m : a8) {
                int S7 = g6.n.S(spannableString, c1503m.d(), 0, false, 6, null);
                int length = c1503m.d().length() + S7;
                if (S7 >= 0) {
                    spannableString.setSpan(new D(), S7, length, 33);
                }
            }
            c8.f10888d.setText(spannableString);
            c8.f10889e.setTypeface(E4.j.f2274g.t());
            c8.f10886b.setOnClickListener(new View.OnClickListener() { // from class: A4.E0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.t7(MainActivity.this, view);
                }
            });
            c8.f10889e.setOnClickListener(new View.OnClickListener() { // from class: A4.F0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.u7(MainActivity.this, view);
                }
            });
            Locale locale = Locale.getDefault();
            AbstractC3159y.h(locale, "getDefault()");
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
                c8.f10887c.setCropType(0);
            }
            c8.f10887c.setOnClickListener(new View.OnClickListener() { // from class: A4.H0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.v7(view);
                }
            });
            FrameLayout frameLayout = this.f28410K0;
            AbstractC3159y.f(frameLayout);
            frameLayout.addView(c8.getRoot());
            SettingsPreferences.a aVar2 = SettingsPreferences.f29323b;
            if (aVar2.N(this) && !UptodownApp.f28003B.S()) {
                c8.getRoot().startAnimation(AnimationUtils.loadAnimation(this, R.anim.popup_turbo_in));
            }
            aVar2.h1(this, System.currentTimeMillis());
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3330r(this).b("turbo_popup", bundle);
        }
    }

    private final void t4() {
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        if (!aVar.V(this)) {
            aVar.G0(this, true);
            aVar.u0(this, true);
            aVar.A0(this, true);
            aVar.e1(this, true);
            UptodownApp.a aVar2 = UptodownApp.f28003B;
            UptodownApp.a.N0(aVar2, this, false, 2, null);
            aVar2.K(this);
        }
        O2();
        if (!aVar.k0(this)) {
            new C3323k().g(r2(), this);
        } else {
            p5();
        }
    }

    private final void t5() {
        if (!C3335w.f34546a.a(this)) {
            C3326n a8 = C3326n.f34504t.a(this);
            a8.a();
            R2(a8.q0());
            a8.g();
            for (int i8 = 0; u2().size() > 0 && i8 < 2; i8++) {
                Object remove = u2().remove(0);
                AbstractC3159y.h(remove, "preregistrationsToNotify.removeAt(0)");
                K2((X4.D) remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t6(SwitchCompat switchCompat, MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        boolean z8 = !switchCompat.isChecked();
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        aVar.y0(this$0, z8);
        switchCompat.setChecked(aVar.O(this$0));
        this$0.K7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        this$0.M5(bundle);
    }

    private final void u5() {
        X4.Q e8 = X4.Q.f12437k.e(this);
        if ((e8 == null || !e8.G()) && SettingsPreferences.f29323b.H(this) == 0) {
            s7();
        } else {
            s5();
            t5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.p5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "subscribe");
        this$0.M5(bundle);
        this$0.r7();
    }

    private final void v5(Bundle bundle) {
        FrameLayout frameLayout = this.f28408I0;
        if (frameLayout != null) {
            AbstractC3159y.f(frameLayout);
            if (frameLayout.getChildCount() > 0 && this.f28409J0 != null) {
                new C3330r(this).b("login_popup", bundle);
                if (SettingsPreferences.f29323b.N(this) && !UptodownApp.f28003B.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
                    loadAnimation.setAnimationListener(new AnimationAnimationListenerC2487j());
                    k0 k0Var = this.f28409J0;
                    AbstractC3159y.f(k0Var);
                    k0Var.getRoot().startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout2 = this.f28408I0;
                AbstractC3159y.f(frameLayout2);
                frameLayout2.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.o5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7(View view) {
    }

    private final void w5() {
        if (!isFinishing()) {
            AlertDialog r22 = r2();
            if (r22 != null) {
                r22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10821d;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.u());
            c8.f10821d.setText(getString(R.string.notification_permission_request));
            c8.f10822e.setTypeface(aVar.t());
            c8.f10822e.setOnClickListener(new View.OnClickListener() { // from class: A4.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.x5(MainActivity.this, view);
                }
            });
            c8.f10820c.setTypeface(aVar.t());
            c8.f10820c.setOnClickListener(new View.OnClickListener() { // from class: A4.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.y5(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            N2(builder.create());
            if (!isFinishing() && r2() != null) {
                AlertDialog r23 = r2();
                AbstractC3159y.f(r23);
                Window window = r23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog r24 = r2();
                AbstractC3159y.f(r24);
                r24.show();
            }
        }
    }

    private final void w6() {
        p6();
        k6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
        if (Build.VERSION.SDK_INT >= 33) {
            this$0.l0();
        }
        SettingsPreferences.f29323b.U0(this$0, true);
    }

    private final void x6() {
        n5(y6(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x7(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y5(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    private final RelativeLayout y6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_welcome, (ViewGroup) this.f28427Z, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_welcome);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_welcome)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_welcome)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_welcome)).setTypeface(aVar.t());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: A4.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.z6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_welcome)).setTypeface(aVar.t());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: A4.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.A6(MainActivity.this, view);
            }
        });
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_welcome);
        textView2.setTypeface(aVar.t());
        textView2.setEnabled(false);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.B6(MainActivity.this, view);
            }
        });
        if (s2()) {
            textView2.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
            textView2.setEnabled(true);
        }
        return relativeLayout;
    }

    private final void y7() {
        String I8 = SettingsPreferences.f29323b.I(this);
        if (I8 == null) {
            I8 = "https://uptodown-android.uptodown.com/android";
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(I8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z6(MainActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.K6();
    }

    private final Bitmap z7() {
        View rootView = getWindow().getDecorView().getRootView();
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3159y.h(createBitmap, "createBitmap(view.width,…height, Config.ARGB_8888)");
        rootView.draw(new Canvas(createBitmap));
        float applyDimension = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, rootView.getWidth() / 2, rootView.getHeight() / 2, true);
        AbstractC3159y.h(createScaledBitmap, "createScaledBitmap(bitma…2, view.height / 2, true)");
        return H5(createScaledBitmap, (int) applyDimension);
    }

    public final void A7(String str) {
        if (E5() instanceof C1422b) {
            Fragment E52 = E5();
            AbstractC3159y.g(E52, "null cannot be cast to non-null type com.uptodown.fragments.AlternativesFragment");
            ((C1422b) E52).y(str);
        }
    }

    public final Object B7(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new F(str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    public final Object C7(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new G(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void D2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        super.D2(appInfo);
        if (this.f28427Z != null && this.f28423W == 0 && this.f28425X.size() == 1 && ((V) this.f28425X.get(this.f28423W)).a() == 1) {
            f6(appInfo);
            p5();
        }
    }

    public final ActivityResultLauncher D5() {
        return this.f28417R0;
    }

    public final void D7(int i8, C1505o c1505o) {
        Fragment E52 = E5();
        if (E52 instanceof L0) {
            runOnUiThread(new L0.RunnableC1397e(i8, c1505o));
        } else if (E52 instanceof F1) {
            ((F1) E52).S0();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void E2() {
        if (this.f28427Z != null && this.f28423W == 0 && this.f28425X.size() == 1 && ((V) this.f28425X.get(this.f28423W)).a() == 1) {
            L7();
            w6();
        }
    }

    public final Fragment E5() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            return (Fragment) AbstractC1246t.y0(fragments);
        }
        if (!this.f28404E0.isEmpty()) {
            return (Fragment) AbstractC1246t.y0(this.f28404E0);
        }
        return null;
    }

    public final void E7(int i8, O o8) {
        Fragment E52 = E5();
        if (o8 != null && (E52 instanceof L0)) {
            runOnUiThread(new L0.RunnableC1394b(i8, o8));
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void F2(long j8) {
        N5();
        if (j8 > 0) {
            if (this.f28406G0 == -1) {
                this.f28406G0 = j8;
                new S4.i(this, j8, new s(), LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            return;
        }
        H2();
    }

    public final void F7(String str) {
        if (E5() instanceof S0) {
            Fragment E52 = E5();
            AbstractC3159y.g(E52, "null cannot be cast to non-null type com.uptodown.fragments.HomeFragment");
            ((S0) E52).C(str);
        } else {
            S0 s02 = this.f28402C0;
            if (s02 != null) {
                AbstractC3159y.f(s02);
                s02.C(str);
            }
        }
    }

    public final RelativeLayout G5() {
        return this.f28436x0;
    }

    public final void H7() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new I(null), 3, null);
    }

    public final void I7(String str) {
        if (E5() instanceof T0) {
            Fragment E52 = E5();
            AbstractC3159y.g(E52, "null cannot be cast to non-null type com.uptodown.fragments.ParentCategoryFragment");
            ((T0) E52).t(str);
        } else {
            T0 t02 = this.f28400A0;
            if (t02 != null) {
                AbstractC3159y.f(t02);
                t02.t(str);
            }
        }
    }

    public final void J7(String str) {
        if (E5() instanceof V0) {
            Fragment E52 = E5();
            AbstractC3159y.g(E52, "null cannot be cast to non-null type com.uptodown.fragments.TopByCategoryFragment");
            ((V0) E52).I(str);
        } else {
            V0 v02 = this.f28401B0;
            if (v02 != null) {
                AbstractC3159y.f(v02);
                v02.I(str);
            }
        }
    }

    public final void L6() {
        TabLayout tabLayout;
        TabLayout tabLayout2;
        RelativeLayout relativeLayout;
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate((String) null, 1);
        }
        RelativeLayout relativeLayout2 = this.f28436x0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0 && (relativeLayout = this.f28436x0) != null) {
            relativeLayout.setVisibility(8);
        }
        q7();
        TabLayout tabLayout3 = this.f28438z0;
        if (((tabLayout3 != null && tabLayout3.getSelectedTabPosition() == 1) || ((tabLayout = this.f28438z0) != null && tabLayout.getSelectedTabPosition() == 0)) && (tabLayout2 = this.f28432t0) != null) {
            tabLayout2.setVisibility(0);
        }
    }

    public final void N7(C1495e alternatives) {
        AbstractC3159y.i(alternatives, "alternatives");
        N5();
        K5();
        C1422b a8 = C1422b.f11609f.a(alternatives);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(alternatives.c());
                if (E5() instanceof V0) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                        d2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3159y.h(string2, "getString(R.string.error_generico)");
                d2(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3159y.h(string3, "getString(R.string.error_generico)");
        d2(string3);
    }

    public final void O6() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new t(null), 2, null);
    }

    public final void O7(C1498h appInfo, int i8) {
        AbstractC3159y.i(appInfo, "appInfo");
        Fragment E52 = E5();
        RelativeLayout relativeLayout = this.f28436x0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: A4.N0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.P7(view);
                }
            });
        }
        RelativeLayout relativeLayout2 = this.f28436x0;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        if (E52 instanceof L0) {
            C1498h I32 = ((L0) E52).I3();
            if (I32 == null || I32.i() != appInfo.i()) {
                q5(appInfo, true, i8);
            }
        } else {
            q5(appInfo, false, i8);
        }
        L5();
    }

    public final void P6() {
        N6();
        if (!W5()) {
            R6();
            Q6();
            B2();
            H7();
        }
    }

    public final void Q7(C1501k category) {
        AbstractC3159y.i(category, "category");
        N5();
        K5();
        V0 a8 = V0.f11523i.a(category);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(a8.x().f());
                if (E5() instanceof V0) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                        d2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3159y.h(string2, "getString(R.string.error_generico)");
                d2(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3159y.h(string3, "getString(R.string.error_generico)");
        d2(string3);
    }

    public final void R7() {
        S0 s02 = this.f28402C0;
        if (s02 != null) {
            AbstractC3159y.f(s02);
            S7(s02);
        } else {
            S0 s03 = new S0();
            this.f28402C0 = s03;
            AbstractC3159y.f(s03);
            S7(s03);
        }
    }

    public final boolean T5() {
        RelativeLayout relativeLayout = this.f28435w0;
        if (relativeLayout != null) {
            AbstractC3159y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void T7(C1501k parentCategory) {
        T0 t02;
        AbstractC3159y.i(parentCategory, "parentCategory");
        if (parentCategory.c() == 523) {
            r5(1);
            return;
        }
        this.f28404E0 = new ArrayList();
        TabLayout tabLayout = this.f28432t0;
        AbstractC3159y.f(tabLayout);
        int tabCount = tabLayout.getTabCount();
        int i8 = 1;
        while (true) {
            t02 = null;
            Object obj = null;
            if (i8 >= tabCount) {
                break;
            }
            TabLayout tabLayout2 = this.f28432t0;
            AbstractC3159y.f(tabLayout2);
            TabLayout.Tab tabAt = tabLayout2.getTabAt(i8);
            if (tabAt != null) {
                obj = tabAt.getTag();
            }
            AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.Category");
            if (((C1501k) obj).c() == parentCategory.c()) {
                TabLayout tabLayout3 = this.f28432t0;
                AbstractC3159y.f(tabLayout3);
                TabLayout tabLayout4 = this.f28432t0;
                AbstractC3159y.f(tabLayout4);
                tabLayout3.selectTab(tabLayout4.getTabAt(i8));
            }
            i8++;
        }
        Iterator it = this.f28405F0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T0 t03 = (T0) it.next();
            if (t03.r() != null) {
                C1501k r8 = t03.r();
                AbstractC3159y.f(r8);
                if (r8.c() == parentCategory.c()) {
                    t02 = t03;
                    break;
                }
            }
        }
        if (t02 == null) {
            t02 = T0.f11495n.a(parentCategory);
            this.f28405F0.add(t02);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3159y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.fl_home_fragment, t02);
        if (this.f28404E0.size() < 1) {
            this.f28404E0.add(t02);
        }
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        r5(0);
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void V2(long j8) {
        SettingsPreferences.f29323b.x0(this, String.valueOf(j8));
        Bitmap z72 = z7();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_wizard);
        this.f28427Z = relativeLayout;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f28427Z;
        AbstractC3159y.f(relativeLayout2);
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: A4.O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.i7(view);
            }
        });
        RelativeLayout relativeLayout3 = this.f28427Z;
        AbstractC3159y.f(relativeLayout3);
        relativeLayout3.removeAllViews();
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_kill, (ViewGroup) this.f28427Z, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout4 = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout4.findViewById(R.id.tv_title_wizard_kill);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout4.findViewById(R.id.tv_slogan_to_wizard_kill);
        textView2.setTypeface(aVar.u());
        textView2.setText(getString(R.string.core_kill_this_app, getString(R.string.app_name)));
        ((TextView) relativeLayout4.findViewById(R.id.tv_slide_wizard_kill)).setTypeface(aVar.t());
        TextView textView3 = (TextView) relativeLayout4.findViewById(R.id.tv_accept_wizard_kill);
        textView3.setTypeface(aVar.u());
        textView3.setEnabled(true);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: A4.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.j7(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout5 = this.f28427Z;
        AbstractC3159y.f(relativeLayout5);
        relativeLayout5.addView(relativeLayout4);
        ImageView imageView = (ImageView) relativeLayout4.findViewById(R.id.iv_tap_screen_kill);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up_tap);
        loadAnimation.setStartOffset(500L);
        loadAnimation.setFillAfter(true);
        ImageView imageView2 = (ImageView) relativeLayout4.findViewById(R.id.iv_screenshot_kill);
        imageView2.setImageBitmap(z72);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.slide_up_out);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setStartOffset(500L);
        loadAnimation2.setAnimationListener(new y(imageView, loadAnimation, imageView2));
        imageView.startAnimation(loadAnimation);
        imageView2.startAnimation(loadAnimation2);
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void X2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        O7(appInfo, -1);
    }

    @Override // F4.r
    public void Z() {
        super.Z();
        SwitchCompat switchCompat = this.f28431s0;
        if (switchCompat != null) {
            switchCompat.setChecked(false);
        }
        K7();
    }

    public final void Z6(final C1498h appInfo, final Function0 updateCard) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f28414O0;
        if (relativeLayout != null) {
            C3608f c3608f = this.f28413N0;
            AbstractC3159y.f(relativeLayout);
            c3608f.H(appInfo, this, relativeLayout);
            this.f28413N0.m().setOnClickListener(new View.OnClickListener() { // from class: A4.a1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.a7(MainActivity.this, appInfo, view);
                }
            });
            this.f28413N0.s().setOnClickListener(new View.OnClickListener() { // from class: A4.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.b7(MainActivity.this, appInfo, view);
                }
            });
            this.f28413N0.q().setOnClickListener(new View.OnClickListener() { // from class: A4.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.c7(MainActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f28414O0;
            AbstractC3159y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f28414O0;
                AbstractC3159y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f29323b.N(this) && !UptodownApp.f28003B.S()) {
                    this.f28413N0.p().startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom));
                }
                this.f28413N0.p().setVisibility(0);
            }
            this.f28413N0.p().setVisibility(0);
        }
    }

    @Override // F4.r
    public void a0() {
        super.a0();
        SwitchCompat switchCompat = this.f28431s0;
        if (switchCompat != null) {
            switchCompat.setChecked(true);
        }
        K7();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.r
    public void e0() {
        super.e0();
        g2();
    }

    @Override // F4.r
    public void f0() {
        super.f0();
        g2();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.r
    public void g0() {
        super.g0();
        V1();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void g3() {
    }

    @Override // F4.r
    public void h0() {
        super.h0();
        V1();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    public X4.Q i3() {
        String str;
        X4.Q e8 = X4.Q.f12437k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str == null || !e8.z(this)) {
            return null;
        }
        return e8;
    }

    @Override // F4.r
    public void k0() {
        SwitchCompat switchCompat = this.f28430r0;
        if (switchCompat != null) {
            switchCompat.setChecked(W());
        }
        K7();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    public void o3() {
        F1 f12;
        if (this.f28427Z != null) {
            int size = this.f28425X.size();
            int i8 = this.f28423W;
            if (size > i8 && ((V) this.f28425X.get(i8)).a() == 5) {
                p5();
                X4.Q i32 = i3();
                if (i32 != null && (f12 = this.f28403D0) != null) {
                    f12.R0(i32);
                }
            }
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e, com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        long j8;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.main);
        this.f28408I0 = (FrameLayout) findViewById(R.id.fl_sign_in_popup);
        this.f28410K0 = (FrameLayout) findViewById(R.id.fl_uptodown_turbo_popup);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_splash);
        this.f28421V = relativeLayout;
        AbstractC3159y.f(relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: A4.G0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.D6(view);
            }
        });
        this.f28411L0 = (FrameLayout) findViewById(R.id.fl_banner_floating);
        this.f28414O0 = (RelativeLayout) findViewById(R.id.app_info_selected_popup);
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (aVar.L()) {
            RelativeLayout relativeLayout2 = this.f28421V;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.setVisibility(8);
            aVar.q0(false);
        }
        this.f28427Z = (RelativeLayout) findViewById(R.id.rl_wizard);
        w2();
        this.f28428p0 = (Toolbar) findViewById(R.id.toolbar_main);
        this.f28429q0 = (AppBarLayout) findViewById(R.id.abl_toolbar);
        this.f28432t0 = (TabLayout) findViewById(R.id.tab_parent_categories);
        ((ImageView) findViewById(R.id.home_uptodown_logo)).setOnClickListener(new View.OnClickListener() { // from class: A4.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.E6(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.rl_main_search_view);
        ((TextView) findViewById(R.id.tv_main_search_view)).setTypeface(E4.j.f2274g.u());
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: A4.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.F6(MainActivity.this, view);
            }
        });
        ((ImageView) findViewById(R.id.home_uptodown_turbo)).setOnClickListener(new View.OnClickListener() { // from class: A4.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.G6(MainActivity.this, view);
            }
        });
        String str2 = null;
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new r(null), 3, null);
        O5();
        runOnUiThread(new Runnable() { // from class: A4.f1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.H6(MainActivity.this);
            }
        });
        UptodownApp.a.N0(aVar, this, false, 2, null);
        if (!SettingsPreferences.f29323b.X(this)) {
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            new S4.n(applicationContext);
        }
        if (getIntent() != null) {
            Intent intent = getIntent();
            AbstractC3159y.h(intent, "intent");
            if (!U7(intent)) {
                Uri data = getIntent().getData();
                if (data != null) {
                    String uri = data.toString();
                    AbstractC3159y.h(uri, "uri.toString()");
                    String j9 = new N4.f().j(data, this);
                    if (j9 != null && g6.n.r(j9, ".apk", false, 2, null)) {
                        String i8 = new C3329q().i(j9);
                        if (i8 != null) {
                            G2(i8, null);
                        } else {
                            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                            intent2.setData(data);
                            this.f28424W0.launch(intent2);
                        }
                    } else if (j9 != null && N4.w.f7281b.a(j9)) {
                        Intent intent3 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                        intent3.setData(data);
                        startActivity(intent3);
                    } else if (g6.n.C(uri, "https://dw.uptodown.com/dwn/", false, 2, null)) {
                        DownloadApkWorker.a aVar2 = DownloadApkWorker.f30002k;
                        Context applicationContext2 = getApplicationContext();
                        AbstractC3159y.h(applicationContext2, "applicationContext");
                        aVar2.g(applicationContext2, uri);
                        startActivity(new Intent(this, (Class<?>) MyDownloads.class));
                    } else if (!aVar.U(this)) {
                        new S4.j(this, new C3323k().l(data), this.f28415P0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                }
                Intent intent4 = getIntent();
                if (intent4 != null && (extras = intent4.getExtras()) != null) {
                    str = extras.getString("appId");
                } else {
                    str = null;
                }
                if (str != null) {
                    try {
                        j8 = Long.parseLong(str);
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                        j8 = -1;
                    }
                    long j10 = j8;
                    if (j10 > 0) {
                        Bundle extras2 = getIntent().getExtras();
                        if (extras2 != null) {
                            str2 = extras2.getString("packageName");
                        }
                        X4.x xVar = new X4.x();
                        xVar.j(j10);
                        xVar.m(str2);
                        xVar.n(this);
                        new S4.i(this, j10, this.f28415P0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                } else {
                    X4.x b8 = X4.x.f12727f.b(this);
                    if (b8 != null && !b8.g()) {
                        new S4.i(this, b8.b(), this.f28415P0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                }
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f28422V0);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        this.f28434v0 = viewPager2;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(this.f28407H0);
        }
        ViewPager2 viewPager22 = this.f28434v0;
        if (viewPager22 != null) {
            viewPager22.setUserInputEnabled(false);
        }
        this.f28438z0 = (TabLayout) findViewById(R.id.tabs);
        this.f28436x0 = (RelativeLayout) findViewById(R.id.rl_app_detail_open);
        U6();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3159y.i(event, "event");
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!W5()) {
            H7();
            C3335w.f34546a.g(this);
            if (T5()) {
                T6();
            }
        }
    }

    public final void r5(int i8) {
        TabLayout tabLayout = this.f28438z0;
        AbstractC3159y.f(tabLayout);
        if (i8 < tabLayout.getTabCount()) {
            TabLayout tabLayout2 = this.f28438z0;
            AbstractC3159y.f(tabLayout2);
            if (tabLayout2.getSelectedTabPosition() != i8) {
                TabLayout tabLayout3 = this.f28438z0;
                AbstractC3159y.f(tabLayout3);
                TabLayout.Tab tabAt = tabLayout3.getTabAt(i8);
                if (tabAt != null) {
                    tabAt.select();
                }
            }
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void s3() {
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void t3() {
    }

    public final void w7() {
        X4.Q e8 = X4.Q.f12437k.e(this);
        if (!isFinishing() && e8 != null && e8.G()) {
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            if (!aVar.n0(this)) {
                AlertDialog r22 = r2();
                if (r22 != null) {
                    r22.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                t0 c8 = t0.c(getLayoutInflater());
                AbstractC3159y.h(c8, "inflate(layoutInflater)");
                TextView textView = c8.f10911o;
                j.a aVar2 = E4.j.f2274g;
                textView.setTypeface(aVar2.t());
                String string = getString(R.string.uptodown_turbo);
                AbstractC3159y.h(string, "getString(R.string.uptodown_turbo)");
                int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
                int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
                TextView textView2 = c8.f10911o;
                AbstractC3159y.h(textView2, "uptodownTurboWelcomeBind….tvTitleTurboWelcomePopup");
                String obj = textView2.getText().toString();
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, textView2.getPaint().measureText(string), textView2.getHeight(), new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                SpannableString spannableString = new SpannableString(obj);
                int S7 = g6.n.S(obj, string, 0, false, 6, null);
                if (S7 >= 0) {
                    spannableString.setSpan(new C3323k.a.C0782a(linearGradient, getResources().getDimension(R.dimen.font_size_26)), S7, string.length() + S7, 33);
                }
                textView2.setText(spannableString);
                Spanned c9 = C3307A.f34473a.c(getString(R.string.turbo_welcome_popup_description, getString(R.string.turbo_welcome_popup_manage_subscription)));
                String string2 = getString(R.string.turbo_welcome_popup_manage_subscription);
                AbstractC3159y.h(string2, "getString(R.string.turbo…opup_manage_subscription)");
                SpannableString spannableString2 = new SpannableString(c9);
                int S8 = g6.n.S(c9, string2, 0, false, 6, null);
                if (S8 >= 0) {
                    spannableString2.setSpan(new StyleSpan(1), S8, string2.length() + S8, 33);
                }
                c8.f10905i.setText(spannableString2);
                c8.f10905i.setTypeface(aVar2.u());
                c8.f10909m.setTypeface(aVar2.t());
                c8.f10908l.setTypeface(aVar2.u());
                c8.f10904h.setTypeface(aVar2.t());
                c8.f10903g.setTypeface(aVar2.u());
                c8.f10907k.setTypeface(aVar2.t());
                c8.f10906j.setTypeface(aVar2.u());
                c8.f10910n.setTypeface(aVar2.t());
                c8.f10910n.setOnClickListener(new View.OnClickListener() { // from class: A4.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.x7(MainActivity.this, view);
                    }
                });
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                N2(builder.create());
                if (!isFinishing() && r2() != null) {
                    AlertDialog r23 = r2();
                    AbstractC3159y.f(r23);
                    Window window = r23.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    AlertDialog r24 = r2();
                    AbstractC3159y.f(r24);
                    r24.show();
                    aVar.l1(this, true);
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "shown");
                    new C3330r(this).b("turbo_welcome_popup", bundle);
                }
            }
        }
    }

    public final void z5() {
        Q6();
        if (!X5()) {
            Y5();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void p3(X4.Q q8) {
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void r3(X4.Q q8, String str) {
    }
}
