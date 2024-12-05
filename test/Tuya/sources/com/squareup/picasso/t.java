package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class t extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    private static final Paint f23354h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23355a;

    /* renamed from: b, reason: collision with root package name */
    private final float f23356b;

    /* renamed from: c, reason: collision with root package name */
    private final s.e f23357c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f23358d;

    /* renamed from: e, reason: collision with root package name */
    long f23359e;

    /* renamed from: f, reason: collision with root package name */
    boolean f23360f;

    /* renamed from: g, reason: collision with root package name */
    int f23361g;

    t(Context context, Bitmap bitmap, Drawable drawable, s.e eVar, boolean z8, boolean z9) {
        super(context.getResources(), bitmap);
        this.f23361g = 255;
        this.f23355a = z9;
        this.f23356b = context.getResources().getDisplayMetrics().density;
        this.f23357c = eVar;
        if (eVar != s.e.MEMORY && !z8) {
            this.f23358d = drawable;
            this.f23360f = true;
            this.f23359e = SystemClock.uptimeMillis();
        }
    }

    private void a(Canvas canvas) {
        Paint paint = f23354h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f23356b * 16.0f)), paint);
        paint.setColor(this.f23357c.f23348a);
        canvas.drawPath(b(0, 0, (int) (this.f23356b * 15.0f)), paint);
    }

    private static Path b(int i8, int i9, int i10) {
        Path path = new Path();
        float f8 = i8;
        float f9 = i9;
        path.moveTo(f8, f9);
        path.lineTo(i8 + i10, f9);
        path.lineTo(f8, i9 + i10);
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ImageView imageView, Context context, Bitmap bitmap, s.e eVar, boolean z8, boolean z9) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new t(context, bitmap, drawable, eVar, z8, z9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f23360f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f23359e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f23360f = false;
                this.f23358d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f23358d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f23361g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f23361g);
            }
        }
        if (this.f23355a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23358d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f23361g = i8;
        Drawable drawable = this.f23358d;
        if (drawable != null) {
            drawable.setAlpha(i8);
        }
        super.setAlpha(i8);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23358d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
