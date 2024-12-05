package com.uptodown.activities;

import A4.V1;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1386t;
import T4.j0;
import W4.InterfaceC1479b;
import X4.C1496f;
import X4.C1498h;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.x;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3323k;
import l5.C3335w;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class SecurityActivity extends V1 {

    /* renamed from: r0, reason: collision with root package name */
    private boolean f28840r0;

    /* renamed from: s0, reason: collision with root package name */
    private D4.F f28841s0;

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1227k f28838p0 = L5.l.b(new a());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28839q0 = new ViewModelLazy(U.b(x.class), new h(this), new g(this), new i(null, this));

    /* renamed from: t0, reason: collision with root package name */
    private k f28842t0 = new k();

    /* renamed from: u0, reason: collision with root package name */
    private final c f28843u0 = new c();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            return j0.c(SecurityActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28845a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f28847c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28848a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f28849b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0 j0Var, P5.d dVar) {
                super(2, dVar);
                this.f28849b = j0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28849b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28848a == 0) {
                    L5.t.b(obj);
                    this.f28849b.f10707c.f10185b.setVisibility(0);
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var, P5.d dVar) {
            super(2, dVar);
            this.f28847c = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f28847c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28845a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                J0 c8 = C2812b0.c();
                a aVar = new a(this.f28847c, null);
                this.f28845a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            SecurityActivity.this.j4();
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1479b {
        c() {
        }

        @Override // W4.InterfaceC1479b
        public void a(int i8) {
            if (UptodownApp.f28003B.a0() && !SecurityActivity.this.f28840r0) {
                D4.F f8 = SecurityActivity.this.f28841s0;
                AbstractC3159y.f(f8);
                if (f8.b().get(i8) instanceof C1496f) {
                    D4.F f9 = SecurityActivity.this.f28841s0;
                    AbstractC3159y.f(f9);
                    Object obj = f9.b().get(i8);
                    AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    SecurityActivity.this.J4((C1496f) obj);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28851a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SecurityActivity f28853a;

            a(SecurityActivity securityActivity) {
                this.f28853a = securityActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28853a.O4().f10707c.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((x.a) cVar.a()).a().isEmpty()) {
                        this.f28853a.O4().f10708d.setVisibility(0);
                        this.f28853a.O4().f10709e.setVisibility(8);
                        this.f28853a.O4().f10712h.setText(this.f28853a.getString(R.string.uptodown_last_analysis, String.valueOf(new C3323k().m(SettingsPreferences.f29323b.r(this.f28853a)))));
                    } else {
                        this.f28853a.O4().f10709e.setVisibility(0);
                        this.f28853a.O4().f10708d.setVisibility(8);
                        this.f28853a.X4(((x.a) cVar.a()).a());
                    }
                    this.f28853a.O4().f10707c.f10185b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6487a;
            }
        }

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
            Object e8 = Q5.b.e();
            int i8 = this.f28851a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K b8 = SecurityActivity.this.P4().b();
                a aVar = new a(SecurityActivity.this);
                this.f28851a = 1;
                if (b8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1496f f28855b;

        e(C1496f c1496f) {
            this.f28855b = c1496f;
        }

        @Override // W4.r
        public void c(int i8) {
            SecurityActivity securityActivity = SecurityActivity.this;
            String string = securityActivity.getString(R.string.rollback_not_available, this.f28855b.I());
            AbstractC3159y.h(string, "getString(R.string.rollb…ilable, appSelected.name)");
            securityActivity.d2(string);
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (appInfo.c()) {
                Intent intent = new Intent(SecurityActivity.this.getApplicationContext(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f28855b);
                intent.putExtra("appInfo", appInfo);
                SecurityActivity securityActivity = SecurityActivity.this;
                securityActivity.startActivity(intent, UptodownApp.f28003B.a(securityActivity));
                return;
            }
            SecurityActivity securityActivity2 = SecurityActivity.this;
            String string = securityActivity2.getString(R.string.rollback_not_available, appInfo.s0());
            AbstractC3159y.h(string, "getString(R.string.rollb…_available, appInfo.name)");
            securityActivity2.d2(string);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28856a;

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28856a == 0) {
                L5.t.b(obj);
                SecurityActivity.this.O4().f10707c.f10185b.setVisibility(8);
                SecurityActivity.this.O4().f10712h.setText(SecurityActivity.this.getString(R.string.uptodown_last_analysis, String.valueOf(new C3323k().m(SettingsPreferences.f29323b.r(SecurityActivity.this)))));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f28858a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28858a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28859a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28859a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28860a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28860a = function0;
            this.f28861b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28860a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28861b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28862a;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28862a == 0) {
                L5.t.b(obj);
                SecurityActivity.this.W4();
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements W4.G {
        k() {
        }

        @Override // W4.G
        public void a() {
        }

        @Override // W4.G
        public void b() {
            SecurityActivity.this.j4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J4(final C1496f c1496f) {
        if (!isFinishing() && c1496f != null) {
            C1386t c8 = C1386t.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            N2(new AlertDialog.Builder(this).setView(c8.getRoot()).create());
            TextView textView = c8.f10893c;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            c8.f10893c.setText(c1496f.I());
            if (c1496f.Q() != null && c1496f.z() != null && c1496f.c() > 0) {
                c8.f10892b.setTypeface(aVar.u());
                c8.f10892b.setOnClickListener(new View.OnClickListener() { // from class: A4.o3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.K4(SecurityActivity.this, c1496f, view);
                    }
                });
                c8.f10896f.setTypeface(aVar.u());
                c8.f10896f.setOnClickListener(new View.OnClickListener() { // from class: A4.p3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.L4(SecurityActivity.this, c1496f, view);
                    }
                });
                c8.f10894d.setTypeface(aVar.u());
                c8.f10894d.setOnClickListener(new View.OnClickListener() { // from class: A4.q3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.M4(SecurityActivity.this, c1496f, view);
                    }
                });
            } else {
                c8.f10892b.setVisibility(8);
                c8.f10896f.setVisibility(8);
                c8.f10894d.setVisibility(8);
            }
            if (!g6.n.s(getPackageName(), c1496f.Q(), true)) {
                c8.f10895e.setTypeface(aVar.u());
                c8.f10895e.setOnClickListener(new View.OnClickListener() { // from class: A4.r3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.N4(C1496f.this, this, view);
                    }
                });
            } else {
                c8.f10895e.setVisibility(8);
            }
            if (!isFinishing()) {
                AlertDialog r22 = r2();
                AbstractC3159y.f(r22);
                Window window = r22.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog r23 = r2();
                AbstractC3159y.f(r23);
                r23.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K4(SecurityActivity this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.F2(c1496f.c());
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(SecurityActivity this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.I2(c1496f.X());
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(SecurityActivity this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.V4(c1496f);
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(C1496f c1496f, SecurityActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (c1496f.Q() != null) {
            E4.i iVar = new E4.i(this$0);
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            iVar.h(Q8);
        }
        AlertDialog r22 = this$0.r2();
        AbstractC3159y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 O4() {
        return (j0) this.f28838p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x P4() {
        return (x) this.f28839q0.getValue();
    }

    private final void Q4() {
        setContentView(O4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            O4().f10710f.setNavigationIcon(drawable);
            O4().f10710f.setNavigationContentDescription(getString(R.string.back));
        }
        final j0 O42 = O4();
        O42.f10710f.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.l3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.R4(SecurityActivity.this, view);
            }
        });
        TextView textView = O42.f10714j;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        O42.f10709e.setLayoutManager(new LinearLayoutManager(this, 1, false));
        O42.f10709e.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) O42.f10709e.getItemAnimator();
        AbstractC3159y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        O42.f10709e.addItemDecoration(new n5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        O42.f10707c.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.m3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.S4(view);
            }
        });
        O42.f10713i.setTypeface(aVar.t());
        O42.f10712h.setTypeface(aVar.u());
        O42.f10711g.setTypeface(aVar.t());
        O42.f10711g.setOnClickListener(new View.OnClickListener() { // from class: A4.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.T4(SecurityActivity.this, O42, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(SecurityActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(SecurityActivity this$0, j0 this_with, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(this_with, "$this_with");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C2812b0.b(), null, new b(this_with, null), 2, null);
    }

    private final void U4() {
        P4().a(this);
    }

    private final void V4(C1496f c1496f) {
        new S4.i(this, c1496f.c(), new e(c1496f), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4(ArrayList arrayList) {
        D4.F f8 = this.f28841s0;
        if (f8 == null) {
            c cVar = this.f28843u0;
            k kVar = this.f28842t0;
            AbstractC3159y.f(kVar);
            this.f28841s0 = new D4.F(arrayList, this, cVar, kVar);
            O4().f10709e.setAdapter(this.f28841s0);
            return;
        }
        AbstractC3159y.f(f8);
        f8.c(arrayList);
    }

    public final void W4() {
        if (O4().f10707c.f10185b.getVisibility() == 8) {
            j4();
            U4();
        }
    }

    public final void Y4() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new j(null), 2, null);
    }

    @Override // A4.V1
    protected void o4() {
        U4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new d(null), 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3159y.i(event, "event");
        if (i8 == 82) {
            O4().f10710f.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        j4();
        C3335w.f34546a.g(this);
    }
}
