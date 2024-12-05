package com.uptodown.activities;

import D4.W1;
import O5.InterfaceC1355k;
import W4.C1471b0;
import W4.C1482h;
import a5.C1630B;
import a5.C1639f;
import a5.C1641h;
import a5.C1644k;
import a5.O;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppInstalledDetailsActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3674n;
import q5.C3854c;

/* loaded from: classes4.dex */
public final class AppInstalledDetailsActivity extends W1 {

    /* renamed from: t0, reason: collision with root package name */
    public static final a f29194t0 = new a(null);

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1355k f29195p0 = O5.l.b(new b());

    /* renamed from: q0, reason: collision with root package name */
    private C1639f f29196q0;

    /* renamed from: r0, reason: collision with root package name */
    private C1641h f29197r0;

    /* renamed from: s0, reason: collision with root package name */
    private ArrayList f29198s0;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1482h invoke() {
            return C1482h.c(AppInstalledDetailsActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29200a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29202a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f29203b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ O f29204c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AppInstalledDetailsActivity appInstalledDetailsActivity, O o8, S5.d dVar) {
                super(2, dVar);
                this.f29203b = appInstalledDetailsActivity;
                this.f29204c = o8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29203b, this.f29204c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29202a == 0) {
                    O5.t.b(obj);
                    this.f29203b.T4().f12320n0.setTypeface(H4.j.f3824g.t());
                    this.f29203b.i5(this.f29204c.s());
                    if (this.f29204c.u() != 100) {
                        this.f29203b.T4().f12320n0.setText(this.f29203b.getString(R.string.updates_button_download_app));
                        this.f29203b.T4().f12320n0.setBackground(ContextCompat.getDrawable(this.f29203b, R.drawable.ripple_blue_primary_button));
                    } else {
                        this.f29203b.T4().f12320n0.setText(this.f29203b.getString(R.string.action_update));
                        this.f29203b.T4().f12320n0.setBackground(ContextCompat.getDrawable(this.f29203b, R.drawable.ripple_install_button));
                    }
                    if (UptodownApp.f29058B.R(this.f29204c.s())) {
                        this.f29203b.k5();
                        this.f29203b.T4().f12291Y.setText(this.f29203b.getString(R.string.status_download_update_pending));
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29205a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f29206b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AppInstalledDetailsActivity appInstalledDetailsActivity, S5.d dVar) {
                super(2, dVar);
                this.f29206b = appInstalledDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f29206b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29205a == 0) {
                    O5.t.b(obj);
                    if (!this.f29206b.isFinishing()) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = this.f29206b;
                        String packageName = appInstalledDetailsActivity.getPackageName();
                        AbstractC3255y.h(packageName, "packageName");
                        appInstalledDetailsActivity.i5(packageName);
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29200a;
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
                C3674n.a aVar = C3674n.f36505t;
                Context applicationContext = AppInstalledDetailsActivity.this.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                C3674n a8 = aVar.a(applicationContext);
                a8.a();
                C1639f c1639f = AppInstalledDetailsActivity.this.f29196q0;
                AbstractC3255y.f(c1639f);
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                O u02 = a8.u0(J8);
                a8.l();
                if (u02 != null && u02.h() == 0) {
                    J0 c8 = C3347b0.c();
                    a aVar2 = new a(AppInstalledDetailsActivity.this, u02, null);
                    this.f29200a = 1;
                    if (AbstractC3360i.g(c8, aVar2, this) == e8) {
                        return e8;
                    }
                }
            }
            if (UptodownApp.f29058B.M()) {
                C1639f c1639f2 = AppInstalledDetailsActivity.this.f29196q0;
                AbstractC3255y.f(c1639f2);
                if (j6.n.t(c1639f2.J(), AppInstalledDetailsActivity.this.getPackageName(), false, 2, null)) {
                    J0 c9 = C3347b0.c();
                    b bVar = new b(AppInstalledDetailsActivity.this, null);
                    this.f29200a = 2;
                    if (AbstractC3360i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppInstalledDetailsActivity f29209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, AppInstalledDetailsActivity appInstalledDetailsActivity, S5.d dVar) {
            super(2, dVar);
            this.f29208b = str;
            this.f29209c = appInstalledDetailsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f29208b, this.f29209c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29207a == 0) {
                O5.t.b(obj);
                if (AbstractC3255y.d(this.f29208b, "app_updated")) {
                    this.f29209c.W4();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Z4.r {
        e() {
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            C1644k s8;
            AbstractC3255y.i(appInfo, "appInfo");
            AppInstalledDetailsActivity.this.f29197r0 = appInfo;
            if (!AppInstalledDetailsActivity.this.isFinishing() && (s8 = appInfo.s()) != null && s8.u() == 1) {
                AppInstalledDetailsActivity.this.T4().f12286T.setText(AppInstalledDetailsActivity.this.getString(R.string.app_detail_play_button));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29211a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29212b;

        /* renamed from: d, reason: collision with root package name */
        int f29214d;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29212b = obj;
            this.f29214d |= Integer.MIN_VALUE;
            return AppInstalledDetailsActivity.this.V4(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29215a;

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PackageInfo packageInfo;
            PermissionInfo[] permissionInfoArr;
            T5.b.e();
            if (this.f29215a == 0) {
                O5.t.b(obj);
                try {
                    PackageManager packageManager = AppInstalledDetailsActivity.this.getPackageManager();
                    AbstractC3255y.h(packageManager, "packageManager");
                    C1639f c1639f = AppInstalledDetailsActivity.this.f29196q0;
                    AbstractC3255y.f(c1639f);
                    String J8 = c1639f.J();
                    AbstractC3255y.f(J8);
                    packageInfo = Q4.q.d(packageManager, J8, 4096);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null && (permissionInfoArr = packageInfo.permissions) != null) {
                    AppInstalledDetailsActivity.this.f29198s0 = new ArrayList();
                    for (PermissionInfo permissionInfo : permissionInfoArr) {
                        C1630B c1630b = new C1630B();
                        c1630b.c(String.valueOf(permissionInfo.loadDescription(AppInstalledDetailsActivity.this.getPackageManager())));
                        c1630b.d(permissionInfo.name);
                        ArrayList arrayList = AppInstalledDetailsActivity.this.f29198s0;
                        AbstractC3255y.f(arrayList);
                        arrayList.add(c1630b);
                    }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29217a;

        h(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            T5.b.e();
            if (this.f29217a == 0) {
                O5.t.b(obj);
                if (AppInstalledDetailsActivity.this.f29198s0 != null) {
                    ArrayList arrayList = AppInstalledDetailsActivity.this.f29198s0;
                    AbstractC3255y.f(arrayList);
                    if (arrayList.size() > 0) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                        ArrayList arrayList2 = appInstalledDetailsActivity.f29198s0;
                        AbstractC3255y.f(arrayList2);
                        LinearLayout linearLayout = AppInstalledDetailsActivity.this.T4().f12329s;
                        AbstractC3255y.h(linearLayout, "binding.llPermissionsAida");
                        appInstalledDetailsActivity.h5(arrayList2, linearLayout);
                        ArrayList arrayList3 = AppInstalledDetailsActivity.this.f29198s0;
                        AbstractC3255y.f(arrayList3);
                        i8 = arrayList3.size();
                        AppInstalledDetailsActivity.this.T4().f12289W.setText(String.valueOf(i8));
                        return O5.I.f8278a;
                    }
                }
                AppInstalledDetailsActivity.this.T4().f12267A.setVisibility(8);
                i8 = 0;
                AppInstalledDetailsActivity.this.T4().f12289W.setText(String.valueOf(i8));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29219a;

        i(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29219a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                this.f29219a = 1;
                if (appInstalledDetailsActivity.V4(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29221a;

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29221a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                this.f29221a = 1;
                if (appInstalledDetailsActivity.R4(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Z4.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f29223a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppInstalledDetailsActivity f29224b;

        k(CharSequence charSequence, AppInstalledDetailsActivity appInstalledDetailsActivity) {
            this.f29223a = charSequence;
            this.f29224b = appInstalledDetailsActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(AppInstalledDetailsActivity this$0, C1641h appInfo, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(appInfo, "$appInfo");
            if (UptodownApp.f29058B.a0()) {
                this$0.F2(appInfo.i());
            }
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(final C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            SpannableString a8 = defpackage.b.f14999d.a(this.f29223a.toString());
            float dimension = this.f29224b.getResources().getDimension(R.dimen.text_size_m);
            Typeface u8 = H4.j.f3824g.u();
            AbstractC3255y.f(u8);
            a8.setSpan(new defpackage.b(dimension, u8, ContextCompat.getColor(this.f29224b, R.color.blue_primary)), 0, this.f29223a.length(), 33);
            this.f29224b.T4().f12322o0.setText(a8);
            TextView textView = this.f29224b.T4().f12322o0;
            final AppInstalledDetailsActivity appInstalledDetailsActivity = this.f29224b;
            textView.setOnClickListener(new View.OnClickListener() { // from class: D4.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppInstalledDetailsActivity.k.b(AppInstalledDetailsActivity.this, appInfo, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29225a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29227c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29228d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29229a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f29230b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f29231c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29232d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ O f29233e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i8, AppInstalledDetailsActivity appInstalledDetailsActivity, String str, O o8, S5.d dVar) {
                super(2, dVar);
                this.f29230b = i8;
                this.f29231c = appInstalledDetailsActivity;
                this.f29232d = str;
                this.f29233e = o8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29230b, this.f29231c, this.f29232d, this.f29233e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29229a == 0) {
                    O5.t.b(obj);
                    switch (this.f29230b) {
                        case 102:
                            Toast.makeText(this.f29231c.getApplicationContext(), R.string.descarga_error, 1).show();
                            break;
                        case 103:
                        case 106:
                            AppInstalledDetailsActivity appInstalledDetailsActivity = this.f29231c;
                            String str = this.f29232d;
                            AbstractC3255y.f(str);
                            appInstalledDetailsActivity.i5(str);
                            this.f29231c.T4().f12291Y.setText(this.f29231c.getString(R.string.zero) + this.f29231c.getString(R.string.percent));
                            this.f29231c.T4().f12333u.setProgress(0);
                            break;
                        case 104:
                        case 105:
                        default:
                            this.f29231c.T4().f12333u.setIndeterminate(false);
                            if (this.f29233e != null) {
                                this.f29231c.k5();
                                this.f29231c.T4().f12333u.setProgress(this.f29233e.u());
                                this.f29231c.T4().f12291Y.setText(this.f29231c.getString(R.string.percent_of_total_size, kotlin.coroutines.jvm.internal.b.c(this.f29233e.u()), new Q4.g().c(this.f29233e.v())));
                                break;
                            } else {
                                this.f29231c.W4();
                                break;
                            }
                        case 107:
                            this.f29231c.k5();
                            this.f29231c.T4().f12291Y.setText(this.f29231c.getString(R.string.status_download_update_pending));
                            break;
                        case 108:
                            AppInstalledDetailsActivity appInstalledDetailsActivity2 = this.f29231c;
                            String str2 = this.f29232d;
                            AbstractC3255y.f(str2);
                            appInstalledDetailsActivity2.i5(str2);
                            O o8 = this.f29233e;
                            if (o8 != null && o8.u() == 100) {
                                this.f29231c.T4().f12320n0.setText(this.f29231c.getString(R.string.action_update));
                                this.f29231c.T4().f12320n0.setBackground(ContextCompat.getDrawable(this.f29231c, R.drawable.ripple_install_button));
                                this.f29231c.T4().f12320n0.setVisibility(0);
                                break;
                            }
                            break;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i8, String str, S5.d dVar) {
            super(2, dVar);
            this.f29227c = i8;
            this.f29228d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(this.f29227c, this.f29228d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29225a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C3674n.a aVar = C3674n.f36505t;
                Context applicationContext = AppInstalledDetailsActivity.this.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                C3674n a8 = aVar.a(applicationContext);
                a8.a();
                C1639f c1639f = AppInstalledDetailsActivity.this.f29196q0;
                AbstractC3255y.f(c1639f);
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                O u02 = a8.u0(J8);
                a8.l();
                J0 c8 = C3347b0.c();
                a aVar2 = new a(this.f29227c, AppInstalledDetailsActivity.this, this.f29228d, u02, null);
                this.f29225a = 1;
                if (AbstractC3360i.g(c8, aVar2, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R4(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1482h T4() {
        return (C1482h) this.f29195p0.getValue();
    }

    private final void U4() {
        C1639f c1639f = this.f29196q0;
        AbstractC3255y.f(c1639f);
        new V4.i(this, c1639f.b(), new e(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V4(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.activities.AppInstalledDetailsActivity.f
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.activities.AppInstalledDetailsActivity$f r0 = (com.uptodown.activities.AppInstalledDetailsActivity.f) r0
            int r1 = r0.f29214d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29214d = r1
            goto L18
        L13:
            com.uptodown.activities.AppInstalledDetailsActivity$f r0 = new com.uptodown.activities.AppInstalledDetailsActivity$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29212b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f29214d
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
            java.lang.Object r2 = r0.f29211a
            com.uptodown.activities.AppInstalledDetailsActivity r2 = (com.uptodown.activities.AppInstalledDetailsActivity) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            com.uptodown.activities.AppInstalledDetailsActivity$g r2 = new com.uptodown.activities.AppInstalledDetailsActivity$g
            r2.<init>(r5)
            r0.f29211a = r6
            r0.f29214d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            com.uptodown.activities.AppInstalledDetailsActivity$h r4 = new com.uptodown.activities.AppInstalledDetailsActivity$h
            r4.<init>(r5)
            r0.f29211a = r5
            r0.f29214d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.V4(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W4() {
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = T4().f12333u;
        AbstractC3255y.h(progressBar, "binding.pbProgressAida");
        ImageView imageView = T4().f12301e;
        AbstractC3255y.h(imageView, "binding.ivLogoAida");
        c3854c.c(progressBar, imageView);
        T4().f12325q.setVisibility(8);
        T4().f12320n0.setVisibility(8);
        T4().f12328r0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(View view) {
    }

    private final void Z4() {
        T4().f12274H.setVisibility(8);
        T4().f12285S.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a5() {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.a5():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        PackageManager packageManager = this$0.getPackageManager();
        C1639f c1639f = this$0.f29196q0;
        AbstractC3255y.f(c1639f);
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(J8);
        if (launchIntentForPackage != null) {
            this$0.startActivity(launchIntentForPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        H4.i iVar = new H4.i(this$0);
        C1639f c1639f = this$0.f29196q0;
        AbstractC3255y.f(c1639f);
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        iVar.h(J8);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AppFilesActivity.class);
        intent.putExtra("appInstalled", this$0.f29196q0);
        this$0.startActivity(intent, UptodownApp.f29058B.a(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(final AppInstalledDetailsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.T4().f12329s.getVisibility() == 0) {
            this$0.T4().f12329s.setVisibility(8);
            this$0.T4().f12309i.setImageResource(R.drawable.vector_add);
        } else {
            this$0.T4().f12329s.setVisibility(0);
            this$0.T4().f12309i.setImageResource(R.drawable.vector_remove);
            this$0.T4().f12274H.post(new Runnable() { // from class: D4.q
                @Override // java.lang.Runnable
                public final void run() {
                    AppInstalledDetailsActivity.f5(AppInstalledDetailsActivity.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(AppInstalledDetailsActivity this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.T4().f12274H.smoothScrollTo(0, this$0.T4().f12267A.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AppDetailActivity.class);
        C1641h c1641h = this$0.f29197r0;
        if (c1641h != null) {
            intent.putExtra("appInfo", c1641h);
        } else {
            C1639f c1639f = this$0.f29196q0;
            AbstractC3255y.f(c1639f);
            intent.putExtra("appId", c1639f.b());
        }
        this$0.startActivity(intent, UptodownApp.f29058B.a(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h5(ArrayList arrayList, LinearLayout linearLayout) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1471b0 c8 = C1471b0.c(LayoutInflater.from(getApplicationContext()));
            AbstractC3255y.h(c8, "inflate(LayoutInflater.from(applicationContext))");
            c8.f12062b.setTypeface(H4.j.f3824g.u());
            c8.f12062b.setText(((C1630B) arrayList.get(i8)).b());
            linearLayout.addView(c8.getRoot());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i5(final String str) {
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = T4().f12333u;
        AbstractC3255y.h(progressBar, "binding.pbProgressAida");
        ImageView imageView = T4().f12301e;
        AbstractC3255y.h(imageView, "binding.ivLogoAida");
        c3854c.c(progressBar, imageView);
        T4().f12291Y.setVisibility(0);
        T4().f12328r0.setVisibility(0);
        T4().f12325q.setVisibility(8);
        T4().f12320n0.setText(getString(R.string.updates_button_download_app));
        T4().f12320n0.setTextColor(ContextCompat.getColor(this, R.color.white));
        T4().f12320n0.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_blue_primary_button));
        T4().f12320n0.setOnClickListener(new View.OnClickListener() { // from class: D4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppInstalledDetailsActivity.j5(AppInstalledDetailsActivity.this, str, view);
            }
        });
        T4().f12320n0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j5(AppInstalledDetailsActivity this$0, String packagename, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(packagename, "$packagename");
        this$0.l4(this$0.f29196q0);
        if (UptodownApp.f29058B.R(packagename)) {
            this$0.k5();
            this$0.T4().f12291Y.setText(this$0.getString(R.string.status_download_update_pending));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k5() {
        C3854c c3854c = C3854c.f38326a;
        ProgressBar progressBar = T4().f12333u;
        AbstractC3255y.h(progressBar, "binding.pbProgressAida");
        ImageView imageView = T4().f12301e;
        AbstractC3255y.h(imageView, "binding.ivLogoAida");
        c3854c.e(progressBar, imageView);
        T4().f12325q.setVisibility(0);
        T4().f12328r0.setVisibility(8);
        T4().f12320n0.setText(getString(R.string.option_button_cancel));
        T4().f12320n0.setTextColor(ContextCompat.getColor(this, R.color.main_blue));
        T4().f12320n0.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_open_button));
        T4().f12320n0.setOnClickListener(new View.OnClickListener() { // from class: D4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppInstalledDetailsActivity.l5(AppInstalledDetailsActivity.this, view);
            }
        });
        T4().f12320n0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f29058B;
        C1639f c1639f = this$0.f29196q0;
        AbstractC3255y.f(c1639f);
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        aVar.c0(J8, this$0);
    }

    public final Object S4(String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new d(str, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    public final Object m5(int i8, String str, S5.d dVar) {
        C1639f c1639f = this.f29196q0;
        AbstractC3255y.f(c1639f);
        if (AbstractC3255y.d(str, c1639f.J())) {
            Object g8 = AbstractC3360i.g(C3347b0.b(), new l(i8, str, null), dVar);
            if (g8 == T5.b.e()) {
                return g8;
            }
            return O5.I.f8278a;
        }
        return O5.I.f8278a;
    }

    @Override // D4.W1
    protected void o4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str;
        super.onResume();
        if (this.f29196q0 != null) {
            N4.a h8 = H4.j.f3824g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            C1639f c1639f = this.f29196q0;
            AbstractC3255y.f(c1639f);
            if (j6.n.s(str, c1639f.J(), true)) {
                T4().f12333u.setIndeterminate(true);
                C3854c c3854c = C3854c.f38326a;
                ProgressBar progressBar = T4().f12333u;
                AbstractC3255y.h(progressBar, "binding.pbProgressAida");
                ImageView imageView = T4().f12301e;
                AbstractC3255y.h(imageView, "binding.ivLogoAida");
                c3854c.e(progressBar, imageView);
            }
        }
    }
}
