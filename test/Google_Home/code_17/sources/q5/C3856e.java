package q5;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.uptodown.util.views.CropImageView;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3856e {

    /* renamed from: a, reason: collision with root package name */
    private final CropImageView f38329a;

    public C3856e(CropImageView cropImageView) {
        AbstractC3255y.i(cropImageView, "cropImageView");
        this.f38329a = cropImageView;
    }

    private final Matrix b() {
        Matrix imageMatrix = this.f38329a.getImageMatrix();
        AbstractC3255y.h(imageMatrix, "cropImageView.imageMatrix");
        return imageMatrix;
    }

    private final float c(int i8, int i9, float f8, boolean z8) {
        if (!z8) {
            if (i8 != 3 && i8 != 4 && i8 != 5) {
                if (i8 == 6 || i8 == 7) {
                    return (i9 - f8) / 2.0f;
                }
                return 0.0f;
            }
            return i9 - f8;
        }
        return 0.0f;
    }

    private final float d(int i8, int i9, float f8, boolean z8) {
        if (z8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        if (i8 != 5 && i8 != 7) {
                            return 0.0f;
                        }
                    }
                }
                return i9 - f8;
            }
            return (i9 - f8) / 2.0f;
        }
        return 0.0f;
    }

    public final void a() {
        boolean z8;
        int width = (this.f38329a.getWidth() - this.f38329a.getPaddingLeft()) - this.f38329a.getPaddingRight();
        int height = (this.f38329a.getHeight() - this.f38329a.getPaddingTop()) - this.f38329a.getPaddingBottom();
        int cropType = this.f38329a.getCropType();
        Drawable drawable = this.f38329a.getDrawable();
        if (cropType != -1 && height > 0 && width > 0 && drawable != null) {
            Matrix b8 = b();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            float f8 = height / intrinsicHeight;
            float f9 = intrinsicWidth;
            float f10 = width / f9;
            if (f10 > f8) {
                f8 = f10;
            }
            b8.setScale(f8, f8);
            if (f10 > f8) {
                z8 = true;
            } else {
                z8 = false;
            }
            b8.postTranslate(c(cropType, width, f9 * f8, z8), d(cropType, height, intrinsicHeight * f8, z8));
            this.f38329a.setImageMatrix(b8);
        }
    }
}
