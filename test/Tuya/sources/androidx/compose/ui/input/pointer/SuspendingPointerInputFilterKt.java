package androidx.compose.ui.input.pointer;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(AbstractC1246t.m());
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(n nVar) {
        return new SuspendingPointerInputModifierNodeImpl(nVar);
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    public static final Modifier pointerInput(Modifier modifier, n nVar) {
        throw new IllegalStateException(PointerInputModifierNoParamError.toString());
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, n nVar) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, nVar, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, n nVar) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, nVar, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, n nVar) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, nVar, 3, null));
    }
}
