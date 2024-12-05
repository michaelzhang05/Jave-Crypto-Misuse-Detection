package com.uptodown.activities;

import E4.j;
import L5.InterfaceC1227k;
import T4.m0;
import X4.C1504n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.activities.Suggestions;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l5.C3312F;
import l5.C3328p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Suggestions extends AbstractActivityC2489a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1227k f28865N = L5.l.b(new a());

    /* renamed from: O, reason: collision with root package name */
    private boolean f28866O;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            return m0.c(Suggestions.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28868a;

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
            int i8 = this.f28868a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                Suggestions suggestions = Suggestions.this;
                String obj2 = suggestions.i3().f10762b.getText().toString();
                String obj3 = Suggestions.this.i3().f10763c.getText().toString();
                this.f28868a = 1;
                if (suggestions.n3(obj2, obj3, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28870a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28873d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28874a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f28875b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Suggestions f28876c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f28877d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, Suggestions suggestions, T t8, P5.d dVar) {
                super(2, dVar);
                this.f28875b = q8;
                this.f28876c = suggestions;
                this.f28877d = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28875b, this.f28876c, this.f28877d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28874a == 0) {
                    L5.t.b(obj);
                    try {
                        if (this.f28875b.f33759a == 1) {
                            Toast makeText = Toast.makeText(this.f28876c.getApplicationContext(), this.f28876c.getString(R.string.sugerencia_enviada), 1);
                            makeText.setGravity(17, 0, 0);
                            makeText.show();
                            this.f28876c.g3();
                        } else {
                            T t8 = this.f28877d;
                            if (t8.f33761a == null) {
                                t8.f33761a = this.f28876c.getResources().getString(R.string.error_generico);
                            }
                            Toast makeText2 = Toast.makeText(this.f28876c.getApplicationContext(), (CharSequence) this.f28877d.f33761a, 1);
                            makeText2.setGravity(17, 0, 0);
                            makeText2.show();
                        }
                        this.f28876c.f28866O = false;
                        this.f28876c.i3().f10764d.f10185b.setVisibility(8);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, P5.d dVar) {
            super(2, dVar);
            this.f28872c = str;
            this.f28873d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28872c, this.f28873d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28870a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                Q q8 = new Q();
                T t8 = new T();
                t8.f33761a = "";
                C1504n c1504n = new C1504n();
                Context applicationContext = Suggestions.this.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                c1504n.i(applicationContext);
                X4.w wVar = new X4.w();
                C3328p c3328p = new C3328p();
                Context applicationContext2 = Suggestions.this.getApplicationContext();
                AbstractC3159y.h(applicationContext2, "applicationContext");
                wVar.g(c3328p.d(applicationContext2));
                C3328p c3328p2 = new C3328p();
                Context applicationContext3 = Suggestions.this.getApplicationContext();
                AbstractC3159y.h(applicationContext3, "applicationContext");
                wVar.e(c3328p2.a(applicationContext3));
                C3328p c3328p3 = new C3328p();
                Context applicationContext4 = Suggestions.this.getApplicationContext();
                AbstractC3159y.h(applicationContext4, "applicationContext");
                wVar.h(c3328p3.e(applicationContext4));
                C3328p c3328p4 = new C3328p();
                Context applicationContext5 = Suggestions.this.getApplicationContext();
                AbstractC3159y.h(applicationContext5, "applicationContext");
                wVar.f(c3328p4.b(applicationContext5));
                Context applicationContext6 = Suggestions.this.getApplicationContext();
                AbstractC3159y.h(applicationContext6, "applicationContext");
                X4.I P02 = new C3312F(applicationContext6).P0(this.f28872c, this.f28873d, c1504n, wVar);
                if (P02.d() != null) {
                    String d8 = P02.d();
                    AbstractC3159y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        q8.f33759a = jSONObject.getInt("success");
                    }
                    if (q8.f33759a == 0) {
                        t8.f33761a = P02.g(jSONObject);
                    }
                }
                J0 c8 = C2812b0.c();
                a aVar = new a(q8, Suggestions.this, t8, null);
                this.f28870a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3() {
        i3().f10762b.setText("");
        i3().f10763c.setText("");
    }

    private final boolean h3() {
        Editable text = i3().f10762b.getText();
        if (text != null && text.length() != 0) {
            Editable text2 = i3().f10763c.getText();
            if (text2 != null && text2.length() != 0) {
                return true;
            }
            Toast makeText = Toast.makeText(this, getString(R.string.falta_texto_sugerencia), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            return false;
        }
        Toast makeText2 = Toast.makeText(this, getString(R.string.falta_email_sugerencia), 1);
        makeText2.setGravity(17, 0, 0);
        makeText2.show();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m0 i3() {
        return (m0) this.f28865N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(Suggestions this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(Suggestions this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.i3().f10762b.setHint("");
        } else {
            this$0.i3().f10762b.setHint(this$0.getString(R.string.hint_email_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(Suggestions this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.i3().f10763c.setHint("");
        } else {
            this$0.i3().f10763c.setHint(this$0.getString(R.string.hint_text_suggestion));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(Suggestions this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!this$0.f28866O) {
            this$0.i3().f10764d.f10185b.setVisibility(0);
            this$0.f28866O = true;
            if (this$0.h3()) {
                AbstractC2829k.d(N.a(C2812b0.b()), null, null, new b(null), 3, null);
            } else {
                this$0.f28866O = false;
                this$0.i3().f10764d.f10185b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n3(String str, String str2, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(str, str2, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i3().getRoot());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_suggestions);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
            }
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.s3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Suggestions.j3(Suggestions.this, view);
                }
            });
            i3().f10767g.setTypeface(E4.j.f2274g.t());
        }
        EditText editText = i3().f10762b;
        j.a aVar = E4.j.f2274g;
        editText.setTypeface(aVar.u());
        i3().f10762b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.t3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                Suggestions.k3(Suggestions.this, view, z8);
            }
        });
        i3().f10763c.setTypeface(aVar.u());
        i3().f10763c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: A4.u3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                Suggestions.l3(Suggestions.this, view, z8);
            }
        });
        i3().f10766f.setTypeface(aVar.t());
        i3().f10766f.setOnClickListener(new View.OnClickListener() { // from class: A4.v3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Suggestions.m3(Suggestions.this, view);
            }
        });
    }
}
