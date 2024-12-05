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
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j8, long j9, int i8, AbstractC3151p abstractC3151p) {
        this(list, list2, j8, j9, i8);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2946createShaderuvyYCjk(long j8) {
        float m2735getXimpl;
        float m2736getYimpl;
        float m2735getXimpl2;
        float m2736getYimpl2;
        if (Offset.m2735getXimpl(this.start) == Float.POSITIVE_INFINITY) {
            m2735getXimpl = Size.m2804getWidthimpl(j8);
        } else {
            m2735getXimpl = Offset.m2735getXimpl(this.start);
        }
        if (Offset.m2736getYimpl(this.start) == Float.POSITIVE_INFINITY) {
            m2736getYimpl = Size.m2801getHeightimpl(j8);
        } else {
            m2736getYimpl = Offset.m2736getYimpl(this.start);
        }
        if (Offset.m2735getXimpl(this.end) == Float.POSITIVE_INFINITY) {
            m2735getXimpl2 = Size.m2804getWidthimpl(j8);
        } else {
            m2735getXimpl2 = Offset.m2735getXimpl(this.end);
        }
        if (Offset.m2736getYimpl(this.end) == Float.POSITIVE_INFINITY) {
            m2736getYimpl2 = Size.m2801getHeightimpl(j8);
        } else {
            m2736getYimpl2 = Offset.m2736getYimpl(this.end);
        }
        return ShaderKt.m3263LinearGradientShaderVjE6UOU(OffsetKt.Offset(m2735getXimpl, m2736getYimpl), OffsetKt.Offset(m2735getXimpl2, m2736getYimpl2), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (AbstractC3159y.d(this.colors, linearGradient.colors) && AbstractC3159y.d(this.stops, linearGradient.stops) && Offset.m2732equalsimpl0(this.start, linearGradient.start) && Offset.m2732equalsimpl0(this.end, linearGradient.end) && TileMode.m3317equalsimpl0(this.tileMode, linearGradient.tileMode)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2925getIntrinsicSizeNHjbRc() {
        float f8;
        float m2736getYimpl;
        float m2736getYimpl2;
        float m2735getXimpl = Offset.m2735getXimpl(this.start);
        float f9 = Float.NaN;
        if (!Float.isInfinite(m2735getXimpl) && !Float.isNaN(m2735getXimpl)) {
            float m2735getXimpl2 = Offset.m2735getXimpl(this.end);
            if (!Float.isInfinite(m2735getXimpl2) && !Float.isNaN(m2735getXimpl2)) {
                f8 = Math.abs(Offset.m2735getXimpl(this.start) - Offset.m2735getXimpl(this.end));
                m2736getYimpl = Offset.m2736getYimpl(this.start);
                if (!Float.isInfinite(m2736getYimpl) && !Float.isNaN(m2736getYimpl)) {
                    m2736getYimpl2 = Offset.m2736getYimpl(this.end);
                    if (!Float.isInfinite(m2736getYimpl2) && !Float.isNaN(m2736getYimpl2)) {
                        f9 = Math.abs(Offset.m2736getYimpl(this.start) - Offset.m2736getYimpl(this.end));
                    }
                }
                return SizeKt.Size(f8, f9);
            }
        }
        f8 = Float.NaN;
        m2736getYimpl = Offset.m2736getYimpl(this.start);
        if (!Float.isInfinite(m2736getYimpl)) {
            m2736getYimpl2 = Offset.m2736getYimpl(this.end);
            if (!Float.isInfinite(m2736getYimpl2)) {
                f9 = Math.abs(Offset.m2736getYimpl(this.start) - Offset.m2736getYimpl(this.end));
            }
        }
        return SizeKt.Size(f8, f9);
    }

    public int hashCode() {
        int i8;
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i8 = list.hashCode();
        } else {
            i8 = 0;
        }
        return ((((((hashCode + i8) * 31) + Offset.m2737hashCodeimpl(this.start)) * 31) + Offset.m2737hashCodeimpl(this.end)) * 31) + TileMode.m3318hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m2752isFinitek4lQ0M(this.start)) {
            str = "";
        } else {
            str = "start=" + ((Object) Offset.m2743toStringimpl(this.start)) + ", ";
        }
        if (OffsetKt.m2752isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m2743toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m3319toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j8, long j9, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(list, (i9 & 2) != 0 ? null : list2, j8, j9, (i9 & 16) != 0 ? TileMode.Companion.m3321getClamp3opZhB0() : i8, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j8, long j9, int i8) {
        this.colors = list;
        this.stops = list2;
        this.start = j8;
        this.end = j9;
        this.tileMode = i8;
    }
}
