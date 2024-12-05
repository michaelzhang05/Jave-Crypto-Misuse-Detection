package com.uptodown.activities;

import D4.W1;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.C1495t;
import W4.j0;
import Z4.InterfaceC1588b;
import a5.C1639f;
import a5.C1641h;
import a6.InterfaceC1668n;
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
import com.uptodown.activities.w;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3671k;
import o5.C3683w;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class SecurityActivity extends W1 {

    /* renamed from: r0, reason: collision with root package name */
    private boolean f29894r0;

    /* renamed from: s0, reason: collision with root package name */
    private G4.F f29895s0;

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1355k f29892p0 = O5.l.b(new a());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1355k f29893q0 = new ViewModelLazy(U.b(w.class), new h(this), new g(this), new i(null, this));

    /* renamed from: t0, reason: collision with root package name */
    private k f29896t0 = new k();

    /* renamed from: u0, reason: collision with root package name */
    private final c f29897u0 = new c();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
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
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29899a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f29901c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29902a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f29903b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0 j0Var, S5.d dVar) {
                super(2, dVar);
                this.f29903b = j0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29903b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29902a == 0) {
                    O5.t.b(obj);
                    this.f29903b.f12364c.f11842b.setVisibility(0);
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
        b(j0 j0Var, S5.d dVar) {
            super(2, dVar);
            this.f29901c = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f29901c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29899a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                J0 c8 = C3347b0.c();
                a aVar = new a(this.f29901c, null);
                this.f29899a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            SecurityActivity.this.j4();
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1588b {
        c() {
        }

        @Override // Z4.InterfaceC1588b
        public void a(int i8) {
            if (UptodownApp.f29058B.a0() && !SecurityActivity.this.f29894r0) {
                G4.F f8 = SecurityActivity.this.f29895s0;
                AbstractC3255y.f(f8);
                if (f8.b().get(i8) instanceof C1639f) {
                    G4.F f9 = SecurityActivity.this.f29895s0;
                    AbstractC3255y.f(f9);
                    Object obj = f9.b().get(i8);
                    AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    SecurityActivity.this.J4((C1639f) obj);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29905a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SecurityActivity f29907a;

            a(SecurityActivity securityActivity) {
                this.f29907a = securityActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29907a.O4().f12364c.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (((w.a) cVar.a()).a().isEmpty()) {
                        this.f29907a.O4().f12365d.setVisibility(0);
                        this.f29907a.O4().f12366e.setVisibility(8);
                        this.f29907a.O4().f12369h.setText(this.f29907a.getString(R.string.uptodown_last_analysis, String.valueOf(new C3671k().m(SettingsPreferences.f30353b.r(this.f29907a)))));
                    } else {
                        this.f29907a.O4().f12366e.setVisibility(0);
                        this.f29907a.O4().f12365d.setVisibility(8);
                        this.f29907a.X4(((w.a) cVar.a()).a());
                    }
                    this.f29907a.O4().f12364c.f11842b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29905a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L b8 = SecurityActivity.this.P4().b();
                a aVar = new a(SecurityActivity.this);
                this.f29905a = 1;
                if (b8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Z4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1639f f29909b;

        e(C1639f c1639f) {
            this.f29909b = c1639f;
        }

        @Override // Z4.r
        public void c(int i8) {
            SecurityActivity securityActivity = SecurityActivity.this;
            String string = securityActivity.getString(R.string.rollback_not_available, this.f29909b.z());
            AbstractC3255y.h(string, "getString(R.string.rollb…ilable, appSelected.name)");
            securityActivity.d2(string);
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (appInfo.b()) {
                Intent intent = new Intent(SecurityActivity.this.getApplicationContext(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f29909b);
                intent.putExtra("appInfo", appInfo);
                SecurityActivity securityActivity = SecurityActivity.this;
                securityActivity.startActivity(intent, UptodownApp.f29058B.a(securityActivity));
                return;
            }
            SecurityActivity securityActivity2 = SecurityActivity.this;
            String string = securityActivity2.getString(R.string.rollback_not_available, appInfo.s0());
            AbstractC3255y.h(string, "getString(R.string.rollb…_available, appInfo.name)");
            securityActivity2.d2(string);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29910a;

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29910a == 0) {
                O5.t.b(obj);
                SecurityActivity.this.O4().f12364c.f11842b.setVisibility(8);
                SecurityActivity.this.O4().f12369h.setText(SecurityActivity.this.getString(R.string.uptodown_last_analysis, String.valueOf(new C3671k().m(SettingsPreferences.f30353b.r(SecurityActivity.this)))));
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
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f29912a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29912a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f29913a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29913a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29915b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29914a = function0;
            this.f29915b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29914a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29915b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29916a;

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29916a == 0) {
                O5.t.b(obj);
                SecurityActivity.this.W4();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Z4.G {
        k() {
        }

        @Override // Z4.G
        public void a() {
        }

        @Override // Z4.G
        public void b() {
            SecurityActivity.this.j4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J4(final C1639f c1639f) {
        if (!isFinishing() && c1639f != null) {
            C1495t c8 = C1495t.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            N2(new AlertDialog.Builder(this).setView(c8.getRoot()).create());
            TextView textView = c8.f12550c;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            c8.f12550c.setText(c1639f.z());
            if (c1639f.J() != null && c1639f.x() != null && c1639f.b() > 0) {
                c8.f12549b.setTypeface(aVar.u());
                c8.f12549b.setOnClickListener(new View.OnClickListener() { // from class: D4.p3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.K4(SecurityActivity.this, c1639f, view);
                    }
                });
                c8.f12553f.setTypeface(aVar.u());
                c8.f12553f.setOnClickListener(new View.OnClickListener() { // from class: D4.q3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.L4(SecurityActivity.this, c1639f, view);
                    }
                });
                c8.f12551d.setTypeface(aVar.u());
                c8.f12551d.setOnClickListener(new View.OnClickListener() { // from class: D4.r3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.M4(SecurityActivity.this, c1639f, view);
                    }
                });
            } else {
                c8.f12549b.setVisibility(8);
                c8.f12553f.setVisibility(8);
                c8.f12551d.setVisibility(8);
            }
            if (!j6.n.s(getPackageName(), c1639f.J(), true)) {
                c8.f12552e.setTypeface(aVar.u());
                c8.f12552e.setOnClickListener(new View.OnClickListener() { // from class: D4.s3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.N4(C1639f.this, this, view);
                    }
                });
            } else {
                c8.f12552e.setVisibility(8);
            }
            if (!isFinishing()) {
                AlertDialog r22 = r2();
                AbstractC3255y.f(r22);
                Window window = r22.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog r23 = r2();
                AbstractC3255y.f(r23);
                r23.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K4(SecurityActivity this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.F2(c1639f.b());
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(SecurityActivity this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.I2(c1639f.X());
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(SecurityActivity this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.V4(c1639f);
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(C1639f c1639f, SecurityActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (c1639f.J() != null) {
            H4.i iVar = new H4.i(this$0);
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            iVar.h(J8);
        }
        AlertDialog r22 = this$0.r2();
        AbstractC3255y.f(r22);
        r22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 O4() {
        return (j0) this.f29892p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w P4() {
        return (w) this.f29893q0.getValue();
    }

    private final void Q4() {
        setContentView(O4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            O4().f12367f.setNavigationIcon(drawable);
            O4().f12367f.setNavigationContentDescription(getString(R.string.back));
        }
        final j0 O42 = O4();
        O42.f12367f.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.m3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.R4(SecurityActivity.this, view);
            }
        });
        TextView textView = O42.f12371j;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        O42.f12366e.setLayoutManager(new LinearLayoutManager(this, 1, false));
        O42.f12366e.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) O42.f12366e.getItemAnimator();
        AbstractC3255y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        O42.f12366e.addItemDecoration(new q5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        O42.f12364c.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.S4(view);
            }
        });
        O42.f12370i.setTypeface(aVar.t());
        O42.f12369h.setTypeface(aVar.u());
        O42.f12368g.setTypeface(aVar.t());
        O42.f12368g.setOnClickListener(new View.OnClickListener() { // from class: D4.o3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.T4(SecurityActivity.this, O42, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(SecurityActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(SecurityActivity this$0, j0 this_with, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(this_with, "$this_with");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C3347b0.b(), null, new b(this_with, null), 2, null);
    }

    private final void U4() {
        P4().a(this);
    }

    private final void V4(C1639f c1639f) {
        new V4.i(this, c1639f.b(), new e(c1639f), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4(ArrayList arrayList) {
        G4.F f8 = this.f29895s0;
        if (f8 == null) {
            c cVar = this.f29897u0;
            k kVar = this.f29896t0;
            AbstractC3255y.f(kVar);
            this.f29895s0 = new G4.F(arrayList, this, cVar, kVar);
            O4().f12366e.setAdapter(this.f29895s0);
            return;
        }
        AbstractC3255y.f(f8);
        f8.c(arrayList);
    }

    public final void W4() {
        if (O4().f12364c.f11842b.getVisibility() == 8) {
            j4();
            U4();
        }
    }

    public final void Y4() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new j(null), 2, null);
    }

    @Override // D4.W1
    protected void o4() {
        U4();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q4();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new d(null), 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3255y.i(event, "event");
        if (i8 == 82) {
            O4().f12367f.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        j4();
        C3683w.f36547a.g(this);
    }
}
