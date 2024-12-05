package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface OnPlacedModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnPlacedModifier onPlacedModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(onPlacedModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(OnPlacedModifier onPlacedModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(onPlacedModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(OnPlacedModifier onPlacedModifier, R r8, X5.n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(onPlacedModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(OnPlacedModifier onPlacedModifier, R r8, X5.n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(onPlacedModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(OnPlacedModifier onPlacedModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(onPlacedModifier, modifier);
            return a8;
        }
    }

    void onPlaced(LayoutCoordinates layoutCoordinates);
}
