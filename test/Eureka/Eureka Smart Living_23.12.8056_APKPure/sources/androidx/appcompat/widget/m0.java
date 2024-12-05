package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
class m0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1154c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f1155a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f1156b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i6) {
            int layerGravity;
            int layerWidth;
            int layerHeight;
            int layerInsetLeft;
            int layerInsetRight;
            int layerInsetTop;
            int layerInsetBottom;
            int layerInsetStart;
            int layerInsetEnd;
            layerGravity = layerDrawable.getLayerGravity(i6);
            layerDrawable2.setLayerGravity(i6, layerGravity);
            layerWidth = layerDrawable.getLayerWidth(i6);
            layerDrawable2.setLayerWidth(i6, layerWidth);
            layerHeight = layerDrawable.getLayerHeight(i6);
            layerDrawable2.setLayerHeight(i6, layerHeight);
            layerInsetLeft = layerDrawable.getLayerInsetLeft(i6);
            layerDrawable2.setLayerInsetLeft(i6, layerInsetLeft);
            layerInsetRight = layerDrawable.getLayerInsetRight(i6);
            layerDrawable2.setLayerInsetRight(i6, layerInsetRight);
            layerInsetTop = layerDrawable.getLayerInsetTop(i6);
            layerDrawable2.setLayerInsetTop(i6, layerInsetTop);
            layerInsetBottom = layerDrawable.getLayerInsetBottom(i6);
            layerDrawable2.setLayerInsetBottom(i6, layerInsetBottom);
            layerInsetStart = layerDrawable.getLayerInsetStart(i6);
            layerDrawable2.setLayerInsetStart(i6, layerInsetStart);
            layerInsetEnd = layerDrawable.getLayerInsetEnd(i6);
            layerDrawable2.setLayerInsetEnd(i6, layerInsetEnd);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(ProgressBar progressBar) {
        this.f1155a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i6 = 0; i6 < numberOfFrames; i6++) {
            Drawable d6 = d(animationDrawable.getFrame(i6), true);
            d6.setLevel(10000);
            animationDrawable2.addFrame(d6, animationDrawable.getDuration(i6));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap b() {
        return this.f1156b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i6) {
        c3 v5 = c3.v(this.f1155a.getContext(), attributeSet, f1154c, i6, 0);
        Drawable h6 = v5.h(0);
        if (h6 != null) {
            this.f1155a.setIndeterminateDrawable(e(h6));
        }
        Drawable h7 = v5.h(1);
        if (h7 != null) {
            this.f1155a.setProgressDrawable(d(h7, false));
        }
        v5.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    Drawable d(Drawable drawable, boolean z5) {
        if (drawable instanceof androidx.core.graphics.drawable.t) {
            androidx.core.graphics.drawable.t tVar = (androidx.core.graphics.drawable.t) drawable;
            Drawable a6 = tVar.a();
            if (a6 != null) {
                tVar.b(d(a6, z5));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    int id = layerDrawable.getId(i6);
                    drawableArr[i6] = d(layerDrawable.getDrawable(i6), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    layerDrawable2.setId(i7, layerDrawable.getId(i7));
                    if (Build.VERSION.SDK_INT >= 23) {
                        a.a(layerDrawable, layerDrawable2, i7);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1156b == null) {
                    this.f1156b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z5 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
