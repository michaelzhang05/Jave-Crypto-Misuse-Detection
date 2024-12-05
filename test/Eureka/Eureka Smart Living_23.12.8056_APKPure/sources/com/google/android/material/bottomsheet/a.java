package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.u;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a3;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import androidx.core.view.c3;
import androidx.core.view.w0;
import c3.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m2.i;

/* loaded from: classes.dex */
public class a extends u {

    /* renamed from: f, reason: collision with root package name */
    private BottomSheetBehavior f4775f;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f4776g;

    /* renamed from: h, reason: collision with root package name */
    private CoordinatorLayout f4777h;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f4778i;

    /* renamed from: j, reason: collision with root package name */
    boolean f4779j;

    /* renamed from: k, reason: collision with root package name */
    boolean f4780k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4781l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4782m;

    /* renamed from: n, reason: collision with root package name */
    private f f4783n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4784o;

    /* renamed from: p, reason: collision with root package name */
    private BottomSheetBehavior.f f4785p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0081a implements w0 {
        C0081a() {
        }

        @Override // androidx.core.view.w0
        public c3 a(View view, c3 c3Var) {
            if (a.this.f4783n != null) {
                a.this.f4775f.x0(a.this.f4783n);
            }
            if (c3Var != null) {
                a aVar = a.this;
                aVar.f4783n = new f(aVar.f4778i, c3Var, null);
                a.this.f4783n.e(a.this.getWindow());
                a.this.f4775f.Y(a.this.f4783n);
            }
            return c3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f4780k && aVar.isShowing() && a.this.w()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            boolean z5;
            super.g(view, g0Var);
            if (a.this.f4780k) {
                g0Var.a(1048576);
                z5 = true;
            } else {
                z5 = false;
            }
            g0Var.c0(z5);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i6, Bundle bundle) {
            if (i6 == 1048576) {
                a aVar = a.this;
                if (aVar.f4780k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i6, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f6) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i6) {
            if (i6 == 5) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    private static class f extends BottomSheetBehavior.f {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f4791a;

        /* renamed from: b, reason: collision with root package name */
        private final c3 f4792b;

        /* renamed from: c, reason: collision with root package name */
        private Window f4793c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4794d;

        private f(View view, c3 c3Var) {
            Boolean bool;
            int color;
            this.f4792b = c3Var;
            g n02 = BottomSheetBehavior.k0(view).n0();
            ColorStateList v5 = n02 != null ? n02.v() : b1.u(view);
            if (v5 != null) {
                color = v5.getDefaultColor();
            } else {
                if (!(view.getBackground() instanceof ColorDrawable)) {
                    bool = null;
                    this.f4791a = bool;
                }
                color = ((ColorDrawable) view.getBackground()).getColor();
            }
            bool = Boolean.valueOf(r2.a.h(color));
            this.f4791a = bool;
        }

        private void d(View view) {
            if (view.getTop() < this.f4792b.k()) {
                Window window = this.f4793c;
                if (window != null) {
                    Boolean bool = this.f4791a;
                    com.google.android.material.internal.c.f(window, bool == null ? this.f4794d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f4792b.k() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f4793c;
                if (window2 != null) {
                    com.google.android.material.internal.c.f(window2, this.f4794d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f6) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i6) {
            d(view);
        }

        void e(Window window) {
            if (this.f4793c == window) {
                return;
            }
            this.f4793c = window;
            if (window != null) {
                this.f4794d = a3.a(window, window.getDecorView()).b();
            }
        }

        /* synthetic */ f(View view, c3 c3Var, C0081a c0081a) {
            this(view, c3Var);
        }
    }

    public a(Context context, int i6) {
        super(context, h(context, i6));
        this.f4780k = true;
        this.f4781l = true;
        this.f4785p = new e();
        j(1);
        this.f4784o = getContext().getTheme().obtainStyledAttributes(new int[]{m2.a.f7563q}).getBoolean(0, false);
    }

    private static int h(Context context, int i6) {
        if (i6 != 0) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(m2.a.f7548b, typedValue, true) ? typedValue.resourceId : i.f7685b;
    }

    private FrameLayout q() {
        if (this.f4776g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), m2.g.f7642a, null);
            this.f4776g = frameLayout;
            this.f4777h = (CoordinatorLayout) frameLayout.findViewById(m2.e.f7619e);
            FrameLayout frameLayout2 = (FrameLayout) this.f4776g.findViewById(m2.e.f7620f);
            this.f4778i = frameLayout2;
            BottomSheetBehavior k02 = BottomSheetBehavior.k0(frameLayout2);
            this.f4775f = k02;
            k02.Y(this.f4785p);
            this.f4775f.H0(this.f4780k);
        }
        return this.f4776g;
    }

    private View x(int i6, View view, ViewGroup.LayoutParams layoutParams) {
        q();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f4776g.findViewById(m2.e.f7619e);
        if (i6 != 0 && view == null) {
            view = getLayoutInflater().inflate(i6, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f4784o) {
            b1.D0(this.f4778i, new C0081a());
        }
        this.f4778i.removeAllViews();
        FrameLayout frameLayout = this.f4778i;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(m2.e.R).setOnClickListener(new b());
        b1.q0(this.f4778i, new c());
        this.f4778i.setOnTouchListener(new d());
        return this.f4776g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior s5 = s();
        if (!this.f4779j || s5.o0() == 5) {
            super.cancel();
        } else {
            s5.P0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z5 = this.f4784o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f4776g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z5);
            }
            CoordinatorLayout coordinatorLayout = this.f4777h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z5);
            }
            a3.b(window, !z5);
            f fVar = this.f4783n;
            if (fVar != null) {
                fVar.e(window);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.u, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i6 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i6 < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f4783n;
        if (fVar != null) {
            fVar.e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.i, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f4775f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.o0() != 5) {
            return;
        }
        this.f4775f.P0(4);
    }

    public BottomSheetBehavior s() {
        if (this.f4775f == null) {
            q();
        }
        return this.f4775f;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z5) {
        super.setCancelable(z5);
        if (this.f4780k != z5) {
            this.f4780k = z5;
            BottomSheetBehavior bottomSheetBehavior = this.f4775f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H0(z5);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z5) {
        super.setCanceledOnTouchOutside(z5);
        if (z5 && !this.f4780k) {
            this.f4780k = true;
        }
        this.f4781l = z5;
        this.f4782m = true;
    }

    @Override // androidx.appcompat.app.u, androidx.activity.i, android.app.Dialog
    public void setContentView(int i6) {
        super.setContentView(x(i6, null, null));
    }

    public boolean u() {
        return this.f4779j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        this.f4775f.x0(this.f4785p);
    }

    boolean w() {
        if (!this.f4782m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f4781l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f4782m = true;
        }
        return this.f4781l;
    }

    @Override // androidx.appcompat.app.u, androidx.activity.i, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(x(0, view, null));
    }

    @Override // androidx.appcompat.app.u, androidx.activity.i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(x(0, view, layoutParams));
    }
}
