package X4;

import G4.C1193c;
import H4.j;
import P5.AbstractC1378t;
import W4.C1468a;
import W4.C1472c;
import W4.C1475d0;
import W4.C1477e0;
import W4.C1484i;
import W4.C1486j;
import W4.C1488l;
import W4.C1490n;
import W4.C1493q;
import W4.C1497v;
import W4.C1498w;
import W4.C1501z;
import X4.L0;
import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import Z4.InterfaceC1596j;
import a5.C1632D;
import a5.C1637d;
import a5.C1638e;
import a5.C1639f;
import a5.C1641h;
import a5.C1643j;
import a5.C1644k;
import a5.C1645l;
import a5.C1646m;
import a5.C1647n;
import a5.C1648o;
import a5.C1650q;
import a5.C1653u;
import a5.F;
import a5.K;
import a5.L;
import a5.Q;
import a5.T;
import a5.x;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.ComposerKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2683a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.Gallery;
import com.uptodown.activities.InformationActivity;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.SearchActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.activities.YouTubeActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.util.views.UsernameTextView;
import com.uptodown.views.ScrollableTextView;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import com.uptodown.workers.GenerateQueueWorker;
import com.uptodown.workers.GetUserDataWorker;
import g2.InterfaceC2865e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l2.InterfaceC3309b;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import o5.C3655A;
import o5.C3660F;
import o5.C3661a;
import o5.C3667g;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3683w;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3854c;
import q5.C3855d;

/* loaded from: classes5.dex */
public final class L0 extends Fragment {

    /* renamed from: K, reason: collision with root package name */
    public static final C1502a f12856K = new C1502a(null);

    /* renamed from: A, reason: collision with root package name */
    private boolean f12857A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f12858B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f12859C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f12860D;

    /* renamed from: E, reason: collision with root package name */
    private String f12861E;

    /* renamed from: F, reason: collision with root package name */
    private G4.K f12862F;

    /* renamed from: G, reason: collision with root package name */
    private G4.K f12863G;

    /* renamed from: I, reason: collision with root package name */
    private final ActivityResultLauncher f12865I;

    /* renamed from: J, reason: collision with root package name */
    private final ActivityResultLauncher f12866J;

    /* renamed from: a, reason: collision with root package name */
    private C1472c f12867a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f12868b;

    /* renamed from: c, reason: collision with root package name */
    private C1641h f12869c;

    /* renamed from: d, reason: collision with root package name */
    private C1637d f12870d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12871e;

    /* renamed from: f, reason: collision with root package name */
    private int f12872f;

    /* renamed from: g, reason: collision with root package name */
    private C1639f f12873g;

    /* renamed from: h, reason: collision with root package name */
    private a5.O f12874h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12875i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12876j;

    /* renamed from: l, reason: collision with root package name */
    private int f12878l;

    /* renamed from: m, reason: collision with root package name */
    private AlertDialog f12879m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f12880n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12881o;

    /* renamed from: r, reason: collision with root package name */
    private Menu f12884r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12885s;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12888v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12889w;

    /* renamed from: x, reason: collision with root package name */
    private a5.U f12890x;

    /* renamed from: y, reason: collision with root package name */
    private a5.K f12891y;

    /* renamed from: z, reason: collision with root package name */
    private C3678r f12892z;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12877k = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12882p = true;

    /* renamed from: q, reason: collision with root package name */
    private int f12883q = -1;

    /* renamed from: t, reason: collision with root package name */
    private int f12886t = -1;

    /* renamed from: u, reason: collision with root package name */
    private long f12887u = -1;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList f12864H = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class A extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12893a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f12895c;

        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC1590d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f12896a;

            a(L0 l02) {
                this.f12896a = l02;
            }

            @Override // Z4.InterfaceC1590d
            public void b(C1641h app) {
                AbstractC3255y.i(app, "app");
                if (UptodownApp.f29058B.a0() && this.f12896a.getActivity() != null && !this.f12896a.requireActivity().isFinishing()) {
                    this.f12896a.d5(app);
                }
            }
        }

        /* loaded from: classes5.dex */
        public static final class b implements InterfaceC1587a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f12897a;

            b(L0 l02) {
                this.f12897a = l02;
            }

            @Override // Z4.InterfaceC1587a
            public void a(C1641h appInfo, int i8) {
                AbstractC3255y.i(appInfo, "appInfo");
                this.f12897a.w6(appInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f12895c = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(L0 l02, a5.N n8, View view) {
            if (UptodownApp.f29058B.a0()) {
                l02.Q4(n8.b());
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new A(this.f12895c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12893a == 0) {
                O5.t.b(obj);
                L0.this.J3().f12087Y.setVisibility(8);
                if (L0.this.getActivity() != null) {
                    Iterator it = this.f12895c.iterator();
                    while (it.hasNext()) {
                        final a5.N n8 = (a5.N) it.next();
                        W4.G c8 = W4.G.c(L0.this.getLayoutInflater());
                        AbstractC3255y.h(c8, "inflate(layoutInflater)");
                        LinearLayout root = c8.getRoot();
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.topMargin = (int) L0.this.getResources().getDimension(com.uptodown.R.dimen.margin_l);
                        root.setLayoutParams(layoutParams);
                        a aVar = new a(L0.this);
                        b bVar = new b(L0.this);
                        Context requireContext = L0.this.requireContext();
                        AbstractC3255y.h(requireContext, "requireContext()");
                        G4.K k8 = new G4.K(aVar, bVar, requireContext, 20);
                        k8.d(n8.a());
                        L0.this.f12864H.add(k8);
                        c8.f11772e.setTypeface(H4.j.f3824g.t());
                        c8.f11772e.setText(n8.b().h());
                        RelativeLayout relativeLayout = c8.f11770c;
                        final L0 l02 = L0.this;
                        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: X4.P0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                L0.A.m(L0.this, n8, view);
                            }
                        });
                        c8.f11771d.setAdapter(k8);
                        c8.f11771d.setNestedScrollingEnabled(false);
                        c8.f11771d.setItemAnimator(null);
                        c8.f11771d.setLayoutManager(new LinearLayoutManager(L0.this.getContext(), 0, false));
                        L0.this.J3().f12119r.addView(c8.getRoot());
                    }
                }
                L0.this.J3().f12119r.setVisibility(0);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((A) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class B extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12898a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f12900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f12900c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new B(this.f12900c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12898a == 0) {
                O5.t.b(obj);
                L0.this.J3().f12087Y.setTypeface(H4.j.f3824g.t());
                if (L0.this.getActivity() != null) {
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(L0.this.requireContext());
                    horizontalScrollView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    LinearLayout linearLayout = new LinearLayout(L0.this.requireContext());
                    linearLayout.setOrientation(0);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    horizontalScrollView.addView(linearLayout);
                    L0.this.J3().f12119r.addView(horizontalScrollView);
                    Iterator it = this.f12900c.iterator();
                    while (it.hasNext()) {
                        C1644k category = (C1644k) it.next();
                        int dimension = (int) L0.this.getResources().getDimension(com.uptodown.R.dimen.margin_m);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (AbstractC3255y.d(category, AbstractC1378t.y0(this.f12900c))) {
                            layoutParams.setMargins(dimension, 0, dimension, 0);
                        } else {
                            layoutParams.setMargins(dimension, 0, 0, 0);
                        }
                        L0 l02 = L0.this;
                        AbstractC3255y.h(category, "category");
                        linearLayout.addView(l02.s5(category, layoutParams));
                    }
                }
                L0.this.J3().f12119r.setVisibility(0);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((B) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class C extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12901a;

        C(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12901a == 0) {
                O5.t.b(obj);
                if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing() && L0.this.f12891y != null) {
                    a5.K k8 = L0.this.f12891y;
                    AbstractC3255y.f(k8);
                    if (k8.s() >= 1) {
                        L0.this.J3().f12123v.f11696b.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    a5.K k9 = L0.this.f12891y;
                    AbstractC3255y.f(k9);
                    if (k9.s() >= 2) {
                        L0.this.J3().f12123v.f11697c.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    a5.K k10 = L0.this.f12891y;
                    AbstractC3255y.f(k10);
                    if (k10.s() >= 3) {
                        L0.this.J3().f12123v.f11698d.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    a5.K k11 = L0.this.f12891y;
                    AbstractC3255y.f(k11);
                    if (k11.s() >= 4) {
                        L0.this.J3().f12123v.f11699e.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    a5.K k12 = L0.this.f12891y;
                    AbstractC3255y.f(k12);
                    if (k12.s() == 5) {
                        L0.this.J3().f12123v.f11700f.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    L0.this.J3().f12123v.f11703i.setText(L0.this.getString(com.uptodown.R.string.edit_your_review));
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class D implements Z4.r {
        D() {
        }

        @Override // Z4.r
        public void c(int i8) {
            if (i8 == 404) {
                L0.this.f12857A = true;
            }
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            L0.this.T5(appInfo);
            L0.this.u5();
            L0.this.F2();
            L0.this.E2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class E extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12904a;

        E(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new E(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12904a == 0) {
                O5.t.b(obj);
                L0.this.v5();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((E) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12906a;

        F(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new F(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12906a == 0) {
                O5.t.b(obj);
                L0.this.l5();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((F) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class G extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f12908a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f12909b;

        /* renamed from: d, reason: collision with root package name */
        int f12911d;

        G(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f12909b = obj;
            this.f12911d |= Integer.MIN_VALUE;
            return L0.this.Q3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class H extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12912a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f12914c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f12914c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new H(this.f12914c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12912a == 0) {
                O5.t.b(obj);
                if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                    if (!this.f12914c.isEmpty()) {
                        L0.this.J5(this.f12914c);
                    } else {
                        L0.this.J3().f12065C.setVisibility(8);
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12915a;

        I(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new I(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12915a == 0) {
                O5.t.b(obj);
                L0.this.J3().f12065C.setVisibility(8);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((I) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class J extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12917a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f12918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(kotlin.jvm.internal.T t8, S5.d dVar) {
            super(2, dVar);
            this.f12918b = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new J(this.f12918b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12917a == 0) {
                O5.t.b(obj);
                return a5.K.f14002o.e((JSONArray) this.f12918b.f34162a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class K extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12919a;

        K(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new K(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12919a == 0) {
                O5.t.b(obj);
                L0 l02 = L0.this;
                C1641h I32 = l02.I3();
                AbstractC3255y.f(I32);
                l02.L5(I32.V0(), false);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((K) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class L extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final L f12921a = new L();

        L() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(a5.L ss1, a5.L ss2) {
            AbstractC3255y.i(ss1, "ss1");
            AbstractC3255y.i(ss2, "ss2");
            return Integer.valueOf(ss1.b() - ss2.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class M extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12922a;

        M(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new M(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12922a == 0) {
                O5.t.b(obj);
                L0.this.G4();
                L0.this.K5();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((M) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class N extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12924a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a5.K f12926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(a5.K k8, S5.d dVar) {
            super(2, dVar);
            this.f12926c = k8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new N(this.f12926c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f12924a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                a5.K k8 = this.f12926c;
                this.f12924a = 1;
                if (l02.E4(k8, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((N) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class O extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f12927a;

        /* renamed from: b, reason: collision with root package name */
        Object f12928b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f12929c;

        /* renamed from: e, reason: collision with root package name */
        int f12931e;

        O(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f12929c = obj;
            this.f12931e |= Integer.MIN_VALUE;
            return L0.this.E4(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class P extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12933b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0 f12934c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a5.K f12935d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        P(int i8, L0 l02, a5.K k8, S5.d dVar) {
            super(2, dVar);
            this.f12933b = i8;
            this.f12934c = l02;
            this.f12935d = k8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new P(this.f12933b, this.f12934c, this.f12935d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12932a == 0) {
                O5.t.b(obj);
                int i8 = -1;
                if (this.f12933b == 1) {
                    C1641h I32 = this.f12934c.I3();
                    AbstractC3255y.f(I32);
                    ArrayList Q02 = I32.Q0();
                    AbstractC3255y.f(Q02);
                    Iterator it = Q02.iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i10 = i9 + 1;
                        if (((a5.K) it.next()).l() == this.f12935d.l()) {
                            i8 = i9;
                            break;
                        }
                        i9 = i10;
                    }
                    if (i8 > 0) {
                        C1641h I33 = this.f12934c.I3();
                        AbstractC3255y.f(I33);
                        ArrayList Q03 = I33.Q0();
                        AbstractC3255y.f(Q03);
                        if (i8 < Q03.size()) {
                            C1641h I34 = this.f12934c.I3();
                            AbstractC3255y.f(I34);
                            ArrayList Q04 = I34.Q0();
                            AbstractC3255y.f(Q04);
                            Q04.set(i8, this.f12935d);
                            this.f12934c.P6(this.f12935d, i8);
                        }
                    }
                } else {
                    Snackbar.make(this.f12934c.J3().f12120s, com.uptodown.R.string.error_generico, -1).show();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((P) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Q implements BannerAdListener {
        Q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(L0 this$0, View view) {
            AbstractC3255y.i(this$0, "this$0");
            this$0.E6();
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void closeFullScreen(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onClick(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "clicked");
            new C3678r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onCloseBanner(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "closed");
            new C3678r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLeaveApp(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadFailed(MBridgeIds ids, String errorMsg) {
            AbstractC3255y.i(ids, "ids");
            AbstractC3255y.i(errorMsg, "errorMsg");
            L0.this.J3().f12125x.setVisibility(8);
            L0.this.J3().f12096d0.setVisibility(8);
            L0.this.J3().f12125x.release();
            Bundle bundle = new Bundle();
            bundle.putString("type", "failed");
            new C3678r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadSuccessed(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
            L0.this.J3().f12096d0.setTypeface(H4.j.f3824g.u());
            L0.this.J3().f12096d0.setVisibility(0);
            TextView textView = L0.this.J3().f12096d0;
            final L0 l02 = L0.this;
            textView.setOnClickListener(new View.OnClickListener() { // from class: X4.Q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.Q.b(L0.this, view);
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("type", "loaded");
            new C3678r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLogImpression(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void showFullScreen(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
        }
    }

    /* loaded from: classes5.dex */
    public static final class R implements InterfaceC3309b {
        R() {
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception e8) {
            AbstractC3255y.i(e8, "e");
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            ImageView imageView = L0.this.f12868b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (!L0.this.f12882p) {
                CollapsingToolbarLayout collapsingToolbarLayout = L0.this.J3().f12097e;
                C1641h I32 = L0.this.I3();
                AbstractC3255y.f(I32);
                collapsingToolbarLayout.setTitle(I32.s0());
                L0.this.J3().f12091b.setExpanded(false, false);
            }
            if (L0.this.I3() != null) {
                C1641h I33 = L0.this.I3();
                AbstractC3255y.f(I33);
                if (I33.e0() != null) {
                    L0.this.F3();
                    FragmentActivity activity = L0.this.getActivity();
                    if (activity != null) {
                        L0.this.N6(activity);
                    }
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class S implements Z4.K {
        S() {
        }

        @Override // Z4.K
        public void a() {
            if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing() && L0.this.I3() != null) {
                FragmentActivity activity = L0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                C1641h I32 = L0.this.I3();
                AbstractC3255y.f(I32);
                ((AbstractActivityC2683a) activity).I2(I32.S0());
            }
        }

        @Override // Z4.K
        public void b(a5.H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing() && L0.this.I3() != null) {
                Intent intent = new Intent(L0.this.requireActivity(), (Class<?>) VirusTotalReport.class);
                intent.putExtra("appInfo", L0.this.I3());
                intent.putExtra("appReportVT", reportVT);
                L0 l02 = L0.this;
                UptodownApp.a aVar = UptodownApp.f29058B;
                FragmentActivity requireActivity = l02.requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                l02.startActivity(intent, aVar.a(requireActivity));
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class T implements InterfaceC3309b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12940b;

        T(Context context) {
            this.f12940b = context;
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception e8) {
            AbstractC3255y.i(e8, "e");
            e8.printStackTrace();
            L0 l02 = L0.this;
            l02.Q5(l02.J3().f12069G.f12165b, this.f12940b);
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            L0 l02 = L0.this;
            l02.Q5(l02.J3().f12069G.f12165b, this.f12940b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class U extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12941a;

        U(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new U(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f12941a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                this.f12941a = 1;
                if (l02.P5(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((U) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class V implements InterfaceC1590d {
        V() {
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                L0.this.d5(app);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class W implements InterfaceC1587a {
        W() {
        }

        @Override // Z4.InterfaceC1587a
        public void a(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            L0.this.w6(appInfo);
        }
    }

    /* loaded from: classes5.dex */
    public static final class X implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1475d0 f12945a;

        X(C1475d0 c1475d0) {
            this.f12945a = c1475d0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f12945a.f12157n.getViewTreeObserver().removeOnPreDrawListener(this);
            TextView textView = this.f12945a.f12157n;
            AbstractC3255y.h(textView, "reviewBinding.tvBodyReview");
            if (q5.v.a(textView)) {
                this.f12945a.f12162s.setVisibility(0);
                this.f12945a.f12162s.setTypeface(H4.j.f3824g.t());
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Y implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1477e0 f12946a;

        Y(C1477e0 c1477e0) {
            this.f12946a = c1477e0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f12946a.f12203n.getViewTreeObserver().removeOnPreDrawListener(this);
            TextView textView = this.f12946a.f12203n;
            AbstractC3255y.h(textView, "reviewBinding.tvBodyReview");
            if (q5.v.a(textView)) {
                this.f12946a.f12208s.setVisibility(0);
                this.f12946a.f12208s.setTypeface(H4.j.f3824g.t());
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Z implements Z4.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f12948b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f12949c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f12950d;

        Z(ArrayList arrayList, kotlin.jvm.internal.T t8, ArrayList arrayList2) {
            this.f12948b = arrayList;
            this.f12949c = t8;
            this.f12950d = arrayList2;
        }

        @Override // Z4.C
        public void a(a5.L screenshot) {
            AbstractC3255y.i(screenshot, "screenshot");
            this.f12948b.remove(screenshot);
            G4.D d8 = (G4.D) this.f12949c.f34162a;
            if (d8 != null) {
                d8.c(screenshot);
            }
        }

        @Override // Z4.C
        public void b(a5.T video) {
            AbstractC3255y.i(video, "video");
            if (UptodownApp.f29058B.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                Intent intent = new Intent(L0.this.getActivity(), (Class<?>) YouTubeActivity.class);
                intent.putExtra("id_youtube", video.getId());
                L0.this.startActivity(intent);
            }
        }

        @Override // Z4.C
        public void c(a5.L screenshot) {
            AbstractC3255y.i(screenshot, "screenshot");
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                Intent intent = new Intent(L0.this.requireActivity(), (Class<?>) Gallery.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("images", this.f12948b);
                bundle.putInt("index", this.f12948b.indexOf(screenshot));
                intent.putExtra("bundle", bundle);
                L0 l02 = L0.this;
                FragmentActivity requireActivity = l02.requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                l02.startActivity(intent, aVar.a(requireActivity));
            }
        }

        @Override // Z4.C
        public void d(a5.T video) {
            AbstractC3255y.i(video, "video");
            this.f12950d.remove(video);
            G4.D d8 = (G4.D) this.f12949c.f34162a;
            if (d8 != null) {
                d8.c(video);
            }
        }
    }

    /* renamed from: X4.L0$a, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1502a {
        private C1502a() {
        }

        public final L0 a(C1641h c1641h, long j8) {
            L0 l02 = new L0();
            Bundle bundle = new Bundle();
            if (c1641h != null) {
                bundle.putParcelable("appInfo", c1641h);
            }
            bundle.putLong("appId", j8);
            l02.setArguments(bundle);
            return l02;
        }

        public /* synthetic */ C1502a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class a0 implements InterfaceC1590d {
        a0() {
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                L0.this.d5(app);
            }
        }
    }

    /* renamed from: X4.L0$b, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1503b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f12952a;

        /* renamed from: b, reason: collision with root package name */
        private final a5.O f12953b;

        public RunnableC1503b(int i8, a5.O o8) {
            this.f12952a = i8;
            this.f12953b = o8;
        }

        @Override // java.lang.Runnable
        public void run() {
            a5.O o8;
            if (L0.this.I3() != null && (o8 = this.f12953b) != null) {
                String s8 = o8.s();
                C1641h I32 = L0.this.I3();
                AbstractC3255y.f(I32);
                if (j6.n.s(s8, I32.y0(), true)) {
                    int i8 = this.f12952a;
                    if (i8 == 101) {
                        L0.this.p6(this.f12953b);
                        return;
                    }
                    if (i8 != 103) {
                        if (i8 == 109) {
                            L0.this.p6(this.f12953b);
                            L0.this.v5();
                            return;
                        } else {
                            FragmentActivity activity = L0.this.getActivity();
                            if (activity != null) {
                                L0.this.G6(activity);
                                return;
                            }
                            return;
                        }
                    }
                    if (L0.this.getContext() != null) {
                        C3667g c3667g = new C3667g();
                        C1641h I33 = L0.this.I3();
                        AbstractC3255y.f(I33);
                        if (c3667g.r(I33.y0(), L0.this.getContext())) {
                            L0 l02 = L0.this;
                            Context requireContext = l02.requireContext();
                            AbstractC3255y.h(requireContext, "requireContext()");
                            l02.r6(requireContext);
                            return;
                        }
                        L0 l03 = L0.this;
                        Context requireContext2 = l03.requireContext();
                        AbstractC3255y.h(requireContext2, "requireContext()");
                        l03.g6(requireContext2);
                        return;
                    }
                    FragmentActivity activity2 = L0.this.getActivity();
                    if (activity2 != null) {
                        L0.this.G6(activity2);
                    }
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class b0 implements InterfaceC1587a {
        b0() {
        }

        @Override // Z4.InterfaceC1587a
        public void a(C1641h appInfo, int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            L0.this.w6(appInfo);
        }
    }

    /* renamed from: X4.L0$c, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1504c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f12956a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12957b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0 f12958c;

        public RunnableC1504c(L0 l02, String packagename, int i8) {
            AbstractC3255y.i(packagename, "packagename");
            this.f12958c = l02;
            this.f12956a = packagename;
            this.f12957b = i8;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                X4.L0 r0 = r4.f12958c
                a5.h r0 = r0.I3()
                if (r0 == 0) goto Lce
                X4.L0 r0 = r4.f12958c
                a5.h r0 = r0.I3()
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                java.lang.String r0 = r0.y0()
                if (r0 == 0) goto Lce
                X4.L0 r0 = r4.f12958c
                a5.h r0 = r0.I3()
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                java.lang.String r0 = r0.y0()
                java.lang.String r1 = r4.f12956a
                r2 = 1
                boolean r0 = j6.n.s(r0, r1, r2)
                if (r0 == 0) goto Lce
                int r0 = r4.f12957b
                switch(r0) {
                    case 301: goto Lbd;
                    case 302: goto Laf;
                    case 303: goto L92;
                    case 304: goto L75;
                    case 305: goto L63;
                    case 306: goto L55;
                    case 307: goto L37;
                    default: goto L32;
                }
            L32:
                switch(r0) {
                    case 351: goto Lbd;
                    case 352: goto Laf;
                    case 353: goto L92;
                    default: goto L35;
                }
            L35:
                goto Lce
            L37:
                X4.L0 r0 = r4.f12958c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                X4.L0 r1 = r4.f12958c
                r2 = 2131951985(0x7f130171, float:1.95404E38)
                java.lang.String r2 = r1.getString(r2)
                java.lang.String r3 = "getString(R.string.error_generico)"
                kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
                X4.L0.U0(r1, r2)
                X4.L0.v2(r1, r0)
                goto Lce
            L55:
                X4.L0 r0 = r4.f12958c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                X4.L0 r1 = r4.f12958c
                X4.L0.c2(r1, r0)
                goto Lce
            L63:
                X4.L0 r0 = r4.f12958c
                r1 = 2131953005(0x7f13056d, float:1.9542469E38)
                java.lang.String r1 = r0.getString(r1)
                java.lang.String r2 = "getString(R.string.uninstalling)"
                kotlin.jvm.internal.AbstractC3255y.h(r1, r2)
                X4.L0.e2(r0, r1)
                goto Lce
            L75:
                X4.L0 r0 = r4.f12958c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                X4.L0 r1 = r4.f12958c
                r2 = 2131952271(0x7f13028f, float:1.954098E38)
                java.lang.String r2 = r1.getString(r2)
                java.lang.String r3 = "getString(R.string.msg_r…iled_invalid_versioncode)"
                kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
                X4.L0.U0(r1, r2)
                X4.L0.f2(r1, r0)
                goto Lce
            L92:
                X4.L0 r0 = r4.f12958c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                X4.L0 r1 = r4.f12958c
                r2 = 2131952262(0x7f130286, float:1.9540962E38)
                java.lang.String r2 = r1.getString(r2)
                java.lang.String r3 = "getString(R.string.msg_install_failed)"
                kotlin.jvm.internal.AbstractC3255y.h(r2, r3)
                X4.L0.U0(r1, r2)
                X4.L0.f2(r1, r0)
                goto Lce
            Laf:
                X4.L0 r0 = r4.f12958c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                X4.L0 r1 = r4.f12958c
                X4.L0.h2(r1, r0)
                goto Lce
            Lbd:
                X4.L0 r0 = r4.f12958c
                r1 = 2131952069(0x7f1301c5, float:1.954057E38)
                java.lang.String r1 = r0.getString(r1)
                java.lang.String r2 = "getString(R.string.installing)"
                kotlin.jvm.internal.AbstractC3255y.h(r1, r2)
                X4.L0.e2(r0, r1)
            Lce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X4.L0.RunnableC1504c.run():void");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c0 extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1646m f12959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f12960b;

        c0(C1646m c1646m, L0 l02) {
            this.f12959a = c1646m;
            this.f12960b = l02;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3255y.i(widget, "widget");
            if (UptodownApp.f29058B.a0() && this.f12959a.a() != null) {
                this.f12960b.c5(this.f12959a.a().longValue());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(this.f12960b.requireContext(), com.uptodown.R.color.main_blue));
            ds.setTypeface(H4.j.f3824g.t());
        }
    }

    /* renamed from: X4.L0$d, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1505d implements Runnable {
        public RunnableC1505d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentActivity activity;
            if (L0.this.I3() != null && (activity = L0.this.getActivity()) != null) {
                L0.this.G6(activity);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d0 extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1646m f12962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f12963b;

        d0(C1646m c1646m, L0 l02) {
            this.f12962a = c1646m;
            this.f12963b = l02;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3255y.i(widget, "widget");
            if (UptodownApp.f29058B.a0() && this.f12962a.a() != null) {
                C1644k c1644k = new C1644k((int) this.f12962a.a().longValue(), this.f12962a.d(), null, 4, null);
                c1644k.H(true);
                this.f12963b.Q4(c1644k);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(this.f12963b.requireContext(), com.uptodown.R.color.main_blue));
            ds.setTypeface(H4.j.f3824g.t());
        }
    }

    /* renamed from: X4.L0$e, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1506e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f12964a;

        /* renamed from: b, reason: collision with root package name */
        private final C1648o f12965b;

        public RunnableC1506e(int i8, C1648o c1648o) {
            this.f12964a = i8;
            this.f12965b = c1648o;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C1648o c1648o;
            if (L0.this.I3() != null && (c1648o = this.f12965b) != null && c1648o.Y() != null) {
                String Y7 = this.f12965b.Y();
                C1641h I32 = L0.this.I3();
                AbstractC3255y.f(I32);
                if (j6.n.s(Y7, I32.y0(), true)) {
                    int i8 = this.f12964a;
                    if (i8 != 103) {
                        if (i8 == 211) {
                            L0.this.k6(this.f12965b);
                            return;
                        }
                        switch (i8) {
                            case 200:
                                if (L0.this.C4()) {
                                    L0.this.c6(this.f12965b);
                                }
                                L0.this.v5();
                                return;
                            case ComposerKt.providerKey /* 201 */:
                                if (L0.this.C4()) {
                                    L0.this.c6(this.f12965b);
                                    return;
                                }
                                return;
                            case ComposerKt.compositionLocalMapKey /* 202 */:
                                if (L0.this.getContext() != null) {
                                    C3667g c3667g = new C3667g();
                                    C1641h I33 = L0.this.I3();
                                    AbstractC3255y.f(I33);
                                    if (c3667g.r(I33.y0(), L0.this.getContext())) {
                                        L0 l02 = L0.this;
                                        Context requireContext = l02.requireContext();
                                        AbstractC3255y.h(requireContext, "requireContext()");
                                        l02.r6(requireContext);
                                    } else {
                                        L0 l03 = L0.this;
                                        Context requireContext2 = l03.requireContext();
                                        AbstractC3255y.h(requireContext2, "requireContext()");
                                        l03.g6(requireContext2);
                                    }
                                    C1648o c1648o2 = this.f12965b;
                                    Context requireContext3 = L0.this.requireContext();
                                    AbstractC3255y.h(requireContext3, "requireContext()");
                                    File v8 = c1648o2.v(requireContext3);
                                    if (v8 != null) {
                                        UptodownApp.a aVar = UptodownApp.f29058B;
                                        Context requireContext4 = L0.this.requireContext();
                                        AbstractC3255y.h(requireContext4, "requireContext()");
                                        C1641h I34 = L0.this.I3();
                                        AbstractC3255y.f(I34);
                                        aVar.X(v8, requireContext4, I34.t0());
                                        return;
                                    }
                                    return;
                                }
                                FragmentActivity activity = L0.this.getActivity();
                                if (activity != null) {
                                    L0.this.G6(activity);
                                    return;
                                }
                                return;
                            case ComposerKt.providerValuesKey /* 203 */:
                                FragmentActivity activity2 = L0.this.getActivity();
                                if (activity2 != null) {
                                    L0 l04 = L0.this;
                                    String string = l04.getString(com.uptodown.R.string.download_error_message);
                                    AbstractC3255y.h(string, "getString(R.string.download_error_message)");
                                    l04.m3(string);
                                    l04.a6(activity2);
                                    return;
                                }
                                return;
                            default:
                                switch (i8) {
                                    case 205:
                                        L0.this.Z5(this.f12965b);
                                        return;
                                    case ComposerKt.referenceKey /* 206 */:
                                        FragmentActivity activity3 = L0.this.getActivity();
                                        if (activity3 != null) {
                                            L0.this.G6(activity3);
                                            return;
                                        }
                                        return;
                                    case ComposerKt.reuseKey /* 207 */:
                                        FragmentActivity activity4 = L0.this.getActivity();
                                        if (activity4 != null) {
                                            L0.this.a6(activity4);
                                            return;
                                        }
                                        return;
                                    default:
                                        FragmentActivity activity5 = L0.this.getActivity();
                                        if (activity5 != null) {
                                            L0.this.G6(activity5);
                                            return;
                                        }
                                        return;
                                }
                        }
                    }
                    C1648o c1648o3 = this.f12965b;
                    Context requireContext5 = L0.this.requireContext();
                    AbstractC3255y.h(requireContext5, "requireContext()");
                    File v9 = c1648o3.v(requireContext5);
                    if (v9 != null) {
                        UptodownApp.a aVar2 = UptodownApp.f29058B;
                        Context requireContext6 = L0.this.requireContext();
                        AbstractC3255y.h(requireContext6, "requireContext()");
                        C1641h I35 = L0.this.I3();
                        AbstractC3255y.f(I35);
                        aVar2.X(v9, requireContext6, I35.t0());
                        return;
                    }
                    return;
                }
            }
            L0 l05 = L0.this;
            C1648o c1648o4 = this.f12965b;
            if (c1648o4 != null) {
                str = c1648o4.Y();
            } else {
                str = null;
            }
            l05.O6(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12967a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f12968b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f12970a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f12971b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L0 f12972c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: X4.L0$e0$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0251a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12973a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12974b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0251a(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12974b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0251a(this.f12974b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12973a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        L0 l02 = this.f12974b;
                        this.f12973a = 1;
                        if (l02.T3(this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((C0251a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12975a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12976b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12976b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new b(this.f12976b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12975a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        L0 l02 = this.f12976b;
                        this.f12975a = 1;
                        if (l02.K3(this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12977a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12978b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12978b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new c(this.f12978b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12977a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        L0 l02 = this.f12978b;
                        this.f12977a = 1;
                        if (l02.P3(this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12979a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12980b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12980b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new d(this.f12980b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12979a;
                    if (i8 != 0) {
                        if (i8 != 1 && i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        O5.t.b(obj);
                    } else {
                        O5.t.b(obj);
                        C1641h I32 = this.f12980b.I3();
                        if (I32 != null && I32.h0() == 1) {
                            L0 l02 = this.f12980b;
                            this.f12979a = 1;
                            if (l02.H3(this) == e8) {
                                return e8;
                            }
                        } else {
                            L0 l03 = this.f12980b;
                            this.f12979a = 2;
                            if (l03.R3(this) == e8) {
                                return e8;
                            }
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12981a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12982b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12982b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new e(this.f12982b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12981a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        L0 l02 = this.f12982b;
                        this.f12981a = 1;
                        if (l02.Q3(this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12983a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12984b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12984b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new f(this.f12984b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12983a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        L0 l02 = this.f12984b;
                        this.f12983a = 1;
                        if (l02.M3(this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12985a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12986b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12986b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new g(this.f12986b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12985a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        L0 l02 = this.f12986b;
                        this.f12985a = 1;
                        if (l02.L3(this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f12987a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f12988b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(L0 l02, S5.d dVar) {
                    super(2, dVar);
                    this.f12988b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new h(this.f12988b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f12987a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        L0 l02 = this.f12988b;
                        this.f12987a = 1;
                        if (l02.G3(this) == e8) {
                            return e8;
                        }
                    }
                    return O5.I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, S5.d dVar) {
                    return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, S5.d dVar) {
                super(2, dVar);
                this.f12972c = l02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                a aVar = new a(this.f12972c, dVar);
                aVar.f12971b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f12970a == 0) {
                    O5.t.b(obj);
                    l6.M m8 = (l6.M) this.f12971b;
                    AbstractC3364k.d(m8, null, null, new C0251a(this.f12972c, null), 3, null);
                    AbstractC3364k.d(m8, null, null, new b(this.f12972c, null), 3, null);
                    AbstractC3364k.d(m8, null, null, new c(this.f12972c, null), 3, null);
                    AbstractC3364k.d(m8, null, null, new d(this.f12972c, null), 3, null);
                    AbstractC3364k.d(m8, null, null, new e(this.f12972c, null), 3, null);
                    AbstractC3364k.d(m8, null, null, new f(this.f12972c, null), 3, null);
                    AbstractC3364k.d(m8, null, null, new g(this.f12972c, null), 3, null);
                    AbstractC3364k.d(m8, null, null, new h(this.f12972c, null), 3, null);
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        e0(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            e0 e0Var = new e0(dVar);
            e0Var.f12968b = obj;
            return e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3390x0 d8;
            Object e8 = T5.b.e();
            int i8 = this.f12967a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                d8 = AbstractC3364k.d((l6.M) this.f12968b, C3347b0.b(), null, new a(L0.this, null), 2, null);
                this.f12967a = 1;
                if (d8.y(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((e0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$f, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1507f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12989a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f12991c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f12992d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.L0$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f12993a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L0 f12994b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, S5.d dVar) {
                super(2, dVar);
                this.f12994b = l02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f12994b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f12993a == 0) {
                    O5.t.b(obj);
                    this.f12994b.m6();
                    this.f12994b.o3();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1507f(C3660F c3660f, View view, S5.d dVar) {
            super(2, dVar);
            this.f12991c = c3660f;
            this.f12992d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1507f(this.f12991c, this.f12992d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = T5.b.e();
            int i8 = this.f12989a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                if (L0.this.I3() != null) {
                    C1641h I32 = L0.this.I3();
                    AbstractC3255y.f(I32);
                    if (I32.i() > 0) {
                        C1641h I33 = L0.this.I3();
                        AbstractC3255y.f(I33);
                        long i9 = I33.i();
                        C1641h I34 = L0.this.I3();
                        AbstractC3255y.f(I34);
                        String s02 = I34.s0();
                        AbstractC3255y.f(s02);
                        C1641h I35 = L0.this.I3();
                        AbstractC3255y.f(I35);
                        String m02 = I35.m0();
                        C1641h I36 = L0.this.I3();
                        AbstractC3255y.f(I36);
                        C1632D c1632d = new C1632D(i9, s02, m02, I36.C0());
                        C3660F c3660f = this.f12991c;
                        C1641h I37 = L0.this.I3();
                        AbstractC3255y.f(I37);
                        a5.I a8 = c3660f.a(I37.i());
                        if (!a8.b() && (d8 = a8.d()) != null && d8.length() != 0) {
                            String d9 = a8.d();
                            AbstractC3255y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                                if (this.f12992d.getContext() != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("type", "added");
                                    new C3678r(this.f12992d.getContext()).b("preregister", bundle);
                                    Context requireContext = L0.this.requireContext();
                                    AbstractC3255y.h(requireContext, "requireContext()");
                                    c1632d.h(requireContext);
                                }
                                l6.J0 c8 = C3347b0.c();
                                a aVar = new a(L0.this, null);
                                this.f12989a = 1;
                                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                                    return e8;
                                }
                            }
                        }
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1507f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f0 implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f12995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f12996b;

        f0(View view, L0 l02) {
            this.f12995a = view;
            this.f12996b = l02;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f12995a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f12996b.startPostponedEnterTransition();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$g, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1508g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12997a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3660F f12999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f13000d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.L0$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f13001a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L0 f13002b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, S5.d dVar) {
                super(2, dVar);
                this.f13002b = l02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f13002b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f13001a == 0) {
                    O5.t.b(obj);
                    this.f13002b.m6();
                    FragmentActivity activity = this.f13002b.getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
                    if (r22 != null) {
                        r22.dismiss();
                        return O5.I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1508g(C3660F c3660f, View view, S5.d dVar) {
            super(2, dVar);
            this.f12999c = c3660f;
            this.f13000d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1508g(this.f12999c, this.f13000d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = T5.b.e();
            int i8 = this.f12997a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                if (L0.this.I3() != null) {
                    C1641h I32 = L0.this.I3();
                    AbstractC3255y.f(I32);
                    if (I32.i() > 0) {
                        C1641h I33 = L0.this.I3();
                        AbstractC3255y.f(I33);
                        long i9 = I33.i();
                        a5.I d9 = this.f12999c.d(i9);
                        if (!d9.b() && (d8 = d9.d()) != null && d8.length() != 0) {
                            String d10 = d9.d();
                            AbstractC3255y.f(d10);
                            JSONObject jSONObject = new JSONObject(d10);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                                if (this.f13000d.getContext() != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("type", "removed");
                                    new C3678r(this.f13000d.getContext()).b("preregister", bundle);
                                    C3674n.a aVar = C3674n.f36505t;
                                    Context context = this.f13000d.getContext();
                                    AbstractC3255y.h(context, "context");
                                    C3674n a8 = aVar.a(context);
                                    a8.a();
                                    a8.b1(i9);
                                    a8.l();
                                }
                                l6.J0 c8 = C3347b0.c();
                                a aVar2 = new a(L0.this, null);
                                this.f12997a = 1;
                                if (AbstractC3360i.g(c8, aVar2, this) == e8) {
                                    return e8;
                                }
                            }
                        }
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1508g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13003a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13005c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(String str, S5.d dVar) {
            super(2, dVar);
            this.f13005c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g0(this.f13005c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13003a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                String str = this.f13005c;
                this.f13003a = 1;
                if (l02.L6(str, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((g0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$h, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1509h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13006a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13007b;

        /* renamed from: d, reason: collision with root package name */
        int f13009d;

        C1509h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13007b = obj;
            this.f13009d |= Integer.MIN_VALUE;
            return L0.this.U2(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13010a;

        h0(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13010a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                this.f13010a = 1;
                if (l02.O3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((h0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$i, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1510i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13012a;

        C1510i(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1510i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13012a == 0) {
                O5.t.b(obj);
                if (L0.this.getContext() != null && L0.this.I3() != null) {
                    C1641h I32 = L0.this.I3();
                    AbstractC3255y.f(I32);
                    if (I32.y0() != null) {
                        C3674n.a aVar = C3674n.f36505t;
                        Context requireContext = L0.this.requireContext();
                        AbstractC3255y.h(requireContext, "requireContext()");
                        C3674n a8 = aVar.a(requireContext);
                        a8.a();
                        C1641h I33 = L0.this.I3();
                        AbstractC3255y.f(I33);
                        String y02 = I33.y0();
                        AbstractC3255y.f(y02);
                        C1639f S8 = a8.S(y02);
                        if (S8 != null) {
                            L0.this.f12873g = S8;
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1510i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13014a;

        i0(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13014a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                this.f13014a = 1;
                if (l02.O3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((i0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$j, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1511j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13016a;

        C1511j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1511j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13016a == 0) {
                O5.t.b(obj);
                if (L0.this.f12873g != null) {
                    C1639f c1639f = L0.this.f12873g;
                    AbstractC3255y.f(c1639f);
                    if (c1639f.i() == 0) {
                        L0 l02 = L0.this;
                        String string = l02.getString(com.uptodown.R.string.not_offer_updates);
                        AbstractC3255y.h(string, "getString(R.string.not_offer_updates)");
                        l02.W5(com.uptodown.R.id.action_exclude, string);
                        return O5.I.f8278a;
                    }
                }
                L0 l03 = L0.this;
                String string2 = l03.getString(com.uptodown.R.string.offer_updates_again);
                AbstractC3255y.h(string2, "getString(R.string.offer_updates_again)");
                l03.W5(com.uptodown.R.id.action_exclude, string2);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1511j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j0 extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1641h f13018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f13019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(C1641h c1641h, L0 l02) {
            super(0);
            this.f13018a = c1641h;
            this.f13019b = l02;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m70invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m70invoke() {
            if (this.f13018a.y0() != null) {
                L0 l02 = this.f13019b;
                String y02 = this.f13018a.y0();
                AbstractC3255y.f(y02);
                l02.O6(y02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$k, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1512k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13020a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13022c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f13023d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f13024e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f13025f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1512k(Context context, kotlin.jvm.internal.T t8, kotlin.jvm.internal.O o8, kotlin.jvm.internal.O o9, S5.d dVar) {
            super(2, dVar);
            this.f13022c = context;
            this.f13023d = t8;
            this.f13024e = o8;
            this.f13025f = o9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1512k(this.f13022c, this.f13023d, this.f13024e, this.f13025f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1639f c1639f;
            Object obj2;
            T5.b.e();
            if (this.f13020a == 0) {
                O5.t.b(obj);
                L0.this.J3().f12066D.f12359d.setVisibility(8);
                L0.this.J3().f12063A.f12686h.setVisibility(8);
                if (L0.this.I3() != null) {
                    C1641h I32 = L0.this.I3();
                    AbstractC3255y.f(I32);
                    if (I32.b()) {
                        L0.this.J3().f12090a0.setVisibility(0);
                    } else {
                        L0.this.J3().f12090a0.setVisibility(8);
                    }
                    C1641h I33 = L0.this.I3();
                    AbstractC3255y.f(I33);
                    if (I33.r1()) {
                        L0.this.n6();
                    } else {
                        C1641h I34 = L0.this.I3();
                        AbstractC3255y.f(I34);
                        if (I34.o1()) {
                            L0.this.a6(this.f13022c);
                        } else {
                            String str = null;
                            if (L0.this.f12873g != null) {
                                if (L0.this.f12874h != null) {
                                    a5.O o8 = L0.this.f12874h;
                                    AbstractC3255y.f(o8);
                                    if (o8.h() != 1) {
                                        C1639f c1639f2 = L0.this.f12873g;
                                        AbstractC3255y.f(c1639f2);
                                        if (c1639f2.i() != 1) {
                                            if (this.f13023d.f34162a == null) {
                                                if (!L0.this.f12875i) {
                                                    L0.this.u6(this.f13022c);
                                                } else {
                                                    a5.O o9 = L0.this.f12874h;
                                                    AbstractC3255y.f(o9);
                                                    if (!o9.a()) {
                                                        ArrayList G8 = UptodownApp.f29058B.G();
                                                        if (G8 != null) {
                                                            L0 l02 = L0.this;
                                                            Iterator it = G8.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    obj2 = it.next();
                                                                    String J8 = ((C1639f) obj2).J();
                                                                    a5.O o10 = l02.f12874h;
                                                                    AbstractC3255y.f(o10);
                                                                    if (AbstractC3255y.d(J8, o10.s())) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    obj2 = null;
                                                                    break;
                                                                }
                                                            }
                                                            c1639f = (C1639f) obj2;
                                                        } else {
                                                            c1639f = null;
                                                        }
                                                        if (c1639f == null) {
                                                            a5.O o11 = L0.this.f12874h;
                                                            AbstractC3255y.f(o11);
                                                            if (!o11.a()) {
                                                                a5.O o12 = L0.this.f12874h;
                                                                AbstractC3255y.f(o12);
                                                                if (o12.u() != 100) {
                                                                    L0.this.t6(this.f13022c);
                                                                }
                                                            }
                                                            N4.a h8 = H4.j.f3824g.h();
                                                            if (h8 != null) {
                                                                str = h8.b();
                                                            }
                                                            a5.O o13 = L0.this.f12874h;
                                                            AbstractC3255y.f(o13);
                                                            if (!j6.n.s(str, o13.s(), true)) {
                                                                L0.this.r6(this.f13022c);
                                                            } else {
                                                                L0 l03 = L0.this;
                                                                String string = l03.getString(com.uptodown.R.string.updating);
                                                                AbstractC3255y.h(string, "getString(R.string.updating)");
                                                                l03.f6(string);
                                                            }
                                                        }
                                                    }
                                                    L0 l04 = L0.this;
                                                    l04.p6(l04.f12874h);
                                                }
                                            } else if (!L0.this.f12875i) {
                                                L0.this.u6(this.f13022c);
                                            } else if (!this.f13024e.f34158a) {
                                                L0.this.a6(this.f13022c);
                                            } else if (L0.this.f12876j) {
                                                L0.this.r6(this.f13022c);
                                            } else if (L0.this.C4() || this.f13025f.f34158a) {
                                                L0.this.c6((C1648o) this.f13023d.f34162a);
                                            } else {
                                                L0.this.t6(this.f13022c);
                                            }
                                        }
                                    }
                                }
                                C1639f c1639f3 = L0.this.f12873g;
                                AbstractC3255y.f(c1639f3);
                                if (!c1639f3.n0()) {
                                    L0.this.j6(this.f13022c);
                                } else {
                                    L0.this.J3().f12066D.getRoot().setVisibility(4);
                                    L0.this.J3().f12063A.getRoot().setVisibility(8);
                                }
                            } else if (!L0.this.W3()) {
                                L0.this.i6(this.f13022c, (C1648o) this.f13023d.f34162a);
                            } else {
                                if (!L0.this.f12857A) {
                                    C1641h I35 = L0.this.I3();
                                    AbstractC3255y.f(I35);
                                    if (!I35.m1()) {
                                        C1641h I36 = L0.this.I3();
                                        AbstractC3255y.f(I36);
                                        if (I36.p1()) {
                                            L0.this.m6();
                                        } else {
                                            C1641h I37 = L0.this.I3();
                                            AbstractC3255y.f(I37);
                                            if (!I37.k1() && SettingsPreferences.f30353b.S(this.f13022c)) {
                                                L0.this.H4();
                                                L0 l05 = L0.this;
                                                String string2 = l05.getString(com.uptodown.R.string.app_detail_not_compatible);
                                                AbstractC3255y.h(string2, "getString(R.string.app_detail_not_compatible)");
                                                l05.Y5(string2);
                                            } else {
                                                C1641h I38 = L0.this.I3();
                                                AbstractC3255y.f(I38);
                                                if (I38.y0() != null) {
                                                    N4.a h9 = H4.j.f3824g.h();
                                                    if (h9 != null) {
                                                        str = h9.b();
                                                    }
                                                    C1641h I39 = L0.this.I3();
                                                    AbstractC3255y.f(I39);
                                                    if (j6.n.s(str, I39.y0(), true)) {
                                                        L0 l06 = L0.this;
                                                        String string3 = l06.getString(com.uptodown.R.string.installing);
                                                        AbstractC3255y.h(string3, "getString(R.string.installing)");
                                                        l06.f6(string3);
                                                    } else {
                                                        if (L0.this.f12874h != null) {
                                                            C3674n a8 = C3674n.f36505t.a(this.f13022c);
                                                            a8.a();
                                                            a5.O o14 = L0.this.f12874h;
                                                            AbstractC3255y.f(o14);
                                                            a8.M(o14.s());
                                                            a8.l();
                                                        }
                                                        if (this.f13023d.f34162a == null) {
                                                            L0.this.a6(this.f13022c);
                                                        } else if (!L0.this.f12875i) {
                                                            if ((L0.this.C4() || this.f13025f.f34158a) && this.f13024e.f34158a) {
                                                                L0.this.c6((C1648o) this.f13023d.f34162a);
                                                            } else {
                                                                L0.this.a6(this.f13022c);
                                                            }
                                                        } else if (L0.this.f12876j) {
                                                            L0.this.g6(this.f13022c);
                                                        } else if (L0.this.C4() || this.f13025f.f34158a) {
                                                            L0.this.c6((C1648o) this.f13023d.f34162a);
                                                        } else {
                                                            L0.this.o6(this.f13022c);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                L0 l07 = L0.this;
                                String string4 = l07.getString(com.uptodown.R.string.app_detail_not_available);
                                AbstractC3255y.h(string4, "getString(R.string.app_detail_not_available)");
                                l07.Y5(string4);
                            }
                        }
                    }
                    L0.this.f12888v = true;
                    if (L0.this.f12873g != null) {
                        L0.this.D6(com.uptodown.R.id.action_app_details_settings);
                        L0.this.D6(com.uptodown.R.id.action_exclude);
                    } else {
                        L0.this.X3(com.uptodown.R.id.action_app_details_settings);
                        L0.this.X3(com.uptodown.R.id.action_exclude);
                    }
                    C1641h I310 = L0.this.I3();
                    AbstractC3255y.f(I310);
                    if (I310.o1()) {
                        C1641h I311 = L0.this.I3();
                        AbstractC3255y.f(I311);
                        String Y7 = I311.Y();
                        if (Y7 != null && Y7.length() != 0) {
                            TextView textView = L0.this.J3().f12116o.f11782c;
                            L0 l08 = L0.this;
                            textView.setTypeface(H4.j.f3824g.u());
                            C1641h I312 = l08.I3();
                            AbstractC3255y.f(I312);
                            textView.setText(I312.Y());
                            L0.this.J3().f12116o.getRoot().setVisibility(0);
                        }
                    }
                    L0.this.J3().f12116o.getRoot().setVisibility(8);
                    L0.this.J3().f12116o.f11782c.setVisibility(8);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1512k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$l, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1513l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13029a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f13031c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.L0$l$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f13032a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.T f13033b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L0 f13034c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O f13035d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3660F f13036e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.jvm.internal.T t8, L0 l02, kotlin.jvm.internal.O o8, C3660F c3660f, S5.d dVar) {
                super(2, dVar);
                this.f13033b = t8;
                this.f13034c = l02;
                this.f13035d = o8;
                this.f13036e = c3660f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f13033b, this.f13034c, this.f13035d, this.f13036e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f13032a == 0) {
                    O5.t.b(obj);
                    CharSequence charSequence = (CharSequence) this.f13033b.f34162a;
                    if (charSequence != null && charSequence.length() != 0) {
                        this.f13034c.J3().f12066D.f12361f.setText((CharSequence) this.f13033b.f34162a);
                        this.f13034c.J3().f12063A.f12694p.setText((CharSequence) this.f13033b.f34162a);
                    }
                    if (this.f13035d.f34158a) {
                        L0 l02 = this.f13034c;
                        TextView textView = l02.J3().f12066D.f12361f;
                        AbstractC3255y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
                        l02.P2(textView, this.f13036e);
                        L0 l03 = this.f13034c;
                        RelativeLayout relativeLayout = l03.J3().f12063A.f12687i;
                        AbstractC3255y.h(relativeLayout, "binding.rlBottomDownload…etail.rlStatusPreRegister");
                        l03.P2(relativeLayout, this.f13036e);
                        this.f13034c.J3().f12063A.f12682d.setVisibility(8);
                        if (this.f13034c.getContext() != null) {
                            this.f13034c.J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(this.f13034c.requireContext(), com.uptodown.R.drawable.ripple_open_button));
                            this.f13034c.J3().f12066D.f12361f.setTextColor(ContextCompat.getColorStateList(this.f13034c.requireContext(), com.uptodown.R.color.selector_wizard_accept_button_text));
                            this.f13034c.J3().f12063A.f12687i.setBackground(ContextCompat.getDrawable(this.f13034c.requireContext(), com.uptodown.R.drawable.ripple_open_button));
                            this.f13034c.J3().f12063A.f12694p.setTextColor(ContextCompat.getColorStateList(this.f13034c.requireContext(), com.uptodown.R.color.selector_wizard_accept_button_text));
                        }
                    } else {
                        L0 l04 = this.f13034c;
                        TextView textView2 = l04.J3().f12066D.f12361f;
                        AbstractC3255y.h(textView2, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
                        l04.C2(textView2, this.f13036e);
                        L0 l05 = this.f13034c;
                        RelativeLayout relativeLayout2 = l05.J3().f12063A.f12687i;
                        AbstractC3255y.h(relativeLayout2, "binding.rlBottomDownload…etail.rlStatusPreRegister");
                        l05.C2(relativeLayout2, this.f13036e);
                        this.f13034c.J3().f12063A.f12682d.setVisibility(0);
                        if (this.f13034c.getContext() != null) {
                            this.f13034c.J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(this.f13034c.requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
                            this.f13034c.J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(this.f13034c.requireContext(), com.uptodown.R.color.white));
                            this.f13034c.J3().f12063A.f12687i.setBackground(ContextCompat.getDrawable(this.f13034c.requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
                            this.f13034c.J3().f12063A.f12694p.setTextColor(ContextCompat.getColor(this.f13034c.requireContext(), com.uptodown.R.color.white));
                        }
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1513l(kotlin.jvm.internal.O o8, S5.d dVar) {
            super(2, dVar);
            this.f13031c = o8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1513l(this.f13031c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            boolean z8;
            Object e8 = T5.b.e();
            int i8 = this.f13029a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
                Context requireContext = L0.this.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C3660F c3660f = new C3660F(requireContext);
                C1641h I32 = L0.this.I3();
                AbstractC3255y.f(I32);
                a5.I h8 = c3660f.h(I32.i());
                if (!h8.b() && (d8 = h8.d()) != null && d8.length() != 0) {
                    String d9 = h8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3255y.h(jSONObject2, "json.getJSONObject(Constantes.FIELD_DATA)");
                        if (!jSONObject2.isNull("message")) {
                            t8.f34162a = jSONObject2.getString("message");
                        }
                        if (!jSONObject2.isNull("preRegistered")) {
                            kotlin.jvm.internal.O o8 = this.f13031c;
                            if (jSONObject2.getInt("preRegistered") != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            o8.f34158a = z8;
                        }
                    }
                }
                l6.J0 c8 = C3347b0.c();
                a aVar = new a(t8, L0.this, this.f13031c, c3660f, null);
                this.f13029a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1513l) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l0 extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1641h f13037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f13038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(C1641h c1641h, L0 l02) {
            super(0);
            this.f13037a = c1641h;
            this.f13038b = l02;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m72invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m72invoke() {
            if (this.f13037a.y0() != null) {
                L0 l02 = this.f13038b;
                String y02 = this.f13037a.y0();
                AbstractC3255y.f(y02);
                l02.O6(y02);
            }
        }
    }

    /* renamed from: X4.L0$m, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1514m implements Z4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1648o f13040b;

        /* renamed from: X4.L0$m$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f13041a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1648o f13042b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, C1648o c1648o) {
                super(0);
                this.f13041a = l02;
                this.f13042b = c1648o;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m73invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m73invoke() {
                this.f13041a.A3(this.f13042b);
            }
        }

        /* renamed from: X4.L0$m$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f13043a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L0 l02) {
                super(0);
                this.f13043a = l02;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m74invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m74invoke() {
                L0 l02 = this.f13043a;
                FragmentActivity requireActivity = l02.requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                l02.O2(requireActivity);
            }
        }

        C1514m(C1648o c1648o) {
            this.f13040b = c1648o;
        }

        @Override // Z4.K
        public void a() {
            L0.this.A3(this.f13040b);
        }

        @Override // Z4.K
        public void b(a5.H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            if (L0.this.getActivity() != null && (L0.this.getActivity() instanceof AbstractActivityC2683a) && !L0.this.requireActivity().isFinishing() && L0.this.I3() != null) {
                C1641h I32 = L0.this.I3();
                AbstractC3255y.f(I32);
                I32.B1(reportVT);
                if (reportVT.h() <= 0) {
                    L0.this.A3(this.f13040b);
                    return;
                }
                FragmentActivity activity = L0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                C1641h I33 = L0.this.I3();
                AbstractC3255y.f(I33);
                ((AbstractActivityC2683a) activity).j2(I33, new a(L0.this, this.f13040b), new b(L0.this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$n, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1515n extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1648o f13048b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1515n(C1648o c1648o) {
            super(0);
            this.f13048b = c1648o;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m76invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m76invoke() {
            L0.this.A3(this.f13048b);
        }
    }

    /* loaded from: classes5.dex */
    public static final class n0 implements InterfaceC3309b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1468a f13050b;

        n0(C1468a c1468a) {
            this.f13050b = c1468a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C1468a interstitialBinding, L0 this$0) {
            AbstractC3255y.i(interstitialBinding, "$interstitialBinding");
            AbstractC3255y.i(this$0, "this$0");
            if (new C3671k().p(interstitialBinding.getRoot())) {
                C1653u.a aVar = C1653u.f14337n;
                Context requireContext = this$0.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C1653u d8 = aVar.d(requireContext);
                if (d8 != null) {
                    Context requireContext2 = this$0.requireContext();
                    AbstractC3255y.h(requireContext2, "requireContext()");
                    d8.j(requireContext2);
                    return;
                }
                return;
            }
            if (this$0.getActivity() != null && (this$0.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = this$0.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).U2();
            }
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception exc) {
            L0.this.J3().f12101g.removeAllViews();
            L0.this.J3().f12101g.setVisibility(8);
            L0.this.C6();
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            if (L0.this.getActivity() != null && (L0.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = L0.this.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).v2();
            }
            L0.this.J3().f12101g.addView(this.f13050b.getRoot());
            L0.this.J3().f12101g.setVisibility(0);
            Handler handler = new Handler(Looper.getMainLooper());
            final C1468a c1468a = this.f13050b;
            final L0 l02 = L0.this;
            handler.postDelayed(new Runnable() { // from class: X4.R0
                @Override // java.lang.Runnable
                public final void run() {
                    L0.n0.d(C1468a.this, l02);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$o, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1516o extends AbstractC3256z implements Function0 {
        C1516o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m77invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m77invoke() {
            L0 l02 = L0.this;
            FragmentActivity requireActivity = l02.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            l02.O2(requireActivity);
        }
    }

    /* loaded from: classes5.dex */
    public static final class o0 implements NewInterstitialListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBNewInterstitialHandler f13053b;

        o0(MBNewInterstitialHandler mBNewInterstitialHandler) {
            this.f13053b = mBNewInterstitialHandler;
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClicked(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "clicked");
            new C3678r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClose(MBridgeIds ids, RewardInfo info) {
            AbstractC3255y.i(ids, "ids");
            AbstractC3255y.i(info, "info");
            Bundle bundle = new Bundle();
            bundle.putString("type", "closed");
            new C3678r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdCloseWithNIReward(MBridgeIds ids, RewardInfo info) {
            AbstractC3255y.i(ids, "ids");
            AbstractC3255y.i(info, "info");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdShow(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
            if (L0.this.getContext() != null) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "show");
                new C3678r(L0.this.getContext()).b("mintegral_interstitial", bundle);
                SettingsPreferences.a aVar = SettingsPreferences.f30353b;
                Context requireContext = L0.this.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                aVar.Q0(requireContext, System.currentTimeMillis());
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onEndcardShow(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onLoadCampaignSuccess(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadFail(MBridgeIds ids, String errorMsg) {
            String str;
            AbstractC3255y.i(ids, "ids");
            AbstractC3255y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "load_failed");
            if (errorMsg.length() > 10) {
                str = errorMsg.substring(0, 10);
                AbstractC3255y.h(str, "substring(...)");
            } else if (errorMsg.length() > 0) {
                str = errorMsg;
            } else {
                str = null;
            }
            if (str != null) {
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, errorMsg);
            }
            new C3678r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadSuccess(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "loaded");
            new C3678r(L0.this.getContext()).b("mintegral_interstitial", bundle);
            if (this.f13053b.isReady()) {
                this.f13053b.show();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onShowFail(MBridgeIds ids, String errorMsg) {
            String str;
            AbstractC3255y.i(ids, "ids");
            AbstractC3255y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "show_failed");
            if (errorMsg.length() > 10) {
                str = errorMsg.substring(0, 10);
                AbstractC3255y.h(str, "substring(...)");
            } else if (errorMsg.length() > 0) {
                str = errorMsg;
            } else {
                str = null;
            }
            if (str != null) {
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, errorMsg);
            }
            new C3678r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onVideoComplete(MBridgeIds ids) {
            AbstractC3255y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "video_completed");
            new C3678r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }
    }

    /* renamed from: X4.L0$p, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1517p implements InterfaceC1596j {
        C1517p() {
        }

        @Override // Z4.InterfaceC1596j
        public void a(int i8) {
            L0.this.f12878l = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class p0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13055a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(Context context, S5.d dVar) {
            super(2, dVar);
            this.f13057c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new p0(this.f13057c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13055a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                Context context = this.f13057c;
                this.f13055a = 1;
                if (l02.Z2(context, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((p0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$q, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1518q extends AbstractC3256z implements Function0 {
        C1518q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m78invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m78invoke() {
            L0 l02 = L0.this;
            C1641h I32 = l02.I3();
            AbstractC3255y.f(I32);
            l02.S4(I32.Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class q0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13059a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13061c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f13062d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f13063e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f13064a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f13065b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L0 f13066c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f13067d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.jvm.internal.Q q8, L0 l02, kotlin.jvm.internal.Q q9, S5.d dVar) {
                super(2, dVar);
                this.f13065b = q8;
                this.f13066c = l02;
                this.f13067d = q9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f13065b, this.f13066c, this.f13067d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f13064a == 0) {
                    O5.t.b(obj);
                    int i8 = this.f13065b.f34160a;
                    if (i8 == 1) {
                        Toast.makeText(this.f13066c.requireContext(), this.f13066c.requireContext().getString(com.uptodown.R.string.review_sended), 0).show();
                        Bundle bundle = new Bundle();
                        bundle.putString(CampaignEx.JSON_KEY_STAR, String.valueOf(this.f13066c.f12883q));
                        C1641h I32 = this.f13066c.I3();
                        AbstractC3255y.f(I32);
                        bundle.putString("packagename", I32.y0());
                        C3678r c3678r = this.f13066c.f12892z;
                        if (c3678r != null) {
                            c3678r.b("app_rated", bundle);
                            return O5.I.f8278a;
                        }
                        return null;
                    }
                    if (i8 == 0 && this.f13067d.f34160a == 0) {
                        Toast.makeText(this.f13066c.requireContext(), com.uptodown.R.string.error_review_already_submitted, 1).show();
                        return O5.I.f8278a;
                    }
                    int i9 = this.f13067d.f34160a;
                    if (i9 == 401) {
                        this.f13066c.K4();
                        return O5.I.f8278a;
                    }
                    if (i9 == 403) {
                        Toast.makeText(this.f13066c.requireContext(), com.uptodown.R.string.email_validation_msg, 1).show();
                        return O5.I.f8278a;
                    }
                    Toast.makeText(this.f13066c.requireContext(), this.f13066c.requireContext().getString(com.uptodown.R.string.error_generico), 0).show();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(String str, kotlin.jvm.internal.Q q8, kotlin.jvm.internal.Q q9, S5.d dVar) {
            super(2, dVar);
            this.f13061c = str;
            this.f13062d = q8;
            this.f13063e = q9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new q0(this.f13061c, this.f13062d, this.f13063e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13059a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                if (L0.this.getContext() != null && L0.this.I3() != null) {
                    K.b bVar = a5.K.f14002o;
                    if (!bVar.b(L0.this.getContext(), this.f13061c)) {
                        bVar.f(L0.this.getContext(), this.f13061c, String.valueOf(System.currentTimeMillis()));
                        Context requireContext = L0.this.requireContext();
                        AbstractC3255y.h(requireContext, "requireContext()");
                        C3660F c3660f = new C3660F(requireContext);
                        a5.K k8 = new a5.K();
                        k8.c0(this.f13061c);
                        k8.b0(L0.this.f12883q);
                        C1641h I32 = L0.this.I3();
                        AbstractC3255y.f(I32);
                        a5.I I02 = c3660f.I0(I32.i(), k8);
                        this.f13062d.f34160a = I02.e();
                        if (!I02.b() && I02.d() != null) {
                            String d8 = I02.d();
                            AbstractC3255y.f(d8);
                            JSONObject jSONObject = new JSONObject(d8);
                            if (!jSONObject.isNull("success")) {
                                this.f13063e.f34160a = jSONObject.getInt("success");
                            }
                        }
                    }
                    l6.J0 c8 = C3347b0.c();
                    a aVar = new a(this.f13063e, L0.this, this.f13062d, null);
                    this.f13059a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((q0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$r, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1519r extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1519r f13068a = new C1519r();

        C1519r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m79invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m79invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class r0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13069a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13070b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0 f13071c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(String str, L0 l02, S5.d dVar) {
            super(2, dVar);
            this.f13070b = str;
            this.f13071c = l02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new r0(this.f13070b, this.f13071c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object obj4;
            T5.b.e();
            if (this.f13069a == 0) {
                O5.t.b(obj);
                String str = this.f13070b;
                if (str != null && str.length() != 0) {
                    if (this.f13071c.f12862F != null) {
                        G4.K k8 = this.f13071c.f12862F;
                        AbstractC3255y.f(k8);
                        ArrayList c8 = k8.c();
                        String str2 = this.f13070b;
                        Iterator it = c8.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = it.next();
                                if (AbstractC3255y.d(((C1641h) obj4).y0(), str2)) {
                                    break;
                                }
                            } else {
                                obj4 = null;
                                break;
                            }
                        }
                        G4.K k9 = this.f13071c.f12862F;
                        AbstractC3255y.f(k9);
                        int r02 = AbstractC1378t.r0(k9.c(), (C1641h) obj4);
                        G4.K k10 = this.f13071c.f12862F;
                        AbstractC3255y.f(k10);
                        k10.notifyItemChanged(r02);
                    }
                    if (this.f13071c.f12863G != null) {
                        G4.K k11 = this.f13071c.f12863G;
                        AbstractC3255y.f(k11);
                        ArrayList c9 = k11.c();
                        String str3 = this.f13070b;
                        Iterator it2 = c9.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (AbstractC3255y.d(((C1641h) obj3).y0(), str3)) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        G4.K k12 = this.f13071c.f12863G;
                        AbstractC3255y.f(k12);
                        int r03 = AbstractC1378t.r0(k12.c(), (C1641h) obj3);
                        G4.K k13 = this.f13071c.f12863G;
                        AbstractC3255y.f(k13);
                        k13.notifyItemChanged(r03);
                    }
                    if (!this.f13071c.f12864H.isEmpty()) {
                        Iterator it3 = this.f13071c.f12864H.iterator();
                        while (it3.hasNext()) {
                            G4.K k14 = (G4.K) it3.next();
                            ArrayList c10 = k14.c();
                            String str4 = this.f13070b;
                            Iterator it4 = c10.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj2 = it4.next();
                                    if (AbstractC3255y.d(((C1641h) obj2).y0(), str4)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            k14.notifyItemChanged(AbstractC1378t.r0(k14.c(), (C1641h) obj2));
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((r0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$s, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1520s extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13072a;

        C1520s(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1520s(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13072a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                this.f13072a = 1;
                if (l02.U2(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1520s) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class s0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13074a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13076c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, S5.d dVar) {
            super(2, dVar);
            this.f13076c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new s0(this.f13076c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FragmentActivity activity;
            T5.b.e();
            if (this.f13074a == 0) {
                O5.t.b(obj);
                if (L0.this.I3() != null) {
                    String str = this.f13076c;
                    C1641h I32 = L0.this.I3();
                    AbstractC3255y.f(I32);
                    if (j6.n.s(str, I32.y0(), true) && (activity = L0.this.getActivity()) != null) {
                        L0.this.G6(activity);
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((s0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$t, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1521t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13077a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13078b;

        /* renamed from: d, reason: collision with root package name */
        int f13080d;

        C1521t(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13078b = obj;
            this.f13080d |= Integer.MIN_VALUE;
            return L0.this.G3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class t0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13081a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0 f13083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(u0 u0Var, S5.d dVar) {
            super(2, dVar);
            this.f13083c = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new t0(this.f13083c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13081a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f31066b;
                Context requireContext = L0.this.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                u0 u0Var = this.f13083c;
                this.f13081a = 1;
                if (aVar.b(requireContext, u0Var, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((t0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$u, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1522u extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13084a;

        C1522u(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1522u(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f13084a == 0) {
                O5.t.b(obj);
                FragmentActivity requireActivity = L0.this.requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                C3660F c3660f = new C3660F(requireActivity);
                C1641h I32 = L0.this.I3();
                AbstractC3255y.f(I32);
                a5.I k8 = c3660f.k(I32.i());
                if (!k8.b() && (d8 = k8.d()) != null && d8.length() != 0) {
                    String d9 = k8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        L0 l02 = L0.this;
                        C1637d.a aVar = C1637d.f14116h;
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3255y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                        l02.f12870d = aVar.a(jSONObject2);
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1522u) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class u0 implements Z4.I {
        u0() {
        }

        @Override // Z4.I
        public void a() {
            Q.b bVar = a5.Q.f14058k;
            Context requireContext = L0.this.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            a5.Q e8 = bVar.e(requireContext);
            if (e8 != null && e8.y()) {
                L0.this.J3().f12101g.setVisibility(8);
                L0.this.J3().f12125x.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$v, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1523v extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13087a;

        C1523v(S5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(L0 l02, View view) {
            Long l8;
            if (l02.getContext() != null && l02.f12870d != null) {
                C1637d c1637d = l02.f12870d;
                AbstractC3255y.f(c1637d);
                if (c1637d.c() != null) {
                    C1637d c1637d2 = l02.f12870d;
                    if (c1637d2 != null) {
                        Context requireContext = l02.requireContext();
                        AbstractC3255y.h(requireContext, "requireContext()");
                        C1641h I32 = l02.I3();
                        if (I32 != null) {
                            l8 = Long.valueOf(I32.i());
                        } else {
                            l8 = null;
                        }
                        c1637d2.a(requireContext, l8);
                    }
                    if (l02.getActivity() != null) {
                        C1637d c1637d3 = l02.f12870d;
                        AbstractC3255y.f(c1637d3);
                        String c8 = c1637d3.c();
                        AbstractC3255y.f(c8);
                        C3671k c3671k = new C3671k();
                        FragmentActivity requireActivity = l02.requireActivity();
                        AbstractC3255y.h(requireActivity, "requireActivity()");
                        C3671k.r(c3671k, requireActivity, c8, null, 4, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(L0 l02) {
            C1637d c1637d;
            Long l8;
            if (new C3671k().p(l02.J3().f12126y.getRoot()) && (c1637d = l02.f12870d) != null) {
                Context requireContext = l02.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C1641h I32 = l02.I3();
                if (I32 != null) {
                    l8 = Long.valueOf(I32.i());
                } else {
                    l8 = null;
                }
                c1637d.b(requireContext, l8);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1523v(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13087a == 0) {
                O5.t.b(obj);
                if (L0.this.f12870d != null) {
                    L0.this.J3().f12126y.getRoot().setVisibility(0);
                    float dimension = L0.this.getResources().getDimension(com.uptodown.R.dimen.border_radius_m);
                    C1637d c1637d = L0.this.f12870d;
                    AbstractC3255y.f(c1637d);
                    int parseColor = Color.parseColor(c1637d.f());
                    C1637d c1637d2 = L0.this.f12870d;
                    AbstractC3255y.f(c1637d2);
                    int parseColor2 = Color.parseColor(c1637d2.g());
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
                    gradientDrawable.setCornerRadius(dimension);
                    L0.this.J3().f12126y.f12057d.setBackground(gradientDrawable);
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}, null, null));
                    shapeDrawable.getPaint().setColor(parseColor2);
                    L0.this.J3().f12126y.f12058e.setBackground(shapeDrawable);
                    com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                    C1641h I32 = L0.this.I3();
                    AbstractC3255y.f(I32);
                    h8.l(I32.m0()).i(L0.this.J3().f12126y.f12055b);
                    TextView textView = L0.this.J3().f12126y.f12060g;
                    j.a aVar = H4.j.f3824g;
                    textView.setTypeface(aVar.t());
                    L0.this.J3().f12126y.f12060g.setTextColor(parseColor);
                    TextView textView2 = L0.this.J3().f12126y.f12060g;
                    C1637d c1637d3 = L0.this.f12870d;
                    AbstractC3255y.f(c1637d3);
                    textView2.setText(c1637d3.i());
                    L0.this.J3().f12126y.f12059f.setTypeface(aVar.u());
                    TextView textView3 = L0.this.J3().f12126y.f12059f;
                    C1637d c1637d4 = L0.this.f12870d;
                    AbstractC3255y.f(c1637d4);
                    textView3.setText(c1637d4.e());
                    L0.this.J3().f12126y.f12058e.setTypeface(aVar.t());
                    TextView textView4 = L0.this.J3().f12126y.f12058e;
                    C1637d c1637d5 = L0.this.f12870d;
                    AbstractC3255y.f(c1637d5);
                    textView4.setText(c1637d5.d());
                    RelativeLayout root = L0.this.J3().f12126y.getRoot();
                    final L0 l02 = L0.this;
                    root.setOnClickListener(new View.OnClickListener() { // from class: X4.M0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            L0.C1523v.n(L0.this, view);
                        }
                    });
                    ImageView imageView = L0.this.J3().f12126y.f12055b;
                    Handler handler = new Handler(Looper.getMainLooper());
                    final L0 l03 = L0.this;
                    handler.postDelayed(new Runnable() { // from class: X4.N0
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.C1523v.o(L0.this);
                        }
                    }, 500L);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1523v) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class v0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13089a;

        v0(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new v0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f13089a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L0 l02 = L0.this;
                this.f13089a = 1;
                if (l02.W6(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((v0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$w, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1524w extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13091a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1638e f13093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1524w(C1638e c1638e, S5.d dVar) {
            super(2, dVar);
            this.f13093c = c1638e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(L0 l02, C1638e c1638e, View view) {
            l02.M4(c1638e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1524w(this.f13093c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13091a == 0) {
                O5.t.b(obj);
                L0.this.J3().f12107j.setVisibility(0);
                L0.this.J3().f12104h0.setText(L0.this.getString(com.uptodown.R.string.best_alternatives));
                LinearLayout linearLayout = L0.this.J3().f12122u;
                final L0 l02 = L0.this;
                final C1638e c1638e = this.f13093c;
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: X4.O0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        L0.C1524w.m(L0.this, c1638e, view);
                    }
                });
                if (this.f13093c.a() != null) {
                    ArrayList a8 = this.f13093c.a();
                    AbstractC3255y.f(a8);
                    if (a8.size() > 20) {
                        ArrayList a9 = this.f13093c.a();
                        AbstractC3255y.f(a9);
                        L0.this.L5(new ArrayList(a9.subList(0, 20)), true);
                        return O5.I.f8278a;
                    }
                }
                L0.this.L5(this.f13093c.a(), true);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1524w) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class w0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13094a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13095b;

        /* renamed from: d, reason: collision with root package name */
        int f13097d;

        w0(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13095b = obj;
            this.f13097d |= Integer.MIN_VALUE;
            return L0.this.W6(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$x, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1525x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13098a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13099b;

        /* renamed from: d, reason: collision with root package name */
        int f13101d;

        C1525x(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13099b = obj;
            this.f13101d |= Integer.MIN_VALUE;
            return L0.this.K3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class x0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13102a;

        x0(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new x0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13102a == 0) {
                O5.t.b(obj);
                if (L0.this.getContext() != null && L0.this.I3() != null) {
                    C3674n.a aVar = C3674n.f36505t;
                    Context requireContext = L0.this.requireContext();
                    AbstractC3255y.h(requireContext, "requireContext()");
                    C3674n a8 = aVar.a(requireContext);
                    a8.a();
                    L0 l02 = L0.this;
                    C1641h I32 = l02.I3();
                    AbstractC3255y.f(I32);
                    l02.f12890x = a8.x0(I32.i());
                    a8.l();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((x0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$y, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1526y extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13104a;

        C1526y(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1526y(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13104a == 0) {
                O5.t.b(obj);
                if (L0.this.getActivity() != null) {
                    FragmentActivity requireActivity = L0.this.requireActivity();
                    AbstractC3255y.h(requireActivity, "requireActivity()");
                    C3660F c3660f = new C3660F(requireActivity);
                    if (L0.this.I3() != null) {
                        C1641h I32 = L0.this.I3();
                        AbstractC3255y.f(I32);
                        ArrayList a02 = I32.a0();
                        if (a02 == null || a02.isEmpty()) {
                            C1641h I33 = L0.this.I3();
                            AbstractC3255y.f(I33);
                            a5.I t8 = c3660f.t(I33.i());
                            if (!t8.b() && t8.d() != null) {
                                String d8 = t8.d();
                                AbstractC3255y.f(d8);
                                if (d8.length() > 0) {
                                    C1650q.b bVar = C1650q.f14323c;
                                    String d9 = t8.d();
                                    AbstractC3255y.f(d9);
                                    ArrayList a8 = bVar.a(d9);
                                    C1641h I34 = L0.this.I3();
                                    AbstractC3255y.f(I34);
                                    I34.u1(a8);
                                }
                            }
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1526y) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class y0 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13106a;

        y0(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new y0(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13106a == 0) {
                O5.t.b(obj);
                if (L0.this.f12890x != null) {
                    L0 l02 = L0.this;
                    String string = l02.getString(com.uptodown.R.string.app_detail_remove_wishlist_title);
                    AbstractC3255y.h(string, "getString(R.string.app_d…il_remove_wishlist_title)");
                    l02.W5(com.uptodown.R.id.action_wishlist, string);
                    L0.this.J3().f12066D.f12358c.setBackground(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.ripple_wishlist_button));
                    L0.this.J3().f12066D.f12358c.setImageResource(com.uptodown.R.drawable.vector_heart_red);
                } else {
                    L0 l03 = L0.this;
                    String string2 = l03.getString(com.uptodown.R.string.app_detail_add_wishlist_title);
                    AbstractC3255y.h(string2, "getString(R.string.app_detail_add_wishlist_title)");
                    l03.W5(com.uptodown.R.id.action_wishlist, string2);
                    L0.this.J3().f12066D.f12358c.setBackground(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.ripple_wishlist_added_button));
                    L0.this.J3().f12066D.f12358c.setImageResource(com.uptodown.R.drawable.vector_heart_white);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((y0) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.L0$z, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1527z extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13108a;

        C1527z(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C1527z(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13108a == 0) {
                O5.t.b(obj);
                L0.this.r5();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C1527z) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public L0() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: X4.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                L0.J4(L0.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f12865I = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: X4.l
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                L0.S6(L0.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult2, "registerForActivityResul…text(), callback) }\n    }");
        this.f12866J = registerForActivityResult2;
    }

    private final void A2() {
        C1641h c1641h = this.f12869c;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.y0() != null && getContext() != null) {
                C3674n.a aVar = C3674n.f36505t;
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C3674n a8 = aVar.a(requireContext);
                a8.a();
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                String y02 = c1641h2.y0();
                AbstractC3255y.f(y02);
                C1639f S8 = a8.S(y02);
                if (S8 != null) {
                    if (S8.i() == 0) {
                        S8.t0(1);
                        C1639f.c c02 = S8.c0();
                        C1639f.c cVar = C1639f.c.UPDATED;
                        if (c02 != cVar) {
                            S8.J0(cVar);
                            String J8 = S8.J();
                            AbstractC3255y.f(J8);
                            a8.M(J8);
                            C3677q c3677q = new C3677q();
                            Context requireContext2 = requireContext();
                            AbstractC3255y.h(requireContext2, "requireContext()");
                            c3677q.c(requireContext2);
                        }
                    } else {
                        S8.t0(0);
                    }
                    a8.m1(S8);
                    this.f12873g = S8;
                    C3667g c3667g = new C3667g();
                    Context requireContext3 = requireContext();
                    AbstractC3255y.h(requireContext3, "requireContext()");
                    c3667g.A(requireContext3);
                }
                a8.l();
                C3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(C1648o c1648o) {
        if (getContext() != null) {
            a5.O o8 = this.f12874h;
            if (o8 != null) {
                AbstractC3255y.f(o8);
                F6(o8.s());
                return;
            }
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            c1648o.a(c1641h);
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            int l02 = c1648o.l0(requireContext);
            if (l02 >= 0) {
                if (this.f12858B) {
                    C1643j.a aVar = C1643j.f14251n;
                    Context requireContext2 = requireContext();
                    AbstractC3255y.h(requireContext2, "requireContext()");
                    C1643j d8 = aVar.d(requireContext2);
                    if (d8 != null && d8.k() == this.f12887u) {
                        Context requireContext3 = requireContext();
                        AbstractC3255y.h(requireContext3, "requireContext()");
                        d8.w(requireContext3, l02);
                    }
                } else if (this.f12859C) {
                    C1653u.a aVar2 = C1653u.f14337n;
                    Context requireContext4 = requireContext();
                    AbstractC3255y.h(requireContext4, "requireContext()");
                    C1653u d9 = aVar2.d(requireContext4);
                    if (d9 != null && d9.k() == this.f12887u) {
                        Context requireContext5 = requireContext();
                        AbstractC3255y.h(requireContext5, "requireContext()");
                        d9.w(requireContext5, l02);
                    }
                }
                z6();
                if (B4()) {
                    C1645l p8 = UptodownApp.f29058B.p();
                    AbstractC3255y.f(p8);
                    p8.g(l02);
                }
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                String y02 = c1641h2.y0();
                AbstractC3255y.f(y02);
                C1641h c1641h3 = this.f12869c;
                AbstractC3255y.f(c1641h3);
                Y2(l02, y02, c1641h3.i());
                DownloadApkWorker.a aVar3 = DownloadApkWorker.f31034k;
                Context requireContext6 = requireContext();
                AbstractC3255y.h(requireContext6, "requireContext()");
                if (!aVar3.f(requireContext6, l02)) {
                    J3().f12066D.f12361f.setVisibility(0);
                    J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.option_button_cancel));
                    J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_open_button));
                    J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.blue_primary));
                    J3().f12066D.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            L0.B3(L0.this, view);
                        }
                    });
                    J3().f12063A.f12680b.setVisibility(0);
                    SettingsPreferences.a aVar4 = SettingsPreferences.f30353b;
                    Context requireContext7 = requireContext();
                    AbstractC3255y.h(requireContext7, "requireContext()");
                    if (!aVar4.U(requireContext7)) {
                        Context requireContext8 = requireContext();
                        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
                        String string = getString(com.uptodown.R.string.msg_added_to_downlads_queue);
                        AbstractC3255y.h(string, "getString(R.string.msg_added_to_downlads_queue)");
                        C1641h c1641h4 = this.f12869c;
                        AbstractC3255y.f(c1641h4);
                        String format = String.format(string, Arrays.copyOf(new Object[]{c1641h4.s0()}, 1));
                        AbstractC3255y.h(format, "format(...)");
                        Toast.makeText(requireContext8, format, 1).show();
                    }
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).S1(c1648o);
                    return;
                }
                return;
            }
            m3(getString(com.uptodown.R.string.error_cant_enqueue_download) + " (108)");
            Context requireContext9 = requireContext();
            AbstractC3255y.h(requireContext9, "requireContext()");
            a6(requireContext9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A4(java.io.File r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.A4(java.io.File, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A5(L0 this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.a0()) {
            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) RepliesActivity.class);
            intent.putExtra("review", review);
            C1641h c1641h = this$0.f12869c;
            AbstractC3255y.f(c1641h);
            intent.putExtra("appName", c1641h.s0());
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A6(L0 this$0, C1653u c1653u, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.J3().f12101g.removeAllViews();
        this$0.J3().f12101g.setVisibility(8);
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        c1653u.f(requireContext);
        if (this$0.getActivity() != null && (this$0.getActivity() instanceof MainActivity)) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).U2();
        }
    }

    private final void B2() {
        if (getContext() != null && this.f12869c != null) {
            a5.U u8 = this.f12890x;
            if (u8 != null) {
                AbstractC3255y.f(u8);
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                u8.i(requireContext);
                Context requireContext2 = requireContext();
                Context requireContext3 = requireContext();
                C1641h c1641h = this.f12869c;
                AbstractC3255y.f(c1641h);
                Toast.makeText(requireContext2, requireContext3.getString(com.uptodown.R.string.action_removed_from_wishlist, c1641h.s0()), 0).show();
            } else {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                long i8 = c1641h2.i();
                C1641h c1641h3 = this.f12869c;
                AbstractC3255y.f(c1641h3);
                String s02 = c1641h3.s0();
                AbstractC3255y.f(s02);
                C1641h c1641h4 = this.f12869c;
                AbstractC3255y.f(c1641h4);
                String m02 = c1641h4.m0();
                C1641h c1641h5 = this.f12869c;
                AbstractC3255y.f(c1641h5);
                String y02 = c1641h5.y0();
                C1641h c1641h6 = this.f12869c;
                AbstractC3255y.f(c1641h6);
                a5.U u9 = new a5.U(i8, s02, m02, y02, c1641h6.n1());
                this.f12890x = u9;
                AbstractC3255y.f(u9);
                Context requireContext4 = requireContext();
                AbstractC3255y.h(requireContext4, "requireContext()");
                u9.h(requireContext4);
                Context requireContext5 = requireContext();
                Context requireContext6 = requireContext();
                C1641h c1641h7 = this.f12869c;
                AbstractC3255y.f(c1641h7);
                Toast.makeText(requireContext5, requireContext6.getString(com.uptodown.R.string.action_added_to_wishlist, c1641h7.s0()), 0).show();
            }
            V6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.d3();
    }

    private final boolean B4() {
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.p() != null) {
            C1645l p8 = aVar.p();
            AbstractC3255y.f(p8);
            String d8 = p8.d();
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            if (j6.n.s(d8, c1641h.y0(), true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B5(L0 this$0, C1475d0 reviewBinding, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(reviewBinding, "$reviewBinding");
        AbstractC3255y.i(review, "$review");
        if (UptodownApp.f29058B.a0()) {
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ImageView imageView = reviewBinding.f12147d;
            AbstractC3255y.h(imageView, "reviewBinding.ivLikesCounterReview");
            q5.k.a(requireContext, imageView);
            if (!C3655A.f36474a.i(review.l())) {
                this$0.D4(review);
                reviewBinding.f12159p.setText(String.valueOf(review.p() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B6(L0 this$0, C1653u c1653u, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0() && this$0.getActivity() != null && (this$0.getActivity() instanceof MainActivity)) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).U2();
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            c1653u.e(requireContext);
            this$0.J3().f12101g.removeAllViews();
            this$0.J3().f12101g.setVisibility(8);
            FragmentActivity activity2 = this$0.getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity2).F2(c1653u.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(final View view, final C3660F c3660f) {
        view.setOnClickListener(new View.OnClickListener() { // from class: X4.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                L0.D2(L0.this, c3660f, view, view2);
            }
        });
    }

    private final void C3() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1520s(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C4() {
        DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
        C1641h c1641h = this.f12869c;
        AbstractC3255y.f(c1641h);
        long i8 = c1641h.i();
        C1641h c1641h2 = this.f12869c;
        AbstractC3255y.f(c1641h2);
        return aVar.d(i8, c1641h2.o0());
    }

    private final View C5(LinearLayout.LayoutParams layoutParams) {
        C1475d0 c8 = C1475d0.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setVisibility(4);
        RelativeLayout root = c8.getRoot();
        AbstractC3255y.h(root, "reviewBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C6() {
        boolean z8;
        C1641h c1641h;
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        a5.Q e8 = bVar.e(requireContext);
        if (e8 != null && e8.y()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getContext() != null && (c1641h = this.f12869c) != null && c1641h.h() == 1 && !z8) {
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            long w8 = aVar.w(requireContext2);
            if (w8 == 0 || System.currentTimeMillis() - w8 >= 86400000) {
                try {
                    MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(requireContext(), "1525209", "3361225");
                    mBNewInterstitialHandler.setInterstitialVideoListener(new o0(mBNewInterstitialHandler));
                    mBNewInterstitialHandler.playVideoMute(1);
                    mBNewInterstitialHandler.load();
                } catch (Exception e9) {
                    e9.printStackTrace();
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "exception");
                    new C3678r(getContext()).b("mintegral_interstitial", bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(L0 this$0, C3660F wsHelper, View this_addPreRegister, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(wsHelper, "$wsHelper");
        AbstractC3255y.i(this_addPreRegister, "$this_addPreRegister");
        if (UptodownApp.f29058B.a0()) {
            AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C1507f(wsHelper, this_addPreRegister, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r0.length() != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void D3() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.D3():void");
    }

    private final void D4(a5.K k8) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new N(k8, null), 3, null);
    }

    private final View D5(LinearLayout.LayoutParams layoutParams, final a5.K k8, Context context) {
        CharSequence charSequence;
        final C1477e0 c8 = C1477e0.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.f12194e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        c8.f12195f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f12196g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f12197h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f12198i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        if (k8.s() >= 2) {
            c8.f12195f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (k8.s() >= 3) {
            c8.f12196g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (k8.s() >= 4) {
            c8.f12197h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (k8.s() == 5) {
            c8.f12198i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        UsernameTextView usernameTextView = c8.f12209t;
        j.a aVar = H4.j.f3824g;
        usernameTextView.setTypeface(aVar.t());
        c8.f12204o.setTypeface(aVar.u());
        c8.f12203n.setTypeface(aVar.u());
        c8.f12206q.setTypeface(aVar.u());
        c8.f12207r.setTypeface(aVar.u());
        Q.b bVar = a5.Q.f14058k;
        if (bVar.c(k8.i()) != null) {
            com.squareup.picasso.s.h().l(bVar.c(k8.i())).n(UptodownApp.f29058B.f0(context)).i(c8.f12192c);
        }
        String x8 = k8.x();
        if (x8 != null && x8.length() != 0) {
            c8.f12192c.setOnClickListener(new View.OnClickListener() { // from class: X4.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.E5(L0.this, k8, view);
                }
            });
            c8.f12209t.setOnClickListener(new View.OnClickListener() { // from class: X4.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.F5(L0.this, k8, view);
                }
            });
        }
        if (k8.y() != null) {
            c8.f12209t.setText(k8.y());
            UsernameTextView.a aVar2 = UsernameTextView.f31022k;
            UsernameTextView usernameTextView2 = c8.f12209t;
            AbstractC3255y.h(usernameTextView2, "reviewBinding.tvUsernameReview");
            aVar2.a(usernameTextView2, k8.H(), k8.z());
        }
        if (k8.w() != null) {
            c8.f12204o.setText(k8.w());
        }
        if (k8.a() == 1) {
            TextView textView = c8.f12207r;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String string = getString(com.uptodown.R.string.replies_counter_single);
            AbstractC3255y.h(string, "getString(R.string.replies_counter_single)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3255y.h(format, "format(...)");
            textView.setText(format);
        } else if (k8.a() > 1) {
            TextView textView2 = c8.f12207r;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34167a;
            String string2 = getString(com.uptodown.R.string.replies_counter_multiple);
            AbstractC3255y.h(string2, "getString(R.string.replies_counter_multiple)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(k8.a())}, 1));
            AbstractC3255y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        if (k8.u() != null) {
            c8.f12206q.setFocusable(true);
            TextView textView3 = c8.f12203n;
            Spanned v8 = k8.v();
            if (v8 != null) {
                charSequence = j6.n.M0(v8);
            } else {
                charSequence = null;
            }
            textView3.setText(charSequence);
            c8.f12203n.getViewTreeObserver().addOnPreDrawListener(new Y(c8));
            c8.f12208s.setOnClickListener(new View.OnClickListener() { // from class: X4.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.G5(C1477e0.this, this, view);
                }
            });
            c8.f12201l.setOnClickListener(new View.OnClickListener() { // from class: X4.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.H5(L0.this, k8, view);
                }
            });
            c8.f12201l.setFocusable(true);
            c8.f12205p.setText(String.valueOf(k8.p()));
            if (C3655A.f36474a.i(k8.l())) {
                c8.f12193d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_heart_red));
            }
            c8.f12200k.setOnClickListener(new View.OnClickListener() { // from class: X4.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.I5(L0.this, c8, k8, view);
                }
            });
        } else {
            c8.f12203n.setVisibility(8);
            c8.f12201l.setVisibility(8);
            c8.f12200k.setVisibility(8);
        }
        c8.f12199j.setVisibility(0);
        C3671k.a aVar3 = C3671k.f36498a;
        ImageView imageView = c8.f12192c;
        AbstractC3255y.h(imageView, "reviewBinding.ivAvatarReview");
        aVar3.a(imageView);
        c8.f12206q.setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3255y.h(root, "reviewBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D6(int i8) {
        Menu menu = this.f12884r;
        AbstractC3255y.f(menu);
        menu.findItem(i8).setVisible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2() {
        if (getContext() != null && this.f12858B) {
            this.f12888v = true;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            z3(requireContext);
        }
    }

    private final void E3() {
        C1641h c1641h = this.f12869c;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.t0() != null) {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                String t02 = c1641h2.t0();
                AbstractC3255y.f(t02);
                if (t02.length() > 0) {
                    if (J3().f12073K.f11767e.getVisibility() == 0) {
                        J3().f12073K.f11764b.setText(com.uptodown.R.string.read_less_desc_app_detail);
                        J3().f12073K.f11767e.setVisibility(8);
                        J3().f12073K.f11766d.setMaxLines(Integer.MAX_VALUE);
                        J3().f12073K.f11766d.setEllipsize(null);
                        return;
                    }
                    J3().f12073K.f11764b.setText(com.uptodown.R.string.read_more_desc_app_detail);
                    J3().f12073K.f11767e.setVisibility(0);
                    J3().f12073K.f11766d.setMaxLines(6);
                    J3().f12073K.f11766d.setEllipsize(TextUtils.TruncateAt.END);
                    J3().f12078P.smoothScrollTo(0, J3().f12073K.f11765c.getTop(), 1000);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E4(a5.K r8, S5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X4.L0.O
            if (r0 == 0) goto L13
            r0 = r9
            X4.L0$O r0 = (X4.L0.O) r0
            int r1 = r0.f12931e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12931e = r1
            goto L18
        L13:
            X4.L0$O r0 = new X4.L0$O
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f12929c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f12931e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r9)
            goto L79
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f12928b
            a5.K r8 = (a5.K) r8
            java.lang.Object r2 = r0.f12927a
            X4.L0 r2 = (X4.L0) r2
            O5.t.b(r9)
            goto L5c
        L40:
            O5.t.b(r9)
            a5.K$b r9 = a5.K.f14002o
            android.content.Context r2 = r7.requireContext()
            java.lang.String r5 = "requireContext()"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r5)
            r0.f12927a = r7
            r0.f12928b = r8
            r0.f12931e = r4
            java.lang.Object r9 = r9.c(r8, r2, r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r2 = r7
        L5c:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            l6.J0 r4 = l6.C3347b0.c()
            X4.L0$P r5 = new X4.L0$P
            r6 = 0
            r5.<init>(r9, r2, r8, r6)
            r0.f12927a = r6
            r0.f12928b = r6
            r0.f12931e = r3
            java.lang.Object r8 = l6.AbstractC3360i.g(r4, r5, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.E4(a5.K, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E5(L0 this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.g5(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E6() {
        if (getContext() != null) {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            AbstractC3255y.h(build, "builder.build()");
            C3660F.a aVar = C3660F.f36486c;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            build.intent.setData(Uri.parse(new C3671k().c(aVar.c(requireContext))));
            ActivityResultLauncher activityResultLauncher = this.f12866J;
            Intent intent = build.intent;
            UptodownApp.a aVar2 = UptodownApp.f29058B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            activityResultLauncher.launch(intent, aVar2.b(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2() {
        if (B4()) {
            C1645l p8 = UptodownApp.f29058B.p();
            AbstractC3255y.f(p8);
            if (p8.b() == -1 && getContext() != null) {
                SettingsPreferences.a aVar = SettingsPreferences.f30353b;
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                if (aVar.S(requireContext)) {
                    Context requireContext2 = requireContext();
                    AbstractC3255y.h(requireContext2, "requireContext()");
                    if (!aVar.e0(requireContext2)) {
                        Context requireContext3 = requireContext();
                        AbstractC3255y.h(requireContext3, "requireContext()");
                        aVar.W0(requireContext3, false);
                    }
                    Context requireContext4 = requireContext();
                    AbstractC3255y.h(requireContext4, "requireContext()");
                    z3(requireContext4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3() {
        if (getContext() != null) {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.y() > 0) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, aVar.y());
                ImageView imageView = this.f12868b;
                if (imageView != null) {
                    imageView.setLayoutParams(layoutParams);
                }
                J3().f12097e.setScrimVisibleHeightTrigger((int) (aVar.y() * 0.4d));
            }
        }
    }

    private final void F4() {
        boolean z8;
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        a5.Q e8 = bVar.e(requireContext);
        if (e8 != null && e8.y()) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1641h c1641h = this.f12869c;
        if (c1641h != null && c1641h.h() == 1 && !z8) {
            try {
                J3().f12125x.init(new BannerSize(5, getResources().getDisplayMetrics().widthPixels, (int) getResources().getDimension(com.uptodown.R.dimen.mintegral_banner_height)), "1517644", "3351941");
                J3().f12125x.setAllowShowCloseBtn(true);
                J3().f12125x.setRefreshTime(15);
                J3().f12125x.setBannerAdListener(new Q());
                J3().f12125x.load();
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                Bundle bundle = new Bundle();
                bundle.putString("type", "exception");
                new C3678r(getContext()).b("mintegral_banner", bundle);
                J3().f12125x.setVisibility(8);
                J3().f12125x.release();
                return;
            }
        }
        J3().f12125x.setVisibility(8);
        J3().f12125x.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F5(L0 this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.g5(x8);
    }

    private final void F6(String str) {
        if (getContext() != null && !UptodownApp.f29058B.W("GenerateQueueWorker", getContext())) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", false).putString("packagename", str).build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(requireContext()).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    private final void G2(C1486j c1486j) {
        c1486j.f12361f.setTypeface(H4.j.f3824g.t());
        c1486j.f12360e.setOnClickListener(new View.OnClickListener() { // from class: X4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.H2(L0.this, view);
            }
        });
        c1486j.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.I2(L0.this, view);
            }
        });
        c1486j.f12360e.setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G3(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X4.L0.C1521t
            if (r0 == 0) goto L13
            r0 = r7
            X4.L0$t r0 = (X4.L0.C1521t) r0
            int r1 = r0.f13080d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13080d = r1
            goto L18
        L13:
            X4.L0$t r0 = new X4.L0$t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13078b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f13080d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f13077a
            X4.L0 r2 = (X4.L0) r2
            O5.t.b(r7)
            goto L5d
        L3d:
            O5.t.b(r7)
            boolean r7 = r6.isAdded()
            if (r7 == 0) goto L74
            r6.f12870d = r5
            l6.I r7 = l6.C3347b0.b()
            X4.L0$u r2 = new X4.L0$u
            r2.<init>(r5)
            r0.f13077a = r6
            r0.f13080d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            l6.J0 r7 = l6.C3347b0.c()
            X4.L0$v r4 = new X4.L0$v
            r4.<init>(r5)
            r0.f13077a = r5
            r0.f13080d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            O5.I r7 = O5.I.f8278a
            return r7
        L74:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.G3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G4() {
        C1641h c1641h = this.f12869c;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.e0() != null) {
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                com.squareup.picasso.w l8 = h8.l(c1641h2.e0());
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                com.squareup.picasso.w n8 = l8.n(new C3855d(requireContext));
                ImageView imageView = this.f12868b;
                AbstractC3255y.g(imageView, "null cannot be cast to non-null type android.widget.ImageView");
                n8.j(imageView, new R());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G5(C1477e0 reviewBinding, L0 this$0, View view) {
        AbstractC3255y.i(reviewBinding, "$reviewBinding");
        AbstractC3255y.i(this$0, "this$0");
        if (reviewBinding.f12203n.getMaxLines() == Integer.MAX_VALUE) {
            reviewBinding.f12203n.setMaxLines(4);
            reviewBinding.f12208s.setText(this$0.getString(com.uptodown.R.string.read_more_desc_app_detail));
        } else {
            reviewBinding.f12203n.setMaxLines(Integer.MAX_VALUE);
            reviewBinding.f12208s.setText(this$0.getString(com.uptodown.R.string.read_less_desc_app_detail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G6(Context context) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new p0(context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H2(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.N4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H3(S5.d dVar) {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f12869c != null) {
            C1638e c1638e = new C1638e();
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C3660F c3660f = new C3660F(requireActivity);
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            a5.I b8 = c3660f.b(c1641h.i());
            if (!b8.b() && b8.d() != null) {
                String d8 = b8.d();
                AbstractC3255y.f(d8);
                if (d8.length() > 0) {
                    String d9 = b8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jsonData = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3255y.h(jsonData, "jsonData");
                        c1638e.d(jsonData);
                    }
                }
            }
            Object g8 = AbstractC3360i.g(C3347b0.c(), new C1524w(c1638e, null), dVar);
            if (g8 == T5.b.e()) {
                return g8;
            }
            return O5.I.f8278a;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H4() {
        Long l8;
        C1641h c1641h = this.f12869c;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (!c1641h.u0()) {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                c1641h2.w1(true);
                Bundle bundle = new Bundle();
                C1641h c1641h3 = this.f12869c;
                if (c1641h3 != null) {
                    l8 = Long.valueOf(c1641h3.i());
                } else {
                    l8 = null;
                }
                if (l8 != null) {
                    C1641h c1641h4 = this.f12869c;
                    AbstractC3255y.f(c1641h4);
                    bundle.putString("appId", String.valueOf(c1641h4.i()));
                }
                bundle.putString("type", "noCompatibleFile");
                C3678r c3678r = this.f12892z;
                if (c3678r != null) {
                    c3678r.b("app_details", bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H5(L0 this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.a0()) {
            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) RepliesActivity.class);
            intent.putExtra("review", review);
            C1641h c1641h = this$0.f12869c;
            AbstractC3255y.f(c1641h);
            intent.putExtra("appName", c1641h.s0());
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
        }
    }

    private final void H6() {
        J3().f12069G.f12168e.setVisibility(0);
        J3().f12069G.f12166c.setVisibility(8);
        J3().f12066D.f12361f.setVisibility(0);
        J3().f12063A.f12684f.setVisibility(0);
        J3().f12063A.f12685g.setVisibility(8);
        J3().f12063A.f12689k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    private final void I4(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        if (B4()) {
            bundle.putInt("deeplink", 1);
        } else {
            bundle.putInt("deeplink", 0);
        }
        C3678r c3678r = this.f12892z;
        if (c3678r != null) {
            c3678r.b("warning", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I5(L0 this$0, C1477e0 reviewBinding, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(reviewBinding, "$reviewBinding");
        AbstractC3255y.i(review, "$review");
        if (UptodownApp.f29058B.a0()) {
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ImageView imageView = reviewBinding.f12193d;
            AbstractC3255y.h(imageView, "reviewBinding.ivLikesCounterReview");
            q5.k.a(requireContext, imageView);
            if (!C3655A.f36474a.i(review.l())) {
                this$0.D4(review);
                reviewBinding.f12205p.setText(String.valueOf(review.p() + 1));
            }
        }
    }

    private final void I6() {
        J3().f12069G.f12168e.setVisibility(8);
        J3().f12069G.f12166c.setVisibility(0);
        J3().f12066D.f12361f.setVisibility(0);
        J3().f12066D.f12360e.setVisibility(0);
        J3().f12063A.f12686h.setVisibility(8);
        J3().f12063A.f12684f.setVisibility(8);
        J3().f12063A.f12685g.setVisibility(0);
        J3().f12063A.f12689k.setVisibility(8);
    }

    private final void J2(final C1501z c1501z) {
        ScrollableTextView scrollableTextView = c1501z.f12693o;
        j.a aVar = H4.j.f3824g;
        scrollableTextView.setTypeface(aVar.t());
        c1501z.f12691m.setTypeface(aVar.u());
        c1501z.f12692n.setTypeface(aVar.u());
        c1501z.f12690l.setTypeface(aVar.u());
        c1501z.f12688j.setTypeface(aVar.u());
        c1501z.f12689k.setTypeface(aVar.t());
        c1501z.f12694p.setTypeface(aVar.t());
        c1501z.f12684f.setOnClickListener(new View.OnClickListener() { // from class: X4.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.K2(L0.this, view);
            }
        });
        c1501z.f12684f.setFocusable(true);
        c1501z.f12680b.setOnClickListener(new View.OnClickListener() { // from class: X4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.L2(C1501z.this, this, view);
            }
        });
        c1501z.f12681c.setOnClickListener(new View.OnClickListener() { // from class: X4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.M2(C1501z.this, this, view);
            }
        });
        c1501z.f12689k.setOnClickListener(new View.OnClickListener() { // from class: X4.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.N2(L0.this, view);
            }
        });
        c1501z.f12689k.setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1472c J3() {
        C1472c c1472c = this.f12867a;
        AbstractC3255y.f(c1472c);
        return c1472c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J4(L0 this$0, ActivityResult activityResult) {
        String str;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q.b bVar = a5.Q.f14058k;
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            a5.Q e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = this$0.requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                if (e8.x(requireContext2)) {
                    this$0.b3();
                    UptodownApp.a aVar = UptodownApp.f29058B;
                    Context requireContext3 = this$0.requireContext();
                    AbstractC3255y.h(requireContext3, "requireContext()");
                    aVar.j0(requireContext3);
                    Context requireContext4 = this$0.requireContext();
                    AbstractC3255y.h(requireContext4, "requireContext()");
                    aVar.i0(requireContext4);
                    this$0.S5();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J5(ArrayList arrayList) {
        if (getContext() != null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                if (j6.n.s(getString(com.uptodown.R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(dimension, dimension, dimension, dimension);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a5.K review = (a5.K) it.next();
                        if (review.H()) {
                            LinearLayout linearLayout = J3().f12120s;
                            AbstractC3255y.h(review, "review");
                            Context requireContext = requireContext();
                            AbstractC3255y.h(requireContext, "requireContext()");
                            linearLayout.addView(D5(layoutParams, review, requireContext));
                        } else {
                            LinearLayout linearLayout2 = J3().f12120s;
                            AbstractC3255y.h(review, "review");
                            Context requireContext2 = requireContext();
                            AbstractC3255y.h(requireContext2, "requireContext()");
                            linearLayout2.addView(w5(layoutParams, review, requireContext2));
                        }
                    }
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(dimension, dimension, dimension, dimension);
                for (int i8 = 0; i8 < arrayList.size(); i8 += 2) {
                    LinearLayout linearLayout3 = new LinearLayout(getContext());
                    linearLayout3.setOrientation(0);
                    linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.setMargins(0, dimension, dimension, dimension);
                    layoutParams3.weight = 1.0f;
                    if (((a5.K) arrayList.get(i8)).H()) {
                        Object obj = arrayList.get(i8);
                        AbstractC3255y.h(obj, "reviews[i]");
                        Context requireContext3 = requireContext();
                        AbstractC3255y.h(requireContext3, "requireContext()");
                        linearLayout3.addView(D5(layoutParams2, (a5.K) obj, requireContext3));
                    } else {
                        Object obj2 = arrayList.get(i8);
                        AbstractC3255y.h(obj2, "reviews[i]");
                        Context requireContext4 = requireContext();
                        AbstractC3255y.h(requireContext4, "requireContext()");
                        linearLayout3.addView(w5(layoutParams3, (a5.K) obj2, requireContext4));
                    }
                    int i9 = i8 + 1;
                    if (i9 < arrayList.size()) {
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.setMargins(dimension, dimension, 0, dimension);
                        layoutParams4.weight = 1.0f;
                        if (((a5.K) arrayList.get(i9)).H()) {
                            Object obj3 = arrayList.get(i9);
                            AbstractC3255y.h(obj3, "reviews[i + 1]");
                            Context requireContext5 = requireContext();
                            AbstractC3255y.h(requireContext5, "requireContext()");
                            linearLayout3.addView(D5(layoutParams2, (a5.K) obj3, requireContext5));
                        } else {
                            Object obj4 = arrayList.get(i9);
                            AbstractC3255y.h(obj4, "reviews[i + 1]");
                            Context requireContext6 = requireContext();
                            AbstractC3255y.h(requireContext6, "requireContext()");
                            linearLayout3.addView(w5(layoutParams4, (a5.K) obj4, requireContext6));
                        }
                    } else {
                        linearLayout3.addView(C5(layoutParams3));
                    }
                    J3().f12120s.addView(linearLayout3);
                }
                return;
            }
            J3().f12120s.setVisibility(8);
            J3().f12065C.setVisibility(8);
        }
    }

    private final void J6() {
        J3().f12069G.f12168e.setVisibility(0);
        J3().f12069G.f12166c.setVisibility(8);
        J3().f12066D.f12361f.setVisibility(8);
        J3().f12066D.f12360e.setVisibility(0);
        J3().f12063A.f12684f.setVisibility(8);
        J3().f12063A.f12685g.setVisibility(8);
        J3().f12063A.f12689k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K3(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X4.L0.C1525x
            if (r0 == 0) goto L13
            r0 = r7
            X4.L0$x r0 = (X4.L0.C1525x) r0
            int r1 = r0.f13101d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13101d = r1
            goto L18
        L13:
            X4.L0$x r0 = new X4.L0$x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13099b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f13101d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f13098a
            X4.L0 r2 = (X4.L0) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            X4.L0$y r2 = new X4.L0$y
            r2.<init>(r5)
            r0.f13098a = r6
            r0.f13101d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            X4.L0$z r4 = new X4.L0$z
            r4.<init>(r5)
            r0.f13098a = r5
            r0.f13101d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.K3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K4() {
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        bVar.a(requireContext);
        U4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K5() {
        C1641h c1641h = this.f12869c;
        AbstractC3255y.f(c1641h);
        ArrayList R02 = c1641h.R0();
        if (R02 != null && !R02.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            C1641h c1641h2 = this.f12869c;
            AbstractC3255y.f(c1641h2);
            ArrayList i12 = c1641h2.i1();
            if (i12 != null && !i12.isEmpty()) {
                C1641h c1641h3 = this.f12869c;
                AbstractC3255y.f(c1641h3);
                ArrayList<a5.T> i13 = c1641h3.i1();
                AbstractC3255y.f(i13);
                for (a5.T t8 : i13) {
                    String a8 = t8.a();
                    if (a8 != null && a8.length() != 0) {
                        arrayList.add(t8);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            C1641h c1641h4 = this.f12869c;
            AbstractC3255y.f(c1641h4);
            ArrayList R03 = c1641h4.R0();
            AbstractC3255y.f(R03);
            int size = R03.size();
            for (int i8 = 0; i8 < size; i8++) {
                C1641h c1641h5 = this.f12869c;
                AbstractC3255y.f(c1641h5);
                ArrayList R04 = c1641h5.R0();
                AbstractC3255y.f(R04);
                Object obj = R04.get(i8);
                AbstractC3255y.h(obj, "appInfo!!.screenShots!![i]");
                a5.L l8 = (a5.L) obj;
                if (l8.a() == 0) {
                    arrayList2.add(l8);
                }
            }
            kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            Z z8 = new Z(arrayList2, t9, arrayList);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            t9.f34162a = new G4.D(arrayList3, z8);
            J3().f12075M.setAdapter((RecyclerView.Adapter) t9.f34162a);
            J3().f12075M.setVisibility(0);
            return;
        }
        J3().f12075M.setVisibility(8);
    }

    private final void K6() {
        J3().f12069G.f12168e.setVisibility(0);
        J3().f12069G.f12166c.setVisibility(8);
        J3().f12066D.f12361f.setVisibility(0);
        J3().f12066D.f12360e.setVisibility(8);
        J3().f12063A.f12687i.setVisibility(0);
        J3().f12063A.f12684f.setVisibility(8);
        J3().f12063A.f12685g.setVisibility(8);
        J3().f12063A.f12689k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(C1501z actionButton, L0 this$0, View view) {
        AbstractC3255y.i(actionButton, "$actionButton");
        AbstractC3255y.i(this$0, "this$0");
        if (actionButton.f12680b.getVisibility() == 0) {
            this$0.d3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L3(S5.d dVar) {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f12869c != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C3660F c3660f = new C3660F(requireActivity);
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            a5.I w8 = c3660f.w(c1641h.i());
            if (!w8.b() && w8.d() != null) {
                String d8 = w8.d();
                AbstractC3255y.f(d8);
                JSONArray jSONArray = new JSONObject(d8).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                if (jSONArray.length() <= 2) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        a5.N n8 = new a5.N(null, null, 0, 7, null);
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        JSONObject jsonObjectFloatingCategoryInfo = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        C1644k c1644k = new C1644k(0, null, null, 7, null);
                        AbstractC3255y.h(jsonObjectFloatingCategoryInfo, "jsonObjectFloatingCategoryInfo");
                        c1644k.x(jsonObjectFloatingCategoryInfo);
                        c1644k.H(true);
                        n8.e(c1644k);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("apps");
                        int length2 = jSONArray2.length();
                        for (int i9 = 0; i9 < length2; i9++) {
                            C1641h c1641h2 = new C1641h();
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i9);
                            AbstractC3255y.h(jSONObject2, "jsonObjectFloatingCategoryApps.getJSONObject(j)");
                            c1641h2.a(jSONObject2);
                            n8.a().add(c1641h2);
                        }
                        arrayList.add(n8);
                    }
                    Object g8 = AbstractC3360i.g(C3347b0.c(), new A(arrayList, null), dVar);
                    if (g8 == T5.b.e()) {
                        return g8;
                    }
                    return O5.I.f8278a;
                }
                ArrayList arrayList2 = new ArrayList();
                int length3 = jSONArray.length();
                for (int i10 = 0; i10 < length3; i10++) {
                    JSONObject jsonObjectFloatingCategory = jSONArray.getJSONObject(i10);
                    C1644k c1644k2 = new C1644k(0, null, null, 7, null);
                    c1644k2.H(true);
                    AbstractC3255y.h(jsonObjectFloatingCategory, "jsonObjectFloatingCategory");
                    c1644k2.x(jsonObjectFloatingCategory);
                    arrayList2.add(c1644k2);
                }
                Object g9 = AbstractC3360i.g(C3347b0.c(), new B(arrayList2, null), dVar);
                if (g9 == T5.b.e()) {
                    return g9;
                }
                return O5.I.f8278a;
            }
        }
        return O5.I.f8278a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[Catch: Exception -> 0x0016, LOOP:0: B:33:0x00c5->B:35:0x00cb, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L4() {
        /*
            r4 = this;
            boolean r0 = r4.f12877k     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L19
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> L16
            r0.<init>()     // Catch: java.lang.Exception -> L16
            W4.c r1 = r4.J3()     // Catch: java.lang.Exception -> L16
            androidx.core.widget.NestedScrollView r1 = r1.f12078P     // Catch: java.lang.Exception -> L16
            r1.getHitRect(r0)     // Catch: java.lang.Exception -> L16
            r4.x6(r0)     // Catch: java.lang.Exception -> L16
            goto L19
        L16:
            r0 = move-exception
            goto Ld5
        L19:
            boolean r0 = r4.f12877k     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "requireContext()"
            r2 = 0
            if (r0 != 0) goto L3d
            a5.h r0 = r4.f12869c     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3255y.f(r0)     // Catch: java.lang.Exception -> L16
            java.lang.String r0 = r0.z()     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L3d
            int r0 = r0.length()     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L32
            goto L3d
        L32:
            android.content.Context r0 = r4.requireContext()     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)     // Catch: java.lang.Exception -> L16
            r4.G6(r0)     // Catch: java.lang.Exception -> L16
            goto L3f
        L3d:
            r4.f12877k = r2     // Catch: java.lang.Exception -> L16
        L3f:
            a5.h r0 = r4.f12869c     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.W0()     // Catch: java.lang.Exception -> L16
            goto L49
        L48:
            r0 = 0
        L49:
            if (r0 == 0) goto L5f
            boolean r0 = r4.W3()     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L5f
            W4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            W4.E0 r0 = r0.f12124w     // Catch: java.lang.Exception -> L16
            android.widget.LinearLayout r0 = r0.getRoot()     // Catch: java.lang.Exception -> L16
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L16
            goto L6e
        L5f:
            W4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            W4.E0 r0 = r0.f12124w     // Catch: java.lang.Exception -> L16
            android.widget.LinearLayout r0 = r0.getRoot()     // Catch: java.lang.Exception -> L16
            r3 = 8
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> L16
        L6e:
            r4.C3()     // Catch: java.lang.Exception -> L16
            W4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            androidx.core.widget.NestedScrollView r0 = r0.f12078P     // Catch: java.lang.Exception -> L16
            int r0 = r0.getScrollY()     // Catch: java.lang.Exception -> L16
            if (r0 <= 0) goto Lb1
            android.content.Context r0 = r4.requireContext()     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)     // Catch: java.lang.Exception -> L16
            r4.M6(r0)     // Catch: java.lang.Exception -> L16
            boolean r0 = r4.f12889w     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto Lb1
            W4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = r0.f12097e     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = ""
            r0.setTitle(r1)     // Catch: java.lang.Exception -> L16
            W4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            android.widget.TextView r0 = r0.f12106i0     // Catch: java.lang.Exception -> L16
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L16
            W4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            android.widget.TextView r0 = r0.f12106i0     // Catch: java.lang.Exception -> L16
            a5.h r1 = r4.f12869c     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3255y.f(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r1.s0()     // Catch: java.lang.Exception -> L16
            r0.setText(r1)     // Catch: java.lang.Exception -> L16
        Lb1:
            G4.K r0 = r4.f12862F     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto Lb8
            r0.notifyDataSetChanged()     // Catch: java.lang.Exception -> L16
        Lb8:
            G4.K r0 = r4.f12863G     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto Lbf
            r0.notifyDataSetChanged()     // Catch: java.lang.Exception -> L16
        Lbf:
            java.util.ArrayList r0 = r4.f12864H     // Catch: java.lang.Exception -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L16
        Lc5:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto Ld8
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L16
            G4.K r1 = (G4.K) r1     // Catch: java.lang.Exception -> L16
            r1.notifyDataSetChanged()     // Catch: java.lang.Exception -> L16
            goto Lc5
        Ld5:
            r0.printStackTrace()
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.L4():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L5(ArrayList arrayList, boolean z8) {
        int i8;
        if (getContext() != null && this.f12869c != null && arrayList != null && !arrayList.isEmpty()) {
            a0 a0Var = new a0();
            b0 b0Var = new b0();
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            if (z8) {
                i8 = 25;
            } else {
                i8 = 20;
            }
            G4.K k8 = new G4.K(a0Var, b0Var, requireContext, i8);
            this.f12862F = k8;
            AbstractC3255y.f(k8);
            k8.d(arrayList);
            J3().f12076N.setAdapter(this.f12862F);
            J3().f12076N.setNestedScrollingEnabled(false);
            J3().f12076N.setItemAnimator(null);
            J3().f12076N.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            J3().f12071I.setVisibility(0);
            return;
        }
        J3().f12071I.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L6(String str, S5.d dVar) {
        kotlin.jvm.internal.Q q8 = new kotlin.jvm.internal.Q();
        Object g8 = AbstractC3360i.g(C3347b0.b(), new q0(str, new kotlin.jvm.internal.Q(), q8, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(C1501z actionButton, L0 this$0, View view) {
        Object obj;
        AbstractC3255y.i(actionButton, "$actionButton");
        AbstractC3255y.i(this$0, "this$0");
        if (actionButton.f12681c.getVisibility() == 0) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
            C1641h c1641h = this$0.f12869c;
            AbstractC3255y.f(c1641h);
            long i8 = c1641h.i();
            C1641h c1641h2 = this$0.f12869c;
            AbstractC3255y.f(c1641h2);
            if (aVar.d(i8, c1641h2.o0())) {
                DownloadWorker.a aVar2 = DownloadWorker.f31052c;
                if (aVar2.c()) {
                    aVar2.h();
                    return;
                }
            }
            Iterator it = UptodownApp.f29058B.F().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String s8 = ((a5.O) obj).s();
                    C1641h c1641h3 = this$0.f12869c;
                    AbstractC3255y.f(c1641h3);
                    if (AbstractC3255y.d(s8, c1641h3.y0())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                DownloadWorker.a aVar3 = DownloadWorker.f31052c;
                if (aVar3.d()) {
                    aVar3.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M3(S5.d dVar) {
        int i8;
        Integer num;
        if (getActivity() != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C3660F c3660f = new C3660F(requireActivity);
            C1641h c1641h = this.f12869c;
            if (c1641h != null) {
                AbstractC3255y.f(c1641h);
                a5.I G8 = c3660f.G(c1641h.i());
                if (!G8.b() && G8.d() != null) {
                    String d8 = G8.d();
                    AbstractC3255y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (i8 == 1) {
                        a5.K k8 = new a5.K();
                        this.f12891y = k8;
                        K.b bVar = a5.K.f14002o;
                        AbstractC3255y.f(k8);
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3255y.h(jSONObject2, "jsonObjectMyReview.getJS…ct(Constantes.FIELD_DATA)");
                        bVar.d(k8, jSONObject2);
                        a5.K k9 = this.f12891y;
                        if (k9 != null) {
                            num = kotlin.coroutines.jvm.internal.b.c(k9.s());
                        } else {
                            num = null;
                        }
                        AbstractC3255y.f(num);
                        this.f12883q = num.intValue();
                    }
                } else if (G8.b() && G8.e() == 404) {
                    C1641h c1641h2 = this.f12869c;
                    AbstractC3255y.f(c1641h2);
                    c1641h2.C1(new ArrayList());
                }
            }
        }
        Object g8 = AbstractC3360i.g(C3347b0.c(), new C(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M4(C1638e c1638e) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).M7(c1638e);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).x3(c1638e);
        }
    }

    private final void M5() {
        boolean z8;
        boolean z9;
        boolean z10;
        C1648o c1648o = new C1648o();
        C1641h c1641h = this.f12869c;
        AbstractC3255y.f(c1641h);
        c1648o.k0(c1641h);
        C1647n c1647n = new C1647n();
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        c1647n.i(requireContext);
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context requireContext2 = requireContext();
        AbstractC3255y.h(requireContext2, "requireContext()");
        if (aVar.o1(requireContext2)) {
            z8 = c1647n.g(c1648o);
            z10 = c1647n.e(c1648o);
            z9 = c1647n.f(c1648o);
        } else {
            z8 = true;
            z9 = true;
            z10 = true;
        }
        if (z8 && z10 && z9) {
            c3(c1648o);
            return;
        }
        if (!z8) {
            I4("sdk");
            String string = getString(com.uptodown.R.string.msg_warning_incompatible_sdk);
            AbstractC3255y.h(string, "getString(R.string.msg_warning_incompatible_sdk)");
            g3(c1648o, string);
            return;
        }
        if (!z10) {
            I4("abi");
            String string2 = getString(com.uptodown.R.string.msg_warning_incompatible_abi);
            AbstractC3255y.h(string2, "getString(R.string.msg_warning_incompatible_abi)");
            g3(c1648o, string2);
            return;
        }
        I4("density");
        String string3 = getString(com.uptodown.R.string.msg_warning_incompatible_density);
        AbstractC3255y.h(string3, "getString(R.string.msg_w…ing_incompatible_density)");
        g3(c1648o, string3);
    }

    private final void M6(Context context) {
        J3().f12114m0.setVisibility(8);
        J3().f12079Q.setBackgroundColor(ContextCompat.getColor(context, com.uptodown.R.color.transparent));
        if (new C3671k().o(context)) {
            X5(ContextCompat.getColor(context, com.uptodown.R.color.main_blue));
            Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_arrow_left);
            if (drawable != null) {
                J3().f12079Q.setNavigationIcon(drawable);
            }
            Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_menu_dots_blue);
            if (drawable2 != null) {
                J3().f12079Q.setOverflowIcon(drawable2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.N4();
    }

    private final void N3() {
        C1641h c1641h = this.f12869c;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.i() > 0) {
                u5();
                F2();
                E2();
                return;
            }
        }
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        new V4.i(requireContext, this.f12887u, new D(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void N4() {
        C1641h c1641h;
        if (getActivity() != null && !requireActivity().isFinishing() && (c1641h = this.f12869c) != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.y0() != null) {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                if (!j6.n.s(c1641h2.y0(), requireActivity().getPackageName(), true)) {
                    PackageManager packageManager = requireActivity().getPackageManager();
                    C1641h c1641h3 = this.f12869c;
                    AbstractC3255y.f(c1641h3);
                    String y02 = c1641h3.y0();
                    AbstractC3255y.f(y02);
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(y02);
                    if (launchIntentForPackage != null) {
                        startActivity(launchIntentForPackage);
                    }
                }
            }
        }
    }

    private final SpannableStringBuilder N5(String str) {
        String A8 = j6.n.A(j6.n.A(str, "<br />", "\n", false, 4, null), "<br/>", "\n", false, 4, null);
        List<C1646m> b8 = C1646m.f14265f.b(A8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A8);
        int i8 = 0;
        for (C1646m c1646m : b8) {
            int b9 = c1646m.b() - i8;
            int length = c1646m.d().length() + b9;
            String e8 = c1646m.e();
            AbstractC3255y.f(e8);
            spannableStringBuilder = spannableStringBuilder.replace(b9, e8.length() + b9, (CharSequence) c1646m.d());
            AbstractC3255y.h(spannableStringBuilder, "spannableString.replace(…!.length, customTag.text)");
            String c8 = c1646m.c();
            int hashCode = c8.hashCode();
            if (hashCode != 98) {
                if (hashCode != 105) {
                    if (hashCode != 117) {
                        if (hashCode != 93028092) {
                            if (hashCode != 1524339519) {
                                if (hashCode != 3274) {
                                    if (hashCode == 3275 && c8.equals("h3")) {
                                        float dimension = getResources().getDimension(com.uptodown.R.dimen.text_size_m);
                                        Typeface t8 = H4.j.f3824g.t();
                                        AbstractC3255y.f(t8);
                                        spannableStringBuilder.setSpan(new defpackage.b(dimension, t8, ContextCompat.getColor(requireContext(), com.uptodown.R.color.text_primary)), b9, length, 33);
                                    }
                                } else if (c8.equals("h2")) {
                                    float dimension2 = getResources().getDimension(com.uptodown.R.dimen.text_size_l);
                                    Typeface t9 = H4.j.f3824g.t();
                                    AbstractC3255y.f(t9);
                                    spannableStringBuilder.setSpan(new defpackage.b(dimension2, t9, ContextCompat.getColor(requireContext(), com.uptodown.R.color.text_primary)), b9, length, 33);
                                }
                            } else if (c8.equals("floatingCategoryID")) {
                                spannableStringBuilder.setSpan(new d0(c1646m, this), b9, length, 33);
                            }
                        } else if (c8.equals("appID")) {
                            spannableStringBuilder.setSpan(new c0(c1646m, this), b9, length, 33);
                        }
                    } else if (c8.equals("u")) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), b9, length, 33);
                    }
                } else if (c8.equals(com.mbridge.msdk.foundation.same.report.i.f20956a)) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), b9, length, 33);
                }
            } else if (c8.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                spannableStringBuilder.setSpan(new StyleSpan(1), b9, length, 33);
            }
            String e9 = c1646m.e();
            AbstractC3255y.f(e9);
            i8 = (i8 + e9.length()) - c1646m.d().length();
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N6(Context context) {
        J3().f12114m0.setVisibility(0);
        J3().f12079Q.setBackgroundColor(ContextCompat.getColor(context, com.uptodown.R.color.transparent));
        X5(ContextCompat.getColor(context, com.uptodown.R.color.white));
        Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_arrow_left_white);
        if (drawable != null) {
            J3().f12079Q.setNavigationIcon(drawable);
        }
        Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_menu_dots);
        if (drawable2 != null) {
            J3().f12079Q.setOverflowIcon(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(Context context) {
        a5.O o8 = this.f12874h;
        if (o8 != null) {
            UptodownApp.a aVar = UptodownApp.f29058B;
            AbstractC3255y.f(o8);
            aVar.c0(o8.s(), context);
            a5.O o9 = this.f12874h;
            AbstractC3255y.f(o9);
            if (o9.l() != null) {
                C3661a c3661a = new C3661a();
                a5.O o10 = this.f12874h;
                AbstractC3255y.f(o10);
                if (c3661a.b(context, o10.l())) {
                    C3674n a8 = C3674n.f36505t.a(context);
                    a8.a();
                    a5.O o11 = this.f12874h;
                    AbstractC3255y.f(o11);
                    o11.X(0);
                    a5.O o12 = this.f12874h;
                    AbstractC3255y.f(o12);
                    a8.r1(o12);
                    a8.l();
                }
            }
            u6(context);
            return;
        }
        C1641h c1641h = this.f12869c;
        C1648o c1648o = null;
        String str = null;
        if (c1641h != null) {
            DownloadApkWorker.a aVar2 = DownloadApkWorker.f31034k;
            AbstractC3255y.f(c1641h);
            aVar2.a(c1641h.i());
            C3683w.f36547a.g(context);
            C3674n a9 = C3674n.f36505t.a(context);
            a9.a();
            C1641h c1641h2 = this.f12869c;
            AbstractC3255y.f(c1641h2);
            C1648o Z7 = a9.Z(String.valueOf(c1641h2.f0()));
            a9.A(Z7);
            if (Z7 != null) {
                str = Z7.X();
            }
            if (str != null) {
                File f8 = new C3677q().f(context);
                String X7 = Z7.X();
                AbstractC3255y.f(X7);
                File file = new File(f8, X7);
                if (file.exists()) {
                    file.delete();
                }
            }
            a9.l();
            c1648o = Z7;
        }
        a6(context);
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            if (c1648o != null) {
                FragmentActivity activity = getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).J2(c1648o);
            } else {
                FragmentActivity activity2 = getActivity();
                AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity2).B2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O3(S5.d dVar) {
        C1641h c1641h;
        ArrayList arrayList = new ArrayList();
        if (getActivity() != null && (c1641h = this.f12869c) != null) {
            AbstractC3255y.f(c1641h);
            ArrayList E02 = c1641h.E0();
            if (E02 == null || E02.isEmpty()) {
                FragmentActivity requireActivity = requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                C3660F c3660f = new C3660F(requireActivity);
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                a5.I R8 = c3660f.R(c1641h2.i());
                if (!R8.b() && R8.d() != null) {
                    String d8 = R8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = R8.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        for (int i8 = 1; !jSONObject.isNull(String.valueOf(i8)); i8++) {
                            JSONObject jsonObjectAppSimilar = jSONObject.getJSONObject(String.valueOf(i8));
                            C1641h c1641h3 = new C1641h();
                            AbstractC3255y.h(jsonObjectAppSimilar, "jsonObjectAppSimilar");
                            c1641h3.a(jsonObjectAppSimilar);
                            arrayList.add(c1641h3);
                        }
                        if (true ^ arrayList.isEmpty()) {
                            C1641h c1641h4 = this.f12869c;
                            AbstractC3255y.f(c1641h4);
                            c1641h4.z1(arrayList);
                        }
                    }
                }
            }
        }
        Object g8 = AbstractC3360i.g(C3347b0.c(), new E(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    private final void O4() {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f12869c != null) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            intent.setData(Uri.fromParts("package", c1641h.y0(), null));
            intent.addFlags(268435456);
            intent.addFlags(8388608);
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2(final View view, final C3660F c3660f) {
        view.setOnClickListener(new View.OnClickListener() { // from class: X4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                L0.Q2(L0.this, view, c3660f, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P3(S5.d dVar) {
        C1641h c1641h;
        int i8;
        if (getActivity() != null && !requireActivity().isFinishing() && (c1641h = this.f12869c) != null) {
            AbstractC3255y.f(c1641h);
            ArrayList N02 = c1641h.N0();
            if (N02 == null || N02.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (j6.n.s(getString(com.uptodown.R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                    i8 = 2;
                } else {
                    i8 = 4;
                }
                FragmentActivity requireActivity = requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                C3660F c3660f = new C3660F(requireActivity);
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                a5.I K02 = c3660f.K0(c1641h2.i(), i8, 0);
                if (!K02.b() && K02.d() != null) {
                    String d8 = K02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        F.b bVar = a5.F.f13964e;
                        String d9 = K02.d();
                        AbstractC3255y.f(d9);
                        arrayList.addAll(bVar.a(d9));
                    }
                }
                C1641h c1641h3 = this.f12869c;
                AbstractC3255y.f(c1641h3);
                c1641h3.A1(arrayList);
            }
        }
        Object g8 = AbstractC3360i.g(C3347b0.c(), new F(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    private final void P4() {
        if (getContext() != null) {
            C3674n.a aVar = C3674n.f36505t;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C3674n a8 = aVar.a(requireActivity);
            a8.a();
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            String y02 = c1641h.y0();
            AbstractC3255y.f(y02);
            C1639f S8 = a8.S(y02);
            a8.l();
            Intent intent = new Intent(requireActivity(), (Class<?>) AppInstalledDetailsActivity.class);
            intent.putExtra("appInstalled", S8);
            intent.putExtra("appInfo", this.f12869c);
            UptodownApp.a aVar2 = UptodownApp.f29058B;
            FragmentActivity requireActivity2 = requireActivity();
            AbstractC3255y.h(requireActivity2, "requireActivity()");
            startActivity(intent, aVar2.a(requireActivity2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P5(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e0(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P6(a5.K k8, int i8) {
        int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
        LinearLayout linearLayout = J3().f12120s;
        AbstractC3255y.h(linearLayout, "binding.llReviewListContainer");
        if (linearLayout.getChildCount() > i8) {
            J3().f12120s.removeViewAt(i8);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(dimension, dimension, dimension, dimension);
        if (k8.H()) {
            LinearLayout linearLayout2 = J3().f12120s;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            linearLayout2.addView(D5(layoutParams, k8, requireContext), i8);
            return;
        }
        LinearLayout linearLayout3 = J3().f12120s;
        Context requireContext2 = requireContext();
        AbstractC3255y.h(requireContext2, "requireContext()");
        linearLayout3.addView(w5(layoutParams, k8, requireContext2), i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(final L0 this$0, final View this_cancelPreRegister, final C3660F wsHelper, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(this_cancelPreRegister, "$this_cancelPreRegister");
        AbstractC3255y.i(wsHelper, "$wsHelper");
        if (UptodownApp.f29058B.a0()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
            if (this_cancelPreRegister.getContext() != null) {
                C1497v c8 = C1497v.c(this$0.getLayoutInflater());
                AbstractC3255y.h(c8, "inflate(layoutInflater)");
                TextView textView = c8.f12595f;
                j.a aVar = H4.j.f3824g;
                textView.setTypeface(aVar.t());
                c8.f12595f.setText(this$0.getString(com.uptodown.R.string.cancel_registration));
                c8.f12593d.setTypeface(aVar.u());
                TextView textView2 = c8.f12593d;
                C3671k c3671k = new C3671k();
                C1641h c1641h = this$0.f12869c;
                AbstractC3255y.f(c1641h);
                String string = this$0.getString(com.uptodown.R.string.confirm_cancel_preregister, c1641h.s0());
                AbstractC3255y.h(string, "getString(R.string.confi…register, appInfo!!.name)");
                C1641h c1641h2 = this$0.f12869c;
                AbstractC3255y.f(c1641h2);
                String s02 = c1641h2.s0();
                AbstractC3255y.f(s02);
                Context context = this_cancelPreRegister.getContext();
                AbstractC3255y.h(context, "context");
                textView2.setText(c3671k.d(string, s02, context));
                c8.f12592c.setTypeface(aVar.t());
                c8.f12594e.setTypeface(aVar.t());
                c8.f12594e.setText(this$0.getString(com.uptodown.R.string.dialog_confirmation_verify_afirmative));
                c8.f12592c.setVisibility(0);
                c8.f12592c.setOnClickListener(new View.OnClickListener() { // from class: X4.m0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.R2(L0.this, view2);
                    }
                });
                c8.f12594e.setOnClickListener(new View.OnClickListener() { // from class: X4.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.S2(L0.this, wsHelper, this_cancelPreRegister, view2);
                    }
                });
                c8.f12591b.setOnClickListener(new View.OnClickListener() { // from class: X4.o0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.T2(L0.this, view2);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(this$0.requireContext());
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                this$0.y6(builder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q3(S5.d r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.Q3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q4(C1644k c1644k) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).P7(c1644k);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).y3(c1644k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q5(View view, Context context) {
        ViewTreeObserver viewTreeObserver;
        if (SettingsPreferences.f30353b.N(context) && view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new f0(view, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R3(S5.d r9) {
        /*
            r8 = this;
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto Leb
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto Leb
            a5.h r0 = r8.f12869c
            if (r0 == 0) goto Leb
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            java.util.ArrayList r0 = r0.V0()
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Leb
        L23:
            o5.F r0 = new o5.F
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            java.lang.String r2 = "requireActivity()"
            kotlin.jvm.internal.AbstractC3255y.h(r1, r2)
            r0.<init>(r1)
            a5.h r1 = r8.f12869c
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            long r1 = r1.i()
            r3 = 20
            r4 = 0
            a5.I r0 = r0.T0(r1, r3, r4)
            boolean r1 = r0.b()
            r2 = 0
            if (r1 != 0) goto Lb9
            java.lang.String r1 = r0.d()
            if (r1 == 0) goto Lb9
            java.lang.String r1 = r0.d()
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            int r1 = r1.length()
            if (r1 <= 0) goto Lb9
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = r0.d()
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            r1.<init>(r0)
            java.lang.String r0 = "success"
            boolean r3 = r1.isNull(r0)
            r5 = 1
            if (r3 != 0) goto L75
            int r0 = r1.optInt(r0, r4)
            goto L76
        L75:
            r0 = 1
        L76:
            java.lang.String r3 = "data"
            boolean r6 = r1.isNull(r3)
            if (r6 != 0) goto L83
            org.json.JSONArray r1 = r1.optJSONArray(r3)
            goto L84
        L83:
            r1 = r2
        L84:
            if (r0 != r5) goto Ld4
            if (r1 == 0) goto Ld4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r1.length()
        L91:
            if (r4 >= r3) goto Laa
            a5.h r5 = new a5.h
            r5.<init>()
            org.json.JSONObject r6 = r1.getJSONObject(r4)
            java.lang.String r7 = "jsonObjectAppSimilar"
            kotlin.jvm.internal.AbstractC3255y.h(r6, r7)
            r5.a(r6)
            r0.add(r5)
            int r4 = r4 + 1
            goto L91
        Laa:
            int r1 = r0.size()
            if (r1 <= 0) goto Ld4
            a5.h r1 = r8.f12869c
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            r1.E1(r0)
            goto Ld4
        Lb9:
            boolean r1 = r0.b()
            if (r1 == 0) goto Ld4
            int r0 = r0.e()
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto Ld4
            a5.h r0 = r8.f12869c
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.E1(r1)
        Ld4:
            l6.J0 r0 = l6.C3347b0.c()
            X4.L0$K r1 = new X4.L0$K
            r1.<init>(r2)
            java.lang.Object r9 = l6.AbstractC3360i.g(r0, r1, r9)
            java.lang.Object r0 = T5.b.e()
            if (r9 != r0) goto Le8
            return r9
        Le8:
            O5.I r9 = O5.I.f8278a
            return r9
        Leb:
            O5.I r9 = O5.I.f8278a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.R3(S5.d):java.lang.Object");
    }

    private final void R4() {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            String string = getString(com.uptodown.R.string.dmca_title);
            AbstractC3255y.h(string, "getString(R.string.dmca_title)");
            String string2 = getString(com.uptodown.R.string.url_dmca);
            AbstractC3255y.h(string2, "getString(R.string.url_dmca)");
            C3671k c3671k = new C3671k();
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            c3671k.q(requireActivity, string2, string);
        }
    }

    private final void R5(String str) {
        int i8 = this.f12883q;
        if (1 <= i8 && i8 < 6) {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g0(str, null), 3, null);
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
                return;
            }
            return;
        }
        Toast.makeText(requireContext(), getString(com.uptodown.R.string.error_review_no_valoration), 0).show();
    }

    private final void R6(int i8, Context context) {
        String str;
        a5.Q e8 = a5.Q.f14058k.e(context);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            String id = e8.getId();
            AbstractC3255y.f(id);
            if (id.length() > 0) {
                this.f12883q = i8;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 != 5) {
                                    J3().f12123v.f11696b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f12123v.f11697c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f12123v.f11698d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f12123v.f11699e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f12123v.f11700f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    return;
                                }
                                J3().f12123v.f11696b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f12123v.f11697c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f12123v.f11698d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f12123v.f11699e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f12123v.f11700f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                return;
                            }
                            J3().f12123v.f11696b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f12123v.f11697c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f12123v.f11698d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f12123v.f11699e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f12123v.f11700f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                            return;
                        }
                        J3().f12123v.f11696b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        J3().f12123v.f11697c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        J3().f12123v.f11698d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        J3().f12123v.f11699e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                        J3().f12123v.f11700f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                        return;
                    }
                    J3().f12123v.f11696b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                    J3().f12123v.f11697c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                    J3().f12123v.f11698d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    J3().f12123v.f11699e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    J3().f12123v.f11700f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    return;
                }
                J3().f12123v.f11696b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                J3().f12123v.f11697c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                J3().f12123v.f11698d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                J3().f12123v.f11699e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                J3().f12123v.f11700f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(L0 this$0, C3660F wsHelper, View this_cancelPreRegister, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(wsHelper, "$wsHelper");
        AbstractC3255y.i(this_cancelPreRegister, "$this_cancelPreRegister");
        AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C1508g(wsHelper, this_cancelPreRegister, null), 3, null);
    }

    private final long S3() {
        String str;
        try {
            C1641h c1641h = this.f12869c;
            if (c1641h != null) {
                str = c1641h.W0();
            } else {
                str = null;
            }
            if (str != null) {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                String W02 = c1641h2.W0();
                AbstractC3255y.f(W02);
                return Long.parseLong(W02);
            }
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S4(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e8) {
            m3(String.valueOf(e8.getMessage()));
        }
    }

    private final void S5() {
        String str = this.f12861E;
        if (str != null) {
            AbstractC3255y.f(str);
            R5(str);
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S6(L0 this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C3347b0.b(), null, new t0(new u0(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T3(S5.d dVar) {
        int i8;
        boolean z8;
        int i9;
        if (getActivity() != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C3660F c3660f = new C3660F(requireActivity);
            C1641h c1641h = this.f12869c;
            if (c1641h != null) {
                AbstractC3255y.f(c1641h);
                ArrayList i12 = c1641h.i1();
                if (i12 == null || i12.isEmpty()) {
                    C1641h c1641h2 = this.f12869c;
                    AbstractC3255y.f(c1641h2);
                    a5.I t02 = c3660f.t0(c1641h2.i());
                    if (!t02.b() && t02.d() != null) {
                        String d8 = t02.d();
                        AbstractC3255y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = t02.d();
                            AbstractC3255y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success")) {
                                i8 = jSONObject.optInt("success", 0);
                            } else {
                                i8 = 0;
                            }
                            if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                ArrayList arrayList = new ArrayList();
                                JSONArray jSONArray = jSONObject2.getJSONArray("videos");
                                int length = jSONArray.length();
                                for (int i10 = 0; i10 < length; i10++) {
                                    JSONObject jsonObjectVideo = jSONArray.getJSONObject(i10);
                                    T.b bVar = a5.T.f14073c;
                                    AbstractC3255y.h(jsonObjectVideo, "jsonObjectVideo");
                                    arrayList.add(bVar.a(jsonObjectVideo));
                                }
                                C1641h c1641h3 = this.f12869c;
                                AbstractC3255y.f(c1641h3);
                                c1641h3.F1(arrayList);
                            }
                        }
                    }
                }
                C1641h c1641h4 = this.f12869c;
                AbstractC3255y.f(c1641h4);
                if (c1641h4.R0() == null) {
                    C1641h c1641h5 = this.f12869c;
                    AbstractC3255y.f(c1641h5);
                    a5.I X7 = c3660f.X(c1641h5.i());
                    if (!X7.b() && X7.d() != null) {
                        String d10 = X7.d();
                        AbstractC3255y.f(d10);
                        if (d10.length() > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            String d11 = X7.d();
                            AbstractC3255y.f(d11);
                            JSONObject jSONObject3 = new JSONObject(d11);
                            if (!jSONObject3.isNull("success")) {
                                i9 = jSONObject3.optInt("success", 0);
                            } else {
                                i9 = 0;
                            }
                            if (i9 == 1 && !jSONObject3.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                ArrayList arrayList2 = new ArrayList();
                                JSONArray jSONArray2 = jSONObject3.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                                int length2 = jSONArray2.length();
                                for (int i11 = 0; i11 < length2; i11++) {
                                    JSONObject jsonObjectScreenshot = jSONArray2.getJSONObject(i11);
                                    L.b bVar2 = a5.L.f14027e;
                                    AbstractC3255y.h(jsonObjectScreenshot, "jsonObjectScreenshot");
                                    a5.L a8 = bVar2.a(jsonObjectScreenshot);
                                    if (a8.a() == 0) {
                                        arrayList2.add(a8);
                                    } else {
                                        C1641h c1641h6 = this.f12869c;
                                        AbstractC3255y.f(c1641h6);
                                        c1641h6.v1(a8.g());
                                    }
                                    final L l8 = L.f12921a;
                                    AbstractC1378t.B(arrayList2, new Comparator() { // from class: X4.J
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            int U32;
                                            U32 = L0.U3(InterfaceC1668n.this, obj, obj2);
                                            return U32;
                                        }
                                    });
                                    C1641h c1641h7 = this.f12869c;
                                    AbstractC3255y.f(c1641h7);
                                    c1641h7.D1(arrayList2);
                                }
                            }
                        }
                    }
                    if (X7.b() && X7.e() == 404) {
                        C1641h c1641h8 = this.f12869c;
                        AbstractC3255y.f(c1641h8);
                        c1641h8.D1(new ArrayList());
                    }
                }
            }
        }
        Object g8 = AbstractC3360i.g(C3347b0.c(), new M(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    private final void T4() {
        if (!requireActivity().isFinishing()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) InformationActivity.class);
            UptodownApp.a aVar = UptodownApp.f29058B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    private final void T6() {
        try {
            C1641h c1641h = this.f12869c;
            if (c1641h != null) {
                AbstractC3255y.f(c1641h);
                if (c1641h.G0() > 0 && this.f12872f > 0) {
                    int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                    int i8 = this.f12872f;
                    C1641h c1641h2 = this.f12869c;
                    AbstractC3255y.f(c1641h2);
                    int L02 = i8 * c1641h2.L0();
                    C1641h c1641h3 = this.f12869c;
                    AbstractC3255y.f(c1641h3);
                    J3().f12121t.f12379h.setLayoutParams(new RelativeLayout.LayoutParams(L02 / c1641h3.G0(), dimension));
                    int i9 = this.f12872f;
                    C1641h c1641h4 = this.f12869c;
                    AbstractC3255y.f(c1641h4);
                    int K02 = i9 * c1641h4.K0();
                    C1641h c1641h5 = this.f12869c;
                    AbstractC3255y.f(c1641h5);
                    J3().f12121t.f12378g.setLayoutParams(new RelativeLayout.LayoutParams(K02 / c1641h5.G0(), dimension));
                    int i10 = this.f12872f;
                    C1641h c1641h6 = this.f12869c;
                    AbstractC3255y.f(c1641h6);
                    int J02 = i10 * c1641h6.J0();
                    C1641h c1641h7 = this.f12869c;
                    AbstractC3255y.f(c1641h7);
                    J3().f12121t.f12377f.setLayoutParams(new RelativeLayout.LayoutParams(J02 / c1641h7.G0(), dimension));
                    int i11 = this.f12872f;
                    C1641h c1641h8 = this.f12869c;
                    AbstractC3255y.f(c1641h8);
                    int I02 = i11 * c1641h8.I0();
                    C1641h c1641h9 = this.f12869c;
                    AbstractC3255y.f(c1641h9);
                    J3().f12121t.f12376e.setLayoutParams(new RelativeLayout.LayoutParams(I02 / c1641h9.G0(), dimension));
                    int i12 = this.f12872f;
                    C1641h c1641h10 = this.f12869c;
                    AbstractC3255y.f(c1641h10);
                    int H02 = i12 * c1641h10.H0();
                    C1641h c1641h11 = this.f12869c;
                    AbstractC3255y.f(c1641h11);
                    J3().f12121t.f12375d.setLayoutParams(new RelativeLayout.LayoutParams(H02 / c1641h11.G0(), dimension));
                }
            }
            J3().f12121t.getRoot().setVisibility(8);
            J3().f12121t.f12388q.setVisibility(8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U2(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X4.L0.C1509h
            if (r0 == 0) goto L13
            r0 = r7
            X4.L0$h r0 = (X4.L0.C1509h) r0
            int r1 = r0.f13009d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13009d = r1
            goto L18
        L13:
            X4.L0$h r0 = new X4.L0$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13007b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f13009d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f13006a
            X4.L0 r2 = (X4.L0) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            X4.L0$i r2 = new X4.L0$i
            r2.<init>(r5)
            r0.f13006a = r6
            r0.f13009d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            X4.L0$j r4 = new X4.L0$j
            r4.<init>(r5)
            r0.f13006a = r5
            r0.f13009d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.U2(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U3(InterfaceC1668n tmp0, Object obj, Object obj2) {
        AbstractC3255y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void U4() {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) LoginActivity.class);
            ActivityResultLauncher activityResultLauncher = this.f12865I;
            UptodownApp.a aVar = UptodownApp.f29058B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            activityResultLauncher.launch(intent, aVar.b(requireActivity));
        }
    }

    private final void U5(TextView textView, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setOutlineSpotShadowColor(ContextCompat.getColor(requireContext(), i8));
            textView.setOutlineAmbientShadowColor(ContextCompat.getColor(requireContext(), i8));
        }
    }

    private final void U6() {
        Q4.u uVar = new Q4.u();
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        ArrayList c8 = uVar.c(requireContext);
        this.f12880n = c8;
        AbstractC3255y.f(c8);
        if (c8.size() > 0) {
            C3677q c3677q = new C3677q();
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            File f8 = c3677q.f(requireContext2);
            String absolutePath = f8.getAbsolutePath();
            AbstractC3255y.h(absolutePath, "dirApps.absolutePath");
            N4.e eVar = new N4.e(absolutePath);
            eVar.f(false);
            eVar.e(f8.getFreeSpace());
            ArrayList arrayList = this.f12880n;
            AbstractC3255y.f(arrayList);
            arrayList.add(0, eVar);
            this.f12878l = 0;
            k3();
            return;
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context requireContext3 = requireContext();
        AbstractC3255y.h(requireContext3, "requireContext()");
        aVar.W0(requireContext3, false);
        e6();
    }

    private final void V2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X4.F0
            @Override // java.lang.Runnable
            public final void run() {
                L0.W2(L0.this);
            }
        }, 5000L);
    }

    private final View V3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        this.f12867a = C1472c.c(layoutInflater, viewGroup, false);
        CoordinatorLayout root = J3().getRoot();
        AbstractC3255y.h(root, "binding.root");
        C1641h c1641h = this.f12869c;
        String str2 = null;
        if (c1641h != null) {
            str = c1641h.j0();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            C1641h c1641h2 = this.f12869c;
            if (c1641h2 != null) {
                str2 = c1641h2.b0();
            }
            if (str2 == null || str2.length() == 0) {
                J3().f12068F.f12143b.setVisibility(8);
                View inflate = layoutInflater.inflate(com.uptodown.R.layout.app_detail_feature_image, viewGroup, false);
                AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                this.f12868b = (ImageView) inflate;
                J3().f12068F.f12143b.removeAllViews();
                J3().f12068F.f12143b.addView(this.f12868b);
                return root;
            }
        }
        J3().f12068F.f12143b.setVisibility(0);
        View inflate2 = layoutInflater.inflate(com.uptodown.R.layout.app_detail_feature_image, viewGroup, false);
        AbstractC3255y.g(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f12868b = (ImageView) inflate2;
        J3().f12068F.f12143b.removeAllViews();
        J3().f12068F.f12143b.addView(this.f12868b);
        return root;
    }

    private final void V4(final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: X4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                L0.W4(L0.this, view, view2);
            }
        });
    }

    private final void V5() {
        if (J3().f12099f.getChildCount() == 0) {
            C1488l c8 = C1488l.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            c8.f12398b.setTypeface(H4.j.f3824g.u());
            J3().f12099f.addView(c8.getRoot());
        }
        V2();
    }

    private final void V6() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new v0(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(L0 this$0) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getContext() != null) {
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            if (!aVar.S(requireContext)) {
                this$0.V5();
            } else if (this$0.J3().f12099f.getChildCount() > 0) {
                this$0.J3().f12099f.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W3() {
        FragmentActivity activity = getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        if (((AbstractActivityC2683a) activity).U() && getContext() != null) {
            C3677q c3677q = new C3677q();
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            File f8 = c3677q.f(requireContext);
            C3661a c3661a = new C3661a();
            C3677q c3677q2 = new C3677q();
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            return c3661a.c(c3677q2.k(requireContext2, f8), S3());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W4(final L0 this$0, View this_openLoginToPreRegister, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(this_openLoginToPreRegister, "$this_openLoginToPreRegister");
        if (UptodownApp.f29058B.a0()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
            if (this_openLoginToPreRegister.getContext() != null) {
                C1497v c8 = C1497v.c(this$0.getLayoutInflater());
                AbstractC3255y.h(c8, "inflate(layoutInflater)");
                TextView textView = c8.f12595f;
                j.a aVar = H4.j.f3824g;
                textView.setTypeface(aVar.t());
                c8.f12593d.setTypeface(aVar.u());
                c8.f12594e.setTypeface(aVar.t());
                c8.f12594e.setOnClickListener(new View.OnClickListener() { // from class: X4.p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.X4(L0.this, view2);
                    }
                });
                c8.f12591b.setOnClickListener(new View.OnClickListener() { // from class: X4.q0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.Y4(L0.this, view2);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(this$0.requireContext());
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                this$0.y6(builder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W5(int i8, String str) {
        Menu menu = this.f12884r;
        if (menu != null) {
            AbstractC3255y.f(menu);
            menu.findItem(i8).setTitle(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W6(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X4.L0.w0
            if (r0 == 0) goto L13
            r0 = r7
            X4.L0$w0 r0 = (X4.L0.w0) r0
            int r1 = r0.f13097d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13097d = r1
            goto L18
        L13:
            X4.L0$w0 r0 = new X4.L0$w0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13095b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f13097d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f13094a
            X4.L0 r2 = (X4.L0) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            X4.L0$x0 r2 = new X4.L0$x0
            r2.<init>(r5)
            r0.f13094a = r6
            r0.f13097d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            X4.L0$y0 r4 = new X4.L0$y0
            r4.<init>(r5)
            r0.f13094a = r5
            r0.f13097d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.W6(S5.d):java.lang.Object");
    }

    private final void X2() {
        Long l8;
        C1641h c1641h = this.f12869c;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (!c1641h.v0()) {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                if (c1641h2.o0() > 0) {
                    C1641h c1641h3 = this.f12869c;
                    AbstractC3255y.f(c1641h3);
                    if (c1641h3.k1()) {
                        C1641h c1641h4 = this.f12869c;
                        AbstractC3255y.f(c1641h4);
                        if (c1641h4.f1() > 0) {
                            C1641h c1641h5 = this.f12869c;
                            AbstractC3255y.f(c1641h5);
                            long o02 = c1641h5.o0();
                            C1641h c1641h6 = this.f12869c;
                            AbstractC3255y.f(c1641h6);
                            if (o02 != c1641h6.f1()) {
                                C1641h c1641h7 = this.f12869c;
                                AbstractC3255y.f(c1641h7);
                                c1641h7.x1(true);
                                Bundle bundle = new Bundle();
                                C1641h c1641h8 = this.f12869c;
                                if (c1641h8 != null) {
                                    l8 = Long.valueOf(c1641h8.i());
                                } else {
                                    l8 = null;
                                }
                                if (l8 != null) {
                                    C1641h c1641h9 = this.f12869c;
                                    AbstractC3255y.f(c1641h9);
                                    bundle.putString("appId", String.valueOf(c1641h9.i()));
                                }
                                bundle.putString("type", "noLastVersion");
                                C3678r c3678r = this.f12892z;
                                if (c3678r != null) {
                                    c3678r.b("app_details", bundle);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X3(int i8) {
        Menu menu = this.f12884r;
        if (menu != null) {
            AbstractC3255y.f(menu);
            menu.findItem(i8).setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.U4();
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    private final void X5(int i8) {
        Menu menu = this.f12884r;
        AbstractC3255y.f(menu);
        Drawable icon = menu.findItem(com.uptodown.R.id.action_search).getIcon();
        if (icon != null) {
            DrawableCompat.setTint(icon, i8);
        }
    }

    private final void Y2(int i8, String str, long j8) {
        if (getContext() != null && i8 >= 0) {
            x.a aVar = a5.x.f14348f;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            a5.x b8 = aVar.b(requireContext);
            if (b8 != null && b8.c() == -1 && AbstractC3255y.d(b8.d(), str) && b8.b() == j8) {
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                b8.l(requireContext2, i8);
            }
        }
    }

    private final void Y3() {
        I6();
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = J3().f12069G.f12171h;
        AbstractC3255y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f12069G.f12165b;
        AbstractC3255y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3854c.e(progressBar, imageView);
        this.f12886t = -1;
        J3().f12066D.f12360e.setVisibility(8);
        J3().f12066D.f12361f.setVisibility(8);
        J3().f12066D.f12359d.setVisibility(0);
        J3().f12069G.f12171h.setIndeterminate(true);
        J3().f12069G.f12184u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        J3().f12063A.f12689k.setVisibility(8);
        J3().f12063A.f12680b.setVisibility(4);
        J3().f12063A.f12692n.setText("");
        J3().f12063A.f12683e.setIndeterminate(true);
        J3().f12063A.f12690l.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y5(String str) {
        H6();
        this.f12886t = -1;
        J3().f12069G.f12168e.setVisibility(0);
        J3().f12069G.f12166c.setVisibility(8);
        J3().f12066D.f12361f.setText(str);
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.shape_bg_download_button_deactivated));
        J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
        J3().f12066D.f12361f.setOnClickListener(null);
        J3().f12063A.f12693o.setText(str);
        J3().f12063A.f12684f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.shape_bg_download_button_deactivated));
        J3().f12063A.f12693o.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
        J3().f12063A.f12684f.setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (r6.exists() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(android.content.Context r14, S5.d r15) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.Z2(android.content.Context, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x05eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Z3(final android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.Z3(android.content.Context):void");
    }

    private final void Z4() {
        if (!requireActivity().isFinishing() && this.f12869c != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) MoreInfo.class);
            intent.putExtra("appInfo", this.f12869c);
            UptodownApp.a aVar = UptodownApp.f29058B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z5(C1648o c1648o) {
        I6();
        this.f12886t = -1;
        J3().f12069G.f12171h.setIndeterminate(true);
        J3().f12069G.f12168e.setVisibility(8);
        J3().f12069G.f12166c.setVisibility(0);
        J3().f12069G.f12184u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        J3().f12063A.f12683e.setIndeterminate(true);
        J3().f12063A.f12691m.setText(new Q4.g().c(c1648o.u()));
        J3().f12063A.f12690l.setText(c1648o.Z() + getString(com.uptodown.R.string.percent));
        TextView textView = J3().f12063A.f12692n;
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
        String format = String.format("/%s", Arrays.copyOf(new Object[]{new Q4.g().c(c1648o.a0())}, 1));
        AbstractC3255y.h(format, "format(...)");
        textView.setText(format);
    }

    private final void a3() {
        FragmentActivity activity = getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        if (((AbstractActivityC2683a) activity).U()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            if (!aVar.e0(requireContext)) {
                U6();
                return;
            } else {
                e6();
                return;
            }
        }
        FragmentActivity activity2 = getActivity();
        AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        ((AbstractActivityC2683a) activity2).o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getActivity() != null) {
            if (this$0.getActivity() instanceof MainActivity) {
                FragmentActivity activity = this$0.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).J6();
            } else if (this$0.getActivity() instanceof AppDetailActivity) {
                FragmentActivity activity2 = this$0.getActivity();
                AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity2).finish();
            }
        }
    }

    private final void a5() {
        C1641h c1641h;
        if (!requireActivity().isFinishing() && (c1641h = this.f12869c) != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.n1()) {
                Intent intent = new Intent(requireActivity(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra("appInfo", this.f12869c);
                UptodownApp.a aVar = UptodownApp.f29058B;
                FragmentActivity requireActivity = requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                startActivity(intent, aVar.a(requireActivity));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a6(Context context) {
        String str;
        String string;
        H6();
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = J3().f12069G.f12171h;
        AbstractC3255y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f12069G.f12165b;
        AbstractC3255y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3854c.c(progressBar, imageView);
        this.f12886t = -1;
        if (new J4.a(context).m()) {
            string = context.getString(com.uptodown.R.string.option_button_install);
            AbstractC3255y.h(string, "context.getString(R.string.option_button_install)");
        } else {
            C1641h c1641h = this.f12869c;
            if (c1641h != null) {
                str = c1641h.B0();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                string = c1641h2.d1("try");
                if (this.f12869c == null || string == null || string.length() == 0) {
                    string = context.getString(com.uptodown.R.string.updates_button_download_app);
                    AbstractC3255y.h(string, "context.getString(R.stri…ates_button_download_app)");
                }
            } else {
                string = context.getString(com.uptodown.R.string.updates_button_download_app);
                AbstractC3255y.h(string, "context.getString(R.stri…ates_button_download_app)");
            }
        }
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        TextView textView = J3().f12066D.f12361f;
        AbstractC3255y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.blue_primary);
        J3().f12066D.f12360e.setVisibility(8);
        J3().f12069G.f12168e.setVisibility(0);
        J3().f12069G.f12166c.setVisibility(8);
        J3().f12066D.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.b6(L0.this, view);
            }
        });
        J3().f12066D.f12361f.setVisibility(0);
        J3().f12066D.f12361f.setText(string);
        J3().f12063A.f12680b.setVisibility(4);
        J3().f12063A.f12693o.setText(string);
        J3().f12063A.f12684f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        X3(com.uptodown.R.id.action_uninstall);
        X3(com.uptodown.R.id.action_app_installed_details);
    }

    private final void b3() {
        C1641h c1641h = this.f12869c;
        AbstractC3255y.f(c1641h);
        if (c1641h.p1()) {
            AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C1513l(new kotlin.jvm.internal.O(), null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.e5();
    }

    private final void b5() {
        if (!requireActivity().isFinishing() && this.f12869c != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) OrganizationActivity.class);
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            intent.putExtra("organizationID", c1641h.x0());
            C1641h c1641h2 = this.f12869c;
            AbstractC3255y.f(c1641h2);
            intent.putExtra("organizationName", c1641h2.p());
            UptodownApp.a aVar = UptodownApp.f29058B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b6(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    private final void c3(C1648o c1648o) {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f12869c != null) {
            Q.b bVar = a5.Q.f14058k;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            a5.Q e8 = bVar.e(requireActivity);
            if (e8 != null && e8.y()) {
                C1641h c1641h = this.f12869c;
                AbstractC3255y.f(c1641h);
                if (c1641h.O0() == null) {
                    FragmentActivity requireActivity2 = requireActivity();
                    AbstractC3255y.h(requireActivity2, "requireActivity()");
                    C1641h c1641h2 = this.f12869c;
                    AbstractC3255y.f(c1641h2);
                    String valueOf = String.valueOf(c1641h2.f0());
                    C1641h c1641h3 = this.f12869c;
                    AbstractC3255y.f(c1641h3);
                    new V4.m(requireActivity2, valueOf, c1641h3.S0(), new C1514m(c1648o), LifecycleOwnerKt.getLifecycleScope(this));
                    return;
                }
                C1641h c1641h4 = this.f12869c;
                AbstractC3255y.f(c1641h4);
                a5.H O02 = c1641h4.O0();
                AbstractC3255y.f(O02);
                if (O02.h() > 0) {
                    FragmentActivity activity = getActivity();
                    AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    C1641h c1641h5 = this.f12869c;
                    AbstractC3255y.f(c1641h5);
                    ((AbstractActivityC2683a) activity).j2(c1641h5, new C1515n(c1648o), new C1516o());
                    return;
                }
                A3(c1648o);
                return;
            }
            A3(c1648o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c5(long j8) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).F2(j8);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).F2(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c6(C1648o c1648o) {
        C1648o c1648o2;
        I6();
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = J3().f12069G.f12171h;
        AbstractC3255y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f12069G.f12165b;
        AbstractC3255y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3854c.e(progressBar, imageView);
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_open_button));
        J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.blue_primary));
        TextView textView = J3().f12066D.f12361f;
        AbstractC3255y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.blue_primary);
        J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.option_button_cancel));
        J3().f12063A.f12681c.setVisibility(8);
        this.f12886t = 5;
        if (c1648o == null && getContext() != null && this.f12869c != null) {
            C3674n.a aVar = C3674n.f36505t;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            C3674n a8 = aVar.a(requireContext);
            a8.a();
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            c1648o2 = a8.Z(String.valueOf(c1641h.f0()));
            a8.l();
        } else {
            c1648o2 = c1648o;
        }
        Long l8 = null;
        if (c1648o2 != null) {
            J3().f12066D.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.d6(L0.this, view);
                }
            });
            J3().f12063A.f12680b.setVisibility(0);
            if (!C4()) {
                J3().f12069G.f12184u.setText(getString(com.uptodown.R.string.status_download_update_pending));
                J3().f12069G.f12171h.setIndeterminate(true);
                J3().f12063A.f12683e.setIndeterminate(true);
                J3().f12063A.f12688j.setVisibility(0);
                J3().f12063A.f12690l.setVisibility(8);
            } else {
                String valueOf = String.valueOf(c1648o2.Z());
                if (isAdded() && getContext() != null) {
                    valueOf = valueOf + requireContext().getString(com.uptodown.R.string.percent);
                }
                C3667g c3667g = new C3667g();
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                if (c3667g.r(c1641h2.y0(), getContext())) {
                    J3().f12066D.f12360e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
                } else {
                    J3().f12066D.f12360e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
                }
                J3().f12069G.f12171h.setIndeterminate(false);
                J3().f12069G.f12171h.setProgress(c1648o2.Z());
                if (c1648o != null) {
                    l8 = Long.valueOf(c1648o.a0());
                }
                if (l8 != null) {
                    J3().f12069G.f12184u.setText(getString(com.uptodown.R.string.percent_of_total_size, Integer.valueOf(c1648o2.Z()), new Q4.g().c(c1648o.a0())));
                }
                J3().f12063A.f12683e.setIndeterminate(false);
                J3().f12063A.f12690l.setVisibility(0);
                J3().f12063A.f12688j.setVisibility(8);
                J3().f12063A.f12690l.setText(valueOf);
                J3().f12063A.f12691m.setText(new Q4.g().c(c1648o2.u()));
                J3().f12063A.f12683e.setProgress(c1648o2.Z());
            }
            TextView textView2 = J3().f12063A.f12692n;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String format = String.format("/%s", Arrays.copyOf(new Object[]{new Q4.g().c(c1648o2.a0())}, 1));
            AbstractC3255y.h(format, "format(...)");
            textView2.setText(format);
            return;
        }
        J3().f12069G.f12171h.setIndeterminate(true);
        J3().f12063A.f12683e.setIndeterminate(true);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.b(), null, new h0(null), 2, null);
    }

    private final void d3() {
        FragmentActivity activity = getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
        if (C4()) {
            DownloadWorker.f31052c.f();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        W4.r c8 = W4.r.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        if (getActivity() != null && !requireActivity().isFinishing()) {
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(requireContext().getString(com.uptodown.R.string.download_cancel_confimation_title));
            c8.f12477c.setTypeface(aVar.u());
            c8.f12477c.setText(requireContext().getString(com.uptodown.R.string.dialog_confirmation_verify_negative));
            c8.f12477c.setOnClickListener(new View.OnClickListener() { // from class: X4.D0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.e3(L0.this, view);
                }
            });
            c8.f12479e.setTypeface(aVar.u());
            c8.f12479e.setText(requireContext().getString(com.uptodown.R.string.dialog_confirmation_verify_afirmative));
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: X4.E0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.f3(L0.this, view);
                }
            });
        }
        builder.setView(c8.getRoot());
        builder.setCancelable(false);
        y6(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d5(C1641h c1641h) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).F2(c1641h.i());
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).F2(c1641h.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d6(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        DownloadWorker.f31052c.h();
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.q3(context);
    }

    private final void e5() {
        if (!requireActivity().isFinishing() && this.f12869c != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) ReviewsActivity.class);
            intent.putExtra("appInfo", this.f12869c);
            intent.putExtra("myReview", this.f12891y);
            UptodownApp.a aVar = UptodownApp.f29058B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    private final void e6() {
        this.f12886t = 5;
        long S32 = S3();
        C3677q c3677q = new C3677q();
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        File f8 = c3677q.f(requireContext);
        if (!f8.exists() && !f8.mkdirs()) {
            String string = getString(com.uptodown.R.string.error_cant_create_dir);
            AbstractC3255y.h(string, "getString(R.string.error_cant_create_dir)");
            m3(string);
            return;
        }
        if (!W3()) {
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            i6(requireContext2, null);
            String string2 = getString(com.uptodown.R.string.error_not_enough_space);
            AbstractC3255y.h(string2, "getString(R.string.error_not_enough_space)");
            m3(string2);
            return;
        }
        C3671k c3671k = new C3671k();
        AlertDialog alertDialog = this.f12879m;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this.f12879m = c3671k.g(alertDialog, requireActivity);
        J3().f12069G.f12184u.setVisibility(0);
        J3().f12069G.f12184u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        J3().f12069G.f12171h.setProgress(0);
        J3().f12063A.f12688j.setVisibility(0);
        J3().f12063A.f12690l.setVisibility(8);
        J3().f12063A.f12691m.setText(com.uptodown.R.string.zero_mb);
        TextView textView = J3().f12063A.f12692n;
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
        String format = String.format("/%s", Arrays.copyOf(new Object[]{new Q4.g().c(S32)}, 1));
        AbstractC3255y.h(format, "format(...)");
        textView.setText(format);
        J3().f12063A.f12683e.setProgress(0);
        if (this.f12879m == null) {
            c6(null);
            M5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        this$0.O2(requireContext);
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.Z4();
    }

    private final void f5() {
        Intent intent = new Intent(getContext(), (Class<?>) SearchActivity.class);
        intent.setFlags(603979776);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        startActivity(intent, aVar.a(requireActivity));
        C3678r c3678r = this.f12892z;
        if (c3678r != null) {
            c3678r.b("search_from_app_details", new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f6(String str) {
        Y3();
        J3().f12069G.f12184u.setText(str);
        J3().f12063A.f12691m.setText(str);
    }

    private final void g3(final C1648o c1648o, String str) {
        FragmentActivity activity = getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
        if (getContext() != null) {
            final W4.r c8 = W4.r.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(str);
            c8.f12476b.setVisibility(0);
            c8.f12476b.setTypeface(aVar.u());
            c8.f12476b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X4.g0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    L0.h3(L0.this, compoundButton, z8);
                }
            });
            c8.f12479e.setTypeface(aVar.t());
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: X4.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.i3(L0.this, c1648o, view);
                }
            });
            c8.f12477c.setTypeface(aVar.t());
            c8.f12477c.setOnClickListener(new View.OnClickListener() { // from class: X4.C0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.j3(W4.r.this, this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.a5();
    }

    private final void g5(String str) {
        Intent intent = new Intent(requireContext(), (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", str);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g6(Context context) {
        H6();
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = J3().f12069G.f12171h;
        AbstractC3255y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f12069G.f12165b;
        AbstractC3255y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3854c.c(progressBar, imageView);
        J3().f12069G.f12168e.setVisibility(0);
        J3().f12069G.f12166c.setVisibility(8);
        J3().f12066D.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.h6(L0.this, view);
            }
        });
        this.f12886t = 3;
        J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.option_button_install));
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        TextView textView = J3().f12066D.f12361f;
        AbstractC3255y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.accent_green);
        J3().f12063A.f12693o.setText(getString(com.uptodown.R.string.option_button_install));
        J3().f12063A.f12684f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        X3(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(L0 this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        aVar.a1(requireContext, !z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.R4();
    }

    private final void h5() {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f12869c != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            String valueOf = String.valueOf(c1641h.f0());
            C1641h c1641h2 = this.f12869c;
            AbstractC3255y.f(c1641h2);
            new V4.m(requireActivity, valueOf, c1641h2.S0(), new S(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h6(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(L0 this$0, C1648o download, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(download, "$download");
        this$0.A3(download);
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(L0 this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f12872f = this$0.J3().f12121t.f12380i.getMeasuredWidth();
        if (this$0.f12871e) {
            this$0.T6();
        }
    }

    private final View i5(a5.F f8, LinearLayout.LayoutParams layoutParams) {
        C1484i c8 = C1484i.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        TextView textView = c8.f12348c;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        c8.f12349d.setTypeface(aVar.t());
        c8.f12348c.setText(f8.a());
        c8.f12349d.setText(f8.h());
        c8.getRoot().setTag(f8.i());
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: X4.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.j5(L0.this, view);
            }
        });
        if (getContext() != null && f8.b() != null) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(f8.g());
            UptodownApp.a aVar2 = UptodownApp.f29058B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            l8.n(aVar2.f0(requireActivity)).i(c8.f12347b);
        }
        c8.getRoot().setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3255y.h(root, "articleBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i6(Context context, C1648o c1648o) {
        J3().f12124w.getRoot().setVisibility(0);
        if (c1648o != null && c1648o.Z() == 100) {
            g6(context);
        } else {
            a6(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(W4.r dialogBinding, L0 this$0, View view) {
        AbstractC3255y.i(dialogBinding, "$dialogBinding");
        AbstractC3255y.i(this$0, "this$0");
        if (dialogBinding.f12476b.isChecked()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            aVar.a1(requireContext, true);
        }
        Context requireContext2 = this$0.requireContext();
        AbstractC3255y.h(requireContext2, "requireContext()");
        this$0.a6(requireContext2);
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.f12883q = 1;
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j5(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(view, "view");
        try {
            if (this$0.getActivity() != null && !this$0.requireActivity().isFinishing()) {
                Object tag = view.getTag();
                AbstractC3255y.g(tag, "null cannot be cast to non-null type kotlin.String");
                C3671k c3671k = new C3671k();
                FragmentActivity requireActivity = this$0.requireActivity();
                AbstractC3255y.h(requireActivity, "requireActivity()");
                C3671k.r(c3671k, requireActivity, (String) tag, null, 4, null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j6(Context context) {
        J6();
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = J3().f12069G.f12171h;
        AbstractC3255y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f12069G.f12165b;
        AbstractC3255y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3854c.c(progressBar, imageView);
        this.f12886t = 0;
        J3().f12066D.f12360e.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f12066D.f12360e.setTextColor(ContextCompat.getColor(context, com.uptodown.R.color.white));
        J3().f12066D.f12360e.setEnabled(true);
        C1641h c1641h = this.f12869c;
        AbstractC3255y.f(c1641h);
        C1644k s8 = c1641h.s();
        AbstractC3255y.f(s8);
        if (s8.u() == 1) {
            J3().f12066D.f12360e.setText(context.getString(com.uptodown.R.string.app_detail_play_button));
            J3().f12063A.f12689k.setText(context.getString(com.uptodown.R.string.app_detail_play_button));
        }
        D6(com.uptodown.R.id.action_uninstall);
        D6(com.uptodown.R.id.action_app_installed_details);
        C1641h c1641h2 = this.f12869c;
        if (c1641h2 != null) {
            AbstractC3255y.f(c1641h2);
            if (c1641h2.y0() != null) {
                String packageName = requireActivity().getPackageName();
                C1641h c1641h3 = this.f12869c;
                AbstractC3255y.f(c1641h3);
                if (j6.n.s(packageName, c1641h3.y0(), true)) {
                    J3().f12066D.f12360e.setVisibility(8);
                    J3().f12066D.f12357b.setVisibility(8);
                    J3().f12066D.f12358c.setVisibility(8);
                    J3().f12063A.f12689k.setVisibility(8);
                    C1641h c1641h4 = this.f12869c;
                    AbstractC3255y.f(c1641h4);
                    if (628 < c1641h4.o0()) {
                        if (this.f12875i) {
                            r6(context);
                            return;
                        }
                        String packageName2 = requireActivity().getPackageName();
                        AbstractC3255y.h(packageName2, "requireActivity().packageName");
                        this.f12874h = new a5.O(packageName2);
                        u6(context);
                    }
                }
            }
        }
    }

    private final void k3() {
        FragmentActivity activity = getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
        if (getActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            C1493q c8 = C1493q.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            ArrayList arrayList = this.f12880n;
            AbstractC3255y.f(arrayList);
            c8.f12468b.setAdapter(new C1193c(requireActivity, arrayList, this.f12878l, new C1517p()));
            c8.f12468b.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            c8.f12469c.setTypeface(H4.j.f3824g.t());
            c8.f12469c.setOnClickListener(new View.OnClickListener() { // from class: X4.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.l3(L0.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.f12883q = 2;
        this$0.q3(context);
    }

    private final View k5(LinearLayout.LayoutParams layoutParams) {
        C1484i c8 = C1484i.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setVisibility(4);
        RelativeLayout root = c8.getRoot();
        AbstractC3255y.h(root, "articleBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k6(C1648o c1648o) {
        c6(c1648o);
        J3().f12066D.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.l6(L0.this, view);
            }
        });
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
        TextView textView = J3().f12066D.f12361f;
        AbstractC3255y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.blue_primary);
        J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        J3().f12066D.f12361f.setVisibility(0);
        J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f12063A.f12680b.setVisibility(8);
        J3().f12063A.f12681c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(L0 this$0, View view) {
        ArrayList arrayList;
        boolean z8;
        AbstractC3255y.i(this$0, "this$0");
        int i8 = this$0.f12878l;
        if (i8 >= 0 && (arrayList = this$0.f12880n) != null) {
            AbstractC3255y.f(arrayList);
            if (i8 < arrayList.size()) {
                SettingsPreferences.a aVar = SettingsPreferences.f30353b;
                Context requireContext = this$0.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                if (this$0.f12878l > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                aVar.W0(requireContext, z8);
                FragmentActivity activity = this$0.getActivity();
                AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
                if (r22 != null) {
                    r22.dismiss();
                }
                this$0.e6();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l4(L0 this$0, MenuItem item) {
        FragmentActivity activity;
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "item");
        if (UptodownApp.f29058B.a0()) {
            if (item.getItemId() == com.uptodown.R.id.action_search) {
                this$0.f5();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_share) {
                this$0.v6();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_antivirus_report) {
                this$0.h5();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_uninstall) {
                C1641h c1641h = this$0.f12869c;
                if (c1641h != null) {
                    AbstractC3255y.f(c1641h);
                    if (c1641h.y0() != null && (activity = this$0.getActivity()) != null) {
                        H4.i iVar = new H4.i(activity);
                        C1641h c1641h2 = this$0.f12869c;
                        AbstractC3255y.f(c1641h2);
                        String y02 = c1641h2.y0();
                        AbstractC3255y.f(y02);
                        iVar.h(y02);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_wishlist) {
                this$0.B2();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_exclude) {
                this$0.A2();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_app_details_settings) {
                this$0.O4();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_app_installed_details) {
                this$0.P4();
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l5() {
        C1641h c1641h;
        if (getActivity() != null && !requireActivity().isFinishing() && (c1641h = this.f12869c) != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.N0() != null) {
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                ArrayList N02 = c1641h2.N0();
                AbstractC3255y.f(N02);
                if (N02.size() > 0) {
                    int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                    int dimension2 = (int) getResources().getDimension(com.uptodown.R.dimen.feature_card_width);
                    TextView textView = J3().f12080R;
                    C1641h c1641h3 = this.f12869c;
                    AbstractC3255y.f(c1641h3);
                    textView.setText(getString(com.uptodown.R.string.app_related_articles, c1641h3.s0()));
                    int dimension3 = (int) getResources().getDimension(com.uptodown.R.dimen.margin_l);
                    if (j6.n.s(getString(com.uptodown.R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                        C1641h c1641h4 = this.f12869c;
                        AbstractC3255y.f(c1641h4);
                        ArrayList N03 = c1641h4.N0();
                        AbstractC3255y.f(N03);
                        if (N03.size() == 1) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension2, -2);
                            layoutParams.setMargins(dimension, dimension, dimension, dimension3);
                            LinearLayout linearLayout = J3().f12115n;
                            C1641h c1641h5 = this.f12869c;
                            AbstractC3255y.f(c1641h5);
                            ArrayList N04 = c1641h5.N0();
                            AbstractC3255y.f(N04);
                            linearLayout.addView(i5((a5.F) AbstractC1378t.m0(N04), layoutParams));
                            return;
                        }
                        C1641h c1641h6 = this.f12869c;
                        AbstractC3255y.f(c1641h6);
                        ArrayList N05 = c1641h6.N0();
                        AbstractC3255y.f(N05);
                        int size = N05.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dimension2, -2);
                            C1641h c1641h7 = this.f12869c;
                            AbstractC3255y.f(c1641h7);
                            ArrayList N06 = c1641h7.N0();
                            AbstractC3255y.f(N06);
                            if (i8 == AbstractC1378t.o(N06)) {
                                layoutParams2.setMargins(0, dimension, dimension, dimension3);
                            } else {
                                layoutParams2.setMargins(dimension, dimension, dimension, dimension);
                            }
                            LinearLayout linearLayout2 = J3().f12115n;
                            C1641h c1641h8 = this.f12869c;
                            AbstractC3255y.f(c1641h8);
                            ArrayList N07 = c1641h8.N0();
                            AbstractC3255y.f(N07);
                            Object obj = N07.get(i8);
                            AbstractC3255y.h(obj, "appInfo!!.relatedPosts!![i]");
                            linearLayout2.addView(i5((a5.F) obj, layoutParams2));
                        }
                        return;
                    }
                    int i9 = 0;
                    while (true) {
                        C1641h c1641h9 = this.f12869c;
                        AbstractC3255y.f(c1641h9);
                        ArrayList N08 = c1641h9.N0();
                        AbstractC3255y.f(N08);
                        if (i9 < N08.size()) {
                            LinearLayout linearLayout3 = new LinearLayout(requireActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams3.setMargins(dimension, dimension, dimension, dimension);
                            layoutParams3.weight = 1.0f;
                            C1641h c1641h10 = this.f12869c;
                            AbstractC3255y.f(c1641h10);
                            ArrayList N09 = c1641h10.N0();
                            AbstractC3255y.f(N09);
                            Object obj2 = N09.get(i9);
                            AbstractC3255y.h(obj2, "appInfo!!.relatedPosts!![i]");
                            linearLayout3.addView(i5((a5.F) obj2, layoutParams3));
                            int i10 = i9 + 1;
                            C1641h c1641h11 = this.f12869c;
                            AbstractC3255y.f(c1641h11);
                            ArrayList N010 = c1641h11.N0();
                            AbstractC3255y.f(N010);
                            if (i10 < N010.size()) {
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.setMargins(dimension, dimension, dimension, dimension);
                                layoutParams4.weight = 1.0f;
                                C1641h c1641h12 = this.f12869c;
                                AbstractC3255y.f(c1641h12);
                                ArrayList N011 = c1641h12.N0();
                                AbstractC3255y.f(N011);
                                Object obj3 = N011.get(i10);
                                AbstractC3255y.h(obj3, "appInfo!!.relatedPosts!![i + 1]");
                                linearLayout3.addView(i5((a5.F) obj3, layoutParams4));
                            } else {
                                linearLayout3.addView(k5(layoutParams3));
                            }
                            J3().f12115n.addView(linearLayout3);
                            i9 += 2;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        J3().f12113m.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l6(L0 this$0, View view) {
        Object obj;
        AbstractC3255y.i(this$0, "this$0");
        DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
        C1641h c1641h = this$0.f12869c;
        AbstractC3255y.f(c1641h);
        long i8 = c1641h.i();
        C1641h c1641h2 = this$0.f12869c;
        AbstractC3255y.f(c1641h2);
        if (aVar.d(i8, c1641h2.o0())) {
            DownloadWorker.a aVar2 = DownloadWorker.f31052c;
            if (aVar2.c()) {
                aVar2.h();
                return;
            }
        }
        Iterator it = UptodownApp.f29058B.F().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String s8 = ((a5.O) obj).s();
                C1641h c1641h3 = this$0.f12869c;
                AbstractC3255y.f(c1641h3);
                if (AbstractC3255y.d(s8, c1641h3.y0())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            DownloadWorker.a aVar3 = DownloadWorker.f31052c;
            if (aVar3.d()) {
                aVar3.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3(String str) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            W4.r c8 = W4.r.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(str);
            c8.f12477c.setVisibility(8);
            c8.f12479e.setTypeface(aVar.u());
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: X4.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.n3(L0.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.f12883q = 3;
        this$0.q3(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x066d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m5(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.m5(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m6() {
        K6();
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        if (bVar.e(requireContext) == null) {
            J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.pre_registration_title));
            J3().f12063A.f12694p.setText(getString(com.uptodown.R.string.pre_registration_title));
            J3().f12063A.f12682d.setVisibility(0);
            TextView textView = J3().f12066D.f12361f;
            AbstractC3255y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
            V4(textView);
            RelativeLayout relativeLayout = J3().f12063A.f12687i;
            AbstractC3255y.h(relativeLayout, "binding.rlBottomDownload…etail.rlStatusPreRegister");
            V4(relativeLayout);
        } else {
            b3();
        }
        J3().f12069G.f12168e.setVisibility(0);
        J3().f12069G.f12166c.setVisibility(8);
        J3().f12069G.f12178o.setVisibility(8);
        J3().f12066D.f12357b.setVisibility(8);
        X3(com.uptodown.R.id.action_antivirus_report);
        X3(com.uptodown.R.id.action_uninstall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getActivity() != null && !this$0.requireActivity().isFinishing()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.f12883q = 4;
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n5(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.e5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n6() {
        J3().f12069G.f12188y.setVisibility(8);
        J3().f12069G.f12167d.setVisibility(8);
        C1641h c1641h = this.f12869c;
        AbstractC3255y.f(c1641h);
        String M02 = c1641h.M0();
        if (M02 != null && M02.length() != 0) {
            C1641h c1641h2 = this.f12869c;
            AbstractC3255y.f(c1641h2);
            String M03 = c1641h2.M0();
            AbstractC3255y.f(M03);
            Y5(M03);
        } else {
            String string = getString(com.uptodown.R.string.app_detail_not_available);
            AbstractC3255y.h(string, "getString(R.string.app_detail_not_available)");
            Y5(string);
        }
        J3().f12066D.f12357b.setVisibility(8);
        X3(com.uptodown.R.id.action_antivirus_report);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3() {
        FragmentActivity activity = getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
        if (getContext() != null) {
            C1490n c8 = C1490n.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12428d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            c8.f12427c.setTypeface(aVar.u());
            TextView textView2 = c8.f12427c;
            C3671k c3671k = new C3671k();
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            String string = getString(com.uptodown.R.string.pre_register_success, c1641h.s0());
            AbstractC3255y.h(string, "getString(R.string.pre_r…_success, appInfo!!.name)");
            C1641h c1641h2 = this.f12869c;
            AbstractC3255y.f(c1641h2);
            String s02 = c1641h2.s0();
            AbstractC3255y.f(s02);
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            textView2.setText(c3671k.d(string, s02, requireContext));
            c8.f12426b.setTypeface(aVar.t());
            c8.f12426b.setOnClickListener(new View.OnClickListener() { // from class: X4.G0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.p3(L0.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o4(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.f12883q = 5;
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o5(L0 this$0) {
        AbstractC3255y.i(this$0, "this$0");
        TextView textView = this$0.J3().f12073K.f11766d;
        AbstractC3255y.h(textView, "binding.rlWhatsNew.tvWhatsNewContent");
        if (!q5.v.a(textView) && this$0.J3().f12073K.f11766d.getMaxLines() <= 6) {
            this$0.J3().f12073K.f11764b.setVisibility(8);
            this$0.J3().f12073K.f11767e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o6(Context context) {
        H6();
        this.f12886t = 4;
        J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f12063A.f12693o.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f12063A.f12684f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.e5();
    }

    private final View p5(C1650q c1650q, LinearLayout.LayoutParams layoutParams) {
        W4.A c8 = W4.A.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        TextView textView = c8.f11671c;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        c8.f11670b.setTypeface(aVar.u());
        c8.f11671c.setText(c1650q.b());
        c8.f11670b.setText(c1650q.a());
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: X4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.q5(view);
            }
        });
        LinearLayout root = c8.getRoot();
        AbstractC3255y.h(root, "faqBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p6(a5.O o8) {
        boolean z8;
        boolean z9;
        I6();
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = J3().f12069G.f12171h;
        AbstractC3255y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f12069G.f12165b;
        AbstractC3255y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3854c.e(progressBar, imageView);
        this.f12886t = 5;
        if (o8 != null) {
            J3().f12069G.f12168e.setVisibility(8);
            J3().f12069G.f12166c.setVisibility(0);
            J3().f12066D.f12360e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
            J3().f12066D.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.q6(L0.this, view);
                }
            });
            J3().f12066D.f12361f.setVisibility(0);
            J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.option_button_cancel));
            ProgressBar progressBar2 = J3().f12069G.f12171h;
            if (o8.u() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            progressBar2.setIndeterminate(z8);
            J3().f12069G.f12171h.setProgress(o8.u());
            J3().f12069G.f12184u.setText(getString(com.uptodown.R.string.percent_of_total_size, Integer.valueOf(o8.u()), new Q4.g().c(o8.v())));
            J3().f12063A.f12680b.setVisibility(0);
            ProgressBar progressBar3 = J3().f12063A.f12683e;
            if (o8.u() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            progressBar3.setIndeterminate(z9);
            J3().f12063A.f12691m.setText(new Q4.g().c((o8.v() * o8.u()) / 100));
            J3().f12063A.f12683e.setProgress(o8.u());
            J3().f12063A.f12688j.setVisibility(8);
            J3().f12063A.f12690l.setVisibility(0);
            J3().f12063A.f12690l.setText(o8.u() + getString(com.uptodown.R.string.percent));
            TextView textView = J3().f12063A.f12692n;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String format = String.format("/%s", Arrays.copyOf(new Object[]{new Q4.g().c(o8.v())}, 1));
            AbstractC3255y.h(format, "format(...)");
            textView.setText(format);
            return;
        }
        J3().f12069G.f12171h.setIndeterminate(true);
        J3().f12063A.f12683e.setIndeterminate(true);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.b(), null, new i0(null), 2, null);
    }

    private final void q3(final Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        FragmentActivity activity = getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
        final Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on);
        final Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        final C1498w c8 = C1498w.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        C1641h c1641h = this.f12869c;
        if (c1641h != null) {
            str = c1641h.m0();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            C1641h c1641h2 = this.f12869c;
            if (c1641h2 != null) {
                str4 = c1641h2.m0();
            } else {
                str4 = null;
            }
            h8.l(str4).n(UptodownApp.f29058B.f0(context)).i(c8.f12601c);
        } else {
            c8.f12601c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_app_icon_placeholder));
        }
        TextView textView = c8.f12607i;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        TextView textView2 = c8.f12607i;
        C1641h c1641h3 = this.f12869c;
        if (c1641h3 != null) {
            str2 = c1641h3.s0();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        int i8 = this.f12883q;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            c8.f12602d.setImageDrawable(drawable2);
                            c8.f12603e.setImageDrawable(drawable2);
                            c8.f12604f.setImageDrawable(drawable2);
                            c8.f12605g.setImageDrawable(drawable2);
                            c8.f12606h.setImageDrawable(drawable2);
                        } else {
                            c8.f12602d.setImageDrawable(drawable);
                            c8.f12603e.setImageDrawable(drawable);
                            c8.f12604f.setImageDrawable(drawable);
                            c8.f12605g.setImageDrawable(drawable);
                            c8.f12606h.setImageDrawable(drawable);
                        }
                    } else {
                        c8.f12602d.setImageDrawable(drawable);
                        c8.f12603e.setImageDrawable(drawable);
                        c8.f12604f.setImageDrawable(drawable);
                        c8.f12605g.setImageDrawable(drawable);
                        c8.f12606h.setImageDrawable(drawable2);
                    }
                } else {
                    c8.f12602d.setImageDrawable(drawable);
                    c8.f12603e.setImageDrawable(drawable);
                    c8.f12604f.setImageDrawable(drawable);
                    c8.f12605g.setImageDrawable(drawable2);
                    c8.f12606h.setImageDrawable(drawable2);
                }
            } else {
                c8.f12602d.setImageDrawable(drawable);
                c8.f12603e.setImageDrawable(drawable);
                c8.f12604f.setImageDrawable(drawable2);
                c8.f12605g.setImageDrawable(drawable2);
                c8.f12606h.setImageDrawable(drawable2);
            }
        } else {
            c8.f12602d.setImageDrawable(drawable);
            c8.f12603e.setImageDrawable(drawable2);
            c8.f12604f.setImageDrawable(drawable2);
            c8.f12605g.setImageDrawable(drawable2);
            c8.f12606h.setImageDrawable(drawable2);
        }
        c8.f12602d.setOnClickListener(new View.OnClickListener() { // from class: X4.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.r3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f12603e.setOnClickListener(new View.OnClickListener() { // from class: X4.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.s3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f12604f.setOnClickListener(new View.OnClickListener() { // from class: X4.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.t3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f12605g.setOnClickListener(new View.OnClickListener() { // from class: X4.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.u3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f12606h.setOnClickListener(new View.OnClickListener() { // from class: X4.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.v3(L0.this, c8, drawable, view);
            }
        });
        c8.f12600b.setTypeface(aVar.u());
        a5.K k8 = this.f12891y;
        if (k8 != null) {
            EditText editText = c8.f12600b;
            if (k8 != null) {
                str3 = k8.u();
            } else {
                str3 = null;
            }
            editText.setText(String.valueOf(str3));
            a5.K k9 = this.f12891y;
            AbstractC3255y.f(k9);
            if (k9.s() >= 1) {
                c8.f12602d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            a5.K k10 = this.f12891y;
            AbstractC3255y.f(k10);
            if (k10.s() >= 2) {
                c8.f12603e.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            a5.K k11 = this.f12891y;
            AbstractC3255y.f(k11);
            if (k11.s() >= 3) {
                c8.f12604f.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            a5.K k12 = this.f12891y;
            AbstractC3255y.f(k12);
            if (k12.s() >= 4) {
                c8.f12605g.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            a5.K k13 = this.f12891y;
            AbstractC3255y.f(k13);
            if (k13.s() == 5) {
                c8.f12606h.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
        }
        c8.f12609k.setTypeface(aVar.t());
        c8.f12609k.setOnClickListener(new View.OnClickListener() { // from class: X4.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.w3(context, this, c8, view);
            }
        });
        c8.f12608j.setTypeface(aVar.t());
        c8.f12608j.setOnClickListener(new View.OnClickListener() { // from class: X4.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.x3(L0.this, view);
            }
        });
        builder.setView(c8.getRoot());
        FragmentActivity activity2 = getActivity();
        AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r23 = ((AbstractActivityC2683a) activity2).r2();
        if (r23 != null) {
            r23.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X4.B0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    L0.y3(L0.this, context, dialogInterface);
                }
            });
        }
        y6(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.T4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q6(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(L0 this$0, C1498w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f29058B.a0()) {
            this$0.f12883q = 1;
            dialogBinding.f12602d.setImageDrawable(drawable);
            dialogBinding.f12603e.setImageDrawable(drawable2);
            dialogBinding.f12604f.setImageDrawable(drawable2);
            dialogBinding.f12605g.setImageDrawable(drawable2);
            dialogBinding.f12606h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.B2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r5() {
        try {
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            ArrayList a02 = c1641h.a0();
            if (a02 != null && a02.size() > 0) {
                int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                int dimension2 = (int) getResources().getDimension(com.uptodown.R.dimen.margin_l);
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                ArrayList a03 = c1641h2.a0();
                AbstractC3255y.f(a03);
                int size = a03.size();
                for (int i8 = 0; i8 < size; i8++) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    C1641h c1641h3 = this.f12869c;
                    AbstractC3255y.f(c1641h3);
                    ArrayList a04 = c1641h3.a0();
                    AbstractC3255y.f(a04);
                    if (i8 == AbstractC1378t.o(a04)) {
                        layoutParams.setMargins(0, dimension, 0, dimension2);
                    } else {
                        layoutParams.setMargins(0, dimension, 0, dimension);
                    }
                    LinearLayout linearLayout = J3().f12118q;
                    C1641h c1641h4 = this.f12869c;
                    AbstractC3255y.f(c1641h4);
                    ArrayList a05 = c1641h4.a0();
                    AbstractC3255y.f(a05);
                    Object obj = a05.get(i8);
                    AbstractC3255y.h(obj, "appInfo!!.faqs!![i]");
                    linearLayout.addView(p5((C1650q) obj, layoutParams));
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r6(final Context context) {
        H6();
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = J3().f12069G.f12171h;
        AbstractC3255y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f12069G.f12165b;
        AbstractC3255y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3854c.c(progressBar, imageView);
        this.f12886t = 2;
        J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.updates_button_update_app));
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        J3().f12066D.f12361f.setTextColor(ContextCompat.getColor(context, com.uptodown.R.color.white));
        J3().f12066D.f12361f.setOnClickListener(new View.OnClickListener() { // from class: X4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.s6(L0.this, context, view);
            }
        });
        J3().f12063A.f12693o.setText(getString(com.uptodown.R.string.updates_button_update_app));
        J3().f12063A.f12684f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        D6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(L0 this$0, C1498w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f29058B.a0()) {
            this$0.f12883q = 2;
            dialogBinding.f12602d.setImageDrawable(drawable);
            dialogBinding.f12603e.setImageDrawable(drawable);
            dialogBinding.f12604f.setImageDrawable(drawable2);
            dialogBinding.f12605g.setImageDrawable(drawable2);
            dialogBinding.f12606h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.h5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View s5(final C1644k c1644k, LinearLayout.LayoutParams layoutParams) {
        W4.F c8 = W4.F.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setTypeface(H4.j.f3824g.t());
        c8.getRoot().setText(String.valueOf(c1644k.h()));
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: X4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.t5(L0.this, c1644k, view);
            }
        });
        TextView root = c8.getRoot();
        AbstractC3255y.h(root, "categoryItemBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s6(L0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.z3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(L0 this$0, C1498w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f29058B.a0()) {
            this$0.f12883q = 3;
            dialogBinding.f12602d.setImageDrawable(drawable);
            dialogBinding.f12603e.setImageDrawable(drawable);
            dialogBinding.f12604f.setImageDrawable(drawable);
            dialogBinding.f12605g.setImageDrawable(drawable2);
            dialogBinding.f12606h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t4(L0 this$0, Context context, AppBarLayout appBarLayout, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        AbstractC3255y.i(appBarLayout, "appBarLayout");
        if (Math.abs(i8) == appBarLayout.getTotalScrollRange()) {
            this$0.f12881o = true;
        } else if (i8 == 0) {
            this$0.f12881o = false;
            this$0.N6(context);
        } else {
            this$0.f12881o = false;
            this$0.M6(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t5(L0 this$0, C1644k category, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(category, "$category");
        if (UptodownApp.f29058B.a0()) {
            this$0.Q4(category);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t6(Context context) {
        H6();
        this.f12886t = 4;
        J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f12063A.f12693o.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f12063A.f12684f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        D6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(L0 this$0, C1498w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f29058B.a0()) {
            this$0.f12883q = 4;
            dialogBinding.f12602d.setImageDrawable(drawable);
            dialogBinding.f12603e.setImageDrawable(drawable);
            dialogBinding.f12604f.setImageDrawable(drawable);
            dialogBinding.f12605g.setImageDrawable(drawable);
            dialogBinding.f12606h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u4(L0 this$0, NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
        C1637d c1637d;
        Long l8;
        AbstractC3255y.i(this$0, "this$0");
        Rect rect = new Rect();
        this$0.J3().f12078P.getHitRect(rect);
        this$0.x6(rect);
        boolean z8 = true;
        if (this$0.J3().f12069G.f12182s.getLocalVisibleRect(rect)) {
            this$0.J3().f12097e.setTitle("");
            this$0.J3().f12106i0.setVisibility(8);
            this$0.f12882p = true;
        } else {
            boolean z9 = this$0.f12882p;
            this$0.f12882p = false;
            C1641h c1641h = this$0.f12869c;
            if (c1641h != null) {
                AbstractC3255y.f(c1641h);
                if (c1641h.s0() != null) {
                    C1641h c1641h2 = this$0.f12869c;
                    AbstractC3255y.f(c1641h2);
                    ArrayList i12 = c1641h2.i1();
                    if (i12 != null && !i12.isEmpty()) {
                        z8 = this$0.f12881o;
                    } else {
                        C1641h c1641h3 = this$0.f12869c;
                        AbstractC3255y.f(c1641h3);
                        if (c1641h3.e0() != null) {
                            this$0.f12889w = true;
                            z8 = this$0.f12881o;
                        } else {
                            this$0.J3().f12106i0.setVisibility(0);
                            this$0.J3().f12097e.setTitleEnabled(false);
                        }
                    }
                    if (z9 && z8) {
                        if (!this$0.f12889w) {
                            TextView textView = this$0.J3().f12106i0;
                            C1641h c1641h4 = this$0.f12869c;
                            AbstractC3255y.f(c1641h4);
                            textView.setText(c1641h4.s0());
                        }
                        CollapsingToolbarLayout collapsingToolbarLayout = this$0.J3().f12097e;
                        C1641h c1641h5 = this$0.f12869c;
                        AbstractC3255y.f(c1641h5);
                        String s02 = c1641h5.s0();
                        AbstractC3255y.f(s02);
                        collapsingToolbarLayout.setTitle(s02);
                    }
                }
            }
        }
        C1637d c1637d2 = this$0.f12870d;
        if (c1637d2 != null) {
            AbstractC3255y.f(c1637d2);
            if (!c1637d2.h() && this$0.J3().f12126y.getRoot().getLocalVisibleRect(rect) && (c1637d = this$0.f12870d) != null) {
                Context requireContext = this$0.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C1641h c1641h6 = this$0.f12869c;
                if (c1641h6 != null) {
                    l8 = Long.valueOf(c1641h6.i());
                } else {
                    l8 = null;
                }
                c1637d.b(requireContext, l8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u5() {
        LifecycleCoroutineScope lifecycleScope;
        U u8;
        try {
            try {
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                m5(requireContext);
                X2();
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                G6(requireContext2);
                V6();
                this.f12871e = true;
                if (this.f12872f > 0) {
                    T6();
                }
                C3();
            } catch (Exception e8) {
                e8.printStackTrace();
                if (this.f12869c != null) {
                    lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                    u8 = new U(null);
                } else {
                    return;
                }
            }
            if (this.f12869c != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                u8 = new U(null);
                AbstractC3364k.d(lifecycleScope, null, null, u8, 3, null);
            }
        } catch (Throwable th) {
            if (this.f12869c != null) {
                AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new U(null), 3, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u6(Context context) {
        H6();
        this.f12886t = 1;
        J3().f12066D.f12361f.setText(getString(com.uptodown.R.string.updates_button_download_app));
        J3().f12066D.f12361f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f12063A.f12693o.setText(getString(com.uptodown.R.string.updates_button_download_app));
        J3().f12063A.f12684f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        D6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(L0 this$0, C1498w dialogBinding, Drawable drawable, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f29058B.a0()) {
            this$0.f12883q = 5;
            dialogBinding.f12602d.setImageDrawable(drawable);
            dialogBinding.f12603e.setImageDrawable(drawable);
            dialogBinding.f12604f.setImageDrawable(drawable);
            dialogBinding.f12605g.setImageDrawable(drawable);
            dialogBinding.f12606h.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v5() {
        if (this.f12869c != null && J3().f12117p.getVisibility() == 8) {
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            ArrayList E02 = c1641h.E0();
            if (E02 != null && !E02.isEmpty()) {
                V v8 = new V();
                W w8 = new W();
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                G4.K k8 = new G4.K(v8, w8, requireContext, 8);
                this.f12863G = k8;
                AbstractC3255y.f(k8);
                C1641h c1641h2 = this.f12869c;
                AbstractC3255y.f(c1641h2);
                ArrayList E03 = c1641h2.E0();
                AbstractC3255y.f(E03);
                k8.d(E03);
                J3().f12074L.setAdapter(this.f12863G);
                J3().f12074L.setNestedScrollingEnabled(false);
                J3().f12074L.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                J3().f12117p.setVisibility(0);
            }
        }
    }

    private final void v6() {
        if (getContext() != null && this.f12869c != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            new V4.r(requireContext, c1641h, null, null, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(Context context, L0 this$0, C1498w dialogBinding, View view) {
        String str;
        AbstractC3255y.i(context, "$context");
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f29058B.a0()) {
            a5.Q e8 = a5.Q.f14058k.e(context);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                String id = e8.getId();
                AbstractC3255y.f(id);
                if (id.length() > 0) {
                    Editable text = dialogBinding.f12600b.getText();
                    AbstractC3255y.h(text, "dialogBinding.etReview.text");
                    this$0.R5(j6.n.M0(text).toString());
                    return;
                }
            }
            this$0.f12861E = dialogBinding.f12600b.toString();
            this$0.U4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.b5();
    }

    private final View w5(LinearLayout.LayoutParams layoutParams, final a5.K k8, Context context) {
        CharSequence charSequence;
        final C1475d0 c8 = C1475d0.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.f12148e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        c8.f12149f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f12150g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f12151h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f12152i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        if (k8.s() >= 2) {
            c8.f12149f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (k8.s() >= 3) {
            c8.f12150g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (k8.s() >= 4) {
            c8.f12151h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (k8.s() == 5) {
            c8.f12152i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        UsernameTextView usernameTextView = c8.f12163t;
        j.a aVar = H4.j.f3824g;
        usernameTextView.setTypeface(aVar.t());
        c8.f12158o.setTypeface(aVar.u());
        c8.f12157n.setTypeface(aVar.u());
        c8.f12160q.setTypeface(aVar.u());
        c8.f12161r.setTypeface(aVar.u());
        Q.b bVar = a5.Q.f14058k;
        String c9 = bVar.c(k8.i());
        if (c9 != null && c9.length() != 0) {
            com.squareup.picasso.s.h().l(bVar.c(k8.i())).n(UptodownApp.f29058B.f0(context)).i(c8.f12146c);
        }
        String x8 = k8.x();
        if (x8 != null && x8.length() != 0) {
            c8.f12146c.setOnClickListener(new View.OnClickListener() { // from class: X4.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.x5(L0.this, k8, view);
                }
            });
            c8.f12163t.setOnClickListener(new View.OnClickListener() { // from class: X4.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.y5(L0.this, k8, view);
                }
            });
        }
        if (k8.y() != null) {
            c8.f12163t.setText(k8.y());
            UsernameTextView.a aVar2 = UsernameTextView.f31022k;
            UsernameTextView usernameTextView2 = c8.f12163t;
            AbstractC3255y.h(usernameTextView2, "reviewBinding.tvUsernameReview");
            aVar2.a(usernameTextView2, k8.H(), k8.z());
        }
        if (k8.w() != null) {
            c8.f12158o.setText(k8.w());
        }
        if (k8.a() == 1) {
            TextView textView = c8.f12161r;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            String string = getString(com.uptodown.R.string.replies_counter_single);
            AbstractC3255y.h(string, "getString(R.string.replies_counter_single)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3255y.h(format, "format(...)");
            textView.setText(format);
        } else if (k8.a() > 1) {
            TextView textView2 = c8.f12161r;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f34167a;
            String string2 = getString(com.uptodown.R.string.replies_counter_multiple);
            AbstractC3255y.h(string2, "getString(R.string.replies_counter_multiple)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(k8.a())}, 1));
            AbstractC3255y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        if (k8.u() != null) {
            c8.f12160q.setFocusable(true);
            TextView textView3 = c8.f12157n;
            Spanned v8 = k8.v();
            if (v8 != null) {
                charSequence = j6.n.M0(v8);
            } else {
                charSequence = null;
            }
            textView3.setText(charSequence);
            c8.f12157n.getViewTreeObserver().addOnPreDrawListener(new X(c8));
            c8.f12162s.setOnClickListener(new View.OnClickListener() { // from class: X4.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.z5(C1475d0.this, this, view);
                }
            });
            c8.f12155l.setOnClickListener(new View.OnClickListener() { // from class: X4.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.A5(L0.this, k8, view);
                }
            });
            c8.f12155l.setFocusable(true);
            c8.f12159p.setText(String.valueOf(k8.p()));
            if (C3655A.f36474a.i(k8.l())) {
                c8.f12147d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_heart_red));
            }
            c8.f12154k.setOnClickListener(new View.OnClickListener() { // from class: X4.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.B5(L0.this, c8, k8, view);
                }
            });
        } else {
            c8.f12157n.setVisibility(8);
            c8.f12155l.setVisibility(8);
            c8.f12154k.setVisibility(8);
        }
        c8.f12160q.setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3255y.h(root, "reviewBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w6(C1641h c1641h) {
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).X6(c1641h, new j0(c1641h, this));
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            new V4.i(requireContext, c1641h.i(), new k0(), LifecycleOwnerKt.getLifecycleScope(this));
            return;
        }
        if (getActivity() instanceof AppDetailActivity) {
            FragmentActivity activity2 = getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).q3(J3().f12093c.getRoot());
            FragmentActivity activity3 = getActivity();
            AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).r3(c1641h, new l0(c1641h, this));
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            new V4.i(requireContext2, c1641h.i(), new m0(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.f12883q = -1;
            FragmentActivity activity = this$0.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getActivity() != null) {
            String string = this$0.getString(com.uptodown.R.string.url_iap);
            AbstractC3255y.h(string, "getString(R.string.url_iap)");
            C3671k c3671k = new C3671k();
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C3671k.r(c3671k, requireActivity, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(L0 this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.g5(x8);
    }

    private final void x6(Rect rect) {
        if (getContext() != null) {
            C1641h c1641h = this.f12869c;
            AbstractC3255y.f(c1641h);
            if (!AbstractC3255y.d(c1641h.y0(), requireContext().getPackageName())) {
                if (J3().f12066D.getRoot().getLocalVisibleRect(rect) && !this.f12860D) {
                    J3().f12127z.startAnimation(AnimationUtils.loadAnimation(requireContext(), com.uptodown.R.anim.slide_out_bottom));
                    J3().f12127z.setVisibility(8);
                    this.f12860D = !this.f12860D;
                    return;
                }
                if (!J3().f12066D.getRoot().getLocalVisibleRect(rect) && this.f12860D) {
                    J3().f12127z.startAnimation(AnimationUtils.loadAnimation(requireContext(), com.uptodown.R.anim.slide_in_bottom));
                    J3().f12127z.setVisibility(0);
                    this.f12860D = !this.f12860D;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(L0 this$0, Context context, DialogInterface dialogInterface) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        this$0.R6(this$0.f12883q, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.D3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y5(L0 this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.g5(x8);
    }

    private final void y6(AlertDialog.Builder builder) {
        if (!UptodownApp.f29058B.N()) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            ((AbstractActivityC2683a) activity).N2(builder.create());
            if (getActivity() != null && !requireActivity().isFinishing()) {
                FragmentActivity activity2 = getActivity();
                AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                if (((AbstractActivityC2683a) activity2).r2() != null) {
                    FragmentActivity activity3 = getActivity();
                    AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog r22 = ((AbstractActivityC2683a) activity3).r2();
                    AbstractC3255y.f(r22);
                    Window window = r22.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    FragmentActivity activity4 = getActivity();
                    AbstractC3255y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog r23 = ((AbstractActivityC2683a) activity4).r2();
                    AbstractC3255y.f(r23);
                    r23.show();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r4.exists() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z3(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.L0.z3(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(L0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.E3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z5(C1475d0 reviewBinding, L0 this$0, View view) {
        AbstractC3255y.i(reviewBinding, "$reviewBinding");
        AbstractC3255y.i(this$0, "this$0");
        if (reviewBinding.f12157n.getMaxLines() == Integer.MAX_VALUE) {
            reviewBinding.f12157n.setMaxLines(4);
            reviewBinding.f12162s.setText(this$0.getString(com.uptodown.R.string.read_more_desc_app_detail));
        } else {
            reviewBinding.f12157n.setMaxLines(Integer.MAX_VALUE);
            reviewBinding.f12162s.setText(this$0.getString(com.uptodown.R.string.read_less_desc_app_detail));
        }
    }

    private final void z6() {
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        a5.Q e8 = bVar.e(requireContext);
        if (e8 == null || !e8.y()) {
            C1653u.a aVar = C1653u.f14337n;
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            final C1653u d8 = aVar.d(requireContext2);
            if (d8 != null) {
                Context requireContext3 = requireContext();
                AbstractC3255y.h(requireContext3, "requireContext()");
                if (d8.a(requireContext3)) {
                    String r8 = d8.r();
                    C1641h c1641h = this.f12869c;
                    AbstractC3255y.f(c1641h);
                    if (!j6.n.s(r8, c1641h.y0(), true)) {
                        C1468a c8 = C1468a.c(getLayoutInflater());
                        AbstractC3255y.h(c8, "inflate(layoutInflater)");
                        c8.f12046d.setTypeface(H4.j.f3824g.t());
                        com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                        Resources resources = getResources();
                        AbstractC3255y.h(resources, "resources");
                        h8.l(d8.A(resources)).j(c8.f12044b, new n0(c8));
                        c8.f12045c.setOnClickListener(new View.OnClickListener() { // from class: X4.H0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                L0.A6(L0.this, d8, view);
                            }
                        });
                        c8.f12044b.setOnClickListener(new View.OnClickListener() { // from class: X4.I0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                L0.B6(L0.this, d8, view);
                            }
                        });
                        return;
                    }
                }
            }
            C6();
        }
    }

    public final C1641h I3() {
        return this.f12869c;
    }

    public final void O5() {
        N3();
    }

    public final void O6(String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new r0(str, this, null), 2, null);
    }

    public final void Q6(String packagename) {
        AbstractC3255y.i(packagename, "packagename");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new s0(packagename, null), 2, null);
    }

    public final void T5(C1641h c1641h) {
        this.f12869c = c1641h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        this.f12871e = false;
        this.f12885s = false;
        this.f12892z = new C3678r(requireActivity());
        UptodownApp.a aVar = UptodownApp.f29058B;
        InterfaceC2865e n8 = aVar.n();
        if (n8 != null) {
            n8.pause();
        }
        InterfaceC2865e o8 = aVar.o();
        if (o8 != null) {
            o8.pause();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12887u = arguments.getLong("appId");
            if (arguments.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("appInfo", C1641h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = arguments.getParcelable("appInfo");
                }
                this.f12869c = (C1641h) parcelable;
            }
        }
        C1643j.a aVar2 = C1643j.f14251n;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        boolean b8 = aVar2.b(requireContext, this.f12887u);
        this.f12858B = b8;
        if (!b8) {
            C1653u.a aVar3 = C1653u.f14337n;
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            this.f12859C = aVar3.b(requireContext2, this.f12887u);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        if (getActivity() != null) {
            View V32 = V3(inflater, viewGroup);
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            Z3(requireActivity);
            return V32;
        }
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        try {
            MBBannerView mBBannerView = J3().f12125x;
            AbstractC3255y.h(mBBannerView, "binding.mbBannerView");
            mBBannerView.release();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f12860D = !this.f12860D;
        MBBannerView mBBannerView = J3().f12125x;
        AbstractC3255y.h(mBBannerView, "binding.mbBannerView");
        mBBannerView.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        L4();
        MBBannerView mBBannerView = J3().f12125x;
        AbstractC3255y.h(mBBannerView, "binding.mbBannerView");
        mBBannerView.onResume();
    }

    /* loaded from: classes5.dex */
    public static final class k0 implements Z4.r {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f13027a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1641h f13028b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, C1641h c1641h) {
                super(0);
                this.f13027a = l02;
                this.f13028b = c1641h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m71invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m71invoke() {
                this.f13027a.O6(this.f13028b.y0());
            }
        }

        k0() {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            FragmentActivity activity = L0.this.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).X6(appInfo, new a(L0.this, appInfo));
        }

        @Override // Z4.r
        public void c(int i8) {
        }
    }

    /* loaded from: classes5.dex */
    public static final class m0 implements Z4.r {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f13045a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1641h f13046b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, C1641h c1641h) {
                super(0);
                this.f13045a = l02;
                this.f13046b = c1641h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m75invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m75invoke() {
                this.f13045a.O6(this.f13046b.y0());
            }
        }

        m0() {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            FragmentActivity activity = L0.this.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity).r3(appInfo, new a(L0.this, appInfo));
        }

        @Override // Z4.r
        public void c(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v4(View view) {
    }
}
