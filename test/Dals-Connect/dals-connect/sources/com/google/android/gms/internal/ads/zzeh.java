package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzeh implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: f, reason: collision with root package name */
    private static final Handler f15029f = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private final Context f15030g;

    /* renamed from: h, reason: collision with root package name */
    private Application f15031h;

    /* renamed from: i, reason: collision with root package name */
    private final PowerManager f15032i;

    /* renamed from: j, reason: collision with root package name */
    private final KeyguardManager f15033j;

    /* renamed from: k, reason: collision with root package name */
    private final zzdy f15034k;
    private BroadcastReceiver l;
    private WeakReference<ViewTreeObserver> m;
    private WeakReference<View> n;
    private st o;
    private byte p = -1;
    private int q = -1;
    private long r = -3;

    public zzeh(zzdy zzdyVar, View view) {
        this.f15034k = zzdyVar;
        Context context = zzdyVar.f15005b;
        this.f15030g = context;
        this.f15032i = (PowerManager) context.getSystemService("power");
        this.f15033j = (KeyguardManager) context.getSystemService("keyguard");
        if (context instanceof Application) {
            this.f15031h = (Application) context;
            this.o = new st((Application) context, this);
        }
        f(view);
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.n == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.n.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.q = i2;
    }

    private final void c() {
        f15029f.post(new sy(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r7 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.n
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L15
            r9.r = r2
            r9.p = r1
            return
        L15:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L29
            r4 = r4 | 2
            byte r4 = (byte) r4
        L29:
            android.os.PowerManager r7 = r9.f15032i
            if (r7 == 0) goto L36
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L36
            r4 = r4 | 4
            byte r4 = (byte) r4
        L36:
            com.google.android.gms.internal.ads.zzdy r7 = r9.f15034k
            boolean r7 = r7.y()
            if (r7 != 0) goto L6a
            android.app.KeyguardManager r7 = r9.f15033j
            if (r7 == 0) goto L69
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L69
            android.app.Activity r7 = com.google.android.gms.internal.ads.zzef.g(r0)
            if (r7 == 0) goto L65
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L56
            r7 = 0
            goto L5a
        L56:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L5a:
            if (r7 == 0) goto L65
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L65
            r7 = 1
            goto L66
        L65:
            r7 = 0
        L66:
            if (r7 == 0) goto L69
            goto L6a
        L69:
            r5 = 0
        L6a:
            if (r5 != 0) goto L6f
            r4 = r4 | 8
            byte r4 = (byte) r4
        L6f:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L7d
            r4 = r4 | 16
            byte r4 = (byte) r4
        L7d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L8b
            r4 = r4 | 32
            byte r4 = (byte) r4
        L8b:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.q
            if (r5 == r1) goto L94
            r0 = r5
        L94:
            if (r0 == 0) goto L99
            r0 = r4 | 64
            byte r4 = (byte) r0
        L99:
            byte r0 = r9.p
            if (r0 == r4) goto Lab
            r9.p = r4
            if (r4 != 0) goto La6
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto La9
        La6:
            long r0 = (long) r4
            long r0 = r2 - r0
        La9:
            r9.r = r0
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeh.e():void");
    }

    private final void g(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.m = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.l == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ty tyVar = new ty(this);
            this.l = tyVar;
            this.f15030g.registerReceiver(tyVar, intentFilter);
        }
        Application application = this.f15031h;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.o);
            } catch (Exception unused) {
            }
        }
    }

    private final void h(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.m;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.m = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.l;
        if (broadcastReceiver != null) {
            try {
                this.f15030g.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.l = null;
        }
        Application application = this.f15031h;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.o);
            } catch (Exception unused4) {
            }
        }
    }

    public final long d() {
        if (this.r <= -2 && this.n.get() == null) {
            this.r = -3L;
        }
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(View view) {
        WeakReference<View> weakReference = this.n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            h(view2);
        }
        this.n = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                g(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.r = -2L;
            return;
        }
        this.r = -3L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        e();
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.q = -1;
        g(view);
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.q = -1;
        e();
        c();
        h(view);
    }
}
