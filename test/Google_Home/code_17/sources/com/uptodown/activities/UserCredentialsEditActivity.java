package com.uptodown.activities;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.A0;
import W4.Z;
import a5.Q;
import a5.S;
import a6.InterfaceC1668n;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.uptodown.R;
import com.uptodown.activities.I;
import com.uptodown.activities.UserCredentialsEditActivity;
import com.uptodown.util.views.UsernameTextView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class UserCredentialsEditActivity extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private Q f30081N;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f30082O = new ViewModelLazy(U.b(I.class), new e(this), new d(this), new f(null, this));

    /* renamed from: P, reason: collision with root package name */
    private Z f30083P;

    /* renamed from: Q, reason: collision with root package name */
    private A0 f30084Q;

    /* loaded from: classes4.dex */
    public static final class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A0 f30085a;

        public a(A0 a02) {
            this.f30085a = a02;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f30085a.f11686o.setText(charSequence);
            this.f30085a.f11687p.setText(charSequence);
            this.f30085a.f11688q.setText(charSequence);
            this.f30085a.f11689r.setText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30086a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A0 f30088c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f30089d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f30090e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A0 f30091a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f30092b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f30093c;

            a(A0 a02, kotlin.jvm.internal.Q q8, T t8) {
                this.f30091a = a02;
                this.f30092b = q8;
                this.f30093c = t8;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ArrayList arrayList, S5.d dVar) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    S s8 = (S) it.next();
                    int b8 = s8.b();
                    if (b8 != 0) {
                        if (b8 != 1) {
                            if (b8 != 2) {
                                if (b8 == 3) {
                                    this.f30091a.f11681j.setChecked(s8.d());
                                    UsernameTextView.a aVar = UsernameTextView.f31022k;
                                    UsernameTextView usernameTextView = this.f30091a.f11689r;
                                    AbstractC3255y.h(usernameTextView, "binding.tvUsernameType3");
                                    aVar.a(usernameTextView, s8.e(), s8.c());
                                }
                            } else {
                                this.f30091a.f11680i.setChecked(s8.d());
                                UsernameTextView.a aVar2 = UsernameTextView.f31022k;
                                UsernameTextView usernameTextView2 = this.f30091a.f11688q;
                                AbstractC3255y.h(usernameTextView2, "binding.tvUsernameType2");
                                aVar2.a(usernameTextView2, s8.e(), s8.c());
                            }
                        } else {
                            this.f30091a.f11679h.setChecked(s8.d());
                            UsernameTextView.a aVar3 = UsernameTextView.f31022k;
                            UsernameTextView usernameTextView3 = this.f30091a.f11687p;
                            AbstractC3255y.h(usernameTextView3, "binding.tvUsernameType1");
                            aVar3.a(usernameTextView3, s8.e(), s8.c());
                        }
                    } else {
                        this.f30091a.f11678g.setChecked(s8.d());
                        UsernameTextView.a aVar4 = UsernameTextView.f31022k;
                        UsernameTextView usernameTextView4 = this.f30091a.f11686o;
                        AbstractC3255y.h(usernameTextView4, "binding.tvUsernameType0");
                        aVar4.a(usernameTextView4, s8.e(), s8.c());
                    }
                    if (s8.d()) {
                        this.f30092b.f34160a = s8.b();
                        T t8 = this.f30093c;
                        String c8 = s8.c();
                        AbstractC3255y.f(c8);
                        if (c8.length() == 0) {
                            c8 = "type0";
                        }
                        t8.f34162a = c8;
                    }
                }
                return O5.I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(A0 a02, kotlin.jvm.internal.Q q8, T t8, S5.d dVar) {
            super(2, dVar);
            this.f30088c = a02;
            this.f30089d = q8;
            this.f30090e = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f30088c, this.f30089d, this.f30090e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30086a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L g8 = UserCredentialsEditActivity.this.m3().g();
                a aVar = new a(this.f30088c, this.f30089d, this.f30090e);
                this.f30086a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30094a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCredentialsEditActivity f30096a;

            /* renamed from: com.uptodown.activities.UserCredentialsEditActivity$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0695a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f30097a;

                static {
                    int[] iArr = new int[I.a.values().length];
                    try {
                        iArr[I.a.USERNAME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[I.a.PASSWORD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f30097a = iArr;
                }
            }

            a(UserCredentialsEditActivity userCredentialsEditActivity) {
                this.f30096a = userCredentialsEditActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                Z z8 = null;
                A0 a02 = null;
                Z z9 = null;
                A0 a03 = null;
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    if (this.f30096a.f30084Q != null) {
                        A0 a04 = this.f30096a.f30084Q;
                        if (a04 == null) {
                            AbstractC3255y.y("usernameEditBinding");
                        } else {
                            a02 = a04;
                        }
                        a02.f11677f.f11842b.setVisibility(0);
                    } else if (this.f30096a.f30083P != null) {
                        Z z10 = this.f30096a.f30083P;
                        if (z10 == null) {
                            AbstractC3255y.y("passwordEditBinding");
                        } else {
                            z9 = z10;
                        }
                        z9.f12039f.f11842b.setVisibility(0);
                    }
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    int i8 = C0695a.f30097a[((I.b) cVar.a()).a().ordinal()];
                    if (i8 != 1) {
                        if (i8 == 2) {
                            if (((I.b) cVar.a()).d() != 0 && !((I.b) cVar.a()).b()) {
                                UserCredentialsEditActivity userCredentialsEditActivity = this.f30096a;
                                String string = userCredentialsEditActivity.getString(R.string.password_edit_complete);
                                AbstractC3255y.h(string, "getString(R.string.password_edit_complete)");
                                userCredentialsEditActivity.A3(string);
                                this.f30096a.finish();
                            } else {
                                String c8 = ((I.b) cVar.a()).c();
                                if (c8 != null && c8.length() != 0) {
                                    this.f30096a.A3(((I.b) cVar.a()).c());
                                } else {
                                    UserCredentialsEditActivity userCredentialsEditActivity2 = this.f30096a;
                                    String string2 = userCredentialsEditActivity2.getString(R.string.error_generico);
                                    AbstractC3255y.h(string2, "getString(R.string.error_generico)");
                                    userCredentialsEditActivity2.A3(string2);
                                }
                            }
                        }
                    } else if (((I.b) cVar.a()).d() != 0 && !((I.b) cVar.a()).b()) {
                        UserCredentialsEditActivity userCredentialsEditActivity3 = this.f30096a;
                        String string3 = userCredentialsEditActivity3.getString(R.string.username_edit_complete);
                        AbstractC3255y.h(string3, "getString(R.string.username_edit_complete)");
                        userCredentialsEditActivity3.A3(string3);
                        this.f30096a.finish();
                    } else {
                        String c9 = ((I.b) cVar.a()).c();
                        if (c9 != null && c9.length() != 0) {
                            this.f30096a.A3(((I.b) cVar.a()).c());
                        } else {
                            UserCredentialsEditActivity userCredentialsEditActivity4 = this.f30096a;
                            String string4 = userCredentialsEditActivity4.getString(R.string.error_generico);
                            AbstractC3255y.h(string4, "getString(R.string.error_generico)");
                            userCredentialsEditActivity4.A3(string4);
                        }
                    }
                    if (this.f30096a.f30084Q != null) {
                        A0 a05 = this.f30096a.f30084Q;
                        if (a05 == null) {
                            AbstractC3255y.y("usernameEditBinding");
                        } else {
                            a03 = a05;
                        }
                        a03.f11677f.f11842b.setVisibility(0);
                    } else if (this.f30096a.f30083P != null) {
                        Z z11 = this.f30096a.f30083P;
                        if (z11 == null) {
                            AbstractC3255y.y("passwordEditBinding");
                        } else {
                            z8 = z11;
                        }
                        z8.f12039f.f11842b.setVisibility(0);
                    }
                } else {
                    boolean z12 = abstractC3685y instanceof AbstractC3685y.b;
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
            int i8 = this.f30094a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L f8 = UserCredentialsEditActivity.this.m3().f();
                a aVar = new a(UserCredentialsEditActivity.this);
                this.f30094a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30098a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f30098a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30098a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30099a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f30099a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30099a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30100a = function0;
            this.f30101b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30100a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30101b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(String str) {
        Toast makeText = Toast.makeText(this, str, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I m3() {
        return (I) this.f30082O.getValue();
    }

    private final void n3(final Z z8) {
        setContentView(z8.getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            z8.f12040g.setNavigationIcon(drawable);
            z8.f12040g.setNavigationContentDescription(getString(R.string.back));
            z8.f12040g.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.h4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserCredentialsEditActivity.p3(UserCredentialsEditActivity.this, view);
                }
            });
        }
        TextView textView = z8.f12042i;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        z8.f12036c.setTypeface(aVar.u());
        z8.f12035b.setTypeface(aVar.u());
        z8.f12041h.setTypeface(aVar.t());
        z8.f12038e.setOnClickListener(new View.OnClickListener() { // from class: D4.i4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.q3(UserCredentialsEditActivity.this, z8, view);
            }
        });
        z8.f12037d.setOnClickListener(new View.OnClickListener() { // from class: D4.j4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.r3(UserCredentialsEditActivity.this, z8, view);
            }
        });
        z8.f12041h.setOnClickListener(new View.OnClickListener() { // from class: D4.k4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.o3(UserCredentialsEditActivity.this, z8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(UserCredentialsEditActivity this$0, Z binding, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(binding, "$binding");
        H4.j.f3824g.d(this$0, binding.f12036c);
        if (!j6.n.s(binding.f12036c.getText().toString(), "", true) && !j6.n.s(binding.f12035b.getText().toString(), "", true)) {
            if (!j6.n.s(binding.f12036c.getText().toString(), binding.f12035b.getText().toString(), true)) {
                String string = this$0.getString(R.string.password_edit_not_match);
                AbstractC3255y.h(string, "getString(R.string.password_edit_not_match)");
                this$0.A3(string);
                return;
            }
            this$0.m3().c(this$0, binding.f12036c.getText().toString(), binding.f12035b.getText().toString());
            return;
        }
        String string2 = this$0.getString(R.string.error_email_vacio_recuperar_pass);
        AbstractC3255y.h(string2, "getString(R.string.error…ail_vacio_recuperar_pass)");
        this$0.A3(string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(UserCredentialsEditActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(UserCredentialsEditActivity this$0, Z binding, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(binding, "$binding");
        EditText editText = binding.f12036c;
        AbstractC3255y.h(editText, "binding.etPasswordEdit");
        ImageView imageView = binding.f12038e;
        AbstractC3255y.h(imageView, "binding.ivPasswordEdit");
        this$0.z3(editText, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(UserCredentialsEditActivity this$0, Z binding, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(binding, "$binding");
        EditText editText = binding.f12035b;
        AbstractC3255y.h(editText, "binding.etConfirmPasswordEdit");
        ImageView imageView = binding.f12037d;
        AbstractC3255y.h(imageView, "binding.ivConfirmPasswordEdit");
        this$0.z3(editText, imageView);
    }

    private final void s3(final A0 a02) {
        setContentView(a02.getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            a02.f11682k.setNavigationIcon(drawable);
            a02.f11682k.setNavigationContentDescription(getString(R.string.back));
            a02.f11682k.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.b4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserCredentialsEditActivity.t3(UserCredentialsEditActivity.this, view);
                }
            });
        }
        TextView textView = a02.f11683l;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        a02.f11684m.setTypeface(aVar.t());
        a02.f11673b.setTypeface(aVar.u());
        EditText editText = a02.f11673b;
        Q q8 = this.f30081N;
        AbstractC3255y.f(q8);
        editText.setText(q8.s());
        a02.f11685n.setTypeface(aVar.t());
        a02.f11686o.setTypeface(aVar.t());
        a02.f11687p.setTypeface(aVar.t());
        a02.f11688q.setTypeface(aVar.t());
        a02.f11689r.setTypeface(aVar.t());
        UsernameTextView usernameTextView = a02.f11686o;
        Q q9 = this.f30081N;
        AbstractC3255y.f(q9);
        usernameTextView.setText(q9.s());
        UsernameTextView usernameTextView2 = a02.f11687p;
        Q q10 = this.f30081N;
        AbstractC3255y.f(q10);
        usernameTextView2.setText(q10.s());
        UsernameTextView usernameTextView3 = a02.f11688q;
        Q q11 = this.f30081N;
        AbstractC3255y.f(q11);
        usernameTextView3.setText(q11.s());
        UsernameTextView usernameTextView4 = a02.f11689r;
        Q q12 = this.f30081N;
        AbstractC3255y.f(q12);
        usernameTextView4.setText(q12.s());
        final kotlin.jvm.internal.Q q13 = new kotlin.jvm.internal.Q();
        final T t8 = new T();
        t8.f34162a = "type0";
        a02.f11678g.setOnClickListener(new View.OnClickListener() { // from class: D4.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.u3(W4.A0.this, q13, t8, view);
            }
        });
        a02.f11679h.setOnClickListener(new View.OnClickListener() { // from class: D4.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.v3(W4.A0.this, q13, t8, view);
            }
        });
        a02.f11680i.setOnClickListener(new View.OnClickListener() { // from class: D4.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.w3(W4.A0.this, q13, t8, view);
            }
        });
        a02.f11681j.setOnClickListener(new View.OnClickListener() { // from class: D4.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.x3(W4.A0.this, q13, t8, view);
            }
        });
        Q q14 = this.f30081N;
        AbstractC3255y.f(q14);
        if (!q14.y()) {
            a02.f11678g.setChecked(true);
            a02.f11679h.setEnabled(false);
            a02.f11680i.setEnabled(false);
            a02.f11681j.setEnabled(false);
        }
        a02.f11685n.setOnClickListener(new View.OnClickListener() { // from class: D4.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCredentialsEditActivity.y3(UserCredentialsEditActivity.this, a02, q13, t8, view);
            }
        });
        EditText editText2 = a02.f11673b;
        AbstractC3255y.h(editText2, "binding.etUsernameEdit");
        editText2.addTextChangedListener(new a(a02));
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new b(a02, q13, t8, null), 2, null);
        m3().e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(UserCredentialsEditActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3255y.i(binding, "$binding");
        AbstractC3255y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3255y.i(usernameFormatName, "$usernameFormatName");
        binding.f11679h.setChecked(false);
        binding.f11680i.setChecked(false);
        binding.f11681j.setChecked(false);
        usernameFormatID.f34160a = 0;
        usernameFormatName.f34162a = "type0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3255y.i(binding, "$binding");
        AbstractC3255y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3255y.i(usernameFormatName, "$usernameFormatName");
        binding.f11678g.setChecked(false);
        binding.f11680i.setChecked(false);
        binding.f11681j.setChecked(false);
        usernameFormatID.f34160a = 1;
        usernameFormatName.f34162a = "type1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3255y.i(binding, "$binding");
        AbstractC3255y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3255y.i(usernameFormatName, "$usernameFormatName");
        binding.f11678g.setChecked(false);
        binding.f11679h.setChecked(false);
        binding.f11681j.setChecked(false);
        usernameFormatID.f34160a = 2;
        usernameFormatName.f34162a = "type2";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3255y.i(binding, "$binding");
        AbstractC3255y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3255y.i(usernameFormatName, "$usernameFormatName");
        binding.f11678g.setChecked(false);
        binding.f11679h.setChecked(false);
        binding.f11680i.setChecked(false);
        usernameFormatID.f34160a = 3;
        usernameFormatName.f34162a = "type3";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(UserCredentialsEditActivity this$0, A0 binding, kotlin.jvm.internal.Q usernameFormatID, T usernameFormatName, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(binding, "$binding");
        AbstractC3255y.i(usernameFormatID, "$usernameFormatID");
        AbstractC3255y.i(usernameFormatName, "$usernameFormatName");
        H4.j.f3824g.d(this$0, binding.f11673b);
        if (j6.n.s(binding.f11673b.getText().toString(), "", true)) {
            String string = this$0.getString(R.string.error_email_vacio_recuperar_pass);
            AbstractC3255y.h(string, "getString(R.string.error…ail_vacio_recuperar_pass)");
            this$0.A3(string);
        } else {
            if (binding.f11673b.getText().toString().length() >= 3 && binding.f11673b.getText().toString().length() <= 99) {
                this$0.m3().d(this$0, binding.f11673b.getText().toString(), this$0.f30081N, usernameFormatID.f34160a, (String) usernameFormatName.f34162a);
                return;
            }
            String string2 = this$0.getString(R.string.username_not_valid);
            AbstractC3255y.h(string2, "getString(R.string.username_not_valid)");
            this$0.A3(string2);
        }
    }

    private final void z3(EditText editText, ImageView imageView) {
        if (editText.getInputType() == 129) {
            editText.setInputType(145);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_show_password));
            editText.setSelection(editText.length());
        } else {
            editText.setInputType(TsExtractor.TS_STREAM_TYPE_AC3);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_hide_password));
            editText.setSelection(editText.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Object parcelable;
        super.onCreate(bundle);
        if (getIntent() != null && (extras = getIntent().getExtras()) != null) {
            if (extras.containsKey("user")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable("user", Q.class);
                    this.f30081N = (Q) parcelable;
                } else {
                    this.f30081N = (Q) extras.getParcelable("user");
                }
                A0 c8 = A0.c(getLayoutInflater());
                AbstractC3255y.h(c8, "inflate(layoutInflater)");
                this.f30084Q = c8;
                if (c8 == null) {
                    AbstractC3255y.y("usernameEditBinding");
                    c8 = null;
                }
                s3(c8);
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_PASSWORD)) {
                Z c9 = Z.c(getLayoutInflater());
                AbstractC3255y.h(c9, "inflate(layoutInflater)");
                this.f30083P = c9;
                if (c9 == null) {
                    AbstractC3255y.y("passwordEditBinding");
                    c9 = null;
                }
                n3(c9);
            }
        }
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new c(null), 2, null);
    }
}
