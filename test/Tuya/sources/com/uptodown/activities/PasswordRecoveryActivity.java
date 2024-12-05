package com.uptodown.activities;

import E4.j;
import L5.InterfaceC1227k;
import T4.C1360a0;
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
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.C3312F;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PasswordRecoveryActivity extends AbstractActivityC2489a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1227k f28725N = L5.l.b(new a());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1360a0 invoke() {
            return C1360a0.c(PasswordRecoveryActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28727a;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28727a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                PasswordRecoveryActivity passwordRecoveryActivity = PasswordRecoveryActivity.this;
                this.f28727a = 1;
                if (passwordRecoveryActivity.f3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28729a;

        /* renamed from: b, reason: collision with root package name */
        Object f28730b;

        /* renamed from: c, reason: collision with root package name */
        Object f28731c;

        /* renamed from: d, reason: collision with root package name */
        Object f28732d;

        /* renamed from: e, reason: collision with root package name */
        Object f28733e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28734f;

        /* renamed from: h, reason: collision with root package name */
        int f28736h;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28734f = obj;
            this.f28736h |= Integer.MIN_VALUE;
            return PasswordRecoveryActivity.this.f3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28737a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f28738b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PasswordRecoveryActivity f28739c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f28740d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f28741e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t8, PasswordRecoveryActivity passwordRecoveryActivity, T t9, T t10, P5.d dVar) {
            super(2, dVar);
            this.f28738b = t8;
            this.f28739c = passwordRecoveryActivity;
            this.f28740d = t9;
            this.f28741e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f28738b, this.f28739c, this.f28740d, this.f28741e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28737a == 0) {
                L5.t.b(obj);
                this.f28738b.f33761a = this.f28739c.getString(R.string.error_generico);
                this.f28739c.g3().f10393d.f10185b.setVisibility(0);
                this.f28740d.f33761a = this.f28739c.g3().f10392c.getText().toString();
                this.f28741e.f33761a = this.f28739c.g3().f10391b.getText().toString();
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28742a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f28744c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f28745d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f28746e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Q f28747f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28748a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f28749b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.I f28750c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ PasswordRecoveryActivity f28751d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f28752e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, X4.I i8, PasswordRecoveryActivity passwordRecoveryActivity, T t8, P5.d dVar) {
                super(2, dVar);
                this.f28749b = q8;
                this.f28750c = i8;
                this.f28751d = passwordRecoveryActivity;
                this.f28752e = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28749b, this.f28750c, this.f28751d, this.f28752e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28748a == 0) {
                    L5.t.b(obj);
                    if (this.f28749b.f33759a == 0 || this.f28750c.b()) {
                        this.f28751d.k3((String) this.f28752e.f33761a);
                    } else {
                        PasswordRecoveryActivity passwordRecoveryActivity = this.f28751d;
                        passwordRecoveryActivity.k3(passwordRecoveryActivity.getString(R.string.msg_success_recuperar_pass));
                        this.f28751d.finish();
                    }
                    this.f28751d.g3().f10393d.f10185b.setVisibility(8);
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T t8, T t9, T t10, Q q8, P5.d dVar) {
            super(2, dVar);
            this.f28744c = t8;
            this.f28745d = t9;
            this.f28746e = t10;
            this.f28747f = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28744c, this.f28745d, this.f28746e, this.f28747f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28742a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                X4.I J02 = new C3312F(PasswordRecoveryActivity.this).J0((String) this.f28744c.f33761a, (String) this.f28745d.f33761a);
                if (J02.d() != null) {
                    String d8 = J02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = J02.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        this.f28746e.f33761a = J02.g(jSONObject);
                        if (!jSONObject.isNull("success")) {
                            this.f28747f.f33759a = jSONObject.getInt("success");
                        }
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(this.f28747f, J02, PasswordRecoveryActivity.this, this.f28746e, null);
                this.f28742a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    private final void e3() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(P5.d r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            boolean r1 = r0 instanceof com.uptodown.activities.PasswordRecoveryActivity.c
            if (r1 == 0) goto L18
            r1 = r0
            com.uptodown.activities.PasswordRecoveryActivity$c r1 = (com.uptodown.activities.PasswordRecoveryActivity.c) r1
            int r2 = r1.f28736h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f28736h = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            com.uptodown.activities.PasswordRecoveryActivity$c r1 = new com.uptodown.activities.PasswordRecoveryActivity$c
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r7.f28734f
            java.lang.Object r8 = Q5.b.e()
            int r1 = r7.f28736h
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L5d
            if (r1 == r10) goto L3b
            if (r1 != r9) goto L33
            L5.t.b(r0)
            goto Lc6
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            java.lang.Object r1 = r7.f28733e
            kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
            java.lang.Object r2 = r7.f28732d
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r3 = r7.f28731c
            kotlin.jvm.internal.T r3 = (kotlin.jvm.internal.T) r3
            java.lang.Object r4 = r7.f28730b
            kotlin.jvm.internal.Q r4 = (kotlin.jvm.internal.Q) r4
            java.lang.Object r5 = r7.f28729a
            com.uptodown.activities.PasswordRecoveryActivity r5 = (com.uptodown.activities.PasswordRecoveryActivity) r5
            L5.t.b(r0)
            r18 = r1
            r17 = r2
            r19 = r3
            r20 = r4
            r16 = r5
            goto La5
        L5d:
            L5.t.b(r0)
            kotlin.jvm.internal.Q r11 = new kotlin.jvm.internal.Q
            r11.<init>()
            kotlin.jvm.internal.T r12 = new kotlin.jvm.internal.T
            r12.<init>()
            kotlin.jvm.internal.T r13 = new kotlin.jvm.internal.T
            r13.<init>()
            kotlin.jvm.internal.T r14 = new kotlin.jvm.internal.T
            r14.<init>()
            i6.J0 r15 = i6.C2812b0.c()
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
            r7.f28729a = r6
            r7.f28730b = r11
            r7.f28731c = r12
            r7.f28732d = r13
            r7.f28733e = r14
            r7.f28736h = r10
            java.lang.Object r0 = i6.AbstractC2825i.g(r15, r9, r7)
            if (r0 != r8) goto L9b
            return r8
        L9b:
            r16 = r6
            r20 = r11
            r19 = r12
            r17 = r13
            r18 = r14
        La5:
            i6.I r0 = i6.C2812b0.b()
            com.uptodown.activities.PasswordRecoveryActivity$e r1 = new com.uptodown.activities.PasswordRecoveryActivity$e
            r21 = 0
            r15 = r1
            r15.<init>(r17, r18, r19, r20, r21)
            r2 = 0
            r7.f28729a = r2
            r7.f28730b = r2
            r7.f28731c = r2
            r7.f28732d = r2
            r7.f28733e = r2
            r2 = 2
            r7.f28736h = r2
            java.lang.Object r0 = i6.AbstractC2825i.g(r0, r1, r7)
            if (r0 != r8) goto Lc6
            return r8
        Lc6:
            L5.I r0 = L5.I.f6487a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.PasswordRecoveryActivity.f3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1360a0 g3() {
        return (C1360a0) this.f28725N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(PasswordRecoveryActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(PasswordRecoveryActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!g6.n.s(this$0.g3().f10392c.getText().toString(), "", true) && !g6.n.s(this$0.g3().f10391b.getText().toString(), "", true)) {
            if (!g6.n.s(this$0.g3().f10392c.getText().toString(), this$0.g3().f10391b.getText().toString(), true)) {
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
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g3().getRoot());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_password_recovery);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
                toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.A2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PasswordRecoveryActivity.h3(PasswordRecoveryActivity.this, view);
                    }
                });
            }
            TextView textView = (TextView) findViewById(R.id.tv_title_toolbar_password_recovery);
            if (textView != null) {
                textView.setTypeface(E4.j.f2274g.t());
            }
        }
        EditText editText = g3().f10392c;
        j.a aVar = E4.j.f2274g;
        editText.setTypeface(aVar.u());
        g3().f10391b.setTypeface(aVar.u());
        g3().f10395f.setTypeface(aVar.t());
        g3().f10395f.setOnClickListener(new View.OnClickListener() { // from class: A4.B2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordRecoveryActivity.i3(PasswordRecoveryActivity.this, view);
            }
        });
        g3().f10393d.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.C2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordRecoveryActivity.j3(view);
            }
        });
    }
}
