package androidx.compose.ui.input.pointer;

import a6.InterfaceC1668n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface PointerInputModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(PointerInputModifier pointerInputModifier, Function1 function1) {
            return e.a(pointerInputModifier, function1);
        }

        @Deprecated
        public static boolean any(PointerInputModifier pointerInputModifier, Function1 function1) {
            return e.b(pointerInputModifier, function1);
        }

        @Deprecated
        public static <R> R foldIn(PointerInputModifier pointerInputModifier, R r8, InterfaceC1668n interfaceC1668n) {
            return (R) e.c(pointerInputModifier, r8, interfaceC1668n);
        }

        @Deprecated
        public static <R> R foldOut(PointerInputModifier pointerInputModifier, R r8, InterfaceC1668n interfaceC1668n) {
            return (R) e.d(pointerInputModifier, r8, interfaceC1668n);
        }

        @Deprecated
        public static Modifier then(PointerInputModifier pointerInputModifier, Modifier modifier) {
            return e.e(pointerInputModifier, modifier);
        }
    }

    PointerInputFilter getPointerInputFilter();
}
