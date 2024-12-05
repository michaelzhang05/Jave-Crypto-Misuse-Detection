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
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import k3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import s0.C3719i;
import u0.C3799a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GooglePayPaymentMethodLauncherActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f23792a = new ViewModelLazy(U.b(j.class), new e(this), new g(), new f(null, this));

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f23793b = l.b(new a());

    /* renamed from: c, reason: collision with root package name */
    private GooglePayPaymentMethodLauncherContractV2.a f23794c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k3.i invoke() {
            return i.a.b(k3.i.f33394a, GooglePayPaymentMethodLauncherActivity.this, null, 2, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23796a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f23798a;

            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
                this.f23798a = googlePayPaymentMethodLauncherActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(h.f fVar, P5.d dVar) {
                if (fVar != null) {
                    this.f23798a.s(fVar);
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
            int i8 = this.f23796a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3349K d8 = GooglePayPaymentMethodLauncherActivity.this.u().d();
                a aVar = new a(GooglePayPaymentMethodLauncherActivity.this);
                this.f23796a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23799a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23800b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ActivityResultLauncher f23802d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f23803a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ GooglePayPaymentMethodLauncherActivity f23804b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, P5.d dVar) {
                super(2, dVar);
                this.f23804b = googlePayPaymentMethodLauncherActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f23804b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f23803a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    j u8 = this.f23804b.u();
                    this.f23803a = 1;
                    obj = u8.g(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ActivityResultLauncher activityResultLauncher, P5.d dVar) {
            super(2, dVar);
            this.f23802d = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            c cVar = new c(this.f23802d, dVar);
            cVar.f23800b = obj;
            return cVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f23799a;
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
                    s.a aVar = s.f6511b;
                    i6.I b9 = C2812b0.b();
                    a aVar2 = new a(googlePayPaymentMethodLauncherActivity, null);
                    this.f23799a = 1;
                    obj = AbstractC2825i.g(b9, aVar2, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = s.b((Task) obj);
            } catch (Throwable th) {
                s.a aVar3 = s.f6511b;
                b8 = s.b(t.a(th));
            }
            ActivityResultLauncher activityResultLauncher = this.f23802d;
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
            Throwable e9 = s.e(b8);
            if (e9 != null) {
                googlePayPaymentMethodLauncherActivity2.A(new h.f.c(e9, 1));
            } else {
                activityResultLauncher.launch((Task) b8);
                googlePayPaymentMethodLauncherActivity2.u().h(true);
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f23805a;

        /* renamed from: b, reason: collision with root package name */
        int f23806b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3719i f23808d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3719i c3719i, P5.d dVar) {
            super(2, dVar);
            this.f23808d = c3719i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f23808d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
            Object e8 = Q5.b.e();
            int i8 = this.f23806b;
            if (i8 != 0) {
                if (i8 == 1) {
                    googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.f23805a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
                j u8 = googlePayPaymentMethodLauncherActivity2.u();
                C3719i c3719i = this.f23808d;
                this.f23805a = googlePayPaymentMethodLauncherActivity2;
                this.f23806b = 1;
                Object b8 = u8.b(c3719i, this);
                if (b8 == e8) {
                    return e8;
                }
                googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
                obj = b8;
            }
            googlePayPaymentMethodLauncherActivity.s((h.f) obj);
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f23809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f23809a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f23809a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f23810a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f23811b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f23810a = function0;
            this.f23811b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23810a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f23811b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            GooglePayPaymentMethodLauncherContractV2.a aVar = GooglePayPaymentMethodLauncherActivity.this.f23794c;
            if (aVar == null) {
                AbstractC3159y.y("args");
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

    private final k3.i t() {
        return (k3.i) this.f23793b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j u() {
        return (j) this.f23792a.getValue();
    }

    private final int v(int i8) {
        if (i8 != 7) {
            return i8 != 10 ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(GooglePayPaymentMethodLauncherActivity this$0, C3799a c3799a) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.f(c3799a);
        this$0.y(c3799a);
    }

    private final void x(C3719i c3719i) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(c3719i, null), 3, null);
    }

    private final void y(C3799a c3799a) {
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
                i.b.a(t(), i.d.f33410p, null, Q.k(x.a("status_message", G8), x.a("status_code", String.valueOf(b8.z()))), 2, null);
                j u8 = u();
                int z9 = b8.z();
                String G9 = b8.G();
                if (G9 != null) {
                    str = G9;
                }
                u8.i(new h.f.c(new RuntimeException("Google Pay failed with error " + z9 + ": " + str), v(b8.z())));
                return;
            }
            A(h.f.a.f23944a);
            return;
        }
        C3719i c3719i = (C3719i) c3799a.a();
        if (c3719i != null) {
            x(c3719i);
        } else {
            i.b.a(t(), i.f.f33432h, null, null, 6, null);
            A(new h.f.c(new RuntimeException("Google Pay failed with missing data."), 1));
        }
    }

    private final void z() {
        v4.c.a(this);
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
        GooglePayPaymentMethodLauncherContractV2.a.C0471a c0471a = GooglePayPaymentMethodLauncherContractV2.a.f23827f;
        Intent intent = getIntent();
        AbstractC3159y.h(intent, "getIntent(...)");
        GooglePayPaymentMethodLauncherContractV2.a a8 = c0471a.a(intent);
        if (a8 == null) {
            s(new h.f.c(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.f23794c = a8;
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: I2.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncherActivity.w(GooglePayPaymentMethodLauncherActivity.this, (C3799a) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResult(...)");
        if (!u().e()) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(registerForActivityResult, null), 3, null);
        }
    }
}
