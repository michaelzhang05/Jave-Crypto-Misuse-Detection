package com.uptodown.activities;

import H4.j;
import O5.InterfaceC1355k;
import W4.m0;
import a5.C1647n;
import a6.InterfaceC1668n;
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
import l6.N;
import o5.C3660F;
import o5.C3676p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Suggestions extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29919N = O5.l.b(new a());

    /* renamed from: O, reason: collision with root package name */
    private boolean f29920O;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
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
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29922a;

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
            int i8 = this.f29922a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                Suggestions suggestions = Suggestions.this;
                String obj2 = suggestions.i3().f12419b.getText().toString();
                String obj3 = Suggestions.this.i3().f12420c.getText().toString();
                this.f29922a = 1;
                if (suggestions.n3(obj2, obj3, this) == e8) {
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
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29924a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29926c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29927d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29928a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f29929b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Suggestions f29930c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f29931d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, Suggestions suggestions, T t8, S5.d dVar) {
                super(2, dVar);
                this.f29929b = q8;
                this.f29930c = suggestions;
                this.f29931d = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29929b, this.f29930c, this.f29931d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29928a == 0) {
                    O5.t.b(obj);
                    try {
                        if (this.f29929b.f34160a == 1) {
                            Toast makeText = Toast.makeText(this.f29930c.getApplicationContext(), this.f29930c.getString(R.string.sugerencia_enviada), 1);
                            makeText.setGravity(17, 0, 0);
                            makeText.show();
                            this.f29930c.g3();
                        } else {
                            T t8 = this.f29931d;
                            if (t8.f34162a == null) {
                                t8.f34162a = this.f29930c.getResources().getString(R.string.error_generico);
                            }
                            Toast makeText2 = Toast.makeText(this.f29930c.getApplicationContext(), (CharSequence) this.f29931d.f34162a, 1);
                            makeText2.setGravity(17, 0, 0);
                            makeText2.show();
                        }
                        this.f29930c.f29920O = false;
                        this.f29930c.i3().f12421d.f11842b.setVisibility(8);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
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
        c(String str, String str2, S5.d dVar) {
            super(2, dVar);
            this.f29926c = str;
            this.f29927d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29926c, this.f29927d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29924a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                Q q8 = new Q();
                T t8 = new T();
                t8.f34162a = "";
                C1647n c1647n = new C1647n();
                Context applicationContext = Suggestions.this.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                c1647n.i(applicationContext);
                a5.w wVar = new a5.w();
                C3676p c3676p = new C3676p();
                Context applicationContext2 = Suggestions.this.getApplicationContext();
                AbstractC3255y.h(applicationContext2, "applicationContext");
                wVar.g(c3676p.d(applicationContext2));
                C3676p c3676p2 = new C3676p();
                Context applicationContext3 = Suggestions.this.getApplicationContext();
                AbstractC3255y.h(applicationContext3, "applicationContext");
                wVar.e(c3676p2.a(applicationContext3));
                C3676p c3676p3 = new C3676p();
                Context applicationContext4 = Suggestions.this.getApplicationContext();
                AbstractC3255y.h(applicationContext4, "applicationContext");
                wVar.h(c3676p3.e(applicationContext4));
                C3676p c3676p4 = new C3676p();
                Context applicationContext5 = Suggestions.this.getApplicationContext();
                AbstractC3255y.h(applicationContext5, "applicationContext");
                wVar.f(c3676p4.b(applicationContext5));
                Context applicationContext6 = Suggestions.this.getApplicationContext();
                AbstractC3255y.h(applicationContext6, "applicationContext");
                a5.I P02 = new C3660F(applicationContext6).P0(this.f29926c, this.f29927d, c1647n, wVar);
                if (P02.d() != null) {
                    String d8 = P02.d();
                    AbstractC3255y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        q8.f34160a = jSONObject.getInt("success");
                    }
                    if (q8.f34160a == 0) {
                        t8.f34162a = P02.g(jSONObject);
                    }
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(q8, Suggestions.this, t8, null);
                this.f29924a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3() {
        i3().f12419b.setText("");
        i3().f12420c.setText("");
    }

    private final boolean h3() {
        Editable text = i3().f12419b.getText();
        if (text != null && text.length() != 0) {
            Editable text2 = i3().f12420c.getText();
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
        return (m0) this.f29919N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(Suggestions this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(Suggestions this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.i3().f12419b.setHint("");
        } else {
            this$0.i3().f12419b.setHint(this$0.getString(R.string.hint_email_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(Suggestions this$0, View view, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.i3().f12420c.setHint("");
        } else {
            this$0.i3().f12420c.setHint(this$0.getString(R.string.hint_text_suggestion));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(Suggestions this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (!this$0.f29920O) {
            this$0.i3().f12421d.f11842b.setVisibility(0);
            this$0.f29920O = true;
            if (this$0.h3()) {
                AbstractC3364k.d(N.a(C3347b0.b()), null, null, new b(null), 3, null);
            } else {
                this$0.f29920O = false;
                this$0.i3().f12421d.f11842b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n3(String str, String str2, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(str, str2, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.t3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Suggestions.j3(Suggestions.this, view);
                }
            });
            i3().f12424g.setTypeface(H4.j.f3824g.t());
        }
        EditText editText = i3().f12419b;
        j.a aVar = H4.j.f3824g;
        editText.setTypeface(aVar.u());
        i3().f12419b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: D4.u3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                Suggestions.k3(Suggestions.this, view, z8);
            }
        });
        i3().f12420c.setTypeface(aVar.u());
        i3().f12420c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: D4.v3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                Suggestions.l3(Suggestions.this, view, z8);
            }
        });
        i3().f12423f.setTypeface(aVar.t());
        i3().f12423f.setOnClickListener(new View.OnClickListener() { // from class: D4.w3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Suggestions.m3(Suggestions.this, view);
            }
        });
    }
}
