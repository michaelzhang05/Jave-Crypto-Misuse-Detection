package com.uptodown.tv.ui.fragment;

import O5.I;
import O5.t;
import Z4.r;
import a5.C1641h;
import a5.C1645l;
import a5.C1647n;
import a5.C1648o;
import a5.F;
import a5.L;
import a5.O;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.DetailsSupportFragment;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnActionClickedListener;
import androidx.leanback.widget.SparseArrayObjectAdapter;
import androidx.lifecycle.LifecycleOwnerKt;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import com.uptodown.tv.ui.activity.TvOldVersionsActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import com.uptodown.workers.DownloadApkWorker;
import j5.C3195a;
import j5.C3196b;
import j5.C3197c;
import j6.n;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l2.InterfaceC3309b;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.J0;
import l6.M;
import o5.C3660F;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;

/* loaded from: classes5.dex */
public final class TvAppDetailFragment extends DetailsSupportFragment {

    /* renamed from: r, reason: collision with root package name */
    public static final a f30877r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1641h f30878a;

    /* renamed from: d, reason: collision with root package name */
    private ArrayObjectAdapter f30881d;

    /* renamed from: e, reason: collision with root package name */
    private BackgroundManager f30882e;

    /* renamed from: f, reason: collision with root package name */
    private AlertDialog f30883f;

    /* renamed from: g, reason: collision with root package name */
    private AlertDialog f30884g;

    /* renamed from: h, reason: collision with root package name */
    private DetailsOverviewRow f30885h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30886i;

    /* renamed from: j, reason: collision with root package name */
    private O f30887j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30888k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30889l;

    /* renamed from: m, reason: collision with root package name */
    private C3196b f30890m;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30893p;

    /* renamed from: q, reason: collision with root package name */
    private final ActivityResultLauncher f30894q;

    /* renamed from: b, reason: collision with root package name */
    private long f30879b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f30880c = -1;

    /* renamed from: n, reason: collision with root package name */
    private boolean f30891n = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30892o = true;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30895a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1641h f30897c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30898a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f30899b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f30900c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, T t8, S5.d dVar) {
                super(2, dVar);
                this.f30899b = tvAppDetailFragment;
                this.f30900c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30899b, this.f30900c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30898a == 0) {
                    t.b(obj);
                    this.f30899b.o0((C1648o) this.f30900c.f34162a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1641h c1641h, S5.d dVar) {
            super(2, dVar);
            this.f30897c = c1641h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f30897c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
        
            if (r5.exists() == false) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 474
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements r {

        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30902a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f30903b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, S5.d dVar) {
                super(2, dVar);
                this.f30903b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30903b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f30902a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f30903b;
                    this.f30902a = 1;
                    if (tvAppDetailFragment.c0(this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        c() {
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            TvAppDetailFragment.this.f30878a = appInfo;
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30904a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f30906a = new a();

            a() {
                super(2);
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(L ss1, L ss2) {
                AbstractC3255y.i(ss1, "ss1");
                AbstractC3255y.i(ss2, "ss2");
                return Integer.valueOf(ss1.b() - ss2.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30907a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f30908b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f30909a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TvAppDetailFragment f30910b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(TvAppDetailFragment tvAppDetailFragment, S5.d dVar) {
                    super(2, dVar);
                    this.f30910b = tvAppDetailFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new a(this.f30910b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f30909a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        TvAppDetailFragment tvAppDetailFragment = this.f30910b;
                        this.f30909a = 1;
                        if (tvAppDetailFragment.d0(this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(TvAppDetailFragment tvAppDetailFragment, S5.d dVar) {
                super(2, dVar);
                this.f30908b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f30908b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3390x0 d8;
                T5.b.e();
                if (this.f30907a == 0) {
                    t.b(obj);
                    if (this.f30908b.getContext() != null) {
                        C3196b c3196b = this.f30908b.f30890m;
                        AbstractC3255y.f(c3196b);
                        Context requireContext = this.f30908b.requireContext();
                        AbstractC3255y.h(requireContext, "requireContext()");
                        c3196b.b(requireContext, this.f30908b.f30878a);
                    }
                    this.f30908b.L0();
                    d8 = AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this.f30908b), null, null, new a(this.f30908b, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int m(InterfaceC1668n interfaceC1668n, Object obj, Object obj2) {
            return ((Number) interfaceC1668n.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00fb A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:11:0x001b, B:13:0x0023, B:15:0x003b, B:18:0x004f, B:21:0x00ec, B:23:0x00fb, B:25:0x0112, B:27:0x0118, B:31:0x012a, B:33:0x013c, B:35:0x0144, B:37:0x014f, B:39:0x0159, B:41:0x016e, B:43:0x0182, B:44:0x0172, B:47:0x0185, B:50:0x019c, B:52:0x01a2, B:54:0x01aa, B:55:0x0069, B:57:0x0080, B:59:0x0086, B:61:0x0093, B:63:0x00a5, B:65:0x00ad, B:67:0x00b3, B:70:0x00c9, B:72:0x00dd, B:74:0x00e0), top: B:10:0x001b }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 469
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30911a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30913a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f30914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, S5.d dVar) {
                super(2, dVar);
                this.f30914b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30914b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30913a == 0) {
                    t.b(obj);
                    try {
                        C3196b c3196b = this.f30914b.f30890m;
                        AbstractC3255y.f(c3196b);
                        c3196b.a(this.f30914b.getContext(), this.f30914b.f30878a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = T5.b.e();
            int i9 = this.f30911a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    if (TvAppDetailFragment.this.getContext() != null) {
                        Context requireContext = TvAppDetailFragment.this.requireContext();
                        AbstractC3255y.h(requireContext, "requireContext()");
                        C3660F c3660f = new C3660F(requireContext);
                        if (TvAppDetailFragment.this.f30878a != null) {
                            C1641h c1641h = TvAppDetailFragment.this.f30878a;
                            AbstractC3255y.f(c1641h);
                            if (c1641h.N0() == null) {
                                ArrayList arrayList = new ArrayList();
                                if (n.s(TvAppDetailFragment.this.getString(R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                                    i8 = 2;
                                } else {
                                    i8 = 4;
                                }
                                C1641h c1641h2 = TvAppDetailFragment.this.f30878a;
                                AbstractC3255y.f(c1641h2);
                                a5.I K02 = c3660f.K0(c1641h2.i(), i8, 0);
                                if (!K02.b() && K02.d() != null) {
                                    String d8 = K02.d();
                                    AbstractC3255y.f(d8);
                                    if (d8.length() > 0) {
                                        F.b bVar = F.f13964e;
                                        String d9 = K02.d();
                                        AbstractC3255y.f(d9);
                                        arrayList.addAll(bVar.a(d9));
                                    }
                                }
                                C1641h c1641h3 = TvAppDetailFragment.this.f30878a;
                                AbstractC3255y.f(c1641h3);
                                c1641h3.A1(arrayList);
                            }
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(TvAppDetailFragment.this, null);
                this.f30911a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements r {
        f() {
        }

        @Override // Z4.r
        public void c(int i8) {
            if (i8 == 404) {
                TvAppDetailFragment.this.f30893p = true;
            }
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            TvAppDetailFragment.this.f30878a = appInfo;
            TvAppDetailFragment.this.h0();
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30916a;

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30916a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppDetailFragment tvAppDetailFragment = TvAppDetailFragment.this;
                this.f30916a = 1;
                if (tvAppDetailFragment.s0(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30918a;

        h(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            T5.b.e();
            if (this.f30918a == 0) {
                t.b(obj);
                try {
                    C1641h c1641h = TvAppDetailFragment.this.f30878a;
                    if (c1641h != null) {
                        str = c1641h.e0();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        BackgroundManager backgroundManager = TvAppDetailFragment.this.f30882e;
                        if (backgroundManager == null) {
                            return null;
                        }
                        s h8 = s.h();
                        C1641h c1641h2 = TvAppDetailFragment.this.f30878a;
                        AbstractC3255y.f(c1641h2);
                        backgroundManager.setBitmap(h8.l(c1641h2.e0()).g());
                        return I.f8278a;
                    }
                    Drawable drawable = ContextCompat.getDrawable(TvAppDetailFragment.this.requireContext(), R.drawable.feature_tv);
                    BackgroundManager backgroundManager2 = TvAppDetailFragment.this.f30882e;
                    if (backgroundManager2 != null) {
                        backgroundManager2.setDrawable(drawable);
                    }
                    return I.f8278a;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return I.f8278a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30920a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DetailsOverviewRow f30922c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30923a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f30924b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, S5.d dVar) {
                super(2, dVar);
                this.f30924b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30924b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30923a == 0) {
                    t.b(obj);
                    this.f30924b.startEntranceTransition();
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(DetailsOverviewRow detailsOverviewRow, S5.d dVar) {
            super(2, dVar);
            this.f30922c = detailsOverviewRow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f30922c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = T5.b.e();
            int i8 = this.f30920a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    if (TvAppDetailFragment.this.getContext() != null) {
                        C1641h c1641h = TvAppDetailFragment.this.f30878a;
                        if (c1641h != null) {
                            str = c1641h.l0();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            DetailsOverviewRow detailsOverviewRow = this.f30922c;
                            Context context = TvAppDetailFragment.this.getContext();
                            s h8 = s.h();
                            C1641h c1641h2 = TvAppDetailFragment.this.f30878a;
                            AbstractC3255y.f(c1641h2);
                            detailsOverviewRow.setImageBitmap(context, h8.l(c1641h2.l0()).l(R.drawable.shape_bg_placeholder).g());
                        }
                    }
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(TvAppDetailFragment.this, null);
                this.f30920a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class j implements InterfaceC3309b {

        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30926a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f30927b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, S5.d dVar) {
                super(2, dVar);
                this.f30927b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30927b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f30926a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f30927b;
                    this.f30926a = 1;
                    if (tvAppDetailFragment.s0(this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        j() {
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception e8) {
            AbstractC3255y.i(e8, "e");
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class k implements InterfaceC3309b {

        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30929a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f30930b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, S5.d dVar) {
                super(2, dVar);
                this.f30930b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30930b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f30929a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f30930b;
                    DetailsOverviewRow detailsOverviewRow = tvAppDetailFragment.f30885h;
                    AbstractC3255y.f(detailsOverviewRow);
                    this.f30929a = 1;
                    if (tvAppDetailFragment.t0(detailsOverviewRow, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        k() {
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception e8) {
            AbstractC3255y.i(e8, "e");
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30931a;

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
            int i8 = this.f30931a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppDetailFragment tvAppDetailFragment = TvAppDetailFragment.this;
                C1641h c1641h = tvAppDetailFragment.f30878a;
                this.f30931a = 1;
                if (tvAppDetailFragment.N(c1641h, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public TvAppDetailFragment() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: l5.h
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TvAppDetailFragment.l0(TvAppDetailFragment.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…Program()\n        }\n    }");
        this.f30894q = registerForActivityResult;
    }

    private final void A0() {
        if (getActivity() != null) {
            if (this.f30880c != 2) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.option_button_install)));
                if (getActivity() != null && this.f30878a != null) {
                    String packageName = requireActivity().getPackageName();
                    C1641h c1641h = this.f30878a;
                    AbstractC3255y.f(c1641h);
                    if (!n.s(packageName, c1641h.y0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f30885h;
                AbstractC3255y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f30880c = 2;
            }
            C3196b c3196b = this.f30890m;
            AbstractC3255y.f(c3196b);
            c3196b.c(0);
        }
    }

    private final void B0() {
        if (getActivity() != null) {
            if (this.f30880c != 7) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.installing)));
                if (getActivity() != null && this.f30878a != null) {
                    String packageName = requireActivity().getPackageName();
                    C1641h c1641h = this.f30878a;
                    AbstractC3255y.f(c1641h);
                    if (!n.s(packageName, c1641h.y0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f30885h;
                AbstractC3255y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f30880c = 7;
            }
            C3196b c3196b = this.f30890m;
            AbstractC3255y.f(c3196b);
            c3196b.d(true);
        }
    }

    private final void C0() {
        if (getActivity() != null && this.f30880c != 11) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.app_detail_not_compatible)));
            DetailsOverviewRow detailsOverviewRow = this.f30885h;
            AbstractC3255y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f30880c = 11;
        }
    }

    private final void D0() {
        if (getActivity() != null && this.f30880c != 0) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
            if (getActivity() != null && this.f30878a != null) {
                String packageName = requireActivity().getPackageName();
                C1641h c1641h = this.f30878a;
                AbstractC3255y.f(c1641h);
                if (!n.s(packageName, c1641h.y0(), true)) {
                    sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.open)));
                    sparseArrayObjectAdapter.set(2, new Action(2L, getString(R.string.dialogo_app_selected_uninstall)));
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                }
            }
            sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
            sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
            DetailsOverviewRow detailsOverviewRow = this.f30885h;
            AbstractC3255y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f30880c = 0;
        }
    }

    private final void E0() {
        if (getActivity() != null) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.updates_button_resume)));
            if (getActivity() != null && this.f30878a != null) {
                String packageName = requireActivity().getPackageName();
                C1641h c1641h = this.f30878a;
                AbstractC3255y.f(c1641h);
                if (!n.s(packageName, c1641h.y0(), true)) {
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                }
            }
            sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
            sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
            DetailsOverviewRow detailsOverviewRow = this.f30885h;
            AbstractC3255y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f30880c = 4;
        }
    }

    private final void F0() {
        A0();
        this.f30880c = 6;
    }

    private final void G0() {
        E0();
        this.f30880c = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:9:0x0015, B:11:0x0020, B:12:0x003a, B:14:0x006c, B:15:0x0090, B:20:0x0035), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H0() {
        /*
            r8 = this;
            r0 = 5
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto Lbf
            a5.h r1 = r8.f30878a     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto Lbf
            androidx.leanback.widget.SparseArrayObjectAdapter r1 = new androidx.leanback.widget.SparseArrayObjectAdapter     // Catch: java.lang.Exception -> L31
            j5.a r2 = new j5.a     // Catch: java.lang.Exception -> L31
            r2.<init>()     // Catch: java.lang.Exception -> L31
            r1.<init>(r2)     // Catch: java.lang.Exception -> L31
            a5.h r2 = r8.f30878a     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3255y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            java.lang.String r2 = r2.W0()     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            if (r2 == 0) goto L38
            a5.h r2 = r8.f30878a     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3255y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            java.lang.String r2 = r2.W0()     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3255y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            goto L3a
        L31:
            r1 = move-exception
            goto Lbc
        L34:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Exception -> L31
        L38:
            r2 = 0
        L3a:
            androidx.leanback.widget.Action r4 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r5 = 2131953025(0x7f130581, float:1.954251E38)
            java.lang.String r5 = r8.getString(r5)     // Catch: java.lang.Exception -> L31
            Q4.g r6 = new Q4.g     // Catch: java.lang.Exception -> L31
            r6.<init>()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = r6.c(r2)     // Catch: java.lang.Exception -> L31
            r6 = 1
            r4.<init>(r6, r5, r2)     // Catch: java.lang.Exception -> L31
            r2 = 1
            r1.set(r2, r4)     // Catch: java.lang.Exception -> L31
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L31
            a5.h r4 = r8.f30878a     // Catch: java.lang.Exception -> L31
            kotlin.jvm.internal.AbstractC3255y.f(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = r4.y0()     // Catch: java.lang.Exception -> L31
            boolean r2 = j6.n.s(r3, r4, r2)     // Catch: java.lang.Exception -> L31
            if (r2 != 0) goto L90
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2131951922(0x7f130132, float:1.9540272E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 2
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r3 = 2
            r1.set(r3, r2)     // Catch: java.lang.Exception -> L31
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2131951921(0x7f130131, float:1.954027E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 3
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r3 = 3
            r1.set(r3, r2)     // Catch: java.lang.Exception -> L31
        L90:
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2131953077(0x7f1305b5, float:1.9542615E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 4
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r3 = 4
            r1.set(r3, r2)     // Catch: java.lang.Exception -> L31
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2131951681(0x7f130041, float:1.9539783E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 5
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r1.set(r0, r2)     // Catch: java.lang.Exception -> L31
            androidx.leanback.widget.DetailsOverviewRow r2 = r8.f30885h     // Catch: java.lang.Exception -> L31
            kotlin.jvm.internal.AbstractC3255y.f(r2)     // Catch: java.lang.Exception -> L31
            r2.setActionsAdapter(r1)     // Catch: java.lang.Exception -> L31
            goto Lbf
        Lbc:
            r1.printStackTrace()
        Lbf:
            r8.f30880c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.H0():void");
    }

    private final void I0(final FragmentActivity fragmentActivity) {
        this.f30890m = new C3196b();
        FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter = new FullWidthDetailsOverviewRowPresenter(this.f30890m, new C3197c());
        fullWidthDetailsOverviewRowPresenter.setBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.background_color));
        fullWidthDetailsOverviewRowPresenter.setInitialState(0);
        FullWidthDetailsOverviewSharedElementHelper fullWidthDetailsOverviewSharedElementHelper = new FullWidthDetailsOverviewSharedElementHelper();
        fullWidthDetailsOverviewSharedElementHelper.setSharedElementEnterTransition(fragmentActivity, "transition_name");
        fullWidthDetailsOverviewRowPresenter.setListener(fullWidthDetailsOverviewSharedElementHelper);
        fullWidthDetailsOverviewRowPresenter.setParticipatingEntranceTransition(false);
        prepareEntranceTransition();
        fullWidthDetailsOverviewRowPresenter.setOnActionClickedListener(new OnActionClickedListener() { // from class: l5.i
            @Override // androidx.leanback.widget.OnActionClickedListener
            public final void onActionClicked(Action action) {
                TvAppDetailFragment.J0(TvAppDetailFragment.this, fragmentActivity, action);
            }
        });
        fullWidthDetailsOverviewRowPresenter.setActionsBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.main_blue));
        ClassPresenterSelector classPresenterSelector = new ClassPresenterSelector();
        classPresenterSelector.addClassPresenter(DetailsOverviewRow.class, fullWidthDetailsOverviewRowPresenter);
        classPresenterSelector.addClassPresenter(ListRow.class, new ListRowPresenter());
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(classPresenterSelector);
        this.f30881d = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(TvAppDetailFragment this$0, FragmentActivity activity, Action action) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(activity, "$activity");
        AbstractC3255y.i(action, "action");
        if (action.getId() == 1) {
            this$0.L();
            return;
        }
        if (action.getId() == 2) {
            this$0.M0();
            return;
        }
        if (action.getId() == 3) {
            if (this$0.f30878a != null) {
                Intent intent = new Intent(activity, (Class<?>) TvOldVersionsActivity.class);
                intent.putExtra("appInfo", this$0.f30878a);
                this$0.startActivity(intent, UptodownApp.f29058B.a(activity));
                return;
            }
            return;
        }
        if (action.getId() == 4) {
            if (this$0.f30878a != null) {
                Intent intent2 = new Intent(activity, (Class<?>) VirusTotalReport.class);
                intent2.putExtra("appInfo", this$0.f30878a);
                this$0.startActivity(intent2, UptodownApp.f29058B.a(activity));
                return;
            }
            return;
        }
        if (action.getId() == 5) {
            this$0.n0();
        }
    }

    private final void K0() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
        DetailsOverviewRow detailsOverviewRow = new DetailsOverviewRow(this.f30878a);
        this.f30885h = detailsOverviewRow;
        AbstractC3255y.f(detailsOverviewRow);
        detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
        C1641h c1641h = this.f30878a;
        AbstractC3255y.f(c1641h);
        if (c1641h.e0() != null) {
            s h8 = s.h();
            C1641h c1641h2 = this.f30878a;
            AbstractC3255y.f(c1641h2);
            h8.l(c1641h2.e0()).e(new j());
        } else if (getContext() != null) {
            Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.feature_tv);
            BackgroundManager backgroundManager = this.f30882e;
            AbstractC3255y.f(backgroundManager);
            backgroundManager.setDrawable(drawable);
        }
        s h9 = s.h();
        C1641h c1641h3 = this.f30878a;
        AbstractC3255y.f(c1641h3);
        h9.l(c1641h3.l0()).e(new k());
        ArrayObjectAdapter arrayObjectAdapter = this.f30881d;
        AbstractC3255y.f(arrayObjectAdapter);
        arrayObjectAdapter.add(this.f30885h);
    }

    private final void L() {
        switch (this.f30880c) {
            case 0:
                m0();
                return;
            case 1:
                Z();
                return;
            case 2:
                Z();
                return;
            case 3:
                M();
                return;
            case 4:
                Z();
                return;
            case 5:
                Z();
                return;
            case 6:
                Z();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new l(null), 3, null);
    }

    private final void M() {
        String str;
        if (this.f30878a != null && getContext() != null) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
            C1641h c1641h = this.f30878a;
            AbstractC3255y.f(c1641h);
            aVar.a(c1641h.i());
            C3674n.a aVar2 = C3674n.f36505t;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            C3674n a8 = aVar2.a(requireContext);
            a8.a();
            C1641h c1641h2 = this.f30878a;
            AbstractC3255y.f(c1641h2);
            C1648o Z7 = a8.Z(String.valueOf(c1641h2.f0()));
            a8.A(Z7);
            if (Z7 != null) {
                str = Z7.X();
            } else {
                str = null;
            }
            if (str != null) {
                C3677q c3677q = new C3677q();
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                File f8 = c3677q.f(requireContext2);
                String X7 = Z7.X();
                AbstractC3255y.f(X7);
                new File(f8, X7).delete();
            }
            a8.l();
        }
    }

    private final void M0() {
        C1641h c1641h = this.f30878a;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.y0() != null) {
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                H4.i iVar = new H4.i(requireContext);
                C1641h c1641h2 = this.f30878a;
                AbstractC3255y.f(c1641h2);
                String y02 = c1641h2.y0();
                AbstractC3255y.f(y02);
                iVar.h(y02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(C1641h c1641h, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(c1641h, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void O(C1648o c1648o) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(getString(R.string.descarga_completada));
        builder.setTitle(c1648o.X());
        builder.setPositiveButton(R.string.option_button_install, new DialogInterface.OnClickListener() { // from class: l5.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.P(TvAppDetailFragment.this, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: l5.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.Q(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing()) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(com.uptodown.tv.ui.fragment.TvAppDetailFragment r11, android.content.DialogInterface r12, int r13) {
        /*
            java.lang.String r13 = "this$0"
            kotlin.jvm.internal.AbstractC3255y.i(r11, r13)
            java.lang.String r13 = "dialogInterface"
            kotlin.jvm.internal.AbstractC3255y.i(r12, r13)
            r12.dismiss()
            o5.n$a r12 = o5.C3674n.f36505t
            android.content.Context r13 = r11.requireContext()
            java.lang.String r0 = "requireContext()"
            kotlin.jvm.internal.AbstractC3255y.h(r13, r0)
            o5.n r12 = r12.a(r13)
            r12.a()
            a5.h r13 = r11.f30878a
            kotlin.jvm.internal.AbstractC3255y.f(r13)
            java.lang.String r13 = r13.y0()
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L75
            a5.h r13 = r11.f30878a
            kotlin.jvm.internal.AbstractC3255y.f(r13)
            java.lang.String r13 = r13.y0()
            kotlin.jvm.internal.AbstractC3255y.f(r13)
            a5.O r13 = r12.u0(r13)
            if (r13 == 0) goto L43
            java.lang.String r3 = r13.l()
            goto L44
        L43:
            r3 = r2
        L44:
            if (r3 == 0) goto L75
            o5.q r3 = new o5.q
            r3.<init>()
            android.content.Context r4 = r11.requireContext()
            kotlin.jvm.internal.AbstractC3255y.h(r4, r0)
            java.util.ArrayList r3 = r3.e(r4)
            java.util.Iterator r3 = r3.iterator()
        L5a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r3.next()
            java.io.File r4 = (java.io.File) r4
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = r13.l()
            boolean r5 = j6.n.s(r5, r6, r1)
            if (r5 == 0) goto L5a
            goto L76
        L75:
            r4 = r2
        L76:
            if (r4 != 0) goto Lc3
            a5.h r13 = r11.f30878a
            kotlin.jvm.internal.AbstractC3255y.f(r13)
            long r5 = r13.f0()
            java.lang.String r13 = java.lang.String.valueOf(r5)
            a5.o r13 = r12.Z(r13)
            if (r13 == 0) goto Lc3
            o5.q r3 = new o5.q
            r3.<init>()
            android.content.Context r4 = r11.requireContext()
            kotlin.jvm.internal.AbstractC3255y.h(r4, r0)
            java.util.ArrayList r0 = r3.d(r4)
            java.lang.String r3 = r13.X()
            if (r3 == 0) goto Lc1
            java.util.Iterator r0 = r0.iterator()
        La5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lc1
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = r13.X()
            boolean r4 = j6.n.s(r4, r5, r1)
            if (r4 == 0) goto La5
            r6 = r3
            goto Lc4
        Lc1:
            r6 = r2
            goto Lc4
        Lc3:
            r6 = r4
        Lc4:
            r12.l()
            if (r6 == 0) goto Lda
            com.uptodown.UptodownApp$a r5 = com.uptodown.UptodownApp.f29058B
            androidx.fragment.app.FragmentActivity r7 = r11.requireActivity()
            java.lang.String r11 = "requireActivity()"
            kotlin.jvm.internal.AbstractC3255y.h(r7, r11)
            r9 = 4
            r10 = 0
            r8 = 0
            com.uptodown.UptodownApp.a.Z(r5, r6, r7, r8, r9, r10)
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.P(com.uptodown.tv.ui.fragment.TvAppDetailFragment, android.content.DialogInterface, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void R(final C1648o c1648o, String str) {
        AlertDialog alertDialog = this.f30883f;
        if (alertDialog != null) {
            AbstractC3255y.f(alertDialog);
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: l5.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.S(TvAppDetailFragment.this, c1648o, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: l5.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.T(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.f30883f = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(TvAppDetailFragment this$0, C1648o download, DialogInterface dialog, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(download, "$download");
        AbstractC3255y.i(dialog, "dialog");
        this$0.a0(download);
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(DialogInterface dialog, int i8) {
        AbstractC3255y.i(dialog, "dialog");
        dialog.dismiss();
    }

    private final boolean U() {
        AlertDialog alertDialog = this.f30884g;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        if (aVar.W(requireContext)) {
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            if (!aVar.k0(requireContext2)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setMessage(getString(R.string.tracking_disabled_warning_gdpr));
                builder.setPositiveButton(R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: l5.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        TvAppDetailFragment.V(TvAppDetailFragment.this, dialogInterface, i8);
                    }
                });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: l5.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        TvAppDetailFragment.W(dialogInterface, i8);
                    }
                });
                builder.setCancelable(true);
                this.f30884g = builder.create();
                if (!requireActivity().isFinishing()) {
                    AlertDialog alertDialog2 = this.f30884g;
                    if (alertDialog2 != null) {
                        alertDialog2.show();
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(TvAppDetailFragment this$0, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        dialogInterface.dismiss();
        this$0.startActivity(new Intent(this$0.requireActivity(), (Class<?>) TvPrivacyPreferences.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void X(String str) {
        AlertDialog alertDialog = this.f30883f;
        if (alertDialog != null) {
            AbstractC3255y.f(alertDialog);
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: l5.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.Y(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.f30883f = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(DialogInterface dialog, int i8) {
        AbstractC3255y.i(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Z() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.Z():void");
    }

    private final void a0(C1648o c1648o) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C1641h c1641h = this.f30878a;
            AbstractC3255y.f(c1641h);
            c1648o.a(c1641h);
            int l02 = c1648o.l0(activity);
            if (l02 >= 0) {
                if (!DownloadApkWorker.f31034k.f(activity, l02)) {
                    Y y8 = Y.f34167a;
                    String string = getString(R.string.msg_added_to_downlads_queue);
                    AbstractC3255y.h(string, "getString(R.string.msg_added_to_downlads_queue)");
                    C1641h c1641h2 = this.f30878a;
                    AbstractC3255y.f(c1641h2);
                    String format = String.format(string, Arrays.copyOf(new Object[]{c1641h2.s0()}, 1));
                    AbstractC3255y.h(format, "format(...)");
                    X(format);
                    return;
                }
                return;
            }
            String string2 = getString(R.string.descarga_error);
            AbstractC3255y.h(string2, "getString(R.string.descarga_error)");
            X(string2);
            x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c0(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d0(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void e0() {
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        new V4.i(requireContext, this.f30879b, new f(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final boolean g0() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        return f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        if (this.f30878a != null && getActivity() != null && !j0() && !U()) {
            p0();
        }
    }

    private final boolean i0() {
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.p() != null) {
            C1645l p8 = aVar.p();
            AbstractC3255y.f(p8);
            String d8 = p8.d();
            C1641h c1641h = this.f30878a;
            AbstractC3255y.f(c1641h);
            if (n.s(d8, c1641h.y0(), true)) {
                return true;
            }
        }
        return false;
    }

    private final boolean j0() {
        DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
        C1641h c1641h = this.f30878a;
        AbstractC3255y.f(c1641h);
        return aVar.c(c1641h.i());
    }

    private final void k0(String str) {
        C3678r c3678r = new C3678r(requireActivity());
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        if (i0()) {
            bundle.putInt("deeplink", 1);
        } else {
            bundle.putInt("deeplink", 0);
        }
        c3678r.b("warning", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(TvAppDetailFragment this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.g0()) {
            this$0.e0();
        }
    }

    private final void m0() {
        C1641h c1641h = this.f30878a;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.y0() != null && getContext() != null) {
                PackageManager packageManager = requireContext().getPackageManager();
                C1641h c1641h2 = this.f30878a;
                AbstractC3255y.f(c1641h2);
                String y02 = c1641h2.y0();
                AbstractC3255y.f(y02);
                Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(y02);
                if (leanbackLaunchIntentForPackage == null) {
                    PackageManager packageManager2 = requireContext().getPackageManager();
                    C1641h c1641h3 = this.f30878a;
                    AbstractC3255y.f(c1641h3);
                    String y03 = c1641h3.y0();
                    AbstractC3255y.f(y03);
                    leanbackLaunchIntentForPackage = packageManager2.getLaunchIntentForPackage(y03);
                }
                if (leanbackLaunchIntentForPackage != null) {
                    startActivity(leanbackLaunchIntentForPackage);
                }
            }
        }
    }

    private final void n0() {
        Bundle bundle;
        if (this.f30878a != null) {
            Intent intent = new Intent(getContext(), (Class<?>) MoreInfo.class);
            intent.putExtra("appInfo", this.f30878a);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29058B.a(activity);
            } else {
                bundle = null;
            }
            startActivity(intent, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(C1648o c1648o) {
        String str;
        if (getContext() != null && this.f30878a != null) {
            if (this.f30886i) {
                if (this.f30887j == null) {
                    D0();
                    return;
                }
                if (c1648o == null) {
                    if (!this.f30888k) {
                        H0();
                        return;
                    } else {
                        F0();
                        return;
                    }
                }
                if (!this.f30888k) {
                    H0();
                    return;
                }
                if (!this.f30889l) {
                    if (j0()) {
                        y0(c1648o);
                        return;
                    } else {
                        G0();
                        return;
                    }
                }
                F0();
                return;
            }
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            if (!aVar.S(requireContext)) {
                u0();
                return;
            }
            if (this.f30893p) {
                z0();
                return;
            }
            C1641h c1641h = this.f30878a;
            AbstractC3255y.f(c1641h);
            if (c1641h.p1()) {
                v0();
                return;
            }
            C1641h c1641h2 = this.f30878a;
            AbstractC3255y.f(c1641h2);
            if (!c1641h2.k1()) {
                C0();
                return;
            }
            C1641h c1641h3 = this.f30878a;
            AbstractC3255y.f(c1641h3);
            if (c1641h3.m1()) {
                w0();
                return;
            }
            C1641h c1641h4 = this.f30878a;
            AbstractC3255y.f(c1641h4);
            if (c1641h4.y0() != null) {
                N4.a h8 = H4.j.f3824g.h();
                if (h8 != null) {
                    str = h8.b();
                } else {
                    str = null;
                }
                C1641h c1641h5 = this.f30878a;
                AbstractC3255y.f(c1641h5);
                if (n.s(str, c1641h5.y0(), true)) {
                    B0();
                    return;
                }
                if (this.f30887j != null) {
                    C3674n.a aVar2 = C3674n.f36505t;
                    Context requireContext2 = requireContext();
                    AbstractC3255y.h(requireContext2, "requireContext()");
                    C3674n a8 = aVar2.a(requireContext2);
                    a8.a();
                    O o8 = this.f30887j;
                    AbstractC3255y.f(o8);
                    a8.M(o8.s());
                    a8.l();
                }
                if (c1648o == null) {
                    x0();
                    return;
                }
                if (!this.f30888k) {
                    y0(c1648o);
                    return;
                }
                if (!this.f30889l) {
                    if (j0()) {
                        y0(c1648o);
                        return;
                    } else {
                        E0();
                        return;
                    }
                }
                A0();
            }
        }
    }

    private final void p0() {
        boolean z8;
        boolean z9;
        boolean z10;
        C1648o c1648o = new C1648o();
        C1641h c1641h = this.f30878a;
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
            a0(c1648o);
            return;
        }
        if (!z8) {
            k0("sdk");
            String string = getString(R.string.msg_warning_incompatible_sdk);
            AbstractC3255y.h(string, "getString(R.string.msg_warning_incompatible_sdk)");
            R(c1648o, string);
            return;
        }
        if (!z10) {
            k0("abi");
            String string2 = getString(R.string.msg_warning_incompatible_abi);
            AbstractC3255y.h(string2, "getString(R.string.msg_warning_incompatible_abi)");
            R(c1648o, string2);
            return;
        }
        k0("density");
        String string3 = getString(R.string.msg_warning_incompatible_density);
        AbstractC3255y.h(string3, "getString(R.string.msg_w…ing_incompatible_density)");
        R(c1648o, string3);
    }

    private final void q0() {
        if (!f0()) {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
        } else {
            e0();
        }
    }

    private final void r0() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                try {
                    this.f30894q.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + requireContext().getPackageName())));
                    return;
                } catch (ActivityNotFoundException unused) {
                    q0();
                    return;
                }
            }
            q0();
            return;
        }
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s0(S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new h(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t0(DetailsOverviewRow detailsOverviewRow, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new i(detailsOverviewRow, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void u0() {
        if (getActivity() != null && this.f30880c != 9) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.status_checking_device_compatibility)));
            DetailsOverviewRow detailsOverviewRow = this.f30885h;
            AbstractC3255y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f30880c = 9;
        }
    }

    private final void v0() {
        if (getActivity() != null && this.f30880c != 8) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.coming_soon_button)));
            DetailsOverviewRow detailsOverviewRow = this.f30885h;
            AbstractC3255y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f30880c = 8;
        }
    }

    private final void w0() {
        if (getActivity() != null && this.f30880c != 13) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.status_discontinued)));
            DetailsOverviewRow detailsOverviewRow = this.f30885h;
            AbstractC3255y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f30880c = 13;
        }
    }

    private final void x0() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter;
        long j8;
        C1641h c1641h;
        if (getActivity() != null) {
            if (this.f30880c != 1) {
                try {
                    sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
                    try {
                        c1641h = this.f30878a;
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                if (c1641h != null) {
                    AbstractC3255y.f(c1641h);
                    if (c1641h.W0() != null) {
                        C1641h c1641h2 = this.f30878a;
                        AbstractC3255y.f(c1641h2);
                        String W02 = c1641h2.W0();
                        AbstractC3255y.f(W02);
                        j8 = Long.parseLong(W02);
                        sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.updates_button_download_app), new Q4.g().c(j8)));
                        sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(R.string.dialogo_app_old_versions)));
                        sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(R.string.virustotal_safety_report_title)));
                        sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(R.string.app_detail_more_info_title)));
                        DetailsOverviewRow detailsOverviewRow = this.f30885h;
                        AbstractC3255y.f(detailsOverviewRow);
                        detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                        this.f30880c = 1;
                    }
                }
                j8 = 0;
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.updates_button_download_app), new Q4.g().c(j8)));
                sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(R.string.dialogo_app_old_versions)));
                sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow2 = this.f30885h;
                AbstractC3255y.f(detailsOverviewRow2);
                detailsOverviewRow2.setActionsAdapter(sparseArrayObjectAdapter);
                this.f30880c = 1;
            }
            C3196b c3196b = this.f30890m;
            AbstractC3255y.f(c3196b);
            c3196b.c(0);
        }
    }

    private final void y0(C1648o c1648o) {
        if (getActivity() != null) {
            if (this.f30880c != 3) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(android.R.string.cancel)));
                if (this.f30878a != null) {
                    String packageName = requireActivity().getPackageName();
                    C1641h c1641h = this.f30878a;
                    AbstractC3255y.f(c1641h);
                    if (!n.s(packageName, c1641h.y0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f30885h;
                AbstractC3255y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f30880c = 3;
            }
            C3196b c3196b = this.f30890m;
            AbstractC3255y.f(c3196b);
            c3196b.c(c1648o.Z());
        }
    }

    private final void z0() {
        if (getActivity() != null && this.f30880c != 10) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3195a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.app_detail_not_available)));
            DetailsOverviewRow detailsOverviewRow = this.f30885h;
            AbstractC3255y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f30880c = 10;
        }
    }

    public final void N0(int i8, String str) {
        C1641h c1641h = this.f30878a;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            if (c1641h.y0() != null) {
                C1641h c1641h2 = this.f30878a;
                AbstractC3255y.f(c1641h2);
                if (n.s(c1641h2.y0(), str, true)) {
                    if (i8 != 301 && i8 != 351) {
                        D0();
                        this.f30880c = 0;
                    } else {
                        B0();
                    }
                }
            }
        }
    }

    public final void O0(String str) {
        C1641h c1641h = this.f30878a;
        if (c1641h != null && str != null) {
            AbstractC3255y.f(c1641h);
            if (n.s(str, c1641h.y0(), true)) {
                L0();
            }
        }
    }

    public final void P0(int i8, C1648o c1648o) {
        if (this.f30878a != null && c1648o != null && c1648o.Y() != null) {
            String Y7 = c1648o.Y();
            C1641h c1641h = this.f30878a;
            AbstractC3255y.f(c1641h);
            if (n.s(Y7, c1641h.y0(), true)) {
                if (i8 != 200) {
                    if (i8 != 201) {
                        if (i8 == 202) {
                            O(c1648o);
                        }
                        L0();
                        return;
                    }
                    y0(c1648o);
                    return;
                }
                y0(c1648o);
            }
        }
    }

    public final void b0() {
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        new V4.i(requireContext, this.f30879b, new c(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final boolean f0() {
        if (Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        BackgroundManager backgroundManager;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Bundle extras = activity.getIntent().getExtras();
            if (extras != null) {
                if (extras.containsKey("appId")) {
                    this.f30879b = extras.getLong("appId");
                }
                if (extras.containsKey("appInfo")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = extras.getParcelable("appInfo", C1641h.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        parcelable = extras.getParcelable("appInfo");
                    }
                    C1641h c1641h = (C1641h) parcelable;
                    this.f30878a = c1641h;
                    if (c1641h != null) {
                        AbstractC3255y.f(c1641h);
                        this.f30879b = c1641h.i();
                    }
                }
            }
            BackgroundManager backgroundManager2 = BackgroundManager.getInstance(activity);
            this.f30882e = backgroundManager2;
            if (backgroundManager2 != null && !backgroundManager2.isAttached() && (backgroundManager = this.f30882e) != null) {
                backgroundManager.attach(activity.getWindow());
            }
            Drawable drawable = ContextCompat.getDrawable(activity, R.drawable.tv_default_background);
            BackgroundManager backgroundManager3 = this.f30882e;
            if (backgroundManager3 != null) {
                backgroundManager3.setDrawable(drawable);
            }
            I0(activity);
            K0();
            b0();
            U();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
        boolean z8;
        AbstractC3255y.i(permissions, "permissions");
        AbstractC3255y.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i8, permissions, grantResults);
        if (i8 == 831) {
            if (grantResults.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((!z8) && grantResults[0] == 0) {
                e0();
            }
        }
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f30892o) {
            L0();
        } else {
            this.f30892o = false;
        }
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!this.f30891n) {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
        }
        this.f30891n = false;
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        BackgroundManager backgroundManager = this.f30882e;
        AbstractC3255y.f(backgroundManager);
        backgroundManager.release();
        super.onStop();
    }
}
