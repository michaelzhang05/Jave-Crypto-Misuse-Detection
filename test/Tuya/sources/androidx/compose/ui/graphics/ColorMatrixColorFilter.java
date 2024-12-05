package androidx.compose.ui.graphics;

import M5.AbstractC1239l;
import androidx.compose.runtime.Immutable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class ColorMatrixColorFilter extends ColorFilter {
    private float[] colorMatrix;

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, AbstractC3151p abstractC3151p) {
        this(fArr, colorFilter);
    }

    /* renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m3048copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fArr = ColorMatrix.m3028constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m3050copyColorMatrixgBh15pI(fArr);
    }

    /* renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m3049obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr == null) {
            float[] actualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
            this.colorMatrix = actualColorMatrixFromFilter;
            return actualColorMatrixFromFilter;
        }
        return fArr;
    }

    /* renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m3050copyColorMatrixgBh15pI(float[] fArr) {
        AbstractC1239l.k(m3049obtainColorMatrixp10uLo(), fArr, 0, 0, 0, 14, null);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ColorMatrixColorFilter) && Arrays.equals(m3049obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m3049obtainColorMatrixp10uLo())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m3035hashCodeimpl(fArr);
        }
        return 0;
    }

    public String toString() {
        String m3046toStringimpl;
        StringBuilder sb = new StringBuilder();
        sb.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        if (fArr == null) {
            m3046toStringimpl = "null";
        } else {
            m3046toStringimpl = ColorMatrix.m3046toStringimpl(fArr);
        }
        sb.append((Object) m3046toStringimpl);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, AbstractC3151p abstractC3151p) {
        this(fArr);
    }

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m2841actualColorMatrixColorFilterjHGOpc(fArr), null);
    }
}
