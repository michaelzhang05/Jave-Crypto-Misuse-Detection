package androidx.compose.ui.focus;

import X5.n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface FocusOrderModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier focusOrderModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(focusOrderModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(FocusOrderModifier focusOrderModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(focusOrderModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier focusOrderModifier, R r8, n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(focusOrderModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier focusOrderModifier, R r8, n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(focusOrderModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier focusOrderModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(focusOrderModifier, modifier);
            return a8;
        }
    }

    void populateFocusOrder(FocusOrder focusOrder);
}
