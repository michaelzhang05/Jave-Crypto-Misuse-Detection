package androidx.compose.ui.focus;

import X5.n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface FocusEventModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusEventModifier focusEventModifier, Function1 function1) {
            boolean a8;
            a8 = androidx.compose.ui.b.a(focusEventModifier, function1);
            return a8;
        }

        @Deprecated
        public static boolean any(FocusEventModifier focusEventModifier, Function1 function1) {
            boolean b8;
            b8 = androidx.compose.ui.b.b(focusEventModifier, function1);
            return b8;
        }

        @Deprecated
        public static <R> R foldIn(FocusEventModifier focusEventModifier, R r8, n nVar) {
            Object c8;
            c8 = androidx.compose.ui.b.c(focusEventModifier, r8, nVar);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(FocusEventModifier focusEventModifier, R r8, n nVar) {
            Object d8;
            d8 = androidx.compose.ui.b.d(focusEventModifier, r8, nVar);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(FocusEventModifier focusEventModifier, Modifier modifier) {
            Modifier a8;
            a8 = androidx.compose.ui.a.a(focusEventModifier, modifier);
            return a8;
        }
    }

    void onFocusEvent(FocusState focusState);
}
