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
    private int f23105a;

    /* renamed from: b, reason: collision with root package name */
    private float f23106b;

    /* renamed from: c, reason: collision with root package name */
    private float f23107c;

    /* renamed from: d, reason: collision with root package name */
    private int f23108d;

    /* renamed from: e, reason: collision with root package name */
    private int f23109e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f23110f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f23111g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23112h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f23113i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f23114j;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0427a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f23115a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f23116b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f23117c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f23118d;

        /* renamed from: e, reason: collision with root package name */
        private int f23119e;

        /* renamed from: f, reason: collision with root package name */
        private int f23120f;

        /* renamed from: g, reason: collision with root package name */
        private int f23121g;

        /* renamed from: h, reason: collision with root package name */
        private float f23122h;

        /* renamed from: i, reason: collision with root package name */
        private float f23123i;

        private C0427a() {
            this.f23120f = 100;
            this.f23121g = 10;
            this.f23115a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f23116b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f23117c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(boolean z8) {
            this.f23118d = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(float f8) {
            this.f23123i = f8;
            return this;
        }

        public final b a(int i8) {
            this.f23119e = i8;
            return this;
        }

        public final b a(float f8) {
            this.f23122h = f8;
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
            float max = Math.max(this.f23106b / bitmap.getWidth(), this.f23107c / bitmap.getHeight());
            if (this.f23114j == null) {
                this.f23114j = new Matrix();
            }
            this.f23114j.reset();
            this.f23114j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f23114j);
        this.f23113i.setShader(bitmapShader);
        canvas.drawPath(path, this.f23113i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f23105a == 1) {
            float f8 = this.f23107c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f23108d + f8) - this.f23109e);
            path.lineTo(this.f23106b, (f8 - this.f23108d) - this.f23109e);
            path.lineTo(this.f23106b, 0.0f);
            if (this.f23112h) {
                try {
                    a(canvas, path);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f23110f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f23110f);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f23108d + f8 + this.f23109e);
            path2.lineTo(0.0f, this.f23107c);
            path2.lineTo(this.f23106b, this.f23107c);
            path2.lineTo(this.f23106b, (f8 - this.f23108d) + this.f23109e);
            if (this.f23112h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f23111g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    a(canvas, path2, this.f23111g);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f9 = this.f23106b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f23107c);
        path3.lineTo((f9 - this.f23108d) - this.f23109e, this.f23107c);
        path3.lineTo((this.f23108d + f9) - this.f23109e, 0.0f);
        if (this.f23112h) {
            try {
                a(canvas, path3);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f23110f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f23110f);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f23108d + f9 + this.f23109e, 0.0f);
        path4.lineTo(this.f23106b, 0.0f);
        path4.lineTo(this.f23106b, this.f23107c);
        path4.lineTo((f9 - this.f23108d) + this.f23109e, this.f23107c);
        if (this.f23112h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e14) {
                e14.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f23111g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                a(canvas, path4, this.f23111g);
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0427a c0427a) {
        super(c0427a.f23115a);
        this.f23112h = false;
        this.f23110f = c0427a.f23116b;
        this.f23111g = c0427a.f23117c;
        this.f23112h = c0427a.f23118d;
        this.f23105a = c0427a.f23119e;
        this.f23108d = c0427a.f23120f;
        this.f23109e = c0427a.f23121g;
        this.f23106b = c0427a.f23122h;
        this.f23107c = c0427a.f23123i;
        Paint paint = new Paint();
        this.f23113i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f23113i.setAntiAlias(true);
        this.f23114j = new Matrix();
    }

    private void a(Canvas canvas, Path path) {
        this.f23113i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f23113i);
    }

    public static C0427a a() {
        return new C0427a();
    }
}
