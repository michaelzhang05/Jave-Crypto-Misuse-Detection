package com.uptodown.activities;

import D4.W1;
import G4.M;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import W4.C1494s;
import W4.q0;
import Z4.InterfaceC1588b;
import Z4.L;
import a5.C1639f;
import a5.C1641h;
import a5.O;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.C;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.InstallUpdatesWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Z;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import o5.AbstractC3685y;
import o5.C3674n;
import o5.C3677q;
import o5.C3683w;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class Updates extends W1 {

    /* renamed from: C0, reason: collision with root package name */
    private final ActivityResultLauncher f29962C0;

    /* renamed from: r0, reason: collision with root package name */
    private ArrayList f29965r0;

    /* renamed from: s0, reason: collision with root package name */
    private M f29966s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f29967t0;

    /* renamed from: u0, reason: collision with root package name */
    private ImageView f29968u0;

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1355k f29963p0 = O5.l.b(new b());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1355k f29964q0 = new ViewModelLazy(U.b(C.class), new i(this), new h(this), new j(null, this));

    /* renamed from: v0, reason: collision with root package name */
    private m f29969v0 = new m();

    /* renamed from: w0, reason: collision with root package name */
    private a f29970w0 = new a();

    /* renamed from: x0, reason: collision with root package name */
    private d f29971x0 = new d();

    /* renamed from: y0, reason: collision with root package name */
    private p f29972y0 = new p();

    /* renamed from: z0, reason: collision with root package name */
    private q f29973z0 = new q();

    /* renamed from: A0, reason: collision with root package name */
    private r f29960A0 = new r();

    /* renamed from: B0, reason: collision with root package name */
    private e f29961B0 = new e();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1588b {
        a() {
        }

        @Override // Z4.InterfaceC1588b
        public void a(int i8) {
            Object obj;
            ArrayList b8;
            if (UptodownApp.f29058B.a0()) {
                M m8 = Updates.this.f29966s0;
                if (m8 != null && (b8 = m8.b()) != null) {
                    obj = b8.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C1639f) {
                    M m9 = Updates.this.f29966s0;
                    AbstractC3255y.f(m9);
                    Object obj2 = m9.b().get(i8);
                    AbstractC3255y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates updates = Updates.this;
                    updates.K3((C1639f) obj2, i8, updates.f29969v0);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke() {
            return q0.c(Updates.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29976a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29978c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29979d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, S5.d dVar) {
            super(2, dVar);
            this.f29978c = str;
            this.f29979d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29978c, this.f29979d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29976a == 0) {
                O5.t.b(obj);
                int V42 = Updates.this.V4(this.f29978c);
                if (AbstractC3255y.d(this.f29979d, "app_updated")) {
                    if (V42 >= 0) {
                        ArrayList arrayList = Updates.this.f29965r0;
                        if (arrayList != null) {
                            M m8 = Updates.this.f29966s0;
                            AbstractC3255y.f(m8);
                            kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList).remove(m8.b().get(V42)));
                        }
                        M m9 = Updates.this.f29966s0;
                        AbstractC3255y.f(m9);
                        m9.c(V42);
                    }
                } else if (AbstractC3255y.d(this.f29979d, "app_installed")) {
                    Updates.this.e5(false);
                } else if (AbstractC3255y.d(this.f29979d, "app_uninstalled") && V42 >= 0) {
                    ArrayList arrayList2 = Updates.this.f29965r0;
                    if (arrayList2 != null) {
                        M m10 = Updates.this.f29966s0;
                        AbstractC3255y.f(m10);
                        kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList2).remove(m10.b().get(V42)));
                    }
                    M m11 = Updates.this.f29966s0;
                    AbstractC3255y.f(m11);
                    m11.b().remove(V42);
                    M m12 = Updates.this.f29966s0;
                    AbstractC3255y.f(m12);
                    m12.notifyItemRemoved(V42);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Z4.r {
        d() {
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && !j6.n.u(t02)) {
                HashMap e42 = Updates.this.e4();
                AbstractC3255y.f(e42);
                String y02 = appInfo.y0();
                AbstractC3255y.f(y02);
                String t03 = appInfo.t0();
                AbstractC3255y.f(t03);
                e42.put(y02, t03);
                M m8 = Updates.this.f29966s0;
                AbstractC3255y.f(m8);
                m8.d(appInfo);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Z4.t {
        e() {
        }

        @Override // Z4.t
        public void a() {
            if (UptodownApp.f29058B.a0()) {
                Updates updates = Updates.this;
                String string = updates.getString(R.string.disabled_apps_explanation);
                AbstractC3255y.h(string, "getString(R.string.disabled_apps_explanation)");
                updates.d2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29982a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Updates f29984a;

            a(Updates updates) {
                this.f29984a = updates;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29984a.U4().f12471b.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    this.f29984a.f29965r0 = ((C.b) cVar.a()).f();
                    this.f29984a.f5(((C.b) cVar.a()).f(), ((C.b) cVar.a()).e(), ((C.b) cVar.a()).c(), ((C.b) cVar.a()).a(), ((C.b) cVar.a()).d());
                    this.f29984a.g5(((C.b) cVar.a()).b().b(), ((C.b) cVar.a()).b().a());
                    this.f29984a.U4().f12471b.f11842b.setVisibility(8);
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
            int i8 = this.f29982a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L f8 = Updates.this.W4().f();
                a aVar = new a(Updates.this);
                this.f29982a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29985a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29987c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29988a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Updates f29989b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f29990c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Updates updates, ArrayList arrayList, S5.d dVar) {
                super(2, dVar);
                this.f29989b = updates;
                this.f29990c = arrayList;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void q(Updates updates, View view) {
                UptodownApp.a aVar = UptodownApp.f29058B;
                if (aVar.a0()) {
                    updates.startActivity(new Intent(updates.getApplicationContext(), (Class<?>) SettingsPreferences.class), aVar.a(updates));
                    AlertDialog r22 = updates.r2();
                    if (r22 != null) {
                        r22.dismiss();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void s(Updates updates, View view) {
                AlertDialog r22 = updates.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void u(Updates updates, View view) {
                AlertDialog r22 = updates.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void v(ArrayList arrayList, Updates updates, View view) {
                String str;
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        str = ((C1639f) arrayList.get(0)).J();
                    } else {
                        str = null;
                    }
                    if (!UptodownApp.f29058B.O(updates)) {
                        updates.u4(str, true);
                        if (arrayList.size() > 1 && updates.f29966s0 != null) {
                            M m8 = updates.f29966s0;
                            AbstractC3255y.f(m8);
                            m8.i();
                        }
                    }
                }
                AlertDialog r22 = updates.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29989b, this.f29990c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f29988a == 0) {
                    O5.t.b(obj);
                    AlertDialog r22 = this.f29989b.r2();
                    if (r22 != null) {
                        r22.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f29989b);
                    C1494s c8 = C1494s.c(this.f29989b.getLayoutInflater());
                    AbstractC3255y.h(c8, "inflate(layoutInflater)");
                    final Updates updates = this.f29989b;
                    final ArrayList arrayList = this.f29990c;
                    TextView textView = c8.f12541g;
                    j.a aVar = H4.j.f3824g;
                    textView.setTypeface(aVar.t());
                    c8.f12538d.setTypeface(aVar.u());
                    c8.f12540f.setTypeface(aVar.t());
                    c8.f12537c.setTypeface(aVar.t());
                    c8.f12539e.setTypeface(aVar.t());
                    c8.f12540f.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.y
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.q(Updates.this, view);
                        }
                    });
                    c8.f12537c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.s(Updates.this, view);
                        }
                    });
                    c8.f12536b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.A
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.u(Updates.this, view);
                        }
                    });
                    c8.f12539e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.B
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.v(arrayList, updates, view);
                        }
                    });
                    builder.setView(c8.getRoot());
                    this.f29989b.N2(builder.create());
                    if (!this.f29989b.isFinishing() && this.f29989b.r2() != null) {
                        this.f29989b.T2();
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
        g(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f29987c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f29987c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29985a == 0) {
                O5.t.b(obj);
                AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(Updates.this), C3347b0.c(), null, new a(Updates.this, this.f29987c, null), 2, null);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f29991a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29991a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29992a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29992a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29992a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29994b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29993a = function0;
            this.f29994b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29993a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29994b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29995a;

        k(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animation animation;
            MenuItem findItem;
            View actionView;
            T5.b.e();
            if (this.f29995a == 0) {
                O5.t.b(obj);
                Menu menu = Updates.this.U4().f12473d.getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.action_reload)) != null && (actionView = findItem.getActionView()) != null) {
                    animation = actionView.getAnimation();
                } else {
                    animation = null;
                }
                if (animation != null) {
                    animation.setRepeatCount(0);
                }
                Updates.this.s4(false);
                Updates.this.e5(false);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29997a;

        l(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animation animation;
            MenuItem findItem;
            View actionView;
            T5.b.e();
            if (this.f29997a == 0) {
                O5.t.b(obj);
                Menu menu = Updates.this.U4().f12473d.getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.action_reload)) != null && (actionView = findItem.getActionView()) != null) {
                    animation = actionView.getAnimation();
                } else {
                    animation = null;
                }
                if (animation != null) {
                    animation.setRepeatCount(-1);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements Z4.E {
        m() {
        }

        @Override // Z4.E
        public void a(int i8) {
            Object obj;
            ArrayList b8;
            if (UptodownApp.f29058B.a0()) {
                M m8 = Updates.this.f29966s0;
                if (m8 != null && (b8 = m8.b()) != null) {
                    obj = b8.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C1639f) {
                    M m9 = Updates.this.f29966s0;
                    AbstractC3255y.f(m9);
                    Object obj2 = m9.b().get(i8);
                    AbstractC3255y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates.this.K3((C1639f) obj2, i8, this);
                }
            }
        }

        @Override // Z4.E
        public void b(int i8) {
            if (Updates.this.c5(i8)) {
                M m8 = Updates.this.f29966s0;
                AbstractC3255y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1639f) obj).H0(true);
                M m9 = Updates.this.f29966s0;
                AbstractC3255y.f(m9);
                m9.notifyItemChanged(i8);
            }
        }

        @Override // Z4.E
        public void c(int i8) {
            if (UptodownApp.f29058B.a0() && Updates.this.c5(i8)) {
                M m8 = Updates.this.f29966s0;
                AbstractC3255y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.l4((C1639f) obj);
                M m9 = Updates.this.f29966s0;
                if (m9 != null) {
                    m9.notifyItemChanged(i8);
                }
            }
        }

        @Override // Z4.E
        public void d(int i8) {
            if (Updates.this.c5(i8)) {
                M m8 = Updates.this.f29966s0;
                AbstractC3255y.f(m8);
                m8.notifyItemChanged(i8);
            }
            Updates.this.e5(false);
        }

        @Override // Z4.E
        public void e(int i8) {
            if (UptodownApp.f29058B.a0() && Updates.this.c5(i8)) {
                M m8 = Updates.this.f29966s0;
                AbstractC3255y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.k4((C1639f) obj);
                M m9 = Updates.this.f29966s0;
                if (m9 != null) {
                    m9.notifyItemChanged(i8);
                }
            }
        }

        @Override // Z4.E
        public void f(int i8) {
            if (Updates.this.c5(i8)) {
                M m8 = Updates.this.f29966s0;
                AbstractC3255y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1639f) obj).H0(false);
                M m9 = Updates.this.f29966s0;
                AbstractC3255y.f(m9);
                m9.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30000a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30002c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30003d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, String str, S5.d dVar) {
            super(2, dVar);
            this.f30002c = i8;
            this.f30003d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new n(this.f30002c, this.f30003d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                T5.b.e()
                int r0 = r2.f30000a
                if (r0 != 0) goto L93
                O5.t.b(r3)
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                G4.M r3 = com.uptodown.activities.Updates.C4(r3)
                if (r3 == 0) goto L90
                int r3 = r2.f30002c
                r0 = 107(0x6b, float:1.5E-43)
                if (r3 == r0) goto L6d
                switch(r3) {
                    case 101: goto L6d;
                    case 102: goto L53;
                    case 103: goto L2e;
                    case 104: goto L1c;
                    default: goto L1b;
                }
            L1b:
                goto L79
            L1c:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                android.content.Context r3 = r3.getApplicationContext()
                r0 = 2131952353(0x7f1302e1, float:1.9541146E38)
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                goto L79
            L2e:
                com.uptodown.UptodownApp$a r3 = com.uptodown.UptodownApp.f29058B
                java.util.ArrayList r0 = r3.F()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L79
                java.util.ArrayList r3 = r3.G()
                if (r3 == 0) goto L46
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L79
            L46:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                com.uptodown.activities.C r3 = com.uptodown.activities.Updates.I4(r3)
                com.uptodown.activities.Updates r0 = com.uptodown.activities.Updates.this
                r1 = 0
                r3.e(r0, r1)
                goto L79
            L53:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                boolean r3 = r3.x2()
                if (r3 != 0) goto L79
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                r0 = 2131951940(0x7f130144, float:1.9540309E38)
                java.lang.String r0 = r3.getString(r0)
                java.lang.String r1 = "getString(R.string.download_error_message)"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                r3.d2(r0)
                goto L79
            L6d:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                G4.M r3 = com.uptodown.activities.Updates.C4(r3)
                kotlin.jvm.internal.AbstractC3255y.f(r3)
                r3.i()
            L79:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                java.lang.String r0 = r2.f30003d
                int r3 = com.uptodown.activities.Updates.D4(r3, r0)
                r0 = -1
                if (r3 <= r0) goto L90
                com.uptodown.activities.Updates r0 = com.uptodown.activities.Updates.this
                G4.M r0 = com.uptodown.activities.Updates.C4(r0)
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                r0.notifyItemChanged(r3)
            L90:
                O5.I r3 = O5.I.f8278a
                return r3
            L93:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.Updates.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30004a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30006c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30007d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, int i8, S5.d dVar) {
            super(2, dVar);
            this.f30006c = str;
            this.f30007d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new o(this.f30006c, this.f30007d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            String string;
            T5.b.e();
            if (this.f30004a == 0) {
                O5.t.b(obj);
                if (Updates.this.f29966s0 != null) {
                    int S42 = Updates.this.S4(this.f30006c);
                    if (S42 > -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = this.f30007d;
                    if (i8 == 306) {
                        if (z8) {
                            M m8 = Updates.this.f29966s0;
                            AbstractC3255y.f(m8);
                            m8.b().remove(S42);
                            M m9 = Updates.this.f29966s0;
                            AbstractC3255y.f(m9);
                            m9.notifyItemRemoved(S42);
                        }
                    } else if (i8 == 301) {
                        if (z8) {
                            M m10 = Updates.this.f29966s0;
                            AbstractC3255y.f(m10);
                            m10.notifyItemChanged(S42);
                        }
                    } else if (i8 != 305) {
                        if (i8 == 302) {
                            if (z8) {
                                M m11 = Updates.this.f29966s0;
                                AbstractC3255y.f(m11);
                                m11.notifyItemChanged(S42);
                            } else {
                                Updates.this.e5(false);
                            }
                        } else {
                            if (i8 != 303) {
                                if (i8 != 304) {
                                    if (i8 != 307) {
                                        string = "ERROR: (" + this.f30007d + ") " + Updates.this.getString(R.string.error_generico);
                                    } else {
                                        string = Updates.this.getString(R.string.error_generico);
                                        AbstractC3255y.h(string, "getString(R.string.error_generico)");
                                    }
                                } else {
                                    string = Updates.this.getString(R.string.msg_root_install_failed_invalid_versioncode);
                                    AbstractC3255y.h(string, "getString(R.string.msg_r…iled_invalid_versioncode)");
                                }
                            } else {
                                string = Updates.this.getString(R.string.msg_install_failed);
                                AbstractC3255y.h(string, "getString(R.string.msg_install_failed)");
                            }
                            Updates.this.d2(string);
                            if (z8) {
                                M m12 = Updates.this.f29966s0;
                                AbstractC3255y.f(m12);
                                m12.notifyItemChanged(S42);
                            } else {
                                M m13 = Updates.this.f29966s0;
                                AbstractC3255y.f(m13);
                                m13.notifyDataSetChanged();
                            }
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements Z4.F {
        p() {
        }

        @Override // Z4.F
        public void a() {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.a0()) {
                if (!aVar.W("downloadApkWorker", Updates.this)) {
                    Updates.this.P4();
                    return;
                }
                Updates updates = Updates.this;
                String string = updates.getString(R.string.error_download_in_progress_wait);
                AbstractC3255y.h(string, "getString(R.string.error…ownload_in_progress_wait)");
                updates.d2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class q implements Z4.G {
        q() {
        }

        @Override // Z4.G
        public void a() {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.a0()) {
                Updates.this.startActivity(new Intent(Updates.this, (Class<?>) SecurityActivity.class), aVar.a(Updates.this));
            }
        }

        @Override // Z4.G
        public void b() {
            if (UptodownApp.f29058B.a0()) {
                Updates.this.j4();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements L {
        r() {
        }

        @Override // Z4.L
        public void a() {
            if (UptodownApp.f29058B.a0()) {
                Updates.this.d5();
            }
        }
    }

    public Updates() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.I3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Updates.R4(Updates.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul… = false)\n        }\n    }");
        this.f29962C0 = registerForActivityResult;
    }

    private final void O4() {
        WorkManager.getInstance(this).cancelAllWorkByTag("DownloadUpdatesWorker");
        UptodownApp.f29058B.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P4() {
        String str;
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (!aVar.O(this)) {
            ArrayList T42 = T4(this.f29965r0);
            if (T42.size() > 0) {
                if (T42.size() == 1) {
                    str = ((C1639f) T42.get(0)).J();
                } else {
                    str = null;
                }
                M m8 = this.f29966s0;
                if (m8 != null) {
                    m8.i();
                }
                aVar.J0(this.f29965r0);
                u4(str, false);
                M m9 = this.f29966s0;
                if (m9 != null) {
                    m9.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (this.f29967t0) {
                InstallUpdatesWorker.f31075b.b(this);
                return;
            }
            return;
        }
        M m10 = this.f29966s0;
        if (m10 != null) {
            m10.j();
        }
        O4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(Updates this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.O2();
            this$0.e5(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S4(String str) {
        if (str != null) {
            M m8 = this.f29966s0;
            AbstractC3255y.f(m8);
            ArrayList b8 = m8.b();
            Iterator it = b8.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                if (it.next() instanceof C1639f) {
                    Object obj = b8.get(i8);
                    AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    if (j6.n.s(((C1639f) obj).J(), str, true)) {
                        return i8;
                    }
                }
                i8 = i9;
            }
        }
        return -1;
    }

    private final ArrayList T4(ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            C3677q c3677q = new C3677q();
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            ArrayList e8 = c3677q.e(applicationContext);
            C3674n.a aVar = C3674n.f36505t;
            Context applicationContext2 = getApplicationContext();
            AbstractC3255y.h(applicationContext2, "applicationContext");
            C3674n a8 = aVar.a(applicationContext2);
            a8.a();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1639f c1639f = (C1639f) it.next();
                if (c1639f.i() == 0) {
                    Q4.f fVar = new Q4.f();
                    String J8 = c1639f.J();
                    AbstractC3255y.f(J8);
                    if (!fVar.p(this, J8)) {
                        String J9 = c1639f.J();
                        AbstractC3255y.f(J9);
                        O u02 = a8.u0(J9);
                        if (u02 != null) {
                            str = u02.l();
                        } else {
                            str = null;
                        }
                        if (str != null && u02.u() == 100) {
                            Iterator it2 = e8.iterator();
                            while (it2.hasNext()) {
                                if (j6.n.s(u02.l(), ((File) it2.next()).getName(), true)) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(c1639f);
                    }
                }
            }
            a8.l();
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0 U4() {
        return (q0) this.f29963p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V4(String str) {
        ArrayList arrayList;
        M m8 = this.f29966s0;
        ArrayList arrayList2 = null;
        if (m8 != null) {
            arrayList = m8.b();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            M m9 = this.f29966s0;
            if (m9 != null) {
                arrayList2 = m9.b();
            }
            AbstractC3255y.f(arrayList2);
            Iterator it = arrayList2.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                Object next = it.next();
                if (((next instanceof O) && j6.n.s(((O) next).s(), str, true)) || ((next instanceof C1639f) && j6.n.s(((C1639f) next).J(), str, true))) {
                    return i8;
                }
                i8 = i9;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C W4() {
        return (C) this.f29964q0.getValue();
    }

    private final void X4() {
        setContentView(U4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            U4().f12473d.setNavigationIcon(drawable);
            U4().f12473d.setNavigationContentDescription(getString(R.string.back));
        }
        U4().f12473d.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.J3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.Y4(Updates.this, view);
            }
        });
        U4().f12474e.setTypeface(H4.j.f3824g.t());
        U4().f12473d.inflateMenu(R.menu.toolbar_menu_updates);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable);
        if (drawable2 != null) {
            U4().f12473d.setOverflowIcon(drawable2);
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        boolean h02 = aVar.h0(this);
        U4().f12473d.getMenu().findItem(R.id.action_show_system_apps).setChecked(h02);
        U4().f12473d.getMenu().findItem(R.id.action_show_system_services).setChecked(aVar.i0(this));
        Toolbar toolbar = U4().f12473d;
        AbstractC3255y.h(toolbar, "binding.toolbarUpdates");
        c4(R.id.action_show_system_services, h02, toolbar);
        MenuItem findItem = U4().f12473d.getMenu().findItem(R.id.action_reload);
        U4().f12473d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: D4.K3
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean Z42;
                Z42 = Updates.Z4(Updates.this, menuItem);
                return Z42;
            }
        });
        Object systemService = getSystemService("layout_inflater");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.reload_action_view, (ViewGroup) U4().f12473d, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        this.f29968u0 = (ImageView) inflate;
        final Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        ImageView imageView = this.f29968u0;
        if (imageView != null) {
            imageView.startAnimation(loadAnimation);
        }
        ImageView imageView2 = this.f29968u0;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: D4.L3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Updates.a5(Updates.this, loadAnimation, view);
                }
            });
        }
        if (findItem != null) {
            findItem.setActionView(this.f29968u0);
        }
        U4().f12472c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        U4().f12472c.addItemDecoration(new q5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        U4().f12472c.setItemAnimator(defaultItemAnimator);
        U4().f12471b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.M3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.b5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(Updates this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z4(Updates this$0, MenuItem item) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "item");
        if (item.getItemId() == R.id.action_show_system_apps) {
            boolean isChecked = item.isChecked();
            item.setChecked(!isChecked);
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            Context applicationContext = this$0.getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            aVar.Y0(applicationContext, !isChecked);
            if (isChecked) {
                Context applicationContext2 = this$0.getApplicationContext();
                AbstractC3255y.h(applicationContext2, "applicationContext");
                aVar.Z0(applicationContext2, false);
                Toolbar toolbar = this$0.U4().f12473d;
                AbstractC3255y.h(toolbar, "binding.toolbarUpdates");
                this$0.c4(R.id.action_show_system_services, false, toolbar);
                Toolbar toolbar2 = this$0.U4().f12473d;
                AbstractC3255y.h(toolbar2, "binding.toolbarUpdates");
                this$0.A3(R.id.action_show_system_services, false, toolbar2);
            } else {
                Toolbar toolbar3 = this$0.U4().f12473d;
                AbstractC3255y.h(toolbar3, "binding.toolbarUpdates");
                this$0.c4(R.id.action_show_system_services, true, toolbar3);
            }
            if (!isChecked) {
                ImageView imageView = this$0.f29968u0;
                if (imageView != null) {
                    imageView.performClick();
                }
            } else {
                this$0.e5(true);
            }
        } else if (item.getItemId() == R.id.action_show_system_services) {
            boolean isChecked2 = item.isChecked();
            item.setChecked(!isChecked2);
            SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
            Context applicationContext3 = this$0.getApplicationContext();
            AbstractC3255y.h(applicationContext3, "applicationContext");
            aVar2.Z0(applicationContext3, !isChecked2);
            if (!isChecked2) {
                ImageView imageView2 = this$0.f29968u0;
                if (imageView2 != null) {
                    imageView2.performClick();
                }
            } else {
                this$0.e5(true);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a5(Updates this$0, Animation animation, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(view, "view");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.a0() && UptodownApp.a.N0(aVar, this$0, false, 2, null)) {
            animation.setRepeatCount(0);
            view.startAnimation(animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c5(int i8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        M m8 = this.f29966s0;
        if (m8 != null) {
            ArrayList arrayList3 = null;
            if (m8 != null) {
                arrayList = m8.b();
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                M m9 = this.f29966s0;
                if (m9 != null) {
                    arrayList2 = m9.b();
                } else {
                    arrayList2 = null;
                }
                AbstractC3255y.f(arrayList2);
                if (arrayList2.size() > i8) {
                    M m10 = this.f29966s0;
                    if (m10 != null) {
                        arrayList3 = m10.b();
                    }
                    AbstractC3255y.f(arrayList3);
                    if (arrayList3.get(i8) instanceof C1639f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d5() {
        this.f29962C0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f29058B.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f5(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        M m8 = this.f29966s0;
        if (m8 == null) {
            this.f29966s0 = new M(arrayList, arrayList2, arrayList3, arrayList4, this, this.f29969v0, this.f29970w0, this.f29972y0, this.f29973z0, this.f29960A0, this.f29961B0);
            U4().f12472c.setAdapter(this.f29966s0);
        } else if (m8 != null) {
            m8.g(arrayList, arrayList2, arrayList3, arrayList4);
        }
        M m9 = this.f29966s0;
        AbstractC3255y.f(m9);
        m9.l(arrayList5);
        if (!arrayList.isEmpty()) {
            if (e4() == null) {
                p4(new HashMap());
                ArrayList arrayList6 = new ArrayList(AbstractC1378t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList6.add(Long.valueOf(((C1639f) it.next()).b()));
                }
                new V4.l(this, arrayList6, this.f29971x0, LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            M m10 = this.f29966s0;
            AbstractC3255y.f(m10);
            HashMap e42 = e4();
            AbstractC3255y.f(e42);
            m10.e(e42);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g5(boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                if (this.f29967t0) {
                    M m8 = this.f29966s0;
                    if (m8 != null) {
                        m8.k();
                        return;
                    }
                    return;
                }
                M m9 = this.f29966s0;
                if (m9 != null) {
                    m9.h();
                    return;
                }
                return;
            }
            M m10 = this.f29966s0;
            if (m10 != null) {
                m10.j();
                return;
            }
            return;
        }
        M m11 = this.f29966s0;
        if (m11 != null) {
            m11.h();
        }
    }

    public final Object Q4(String str, String str2, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new c(str2, str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    public final void e5(boolean z8) {
        W4().e(this, z8);
    }

    public final void h5(ArrayList arrayList) {
        if (g4()) {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new g(arrayList, null), 2, null);
        }
    }

    public final void i5() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new k(null), 2, null);
    }

    public final void j5() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new l(null), 2, null);
    }

    public final void k5(int i8, String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new n(i8, str, null), 2, null);
    }

    public final void l5(int i8, String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new o(str, i8, null), 2, null);
    }

    @Override // D4.W1
    protected void o4() {
        e5(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        X4();
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        this.f29967t0 = aVar.Y(applicationContext);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ImageView imageView;
        super.onResume();
        e5(true);
        C3683w.f36547a.g(this);
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (!aVar.V("TrackingWorkerSingle", this) && !aVar.V("TrackingWorkerPeriodic", this) && (imageView = this.f29968u0) != null) {
            imageView.clearAnimation();
        }
    }
}
