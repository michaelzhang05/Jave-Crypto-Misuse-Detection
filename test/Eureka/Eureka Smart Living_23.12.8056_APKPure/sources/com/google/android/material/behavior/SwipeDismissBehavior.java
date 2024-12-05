package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.j0;
import androidx.core.view.b1;
import y.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    y.c f4699a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4700b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4701c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4703e;

    /* renamed from: d, reason: collision with root package name */
    private float f4702d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f4704f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f4705g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f4706h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f4707i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final c.AbstractC0151c f4708j = new a();

    /* loaded from: classes.dex */
    class a extends c.AbstractC0151c {

        /* renamed from: a, reason: collision with root package name */
        private int f4709a;

        /* renamed from: b, reason: collision with root package name */
        private int f4710b = -1;

        a() {
        }

        private boolean n(View view, float f6) {
            if (f6 == 0.0f) {
                return Math.abs(view.getLeft() - this.f4709a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f4705g);
            }
            boolean z5 = b1.E(view) == 1;
            int i6 = SwipeDismissBehavior.this.f4704f;
            if (i6 == 2) {
                return true;
            }
            if (i6 == 0) {
                if (z5) {
                    if (f6 >= 0.0f) {
                        return false;
                    }
                } else if (f6 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i6 != 1) {
                return false;
            }
            if (z5) {
                if (f6 <= 0.0f) {
                    return false;
                }
            } else if (f6 >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        
            r5 = r2.f4709a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            if (r5 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        
            if (r5 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        
            r5 = r2.f4709a - r3.getWidth();
            r3 = r2.f4709a;
         */
        @Override // y.c.AbstractC0151c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.b1.E(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f4704f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f4709a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f4709a
                goto L37
            L1c:
                int r5 = r2.f4709a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f4709a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f4709a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.H(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // y.c.AbstractC0151c
        public int b(View view, int i6, int i7) {
            return view.getTop();
        }

        @Override // y.c.AbstractC0151c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // y.c.AbstractC0151c
        public void i(View view, int i6) {
            this.f4710b = i6;
            this.f4709a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f4701c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f4701c = false;
            }
        }

        @Override // y.c.AbstractC0151c
        public void j(int i6) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // y.c.AbstractC0151c
        public void k(View view, int i6, int i7, int i8, int i9) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f4706h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f4707i;
            float abs = Math.abs(i6 - this.f4709a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, abs), 1.0f));
            }
        }

        @Override // y.c.AbstractC0151c
        public void l(View view, float f6, float f7) {
            int i6;
            boolean z5;
            this.f4710b = -1;
            int width = view.getWidth();
            if (n(view, f6)) {
                if (f6 >= 0.0f) {
                    int left = view.getLeft();
                    int i7 = this.f4709a;
                    if (left >= i7) {
                        i6 = i7 + width;
                        z5 = true;
                    }
                }
                i6 = this.f4709a - width;
                z5 = true;
            } else {
                i6 = this.f4709a;
                z5 = false;
            }
            if (SwipeDismissBehavior.this.f4699a.F(i6, view.getTop())) {
                b1.i0(view, new c(view, z5));
            } else if (z5) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // y.c.AbstractC0151c
        public boolean m(View view, int i6) {
            int i7 = this.f4710b;
            return (i7 == -1 || i7 == i6) && SwipeDismissBehavior.this.F(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements j0 {
        b() {
        }

        @Override // androidx.core.view.accessibility.j0
        public boolean a(View view, j0.a aVar) {
            boolean z5 = false;
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z6 = b1.E(view) == 1;
            int i6 = SwipeDismissBehavior.this.f4704f;
            if ((i6 == 0 && z6) || (i6 == 1 && !z6)) {
                z5 = true;
            }
            int width = view.getWidth();
            if (z5) {
                width = -width;
            }
            b1.a0(view, width);
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f4713a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f4714b;

        c(View view, boolean z5) {
            this.f4713a = view;
            this.f4714b = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.c cVar = SwipeDismissBehavior.this.f4699a;
            if (cVar != null && cVar.k(true)) {
                b1.i0(this.f4713a, this);
            } else if (this.f4714b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float G(float f6, float f7, float f8) {
        return Math.min(Math.max(f6, f7), f8);
    }

    static int H(int i6, int i7, int i8) {
        return Math.min(Math.max(i6, i7), i8);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f4699a == null) {
            this.f4699a = this.f4703e ? y.c.l(viewGroup, this.f4702d, this.f4708j) : y.c.m(viewGroup, this.f4708j);
        }
    }

    static float J(float f6, float f7, float f8) {
        return (f8 - f6) / (f7 - f6);
    }

    private void N(View view) {
        b1.k0(view, 1048576);
        if (F(view)) {
            b1.m0(view, g0.a.f2300y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f4699a == null) {
            return false;
        }
        if (this.f4701c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f4699a.z(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f6) {
        this.f4707i = G(0.0f, f6, 1.0f);
    }

    public void L(float f6) {
        this.f4706h = G(0.0f, f6, 1.0f);
    }

    public void M(int i6) {
        this.f4704f = i6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z5 = this.f4700b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z5 = coordinatorLayout.A(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4700b = z5;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4700b = false;
        }
        if (!z5) {
            return false;
        }
        I(coordinatorLayout);
        return !this.f4701c && this.f4699a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
        boolean l6 = super.l(coordinatorLayout, view, i6);
        if (b1.C(view) == 0) {
            b1.A0(view, 1);
            N(view);
        }
        return l6;
    }
}
