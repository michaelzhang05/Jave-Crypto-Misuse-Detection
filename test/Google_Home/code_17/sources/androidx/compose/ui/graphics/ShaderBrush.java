package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m2817getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo2929applyToPq9zytI(long j8, Paint paint, float f8) {
        Shader shader = this.internalShader;
        if (shader == null || !Size.m2805equalsimpl0(this.createdSize, j8)) {
            if (Size.m2811isEmptyimpl(j8)) {
                shader = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m2817getUnspecifiedNHjbRc();
            } else {
                shader = mo2951createShaderuvyYCjk(j8);
                this.internalShader = shader;
                this.createdSize = j8;
            }
        }
        long mo2855getColor0d7_KjU = paint.mo2855getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2977equalsimpl0(mo2855getColor0d7_KjU, companion.m3002getBlack0d7_KjU())) {
            paint.mo2861setColor8_81llA(companion.m3002getBlack0d7_KjU());
        }
        if (!AbstractC3255y.d(paint.getShader(), shader)) {
            paint.setShader(shader);
        }
        if (paint.getAlpha() != f8) {
            paint.setAlpha(f8);
        }
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo2951createShaderuvyYCjk(long j8);
}
