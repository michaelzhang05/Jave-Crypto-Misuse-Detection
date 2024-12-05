package androidx.compose.ui.input.pointer;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(AbstractC1378t.m());
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(InterfaceC1668n interfaceC1668n) {
        return new SuspendingPointerInputModifierNodeImpl(interfaceC1668n);
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    public static final Modifier pointerInput(Modifier modifier, InterfaceC1668n interfaceC1668n) {
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, InterfaceC1668n interfaceC1668n) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, interfaceC1668n, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, InterfaceC1668n interfaceC1668n) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, interfaceC1668n, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, InterfaceC1668n interfaceC1668n) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, interfaceC1668n, 3, null));
    }
}
