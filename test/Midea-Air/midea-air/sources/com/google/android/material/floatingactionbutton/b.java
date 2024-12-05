package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.u;
import e.e.b.b.z.n;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public class b {
    static final TimeInterpolator a = e.e.b.b.m.a.f17507c;

    /* renamed from: b, reason: collision with root package name */
    static final int[] f16631b = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f16632c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f16633d = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f16634e = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f16635f = {R.attr.state_enabled};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f16636g = new int[0];
    private int A;
    private ArrayList<Animator.AnimatorListener> C;
    private ArrayList<Animator.AnimatorListener> D;
    private ArrayList<i> E;
    final FloatingActionButton F;
    final e.e.b.b.y.b G;
    private ViewTreeObserver.OnPreDrawListener L;

    /* renamed from: h, reason: collision with root package name */
    e.e.b.b.z.k f16637h;

    /* renamed from: i, reason: collision with root package name */
    e.e.b.b.z.g f16638i;

    /* renamed from: j, reason: collision with root package name */
    Drawable f16639j;

    /* renamed from: k, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f16640k;
    Drawable l;
    boolean m;
    float o;
    float p;
    float q;
    int r;
    private final com.google.android.material.internal.f s;
    private e.e.b.b.m.h t;
    private e.e.b.b.m.h u;
    private Animator v;
    private e.e.b.b.m.h w;
    private e.e.b.b.m.h x;
    private float y;
    boolean n = true;
    private float z = 1.0f;
    private int B = 0;
    private final Rect H = new Rect();
    private final RectF I = new RectF();
    private final RectF J = new RectF();
    private final Matrix K = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f16642c;

        a(boolean z, j jVar) {
            this.f16641b = z;
            this.f16642c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            if (this.a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.F;
            boolean z = this.f16641b;
            floatingActionButton.b(z ? 8 : 4, z);
            j jVar = this.f16642c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.f16641b);
            b.this.B = 1;
            b.this.v = animator;
            this.a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0193b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f16644b;

        C0193b(boolean z, j jVar) {
            this.a = z;
            this.f16644b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            j jVar = this.f16644b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.a);
            b.this.B = 2;
            b.this.v = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class c extends e.e.b.b.m.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            b.this.z = f2;
            return super.evaluate(f2, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class d implements TypeEvaluator<Float> {
        FloatEvaluator a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f2, Float f3, Float f4) {
            float floatValue = this.a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class f extends l {
        f() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class g extends l {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.o + bVar.p;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class h extends l {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.o + bVar.q;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    interface i {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private class k extends l {
        k() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return b.this.o;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes2.dex */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private float f16653b;

        /* renamed from: c, reason: collision with root package name */
        private float f16654c;

        private l() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.g0((int) this.f16654c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                e.e.b.b.z.g gVar = b.this.f16638i;
                this.f16653b = gVar == null ? 0.0f : gVar.w();
                this.f16654c = a();
                this.a = true;
            }
            b bVar = b.this;
            float f2 = this.f16653b;
            bVar.g0((int) (f2 + ((this.f16654c - f2) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FloatingActionButton floatingActionButton, e.e.b.b.y.b bVar) {
        this.F = floatingActionButton;
        this.G = bVar;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f();
        this.s = fVar;
        fVar.a(f16631b, i(new h()));
        fVar.a(f16632c, i(new g()));
        fVar.a(f16633d, i(new g()));
        fVar.a(f16634e, i(new g()));
        fVar.a(f16635f, i(new k()));
        fVar.a(f16636g, i(new f()));
        this.y = floatingActionButton.getRotation();
    }

    private boolean a0() {
        return u.O(this.F) && !this.F.isInEditMode();
    }

    private void g(float f2, Matrix matrix) {
        matrix.reset();
        if (this.F.getDrawable() == null || this.A == 0) {
            return;
        }
        RectF rectF = this.I;
        RectF rectF2 = this.J;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.A;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.A;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    private AnimatorSet h(e.e.b.b.m.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        hVar.e("scale").a(ofFloat2);
        h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        hVar.e("scale").a(ofFloat3);
        h0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f4, this.K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.F, new e.e.b.b.m.f(), new c(), new Matrix(this.K));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        e.e.b.b.m.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private e.e.b.b.m.h l() {
        if (this.u == null) {
            this.u = e.e.b.b.m.h.c(this.F.getContext(), e.e.b.b.a.a);
        }
        return (e.e.b.b.m.h) c.h.j.j.c(this.u);
    }

    private e.e.b.b.m.h m() {
        if (this.t == null) {
            this.t = e.e.b.b.m.h.c(this.F.getContext(), e.e.b.b.a.f17418b);
        }
        return (e.e.b.b.m.h) c.h.j.j.c(this.t);
    }

    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.L == null) {
            this.L = new e();
        }
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.s.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        e.e.b.b.z.g gVar = this.f16638i;
        if (gVar != null) {
            e.e.b.b.z.h.f(this.F, gVar);
        }
        if (K()) {
            this.F.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        ViewTreeObserver viewTreeObserver = this.F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.L = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(int[] iArr) {
        this.s.d(iArr);
    }

    void F(float f2, float f3, float f4) {
        f0();
        g0(f2);
    }

    void G(Rect rect) {
        c.h.j.j.d(this.l, "Didn't initialize content background");
        if (Z()) {
            this.G.b(new InsetDrawable(this.l, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.G.b(this.l);
        }
    }

    void H() {
        float rotation = this.F.getRotation();
        if (this.y != rotation) {
            this.y = rotation;
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean K() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        e.e.b.b.z.g gVar = this.f16638i;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f16640k;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(PorterDuff.Mode mode) {
        e.e.b.b.z.g gVar = this.f16638i;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(float f2) {
        if (this.o != f2) {
            this.o = f2;
            F(f2, this.p, this.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(boolean z) {
        this.m = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P(e.e.b.b.m.h hVar) {
        this.x = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(float f2) {
        if (this.p != f2) {
            this.p = f2;
            F(this.o, f2, this.q);
        }
    }

    final void R(float f2) {
        this.z = f2;
        Matrix matrix = this.K;
        g(f2, matrix);
        this.F.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(int i2) {
        if (this.A != i2) {
            this.A = i2;
            e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i2) {
        this.r = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(float f2) {
        if (this.q != f2) {
            this.q = f2;
            F(this.o, this.p, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f16639j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, e.e.b.b.x.b.d(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(boolean z) {
        this.n = z;
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(e.e.b.b.z.k kVar) {
        this.f16637h = kVar;
        e.e.b.b.z.g gVar = this.f16638i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f16639j;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f16640k;
        if (aVar != null) {
            aVar.f(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(e.e.b.b.m.h hVar) {
        this.w = hVar;
    }

    boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b0() {
        return !this.m || this.F.getSizeDimension() >= this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(j jVar, boolean z) {
        if (z()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (a0()) {
            if (this.F.getVisibility() != 0) {
                this.F.setAlpha(0.0f);
                this.F.setScaleY(0.0f);
                this.F.setScaleX(0.0f);
                R(0.0f);
            }
            e.e.b.b.m.h hVar = this.w;
            if (hVar == null) {
                hVar = m();
            }
            AnimatorSet h2 = h(hVar, 1.0f, 1.0f, 1.0f);
            h2.addListener(new C0193b(z, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.C;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h2.addListener(it.next());
                }
            }
            h2.start();
            return;
        }
        this.F.b(0, z);
        this.F.setAlpha(1.0f);
        this.F.setScaleY(1.0f);
        this.F.setScaleX(1.0f);
        R(1.0f);
        if (jVar != null) {
            jVar.a();
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(animatorListener);
    }

    void d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.y % 90.0f != 0.0f) {
                if (this.F.getLayerType() != 1) {
                    this.F.setLayerType(1, null);
                }
            } else if (this.F.getLayerType() != 0) {
                this.F.setLayerType(0, null);
            }
        }
        e.e.b.b.z.g gVar = this.f16638i;
        if (gVar != null) {
            gVar.d0((int) this.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Animator.AnimatorListener animatorListener) {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        this.C.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e0() {
        R(this.z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(i iVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f0() {
        Rect rect = this.H;
        s(rect);
        G(rect);
        this.G.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(float f2) {
        e.e.b.b.z.g gVar = this.f16638i;
        if (gVar != null) {
            gVar.W(f2);
        }
    }

    e.e.b.b.z.g j() {
        return new e.e.b.b.z.g((e.e.b.b.z.k) c.h.j.j.c(this.f16637h));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable k() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float n() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e.e.b.b.m.h p() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float q() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(Rect rect) {
        int sizeDimension = this.m ? (this.r - this.F.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.n ? n() + this.q : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e.e.b.b.z.k u() {
        return this.f16637h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e.e.b.b.m.h v() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(j jVar, boolean z) {
        if (y()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (a0()) {
            e.e.b.b.m.h hVar = this.x;
            if (hVar == null) {
                hVar = l();
            }
            AnimatorSet h2 = h(hVar, 0.0f, 0.0f, 0.0f);
            h2.addListener(new a(z, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.D;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    h2.addListener(it.next());
                }
            }
            h2.start();
            return;
        }
        this.F.b(z ? 8 : 4, z);
        if (jVar != null) {
            jVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        e.e.b.b.z.g j2 = j();
        this.f16638i = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.f16638i.setTintMode(mode);
        }
        this.f16638i.c0(-12303292);
        this.f16638i.N(this.F.getContext());
        e.e.b.b.x.a aVar = new e.e.b.b.x.a(this.f16638i.D());
        aVar.setTintList(e.e.b.b.x.b.d(colorStateList2));
        this.f16639j = aVar;
        this.l = new LayerDrawable(new Drawable[]{(Drawable) c.h.j.j.c(this.f16638i), aVar});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y() {
        return this.F.getVisibility() == 0 ? this.B == 1 : this.B != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.F.getVisibility() != 0 ? this.B == 2 : this.B != 1;
    }
}
