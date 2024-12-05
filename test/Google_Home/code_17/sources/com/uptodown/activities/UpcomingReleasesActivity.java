package com.uptodown.activities;

import G4.L;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.C1490n;
import W4.C1497v;
import W4.p0;
import a5.C1632D;
import a5.Q;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.UpcomingReleasesActivity;
import com.uptodown.activities.x;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.AbstractC3685y;
import o5.C3671k;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class UpcomingReleasesActivity extends AbstractActivityC2683a {

    /* renamed from: V, reason: collision with root package name */
    public static final a f29932V = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private L f29935P;

    /* renamed from: S, reason: collision with root package name */
    private boolean f29938S;

    /* renamed from: U, reason: collision with root package name */
    private final ActivityResultLauncher f29940U;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29933N = new ViewModelLazy(U.b(x.class), new i(this), new h(this), new j(null, this));

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29934O = O5.l.b(new b());

    /* renamed from: Q, reason: collision with root package name */
    private x.a f29936Q = x.a.DATE;

    /* renamed from: R, reason: collision with root package name */
    private boolean f29937R = true;

    /* renamed from: T, reason: collision with root package name */
    private final k f29939T = new k();

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
        public final p0 invoke() {
            return p0.c(UpcomingReleasesActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5575invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5575invoke() {
            UpcomingReleasesActivity.this.G3(true);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !UpcomingReleasesActivity.this.A3().l() && !UpcomingReleasesActivity.this.A3().j() && recyclerView.getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                AbstractC3255y.f(layoutManager);
                int childCount = layoutManager.getChildCount();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                AbstractC3255y.f(layoutManager2);
                int itemCount = layoutManager2.getItemCount();
                RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                AbstractC3255y.f(layoutManager3);
                if (childCount + ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition() >= itemCount - 10) {
                    L l8 = UpcomingReleasesActivity.this.f29935P;
                    if (l8 != null) {
                        l8.e(true);
                    }
                    x A32 = UpcomingReleasesActivity.this.A3();
                    UpcomingReleasesActivity upcomingReleasesActivity = UpcomingReleasesActivity.this;
                    A32.i(upcomingReleasesActivity, upcomingReleasesActivity.f29936Q, UpcomingReleasesActivity.this.f29937R);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29944a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f29946a;

            a(UpcomingReleasesActivity upcomingReleasesActivity) {
                this.f29946a = upcomingReleasesActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                L l8;
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29946a.z3().f12459c.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    this.f29946a.w3(((x.b) cVar.a()).b(), ((x.b) cVar.a()).a());
                    if (((x.b) cVar.a()).b().isEmpty() && ((x.b) cVar.a()).a().isEmpty()) {
                        this.f29946a.z3().f12465i.setVisibility(0);
                    }
                    L l9 = this.f29946a.f29935P;
                    if (l9 != null) {
                        l9.e(false);
                    }
                    this.f29946a.z3().f12459c.f11842b.setVisibility(8);
                    this.f29946a.z3().f12458b.setVisibility(0);
                } else if ((abstractC3685y instanceof AbstractC3685y.b) && (l8 = this.f29946a.f29935P) != null) {
                    l8.e(false);
                }
                return O5.I.f8278a;
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
            Object e8 = T5.b.e();
            int i8 = this.f29944a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L k8 = UpcomingReleasesActivity.this.A3().k();
                a aVar = new a(UpcomingReleasesActivity.this);
                this.f29944a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1632D f29947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UpcomingReleasesActivity f29948b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C1632D c1632d, UpcomingReleasesActivity upcomingReleasesActivity) {
            super(0);
            this.f29947a = c1632d;
            this.f29948b = upcomingReleasesActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5576invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5576invoke() {
            String d8 = this.f29947a.d();
            if (d8 != null && d8.length() != 0) {
                UpcomingReleasesActivity upcomingReleasesActivity = this.f29948b;
                String d9 = this.f29947a.d();
                AbstractC3255y.f(d9);
                upcomingReleasesActivity.x3(d9);
            }
            this.f29948b.G3(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29949a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1632D f29951c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1632D c1632d, S5.d dVar) {
            super(2, dVar);
            this.f29951c = c1632d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f29951c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29949a == 0) {
                O5.t.b(obj);
                UpcomingReleasesActivity.this.v3(this.f29951c);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29952a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f29952a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29952a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29953a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29953a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29953a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29954a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29955b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29954a = function0;
            this.f29955b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29954a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29955b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Z4.J {

        /* loaded from: classes4.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29957a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f29958b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1632D f29959c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UpcomingReleasesActivity upcomingReleasesActivity, C1632D c1632d, S5.d dVar) {
                super(2, dVar);
                this.f29958b = upcomingReleasesActivity;
                this.f29959c = c1632d;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29958b, this.f29959c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29957a == 0) {
                    O5.t.b(obj);
                    this.f29958b.I3(this.f29959c);
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        k() {
        }

        @Override // Z4.J
        public void a(int i8) {
            if (UptodownApp.f29058B.a0() && UpcomingReleasesActivity.this.f29935P != null) {
                AbstractC3255y.f(UpcomingReleasesActivity.this.f29935P);
                if (!r0.b().isEmpty()) {
                    L l8 = UpcomingReleasesActivity.this.f29935P;
                    AbstractC3255y.f(l8);
                    if (l8.b().get(i8) instanceof C1632D) {
                        L l9 = UpcomingReleasesActivity.this.f29935P;
                        AbstractC3255y.f(l9);
                        Object obj = l9.b().get(i8);
                        AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                        UpcomingReleasesActivity.this.F2(((C1632D) obj).b());
                    }
                }
            }
        }

        @Override // Z4.J
        public void e(int i8) {
            if (UptodownApp.f29058B.a0()) {
                if (Q.f14058k.e(UpcomingReleasesActivity.this) == null) {
                    UpcomingReleasesActivity.this.O3();
                    return;
                }
                L l8 = UpcomingReleasesActivity.this.f29935P;
                AbstractC3255y.f(l8);
                Object obj = l8.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                C1632D c1632d = (C1632D) obj;
                if (((ArrayList) UpcomingReleasesActivity.this.A3().o().getValue()).contains(c1632d)) {
                    UpcomingReleasesActivity.this.K3(c1632d);
                } else {
                    AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(UpcomingReleasesActivity.this), null, null, new a(UpcomingReleasesActivity.this, c1632d, null), 3, null);
                }
            }
        }
    }

    public UpcomingReleasesActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.x3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                UpcomingReleasesActivity.H3(UpcomingReleasesActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f29940U = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x A3() {
        return (x) this.f29933N.getValue();
    }

    private final void B3() {
        setContentView(z3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        p0 z32 = z3();
        if (drawable != null) {
            z32.f12463g.setNavigationIcon(drawable);
            z32.f12463g.setNavigationContentDescription(getString(R.string.back));
        }
        z32.f12463g.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.C3(UpcomingReleasesActivity.this, view);
            }
        });
        TextView textView = z32.f12466j;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        z32.f12462f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        z32.f12462f.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        z3().f12462f.addItemDecoration(new q5.m(dimension, dimension));
        z32.f12465i.setTypeface(aVar.u());
        z32.f12459c.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.A3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.D3(view);
            }
        });
        z32.f12464h.setTypeface(aVar.u());
        z32.f12461e.setOnClickListener(new View.OnClickListener() { // from class: D4.B3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.E3(UpcomingReleasesActivity.this, view);
            }
        });
        z32.f12460d.setOnClickListener(new View.OnClickListener() { // from class: D4.C3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.F3(UpcomingReleasesActivity.this, view);
            }
        });
        z32.f12462f.addOnScrollListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        x.a aVar = this$0.f29936Q;
        x.a aVar2 = x.a.NAME;
        if (aVar != aVar2) {
            this$0.f29936Q = aVar2;
        } else {
            this$0.f29937R = !this$0.f29937R;
        }
        this$0.J3();
        this$0.A3().r(false);
        this$0.G3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        x.a aVar = this$0.f29936Q;
        x.a aVar2 = x.a.DATE;
        if (aVar != aVar2) {
            this$0.f29936Q = aVar2;
        } else {
            this$0.f29937R = !this$0.f29937R;
        }
        this$0.J3();
        this$0.A3().r(false);
        this$0.G3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(boolean z8) {
        A3().h(this, this.f29936Q, this.f29937R, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(UpcomingReleasesActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q e8 = Q.f14058k.e(this$0);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.x(this$0)) {
                UptodownApp.a aVar = UptodownApp.f29058B;
                aVar.j0(this$0);
                aVar.i0(this$0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(C1632D c1632d) {
        A3().q(this, c1632d, new f(c1632d, this));
    }

    private final void J3() {
        if (this.f29937R) {
            z3().f12461e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_desc));
            z3().f12460d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_desc));
        } else {
            z3().f12461e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_asc));
            z3().f12460d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_asc));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3(final C1632D c1632d) {
        AlertDialog r22;
        if (!isFinishing()) {
            if (r2() != null && (r22 = r2()) != null) {
                r22.dismiss();
            }
            C1497v c8 = C1497v.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12595f;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            c8.f12595f.setText(getString(R.string.cancel_registration));
            c8.f12593d.setTypeface(aVar.u());
            TextView textView2 = c8.f12593d;
            C3671k c3671k = new C3671k();
            String string = getString(R.string.confirm_cancel_preregister, c1632d.d());
            AbstractC3255y.h(string, "getString(R.string.confi…gister, preRegister.name)");
            String d8 = c1632d.d();
            AbstractC3255y.f(d8);
            textView2.setText(c3671k.d(string, d8, this));
            c8.f12592c.setTypeface(aVar.t());
            c8.f12594e.setTypeface(aVar.t());
            c8.f12594e.setText(getString(R.string.dialog_confirmation_verify_afirmative));
            c8.f12592c.setVisibility(0);
            c8.f12592c.setOnClickListener(new View.OnClickListener() { // from class: D4.F3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.L3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f12594e.setOnClickListener(new View.OnClickListener() { // from class: D4.G3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.M3(UpcomingReleasesActivity.this, c1632d, view);
                }
            });
            c8.f12591b.setOnClickListener(new View.OnClickListener() { // from class: D4.H3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.N3(UpcomingReleasesActivity.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            N2(builder.create());
            if (r2() != null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(UpcomingReleasesActivity this$0, C1632D preRegister, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(preRegister, "$preRegister");
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new g(preRegister, null), 3, null);
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3() {
        AlertDialog r22;
        if (!isFinishing()) {
            if (r2() != null && (r22 = r2()) != null) {
                r22.dismiss();
            }
            C1497v c8 = C1497v.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12595f;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            c8.f12593d.setTypeface(aVar.u());
            c8.f12594e.setTypeface(aVar.t());
            c8.f12594e.setOnClickListener(new View.OnClickListener() { // from class: D4.D3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.P3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f12591b.setOnClickListener(new View.OnClickListener() { // from class: D4.E3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.Q3(UpcomingReleasesActivity.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            N2(builder.create());
            if (r2() != null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f29940U.launch(new Intent(this$0.getApplicationContext(), (Class<?>) LoginActivity.class), UptodownApp.f29058B.b(this$0));
        this$0.f29938S = true;
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(C1632D c1632d) {
        A3().g(this, c1632d, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3(ArrayList arrayList, ArrayList arrayList2) {
        L l8 = this.f29935P;
        if (l8 == null) {
            this.f29935P = new L(arrayList, arrayList2, this, this.f29939T);
            z3().f12462f.setAdapter(this.f29935P);
        } else {
            AbstractC3255y.f(l8);
            l8.d(arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3(String str) {
        if (r2() != null) {
            AlertDialog r22 = r2();
            AbstractC3255y.f(r22);
            r22.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        C1490n c8 = C1490n.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f12428d;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        c8.f12427c.setTypeface(aVar.u());
        TextView textView2 = c8.f12427c;
        C3671k c3671k = new C3671k();
        String string = getString(R.string.pre_register_success, str);
        AbstractC3255y.h(string, "getString(R.string.pre_register_success, appName)");
        textView2.setText(c3671k.d(string, str, this));
        c8.f12426b.setTypeface(aVar.t());
        c8.f12426b.setOnClickListener(new View.OnClickListener() { // from class: D4.y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.y3(UpcomingReleasesActivity.this, view);
            }
        });
        builder.setView(c8.getRoot());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 z3() {
        return (p0) this.f29934O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f29938S) {
            G3(false);
        }
    }
}
