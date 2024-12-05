package androidx.compose.ui.graphics;

import P5.AbstractC1371l;
import androidx.compose.runtime.Immutable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class ColorMatrixColorFilter extends ColorFilter {
    private float[] colorMatrix;

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, AbstractC3247p abstractC3247p) {
        this(fArr, colorFilter);
    }

    /* renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m3053copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fArr = ColorMatrix.m3033constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m3055copyColorMatrixgBh15pI(fArr);
    }

    /* renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m3054obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr == null) {
            float[] actualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
            this.colorMatrix = actualColorMatrixFromFilter;
            return actualColorMatrixFromFilter;
        }
        return fArr;
    }

    /* renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m3055copyColorMatrixgBh15pI(float[] fArr) {
        AbstractC1371l.k(m3054obtainColorMatrixp10uLo(), fArr, 0, 0, 0, 14, null);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ColorMatrixColorFilter) && Arrays.equals(m3054obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m3054obtainColorMatrixp10uLo())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m3040hashCodeimpl(fArr);
        }
        return 0;
    }

    public String toString() {
        String m3051toStringimpl;
        StringBuilder sb = new StringBuilder();
        sb.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        if (fArr == null) {
            m3051toStringimpl = "null";
        } else {
            m3051toStringimpl = ColorMatrix.m3051toStringimpl(fArr);
        }
        sb.append((Object) m3051toStringimpl);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, AbstractC3247p abstractC3247p) {
        this(fArr);
    }

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m2846actualColorMatrixColorFilterjHGOpc(fArr), null);
    }
}
