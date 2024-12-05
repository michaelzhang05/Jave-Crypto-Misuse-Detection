package androidx.compose.ui.input.pointer;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m3934getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope awaitPointerEventScope) {
            long a8;
            a8 = b.a(awaitPointerEventScope);
            return a8;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3935roundToPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j8) {
            int a8;
            a8 = androidx.compose.ui.unit.a.a(awaitPointerEventScope, j8);
            return a8;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3936roundToPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f8) {
            int b8;
            b8 = androidx.compose.ui.unit.a.b(awaitPointerEventScope, f8);
            return b8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3937toDpGaN1DYA(AwaitPointerEventScope awaitPointerEventScope, long j8) {
            float a8;
            a8 = androidx.compose.ui.unit.b.a(awaitPointerEventScope, j8);
            return a8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3938toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, float f8) {
            float c8;
            c8 = androidx.compose.ui.unit.a.c(awaitPointerEventScope, f8);
            return c8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3940toDpSizekrfVVM(AwaitPointerEventScope awaitPointerEventScope, long j8) {
            long e8;
            e8 = androidx.compose.ui.unit.a.e(awaitPointerEventScope, j8);
            return e8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3941toPxR2X_6o(AwaitPointerEventScope awaitPointerEventScope, long j8) {
            float f8;
            f8 = androidx.compose.ui.unit.a.f(awaitPointerEventScope, j8);
            return f8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3942toPx0680j_4(AwaitPointerEventScope awaitPointerEventScope, float f8) {
            float g8;
            g8 = androidx.compose.ui.unit.a.g(awaitPointerEventScope, f8);
            return g8;
        }

        @Stable
        @Deprecated
        public static Rect toRect(AwaitPointerEventScope awaitPointerEventScope, DpRect dpRect) {
            Rect h8;
            h8 = androidx.compose.ui.unit.a.h(awaitPointerEventScope, dpRect);
            return h8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3943toSizeXkaWNTQ(AwaitPointerEventScope awaitPointerEventScope, long j8) {
            long i8;
            i8 = androidx.compose.ui.unit.a.i(awaitPointerEventScope, j8);
            return i8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3944toSp0xMU5do(AwaitPointerEventScope awaitPointerEventScope, float f8) {
            long b8;
            b8 = androidx.compose.ui.unit.b.b(awaitPointerEventScope, f8);
            return b8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3945toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, float f8) {
            long j8;
            j8 = androidx.compose.ui.unit.a.j(awaitPointerEventScope, f8);
            return j8;
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope awaitPointerEventScope, long j8, InterfaceC1668n interfaceC1668n, S5.d dVar) {
            Object b8;
            b8 = b.b(awaitPointerEventScope, j8, interfaceC1668n, dVar);
            return b8;
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope awaitPointerEventScope, long j8, InterfaceC1668n interfaceC1668n, S5.d dVar) {
            Object c8;
            c8 = b.c(awaitPointerEventScope, j8, interfaceC1668n, dVar);
            return c8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3939toDpu2uoSUM(AwaitPointerEventScope awaitPointerEventScope, int i8) {
            float d8;
            d8 = androidx.compose.ui.unit.a.d(awaitPointerEventScope, i8);
            return d8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3946toSpkPz2Gy4(AwaitPointerEventScope awaitPointerEventScope, int i8) {
            long k8;
            k8 = androidx.compose.ui.unit.a.k(awaitPointerEventScope, i8);
            return k8;
        }
    }

    Object awaitPointerEvent(PointerEventPass pointerEventPass, S5.d dVar);

    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    long mo3932getExtendedTouchPaddingNHjbRc();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo3933getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    <T> Object withTimeout(long j8, InterfaceC1668n interfaceC1668n, S5.d dVar);

    <T> Object withTimeoutOrNull(long j8, InterfaceC1668n interfaceC1668n, S5.d dVar);
}
