package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j8, AbstractC3247p abstractC3247p) {
        this(j8);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo2929applyToPq9zytI(long j8, Paint paint, float f8) {
        long m2975copywmQWz5c$default;
        paint.setAlpha(1.0f);
        if (f8 == 1.0f) {
            m2975copywmQWz5c$default = this.value;
        } else {
            long j9 = this.value;
            m2975copywmQWz5c$default = Color.m2975copywmQWz5c$default(j9, Color.m2978getAlphaimpl(j9) * f8, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo2861setColor8_81llA(m2975copywmQWz5c$default);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SolidColor) && Color.m2977equalsimpl0(this.value, ((SolidColor) obj).value)) {
            return true;
        }
        return false;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m3288getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m2983hashCodeimpl(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m2984toStringimpl(this.value)) + ')';
    }

    private SolidColor(long j8) {
        super(null);
        this.value = j8;
    }
}
