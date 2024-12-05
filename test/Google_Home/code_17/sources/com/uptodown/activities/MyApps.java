package com.uptodown.activities;

import D4.W1;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import W4.C1494s;
import W4.O;
import Z4.InterfaceC1588b;
import a5.C1639f;
import a5.C1641h;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.l;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.GenerateQueueWorker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3683w;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class MyApps extends W1 {

    /* renamed from: r0, reason: collision with root package name */
    private G4.r f29616r0;

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1355k f29614p0 = O5.l.b(new c());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1355k f29615q0 = new ViewModelLazy(U.b(com.uptodown.activities.l.class), new j(this), new i(this), new k(null, this));

    /* renamed from: s0, reason: collision with root package name */
    private final b f29617s0 = new b();

    /* renamed from: t0, reason: collision with root package name */
    private final l f29618t0 = new l();

    /* renamed from: u0, reason: collision with root package name */
    private final o f29619u0 = new o();

    /* renamed from: v0, reason: collision with root package name */
    private final f f29620v0 = new f();

    /* renamed from: w0, reason: collision with root package name */
    private final e f29621w0 = new e();

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29622a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29623b;

        public a(int i8, String str) {
            this.f29622a = i8;
            this.f29623b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = this.f29622a;
            boolean z8 = true;
            if (i8 != 102) {
                if (i8 == 104) {
                    Toast.makeText(MyApps.this.getApplicationContext(), R.string.no_free_space, 1).show();
                }
            } else {
                Toast.makeText(MyApps.this.getApplicationContext(), R.string.descarga_error, 1).show();
            }
            if (MyApps.this.f29616r0 != null) {
                int i9 = 0;
                if (this.f29623b != null) {
                    G4.r rVar = MyApps.this.f29616r0;
                    AbstractC3255y.f(rVar);
                    ArrayList b8 = rVar.b();
                    int i10 = 0;
                    while (i10 < b8.size()) {
                        if (b8.get(i10) instanceof C1639f) {
                            Object obj = b8.get(i10);
                            AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                            C1639f c1639f = (C1639f) obj;
                            if (c1639f.J() != null && j6.n.s(c1639f.J(), this.f29623b, true)) {
                                i9 = i10;
                                break;
                            }
                        }
                        i10++;
                    }
                    i9 = i10;
                }
                z8 = false;
                if (z8) {
                    G4.r rVar2 = MyApps.this.f29616r0;
                    AbstractC3255y.f(rVar2);
                    rVar2.notifyItemChanged(i9);
                } else {
                    G4.r rVar3 = MyApps.this.f29616r0;
                    AbstractC3255y.f(rVar3);
                    rVar3.c();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1588b {
        b() {
        }

        @Override // Z4.InterfaceC1588b
        public void a(int i8) {
            if (UptodownApp.f29058B.a0() && MyApps.this.R4(i8)) {
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C1639f c1639f = (C1639f) obj;
                if (c1639f.c0() == C1639f.c.UPDATED) {
                    MyApps myApps = MyApps.this;
                    myApps.K3(c1639f, i8, myApps.f29618t0);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            return O.c(MyApps.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29627a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29629c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29630d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, S5.d dVar) {
            super(2, dVar);
            this.f29629c = str;
            this.f29630d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f29629c, this.f29630d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r0.equals("app_updated") != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        
            if (r4 < 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            r3.f29628b.S4(false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            if (r0.equals("app_installed") == false) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                T5.b.e()
                int r0 = r3.f29627a
                if (r0 != 0) goto L6d
                O5.t.b(r4)
                com.uptodown.activities.MyApps r4 = com.uptodown.activities.MyApps.this
                java.lang.String r0 = r3.f29629c
                int r4 = com.uptodown.activities.MyApps.D4(r4, r0)
                java.lang.String r0 = r3.f29630d
                int r1 = r0.hashCode()
                r2 = -1972881700(0xffffffff8a6836dc, float:-1.11807116E-32)
                if (r1 == r2) goto L59
                r2 = -1487908707(0xffffffffa750509d, float:-2.89095E-15)
                if (r1 == r2) goto L50
                r2 = 389690339(0x173a33e3, float:6.016533E-25)
                if (r1 == r2) goto L28
                goto L6a
            L28:
                java.lang.String r1 = "app_uninstalled"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L31
                goto L6a
            L31:
                if (r4 < 0) goto L6a
                com.uptodown.activities.MyApps r0 = com.uptodown.activities.MyApps.this
                G4.r r0 = com.uptodown.activities.MyApps.B4(r0)
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                java.util.ArrayList r0 = r0.b()
                r0.remove(r4)
                com.uptodown.activities.MyApps r0 = com.uptodown.activities.MyApps.this
                G4.r r0 = com.uptodown.activities.MyApps.B4(r0)
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                r0.notifyItemRemoved(r4)
                goto L6a
            L50:
                java.lang.String r1 = "app_updated"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L6a
                goto L62
            L59:
                java.lang.String r1 = "app_installed"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L62
                goto L6a
            L62:
                if (r4 < 0) goto L6a
                com.uptodown.activities.MyApps r4 = com.uptodown.activities.MyApps.this
                r0 = 0
                r4.S4(r0)
            L6a:
                O5.I r4 = O5.I.f8278a
                return r4
            L6d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MyApps.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Z4.r {
        e() {
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && !j6.n.u(t02)) {
                HashMap e42 = MyApps.this.e4();
                AbstractC3255y.f(e42);
                String y02 = appInfo.y0();
                AbstractC3255y.f(y02);
                String t03 = appInfo.t0();
                AbstractC3255y.f(t03);
                e42.put(y02, t03);
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                rVar.d(appInfo);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Z4.t {
        f() {
        }

        @Override // Z4.t
        public void a() {
            if (UptodownApp.f29058B.a0()) {
                MyApps myApps = MyApps.this;
                String string = myApps.getString(R.string.disabled_apps_explanation);
                AbstractC3255y.h(string, "getString(R.string.disabled_apps_explanation)");
                myApps.d2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29633a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MyApps f29635a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.activities.MyApps$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0693a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f29636a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MyApps f29637b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0693a(MyApps myApps, S5.d dVar) {
                    super(2, dVar);
                    this.f29637b = myApps;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0693a(this.f29637b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f29636a == 0) {
                        O5.t.b(obj);
                        this.f29637b.K4().f11946b.f11842b.setVisibility(0);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0693a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f29638a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MyApps f29639b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC3685y f29640c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(MyApps myApps, AbstractC3685y abstractC3685y, S5.d dVar) {
                    super(2, dVar);
                    this.f29639b = myApps;
                    this.f29640c = abstractC3685y;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new b(this.f29639b, this.f29640c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f29638a == 0) {
                        O5.t.b(obj);
                        this.f29639b.K4().f11946b.f11842b.setVisibility(8);
                        this.f29639b.T4(((l.a) ((AbstractC3685y.c) this.f29640c).a()).e(), ((l.a) ((AbstractC3685y.c) this.f29640c).a()).c(), ((l.a) ((AbstractC3685y.c) this.f29640c).a()).a(), ((l.a) ((AbstractC3685y.c) this.f29640c).a()).d(), ((l.a) ((AbstractC3685y.c) this.f29640c).a()).b());
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            a(MyApps myApps) {
                this.f29635a = myApps;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    Object g8 = AbstractC3360i.g(C3347b0.c(), new C0693a(this.f29635a, null), dVar);
                    if (g8 == T5.b.e()) {
                        return g8;
                    }
                    return O5.I.f8278a;
                }
                if (abstractC3685y instanceof AbstractC3685y.c) {
                    Object g9 = AbstractC3360i.g(C3347b0.c(), new b(this.f29635a, abstractC3685y, null), dVar);
                    if (g9 == T5.b.e()) {
                        return g9;
                    }
                    return O5.I.f8278a;
                }
                boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                return O5.I.f8278a;
            }
        }

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
            int i8 = this.f29633a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L c8 = MyApps.this.M4().c();
                a aVar = new a(MyApps.this);
                this.f29633a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29641a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29643c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f29643c = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(MyApps myApps, View view) {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.a0()) {
                myApps.startActivity(new Intent(myApps.getApplicationContext(), (Class<?>) SettingsPreferences.class), aVar.a(myApps));
                AlertDialog r22 = myApps.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(MyApps myApps, View view) {
            AlertDialog r22 = myApps.r2();
            if (r22 != null) {
                r22.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(MyApps myApps, View view) {
            AlertDialog r22 = myApps.r2();
            if (r22 != null) {
                r22.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(ArrayList arrayList, MyApps myApps, View view) {
            if (arrayList != null && arrayList.size() > 0) {
                myApps.V4(arrayList);
            }
            AlertDialog r22 = myApps.r2();
            if (r22 != null) {
                r22.dismiss();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f29643c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29641a == 0) {
                O5.t.b(obj);
                AlertDialog r22 = MyApps.this.r2();
                if (r22 != null) {
                    r22.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MyApps.this);
                C1494s c8 = C1494s.c(MyApps.this.getLayoutInflater());
                AbstractC3255y.h(c8, "inflate(layoutInflater)");
                final MyApps myApps = MyApps.this;
                final ArrayList arrayList = this.f29643c;
                TextView textView = c8.f12541g;
                j.a aVar = H4.j.f3824g;
                textView.setTypeface(aVar.t());
                c8.f12538d.setTypeface(aVar.u());
                c8.f12540f.setTypeface(aVar.t());
                c8.f12537c.setTypeface(aVar.t());
                c8.f12539e.setTypeface(aVar.t());
                c8.f12540f.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.q(MyApps.this, view);
                    }
                });
                c8.f12537c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.s(MyApps.this, view);
                    }
                });
                c8.f12536b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.u(MyApps.this, view);
                    }
                });
                c8.f12539e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.v(arrayList, myApps, view);
                    }
                });
                builder.setView(c8.getRoot());
                MyApps.this.N2(builder.create());
                if (!MyApps.this.isFinishing() && MyApps.this.r2() != null) {
                    MyApps.this.T2();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29644a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f29644a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29644a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29645a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f29645a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29645a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29646a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29646a = function0;
            this.f29647b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29646a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29647b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements Z4.E {
        l() {
        }

        @Override // Z4.E
        public void a(int i8) {
            if (UptodownApp.f29058B.a0() && MyApps.this.R4(i8)) {
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C1639f c1639f = (C1639f) obj;
                if (c1639f.c0() == C1639f.c.OUTDATED) {
                    MyApps.this.K3(c1639f, i8, this);
                }
            }
        }

        @Override // Z4.E
        public void b(int i8) {
            if (MyApps.this.R4(i8)) {
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1639f) obj).H0(true);
                G4.r rVar2 = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar2);
                rVar2.notifyItemChanged(i8);
            }
        }

        @Override // Z4.E
        public void c(int i8) {
            if (UptodownApp.f29058B.a0() && MyApps.this.R4(i8)) {
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C1639f c1639f = (C1639f) obj;
                if (c1639f.c0() == C1639f.c.OUTDATED) {
                    MyApps.this.l4(c1639f);
                    G4.r rVar2 = MyApps.this.f29616r0;
                    if (rVar2 != null) {
                        rVar2.notifyItemChanged(i8);
                    }
                }
            }
        }

        @Override // Z4.E
        public void d(int i8) {
            if (MyApps.this.R4(i8)) {
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                rVar.notifyItemChanged(i8);
            }
            MyApps.this.S4(false);
        }

        @Override // Z4.E
        public void e(int i8) {
            if (UptodownApp.f29058B.a0() && MyApps.this.R4(i8)) {
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                MyApps.this.k4((C1639f) obj);
                G4.r rVar2 = MyApps.this.f29616r0;
                if (rVar2 != null) {
                    rVar2.notifyItemChanged(i8);
                }
            }
        }

        @Override // Z4.E
        public void f(int i8) {
            if (MyApps.this.R4(i8)) {
                G4.r rVar = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1639f) obj).H0(false);
                G4.r rVar2 = MyApps.this.f29616r0;
                AbstractC3255y.f(rVar2);
                rVar2.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29649a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29652d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, int i8, S5.d dVar) {
            super(2, dVar);
            this.f29651c = str;
            this.f29652d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(this.f29651c, this.f29652d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            String string;
            T5.b.e();
            if (this.f29649a == 0) {
                O5.t.b(obj);
                if (MyApps.this.f29616r0 != null) {
                    G4.r rVar = MyApps.this.f29616r0;
                    AbstractC3255y.f(rVar);
                    ArrayList b8 = rVar.b();
                    int i8 = 0;
                    while (true) {
                        if (i8 < b8.size()) {
                            if (b8.get(i8) instanceof C1639f) {
                                Object obj2 = b8.get(i8);
                                AbstractC3255y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                                z8 = true;
                                if (j6.n.s(((C1639f) obj2).J(), this.f29651c, true)) {
                                    break;
                                }
                            }
                            i8++;
                        } else {
                            z8 = false;
                            break;
                        }
                    }
                    int i9 = this.f29652d;
                    if (i9 == 306) {
                        if (z8) {
                            G4.r rVar2 = MyApps.this.f29616r0;
                            AbstractC3255y.f(rVar2);
                            rVar2.b().remove(i8);
                            G4.r rVar3 = MyApps.this.f29616r0;
                            AbstractC3255y.f(rVar3);
                            rVar3.notifyItemRemoved(i8);
                        }
                    } else if (i9 == 301) {
                        if (z8) {
                            G4.r rVar4 = MyApps.this.f29616r0;
                            AbstractC3255y.f(rVar4);
                            rVar4.notifyItemChanged(i8);
                        }
                    } else if (i9 != 305) {
                        if (i9 == 302) {
                            if (z8) {
                                G4.r rVar5 = MyApps.this.f29616r0;
                                AbstractC3255y.f(rVar5);
                                rVar5.notifyItemChanged(i8);
                            } else {
                                MyApps.this.S4(false);
                            }
                        } else {
                            if (i9 != 303) {
                                if (i9 != 304) {
                                    if (i9 != 307) {
                                        string = "ERROR: (" + this.f29652d + ") " + MyApps.this.getString(R.string.error_generico);
                                    } else {
                                        string = MyApps.this.getString(R.string.error_generico);
                                        AbstractC3255y.h(string, "getString(R.string.error_generico)");
                                    }
                                } else {
                                    string = MyApps.this.getString(R.string.msg_root_install_failed_invalid_versioncode);
                                    AbstractC3255y.h(string, "getString(R.string.msg_r…iled_invalid_versioncode)");
                                }
                            } else {
                                string = MyApps.this.getString(R.string.msg_install_failed);
                                AbstractC3255y.h(string, "getString(R.string.msg_install_failed)");
                            }
                            MyApps.this.d2(string);
                            if (z8) {
                                G4.r rVar6 = MyApps.this.f29616r0;
                                AbstractC3255y.f(rVar6);
                                rVar6.notifyItemChanged(i8);
                            } else {
                                G4.r rVar7 = MyApps.this.f29616r0;
                                AbstractC3255y.f(rVar7);
                                rVar7.c();
                            }
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29653a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29654b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MyApps f29655c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29656d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, MyApps myApps, String str, S5.d dVar) {
            super(2, dVar);
            this.f29654b = i8;
            this.f29655c = myApps;
            this.f29656d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new n(this.f29654b, this.f29655c, this.f29656d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29653a == 0) {
                O5.t.b(obj);
                int i8 = this.f29654b;
                boolean z8 = true;
                if (i8 != 102) {
                    if (i8 != 104) {
                        if (i8 == 106) {
                            Toast.makeText(this.f29655c.getApplicationContext(), R.string.download_cancelled, 1).show();
                        }
                    } else {
                        Toast.makeText(this.f29655c.getApplicationContext(), R.string.no_free_space, 1).show();
                    }
                } else {
                    Toast.makeText(this.f29655c.getApplicationContext(), R.string.descarga_error, 1).show();
                }
                if (this.f29655c.f29616r0 != null) {
                    int i9 = 0;
                    if (this.f29656d != null) {
                        G4.r rVar = this.f29655c.f29616r0;
                        AbstractC3255y.f(rVar);
                        ArrayList b8 = rVar.b();
                        int i10 = 0;
                        while (i10 < b8.size()) {
                            if (b8.get(i10) instanceof C1639f) {
                                Object obj2 = b8.get(i10);
                                AbstractC3255y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                                C1639f c1639f = (C1639f) obj2;
                                if (c1639f.J() != null && j6.n.s(c1639f.J(), this.f29656d, true)) {
                                    i9 = i10;
                                    break;
                                }
                            }
                            i10++;
                        }
                        i9 = i10;
                    }
                    z8 = false;
                    if (z8) {
                        G4.r rVar2 = this.f29655c.f29616r0;
                        AbstractC3255y.f(rVar2);
                        rVar2.notifyItemChanged(i9);
                    } else {
                        G4.r rVar3 = this.f29655c.f29616r0;
                        AbstractC3255y.f(rVar3);
                        rVar3.c();
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements Z4.G {
        o() {
        }

        @Override // Z4.G
        public void a() {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.a0()) {
                MyApps.this.startActivity(new Intent(MyApps.this, (Class<?>) SecurityActivity.class), aVar.a(MyApps.this));
            }
        }

        @Override // Z4.G
        public void b() {
            if (UptodownApp.f29058B.a0()) {
                MyApps.this.j4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O K4() {
        return (O) this.f29614p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L4(String str) {
        ArrayList arrayList;
        G4.r rVar = this.f29616r0;
        ArrayList arrayList2 = null;
        if (rVar != null) {
            arrayList = rVar.b();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            G4.r rVar2 = this.f29616r0;
            if (rVar2 != null) {
                arrayList2 = rVar2.b();
            }
            AbstractC3255y.f(arrayList2);
            Iterator it = arrayList2.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                Object next = it.next();
                if (((next instanceof a5.O) && j6.n.s(((a5.O) next).s(), str, true)) || ((next instanceof C1639f) && j6.n.s(((C1639f) next).J(), str, true))) {
                    return i8;
                }
                i8 = i9;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.uptodown.activities.l M4() {
        return (com.uptodown.activities.l) this.f29615q0.getValue();
    }

    private final void N4() {
        setContentView(K4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            K4().f11948d.setNavigationIcon(drawable);
            K4().f11948d.setNavigationContentDescription(getString(R.string.back));
        }
        K4().f11948d.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyApps.O4(MyApps.this, view);
            }
        });
        K4().f11948d.inflateMenu(R.menu.toolbar_menu_my_apps);
        K4().f11949e.setTypeface(H4.j.f3824g.t());
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        boolean h02 = aVar.h0(this);
        K4().f11948d.getMenu().findItem(R.id.action_show_system_apps).setChecked(h02);
        K4().f11948d.getMenu().findItem(R.id.action_show_system_services).setChecked(aVar.i0(this));
        Toolbar toolbar = K4().f11948d;
        AbstractC3255y.h(toolbar, "binding.toolbarMyApps");
        c4(R.id.action_show_system_services, h02, toolbar);
        K4().f11948d.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        K4().f11948d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: D4.x1
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean P42;
                P42 = MyApps.P4(MyApps.this, menuItem);
                return P42;
            }
        });
        K4().f11947c.addItemDecoration(new q5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        K4().f11947c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        K4().f11947c.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) K4().f11947c.getItemAnimator();
        AbstractC3255y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        K4().f11946b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyApps.Q4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(MyApps this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P4(MyApps this$0, MenuItem item) {
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
                Toolbar toolbar = this$0.K4().f11948d;
                AbstractC3255y.h(toolbar, "binding.toolbarMyApps");
                this$0.c4(R.id.action_show_system_services, false, toolbar);
                Toolbar toolbar2 = this$0.K4().f11948d;
                AbstractC3255y.h(toolbar2, "binding.toolbarMyApps");
                this$0.A3(R.id.action_show_system_services, false, toolbar2);
            } else {
                Toolbar toolbar3 = this$0.K4().f11948d;
                AbstractC3255y.h(toolbar3, "binding.toolbarMyApps");
                this$0.c4(R.id.action_show_system_services, true, toolbar3);
            }
            this$0.S4(true);
        } else if (item.getItemId() == R.id.action_show_system_services) {
            boolean isChecked2 = item.isChecked();
            item.setChecked(!isChecked2);
            SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
            Context applicationContext3 = this$0.getApplicationContext();
            AbstractC3255y.h(applicationContext3, "applicationContext");
            aVar2.Z0(applicationContext3, !isChecked2);
            this$0.S4(true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R4(int i8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        G4.r rVar = this.f29616r0;
        if (rVar != null) {
            ArrayList arrayList3 = null;
            if (rVar != null) {
                arrayList = rVar.b();
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                G4.r rVar2 = this.f29616r0;
                if (rVar2 != null) {
                    arrayList2 = rVar2.b();
                } else {
                    arrayList2 = null;
                }
                AbstractC3255y.f(arrayList2);
                if (arrayList2.size() > i8) {
                    G4.r rVar3 = this.f29616r0;
                    if (rVar3 != null) {
                        arrayList3 = rVar3.b();
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
    public final void T4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        G4.r rVar = this.f29616r0;
        if (rVar == null) {
            this.f29616r0 = new G4.r(arrayList, arrayList2, arrayList3, arrayList4, this, this.f29617s0, this.f29618t0, this.f29619u0, this.f29620v0);
            K4().f11947c.setAdapter(this.f29616r0);
        } else {
            AbstractC3255y.f(rVar);
            rVar.g(arrayList, arrayList2, arrayList3, arrayList4);
        }
        G4.r rVar2 = this.f29616r0;
        AbstractC3255y.f(rVar2);
        rVar2.h(arrayList5);
        if (!arrayList.isEmpty()) {
            if (e4() == null) {
                p4(new HashMap());
                ArrayList arrayList6 = new ArrayList(AbstractC1378t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList6.add(Long.valueOf(((C1639f) it.next()).b()));
                }
                new V4.l(this, arrayList6, this.f29621w0, LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            G4.r rVar3 = this.f29616r0;
            AbstractC3255y.f(rVar3);
            HashMap e42 = e4();
            AbstractC3255y.f(e42);
            rVar3.e(e42);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V4(ArrayList arrayList) {
        if (!UptodownApp.f29058B.W("GenerateQueueWorker", this)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", true).putString("packagename", ((C1639f) arrayList.get(0)).J()).build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
            W4();
        }
    }

    private final void W4() {
        runOnUiThread(new Runnable() { // from class: D4.z1
            @Override // java.lang.Runnable
            public final void run() {
                MyApps.X4(MyApps.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(final MyApps this$0) {
        AbstractC3255y.i(this$0, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: D4.A1
            @Override // java.lang.Runnable
            public final void run() {
                MyApps.Y4(MyApps.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(MyApps this$0) {
        AbstractC3255y.i(this$0, "this$0");
        G4.r rVar = this$0.f29616r0;
        if (rVar != null) {
            rVar.c();
        }
    }

    public final Object J4(String str, String str2, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new d(str2, str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    public final void S4(boolean z8) {
        M4().b(this, z8);
    }

    public final void U4(ArrayList arrayList) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new h(arrayList, null), 2, null);
    }

    public final void Z4(int i8, String packageName) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new m(packageName, i8, null), 2, null);
    }

    public final void a5(int i8, String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new n(i8, this, str, null), 2, null);
    }

    @Override // D4.W1
    protected void o4() {
        S4(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        N4();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3255y.i(event, "event");
        if (i8 == 82) {
            K4().f11948d.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        S4(true);
        C3683w.f36547a.g(this);
    }
}
