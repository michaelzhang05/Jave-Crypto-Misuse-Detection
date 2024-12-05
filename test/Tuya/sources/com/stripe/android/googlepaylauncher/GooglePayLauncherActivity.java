package com.stripe.android.googlepaylauncher;

import L5.C1224h;
import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.s;
import L5.t;
import L5.x;
import M5.Q;
import X5.n;
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
import com.stripe.android.view.InterfaceC2464p;
import i6.AbstractC2829k;
import i6.M;
import k3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l6.InterfaceC3359g;
import l6.z;
import org.json.JSONObject;
import s0.C3719i;
import u0.C3799a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GooglePayLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f23763a = new ViewModelLazy(U.b(g.class), new d(this), new f(), new e(null, this));

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f23764b = l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private GooglePayLauncherContract.a f23765c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k3.i invoke() {
            return i.a.b(k3.i.f33394a, GooglePayLauncherActivity.this, null, 2, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23767a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f23769a;

            a(GooglePayLauncherActivity googlePayLauncherActivity) {
                this.f23769a = googlePayLauncherActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.googlepaylauncher.f fVar, P5.d dVar) {
                if (fVar != null) {
                    this.f23769a.r(fVar);
                }
                return I.f6487a;
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f23767a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                z m8 = GooglePayLauncherActivity.this.t().m();
                a aVar = new a(GooglePayLauncherActivity.this);
                this.f23767a = 1;
                if (m8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23770a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f23772c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f23773a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GooglePayLauncherActivity f23774b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ActivityResultLauncher f23775c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0467a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ActivityResultLauncher f23776a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ GooglePayLauncherActivity f23777b;

                C0467a(ActivityResultLauncher activityResultLauncher, GooglePayLauncherActivity googlePayLauncherActivity) {
                    this.f23776a = activityResultLauncher;
                    this.f23777b = googlePayLauncherActivity;
                }

                @Override // l6.InterfaceC3359g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(Task task, P5.d dVar) {
                    if (task != null) {
                        this.f23776a.launch(task);
                        this.f23777b.t().q();
                    }
                    return I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayLauncherActivity googlePayLauncherActivity, ActivityResultLauncher activityResultLauncher, P5.d dVar) {
                super(2, dVar);
                this.f23774b = googlePayLauncherActivity;
                this.f23775c = activityResultLauncher;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f23774b, this.f23775c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f23773a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    z l8 = this.f23774b.t().l();
                    C0467a c0467a = new C0467a(this.f23775c, this.f23774b);
                    this.f23773a = 1;
                    if (l8.collect(c0467a, this) == e8) {
                        return e8;
                    }
                }
                throw new C1224h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, P5.d dVar) {
            super(2, dVar);
            this.f23772c = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f23772c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f23770a;
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
                a aVar = new a(googlePayLauncherActivity, this.f23772c, null);
                this.f23770a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(googlePayLauncherActivity, state, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f23778a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f23778a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f23778a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f23779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f23780b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f23779a = function0;
            this.f23780b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23779a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f23780b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            GooglePayLauncherContract.a aVar = GooglePayLauncherActivity.this.f23765c;
            if (aVar == null) {
                AbstractC3159y.y("args");
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

    private final k3.i s() {
        return (k3.i) this.f23764b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g t() {
        return (g) this.f23763a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(GooglePayLauncherActivity this$0, C3799a c3799a) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.f(c3799a);
        this$0.v(c3799a);
    }

    private final void v(C3799a c3799a) {
        int z8 = c3799a.b().z();
        if (z8 != 0) {
            if (z8 != 16) {
                Status b8 = c3799a.b();
                AbstractC3159y.h(b8, "getStatus(...)");
                String G8 = b8.G();
                String str = "";
                if (G8 == null) {
                    G8 = "";
                }
                i.b.a(s(), i.d.f33410p, null, Q.k(x.a("status_message", G8), x.a("status_code", String.valueOf(b8.z()))), 2, null);
                g t8 = t();
                int z9 = b8.z();
                String G9 = b8.G();
                if (G9 != null) {
                    str = G9;
                }
                t8.u(new f.c(new RuntimeException("Google Pay failed with error " + z9 + ": " + str)));
                return;
            }
            t().u(f.a.f23871a);
            return;
        }
        C3719i c3719i = (C3719i) c3799a.a();
        if (c3719i != null) {
            t().h(InterfaceC2464p.a.b(InterfaceC2464p.f27895a, this, null, 2, null), p.f24581u.j(new JSONObject(c3719i.u())));
        } else {
            i.b.a(s(), i.f.f33432h, null, null, 6, null);
            t().u(new f.c(new RuntimeException("Google Pay missing result data.")));
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        v4.c.a(this);
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
            s.a aVar = s.f6511b;
            GooglePayLauncherContract.a.C0468a c0468a = GooglePayLauncherContract.a.f23783a;
            Intent intent = getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            a8 = c0468a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        if (a8 != null) {
            b8 = s.b(a8);
            Throwable e8 = s.e(b8);
            if (e8 == null) {
                this.f23765c = (GooglePayLauncherContract.a) b8;
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
                ActivityResultLauncher registerForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: I2.e
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        GooglePayLauncherActivity.u(GooglePayLauncherActivity.this, (C3799a) obj);
                    }
                });
                AbstractC3159y.h(registerForActivityResult, "registerForActivityResult(...)");
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(registerForActivityResult, null), 3, null);
                return;
            }
            r(new f.c(e8));
            return;
        }
        throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.".toString());
    }
}
