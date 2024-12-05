package androidx.compose.ui.input.pointer;

import X5.n;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

/* loaded from: classes.dex */
public interface PointerInputScope extends Density {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m4043getExtendedTouchPaddingNHjbRc(PointerInputScope pointerInputScope) {
            long a8;
            a8 = f.a(pointerInputScope);
            return a8;
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope) {
            boolean b8;
            b8 = f.b(pointerInputScope);
            return b8;
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4044roundToPxR2X_6o(PointerInputScope pointerInputScope, long j8) {
            int a8;
            a8 = androidx.compose.ui.unit.a.a(pointerInputScope, j8);
            return a8;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4045roundToPx0680j_4(PointerInputScope pointerInputScope, float f8) {
            int b8;
            b8 = androidx.compose.ui.unit.a.b(pointerInputScope, f8);
            return b8;
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope pointerInputScope, boolean z8) {
            f.c(pointerInputScope, z8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4046toDpGaN1DYA(PointerInputScope pointerInputScope, long j8) {
            float a8;
            a8 = androidx.compose.ui.unit.b.a(pointerInputScope, j8);
            return a8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4047toDpu2uoSUM(PointerInputScope pointerInputScope, float f8) {
            float c8;
            c8 = androidx.compose.ui.unit.a.c(pointerInputScope, f8);
            return c8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4049toDpSizekrfVVM(PointerInputScope pointerInputScope, long j8) {
            long e8;
            e8 = androidx.compose.ui.unit.a.e(pointerInputScope, j8);
            return e8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4050toPxR2X_6o(PointerInputScope pointerInputScope, long j8) {
            float f8;
            f8 = androidx.compose.ui.unit.a.f(pointerInputScope, j8);
            return f8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4051toPx0680j_4(PointerInputScope pointerInputScope, float f8) {
            float g8;
            g8 = androidx.compose.ui.unit.a.g(pointerInputScope, f8);
            return g8;
        }

        @Stable
        @Deprecated
        public static Rect toRect(PointerInputScope pointerInputScope, DpRect dpRect) {
            Rect h8;
            h8 = androidx.compose.ui.unit.a.h(pointerInputScope, dpRect);
            return h8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4052toSizeXkaWNTQ(PointerInputScope pointerInputScope, long j8) {
            long i8;
            i8 = androidx.compose.ui.unit.a.i(pointerInputScope, j8);
            return i8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4053toSp0xMU5do(PointerInputScope pointerInputScope, float f8) {
            long b8;
            b8 = androidx.compose.ui.unit.b.b(pointerInputScope, f8);
            return b8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4054toSpkPz2Gy4(PointerInputScope pointerInputScope, float f8) {
            long j8;
            j8 = androidx.compose.ui.unit.a.j(pointerInputScope, f8);
            return j8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4048toDpu2uoSUM(PointerInputScope pointerInputScope, int i8) {
            float d8;
            d8 = androidx.compose.ui.unit.a.d(pointerInputScope, i8);
            return d8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4055toSpkPz2Gy4(PointerInputScope pointerInputScope, int i8) {
            long k8;
            k8 = androidx.compose.ui.unit.a.k(pointerInputScope, i8);
            return k8;
        }
    }

    <R> Object awaitPointerEventScope(n nVar, P5.d dVar);

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    long mo4041getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo4042getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z8);
}
