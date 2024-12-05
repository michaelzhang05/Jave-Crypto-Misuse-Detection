package com.uptodown.activities;

import H4.j;
import O5.InterfaceC1355k;
import W4.C1469a0;
import a6.InterfaceC1668n;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import com.uptodown.activities.PasswordRecoveryActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PasswordRecoveryActivity extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29779N = O5.l.b(new a());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1469a0 invoke() {
            return C1469a0.c(PasswordRecoveryActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29781a;

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
            int i8 = this.f29781a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                PasswordRecoveryActivity passwordRecoveryActivity = PasswordRecoveryActivity.this;
                this.f29781a = 1;
                if (passwordRecoveryActivity.f3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29783a;

        /* renamed from: b, reason: collision with root package name */
        Object f29784b;

        /* renamed from: c, reason: collision with root package name */
        Object f29785c;

        /* renamed from: d, reason: collision with root package name */
        Object f29786d;

        /* renamed from: e, reason: collision with root package name */
        Object f29787e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f29788f;

        /* renamed from: h, reason: collision with root package name */
        int f29790h;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29788f = obj;
            this.f29790h |= Integer.MIN_VALUE;
            return PasswordRecoveryActivity.this.f3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f29792b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PasswordRecoveryActivity f29793c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f29794d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f29795e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t8, PasswordRecoveryActivity passwordRecoveryActivity, T t9, T t10, S5.d dVar) {
            super(2, dVar);
            this.f29792b = t8;
            this.f29793c = passwordRecoveryActivity;
            this.f29794d = t9;
            this.f29795e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f29792b, this.f29793c, this.f29794d, this.f29795e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29791a == 0) {
                O5.t.b(obj);
                this.f29792b.f34162a = this.f29793c.getString(R.string.error_generico);
                this.f29793c.g3().f12050d.f11842b.setVisibility(0);
                this.f29794d.f34162a = this.f29793c.g3().f12049c.getText().toString();
                this.f29795e.f34162a = this.f29793c.g3().f12048b.getText().toString();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29796a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f29798c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f29799d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f29800e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Q f29801f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f29803b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a5.I f29804c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ PasswordRecoveryActivity f29805d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f29806e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, a5.I i8, PasswordRecoveryActivity passwordRecoveryActivity, T t8, S5.d dVar) {
                super(2, dVar);
                this.f29803b = q8;
                this.f29804c = i8;
                this.f29805d = passwordRecoveryActivity;
                this.f29806e = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29803b, this.f29804c, this.f29805d, this.f29806e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29802a == 0) {
                    O5.t.b(obj);
                    if (this.f29803b.f34160a == 0 || this.f29804c.b()) {
                        this.f29805d.k3((String) this.f29806e.f34162a);
                    } else {
                        PasswordRecoveryActivity passwordRecoveryActivity = this.f29805d;
                        passwordRecoveryActivity.k3(passwordRecoveryActivity.getString(R.string.msg_success_recuperar_pass));
                        this.f29805d.finish();
                    }
                    this.f29805d.g3().f12050d.f11842b.setVisibility(8);
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T t8, T t9, T t10, Q q8, S5.d dVar) {
            super(2, dVar);
            this.f29798c = t8;
            this.f29799d = t9;
            this.f29800e = t10;
            this.f29801f = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f29798c, this.f29799d, this.f29800e, this.f29801f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29796a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                a5.I J02 = new C3660F(PasswordRecoveryActivity.this).J0((String) this.f29798c.f34162a, (String) this.f29799d.f34162a);
                if (J02.d() != null) {
                    String d8 = J02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = J02.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        this.f29800e.f34162a = J02.g(jSONObject);
                        if (!jSONObject.isNull("success")) {
                            this.f29801f.f34160a = jSONObject.getInt("success");
                        }
                    }
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(this.f29801f, J02, PasswordRecoveryActivity.this, this.f29800e, null);
                this.f29796a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    private final void e3() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(S5.d r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            boolean r1 = r0 instanceof com.uptodown.activities.PasswordRecoveryActivity.c
            if (r1 == 0) goto L18
            r1 = r0
            com.uptodown.activities.PasswordRecoveryActivity$c r1 = (com.uptodown.activities.PasswordRecoveryActivity.c) r1
            int r2 = r1.f29790h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f29790h = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            com.uptodown.activities.PasswordRecoveryActivity$c r1 = new com.uptodown.activities.PasswordRecoveryActivity$c
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f29788f
            java.lang.Object r8 = T5.b.e()
            int r1 = r7.f29790h
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L5d
            if (r1 == r10) goto L3b
            if (r1 != r9) goto L33
            O5.t.b(r0)
            goto Lc6
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            java.lang.Object r1 = r7.f29787e
            kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
            java.lang.Object r2 = r7.f29786d
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r3 = r7.f29785c
            kotlin.jvm.internal.T r3 = (kotlin.jvm.internal.T) r3
            java.lang.Object r4 = r7.f29784b
            kotlin.jvm.internal.Q r4 = (kotlin.jvm.internal.Q) r4
            java.lang.Object r5 = r7.f29783a
            com.uptodown.activities.PasswordRecoveryActivity r5 = (com.uptodown.activities.PasswordRecoveryActivity) r5
            O5.t.b(r0)
            r18 = r1
            r17 = r2
            r19 = r3
            r20 = r4
            r16 = r5
            goto La5
        L5d:
            O5.t.b(r0)
            kotlin.jvm.internal.Q r11 = new kotlin.jvm.internal.Q
            r11.<init>()
            kotlin.jvm.internal.T r12 = new kotlin.jvm.internal.T
            r12.<init>()
            kotlin.jvm.internal.T r13 = new kotlin.jvm.internal.T
            r13.<init>()
            kotlin.jvm.internal.T r14 = new kotlin.jvm.internal.T
            r14.<init>()
            l6.J0 r15 = l6.C3347b0.c()
            com.uptodown.activities.PasswordRecoveryActivity$d r5 = new com.uptodown.activities.PasswordRecoveryActivity$d
            r16 = 0
            r0 = r5
            r1 = r12
            r2 = r22
            r3 = r13
            r4 = r14
            r9 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f29783a = r6
            r7.f29784b = r11
            r7.f29785c = r12
            r7.f29786d = r13
            r7.f29787e = r14
            r7.f29790h = r10
            java.lang.Object r0 = l6.AbstractC3360i.g(r15, r9, r7)
            if (r0 != r8) goto L9b
            return r8
        L9b:
            r16 = r6
            r20 = r11
            r19 = r12
            r17 = r13
            r18 = r14
        La5:
            l6.I r0 = l6.C3347b0.b()
            com.uptodown.activities.PasswordRecoveryActivity$e r1 = new com.uptodown.activities.PasswordRecoveryActivity$e
            r21 = 0
            r15 = r1
            r15.<init>(r17, r18, r19, r20, r21)
            r2 = 0
            r7.f29783a = r2
            r7.f29784b = r2
            r7.f29785c = r2
            r7.f29786d = r2
            r7.f29787e = r2
            r2 = 2
            r7.f29790h = r2
            java.lang.Object r0 = l6.AbstractC3360i.g(r0, r1, r7)
            if (r0 != r8) goto Lc6
            return r8
        Lc6:
            O5.I r0 = O5.I.f8278a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.PasswordRecoveryActivity.f3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1469a0 g3() {
        return (C1469a0) this.f29779N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(PasswordRecoveryActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(PasswordRecoveryActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (!j6.n.s(this$0.g3().f12049c.getText().toString(), "", true) && !j6.n.s(this$0.g3().f12048b.getText().toString(), "", true)) {
            if (!j6.n.s(this$0.g3().f12049c.getText().toString(), this$0.g3().f12048b.getText().toString(), true)) {
                this$0.k3(this$0.getString(R.string.error_emails_no_coinciden));
                return;
            } else {
                this$0.e3();
                return;
            }
        }
        this$0.k3(this$0.getString(R.string.error_email_vacio_recuperar_pass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3(String str) {
        if (str != null) {
            Toast makeText = Toast.makeText(this, str, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g3().getRoot());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_password_recovery);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
                toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.B2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PasswordRecoveryActivity.h3(PasswordRecoveryActivity.this, view);
                    }
                });
            }
            TextView textView = (TextView) findViewById(R.id.tv_title_toolbar_password_recovery);
            if (textView != null) {
                textView.setTypeface(H4.j.f3824g.t());
            }
        }
        EditText editText = g3().f12049c;
        j.a aVar = H4.j.f3824g;
        editText.setTypeface(aVar.u());
        g3().f12048b.setTypeface(aVar.u());
        g3().f12052f.setTypeface(aVar.t());
        g3().f12052f.setOnClickListener(new View.OnClickListener() { // from class: D4.C2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordRecoveryActivity.i3(PasswordRecoveryActivity.this, view);
            }
        });
        g3().f12050d.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.D2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordRecoveryActivity.j3(view);
            }
        });
    }
}
