package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.d0.c;
import androidx.core.view.d0.f;
import androidx.core.view.u;
import c.j.a.c;
import cm.aptoide.pt.file.CacheHelper;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    c.j.a.c a;

    /* renamed from: b, reason: collision with root package name */
    c f16415b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16416c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16418e;

    /* renamed from: d, reason: collision with root package name */
    private float f16417d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f16419f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f16420g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f16421h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f16422i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final c.AbstractC0065c f16423j = new a();

    /* loaded from: classes2.dex */
    class a extends c.AbstractC0065c {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f16424b = -1;

        a() {
        }

        private boolean n(View view, float f2) {
            if (f2 == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f16420g);
            }
            boolean z = u.y(view) == 1;
            int i2 = SwipeDismissBehavior.this.f16419f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (f2 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            if (z) {
                if (f2 <= 0.0f) {
                    return false;
                }
            } else if (f2 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // c.j.a.c.AbstractC0065c
        public int a(View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            boolean z = u.y(view) == 1;
            int i4 = SwipeDismissBehavior.this.f16419f;
            if (i4 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.G(width, i2, width2);
        }

        @Override // c.j.a.c.AbstractC0065c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // c.j.a.c.AbstractC0065c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // c.j.a.c.AbstractC0065c
        public void i(View view, int i2) {
            this.f16424b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // c.j.a.c.AbstractC0065c
        public void j(int i2) {
            c cVar = SwipeDismissBehavior.this.f16415b;
            if (cVar != null) {
                cVar.b(i2);
            }
        }

        @Override // c.j.a.c.AbstractC0065c
        public void k(View view, int i2, int i3, int i4, int i5) {
            float width = this.a + (view.getWidth() * SwipeDismissBehavior.this.f16421h);
            float width2 = this.a + (view.getWidth() * SwipeDismissBehavior.this.f16422i);
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f2), 1.0f));
            }
        }

        @Override // c.j.a.c.AbstractC0065c
        public void l(View view, float f2, float f3) {
            int i2;
            boolean z;
            c cVar;
            this.f16424b = -1;
            int width = view.getWidth();
            if (n(view, f2)) {
                int left = view.getLeft();
                int i3 = this.a;
                i2 = left < i3 ? i3 - width : i3 + width;
                z = true;
            } else {
                i2 = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.F(i2, view.getTop())) {
                u.a0(view, new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.f16415b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // c.j.a.c.AbstractC0065c
        public boolean m(View view, int i2) {
            int i3 = this.f16424b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.E(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements f {
        b() {
        }

        @Override // androidx.core.view.d0.f
        public boolean a(View view, f.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z2 = u.y(view) == 1;
            int i2 = SwipeDismissBehavior.this.f16419f;
            if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            u.T(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f16415b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(View view);

        void b(int i2);
    }

    /* loaded from: classes2.dex */
    private class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final View f16426f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f16427g;

        d(View view, boolean z) {
            this.f16426f = view;
            this.f16427g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            c.j.a.c cVar2 = SwipeDismissBehavior.this.a;
            if (cVar2 != null && cVar2.k(true)) {
                u.a0(this.f16426f, this);
            } else {
                if (!this.f16427g || (cVar = SwipeDismissBehavior.this.f16415b) == null) {
                    return;
                }
                cVar.a(this.f16426f);
            }
        }
    }

    static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int G(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void H(ViewGroup viewGroup) {
        c.j.a.c m;
        if (this.a == null) {
            if (this.f16418e) {
                m = c.j.a.c.l(viewGroup, this.f16417d, this.f16423j);
            } else {
                m = c.j.a.c.m(viewGroup, this.f16423j);
            }
            this.a = m;
        }
    }

    static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    private void N(View view) {
        u.c0(view, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        if (E(view)) {
            u.e0(view, c.a.u, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        c.j.a.c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f2) {
        this.f16422i = F(0.0f, f2, 1.0f);
    }

    public void K(c cVar) {
        this.f16415b = cVar;
    }

    public void L(float f2) {
        this.f16421h = F(0.0f, f2, 1.0f);
    }

    public void M(int i2) {
        this.f16419f = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f16416c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f16416c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16416c = false;
        }
        if (!z) {
            return false;
        }
        H(coordinatorLayout);
        return this.a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean l = super.l(coordinatorLayout, v, i2);
        if (u.w(v) == 0) {
            u.t0(v, 1);
            N(v);
        }
        return l;
    }
}
