package com.uptodown.activities;

import D4.AbstractActivityC1109k0;
import H4.j;
import P5.AbstractC1378t;
import W4.k0;
import W4.s0;
import W4.t0;
import X4.C1531b;
import X4.F1;
import X4.L0;
import X4.S0;
import X4.T0;
import X4.V0;
import Z4.InterfaceC1599m;
import a5.C1632D;
import a5.C1638e;
import a5.C1641h;
import a5.C1643j;
import a5.C1644k;
import a5.C1646m;
import a5.C1648o;
import a5.O;
import a5.V;
import a6.InterfaceC1668n;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l2.InterfaceC3309b;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.X;
import o5.C3655A;
import o5.C3660F;
import o5.C3667g;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3683w;
import s5.C4002f;

/* loaded from: classes4.dex */
public final class MainActivity extends AbstractActivityC1109k0 {

    /* renamed from: T0, reason: collision with root package name */
    public static final C2673b f29453T0 = new C2673b(null);

    /* renamed from: E0, reason: collision with root package name */
    private FrameLayout f29458E0;

    /* renamed from: F0, reason: collision with root package name */
    private k0 f29459F0;

    /* renamed from: G0, reason: collision with root package name */
    private FrameLayout f29460G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f29461H0;

    /* renamed from: I0, reason: collision with root package name */
    private int f29462I0;

    /* renamed from: K0, reason: collision with root package name */
    private RelativeLayout f29464K0;

    /* renamed from: N0, reason: collision with root package name */
    private final ActivityResultLauncher f29467N0;

    /* renamed from: O0, reason: collision with root package name */
    private final ActivityResultLauncher f29468O0;

    /* renamed from: P0, reason: collision with root package name */
    private final ActivityResultLauncher f29469P0;

    /* renamed from: Q0, reason: collision with root package name */
    private final ActivityResultLauncher f29470Q0;

    /* renamed from: R, reason: collision with root package name */
    private RelativeLayout f29471R;

    /* renamed from: R0, reason: collision with root package name */
    private final q f29472R0;

    /* renamed from: S, reason: collision with root package name */
    private int f29473S;

    /* renamed from: S0, reason: collision with root package name */
    private final ActivityResultLauncher f29474S0;

    /* renamed from: U, reason: collision with root package name */
    private boolean f29476U;

    /* renamed from: V, reason: collision with root package name */
    private RelativeLayout f29477V;

    /* renamed from: W, reason: collision with root package name */
    private Toolbar f29478W;

    /* renamed from: X, reason: collision with root package name */
    private AppBarLayout f29479X;

    /* renamed from: Y, reason: collision with root package name */
    private SwitchCompat f29480Y;

    /* renamed from: Z, reason: collision with root package name */
    private SwitchCompat f29481Z;

    /* renamed from: p0, reason: collision with root package name */
    private TabLayout f29482p0;

    /* renamed from: q0, reason: collision with root package name */
    private C1641h f29483q0;

    /* renamed from: r0, reason: collision with root package name */
    private ViewPager2 f29484r0;

    /* renamed from: s0, reason: collision with root package name */
    private RelativeLayout f29485s0;

    /* renamed from: t0, reason: collision with root package name */
    private RelativeLayout f29486t0;

    /* renamed from: u0, reason: collision with root package name */
    private ProgressBar f29487u0;

    /* renamed from: v0, reason: collision with root package name */
    private TabLayout f29488v0;

    /* renamed from: w0, reason: collision with root package name */
    private T0 f29489w0;

    /* renamed from: x0, reason: collision with root package name */
    private V0 f29490x0;

    /* renamed from: y0, reason: collision with root package name */
    private S0 f29491y0;

    /* renamed from: z0, reason: collision with root package name */
    private F1 f29492z0;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f29475T = new ArrayList();

    /* renamed from: A0, reason: collision with root package name */
    private ArrayList f29454A0 = new ArrayList();

    /* renamed from: B0, reason: collision with root package name */
    private ArrayList f29455B0 = new ArrayList();

    /* renamed from: C0, reason: collision with root package name */
    private long f29456C0 = -1;

    /* renamed from: D0, reason: collision with root package name */
    private final int f29457D0 = 4;

    /* renamed from: J0, reason: collision with root package name */
    private final C4002f f29463J0 = new C4002f();

    /* renamed from: L0, reason: collision with root package name */
    private final m f29465L0 = new m();

    /* renamed from: M0, reason: collision with root package name */
    private InterfaceC1599m f29466M0 = new C2682k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final A f29493a = new A();

        A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j6.h it) {
            AbstractC3255y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class B extends ClickableSpan {
        B() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3255y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(H4.j.f3824g.t());
            ds.setUnderlineText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f29495a = new C();

        C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j6.h it) {
            AbstractC3255y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class D extends ClickableSpan {
        D() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3255y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.turbo_text_featured));
            ds.setTypeface(H4.j.f3824g.t());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f29497a = new E();

        E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j6.h it) {
            AbstractC3255y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29498a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29500c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(String str, S5.d dVar) {
            super(2, dVar);
            this.f29500c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new F(this.f29500c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29498a == 0) {
                O5.t.b(obj);
                Fragment C52 = MainActivity.this.C5();
                if (C52 instanceof L0) {
                    ((L0) C52).Q6(this.f29500c);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((F) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class G extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29501a;

        G(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new G(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29501a == 0) {
                O5.t.b(obj);
                Fragment C52 = MainActivity.this.C5();
                if (C52 instanceof L0) {
                    MainActivity.this.runOnUiThread(new L0.RunnableC1505d());
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((G) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29503a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f29505c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f29506d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29507a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f29508b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f29509c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ MainActivity f29510d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, Q q9, MainActivity mainActivity, S5.d dVar) {
                super(2, dVar);
                this.f29508b = q8;
                this.f29509c = q9;
                this.f29510d = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29508b, this.f29509c, this.f29510d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29507a == 0) {
                    O5.t.b(obj);
                    if (this.f29508b.f34160a + this.f29509c.f34160a > 0) {
                        TabLayout tabLayout = this.f29510d.f29488v0;
                        AbstractC3255y.f(tabLayout);
                        TabLayout.Tab tabAt = tabLayout.getTabAt(3);
                        AbstractC3255y.f(tabAt);
                        return tabAt.setIcon(R.drawable.vector_user_profile_notification);
                    }
                    TabLayout tabLayout2 = this.f29510d.f29488v0;
                    AbstractC3255y.f(tabLayout2);
                    TabLayout.Tab tabAt2 = tabLayout2.getTabAt(3);
                    AbstractC3255y.f(tabAt2);
                    return tabAt2.setIcon(R.drawable.vector_user_profile);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29511a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f29512b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity, S5.d dVar) {
                super(2, dVar);
                this.f29512b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f29512b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29511a == 0) {
                    O5.t.b(obj);
                    TabLayout tabLayout = this.f29512b.f29488v0;
                    AbstractC3255y.f(tabLayout);
                    TabLayout.Tab tabAt = tabLayout.getTabAt(3);
                    AbstractC3255y.f(tabAt);
                    return tabAt.setIcon(R.drawable.vector_user_profile);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(Q q8, Q q9, S5.d dVar) {
            super(2, dVar);
            this.f29505c = q8;
            this.f29506d = q9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new H(this.f29505c, this.f29506d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int Z7;
            Object e8 = T5.b.e();
            int i8 = this.f29503a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        return (TabLayout.Tab) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
                return (TabLayout.Tab) obj;
            }
            O5.t.b(obj);
            if (MainActivity.this.getApplicationContext() != null) {
                Q q8 = this.f29505c;
                O.b bVar = O.f14043l;
                Context applicationContext = MainActivity.this.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                q8.f34160a = bVar.a(applicationContext);
                C3674n.a aVar = C3674n.f36505t;
                Context applicationContext2 = MainActivity.this.getApplicationContext();
                AbstractC3255y.h(applicationContext2, "applicationContext");
                C3674n a8 = aVar.a(applicationContext2);
                a8.a();
                ArrayList c02 = a8.c0();
                a8.l();
                Iterator it = c02.iterator();
                while (it.hasNext()) {
                    C1648o c1648o = (C1648o) it.next();
                    if (c1648o.p() == 0 && (1 > (Z7 = c1648o.Z()) || Z7 >= 100 || c1648o.z() != 0)) {
                        this.f29506d.f34160a++;
                    }
                }
                J0 c8 = C3347b0.c();
                a aVar2 = new a(this.f29506d, this.f29505c, MainActivity.this, null);
                this.f29503a = 1;
                obj = AbstractC3360i.g(c8, aVar2, this);
                if (obj == e8) {
                    return e8;
                }
                return (TabLayout.Tab) obj;
            }
            J0 c9 = C3347b0.c();
            b bVar2 = new b(MainActivity.this, null);
            this.f29503a = 2;
            obj = AbstractC3360i.g(c9, bVar2, this);
            if (obj == e8) {
                return e8;
            }
            return (TabLayout.Tab) obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29513a;

        I(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new I(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29513a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                this.f29513a = 1;
                if (X.b(1000L, this) == e8) {
                    return e8;
                }
            }
            MainActivity mainActivity = MainActivity.this;
            this.f29513a = 2;
            if (mainActivity.E7(this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((I) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29515a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f29517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(K k8, S5.d dVar) {
            super(2, dVar);
            this.f29517c = k8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new J(this.f29517c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29515a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f31066b;
                MainActivity mainActivity = MainActivity.this;
                K k8 = this.f29517c;
                this.f29515a = 1;
                if (aVar.b(mainActivity, k8, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class K implements Z4.I {
        K() {
        }

        @Override // Z4.I
        public void a() {
            a5.Q e8 = a5.Q.f14058k.e(MainActivity.this);
            if (e8 != null && MainActivity.this.f29492z0 != null) {
                F1 f12 = MainActivity.this.f29492z0;
                AbstractC3255y.f(f12);
                f12.Q0(e8);
                MainActivity.this.u7();
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2672a implements Runnable {
        public RunnableC2672a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = (LinearLayout) MainActivity.this.findViewById(R.id.ll_auto_update);
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                MainActivity.this.N6();
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2673b {
        private C2673b() {
        }

        public /* synthetic */ C2673b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2674c implements Runnable {
        public RunnableC2674c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.R6();
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2675d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29521a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f29523c;

        public RunnableC2675d(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3255y.i(packagename, "packagename");
            this.f29523c = mainActivity;
            this.f29521a = i8;
            this.f29522b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment C52 = this.f29523c.C5();
            if (C52 instanceof L0) {
                this.f29523c.runOnUiThread(new L0.RunnableC1504c((L0) C52, this.f29522b, this.f29521a));
            }
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2676e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29524a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29525b;

        public RunnableC2676e(int i8, String str) {
            this.f29524a = i8;
            this.f29525b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            O o8;
            if (this.f29525b != null) {
                C3674n.a aVar = C3674n.f36505t;
                Context baseContext = MainActivity.this.getBaseContext();
                AbstractC3255y.h(baseContext, "baseContext");
                C3674n a8 = aVar.a(baseContext);
                a8.a();
                o8 = a8.u0(this.f29525b);
                a8.l();
            } else {
                o8 = null;
            }
            MainActivity.this.C7(this.f29524a, o8);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2677f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29527a;

        /* renamed from: b, reason: collision with root package name */
        private final C1648o f29528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f29529c;

        public RunnableC2677f(MainActivity mainActivity, int i8, C1648o download) {
            AbstractC3255y.i(download, "download");
            this.f29529c = mainActivity;
            this.f29527a = i8;
            this.f29528b = download;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
        
            if (r0.i() == r5.f29528b.h()) goto L19;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                int r0 = r5.f29527a
                r1 = 202(0xca, float:2.83E-43)
                if (r0 == r1) goto La
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 != r1) goto Lf
            La:
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                r0.F7()
            Lf:
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                int r1 = r5.f29527a
                a5.o r2 = r5.f29528b
                r0.B7(r1, r2)
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                a5.o r1 = r5.f29528b
                java.lang.String r1 = r1.Y()
                r0.I7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                a5.o r1 = r5.f29528b
                java.lang.String r1 = r1.Y()
                r0.D7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                a5.o r1 = r5.f29528b
                java.lang.String r1 = r1.Y()
                r0.G7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                a5.o r1 = r5.f29528b
                java.lang.String r1 = r1.Y()
                r0.y7(r1)
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                s5.f r0 = com.uptodown.activities.MainActivity.t4(r0)
                a5.o r1 = r5.f29528b
                com.uptodown.activities.MainActivity r2 = r5.f29529c
                android.widget.RelativeLayout r2 = com.uptodown.activities.MainActivity.u4(r2)
                int r3 = r5.f29527a
                com.uptodown.activities.MainActivity r4 = r5.f29529c
                r0.W(r1, r2, r3, r4)
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                androidx.fragment.app.Fragment r0 = r0.C5()
                boolean r0 = r0 instanceof X4.L0
                if (r0 != 0) goto L71
                o5.A r0 = o5.C3655A.f36474a
                java.util.ArrayList r0 = r0.d()
                java.lang.Object r0 = P5.AbstractC1378t.y0(r0)
                boolean r0 = r0 instanceof com.uptodown.activities.MainActivity
                if (r0 != 0) goto L9d
            L71:
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                androidx.fragment.app.Fragment r0 = r0.C5()
                boolean r0 = r0 instanceof X4.L0
                if (r0 == 0) goto L9f
                com.uptodown.activities.MainActivity r0 = r5.f29529c
                androidx.fragment.app.Fragment r0 = r0.C5()
                java.lang.String r1 = "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment"
                kotlin.jvm.internal.AbstractC3255y.g(r0, r1)
                X4.L0 r0 = (X4.L0) r0
                a5.h r0 = r0.I3()
                if (r0 == 0) goto L9d
                long r0 = r0.i()
                a5.o r2 = r5.f29528b
                long r2 = r2.h()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L9d
                goto L9f
            L9d:
                r0 = 1
                goto La0
            L9f:
                r0 = 0
            La0:
                com.uptodown.activities.MainActivity r1 = r5.f29529c
                int r2 = r5.f29527a
                a5.o r3 = r5.f29528b
                r1.W2(r2, r3, r0)
                if (r0 == 0) goto Lbe
                a5.o r0 = r5.f29528b
                int r0 = r0.Z()
                r1 = 100
                if (r0 != r1) goto Lbe
                o5.w r0 = o5.C3683w.f36547a
                com.uptodown.activities.MainActivity r1 = r5.f29529c
                a5.o r2 = r5.f29528b
                r0.j(r1, r2)
            Lbe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MainActivity.RunnableC2677f.run():void");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class RunnableC2678g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29530a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29531b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MainActivity f29532c;

        public RunnableC2678g(MainActivity mainActivity, int i8, String packagename) {
            AbstractC3255y.i(packagename, "packagename");
            this.f29532c = mainActivity;
            this.f29530a = i8;
            this.f29531b = packagename;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C3674n a8 = C3674n.f36505t.a(this.f29532c);
            a8.a();
            C1648o a02 = a8.a0(this.f29531b);
            a8.l();
            this.f29532c.B7(this.f29530a, a02);
            this.f29532c.D7(this.f29531b);
            this.f29532c.G7(this.f29531b);
            this.f29532c.I7(this.f29531b);
            this.f29532c.y7(this.f29531b);
            if (this.f29532c.C5() instanceof L0) {
                if (this.f29532c.C5() instanceof L0) {
                    Fragment C52 = this.f29532c.C5();
                    AbstractC3255y.g(C52, "null cannot be cast to non-null type com.uptodown.fragments.AppDetailsFragment");
                    C1641h I32 = ((L0) C52).I3();
                    if (I32 != null) {
                        str = I32.y0();
                    } else {
                        str = null;
                    }
                    if (AbstractC3255y.d(str, this.f29531b)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C3683w.f36547a.k(this.f29532c, this.f29531b);
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2679h implements Animation.AnimationListener {
        AnimationAnimationListenerC2679h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            int z52 = MainActivity.this.z5();
            if (z52 >= 0 && z52 < MainActivity.this.f29475T.size()) {
                RelativeLayout relativeLayout = MainActivity.this.f29477V;
                if (relativeLayout != null) {
                    relativeLayout.removeAllViews();
                }
                RelativeLayout c8 = ((V) MainActivity.this.f29475T.get(z52)).c();
                RelativeLayout relativeLayout2 = MainActivity.this.f29477V;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(c8);
                }
                c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_back_in));
            } else {
                ((V) MainActivity.this.f29475T.get(MainActivity.this.f29473S)).c().setVisibility(8);
                MainActivity.this.finish();
            }
            MainActivity.this.f29476U = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            MainActivity.this.f29476U = true;
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2680i implements Animation.AnimationListener {
        AnimationAnimationListenerC2680i() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            int D52 = MainActivity.this.D5();
            if (D52 < 0 || D52 >= MainActivity.this.f29475T.size()) {
                MainActivity.this.L6();
                return;
            }
            RelativeLayout relativeLayout = MainActivity.this.f29477V;
            AbstractC3255y.f(relativeLayout);
            relativeLayout.removeAllViews();
            RelativeLayout c8 = ((V) MainActivity.this.f29475T.get(D52)).c();
            RelativeLayout relativeLayout2 = MainActivity.this.f29477V;
            AbstractC3255y.f(relativeLayout2);
            relativeLayout2.addView(c8);
            Bundle bundle = new Bundle();
            bundle.putString("type", ((V) MainActivity.this.f29475T.get(D52)).b());
            C3678r t22 = MainActivity.this.t2();
            if (t22 != null) {
                t22.b("wizard", bundle);
            }
            if (((V) MainActivity.this.f29475T.get(MainActivity.this.f29473S)).a() == 2 && ((V) MainActivity.this.f29475T.get(0)).a() == 1) {
                ((V) MainActivity.this.f29475T.get(0)).c().removeAllViews();
                MainActivity.this.f29475T.remove(0);
                MainActivity.this.f29473S = 0;
            }
            MainActivity.this.J7();
            c8.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_next_in));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class AnimationAnimationListenerC2681j implements Animation.AnimationListener {
        AnimationAnimationListenerC2681j() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f29458E0;
            AbstractC3255y.f(frameLayout);
            frameLayout.removeAllViews();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }
    }

    /* renamed from: com.uptodown.activities.MainActivity$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2682k implements InterfaceC1599m {
        C2682k() {
        }

        @Override // Z4.InterfaceC1599m
        public void a() {
            FrameLayout frameLayout = MainActivity.this.f29461H0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // Z4.InterfaceC1599m
        public void b() {
            MainActivity.this.X5();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29537a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29539a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f29540b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f29541c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainActivity mainActivity, T t8, S5.d dVar) {
                super(2, dVar);
                this.f29540b = mainActivity;
                this.f29541c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29540b, this.f29541c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29539a == 0) {
                    O5.t.b(obj);
                    TabLayout tabLayout = this.f29540b.f29482p0;
                    AbstractC3255y.f(tabLayout);
                    TabLayout.Tab newTab = tabLayout.newTab();
                    AbstractC3255y.h(newTab, "parentCategoriesTabsLayout!!.newTab()");
                    View inflate = LayoutInflater.from(this.f29540b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f29540b.f29478W, false);
                    AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) inflate;
                    textView.setTypeface(H4.j.f3824g.t());
                    textView.setText(this.f29540b.getString(R.string.for_you_category));
                    newTab.setCustomView(textView);
                    newTab.setTag(kotlin.coroutines.jvm.internal.b.c(0));
                    TabLayout tabLayout2 = this.f29540b.f29482p0;
                    AbstractC3255y.f(tabLayout2);
                    tabLayout2.addTab(newTab);
                    Iterator it = ((ArrayList) this.f29541c.f34162a).iterator();
                    while (it.hasNext()) {
                        C1644k c1644k = (C1644k) it.next();
                        TabLayout tabLayout3 = this.f29540b.f29482p0;
                        AbstractC3255y.f(tabLayout3);
                        TabLayout.Tab newTab2 = tabLayout3.newTab();
                        AbstractC3255y.h(newTab2, "parentCategoriesTabsLayout!!.newTab()");
                        View inflate2 = LayoutInflater.from(this.f29540b).inflate(R.layout.home_header_parent_category, (ViewGroup) this.f29540b.f29478W, false);
                        AbstractC3255y.g(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView2 = (TextView) inflate2;
                        textView2.setTypeface(H4.j.f3824g.u());
                        textView2.setText(c1644k.h());
                        newTab2.setCustomView(textView2);
                        newTab2.setTag(c1644k);
                        TabLayout tabLayout4 = this.f29540b.f29482p0;
                        AbstractC3255y.f(tabLayout4);
                        tabLayout4.addTab(newTab2);
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements TabLayout.OnTabSelectedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MainActivity f29542a;

            b(MainActivity mainActivity) {
                this.f29542a = mainActivity;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                AbstractC3255y.i(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                AbstractC3255y.i(tab, "tab");
                TabLayout tabLayout = this.f29542a.f29482p0;
                AbstractC3255y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3255y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3255y.h(findViewById, "parentCategoriesTabsLayo…e_header_parent_category)");
                ((TextView) findViewById).setTypeface(H4.j.f3824g.t());
                this.f29542a.o7();
                S0 s02 = this.f29542a.f29491y0;
                if (s02 != null) {
                    s02.B();
                }
                if (AbstractC3255y.d(tab.getTag(), 0)) {
                    this.f29542a.Q7();
                    return;
                }
                Object tag = tab.getTag();
                AbstractC3255y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                C1644k c1644k = (C1644k) tag;
                if (c1644k.b() != 523) {
                    this.f29542a.f29462I0 = tab.getPosition();
                }
                this.f29542a.S7(c1644k);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                AbstractC3255y.i(tab, "tab");
                TabLayout tabLayout = this.f29542a.f29482p0;
                AbstractC3255y.f(tabLayout);
                View childAt = tabLayout.getChildAt(0);
                AbstractC3255y.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((ViewGroup) childAt).getChildAt(tab.getPosition()).findViewById(R.id.tv_home_header_parent_category);
                AbstractC3255y.h(findViewById, "parentCategoriesTabsLayo…e_header_parent_category)");
                ((TextView) findViewById).setTypeface(H4.j.f3824g.u());
            }
        }

        l(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29537a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                T t8 = new T();
                t8.f34162a = new ArrayList();
                C3674n a8 = C3674n.f36505t.a(MainActivity.this);
                a8.a();
                a5.J s02 = a8.s0("categories");
                if (s02 != null && s02.a()) {
                    t8.f34162a = C1644k.b.b(C1644k.f14255g, s02.b(), 0, 2, null);
                } else {
                    a5.I p8 = new C3660F(MainActivity.this).p();
                    if (p8.f()) {
                        C1644k.b bVar = C1644k.f14255g;
                        String d8 = p8.d();
                        AbstractC3255y.f(d8);
                        t8.f34162a = C1644k.b.b(bVar, d8, 0, 2, null);
                        String d9 = p8.d();
                        AbstractC3255y.f(d9);
                        a5.J j8 = new a5.J("categories", d9);
                        a8.L("categories");
                        a8.O0(j8);
                    }
                }
                a8.l();
                if (!((Collection) t8.f34162a).isEmpty()) {
                    J0 c8 = C3347b0.c();
                    a aVar = new a(MainActivity.this, t8, null);
                    this.f29537a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            TabLayout tabLayout = MainActivity.this.f29482p0;
            AbstractC3255y.f(tabLayout);
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b(MainActivity.this));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements Z4.r {
        m() {
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (MainActivity.this.Q5()) {
                MainActivity.this.N7(appInfo, 0);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements Animation.AnimationListener {
        n() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            FrameLayout frameLayout = MainActivity.this.f29460G0;
            AbstractC3255y.f(frameLayout);
            frameLayout.removeAllViews();
            MainActivity.this.f29460G0 = null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29545a;

        /* loaded from: classes4.dex */
        public static final class a implements Z4.p {
            a() {
            }

            @Override // Z4.p
            public void a() {
            }

            @Override // Z4.p
            public void b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29547a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MainActivity f29548b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainActivity mainActivity, S5.d dVar) {
                super(2, dVar);
                this.f29548b = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f29548b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29547a == 0) {
                    O5.t.b(obj);
                    this.f29548b.X5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        o(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1643j d8;
            Object e8 = T5.b.e();
            int i8 = this.f29545a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    d8 = C1643j.f14251n.d(MainActivity.this);
                    if (d8 == null && !d8.d()) {
                        J0 c8 = C3347b0.c();
                        b bVar = new b(MainActivity.this, null);
                        this.f29545a = 2;
                        if (AbstractC3360i.g(c8, bVar, this) == e8) {
                            return e8;
                        }
                    } else {
                        MainActivity mainActivity = MainActivity.this;
                        new V4.b(mainActivity, mainActivity.f29466M0, LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                        new V4.e(MainActivity.this, new a(), LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                    }
                }
            } else {
                O5.t.b(obj);
                a5.Q e9 = a5.Q.f14058k.e(MainActivity.this);
                if (e9 == null || !e9.y()) {
                    this.f29545a = 1;
                    if (X.b(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, this) == e8) {
                        return e8;
                    }
                    d8 = C1643j.f14251n.d(MainActivity.this);
                    if (d8 == null) {
                    }
                    MainActivity mainActivity2 = MainActivity.this;
                    new V4.b(mainActivity2, mainActivity2.f29466M0, LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                    new V4.e(MainActivity.this, new a(), LifecycleOwnerKt.getLifecycleScope(MainActivity.this));
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements InterfaceC3309b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1643j f29549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f29550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29551c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ImageView f29552d;

        p(C1643j c1643j, MainActivity mainActivity, View view, ImageView imageView) {
            this.f29549a = c1643j;
            this.f29550b = mainActivity;
            this.f29551c = view;
            this.f29552d = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ImageView ivBanner, C1643j c1643j, MainActivity this$0) {
            AbstractC3255y.i(ivBanner, "$ivBanner");
            AbstractC3255y.i(this$0, "this$0");
            if (new C3671k().p(ivBanner)) {
                c1643j.j(this$0);
            }
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception exc) {
            this.f29549a.g(this.f29550b);
            FrameLayout frameLayout = this.f29550b.f29461H0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            this.f29549a.h(this.f29550b);
            FrameLayout frameLayout = this.f29550b.f29461H0;
            if (frameLayout != null) {
                frameLayout.addView(this.f29551c);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f29552d;
            final C1643j c1643j = this.f29549a;
            final MainActivity mainActivity = this.f29550b;
            handler.postDelayed(new Runnable() { // from class: D4.k1
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.p.d(imageView, c1643j, mainActivity);
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
            RelativeLayout relativeLayout = MainActivity.this.f29464K0;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                C4002f c4002f = MainActivity.this.f29463J0;
                MainActivity mainActivity = MainActivity.this;
                RelativeLayout relativeLayout2 = mainActivity.f29464K0;
                AbstractC3255y.f(relativeLayout2);
                c4002f.f(mainActivity, relativeLayout2);
                return;
            }
            boolean popBackStackImmediate = MainActivity.this.getSupportFragmentManager().popBackStackImmediate();
            int backStackEntryCount = MainActivity.this.getSupportFragmentManager().getBackStackEntryCount();
            if (popBackStackImmediate && backStackEntryCount >= 0) {
                if (MainActivity.this.C5() instanceof L0) {
                    RelativeLayout E52 = MainActivity.this.E5();
                    if (E52 != null) {
                        E52.setVisibility(0);
                        return;
                    }
                    return;
                }
                RelativeLayout E53 = MainActivity.this.E5();
                if (E53 != null) {
                    E53.setVisibility(8);
                }
                if (MainActivity.this.C5() == null || (MainActivity.this.C5() instanceof S0) || (MainActivity.this.C5() instanceof T0)) {
                    TabLayout tabLayout = MainActivity.this.f29488v0;
                    if (tabLayout == null || tabLayout.getSelectedTabPosition() != 2) {
                        MainActivity.this.o7();
                        return;
                    }
                    return;
                }
                return;
            }
            RelativeLayout E54 = MainActivity.this.E5();
            if (E54 != null) {
                E54.setVisibility(8);
            }
            int size = MainActivity.this.f29454A0.size();
            if (size > 0) {
                Fragment fragment = (Fragment) AbstractC1378t.y0(MainActivity.this.f29454A0);
                MainActivity.this.f29454A0.remove(size - 1);
                if (fragment instanceof T0) {
                    T0 t02 = (T0) fragment;
                    if (t02.r() != null) {
                        C1644k r8 = t02.r();
                        AbstractC3255y.f(r8);
                        if (r8.b() == 523) {
                            MainActivity.this.p5(1);
                            return;
                        }
                    }
                    MainActivity.this.Q7();
                    return;
                }
                if (!MainActivity.this.Q5()) {
                    MainActivity.this.finish();
                    return;
                }
                if (MainActivity.this.f29477V != null) {
                    RelativeLayout relativeLayout3 = MainActivity.this.f29477V;
                    AbstractC3255y.f(relativeLayout3);
                    if (relativeLayout3.getVisibility() == 0) {
                        MainActivity.this.m5();
                        return;
                    }
                }
                ViewPager2 viewPager2 = MainActivity.this.f29484r0;
                if (viewPager2 != null && viewPager2.getCurrentItem() == 0) {
                    MainActivity.this.finish();
                    return;
                } else {
                    MainActivity.this.p5(0);
                    return;
                }
            }
            if (!MainActivity.this.Q5()) {
                MainActivity.this.finish();
                return;
            }
            if (MainActivity.this.f29477V != null) {
                RelativeLayout relativeLayout4 = MainActivity.this.f29477V;
                AbstractC3255y.f(relativeLayout4);
                if (relativeLayout4.getVisibility() == 0) {
                    MainActivity.this.m5();
                    return;
                }
            }
            ViewPager2 viewPager22 = MainActivity.this.f29484r0;
            if (viewPager22 != null && viewPager22.getCurrentItem() == 0) {
                MainActivity.this.finish();
            } else {
                MainActivity.this.p5(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29554a;

        r(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new r(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29554a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                MainActivity mainActivity = MainActivity.this;
                this.f29554a = 1;
                if (mainActivity.A5(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements Z4.r {
        s() {
        }

        @Override // Z4.r
        public void c(int i8) {
            MainActivity.this.f29456C0 = -1L;
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            MainActivity.this.N7(appInfo, 1);
            MainActivity.this.f29456C0 = -1L;
        }
    }

    /* loaded from: classes4.dex */
    static final class t extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29557a;

        t(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new t(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29557a == 0) {
                O5.t.b(obj);
                Fragment C52 = MainActivity.this.C5();
                if (C52 instanceof L0) {
                    ((L0) C52).O5();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class u implements Animation.AnimationListener {
        u() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            MainActivity.this.H5();
            MainActivity.this.K6();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class v implements TabLayout.OnTabSelectedListener {
        v() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            V0 v02;
            AbstractC3255y.i(tab, "tab");
            if (tab.getPosition() == 0) {
                if (MainActivity.this.f29491y0 != null) {
                    MainActivity.this.Q7();
                    MainActivity.this.o7();
                    S0 s02 = MainActivity.this.f29491y0;
                    AbstractC3255y.f(s02);
                    s02.B();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 1) {
                if (MainActivity.this.f29489w0 != null) {
                    MainActivity.this.o7();
                    T0 t02 = MainActivity.this.f29489w0;
                    AbstractC3255y.f(t02);
                    t02.s();
                    return;
                }
                return;
            }
            if (tab.getPosition() == 2 && (v02 = MainActivity.this.f29490x0) != null) {
                v02.F();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            AbstractC3255y.i(tab, "tab");
            ViewPager2 viewPager2 = MainActivity.this.f29484r0;
            AbstractC3255y.f(viewPager2);
            viewPager2.setCurrentItem(tab.getPosition(), false);
            MainActivity.this.J6();
            TabLayout tabLayout = MainActivity.this.f29482p0;
            if (tabLayout != null) {
                tabLayout.setVisibility(0);
            }
            MainActivity.this.U2();
            MainActivity.this.o7();
            MainActivity.this.G5();
            int position = tab.getPosition();
            if (position == 0) {
                TabLayout tabLayout2 = MainActivity.this.f29482p0;
                AbstractC3255y.f(tabLayout2);
                if (tabLayout2.getSelectedTabPosition() != 0) {
                    TabLayout tabLayout3 = MainActivity.this.f29482p0;
                    AbstractC3255y.f(tabLayout3);
                    TabLayout tabLayout4 = MainActivity.this.f29482p0;
                    AbstractC3255y.f(tabLayout4);
                    tabLayout3.selectTab(tabLayout4.getTabAt(MainActivity.this.f29462I0));
                } else {
                    MainActivity.this.Q7();
                }
                MainActivity.this.f7();
                return;
            }
            if (position == 1) {
                TabLayout tabLayout5 = MainActivity.this.f29482p0;
                AbstractC3255y.f(tabLayout5);
                int tabCount = tabLayout5.getTabCount();
                int i8 = 0;
                for (int i9 = 0; i9 < tabCount; i9++) {
                    TabLayout tabLayout6 = MainActivity.this.f29482p0;
                    AbstractC3255y.f(tabLayout6);
                    TabLayout.Tab tabAt = tabLayout6.getTabAt(i9);
                    AbstractC3255y.f(tabAt);
                    if (tabAt.getTag() instanceof C1644k) {
                        Object tag = tabAt.getTag();
                        AbstractC3255y.g(tag, "null cannot be cast to non-null type com.uptodown.models.Category");
                        if (((C1644k) tag).b() == 523) {
                            i8 = i9;
                        }
                    }
                }
                TabLayout tabLayout7 = MainActivity.this.f29482p0;
                AbstractC3255y.f(tabLayout7);
                TabLayout tabLayout8 = MainActivity.this.f29482p0;
                AbstractC3255y.f(tabLayout8);
                tabLayout7.selectTab(tabLayout8.getTabAt(i8));
                return;
            }
            if (position == 2) {
                MainActivity.this.I5();
                TabLayout tabLayout9 = MainActivity.this.f29482p0;
                if (tabLayout9 != null) {
                    tabLayout9.setVisibility(8);
                    return;
                }
                return;
            }
            MainActivity.this.v2();
            MainActivity.this.I5();
            TabLayout tabLayout10 = MainActivity.this.f29482p0;
            if (tabLayout10 != null) {
                tabLayout10.setVisibility(8);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            AbstractC3255y.i(tab, "tab");
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
                        MainActivity.this.f29492z0 = new F1();
                        F1 f12 = MainActivity.this.f29492z0;
                        AbstractC3255y.f(f12);
                        return f12;
                    }
                    C1644k c1644k = new C1644k(0, null, null, 7, null);
                    c1644k.J(-1);
                    c1644k.U(MainActivity.this.getString(R.string.top_downloads_title));
                    MainActivity.this.f29490x0 = V0.f13193i.a(c1644k);
                    V0 v02 = MainActivity.this.f29490x0;
                    AbstractC3255y.f(v02);
                    return v02;
                }
                C1644k c1644k2 = new C1644k(0, null, null, 7, null);
                c1644k2.J(523);
                c1644k2.U(MainActivity.this.getString(R.string.top_games_title));
                MainActivity.this.f29489w0 = T0.f13165n.a(c1644k2);
                T0 t02 = MainActivity.this.f29489w0;
                AbstractC3255y.f(t02);
                return t02;
            }
            MainActivity.this.f29491y0 = new S0();
            S0 s02 = MainActivity.this.f29491y0;
            AbstractC3255y.f(s02);
            return s02;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MainActivity.this.f29457D0;
        }
    }

    /* loaded from: classes4.dex */
    public static final class x implements Z4.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f29562a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MainActivity f29563b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O f29564c;

        x(TextView textView, MainActivity mainActivity, O o8) {
            this.f29562a = textView;
            this.f29563b = mainActivity;
            this.f29564c = o8;
        }

        @Override // Z4.r
        public void c(int i8) {
            this.f29562a.setText(this.f29563b.getResources().getString(R.string.msg_no_version_details, this.f29563b.getResources().getString(R.string.app_name) + " v." + this.f29564c.x()));
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && t02.length() != 0) {
                this.f29562a.setText(appInfo.t0());
                return;
            }
            this.f29562a.setText(this.f29563b.getResources().getString(R.string.msg_no_version_details, this.f29563b.getResources().getString(R.string.app_name) + " v." + this.f29564c.x()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class y implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f29565a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f29566b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f29567c;

        y(ImageView imageView, Animation animation, ImageView imageView2) {
            this.f29565a = imageView;
            this.f29566b = animation;
            this.f29567c = imageView2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(ImageView imageView, Animation animation, ImageView imageView2, Animation animation2) {
            imageView.startAnimation(animation);
            imageView2.startAnimation(animation2);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(final Animation animation) {
            Handler handler = new Handler(Looper.getMainLooper());
            final ImageView imageView = this.f29565a;
            final Animation animation2 = this.f29566b;
            final ImageView imageView2 = this.f29567c;
            handler.postDelayed(new Runnable() { // from class: D4.l1
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
            AbstractC3255y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.main_blue));
            ds.setTypeface(H4.j.f3824g.t());
            ds.setUnderlineText(false);
        }
    }

    public MainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.A0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.y5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…ing(this)\n        }\n    }");
        this.f29467N0 = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.B0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.L7(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult2, "registerForActivityResul…tivity, callback) }\n    }");
        this.f29468O0 = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.C0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.W6(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult3, "registerForActivityResul…        }\n        }\n    }");
        this.f29469P0 = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.D0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.A6(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult4, "registerForActivityResul…lse -> {}\n        }\n    }");
        this.f29470Q0 = registerForActivityResult4;
        this.f29472R0 = new q();
        ActivityResultLauncher registerForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.E0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainActivity.O5(MainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult5, "registerForActivityResul…        }\n        }\n    }");
        this.f29474S0 = registerForActivityResult5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A5(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new l(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A6(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            if (resultCode == 1) {
                a5.Q h32 = this$0.h3();
                if (h32 != null) {
                    if (this$0.f29477V != null) {
                        int size = this$0.f29475T.size();
                        int i8 = this$0.f29473S;
                        if (size > i8 && ((V) this$0.f29475T.get(i8)).a() == 5) {
                            this$0.n5();
                        }
                    }
                    UptodownApp.a aVar = UptodownApp.f29058B;
                    aVar.j0(this$0);
                    aVar.i0(this$0);
                    F1 f12 = this$0.f29492z0;
                    if (f12 != null) {
                        AbstractC3255y.f(f12);
                        f12.Q0(h32);
                    }
                }
                this$0.H7();
                return;
            }
            return;
        }
        this$0.H7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B6(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(MainActivity this$0, View view) {
        Integer num;
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            TabLayout tabLayout = this$0.f29488v0;
            if (tabLayout != null) {
                num = Integer.valueOf(tabLayout.getSelectedTabPosition());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                S0 s02 = this$0.f29491y0;
                if (s02 != null) {
                    s02.B();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 1) {
                S0 s03 = this$0.f29491y0;
                if (s03 != null) {
                    s03.B();
                }
                this$0.p5(0);
                T0 t02 = this$0.f29489w0;
                if (t02 != null) {
                    t02.s();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 2) {
                S0 s04 = this$0.f29491y0;
                if (s04 != null) {
                    s04.B();
                }
                this$0.p5(0);
                V0 v02 = this$0.f29490x0;
                if (v02 != null) {
                    v02.F();
                    return;
                }
                return;
            }
            if (num != null && num.intValue() == 3) {
                S0 s05 = this$0.f29491y0;
                if (s05 != null) {
                    s05.B();
                }
                this$0.p5(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D5() {
        int i8 = this.f29473S;
        if (i8 >= 0 && i8 < this.f29475T.size() - 1) {
            int i9 = this.f29473S + 1;
            this.f29473S = i9;
            return i9;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SearchActivity.class), UptodownApp.f29058B.a(this$0));
        this$0.L5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.p7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E7(S5.d dVar) {
        Q q8 = new Q();
        Object g8 = AbstractC3360i.g(C3347b0.b(), new H(new Q(), q8, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    private final Bitmap F5(Bitmap bitmap, int i8) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3255y.h(createBitmap, "createBitmap(bitmap.widt…height, Config.ARGB_8888)");
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
    public static final void F6(final MainActivity this$0) {
        AbstractC3255y.i(this$0, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: D4.Y0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.G6(MainActivity.this);
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G5() {
        FrameLayout frameLayout = this.f29461H0;
        if (frameLayout != null) {
            AbstractC3255y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f29461H0;
                AbstractC3255y.f(frameLayout2);
                frameLayout2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G6(MainActivity this$0) {
        AbstractC3255y.i(this$0, "this$0");
        ProgressBar progressBar = (ProgressBar) this$0.findViewById(R.id.pb_splash);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H5() {
        RelativeLayout relativeLayout = this.f29471R;
        if (relativeLayout != null) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            RelativeLayout relativeLayout2 = this.f29471R;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            this.f29471R = null;
        }
    }

    private final void H6() {
        this.f29467N0.launch(new Intent(this, (Class<?>) GdprPrivacySettings.class), UptodownApp.f29058B.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I5() {
        AppBarLayout appBarLayout = this.f29479X;
        AbstractC3255y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f29479X;
        AbstractC3255y.f(appBarLayout2);
        appBarLayout2.setExpanded(false);
        TabLayout tabLayout = this.f29482p0;
        AbstractC3255y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    private final void I6() {
        String string = getString(R.string.tos_title);
        AbstractC3255y.h(string, "getString(R.string.tos_title)");
        String string2 = getString(R.string.url_privacy);
        AbstractC3255y.h(string2, "getString(R.string.url_privacy)");
        new C3671k().q(this, string2, string);
    }

    private final void J5() {
        AppBarLayout appBarLayout = this.f29479X;
        AbstractC3255y.f(appBarLayout);
        appBarLayout.setVisibility(8);
        TabLayout tabLayout = this.f29482p0;
        AbstractC3255y.f(tabLayout);
        tabLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J7() {
        if (this.f29477V != null && this.f29473S >= 0) {
            int size = this.f29475T.size();
            int i8 = this.f29473S;
            if (size > i8 && ((V) this.f29475T.get(i8)).a() == 4 && W() && V() && SettingsPreferences.f30353b.P(this)) {
                ((TextView) findViewById(R.id.tv_next_wp)).setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
                ((TextView) findViewById(R.id.tv_next_wp)).setTextColor(ContextCompat.getColor(this, R.color.text_color_wizard_button));
            }
        }
    }

    private final void K5(Bundle bundle) {
        FrameLayout frameLayout = this.f29460G0;
        if (frameLayout != null) {
            AbstractC3255y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                new C3678r(this).b("turbo_popup", bundle);
                if (SettingsPreferences.f30353b.N(this) && !UptodownApp.f29058B.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.popup_turbo_out);
                    loadAnimation.setAnimationListener(new n());
                    FrameLayout frameLayout2 = this.f29460G0;
                    AbstractC3255y.f(frameLayout2);
                    frameLayout2.startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout3 = this.f29460G0;
                AbstractC3255y.f(frameLayout3);
                frameLayout3.removeAllViews();
                this.f29460G0 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K6() {
        if (!V5()) {
            s5();
            u7();
            l7();
        }
    }

    private final void K7() {
        TextView textView = (TextView) findViewById(R.id.tv_accept_wizard_welcome);
        if (textView != null) {
            textView.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
        }
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    private final void L5() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "ignored");
        t5(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "ignored");
        K5(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L6() {
        if (!V5()) {
            return;
        }
        Iterator it = this.f29475T.iterator();
        while (it.hasNext()) {
            ((V) it.next()).c().removeAllViews();
        }
        RelativeLayout relativeLayout = this.f29477V;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f29477V;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
        }
        this.f29477V = null;
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        boolean p02 = aVar.p0(4, this);
        boolean p03 = aVar.p0(5, this);
        if (p02 && p03) {
            aVar.m1(this, true);
        }
        W5();
        K6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L7(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C3347b0.b(), null, new J(new K(), null), 2, null);
    }

    private final void M5() {
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        String e8 = aVar.e(this);
        if (e8 != null) {
            C1641h c1641h = new C1641h();
            c1641h.t1(Long.parseLong(e8));
            X2(c1641h);
            aVar.x0(this, null);
            return;
        }
        if (!aVar.o0(this)) {
            aVar.b1(this, System.currentTimeMillis());
            RelativeLayout relativeLayout = this.f29477V;
            AbstractC3255y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f29477V;
            AbstractC3255y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: D4.Z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.N5(view);
                }
            });
            if (U()) {
                V1();
            } else {
                o0();
            }
            if (aVar.p0(1, this) && aVar.V(this)) {
                a6();
                if (!aVar.p0(4, this)) {
                    n6();
                }
                if (!aVar.p0(5, this)) {
                    i6();
                }
            } else {
                v6();
            }
            this.f29473S = 0;
            RelativeLayout relativeLayout3 = this.f29477V;
            if (relativeLayout3 != null) {
                relativeLayout3.addView(((V) this.f29475T.get(0)).c());
                return;
            }
            return;
        }
        V1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O5(MainActivity this$0, ActivityResult activityResult) {
        String str;
        Bundle extras;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 10) {
            Intent data = activityResult.getData();
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("realPath");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                AbstractActivityC2683a.A2(this$0, new File(str), null, 2, null);
            }
        }
    }

    private final void O6() {
        if (this.f29471R != null) {
            if (SettingsPreferences.f30353b.N(this)) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out_splash);
                loadAnimation.setAnimationListener(new u());
                RelativeLayout relativeLayout = this.f29471R;
                if (relativeLayout != null) {
                    relativeLayout.startAnimation(loadAnimation);
                    return;
                }
                return;
            }
            H5();
            K6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O7(View view) {
    }

    private final boolean P5() {
        TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private final void P6() {
        int i8;
        if (!isFinishing() && this.f29477V != null && !SettingsPreferences.f30353b.o0(this)) {
            RelativeLayout relativeLayout = this.f29477V;
            AbstractC3255y.f(relativeLayout);
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f29477V;
            AbstractC3255y.f(relativeLayout2);
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: D4.y0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.Q6(view);
                }
            });
            Iterator it = this.f29475T.iterator();
            while (it.hasNext()) {
                V v8 = (V) it.next();
                int a8 = v8.a();
                if (a8 != 1) {
                    if (a8 != 2) {
                        if (a8 != 3) {
                            if (a8 != 4) {
                                if (a8 == 5) {
                                    v8.e(j6());
                                }
                            } else {
                                v8.e(o6());
                            }
                        } else {
                            v8.e(b6());
                        }
                    } else {
                        C1641h c1641h = this.f29483q0;
                        if (c1641h != null) {
                            AbstractC3255y.f(c1641h);
                            v8.e(e6(c1641h));
                        }
                    }
                } else {
                    v8.e(w6());
                }
            }
            if (this.f29475T.size() > 0 && (i8 = this.f29473S) >= 0 && i8 < this.f29475T.size()) {
                RelativeLayout relativeLayout3 = this.f29477V;
                AbstractC3255y.f(relativeLayout3);
                relativeLayout3.removeAllViews();
                RelativeLayout relativeLayout4 = this.f29477V;
                AbstractC3255y.f(relativeLayout4);
                relativeLayout4.addView(((V) this.f29475T.get(this.f29473S)).c());
                return;
            }
            L6();
            return;
        }
        L6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q5() {
        if (!P5() && !T5()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q6(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R6() {
        ProgressBar progressBar = this.f29487u0;
        if (progressBar != null) {
            AbstractC3255y.f(progressBar);
            if (progressBar.getVisibility() != 0) {
                ProgressBar progressBar2 = this.f29487u0;
                AbstractC3255y.f(progressBar2);
                progressBar2.setVisibility(0);
                S0 s02 = this.f29491y0;
                if (s02 != null) {
                    s02.y();
                }
                T0 t02 = this.f29489w0;
                if (t02 != null) {
                    t02.q();
                }
                V0 v02 = this.f29490x0;
                if (v02 != null) {
                    v02.y();
                }
            }
        }
    }

    private final void R7(S0 s02) {
        TabLayout tabLayout = this.f29482p0;
        AbstractC3255y.f(tabLayout);
        TabLayout tabLayout2 = this.f29482p0;
        AbstractC3255y.f(tabLayout2);
        tabLayout.selectTab(tabLayout2.getTabAt(0));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3255y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.fl_home_fragment, s02);
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        this.f29462I0 = 0;
        p5(0);
    }

    private final boolean S5() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    private final void S6() {
        w wVar = new w(getSupportFragmentManager(), getLifecycle());
        ViewPager2 viewPager2 = this.f29484r0;
        if (viewPager2 != null) {
            viewPager2.setAdapter(wVar);
        }
        TabLayout tabLayout = this.f29488v0;
        if (tabLayout != null && this.f29484r0 != null) {
            AbstractC3255y.f(tabLayout);
            ViewPager2 viewPager22 = this.f29484r0;
            AbstractC3255y.f(viewPager22);
            new TabLayoutMediator(tabLayout, viewPager22, new TabLayoutMediator.TabConfigurationStrategy() { // from class: D4.U0
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i8) {
                    MainActivity.T6(MainActivity.this, tab, i8);
                }
            }).attach();
            TabLayout tabLayout2 = this.f29488v0;
            AbstractC3255y.f(tabLayout2);
            tabLayout2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new v());
        }
    }

    private final boolean T5() {
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        if (textView != null && textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T6(MainActivity this$0, TabLayout.Tab tab, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(tab, "tab");
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

    private final boolean T7(Intent intent) {
        if ((intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    private final boolean U5() {
        File n8 = new C3671k().n(this);
        if (SettingsPreferences.f30353b.j0(this)) {
            U6();
            return true;
        }
        if (n8 != null) {
            b7();
            return true;
        }
        return false;
    }

    private final void U6() {
        setContentView(R.layout.status_526);
        TextView textView = (TextView) findViewById(R.id.tv_msg_status_526);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        textView.setText(C3655A.f36474a.c(getString(R.string.msg_update_app_status_526)));
        TextView textView2 = (TextView) findViewById(R.id.tv_update_status_526);
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: D4.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.V6(MainActivity.this, view);
            }
        });
    }

    private final boolean V5() {
        RelativeLayout relativeLayout = this.f29477V;
        if (relativeLayout != null) {
            AbstractC3255y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                RelativeLayout relativeLayout2 = this.f29477V;
                AbstractC3255y.f(relativeLayout2);
                if (relativeLayout2.getChildCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        File n8 = new C3671k().n(this$0);
        if (n8 != null) {
            UptodownApp.a.Z(UptodownApp.f29058B, n8, this$0, null, 4, null);
        } else {
            this$0.w7();
        }
    }

    private final void W5() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W6(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != 1003) {
            if (resultCode != 1004) {
                this$0.w2();
                return;
            }
            UptodownApp.f29058B.e(this$0);
            this$0.finish();
            this$0.startActivity(this$0.getIntent());
            return;
        }
        C3674n a8 = C3674n.f36505t.a(this$0);
        a8.a();
        a8.s();
        a8.l();
        this$0.finish();
        this$0.startActivity(this$0.getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X5() {
        a5.Q e8 = a5.Q.f14058k.e(this);
        if ((e8 == null || !e8.y()) && this.f29461H0 != null) {
            final C1643j d8 = C1643j.f14251n.d(this);
            if (d8 != null && d8.a(this)) {
                View inflate = getLayoutInflater().inflate(R.layout.ad_banner_floating, (ViewGroup) this.f29461H0, false);
                View findViewById = inflate.findViewById(R.id.tv_download_banner);
                AbstractC3255y.h(findViewById, "bannerView.findViewById(R.id.tv_download_banner)");
                ((TextView) findViewById).setTypeface(H4.j.f3824g.t());
                View findViewById2 = inflate.findViewById(R.id.rl_close_banner);
                AbstractC3255y.h(findViewById2, "bannerView.findViewById(R.id.rl_close_banner)");
                ((RelativeLayout) findViewById2).setOnClickListener(new View.OnClickListener() { // from class: D4.q0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.Y5(C1643j.this, this, view);
                    }
                });
                View findViewById3 = inflate.findViewById(R.id.iv_banner);
                AbstractC3255y.h(findViewById3, "bannerView.findViewById(R.id.iv_banner)");
                ImageView imageView = (ImageView) findViewById3;
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                Resources resources = getResources();
                AbstractC3255y.h(resources, "resources");
                h8.l(d8.A(resources)).n(UptodownApp.f29058B.e0(this)).j(imageView, new p(d8, this, inflate, imageView));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: D4.r0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.Z5(C1643j.this, this, view);
                    }
                });
                return;
            }
            FrameLayout frameLayout = this.f29461H0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y5(C1643j c1643j, MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        c1643j.f(this$0);
        FrameLayout frameLayout = this$0.f29461H0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y6(MainActivity this$0, C1641h appInfo, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f29464K0;
        AbstractC3255y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f29463J0.E(0L);
        this$0.X2(appInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z5(C1643j c1643j, MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            c1643j.e(this$0);
            FrameLayout frameLayout = this$0.f29461H0;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this$0.F2(c1643j.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z6(MainActivity this$0, C1641h appInfo, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(appInfo, "$appInfo");
        RelativeLayout relativeLayout = this$0.f29464K0;
        AbstractC3255y.f(relativeLayout);
        relativeLayout.setVisibility(8);
        this$0.f29463J0.E(0L);
        this$0.X2(appInfo);
    }

    private final void a6() {
        l5(b6(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a7(MainActivity this$0, C1641h appInfo, Function0 updateCard, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(appInfo, "$appInfo");
        AbstractC3255y.i(updateCard, "$updateCard");
        this$0.f29463J0.g(appInfo, this$0);
        C4002f c4002f = this$0.f29463J0;
        RelativeLayout relativeLayout = this$0.f29464K0;
        AbstractC3255y.f(relativeLayout);
        c4002f.f(this$0, relativeLayout);
        updateCard.invoke();
    }

    private final RelativeLayout b6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_continue, (ViewGroup) this.f29477V, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_continue);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_continue)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_continue_to_wizard_continue)).setTypeface(aVar.u());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_next_wizard_continue);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: D4.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.c6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    private final void b7() {
        C3674n a8 = C3674n.f36505t.a(this);
        a8.a();
        String packageName = getPackageName();
        AbstractC3255y.h(packageName, "packageName");
        O u02 = a8.u0(packageName);
        a8.l();
        if (u02 != null && u02.u() == 100) {
            setContentView(R.layout.dialog_auto_update);
            TextView textView = (TextView) findViewById(R.id.tv_title_auto_update);
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            ((TextView) findViewById(R.id.tv_desc_auto_update)).setTypeface(aVar.u());
            ((TextView) findViewById(R.id.tv_info_auto_update)).setTypeface(aVar.u());
            TextView textView2 = (TextView) findViewById(R.id.tv_installed_version_auto_update);
            textView2.setTypeface(aVar.u());
            PackageManager packageManager = getPackageManager();
            AbstractC3255y.h(packageManager, "packageManager");
            String packageName2 = getPackageName();
            AbstractC3255y.h(packageName2, "packageName");
            textView2.setText(getString(R.string.autoupdate_installed_version, Q4.q.d(packageManager, packageName2, 0).versionName));
            TextView textView3 = (TextView) findViewById(R.id.tv_update_version_auto_update);
            textView3.setTypeface(aVar.t());
            textView3.setText(getString(R.string.autoupdate_update_version, u02.x()));
            TextView textView4 = (TextView) findViewById(R.id.tv_update_size_auto_update);
            textView4.setTypeface(aVar.u());
            textView4.setText(getString(R.string.autoupdate_update_size, new Q4.g().c(u02.v())));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_uptodown_version_details);
            ((TextView) findViewById(R.id.tv_uptodown_version_details_label)).setTypeface(aVar.u());
            final ImageView imageView = (ImageView) findViewById(R.id.iv_uptodown_version_details_label);
            final TextView textView5 = (TextView) findViewById(R.id.tv_uptodown_version_details);
            textView5.setTypeface(aVar.u());
            new V4.j(this, u02.s(), new x(textView5, this, u02), LifecycleOwnerKt.getLifecycleScope(this));
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: D4.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.c7(textView5, imageView, view);
                }
            });
            ((TextView) findViewById(R.id.tv_update)).setTypeface(aVar.t());
            ((RelativeLayout) findViewById(R.id.rl_update)).setOnClickListener(new View.OnClickListener() { // from class: D4.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.d7(MainActivity.this, view);
                }
            });
            ((TextView) findViewById(R.id.tv_cancel)).setTypeface(aVar.t());
            ((RelativeLayout) findViewById(R.id.rl_cancel)).setOnClickListener(new View.OnClickListener() { // from class: D4.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.e7(MainActivity.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c7(TextView textView, ImageView imageView, View view) {
        if (textView.getVisibility() == 0) {
            textView.setVisibility(8);
            imageView.setScaleY(1.0f);
        } else {
            textView.setVisibility(0);
            imageView.setScaleY(-1.0f);
        }
    }

    private final void d6(C1641h c1641h) {
        this.f29483q0 = c1641h;
        l5(e6(c1641h), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        try {
            File n8 = new C3671k().n(this$0);
            if (n8 != null && n8.exists()) {
                this$0.c2(n8);
            } else {
                this$0.N6();
            }
        } catch (Exception unused) {
            this$0.w7();
        }
    }

    private final RelativeLayout e6(C1641h c1641h) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_deep_link, (ViewGroup) this.f29477V, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_header_feature_wizard_deep_link);
        ImageView imageView2 = (ImageView) relativeLayout.findViewById(R.id.iv_logo_wizard_deep_link);
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(c1641h.l0());
        UptodownApp.a aVar = UptodownApp.f29058B;
        l8.n(aVar.f0(this)).i(imageView2);
        com.squareup.picasso.s.h().l(c1641h.e0()).n(aVar.e0(this)).i(imageView);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_name_app_wizard_deep_link);
        j.a aVar2 = H4.j.f3824g;
        textView.setTypeface(aVar2.t());
        textView.setText(c1641h.s0());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_author_wizard_deep_link);
        textView2.setTypeface(aVar2.u());
        textView2.setText(c1641h.p());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_deep_link)).setTypeface(aVar2.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_deep_link)).setTypeface(aVar2.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_deep_link)).setTypeface(aVar2.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_deep_link)).setTypeface(aVar2.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: D4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.f6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_deep_link)).setTypeface(aVar2.u());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_deep_link)).setOnClickListener(new View.OnClickListener() { // from class: D4.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.g6(MainActivity.this, view);
            }
        });
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_deep_link);
        textView3.setTypeface(aVar2.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: D4.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.h6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.I6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f7() {
        FrameLayout frameLayout = this.f29461H0;
        if (frameLayout != null) {
            AbstractC3255y.f(frameLayout);
            if (frameLayout.getChildCount() > 0) {
                FrameLayout frameLayout2 = this.f29461H0;
                AbstractC3255y.f(frameLayout2);
                frameLayout2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.H6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g7(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.r4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.L6();
    }

    private final void i6() {
        l5(j6(), 5);
    }

    private final boolean i7() {
        boolean z8;
        FrameLayout frameLayout;
        a5.Q e8 = a5.Q.f14058k.e(this);
        if (System.currentTimeMillis() - SettingsPreferences.f30353b.D(this) >= TimeUnit.DAYS.toMillis(14L)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (e8 != null || !z8 || (frameLayout = this.f29458E0) == null) {
            return false;
        }
        AbstractC3255y.f(frameLayout);
        frameLayout.removeAllViews();
        k0 c8 = k0.c(getLayoutInflater());
        this.f29459F0 = c8;
        AbstractC3255y.f(c8);
        TextView textView = c8.f12396h;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        c8.f12394f.setTypeface(aVar.u());
        c8.f12395g.setTypeface(aVar.t());
        c8.f12393e.setTypeface(aVar.t());
        String string = getString(R.string.reminder_login_msg_1);
        AbstractC3255y.h(string, "getString(R.string.reminder_login_msg_1)");
        List<C1646m> a8 = C1646m.f14265f.a(string, "\\[xx](.*?)\\[/xx]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new j6.j("\\[xx](.*?)\\[/xx]").g(string, A.f29493a));
        for (C1646m c1646m : a8) {
            int S8 = j6.n.S(spannableStringBuilder, c1646m.d(), 0, false, 6, null);
            int length = c1646m.d().length() + S8;
            if (S8 >= 0) {
                spannableStringBuilder.setSpan(new z(), S8, length, 33);
            }
        }
        c8.f12394f.setText(spannableStringBuilder);
        c8.f12393e.setOnClickListener(new View.OnClickListener() { // from class: D4.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.j7(MainActivity.this, view);
            }
        });
        c8.f12391c.setOnClickListener(new View.OnClickListener() { // from class: D4.T0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.k7(MainActivity.this, view);
            }
        });
        FrameLayout frameLayout2 = this.f29458E0;
        AbstractC3255y.f(frameLayout2);
        k0 k0Var = this.f29459F0;
        AbstractC3255y.f(k0Var);
        frameLayout2.addView(k0Var.getRoot());
        SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
        if (aVar2.N(this) && !UptodownApp.f29058B.S()) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom);
            k0 k0Var2 = this.f29459F0;
            AbstractC3255y.f(k0Var2);
            k0Var2.getRoot().startAnimation(loadAnimation);
        }
        aVar2.b1(this, System.currentTimeMillis());
        return true;
    }

    private final RelativeLayout j6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_login, (ViewGroup) this.f29477V, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wl);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(H4.j.f3824g.t());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wl);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_login_google_wl);
        if (UptodownApp.f29058B.S()) {
            textView2.setVisibility(8);
        } else {
            textView2.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: D4.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.k6(MainActivity.this, view);
                }
            });
        }
        TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_login_email_wl);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: D4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.l6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_login_anonymous_wl)).setOnClickListener(new View.OnClickListener() { // from class: D4.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) LoginActivity.class), UptodownApp.f29058B.a(this$0));
        Bundle bundle = new Bundle();
        bundle.putString("type", "continue");
        this$0.t5(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.l3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        this$0.t5(bundle);
    }

    private final void l5(RelativeLayout relativeLayout, int i8) {
        V v8 = new V();
        v8.d(i8);
        v8.e(relativeLayout);
        this.f29475T.add(v8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f29470Q0.launch(new Intent(this$0, (Class<?>) LoginActivity.class), UptodownApp.f29058B.b(this$0));
    }

    private final void l7() {
        a5.Q e8 = a5.Q.f14058k.e(this);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (!SettingsPreferences.f30353b.a0(this) && e8 != null && e8.v() < 1720483200 && currentTimeMillis < 1723161600 && !isFinishing()) {
            AlertDialog r22 = r2();
            if (r22 != null) {
                r22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            W4.r c8 = W4.r.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            String string = getString(R.string.terms_conditions_updated_popup);
            AbstractC3255y.h(string, "getString(R.string.terms_conditions_updated_popup)");
            List<C1646m> a8 = C1646m.f14265f.a(string, "\\[xx](.*?)\\[/xx]");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new j6.j("\\[xx](.*?)\\[/xx]").g(string, C.f29495a));
            for (C1646m c1646m : a8) {
                int S8 = j6.n.S(spannableStringBuilder, c1646m.d(), 0, false, 6, null);
                int length = c1646m.d().length() + S8;
                if (S8 >= 0) {
                    spannableStringBuilder.setSpan(new B(), S8, length, 33);
                }
            }
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(spannableStringBuilder);
            c8.f12478d.setOnClickListener(new View.OnClickListener() { // from class: D4.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.m7(MainActivity.this, view);
                }
            });
            c8.f12477c.setVisibility(8);
            c8.f12479e.setTypeface(aVar.t());
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: D4.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.n7(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            N2(builder.create());
            T2();
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3678r(this).b("new_terms_popup", bundle);
            SettingsPreferences.f30353b.S0(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m5() {
        int i8;
        if (!this.f29476U && this.f29475T.size() > 0 && (i8 = this.f29473S) >= 0) {
            RelativeLayout c8 = ((V) this.f29475T.get(i8)).c();
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_back_out);
            loadAnimation.setAnimationListener(new AnimationAnimationListenerC2679h());
            c8.startAnimation(loadAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C3671k c3671k = new C3671k();
        String string = this$0.getString(R.string.url_tos);
        AbstractC3255y.h(string, "getString(R.string.url_tos)");
        c3671k.q(this$0, string, this$0.getString(R.string.tos_title));
        AlertDialog r22 = this$0.r2();
        if (r22 != null) {
            r22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "opened");
        new C3678r(this$0).b("new_terms_popup", bundle);
    }

    private final void n5() {
        SettingsPreferences.f30353b.n1(this, ((V) this.f29475T.get(this.f29473S)).a());
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_next_out);
        loadAnimation.setAnimationListener(new AnimationAnimationListenerC2680i());
        ((V) this.f29475T.get(this.f29473S)).c().startAnimation(loadAnimation);
    }

    private final void n6() {
        l5(o6(), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        if (r22 != null) {
            r22.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        new C3678r(this$0).b("new_terms_popup", bundle);
    }

    private final void o5(C1641h c1641h, boolean z8, int i8) {
        C3678r t22;
        C3678r t23;
        L0 a8 = L0.f12856K.a(c1641h, c1641h.i());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3255y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
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
                        AbstractC3255y.h(string, "getString(R.string.error_generico)");
                        d2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3255y.h(string2, "getString(R.string.error_generico)");
                d2(string2);
                return;
            }
        }
        if (i8 != -1 && (t23 = t2()) != null) {
            t23.a("container_view_not_found_" + i8);
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3255y.h(string3, "getString(R.string.error_generico)");
        d2(string3);
    }

    private final RelativeLayout o6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_permissions, (ViewGroup) this.f29477V, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_header_wp);
        if (relativeLayout2 != null) {
            ((TextView) relativeLayout2.findViewById(R.id.tv_title_header_wizard)).setTypeface(H4.j.f3824g.t());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_title_wp);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        RelativeLayout relativeLayout3 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_notifications_wp);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_title_wp)).setTypeface(aVar.t());
            ((TextView) relativeLayout.findViewById(R.id.tv_notifications_msg_wp)).setTypeface(aVar.u());
            SwitchCompat switchCompat = (SwitchCompat) relativeLayout.findViewById(R.id.sc_notifications_wp);
            this.f29481Z = switchCompat;
            AbstractC3255y.f(switchCompat);
            switchCompat.setChecked(S5());
            SwitchCompat switchCompat2 = this.f29481Z;
            AbstractC3255y.f(switchCompat2);
            switchCompat2.setClickable(false);
            relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: D4.J0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.p6(MainActivity.this, view);
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
        this.f29480Y = switchCompat3;
        AbstractC3255y.f(switchCompat3);
        switchCompat3.setChecked(W());
        SwitchCompat switchCompat4 = this.f29480Y;
        AbstractC3255y.f(switchCompat4);
        switchCompat4.setClickable(false);
        relativeLayout4.setOnClickListener(new View.OnClickListener() { // from class: D4.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.q6(MainActivity.this, view);
            }
        });
        boolean x8 = new C3667g().x(this);
        RelativeLayout relativeLayout5 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_autoupdate_wp);
        if (i8 > 31 && !UptodownApp.f29058B.S() && !x8) {
            SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
            if (!aVar2.P(this)) {
                aVar2.y0(this, true);
            }
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_title_wp)).setTypeface(aVar.t());
            ((TextView) relativeLayout.findViewById(R.id.tv_autoupdate_msg_wp)).setTypeface(aVar.u());
            final SwitchCompat switchCompat5 = (SwitchCompat) relativeLayout.findViewById(R.id.sc_autoupdate_wp);
            switchCompat5.setChecked(aVar2.O(this));
            switchCompat5.setClickable(false);
            relativeLayout5.setOnClickListener(new View.OnClickListener() { // from class: D4.L0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.r6(SwitchCompat.this, this, view);
                }
            });
        } else {
            SettingsPreferences.a aVar3 = SettingsPreferences.f30353b;
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
        textView3.setOnClickListener(new View.OnClickListener() { // from class: D4.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.s6(MainActivity.this, view);
            }
        });
        TextView textView4 = (TextView) relativeLayout.findViewById(R.id.tv_back_wp);
        textView4.setTypeface(aVar.t());
        textView4.setOnClickListener(new View.OnClickListener() { // from class: D4.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.t6(MainActivity.this, view);
            }
        });
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o7() {
        AppBarLayout appBarLayout = this.f29479X;
        AbstractC3255y.f(appBarLayout);
        appBarLayout.setVisibility(0);
        AppBarLayout appBarLayout2 = this.f29479X;
        AbstractC3255y.f(appBarLayout2);
        appBarLayout2.setExpanded(true);
        TabLayout tabLayout = this.f29488v0;
        AbstractC3255y.f(tabLayout);
        int selectedTabPosition = tabLayout.getSelectedTabPosition();
        if (selectedTabPosition != 2 && selectedTabPosition != 3) {
            TabLayout tabLayout2 = this.f29482p0;
            AbstractC3255y.f(tabLayout2);
            tabLayout2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.f29481Z;
        if (switchCompat != null && !switchCompat.isChecked()) {
            this$0.l0();
        }
    }

    private final void p7() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        AbstractC3255y.h(build, "builder.build()");
        build.intent.setData(Uri.parse(new C3671k().c(C3660F.f36486c.c(this))));
        this.f29468O0.launch(build.intent, UptodownApp.f29058B.b(this));
    }

    private final void q5() {
        long currentTimeMillis = System.currentTimeMillis();
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        if (currentTimeMillis - aVar.C(this) >= TimeUnit.DAYS.toMillis(7L)) {
            aVar.V0(this, System.currentTimeMillis());
            if (Build.VERSION.SDK_INT >= 33) {
                if (!S5()) {
                    u5();
                    return;
                }
            } else if (!aVar.b0(this)) {
                u5();
                return;
            }
        }
        i7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.f29480Y;
        if (switchCompat != null && !switchCompat.isChecked() && !this$0.W()) {
            this$0.n0();
        }
    }

    private final void q7() {
        Float f8;
        if (!isFinishing()) {
            s0 c8 = s0.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12547f;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            float height = c8.f12547f.getHeight();
            int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
            int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
            TextPaint paint = c8.f12547f.getPaint();
            if (paint != null) {
                f8 = Float.valueOf(paint.measureText(c8.f12547f.getText().toString()));
            } else {
                f8 = null;
            }
            AbstractC3255y.f(f8);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f8.floatValue(), height, new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            TextPaint paint2 = c8.f12547f.getPaint();
            if (paint2 != null) {
                paint2.setShader(linearGradient);
            }
            float dimension = getResources().getDimension(R.dimen.turbo_popup_lines_max_width);
            int i8 = getResources().getDisplayMetrics().widthPixels;
            float dimension2 = getResources().getDimension(R.dimen.margin_l);
            float f9 = (i8 - dimension2) - dimension2;
            if (dimension > f9) {
                int i9 = (int) f9;
                c8.f12545d.setMaxWidth(i9);
                c8.f12546e.setMaxWidth(i9);
            }
            c8.f12545d.setTypeface(aVar.u());
            String obj = c8.f12545d.getText().toString();
            List<C1646m> a8 = C1646m.f14265f.a(obj, "\\[xx](.*?)\\[/xx]");
            SpannableString spannableString = new SpannableString(new j6.j("\\[xx](.*?)\\[/xx]").g(obj, E.f29497a));
            for (C1646m c1646m : a8) {
                int S8 = j6.n.S(spannableString, c1646m.d(), 0, false, 6, null);
                int length = c1646m.d().length() + S8;
                if (S8 >= 0) {
                    spannableString.setSpan(new D(), S8, length, 33);
                }
            }
            c8.f12545d.setText(spannableString);
            c8.f12546e.setTypeface(H4.j.f3824g.t());
            c8.f12543b.setOnClickListener(new View.OnClickListener() { // from class: D4.F0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.r7(MainActivity.this, view);
                }
            });
            c8.f12546e.setOnClickListener(new View.OnClickListener() { // from class: D4.G0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.s7(MainActivity.this, view);
                }
            });
            Locale locale = Locale.getDefault();
            AbstractC3255y.h(locale, "getDefault()");
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
                c8.f12544c.setCropType(0);
            }
            c8.f12544c.setOnClickListener(new View.OnClickListener() { // from class: D4.I0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.t7(view);
                }
            });
            FrameLayout frameLayout = this.f29460G0;
            AbstractC3255y.f(frameLayout);
            frameLayout.addView(c8.getRoot());
            SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
            if (aVar2.N(this) && !UptodownApp.f29058B.S()) {
                c8.getRoot().startAnimation(AnimationUtils.loadAnimation(this, R.anim.popup_turbo_in));
            }
            aVar2.h1(this, System.currentTimeMillis());
            Bundle bundle = new Bundle();
            bundle.putString("type", "shown");
            new C3678r(this).b("turbo_popup", bundle);
        }
    }

    private final void r4() {
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        if (!aVar.V(this)) {
            aVar.G0(this, true);
            aVar.u0(this, true);
            aVar.A0(this, true);
            aVar.e1(this, true);
            UptodownApp.a aVar2 = UptodownApp.f29058B;
            UptodownApp.a.N0(aVar2, this, false, 2, null);
            aVar2.K(this);
        }
        O2();
        if (!aVar.k0(this)) {
            new C3671k().g(r2(), this);
        } else {
            n5();
        }
    }

    private final void r5() {
        if (!C3683w.f36547a.a(this)) {
            C3674n a8 = C3674n.f36505t.a(this);
            a8.a();
            R2(a8.q0());
            a8.l();
            for (int i8 = 0; u2().size() > 0 && i8 < 2; i8++) {
                Object remove = u2().remove(0);
                AbstractC3255y.h(remove, "preregistrationsToNotify.removeAt(0)");
                K2((C1632D) remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r6(SwitchCompat switchCompat, MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        boolean z8 = !switchCompat.isChecked();
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        aVar.y0(this$0, z8);
        switchCompat.setChecked(aVar.O(this$0));
        this$0.J7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "closed");
        this$0.K5(bundle);
    }

    private final void s5() {
        a5.Q e8 = a5.Q.f14058k.e(this);
        if ((e8 == null || !e8.y()) && SettingsPreferences.f30353b.H(this) == 0) {
            q7();
        } else {
            q5();
            r5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("type", "subscribe");
        this$0.K5(bundle);
        this$0.p7();
    }

    private final void t5(Bundle bundle) {
        FrameLayout frameLayout = this.f29458E0;
        if (frameLayout != null) {
            AbstractC3255y.f(frameLayout);
            if (frameLayout.getChildCount() > 0 && this.f29459F0 != null) {
                new C3678r(this).b("login_popup", bundle);
                if (SettingsPreferences.f30353b.N(this) && !UptodownApp.f29058B.S()) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
                    loadAnimation.setAnimationListener(new AnimationAnimationListenerC2681j());
                    k0 k0Var = this.f29459F0;
                    AbstractC3255y.f(k0Var);
                    k0Var.getRoot().startAnimation(loadAnimation);
                    return;
                }
                FrameLayout frameLayout2 = this.f29458E0;
                AbstractC3255y.f(frameLayout2);
                frameLayout2.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.m5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t7(View view) {
    }

    private final void u5() {
        if (!isFinishing()) {
            AlertDialog r22 = r2();
            if (r22 != null) {
                r22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            W4.r c8 = W4.r.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(getString(R.string.notification_permission_request));
            c8.f12479e.setTypeface(aVar.t());
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: D4.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.v5(MainActivity.this, view);
                }
            });
            c8.f12477c.setTypeface(aVar.t());
            c8.f12477c.setOnClickListener(new View.OnClickListener() { // from class: D4.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.w5(MainActivity.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            N2(builder.create());
            if (!isFinishing() && r2() != null) {
                AlertDialog r23 = r2();
                AbstractC3255y.f(r23);
                Window window = r23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog r24 = r2();
                AbstractC3255y.f(r24);
                r24.show();
            }
        }
    }

    private final void u6() {
        n6();
        i6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
        if (Build.VERSION.SDK_INT >= 33) {
            this$0.l0();
        }
        SettingsPreferences.f30353b.U0(this$0, true);
    }

    private final void v6() {
        l5(w6(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w5(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    private final RelativeLayout w6() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_welcome, (ViewGroup) this.f29477V, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_welcome_to_wizard_welcome);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_app_name_wizard_welcome)).setTypeface(aVar.t());
        ((TextView) relativeLayout.findViewById(R.id.tv_slogan_to_wizard_welcome)).setTypeface(aVar.u());
        ((TextView) relativeLayout.findViewById(R.id.tv_terms_wizard_welcome)).setTypeface(aVar.t());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_terms_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: D4.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.x6(MainActivity.this, view);
            }
        });
        ((TextView) relativeLayout.findViewById(R.id.tv_privacy_settings_wizard_welcome)).setTypeface(aVar.t());
        ((RelativeLayout) relativeLayout.findViewById(R.id.rl_privacy_settings_wizard_welcome)).setOnClickListener(new View.OnClickListener() { // from class: D4.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.y6(MainActivity.this, view);
            }
        });
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_accept_wizard_welcome);
        textView2.setTypeface(aVar.t());
        textView2.setEnabled(false);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: D4.X0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.z6(MainActivity.this, view);
            }
        });
        if (s2()) {
            textView2.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_wizard_accept_button));
            textView2.setEnabled(true);
        }
        return relativeLayout;
    }

    private final void w7() {
        String I8 = SettingsPreferences.f30353b.I(this);
        if (I8 == null) {
            I8 = "https://uptodown-android.uptodown.com/android";
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(I8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.I6();
    }

    private final Bitmap x7() {
        View rootView = getWindow().getDecorView().getRootView();
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
        AbstractC3255y.h(createBitmap, "createBitmap(view.width,…height, Config.ARGB_8888)");
        rootView.draw(new Canvas(createBitmap));
        float applyDimension = TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, rootView.getWidth() / 2, rootView.getHeight() / 2, true);
        AbstractC3255y.h(createScaledBitmap, "createScaledBitmap(bitma…2, view.height / 2, true)");
        return F5(createScaledBitmap, (int) applyDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y5(MainActivity this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.O2();
            UptodownApp.a.N0(UptodownApp.f29058B, this$0, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.H6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z5() {
        int i8 = this.f29473S;
        if (i8 <= 0 || i8 >= this.f29475T.size()) {
            return -1;
        }
        int i9 = this.f29473S - 1;
        this.f29473S = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z6(MainActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.r4();
    }

    public final Object A7(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new G(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    public final ActivityResultLauncher B5() {
        return this.f29467N0;
    }

    public final void B7(int i8, C1648o c1648o) {
        Fragment C52 = C5();
        if (C52 instanceof L0) {
            runOnUiThread(new L0.RunnableC1506e(i8, c1648o));
        } else if (C52 instanceof F1) {
            ((F1) C52).R0();
        }
    }

    public final Fragment C5() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
            return (Fragment) AbstractC1378t.y0(fragments);
        }
        if (!this.f29454A0.isEmpty()) {
            return (Fragment) AbstractC1378t.y0(this.f29454A0);
        }
        return null;
    }

    public final void C7(int i8, O o8) {
        Fragment C52 = C5();
        if (o8 != null && (C52 instanceof L0)) {
            runOnUiThread(new L0.RunnableC1503b(i8, o8));
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a
    public void D2(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        super.D2(appInfo);
        if (this.f29477V != null && this.f29473S == 0 && this.f29475T.size() == 1 && ((V) this.f29475T.get(this.f29473S)).a() == 1) {
            d6(appInfo);
            n5();
        }
    }

    public final void D7(String str) {
        if (C5() instanceof S0) {
            Fragment C52 = C5();
            AbstractC3255y.g(C52, "null cannot be cast to non-null type com.uptodown.fragments.HomeFragment");
            ((S0) C52).C(str);
        } else {
            S0 s02 = this.f29491y0;
            if (s02 != null) {
                AbstractC3255y.f(s02);
                s02.C(str);
            }
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a
    public void E2() {
        if (this.f29477V != null && this.f29473S == 0 && this.f29475T.size() == 1 && ((V) this.f29475T.get(this.f29473S)).a() == 1) {
            K7();
            u6();
        }
    }

    public final RelativeLayout E5() {
        return this.f29486t0;
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a
    public void F2(long j8) {
        L5();
        if (j8 > 0) {
            if (this.f29456C0 == -1) {
                this.f29456C0 = j8;
                new V4.i(this, j8, new s(), LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            return;
        }
        H2();
    }

    public final void F7() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new I(null), 3, null);
    }

    public final void G7(String str) {
        if (C5() instanceof T0) {
            Fragment C52 = C5();
            AbstractC3255y.g(C52, "null cannot be cast to non-null type com.uptodown.fragments.ParentCategoryFragment");
            ((T0) C52).t(str);
        } else {
            T0 t02 = this.f29489w0;
            if (t02 != null) {
                AbstractC3255y.f(t02);
                t02.t(str);
            }
        }
    }

    public final void H7() {
        ImageView imageView = (ImageView) findViewById(R.id.home_uptodown_turbo);
        a5.Q e8 = a5.Q.f14058k.e(this);
        if (!isFinishing() && e8 != null && e8.y()) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }

    public final void I7(String str) {
        if (C5() instanceof V0) {
            Fragment C52 = C5();
            AbstractC3255y.g(C52, "null cannot be cast to non-null type com.uptodown.fragments.TopByCategoryFragment");
            ((V0) C52).I(str);
        } else {
            V0 v02 = this.f29490x0;
            if (v02 != null) {
                AbstractC3255y.f(v02);
                v02.I(str);
            }
        }
    }

    public final void J6() {
        TabLayout tabLayout;
        TabLayout tabLayout2;
        RelativeLayout relativeLayout;
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate((String) null, 1);
        }
        RelativeLayout relativeLayout2 = this.f29486t0;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0 && (relativeLayout = this.f29486t0) != null) {
            relativeLayout.setVisibility(8);
        }
        o7();
        TabLayout tabLayout3 = this.f29488v0;
        if (((tabLayout3 != null && tabLayout3.getSelectedTabPosition() == 1) || ((tabLayout = this.f29488v0) != null && tabLayout.getSelectedTabPosition() == 0)) && (tabLayout2 = this.f29482p0) != null) {
            tabLayout2.setVisibility(0);
        }
    }

    public final void M6() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new t(null), 2, null);
    }

    public final void M7(C1638e alternatives) {
        AbstractC3255y.i(alternatives, "alternatives");
        L5();
        I5();
        C1531b a8 = C1531b.f13279f.a(alternatives);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3255y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(alternatives.c());
                if (C5() instanceof V0) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3255y.h(string, "getString(R.string.error_generico)");
                        d2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3255y.h(string2, "getString(R.string.error_generico)");
                d2(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3255y.h(string3, "getString(R.string.error_generico)");
        d2(string3);
    }

    public final void N6() {
        L6();
        if (!U5()) {
            P6();
            O6();
            B2();
            F7();
        }
    }

    public final void N7(C1641h appInfo, int i8) {
        AbstractC3255y.i(appInfo, "appInfo");
        Fragment C52 = C5();
        RelativeLayout relativeLayout = this.f29486t0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: D4.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.O7(view);
                }
            });
        }
        RelativeLayout relativeLayout2 = this.f29486t0;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        if (C52 instanceof L0) {
            C1641h I32 = ((L0) C52).I3();
            if (I32 == null || I32.i() != appInfo.i()) {
                o5(appInfo, true, i8);
            }
        } else {
            o5(appInfo, false, i8);
        }
        J5();
    }

    public final void P7(C1644k category) {
        AbstractC3255y.i(category, "category");
        L5();
        I5();
        V0 a8 = V0.f13193i.a(category);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3255y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (((CoordinatorLayout) findViewById(R.id.rl_main_scrollable)) != null) {
            try {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out);
                beginTransaction.add(R.id.rl_main_scrollable, a8);
                beginTransaction.addToBackStack(a8.x().h());
                if (C5() instanceof V0) {
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                }
                if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
                    try {
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        String string = getString(R.string.error_generico);
                        AbstractC3255y.h(string, "getString(R.string.error_generico)");
                        d2(string);
                        return;
                    }
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                String string2 = getString(R.string.error_generico);
                AbstractC3255y.h(string2, "getString(R.string.error_generico)");
                d2(string2);
                return;
            }
        }
        String string3 = getString(R.string.error_generico);
        AbstractC3255y.h(string3, "getString(R.string.error_generico)");
        d2(string3);
    }

    public final void Q7() {
        S0 s02 = this.f29491y0;
        if (s02 != null) {
            AbstractC3255y.f(s02);
            R7(s02);
        } else {
            S0 s03 = new S0();
            this.f29491y0 = s03;
            AbstractC3255y.f(s03);
            R7(s03);
        }
    }

    public final boolean R5() {
        RelativeLayout relativeLayout = this.f29485s0;
        if (relativeLayout != null) {
            AbstractC3255y.f(relativeLayout);
            if (relativeLayout.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void S7(C1644k parentCategory) {
        T0 t02;
        AbstractC3255y.i(parentCategory, "parentCategory");
        if (parentCategory.b() == 523) {
            p5(1);
            return;
        }
        this.f29454A0 = new ArrayList();
        TabLayout tabLayout = this.f29482p0;
        AbstractC3255y.f(tabLayout);
        int tabCount = tabLayout.getTabCount();
        int i8 = 1;
        while (true) {
            t02 = null;
            Object obj = null;
            if (i8 >= tabCount) {
                break;
            }
            TabLayout tabLayout2 = this.f29482p0;
            AbstractC3255y.f(tabLayout2);
            TabLayout.Tab tabAt = tabLayout2.getTabAt(i8);
            if (tabAt != null) {
                obj = tabAt.getTag();
            }
            AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.Category");
            if (((C1644k) obj).b() == parentCategory.b()) {
                TabLayout tabLayout3 = this.f29482p0;
                AbstractC3255y.f(tabLayout3);
                TabLayout tabLayout4 = this.f29482p0;
                AbstractC3255y.f(tabLayout4);
                tabLayout3.selectTab(tabLayout4.getTabAt(i8));
            }
            i8++;
        }
        Iterator it = this.f29455B0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T0 t03 = (T0) it.next();
            if (t03.r() != null) {
                C1644k r8 = t03.r();
                AbstractC3255y.f(r8);
                if (r8.b() == parentCategory.b()) {
                    t02 = t03;
                    break;
                }
            }
        }
        if (t02 == null) {
            t02 = T0.f13165n.a(parentCategory);
            this.f29455B0.add(t02);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        AbstractC3255y.h(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.replace(R.id.fl_home_fragment, t02);
        if (this.f29454A0.size() < 1) {
            this.f29454A0.add(t02);
        }
        if (!isFinishing() && !getSupportFragmentManager().isDestroyed()) {
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        p5(0);
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a
    public void V2(long j8) {
        SettingsPreferences.f30353b.x0(this, String.valueOf(j8));
        Bitmap x72 = x7();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_wizard);
        this.f29477V = relativeLayout;
        AbstractC3255y.f(relativeLayout);
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f29477V;
        AbstractC3255y.f(relativeLayout2);
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: D4.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.g7(view);
            }
        });
        RelativeLayout relativeLayout3 = this.f29477V;
        AbstractC3255y.f(relativeLayout3);
        relativeLayout3.removeAllViews();
        View inflate = LayoutInflater.from(this).inflate(R.layout.wizard_kill, (ViewGroup) this.f29477V, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout4 = (RelativeLayout) inflate;
        TextView textView = (TextView) relativeLayout4.findViewById(R.id.tv_title_wizard_kill);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        TextView textView2 = (TextView) relativeLayout4.findViewById(R.id.tv_slogan_to_wizard_kill);
        textView2.setTypeface(aVar.u());
        textView2.setText(getString(R.string.core_kill_this_app, getString(R.string.app_name)));
        ((TextView) relativeLayout4.findViewById(R.id.tv_slide_wizard_kill)).setTypeface(aVar.t());
        TextView textView3 = (TextView) relativeLayout4.findViewById(R.id.tv_accept_wizard_kill);
        textView3.setTypeface(aVar.u());
        textView3.setEnabled(true);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: D4.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.h7(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout5 = this.f29477V;
        AbstractC3255y.f(relativeLayout5);
        relativeLayout5.addView(relativeLayout4);
        ImageView imageView = (ImageView) relativeLayout4.findViewById(R.id.iv_tap_screen_kill);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up_tap);
        loadAnimation.setStartOffset(500L);
        loadAnimation.setFillAfter(true);
        ImageView imageView2 = (ImageView) relativeLayout4.findViewById(R.id.iv_screenshot_kill);
        imageView2.setImageBitmap(x72);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.slide_up_out);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setStartOffset(500L);
        loadAnimation2.setAnimationListener(new y(imageView, loadAnimation, imageView2));
        imageView.startAnimation(loadAnimation);
        imageView2.startAnimation(loadAnimation2);
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a
    public void X2(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        N7(appInfo, -1);
    }

    public final void X6(final C1641h appInfo, final Function0 updateCard) {
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(updateCard, "updateCard");
        RelativeLayout relativeLayout = this.f29464K0;
        if (relativeLayout != null) {
            C4002f c4002f = this.f29463J0;
            AbstractC3255y.f(relativeLayout);
            c4002f.H(appInfo, this, relativeLayout);
            this.f29463J0.m().setOnClickListener(new View.OnClickListener() { // from class: D4.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.Y6(MainActivity.this, appInfo, view);
                }
            });
            this.f29463J0.s().setOnClickListener(new View.OnClickListener() { // from class: D4.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.Z6(MainActivity.this, appInfo, view);
                }
            });
            this.f29463J0.q().setOnClickListener(new View.OnClickListener() { // from class: D4.e1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.a7(MainActivity.this, appInfo, updateCard, view);
                }
            });
            RelativeLayout relativeLayout2 = this.f29464K0;
            AbstractC3255y.f(relativeLayout2);
            if (relativeLayout2.getVisibility() != 0) {
                RelativeLayout relativeLayout3 = this.f29464K0;
                AbstractC3255y.f(relativeLayout3);
                relativeLayout3.setVisibility(0);
                if (SettingsPreferences.f30353b.N(this) && !UptodownApp.f29058B.S()) {
                    this.f29463J0.p().startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom));
                }
                this.f29463J0.p().setVisibility(0);
            }
            this.f29463J0.p().setVisibility(0);
        }
    }

    @Override // I4.r
    public void Z() {
        super.Z();
        SwitchCompat switchCompat = this.f29481Z;
        if (switchCompat != null) {
            switchCompat.setChecked(false);
        }
        J7();
    }

    @Override // I4.r
    public void a0() {
        super.a0();
        SwitchCompat switchCompat = this.f29481Z;
        if (switchCompat != null) {
            switchCompat.setChecked(true);
        }
        J7();
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.r
    public void e0() {
        super.e0();
        g2();
    }

    @Override // I4.r
    public void f0() {
        super.f0();
        g2();
    }

    @Override // D4.AbstractActivityC1109k0
    protected void f3() {
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.r
    public void g0() {
        super.g0();
        V1();
    }

    @Override // I4.r
    public void h0() {
        super.h0();
        V1();
    }

    @Override // D4.AbstractActivityC1109k0
    public a5.Q h3() {
        String str;
        a5.Q e8 = a5.Q.f14058k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str == null || !e8.x(this)) {
            return null;
        }
        return e8;
    }

    @Override // I4.r
    public void k0() {
        SwitchCompat switchCompat = this.f29480Y;
        if (switchCompat != null) {
            switchCompat.setChecked(W());
        }
        J7();
    }

    @Override // D4.AbstractActivityC1109k0
    public void m3() {
        F1 f12;
        if (this.f29477V != null) {
            int size = this.f29475T.size();
            int i8 = this.f29473S;
            if (size > i8 && ((V) this.f29475T.get(i8)).a() == 5) {
                n5();
                a5.Q h32 = h3();
                if (h32 != null && (f12 = this.f29492z0) != null) {
                    f12.Q0(h32);
                }
            }
        }
    }

    @Override // D4.AbstractActivityC1109k0, com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        long j8;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.main);
        this.f29458E0 = (FrameLayout) findViewById(R.id.fl_sign_in_popup);
        this.f29460G0 = (FrameLayout) findViewById(R.id.fl_uptodown_turbo_popup);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_splash);
        this.f29471R = relativeLayout;
        AbstractC3255y.f(relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: D4.H0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.B6(view);
            }
        });
        this.f29461H0 = (FrameLayout) findViewById(R.id.fl_banner_floating);
        this.f29464K0 = (RelativeLayout) findViewById(R.id.app_info_selected_popup);
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.L()) {
            RelativeLayout relativeLayout2 = this.f29471R;
            AbstractC3255y.f(relativeLayout2);
            relativeLayout2.setVisibility(8);
            aVar.q0(false);
        }
        this.f29477V = (RelativeLayout) findViewById(R.id.rl_wizard);
        w2();
        this.f29478W = (Toolbar) findViewById(R.id.toolbar_main);
        this.f29479X = (AppBarLayout) findViewById(R.id.abl_toolbar);
        this.f29482p0 = (TabLayout) findViewById(R.id.tab_parent_categories);
        ((ImageView) findViewById(R.id.home_uptodown_logo)).setOnClickListener(new View.OnClickListener() { // from class: D4.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.C6(MainActivity.this, view);
            }
        });
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.rl_main_search_view);
        ((TextView) findViewById(R.id.tv_main_search_view)).setTypeface(H4.j.f3824g.u());
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: D4.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.D6(MainActivity.this, view);
            }
        });
        ((ImageView) findViewById(R.id.home_uptodown_turbo)).setOnClickListener(new View.OnClickListener() { // from class: D4.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.E6(MainActivity.this, view);
            }
        });
        H7();
        String str2 = null;
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new r(null), 3, null);
        M5();
        runOnUiThread(new Runnable() { // from class: D4.g1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.F6(MainActivity.this);
            }
        });
        UptodownApp.a.N0(aVar, this, false, 2, null);
        if (!SettingsPreferences.f30353b.X(this)) {
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            new V4.n(applicationContext);
        }
        if (getIntent() != null) {
            Intent intent = getIntent();
            AbstractC3255y.h(intent, "intent");
            if (!T7(intent)) {
                Uri data = getIntent().getData();
                if (data != null) {
                    String uri = data.toString();
                    AbstractC3255y.h(uri, "uri.toString()");
                    String j9 = new Q4.f().j(data, this);
                    if (j9 != null && j6.n.r(j9, ".apk", false, 2, null)) {
                        String i8 = new C3677q().i(j9);
                        if (i8 != null) {
                            G2(i8, null);
                        } else {
                            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                            intent2.setData(data);
                            this.f29474S0.launch(intent2);
                        }
                    } else if (j9 != null && Q4.w.f9241b.a(j9)) {
                        Intent intent3 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                        intent3.setData(data);
                        this.f29474S0.launch(intent3);
                    } else if (j6.n.C(uri, "https://dw.uptodown.com/dwn/", false, 2, null)) {
                        DownloadApkWorker.a aVar2 = DownloadApkWorker.f31034k;
                        Context applicationContext2 = getApplicationContext();
                        AbstractC3255y.h(applicationContext2, "applicationContext");
                        aVar2.g(applicationContext2, uri);
                        startActivity(new Intent(this, (Class<?>) MyDownloads.class));
                    } else if (!aVar.U(this)) {
                        new V4.j(this, new C3671k().l(data), this.f29465L0, LifecycleOwnerKt.getLifecycleScope(this));
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
                        a5.x xVar = new a5.x();
                        xVar.j(j10);
                        xVar.m(str2);
                        xVar.n(this);
                        new V4.i(this, j10, this.f29465L0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                } else {
                    a5.x b8 = a5.x.f14348f.b(this);
                    if (b8 != null && !b8.g()) {
                        new V4.i(this, b8.b(), this.f29465L0, LifecycleOwnerKt.getLifecycleScope(this));
                    }
                }
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f29472R0);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        this.f29484r0 = viewPager2;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(this.f29457D0);
        }
        ViewPager2 viewPager22 = this.f29484r0;
        if (viewPager22 != null) {
            viewPager22.setUserInputEnabled(false);
        }
        this.f29488v0 = (TabLayout) findViewById(R.id.tabs);
        this.f29486t0 = (RelativeLayout) findViewById(R.id.rl_app_detail_open);
        S6();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3255y.i(event, "event");
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!U5()) {
            F7();
            C3683w.f36547a.g(this);
            if (R5()) {
                R6();
            }
        }
    }

    public final void p5(int i8) {
        TabLayout tabLayout = this.f29488v0;
        AbstractC3255y.f(tabLayout);
        if (i8 < tabLayout.getTabCount()) {
            TabLayout tabLayout2 = this.f29488v0;
            AbstractC3255y.f(tabLayout2);
            if (tabLayout2.getSelectedTabPosition() != i8) {
                TabLayout tabLayout3 = this.f29488v0;
                AbstractC3255y.f(tabLayout3);
                TabLayout.Tab tabAt = tabLayout3.getTabAt(i8);
                if (tabAt != null) {
                    tabAt.select();
                }
            }
        }
    }

    @Override // D4.AbstractActivityC1109k0
    protected void q3() {
    }

    @Override // D4.AbstractActivityC1109k0
    protected void r3() {
    }

    public final void u7() {
        a5.Q e8 = a5.Q.f14058k.e(this);
        if (!isFinishing() && e8 != null && e8.y()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            if (!aVar.n0(this)) {
                AlertDialog r22 = r2();
                if (r22 != null) {
                    r22.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                t0 c8 = t0.c(getLayoutInflater());
                AbstractC3255y.h(c8, "inflate(layoutInflater)");
                TextView textView = c8.f12568o;
                j.a aVar2 = H4.j.f3824g;
                textView.setTypeface(aVar2.t());
                String string = getString(R.string.uptodown_turbo);
                AbstractC3255y.h(string, "getString(R.string.uptodown_turbo)");
                int color = ContextCompat.getColor(this, R.color.turbo_text_gradient_start);
                int color2 = ContextCompat.getColor(this, R.color.turbo_text_gradient_end);
                TextView textView2 = c8.f12568o;
                AbstractC3255y.h(textView2, "uptodownTurboWelcomeBind….tvTitleTurboWelcomePopup");
                String obj = textView2.getText().toString();
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, textView2.getPaint().measureText(string), textView2.getHeight(), new int[]{color, color2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                SpannableString spannableString = new SpannableString(obj);
                int S8 = j6.n.S(obj, string, 0, false, 6, null);
                if (S8 >= 0) {
                    spannableString.setSpan(new C3671k.a.C0811a(linearGradient, getResources().getDimension(R.dimen.font_size_26)), S8, string.length() + S8, 33);
                }
                textView2.setText(spannableString);
                Spanned c9 = C3655A.f36474a.c(getString(R.string.turbo_welcome_popup_description, getString(R.string.turbo_welcome_popup_manage_subscription)));
                String string2 = getString(R.string.turbo_welcome_popup_manage_subscription);
                AbstractC3255y.h(string2, "getString(R.string.turbo…opup_manage_subscription)");
                SpannableString spannableString2 = new SpannableString(c9);
                int S9 = j6.n.S(c9, string2, 0, false, 6, null);
                if (S9 >= 0) {
                    spannableString2.setSpan(new StyleSpan(1), S9, string2.length() + S9, 33);
                }
                c8.f12562i.setText(spannableString2);
                c8.f12562i.setTypeface(aVar2.u());
                c8.f12566m.setTypeface(aVar2.t());
                c8.f12565l.setTypeface(aVar2.u());
                c8.f12561h.setTypeface(aVar2.t());
                c8.f12560g.setTypeface(aVar2.u());
                c8.f12564k.setTypeface(aVar2.t());
                c8.f12563j.setTypeface(aVar2.u());
                c8.f12567n.setTypeface(aVar2.t());
                c8.f12567n.setOnClickListener(new View.OnClickListener() { // from class: D4.z0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.v7(MainActivity.this, view);
                    }
                });
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                N2(builder.create());
                if (!isFinishing() && r2() != null) {
                    AlertDialog r23 = r2();
                    AbstractC3255y.f(r23);
                    Window window = r23.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    AlertDialog r24 = r2();
                    AbstractC3255y.f(r24);
                    r24.show();
                    aVar.l1(this, true);
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "shown");
                    new C3678r(this).b("turbo_welcome_popup", bundle);
                }
            }
        }
    }

    public final void x5() {
        O6();
        if (!V5()) {
            W5();
        }
    }

    public final void y7(String str) {
        if (C5() instanceof C1531b) {
            Fragment C52 = C5();
            AbstractC3255y.g(C52, "null cannot be cast to non-null type com.uptodown.fragments.AlternativesFragment");
            ((C1531b) C52).y(str);
        }
    }

    public final Object z7(String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new F(str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    @Override // D4.AbstractActivityC1109k0
    protected void n3(a5.Q q8) {
    }

    @Override // D4.AbstractActivityC1109k0
    protected void p3(a5.Q q8, String str) {
    }
}
