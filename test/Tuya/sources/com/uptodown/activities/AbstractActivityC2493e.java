package com.uptodown.activities;

import E4.j;
import X4.Q;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.uptodown.R;
import com.uptodown.activities.AbstractActivityC2493e;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3330r;
import l5.C3333u;

/* renamed from: com.uptodown.activities.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC2493e extends AbstractActivityC2489a {

    /* renamed from: U, reason: collision with root package name */
    public static final a f29184U = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private TextView f29185N;

    /* renamed from: O, reason: collision with root package name */
    private com.google.android.gms.auth.api.signin.b f29186O;

    /* renamed from: P, reason: collision with root package name */
    private final ActivityResultLauncher f29187P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f29188Q;

    /* renamed from: R, reason: collision with root package name */
    private Credential f29189R;

    /* renamed from: S, reason: collision with root package name */
    private Credential f29190S;

    /* renamed from: T, reason: collision with root package name */
    private final ActivityResultLauncher f29191T;

    /* renamed from: com.uptodown.activities.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f29192a;

        /* renamed from: b, reason: collision with root package name */
        int f29193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f29194c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2493e f29195d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.e$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29196a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2493e f29197b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractActivityC2493e abstractActivityC2493e, P5.d dVar) {
                super(2, dVar);
                this.f29197b = abstractActivityC2493e;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29197b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29196a == 0) {
                    L5.t.b(obj);
                    this.f29197b.s3();
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0706b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29198a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3333u f29199b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2493e f29200c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0706b(C3333u c3333u, AbstractActivityC2493e abstractActivityC2493e, P5.d dVar) {
                super(2, dVar);
                this.f29199b = c3333u;
                this.f29200c = abstractActivityC2493e;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0706b(this.f29199b, this.f29200c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0706b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29198a == 0) {
                    L5.t.b(obj);
                    if (this.f29199b.e()) {
                        this.f29200c.r3(this.f29199b.c(), this.f29199b.b());
                        this.f29200c.setResult(-1);
                    } else {
                        this.f29200c.p3(this.f29199b.c());
                        this.f29200c.t3();
                        this.f29200c.setResult(1);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "success");
                        bundle.putString("loginSource", "google");
                        C3330r t22 = this.f29200c.t2();
                        if (t22 != null) {
                            t22.b("login", bundle);
                        }
                    }
                    this.f29200c.g3();
                    Q e8 = Q.f12437k.e(this.f29200c);
                    if (e8 != null && e8.z(this.f29200c)) {
                        this.f29200c.finish();
                    } else {
                        this.f29200c.getOnBackPressedDispatcher().onBackPressed();
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(GoogleSignInAccount googleSignInAccount, AbstractActivityC2493e abstractActivityC2493e, P5.d dVar) {
            super(2, dVar);
            this.f29194c = googleSignInAccount;
            this.f29195d = abstractActivityC2493e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29194c, this.f29195d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f29193b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                L5.t.b(r9)
                goto L8b
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f29192a
                l5.u r1 = (l5.C3333u) r1
                L5.t.b(r9)
                goto L75
            L27:
                java.lang.Object r1 = r8.f29192a
                l5.u r1 = (l5.C3333u) r1
                L5.t.b(r9)
                goto L4e
            L2f:
                L5.t.b(r9)
                l5.u r9 = new l5.u
                r9.<init>()
                i6.J0 r1 = i6.C2812b0.c()
                com.uptodown.activities.e$b$a r6 = new com.uptodown.activities.e$b$a
                com.uptodown.activities.e r7 = r8.f29195d
                r6.<init>(r7, r5)
                r8.f29192a = r9
                r8.f29193b = r4
                java.lang.Object r1 = i6.AbstractC2825i.g(r1, r6, r8)
                if (r1 != r0) goto L4d
                return r0
            L4d:
                r1 = r9
            L4e:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r9 = r8.f29194c
                java.lang.String r9 = r9.I()
                if (r9 == 0) goto L75
                int r9 = r9.length()
                if (r9 != 0) goto L5d
                goto L75
            L5d:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r9 = r8.f29194c
                java.lang.String r9 = r9.I()
                kotlin.jvm.internal.AbstractC3159y.f(r9)
                com.uptodown.activities.e r4 = r8.f29195d
                r8.f29192a = r1
                r8.f29193b = r3
                java.lang.String r3 = "google"
                java.lang.Object r9 = r1.g(r9, r3, r4, r8)
                if (r9 != r0) goto L75
                return r0
            L75:
                i6.J0 r9 = i6.C2812b0.c()
                com.uptodown.activities.e$b$b r3 = new com.uptodown.activities.e$b$b
                com.uptodown.activities.e r4 = r8.f29195d
                r3.<init>(r1, r4, r5)
                r8.f29192a = r5
                r8.f29193b = r2
                java.lang.Object r9 = i6.AbstractC2825i.g(r9, r3, r8)
                if (r9 != r0) goto L8b
                return r0
            L8b:
                L5.I r9 = L5.I.f6487a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AbstractActivityC2493e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f29201a;

        /* renamed from: b, reason: collision with root package name */
        int f29202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f29203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2493e f29204d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.e$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29205a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3333u f29206b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2493e f29207c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3333u c3333u, AbstractActivityC2493e abstractActivityC2493e, P5.d dVar) {
                super(2, dVar);
                this.f29206b = c3333u;
                this.f29207c = abstractActivityC2493e;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29206b, this.f29207c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29205a == 0) {
                    L5.t.b(obj);
                    if (!this.f29206b.e()) {
                        this.f29207c.q3(this.f29206b.c());
                        Toast.makeText(this.f29207c, R.string.login_successful, 0).show();
                        this.f29207c.setResult(1);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "success");
                        bundle.putString("loginSource", "google");
                        C3330r t22 = this.f29207c.t2();
                        if (t22 != null) {
                            t22.b("login", bundle);
                        }
                    } else {
                        this.f29207c.setResult(-1);
                    }
                    Q e8 = Q.f12437k.e(this.f29207c);
                    if (e8 != null && e8.z(this.f29207c)) {
                        this.f29207c.i3();
                        this.f29207c.o3();
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(GoogleSignInAccount googleSignInAccount, AbstractActivityC2493e abstractActivityC2493e, P5.d dVar) {
            super(2, dVar);
            this.f29203c = googleSignInAccount;
            this.f29204d = abstractActivityC2493e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29203c, this.f29204d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3333u c3333u;
            Object e8 = Q5.b.e();
            int i8 = this.f29202b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3333u = (C3333u) this.f29201a;
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                c3333u = new C3333u();
                String I8 = this.f29203c.I();
                if (I8 != null && I8.length() != 0) {
                    String I9 = this.f29203c.I();
                    AbstractC3159y.f(I9);
                    AbstractActivityC2493e abstractActivityC2493e = this.f29204d;
                    this.f29201a = c3333u;
                    this.f29202b = 1;
                    if (c3333u.g(I9, "google", abstractActivityC2493e, this) == e8) {
                        return e8;
                    }
                }
            }
            J0 c8 = C2812b0.c();
            a aVar = new a(c3333u, this.f29204d, null);
            this.f29201a = null;
            this.f29202b = 2;
            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return L5.I.f6487a;
        }
    }

    public AbstractActivityC2493e() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.h0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractActivityC2493e.j3(AbstractActivityC2493e.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…  hideLoadingView()\n    }");
        this.f29187P = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.i0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractActivityC2493e.k3(AbstractActivityC2493e.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.f29191T = registerForActivityResult2;
    }

    private final void d3(RelativeLayout relativeLayout) {
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: A4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC2493e.e3(AbstractActivityC2493e.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(AbstractActivityC2493e this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.s3();
        this$0.l3();
    }

    private final void f3(Credential credential) {
        this.f29189R = credential;
        if (credential.s() == null) {
            String id = credential.getId();
            AbstractC3159y.h(id, "credential.id");
            n3(id, credential.L());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(AbstractActivityC2493e this$0, ActivityResult activityResult) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getData() != null) {
            Task b8 = com.google.android.gms.auth.api.signin.a.b(activityResult.getData());
            AbstractC3159y.h(b8, "getSignedInAccountFromIntent(result.data)");
            if (b8.n() && (googleSignInAccount = (GoogleSignInAccount) b8.j()) != null) {
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new b(googleSignInAccount, this$0, null), 3, null);
            }
        }
        this$0.g3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(AbstractActivityC2493e this$0, ActivityResult activityResult) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getData() != null) {
            Task b8 = com.google.android.gms.auth.api.signin.a.b(activityResult.getData());
            AbstractC3159y.h(b8, "getSignedInAccountFromIntent(result.data)");
            if (b8.n() && (googleSignInAccount = (GoogleSignInAccount) b8.j()) != null) {
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new c(googleSignInAccount, this$0, null), 3, null);
            }
        }
    }

    private final void l3() {
        com.google.android.gms.auth.api.signin.b bVar = this.f29186O;
        AbstractC3159y.f(bVar);
        Intent s8 = bVar.s();
        AbstractC3159y.h(s8, "mSignInClient!!.signInIntent");
        this.f29187P.launch(s8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q3(Q q8) {
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

    public final TextView c3() {
        return this.f29185N;
    }

    protected abstract void g3();

    public final void h3(T4.L binding) {
        AbstractC3159y.i(binding, "binding");
        TextView textView = binding.f10188c.f10200i;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        RelativeLayout relativeLayout = binding.f10188c.f10197f;
        AbstractC3159y.h(relativeLayout, "binding.loginForm.rlGoogleLogin");
        d3(relativeLayout);
        binding.f10189d.f10752k.setTypeface(aVar.t());
        RelativeLayout relativeLayout2 = binding.f10189d.f10749h;
        AbstractC3159y.h(relativeLayout2, "binding.signUpForm.rlGoogleLogin");
        d3(relativeLayout2);
    }

    public Q i3() {
        return null;
    }

    public final void m3() {
        Intent s8 = new C3333u().d(this).s();
        AbstractC3159y.h(s8, "mSignInClient.signInIntent");
        this.f29191T.launch(s8);
    }

    public void n3(String id, String str) {
        AbstractC3159y.i(id, "id");
    }

    public void o3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 != 2) {
            if (i8 == 3) {
                this.f29188Q = false;
                return;
            }
            return;
        }
        this.f29188Q = false;
        if (i9 == -1) {
            AbstractC3159y.f(intent);
            Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
            if (credential != null) {
                f3(credential);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        this.f29186O = new C3333u().d(this);
        if (bundle != null) {
            this.f29188Q = bundle.getBoolean("is_resolving", false);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                parcelable4 = bundle.getParcelable("key_credential", Credential.class);
                parcelable = (Parcelable) parcelable4;
            } else {
                parcelable = bundle.getParcelable("key_credential");
            }
            this.f29189R = (Credential) parcelable;
            if (i8 >= 33) {
                parcelable3 = bundle.getParcelable("key_credential_to_save", Credential.class);
                parcelable2 = (Parcelable) parcelable3;
            } else {
                parcelable2 = bundle.getParcelable("key_credential_to_save");
            }
            this.f29190S = (Credential) parcelable2;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC3159y.i(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("is_resolving", this.f29188Q);
        outState.putParcelable("key_credential", this.f29189R);
        outState.putParcelable("key_credential_to_save", this.f29190S);
    }

    protected abstract void p3(Q q8);

    protected abstract void r3(Q q8, String str);

    protected abstract void s3();

    protected abstract void t3();
}
