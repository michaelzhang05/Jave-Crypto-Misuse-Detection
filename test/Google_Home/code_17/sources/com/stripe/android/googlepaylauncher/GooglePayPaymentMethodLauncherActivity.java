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
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.googlepaylauncher.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import n3.i;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;
import r0.C3901i;
import t0.C4022a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f24847a = new ViewModelLazy(U.b(j.class), new e(this), new g(), new f(null, this));

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f24848b = l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private GooglePayPaymentMethodLauncherContractV2.a f24849c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n3.i invoke() {
            return i.a.b(n3.i.f35386a, GooglePayPaymentMethodLauncherActivity.this, null, 2, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24851a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f24853a;

            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
                this.f24853a = googlePayPaymentMethodLauncherActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h.f fVar, S5.d dVar) {
                if (fVar != null) {
                    this.f24853a.s(fVar);
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
            int i8 = this.f24851a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3698L d8 = GooglePayPaymentMethodLauncherActivity.this.u().d();
                a aVar = new a(GooglePayPaymentMethodLauncherActivity.this);
                this.f24851a = 1;
                if (d8.collect(aVar, this) == e8) {
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
        int f24854a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24855b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f24857d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f24858a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f24859b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, S5.d dVar) {
                super(2, dVar);
                this.f24859b = googlePayPaymentMethodLauncherActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f24859b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f24858a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    j u8 = this.f24859b.u();
                    this.f24858a = 1;
                    obj = u8.g(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, S5.d dVar) {
            super(2, dVar);
            this.f24857d = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            c cVar = new c(this.f24857d, dVar);
            cVar.f24855b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f24854a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = GooglePayPaymentMethodLauncherActivity.this;
                    s.a aVar = s.f8302b;
                    l6.I b9 = C3347b0.b();
                    a aVar2 = new a(googlePayPaymentMethodLauncherActivity, null);
                    this.f24854a = 1;
                    obj = AbstractC3360i.g(b9, aVar2, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = s.b((Task) obj);
            } catch (Throwable th) {
                s.a aVar3 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            ActivityResultLauncher activityResultLauncher = this.f24857d;
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
            Throwable e9 = s.e(b8);
            if (e9 != null) {
                googlePayPaymentMethodLauncherActivity2.A(new h.f.c(e9, 1));
            } else {
                activityResultLauncher.launch((Task) b8);
                googlePayPaymentMethodLauncherActivity2.u().h(true);
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f24860a;

        /* renamed from: b, reason: collision with root package name */
        int f24861b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3901i f24863d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3901i c3901i, S5.d dVar) {
            super(2, dVar);
            this.f24863d = c3901i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f24863d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
            Object e8 = T5.b.e();
            int i8 = this.f24861b;
            if (i8 != 0) {
                if (i8 == 1) {
                    googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.f24860a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
                j u8 = googlePayPaymentMethodLauncherActivity2.u();
                C3901i c3901i = this.f24863d;
                this.f24860a = googlePayPaymentMethodLauncherActivity2;
                this.f24861b = 1;
                Object b8 = u8.b(c3901i, this);
                if (b8 == e8) {
                    return e8;
                }
                googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
                obj = b8;
            }
            googlePayPaymentMethodLauncherActivity.s((h.f) obj);
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24864a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f24864a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f24864a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f24865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f24866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f24865a = function0;
            this.f24866b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24865a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f24866b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            GooglePayPaymentMethodLauncherContractV2.a aVar = GooglePayPaymentMethodLauncherActivity.this.f24849c;
            if (aVar == null) {
                AbstractC3255y.y("args");
                aVar = null;
            }
            return new j.b(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(h.f fVar) {
        u().i(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(h.f fVar) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(x.a("extra_result", fVar))));
        finish();
    }

    private final n3.i t() {
        return (n3.i) this.f24848b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j u() {
        return (j) this.f24847a.getValue();
    }

    private final int v(int i8) {
        if (i8 != 7) {
            return i8 != 10 ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(GooglePayPaymentMethodLauncherActivity this$0, C4022a c4022a) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.f(c4022a);
        this$0.y(c4022a);
    }

    private final void x(C3901i c3901i) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(c3901i, null), 3, null);
    }

    private final void y(C4022a c4022a) {
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
                i.b.a(t(), i.d.f35402p, null, Q.k(x.a("status_message", y8), x.a("status_code", String.valueOf(b8.v()))), 2, null);
                j u8 = u();
                int v9 = b8.v();
                String y9 = b8.y();
                if (y9 != null) {
                    str = y9;
                }
                u8.i(new h.f.c(new RuntimeException("Google Pay failed with error " + v9 + ": " + str), v(b8.v())));
                return;
            }
            A(h.f.a.f24999a);
            return;
        }
        C3901i c3901i = (C3901i) c4022a.a();
        if (c3901i != null) {
            x(c3901i);
        } else {
            i.b.a(t(), i.f.f35424h, null, null, 6, null);
            A(new h.f.c(new RuntimeException("Google Pay failed with missing data."), 1));
        }
    }

    private final void z() {
        y4.c.a(this);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z();
        GooglePayPaymentMethodLauncherContractV2.a.C0467a c0467a = GooglePayPaymentMethodLauncherContractV2.a.f24882f;
        Intent intent = getIntent();
        AbstractC3255y.h(intent, "getIntent(...)");
        GooglePayPaymentMethodLauncherContractV2.a a8 = c0467a.a(intent);
        if (a8 == null) {
            s(new h.f.c(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.f24849c = a8;
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: L2.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncherActivity.w(GooglePayPaymentMethodLauncherActivity.this, (C4022a) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResult(...)");
        if (!u().e()) {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(registerForActivityResult, null), 3, null);
        }
    }
}
