package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class h2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f1018a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1019b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1020c;

    /* renamed from: d, reason: collision with root package name */
    final View f1021d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f1022e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f1023f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1024g;

    /* renamed from: h, reason: collision with root package name */
    private int f1025h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f1026i = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = h2.this.f1021d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h2.this.e();
        }
    }

    public h2(View view) {
        this.f1021d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1018a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1019b = tapTimeout;
        this.f1020c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1023f;
        if (runnable != null) {
            this.f1021d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1022e;
        if (runnable2 != null) {
            this.f1021d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        d2 d2Var;
        View view = this.f1021d;
        androidx.appcompat.view.menu.p b6 = b();
        if (b6 == null || !b6.b() || (d2Var = (d2) b6.k()) == null || !d2Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(d2Var, obtainNoHistory);
        boolean e6 = d2Var.e(obtainNoHistory, this.f1025h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e6 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1021d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1025h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1018a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1025h = r6
            java.lang.Runnable r6 = r5.f1022e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.h2$a r6 = new androidx.appcompat.widget.h2$a
            r6.<init>()
            r5.f1022e = r6
        L52:
            java.lang.Runnable r6 = r5.f1022e
            int r1 = r5.f1019b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1023f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.h2$b r6 = new androidx.appcompat.widget.h2$b
            r6.<init>()
            r5.f1023f = r6
        L65:
            java.lang.Runnable r6 = r5.f1023f
            int r1 = r5.f1020c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h2.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f6, float f7, float f8) {
        float f9 = -f8;
        return f6 >= f9 && f7 >= f9 && f6 < ((float) (view.getRight() - view.getLeft())) + f8 && f7 < ((float) (view.getBottom() - view.getTop())) + f8;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1026i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1026i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected abstract boolean c();

    protected boolean d() {
        androidx.appcompat.view.menu.p b6 = b();
        if (b6 == null || !b6.b()) {
            return true;
        }
        b6.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1021d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1024g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5;
        boolean z6 = this.f1024g;
        if (z6) {
            z5 = f(motionEvent) || !d();
        } else {
            z5 = g(motionEvent) && c();
            if (z5) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1021d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1024g = z5;
        return z5 || z6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1024g = false;
        this.f1025h = -1;
        Runnable runnable = this.f1022e;
        if (runnable != null) {
            this.f1021d.removeCallbacks(runnable);
        }
    }
}
