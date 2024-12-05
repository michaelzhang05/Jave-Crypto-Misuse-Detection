package com.uptodown.activities;

import A4.V1;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1372g0;
import X4.C1496f;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
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
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.u;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class RollbackActivity extends V1 implements W4.B {

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1227k f28794p0 = L5.l.b(new b());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28795q0 = new ViewModelLazy(U.b(u.class), new e(this), new d(this), new f(null, this));

    /* renamed from: r0, reason: collision with root package name */
    private D4.C f28796r0;

    /* renamed from: s0, reason: collision with root package name */
    private final ActivityResultLauncher f28797s0;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RollbackActivity.this.M4(false);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1372g0 invoke() {
            return C1372g0.c(RollbackActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28800a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RollbackActivity f28802a;

            a(RollbackActivity rollbackActivity) {
                this.f28802a = rollbackActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28802a.G4().f10603b.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    this.f28802a.E4(((u.a) ((AbstractC3337y.c) abstractC3337y).a()).a());
                    this.f28802a.G4().f10608g.setVisibility(0);
                    this.f28802a.G4().f10603b.f10185b.setVisibility(8);
                } else if (abstractC3337y instanceof AbstractC3337y.b) {
                    this.f28802a.G4().f10603b.f10185b.setVisibility(8);
                    this.f28802a.G4().f10607f.setVisibility(0);
                    this.f28802a.G4().f10607f.setText(this.f28802a.getString(R.string.no_results));
                }
                return L5.I.f6487a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28800a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K d8 = RollbackActivity.this.H4().d();
                a aVar = new a(RollbackActivity.this);
                this.f28800a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f28803a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28803a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f28804a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28804a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28805a = function0;
            this.f28806b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28805a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28806b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public RollbackActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.a3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                RollbackActivity.F4(RollbackActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…rollback)\n        }\n    }");
        this.f28797s0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E4(ArrayList arrayList) {
        D4.C c8 = this.f28796r0;
        if (c8 == null) {
            this.f28796r0 = new D4.C(arrayList, this, this);
            G4().f10604c.setAdapter(this.f28796r0);
        } else {
            AbstractC3159y.f(c8);
            c8.d(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(RollbackActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.O2();
            this$0.G4().f10606e.setVisibility(8);
            this$0.G4().f10607f.setText(this$0.getString(R.string.msg_checking_device_rollback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1372g0 G4() {
        return (C1372g0) this.f28794p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u H4() {
        return (u) this.f28795q0.getValue();
    }

    private final void I4() {
        setContentView(G4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            G4().f10605d.setNavigationIcon(drawable);
            G4().f10605d.setNavigationContentDescription(getString(R.string.back));
        }
        G4().f10605d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.J4(RollbackActivity.this, view);
            }
        });
        TextView textView = G4().f10609h;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        G4().f10604c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        G4().f10604c.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        G4().f10604c.addItemDecoration(new n5.m(dimension, dimension));
        G4().f10607f.setTypeface(aVar.u());
        if (!SettingsPreferences.f29323b.k0(this)) {
            G4().f10607f.setText(getString(R.string.msg_permissions_rollback));
        }
        G4().f10608g.setTypeface(aVar.u());
        G4().f10606e.setTypeface(aVar.u());
        G4().f10606e.setOnClickListener(new View.OnClickListener() { // from class: A4.c3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.K4(RollbackActivity.this, view);
            }
        });
        G4().f10603b.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.L4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J4(RollbackActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K4(RollbackActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.N4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M4(boolean z8) {
        H4().c(this, z8);
    }

    private final void N4() {
        this.f28797s0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f28003B.b(this));
    }

    @Override // W4.B
    public void a(int i8) {
        D4.C c8;
        if (UptodownApp.f28003B.a0() && (c8 = this.f28796r0) != null) {
            AbstractC3159y.f(c8);
            if (i8 < c8.a().size()) {
                D4.C c9 = this.f28796r0;
                AbstractC3159y.f(c9);
                if (((C1496f) c9.a().get(i8)).c() != 0) {
                    D4.C c10 = this.f28796r0;
                    AbstractC3159y.f(c10);
                    Object obj = c10.a().get(i8);
                    AbstractC3159y.h(obj, "adapter!!.rollbackApps[position]");
                    m4((C1496f) obj);
                }
            }
        }
    }

    @Override // A4.V1
    protected void o4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        M4(true);
    }
}
