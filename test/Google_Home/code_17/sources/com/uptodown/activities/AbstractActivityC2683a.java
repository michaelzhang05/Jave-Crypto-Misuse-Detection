package com.uptodown.activities;

import G4.C1196f;
import G4.C1198h;
import H4.j;
import I4.a1;
import W4.C1499x;
import Z4.InterfaceC1597k;
import Z4.InterfaceC1598l;
import a5.C1632D;
import a5.C1641h;
import a5.C1645l;
import a5.C1648o;
import a5.Q;
import a6.InterfaceC1668n;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2683a;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.view.WrapContentLinearLayoutManager;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.N;
import o5.C3655A;
import o5.C3667g;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3680t;

/* renamed from: com.uptodown.activities.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC2683a extends a1 {

    /* renamed from: M, reason: collision with root package name */
    public static final C0696a f30164M = new C0696a(null);

    /* renamed from: A, reason: collision with root package name */
    private RecyclerView f30165A;

    /* renamed from: B, reason: collision with root package name */
    private C1198h f30166B;

    /* renamed from: D, reason: collision with root package name */
    private RecyclerView f30168D;

    /* renamed from: E, reason: collision with root package name */
    private C1196f f30169E;

    /* renamed from: G, reason: collision with root package name */
    private long f30171G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f30172H;

    /* renamed from: I, reason: collision with root package name */
    private RecyclerView f30173I;

    /* renamed from: J, reason: collision with root package name */
    private G4.z f30174J;

    /* renamed from: w, reason: collision with root package name */
    private UptodownApp f30177w;

    /* renamed from: x, reason: collision with root package name */
    private C3678r f30178x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f30179y;

    /* renamed from: z, reason: collision with root package name */
    private AlertDialog f30180z;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC1598l f30167C = new j();

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC1597k f30170F = new i();

    /* renamed from: K, reason: collision with root package name */
    private Z4.y f30175K = new r();

    /* renamed from: L, reason: collision with root package name */
    private ArrayList f30176L = new ArrayList();

    /* renamed from: com.uptodown.activities.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0696a {
        private C0696a() {
        }

        public /* synthetic */ C0696a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.uptodown.activities.a$b */
    /* loaded from: classes4.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AbstractActivityC2683a.this.x2()) {
                AbstractActivityC2683a abstractActivityC2683a = AbstractActivityC2683a.this;
                String string = abstractActivityC2683a.getString(R.string.error_no_connection);
                AbstractC3255y.h(string, "getString(R.string.error_no_connection)");
                abstractActivityC2683a.d2(string);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends ItemTouchHelper.SimpleCallback {
        c() {
            super(0, 8);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            AbstractC3255y.i(viewHolder, "viewHolder");
            AbstractC3255y.i(target, "target");
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i8) {
            AbstractC3255y.i(viewHolder, "viewHolder");
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            G4.z zVar = AbstractActivityC2683a.this.f30174J;
            if (zVar != null) {
                zVar.e(absoluteAdapterPosition);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30183a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0697a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30185a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2683a f30186b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.activities.a$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0698a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f30187a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ T f30188b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ File f30189c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractActivityC2683a f30190d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0698a(T t8, File file, AbstractActivityC2683a abstractActivityC2683a, S5.d dVar) {
                    super(2, dVar);
                    this.f30188b = t8;
                    this.f30189c = file;
                    this.f30190d = abstractActivityC2683a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0698a(this.f30188b, this.f30189c, this.f30190d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f30187a == 0) {
                        O5.t.b(obj);
                        if (this.f30188b.f34162a != null) {
                            C1645l c1645l = new C1645l();
                            File file = this.f30189c;
                            AbstractC3255y.f(file);
                            String absolutePath = file.getAbsolutePath();
                            AbstractC3255y.h(absolutePath, "uptodownApk!!.absolutePath");
                            c1645l.h(absolutePath);
                            c1645l.f(String.valueOf(this.f30189c.lastModified()));
                            this.f30190d.G2((String) this.f30188b.f34162a, c1645l);
                        } else {
                            this.f30190d.E2();
                        }
                        this.f30190d.P2(true);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0698a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0697a(AbstractActivityC2683a abstractActivityC2683a, S5.d dVar) {
                super(2, dVar);
                this.f30186b = abstractActivityC2683a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0697a(this.f30186b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f30185a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    T t8 = new T();
                    File h8 = new C3677q().h(this.f30186b);
                    if (h8 != null) {
                        C3674n a8 = C3674n.f36505t.a(this.f30186b);
                        a8.a();
                        ArrayList X7 = a8.X();
                        a8.l();
                        Iterator it = X7.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C1645l c1645l = (C1645l) it.next();
                                if (j6.n.s(c1645l.e(), h8.getAbsolutePath(), true) && Long.parseLong(c1645l.a()) == h8.lastModified()) {
                                    break;
                                }
                            } else {
                                C3677q c3677q = new C3677q();
                                String name = h8.getName();
                                AbstractC3255y.h(name, "uptodownApk.name");
                                t8.f34162a = c3677q.i(name);
                                break;
                            }
                        }
                    }
                    J0 c8 = C3347b0.c();
                    C0698a c0698a = new C0698a(t8, h8, this.f30186b, null);
                    this.f30185a = 1;
                    if (AbstractC3360i.g(c8, c0698a, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0697a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30183a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                l6.I b8 = C3347b0.b();
                C0697a c0697a = new C0697a(AbstractActivityC2683a.this, null);
                this.f30183a = 1;
                if (AbstractC3360i.g(b8, c0697a, this) == e8) {
                    return e8;
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
    /* renamed from: com.uptodown.activities.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30191a;

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
            if (this.f30191a == 0) {
                O5.t.b(obj);
                try {
                    AbstractActivityC2683a.this.W1();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.uptodown.activities.a$f */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30193a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30195c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f30196d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f30197e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Function0 function0, Function0 function02, S5.d dVar) {
            super(2, dVar);
            this.f30195c = str;
            this.f30196d = function0;
            this.f30197e = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(Function0 function0, AbstractActivityC2683a abstractActivityC2683a, View view) {
            function0.invoke();
            abstractActivityC2683a.p2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(Function0 function0, AbstractActivityC2683a abstractActivityC2683a, View view) {
            function0.invoke();
            abstractActivityC2683a.p2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f30195c, this.f30196d, this.f30197e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30193a == 0) {
                O5.t.b(obj);
                if (!AbstractActivityC2683a.this.isFinishing()) {
                    AlertDialog r22 = AbstractActivityC2683a.this.r2();
                    if (r22 != null) {
                        r22.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(AbstractActivityC2683a.this);
                    W4.r c8 = W4.r.c(AbstractActivityC2683a.this.getLayoutInflater());
                    AbstractC3255y.h(c8, "inflate(layoutInflater)");
                    String str = this.f30195c;
                    final Function0 function0 = this.f30196d;
                    final AbstractActivityC2683a abstractActivityC2683a = AbstractActivityC2683a.this;
                    final Function0 function02 = this.f30197e;
                    TextView textView = c8.f12478d;
                    j.a aVar = H4.j.f3824g;
                    textView.setTypeface(aVar.u());
                    c8.f12478d.setText(str);
                    c8.f12479e.setTypeface(aVar.t());
                    c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractActivityC2683a.f.n(Function0.this, abstractActivityC2683a, view);
                        }
                    });
                    c8.f12477c.setTypeface(aVar.t());
                    c8.f12477c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractActivityC2683a.f.o(Function0.this, abstractActivityC2683a, view);
                        }
                    });
                    builder.setCancelable(false);
                    builder.setView(c8.getRoot());
                    AbstractActivityC2683a.this.N2(builder.create());
                    if (!AbstractActivityC2683a.this.isFinishing() && AbstractActivityC2683a.this.r2() != null) {
                        AbstractActivityC2683a.this.T2();
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.uptodown.activities.a$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f30198a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2683a f30199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file, AbstractActivityC2683a abstractActivityC2683a) {
            super(0);
            this.f30198a = file;
            this.f30199b = abstractActivityC2683a;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5578invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5578invoke() {
            UptodownApp.a.Z(UptodownApp.f29058B, this.f30198a, this.f30199b, null, 4, null);
        }
    }

    /* renamed from: com.uptodown.activities.a$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f30201b;

        /* renamed from: com.uptodown.activities.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0699a implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2683a f30202a;

            C0699a(AbstractActivityC2683a abstractActivityC2683a) {
                this.f30202a = abstractActivityC2683a;
            }

            @Override // Z4.r
            public void c(int i8) {
                AbstractActivityC2683a abstractActivityC2683a = this.f30202a;
                String string = abstractActivityC2683a.getString(R.string.app_detail_not_found);
                AbstractC3255y.h(string, "getString(R.string.app_detail_not_found)");
                abstractActivityC2683a.d2(string);
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                this.f30202a.X2(appInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j8) {
            super(0);
            this.f30201b = j8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5579invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5579invoke() {
            Context applicationContext = AbstractActivityC2683a.this.getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            new V4.i(applicationContext, this.f30201b, new C0699a(AbstractActivityC2683a.this), LifecycleOwnerKt.getLifecycleScope(AbstractActivityC2683a.this));
        }
    }

    /* renamed from: com.uptodown.activities.a$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC1597k {
        i() {
        }

        @Override // Z4.InterfaceC1597k
        public void a(File file) {
            AbstractC3255y.i(file, "file");
            UptodownApp.a.Z(UptodownApp.f29058B, file, AbstractActivityC2683a.this, null, 4, null);
            AbstractActivityC2683a.this.n2(file);
        }
    }

    /* renamed from: com.uptodown.activities.a$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC1598l {
        j() {
        }

        @Override // Z4.InterfaceC1598l
        public void a() {
            if (UptodownApp.f29058B.a0()) {
                AbstractActivityC2683a.this.H2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$k */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30205a;

        /* renamed from: b, reason: collision with root package name */
        int f30206b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f30207c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2683a f30208d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30209e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j8, AbstractActivityC2683a abstractActivityC2683a, int i8, S5.d dVar) {
            super(2, dVar);
            this.f30207c = j8;
            this.f30208d = abstractActivityC2683a;
            this.f30209e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f30207c, this.f30208d, this.f30209e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r7.f30206b
                r2 = 2
                java.lang.String r3 = "downloadApkWorker"
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r2) goto L16
                int r1 = r7.f30205a
                O5.t.b(r8)
                goto L50
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                O5.t.b(r8)
                goto L30
            L22:
                O5.t.b(r8)
                long r5 = r7.f30207c
                r7.f30206b = r4
                java.lang.Object r8 = l6.X.b(r5, r7)
                if (r8 != r0) goto L30
                return r0
            L30:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29058B
                com.uptodown.activities.a r1 = r7.f30208d
                androidx.work.WorkInfo$State r8 = r8.I(r3, r1)
                r1 = 0
            L39:
                int r5 = r7.f30209e
                if (r1 >= r5) goto L59
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.ENQUEUED
                if (r8 != r5) goto L59
                int r1 = r1 + 1
                long r5 = r7.f30207c
                r7.f30205a = r1
                r7.f30206b = r2
                java.lang.Object r8 = l6.X.b(r5, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29058B
                com.uptodown.activities.a r5 = r7.f30208d
                androidx.work.WorkInfo$State r8 = r8.I(r3, r5)
                goto L39
            L59:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f29058B
                com.uptodown.activities.a r0 = r7.f30208d
                boolean r8 = r8.W(r3, r0)
                if (r8 != 0) goto L84
                o5.k r8 = new o5.k
                r8.<init>()
                com.uptodown.activities.a r0 = r7.f30208d
                java.util.ArrayList r8 = r8.k(r0)
                boolean r0 = r8.isEmpty()
                r0 = r0 ^ r4
                if (r0 == 0) goto L84
                com.uptodown.activities.a r0 = r7.f30208d
                java.lang.Object r8 = P5.AbstractC1378t.m0(r8)
                a5.o r8 = (a5.C1648o) r8
                int r8 = r8.y()
                r0.L2(r0, r8)
            L84:
                O5.I r8 = O5.I.f8278a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AbstractActivityC2683a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.uptodown.activities.a$l */
    /* loaded from: classes4.dex */
    public static final class l implements Z4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30211b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30212c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f30213d;

        /* renamed from: com.uptodown.activities.a$l$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0700a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2683a f30214a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f30215b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30216c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f30217d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0700a(AbstractActivityC2683a abstractActivityC2683a, File file, String str, boolean z8) {
                super(0);
                this.f30214a = abstractActivityC2683a;
                this.f30215b = file;
                this.f30216c = str;
                this.f30217d = z8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5580invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5580invoke() {
                new H4.i(this.f30214a).c(this.f30215b, this.f30216c, this.f30217d);
            }
        }

        l(File file, String str, boolean z8) {
            this.f30211b = file;
            this.f30212c = str;
            this.f30213d = z8;
        }

        @Override // Z4.K
        public void a() {
        }

        @Override // Z4.K
        public void b(a5.H reportVT) {
            AbstractC3255y.i(reportVT, "reportVT");
            if (reportVT.h() > 0) {
                new UptodownApp().j1(reportVT, new C0700a(AbstractActivityC2683a.this, this.f30211b, this.f30212c, this.f30213d), AbstractActivityC2683a.this);
            } else {
                new H4.i(AbstractActivityC2683a.this).c(this.f30211b, this.f30212c, this.f30213d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$m */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30218a;

        m(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30218a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                AbstractActivityC2683a abstractActivityC2683a = AbstractActivityC2683a.this;
                this.f30218a = 1;
                if (abstractActivityC2683a.C2(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$n */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30220a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.a$n$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0701a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30222a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2683a f30223b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f30224c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0701a(AbstractActivityC2683a abstractActivityC2683a, ArrayList arrayList, S5.d dVar) {
                super(2, dVar);
                this.f30223b = abstractActivityC2683a;
                this.f30224c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0701a(this.f30223b, this.f30224c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30222a == 0) {
                    O5.t.b(obj);
                    C1198h c1198h = this.f30223b.f30166B;
                    if (c1198h != null) {
                        c1198h.i(this.f30224c);
                        return O5.I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0701a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
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
            int i8 = this.f30220a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                ArrayList k8 = new C3671k().k(AbstractActivityC2683a.this);
                J0 c8 = C3347b0.c();
                C0701a c0701a = new C0701a(AbstractActivityC2683a.this, k8, null);
                this.f30220a = 1;
                obj = AbstractC3360i.g(c8, c0701a, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$o */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30225a;

        o(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30225a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                AbstractActivityC2683a abstractActivityC2683a = AbstractActivityC2683a.this;
                this.f30225a = 1;
                if (abstractActivityC2683a.X1(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.uptodown.activities.a$p */
    /* loaded from: classes4.dex */
    public static final class p implements Z4.r {
        p() {
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (!AbstractActivityC2683a.this.isFinishing()) {
                Intent intent = new Intent(AbstractActivityC2683a.this, (Class<?>) AppDetailActivity.class);
                intent.putExtra("appInfo", appInfo);
                AbstractActivityC2683a abstractActivityC2683a = AbstractActivityC2683a.this;
                abstractActivityC2683a.startActivity(intent, UptodownApp.f29058B.a(abstractActivityC2683a));
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$q */
    /* loaded from: classes4.dex */
    public static final class q implements Z4.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1645l f30228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2683a f30229b;

        q(C1645l c1645l, AbstractActivityC2683a abstractActivityC2683a) {
            this.f30228a = c1645l;
            this.f30229b = abstractActivityC2683a;
        }

        @Override // Z4.r
        public void c(int i8) {
            this.f30229b.E2();
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (appInfo.i() > 0) {
                UptodownApp.f29058B.r0(this.f30228a);
                if (this.f30228a != null) {
                    C3674n a8 = C3674n.f36505t.a(this.f30229b);
                    a8.a();
                    a8.E0(this.f30228a);
                    a8.l();
                }
                this.f30229b.D2(appInfo);
                return;
            }
            this.f30229b.E2();
        }
    }

    /* renamed from: com.uptodown.activities.a$r */
    /* loaded from: classes4.dex */
    public static final class r implements Z4.y {
        r() {
        }

        @Override // Z4.y
        public void a() {
            if (AbstractActivityC2683a.this.u2().size() > 0) {
                Object remove = AbstractActivityC2683a.this.u2().remove(0);
                AbstractC3255y.h(remove, "preregistrationsToNotify.removeAt(0)");
                AbstractActivityC2683a.this.K2((C1632D) remove);
            }
        }

        @Override // Z4.y
        public void b(C1632D preregister) {
            AbstractC3255y.i(preregister, "preregister");
            AbstractActivityC2683a.this.F2(preregister.b());
            G4.z zVar = AbstractActivityC2683a.this.f30174J;
            if (zVar != null) {
                zVar.d(preregister);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$s */
    /* loaded from: classes4.dex */
    public static final class s implements Z4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1632D f30232b;

        s(C1632D c1632d) {
            this.f30232b = c1632d;
        }

        @Override // Z4.r
        public void c(int i8) {
            if (i8 == 404) {
                C3674n a8 = C3674n.f36505t.a(AbstractActivityC2683a.this);
                a8.a();
                a8.c1(this.f30232b.b());
                a8.l();
            }
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            C1632D c1632d = new C1632D();
            c1632d.j(appInfo.i());
            c1632d.l(appInfo.s0());
            c1632d.k(appInfo.l0());
            AbstractActivityC2683a.this.T1(c1632d);
            C3674n a8 = C3674n.f36505t.a(AbstractActivityC2683a.this);
            a8.a();
            a8.c1(c1632d.b());
            a8.l();
        }
    }

    public static /* synthetic */ void A2(AbstractActivityC2683a abstractActivityC2683a, File file, String str, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                str = null;
            }
            abstractActivityC2683a.z2(file, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchInstallation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C2(S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new n(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(AbstractActivityC2683a this$0) {
        AbstractC3255y.i(this$0, "this$0");
        String string = this$0.getString(R.string.error_no_connection);
        AbstractC3255y.h(string, "getString(R.string.error_no_connection)");
        this$0.d2(string);
    }

    private final void Q1(C1648o c1648o) {
        if (c1648o.X() != null) {
            File f8 = new C3677q().f(this);
            String X7 = c1648o.X();
            AbstractC3255y.f(X7);
            final File file = new File(f8, X7);
            if (file.exists()) {
                C1196f c1196f = this.f30169E;
                if (c1196f != null) {
                    c1196f.b(file, c1648o);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: D4.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2683a.R1(AbstractActivityC2683a.this, file);
                    }
                }, 5000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(AbstractActivityC2683a this$0, File file) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(file, "$file");
        this$0.n2(file);
    }

    private final void U1() {
        new ItemTouchHelper(new c()).attachToRecyclerView(this.f30173I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1() {
        C3674n a8 = C3674n.f36505t.a(this);
        a8.a();
        Iterator it = a8.c0().iterator();
        while (it.hasNext()) {
            C1648o c1648o = (C1648o) it.next();
            if (c1648o.Y() == null || c1648o.a0() <= 0 || c1648o.e0() == 0) {
                a8.A(c1648o);
            }
        }
        a8.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X1(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(Function0 acceptAction, AbstractActivityC2683a this$0, View view) {
        AbstractC3255y.i(acceptAction, "$acceptAction");
        AbstractC3255y.i(this$0, "this$0");
        acceptAction.invoke();
        this$0.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(AbstractActivityC2683a this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(AbstractActivityC2683a this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(AbstractActivityC2683a this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30180z;
        AbstractC3255y.f(alertDialog);
        alertDialog.dismiss();
        this$0.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(AbstractActivityC2683a this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30180z;
        AbstractC3255y.f(alertDialog);
        alertDialog.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(AbstractActivityC2683a this$0, Function0 cancelAction, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(cancelAction, "$cancelAction");
        AlertDialog alertDialog = this$0.f30180z;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        cancelAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(Function0 action, AbstractActivityC2683a this$0, View view) {
        AbstractC3255y.i(action, "$action");
        AbstractC3255y.i(this$0, "this$0");
        action.invoke();
        AlertDialog alertDialog = this$0.f30180z;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m2(Function0 cancelAction, DialogInterface dialogInterface) {
        AbstractC3255y.i(cancelAction, "$cancelAction");
        cancelAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n2(final File file) {
        Integer num;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        C1196f c1196f = this.f30169E;
        View view = null;
        if (c1196f != null) {
            num = Integer.valueOf(c1196f.c(file));
        } else {
            num = null;
        }
        if (num != null && num.intValue() >= 0) {
            RecyclerView recyclerView = this.f30168D;
            if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(num.intValue())) != null) {
                view = findViewHolderForAdapterPosition.itemView;
            }
            if (view != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_left);
                AbstractC3255y.h(loadAnimation, "loadAnimation(\n         …ut_left\n                )");
                loadAnimation.setDuration(300L);
                view.startAnimation(loadAnimation);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: D4.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2683a.o2(AbstractActivityC2683a.this, file);
                    }
                }, loadAnimation.getDuration());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(AbstractActivityC2683a this$0, File file) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(file, "$file");
        C1196f c1196f = this$0.f30169E;
        if (c1196f != null) {
            c1196f.e(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2() {
        AlertDialog alertDialog = this.f30180z;
        AbstractC3255y.f(alertDialog);
        alertDialog.dismiss();
        UptodownApp.f29058B.s0(false);
    }

    public final void B2() {
        if (SettingsPreferences.f30353b.U(this)) {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new m(null), 3, null);
        }
    }

    public void D2(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        X2(appInfo);
    }

    public void E2() {
    }

    public void F2(long j8) {
        if (j8 > 0) {
            new V4.i(this, j8, new p(), LifecycleOwnerKt.getLifecycleScope(this));
        } else {
            H2();
        }
    }

    public final void G2(String packageNameToOpen, C1645l c1645l) {
        AbstractC3255y.i(packageNameToOpen, "packageNameToOpen");
        new V4.j(this, packageNameToOpen, new q(c1645l, this), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void H2() {
        Object obj = C3655A.f36474a.d().get(r0.d().size() - 1);
        AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
        Activity activity = (Activity) obj;
        if (!isFinishing() && !(activity instanceof MyDownloads)) {
            startActivity(new Intent(this, (Class<?>) MyDownloads.class), UptodownApp.f29058B.a(this));
        }
    }

    public final void I2(String str) {
        if (str != null && !isFinishing()) {
            String q8 = new C3667g().q(str);
            String string = getString(R.string.virustotal_safety_report_title);
            AbstractC3255y.h(string, "getString(R.string.virustotal_safety_report_title)");
            new C3671k().q(this, q8, string);
        }
    }

    public final void J2(C1648o download) {
        ArrayList arrayList;
        AbstractC3255y.i(download, "download");
        C1198h c1198h = this.f30166B;
        if (c1198h != null) {
            c1198h.h(download);
        }
        C1198h c1198h2 = this.f30166B;
        if (c1198h2 != null) {
            arrayList = c1198h2.f();
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            v2();
        }
    }

    public final void K2(C1632D preregister) {
        AbstractC3255y.i(preregister, "preregister");
        new V4.i(this, preregister.b(), new s(preregister), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void L2(Context context, int i8) {
        AbstractC3255y.i(context, "context");
        if (C3680t.f36531a.d()) {
            DownloadApkWorker.f31034k.f(context, i8);
        } else {
            runOnUiThread(new Runnable() { // from class: D4.s
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC2683a.M2(AbstractActivityC2683a.this);
                }
            });
        }
    }

    public final void N2(AlertDialog alertDialog) {
        this.f30180z = alertDialog;
    }

    public final void O2() {
        this.f30178x = new C3678r(this);
    }

    public final void P2(boolean z8) {
        this.f30172H = z8;
    }

    public final void Q2(Window window) {
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        AbstractC3255y.i(window, "window");
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            if (insetsController != null) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars = WindowInsets.Type.navigationBars();
                insetsController.hide(statusBars | navigationBars);
                insetsController.setSystemBarsBehavior(2);
                return;
            }
            return;
        }
        window.getDecorView().setSystemUiVisibility(4);
        window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
    }

    public final void R2(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f30176L = arrayList;
    }

    public final void S1(C1648o download) {
        ArrayList arrayList;
        AbstractC3255y.i(download, "download");
        C1198h c1198h = this.f30166B;
        if (c1198h != null) {
            c1198h.e(download);
        }
        C1198h c1198h2 = this.f30166B;
        if (c1198h2 != null) {
            arrayList = c1198h2.f();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            U2();
        }
    }

    public final void S2(Drawable drawable, int i8) {
        AbstractC3255y.i(drawable, "drawable");
        DrawableCompat.setTint(drawable, i8);
    }

    public final void T1(C1632D preRegister) {
        AbstractC3255y.i(preRegister, "preRegister");
        G4.z zVar = this.f30174J;
        if (zVar != null) {
            zVar.b(preRegister);
        }
    }

    public final void T2() {
        AlertDialog alertDialog = this.f30180z;
        AbstractC3255y.f(alertDialog);
        Window window = alertDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f30180z;
        AbstractC3255y.f(alertDialog2);
        alertDialog2.show();
        UptodownApp.f29058B.s0(true);
    }

    public final void U2() {
        RecyclerView recyclerView = this.f30165A;
        if (recyclerView != null && recyclerView.getVisibility() == 8) {
            RecyclerView recyclerView2 = this.f30165A;
            if (recyclerView2 != null) {
                recyclerView2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_next_in));
            }
            RecyclerView recyclerView3 = this.f30165A;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
        }
    }

    public final void V1() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f30171G > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            this.f30171G = currentTimeMillis;
            AbstractC3364k.d(N.a(C3347b0.b()), null, null, new d(null), 3, null);
        }
    }

    public void V2(long j8) {
        String string = getString(R.string.core_kill_this_app, getString(R.string.app_name));
        AbstractC3255y.h(string, "getString(R.string.core_…tring(R.string.app_name))");
        d2(string);
    }

    public final void W2(int i8, C1648o download, boolean z8) {
        AbstractC3255y.i(download, "download");
        switch (i8) {
            case 199:
                C1198h c1198h = this.f30166B;
                if (c1198h != null) {
                    c1198h.j(download, i8);
                    return;
                }
                return;
            case 200:
                C1198h c1198h2 = this.f30166B;
                if (c1198h2 != null) {
                    c1198h2.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.providerKey /* 201 */:
                C1198h c1198h3 = this.f30166B;
                if (c1198h3 != null) {
                    c1198h3.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
                J2(download);
                return;
            case ComposerKt.providerValuesKey /* 203 */:
                B2();
                return;
            case ComposerKt.providerMapsKey /* 204 */:
            default:
                return;
            case 205:
                C1198h c1198h4 = this.f30166B;
                if (c1198h4 != null) {
                    c1198h4.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.referenceKey /* 206 */:
                J2(download);
                if (z8) {
                    Q1(download);
                    return;
                }
                return;
            case ComposerKt.reuseKey /* 207 */:
                J2(download);
                return;
            case 208:
                B2();
                return;
        }
    }

    public void X2(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
    }

    public final void Y1(String msg, final Function0 acceptAction) {
        AbstractC3255y.i(msg, "msg");
        AbstractC3255y.i(acceptAction, "acceptAction");
        if (!isFinishing()) {
            AlertDialog alertDialog = this.f30180z;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            W4.r c8 = W4.r.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(msg);
            c8.f12479e.setTypeface(aVar.t());
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: D4.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2683a.a2(Function0.this, this, view);
                }
            });
            c8.f12477c.setTypeface(aVar.t());
            c8.f12477c.setOnClickListener(new View.OnClickListener() { // from class: D4.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2683a.b2(AbstractActivityC2683a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            this.f30180z = builder.create();
            if (!isFinishing() && this.f30180z != null) {
                T2();
            }
        }
    }

    public final void Z1(String msg, Function0 acceptAction, Function0 cancelAction) {
        AbstractC3255y.i(msg, "msg");
        AbstractC3255y.i(acceptAction, "acceptAction");
        AbstractC3255y.i(cancelAction, "cancelAction");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new f(msg, acceptAction, cancelAction, null), 2, null);
    }

    @Override // I4.r
    public void b0() {
    }

    @Override // I4.r
    public void c0() {
    }

    @Override // I4.a1
    public void c1() {
    }

    public final void c2(File updateFile) {
        AbstractC3255y.i(updateFile, "updateFile");
        String string = getString(R.string.warning_auto_update);
        AbstractC3255y.h(string, "getString(R.string.warning_auto_update)");
        Y1(string, new g(updateFile, this));
    }

    @Override // I4.r
    public void d0() {
    }

    public final void d2(String msg) {
        AbstractC3255y.i(msg, "msg");
        if (!isFinishing()) {
            AlertDialog alertDialog = this.f30180z;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            W4.r c8 = W4.r.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(msg);
            c8.f12477c.setVisibility(8);
            c8.f12479e.setTypeface(aVar.t());
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: D4.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2683a.e2(AbstractActivityC2683a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            this.f30180z = builder.create();
            if (!isFinishing() && this.f30180z != null) {
                T2();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getSource() == 8194) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // I4.r
    public void e0() {
    }

    public final void f2(String str, String str2, long j8) {
        Y1(str + '\n' + str2, new h(j8));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.right_to_left_out);
    }

    @Override // I4.r
    public void g0() {
    }

    public final void g2() {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.f30180z;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            W4.r c8 = W4.r.c(getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f12478d;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            c8.f12478d.setText(getString(R.string.msg_storage_permission_required));
            c8.f12479e.setTypeface(aVar.t());
            c8.f12479e.setOnClickListener(new View.OnClickListener() { // from class: D4.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2683a.h2(AbstractActivityC2683a.this, view);
                }
            });
            c8.f12477c.setTypeface(aVar.t());
            c8.f12477c.setText(getString(R.string.exit));
            c8.f12477c.setOnClickListener(new View.OnClickListener() { // from class: D4.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2683a.i2(AbstractActivityC2683a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            this.f30180z = builder.create();
            if (!isFinishing() && (alertDialog = this.f30180z) != null) {
                AbstractC3255y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog3 = this.f30180z;
                AbstractC3255y.f(alertDialog3);
                alertDialog3.show();
            }
        }
    }

    public final void j2(C1641h appInfo, final Function0 action, final Function0 cancelAction) {
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(action, "action");
        AbstractC3255y.i(cancelAction, "cancelAction");
        AlertDialog alertDialog = this.f30180z;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C1499x c8 = C1499x.c(getLayoutInflater());
        AbstractC3255y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f12618e;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        c8.f12617d.setTypeface(aVar.u());
        c8.f12615b.setOnClickListener(new View.OnClickListener() { // from class: D4.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC2683a.k2(AbstractActivityC2683a.this, cancelAction, view);
            }
        });
        if (appInfo.o1()) {
            c8.f12617d.setText(appInfo.Y());
            c8.f12616c.setText(getString(R.string.leave_anyways));
        } else {
            c8.f12616c.setText(getString(R.string.download_anyways));
        }
        c8.f12616c.setTypeface(aVar.t());
        c8.f12616c.setOnClickListener(new View.OnClickListener() { // from class: D4.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC2683a.l2(Function0.this, this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: D4.B
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AbstractActivityC2683a.m2(Function0.this, dialogInterface);
            }
        });
        this.f30180z = builder.create();
        T2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.UptodownApp");
        this.f30177w = (UptodownApp) application;
        this.f30178x = new C3678r(this);
        C3655A c3655a = C3655A.f36474a;
        c3655a.d().add(this);
        if (c3655a.d().size() == 1) {
            AbstractC3364k.d(N.a(C3347b0.b()), null, null, new o(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C3655A.f36474a.d().remove(this);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f30179y = false;
        UptodownApp uptodownApp = this.f30177w;
        AbstractC3255y.f(uptodownApp);
        uptodownApp.m1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f30179y = true;
        UptodownApp uptodownApp = this.f30177w;
        AbstractC3255y.f(uptodownApp);
        uptodownApp.n1();
        B2();
        y2();
    }

    public final boolean q2() {
        return this.f30179y;
    }

    public final AlertDialog r2() {
        return this.f30180z;
    }

    public final boolean s2() {
        return this.f30172H;
    }

    public final C3678r t2() {
        return this.f30178x;
    }

    public final ArrayList u2() {
        return this.f30176L;
    }

    public final void v2() {
        RecyclerView recyclerView = this.f30165A;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    public final void w2() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_floating_queue);
        if (UptodownApp.f29058B.S()) {
            relativeLayout.removeAllViews();
            relativeLayout.setVisibility(8);
            return;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_floating_notifications);
        this.f30168D = recyclerView;
        if (recyclerView != null) {
            AbstractC3255y.f(recyclerView);
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView2 = this.f30168D;
            AbstractC3255y.f(recyclerView2);
            recyclerView2.addItemDecoration(new q5.o((int) getResources().getDimension(R.dimen.margin_m)));
            this.f30169E = new C1196f(this, this.f30170F);
            RecyclerView recyclerView3 = this.f30168D;
            AbstractC3255y.f(recyclerView3);
            recyclerView3.setAdapter(this.f30169E);
        }
        if (this.f30165A == null) {
            RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.rv_floating_queue);
            this.f30165A = recyclerView4;
            if (recyclerView4 != null) {
                AbstractC3255y.f(recyclerView4);
                recyclerView4.setLayoutManager(new WrapContentLinearLayoutManager(this, 0, false));
                RecyclerView recyclerView5 = this.f30165A;
                AbstractC3255y.f(recyclerView5);
                recyclerView5.addItemDecoration(new q5.p((int) getResources().getDimension(R.dimen.margin_m)));
                RecyclerView recyclerView6 = this.f30165A;
                AbstractC3255y.f(recyclerView6);
                recyclerView6.setItemAnimator(null);
                this.f30166B = new C1198h(this, this.f30167C);
                RecyclerView recyclerView7 = this.f30165A;
                AbstractC3255y.f(recyclerView7);
                recyclerView7.setAdapter(this.f30166B);
            }
        }
        RecyclerView recyclerView8 = (RecyclerView) findViewById(R.id.rv_preregister_notifications);
        this.f30173I = recyclerView8;
        if (recyclerView8 != null) {
            AbstractC3255y.f(recyclerView8);
            recyclerView8.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView9 = this.f30173I;
            AbstractC3255y.f(recyclerView9);
            recyclerView9.addItemDecoration(new q5.o((int) getResources().getDimension(R.dimen.margin_m)));
            this.f30174J = new G4.z(this, this.f30175K);
            RecyclerView recyclerView10 = this.f30173I;
            AbstractC3255y.f(recyclerView10);
            recyclerView10.setAdapter(this.f30174J);
            U1();
        }
    }

    public final boolean x2() {
        AlertDialog alertDialog = this.f30180z;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return false;
        }
        return true;
    }

    public final void y2() {
        AbstractC3364k.d(N.a(C3347b0.a()), null, null, new k(5000L, this, 5, null), 3, null);
    }

    public final void z2(File item, String str) {
        String str2;
        AbstractC3255y.i(item, "item");
        boolean x8 = new C3667g().x(this);
        Q e8 = Q.f14058k.e(this);
        C3674n a8 = C3674n.f36505t.a(this);
        a8.a();
        String name = item.getName();
        AbstractC3255y.h(name, "item.name");
        C1648o Y7 = a8.Y(name);
        a8.l();
        if (e8 != null && e8.y()) {
            if (Y7 != null) {
                str2 = Y7.w();
            } else {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                new V4.m(this, null, Q4.d.f9161a.e(item.getAbsolutePath()), new l(item, str, x8), LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
        }
        new H4.i(this).c(item, str, x8);
    }
}
