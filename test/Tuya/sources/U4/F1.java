package U4;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1380m;
import T4.C1382o;
import X4.Q;
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
import com.uptodown.activities.AbstractActivityC2489a;
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
import i6.AbstractC2829k;
import i6.C2812b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.AbstractC3337y;
import l5.C3323k;
import l5.C3326n;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public final class F1 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public T4.y0 f11121a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f11122b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11123c;

    /* renamed from: d, reason: collision with root package name */
    private final ActivityResultLauncher f11124d;

    /* renamed from: e, reason: collision with root package name */
    private final ActivityResultLauncher f11125e;

    /* renamed from: f, reason: collision with root package name */
    private final ActivityResultLauncher f11126f;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11127a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: U4.F1$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0223a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F1 f11129a;

            C0223a(F1 f12) {
                this.f11129a = f12;
            }

            public final Object b(int i8, P5.d dVar) {
                if (i8 == 1) {
                    this.f11129a.b0().f11019x.setText(this.f11129a.getString(R.string.reviews_counter_single));
                } else {
                    this.f11129a.b0().f11019x.setText(this.f11129a.getString(R.string.reviews_counter_multiple, String.valueOf(i8)));
                }
                return L5.I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Number) obj).intValue(), dVar);
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11127a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K j8 = F1.this.c0().j();
                C0223a c0223a = new C0223a(F1.this);
                this.f11127a = 1;
                if (j8.collect(c0223a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11130a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F1 f11132a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: U4.F1$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0224a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f11133a;

                /* renamed from: b, reason: collision with root package name */
                Object f11134b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f11135c;

                /* renamed from: e, reason: collision with root package name */
                int f11137e;

                C0224a(P5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f11135c = obj;
                    this.f11137e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            a(F1 f12) {
                this.f11132a = f12;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(l5.AbstractC3337y r5, P5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof U4.F1.b.a.C0224a
                    if (r0 == 0) goto L13
                    r0 = r6
                    U4.F1$b$a$a r0 = (U4.F1.b.a.C0224a) r0
                    int r1 = r0.f11137e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11137e = r1
                    goto L18
                L13:
                    U4.F1$b$a$a r0 = new U4.F1$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f11135c
                    java.lang.Object r1 = Q5.b.e()
                    int r2 = r0.f11137e
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f11134b
                    l5.y r5 = (l5.AbstractC3337y) r5
                    java.lang.Object r0 = r0.f11133a
                    U4.F1$b$a r0 = (U4.F1.b.a) r0
                    L5.t.b(r6)
                    goto L58
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    L5.t.b(r6)
                    l5.y$a r6 = l5.AbstractC3337y.a.f34547a
                    boolean r6 = kotlin.jvm.internal.AbstractC3159y.d(r5, r6)
                    if (r6 != 0) goto L79
                    boolean r6 = r5 instanceof l5.AbstractC3337y.c
                    if (r6 == 0) goto L74
                    r0.f11133a = r4
                    r0.f11134b = r5
                    r0.f11137e = r3
                    r2 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r6 = i6.X.b(r2, r0)
                    if (r6 != r1) goto L57
                    return r1
                L57:
                    r0 = r4
                L58:
                    U4.F1 r6 = r0.f11132a
                    l5.y$c r5 = (l5.AbstractC3337y.c) r5
                    java.lang.Object r0 = r5.a()
                    U4.G1$a r0 = (U4.G1.a) r0
                    int r0 = r0.b()
                    java.lang.Object r5 = r5.a()
                    U4.G1$a r5 = (U4.G1.a) r5
                    int r5 = r5.a()
                    U4.F1.Q(r6, r0, r5)
                    goto L79
                L74:
                    l5.y$b r6 = l5.AbstractC3337y.b.f34548a
                    kotlin.jvm.internal.AbstractC3159y.d(r5, r6)
                L79:
                    L5.I r5 = L5.I.f6487a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: U4.F1.b.a.emit(l5.y, P5.d):java.lang.Object");
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
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11130a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K i9 = F1.this.c0().i();
                a aVar = new a(F1.this);
                this.f11130a = 1;
                if (i9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11138a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F1 f11140a;

            a(F1 f12) {
                this.f11140a = f12;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (!AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34547a)) {
                    if (abstractC3337y instanceof AbstractC3337y.c) {
                        if (this.f11140a.isAdded()) {
                            C3323k c3323k = new C3323k();
                            FragmentActivity requireActivity = this.f11140a.requireActivity();
                            AbstractC3159y.h(requireActivity, "requireActivity()");
                            c3323k.q(requireActivity, (String) ((AbstractC3337y.c) abstractC3337y).a(), this.f11140a.getString(R.string.uptodown_turbo));
                        }
                    } else {
                        AbstractC3159y.d(abstractC3337y, AbstractC3337y.b.f34548a);
                    }
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
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11138a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K g8 = F1.this.c0().g();
                a aVar = new a(F1.this);
                this.f11138a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f11141a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f11141a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f11141a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f11142a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0) {
            super(0);
            this.f11142a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f11142a.invoke();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f11143a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC1227k interfaceC1227k) {
            super(0);
            this.f11143a = interfaceC1227k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStoreOwner m5453viewModels$lambda1;
            m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.f11143a);
            return m5453viewModels$lambda1.getViewModelStore();
        }
    }

    /* loaded from: classes5.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f11144a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f11145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, InterfaceC1227k interfaceC1227k) {
            super(0);
            this.f11144a = function0;
            this.f11145b = interfaceC1227k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            ViewModelStoreOwner m5453viewModels$lambda1;
            CreationExtras creationExtras;
            Function0 function0 = this.f11144a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.f11145b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5453viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5453viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f11146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1227k f11147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, InterfaceC1227k interfaceC1227k) {
            super(0);
            this.f11146a = fragment;
            this.f11147b = interfaceC1227k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner m5453viewModels$lambda1;
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.f11147b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5453viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5453viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.f11146a.getDefaultViewModelProviderFactory();
            AbstractC3159y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11148a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.Q f11150c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(X4.Q q8, P5.d dVar) {
            super(2, dVar);
            this.f11150c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f11150c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11148a == 0) {
                L5.t.b(obj);
                F1.this.e0(this.f11150c);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public F1() {
        InterfaceC1227k a8 = L5.l.a(L5.o.f6506c, new e(new d(this)));
        this.f11122b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.U.b(G1.class), new f(a8), new g(null, a8), new h(this, a8));
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: U4.t1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                F1.i0(F1.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…lse -> {}\n        }\n    }");
        this.f11124d = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: U4.y1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                F1.L0(F1.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.f11125e = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: U4.z1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                F1.T0(F1.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult3, "registerForActivityResul…        }\n        }\n    }");
        this.f11126f = registerForActivityResult3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) Updates.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) MyApps.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) MyDownloads.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) RollbackActivity.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        ActivityResultLauncher activityResultLauncher = this$0.f11126f;
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) WishlistActivity.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) UpcomingReleasesActivity.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getContext() != null) {
            G1 c02 = this$0.c0();
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            c02.h(requireContext);
        }
    }

    private final void H0() {
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        aVar.B0(requireContext, "no");
        AppCompatDelegate.setDefaultNightMode(1);
        UptodownApp.f28003B.q0(true);
    }

    private final void I0() {
        b0().f11001f.setOnClickListener(new View.OnClickListener() { // from class: U4.A1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.J0(F1.this, view);
            }
        });
        b0().f11001f.setImageResource(R.drawable.vector_user_login);
        ImageView imageView = b0().f11001f;
        AbstractC3159y.h(imageView, "binding.ivUserAvatarUserFragment");
        int dimension = (int) getResources().getDimension(R.dimen.margin_l);
        imageView.setPadding(dimension, dimension, dimension, dimension);
        b0().f11001f.setBackground(null);
        b0().f10991B.setText(getString(R.string.sign_in_sign_up));
        UsernameTextView.a aVar = UsernameTextView.f29990k;
        UsernameTextView usernameTextView = b0().f10991B;
        AbstractC3159y.h(usernameTextView, "binding.tvUsernameUserFragment");
        aVar.b(usernameTextView);
        b0().f10991B.setTextColor(ContextCompat.getColor(requireContext(), R.color.text_terciary));
        b0().f11011p.setOnClickListener(new View.OnClickListener() { // from class: U4.B1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.K0(F1.this, view);
            }
        });
        b0().f11019x.setVisibility(8);
        b0().f11018w.setVisibility(8);
        b0().f11002g.setVisibility(8);
        b0().f11014s.setVisibility(8);
        b0().f11015t.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(F1 this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != 1003) {
            if (resultCode == 1004) {
                UptodownApp.a aVar = UptodownApp.f28003B;
                Context requireContext = this$0.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
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
        C3326n.a aVar2 = C3326n.f34504t;
        Context requireContext2 = this$0.requireContext();
        AbstractC3159y.h(requireContext2, "requireContext()");
        C3326n a8 = aVar2.a(requireContext2);
        a8.a();
        a8.o();
        a8.g();
        if (this$0.getActivity() != null) {
            this$0.requireActivity().finish();
            this$0.startActivity(this$0.requireActivity().getIntent());
        }
    }

    private final void M0() {
        Window window;
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog r22 = ((AbstractActivityC2489a) activity).r2();
            if (r22 != null) {
                r22.dismiss();
            }
            C1380m c8 = C1380m.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10759f;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            c8.f10760g.setTypeface(aVar.u());
            c8.f10758e.setTypeface(aVar.u());
            c8.f10757d.setTypeface(aVar.u());
            c8.f10756c.setOnClickListener(new View.OnClickListener() { // from class: U4.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    F1.N0(F1.this, view);
                }
            });
            c8.f10755b.setOnClickListener(new View.OnClickListener() { // from class: U4.p1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    F1.O0(F1.this, view);
                }
            });
            c8.f10757d.setOnClickListener(new View.OnClickListener() { // from class: U4.q1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    F1.P0(F1.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            FragmentActivity activity2 = getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            ((AbstractActivityC2489a) activity2).N2(builder.create());
            if (isAdded()) {
                FragmentActivity activity3 = getActivity();
                AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                if (((AbstractActivityC2489a) activity3).r2() != null) {
                    FragmentActivity activity4 = getActivity();
                    AbstractC3159y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog r23 = ((AbstractActivityC2489a) activity4).r2();
                    if (r23 != null && (window = r23.getWindow()) != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    FragmentActivity activity5 = getActivity();
                    AbstractC3159y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog r24 = ((AbstractActivityC2489a) activity5).r2();
                    if (r24 != null) {
                        r24.show();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Q.b bVar = X4.Q.f12437k;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        X4.Q e8 = bVar.e(requireContext);
        if (e8 != null) {
            Intent intent = new Intent(this$0.getContext(), (Class<?>) UserCredentialsEditActivity.class);
            intent.putExtra("user", e8);
            UptodownApp.a aVar = UptodownApp.f28003B;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
            this$0.f11123c = true;
        }
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2489a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Q.b bVar = X4.Q.f12437k;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        if (bVar.e(requireContext) != null) {
            Intent intent = new Intent(this$0.getContext(), (Class<?>) UserCredentialsEditActivity.class);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, HintConstants.AUTOFILL_HINT_PASSWORD);
            UptodownApp.a aVar = UptodownApp.f28003B;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
        }
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2489a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog r22 = ((AbstractActivityC2489a) activity).r2();
        if (r22 != null) {
            r22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(int i8, int i9) {
        if (i8 > 0) {
            b0().f10994E.f11041d.setVisibility(0);
            b0().f10994E.f11043f.setText(String.valueOf(i8));
        } else {
            b0().f10994E.f11041d.setVisibility(4);
        }
        if (i9 > 0) {
            b0().f10997b.f11041d.setVisibility(0);
            b0().f10997b.f11043f.setText(String.valueOf(i9));
        } else {
            b0().f10997b.f11041d.setVisibility(4);
        }
    }

    private final void R() {
        String str;
        if (getContext() != null) {
            Q.b bVar = X4.Q.f12437k;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            X4.Q e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                if (e8.z(requireContext2)) {
                    e0(e8);
                    return;
                }
            }
            I0();
        }
    }

    private final void S(Context context) {
        c0().d(context);
        I0();
    }

    private final void T(final Context context) {
        Object obj;
        final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        C1382o c8 = C1382o.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f10784f;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        c8.f10781c.setTypeface(aVar.u());
        c8.f10780b.setTypeface(aVar.u());
        c8.f10782d.setTypeface(aVar.u());
        String j8 = SettingsPreferences.f29323b.j(context);
        if (g6.n.s(j8, "yes", true)) {
            c8.f10781c.setChecked(true);
        } else if (g6.n.s(j8, "no", true)) {
            c8.f10780b.setChecked(true);
        } else {
            c8.f10782d.setChecked(true);
        }
        c8.f10781c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: U4.u1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                F1.U(kotlin.jvm.internal.T.this, this, compoundButton, z8);
            }
        });
        c8.f10780b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: U4.v1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                F1.V(kotlin.jvm.internal.T.this, this, compoundButton, z8);
            }
        });
        c8.f10782d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: U4.w1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                F1.W(kotlin.jvm.internal.T.this, context, compoundButton, z8);
            }
        });
        c8.f10783e.setTypeface(aVar.t());
        c8.f10783e.setOnClickListener(new View.OnClickListener() { // from class: U4.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.X(kotlin.jvm.internal.T.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f33761a = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing() && (obj = t8.f33761a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f33761a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(F1 this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1 && this$0.isAdded()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).r5(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(kotlin.jvm.internal.T alertDialog, F1 this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(alertDialog, "$alertDialog");
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            Object obj = alertDialog.f33761a;
            AbstractC3159y.f(obj);
            ((AlertDialog) obj).dismiss();
            this$0.n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(kotlin.jvm.internal.T alertDialog, F1 this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(alertDialog, "$alertDialog");
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            Object obj = alertDialog.f33761a;
            AbstractC3159y.f(obj);
            ((AlertDialog) obj).dismiss();
            this$0.H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(kotlin.jvm.internal.T alertDialog, Context context, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(alertDialog, "$alertDialog");
        AbstractC3159y.i(context, "$context");
        if (z8) {
            Object obj = alertDialog.f33761a;
            AbstractC3159y.f(obj);
            ((AlertDialog) obj).dismiss();
            SettingsPreferences.f29323b.B0(context, "system");
            AppCompatDelegate.setDefaultNightMode(-1);
            UptodownApp.f28003B.q0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(kotlin.jvm.internal.T alertDialog, View view) {
        AbstractC3159y.i(alertDialog, "$alertDialog");
        Object obj = alertDialog.f33761a;
        AbstractC3159y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    private final void Y(final Context context) {
        Object obj;
        final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        T4.r c8 = T4.r.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f10821d;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        c8.f10821d.setText(getString(R.string.log_out_confirmation_msg));
        c8.f10822e.setTypeface(aVar.t());
        c8.f10822e.setOnClickListener(new View.OnClickListener() { // from class: U4.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.Z(F1.this, context, t8, view);
            }
        });
        c8.f10820c.setTypeface(aVar.t());
        c8.f10820c.setOnClickListener(new View.OnClickListener() { // from class: U4.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.a0(kotlin.jvm.internal.T.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f33761a = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing() && (obj = t8.f33761a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f33761a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(F1 this$0, Context context, kotlin.jvm.internal.T alertDialog, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        AbstractC3159y.i(alertDialog, "$alertDialog");
        this$0.S(context);
        Object obj = alertDialog.f33761a;
        AbstractC3159y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(kotlin.jvm.internal.T alertDialog, View view) {
        AbstractC3159y.i(alertDialog, "$alertDialog");
        Object obj = alertDialog.f33761a;
        AbstractC3159y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    private final void d0() {
        b0().f10994E.f11041d.setVisibility(4);
        b0().f10997b.f11041d.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(final X4.Q q8) {
        if (q8.e() != null) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(X4.Q.f12437k.c(q8.c()));
            UptodownApp.a aVar = UptodownApp.f28003B;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            l8.n(aVar.f0(requireContext)).i(b0().f11001f);
            b0().f11001f.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.shadow_user_icon));
        } else {
            b0().f11001f.setImageResource(R.drawable.vector_user_profile);
        }
        b0().f11001f.setOnClickListener(new View.OnClickListener() { // from class: U4.X0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.f0(F1.this, q8, view);
            }
        });
        ImageView imageView = b0().f11001f;
        AbstractC3159y.h(imageView, "binding.ivUserAvatarUserFragment");
        imageView.setPadding(0, 0, 0, 0);
        b0().f10991B.setText(q8.n());
        if (q8.G() && !AbstractC3159y.d(q8.u(), "type0")) {
            UsernameTextView.a aVar2 = UsernameTextView.f29990k;
            UsernameTextView usernameTextView = b0().f10991B;
            AbstractC3159y.h(usernameTextView, "binding.tvUsernameUserFragment");
            aVar2.a(usernameTextView, q8.G(), q8.u());
        } else {
            UsernameTextView.a aVar3 = UsernameTextView.f29990k;
            UsernameTextView usernameTextView2 = b0().f10991B;
            AbstractC3159y.h(usernameTextView2, "binding.tvUsernameUserFragment");
            aVar3.b(usernameTextView2);
        }
        if (q8.s() > 0) {
            TextView textView = b0().f11018w;
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            textView.setText(q8.b(requireContext2));
        }
        G1 c02 = c0();
        Context requireContext3 = requireContext();
        AbstractC3159y.h(requireContext3, "requireContext()");
        c02.f(requireContext3, q8);
        b0().f11019x.setOnClickListener(new View.OnClickListener() { // from class: U4.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.g0(F1.this, q8, view);
            }
        });
        if (q8.G()) {
            C3323k.a aVar4 = C3323k.f34497a;
            ImageView imageView2 = b0().f11001f;
            AbstractC3159y.h(imageView2, "binding.ivUserAvatarUserFragment");
            aVar4.a(imageView2);
            b0().f11014s.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_turbo_button));
            b0().f11002g.setVisibility(0);
        } else {
            b0().f11014s.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_blue_primary_button));
            b0().f11002g.setVisibility(8);
        }
        b0().f11019x.setVisibility(0);
        b0().f11018w.setVisibility(0);
        b0().f11014s.setVisibility(0);
        b0().f11015t.setVisibility(0);
        b0().f11011p.setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(F1 this$0, X4.Q user, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(user, "$user");
        this$0.j0(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(F1 this$0, X4.Q user, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(user, "$user");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", user.getId());
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    private final void h0() {
        String str;
        if (getContext() != null) {
            Q.b bVar = X4.Q.f12437k;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            X4.Q e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                if (e8.z(requireContext2)) {
                    e0(e8);
                    UptodownApp.a aVar = UptodownApp.f28003B;
                    Context requireContext3 = requireContext();
                    AbstractC3159y.h(requireContext3, "requireContext()");
                    aVar.j0(requireContext3);
                    Context requireContext4 = requireContext();
                    AbstractC3159y.h(requireContext4, "requireContext()");
                    aVar.i0(requireContext4);
                    return;
                }
            }
            I0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(F1 this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            if (resultCode != 1002) {
                if (resultCode != 1) {
                    if (resultCode == 2) {
                        this$0.h0();
                        return;
                    }
                    return;
                }
                this$0.h0();
                return;
            }
            this$0.l0();
            return;
        }
        this$0.I0();
    }

    private final void j0(X4.Q q8) {
        Intent intent = new Intent(requireContext(), (Class<?>) UserAvatarActivity.class);
        intent.putExtra("user", q8);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        startActivity(intent, aVar.a(requireActivity));
        this.f11123c = true;
    }

    private final void k0() {
        Intent intent = new Intent(requireContext(), (Class<?>) LoginActivity.class);
        ActivityResultLauncher activityResultLauncher = this.f11124d;
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    private final void l0() {
        Intent intent = new Intent(requireContext(), (Class<?>) SettingsPreferences.class);
        ActivityResultLauncher activityResultLauncher = this.f11125e;
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    private final void n0() {
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        aVar.B0(requireContext, "yes");
        AppCompatDelegate.setDefaultNightMode(2);
        UptodownApp.f28003B.q0(true);
    }

    private final void o0() {
        Q.b bVar = X4.Q.f12437k;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        final X4.Q e8 = bVar.e(requireContext);
        if (e8 != null && getContext() != null) {
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            if (e8.z(requireContext2)) {
                e0(e8);
            }
        }
        S0();
        b0().f11001f.setOnClickListener(new View.OnClickListener() { // from class: U4.C1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.p0(X4.Q.this, this, view);
            }
        });
        b0().f11011p.setOnClickListener(new View.OnClickListener() { // from class: U4.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.q0(F1.this, view);
            }
        });
        b0().f11014s.setOnClickListener(new View.OnClickListener() { // from class: U4.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.z0(F1.this, view);
            }
        });
        b0().f10994E.f11040c.setOnClickListener(new View.OnClickListener() { // from class: U4.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.A0(F1.this, view);
            }
        });
        b0().f11008m.f11040c.setOnClickListener(new View.OnClickListener() { // from class: U4.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.B0(F1.this, view);
            }
        });
        b0().f10997b.f11040c.setOnClickListener(new View.OnClickListener() { // from class: U4.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.C0(F1.this, view);
            }
        });
        b0().f11012q.f11040c.setOnClickListener(new View.OnClickListener() { // from class: U4.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.D0(F1.this, view);
            }
        });
        b0().f10995F.f11040c.setOnClickListener(new View.OnClickListener() { // from class: U4.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.E0(F1.this, view);
            }
        });
        b0().f10993D.f11040c.setOnClickListener(new View.OnClickListener() { // from class: U4.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.F0(F1.this, view);
            }
        });
        b0().f11002g.setOnClickListener(new View.OnClickListener() { // from class: U4.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.G0(F1.this, view);
            }
        });
        b0().f11004i.setOnClickListener(new View.OnClickListener() { // from class: U4.D1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.r0(F1.this, view);
            }
        });
        b0().f11003h.setOnClickListener(new View.OnClickListener() { // from class: U4.E1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.s0(F1.this, view);
            }
        });
        b0().f11005j.setOnClickListener(new View.OnClickListener() { // from class: U4.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.t0(F1.this, view);
            }
        });
        if (e8 != null && e8.G()) {
            b0().f11000e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_support_turbo));
        } else {
            b0().f11000e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_support));
        }
        b0().f11006k.setOnClickListener(new View.OnClickListener() { // from class: U4.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.u0(F1.this, view);
            }
        });
        b0().f10992C.setOnClickListener(new View.OnClickListener() { // from class: U4.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.v0(F1.this, view);
            }
        });
        b0().f11015t.setOnClickListener(new View.OnClickListener() { // from class: U4.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.w0(F1.this, view);
            }
        });
        b0().f10999d.setOnClickListener(new View.OnClickListener() { // from class: U4.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F1.x0(F1.this, view);
            }
        });
        b0().f10999d.setOnLongClickListener(new View.OnLongClickListener() { // from class: U4.d1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean y02;
                y02 = F1.y0(F1.this, view);
                return y02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(X4.Q q8, F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (q8 != null) {
            this$0.j0(q8);
        } else {
            this$0.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) SecurityActivity.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.requireContext(), (Class<?>) NotificationsRegistryActivity.class);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = this$0.requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this$0.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getActivity() != null) {
            String string = this$0.getString(R.string.url_support);
            AbstractC3159y.h(string, "getString(R.string.url_support)");
            Q.b bVar = X4.Q.f12437k;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            X4.Q e8 = bVar.e(requireActivity);
            if (e8 != null && e8.G()) {
                string = this$0.getString(R.string.url_support_turbo);
                AbstractC3159y.h(string, "getString(R.string.url_support_turbo)");
            }
            C3323k c3323k = new C3323k();
            FragmentActivity requireActivity2 = this$0.requireActivity();
            AbstractC3159y.h(requireActivity2, "requireActivity()");
            c3323k.q(requireActivity2, string, this$0.getString(R.string.support_title));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getActivity() != null && !this$0.requireActivity().isFinishing()) {
            String str = this$0.getString(R.string.url) + "/android";
            C3323k c3323k = new C3323k();
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C3323k.r(c3323k, requireActivity, str, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        this$0.Y(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getContext() != null && UptodownApp.f28003B.a0()) {
            if (new C3323k().o(this$0.getContext())) {
                this$0.n0();
            } else {
                this$0.H0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getContext() != null) {
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            this$0.T(requireContext);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(F1 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.M0();
    }

    public final void R0(X4.Q user) {
        AbstractC3159y.i(user, "user");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(user, null), 3, null);
    }

    public final void S0() {
        if (isAdded() && getContext() != null) {
            G1 c02 = c0();
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            c02.e(requireContext);
            return;
        }
        d0();
    }

    public final T4.y0 b0() {
        T4.y0 y0Var = this.f11121a;
        if (y0Var != null) {
            return y0Var;
        }
        AbstractC3159y.y("binding");
        return null;
    }

    public final G1 c0() {
        return (G1) this.f11122b.getValue();
    }

    public final void m0(T4.y0 y0Var) {
        AbstractC3159y.i(y0Var, "<set-?>");
        this.f11121a = y0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        boolean z8 = false;
        T4.y0 c8 = T4.y0.c(inflater, viewGroup, false);
        AbstractC3159y.h(c8, "inflate(inflater, container, false)");
        m0(c8);
        int i8 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.margin_l);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.user_fragment_card_size);
        int i9 = -1;
        for (int i10 = 6; !z8 && i10 > 0; i10--) {
            int i11 = i8 - ((i10 + 1) * dimensionPixelSize);
            if (i11 >= dimensionPixelSize2 * i10) {
                b0().f10998c.setColumnCount(i10);
                b0().f10998c.setRowCount(6 / i10);
                z8 = true;
                i9 = i11 / i10;
            }
        }
        if (i9 > 0) {
            b0().f11008m.f11040c.getLayoutParams().height = i9;
            b0().f10994E.f11040c.getLayoutParams().height = i9;
            b0().f10997b.f11040c.getLayoutParams().height = i9;
            b0().f11012q.f11040c.getLayoutParams().height = i9;
            b0().f10995F.f11040c.getLayoutParams().height = i9;
            b0().f10993D.f11040c.getLayoutParams().height = i9;
        }
        RelativeLayout root = b0().getRoot();
        AbstractC3159y.h(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        S0();
        if (this.f11123c) {
            this.f11123c = false;
            h0();
        }
        if (new C3323k().o(getContext())) {
            b0().f10999d.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_dark_mode));
        } else {
            b0().f10999d.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_light_mode));
        }
        R();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        UsernameTextView usernameTextView = b0().f10991B;
        j.a aVar = E4.j.f2274g;
        usernameTextView.setTypeface(aVar.t());
        b0().f11018w.setTypeface(aVar.u());
        b0().f11019x.setTypeface(aVar.t());
        b0().f11014s.setTypeface(aVar.t());
        b0().f11008m.f11042e.setTypeface(aVar.u());
        b0().f11008m.f11042e.setText(getString(R.string.my_apps_menu_left));
        b0().f11008m.f11039b.setImageResource(R.drawable.vector_user_panel_my_apps);
        b0().f10994E.f11042e.setTypeface(aVar.u());
        b0().f10994E.f11043f.setTypeface(aVar.u());
        b0().f10994E.f11042e.setText(getString(R.string.updates));
        b0().f10994E.f11039b.setImageResource(R.drawable.vector_user_panel_updates);
        b0().f10997b.f11042e.setTypeface(aVar.u());
        b0().f10997b.f11043f.setTypeface(aVar.u());
        b0().f10997b.f11042e.setText(getString(R.string.downloads_title));
        b0().f10997b.f11039b.setImageResource(R.drawable.vector_user_panel_download);
        b0().f11012q.f11042e.setTypeface(aVar.u());
        b0().f11012q.f11042e.setText(getString(R.string.rollback_title));
        b0().f11012q.f11039b.setImageResource(R.drawable.vector_user_panel_rollback);
        b0().f10995F.f11042e.setTypeface(aVar.u());
        b0().f10995F.f11042e.setText(getString(R.string.wishlist_title));
        b0().f10995F.f11039b.setImageResource(R.drawable.vector_user_panel_wishlist);
        b0().f10993D.f11042e.setTypeface(aVar.u());
        b0().f10993D.f11042e.setText(getString(R.string.upcoming_releases_title));
        b0().f10993D.f11039b.setImageResource(R.drawable.vector_user_panel_upcoming);
        b0().f11016u.setTypeface(aVar.u());
        b0().f11020y.setTypeface(aVar.u());
        b0().f11017v.setTypeface(aVar.u());
        b0().f11021z.setTypeface(aVar.u());
        b0().f10990A.setTypeface(aVar.u());
        b0().f10992C.setTypeface(aVar.u());
        b0().f11015t.setTypeface(aVar.u());
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new a(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new b(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
        o0();
    }
}
