package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.d1;
import androidx.core.app.e1;
import androidx.core.app.f1;
import androidx.core.view.a0;
import androidx.core.view.b0;
import androidx.core.view.q0;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import c.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends androidx.core.app.p implements j0, androidx.lifecycle.g, i0.d, s, androidx.activity.result.d, androidx.core.content.h, androidx.core.content.i, d1, e1, a0, l {

    /* renamed from: c, reason: collision with root package name */
    final b.a f81c = new b.a();

    /* renamed from: d, reason: collision with root package name */
    private final b0 f82d = new b0(new Runnable() { // from class: androidx.activity.b
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.I();
        }
    });

    /* renamed from: e, reason: collision with root package name */
    private final androidx.lifecycle.n f83e = new androidx.lifecycle.n(this);

    /* renamed from: f, reason: collision with root package name */
    final i0.c f84f;

    /* renamed from: g, reason: collision with root package name */
    private i0 f85g;

    /* renamed from: h, reason: collision with root package name */
    private f0.b f86h;

    /* renamed from: i, reason: collision with root package name */
    private final OnBackPressedDispatcher f87i;

    /* renamed from: j, reason: collision with root package name */
    private final f f88j;

    /* renamed from: k, reason: collision with root package name */
    final k f89k;

    /* renamed from: l, reason: collision with root package name */
    private int f90l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicInteger f91m;

    /* renamed from: n, reason: collision with root package name */
    private final ActivityResultRegistry f92n;

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f93o;

    /* renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList f94p;

    /* renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList f95q;

    /* renamed from: r, reason: collision with root package name */
    private final CopyOnWriteArrayList f96r;

    /* renamed from: s, reason: collision with root package name */
    private final CopyOnWriteArrayList f97s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f98t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f99u;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e6) {
                if (!TextUtils.equals(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e6;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f105a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C0067a f106b;

            a(int i6, a.C0067a c0067a) {
                this.f105a = i6;
                this.f106b = c0067a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f105a, this.f106b.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0006b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f108a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f109b;

            RunnableC0006b(int i6, IntentSender.SendIntentException sendIntentException) {
                this.f108a = i6;
                this.f109b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f108a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f109b));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i6, c.a aVar, Object obj, androidx.core.app.h hVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0067a b6 = aVar.b(componentActivity, obj);
            if (b6 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i6, b6));
                return;
            }
            Intent a6 = aVar.a(componentActivity, obj);
            if (a6.getExtras() != null && a6.getExtras().getClassLoader() == null) {
                a6.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a6.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a6.getAction())) {
                String[] stringArrayExtra = a6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.p(componentActivity, stringArrayExtra, i6);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a6.getAction())) {
                androidx.core.app.b.r(componentActivity, a6, i6, bundle);
                return;
            }
            androidx.activity.result.e eVar = (androidx.activity.result.e) a6.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.b.s(componentActivity, eVar.d(), i6, eVar.a(), eVar.b(), eVar.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e6) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0006b(i6, e6));
            }
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        Object f111a;

        /* renamed from: b, reason: collision with root package name */
        i0 f112b;

        e() {
        }
    }

    /* loaded from: classes.dex */
    private interface f extends Executor {
        void a(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b, reason: collision with root package name */
        Runnable f114b;

        /* renamed from: a, reason: collision with root package name */
        final long f113a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c, reason: collision with root package name */
        boolean f115c = false;

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            Runnable runnable = this.f114b;
            if (runnable != null) {
                runnable.run();
                this.f114b = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void a(View view) {
            if (this.f115c) {
                return;
            }
            this.f115c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f114b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f115c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.g.this.c();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f114b;
            if (runnable != null) {
                runnable.run();
                this.f114b = null;
                if (!ComponentActivity.this.f89k.c()) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f113a) {
                return;
            }
            this.f115c = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        i0.c a6 = i0.c.a(this);
        this.f84f = a6;
        this.f87i = new OnBackPressedDispatcher(new a());
        f F = F();
        this.f88j = F;
        this.f89k = new k(F, new e5.a() { // from class: androidx.activity.c
            @Override // e5.a
            public final Object a() {
                z4.k J;
                J = ComponentActivity.this.J();
                return J;
            }
        });
        this.f91m = new AtomicInteger();
        this.f92n = new b();
        this.f93o = new CopyOnWriteArrayList();
        this.f94p = new CopyOnWriteArrayList();
        this.f95q = new CopyOnWriteArrayList();
        this.f96r = new CopyOnWriteArrayList();
        this.f97s = new CopyOnWriteArrayList();
        this.f98t = false;
        this.f99u = false;
        if (r() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i6 = Build.VERSION.SDK_INT;
        r().a(new androidx.lifecycle.k() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.k
            public void d(androidx.lifecycle.m mVar, h.a aVar) {
                if (aVar == h.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        c.a(peekDecorView);
                    }
                }
            }
        });
        r().a(new androidx.lifecycle.k() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.k
            public void d(androidx.lifecycle.m mVar, h.a aVar) {
                if (aVar == h.a.ON_DESTROY) {
                    ComponentActivity.this.f81c.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.n().a();
                }
            }
        });
        r().a(new androidx.lifecycle.k() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.k
            public void d(androidx.lifecycle.m mVar, h.a aVar) {
                ComponentActivity.this.G();
                ComponentActivity.this.r().c(this);
            }
        });
        a6.c();
        z.c(this);
        if (i6 <= 23) {
            r().a(new ImmLeaksCleaner(this));
        }
        d().h("android:support:activity-result", new a.c() { // from class: androidx.activity.d
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle K;
                K = ComponentActivity.this.K();
                return K;
            }
        });
        D(new b.b() { // from class: androidx.activity.e
            @Override // b.b
            public final void a(Context context) {
                ComponentActivity.this.L(context);
            }
        });
    }

    private f F() {
        return new g();
    }

    private void H() {
        k0.a(getWindow().getDecorView(), this);
        l0.a(getWindow().getDecorView(), this);
        i0.e.a(getWindow().getDecorView(), this);
        v.a(getWindow().getDecorView(), this);
        u.a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ z4.k J() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle K() {
        Bundle bundle = new Bundle();
        this.f92n.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Context context) {
        Bundle b6 = d().b("android:support:activity-result");
        if (b6 != null) {
            this.f92n.g(b6);
        }
    }

    public final void D(b.b bVar) {
        this.f81c.a(bVar);
    }

    public final void E(androidx.core.util.a aVar) {
        this.f95q.add(aVar);
    }

    void G() {
        if (this.f85g == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f85g = eVar.f112b;
            }
            if (this.f85g == null) {
                this.f85g = new i0();
            }
        }
    }

    public void I() {
        invalidateOptionsMenu();
    }

    public Object M() {
        return null;
    }

    public final androidx.activity.result.c N(c.a aVar, androidx.activity.result.b bVar) {
        return O(aVar, this.f92n, bVar);
    }

    public final androidx.activity.result.c O(c.a aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return activityResultRegistry.i("activity_rq#" + this.f91m.getAndIncrement(), this, aVar, bVar);
    }

    @Override // androidx.lifecycle.g
    public f0.a a() {
        f0.d dVar = new f0.d();
        if (getApplication() != null) {
            dVar.c(f0.a.f3077g, getApplication());
        }
        dVar.c(z.f3134a, this);
        dVar.c(z.f3135b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.c(z.f3136c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.activity.s
    public final OnBackPressedDispatcher c() {
        return this.f87i;
    }

    @Override // i0.d
    public final androidx.savedstate.a d() {
        return this.f84f.b();
    }

    @Override // androidx.core.app.e1
    public final void e(androidx.core.util.a aVar) {
        this.f97s.add(aVar);
    }

    @Override // androidx.core.view.a0
    public void f(q0 q0Var) {
        this.f82d.f(q0Var);
    }

    @Override // androidx.core.view.a0
    public void g(q0 q0Var) {
        this.f82d.a(q0Var);
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry h() {
        return this.f92n;
    }

    @Override // androidx.core.app.d1
    public final void j(androidx.core.util.a aVar) {
        this.f96r.add(aVar);
    }

    @Override // androidx.core.content.h
    public final void l(androidx.core.util.a aVar) {
        this.f93o.add(aVar);
    }

    @Override // androidx.lifecycle.j0
    public i0 n() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        G();
        return this.f85g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onActivityResult(int i6, int i7, Intent intent) {
        if (this.f92n.b(i6, i7, intent)) {
            return;
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f87i.e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f93o.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f84f.d(bundle);
        this.f81c.c(this);
        super.onCreate(bundle);
        w.e(this);
        if (androidx.core.os.b.c()) {
            this.f87i.f(d.a(this));
        }
        int i6 = this.f90l;
        if (i6 != 0) {
            setContentView(i6);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, Menu menu) {
        if (i6 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i6, menu);
        this.f82d.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 0) {
            return this.f82d.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5) {
        if (this.f98t) {
            return;
        }
        Iterator it = this.f96r.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(new androidx.core.app.q(z5));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f95q.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        this.f82d.c(menu);
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5) {
        if (this.f99u) {
            return;
        }
        Iterator it = this.f97s.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(new f1(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i6, View view, Menu menu) {
        if (i6 != 0) {
            return true;
        }
        super.onPreparePanel(i6, view, menu);
        this.f82d.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        if (this.f92n.b(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object M = M();
        i0 i0Var = this.f85g;
        if (i0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            i0Var = eVar.f112b;
        }
        if (i0Var == null && M == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f111a = M;
        eVar2.f112b = i0Var;
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.p, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.h r5 = r();
        if (r5 instanceof androidx.lifecycle.n) {
            ((androidx.lifecycle.n) r5).n(h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f84f.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator it = this.f94p.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(Integer.valueOf(i6));
        }
    }

    @Override // androidx.core.app.d1
    public final void p(androidx.core.util.a aVar) {
        this.f96r.remove(aVar);
    }

    @Override // androidx.core.app.e1
    public final void q(androidx.core.util.a aVar) {
        this.f97s.remove(aVar);
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.h r() {
        return this.f83e;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (l0.b.d()) {
                l0.b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f89k.b();
        } finally {
            l0.b.b();
        }
    }

    @Override // androidx.core.content.i
    public final void s(androidx.core.util.a aVar) {
        this.f94p.remove(aVar);
    }

    @Override // android.app.Activity
    public abstract void setContentView(int i6);

    @Override // android.app.Activity
    public void setContentView(View view) {
        H();
        this.f88j.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i6) {
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9) {
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9);
    }

    @Override // androidx.core.content.i
    public final void u(androidx.core.util.a aVar) {
        this.f94p.add(aVar);
    }

    @Override // androidx.core.content.h
    public final void v(androidx.core.util.a aVar) {
        this.f93o.remove(aVar);
    }

    @Override // androidx.lifecycle.g
    public f0.b w() {
        if (this.f86h == null) {
            this.f86h = new c0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f86h;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        this.f98t = true;
        try {
            super.onMultiWindowModeChanged(z5, configuration);
            this.f98t = false;
            Iterator it = this.f96r.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new androidx.core.app.q(z5, configuration));
            }
        } catch (Throwable th) {
            this.f98t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        this.f99u = true;
        try {
            super.onPictureInPictureModeChanged(z5, configuration);
            this.f99u = false;
            Iterator it = this.f97s.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new f1(z5, configuration));
            }
        } catch (Throwable th) {
            this.f99u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
    }
}
