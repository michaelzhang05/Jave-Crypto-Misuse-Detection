package com.uptodown.activities;

import G4.C1211v;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import W4.T;
import a5.C1639f;
import a5.C1641h;
import a5.C1648o;
import a5.O;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.o;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3661a;
import o5.C3674n;
import o5.C3677q;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class OldVersionsActivity extends AbstractActivityC2683a {

    /* renamed from: R, reason: collision with root package name */
    public static final a f29732R = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private C1211v f29735P;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29733N = O5.l.b(new e());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29734O = new ViewModelLazy(U.b(o.class), new k(this), new j(this), new l(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private g f29736Q = new g();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f29737a;

        /* renamed from: b, reason: collision with root package name */
        private final long f29738b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29739c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OldVersionsActivity f29740d;

        public b(OldVersionsActivity oldVersionsActivity, String packagename, long j8, String downloadName) {
            AbstractC3255y.i(packagename, "packagename");
            AbstractC3255y.i(downloadName, "downloadName");
            this.f29740d = oldVersionsActivity;
            this.f29737a = packagename;
            this.f29738b = j8;
            this.f29739c = downloadName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29740d.p3().d().getValue() != null) {
                Object value = this.f29740d.p3().d().getValue();
                AbstractC3255y.f(value);
                if (((C1641h) value).y0() != null) {
                    Object value2 = this.f29740d.p3().d().getValue();
                    AbstractC3255y.f(value2);
                    if (j6.n.s(((C1641h) value2).y0(), this.f29737a, true)) {
                        OldVersionsActivity oldVersionsActivity = this.f29740d;
                        Object value3 = oldVersionsActivity.p3().d().getValue();
                        AbstractC3255y.f(value3);
                        String y02 = ((C1641h) value3).y0();
                        AbstractC3255y.f(y02);
                        oldVersionsActivity.y3(y02, this.f29738b, this.f29739c);
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29741a;

        /* renamed from: b, reason: collision with root package name */
        private final C1648o f29742b;

        public c(int i8, C1648o c1648o) {
            this.f29741a = i8;
            this.f29742b = c1648o;
        }

        @Override // java.lang.Runnable
        public void run() {
            Long l8;
            int i8 = this.f29741a;
            if (i8 == 203) {
                OldVersionsActivity.this.D3(this.f29742b);
                return;
            }
            if (i8 == 208) {
                Toast.makeText(OldVersionsActivity.this.getApplicationContext(), R.string.no_free_space, 1).show();
                return;
            }
            if (OldVersionsActivity.this.f29735P != null && !OldVersionsActivity.this.p3().g()) {
                C1648o c1648o = this.f29742b;
                Long l9 = null;
                if (c1648o != null) {
                    l8 = Long.valueOf(c1648o.h());
                } else {
                    l8 = null;
                }
                C1641h c1641h = (C1641h) OldVersionsActivity.this.p3().d().getValue();
                if (c1641h != null) {
                    l9 = Long.valueOf(c1641h.i());
                }
                if (AbstractC3255y.d(l8, l9)) {
                    OldVersionsActivity.this.D3(this.f29742b);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f29744a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29745b;

        public d(String str, int i8) {
            this.f29744a = str;
            this.f29745b = i8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
        
            if (j6.n.s(((a5.C1639f) r0).J(), r4.f29744a, true) == false) goto L27;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                java.lang.String r0 = r4.f29744a
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r1 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r1 = com.uptodown.activities.OldVersionsActivity.e3(r1)
                o6.w r1 = r1.d()
                java.lang.Object r1 = r1.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r1)
                a5.h r1 = (a5.C1641h) r1
                java.lang.String r1 = r1.y0()
                r2 = 1
                boolean r0 = j6.n.s(r0, r1, r2)
                if (r0 == 0) goto L114
                int r0 = r4.f29745b
                r1 = 306(0x132, float:4.29E-43)
                r3 = 8
                if (r0 != r1) goto L38
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                W4.T r0 = com.uptodown.activities.OldVersionsActivity.c3(r0)
                W4.K r0 = r0.f11982b
                android.widget.RelativeLayout r0 = r0.f11842b
                r0.setVisibility(r3)
                goto L49
            L38:
                r1 = 307(0x133, float:4.3E-43)
                if (r0 != r1) goto L49
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                W4.T r0 = com.uptodown.activities.OldVersionsActivity.c3(r0)
                W4.K r0 = r0.f11982b
                android.widget.RelativeLayout r0 = r0.f11842b
                r0.setVisibility(r3)
            L49:
                int r0 = r4.f29745b
                r1 = 301(0x12d, float:4.22E-43)
                if (r0 == r1) goto Lfb
                r1 = 351(0x15f, float:4.92E-43)
                if (r0 != r1) goto L55
                goto Lfb
            L55:
                r1 = 352(0x160, float:4.93E-43)
                if (r0 != r1) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                boolean r0 = r0.g()
                if (r0 != 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                o6.w r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                if (r0 == 0) goto Lad
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                o6.w r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                a5.f r0 = (a5.C1639f) r0
                java.lang.String r0 = r0.J()
                if (r0 == 0) goto Lad
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                o6.w r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                a5.f r0 = (a5.C1639f) r0
                java.lang.String r0 = r0.J()
                java.lang.String r1 = r4.f29744a
                boolean r0 = j6.n.s(r0, r1, r2)
                if (r0 != 0) goto Lf5
            Lad:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                o6.w r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                o6.w r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                a5.h r0 = (a5.C1641h) r0
                java.lang.String r0 = r0.y0()
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                o6.w r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r0)
                a5.h r0 = (a5.C1641h) r0
                java.lang.String r0 = r0.y0()
                java.lang.String r1 = r4.f29744a
                boolean r0 = j6.n.s(r0, r1, r2)
                if (r0 == 0) goto L114
            Lf5:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.d3(r0)
                goto L114
            Lfb:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                G4.v r0 = com.uptodown.activities.OldVersionsActivity.b3(r0)
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r0 = com.uptodown.activities.OldVersionsActivity.e3(r0)
                boolean r0 = r0.g()
                if (r0 != 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.i3(r0)
            L114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.OldVersionsActivity.d.run():void");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return T.c(OldVersionsActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2) {
            super(0);
            this.f29749b = str;
            this.f29750c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5574invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5574invoke() {
            SettingsPreferences.f30353b.w0(OldVersionsActivity.this, this.f29749b);
            OldVersionsActivity.this.B3(this.f29750c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Z4.w {
        g() {
        }

        @Override // Z4.w
        public void a() {
            if (UptodownApp.f29058B.a0()) {
                OldVersionsActivity.this.p3().l(true);
                OldVersionsActivity.this.p3().n(r0.i() - 1);
                OldVersionsActivity.this.p3().m(OldVersionsActivity.this.p3().i() * 20);
                OldVersionsActivity.this.o3();
            }
        }

        @Override // Z4.w
        public void b(int i8) {
            if (UptodownApp.f29058B.a0()) {
                OldVersionsActivity.this.w3(i8);
            }
        }

        @Override // Z4.x
        public void c(C1641h appInfo, C1639f c1639f) {
            AbstractC3255y.i(appInfo, "appInfo");
        }

        @Override // Z4.w
        public void d(int i8) {
            OldVersionsActivity.this.v3(i8);
        }

        @Override // Z4.x
        public void e(String appName) {
            AbstractC3255y.i(appName, "appName");
        }

        @Override // Z4.w
        public void f() {
            if (UptodownApp.f29058B.a0()) {
                OldVersionsActivity.this.p3().l(true);
                o p32 = OldVersionsActivity.this.p3();
                p32.n(p32.i() + 1);
                OldVersionsActivity.this.p3().m(OldVersionsActivity.this.p3().i() * 20);
                OldVersionsActivity.this.o3();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29752a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OldVersionsActivity f29754a;

            a(OldVersionsActivity oldVersionsActivity) {
                this.f29754a = oldVersionsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    if (this.f29754a.p3().f()) {
                        this.f29754a.n3().f11982b.f11842b.setVisibility(0);
                    }
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (((o.a) cVar.a()).c()) {
                        this.f29754a.p3().c().setValue(((o.a) cVar.a()).a());
                        this.f29754a.p3().d().setValue(((o.a) cVar.a()).b());
                        if (((o.a) cVar.a()).b().w0() != null) {
                            if (this.f29754a.f29735P == null) {
                                this.f29754a.k3();
                                this.f29754a.n3().f11983c.setAdapter(this.f29754a.f29735P);
                            } else {
                                C1211v c1211v = this.f29754a.f29735P;
                                AbstractC3255y.f(c1211v);
                                c1211v.g(this.f29754a.p3().i());
                                C1211v c1211v2 = this.f29754a.f29735P;
                                AbstractC3255y.f(c1211v2);
                                c1211v2.f(((o.a) cVar.a()).b().w0());
                                C1211v c1211v3 = this.f29754a.f29735P;
                                AbstractC3255y.f(c1211v3);
                                c1211v3.e((C1639f) this.f29754a.p3().c().getValue());
                                this.f29754a.C3();
                            }
                        } else {
                            this.f29754a.n3().f11985e.setVisibility(0);
                        }
                        this.f29754a.A3();
                    } else {
                        C1641h c1641h = (C1641h) this.f29754a.p3().d().getValue();
                        if (c1641h != null) {
                            c1641h.y1(null);
                        }
                        this.f29754a.n3().f11985e.setVisibility(0);
                        this.f29754a.A3();
                    }
                } else {
                    AbstractC3255y.d(abstractC3685y, AbstractC3685y.b.f36549a);
                }
                return O5.I.f8278a;
            }
        }

        h(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29752a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = OldVersionsActivity.this.p3().e();
                a aVar = new a(OldVersionsActivity.this);
                this.f29752a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements Z4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.z f29756b;

        i(a5.z zVar) {
            this.f29756b = zVar;
        }

        @Override // Z4.K
        public void a() {
            if (OldVersionsActivity.this.p3().d().getValue() != null) {
                OldVersionsActivity oldVersionsActivity = OldVersionsActivity.this;
                Object value = oldVersionsActivity.p3().d().getValue();
                AbstractC3255y.f(value);
                oldVersionsActivity.I2(((C1641h) value).S0());
            }
        }

        @Override // Z4.K
        public void b(a5.H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            Intent intent = new Intent(OldVersionsActivity.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("appInfo", (Parcelable) OldVersionsActivity.this.p3().d().getValue());
            intent.putExtra("appReportVT", reportVT);
            intent.putExtra("old_version", this.f29756b.p());
            OldVersionsActivity oldVersionsActivity = OldVersionsActivity.this;
            oldVersionsActivity.startActivity(intent, UptodownApp.f29058B.a(oldVersionsActivity));
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29757a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f29757a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29757a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f29758a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29758a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29759a = function0;
            this.f29760b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29759a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29760b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29761a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, S5.d dVar) {
            super(2, dVar);
            this.f29763c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(this.f29763c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
        
            if (j6.n.s(((a5.C1639f) r3).J(), r2.f29763c, true) == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a7, code lost:
        
            r2.f29762b.o3();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
        
            if (j6.n.s(((a5.C1641h) r3).y0(), r2.f29763c, true) != false) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                T5.b.e()
                int r0 = r2.f29761a
                if (r0 != 0) goto Laf
                O5.t.b(r3)
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r3 = com.uptodown.activities.OldVersionsActivity.e3(r3)
                boolean r3 = r3.g()
                if (r3 != 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r3 = com.uptodown.activities.OldVersionsActivity.e3(r3)
                o6.w r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                r0 = 1
                if (r3 == 0) goto L5f
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r3 = com.uptodown.activities.OldVersionsActivity.e3(r3)
                o6.w r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r3)
                a5.f r3 = (a5.C1639f) r3
                java.lang.String r3 = r3.J()
                if (r3 == 0) goto L5f
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r3 = com.uptodown.activities.OldVersionsActivity.e3(r3)
                o6.w r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r3)
                a5.f r3 = (a5.C1639f) r3
                java.lang.String r3 = r3.J()
                java.lang.String r1 = r2.f29763c
                boolean r3 = j6.n.s(r3, r1, r0)
                if (r3 != 0) goto La7
            L5f:
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r3 = com.uptodown.activities.OldVersionsActivity.e3(r3)
                o6.w r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                if (r3 == 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r3 = com.uptodown.activities.OldVersionsActivity.e3(r3)
                o6.w r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r3)
                a5.h r3 = (a5.C1641h) r3
                java.lang.String r3 = r3.y0()
                if (r3 == 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.o r3 = com.uptodown.activities.OldVersionsActivity.e3(r3)
                o6.w r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3255y.f(r3)
                a5.h r3 = (a5.C1641h) r3
                java.lang.String r3 = r3.y0()
                java.lang.String r1 = r2.f29763c
                boolean r3 = j6.n.s(r3, r1, r0)
                if (r3 == 0) goto Lac
            La7:
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.d3(r3)
            Lac:
                O5.I r3 = O5.I.f8278a
                return r3
            Laf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.OldVersionsActivity.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3() {
        p3().k(false);
        n3().f11982b.f11842b.setVisibility(8);
        p3().l(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(String str) {
        new H4.i(this).h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3() {
        C1211v c1211v = this.f29735P;
        if (c1211v != null) {
            c1211v.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(C1648o c1648o) {
        a5.z zVar;
        Object obj;
        String str;
        Object value = p3().d().getValue();
        AbstractC3255y.f(value);
        ArrayList w02 = ((C1641h) value).w0();
        Integer num = null;
        if (w02 != null) {
            Iterator it = w02.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String a8 = ((a5.z) obj).a();
                    if (c1648o != null) {
                        str = c1648o.w();
                    } else {
                        str = null;
                    }
                    if (AbstractC3255y.d(a8, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            zVar = (a5.z) obj;
        } else {
            zVar = null;
        }
        Object value2 = p3().d().getValue();
        AbstractC3255y.f(value2);
        ArrayList w03 = ((C1641h) value2).w0();
        if (w03 != null) {
            num = Integer.valueOf(AbstractC1378t.r0(w03, zVar));
        }
        if (zVar != null && num != null) {
            C1211v c1211v = this.f29735P;
            if (c1211v != null) {
                c1211v.notifyItemChanged(num.intValue());
                return;
            }
            return;
        }
        C3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3() {
        Object value = p3().d().getValue();
        AbstractC3255y.f(value);
        C1641h c1641h = (C1641h) value;
        C1639f c1639f = (C1639f) p3().c().getValue();
        g gVar = this.f29736Q;
        Object value2 = p3().d().getValue();
        AbstractC3255y.f(value2);
        this.f29735P = new C1211v(c1641h, c1639f, this, gVar, ((C1641h) value2).c1());
    }

    private final void l3(String str, String str2) {
        String string = getString(R.string.msg_warning_old_versions);
        AbstractC3255y.h(string, "getString(R.string.msg_warning_old_versions)");
        Y1(string, new f(str2, str));
    }

    private final void m3(C1648o c1648o) {
        Object value = p3().d().getValue();
        AbstractC3255y.f(value);
        c1648o.a((C1641h) value);
        int l02 = c1648o.l0(this);
        if (l02 >= 0) {
            L2(this, l02);
            return;
        }
        Toast.makeText(this, getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T n3() {
        return (T) this.f29733N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3() {
        p3().l(true);
        if (p3().d().getValue() != null) {
            p3().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o p3() {
        return (o) this.f29734O.getValue();
    }

    private final void q3() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_old_versions);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
            }
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OldVersionsActivity.r3(OldVersionsActivity.this, view);
                }
            });
        }
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_old_versions);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        n3().f11985e.setTypeface(aVar.u());
        n3().f11983c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        n3().f11983c.setItemAnimator(null);
        n3().f11983c.addItemDecoration(new q5.m((int) getResources().getDimension(R.dimen.margin_m), (int) getResources().getDimension(R.dimen.margin_xl)));
        n3().f11982b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OldVersionsActivity.s3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(OldVersionsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(View view) {
    }

    private final boolean u3(String str, long j8) {
        PackageManager pm = getPackageManager();
        try {
            AbstractC3255y.h(pm, "pm");
            if (j8 >= new Q4.f().m(Q4.q.d(pm, str, 128))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final void x3(a5.z zVar) {
        if (!isFinishing() && p3().d().getValue() != null) {
            Object value = p3().d().getValue();
            AbstractC3255y.f(value);
            if (((C1641h) value).n1()) {
                new V4.m(this, zVar.a(), null, new i(zVar), LifecycleOwnerKt.getLifecycleScope(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y3(String str, long j8, String str2) {
        if (u3(str, j8)) {
            l3(str, str2);
            return;
        }
        C3677q c3677q = new C3677q();
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        UptodownApp.a.Z(UptodownApp.f29058B, new File(c3677q.f(applicationContext), str2), this, null, 4, null);
    }

    private final void z3(String str, long j8, String str2) {
        if (u3(str, j8)) {
            l3(str, str2);
            return;
        }
        C3677q c3677q = new C3677q();
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        UptodownApp.a.Z(UptodownApp.f29058B, new File(c3677q.g(applicationContext), str2), this, null, 4, null);
    }

    public final Object E3(String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new m(str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        setContentView(n3().getRoot());
        p3().k(true);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                o6.w c8 = p3().c();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, C1639f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
                c8.setValue(parcelable3);
            }
            if (extras.containsKey("appInfo")) {
                o6.w d8 = p3().d();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C1641h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                d8.setValue(parcelable);
            }
        }
        q3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new h(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        o3();
    }

    public final void t3(String packageName) {
        AbstractC3255y.i(packageName, "packageName");
        p3().j(this, packageName);
    }

    public final void v3(int i8) {
        O o8;
        Object value = p3().d().getValue();
        AbstractC3255y.f(value);
        if (((C1641h) value).w0() != null) {
            Object value2 = p3().d().getValue();
            AbstractC3255y.f(value2);
            ArrayList w02 = ((C1641h) value2).w0();
            AbstractC3255y.f(w02);
            if (i8 < w02.size()) {
                Object value3 = p3().d().getValue();
                AbstractC3255y.f(value3);
                ArrayList w03 = ((C1641h) value3).w0();
                AbstractC3255y.f(w03);
                long l8 = ((a5.z) w03.get(i8)).l();
                if (p3().c().getValue() != null) {
                    Object value4 = p3().c().getValue();
                    AbstractC3255y.f(value4);
                    if (l8 == ((C1639f) value4).f0()) {
                        Y y8 = Y.f34167a;
                        String string = getString(R.string.autoupdate_installed_version);
                        AbstractC3255y.h(string, "getString(R.string.autoupdate_installed_version)");
                        Object value5 = p3().d().getValue();
                        AbstractC3255y.f(value5);
                        ArrayList w04 = ((C1641h) value5).w0();
                        AbstractC3255y.f(w04);
                        String format = String.format(string, Arrays.copyOf(new Object[]{((a5.z) w04.get(i8)).p()}, 1));
                        AbstractC3255y.h(format, "format(...)");
                        Toast.makeText(this, format, 1).show();
                        return;
                    }
                }
                C3674n.a aVar = C3674n.f36505t;
                Context applicationContext = getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                C3674n a8 = aVar.a(applicationContext);
                a8.a();
                Object value6 = p3().d().getValue();
                AbstractC3255y.f(value6);
                ArrayList w05 = ((C1641h) value6).w0();
                AbstractC3255y.f(w05);
                String a9 = ((a5.z) w05.get(i8)).a();
                AbstractC3255y.f(a9);
                C1648o Z7 = a8.Z(a9);
                if (Z7 != null) {
                    int Z8 = Z7.Z();
                    if (1 <= Z8 && Z8 < 100) {
                        if (Z7.X() != null) {
                            C3661a c3661a = new C3661a();
                            Context applicationContext2 = getApplicationContext();
                            AbstractC3255y.h(applicationContext2, "applicationContext");
                            c3661a.a(applicationContext2, Z7.X());
                        }
                    } else if (Z7.Z() == 100) {
                        Object value7 = p3().d().getValue();
                        AbstractC3255y.f(value7);
                        String y02 = ((C1641h) value7).y0();
                        AbstractC3255y.f(y02);
                        long e02 = Z7.e0();
                        String X7 = Z7.X();
                        AbstractC3255y.f(X7);
                        y3(y02, e02, X7);
                    } else {
                        Z7.n0(this);
                        C1211v c1211v = this.f29735P;
                        if (c1211v != null) {
                            c1211v.notifyItemChanged(i8);
                        }
                    }
                } else {
                    Object value8 = p3().d().getValue();
                    AbstractC3255y.f(value8);
                    if (((C1641h) value8).y0() != null) {
                        Object value9 = p3().d().getValue();
                        AbstractC3255y.f(value9);
                        String y03 = ((C1641h) value9).y0();
                        AbstractC3255y.f(y03);
                        o8 = a8.u0(y03);
                    } else {
                        o8 = null;
                    }
                    if (o8 != null && o8.u() == 100) {
                        long w8 = o8.w();
                        Object value10 = p3().d().getValue();
                        AbstractC3255y.f(value10);
                        ArrayList w06 = ((C1641h) value10).w0();
                        AbstractC3255y.f(w06);
                        if (w8 == ((a5.z) w06.get(i8)).l()) {
                            Object value11 = p3().d().getValue();
                            AbstractC3255y.f(value11);
                            String y04 = ((C1641h) value11).y0();
                            AbstractC3255y.f(y04);
                            long w9 = o8.w();
                            String l9 = o8.l();
                            AbstractC3255y.f(l9);
                            z3(y04, w9, l9);
                        }
                    }
                    File f8 = new C3677q().f(this);
                    C3661a c3661a2 = new C3661a();
                    long k8 = new C3677q().k(this, f8);
                    Object value12 = p3().d().getValue();
                    AbstractC3255y.f(value12);
                    ArrayList w07 = ((C1641h) value12).w0();
                    AbstractC3255y.f(w07);
                    if (c3661a2.c(k8, ((a5.z) w07.get(i8)).i())) {
                        C1648o c1648o = new C1648o();
                        Object value13 = p3().d().getValue();
                        AbstractC3255y.f(value13);
                        ArrayList w08 = ((C1641h) value13).w0();
                        AbstractC3255y.f(w08);
                        c1648o.w0(((a5.z) w08.get(i8)).a());
                        Object value14 = p3().d().getValue();
                        AbstractC3255y.f(value14);
                        ArrayList w09 = ((C1641h) value14).w0();
                        AbstractC3255y.f(w09);
                        c1648o.J0(((a5.z) w09.get(i8)).l());
                        Object value15 = p3().d().getValue();
                        AbstractC3255y.f(value15);
                        ArrayList w010 = ((C1641h) value15).w0();
                        AbstractC3255y.f(w010);
                        c1648o.G0(((a5.z) w010.get(i8)).i());
                        m3(c1648o);
                        C1211v c1211v2 = this.f29735P;
                        if (c1211v2 != null) {
                            c1211v2.notifyItemChanged(i8);
                        }
                    } else {
                        String string2 = getString(R.string.error_not_enough_space);
                        AbstractC3255y.h(string2, "getString(R.string.error_not_enough_space)");
                        d2(string2);
                    }
                }
                a8.l();
            }
        }
    }

    public final void w3(int i8) {
        a5.z zVar;
        Object value = p3().d().getValue();
        AbstractC3255y.f(value);
        if (((C1641h) value).w0() != null) {
            Object value2 = p3().d().getValue();
            AbstractC3255y.f(value2);
            ArrayList w02 = ((C1641h) value2).w0();
            AbstractC3255y.f(w02);
            if (i8 < w02.size()) {
                Object value3 = p3().d().getValue();
                AbstractC3255y.f(value3);
                ArrayList w03 = ((C1641h) value3).w0();
                if (w03 != null) {
                    zVar = (a5.z) w03.get(i8);
                } else {
                    zVar = null;
                }
                AbstractC3255y.f(zVar);
                x3(zVar);
            }
        }
    }
}
