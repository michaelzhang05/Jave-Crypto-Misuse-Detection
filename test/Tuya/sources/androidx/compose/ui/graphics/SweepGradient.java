package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@Immutable
/* loaded from: classes.dex */
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j8, List list, List list2, AbstractC3151p abstractC3151p) {
        this(j8, list, list2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2946createShaderuvyYCjk(long j8) {
        float m2735getXimpl;
        float m2736getYimpl;
        long Offset;
        if (OffsetKt.m2756isUnspecifiedk4lQ0M(this.center)) {
            Offset = SizeKt.m2814getCenteruvyYCjk(j8);
        } else {
            if (Offset.m2735getXimpl(this.center) == Float.POSITIVE_INFINITY) {
                m2735getXimpl = Size.m2804getWidthimpl(j8);
            } else {
                m2735getXimpl = Offset.m2735getXimpl(this.center);
            }
            if (Offset.m2736getYimpl(this.center) == Float.POSITIVE_INFINITY) {
                m2736getYimpl = Size.m2801getHeightimpl(j8);
            } else {
                m2736getYimpl = Offset.m2736getYimpl(this.center);
            }
            Offset = OffsetKt.Offset(m2735getXimpl, m2736getYimpl);
        }
        return ShaderKt.m3267SweepGradientShader9KIMszo(Offset, this.colors, this.stops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        if (Offset.m2732equalsimpl0(this.center, sweepGradient.center) && AbstractC3159y.d(this.colors, sweepGradient.colors) && AbstractC3159y.d(this.stops, sweepGradient.stops)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int m2737hashCodeimpl = ((Offset.m2737hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i8 = list.hashCode();
        } else {
            i8 = 0;
        }
        return m2737hashCodeimpl + i8;
    }

    public String toString() {
        String str;
        if (OffsetKt.m2754isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m2743toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    public /* synthetic */ SweepGradient(long j8, List list, List list2, int i8, AbstractC3151p abstractC3151p) {
        this(j8, list, (i8 & 4) != 0 ? null : list2, null);
    }

    private SweepGradient(long j8, List<Color> list, List<Float> list2) {
        this.center = j8;
        this.colors = list;
        this.stops = list2;
    }
}
