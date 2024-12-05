package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.e;
import x5.C3929b;
import x5.InterfaceC3928a;
import x5.InterfaceC3930c;

/* loaded from: classes5.dex */
final class c implements eightbitlab.com.blurview.a {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3928a f30927b;

    /* renamed from: c, reason: collision with root package name */
    private C3929b f30928c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f30929d;

    /* renamed from: e, reason: collision with root package name */
    final BlurView f30930e;

    /* renamed from: f, reason: collision with root package name */
    private int f30931f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f30932g;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30937l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f30938m;

    /* renamed from: a, reason: collision with root package name */
    private float f30926a = 16.0f;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f30933h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    private final int[] f30934i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f30935j = new a();

    /* renamed from: k, reason: collision with root package name */
    private boolean f30936k = true;

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
    public c(BlurView blurView, ViewGroup viewGroup, int i8, InterfaceC3928a interfaceC3928a) {
        this.f30932g = viewGroup;
        this.f30930e = blurView;
        this.f30931f = i8;
        this.f30927b = interfaceC3928a;
        if (interfaceC3928a instanceof d) {
            ((d) interfaceC3928a).f(blurView.getContext());
        }
        f(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    private void e() {
        this.f30929d = this.f30927b.e(this.f30929d, this.f30926a);
        if (!this.f30927b.c()) {
            this.f30928c.setBitmap(this.f30929d);
        }
    }

    private void g() {
        this.f30932g.getLocationOnScreen(this.f30933h);
        this.f30930e.getLocationOnScreen(this.f30934i);
        int[] iArr = this.f30934i;
        int i8 = iArr[0];
        int[] iArr2 = this.f30933h;
        int i9 = i8 - iArr2[0];
        int i10 = iArr[1] - iArr2[1];
        float height = this.f30930e.getHeight() / this.f30929d.getHeight();
        float width = this.f30930e.getWidth() / this.f30929d.getWidth();
        this.f30928c.translate((-i9) / width, (-i10) / height);
        this.f30928c.scale(1.0f / width, 1.0f / height);
    }

    @Override // x5.InterfaceC3930c
    public InterfaceC3930c a(boolean z8) {
        this.f30932g.getViewTreeObserver().removeOnPreDrawListener(this.f30935j);
        if (z8) {
            this.f30932g.getViewTreeObserver().addOnPreDrawListener(this.f30935j);
        }
        return this;
    }

    @Override // x5.InterfaceC3930c
    public InterfaceC3930c b(Drawable drawable) {
        this.f30938m = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void c() {
        f(this.f30930e.getMeasuredWidth(), this.f30930e.getMeasuredHeight());
    }

    @Override // x5.InterfaceC3930c
    public InterfaceC3930c d(float f8) {
        this.f30926a = f8;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void destroy() {
        a(false);
        this.f30927b.destroy();
        this.f30937l = false;
    }

    @Override // eightbitlab.com.blurview.a
    public boolean draw(Canvas canvas) {
        if (this.f30936k && this.f30937l) {
            if (canvas instanceof C3929b) {
                return false;
            }
            float width = this.f30930e.getWidth() / this.f30929d.getWidth();
            canvas.save();
            canvas.scale(width, this.f30930e.getHeight() / this.f30929d.getHeight());
            this.f30927b.d(canvas, this.f30929d);
            canvas.restore();
            int i8 = this.f30931f;
            if (i8 != 0) {
                canvas.drawColor(i8);
            }
        }
        return true;
    }

    void f(int i8, int i9) {
        a(true);
        e eVar = new e(this.f30927b.a());
        if (eVar.b(i8, i9)) {
            this.f30930e.setWillNotDraw(true);
            return;
        }
        this.f30930e.setWillNotDraw(false);
        e.a d8 = eVar.d(i8, i9);
        this.f30929d = Bitmap.createBitmap(d8.f30947a, d8.f30948b, this.f30927b.b());
        this.f30928c = new C3929b(this.f30929d);
        this.f30937l = true;
        h();
    }

    void h() {
        if (this.f30936k && this.f30937l) {
            Drawable drawable = this.f30938m;
            if (drawable == null) {
                this.f30929d.eraseColor(0);
            } else {
                drawable.draw(this.f30928c);
            }
            this.f30928c.save();
            g();
            this.f30932g.draw(this.f30928c);
            this.f30928c.restore();
            e();
        }
    }
}
