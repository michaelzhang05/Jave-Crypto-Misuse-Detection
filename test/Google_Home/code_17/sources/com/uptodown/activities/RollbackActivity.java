package com.uptodown.activities;

import D4.W1;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.C1481g0;
import a5.C1639f;
import a6.InterfaceC1668n;
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
import com.uptodown.activities.t;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class RollbackActivity extends W1 implements Z4.B {

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1355k f29848p0 = O5.l.b(new b());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1355k f29849q0 = new ViewModelLazy(U.b(t.class), new e(this), new d(this), new f(null, this));

    /* renamed from: r0, reason: collision with root package name */
    private G4.C f29850r0;

    /* renamed from: s0, reason: collision with root package name */
    private final ActivityResultLauncher f29851s0;

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
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1481g0 invoke() {
            return C1481g0.c(RollbackActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29854a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RollbackActivity f29856a;

            a(RollbackActivity rollbackActivity) {
                this.f29856a = rollbackActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29856a.G4().f12260b.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    this.f29856a.E4(((t.a) ((AbstractC3685y.c) abstractC3685y).a()).a());
                    this.f29856a.G4().f12265g.setVisibility(0);
                    this.f29856a.G4().f12260b.f11842b.setVisibility(8);
                } else if (abstractC3685y instanceof AbstractC3685y.b) {
                    this.f29856a.G4().f12260b.f11842b.setVisibility(8);
                    this.f29856a.G4().f12264f.setVisibility(0);
                    this.f29856a.G4().f12264f.setText(this.f29856a.getString(R.string.no_results));
                }
                return O5.I.f8278a;
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
            int i8 = this.f29854a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L d8 = RollbackActivity.this.H4().d();
                a aVar = new a(RollbackActivity.this);
                this.f29854a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f29857a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29857a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29858a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f29858a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29858a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29859a = function0;
            this.f29860b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29859a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29860b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public RollbackActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.b3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                RollbackActivity.F4(RollbackActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…rollback)\n        }\n    }");
        this.f29851s0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E4(ArrayList arrayList) {
        G4.C c8 = this.f29850r0;
        if (c8 == null) {
            this.f29850r0 = new G4.C(arrayList, this, this);
            G4().f12261c.setAdapter(this.f29850r0);
        } else {
            AbstractC3255y.f(c8);
            c8.d(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(RollbackActivity this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.O2();
            this$0.G4().f12263e.setVisibility(8);
            this$0.G4().f12264f.setText(this$0.getString(R.string.msg_checking_device_rollback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1481g0 G4() {
        return (C1481g0) this.f29848p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t H4() {
        return (t) this.f29849q0.getValue();
    }

    private final void I4() {
        setContentView(G4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            G4().f12262d.setNavigationIcon(drawable);
            G4().f12262d.setNavigationContentDescription(getString(R.string.back));
        }
        G4().f12262d.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.c3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.J4(RollbackActivity.this, view);
            }
        });
        TextView textView = G4().f12266h;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        G4().f12261c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        G4().f12261c.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        G4().f12261c.addItemDecoration(new q5.m(dimension, dimension));
        G4().f12264f.setTypeface(aVar.u());
        if (!SettingsPreferences.f30353b.k0(this)) {
            G4().f12264f.setText(getString(R.string.msg_permissions_rollback));
        }
        G4().f12265g.setTypeface(aVar.u());
        G4().f12263e.setTypeface(aVar.u());
        G4().f12263e.setOnClickListener(new View.OnClickListener() { // from class: D4.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.K4(RollbackActivity.this, view);
            }
        });
        G4().f12260b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.L4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J4(RollbackActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K4(RollbackActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
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
        this.f29851s0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f29058B.b(this));
    }

    @Override // Z4.B
    public void a(int i8) {
        G4.C c8;
        if (UptodownApp.f29058B.a0() && (c8 = this.f29850r0) != null) {
            AbstractC3255y.f(c8);
            if (i8 < c8.a().size()) {
                G4.C c9 = this.f29850r0;
                AbstractC3255y.f(c9);
                if (((C1639f) c9.a().get(i8)).b() != 0) {
                    G4.C c10 = this.f29850r0;
                    AbstractC3255y.f(c10);
                    Object obj = c10.a().get(i8);
                    AbstractC3255y.h(obj, "adapter!!.rollbackApps[position]");
                    m4((C1639f) obj);
                }
            }
        }
    }

    @Override // D4.W1
    protected void o4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I4();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        M4(true);
    }
}
