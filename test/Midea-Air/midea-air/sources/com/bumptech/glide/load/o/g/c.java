package com.bumptech.glide.load.o.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.o.g.g;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: GifDrawable.java */
/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: f, reason: collision with root package name */
    private final a f8825f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8826g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8827h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8828i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8829j;

    /* renamed from: k, reason: collision with root package name */
    private int f8830k;
    private int l;
    private boolean m;
    private Paint n;
    private Rect o;
    private List<c.t.a.a.b> p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifDrawable.java */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {
        final g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, com.bumptech.glide.l.a aVar, l<Bitmap> lVar, int i2, int i3, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.c(context), aVar, i2, i3, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.o == null) {
            this.o = new Rect();
        }
        return this.o;
    }

    private Paint h() {
        if (this.n == null) {
            this.n = new Paint(2);
        }
        return this.n;
    }

    private void j() {
        List<c.t.a.a.b> list = this.p;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).a(this);
            }
        }
    }

    private void l() {
        this.f8830k = 0;
    }

    private void n() {
        com.bumptech.glide.r.j.a(!this.f8828i, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f8825f.a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f8826g) {
                return;
            }
            this.f8826g = true;
            this.f8825f.a.s(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f8826g = false;
        this.f8825f.a.t(this);
    }

    @Override // com.bumptech.glide.load.o.g.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f8830k++;
        }
        int i2 = this.l;
        if (i2 == -1 || this.f8830k < i2) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f8825f.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f8828i) {
            return;
        }
        if (this.m) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.m = false;
        }
        canvas.drawBitmap(this.f8825f.a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f8825f.a.e();
    }

    public int f() {
        return this.f8825f.a.f();
    }

    public int g() {
        return this.f8825f.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f8825f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8825f.a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8825f.a.l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f8825f.a.k();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f8826g;
    }

    public void k() {
        this.f8828i = true;
        this.f8825f.a.a();
    }

    public void m(l<Bitmap> lVar, Bitmap bitmap) {
        this.f8825f.a.p(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        h().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        com.bumptech.glide.r.j.a(!this.f8828i, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f8829j = z;
        if (!z) {
            o();
        } else if (this.f8827h) {
            n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f8827h = true;
        l();
        if (this.f8829j) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f8827h = false;
        o();
    }

    c(a aVar) {
        this.f8829j = true;
        this.l = -1;
        this.f8825f = (a) com.bumptech.glide.r.j.d(aVar);
    }
}
