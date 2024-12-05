package com.uptodown.activities;

import D4.C1092a;
import E4.j;
import L5.InterfaceC1227k;
import T4.C1369f;
import W4.InterfaceC1480c;
import X4.C1496f;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppFilesActivity;
import i6.AbstractC2829k;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3307A;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;

/* loaded from: classes4.dex */
public final class AppFilesActivity extends AbstractActivityC2489a {

    /* renamed from: P, reason: collision with root package name */
    private C1496f f28118P;

    /* renamed from: N, reason: collision with root package name */
    private final LifecycleCoroutineScope f28116N = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28117O = L5.l.b(new a());

    /* renamed from: Q, reason: collision with root package name */
    private b f28119Q = new b();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1369f invoke() {
            return C1369f.c(AppFilesActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1480c {
        b() {
        }

        @Override // W4.InterfaceC1480c
        public void a(X4.r fileInfo) {
            AbstractC3159y.i(fileInfo, "fileInfo");
            if (UptodownApp.f28003B.a0() && fileInfo.d() != null && !AppFilesActivity.this.isFinishing()) {
                AppFilesActivity.this.j3(fileInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28122a;

        /* renamed from: b, reason: collision with root package name */
        Object f28123b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28124c;

        /* renamed from: e, reason: collision with root package name */
        int f28126e;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28124c = obj;
            this.f28126e |= Integer.MIN_VALUE;
            return AppFilesActivity.this.g3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28127a;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28127a == 0) {
                L5.t.b(obj);
                AppFilesActivity.this.f3().f10555c.f10185b.setVisibility(0);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28129a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f28131c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28131c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28129a == 0) {
                L5.t.b(obj);
                PackageManager packageManager = AppFilesActivity.this.getPackageManager();
                AbstractC3159y.h(packageManager, "packageManager");
                C1496f c1496f = AppFilesActivity.this.f28118P;
                AbstractC3159y.f(c1496f);
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                ApplicationInfo a8 = N4.q.a(packageManager, Q8, 128);
                File file = new File(a8.sourceDir);
                X4.r rVar = new X4.r();
                rVar.f(a8.sourceDir);
                rVar.h(N4.d.f7201a.e(a8.sourceDir));
                rVar.i(file.length());
                this.f28131c.add(rVar);
                C3326n a9 = C3326n.f34504t.a(AppFilesActivity.this);
                a9.a();
                C1496f c1496f2 = AppFilesActivity.this.f28118P;
                AbstractC3159y.f(c1496f2);
                c1496f2.p0(a8, a9);
                C1496f c1496f3 = AppFilesActivity.this.f28118P;
                AbstractC3159y.f(c1496f3);
                if (c1496f3.b0() != null) {
                    ArrayList arrayList = this.f28131c;
                    C1496f c1496f4 = AppFilesActivity.this.f28118P;
                    AbstractC3159y.f(c1496f4);
                    ArrayList b02 = c1496f4.b0();
                    AbstractC3159y.f(b02);
                    arrayList.addAll(b02);
                }
                C1496f c1496f5 = AppFilesActivity.this.f28118P;
                AbstractC3159y.f(c1496f5);
                c1496f5.o0(a9);
                C1496f c1496f6 = AppFilesActivity.this.f28118P;
                AbstractC3159y.f(c1496f6);
                if (c1496f6.L() != null) {
                    ArrayList arrayList2 = this.f28131c;
                    C1496f c1496f7 = AppFilesActivity.this.f28118P;
                    AbstractC3159y.f(c1496f7);
                    ArrayList L8 = c1496f7.L();
                    AbstractC3159y.f(L8);
                    arrayList2.addAll(L8);
                }
                a9.g();
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28132a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28134c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f28134c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f28134c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28132a == 0) {
                L5.t.b(obj);
                AppFilesActivity.this.f3().f10557e.setAdapter(new C1092a(this.f28134c, AppFilesActivity.this.f28119Q));
                AppFilesActivity.this.f3().f10555c.f10185b.setVisibility(8);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28135a;

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
            Object e8 = Q5.b.e();
            int i8 = this.f28135a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                AppFilesActivity appFilesActivity = AppFilesActivity.this;
                this.f28135a = 1;
                if (appFilesActivity.g3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements W4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.r f28138b;

        h(X4.r rVar) {
            this.f28138b = rVar;
        }

        @Override // W4.K
        public void a(X4.H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            Intent intent = new Intent(AppFilesActivity.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("app_selected", AppFilesActivity.this.f28118P);
            intent.putExtra("appReportVT", reportVT);
            AppFilesActivity appFilesActivity = AppFilesActivity.this;
            appFilesActivity.startActivity(intent, UptodownApp.f28003B.a(appFilesActivity));
        }

        @Override // W4.K
        public void b() {
            if (this.f28138b.d() != null && !AppFilesActivity.this.isFinishing()) {
                C3323k c3323k = new C3323k();
                AppFilesActivity appFilesActivity = AppFilesActivity.this;
                C3319g c3319g = new C3319g();
                String d8 = this.f28138b.d();
                AbstractC3159y.f(d8);
                c3323k.q(appFilesActivity, c3319g.q(d8), AppFilesActivity.this.getString(R.string.virustotal_safety_report_title));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1369f f3() {
        return (C1369f) this.f28117O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.AppFilesActivity.c
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.AppFilesActivity$c r0 = (com.uptodown.activities.AppFilesActivity.c) r0
            int r1 = r0.f28126e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28126e = r1
            goto L18
        L13:
            com.uptodown.activities.AppFilesActivity$c r0 = new com.uptodown.activities.AppFilesActivity$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f28124c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f28126e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            L5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f28123b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r0.f28122a
            com.uptodown.activities.AppFilesActivity r4 = (com.uptodown.activities.AppFilesActivity) r4
            L5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f28123b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r5 = r0.f28122a
            com.uptodown.activities.AppFilesActivity r5 = (com.uptodown.activities.AppFilesActivity) r5
            L5.t.b(r9)
            goto L70
        L50:
            L5.t.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            i6.J0 r2 = i6.C2812b0.c()
            com.uptodown.activities.AppFilesActivity$d r7 = new com.uptodown.activities.AppFilesActivity$d
            r7.<init>(r6)
            r0.f28122a = r8
            r0.f28123b = r9
            r0.f28126e = r5
            java.lang.Object r2 = i6.AbstractC2825i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            i6.I r9 = i6.C2812b0.b()
            com.uptodown.activities.AppFilesActivity$e r7 = new com.uptodown.activities.AppFilesActivity$e
            r7.<init>(r2, r6)
            r0.f28122a = r5
            r0.f28123b = r2
            r0.f28126e = r4
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            i6.J0 r9 = i6.C2812b0.c()
            com.uptodown.activities.AppFilesActivity$f r5 = new com.uptodown.activities.AppFilesActivity$f
            r5.<init>(r2, r6)
            r0.f28122a = r6
            r0.f28123b = r6
            r0.f28126e = r3
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            L5.I r9 = L5.I.f6487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppFilesActivity.g3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(AppFilesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f28003B.a0()) {
            this$0.getOnBackPressedDispatcher().onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(X4.r rVar) {
        if (UptodownApp.f28003B.a0() && !isFinishing()) {
            new S4.m(this, null, rVar.d(), new h(rVar), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void k3() {
        C3307A c3307a = C3307A.f34473a;
        C1496f c1496f = this.f28118P;
        AbstractC3159y.f(c1496f);
        f3().f10554b.setImageDrawable(c3307a.j(this, c1496f.Q()));
        TextView textView = f3().f10559g;
        C1496f c1496f2 = this.f28118P;
        AbstractC3159y.f(c1496f2);
        textView.setText(c1496f2.I());
        TextView textView2 = f3().f10559g;
        j.a aVar = E4.j.f2274g;
        textView2.setTypeface(aVar.t());
        TextView textView3 = f3().f10560h;
        C1496f c1496f3 = this.f28118P;
        AbstractC3159y.f(c1496f3);
        textView3.setText(c1496f3.h0());
        f3().f10560h.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        try {
            setContentView(f3().getRoot());
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInstalled")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInstalled", C1496f.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInstalled");
                }
                this.f28118P = (C1496f) parcelable;
            }
            C1369f f32 = f3();
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                f32.f10558f.setNavigationIcon(drawable);
                f32.f10558f.setNavigationContentDescription(getString(R.string.back));
            }
            f32.f10558f.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppFilesActivity.h3(AppFilesActivity.this, view);
                }
            });
            f32.f10561i.setTypeface(E4.j.f2274g.u());
            f32.f10555c.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppFilesActivity.i3(view);
                }
            });
            f32.f10557e.setLayoutManager(new LinearLayoutManager(this, 1, false));
            f32.f10557e.setItemAnimator(new DefaultItemAnimator());
            f32.f10557e.addItemDecoration(new N4.s((int) getResources().getDimension(R.dimen.margin_m)));
            if (this.f28118P != null) {
                k3();
                AbstractC2829k.d(this.f28116N, null, null, new g(null), 3, null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
