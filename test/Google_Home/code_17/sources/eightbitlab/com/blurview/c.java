package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.e;

/* loaded from: classes5.dex */
final class c implements eightbitlab.com.blurview.a {

    /* renamed from: b, reason: collision with root package name */
    private final A5.a f31827b;

    /* renamed from: c, reason: collision with root package name */
    private A5.b f31828c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f31829d;

    /* renamed from: e, reason: collision with root package name */
    final BlurView f31830e;

    /* renamed from: f, reason: collision with root package name */
    private int f31831f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f31832g;

    /* renamed from: l, reason: collision with root package name */
    private boolean f31837l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f31838m;

    /* renamed from: a, reason: collision with root package name */
    private float f31826a = 16.0f;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f31833h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    private final int[] f31834i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f31835j = new a();

    /* renamed from: k, reason: collision with root package name */
    private boolean f31836k = true;

    /* loaded from: classes5.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(BlurView blurView, ViewGroup viewGroup, int i8, A5.a aVar) {
        this.f31832g = viewGroup;
        this.f31830e = blurView;
        this.f31831f = i8;
        this.f31827b = aVar;
        if (aVar instanceof d) {
            ((d) aVar).f(blurView.getContext());
        }
        f(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    private void e() {
        this.f31829d = this.f31827b.e(this.f31829d, this.f31826a);
        if (!this.f31827b.c()) {
            this.f31828c.setBitmap(this.f31829d);
        }
    }

    private void g() {
        this.f31832g.getLocationOnScreen(this.f31833h);
        this.f31830e.getLocationOnScreen(this.f31834i);
        int[] iArr = this.f31834i;
        int i8 = iArr[0];
        int[] iArr2 = this.f31833h;
        int i9 = i8 - iArr2[0];
        int i10 = iArr[1] - iArr2[1];
        float height = this.f31830e.getHeight() / this.f31829d.getHeight();
        float width = this.f31830e.getWidth() / this.f31829d.getWidth();
        this.f31828c.translate((-i9) / width, (-i10) / height);
        this.f31828c.scale(1.0f / width, 1.0f / height);
    }

    @Override // A5.c
    public A5.c a(boolean z8) {
        this.f31832g.getViewTreeObserver().removeOnPreDrawListener(this.f31835j);
        if (z8) {
            this.f31832g.getViewTreeObserver().addOnPreDrawListener(this.f31835j);
        }
        return this;
    }

    @Override // A5.c
    public A5.c b(Drawable drawable) {
        this.f31838m = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void c() {
        f(this.f31830e.getMeasuredWidth(), this.f31830e.getMeasuredHeight());
    }

    @Override // A5.c
    public A5.c d(float f8) {
        this.f31826a = f8;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void destroy() {
        a(false);
        this.f31827b.destroy();
        this.f31837l = false;
    }

    @Override // eightbitlab.com.blurview.a
    public boolean draw(Canvas canvas) {
        if (this.f31836k && this.f31837l) {
            if (canvas instanceof A5.b) {
                return false;
            }
            float width = this.f31830e.getWidth() / this.f31829d.getWidth();
            canvas.save();
            canvas.scale(width, this.f31830e.getHeight() / this.f31829d.getHeight());
            this.f31827b.d(canvas, this.f31829d);
            canvas.restore();
            int i8 = this.f31831f;
            if (i8 != 0) {
                canvas.drawColor(i8);
            }
        }
        return true;
    }

    void f(int i8, int i9) {
        a(true);
        e eVar = new e(this.f31827b.a());
        if (eVar.b(i8, i9)) {
            this.f31830e.setWillNotDraw(true);
            return;
        }
        this.f31830e.setWillNotDraw(false);
        e.a d8 = eVar.d(i8, i9);
        this.f31829d = Bitmap.createBitmap(d8.f31847a, d8.f31848b, this.f31827b.b());
        this.f31828c = new A5.b(this.f31829d);
        this.f31837l = true;
        h();
    }

    void h() {
        if (this.f31836k && this.f31837l) {
            Drawable drawable = this.f31838m;
            if (drawable == null) {
                this.f31829d.eraseColor(0);
            } else {
                drawable.draw(this.f31828c);
            }
            this.f31828c.save();
            g();
            this.f31832g.draw(this.f31828c);
            this.f31828c.restore();
            e();
        }
    }
}
