package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class Shadow {
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ Shadow(long j8, long j9, float f8, AbstractC3247p abstractC3247p) {
        this(j8, j9, f8);
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m3274copyqcb84PM$default(Shadow shadow, long j8, long j9, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = shadow.color;
        }
        long j10 = j8;
        if ((i8 & 2) != 0) {
            j9 = shadow.offset;
        }
        long j11 = j9;
        if ((i8 & 4) != 0) {
            f8 = shadow.blurRadius;
        }
        return shadow.m3277copyqcb84PM(j10, j11, f8);
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m3275getColor0d7_KjU$annotations() {
    }

    @Stable
    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m3276getOffsetF1C5BW0$annotations() {
    }

    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m3277copyqcb84PM(long j8, long j9, float f8) {
        return new Shadow(j8, j9, f8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        if (Color.m2977equalsimpl0(this.color, shadow.color) && Offset.m2737equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius) {
            return true;
        }
        return false;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3278getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m3279getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m2983hashCodeimpl(this.color) * 31) + Offset.m2742hashCodeimpl(this.offset)) * 31) + Float.floatToIntBits(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.m2984toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m2748toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j8, long j9, float f8) {
        this.color = j8;
        this.offset = j9;
        this.blurRadius = f8;
    }

    public /* synthetic */ Shadow(long j8, long j9, float f8, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? ColorKt.Color(4278190080L) : j8, (i8 & 2) != 0 ? Offset.Companion.m2756getZeroF1C5BW0() : j9, (i8 & 4) != 0 ? 0.0f : f8, null);
    }
}
