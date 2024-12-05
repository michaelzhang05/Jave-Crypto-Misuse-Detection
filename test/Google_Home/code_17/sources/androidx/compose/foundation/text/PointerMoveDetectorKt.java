package androidx.compose.foundation.text;

import O5.I;
import S5.d;
import T5.b;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.jvm.functions.Function1;
import l6.N;

/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {
    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, d dVar) {
        Object e8 = N.e(new PointerMoveDetectorKt$detectMoves$2(pointerInputScope, pointerEventPass, function1, null), dVar);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f8278a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, function1, dVar);
    }
}
