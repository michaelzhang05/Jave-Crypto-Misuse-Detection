package X4;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.C1489m;
import W4.C1491o;
import a5.Q;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2683a;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.NotificationsRegistryActivity;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.UpcomingReleasesActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.UserAvatarActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.activities.UserCredentialsEditActivity;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.C3347b0;
import o5.AbstractC3685y;
import o5.C3671k;
import o5.C3674n;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public final class F1 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public W4.y0 f12792a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f12793b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityResultLauncher f12794c;

    /* renamed from: d, reason: collision with root package name */
    private final ActivityResultLauncher f12795d;

    /* renamed from: e, reason: collision with root package name */
    private final ActivityResultLauncher f12796e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12797a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.F1$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0249a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F1 f12799a;

            C0249a(F1 f12) {
                this.f12799a = f12;
            }

            public final Object a(int i8, S5.d dVar) {
                if (i8 == 1) {
                    this.f12799a.d0().f12676x.setText(this.f12799a.getString(R.string.reviews_counter_single));
                } else {
                    this.f12799a.d0().f12676x.setText(this.f12799a.getString(R.string.reviews_counter_multiple, String.valueOf(i8)));
                }
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f12797a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L j8 = F1.this.e0().j();
                C0249a c0249a = new C0249a(F1.this);
                this.f12797a = 1;
                if (j8.collect(c0249a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12800a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F1 f12802a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: X4.F1$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0250a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f12803a;

                /* renamed from: b, reason: collision with root package name */
                Object f12804b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f12805c;

                /* renamed from: e, reason: collision with root package name */
                int f12807e;

                C0250a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f12805c = obj;
                    this.f12807e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            a(F1 f12) {
                this.f12802a = f12;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(o5.AbstractC3685y r5, S5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof X4.F1.b.a.C0250a
                    if (r0 == 0) goto L13
                    r0 = r6
                    X4.F1$b$a$a r0 = (X4.F1.b.a.C0250a) r0
                    int r1 = r0.f12807e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12807e = r1
                    goto L18
                L13:
                    X4.F1$b$a$a r0 = new X4.F1$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f12805c
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f12807e
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f12804b
                    o5.y r5 = (o5.AbstractC3685y) r5
                    java.lang.Object r0 = r0.f12803a
                    X4.F1$b$a r0 = (X4.F1.b.a) r0
                    O5.t.b(r6)
                    goto L58
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    O5.t.b(r6)
                    o5.y$a r6 = o5.AbstractC3685y.a.f36548a
                    boolean r6 = kotlin.jvm.internal.AbstractC3255y.d(r5, r6)
                    if (r6 != 0) goto L79
                    boolean r6 = r5 instanceof o5.AbstractC3685y.c
                    if (r6 == 0) goto L74
                    r0.f12803a = r4
                    r0.f12804b = r5
                    r0.f12807e = r3
                    r2 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r6 = l6.X.b(r2, r0)
                    if (r6 != r1) goto L57
                    return r1
                L57:
                    r0 = r4
                L58:
                    X4.F1 r6 = r0.f12802a
                    o5.y$c r5 = (o5.AbstractC3685y.c) r5
                    java.lang.Object r0 = r5.a()
                    X4.G1$a r0 = (X4.G1.a) r0
                    int r0 = r0.b()
                    java.lang.Object r5 = r5.a()
                    X4.G1$a r5 = (X4.G1.a) r5
                    int r5 = r5.a()
                    X4.F1.Q(r6, r0, r5)
                    goto L79
                L74:
                    o5.y$b r6 = o5.AbstractC3685y.b.f36549a
                    kotlin.jvm.internal.AbstractC3255y.d(r5, r6)
                L79:
                    O5.I r5 = O5.I.f8278a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X4.F1.b.a.emit(o5.y, S5.d):java.lang.Object");
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
            int i8 = this.f12800a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L i9 = F1.this.e0().i();
                a aVar = new a(F1.this);
                this.f12800a = 1;
                if (i9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12808a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F1 f12810a;

            a(F1 f12) {
                this.f12810a = f12;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (!AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    if (abstractC3685y instanceof AbstractC3685y.c) {
                        if (this.f12810a.isAdded()) {
                            C3671k c3671k = new C3671k();
                            FragmentActivity requireActivity = this.f12810a.requireActivity();
                            AbstractC3255y.h(requireActivity, "requireActivity()");
                            c3671k.q(requireActivity, (String) ((AbstractC3685y.c) abstractC3685y).a(), this.f12810a.getString(R.string.uptodown_turbo));
                        }
                    } else {
                        AbstractC3255y.d(abstractC3685y, AbstractC3685y.b.f36549a);
                    }
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
            int i8 = this.f12808a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L g8 = F1.this.e0().g();
                a aVar = new a(F1.this);
                this.f12808a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f12811a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12811a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f12811a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f12812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0) {
            super(0);
            this.f12812a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f12812a.invoke();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f12813a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC1355k interfaceC1355k) {
            super(0);
            this.f12813a = interfaceC1355k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStoreOwner m5458viewModels$lambda1;
            m5458viewModels$lambda1 = FragmentViewModelLazyKt.m5458viewModels$lambda1(this.f12813a);
            return m5458viewModels$lambda1.getViewModelStore();
        }
    }

    /* loaded from: classes5.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f12814a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f12815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, InterfaceC1355k interfaceC1355k) {
            super(0);
            this.f12814a = function0;
            this.f12815b = interfaceC1355k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            ViewModelStoreOwner m5458viewModels$lambda1;
            CreationExtras creationExtras;
            Function0 function0 = this.f12814a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            m5458viewModels$lambda1 = FragmentViewModelLazyKt.m5458viewModels$lambda1(this.f12815b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5458viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5458viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f12816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1355k f12817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, InterfaceC1355k interfaceC1355k) {
            super(0);
            this.f12816a = fragment;
            this.f12817b = interfaceC1355k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner m5458viewModels$lambda1;
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            m5458viewModels$lambda1 = FragmentViewModelLazyKt.m5458viewModels$lambda1(this.f12817b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5458viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5458viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.f12816a.getDefaultViewModelProviderFactory();
            AbstractC3255y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f12818a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a5.Q f12820c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(a5.Q q8, S5.d dVar) {
            super(2, dVar);
            this.f12820c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f12820c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f12818a == 0) {
                O5.t.b(obj);
                F1.this.g0(this.f12820c);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public F1() {
        InterfaceC1355k a8 = O5.l.a(O5.o.f8297c, new e(new d(this)));
        this.f12793b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.U.b(G1.class), new f(a8), new g(null, a8), new h(this, a8));
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: X4.z1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                F1.k0(F1.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…lse -> {}\n        }\n    }");
        this.f12794c = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: X4.A1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                F1.K0(F1.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.f12795d = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: X4.B1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                F1.S0(F1.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult3, "registerForActivityResul…        }\n        }\n    }");
        this.f12796e = registerForActivityResult3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getContext() != null) {
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            this$0.V(requireContext);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) Updates.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) MyApps.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) MyDownloads.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) RollbackActivity.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        ActivityResultLauncher activityResultLauncher = this$0.f12796e;
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) WishlistActivity.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) UpcomingReleasesActivity.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getContext() != null) {
            G1 e02 = this$0.e0();
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            e02.h(requireContext);
        }
    }

    private final void J0() {
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        aVar.B0(requireContext, "no");
        AppCompatDelegate.setDefaultNightMode(1);
        UptodownApp.f29058B.q0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(F1 this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != 1003) {
            if (resultCode == 1004) {
                UptodownApp.a aVar = UptodownApp.f29058B;
                Context requireContext = this$0.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                aVar.e(requireContext);
                if (this$0.getActivity() != null) {
                    this$0.requireActivity().finish();
                    this$0.startActivity(this$0.requireActivity().getIntent());
                    return;
                }
                return;
            }
            return;
        }
        C3674n.a aVar2 = C3674n.f36505t;
        Context requireContext2 = this$0.requireContext();
        AbstractC3255y.h(requireContext2, "requireContext()");
        C3674n a8 = aVar2.a(requireContext2);
        a8.a();
        a8.s();
        a8.l();
        if (this$0.getActivity() != null) {
            this$0.requireActivity().finish();
            this$0.startActivity(this$0.requireActivity().getIntent());
        }
    }

    private final void L0() {
        Window window;
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
            C1489m c8 = C1489m.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12416f;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            c8.f12417g.setTypeface(aVar.u());
            c8.f12415e.setTypeface(aVar.u());
            c8.f12414d.setTypeface(aVar.u());
            c8.f12413c.setOnClickListener(new View.OnClickListener() { // from class: X4.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    F1.M0(F1.this, view);
                }
            });
            c8.f12412b.setOnClickListener(new View.OnClickListener() { // from class: X4.p1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    F1.N0(F1.this, view);
                }
            });
            c8.f12414d.setOnClickListener(new View.OnClickListener() { // from class: X4.q1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    F1.O0(F1.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            FragmentActivity activity2 = getActivity();
            AbstractC3255y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            ((AbstractActivityC2683a) activity2).N2(builder.create());
            if (isAdded()) {
                FragmentActivity activity3 = getActivity();
                AbstractC3255y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                if (((AbstractActivityC2683a) activity3).r2() != null) {
                    FragmentActivity activity4 = getActivity();
                    AbstractC3255y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog r23 = ((AbstractActivityC2683a) activity4).r2();
                    if (r23 != null && (window = r23.getWindow()) != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    FragmentActivity activity5 = getActivity();
                    AbstractC3255y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog r24 = ((AbstractActivityC2683a) activity5).r2();
                    if (r24 != null) {
                        r24.show();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        a5.Q e8 = bVar.e(requireContext);
        if (e8 != null) {
            Intent intent = new Intent(this$0.getContext(), (Class<?>) UserCredentialsEditActivity.class);
            intent.putExtra("user", e8);
            UptodownApp.a aVar = UptodownApp.f29058B;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
        }
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        if (bVar.e(requireContext) != null) {
            Intent intent = new Intent(this$0.getContext(), (Class<?>) UserCredentialsEditActivity.class);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, HintConstants.AUTOFILL_HINT_PASSWORD);
            UptodownApp.a aVar = UptodownApp.f29058B;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
        }
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2683a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(int i8, int i9) {
        if (i8 > 0) {
            d0().f12651E.f12698d.setVisibility(0);
            d0().f12651E.f12700f.setText(String.valueOf(i8));
        } else {
            d0().f12651E.f12698d.setVisibility(4);
        }
        if (i9 > 0) {
            d0().f12654b.f12698d.setVisibility(0);
            d0().f12654b.f12700f.setText(String.valueOf(i9));
        } else {
            d0().f12654b.f12698d.setVisibility(4);
        }
    }

    private final void R() {
        String str;
        if (getContext() != null) {
            Q.b bVar = a5.Q.f14058k;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            a5.Q e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                if (e8.x(requireContext2)) {
                    g0(e8);
                    return;
                }
            }
            Context requireContext3 = requireContext();
            AbstractC3255y.h(requireContext3, "requireContext()");
            S(requireContext3);
        }
    }

    private final void S(Context context) {
        e0().d(context);
        d0().f12658f.setOnClickListener(new View.OnClickListener() { // from class: X4.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.T(F1.this, view);
            }
        });
        d0().f12658f.setImageResource(R.drawable.vector_user_login);
        ImageView imageView = d0().f12658f;
        AbstractC3255y.h(imageView, "binding.ivUserAvatarUserFragment");
        int dimension = (int) getResources().getDimension(R.dimen.margin_l);
        imageView.setPadding(dimension, dimension, dimension, dimension);
        d0().f12658f.setBackground(null);
        d0().f12648B.setText(getString(R.string.sign_in_sign_up));
        UsernameTextView.a aVar = UsernameTextView.f31022k;
        UsernameTextView usernameTextView = d0().f12648B;
        AbstractC3255y.h(usernameTextView, "binding.tvUsernameUserFragment");
        aVar.b(usernameTextView);
        d0().f12648B.setTextColor(ContextCompat.getColor(requireContext(), R.color.text_terciary));
        d0().f12668p.setOnClickListener(new View.OnClickListener() { // from class: X4.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.U(F1.this, view);
            }
        });
        d0().f12676x.setVisibility(8);
        d0().f12675w.setVisibility(8);
        d0().f12659g.setVisibility(8);
        d0().f12671s.setVisibility(8);
        d0().f12672t.setVisibility(8);
        if (getActivity() != null && !requireActivity().isFinishing() && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).H7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(F1 this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1 && this$0.isAdded()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).p5(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.m0();
    }

    private final void V(final Context context) {
        Object obj;
        final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        C1491o c8 = C1491o.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f12441f;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        c8.f12438c.setTypeface(aVar.u());
        c8.f12437b.setTypeface(aVar.u());
        c8.f12439d.setTypeface(aVar.u());
        String j8 = SettingsPreferences.f30353b.j(context);
        if (j6.n.s(j8, "yes", true)) {
            c8.f12438c.setChecked(true);
        } else if (j6.n.s(j8, "no", true)) {
            c8.f12437b.setChecked(true);
        } else {
            c8.f12439d.setChecked(true);
        }
        c8.f12438c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X4.u1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                F1.W(kotlin.jvm.internal.T.this, this, compoundButton, z8);
            }
        });
        c8.f12437b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X4.v1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                F1.X(kotlin.jvm.internal.T.this, this, compoundButton, z8);
            }
        });
        c8.f12439d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: X4.w1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                F1.Y(kotlin.jvm.internal.T.this, context, compoundButton, z8);
            }
        });
        c8.f12440e.setTypeface(aVar.t());
        c8.f12440e.setOnClickListener(new View.OnClickListener() { // from class: X4.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.Z(kotlin.jvm.internal.T.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f34162a = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing() && (obj = t8.f34162a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f34162a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(kotlin.jvm.internal.T alertDialog, F1 this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(alertDialog, "$alertDialog");
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            Object obj = alertDialog.f34162a;
            AbstractC3255y.f(obj);
            ((AlertDialog) obj).dismiss();
            this$0.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(kotlin.jvm.internal.T alertDialog, F1 this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(alertDialog, "$alertDialog");
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            Object obj = alertDialog.f34162a;
            AbstractC3255y.f(obj);
            ((AlertDialog) obj).dismiss();
            this$0.J0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(kotlin.jvm.internal.T alertDialog, Context context, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(alertDialog, "$alertDialog");
        AbstractC3255y.i(context, "$context");
        if (z8) {
            Object obj = alertDialog.f34162a;
            AbstractC3255y.f(obj);
            ((AlertDialog) obj).dismiss();
            SettingsPreferences.f30353b.B0(context, "system");
            AppCompatDelegate.setDefaultNightMode(-1);
            UptodownApp.f29058B.q0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(kotlin.jvm.internal.T alertDialog, View view) {
        AbstractC3255y.i(alertDialog, "$alertDialog");
        Object obj = alertDialog.f34162a;
        AbstractC3255y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    private final void a0(final Context context) {
        Object obj;
        final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        W4.r c8 = W4.r.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f12478d;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        c8.f12478d.setText(getString(R.string.log_out_confirmation_msg));
        c8.f12479e.setTypeface(aVar.t());
        c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: X4.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.b0(F1.this, context, t8, view);
            }
        });
        c8.f12477c.setTypeface(aVar.t());
        c8.f12477c.setOnClickListener(new View.OnClickListener() { // from class: X4.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.c0(kotlin.jvm.internal.T.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f34162a = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing() && (obj = t8.f34162a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f34162a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(F1 this$0, Context context, kotlin.jvm.internal.T alertDialog, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        AbstractC3255y.i(alertDialog, "$alertDialog");
        this$0.S(context);
        Object obj = alertDialog.f34162a;
        AbstractC3255y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(kotlin.jvm.internal.T alertDialog, View view) {
        AbstractC3255y.i(alertDialog, "$alertDialog");
        Object obj = alertDialog.f34162a;
        AbstractC3255y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    private final void f0() {
        d0().f12651E.f12698d.setVisibility(4);
        d0().f12654b.f12698d.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(final a5.Q q8) {
        if (q8.g() != null) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(a5.Q.f14058k.c(q8.b()));
            UptodownApp.a aVar = UptodownApp.f29058B;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            l8.n(aVar.f0(requireContext)).i(d0().f12658f);
            d0().f12658f.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.shadow_user_icon));
        } else {
            d0().f12658f.setImageResource(R.drawable.vector_user_profile);
        }
        d0().f12658f.setOnClickListener(new View.OnClickListener() { // from class: X4.X0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.h0(F1.this, q8, view);
            }
        });
        ImageView imageView = d0().f12658f;
        AbstractC3255y.h(imageView, "binding.ivUserAvatarUserFragment");
        imageView.setPadding(0, 0, 0, 0);
        d0().f12648B.setText(q8.s());
        if (q8.y() && !AbstractC3255y.d(q8.w(), "type0")) {
            UsernameTextView.a aVar2 = UsernameTextView.f31022k;
            UsernameTextView usernameTextView = d0().f12648B;
            AbstractC3255y.h(usernameTextView, "binding.tvUsernameUserFragment");
            aVar2.a(usernameTextView, q8.y(), q8.w());
        } else {
            UsernameTextView.a aVar3 = UsernameTextView.f31022k;
            UsernameTextView usernameTextView2 = d0().f12648B;
            AbstractC3255y.h(usernameTextView2, "binding.tvUsernameUserFragment");
            aVar3.b(usernameTextView2);
        }
        if (q8.v() > 0) {
            TextView textView = d0().f12675w;
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            textView.setText(q8.a(requireContext2));
        }
        G1 e02 = e0();
        Context requireContext3 = requireContext();
        AbstractC3255y.h(requireContext3, "requireContext()");
        e02.f(requireContext3, q8);
        d0().f12676x.setOnClickListener(new View.OnClickListener() { // from class: X4.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.i0(F1.this, q8, view);
            }
        });
        if (q8.y()) {
            C3671k.a aVar4 = C3671k.f36498a;
            ImageView imageView2 = d0().f12658f;
            AbstractC3255y.h(imageView2, "binding.ivUserAvatarUserFragment");
            aVar4.a(imageView2);
            d0().f12671s.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_turbo_button));
            d0().f12659g.setVisibility(0);
        } else {
            d0().f12671s.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_blue_primary_button));
            d0().f12659g.setVisibility(8);
        }
        d0().f12676x.setVisibility(0);
        d0().f12675w.setVisibility(0);
        d0().f12671s.setVisibility(0);
        d0().f12672t.setVisibility(0);
        d0().f12668p.setOnClickListener(null);
        if (getActivity() != null && !requireActivity().isFinishing() && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3255y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).H7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(F1 this$0, a5.Q user, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(user, "$user");
        this$0.l0(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(F1 this$0, a5.Q user, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(user, "$user");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", user.getId());
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    private final void j0() {
        String str;
        if (getContext() != null) {
            Q.b bVar = a5.Q.f14058k;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            a5.Q e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = requireContext();
                AbstractC3255y.h(requireContext2, "requireContext()");
                if (e8.x(requireContext2)) {
                    g0(e8);
                    UptodownApp.a aVar = UptodownApp.f29058B;
                    Context requireContext3 = requireContext();
                    AbstractC3255y.h(requireContext3, "requireContext()");
                    aVar.j0(requireContext3);
                    Context requireContext4 = requireContext();
                    AbstractC3255y.h(requireContext4, "requireContext()");
                    aVar.i0(requireContext4);
                    return;
                }
            }
            Context requireContext5 = requireContext();
            AbstractC3255y.h(requireContext5, "requireContext()");
            S(requireContext5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(F1 this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            if (resultCode != 1002) {
                if (resultCode != 1) {
                    if (resultCode == 2) {
                        this$0.j0();
                        return;
                    }
                    return;
                }
                this$0.j0();
                return;
            }
            this$0.n0();
            return;
        }
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        this$0.S(requireContext);
    }

    private final void l0(a5.Q q8) {
        Intent intent = new Intent(requireContext(), (Class<?>) UserAvatarActivity.class);
        intent.putExtra("user", q8);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        startActivity(intent, aVar.a(requireActivity));
    }

    private final void m0() {
        Intent intent = new Intent(requireContext(), (Class<?>) LoginActivity.class);
        ActivityResultLauncher activityResultLauncher = this.f12794c;
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    private final void n0() {
        Intent intent = new Intent(requireContext(), (Class<?>) SettingsPreferences.class);
        ActivityResultLauncher activityResultLauncher = this.f12795d;
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    private final void p0() {
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        aVar.B0(requireContext, "yes");
        AppCompatDelegate.setDefaultNightMode(2);
        UptodownApp.f29058B.q0(true);
    }

    private final void q0() {
        Q.b bVar = a5.Q.f14058k;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        final a5.Q e8 = bVar.e(requireContext);
        if (e8 != null && getContext() != null) {
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            if (e8.x(requireContext2)) {
                g0(e8);
            }
        }
        R0();
        d0().f12658f.setOnClickListener(new View.OnClickListener() { // from class: X4.C1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.r0(a5.Q.this, this, view);
            }
        });
        d0().f12668p.setOnClickListener(new View.OnClickListener() { // from class: X4.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.s0(F1.this, view);
            }
        });
        d0().f12671s.setOnClickListener(new View.OnClickListener() { // from class: X4.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.B0(F1.this, view);
            }
        });
        d0().f12651E.f12697c.setOnClickListener(new View.OnClickListener() { // from class: X4.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.C0(F1.this, view);
            }
        });
        d0().f12665m.f12697c.setOnClickListener(new View.OnClickListener() { // from class: X4.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.D0(F1.this, view);
            }
        });
        d0().f12654b.f12697c.setOnClickListener(new View.OnClickListener() { // from class: X4.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.E0(F1.this, view);
            }
        });
        d0().f12669q.f12697c.setOnClickListener(new View.OnClickListener() { // from class: X4.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.F0(F1.this, view);
            }
        });
        d0().f12652F.f12697c.setOnClickListener(new View.OnClickListener() { // from class: X4.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.G0(F1.this, view);
            }
        });
        d0().f12650D.f12697c.setOnClickListener(new View.OnClickListener() { // from class: X4.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.H0(F1.this, view);
            }
        });
        d0().f12659g.setOnClickListener(new View.OnClickListener() { // from class: X4.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.I0(F1.this, view);
            }
        });
        d0().f12661i.setOnClickListener(new View.OnClickListener() { // from class: X4.D1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.t0(F1.this, view);
            }
        });
        d0().f12660h.setOnClickListener(new View.OnClickListener() { // from class: X4.E1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.u0(F1.this, view);
            }
        });
        d0().f12662j.setOnClickListener(new View.OnClickListener() { // from class: X4.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.v0(F1.this, view);
            }
        });
        if (e8 != null && e8.y()) {
            d0().f12657e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_support_turbo));
        } else {
            d0().f12657e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_support));
        }
        d0().f12663k.setOnClickListener(new View.OnClickListener() { // from class: X4.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.w0(F1.this, view);
            }
        });
        d0().f12649C.setOnClickListener(new View.OnClickListener() { // from class: X4.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.x0(F1.this, view);
            }
        });
        d0().f12672t.setOnClickListener(new View.OnClickListener() { // from class: X4.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.y0(F1.this, view);
            }
        });
        d0().f12656d.setOnClickListener(new View.OnClickListener() { // from class: X4.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.z0(F1.this, view);
            }
        });
        d0().f12656d.setOnLongClickListener(new View.OnLongClickListener() { // from class: X4.d1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean A02;
                A02 = F1.A0(F1.this, view);
                return A02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(a5.Q q8, F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (q8 != null) {
            this$0.l0(q8);
        } else {
            this$0.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) SecurityActivity.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) NotificationsRegistryActivity.class);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getActivity() != null) {
            String string = this$0.getString(R.string.url_support);
            AbstractC3255y.h(string, "getString(R.string.url_support)");
            Q.b bVar = a5.Q.f14058k;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            a5.Q e8 = bVar.e(requireActivity);
            if (e8 != null && e8.y()) {
                string = this$0.getString(R.string.url_support_turbo);
                AbstractC3255y.h(string, "getString(R.string.url_support_turbo)");
            }
            C3671k c3671k = new C3671k();
            FragmentActivity requireActivity2 = this$0.requireActivity();
            AbstractC3255y.h(requireActivity2, "requireActivity()");
            c3671k.q(requireActivity2, string, this$0.getString(R.string.support_title));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getActivity() != null && !this$0.requireActivity().isFinishing()) {
            String str = this$0.getString(R.string.url) + "/android";
            C3671k c3671k = new C3671k();
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            C3671k.r(c3671k, requireActivity, str, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        this$0.a0(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(F1 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getContext() != null && UptodownApp.f29058B.a0()) {
            if (new C3671k().o(this$0.getContext())) {
                this$0.p0();
            } else {
                this$0.J0();
            }
        }
    }

    public final void Q0(a5.Q user) {
        AbstractC3255y.i(user, "user");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(user, null), 3, null);
    }

    public final void R0() {
        if (isAdded() && getContext() != null) {
            G1 e02 = e0();
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            e02.e(requireContext);
            return;
        }
        f0();
    }

    public final W4.y0 d0() {
        W4.y0 y0Var = this.f12792a;
        if (y0Var != null) {
            return y0Var;
        }
        AbstractC3255y.y("binding");
        return null;
    }

    public final G1 e0() {
        return (G1) this.f12793b.getValue();
    }

    public final void o0(W4.y0 y0Var) {
        AbstractC3255y.i(y0Var, "<set-?>");
        this.f12792a = y0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        boolean z8 = false;
        W4.y0 c8 = W4.y0.c(inflater, viewGroup, false);
        AbstractC3255y.h(c8, "inflate(inflater, container, false)");
        o0(c8);
        int i8 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.margin_l);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.user_fragment_card_size);
        int i9 = -1;
        for (int i10 = 6; !z8 && i10 > 0; i10--) {
            int i11 = i8 - ((i10 + 1) * dimensionPixelSize);
            if (i11 >= dimensionPixelSize2 * i10) {
                d0().f12655c.setColumnCount(i10);
                d0().f12655c.setRowCount(6 / i10);
                z8 = true;
                i9 = i11 / i10;
            }
        }
        if (i9 > 0) {
            d0().f12665m.f12697c.getLayoutParams().height = i9;
            d0().f12651E.f12697c.getLayoutParams().height = i9;
            d0().f12654b.f12697c.getLayoutParams().height = i9;
            d0().f12669q.f12697c.getLayoutParams().height = i9;
            d0().f12652F.f12697c.getLayoutParams().height = i9;
            d0().f12650D.f12697c.getLayoutParams().height = i9;
        }
        RelativeLayout root = d0().getRoot();
        AbstractC3255y.h(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        R0();
        if (new C3671k().o(getContext())) {
            d0().f12656d.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_dark_mode));
        } else {
            d0().f12656d.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_light_mode));
        }
        R();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        UsernameTextView usernameTextView = d0().f12648B;
        j.a aVar = H4.j.f3824g;
        usernameTextView.setTypeface(aVar.t());
        d0().f12675w.setTypeface(aVar.u());
        d0().f12676x.setTypeface(aVar.t());
        d0().f12671s.setTypeface(aVar.t());
        d0().f12665m.f12699e.setTypeface(aVar.u());
        d0().f12665m.f12699e.setText(getString(R.string.my_apps_menu_left));
        d0().f12665m.f12696b.setImageResource(R.drawable.vector_user_panel_my_apps);
        d0().f12651E.f12699e.setTypeface(aVar.u());
        d0().f12651E.f12700f.setTypeface(aVar.u());
        d0().f12651E.f12699e.setText(getString(R.string.updates));
        d0().f12651E.f12696b.setImageResource(R.drawable.vector_user_panel_updates);
        d0().f12654b.f12699e.setTypeface(aVar.u());
        d0().f12654b.f12700f.setTypeface(aVar.u());
        d0().f12654b.f12699e.setText(getString(R.string.downloads_title));
        d0().f12654b.f12696b.setImageResource(R.drawable.vector_user_panel_download);
        d0().f12669q.f12699e.setTypeface(aVar.u());
        d0().f12669q.f12699e.setText(getString(R.string.rollback_title));
        d0().f12669q.f12696b.setImageResource(R.drawable.vector_user_panel_rollback);
        d0().f12652F.f12699e.setTypeface(aVar.u());
        d0().f12652F.f12699e.setText(getString(R.string.wishlist_title));
        d0().f12652F.f12696b.setImageResource(R.drawable.vector_user_panel_wishlist);
        d0().f12650D.f12699e.setTypeface(aVar.u());
        d0().f12650D.f12699e.setText(getString(R.string.upcoming_releases_title));
        d0().f12650D.f12696b.setImageResource(R.drawable.vector_user_panel_upcoming);
        d0().f12673u.setTypeface(aVar.u());
        d0().f12677y.setTypeface(aVar.u());
        d0().f12674v.setTypeface(aVar.u());
        d0().f12678z.setTypeface(aVar.u());
        d0().f12647A.setTypeface(aVar.u());
        d0().f12649C.setTypeface(aVar.u());
        d0().f12672t.setTypeface(aVar.u());
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new a(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new b(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new c(null), 2, null);
        q0();
    }
}
