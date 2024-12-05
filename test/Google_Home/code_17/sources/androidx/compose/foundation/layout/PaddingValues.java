package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
public interface PaddingValues {

    @Immutable
    /* loaded from: classes.dex */
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public /* synthetic */ Absolute(float f8, float f9, float f10, float f11, AbstractC3247p abstractC3247p) {
            this(f8, f9, f10, f11);
        }

        @Stable
        /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m618getBottomD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m619getLeftD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m620getRightD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m621getTopD9Ej5fM$annotations() {
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo555calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateLeftPadding-u2uoSUM */
        public float mo556calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            AbstractC3255y.i(layoutDirection, "layoutDirection");
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public float mo557calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            AbstractC3255y.i(layoutDirection, "layoutDirection");
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public float mo558calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            if (!Dp.m5188equalsimpl0(this.left, absolute.left) || !Dp.m5188equalsimpl0(this.top, absolute.top) || !Dp.m5188equalsimpl0(this.right, absolute.right) || !Dp.m5188equalsimpl0(this.bottom, absolute.bottom)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((Dp.m5189hashCodeimpl(this.left) * 31) + Dp.m5189hashCodeimpl(this.top)) * 31) + Dp.m5189hashCodeimpl(this.right)) * 31) + Dp.m5189hashCodeimpl(this.bottom);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) Dp.m5194toStringimpl(this.left)) + ", top=" + ((Object) Dp.m5194toStringimpl(this.top)) + ", right=" + ((Object) Dp.m5194toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m5194toStringimpl(this.bottom)) + ')';
        }

        private Absolute(float f8, float f9, float f10, float f11) {
            this.left = f8;
            this.top = f9;
            this.right = f10;
            this.bottom = f11;
        }

        public /* synthetic */ Absolute(float f8, float f9, float f10, float f11, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? Dp.m5183constructorimpl(0) : f8, (i8 & 2) != 0 ? Dp.m5183constructorimpl(0) : f9, (i8 & 4) != 0 ? Dp.m5183constructorimpl(0) : f10, (i8 & 8) != 0 ? Dp.m5183constructorimpl(0) : f11, null);
        }
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo555calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo556calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo557calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo558calculateTopPaddingD9Ej5fM();
}
