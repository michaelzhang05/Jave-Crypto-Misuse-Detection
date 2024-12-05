package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import X4.Q;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.C2494f;
import com.uptodown.activities.LoginActivity;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class LoginActivity extends AbstractActivityC2493e {

    /* renamed from: p0, reason: collision with root package name */
    public static final a f28377p0 = new a(null);

    /* renamed from: X, reason: collision with root package name */
    private Drawable f28380X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f28381Y;

    /* renamed from: V, reason: collision with root package name */
    private final InterfaceC1227k f28378V = L5.l.b(new b());

    /* renamed from: W, reason: collision with root package name */
    private final InterfaceC1227k f28379W = new ViewModelLazy(U.b(C2494f.class), new j(this), new i(this), new k(null, this));

    /* renamed from: Z, reason: collision with root package name */
    private final d f28382Z = new d();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.L invoke() {
            return T4.L.c(LoginActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            LoginActivity.this.N3().f10188c.getRoot().setVisibility(8);
            LoginActivity.this.l4();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends OnBackPressedCallback {

        /* loaded from: classes4.dex */
        public static final class a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f28386a;

            a(LoginActivity loginActivity) {
                this.f28386a = loginActivity;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC3159y.i(animation, "animation");
                this.f28386a.N3().f10189d.getRoot().setVisibility(8);
                this.f28386a.k4();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                AbstractC3159y.i(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                AbstractC3159y.i(animation, "animation");
            }
        }

        d() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (LoginActivity.this.N3().f10189d.getRoot().getVisibility() == 0) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(200L);
                alphaAnimation.setAnimationListener(new a(LoginActivity.this));
                LoginActivity.this.N3().f10189d.getRoot().startAnimation(alphaAnimation);
                return;
            }
            LoginActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28387a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f28389a;

            a(LoginActivity loginActivity) {
                this.f28389a = loginActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28389a.N3().f10187b.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    Q e8 = Q.f12437k.e(this.f28389a);
                    if (e8 != null && e8.z(this.f28389a)) {
                        AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                        if (((C2494f.a) cVar.a()).a() != null) {
                            this.f28389a.d2(((C2494f.a) cVar.a()).a());
                        }
                        this.f28389a.t3();
                        this.f28389a.setResult(1);
                    } else {
                        AbstractC3337y.c cVar2 = (AbstractC3337y.c) abstractC3337y;
                        if (((C2494f.a) cVar2.a()).b() != null) {
                            this.f28389a.d2(((C2494f.a) cVar2.a()).b());
                        } else {
                            LoginActivity loginActivity = this.f28389a;
                            String string = loginActivity.getString(R.string.login_error_message);
                            AbstractC3159y.h(string, "getString(R.string.login_error_message)");
                            loginActivity.d2(string);
                        }
                    }
                    this.f28389a.N3().f10187b.f10185b.setVisibility(8);
                    if (e8 != null && e8.z(this.f28389a) && ((C2494f.a) ((AbstractC3337y.c) abstractC3337y).a()).a() == null) {
                        this.f28389a.getOnBackPressedDispatcher().onBackPressed();
                    }
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6487a;
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28387a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = LoginActivity.this.O3().e();
                a aVar = new a(LoginActivity.this);
                this.f28387a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28390a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f28392a;

            a(LoginActivity loginActivity) {
                this.f28392a = loginActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28392a.N3().f10187b.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((C2494f.b) cVar.a()).c() == 1) {
                        String b8 = ((C2494f.b) cVar.a()).b();
                        if (b8 != null && b8.length() != 0) {
                            this.f28392a.d2(((C2494f.b) cVar.a()).b());
                        }
                        this.f28392a.i4();
                        this.f28392a.j4();
                    } else {
                        String a8 = ((C2494f.b) cVar.a()).a();
                        if (a8 != null && a8.length() != 0) {
                            this.f28392a.d2(((C2494f.b) cVar.a()).a());
                        } else {
                            LoginActivity loginActivity = this.f28392a;
                            String string = loginActivity.getString(R.string.signup_error_message);
                            AbstractC3159y.h(string, "getString(R.string.signup_error_message)");
                            loginActivity.d2(string);
                        }
                    }
                    this.f28392a.N3().f10187b.f10185b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6487a;
            }
        }

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
            Object e8 = Q5.b.e();
            int i8 = this.f28390a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K f8 = LoginActivity.this.O3().f();
                a aVar = new a(LoginActivity.this);
                this.f28390a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Animation.AnimationListener {
        g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            LoginActivity.this.N3().f10188c.getRoot().setVisibility(0);
            LoginActivity.this.N3().f10191f.setText(R.string.title_login);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Animation.AnimationListener {
        h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3159y.i(animation, "animation");
            LoginActivity.this.N3().f10189d.getRoot().setVisibility(0);
            LoginActivity.this.N3().f10191f.setText(R.string.title_sign_up);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3159y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28395a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f28395a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28395a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28396a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f28396a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28396a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28398b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28397a = function0;
            this.f28398b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28397a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28398b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T4.L N3() {
        return (T4.L) this.f28378V.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2494f O3() {
        return (C2494f) this.f28379W.getValue();
    }

    private final void P3() {
        Object systemService = getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.hideSoftInputFromWindow(N3().f10189d.f10744c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f10189d.f10746e.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f10189d.f10745d.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f10188c.f10194c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(N3().f10188c.f10193b.getWindowToken(), 0);
    }

    private final void Q3() {
        TextView textView = (TextView) findViewById(R.id.tv_title_download_benefit);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_download_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_title_discover_benefit)).setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_discover_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_title_share_benefit)).setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_share_benefit)).setTypeface(aVar.u());
    }

    private final void R3() {
        setContentView(N3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        this.f28380X = drawable;
        if (drawable != null) {
            AbstractC3159y.f(drawable);
            S2(drawable, ContextCompat.getColor(this, R.color.toolbar_icon));
            N3().f10190e.setNavigationIcon(this.f28380X);
            N3().f10190e.setNavigationContentDescription(getString(R.string.back));
        }
        N3().f10190e.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.S3(LoginActivity.this, view);
            }
        });
        TextView textView = N3().f10191f;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        N3().f10188c.f10201j.setTypeface(aVar.t());
        N3().f10188c.f10198g.setTypeface(aVar.u());
        N3().f10189d.f10751j.setTypeface(aVar.u());
        N3().f10187b.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.T3(view);
            }
        });
        N3().f10188c.f10201j.setOnClickListener(new View.OnClickListener() { // from class: A4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.X3(LoginActivity.this, view);
            }
        });
        N3().f10188c.f10199h.setTypeface(aVar.t());
        N3().f10188c.f10199h.setOnClickListener(new View.OnClickListener() { // from class: A4.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.Y3(LoginActivity.this, view);
            }
        });
        N3().f10188c.f10194c.setTypeface(aVar.u());
        N3().f10188c.f10194c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.e0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.Z3(LoginActivity.this, view, z8);
            }
        });
        N3().f10188c.f10193b.setTypeface(aVar.u());
        N3().f10188c.f10193b.setImeOptions(6);
        N3().f10188c.f10193b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: A4.f0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i8, KeyEvent keyEvent) {
                boolean a42;
                a42 = LoginActivity.a4(LoginActivity.this, textView2, i8, keyEvent);
                return a42;
            }
        });
        N3().f10188c.f10193b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.g0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.b4(LoginActivity.this, view, z8);
            }
        });
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 23) {
            Drawable[] compoundDrawables = N3().f10188c.f10193b.getCompoundDrawables();
            AbstractC3159y.h(compoundDrawables, "binding.loginForm.etPassLogin.compoundDrawables");
            Drawable drawable2 = compoundDrawables[0];
            if (drawable2 != null) {
                AbstractC3159y.f(drawable2);
                drawable2.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.tv_pass_forget_login);
        if (textView2 != null) {
            textView2.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: A4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.c4(LoginActivity.this, view);
                }
            });
        }
        N3().f10189d.f10753l.setTypeface(aVar.t());
        N3().f10189d.f10753l.setOnClickListener(new View.OnClickListener() { // from class: A4.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.d4(LoginActivity.this, view);
            }
        });
        N3().f10189d.f10746e.setTypeface(aVar.u());
        N3().f10189d.f10746e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.X
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.e4(LoginActivity.this, view, z8);
            }
        });
        N3().f10189d.f10750i.setTypeface(aVar.t());
        N3().f10189d.f10750i.setOnClickListener(new View.OnClickListener() { // from class: A4.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.U3(LoginActivity.this, view);
            }
        });
        N3().f10189d.f10744c.setTypeface(aVar.u());
        N3().f10189d.f10744c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.Z
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.V3(LoginActivity.this, view, z8);
            }
        });
        N3().f10189d.f10745d.setTypeface(aVar.u());
        N3().f10189d.f10745d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.a0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.W3(LoginActivity.this, view, z8);
            }
        });
        if (i8 < 23) {
            Drawable[] compoundDrawables2 = N3().f10189d.f10745d.getCompoundDrawables();
            AbstractC3159y.h(compoundDrawables2, "binding.signUpForm.etPassSignUp.compoundDrawables");
            Drawable drawable3 = compoundDrawables2[0];
            if (drawable3 != null) {
                AbstractC3159y.f(drawable3);
                drawable3.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        N3().f10189d.f10743b.setTypeface(aVar.u());
        N3().f10189d.f10743b.setMovementMethod(LinkMovementMethod.getInstance());
        T4.L binding = N3();
        AbstractC3159y.h(binding, "binding");
        h3(binding);
        Q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f28382Z.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.N3().f10189d.f10744c.setHint("");
        } else {
            this$0.N3().f10189d.f10744c.setHint(this$0.getString(R.string.hint_email_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.N3().f10189d.f10745d.setHint("");
        } else {
            this$0.N3().f10189d.f10745d.setHint(this$0.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.N3().f10189d.getRoot().getVisibility() != 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new c());
            this$0.N3().f10188c.getRoot().startAnimation(alphaAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.N3().f10188c.f10194c.setHint("");
        } else {
            this$0.N3().f10188c.f10194c.setHint(this$0.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a4(LoginActivity this$0, TextView textView, int i8, KeyEvent keyEvent) {
        AbstractC3159y.i(this$0, "this$0");
        if (i8 == 6) {
            this$0.h4();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.N3().f10188c.f10193b.setHint("");
        } else {
            this$0.N3().f10188c.f10193b.setHint(this$0.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class), UptodownApp.f28003B.a(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(LoginActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.m4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(LoginActivity this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.N3().f10189d.f10746e.setHint("");
        } else {
            this$0.N3().f10189d.f10746e.setHint(this$0.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    private final void f4(String str, String str2) {
        O3().c(this, str, str2);
    }

    private final void g4(String str, String str2, String str3) {
        O3().d(this, str, str2, str3);
    }

    private final void h4() {
        P3();
        if (O3().g(N3().f10188c.f10194c.getText().toString(), N3().f10188c.f10193b.getText().toString())) {
            f4(N3().f10188c.f10194c.getText().toString(), N3().f10188c.f10193b.getText().toString());
            return;
        }
        Toast makeText = Toast.makeText(getApplicationContext(), R.string.faltan_datos_login, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i4() {
        T4.L N32 = N3();
        N32.f10189d.f10746e.setText("");
        N32.f10188c.f10194c.setText("");
        N32.f10189d.f10744c.setText("");
        N32.f10189d.f10744c.setEnabled(true);
        N32.f10189d.f10745d.setText("");
        N32.f10188c.f10193b.setText("");
        N32.f10189d.f10743b.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j4() {
        T4.L N32 = N3();
        N32.f10191f.setText(getString(R.string.title_login));
        N32.f10188c.getRoot().setVisibility(0);
        N32.f10189d.getRoot().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new g());
        TextView c32 = c3();
        if (c32 != null) {
            c32.setText(getString(R.string.title_login));
        }
        N3().f10188c.getRoot().setVisibility(0);
        N3().f10188c.getRoot().startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new h());
        TextView c32 = c3();
        if (c32 != null) {
            c32.setText(getString(R.string.sign_up_with_google));
        }
        N3().f10189d.getRoot().setVisibility(0);
        N3().f10189d.getRoot().startAnimation(alphaAnimation);
    }

    private final void m4() {
        P3();
        boolean i8 = O3().i(N3().f10189d.f10744c.getText().toString());
        if (O3().h(N3().f10189d.f10746e.getText().toString(), N3().f10189d.f10744c.getText().toString(), N3().f10189d.f10745d.getText().toString()) && i8 && N3().f10189d.f10743b.isChecked()) {
            g4(N3().f10189d.f10746e.getText().toString(), N3().f10189d.f10744c.getText().toString(), N3().f10189d.f10745d.getText().toString());
            return;
        }
        if (!N3().f10189d.f10743b.isChecked()) {
            Toast makeText = Toast.makeText(getApplicationContext(), R.string.falta_condiciones_uso, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } else if (N3().f10189d.f10745d.length() < 6) {
            Toast makeText2 = Toast.makeText(getApplicationContext(), R.string.error_password_too_short, 1);
            makeText2.setGravity(17, 0, 0);
            makeText2.show();
        } else if (!i8) {
            Toast makeText3 = Toast.makeText(getApplicationContext(), R.string.error_email_not_valid, 1);
            makeText3.setGravity(17, 0, 0);
            makeText3.show();
        } else {
            Toast makeText4 = Toast.makeText(getApplicationContext(), getString(R.string.faltan_datos_registro), 1);
            makeText4.setGravity(17, 0, 0);
            makeText4.show();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, android.app.Activity
    public void finish() {
        if (this.f28381Y) {
            setResult(2);
        }
        super.finish();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void g3() {
        N3().f10187b.f10185b.setVisibility(8);
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    public void n3(String id, String str) {
        AbstractC3159y.i(id, "id");
        N3().f10188c.f10194c.setText(id);
        N3().f10188c.f10193b.setText(str);
        h4();
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e, com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, this.f28382Z);
        R3();
        AbstractC2825i.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
        AbstractC2825i.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Drawable drawable = this.f28380X;
        if (drawable != null) {
            AbstractC3159y.f(drawable);
            DrawableCompat.setTintList(drawable, null);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        super.onDestroy();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        String str;
        super.onResume();
        P3();
        Q e8 = Q.f12437k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null && e8.z(this)) {
            finish();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void p3(Q q8) {
        String str;
        if (q8 != null) {
            q8.L(this);
        }
        try {
            if (q8 != null) {
                str = q8.n();
            } else {
                str = null;
            }
            AccountManager.get(getBaseContext()).addAccountExplicitly(new Account(str, getString(R.string.account)), null, null);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void r3(Q q8, String str) {
        String str2;
        g3();
        EditText editText = N3().f10189d.f10746e;
        String str3 = null;
        if (q8 != null) {
            str2 = q8.n();
        } else {
            str2 = null;
        }
        editText.setText(str2);
        EditText editText2 = N3().f10189d.f10744c;
        if (q8 != null) {
            str3 = q8.k();
        }
        editText2.setText(str3);
        N3().f10189d.f10744c.setEnabled(false);
        if (str != null) {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void s3() {
        N3().f10187b.f10185b.setVisibility(0);
    }

    @Override // com.uptodown.activities.AbstractActivityC2493e
    protected void t3() {
        Toast.makeText(this, R.string.login_successful, 0).show();
    }
}
