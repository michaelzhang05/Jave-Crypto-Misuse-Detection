package com.bumptech.glide.p.l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class j<T extends View, Z> extends com.bumptech.glide.p.l.a<Z> {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f8928f;

    /* renamed from: g, reason: collision with root package name */
    private static Integer f8929g;

    /* renamed from: h, reason: collision with root package name */
    protected final T f8930h;

    /* renamed from: i, reason: collision with root package name */
    private final a f8931i;

    /* renamed from: j, reason: collision with root package name */
    private View.OnAttachStateChangeListener f8932j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8933k;
    private boolean l;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    static final class a {
        static Integer a;

        /* renamed from: b, reason: collision with root package name */
        private final View f8934b;

        /* renamed from: c, reason: collision with root package name */
        private final List<h> f8935c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        boolean f8936d;

        /* renamed from: e, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0123a f8937e;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ViewTarget.java */
        /* renamed from: com.bumptech.glide.p.l.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC0123a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: f, reason: collision with root package name */
            private final WeakReference<a> f8938f;

            ViewTreeObserverOnPreDrawListenerC0123a(a aVar) {
                this.f8938f = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f8938f.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f8934b = view;
        }

        private static int c(Context context) {
            if (a == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.r.j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return a.intValue();
        }

        private int e(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            if (this.f8936d && this.f8934b.isLayoutRequested()) {
                return 0;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.f8934b.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f8934b.getContext());
        }

        private int f() {
            int paddingTop = this.f8934b.getPaddingTop() + this.f8934b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f8934b.getLayoutParams();
            return e(this.f8934b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f8934b.getPaddingLeft() + this.f8934b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f8934b.getLayoutParams();
            return e(this.f8934b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i2) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }

        private boolean i(int i2, int i3) {
            return h(i2) && h(i3);
        }

        private void j(int i2, int i3) {
            Iterator it = new ArrayList(this.f8935c).iterator();
            while (it.hasNext()) {
                ((h) it.next()).g(i2, i3);
            }
        }

        void a() {
            if (this.f8935c.isEmpty()) {
                return;
            }
            int g2 = g();
            int f2 = f();
            if (i(g2, f2)) {
                j(g2, f2);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f8934b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f8937e);
            }
            this.f8937e = null;
            this.f8935c.clear();
        }

        void d(h hVar) {
            int g2 = g();
            int f2 = f();
            if (i(g2, f2)) {
                hVar.g(g2, f2);
                return;
            }
            if (!this.f8935c.contains(hVar)) {
                this.f8935c.add(hVar);
            }
            if (this.f8937e == null) {
                ViewTreeObserver viewTreeObserver = this.f8934b.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0123a viewTreeObserverOnPreDrawListenerC0123a = new ViewTreeObserverOnPreDrawListenerC0123a(this);
                this.f8937e = viewTreeObserverOnPreDrawListenerC0123a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0123a);
            }
        }

        void k(h hVar) {
            this.f8935c.remove(hVar);
        }
    }

    public j(T t) {
        this.f8930h = (T) com.bumptech.glide.r.j.d(t);
        this.f8931i = new a(t);
    }

    private Object c() {
        Integer num = f8929g;
        if (num == null) {
            return this.f8930h.getTag();
        }
        return this.f8930h.getTag(num.intValue());
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8932j;
        if (onAttachStateChangeListener == null || this.l) {
            return;
        }
        this.f8930h.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.l = true;
    }

    private void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f8932j;
        if (onAttachStateChangeListener == null || !this.l) {
            return;
        }
        this.f8930h.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.l = false;
    }

    private void f(Object obj) {
        Integer num = f8929g;
        if (num == null) {
            f8928f = true;
            this.f8930h.setTag(obj);
        } else {
            this.f8930h.setTag(num.intValue(), obj);
        }
    }

    @Override // com.bumptech.glide.p.l.a, com.bumptech.glide.p.l.i
    public com.bumptech.glide.p.d getRequest() {
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        if (c2 instanceof com.bumptech.glide.p.d) {
            return (com.bumptech.glide.p.d) c2;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.p.l.i
    public void getSize(h hVar) {
        this.f8931i.d(hVar);
    }

    @Override // com.bumptech.glide.p.l.a, com.bumptech.glide.p.l.i
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f8931i.b();
        if (this.f8933k) {
            return;
        }
        e();
    }

    @Override // com.bumptech.glide.p.l.a, com.bumptech.glide.p.l.i
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        d();
    }

    @Override // com.bumptech.glide.p.l.i
    public void removeCallback(h hVar) {
        this.f8931i.k(hVar);
    }

    @Override // com.bumptech.glide.p.l.a, com.bumptech.glide.p.l.i
    public void setRequest(com.bumptech.glide.p.d dVar) {
        f(dVar);
    }

    public String toString() {
        return "Target for: " + this.f8930h;
    }
}
