package com.stripe.android.googlepaylauncher;

import O5.C1352h;
import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.s;
import O5.t;
import O5.x;
import P5.Q;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.f;
import com.stripe.android.googlepaylauncher.g;
import com.stripe.android.model.p;
import com.stripe.android.view.InterfaceC2658p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.M;
import n3.i;
import o6.InterfaceC3687A;
import o6.InterfaceC3707g;
import org.json.JSONObject;
import r0.C3901i;
import t0.C4022a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GooglePayLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f24818a = new ViewModelLazy(U.b(g.class), new d(this), new f(), new e(null, this));

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f24819b = l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private GooglePayLauncherContract.a f24820c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n3.i invoke() {
            return i.a.b(n3.i.f35386a, GooglePayLauncherActivity.this, null, 2, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24822a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f24824a;

            a(GooglePayLauncherActivity googlePayLauncherActivity) {
                this.f24824a = googlePayLauncherActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.googlepaylauncher.f fVar, S5.d dVar) {
                if (fVar != null) {
                    this.f24824a.r(fVar);
                }
                return I.f8278a;
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f24822a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3687A m8 = GooglePayLauncherActivity.this.t().m();
                a aVar = new a(GooglePayLauncherActivity.this);
                this.f24822a = 1;
                if (m8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24825a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f24827c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f24828a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f24829b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActivityResultLauncher f24830c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0463a implements InterfaceC3707g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ActivityResultLauncher f24831a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ GooglePayLauncherActivity f24832b;

                C0463a(ActivityResultLauncher activityResultLauncher, GooglePayLauncherActivity googlePayLauncherActivity) {
                    this.f24831a = activityResultLauncher;
                    this.f24832b = googlePayLauncherActivity;
                }

                @Override // o6.InterfaceC3707g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Task task, S5.d dVar) {
                    if (task != null) {
                        this.f24831a.launch(task);
                        this.f24832b.t().q();
                    }
                    return I.f8278a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayLauncherActivity googlePayLauncherActivity, ActivityResultLauncher activityResultLauncher, S5.d dVar) {
                super(2, dVar);
                this.f24829b = googlePayLauncherActivity;
                this.f24830c = activityResultLauncher;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f24829b, this.f24830c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f24828a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    InterfaceC3687A l8 = this.f24829b.t().l();
                    C0463a c0463a = new C0463a(this.f24830c, this.f24829b);
                    this.f24828a = 1;
                    if (l8.collect(c0463a, this) == e8) {
                        return e8;
                    }
                }
                throw new C1352h();
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, S5.d dVar) {
            super(2, dVar);
            this.f24827c = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f24827c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f24825a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayLauncherActivity googlePayLauncherActivity = GooglePayLauncherActivity.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                a aVar = new a(googlePayLauncherActivity, this.f24827c, null);
                this.f24825a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(googlePayLauncherActivity, state, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24833a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f24833a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f24833a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f24834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24835b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f24834a = function0;
            this.f24835b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24834a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f24835b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            GooglePayLauncherContract.a aVar = GooglePayLauncherActivity.this.f24820c;
            if (aVar == null) {
                AbstractC3255y.y("args");
                aVar = null;
            }
            return new g.c(aVar, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(com.stripe.android.googlepaylauncher.f fVar) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(x.a("extra_result", fVar))));
        finish();
    }

    private final n3.i s() {
        return (n3.i) this.f24819b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g t() {
        return (g) this.f24818a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(GooglePayLauncherActivity this$0, C4022a c4022a) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.f(c4022a);
        this$0.v(c4022a);
    }

    private final void v(C4022a c4022a) {
        int v8 = c4022a.b().v();
        if (v8 != 0) {
            if (v8 != 16) {
                Status b8 = c4022a.b();
                AbstractC3255y.h(b8, "getStatus(...)");
                String y8 = b8.y();
                String str = "";
                if (y8 == null) {
                    y8 = "";
                }
                i.b.a(s(), i.d.f35402p, null, Q.k(x.a("status_message", y8), x.a("status_code", String.valueOf(b8.v()))), 2, null);
                g t8 = t();
                int v9 = b8.v();
                String y9 = b8.y();
                if (y9 != null) {
                    str = y9;
                }
                t8.u(new f.c(new RuntimeException("Google Pay failed with error " + v9 + ": " + str)));
                return;
            }
            t().u(f.a.f24926a);
            return;
        }
        C3901i c3901i = (C3901i) c4022a.a();
        if (c3901i != null) {
            t().h(InterfaceC2658p.a.b(InterfaceC2658p.f28950a, this, null, 2, null), p.f25636u.j(new JSONObject(c3901i.u())));
        } else {
            i.b.a(s(), i.f.f35424h, null, null, 6, null);
            t().u(new f.c(new RuntimeException("Google Pay missing result data.")));
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        y4.c.a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        switch (i8) {
            case DefaultLoadControl.DEFAULT_MAX_BUFFER_MS /* 50000 */:
            case 50001:
                g t8 = t();
                if (intent == null) {
                    intent = new Intent();
                }
                t8.r(i8, intent);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b8;
        GooglePayLauncherContract.a a8;
        super.onCreate(bundle);
        try {
            s.a aVar = s.f8302b;
            GooglePayLauncherContract.a.C0464a c0464a = GooglePayLauncherContract.a.f24838a;
            Intent intent = getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            a8 = c0464a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        if (a8 != null) {
            b8 = s.b(a8);
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                this.f24820c = (GooglePayLauncherContract.a) b8;
                AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
                ActivityResultLauncher registerForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: L2.e
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        GooglePayLauncherActivity.u(GooglePayLauncherActivity.this, (C4022a) obj);
                    }
                });
                AbstractC3255y.h(registerForActivityResult, "registerForActivityResult(...)");
                AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(registerForActivityResult, null), 3, null);
                return;
            }
            r(new f.c(e8));
            return;
        }
        throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.".toString());
    }
}
