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
        public static int m5169roundToPxR2X_6o(Density density, long j8) {
            return a.l(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5170roundToPx0680j_4(Density density, float f8) {
            return a.m(density, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5171toDpGaN1DYA(Density density, long j8) {
            return a.n(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5173toDpu2uoSUM(Density density, int i8) {
            return a.p(density, i8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5174toDpSizekrfVVM(Density density, long j8) {
            return a.q(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5175toPxR2X_6o(Density density, long j8) {
            return a.r(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5176toPx0680j_4(Density density, float f8) {
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
        public static long m5177toSizeXkaWNTQ(Density density, long j8) {
            return a.u(density, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5178toSp0xMU5do(Density density, float f8) {
            return a.v(density, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5180toSpkPz2Gy4(Density density, int i8) {
            return a.x(density, i8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5172toDpu2uoSUM(Density density, float f8) {
            return a.o(density, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5179toSpkPz2Gy4(Density density, float f8) {
            return a.w(density, f8);
        }
    }

    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    int mo446roundToPxR2X_6o(long j8);

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    int mo447roundToPx0680j_4(float f8);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo449toDpu2uoSUM(float f8);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo450toDpu2uoSUM(int i8);

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    long mo451toDpSizekrfVVM(long j8);

    @Stable
    /* renamed from: toPx--R2X_6o */
    float mo452toPxR2X_6o(long j8);

    @Stable
    /* renamed from: toPx-0680j_4 */
    float mo453toPx0680j_4(float f8);

    @Stable
    Rect toRect(DpRect dpRect);

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    long mo454toSizeXkaWNTQ(long j8);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo456toSpkPz2Gy4(float f8);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo457toSpkPz2Gy4(int i8);
}
