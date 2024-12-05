package com.uptodown.activities;

import D4.AbstractActivityC1109k0;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.L;
import a5.Q;
import a6.InterfaceC1668n;
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
import com.uptodown.activities.C2687e;
import com.uptodown.activities.LoginActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class LoginActivity extends AbstractActivityC1109k0 {

    /* renamed from: W, reason: collision with root package name */
    public static final a f29431W = new a(null);

    /* renamed from: T, reason: collision with root package name */
    private Drawable f29434T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f29435U;

    /* renamed from: R, reason: collision with root package name */
    private final InterfaceC1355k f29432R = O5.l.b(new b());

    /* renamed from: S, reason: collision with root package name */
    private final InterfaceC1355k f29433S = new ViewModelLazy(U.b(C2687e.class), new j(this), new i(this), new k(null, this));

    /* renamed from: V, reason: collision with root package name */
    private final d f29436V = new d();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L invoke() {
            return L.c(LoginActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            LoginActivity.this.L3().f11845c.getRoot().setVisibility(8);
            LoginActivity.this.j4();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends OnBackPressedCallback {

        /* loaded from: classes4.dex */
        public static final class a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f29440a;

            a(LoginActivity loginActivity) {
                this.f29440a = loginActivity;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC3255y.i(animation, "animation");
                this.f29440a.L3().f11846d.getRoot().setVisibility(8);
                this.f29440a.i4();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                AbstractC3255y.i(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                AbstractC3255y.i(animation, "animation");
            }
        }

        d() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (LoginActivity.this.L3().f11846d.getRoot().getVisibility() == 0) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(200L);
                alphaAnimation.setAnimationListener(new a(LoginActivity.this));
                LoginActivity.this.L3().f11846d.getRoot().startAnimation(alphaAnimation);
                return;
            }
            LoginActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29441a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f29443a;

            a(LoginActivity loginActivity) {
                this.f29443a = loginActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29443a.L3().f11844b.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    Q e8 = Q.f14058k.e(this.f29443a);
                    if (e8 != null && e8.x(this.f29443a)) {
                        AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                        if (((C2687e.a) cVar.a()).a() != null) {
                            this.f29443a.d2(((C2687e.a) cVar.a()).a());
                        }
                        this.f29443a.r3();
                        this.f29443a.setResult(1);
                    } else {
                        AbstractC3685y.c cVar2 = (AbstractC3685y.c) abstractC3685y;
                        if (((C2687e.a) cVar2.a()).b() != null) {
                            this.f29443a.d2(((C2687e.a) cVar2.a()).b());
                        } else {
                            LoginActivity loginActivity = this.f29443a;
                            String string = loginActivity.getString(R.string.login_error_message);
                            AbstractC3255y.h(string, "getString(R.string.login_error_message)");
                            loginActivity.d2(string);
                        }
                    }
                    this.f29443a.L3().f11844b.f11842b.setVisibility(8);
                    if (e8 != null && e8.x(this.f29443a) && ((C2687e.a) ((AbstractC3685y.c) abstractC3685y).a()).a() == null) {
                        this.f29443a.getOnBackPressedDispatcher().onBackPressed();
                    }
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29441a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = LoginActivity.this.M3().e();
                a aVar = new a(LoginActivity.this);
                this.f29441a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29444a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LoginActivity f29446a;

            a(LoginActivity loginActivity) {
                this.f29446a = loginActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29446a.L3().f11844b.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (((C2687e.b) cVar.a()).c() == 1) {
                        String b8 = ((C2687e.b) cVar.a()).b();
                        if (b8 != null && b8.length() != 0) {
                            this.f29446a.d2(((C2687e.b) cVar.a()).b());
                        }
                        this.f29446a.g4();
                        this.f29446a.h4();
                    } else {
                        String a8 = ((C2687e.b) cVar.a()).a();
                        if (a8 != null && a8.length() != 0) {
                            this.f29446a.d2(((C2687e.b) cVar.a()).a());
                        } else {
                            LoginActivity loginActivity = this.f29446a;
                            String string = loginActivity.getString(R.string.signup_error_message);
                            AbstractC3255y.h(string, "getString(R.string.signup_error_message)");
                            loginActivity.d2(string);
                        }
                    }
                    this.f29446a.L3().f11844b.f11842b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29444a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L f8 = LoginActivity.this.M3().f();
                a aVar = new a(LoginActivity.this);
                this.f29444a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Animation.AnimationListener {
        g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            LoginActivity.this.L3().f11845c.getRoot().setVisibility(0);
            LoginActivity.this.L3().f11848f.setText(R.string.title_login);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Animation.AnimationListener {
        h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC3255y.i(animation, "animation");
            LoginActivity.this.L3().f11846d.getRoot().setVisibility(0);
            LoginActivity.this.L3().f11848f.setText(R.string.title_sign_up);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC3255y.i(animation, "animation");
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29449a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29449a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29450a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f29450a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29450a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29451a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29451a = function0;
            this.f29452b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29451a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29452b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L L3() {
        return (L) this.f29432R.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2687e M3() {
        return (C2687e) this.f29433S.getValue();
    }

    private final void N3() {
        Object systemService = getSystemService("input_method");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.hideSoftInputFromWindow(L3().f11846d.f12401c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(L3().f11846d.f12403e.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(L3().f11846d.f12402d.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(L3().f11845c.f11851c.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(L3().f11845c.f11850b.getWindowToken(), 0);
    }

    private final void O3() {
        TextView textView = (TextView) findViewById(R.id.tv_title_download_benefit);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_download_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_title_discover_benefit)).setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_discover_benefit)).setTypeface(aVar.u());
        ((TextView) findViewById(R.id.tv_title_share_benefit)).setTypeface(aVar.t());
        ((TextView) findViewById(R.id.tv_desc_share_benefit)).setTypeface(aVar.u());
    }

    private final void P3() {
        setContentView(L3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        this.f29434T = drawable;
        if (drawable != null) {
            AbstractC3255y.f(drawable);
            S2(drawable, ContextCompat.getColor(this, R.color.toolbar_icon));
            L3().f11847e.setNavigationIcon(this.f29434T);
            L3().f11847e.setNavigationContentDescription(getString(R.string.back));
        }
        L3().f11847e.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.Q3(LoginActivity.this, view);
            }
        });
        TextView textView = L3().f11848f;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        L3().f11845c.f11858j.setTypeface(aVar.t());
        L3().f11845c.f11855g.setTypeface(aVar.u());
        L3().f11846d.f12408j.setTypeface(aVar.u());
        L3().f11844b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.R3(view);
            }
        });
        L3().f11845c.f11858j.setOnClickListener(new View.OnClickListener() { // from class: D4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.V3(LoginActivity.this, view);
            }
        });
        L3().f11845c.f11856h.setTypeface(aVar.t());
        L3().f11845c.f11856h.setOnClickListener(new View.OnClickListener() { // from class: D4.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.W3(LoginActivity.this, view);
            }
        });
        L3().f11845c.f11851c.setTypeface(aVar.u());
        L3().f11845c.f11851c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: D4.e0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.X3(LoginActivity.this, view, z8);
            }
        });
        L3().f11845c.f11850b.setTypeface(aVar.u());
        L3().f11845c.f11850b.setImeOptions(6);
        L3().f11845c.f11850b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: D4.f0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i8, KeyEvent keyEvent) {
                boolean Y32;
                Y32 = LoginActivity.Y3(LoginActivity.this, textView2, i8, keyEvent);
                return Y32;
            }
        });
        L3().f11845c.f11850b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: D4.g0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.Z3(LoginActivity.this, view, z8);
            }
        });
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 23) {
            Drawable[] compoundDrawables = L3().f11845c.f11850b.getCompoundDrawables();
            AbstractC3255y.h(compoundDrawables, "binding.loginForm.etPassLogin.compoundDrawables");
            Drawable drawable2 = compoundDrawables[0];
            if (drawable2 != null) {
                AbstractC3255y.f(drawable2);
                drawable2.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.tv_pass_forget_login);
        if (textView2 != null) {
            textView2.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: D4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.a4(LoginActivity.this, view);
                }
            });
        }
        L3().f11846d.f12410l.setTypeface(aVar.t());
        L3().f11846d.f12410l.setOnClickListener(new View.OnClickListener() { // from class: D4.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.b4(LoginActivity.this, view);
            }
        });
        L3().f11846d.f12403e.setTypeface(aVar.u());
        L3().f11846d.f12403e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: D4.X
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.c4(LoginActivity.this, view, z8);
            }
        });
        L3().f11846d.f12407i.setTypeface(aVar.t());
        L3().f11846d.f12407i.setOnClickListener(new View.OnClickListener() { // from class: D4.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.S3(LoginActivity.this, view);
            }
        });
        L3().f11846d.f12401c.setTypeface(aVar.u());
        L3().f11846d.f12401c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: D4.Z
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.T3(LoginActivity.this, view, z8);
            }
        });
        L3().f11846d.f12402d.setTypeface(aVar.u());
        L3().f11846d.f12402d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: D4.a0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                LoginActivity.U3(LoginActivity.this, view, z8);
            }
        });
        if (i8 < 23) {
            Drawable[] compoundDrawables2 = L3().f11846d.f12402d.getCompoundDrawables();
            AbstractC3255y.h(compoundDrawables2, "binding.signUpForm.etPassSignUp.compoundDrawables");
            Drawable drawable3 = compoundDrawables2[0];
            if (drawable3 != null) {
                AbstractC3255y.f(drawable3);
                drawable3.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
        }
        L3().f11846d.f12400b.setTypeface(aVar.u());
        L3().f11846d.f12400b.setMovementMethod(LinkMovementMethod.getInstance());
        L binding = L3();
        AbstractC3255y.h(binding, "binding");
        g3(binding);
        O3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(LoginActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(LoginActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f29436V.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.L3().f11846d.f12401c.setHint("");
        } else {
            this$0.L3().f11846d.f12401c.setHint(this$0.getString(R.string.hint_email_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.L3().f11846d.f12402d.setHint("");
        } else {
            this$0.L3().f11846d.f12402d.setHint(this$0.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(LoginActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.L3().f11846d.getRoot().getVisibility() != 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new c());
            this$0.L3().f11845c.getRoot().startAnimation(alphaAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(LoginActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.L3().f11845c.f11851c.setHint("");
        } else {
            this$0.L3().f11845c.f11851c.setHint(this$0.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y3(LoginActivity this$0, TextView textView, int i8, KeyEvent keyEvent) {
        AbstractC3255y.i(this$0, "this$0");
        if (i8 == 6) {
            this$0.f4();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(LoginActivity this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.L3().f11845c.f11850b.setHint("");
        } else {
            this$0.L3().f11845c.f11850b.setHint(this$0.getString(R.string.hint_pass_login_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(LoginActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class), UptodownApp.f29058B.a(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(LoginActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(LoginActivity this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.L3().f11846d.f12403e.setHint("");
        } else {
            this$0.L3().f11846d.f12403e.setHint(this$0.getString(R.string.hint_nombre_usuario_login_registro));
        }
    }

    private final void d4(String str, String str2) {
        M3().c(this, str, str2);
    }

    private final void e4(String str, String str2, String str3) {
        M3().d(this, str, str2, str3);
    }

    private final void f4() {
        N3();
        if (M3().g(L3().f11845c.f11851c.getText().toString(), L3().f11845c.f11850b.getText().toString())) {
            d4(L3().f11845c.f11851c.getText().toString(), L3().f11845c.f11850b.getText().toString());
            return;
        }
        Toast makeText = Toast.makeText(getApplicationContext(), R.string.faltan_datos_login, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g4() {
        L L32 = L3();
        L32.f11846d.f12403e.setText("");
        L32.f11845c.f11851c.setText("");
        L32.f11846d.f12401c.setText("");
        L32.f11846d.f12401c.setEnabled(true);
        L32.f11846d.f12402d.setText("");
        L32.f11845c.f11850b.setText("");
        L32.f11846d.f12400b.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h4() {
        L L32 = L3();
        L32.f11848f.setText(getString(R.string.title_login));
        L32.f11845c.getRoot().setVisibility(0);
        L32.f11846d.getRoot().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new g());
        TextView c32 = c3();
        if (c32 != null) {
            c32.setText(getString(R.string.title_login));
        }
        L3().f11845c.getRoot().setVisibility(0);
        L3().f11845c.getRoot().startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j4() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new h());
        TextView c32 = c3();
        if (c32 != null) {
            c32.setText(getString(R.string.sign_up_with_google));
        }
        L3().f11846d.getRoot().setVisibility(0);
        L3().f11846d.getRoot().startAnimation(alphaAnimation);
    }

    private final void k4() {
        N3();
        boolean i8 = M3().i(L3().f11846d.f12401c.getText().toString());
        if (M3().h(L3().f11846d.f12403e.getText().toString(), L3().f11846d.f12401c.getText().toString(), L3().f11846d.f12402d.getText().toString()) && i8 && L3().f11846d.f12400b.isChecked()) {
            e4(L3().f11846d.f12403e.getText().toString(), L3().f11846d.f12401c.getText().toString(), L3().f11846d.f12402d.getText().toString());
            return;
        }
        if (!L3().f11846d.f12400b.isChecked()) {
            Toast makeText = Toast.makeText(getApplicationContext(), R.string.falta_condiciones_uso, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } else if (L3().f11846d.f12402d.length() < 6) {
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

    @Override // D4.AbstractActivityC1109k0
    protected void f3() {
        L3().f11844b.f11842b.setVisibility(8);
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, android.app.Activity
    public void finish() {
        if (this.f29435U) {
            setResult(2);
        }
        super.finish();
    }

    @Override // D4.AbstractActivityC1109k0
    protected void n3(Q q8) {
        String str;
        if (q8 != null) {
            q8.H(this);
        }
        try {
            if (q8 != null) {
                str = q8.s();
            } else {
                str = null;
            }
            AccountManager.get(getBaseContext()).addAccountExplicitly(new Account(str, getString(R.string.account)), null, null);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // D4.AbstractActivityC1109k0, com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, this.f29436V);
        P3();
        AbstractC3360i.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
        AbstractC3360i.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new f(null), 2, null);
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Drawable drawable = this.f29434T;
        if (drawable != null) {
            AbstractC3255y.f(drawable);
            DrawableCompat.setTintList(drawable, null);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        super.onDestroy();
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        String str;
        super.onResume();
        N3();
        Q e8 = Q.f14058k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null && e8.x(this)) {
            finish();
        }
    }

    @Override // D4.AbstractActivityC1109k0
    protected void p3(Q q8, String str) {
        String str2;
        f3();
        EditText editText = L3().f11846d.f12403e;
        String str3 = null;
        if (q8 != null) {
            str2 = q8.s();
        } else {
            str2 = null;
        }
        editText.setText(str2);
        EditText editText2 = L3().f11846d.f12401c;
        if (q8 != null) {
            str3 = q8.p();
        }
        editText2.setText(str3);
        L3().f11846d.f12401c.setEnabled(false);
        if (str != null) {
            Toast.makeText(this, str, 1).show();
        }
    }

    @Override // D4.AbstractActivityC1109k0
    protected void q3() {
        L3().f11844b.f11842b.setVisibility(0);
    }

    @Override // D4.AbstractActivityC1109k0
    protected void r3() {
        Toast.makeText(this, R.string.login_successful, 0).show();
    }
}
