package com.uptodown.activities;

import A4.V1;
import D4.M;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import T4.C1385s;
import T4.q0;
import W4.InterfaceC1479b;
import X4.C1496f;
import X4.C1498h;
import X4.O;
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
import com.uptodown.activities.D;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.InstallUpdatesWorker;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Z;
import l5.AbstractC3337y;
import l5.C3326n;
import l5.C3329q;
import l5.C3335w;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class Updates extends V1 {

    /* renamed from: C0, reason: collision with root package name */
    private final ActivityResultLauncher f28908C0;

    /* renamed from: r0, reason: collision with root package name */
    private ArrayList f28911r0;

    /* renamed from: s0, reason: collision with root package name */
    private M f28912s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f28913t0;

    /* renamed from: u0, reason: collision with root package name */
    private ImageView f28914u0;

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1227k f28909p0 = L5.l.b(new b());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28910q0 = new ViewModelLazy(U.b(D.class), new i(this), new h(this), new j(null, this));

    /* renamed from: v0, reason: collision with root package name */
    private m f28915v0 = new m();

    /* renamed from: w0, reason: collision with root package name */
    private a f28916w0 = new a();

    /* renamed from: x0, reason: collision with root package name */
    private d f28917x0 = new d();

    /* renamed from: y0, reason: collision with root package name */
    private p f28918y0 = new p();

    /* renamed from: z0, reason: collision with root package name */
    private q f28919z0 = new q();

    /* renamed from: A0, reason: collision with root package name */
    private r f28906A0 = new r();

    /* renamed from: B0, reason: collision with root package name */
    private e f28907B0 = new e();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1479b {
        a() {
        }

        @Override // W4.InterfaceC1479b
        public void a(int i8) {
            Object obj;
            ArrayList b8;
            if (UptodownApp.f28003B.a0()) {
                M m8 = Updates.this.f28912s0;
                if (m8 != null && (b8 = m8.b()) != null) {
                    obj = b8.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C1496f) {
                    M m9 = Updates.this.f28912s0;
                    AbstractC3159y.f(m9);
                    Object obj2 = m9.b().get(i8);
                    AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates updates = Updates.this;
                    updates.K3((C1496f) obj2, i8, updates.f28915v0);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
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
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28922a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28924c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28925d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, P5.d dVar) {
            super(2, dVar);
            this.f28924c = str;
            this.f28925d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28924c, this.f28925d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28922a == 0) {
                L5.t.b(obj);
                int V42 = Updates.this.V4(this.f28924c);
                if (AbstractC3159y.d(this.f28925d, "app_updated")) {
                    if (V42 >= 0) {
                        ArrayList arrayList = Updates.this.f28911r0;
                        if (arrayList != null) {
                            M m8 = Updates.this.f28912s0;
                            AbstractC3159y.f(m8);
                            kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList).remove(m8.b().get(V42)));
                        }
                        M m9 = Updates.this.f28912s0;
                        AbstractC3159y.f(m9);
                        m9.c(V42);
                    }
                } else if (AbstractC3159y.d(this.f28925d, "app_installed")) {
                    Updates.this.e5(false);
                } else if (AbstractC3159y.d(this.f28925d, "app_uninstalled") && V42 >= 0) {
                    ArrayList arrayList2 = Updates.this.f28911r0;
                    if (arrayList2 != null) {
                        M m10 = Updates.this.f28912s0;
                        AbstractC3159y.f(m10);
                        kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList2).remove(m10.b().get(V42)));
                    }
                    M m11 = Updates.this.f28912s0;
                    AbstractC3159y.f(m11);
                    m11.b().remove(V42);
                    M m12 = Updates.this.f28912s0;
                    AbstractC3159y.f(m12);
                    m12.notifyItemRemoved(V42);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements W4.r {
        d() {
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && !g6.n.u(t02)) {
                HashMap e42 = Updates.this.e4();
                AbstractC3159y.f(e42);
                String y02 = appInfo.y0();
                AbstractC3159y.f(y02);
                String t03 = appInfo.t0();
                AbstractC3159y.f(t03);
                e42.put(y02, t03);
                M m8 = Updates.this.f28912s0;
                AbstractC3159y.f(m8);
                m8.d(appInfo);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements W4.t {
        e() {
        }

        @Override // W4.t
        public void a() {
            if (UptodownApp.f28003B.a0()) {
                Updates updates = Updates.this;
                String string = updates.getString(R.string.disabled_apps_explanation);
                AbstractC3159y.h(string, "getString(R.string.disabled_apps_explanation)");
                updates.d2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28928a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Updates f28930a;

            a(Updates updates) {
                this.f28930a = updates;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28930a.U4().f10814b.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f28930a.f28911r0 = ((D.b) cVar.a()).f();
                    this.f28930a.f5(((D.b) cVar.a()).f(), ((D.b) cVar.a()).e(), ((D.b) cVar.a()).c(), ((D.b) cVar.a()).a(), ((D.b) cVar.a()).d());
                    this.f28930a.g5(((D.b) cVar.a()).b().b(), ((D.b) cVar.a()).b().a());
                    this.f28930a.U4().f10814b.f10185b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6487a;
            }
        }

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28928a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K f8 = Updates.this.W4().f();
                a aVar = new a(Updates.this);
                this.f28928a = 1;
                if (f8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28931a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28933c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28934a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Updates f28935b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f28936c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Updates updates, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f28935b = updates;
                this.f28936c = arrayList;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void o(Updates updates, View view) {
                UptodownApp.a aVar = UptodownApp.f28003B;
                if (aVar.a0()) {
                    updates.startActivity(new Intent(updates.getApplicationContext(), (Class<?>) SettingsPreferences.class), aVar.a(updates));
                    AlertDialog r22 = updates.r2();
                    if (r22 != null) {
                        r22.dismiss();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void p(Updates updates, View view) {
                AlertDialog r22 = updates.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void r(Updates updates, View view) {
                AlertDialog r22 = updates.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void t(ArrayList arrayList, Updates updates, View view) {
                String str;
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        str = ((C1496f) arrayList.get(0)).Q();
                    } else {
                        str = null;
                    }
                    if (!UptodownApp.f28003B.O(updates)) {
                        updates.u4(str, true);
                        if (arrayList.size() > 1 && updates.f28912s0 != null) {
                            M m8 = updates.f28912s0;
                            AbstractC3159y.f(m8);
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
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28935b, this.f28936c, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28934a == 0) {
                    L5.t.b(obj);
                    AlertDialog r22 = this.f28935b.r2();
                    if (r22 != null) {
                        r22.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f28935b);
                    C1385s c8 = C1385s.c(this.f28935b.getLayoutInflater());
                    AbstractC3159y.h(c8, "inflate(layoutInflater)");
                    final Updates updates = this.f28935b;
                    final ArrayList arrayList = this.f28936c;
                    TextView textView = c8.f10884g;
                    j.a aVar = E4.j.f2274g;
                    textView.setTypeface(aVar.t());
                    c8.f10881d.setTypeface(aVar.u());
                    c8.f10883f.setTypeface(aVar.t());
                    c8.f10880c.setTypeface(aVar.t());
                    c8.f10882e.setTypeface(aVar.t());
                    c8.f10883f.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.o(Updates.this, view);
                        }
                    });
                    c8.f10880c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.A
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.p(Updates.this, view);
                        }
                    });
                    c8.f10879b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.B
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.r(Updates.this, view);
                        }
                    });
                    c8.f10882e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.C
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.t(arrayList, updates, view);
                        }
                    });
                    builder.setView(c8.getRoot());
                    this.f28935b.N2(builder.create());
                    if (!this.f28935b.isFinishing() && this.f28935b.r2() != null) {
                        this.f28935b.T2();
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f28933c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28933c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28931a == 0) {
                L5.t.b(obj);
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(Updates.this), C2812b0.c(), null, new a(Updates.this, this.f28933c, null), 2, null);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28937a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28937a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f28938a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28938a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28940b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28939a = function0;
            this.f28940b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28939a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28940b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28941a;

        k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animation animation;
            MenuItem findItem;
            View actionView;
            Q5.b.e();
            if (this.f28941a == 0) {
                L5.t.b(obj);
                Menu menu = Updates.this.U4().f10816d.getMenu();
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
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28943a;

        l(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animation animation;
            MenuItem findItem;
            View actionView;
            Q5.b.e();
            if (this.f28943a == 0) {
                L5.t.b(obj);
                Menu menu = Updates.this.U4().f10816d.getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.action_reload)) != null && (actionView = findItem.getActionView()) != null) {
                    animation = actionView.getAnimation();
                } else {
                    animation = null;
                }
                if (animation != null) {
                    animation.setRepeatCount(-1);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements W4.E {
        m() {
        }

        @Override // W4.E
        public void a(int i8) {
            Object obj;
            ArrayList b8;
            if (UptodownApp.f28003B.a0()) {
                M m8 = Updates.this.f28912s0;
                if (m8 != null && (b8 = m8.b()) != null) {
                    obj = b8.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C1496f) {
                    M m9 = Updates.this.f28912s0;
                    AbstractC3159y.f(m9);
                    Object obj2 = m9.b().get(i8);
                    AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates.this.K3((C1496f) obj2, i8, this);
                }
            }
        }

        @Override // W4.E
        public void b(int i8) {
            if (Updates.this.c5(i8)) {
                M m8 = Updates.this.f28912s0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1496f) obj).H0(true);
                M m9 = Updates.this.f28912s0;
                AbstractC3159y.f(m9);
                m9.notifyItemChanged(i8);
            }
        }

        @Override // W4.E
        public void c(int i8) {
            if (UptodownApp.f28003B.a0() && Updates.this.c5(i8)) {
                M m8 = Updates.this.f28912s0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.l4((C1496f) obj);
                M m9 = Updates.this.f28912s0;
                if (m9 != null) {
                    m9.notifyItemChanged(i8);
                }
            }
        }

        @Override // W4.E
        public void d(int i8) {
            if (Updates.this.c5(i8)) {
                M m8 = Updates.this.f28912s0;
                AbstractC3159y.f(m8);
                m8.notifyItemChanged(i8);
            }
            Updates.this.e5(false);
        }

        @Override // W4.E
        public void e(int i8) {
            if (UptodownApp.f28003B.a0() && Updates.this.c5(i8)) {
                M m8 = Updates.this.f28912s0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.k4((C1496f) obj);
                M m9 = Updates.this.f28912s0;
                if (m9 != null) {
                    m9.notifyItemChanged(i8);
                }
            }
        }

        @Override // W4.E
        public void f(int i8) {
            if (Updates.this.c5(i8)) {
                M m8 = Updates.this.f28912s0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1496f) obj).H0(false);
                M m9 = Updates.this.f28912s0;
                AbstractC3159y.f(m9);
                m9.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28946a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28948c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28949d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, String str, P5.d dVar) {
            super(2, dVar);
            this.f28948c = i8;
            this.f28949d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new n(this.f28948c, this.f28949d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
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
                Q5.b.e()
                int r0 = r2.f28946a
                if (r0 != 0) goto L93
                L5.t.b(r3)
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                D4.M r3 = com.uptodown.activities.Updates.C4(r3)
                if (r3 == 0) goto L90
                int r3 = r2.f28948c
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
                com.uptodown.UptodownApp$a r3 = com.uptodown.UptodownApp.f28003B
                java.util.ArrayList r0 = r3.F()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L79
                java.util.ArrayList r3 = r3.G()
                if (r3 == 0) goto L46
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L79
            L46:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                com.uptodown.activities.D r3 = com.uptodown.activities.Updates.I4(r3)
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
                kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
                r3.d2(r0)
                goto L79
            L6d:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                D4.M r3 = com.uptodown.activities.Updates.C4(r3)
                kotlin.jvm.internal.AbstractC3159y.f(r3)
                r3.i()
            L79:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                java.lang.String r0 = r2.f28949d
                int r3 = com.uptodown.activities.Updates.D4(r3, r0)
                r0 = -1
                if (r3 <= r0) goto L90
                com.uptodown.activities.Updates r0 = com.uptodown.activities.Updates.this
                D4.M r0 = com.uptodown.activities.Updates.C4(r0)
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                r0.notifyItemChanged(r3)
            L90:
                L5.I r3 = L5.I.f6487a
                return r3
            L93:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.Updates.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28950a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28952c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28953d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, int i8, P5.d dVar) {
            super(2, dVar);
            this.f28952c = str;
            this.f28953d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new o(this.f28952c, this.f28953d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            String string;
            Q5.b.e();
            if (this.f28950a == 0) {
                L5.t.b(obj);
                if (Updates.this.f28912s0 != null) {
                    int S42 = Updates.this.S4(this.f28952c);
                    if (S42 > -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = this.f28953d;
                    if (i8 == 306) {
                        if (z8) {
                            M m8 = Updates.this.f28912s0;
                            AbstractC3159y.f(m8);
                            m8.b().remove(S42);
                            M m9 = Updates.this.f28912s0;
                            AbstractC3159y.f(m9);
                            m9.notifyItemRemoved(S42);
                        }
                    } else if (i8 == 301) {
                        if (z8) {
                            M m10 = Updates.this.f28912s0;
                            AbstractC3159y.f(m10);
                            m10.notifyItemChanged(S42);
                        }
                    } else if (i8 != 305) {
                        if (i8 == 302) {
                            if (z8) {
                                M m11 = Updates.this.f28912s0;
                                AbstractC3159y.f(m11);
                                m11.notifyItemChanged(S42);
                            } else {
                                Updates.this.e5(false);
                            }
                        } else {
                            if (i8 != 303) {
                                if (i8 != 304) {
                                    if (i8 != 307) {
                                        string = "ERROR: (" + this.f28953d + ") " + Updates.this.getString(R.string.error_generico);
                                    } else {
                                        string = Updates.this.getString(R.string.error_generico);
                                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                                    }
                                } else {
                                    string = Updates.this.getString(R.string.msg_root_install_failed_invalid_versioncode);
                                    AbstractC3159y.h(string, "getString(R.string.msg_r…iled_invalid_versioncode)");
                                }
                            } else {
                                string = Updates.this.getString(R.string.msg_install_failed);
                                AbstractC3159y.h(string, "getString(R.string.msg_install_failed)");
                            }
                            Updates.this.d2(string);
                            if (z8) {
                                M m12 = Updates.this.f28912s0;
                                AbstractC3159y.f(m12);
                                m12.notifyItemChanged(S42);
                            } else {
                                M m13 = Updates.this.f28912s0;
                                AbstractC3159y.f(m13);
                                m13.notifyDataSetChanged();
                            }
                        }
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements W4.F {
        p() {
        }

        @Override // W4.F
        public void a() {
            UptodownApp.a aVar = UptodownApp.f28003B;
            if (aVar.a0()) {
                if (!aVar.W("downloadApkWorker", Updates.this)) {
                    Updates.this.P4();
                    return;
                }
                Updates updates = Updates.this;
                String string = updates.getString(R.string.error_download_in_progress_wait);
                AbstractC3159y.h(string, "getString(R.string.error…ownload_in_progress_wait)");
                updates.d2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class q implements W4.G {
        q() {
        }

        @Override // W4.G
        public void a() {
            UptodownApp.a aVar = UptodownApp.f28003B;
            if (aVar.a0()) {
                Updates.this.startActivity(new Intent(Updates.this, (Class<?>) SecurityActivity.class), aVar.a(Updates.this));
            }
        }

        @Override // W4.G
        public void b() {
            if (UptodownApp.f28003B.a0()) {
                Updates.this.j4();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements W4.L {
        r() {
        }

        @Override // W4.L
        public void a() {
            if (UptodownApp.f28003B.a0()) {
                Updates.this.d5();
            }
        }
    }

    public Updates() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.H3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Updates.R4(Updates.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul… = false)\n        }\n    }");
        this.f28908C0 = registerForActivityResult;
    }

    private final void O4() {
        WorkManager.getInstance(this).cancelAllWorkByTag("DownloadUpdatesWorker");
        UptodownApp.f28003B.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P4() {
        String str;
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (!aVar.O(this)) {
            ArrayList T42 = T4(this.f28911r0);
            if (T42.size() > 0) {
                if (T42.size() == 1) {
                    str = ((C1496f) T42.get(0)).Q();
                } else {
                    str = null;
                }
                M m8 = this.f28912s0;
                if (m8 != null) {
                    m8.i();
                }
                aVar.J0(this.f28911r0);
                u4(str, false);
                M m9 = this.f28912s0;
                if (m9 != null) {
                    m9.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (this.f28913t0) {
                InstallUpdatesWorker.f30043b.b(this);
                return;
            }
            return;
        }
        M m10 = this.f28912s0;
        if (m10 != null) {
            m10.j();
        }
        O4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(Updates this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.O2();
            this$0.e5(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S4(String str) {
        if (str != null) {
            M m8 = this.f28912s0;
            AbstractC3159y.f(m8);
            ArrayList b8 = m8.b();
            Iterator it = b8.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                if (it.next() instanceof C1496f) {
                    Object obj = b8.get(i8);
                    AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    if (g6.n.s(((C1496f) obj).Q(), str, true)) {
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
            C3329q c3329q = new C3329q();
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            ArrayList e8 = c3329q.e(applicationContext);
            C3326n.a aVar = C3326n.f34504t;
            Context applicationContext2 = getApplicationContext();
            AbstractC3159y.h(applicationContext2, "applicationContext");
            C3326n a8 = aVar.a(applicationContext2);
            a8.a();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1496f c1496f = (C1496f) it.next();
                if (c1496f.i() == 0) {
                    N4.f fVar = new N4.f();
                    String Q8 = c1496f.Q();
                    AbstractC3159y.f(Q8);
                    if (!fVar.p(this, Q8)) {
                        String Q9 = c1496f.Q();
                        AbstractC3159y.f(Q9);
                        O u02 = a8.u0(Q9);
                        if (u02 != null) {
                            str = u02.j();
                        } else {
                            str = null;
                        }
                        if (str != null && u02.o() == 100) {
                            Iterator it2 = e8.iterator();
                            while (it2.hasNext()) {
                                if (g6.n.s(u02.j(), ((File) it2.next()).getName(), true)) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(c1496f);
                    }
                }
            }
            a8.g();
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0 U4() {
        return (q0) this.f28909p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V4(String str) {
        ArrayList arrayList;
        M m8 = this.f28912s0;
        ArrayList arrayList2 = null;
        if (m8 != null) {
            arrayList = m8.b();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            M m9 = this.f28912s0;
            if (m9 != null) {
                arrayList2 = m9.b();
            }
            AbstractC3159y.f(arrayList2);
            Iterator it = arrayList2.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                Object next = it.next();
                if (((next instanceof O) && g6.n.s(((O) next).n(), str, true)) || ((next instanceof C1496f) && g6.n.s(((C1496f) next).Q(), str, true))) {
                    return i8;
                }
                i8 = i9;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D W4() {
        return (D) this.f28910q0.getValue();
    }

    private final void X4() {
        setContentView(U4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            U4().f10816d.setNavigationIcon(drawable);
            U4().f10816d.setNavigationContentDescription(getString(R.string.back));
        }
        U4().f10816d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.I3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.Y4(Updates.this, view);
            }
        });
        U4().f10817e.setTypeface(E4.j.f2274g.t());
        U4().f10816d.inflateMenu(R.menu.toolbar_menu_updates);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable);
        if (drawable2 != null) {
            U4().f10816d.setOverflowIcon(drawable2);
        }
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        boolean h02 = aVar.h0(this);
        U4().f10816d.getMenu().findItem(R.id.action_show_system_apps).setChecked(h02);
        U4().f10816d.getMenu().findItem(R.id.action_show_system_services).setChecked(aVar.i0(this));
        Toolbar toolbar = U4().f10816d;
        AbstractC3159y.h(toolbar, "binding.toolbarUpdates");
        c4(R.id.action_show_system_services, h02, toolbar);
        MenuItem findItem = U4().f10816d.getMenu().findItem(R.id.action_reload);
        U4().f10816d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: A4.J3
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean Z42;
                Z42 = Updates.Z4(Updates.this, menuItem);
                return Z42;
            }
        });
        Object systemService = getSystemService("layout_inflater");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.reload_action_view, (ViewGroup) U4().f10816d, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        this.f28914u0 = (ImageView) inflate;
        final Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        ImageView imageView = this.f28914u0;
        if (imageView != null) {
            imageView.startAnimation(loadAnimation);
        }
        ImageView imageView2 = this.f28914u0;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: A4.K3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Updates.a5(Updates.this, loadAnimation, view);
                }
            });
        }
        if (findItem != null) {
            findItem.setActionView(this.f28914u0);
        }
        U4().f10815c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        U4().f10815c.addItemDecoration(new n5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        U4().f10815c.setItemAnimator(defaultItemAnimator);
        U4().f10814b.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.L3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.b5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(Updates this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z4(Updates this$0, MenuItem item) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "item");
        if (item.getItemId() == R.id.action_show_system_apps) {
            boolean isChecked = item.isChecked();
            item.setChecked(!isChecked);
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            Context applicationContext = this$0.getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            aVar.Y0(applicationContext, !isChecked);
            if (isChecked) {
                Context applicationContext2 = this$0.getApplicationContext();
                AbstractC3159y.h(applicationContext2, "applicationContext");
                aVar.Z0(applicationContext2, false);
                Toolbar toolbar = this$0.U4().f10816d;
                AbstractC3159y.h(toolbar, "binding.toolbarUpdates");
                this$0.c4(R.id.action_show_system_services, false, toolbar);
                Toolbar toolbar2 = this$0.U4().f10816d;
                AbstractC3159y.h(toolbar2, "binding.toolbarUpdates");
                this$0.A3(R.id.action_show_system_services, false, toolbar2);
            } else {
                Toolbar toolbar3 = this$0.U4().f10816d;
                AbstractC3159y.h(toolbar3, "binding.toolbarUpdates");
                this$0.c4(R.id.action_show_system_services, true, toolbar3);
            }
            if (!isChecked) {
                ImageView imageView = this$0.f28914u0;
                if (imageView != null) {
                    imageView.performClick();
                }
            } else {
                this$0.e5(true);
            }
        } else if (item.getItemId() == R.id.action_show_system_services) {
            boolean isChecked2 = item.isChecked();
            item.setChecked(!isChecked2);
            SettingsPreferences.a aVar2 = SettingsPreferences.f29323b;
            Context applicationContext3 = this$0.getApplicationContext();
            AbstractC3159y.h(applicationContext3, "applicationContext");
            aVar2.Z0(applicationContext3, !isChecked2);
            if (!isChecked2) {
                ImageView imageView2 = this$0.f28914u0;
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
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(view, "view");
        UptodownApp.a aVar = UptodownApp.f28003B;
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
        M m8 = this.f28912s0;
        if (m8 != null) {
            ArrayList arrayList3 = null;
            if (m8 != null) {
                arrayList = m8.b();
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                M m9 = this.f28912s0;
                if (m9 != null) {
                    arrayList2 = m9.b();
                } else {
                    arrayList2 = null;
                }
                AbstractC3159y.f(arrayList2);
                if (arrayList2.size() > i8) {
                    M m10 = this.f28912s0;
                    if (m10 != null) {
                        arrayList3 = m10.b();
                    }
                    AbstractC3159y.f(arrayList3);
                    if (arrayList3.get(i8) instanceof C1496f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d5() {
        this.f28908C0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f28003B.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f5(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        M m8 = this.f28912s0;
        if (m8 == null) {
            this.f28912s0 = new M(arrayList, arrayList2, arrayList3, arrayList4, this, this.f28915v0, this.f28916w0, this.f28918y0, this.f28919z0, this.f28906A0, this.f28907B0);
            U4().f10815c.setAdapter(this.f28912s0);
        } else if (m8 != null) {
            m8.g(arrayList, arrayList2, arrayList3, arrayList4);
        }
        M m9 = this.f28912s0;
        AbstractC3159y.f(m9);
        m9.l(arrayList5);
        if (!arrayList.isEmpty()) {
            if (e4() == null) {
                p4(new HashMap());
                ArrayList arrayList6 = new ArrayList(AbstractC1246t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList6.add(Long.valueOf(((C1496f) it.next()).c()));
                }
                new S4.l(this, arrayList6, this.f28917x0, LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            M m10 = this.f28912s0;
            AbstractC3159y.f(m10);
            HashMap e42 = e4();
            AbstractC3159y.f(e42);
            m10.e(e42);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g5(boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                if (this.f28913t0) {
                    M m8 = this.f28912s0;
                    if (m8 != null) {
                        m8.k();
                        return;
                    }
                    return;
                }
                M m9 = this.f28912s0;
                if (m9 != null) {
                    m9.h();
                    return;
                }
                return;
            }
            M m10 = this.f28912s0;
            if (m10 != null) {
                m10.j();
                return;
            }
            return;
        }
        M m11 = this.f28912s0;
        if (m11 != null) {
            m11.h();
        }
    }

    public final Object Q4(String str, String str2, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new c(str2, str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    public final void e5(boolean z8) {
        W4().e(this, z8);
    }

    public final void h5(ArrayList arrayList) {
        if (g4()) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new g(arrayList, null), 2, null);
        }
    }

    public final void i5() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new k(null), 2, null);
    }

    public final void j5() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new l(null), 2, null);
    }

    public final void k5(int i8, String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new n(i8, str, null), 2, null);
    }

    public final void l5(int i8, String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new o(str, i8, null), 2, null);
    }

    @Override // A4.V1
    protected void o4() {
        e5(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        X4();
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        this.f28913t0 = aVar.Y(applicationContext);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ImageView imageView;
        super.onResume();
        e5(true);
        C3335w.f34546a.g(this);
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (!aVar.V("TrackingWorkerSingle", this) && !aVar.V("TrackingWorkerPeriodic", this) && (imageView = this.f28914u0) != null) {
            imageView.clearAnimation();
        }
    }
}
