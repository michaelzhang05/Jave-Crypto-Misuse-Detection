package androidx.compose.ui.layout;

import a6.InterfaceC1668n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnGloballyPositionedModifier onGloballyPositionedModifier, Function1 function1) {
            return j.a(onGloballyPositionedModifier, function1);
        }

        @Deprecated
        public static boolean any(OnGloballyPositionedModifier onGloballyPositionedModifier, Function1 function1) {
            return j.b(onGloballyPositionedModifier, function1);
        }

        @Deprecated
        public static <R> R foldIn(OnGloballyPositionedModifier onGloballyPositionedModifier, R r8, InterfaceC1668n interfaceC1668n) {
            return (R) j.c(onGloballyPositionedModifier, r8, interfaceC1668n);
        }

        @Deprecated
        public static <R> R foldOut(OnGloballyPositionedModifier onGloballyPositionedModifier, R r8, InterfaceC1668n interfaceC1668n) {
            return (R) j.d(onGloballyPositionedModifier, r8, interfaceC1668n);
        }

        @Deprecated
        public static Modifier then(OnGloballyPositionedModifier onGloballyPositionedModifier, Modifier modifier) {
            return j.e(onGloballyPositionedModifier, modifier);
        }
    }

    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
