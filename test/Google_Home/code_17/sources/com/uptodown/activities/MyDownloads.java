package com.uptodown.activities;

import G4.C1194d;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import Q4.w;
import W4.C1492p;
import W4.P;
import Z4.InterfaceC1595i;
import a5.C1641h;
import a5.C1648o;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.m;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3683w;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class MyDownloads extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    private C1194d f29660P;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29658N = O5.l.b(new b());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29659O = new ViewModelLazy(U.b(com.uptodown.activities.m.class), new p(this), new o(this), new q(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private boolean f29661Q = true;

    /* renamed from: R, reason: collision with root package name */
    private m.b f29662R = m.b.DATE;

    /* renamed from: S, reason: collision with root package name */
    private final m f29663S = new m();

    /* renamed from: T, reason: collision with root package name */
    private final k f29664T = new k();

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29665a;

        public a(int i8) {
            this.f29665a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = this.f29665a;
            if (i8 != 302 && i8 != 352) {
                MyDownloads.this.m4();
            } else {
                MyDownloads.this.n4(false);
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
        public final P invoke() {
            return P.c(MyDownloads.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f29668a;

        /* renamed from: b, reason: collision with root package name */
        int f29669b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, S5.d dVar) {
            super(2, dVar);
            this.f29671d = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29671d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r9.f29669b
                java.lang.String r2 = "item"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r1 = r9.f29668a
                java.util.Iterator r1 = (java.util.Iterator) r1
                O5.t.b(r10)
                goto L91
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f29668a
                java.util.Iterator r1 = (java.util.Iterator) r1
                O5.t.b(r10)
                goto L5d
            L29:
                O5.t.b(r10)
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                G4.d r10 = com.uptodown.activities.MyDownloads.y3(r10)
                if (r10 == 0) goto Lcf
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                G4.d r10 = com.uptodown.activities.MyDownloads.y3(r10)
                kotlin.jvm.internal.AbstractC3255y.f(r10)
                java.util.ArrayList r10 = r10.d()
                int r10 = r10.size()
                if (r10 <= 0) goto Lcf
                boolean r10 = r9.f29671d
                if (r10 == 0) goto L7f
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                G4.d r10 = com.uptodown.activities.MyDownloads.y3(r10)
                kotlin.jvm.internal.AbstractC3255y.f(r10)
                java.util.ArrayList r10 = r10.d()
                java.util.Iterator r10 = r10.iterator()
                r1 = r10
            L5d:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto Lc9
                java.lang.Object r10 = r1.next()
                a5.o r10 = (a5.C1648o) r10
                com.uptodown.activities.MyDownloads r3 = com.uptodown.activities.MyDownloads.this
                com.uptodown.activities.m r3 = com.uptodown.activities.MyDownloads.z3(r3)
                com.uptodown.activities.MyDownloads r5 = com.uptodown.activities.MyDownloads.this
                kotlin.jvm.internal.AbstractC3255y.h(r10, r2)
                r9.f29668a = r1
                r9.f29669b = r4
                java.lang.Object r10 = r3.h(r5, r10, r9)
                if (r10 != r0) goto L5d
                return r0
            L7f:
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                G4.d r10 = com.uptodown.activities.MyDownloads.y3(r10)
                kotlin.jvm.internal.AbstractC3255y.f(r10)
                java.util.ArrayList r10 = r10.d()
                java.util.Iterator r10 = r10.iterator()
                r1 = r10
            L91:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto Lc9
                java.lang.Object r10 = r1.next()
                a5.o r10 = (a5.C1648o) r10
                boolean r4 = r10.h0()
                if (r4 != 0) goto L91
                com.uptodown.workers.DownloadApkWorker$a r4 = com.uptodown.workers.DownloadApkWorker.f31034k
                long r5 = r10.h()
                long r7 = r10.e0()
                boolean r4 = r4.d(r5, r7)
                if (r4 != 0) goto L91
                com.uptodown.activities.MyDownloads r4 = com.uptodown.activities.MyDownloads.this
                com.uptodown.activities.m r4 = com.uptodown.activities.MyDownloads.z3(r4)
                com.uptodown.activities.MyDownloads r5 = com.uptodown.activities.MyDownloads.this
                kotlin.jvm.internal.AbstractC3255y.h(r10, r2)
                r9.f29668a = r1
                r9.f29669b = r3
                java.lang.Object r10 = r4.h(r5, r10, r9)
                if (r10 != r0) goto L91
                return r0
            Lc9:
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                r0 = 0
                r10.n4(r0)
            Lcf:
                O5.I r10 = O5.I.f8278a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MyDownloads.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29672a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29674c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i8, S5.d dVar) {
            super(2, dVar);
            this.f29674c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f29674c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29672a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                C1194d c1194d = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d);
                Object obj2 = c1194d.d().get(this.f29674c);
                AbstractC3255y.h(obj2, "downloadsAdapter!!.data[pos]");
                com.uptodown.activities.m X32 = MyDownloads.this.X3();
                MyDownloads myDownloads = MyDownloads.this;
                this.f29672a = 1;
                obj = X32.h(myDownloads, (C1648o) obj2, this);
                if (obj == e8) {
                    return e8;
                }
            }
            if (((Boolean) obj).booleanValue() && MyDownloads.this.f29660P != null) {
                C1194d c1194d2 = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d2);
                c1194d2.d().remove(this.f29674c);
                C1194d c1194d3 = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d3);
                c1194d3.notifyItemRemoved(this.f29674c);
                C1194d c1194d4 = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d4);
                if (c1194d4.d().isEmpty()) {
                    MyDownloads.this.V3().f11961l.setVisibility(0);
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5567invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5567invoke() {
            MyDownloads.this.H3(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5568invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5568invoke() {
            MyDownloads.this.H3(false);
            DownloadWorker.f31052c.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29678b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i8) {
            super(0);
            this.f29678b = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5569invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5569invoke() {
            MyDownloads.this.I3(this.f29678b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f29679a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5570invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5570invoke() {
            DownloadWorker.f31052c.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5571invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5571invoke() {
            if (UptodownApp.f29058B.W("downloadApkWorker", MyDownloads.this)) {
                MyDownloads.this.J3();
            } else {
                MyDownloads.this.H3(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            Object f29682a;

            /* renamed from: b, reason: collision with root package name */
            int f29683b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MyDownloads f29684c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MyDownloads myDownloads, S5.d dVar) {
                super(2, dVar);
                this.f29684c = myDownloads;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29684c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Object e8 = T5.b.e();
                int i8 = this.f29683b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        it = (Iterator) this.f29682a;
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    if (this.f29684c.f29660P != null) {
                        C1194d c1194d = this.f29684c.f29660P;
                        AbstractC3255y.f(c1194d);
                        it = c1194d.e().iterator();
                    }
                    this.f29684c.n4(false);
                    this.f29684c.Y3();
                    return O5.I.f8278a;
                }
                while (it.hasNext()) {
                    C1648o item = (C1648o) it.next();
                    com.uptodown.activities.m X32 = this.f29684c.X3();
                    MyDownloads myDownloads = this.f29684c;
                    AbstractC3255y.h(item, "item");
                    this.f29682a = it;
                    this.f29683b = 1;
                    if (X32.h(myDownloads, item, this) == e8) {
                        return e8;
                    }
                }
                this.f29684c.n4(false);
                this.f29684c.Y3();
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5572invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5572invoke() {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(MyDownloads.this), null, null, new a(MyDownloads.this, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC1595i {
        k() {
        }

        @Override // Z4.InterfaceC1595i
        public void a(int i8) {
            if (UptodownApp.f29058B.a0()) {
                C1194d c1194d = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d);
                if (c1194d.f()) {
                    C1194d c1194d2 = MyDownloads.this.f29660P;
                    AbstractC3255y.f(c1194d2);
                    c1194d2.i(i8);
                    MyDownloads.this.p4();
                    return;
                }
                C1194d c1194d3 = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d3);
                Object obj = c1194d3.d().get(i8);
                AbstractC3255y.h(obj, "downloadsAdapter!!.data[position]");
                MyDownloads.this.N3((C1648o) obj, i8);
            }
        }

        @Override // Z4.InterfaceC1595i
        public void b(int i8) {
            if (UptodownApp.f29058B.a0()) {
                MyDownloads.this.K3(i8);
            }
        }

        @Override // Z4.InterfaceC1595i
        public void c(int i8) {
            if (MyDownloads.this.f29660P != null) {
                C1194d c1194d = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d);
                if (!c1194d.f()) {
                    C1194d c1194d2 = MyDownloads.this.f29660P;
                    AbstractC3255y.f(c1194d2);
                    AbstractC3255y.f(MyDownloads.this.f29660P);
                    c1194d2.j(!r1.f());
                    C1194d c1194d3 = MyDownloads.this.f29660P;
                    AbstractC3255y.f(c1194d3);
                    c1194d3.i(i8);
                    MyDownloads.this.u4();
                    if (MyDownloads.this.V3().f11954e.getRoot().getVisibility() != 0) {
                        MyDownloads.this.V3().f11954e.getRoot().setVisibility(0);
                    }
                }
            }
        }

        @Override // Z4.InterfaceC1595i
        public void d(int i8) {
            if (UptodownApp.f29058B.a0()) {
                C1194d c1194d = MyDownloads.this.f29660P;
                AbstractC3255y.f(c1194d);
                if (c1194d.d().size() > 0) {
                    C1194d c1194d2 = MyDownloads.this.f29660P;
                    AbstractC3255y.f(c1194d2);
                    if (i8 < c1194d2.d().size()) {
                        C1194d c1194d3 = MyDownloads.this.f29660P;
                        AbstractC3255y.f(c1194d3);
                        Object obj = c1194d3.d().get(i8);
                        AbstractC3255y.h(obj, "downloadsAdapter!!.data[position]");
                        if (DownloadApkWorker.f31034k.e((C1648o) obj)) {
                            DownloadWorker.a aVar = DownloadWorker.f31052c;
                            if (aVar.c()) {
                                aVar.h();
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements SearchView.OnQueryTextListener {
        l() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String newText) {
            AbstractC3255y.i(newText, "newText");
            MyDownloads.this.F3(newText);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            AbstractC3255y.i(query, "query");
            MyDownloads.this.F3(query);
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends OnBackPressedCallback {
        m() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C1194d c1194d = MyDownloads.this.f29660P;
            if (c1194d != null && c1194d.f()) {
                MyDownloads.this.Y3();
            } else {
                MyDownloads.this.finish();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29688a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MyDownloads f29690a;

            a(MyDownloads myDownloads) {
                this.f29690a = myDownloads;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29690a.V3().f11953d.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    this.f29690a.V3().f11953d.f11842b.setVisibility(8);
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    this.f29690a.o4(((m.a) cVar.a()).a(), ((m.a) cVar.a()).b());
                    this.f29690a.Y3();
                    if (!this.f29690a.isFinishing()) {
                        if (((m.a) cVar.a()).a().size() == 0 && ((m.a) cVar.a()).b().size() == 0) {
                            this.f29690a.V3().f11961l.setVisibility(0);
                            this.f29690a.V3().f11955f.setVisibility(8);
                        } else {
                            this.f29690a.V3().f11961l.setVisibility(8);
                            this.f29690a.V3().f11955f.setVisibility(0);
                        }
                        if (((m.a) cVar.a()).b().size() == 0) {
                            this.f29690a.V3().f11960k.setVisibility(8);
                            this.f29690a.V3().f11956g.setVisibility(8);
                        } else {
                            this.f29690a.V3().f11960k.setVisibility(0);
                            if (!UptodownApp.f29058B.W("downloadApkWorker", this.f29690a)) {
                                this.f29690a.V3().f11956g.setVisibility(0);
                            } else {
                                this.f29690a.V3().f11956g.setVisibility(8);
                            }
                        }
                        this.f29690a.V3().f11953d.f11842b.setVisibility(8);
                    }
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        n(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new n(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29688a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L k8 = MyDownloads.this.X3().k();
                a aVar = new a(MyDownloads.this);
                this.f29688a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f29691a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29691a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29692a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f29692a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29692a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29693a = function0;
            this.f29694b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29693a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29694b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29695a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29697c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1648o f29698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(int i8, C1648o c1648o, S5.d dVar) {
            super(2, dVar);
            this.f29697c = i8;
            this.f29698d = c1648o;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new r(this.f29697c, this.f29698d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int W32;
            T5.b.e();
            if (this.f29695a == 0) {
                O5.t.b(obj);
                if (MyDownloads.this.f29660P != null) {
                    int i8 = this.f29697c;
                    if (i8 == 202 || i8 == 203) {
                        MyDownloads.this.n4(false);
                    }
                    C1648o c1648o = this.f29698d;
                    if (c1648o != null && (W32 = MyDownloads.this.W3(c1648o.Y())) > -1) {
                        C1194d c1194d = MyDownloads.this.f29660P;
                        AbstractC3255y.f(c1194d);
                        c1194d.d().set(W32, this.f29698d);
                        C1194d c1194d2 = MyDownloads.this.f29660P;
                        AbstractC3255y.f(c1194d2);
                        c1194d2.notifyItemChanged(W32);
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3(String str) {
        X3().j(str, this.f29662R, this.f29661Q);
    }

    private final void G3(File file) {
        w.a aVar = Q4.w.f9241b;
        String name = file.getName();
        AbstractC3255y.h(name, "item.name");
        if (aVar.a(name)) {
            Q4.w wVar = new Q4.w();
            boolean f8 = wVar.f(file);
            if (wVar.c(file) && !new Q4.f().e().canWrite()) {
                if (W()) {
                    V2(0L);
                } else {
                    n0();
                }
                f8 = false;
            }
            if (f8) {
                AbstractActivityC2683a.A2(this, file, null, 2, null);
                return;
            }
            return;
        }
        AbstractActivityC2683a.A2(this, file, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(boolean z8) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(z8, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(int i8) {
        C1194d c1194d = this.f29660P;
        if (c1194d != null) {
            AbstractC3255y.f(c1194d);
            if (c1194d.d().size() > 0) {
                C1194d c1194d2 = this.f29660P;
                AbstractC3255y.f(c1194d2);
                if (i8 < c1194d2.d().size()) {
                    AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(i8, null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3() {
        String format;
        DownloadWorker.f31052c.f();
        if (new C3671k().k(this).size() > 1) {
            Y y8 = Y.f34167a;
            String string = getString(R.string.dialog_cancel_downloads_msg);
            AbstractC3255y.h(string, "getString(R.string.dialog_cancel_downloads_msg)");
            format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3255y.h(format, "format(...)");
        } else {
            Y y9 = Y.f34167a;
            String string2 = getString(R.string.dialog_cancel_download_msg);
            AbstractC3255y.h(string2, "getString(R.string.dialog_cancel_download_msg)");
            format = String.format(string2, Arrays.copyOf(new Object[0], 0));
            AbstractC3255y.h(format, "format(...)");
        }
        Z1(format, new e(), new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3(int i8) {
        C1194d c1194d = this.f29660P;
        if (c1194d != null) {
            AbstractC3255y.f(c1194d);
            Object obj = c1194d.d().get(i8);
            AbstractC3255y.h(obj, "downloadsAdapter!!.data[position]");
            C1648o c1648o = (C1648o) obj;
            if (DownloadApkWorker.f31034k.d(c1648o.h(), c1648o.e0())) {
                DownloadWorker.f31052c.f();
            }
            String string = getString(R.string.download_cancel_confimation_title);
            AbstractC3255y.h(string, "getString(R.string.downl…cancel_confimation_title)");
            Z1(string, new g(i8), h.f29679a);
        }
    }

    private final void L3() {
        Y y8 = Y.f34167a;
        String string = getString(R.string.dialog_delete_all_download_msg);
        AbstractC3255y.h(string, "getString(R.string.dialog_delete_all_download_msg)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        AbstractC3255y.h(format, "format(...)");
        Y1(format, new i());
    }

    private final void M3() {
        Y y8 = Y.f34167a;
        String string = getString(R.string.dialog_delete_selected_download_msg);
        AbstractC3255y.h(string, "getString(R.string.dialo…te_selected_download_msg)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        AbstractC3255y.h(format, "format(...)");
        Y1(format, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N3(final C1648o c1648o, final int i8) {
        Object obj;
        final T t8 = new T();
        C1492p c8 = C1492p.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        c8.f12456h.setText(c1648o.X());
        TextView textView = c8.f12456h;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        if (!U3(c1648o) && !c1648o.h0()) {
            c8.f12453e.setTypeface(aVar.u());
            c8.f12453e.setOnClickListener(new View.OnClickListener() { // from class: D4.a2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.O3(kotlin.jvm.internal.T.this, c1648o, this, view);
                }
            });
        } else {
            c8.f12453e.setVisibility(8);
        }
        c8.f12454f.setTypeface(aVar.u());
        c8.f12454f.setOnClickListener(new View.OnClickListener() { // from class: D4.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.P3(MyDownloads.this, i8, t8, view);
            }
        });
        c8.f12455g.setTypeface(aVar.u());
        c8.f12455g.setOnClickListener(new View.OnClickListener() { // from class: D4.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.Q3(kotlin.jvm.internal.T.this, c1648o, this, view);
            }
        });
        if (c1648o.h() >= 0) {
            c8.f12450b.setTypeface(aVar.u());
            c8.f12450b.setOnClickListener(new View.OnClickListener() { // from class: D4.d2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.R3(kotlin.jvm.internal.T.this, this, c1648o, view);
                }
            });
        } else {
            c8.f12450b.setVisibility(8);
        }
        c8.f12451c.setTypeface(aVar.u());
        c8.f12451c.setOnClickListener(new View.OnClickListener() { // from class: D4.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.S3(kotlin.jvm.internal.T.this, this, i8, view);
            }
        });
        C1194d c1194d = this.f29660P;
        AbstractC3255y.f(c1194d);
        if (((C1648o) c1194d.d().get(i8)).g() != null) {
            c8.f12452d.setTypeface(aVar.u());
            c8.f12452d.setOnClickListener(new View.OnClickListener() { // from class: D4.f2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.T3(kotlin.jvm.internal.T.this, this, i8, view);
                }
            });
        } else {
            c8.f12452d.setVisibility(8);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f34162a = builder.create();
        if (!isFinishing() && (obj = t8.f34162a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f34162a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(T dialogDownloadOptions, C1648o download, MyDownloads this$0, View view) {
        AbstractC3255y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3255y.i(download, "$download");
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f34162a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (AbstractC3255y.d(download.Y(), this$0.getPackageName())) {
            String g8 = download.g();
            AbstractC3255y.f(g8);
            File file = new File(g8);
            if (file.exists()) {
                PackageManager packageManager = this$0.getPackageManager();
                AbstractC3255y.h(packageManager, "packageManager");
                String absolutePath = file.getAbsolutePath();
                AbstractC3255y.h(absolutePath, "uptodownFile.absolutePath");
                PackageInfo c8 = Q4.q.c(packageManager, absolutePath, 128);
                if (c8 == null) {
                    String string = this$0.getString(R.string.installable_files_not_found);
                    AbstractC3255y.h(string, "getString(R.string.installable_files_not_found)");
                    this$0.d2(string);
                    return;
                }
                C3677q c3677q = new C3677q();
                String name = file.getName();
                AbstractC3255y.h(name, "uptodownFile.name");
                String i8 = c3677q.i(name);
                if (i8 != null) {
                    if (new Q4.f().m(c8) > 628) {
                        AbstractActivityC2683a.A2(this$0, file, null, 2, null);
                        return;
                    } else {
                        this$0.G2(i8, null);
                        return;
                    }
                }
                UptodownApp.a.Z(UptodownApp.f29058B, file, this$0, null, 4, null);
                return;
            }
            String string2 = this$0.getString(R.string.installable_files_not_found);
            AbstractC3255y.h(string2, "getString(R.string.installable_files_not_found)");
            this$0.d2(string2);
            return;
        }
        String g9 = download.g();
        if (g9 != null && g9.length() != 0) {
            String g10 = download.g();
            AbstractC3255y.f(g10);
            File file2 = new File(g10);
            if (file2.exists()) {
                this$0.G3(file2);
                return;
            }
            String string3 = this$0.getString(R.string.installable_files_not_found);
            AbstractC3255y.h(string3, "getString(R.string.installable_files_not_found)");
            this$0.d2(string3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(MyDownloads this$0, int i8, T dialogDownloadOptions, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        C1194d c1194d = this$0.f29660P;
        AbstractC3255y.f(c1194d);
        c1194d.j(true);
        C1194d c1194d2 = this$0.f29660P;
        AbstractC3255y.f(c1194d2);
        c1194d2.i(i8);
        this$0.u4();
        this$0.p4();
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f34162a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(T dialogDownloadOptions, C1648o download, MyDownloads this$0, View view) {
        AbstractC3255y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3255y.i(download, "$download");
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f34162a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            if (download.Z() == 100) {
                this$0.t4(download.g());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(T dialogDownloadOptions, MyDownloads this$0, C1648o download, View view) {
        AbstractC3255y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(download, "$download");
        if (UptodownApp.f29058B.a0()) {
            AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f34162a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this$0.F2(download.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(T dialogDownloadOptions, MyDownloads this$0, int i8, View view) {
        AbstractC3255y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f34162a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.I3(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(T dialogDownloadOptions, MyDownloads this$0, int i8, View view) {
        String str;
        AbstractC3255y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f34162a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C1194d c1194d = this$0.f29660P;
        AbstractC3255y.f(c1194d);
        if (((C1648o) c1194d.d().get(i8)).g() != null) {
            C1194d c1194d2 = this$0.f29660P;
            AbstractC3255y.f(c1194d2);
            String g8 = ((C1648o) c1194d2.d().get(i8)).g();
            AbstractC3255y.f(g8);
            File parentFile = new File(g8).getParentFile();
            if (parentFile != null) {
                str = parentFile.getAbsolutePath();
            } else {
                str = null;
            }
            if (str != null) {
                Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
                intent.putExtra("subdir", str);
                this$0.startActivity(intent);
            } else {
                String string = this$0.getString(R.string.installable_files_not_found);
                AbstractC3255y.h(string, "getString(R.string.installable_files_not_found)");
                this$0.d2(string);
            }
        }
    }

    private final boolean U3(C1648o c1648o) {
        if (c1648o != null && c1648o.Z() > 0 && c1648o.Z() < 100) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P V3() {
        return (P) this.f29658N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W3(String str) {
        if (str != null) {
            C1194d c1194d = this.f29660P;
            AbstractC3255y.f(c1194d);
            ArrayList d8 = c1194d.d();
            int size = d8.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = d8.get(i8);
                AbstractC3255y.h(obj, "tmp[index]");
                if (j6.n.s(((C1648o) obj).Y(), str, true)) {
                    return i8;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.uptodown.activities.m X3() {
        return (com.uptodown.activities.m) this.f29659O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y3() {
        C1194d c1194d = this.f29660P;
        if (c1194d != null) {
            c1194d.j(false);
        }
        V3().f11954e.f11968f.setVisibility(8);
        V3().f11954e.f11969g.setVisibility(0);
    }

    private final void Z3() {
        setContentView(V3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            V3().f11959j.setNavigationIcon(drawable);
            V3().f11959j.setNavigationContentDescription(getString(R.string.back));
        }
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_title_downloads);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        V3().f11959j.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.X1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.a4(MyDownloads.this, view);
            }
        });
        V3().f11959j.inflateMenu(R.menu.toolbar_menu_my_downloads);
        V3().f11959j.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: D4.i2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean b42;
                b42 = MyDownloads.b4(MyDownloads.this, menuItem);
                return b42;
            }
        });
        V3().f11958i.setOnQueryTextListener(new l());
        V3().f11958i.setOnClickListener(new View.OnClickListener() { // from class: D4.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.e4(MyDownloads.this, view);
            }
        });
        ((ImageView) V3().f11958i.findViewById(R.id.search_close_btn)).setBackgroundResource(R.drawable.shape_transparent);
        ((ImageView) V3().f11958i.findViewById(R.id.search_mag_icon)).setImageResource(R.drawable.vector_search_downloads);
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) V3().f11958i.findViewById(R.id.search_src_text);
        searchAutoComplete.setTypeface(aVar.u());
        searchAutoComplete.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        ((TextView) findViewById(R.id.tv_label_order_by_mdf)).setTypeface(aVar.u());
        V3().f11954e.f11965c.setOnClickListener(new View.OnClickListener() { // from class: D4.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.f4(MyDownloads.this, view);
            }
        });
        V3().f11954e.f11966d.setOnClickListener(new View.OnClickListener() { // from class: D4.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.g4(MyDownloads.this, view);
            }
        });
        V3().f11954e.f11964b.setOnClickListener(new View.OnClickListener() { // from class: D4.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.h4(MyDownloads.this, view);
            }
        });
        V3().f11955f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        V3().f11955f.addItemDecoration(new q5.m(dimension, dimension));
        V3().f11955f.setItemAnimator(null);
        V3().f11960k.setTypeface(aVar.u());
        V3().f11956g.setOnClickListener(new View.OnClickListener() { // from class: D4.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.i4(MyDownloads.this, view);
            }
        });
        V3().f11961l.setTypeface(aVar.u());
        V3().f11954e.f11974l.setTypeface(aVar.t());
        V3().f11954e.f11974l.setOnClickListener(new View.OnClickListener() { // from class: D4.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.j4(MyDownloads.this, view);
            }
        });
        TextView textView2 = V3().f11954e.f11971i;
        V3().f11954e.f11973k.setTypeface(aVar.u());
        V3().f11954e.f11970h.setTypeface(aVar.t());
        V3().f11954e.f11970h.setOnClickListener(new View.OnClickListener() { // from class: D4.Y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.k4(MyDownloads.this, view);
            }
        });
        V3().f11954e.f11971i.setTypeface(aVar.t());
        V3().f11954e.f11971i.setOnClickListener(new View.OnClickListener() { // from class: D4.Z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.l4(MyDownloads.this, view);
            }
        });
        V3().f11953d.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.c4(view);
            }
        });
        V3().f11952c.setOnClickListener(new View.OnClickListener() { // from class: D4.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.d4(MyDownloads.this, view);
            }
        });
        o0();
        getOnBackPressedDispatcher().addCallback(this, this.f29663S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b4(MyDownloads this$0, MenuItem menuItem) {
        AbstractC3255y.i(this$0, "this$0");
        if (menuItem.getItemId() == R.id.action_file_explorer) {
            this$0.startActivity(new Intent(this$0, (Class<?>) FileExplorerActivity.class));
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.V3().f11954e.getRoot().getVisibility() == 0) {
            this$0.V3().f11954e.getRoot().setVisibility(8);
            view.animate().rotation(0.0f).start();
            C1194d c1194d = this$0.f29660P;
            if (c1194d != null && c1194d.f()) {
                this$0.Y3();
                return;
            }
            return;
        }
        this$0.V3().f11954e.getRoot().setVisibility(0);
        view.animate().rotation(180.0f).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.V3().f11958i.setIconified(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.r4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.V3().f11951b.startAnimation(AnimationUtils.loadAnimation(this$0, R.anim.rotate));
        this$0.y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C1194d c1194d = this$0.f29660P;
        if (c1194d != null) {
            AbstractC3255y.f(c1194d);
            if (c1194d.f()) {
                this$0.Y3();
            } else {
                this$0.u4();
            }
            C1194d c1194d2 = this$0.f29660P;
            AbstractC3255y.f(c1194d2);
            AbstractC3255y.f(this$0.f29660P);
            c1194d2.j(!r0.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.L3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l4(MyDownloads this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m4() {
        C1194d c1194d = this.f29660P;
        if (c1194d != null) {
            c1194d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o4(ArrayList arrayList, ArrayList arrayList2) {
        if (!isFinishing()) {
            C1194d c1194d = this.f29660P;
            if (c1194d == null) {
                this.f29660P = new C1194d(arrayList, arrayList2, this, this.f29664T);
                V3().f11955f.setAdapter(this.f29660P);
            } else {
                AbstractC3255y.f(c1194d);
                c1194d.g(arrayList, arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p4() {
        int i8;
        boolean z8;
        boolean z9;
        C1194d c1194d = this.f29660P;
        if (c1194d != null) {
            AbstractC3255y.f(c1194d);
            i8 = c1194d.c();
            TextView textView = V3().f11954e.f11970h;
            C1194d c1194d2 = this.f29660P;
            AbstractC3255y.f(c1194d2);
            if (c1194d2.d().size() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            textView.setEnabled(z9);
        } else {
            i8 = 0;
        }
        TextView textView2 = V3().f11954e.f11971i;
        if (i8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        textView2.setEnabled(z8);
        V3().f11954e.f11973k.setText(getString(R.string.core_x_items_selected, String.valueOf(i8)));
    }

    private final void q4() {
        m.b bVar = this.f29662R;
        m.b bVar2 = m.b.DATE;
        if (bVar != bVar2) {
            this.f29662R = bVar2;
        } else {
            this.f29661Q = !this.f29661Q;
        }
        F3(V3().f11958i.getQuery().toString());
        if (this.f29661Q) {
            V3().f11954e.f11965c.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_desc));
            V3().f11954e.f11966d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_size_desc));
            V3().f11954e.f11964b.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_desc));
        } else {
            V3().f11954e.f11965c.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_asc));
            V3().f11954e.f11966d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_size_asc));
            V3().f11954e.f11964b.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_asc));
        }
    }

    private final void r4() {
        m.b bVar = this.f29662R;
        m.b bVar2 = m.b.NAME;
        if (bVar != bVar2) {
            this.f29662R = bVar2;
        } else {
            this.f29661Q = !this.f29661Q;
        }
        F3(V3().f11958i.getQuery().toString());
        if (this.f29661Q) {
            V3().f11954e.f11965c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_on));
            V3().f11954e.f11966d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_off));
            V3().f11954e.f11964b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
        } else {
            V3().f11954e.f11965c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_on));
            V3().f11954e.f11966d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_off));
            V3().f11954e.f11964b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
        }
    }

    private final void s4() {
        m.b bVar = this.f29662R;
        m.b bVar2 = m.b.SIZE;
        if (bVar != bVar2) {
            this.f29662R = bVar2;
        } else {
            this.f29661Q = !this.f29661Q;
        }
        F3(V3().f11958i.getQuery().toString());
        if (this.f29661Q) {
            V3().f11954e.f11966d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_on));
            V3().f11954e.f11965c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_off));
            V3().f11954e.f11964b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
        } else {
            V3().f11954e.f11966d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_on));
            V3().f11954e.f11965c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_off));
            V3().f11954e.f11964b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
        }
    }

    private final void t4(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", new File(str));
            intent.setType(getContentResolver().getType(uriForFile));
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            startActivity(Intent.createChooser(intent, getString(R.string.intent_chooser_title_share_file)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u4() {
        V3().f11954e.f11968f.setVisibility(0);
        V3().f11954e.f11969g.setVisibility(4);
        p4();
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a
    public void X2(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        if (!isFinishing()) {
            Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            startActivity(intent, UptodownApp.f29058B.a(this));
        }
    }

    public final void n4(boolean z8) {
        if (V3().f11958i.getQuery().toString().length() > 0) {
            F3(V3().f11958i.getQuery().toString());
        } else {
            X3().i(this, this.f29662R, this.f29661Q, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Z3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new n(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        try {
            C3674n a8 = C3674n.f36505t.a(this);
            a8.a();
            a8.i1();
            a8.l();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C3683w.f36547a.g(this);
        n4(true);
    }

    public final void v4(int i8, C1648o c1648o) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new r(i8, c1648o, null), 2, null);
    }
}
