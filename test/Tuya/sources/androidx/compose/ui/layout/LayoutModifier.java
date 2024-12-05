package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface LayoutModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(LayoutModifier layoutModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(layoutModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(LayoutModifier layoutModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(layoutModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(LayoutModifier layoutModifier, R r8, X5.n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(layoutModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(LayoutModifier layoutModifier, R r8, X5.n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(layoutModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static int maxIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            int a8;
            a8 = e.a(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i8);
            return a8;
        }

        @Deprecated
        public static int maxIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            int b8;
            b8 = e.b(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i8);
            return b8;
        }

        @Deprecated
        public static int minIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            int c8;
            c8 = e.c(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i8);
            return c8;
        }

        @Deprecated
        public static int minIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            int d8;
            d8 = e.d(layoutModifier, intrinsicMeasureScope, intrinsicMeasurable, i8);
            return d8;
        }

        @Deprecated
        public static Modifier then(LayoutModifier layoutModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(layoutModifier, modifier);
            return a8;
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    /* renamed from: measure-3p2s80s */
    MeasureResult mo156measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);
}
