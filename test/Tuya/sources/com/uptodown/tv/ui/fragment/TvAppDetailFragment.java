package com.uptodown.tv.ui.fragment;

import L5.I;
import L5.t;
import W4.r;
import X4.C1498h;
import X4.C1502l;
import X4.C1504n;
import X4.C1505o;
import X4.F;
import X4.L;
import X4.O;
import X5.n;
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
import g5.C2718a;
import g5.C2719b;
import g5.C2720c;
import i2.InterfaceC2774b;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.J0;
import i6.M;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l5.C3312F;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;

/* loaded from: classes5.dex */
public final class TvAppDetailFragment extends DetailsSupportFragment {

    /* renamed from: r, reason: collision with root package name */
    public static final a f29845r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1498h f29846a;

    /* renamed from: d, reason: collision with root package name */
    private ArrayObjectAdapter f29849d;

    /* renamed from: e, reason: collision with root package name */
    private BackgroundManager f29850e;

    /* renamed from: f, reason: collision with root package name */
    private AlertDialog f29851f;

    /* renamed from: g, reason: collision with root package name */
    private AlertDialog f29852g;

    /* renamed from: h, reason: collision with root package name */
    private DetailsOverviewRow f29853h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29854i;

    /* renamed from: j, reason: collision with root package name */
    private O f29855j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29856k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29857l;

    /* renamed from: m, reason: collision with root package name */
    private C2719b f29858m;

    /* renamed from: p, reason: collision with root package name */
    private boolean f29861p;

    /* renamed from: q, reason: collision with root package name */
    private final ActivityResultLauncher f29862q;

    /* renamed from: b, reason: collision with root package name */
    private long f29847b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f29848c = -1;

    /* renamed from: n, reason: collision with root package name */
    private boolean f29859n = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f29860o = true;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29863a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1498h f29865c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29866a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f29867b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f29868c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, T t8, P5.d dVar) {
                super(2, dVar);
                this.f29867b = tvAppDetailFragment;
                this.f29868c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29867b, this.f29868c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29866a == 0) {
                    t.b(obj);
                    this.f29867b.o0((C1505o) this.f29868c.f33761a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1498h c1498h, P5.d dVar) {
            super(2, dVar);
            this.f29865c = c1498h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29865c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
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
    }

    /* loaded from: classes5.dex */
    public static final class c implements r {

        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29870a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f29871b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, P5.d dVar) {
                super(2, dVar);
                this.f29871b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29871b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f29870a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f29871b;
                    this.f29870a = 1;
                    if (tvAppDetailFragment.c0(this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        c() {
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            TvAppDetailFragment.this.f29846a = appInfo;
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29872a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29874a = new a();

            a() {
                super(2);
            }

            @Override // X5.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(L ss1, L ss2) {
                AbstractC3159y.i(ss1, "ss1");
                AbstractC3159y.i(ss2, "ss2");
                return Integer.valueOf(ss1.c() - ss2.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29875a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f29876b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

                /* renamed from: a, reason: collision with root package name */
                int f29877a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TvAppDetailFragment f29878b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(TvAppDetailFragment tvAppDetailFragment, P5.d dVar) {
                    super(2, dVar);
                    this.f29878b = tvAppDetailFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new a(this.f29878b, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f29877a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        TvAppDetailFragment tvAppDetailFragment = this.f29878b;
                        this.f29877a = 1;
                        if (tvAppDetailFragment.d0(this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(TvAppDetailFragment tvAppDetailFragment, P5.d dVar) {
                super(2, dVar);
                this.f29876b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f29876b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2855x0 d8;
                Q5.b.e();
                if (this.f29875a == 0) {
                    t.b(obj);
                    if (this.f29876b.getContext() != null) {
                        C2719b c2719b = this.f29876b.f29858m;
                        AbstractC3159y.f(c2719b);
                        Context requireContext = this.f29876b.requireContext();
                        AbstractC3159y.h(requireContext, "requireContext()");
                        c2719b.b(requireContext, this.f29876b.f29846a);
                    }
                    this.f29876b.L0();
                    d8 = AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this.f29876b), null, null, new a(this.f29876b, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        d(P5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int h(n nVar, Object obj, Object obj2) {
            return ((Number) nVar.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29879a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29881a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f29882b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, P5.d dVar) {
                super(2, dVar);
                this.f29882b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29882b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29881a == 0) {
                    t.b(obj);
                    try {
                        C2719b c2719b = this.f29882b.f29858m;
                        AbstractC3159y.f(c2719b);
                        c2719b.a(this.f29882b.getContext(), this.f29882b.f29846a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = Q5.b.e();
            int i9 = this.f29879a;
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
                        AbstractC3159y.h(requireContext, "requireContext()");
                        C3312F c3312f = new C3312F(requireContext);
                        if (TvAppDetailFragment.this.f29846a != null) {
                            C1498h c1498h = TvAppDetailFragment.this.f29846a;
                            AbstractC3159y.f(c1498h);
                            if (c1498h.N0() == null) {
                                ArrayList arrayList = new ArrayList();
                                if (g6.n.s(TvAppDetailFragment.this.getString(R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                                    i8 = 2;
                                } else {
                                    i8 = 4;
                                }
                                C1498h c1498h2 = TvAppDetailFragment.this.f29846a;
                                AbstractC3159y.f(c1498h2);
                                X4.I K02 = c3312f.K0(c1498h2.i(), i8, 0);
                                if (!K02.b() && K02.d() != null) {
                                    String d8 = K02.d();
                                    AbstractC3159y.f(d8);
                                    if (d8.length() > 0) {
                                        F.b bVar = F.f12343e;
                                        String d9 = K02.d();
                                        AbstractC3159y.f(d9);
                                        arrayList.addAll(bVar.a(d9));
                                    }
                                }
                                C1498h c1498h3 = TvAppDetailFragment.this.f29846a;
                                AbstractC3159y.f(c1498h3);
                                c1498h3.A1(arrayList);
                            }
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(TvAppDetailFragment.this, null);
                this.f29879a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements r {
        f() {
        }

        @Override // W4.r
        public void c(int i8) {
            if (i8 == 404) {
                TvAppDetailFragment.this.f29861p = true;
            }
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            TvAppDetailFragment.this.f29846a = appInfo;
            TvAppDetailFragment.this.h0();
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29884a;

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29884a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppDetailFragment tvAppDetailFragment = TvAppDetailFragment.this;
                this.f29884a = 1;
                if (tvAppDetailFragment.s0(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29886a;

        h(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Q5.b.e();
            if (this.f29886a == 0) {
                t.b(obj);
                try {
                    C1498h c1498h = TvAppDetailFragment.this.f29846a;
                    if (c1498h != null) {
                        str = c1498h.e0();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        BackgroundManager backgroundManager = TvAppDetailFragment.this.f29850e;
                        if (backgroundManager == null) {
                            return null;
                        }
                        s h8 = s.h();
                        C1498h c1498h2 = TvAppDetailFragment.this.f29846a;
                        AbstractC3159y.f(c1498h2);
                        backgroundManager.setBitmap(h8.l(c1498h2.e0()).g());
                        return I.f6487a;
                    }
                    Drawable drawable = ContextCompat.getDrawable(TvAppDetailFragment.this.requireContext(), R.drawable.feature_tv);
                    BackgroundManager backgroundManager2 = TvAppDetailFragment.this.f29850e;
                    if (backgroundManager2 != null) {
                        backgroundManager2.setDrawable(drawable);
                    }
                    return I.f6487a;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return I.f6487a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29888a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DetailsOverviewRow f29890c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29891a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f29892b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, P5.d dVar) {
                super(2, dVar);
                this.f29892b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29892b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29891a == 0) {
                    t.b(obj);
                    this.f29892b.startEntranceTransition();
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(DetailsOverviewRow detailsOverviewRow, P5.d dVar) {
            super(2, dVar);
            this.f29890c = detailsOverviewRow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f29890c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = Q5.b.e();
            int i8 = this.f29888a;
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
                        C1498h c1498h = TvAppDetailFragment.this.f29846a;
                        if (c1498h != null) {
                            str = c1498h.l0();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            DetailsOverviewRow detailsOverviewRow = this.f29890c;
                            Context context = TvAppDetailFragment.this.getContext();
                            s h8 = s.h();
                            C1498h c1498h2 = TvAppDetailFragment.this.f29846a;
                            AbstractC3159y.f(c1498h2);
                            detailsOverviewRow.setImageBitmap(context, h8.l(c1498h2.l0()).l(R.drawable.shape_bg_placeholder).g());
                        }
                    }
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(TvAppDetailFragment.this, null);
                this.f29888a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class j implements InterfaceC2774b {

        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29894a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f29895b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, P5.d dVar) {
                super(2, dVar);
                this.f29895b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29895b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f29894a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f29895b;
                    this.f29894a = 1;
                    if (tvAppDetailFragment.s0(this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        j() {
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception e8) {
            AbstractC3159y.i(e8, "e");
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class k implements InterfaceC2774b {

        /* loaded from: classes5.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29897a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f29898b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, P5.d dVar) {
                super(2, dVar);
                this.f29898b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29898b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f29897a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f29898b;
                    DetailsOverviewRow detailsOverviewRow = tvAppDetailFragment.f29853h;
                    AbstractC3159y.f(detailsOverviewRow);
                    this.f29897a = 1;
                    if (tvAppDetailFragment.t0(detailsOverviewRow, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        k() {
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception e8) {
            AbstractC3159y.i(e8, "e");
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29899a;

        l(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29899a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppDetailFragment tvAppDetailFragment = TvAppDetailFragment.this;
                C1498h c1498h = tvAppDetailFragment.f29846a;
                this.f29899a = 1;
                if (tvAppDetailFragment.N(c1498h, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public TvAppDetailFragment() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: i5.h
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TvAppDetailFragment.l0(TvAppDetailFragment.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…Program()\n        }\n    }");
        this.f29862q = registerForActivityResult;
    }

    private final void A0() {
        if (getActivity() != null) {
            if (this.f29848c != 2) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.option_button_install)));
                if (getActivity() != null && this.f29846a != null) {
                    String packageName = requireActivity().getPackageName();
                    C1498h c1498h = this.f29846a;
                    AbstractC3159y.f(c1498h);
                    if (!g6.n.s(packageName, c1498h.y0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f29853h;
                AbstractC3159y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f29848c = 2;
            }
            C2719b c2719b = this.f29858m;
            AbstractC3159y.f(c2719b);
            c2719b.c(0);
        }
    }

    private final void B0() {
        if (getActivity() != null) {
            if (this.f29848c != 7) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.installing)));
                if (getActivity() != null && this.f29846a != null) {
                    String packageName = requireActivity().getPackageName();
                    C1498h c1498h = this.f29846a;
                    AbstractC3159y.f(c1498h);
                    if (!g6.n.s(packageName, c1498h.y0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f29853h;
                AbstractC3159y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f29848c = 7;
            }
            C2719b c2719b = this.f29858m;
            AbstractC3159y.f(c2719b);
            c2719b.d(true);
        }
    }

    private final void C0() {
        if (getActivity() != null && this.f29848c != 11) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.app_detail_not_compatible)));
            DetailsOverviewRow detailsOverviewRow = this.f29853h;
            AbstractC3159y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f29848c = 11;
        }
    }

    private final void D0() {
        if (getActivity() != null && this.f29848c != 0) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
            if (getActivity() != null && this.f29846a != null) {
                String packageName = requireActivity().getPackageName();
                C1498h c1498h = this.f29846a;
                AbstractC3159y.f(c1498h);
                if (!g6.n.s(packageName, c1498h.y0(), true)) {
                    sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.open)));
                    sparseArrayObjectAdapter.set(2, new Action(2L, getString(R.string.dialogo_app_selected_uninstall)));
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                }
            }
            sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
            sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
            DetailsOverviewRow detailsOverviewRow = this.f29853h;
            AbstractC3159y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f29848c = 0;
        }
    }

    private final void E0() {
        if (getActivity() != null) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.updates_button_resume)));
            if (getActivity() != null && this.f29846a != null) {
                String packageName = requireActivity().getPackageName();
                C1498h c1498h = this.f29846a;
                AbstractC3159y.f(c1498h);
                if (!g6.n.s(packageName, c1498h.y0(), true)) {
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                }
            }
            sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
            sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
            DetailsOverviewRow detailsOverviewRow = this.f29853h;
            AbstractC3159y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f29848c = 4;
        }
    }

    private final void F0() {
        A0();
        this.f29848c = 6;
    }

    private final void G0() {
        E0();
        this.f29848c = 4;
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
            X4.h r1 = r8.f29846a     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto Lbf
            androidx.leanback.widget.SparseArrayObjectAdapter r1 = new androidx.leanback.widget.SparseArrayObjectAdapter     // Catch: java.lang.Exception -> L31
            g5.a r2 = new g5.a     // Catch: java.lang.Exception -> L31
            r2.<init>()     // Catch: java.lang.Exception -> L31
            r1.<init>(r2)     // Catch: java.lang.Exception -> L31
            X4.h r2 = r8.f29846a     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3159y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            java.lang.String r2 = r2.W0()     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            if (r2 == 0) goto L38
            X4.h r2 = r8.f29846a     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3159y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            java.lang.String r2 = r2.W0()     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3159y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
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
            N4.g r6 = new N4.g     // Catch: java.lang.Exception -> L31
            r6.<init>()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = r6.c(r2)     // Catch: java.lang.Exception -> L31
            r6 = 1
            r4.<init>(r6, r5, r2)     // Catch: java.lang.Exception -> L31
            r2 = 1
            r1.set(r2, r4)     // Catch: java.lang.Exception -> L31
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L31
            X4.h r4 = r8.f29846a     // Catch: java.lang.Exception -> L31
            kotlin.jvm.internal.AbstractC3159y.f(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = r4.y0()     // Catch: java.lang.Exception -> L31
            boolean r2 = g6.n.s(r3, r4, r2)     // Catch: java.lang.Exception -> L31
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
            androidx.leanback.widget.DetailsOverviewRow r2 = r8.f29853h     // Catch: java.lang.Exception -> L31
            kotlin.jvm.internal.AbstractC3159y.f(r2)     // Catch: java.lang.Exception -> L31
            r2.setActionsAdapter(r1)     // Catch: java.lang.Exception -> L31
            goto Lbf
        Lbc:
            r1.printStackTrace()
        Lbf:
            r8.f29848c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.H0():void");
    }

    private final void I0(final FragmentActivity fragmentActivity) {
        this.f29858m = new C2719b();
        FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter = new FullWidthDetailsOverviewRowPresenter(this.f29858m, new C2720c());
        fullWidthDetailsOverviewRowPresenter.setBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.background_color));
        fullWidthDetailsOverviewRowPresenter.setInitialState(0);
        FullWidthDetailsOverviewSharedElementHelper fullWidthDetailsOverviewSharedElementHelper = new FullWidthDetailsOverviewSharedElementHelper();
        fullWidthDetailsOverviewSharedElementHelper.setSharedElementEnterTransition(fragmentActivity, "transition_name");
        fullWidthDetailsOverviewRowPresenter.setListener(fullWidthDetailsOverviewSharedElementHelper);
        fullWidthDetailsOverviewRowPresenter.setParticipatingEntranceTransition(false);
        prepareEntranceTransition();
        fullWidthDetailsOverviewRowPresenter.setOnActionClickedListener(new OnActionClickedListener() { // from class: i5.i
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
        this.f29849d = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(TvAppDetailFragment this$0, FragmentActivity activity, Action action) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(activity, "$activity");
        AbstractC3159y.i(action, "action");
        if (action.getId() == 1) {
            this$0.L();
            return;
        }
        if (action.getId() == 2) {
            this$0.M0();
            return;
        }
        if (action.getId() == 3) {
            if (this$0.f29846a != null) {
                Intent intent = new Intent(activity, (Class<?>) TvOldVersionsActivity.class);
                intent.putExtra("appInfo", this$0.f29846a);
                this$0.startActivity(intent, UptodownApp.f28003B.a(activity));
                return;
            }
            return;
        }
        if (action.getId() == 4) {
            if (this$0.f29846a != null) {
                Intent intent2 = new Intent(activity, (Class<?>) VirusTotalReport.class);
                intent2.putExtra("appInfo", this$0.f29846a);
                this$0.startActivity(intent2, UptodownApp.f28003B.a(activity));
                return;
            }
            return;
        }
        if (action.getId() == 5) {
            this$0.n0();
        }
    }

    private final void K0() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
        DetailsOverviewRow detailsOverviewRow = new DetailsOverviewRow(this.f29846a);
        this.f29853h = detailsOverviewRow;
        AbstractC3159y.f(detailsOverviewRow);
        detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
        C1498h c1498h = this.f29846a;
        AbstractC3159y.f(c1498h);
        if (c1498h.e0() != null) {
            s h8 = s.h();
            C1498h c1498h2 = this.f29846a;
            AbstractC3159y.f(c1498h2);
            h8.l(c1498h2.e0()).e(new j());
        } else if (getContext() != null) {
            Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.feature_tv);
            BackgroundManager backgroundManager = this.f29850e;
            AbstractC3159y.f(backgroundManager);
            backgroundManager.setDrawable(drawable);
        }
        s h9 = s.h();
        C1498h c1498h3 = this.f29846a;
        AbstractC3159y.f(c1498h3);
        h9.l(c1498h3.l0()).e(new k());
        ArrayObjectAdapter arrayObjectAdapter = this.f29849d;
        AbstractC3159y.f(arrayObjectAdapter);
        arrayObjectAdapter.add(this.f29853h);
    }

    private final void L() {
        switch (this.f29848c) {
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
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new l(null), 3, null);
    }

    private final void M() {
        String str;
        if (this.f29846a != null && getContext() != null) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f30002k;
            C1498h c1498h = this.f29846a;
            AbstractC3159y.f(c1498h);
            aVar.a(c1498h.i());
            C3326n.a aVar2 = C3326n.f34504t;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            C3326n a8 = aVar2.a(requireContext);
            a8.a();
            C1498h c1498h2 = this.f29846a;
            AbstractC3159y.f(c1498h2);
            C1505o Z7 = a8.Z(String.valueOf(c1498h2.f0()));
            a8.x(Z7);
            if (Z7 != null) {
                str = Z7.X();
            } else {
                str = null;
            }
            if (str != null) {
                C3329q c3329q = new C3329q();
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                File f8 = c3329q.f(requireContext2);
                String X7 = Z7.X();
                AbstractC3159y.f(X7);
                new File(f8, X7).delete();
            }
            a8.g();
        }
    }

    private final void M0() {
        C1498h c1498h = this.f29846a;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.y0() != null) {
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                E4.i iVar = new E4.i(requireContext);
                C1498h c1498h2 = this.f29846a;
                AbstractC3159y.f(c1498h2);
                String y02 = c1498h2.y0();
                AbstractC3159y.f(y02);
                iVar.h(y02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(C1498h c1498h, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(c1498h, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void O(C1505o c1505o) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(getString(R.string.descarga_completada));
        builder.setTitle(c1505o.X());
        builder.setPositiveButton(R.string.option_button_install, new DialogInterface.OnClickListener() { // from class: i5.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.P(TvAppDetailFragment.this, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: i5.k
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
            kotlin.jvm.internal.AbstractC3159y.i(r11, r13)
            java.lang.String r13 = "dialogInterface"
            kotlin.jvm.internal.AbstractC3159y.i(r12, r13)
            r12.dismiss()
            l5.n$a r12 = l5.C3326n.f34504t
            android.content.Context r13 = r11.requireContext()
            java.lang.String r0 = "requireContext()"
            kotlin.jvm.internal.AbstractC3159y.h(r13, r0)
            l5.n r12 = r12.a(r13)
            r12.a()
            X4.h r13 = r11.f29846a
            kotlin.jvm.internal.AbstractC3159y.f(r13)
            java.lang.String r13 = r13.y0()
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L75
            X4.h r13 = r11.f29846a
            kotlin.jvm.internal.AbstractC3159y.f(r13)
            java.lang.String r13 = r13.y0()
            kotlin.jvm.internal.AbstractC3159y.f(r13)
            X4.O r13 = r12.u0(r13)
            if (r13 == 0) goto L43
            java.lang.String r3 = r13.j()
            goto L44
        L43:
            r3 = r2
        L44:
            if (r3 == 0) goto L75
            l5.q r3 = new l5.q
            r3.<init>()
            android.content.Context r4 = r11.requireContext()
            kotlin.jvm.internal.AbstractC3159y.h(r4, r0)
            java.util.ArrayList r3 = r3.e(r4)
            java.util.Iterator r3 = r3.iterator()
        L5a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r3.next()
            java.io.File r4 = (java.io.File) r4
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = r13.j()
            boolean r5 = g6.n.s(r5, r6, r1)
            if (r5 == 0) goto L5a
            goto L76
        L75:
            r4 = r2
        L76:
            if (r4 != 0) goto Lc3
            X4.h r13 = r11.f29846a
            kotlin.jvm.internal.AbstractC3159y.f(r13)
            long r5 = r13.f0()
            java.lang.String r13 = java.lang.String.valueOf(r5)
            X4.o r13 = r12.Z(r13)
            if (r13 == 0) goto Lc3
            l5.q r3 = new l5.q
            r3.<init>()
            android.content.Context r4 = r11.requireContext()
            kotlin.jvm.internal.AbstractC3159y.h(r4, r0)
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
            boolean r4 = g6.n.s(r4, r5, r1)
            if (r4 == 0) goto La5
            r6 = r3
            goto Lc4
        Lc1:
            r6 = r2
            goto Lc4
        Lc3:
            r6 = r4
        Lc4:
            r12.g()
            if (r6 == 0) goto Lda
            com.uptodown.UptodownApp$a r5 = com.uptodown.UptodownApp.f28003B
            androidx.fragment.app.FragmentActivity r7 = r11.requireActivity()
            java.lang.String r11 = "requireActivity()"
            kotlin.jvm.internal.AbstractC3159y.h(r7, r11)
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
        AbstractC3159y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void R(final C1505o c1505o, String str) {
        AlertDialog alertDialog = this.f29851f;
        if (alertDialog != null) {
            AbstractC3159y.f(alertDialog);
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: i5.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.S(TvAppDetailFragment.this, c1505o, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: i5.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.T(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.f29851f = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(TvAppDetailFragment this$0, C1505o download, DialogInterface dialog, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(download, "$download");
        AbstractC3159y.i(dialog, "dialog");
        this$0.a0(download);
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(DialogInterface dialog, int i8) {
        AbstractC3159y.i(dialog, "dialog");
        dialog.dismiss();
    }

    private final boolean U() {
        AlertDialog alertDialog = this.f29852g;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        if (aVar.W(requireContext)) {
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            if (!aVar.k0(requireContext2)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setMessage(getString(R.string.tracking_disabled_warning_gdpr));
                builder.setPositiveButton(R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: i5.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        TvAppDetailFragment.V(TvAppDetailFragment.this, dialogInterface, i8);
                    }
                });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: i5.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        TvAppDetailFragment.W(dialogInterface, i8);
                    }
                });
                builder.setCancelable(true);
                this.f29852g = builder.create();
                if (!requireActivity().isFinishing()) {
                    AlertDialog alertDialog2 = this.f29852g;
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
        AbstractC3159y.i(this$0, "this$0");
        dialogInterface.dismiss();
        this$0.startActivity(new Intent(this$0.requireActivity(), (Class<?>) TvPrivacyPreferences.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void X(String str) {
        AlertDialog alertDialog = this.f29851f;
        if (alertDialog != null) {
            AbstractC3159y.f(alertDialog);
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: i5.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.Y(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.f29851f = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(DialogInterface dialog, int i8) {
        AbstractC3159y.i(dialog, "dialog");
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

    private final void a0(C1505o c1505o) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C1498h c1498h = this.f29846a;
            AbstractC3159y.f(c1498h);
            c1505o.b(c1498h);
            int l02 = c1505o.l0(activity);
            if (l02 >= 0) {
                if (!DownloadApkWorker.f30002k.f(activity, l02)) {
                    Y y8 = Y.f33766a;
                    String string = getString(R.string.msg_added_to_downlads_queue);
                    AbstractC3159y.h(string, "getString(R.string.msg_added_to_downlads_queue)");
                    C1498h c1498h2 = this.f29846a;
                    AbstractC3159y.f(c1498h2);
                    String format = String.format(string, Arrays.copyOf(new Object[]{c1498h2.s0()}, 1));
                    AbstractC3159y.h(format, "format(...)");
                    X(format);
                    return;
                }
                return;
            }
            String string2 = getString(R.string.descarga_error);
            AbstractC3159y.h(string2, "getString(R.string.descarga_error)");
            X(string2);
            x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c0(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d0(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void e0() {
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        new S4.i(requireContext, this.f29847b, new f(), LifecycleOwnerKt.getLifecycleScope(this));
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
        if (this.f29846a != null && getActivity() != null && !j0() && !U()) {
            p0();
        }
    }

    private final boolean i0() {
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (aVar.p() != null) {
            C1502l p8 = aVar.p();
            AbstractC3159y.f(p8);
            String d8 = p8.d();
            C1498h c1498h = this.f29846a;
            AbstractC3159y.f(c1498h);
            if (g6.n.s(d8, c1498h.y0(), true)) {
                return true;
            }
        }
        return false;
    }

    private final boolean j0() {
        DownloadApkWorker.a aVar = DownloadApkWorker.f30002k;
        C1498h c1498h = this.f29846a;
        AbstractC3159y.f(c1498h);
        return aVar.c(c1498h.i());
    }

    private final void k0(String str) {
        C3330r c3330r = new C3330r(requireActivity());
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        if (i0()) {
            bundle.putInt("deeplink", 1);
        } else {
            bundle.putInt("deeplink", 0);
        }
        c3330r.b("warning", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(TvAppDetailFragment this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.g0()) {
            this$0.e0();
        }
    }

    private final void m0() {
        C1498h c1498h = this.f29846a;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.y0() != null && getContext() != null) {
                PackageManager packageManager = requireContext().getPackageManager();
                C1498h c1498h2 = this.f29846a;
                AbstractC3159y.f(c1498h2);
                String y02 = c1498h2.y0();
                AbstractC3159y.f(y02);
                Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(y02);
                if (leanbackLaunchIntentForPackage == null) {
                    PackageManager packageManager2 = requireContext().getPackageManager();
                    C1498h c1498h3 = this.f29846a;
                    AbstractC3159y.f(c1498h3);
                    String y03 = c1498h3.y0();
                    AbstractC3159y.f(y03);
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
        if (this.f29846a != null) {
            Intent intent = new Intent(getContext(), (Class<?>) MoreInfo.class);
            intent.putExtra("appInfo", this.f29846a);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                bundle = UptodownApp.f28003B.a(activity);
            } else {
                bundle = null;
            }
            startActivity(intent, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(C1505o c1505o) {
        String str;
        if (getContext() != null && this.f29846a != null) {
            if (this.f29854i) {
                if (this.f29855j == null) {
                    D0();
                    return;
                }
                if (c1505o == null) {
                    if (!this.f29856k) {
                        H0();
                        return;
                    } else {
                        F0();
                        return;
                    }
                }
                if (!this.f29856k) {
                    H0();
                    return;
                }
                if (!this.f29857l) {
                    if (j0()) {
                        y0(c1505o);
                        return;
                    } else {
                        G0();
                        return;
                    }
                }
                F0();
                return;
            }
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (!aVar.S(requireContext)) {
                u0();
                return;
            }
            if (this.f29861p) {
                z0();
                return;
            }
            C1498h c1498h = this.f29846a;
            AbstractC3159y.f(c1498h);
            if (c1498h.p1()) {
                v0();
                return;
            }
            C1498h c1498h2 = this.f29846a;
            AbstractC3159y.f(c1498h2);
            if (!c1498h2.k1()) {
                C0();
                return;
            }
            C1498h c1498h3 = this.f29846a;
            AbstractC3159y.f(c1498h3);
            if (c1498h3.m1()) {
                w0();
                return;
            }
            C1498h c1498h4 = this.f29846a;
            AbstractC3159y.f(c1498h4);
            if (c1498h4.y0() != null) {
                K4.a h8 = E4.j.f2274g.h();
                if (h8 != null) {
                    str = h8.b();
                } else {
                    str = null;
                }
                C1498h c1498h5 = this.f29846a;
                AbstractC3159y.f(c1498h5);
                if (g6.n.s(str, c1498h5.y0(), true)) {
                    B0();
                    return;
                }
                if (this.f29855j != null) {
                    C3326n.a aVar2 = C3326n.f34504t;
                    Context requireContext2 = requireContext();
                    AbstractC3159y.h(requireContext2, "requireContext()");
                    C3326n a8 = aVar2.a(requireContext2);
                    a8.a();
                    O o8 = this.f29855j;
                    AbstractC3159y.f(o8);
                    a8.M(o8.n());
                    a8.g();
                }
                if (c1505o == null) {
                    x0();
                    return;
                }
                if (!this.f29856k) {
                    y0(c1505o);
                    return;
                }
                if (!this.f29857l) {
                    if (j0()) {
                        y0(c1505o);
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
        C1505o c1505o = new C1505o();
        C1498h c1498h = this.f29846a;
        AbstractC3159y.f(c1498h);
        c1505o.k0(c1498h);
        C1504n c1504n = new C1504n();
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        c1504n.i(requireContext);
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        Context requireContext2 = requireContext();
        AbstractC3159y.h(requireContext2, "requireContext()");
        if (aVar.o1(requireContext2)) {
            z8 = c1504n.g(c1505o);
            z10 = c1504n.e(c1505o);
            z9 = c1504n.f(c1505o);
        } else {
            z8 = true;
            z9 = true;
            z10 = true;
        }
        if (z8 && z10 && z9) {
            a0(c1505o);
            return;
        }
        if (!z8) {
            k0("sdk");
            String string = getString(R.string.msg_warning_incompatible_sdk);
            AbstractC3159y.h(string, "getString(R.string.msg_warning_incompatible_sdk)");
            R(c1505o, string);
            return;
        }
        if (!z10) {
            k0("abi");
            String string2 = getString(R.string.msg_warning_incompatible_abi);
            AbstractC3159y.h(string2, "getString(R.string.msg_warning_incompatible_abi)");
            R(c1505o, string2);
            return;
        }
        k0("density");
        String string3 = getString(R.string.msg_warning_incompatible_density);
        AbstractC3159y.h(string3, "getString(R.string.msg_w…ing_incompatible_density)");
        R(c1505o, string3);
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
                    this.f29862q.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + requireContext().getPackageName())));
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
    public final Object s0(P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new h(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t0(DetailsOverviewRow detailsOverviewRow, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new i(detailsOverviewRow, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void u0() {
        if (getActivity() != null && this.f29848c != 9) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.status_checking_device_compatibility)));
            DetailsOverviewRow detailsOverviewRow = this.f29853h;
            AbstractC3159y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f29848c = 9;
        }
    }

    private final void v0() {
        if (getActivity() != null && this.f29848c != 8) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.coming_soon_button)));
            DetailsOverviewRow detailsOverviewRow = this.f29853h;
            AbstractC3159y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f29848c = 8;
        }
    }

    private final void w0() {
        if (getActivity() != null && this.f29848c != 13) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.status_discontinued)));
            DetailsOverviewRow detailsOverviewRow = this.f29853h;
            AbstractC3159y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f29848c = 13;
        }
    }

    private final void x0() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter;
        long j8;
        C1498h c1498h;
        if (getActivity() != null) {
            if (this.f29848c != 1) {
                try {
                    sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
                    try {
                        c1498h = this.f29846a;
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                if (c1498h != null) {
                    AbstractC3159y.f(c1498h);
                    if (c1498h.W0() != null) {
                        C1498h c1498h2 = this.f29846a;
                        AbstractC3159y.f(c1498h2);
                        String W02 = c1498h2.W0();
                        AbstractC3159y.f(W02);
                        j8 = Long.parseLong(W02);
                        sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.updates_button_download_app), new N4.g().c(j8)));
                        sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(R.string.dialogo_app_old_versions)));
                        sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(R.string.virustotal_safety_report_title)));
                        sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(R.string.app_detail_more_info_title)));
                        DetailsOverviewRow detailsOverviewRow = this.f29853h;
                        AbstractC3159y.f(detailsOverviewRow);
                        detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                        this.f29848c = 1;
                    }
                }
                j8 = 0;
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.updates_button_download_app), new N4.g().c(j8)));
                sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(R.string.dialogo_app_old_versions)));
                sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow2 = this.f29853h;
                AbstractC3159y.f(detailsOverviewRow2);
                detailsOverviewRow2.setActionsAdapter(sparseArrayObjectAdapter);
                this.f29848c = 1;
            }
            C2719b c2719b = this.f29858m;
            AbstractC3159y.f(c2719b);
            c2719b.c(0);
        }
    }

    private final void y0(C1505o c1505o) {
        if (getActivity() != null) {
            if (this.f29848c != 3) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(android.R.string.cancel)));
                if (this.f29846a != null) {
                    String packageName = requireActivity().getPackageName();
                    C1498h c1498h = this.f29846a;
                    AbstractC3159y.f(c1498h);
                    if (!g6.n.s(packageName, c1498h.y0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f29853h;
                AbstractC3159y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f29848c = 3;
            }
            C2719b c2719b = this.f29858m;
            AbstractC3159y.f(c2719b);
            c2719b.c(c1505o.Z());
        }
    }

    private final void z0() {
        if (getActivity() != null && this.f29848c != 10) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C2718a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.app_detail_not_available)));
            DetailsOverviewRow detailsOverviewRow = this.f29853h;
            AbstractC3159y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f29848c = 10;
        }
    }

    public final void N0(int i8, String str) {
        C1498h c1498h = this.f29846a;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.y0() != null) {
                C1498h c1498h2 = this.f29846a;
                AbstractC3159y.f(c1498h2);
                if (g6.n.s(c1498h2.y0(), str, true)) {
                    if (i8 != 301 && i8 != 351) {
                        D0();
                        this.f29848c = 0;
                    } else {
                        B0();
                    }
                }
            }
        }
    }

    public final void O0(String str) {
        C1498h c1498h = this.f29846a;
        if (c1498h != null && str != null) {
            AbstractC3159y.f(c1498h);
            if (g6.n.s(str, c1498h.y0(), true)) {
                L0();
            }
        }
    }

    public final void P0(int i8, C1505o c1505o) {
        if (this.f29846a != null && c1505o != null && c1505o.Y() != null) {
            String Y7 = c1505o.Y();
            C1498h c1498h = this.f29846a;
            AbstractC3159y.f(c1498h);
            if (g6.n.s(Y7, c1498h.y0(), true)) {
                if (i8 != 200) {
                    if (i8 != 201) {
                        if (i8 == 202) {
                            O(c1505o);
                        }
                        L0();
                        return;
                    }
                    y0(c1505o);
                    return;
                }
                y0(c1505o);
            }
        }
    }

    public final void b0() {
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        new S4.i(requireContext, this.f29847b, new c(), LifecycleOwnerKt.getLifecycleScope(this));
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
                    this.f29847b = extras.getLong("appId");
                }
                if (extras.containsKey("appInfo")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = extras.getParcelable("appInfo", C1498h.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        parcelable = extras.getParcelable("appInfo");
                    }
                    C1498h c1498h = (C1498h) parcelable;
                    this.f29846a = c1498h;
                    if (c1498h != null) {
                        AbstractC3159y.f(c1498h);
                        this.f29847b = c1498h.i();
                    }
                }
            }
            BackgroundManager backgroundManager2 = BackgroundManager.getInstance(activity);
            this.f29850e = backgroundManager2;
            if (backgroundManager2 != null && !backgroundManager2.isAttached() && (backgroundManager = this.f29850e) != null) {
                backgroundManager.attach(activity.getWindow());
            }
            Drawable drawable = ContextCompat.getDrawable(activity, R.drawable.tv_default_background);
            BackgroundManager backgroundManager3 = this.f29850e;
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
        AbstractC3159y.i(permissions, "permissions");
        AbstractC3159y.i(grantResults, "grantResults");
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
        if (!this.f29860o) {
            L0();
        } else {
            this.f29860o = false;
        }
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!this.f29859n) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
        }
        this.f29859n = false;
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        BackgroundManager backgroundManager = this.f29850e;
        AbstractC3159y.f(backgroundManager);
        backgroundManager.release();
        super.onStop();
    }
}
