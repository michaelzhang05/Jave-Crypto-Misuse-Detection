package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long j8, long j9, android.graphics.ColorFilter colorFilter, AbstractC3151p abstractC3151p) {
        this(j8, j9, colorFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        if (Color.m2972equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m2972equalsimpl0(this.add, lightingColorFilter.add)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m3178getAdd0d7_KjU() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m3179getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return (Color.m2978hashCodeimpl(this.multiply) * 31) + Color.m2978hashCodeimpl(this.add);
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m2979toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m2979toStringimpl(this.add)) + ')';
    }

    public /* synthetic */ LightingColorFilter(long j8, long j9, AbstractC3151p abstractC3151p) {
        this(j8, j9);
    }

    private LightingColorFilter(long j8, long j9, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j8;
        this.add = j9;
    }

    private LightingColorFilter(long j8, long j9) {
        this(j8, j9, AndroidColorFilter_androidKt.m2842actualLightingColorFilterOWjLjI(j8, j9), null);
    }
}
