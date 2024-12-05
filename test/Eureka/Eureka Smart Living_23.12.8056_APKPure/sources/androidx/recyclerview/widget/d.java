package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.b1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends RecyclerView.n implements RecyclerView.r {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.s C;

    /* renamed from: a, reason: collision with root package name */
    private final int f3526a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3527b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f3528c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f3529d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3530e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3531f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f3532g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f3533h;

    /* renamed from: i, reason: collision with root package name */
    private final int f3534i;

    /* renamed from: j, reason: collision with root package name */
    private final int f3535j;

    /* renamed from: k, reason: collision with root package name */
    int f3536k;

    /* renamed from: l, reason: collision with root package name */
    int f3537l;

    /* renamed from: m, reason: collision with root package name */
    float f3538m;

    /* renamed from: n, reason: collision with root package name */
    int f3539n;

    /* renamed from: o, reason: collision with root package name */
    int f3540o;

    /* renamed from: p, reason: collision with root package name */
    float f3541p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f3544s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f3551z;

    /* renamed from: q, reason: collision with root package name */
    private int f3542q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f3543r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3545t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3546u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f3547v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f3548w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f3549x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f3550y = new int[2];

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    /* loaded from: classes.dex */
    class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i6, int i7) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3554a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3554a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3554a) {
                this.f3554a = false;
                return;
            }
            if (((Float) d.this.f3551z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0060d implements ValueAnimator.AnimatorUpdateListener {
        C0060d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3528c.setAlpha(floatValue);
            d.this.f3529d.setAlpha(floatValue);
            d.this.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i6, int i7, int i8) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3551z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3528c = stateListDrawable;
        this.f3529d = drawable;
        this.f3532g = stateListDrawable2;
        this.f3533h = drawable2;
        this.f3530e = Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f3531f = Math.max(i6, drawable.getIntrinsicWidth());
        this.f3534i = Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.f3535j = Math.max(i6, drawable2.getIntrinsicWidth());
        this.f3526a = i7;
        this.f3527b = i8;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0060d());
        j(recyclerView);
    }

    private void C(float f6) {
        int[] p6 = p();
        float max = Math.max(p6[0], Math.min(p6[1], f6));
        if (Math.abs(this.f3537l - max) < 2.0f) {
            return;
        }
        int x5 = x(this.f3538m, max, p6, this.f3544s.computeVerticalScrollRange(), this.f3544s.computeVerticalScrollOffset(), this.f3543r);
        if (x5 != 0) {
            this.f3544s.scrollBy(0, x5);
        }
        this.f3538m = max;
    }

    private void k() {
        this.f3544s.removeCallbacks(this.B);
    }

    private void l() {
        this.f3544s.V0(this);
        this.f3544s.W0(this);
        this.f3544s.X0(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i6 = this.f3543r;
        int i7 = this.f3534i;
        int i8 = this.f3540o;
        int i9 = this.f3539n;
        this.f3532g.setBounds(0, 0, i9, i7);
        this.f3533h.setBounds(0, 0, this.f3542q, this.f3535j);
        canvas.translate(0.0f, i6 - i7);
        this.f3533h.draw(canvas);
        canvas.translate(i8 - (i9 / 2), 0.0f);
        this.f3532g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i6 = this.f3542q;
        int i7 = this.f3530e;
        int i8 = i6 - i7;
        int i9 = this.f3537l;
        int i10 = this.f3536k;
        int i11 = i9 - (i10 / 2);
        this.f3528c.setBounds(0, 0, i7, i10);
        this.f3529d.setBounds(0, 0, this.f3531f, this.f3543r);
        if (s()) {
            this.f3529d.draw(canvas);
            canvas.translate(this.f3530e, i11);
            canvas.scale(-1.0f, 1.0f);
            this.f3528c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i8 = this.f3530e;
        } else {
            canvas.translate(i8, 0.0f);
            this.f3529d.draw(canvas);
            canvas.translate(0.0f, i11);
            this.f3528c.draw(canvas);
        }
        canvas.translate(-i8, -i11);
    }

    private int[] o() {
        int[] iArr = this.f3550y;
        int i6 = this.f3527b;
        iArr[0] = i6;
        iArr[1] = this.f3542q - i6;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f3549x;
        int i6 = this.f3527b;
        iArr[0] = i6;
        iArr[1] = this.f3543r - i6;
        return iArr;
    }

    private void r(float f6) {
        int[] o6 = o();
        float max = Math.max(o6[0], Math.min(o6[1], f6));
        if (Math.abs(this.f3540o - max) < 2.0f) {
            return;
        }
        int x5 = x(this.f3541p, max, o6, this.f3544s.computeHorizontalScrollRange(), this.f3544s.computeHorizontalScrollOffset(), this.f3542q);
        if (x5 != 0) {
            this.f3544s.scrollBy(x5, 0);
        }
        this.f3541p = max;
    }

    private boolean s() {
        return b1.E(this.f3544s) == 1;
    }

    private void w(int i6) {
        k();
        this.f3544s.postDelayed(this.B, i6);
    }

    private int x(float f6, float f7, int[] iArr, int i6, int i7, int i8) {
        int i9 = iArr[1] - iArr[0];
        if (i9 == 0) {
            return 0;
        }
        int i10 = i6 - i8;
        int i11 = (int) (((f7 - f6) / i9) * i10);
        int i12 = i7 + i11;
        if (i12 >= i10 || i12 < 0) {
            return 0;
        }
        return i11;
    }

    private void z() {
        this.f3544s.h(this);
        this.f3544s.j(this);
        this.f3544s.k(this.C);
    }

    public void A() {
        int i6 = this.A;
        if (i6 != 0) {
            if (i6 != 3) {
                return;
            } else {
                this.f3551z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3551z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3551z.setDuration(500L);
        this.f3551z.setStartDelay(0L);
        this.f3551z.start();
    }

    void B(int i6, int i7) {
        int computeVerticalScrollRange = this.f3544s.computeVerticalScrollRange();
        int i8 = this.f3543r;
        this.f3545t = computeVerticalScrollRange - i8 > 0 && i8 >= this.f3526a;
        int computeHorizontalScrollRange = this.f3544s.computeHorizontalScrollRange();
        int i9 = this.f3542q;
        boolean z5 = computeHorizontalScrollRange - i9 > 0 && i9 >= this.f3526a;
        this.f3546u = z5;
        boolean z6 = this.f3545t;
        if (!z6 && !z5) {
            if (this.f3547v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z6) {
            float f6 = i8;
            this.f3537l = (int) ((f6 * (i7 + (f6 / 2.0f))) / computeVerticalScrollRange);
            this.f3536k = Math.min(i8, (i8 * i8) / computeVerticalScrollRange);
        }
        if (this.f3546u) {
            float f7 = i9;
            this.f3540o = (int) ((f7 * (i6 + (f7 / 2.0f))) / computeHorizontalScrollRange);
            this.f3539n = Math.min(i9, (i9 * i9) / computeHorizontalScrollRange);
        }
        int i10 = this.f3547v;
        if (i10 == 0 || i10 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i6 = this.f3547v;
        if (i6 == 1) {
            boolean u5 = u(motionEvent.getX(), motionEvent.getY());
            boolean t5 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u5 && !t5) {
                return false;
            }
            if (t5) {
                this.f3548w = 1;
                this.f3541p = (int) motionEvent.getX();
            } else if (u5) {
                this.f3548w = 2;
                this.f3538m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i6 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3547v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean u5 = u(motionEvent.getX(), motionEvent.getY());
            boolean t5 = t(motionEvent.getX(), motionEvent.getY());
            if (u5 || t5) {
                if (t5) {
                    this.f3548w = 1;
                    this.f3541p = (int) motionEvent.getX();
                } else if (u5) {
                    this.f3548w = 2;
                    this.f3538m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3547v == 2) {
            this.f3538m = 0.0f;
            this.f3541p = 0.0f;
            y(1);
            this.f3548w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3547v == 2) {
            A();
            if (this.f3548w == 1) {
                r(motionEvent.getX());
            }
            if (this.f3548w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z5) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f3542q != this.f3544s.getWidth() || this.f3543r != this.f3544s.getHeight()) {
            this.f3542q = this.f3544s.getWidth();
            this.f3543r = this.f3544s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.f3545t) {
                n(canvas);
            }
            if (this.f3546u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3544s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f3544s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i6) {
        int i7 = this.A;
        if (i7 == 1) {
            this.f3551z.cancel();
        } else if (i7 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3551z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3551z.setDuration(i6);
        this.f3551z.start();
    }

    boolean t(float f6, float f7) {
        if (f7 >= this.f3543r - this.f3534i) {
            int i6 = this.f3540o;
            int i7 = this.f3539n;
            if (f6 >= i6 - (i7 / 2) && f6 <= i6 + (i7 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f6, float f7) {
        if (!s() ? f6 >= this.f3542q - this.f3530e : f6 <= this.f3530e / 2) {
            int i6 = this.f3537l;
            int i7 = this.f3536k;
            if (f7 >= i6 - (i7 / 2) && f7 <= i6 + (i7 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f3544s.invalidate();
    }

    void y(int i6) {
        int i7;
        if (i6 == 2 && this.f3547v != 2) {
            this.f3528c.setState(D);
            k();
        }
        if (i6 == 0) {
            v();
        } else {
            A();
        }
        if (this.f3547v != 2 || i6 == 2) {
            i7 = i6 == 1 ? 1500 : 1200;
            this.f3547v = i6;
        }
        this.f3528c.setState(E);
        w(i7);
        this.f3547v = i6;
    }
}
