package D4;

import H4.j;
import a6.InterfaceC1668n;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.uptodown.R;
import com.uptodown.activities.AbstractActivityC2683a;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import o5.C3678r;
import o5.C3681u;

/* renamed from: D4.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC1109k0 extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private TextView f2084N;

    /* renamed from: O, reason: collision with root package name */
    private com.google.android.gms.auth.api.signin.b f2085O;

    /* renamed from: P, reason: collision with root package name */
    private final ActivityResultLauncher f2086P;

    /* renamed from: Q, reason: collision with root package name */
    private final ActivityResultLauncher f2087Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D4.k0$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f2088a;

        /* renamed from: b, reason: collision with root package name */
        int f2089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f2090c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1109k0 f2091d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: D4.k0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0024a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f2092a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1109k0 f2093b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0024a(AbstractActivityC1109k0 abstractActivityC1109k0, S5.d dVar) {
                super(2, dVar);
                this.f2093b = abstractActivityC1109k0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0024a(this.f2093b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f2092a == 0) {
                    O5.t.b(obj);
                    this.f2093b.q3();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((C0024a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: D4.k0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f2094a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3681u f2095b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1109k0 f2096c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C3681u c3681u, AbstractActivityC1109k0 abstractActivityC1109k0, S5.d dVar) {
                super(2, dVar);
                this.f2095b = c3681u;
                this.f2096c = abstractActivityC1109k0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f2095b, this.f2096c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f2094a == 0) {
                    O5.t.b(obj);
                    if (this.f2095b.e()) {
                        this.f2096c.p3(this.f2095b.c(), this.f2095b.b());
                        this.f2096c.setResult(-1);
                    } else {
                        this.f2096c.n3(this.f2095b.c());
                        this.f2096c.r3();
                        this.f2096c.setResult(1);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "success");
                        bundle.putString("loginSource", "google");
                        C3678r t22 = this.f2096c.t2();
                        if (t22 != null) {
                            t22.b("login", bundle);
                        }
                    }
                    this.f2096c.f3();
                    a5.Q e8 = a5.Q.f14058k.e(this.f2096c);
                    if (e8 != null && e8.x(this.f2096c)) {
                        this.f2096c.finish();
                    } else {
                        this.f2096c.getOnBackPressedDispatcher().onBackPressed();
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(GoogleSignInAccount googleSignInAccount, AbstractActivityC1109k0 abstractActivityC1109k0, S5.d dVar) {
            super(2, dVar);
            this.f2090c = googleSignInAccount;
            this.f2091d = abstractActivityC1109k0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f2090c, this.f2091d, dVar);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r8.f2089b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                O5.t.b(r9)
                goto L8b
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f2088a
                o5.u r1 = (o5.C3681u) r1
                O5.t.b(r9)
                goto L75
            L27:
                java.lang.Object r1 = r8.f2088a
                o5.u r1 = (o5.C3681u) r1
                O5.t.b(r9)
                goto L4e
            L2f:
                O5.t.b(r9)
                o5.u r9 = new o5.u
                r9.<init>()
                l6.J0 r1 = l6.C3347b0.c()
                D4.k0$a$a r6 = new D4.k0$a$a
                D4.k0 r7 = r8.f2091d
                r6.<init>(r7, r5)
                r8.f2088a = r9
                r8.f2089b = r4
                java.lang.Object r1 = l6.AbstractC3360i.g(r1, r6, r8)
                if (r1 != r0) goto L4d
                return r0
            L4d:
                r1 = r9
            L4e:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r9 = r8.f2090c
                java.lang.String r9 = r9.z()
                if (r9 == 0) goto L75
                int r9 = r9.length()
                if (r9 != 0) goto L5d
                goto L75
            L5d:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r9 = r8.f2090c
                java.lang.String r9 = r9.z()
                kotlin.jvm.internal.AbstractC3255y.f(r9)
                D4.k0 r4 = r8.f2091d
                r8.f2088a = r1
                r8.f2089b = r3
                java.lang.String r3 = "google"
                java.lang.Object r9 = r1.g(r9, r3, r4, r8)
                if (r9 != r0) goto L75
                return r0
            L75:
                l6.J0 r9 = l6.C3347b0.c()
                D4.k0$a$b r3 = new D4.k0$a$b
                D4.k0 r4 = r8.f2091d
                r3.<init>(r1, r4, r5)
                r8.f2088a = r5
                r8.f2089b = r2
                java.lang.Object r9 = l6.AbstractC3360i.g(r9, r3, r8)
                if (r9 != r0) goto L8b
                return r0
            L8b:
                O5.I r9 = O5.I.f8278a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.AbstractActivityC1109k0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D4.k0$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f2097a;

        /* renamed from: b, reason: collision with root package name */
        int f2098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f2099c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC1109k0 f2100d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: D4.k0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f2101a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3681u f2102b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC1109k0 f2103c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3681u c3681u, AbstractActivityC1109k0 abstractActivityC1109k0, S5.d dVar) {
                super(2, dVar);
                this.f2102b = c3681u;
                this.f2103c = abstractActivityC1109k0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f2102b, this.f2103c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f2101a == 0) {
                    O5.t.b(obj);
                    if (!this.f2102b.e()) {
                        this.f2103c.o3(this.f2102b.c());
                        Toast.makeText(this.f2103c, R.string.login_successful, 0).show();
                        this.f2103c.setResult(1);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "success");
                        bundle.putString("loginSource", "google");
                        C3678r t22 = this.f2103c.t2();
                        if (t22 != null) {
                            t22.b("login", bundle);
                        }
                    } else {
                        this.f2103c.setResult(-1);
                    }
                    a5.Q e8 = a5.Q.f14058k.e(this.f2103c);
                    if (e8 != null && e8.x(this.f2103c)) {
                        this.f2103c.h3();
                        this.f2103c.m3();
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(GoogleSignInAccount googleSignInAccount, AbstractActivityC1109k0 abstractActivityC1109k0, S5.d dVar) {
            super(2, dVar);
            this.f2099c = googleSignInAccount;
            this.f2100d = abstractActivityC1109k0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f2099c, this.f2100d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3681u c3681u;
            Object e8 = T5.b.e();
            int i8 = this.f2098b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3681u = (C3681u) this.f2097a;
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                c3681u = new C3681u();
                String z8 = this.f2099c.z();
                if (z8 != null && z8.length() != 0) {
                    String z9 = this.f2099c.z();
                    AbstractC3255y.f(z9);
                    AbstractActivityC1109k0 abstractActivityC1109k0 = this.f2100d;
                    this.f2097a = c3681u;
                    this.f2098b = 1;
                    if (c3681u.g(z9, "google", abstractActivityC1109k0, this) == e8) {
                        return e8;
                    }
                }
            }
            l6.J0 c8 = C3347b0.c();
            a aVar = new a(c3681u, this.f2100d, null);
            this.f2097a = null;
            this.f2098b = 2;
            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public AbstractActivityC1109k0() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.h0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractActivityC1109k0.i3(AbstractActivityC1109k0.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…  hideLoadingView()\n    }");
        this.f2086P = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.i0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractActivityC1109k0.j3(AbstractActivityC1109k0.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.f2087Q = registerForActivityResult2;
    }

    private final void d3(RelativeLayout relativeLayout) {
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: D4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC1109k0.e3(AbstractActivityC1109k0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(AbstractActivityC1109k0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.q3();
        this$0.k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(AbstractActivityC1109k0 this$0, ActivityResult activityResult) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getData() != null) {
            Task b8 = com.google.android.gms.auth.api.signin.a.b(activityResult.getData());
            AbstractC3255y.h(b8, "getSignedInAccountFromIntent(result.data)");
            if (b8.n() && (googleSignInAccount = (GoogleSignInAccount) b8.j()) != null) {
                AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new a(googleSignInAccount, this$0, null), 3, null);
            }
        }
        this$0.f3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(AbstractActivityC1109k0 this$0, ActivityResult activityResult) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getData() != null) {
            Task b8 = com.google.android.gms.auth.api.signin.a.b(activityResult.getData());
            AbstractC3255y.h(b8, "getSignedInAccountFromIntent(result.data)");
            if (b8.n() && (googleSignInAccount = (GoogleSignInAccount) b8.j()) != null) {
                AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new b(googleSignInAccount, this$0, null), 3, null);
            }
        }
    }

    private final void k3() {
        com.google.android.gms.auth.api.signin.b bVar = this.f2085O;
        AbstractC3255y.f(bVar);
        Intent s8 = bVar.s();
        AbstractC3255y.h(s8, "mSignInClient!!.signInIntent");
        this.f2086P.launch(s8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3(a5.Q q8) {
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

    public final TextView c3() {
        return this.f2084N;
    }

    protected abstract void f3();

    public final void g3(W4.L binding) {
        AbstractC3255y.i(binding, "binding");
        TextView textView = binding.f11845c.f11857i;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        RelativeLayout relativeLayout = binding.f11845c.f11854f;
        AbstractC3255y.h(relativeLayout, "binding.loginForm.rlGoogleLogin");
        d3(relativeLayout);
        binding.f11846d.f12409k.setTypeface(aVar.t());
        RelativeLayout relativeLayout2 = binding.f11846d.f12406h;
        AbstractC3255y.h(relativeLayout2, "binding.signUpForm.rlGoogleLogin");
        d3(relativeLayout2);
    }

    public a5.Q h3() {
        return null;
    }

    public final void l3() {
        Intent s8 = new C3681u().d(this).s();
        AbstractC3255y.h(s8, "mSignInClient.signInIntent");
        this.f2087Q.launch(s8);
    }

    protected abstract void n3(a5.Q q8);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2085O = new C3681u().d(this);
    }

    protected abstract void p3(a5.Q q8, String str);

    protected abstract void q3();

    protected abstract void r3();

    public void m3() {
    }
}
