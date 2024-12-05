package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1381n;
import T4.C1388v;
import T4.p0;
import X4.Q;
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
import com.uptodown.activities.y;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3323k;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class UpcomingReleasesActivity extends AbstractActivityC2489a {

    /* renamed from: V, reason: collision with root package name */
    public static final a f28878V = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private D4.L f28881P;

    /* renamed from: S, reason: collision with root package name */
    private boolean f28884S;

    /* renamed from: U, reason: collision with root package name */
    private final ActivityResultLauncher f28886U;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1227k f28879N = new ViewModelLazy(U.b(y.class), new i(this), new h(this), new j(null, this));

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28880O = L5.l.b(new b());

    /* renamed from: Q, reason: collision with root package name */
    private y.a f28882Q = y.a.DATE;

    /* renamed from: R, reason: collision with root package name */
    private boolean f28883R = true;

    /* renamed from: T, reason: collision with root package name */
    private final k f28885T = new k();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
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
    public static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5571invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5571invoke() {
            UpcomingReleasesActivity.this.G3(true);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !UpcomingReleasesActivity.this.A3().l() && !UpcomingReleasesActivity.this.A3().j() && recyclerView.getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager);
                int childCount = layoutManager.getChildCount();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager2);
                int itemCount = layoutManager2.getItemCount();
                RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager3);
                if (childCount + ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition() >= itemCount - 10) {
                    D4.L l8 = UpcomingReleasesActivity.this.f28881P;
                    if (l8 != null) {
                        l8.e(true);
                    }
                    y A32 = UpcomingReleasesActivity.this.A3();
                    UpcomingReleasesActivity upcomingReleasesActivity = UpcomingReleasesActivity.this;
                    A32.i(upcomingReleasesActivity, upcomingReleasesActivity.f28882Q, UpcomingReleasesActivity.this.f28883R);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28890a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f28892a;

            a(UpcomingReleasesActivity upcomingReleasesActivity) {
                this.f28892a = upcomingReleasesActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                D4.L l8;
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28892a.z3().f10802c.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f28892a.w3(((y.b) cVar.a()).b(), ((y.b) cVar.a()).a());
                    if (((y.b) cVar.a()).b().isEmpty() && ((y.b) cVar.a()).a().isEmpty()) {
                        this.f28892a.z3().f10808i.setVisibility(0);
                    }
                    D4.L l9 = this.f28892a.f28881P;
                    if (l9 != null) {
                        l9.e(false);
                    }
                    this.f28892a.z3().f10802c.f10185b.setVisibility(8);
                    this.f28892a.z3().f10801b.setVisibility(0);
                } else if ((abstractC3337y instanceof AbstractC3337y.b) && (l8 = this.f28892a.f28881P) != null) {
                    l8.e(false);
                }
                return L5.I.f6487a;
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
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28890a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K k8 = UpcomingReleasesActivity.this.A3().k();
                a aVar = new a(UpcomingReleasesActivity.this);
                this.f28890a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X4.D f28893a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UpcomingReleasesActivity f28894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(X4.D d8, UpcomingReleasesActivity upcomingReleasesActivity) {
            super(0);
            this.f28893a = d8;
            this.f28894b = upcomingReleasesActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5572invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5572invoke() {
            String d8 = this.f28893a.d();
            if (d8 != null && d8.length() != 0) {
                UpcomingReleasesActivity upcomingReleasesActivity = this.f28894b;
                String d9 = this.f28893a.d();
                AbstractC3159y.f(d9);
                upcomingReleasesActivity.x3(d9);
            }
            this.f28894b.G3(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28895a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.D f28897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(X4.D d8, P5.d dVar) {
            super(2, dVar);
            this.f28897c = d8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28897c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28895a == 0) {
                L5.t.b(obj);
                UpcomingReleasesActivity.this.v3(this.f28897c);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28898a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28898a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28898a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28899a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f28899a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28899a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28900a = function0;
            this.f28901b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28900a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28901b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements W4.J {

        /* loaded from: classes4.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28903a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f28904b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.D f28905c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UpcomingReleasesActivity upcomingReleasesActivity, X4.D d8, P5.d dVar) {
                super(2, dVar);
                this.f28904b = upcomingReleasesActivity;
                this.f28905c = d8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28904b, this.f28905c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28903a == 0) {
                    L5.t.b(obj);
                    this.f28904b.I3(this.f28905c);
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        k() {
        }

        @Override // W4.J
        public void a(int i8) {
            if (UptodownApp.f28003B.a0() && UpcomingReleasesActivity.this.f28881P != null) {
                AbstractC3159y.f(UpcomingReleasesActivity.this.f28881P);
                if (!r0.b().isEmpty()) {
                    D4.L l8 = UpcomingReleasesActivity.this.f28881P;
                    AbstractC3159y.f(l8);
                    if (l8.b().get(i8) instanceof X4.D) {
                        D4.L l9 = UpcomingReleasesActivity.this.f28881P;
                        AbstractC3159y.f(l9);
                        Object obj = l9.b().get(i8);
                        AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                        UpcomingReleasesActivity.this.F2(((X4.D) obj).b());
                    }
                }
            }
        }

        @Override // W4.J
        public void e(int i8) {
            if (UptodownApp.f28003B.a0()) {
                if (Q.f12437k.e(UpcomingReleasesActivity.this) == null) {
                    UpcomingReleasesActivity.this.O3();
                    return;
                }
                D4.L l8 = UpcomingReleasesActivity.this.f28881P;
                AbstractC3159y.f(l8);
                Object obj = l8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                X4.D d8 = (X4.D) obj;
                if (((ArrayList) UpcomingReleasesActivity.this.A3().o().getValue()).contains(d8)) {
                    UpcomingReleasesActivity.this.K3(d8);
                } else {
                    AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(UpcomingReleasesActivity.this), null, null, new a(UpcomingReleasesActivity.this, d8, null), 3, null);
                }
            }
        }
    }

    public UpcomingReleasesActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.w3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                UpcomingReleasesActivity.H3(UpcomingReleasesActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f28886U = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y A3() {
        return (y) this.f28879N.getValue();
    }

    private final void B3() {
        setContentView(z3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        p0 z32 = z3();
        if (drawable != null) {
            z32.f10806g.setNavigationIcon(drawable);
            z32.f10806g.setNavigationContentDescription(getString(R.string.back));
        }
        z32.f10806g.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.C3(UpcomingReleasesActivity.this, view);
            }
        });
        TextView textView = z32.f10809j;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        z32.f10805f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        z32.f10805f.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        z3().f10805f.addItemDecoration(new n5.m(dimension, dimension));
        z32.f10808i.setTypeface(aVar.u());
        z32.f10802c.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.D3(view);
            }
        });
        z32.f10807h.setTypeface(aVar.u());
        z32.f10804e.setOnClickListener(new View.OnClickListener() { // from class: A4.A3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.E3(UpcomingReleasesActivity.this, view);
            }
        });
        z32.f10803d.setOnClickListener(new View.OnClickListener() { // from class: A4.B3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.F3(UpcomingReleasesActivity.this, view);
            }
        });
        z32.f10805f.addOnScrollListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        y.a aVar = this$0.f28882Q;
        y.a aVar2 = y.a.NAME;
        if (aVar != aVar2) {
            this$0.f28882Q = aVar2;
        } else {
            this$0.f28883R = !this$0.f28883R;
        }
        this$0.J3();
        this$0.A3().r(false);
        this$0.G3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        y.a aVar = this$0.f28882Q;
        y.a aVar2 = y.a.DATE;
        if (aVar != aVar2) {
            this$0.f28882Q = aVar2;
        } else {
            this$0.f28883R = !this$0.f28883R;
        }
        this$0.J3();
        this$0.A3().r(false);
        this$0.G3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(boolean z8) {
        A3().h(this, this.f28882Q, this.f28883R, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(UpcomingReleasesActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q e8 = Q.f12437k.e(this$0);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.z(this$0)) {
                UptodownApp.a aVar = UptodownApp.f28003B;
                aVar.j0(this$0);
                aVar.i0(this$0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(X4.D d8) {
        A3().q(this, d8, new f(d8, this));
    }

    private final void J3() {
        if (this.f28883R) {
            z3().f10804e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_desc));
            z3().f10803d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_desc));
        } else {
            z3().f10804e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_asc));
            z3().f10803d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_asc));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3(final X4.D d8) {
        AlertDialog r22;
        if (!isFinishing()) {
            if (r2() != null && (r22 = r2()) != null) {
                r22.dismiss();
            }
            C1388v c8 = C1388v.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10938f;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            c8.f10938f.setText(getString(R.string.cancel_registration));
            c8.f10936d.setTypeface(aVar.u());
            TextView textView2 = c8.f10936d;
            C3323k c3323k = new C3323k();
            String string = getString(R.string.confirm_cancel_preregister, d8.d());
            AbstractC3159y.h(string, "getString(R.string.confi…gister, preRegister.name)");
            String d9 = d8.d();
            AbstractC3159y.f(d9);
            textView2.setText(c3323k.d(string, d9, this));
            c8.f10935c.setTypeface(aVar.t());
            c8.f10937e.setTypeface(aVar.t());
            c8.f10937e.setText(getString(R.string.dialog_confirmation_verify_afirmative));
            c8.f10935c.setVisibility(0);
            c8.f10935c.setOnClickListener(new View.OnClickListener() { // from class: A4.E3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.L3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f10937e.setOnClickListener(new View.OnClickListener() { // from class: A4.F3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.M3(UpcomingReleasesActivity.this, d8, view);
                }
            });
            c8.f10934b.setOnClickListener(new View.OnClickListener() { // from class: A4.G3
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(UpcomingReleasesActivity this$0, X4.D preRegister, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(preRegister, "$preRegister");
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new g(preRegister, null), 3, null);
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3() {
        AlertDialog r22;
        if (!isFinishing()) {
            if (r2() != null && (r22 = r2()) != null) {
                r22.dismiss();
            }
            C1388v c8 = C1388v.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10938f;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            c8.f10936d.setTypeface(aVar.u());
            c8.f10937e.setTypeface(aVar.t());
            c8.f10937e.setOnClickListener(new View.OnClickListener() { // from class: A4.C3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.P3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f10934b.setOnClickListener(new View.OnClickListener() { // from class: A4.D3
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f28886U.launch(new Intent(this$0.getApplicationContext(), (Class<?>) LoginActivity.class), UptodownApp.f28003B.b(this$0));
        this$0.f28884S = true;
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(X4.D d8) {
        A3().g(this, d8, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3(ArrayList arrayList, ArrayList arrayList2) {
        D4.L l8 = this.f28881P;
        if (l8 == null) {
            this.f28881P = new D4.L(arrayList, arrayList2, this, this.f28885T);
            z3().f10805f.setAdapter(this.f28881P);
        } else {
            AbstractC3159y.f(l8);
            l8.d(arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3(String str) {
        if (r2() != null) {
            AlertDialog r22 = r2();
            AbstractC3159y.f(r22);
            r22.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        C1381n c8 = C1381n.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f10771d;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        c8.f10770c.setTypeface(aVar.u());
        TextView textView2 = c8.f10770c;
        C3323k c3323k = new C3323k();
        String string = getString(R.string.pre_register_success, str);
        AbstractC3159y.h(string, "getString(R.string.pre_register_success, appName)");
        textView2.setText(c3323k.d(string, str, this));
        c8.f10769b.setTypeface(aVar.t());
        c8.f10769b.setOnClickListener(new View.OnClickListener() { // from class: A4.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.y3(UpcomingReleasesActivity.this, view);
            }
        });
        builder.setView(c8.getRoot());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 z3() {
        return (p0) this.f28880O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f28884S) {
            G3(false);
        }
    }
}
