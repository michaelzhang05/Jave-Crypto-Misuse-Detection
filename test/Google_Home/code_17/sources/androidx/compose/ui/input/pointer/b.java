package androidx.compose.ui.input.pointer;

import a6.InterfaceC1668n;
import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static long a(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.Companion.m2818getZeroNHjbRc();
    }

    public static Object b(AwaitPointerEventScope awaitPointerEventScope, long j8, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return u(awaitPointerEventScope, j8, interfaceC1668n, dVar);
    }

    public static Object c(AwaitPointerEventScope awaitPointerEventScope, long j8, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return v(awaitPointerEventScope, j8, interfaceC1668n, dVar);
    }

    public static /* synthetic */ Object t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, S5.d dVar, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    public static /* synthetic */ Object u(AwaitPointerEventScope awaitPointerEventScope, long j8, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return interfaceC1668n.invoke(awaitPointerEventScope, dVar);
    }

    public static /* synthetic */ Object v(AwaitPointerEventScope awaitPointerEventScope, long j8, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return interfaceC1668n.invoke(awaitPointerEventScope, dVar);
    }
}
