package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;

@Immutable
/* loaded from: classes.dex */
public interface Density extends FontScaling {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5164roundToPxR2X_6o(Density density, long j8) {
            return a.l(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5165roundToPx0680j_4(Density density, float f8) {
            return a.m(density, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5166toDpGaN1DYA(Density density, long j8) {
            return a.n(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5168toDpu2uoSUM(Density density, int i8) {
            return a.p(density, i8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5169toDpSizekrfVVM(Density density, long j8) {
            return a.q(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5170toPxR2X_6o(Density density, long j8) {
            return a.r(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5171toPx0680j_4(Density density, float f8) {
            return a.s(density, f8);
        }

        @Stable
        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return a.t(density, dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5172toSizeXkaWNTQ(Density density, long j8) {
            return a.u(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5173toSp0xMU5do(Density density, float f8) {
            return a.v(density, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5175toSpkPz2Gy4(Density density, int i8) {
            return a.x(density, i8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5167toDpu2uoSUM(Density density, float f8) {
            return a.o(density, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5174toSpkPz2Gy4(Density density, float f8) {
            return a.w(density, f8);
        }
    }

    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    int mo441roundToPxR2X_6o(long j8);

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    int mo442roundToPx0680j_4(float f8);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo444toDpu2uoSUM(float f8);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo445toDpu2uoSUM(int i8);

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    long mo446toDpSizekrfVVM(long j8);

    @Stable
    /* renamed from: toPx--R2X_6o */
    float mo447toPxR2X_6o(long j8);

    @Stable
    /* renamed from: toPx-0680j_4 */
    float mo448toPx0680j_4(float f8);

    @Stable
    Rect toRect(DpRect dpRect);

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    long mo449toSizeXkaWNTQ(long j8);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo451toSpkPz2Gy4(float f8);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo452toSpkPz2Gy4(int i8);
}
