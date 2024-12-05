package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3159y;

@Immutable
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m2812getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo2924applyToPq9zytI(long j8, Paint paint, float f8) {
        Shader shader = this.internalShader;
        if (shader == null || !Size.m2800equalsimpl0(this.createdSize, j8)) {
            if (Size.m2806isEmptyimpl(j8)) {
                shader = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m2812getUnspecifiedNHjbRc();
            } else {
                shader = mo2946createShaderuvyYCjk(j8);
                this.internalShader = shader;
                this.createdSize = j8;
            }
        }
        long mo2850getColor0d7_KjU = paint.mo2850getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2972equalsimpl0(mo2850getColor0d7_KjU, companion.m2997getBlack0d7_KjU())) {
            paint.mo2856setColor8_81llA(companion.m2997getBlack0d7_KjU());
        }
        if (!AbstractC3159y.d(paint.getShader(), shader)) {
            paint.setShader(shader);
        }
        if (paint.getAlpha() != f8) {
            paint.setAlpha(f8);
        }
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo2946createShaderuvyYCjk(long j8);
}
