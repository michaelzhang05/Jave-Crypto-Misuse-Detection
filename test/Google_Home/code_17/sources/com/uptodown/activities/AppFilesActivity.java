package com.uptodown.activities;

import G4.C1191a;
import H4.j;
import O5.InterfaceC1355k;
import W4.C1478f;
import Z4.InterfaceC1589c;
import a5.C1639f;
import a6.InterfaceC1668n;
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
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import o5.C3655A;
import o5.C3667g;
import o5.C3671k;
import o5.C3674n;

/* loaded from: classes4.dex */
public final class AppFilesActivity extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    private C1639f f29173P;

    /* renamed from: N, reason: collision with root package name */
    private final LifecycleCoroutineScope f29171N = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29172O = O5.l.b(new a());

    /* renamed from: Q, reason: collision with root package name */
    private b f29174Q = new b();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1478f invoke() {
            return C1478f.c(AppFilesActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1589c {
        b() {
        }

        @Override // Z4.InterfaceC1589c
        public void a(a5.r fileInfo) {
            AbstractC3255y.i(fileInfo, "fileInfo");
            if (UptodownApp.f29058B.a0() && fileInfo.d() != null && !AppFilesActivity.this.isFinishing()) {
                AppFilesActivity.this.j3(fileInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29177a;

        /* renamed from: b, reason: collision with root package name */
        Object f29178b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29179c;

        /* renamed from: e, reason: collision with root package name */
        int f29181e;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29179c = obj;
            this.f29181e |= Integer.MIN_VALUE;
            return AppFilesActivity.this.g3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29182a;

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29182a == 0) {
                O5.t.b(obj);
                AppFilesActivity.this.f3().f12212c.f11842b.setVisibility(0);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29184a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f29186c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f29186c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29184a == 0) {
                O5.t.b(obj);
                PackageManager packageManager = AppFilesActivity.this.getPackageManager();
                AbstractC3255y.h(packageManager, "packageManager");
                C1639f c1639f = AppFilesActivity.this.f29173P;
                AbstractC3255y.f(c1639f);
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                ApplicationInfo a8 = Q4.q.a(packageManager, J8, 128);
                File file = new File(a8.sourceDir);
                a5.r rVar = new a5.r();
                rVar.f(a8.sourceDir);
                rVar.h(Q4.d.f9161a.e(a8.sourceDir));
                rVar.i(file.length());
                this.f29186c.add(rVar);
                C3674n a9 = C3674n.f36505t.a(AppFilesActivity.this);
                a9.a();
                C1639f c1639f2 = AppFilesActivity.this.f29173P;
                AbstractC3255y.f(c1639f2);
                c1639f2.p0(a8, a9);
                C1639f c1639f3 = AppFilesActivity.this.f29173P;
                AbstractC3255y.f(c1639f3);
                if (c1639f3.b0() != null) {
                    ArrayList arrayList = this.f29186c;
                    C1639f c1639f4 = AppFilesActivity.this.f29173P;
                    AbstractC3255y.f(c1639f4);
                    ArrayList b02 = c1639f4.b0();
                    AbstractC3255y.f(b02);
                    arrayList.addAll(b02);
                }
                C1639f c1639f5 = AppFilesActivity.this.f29173P;
                AbstractC3255y.f(c1639f5);
                c1639f5.o0(a9);
                C1639f c1639f6 = AppFilesActivity.this.f29173P;
                AbstractC3255y.f(c1639f6);
                if (c1639f6.H() != null) {
                    ArrayList arrayList2 = this.f29186c;
                    C1639f c1639f7 = AppFilesActivity.this.f29173P;
                    AbstractC3255y.f(c1639f7);
                    ArrayList H8 = c1639f7.H();
                    AbstractC3255y.f(H8);
                    arrayList2.addAll(H8);
                }
                a9.l();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29187a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f29189c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f29189c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29187a == 0) {
                O5.t.b(obj);
                AppFilesActivity.this.f3().f12214e.setAdapter(new C1191a(this.f29189c, AppFilesActivity.this.f29174Q));
                AppFilesActivity.this.f3().f12212c.f11842b.setVisibility(8);
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
        int f29190a;

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
            int i8 = this.f29190a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                AppFilesActivity appFilesActivity = AppFilesActivity.this;
                this.f29190a = 1;
                if (appFilesActivity.g3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Z4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.r f29193b;

        h(a5.r rVar) {
            this.f29193b = rVar;
        }

        @Override // Z4.K
        public void a() {
            if (this.f29193b.d() != null && !AppFilesActivity.this.isFinishing()) {
                C3671k c3671k = new C3671k();
                AppFilesActivity appFilesActivity = AppFilesActivity.this;
                C3667g c3667g = new C3667g();
                String d8 = this.f29193b.d();
                AbstractC3255y.f(d8);
                c3671k.q(appFilesActivity, c3667g.q(d8), AppFilesActivity.this.getString(R.string.virustotal_safety_report_title));
            }
        }

        @Override // Z4.K
        public void b(a5.H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            Intent intent = new Intent(AppFilesActivity.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("app_selected", AppFilesActivity.this.f29173P);
            intent.putExtra("appReportVT", reportVT);
            AppFilesActivity appFilesActivity = AppFilesActivity.this;
            appFilesActivity.startActivity(intent, UptodownApp.f29058B.a(appFilesActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1478f f3() {
        return (C1478f) this.f29172O.getValue();
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
    public final java.lang.Object g3(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.AppFilesActivity.c
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.AppFilesActivity$c r0 = (com.uptodown.activities.AppFilesActivity.c) r0
            int r1 = r0.f29181e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29181e = r1
            goto L18
        L13:
            com.uptodown.activities.AppFilesActivity$c r0 = new com.uptodown.activities.AppFilesActivity$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29179c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f29181e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            O5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f29178b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r0.f29177a
            com.uptodown.activities.AppFilesActivity r4 = (com.uptodown.activities.AppFilesActivity) r4
            O5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f29178b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r5 = r0.f29177a
            com.uptodown.activities.AppFilesActivity r5 = (com.uptodown.activities.AppFilesActivity) r5
            O5.t.b(r9)
            goto L70
        L50:
            O5.t.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            l6.J0 r2 = l6.C3347b0.c()
            com.uptodown.activities.AppFilesActivity$d r7 = new com.uptodown.activities.AppFilesActivity$d
            r7.<init>(r6)
            r0.f29177a = r8
            r0.f29178b = r9
            r0.f29181e = r5
            java.lang.Object r2 = l6.AbstractC3360i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            l6.I r9 = l6.C3347b0.b()
            com.uptodown.activities.AppFilesActivity$e r7 = new com.uptodown.activities.AppFilesActivity$e
            r7.<init>(r2, r6)
            r0.f29177a = r5
            r0.f29178b = r2
            r0.f29181e = r4
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            l6.J0 r9 = l6.C3347b0.c()
            com.uptodown.activities.AppFilesActivity$f r5 = new com.uptodown.activities.AppFilesActivity$f
            r5.<init>(r2, r6)
            r0.f29177a = r6
            r0.f29178b = r6
            r0.f29181e = r3
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            O5.I r9 = O5.I.f8278a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppFilesActivity.g3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(AppFilesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.getOnBackPressedDispatcher().onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(a5.r rVar) {
        if (UptodownApp.f29058B.a0() && !isFinishing()) {
            new V4.m(this, null, rVar.d(), new h(rVar), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    private final void k3() {
        C3655A c3655a = C3655A.f36474a;
        C1639f c1639f = this.f29173P;
        AbstractC3255y.f(c1639f);
        f3().f12211b.setImageDrawable(c3655a.j(this, c1639f.J()));
        TextView textView = f3().f12216g;
        C1639f c1639f2 = this.f29173P;
        AbstractC3255y.f(c1639f2);
        textView.setText(c1639f2.z());
        TextView textView2 = f3().f12216g;
        j.a aVar = H4.j.f3824g;
        textView2.setTypeface(aVar.t());
        TextView textView3 = f3().f12217h;
        C1639f c1639f3 = this.f29173P;
        AbstractC3255y.f(c1639f3);
        textView3.setText(c1639f3.h0());
        f3().f12217h.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
                    parcelable2 = extras.getParcelable("appInstalled", C1639f.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInstalled");
                }
                this.f29173P = (C1639f) parcelable;
            }
            C1478f f32 = f3();
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                f32.f12215f.setNavigationIcon(drawable);
                f32.f12215f.setNavigationContentDescription(getString(R.string.back));
            }
            f32.f12215f.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppFilesActivity.h3(AppFilesActivity.this, view);
                }
            });
            f32.f12218i.setTypeface(H4.j.f3824g.u());
            f32.f12212c.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppFilesActivity.i3(view);
                }
            });
            f32.f12214e.setLayoutManager(new LinearLayoutManager(this, 1, false));
            f32.f12214e.setItemAnimator(new DefaultItemAnimator());
            f32.f12214e.addItemDecoration(new Q4.s((int) getResources().getDimension(R.dimen.margin_m)));
            if (this.f29173P != null) {
                k3();
                AbstractC3364k.d(this.f29171N, null, null, new g(null), 3, null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
