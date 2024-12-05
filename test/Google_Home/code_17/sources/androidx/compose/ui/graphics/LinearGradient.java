package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j8, long j9, int i8, AbstractC3247p abstractC3247p) {
        this(list, list2, j8, j9, i8);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo2951createShaderuvyYCjk(long j8) {
        float m2740getXimpl;
        float m2741getYimpl;
        float m2740getXimpl2;
        float m2741getYimpl2;
        if (Offset.m2740getXimpl(this.start) == Float.POSITIVE_INFINITY) {
            m2740getXimpl = Size.m2809getWidthimpl(j8);
        } else {
            m2740getXimpl = Offset.m2740getXimpl(this.start);
        }
        if (Offset.m2741getYimpl(this.start) == Float.POSITIVE_INFINITY) {
            m2741getYimpl = Size.m2806getHeightimpl(j8);
        } else {
            m2741getYimpl = Offset.m2741getYimpl(this.start);
        }
        if (Offset.m2740getXimpl(this.end) == Float.POSITIVE_INFINITY) {
            m2740getXimpl2 = Size.m2809getWidthimpl(j8);
        } else {
            m2740getXimpl2 = Offset.m2740getXimpl(this.end);
        }
        if (Offset.m2741getYimpl(this.end) == Float.POSITIVE_INFINITY) {
            m2741getYimpl2 = Size.m2806getHeightimpl(j8);
        } else {
            m2741getYimpl2 = Offset.m2741getYimpl(this.end);
        }
        return ShaderKt.m3268LinearGradientShaderVjE6UOU(OffsetKt.Offset(m2740getXimpl, m2741getYimpl), OffsetKt.Offset(m2740getXimpl2, m2741getYimpl2), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (AbstractC3255y.d(this.colors, linearGradient.colors) && AbstractC3255y.d(this.stops, linearGradient.stops) && Offset.m2737equalsimpl0(this.start, linearGradient.start) && Offset.m2737equalsimpl0(this.end, linearGradient.end) && TileMode.m3322equalsimpl0(this.tileMode, linearGradient.tileMode)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2930getIntrinsicSizeNHjbRc() {
        float f8;
        float m2741getYimpl;
        float m2741getYimpl2;
        float m2740getXimpl = Offset.m2740getXimpl(this.start);
        float f9 = Float.NaN;
        if (!Float.isInfinite(m2740getXimpl) && !Float.isNaN(m2740getXimpl)) {
            float m2740getXimpl2 = Offset.m2740getXimpl(this.end);
            if (!Float.isInfinite(m2740getXimpl2) && !Float.isNaN(m2740getXimpl2)) {
                f8 = Math.abs(Offset.m2740getXimpl(this.start) - Offset.m2740getXimpl(this.end));
                m2741getYimpl = Offset.m2741getYimpl(this.start);
                if (!Float.isInfinite(m2741getYimpl) && !Float.isNaN(m2741getYimpl)) {
                    m2741getYimpl2 = Offset.m2741getYimpl(this.end);
                    if (!Float.isInfinite(m2741getYimpl2) && !Float.isNaN(m2741getYimpl2)) {
                        f9 = Math.abs(Offset.m2741getYimpl(this.start) - Offset.m2741getYimpl(this.end));
                    }
                }
                return SizeKt.Size(f8, f9);
            }
        }
        f8 = Float.NaN;
        m2741getYimpl = Offset.m2741getYimpl(this.start);
        if (!Float.isInfinite(m2741getYimpl)) {
            m2741getYimpl2 = Offset.m2741getYimpl(this.end);
            if (!Float.isInfinite(m2741getYimpl2)) {
                f9 = Math.abs(Offset.m2741getYimpl(this.start) - Offset.m2741getYimpl(this.end));
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
        return ((((((hashCode + i8) * 31) + Offset.m2742hashCodeimpl(this.start)) * 31) + Offset.m2742hashCodeimpl(this.end)) * 31) + TileMode.m3323hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m2757isFinitek4lQ0M(this.start)) {
            str = "";
        } else {
            str = "start=" + ((Object) Offset.m2748toStringimpl(this.start)) + ", ";
        }
        if (OffsetKt.m2757isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m2748toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m3324toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j8, long j9, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(list, (i9 & 2) != 0 ? null : list2, j8, j9, (i9 & 16) != 0 ? TileMode.Companion.m3326getClamp3opZhB0() : i8, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j8, long j9, int i8) {
        this.colors = list;
        this.stops = list2;
        this.start = j8;
        this.end = j9;
        this.tileMode = i8;
    }
}
