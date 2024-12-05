package com.uptodown.activities;

import G4.C1207q;
import O5.InterfaceC1355k;
import a5.C1654v;
import a6.InterfaceC1668n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.activities.LanguageSettingsActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import o5.C3674n;

/* loaded from: classes4.dex */
public final class LanguageSettingsActivity extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private C1207q f29413N;

    /* renamed from: O, reason: collision with root package name */
    private b f29414O = new b();

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1355k f29415P = O5.l.b(new a());

    /* renamed from: Q, reason: collision with root package name */
    private final LifecycleCoroutineScope f29416Q = LifecycleOwnerKt.getLifecycleScope(this);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W4.J invoke() {
            return W4.J.c(LanguageSettingsActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Z4.u {
        b() {
        }

        @Override // Z4.u
        public void a(C1654v lang) {
            AbstractC3255y.i(lang, "lang");
            if (lang.a() != null) {
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                String a8 = lang.a();
                AbstractC3255y.f(a8);
                languageSettingsActivity.g3(a8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29419a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29420b;

        /* renamed from: d, reason: collision with root package name */
        int f29422d;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29420b = obj;
            this.f29422d |= Integer.MIN_VALUE;
            return LanguageSettingsActivity.this.i3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29423a;

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29423a == 0) {
                O5.t.b(obj);
                LanguageSettingsActivity.this.h3().f11837b.f11842b.setVisibility(0);
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
        int f29425a;

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29425a == 0) {
                O5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                String[] stringArray = LanguageSettingsActivity.this.getResources().getStringArray(R.array.languages);
                AbstractC3255y.h(stringArray, "resources.getStringArray(R.array.languages)");
                String[] stringArray2 = LanguageSettingsActivity.this.getResources().getStringArray(R.array.languageCodes);
                AbstractC3255y.h(stringArray2, "resources.getStringArray(R.array.languageCodes)");
                String[] stringArray3 = LanguageSettingsActivity.this.getResources().getStringArray(R.array.localizedLang);
                AbstractC3255y.h(stringArray3, "resources.getStringArray(R.array.localizedLang)");
                int length = stringArray.length;
                for (int i8 = 0; i8 < length; i8++) {
                    String str = stringArray[i8];
                    C1654v c1654v = new C1654v();
                    c1654v.f(str);
                    c1654v.e(stringArray3[i8]);
                    c1654v.d(stringArray2[i8]);
                    arrayList.add(c1654v);
                }
                String q8 = SettingsPreferences.f30353b.q(LanguageSettingsActivity.this);
                if (q8 == null) {
                    q8 = "en";
                }
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                languageSettingsActivity.f29413N = new C1207q(arrayList, languageSettingsActivity.f29414O, q8);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29427a;

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29427a == 0) {
                O5.t.b(obj);
                RecyclerView recyclerView = LanguageSettingsActivity.this.h3().f11838c;
                C1207q c1207q = LanguageSettingsActivity.this.f29413N;
                if (c1207q == null) {
                    AbstractC3255y.y("adapter");
                    c1207q = null;
                }
                recyclerView.setAdapter(c1207q);
                LanguageSettingsActivity.this.h3().f11837b.f11842b.setVisibility(8);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29429a;

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29429a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                this.f29429a = 1;
                if (languageSettingsActivity.i3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(String str) {
        C3674n a8 = C3674n.f36505t.a(this);
        a8.a();
        a8.h1();
        a8.l();
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        aVar.K0(applicationContext, str);
        setResult(PointerIconCompat.TYPE_HELP);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W4.J h3() {
        return (W4.J) this.f29415P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.LanguageSettingsActivity.c
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.LanguageSettingsActivity$c r0 = (com.uptodown.activities.LanguageSettingsActivity.c) r0
            int r1 = r0.f29422d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29422d = r1
            goto L18
        L13:
            com.uptodown.activities.LanguageSettingsActivity$c r0 = new com.uptodown.activities.LanguageSettingsActivity$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29420b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f29422d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            O5.t.b(r8)
            goto L88
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.f29419a
            com.uptodown.activities.LanguageSettingsActivity r2 = (com.uptodown.activities.LanguageSettingsActivity) r2
            O5.t.b(r8)
            goto L74
        L40:
            java.lang.Object r2 = r0.f29419a
            com.uptodown.activities.LanguageSettingsActivity r2 = (com.uptodown.activities.LanguageSettingsActivity) r2
            O5.t.b(r8)
            goto L60
        L48:
            O5.t.b(r8)
            l6.J0 r8 = l6.C3347b0.c()
            com.uptodown.activities.LanguageSettingsActivity$d r2 = new com.uptodown.activities.LanguageSettingsActivity$d
            r2.<init>(r6)
            r0.f29419a = r7
            r0.f29422d = r5
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r2, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r2 = r7
        L60:
            l6.I r8 = l6.C3347b0.b()
            com.uptodown.activities.LanguageSettingsActivity$e r5 = new com.uptodown.activities.LanguageSettingsActivity$e
            r5.<init>(r6)
            r0.f29419a = r2
            r0.f29422d = r4
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r5, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            l6.J0 r8 = l6.C3347b0.c()
            com.uptodown.activities.LanguageSettingsActivity$f r4 = new com.uptodown.activities.LanguageSettingsActivity$f
            r4.<init>(r6)
            r0.f29419a = r6
            r0.f29422d = r3
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r4, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.LanguageSettingsActivity.i3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(LanguageSettingsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(View view) {
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(h3().getRoot());
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                h3().f11839d.setNavigationIcon(drawable);
                h3().f11839d.setNavigationContentDescription(getString(R.string.back));
            }
            h3().f11840e.setTypeface(H4.j.f3824g.t());
            h3().f11839d.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.S
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageSettingsActivity.j3(LanguageSettingsActivity.this, view);
                }
            });
            h3().f11837b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.T
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageSettingsActivity.k3(view);
                }
            });
            h3().f11838c.setLayoutManager(new LinearLayoutManager(this, 1, false));
            h3().f11838c.setItemAnimator(new DefaultItemAnimator());
            AbstractC3364k.d(this.f29416Q, null, null, new g(null), 3, null);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
