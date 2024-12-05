package com.mbridge.msdk.video.dynview.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes4.dex */
public final class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f22050a;

    /* renamed from: b, reason: collision with root package name */
    private float f22051b;

    /* renamed from: c, reason: collision with root package name */
    private float f22052c;

    /* renamed from: d, reason: collision with root package name */
    private int f22053d;

    /* renamed from: e, reason: collision with root package name */
    private int f22054e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f22055f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f22056g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22057h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f22058i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f22059j;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0431a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f22060a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f22061b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f22062c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f22063d;

        /* renamed from: e, reason: collision with root package name */
        private int f22064e;

        /* renamed from: f, reason: collision with root package name */
        private int f22065f;

        /* renamed from: g, reason: collision with root package name */
        private int f22066g;

        /* renamed from: h, reason: collision with root package name */
        private float f22067h;

        /* renamed from: i, reason: collision with root package name */
        private float f22068i;

        private C0431a() {
            this.f22065f = 100;
            this.f22066g = 10;
            this.f22060a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f22061b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f22062c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(boolean z8) {
            this.f22063d = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(float f8) {
            this.f22068i = f8;
            return this;
        }

        public final b a(int i8) {
            this.f22064e = i8;
            return this;
        }

        public final b a(float f8) {
            this.f22067h = f8;
            return this;
        }

        public final a a() {
            return new a(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(Bitmap bitmap);

        b a(boolean z8);

        b b(float f8);

        b b(Bitmap bitmap);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float max = Math.max(this.f22051b / bitmap.getWidth(), this.f22052c / bitmap.getHeight());
            if (this.f22059j == null) {
                this.f22059j = new Matrix();
            }
            this.f22059j.reset();
            this.f22059j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f22059j);
        this.f22058i.setShader(bitmapShader);
        canvas.drawPath(path, this.f22058i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f22050a == 1) {
            float f8 = this.f22052c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f22053d + f8) - this.f22054e);
            path.lineTo(this.f22051b, (f8 - this.f22053d) - this.f22054e);
            path.lineTo(this.f22051b, 0.0f);
            if (this.f22057h) {
                try {
                    a(canvas, path);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f22055f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f22055f);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f22053d + f8 + this.f22054e);
            path2.lineTo(0.0f, this.f22052c);
            path2.lineTo(this.f22051b, this.f22052c);
            path2.lineTo(this.f22051b, (f8 - this.f22053d) + this.f22054e);
            if (this.f22057h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f22056g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    a(canvas, path2, this.f22056g);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f9 = this.f22051b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f22052c);
        path3.lineTo((f9 - this.f22053d) - this.f22054e, this.f22052c);
        path3.lineTo((this.f22053d + f9) - this.f22054e, 0.0f);
        if (this.f22057h) {
            try {
                a(canvas, path3);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f22055f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f22055f);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f22053d + f9 + this.f22054e, 0.0f);
        path4.lineTo(this.f22051b, 0.0f);
        path4.lineTo(this.f22051b, this.f22052c);
        path4.lineTo((f9 - this.f22053d) + this.f22054e, this.f22052c);
        if (this.f22057h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e14) {
                e14.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f22056g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                a(canvas, path4, this.f22056g);
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0431a c0431a) {
        super(c0431a.f22060a);
        this.f22057h = false;
        this.f22055f = c0431a.f22061b;
        this.f22056g = c0431a.f22062c;
        this.f22057h = c0431a.f22063d;
        this.f22050a = c0431a.f22064e;
        this.f22053d = c0431a.f22065f;
        this.f22054e = c0431a.f22066g;
        this.f22051b = c0431a.f22067h;
        this.f22052c = c0431a.f22068i;
        Paint paint = new Paint();
        this.f22058i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f22058i.setAntiAlias(true);
        this.f22059j = new Matrix();
    }

    private void a(Canvas canvas, Path path) {
        this.f22058i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f22058i);
    }

    public static C0431a a() {
        return new C0431a();
    }
}
