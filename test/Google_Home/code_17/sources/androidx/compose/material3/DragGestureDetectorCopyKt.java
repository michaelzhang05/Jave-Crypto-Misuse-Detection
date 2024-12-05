package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m5183constructorimpl = Dp.m5183constructorimpl((float) 0.125d);
        mouseSlop = m5183constructorimpl;
        float m5183constructorimpl2 = Dp.m5183constructorimpl(18);
        defaultTouchSlop = m5183constructorimpl2;
        mouseToTouchSlopRatio = m5183constructorimpl / m5183constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011b -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x015c -> B:11:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x017f -> B:14:0x0126). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1609awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, a6.InterfaceC1668n r24, S5.d r25) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m1609awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, a6.n, S5.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r21.invoke(r15, java.lang.Float.valueOf(r8 - (java.lang.Math.signum(r8) * r3)));
     */
    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object m1610awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, int r20, a6.InterfaceC1668n r21, kotlin.jvm.functions.Function1 r22, S5.d r23) {
        /*
            r0 = r17
            r1 = r22
            r2 = r23
            androidx.compose.ui.input.pointer.PointerEvent r3 = r17.getCurrentEvent()
            r4 = r18
            boolean r3 = m1611isPointerUpDmW0f2w(r3, r4)
            r6 = 0
            if (r3 == 0) goto L14
            return r6
        L14:
            androidx.compose.ui.platform.ViewConfiguration r3 = r17.getViewConfiguration()
            r7 = r20
            float r3 = m1612pointerSlopE8SPZFQ(r3, r7)
            r7 = 0
        L1f:
            r8 = 0
        L20:
            r9 = 0
            kotlin.jvm.internal.AbstractC3253w.c(r9)
            r10 = 1
            java.lang.Object r11 = androidx.compose.ui.input.pointer.b.t(r0, r6, r2, r10, r6)
            kotlin.jvm.internal.AbstractC3253w.c(r10)
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
            java.util.List r12 = r11.getChanges()
            int r13 = r12.size()
            r14 = 0
        L37:
            if (r14 >= r13) goto L51
            java.lang.Object r15 = r12.get(r14)
            r16 = r15
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            long r9 = r16.m4019getIdJ3iCeTQ()
            boolean r9 = androidx.compose.ui.input.pointer.PointerId.m4003equalsimpl0(r9, r4)
            if (r9 == 0) goto L4c
            goto L52
        L4c:
            int r14 = r14 + 1
            r9 = 0
            r10 = 1
            goto L37
        L51:
            r15 = r6
        L52:
            kotlin.jvm.internal.AbstractC3255y.f(r15)
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            boolean r9 = r15.isConsumed()
            if (r9 == 0) goto L5e
            return r6
        L5e:
            boolean r9 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r15)
            if (r9 == 0) goto L8b
            java.util.List r4 = r11.getChanges()
            int r5 = r4.size()
            r9 = 0
        L6d:
            if (r9 >= r5) goto L80
            java.lang.Object r10 = r4.get(r9)
            r11 = r10
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L7d
            goto L81
        L7d:
            int r9 = r9 + 1
            goto L6d
        L80:
            r10 = r6
        L81:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L86
            return r6
        L86:
            long r4 = r10.m4019getIdJ3iCeTQ()
            goto L20
        L8b:
            long r9 = r15.m4021getPositionF1C5BW0()
            long r11 = r15.m4022getPreviousPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r9 = androidx.compose.ui.geometry.Offset.m2729boximpl(r9)
            java.lang.Object r9 = r1.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2729boximpl(r11)
            java.lang.Object r10 = r1.invoke(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r9 = r9 - r10
            float r8 = r8 + r9
            float r9 = java.lang.Math.abs(r8)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto Lcd
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r10 = 0
            kotlin.jvm.internal.AbstractC3253w.c(r10)
            r0.awaitPointerEvent(r9, r2)
            r9 = 1
            kotlin.jvm.internal.AbstractC3253w.c(r9)
            boolean r9 = r15.isConsumed()
            if (r9 == 0) goto L20
            return r6
        Lcd:
            float r9 = java.lang.Math.signum(r8)
            float r9 = r9 * r3
            float r8 = r8 - r9
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r9 = r21
            r9.invoke(r15, r8)
            boolean r8 = r15.isConsumed()
            if (r8 == 0) goto L1f
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m1610awaitPointerSlopOrCancellationpn7EDYM(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, a6.n, kotlin.jvm.functions.Function1, S5.d):java.lang.Object");
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m1611isPointerUpDmW0f2w(PointerEvent pointerEvent, long j8) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                pointerInputChange = changes.get(i8);
                if (PointerId.m4003equalsimpl0(pointerInputChange.m4019getIdJ3iCeTQ(), j8)) {
                    break;
                }
                i8++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z8 = true;
        }
        return true ^ z8;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m1612pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i8) {
        AbstractC3255y.i(pointerSlop, "$this$pointerSlop");
        if (PointerType.m4082equalsimpl0(i8, PointerType.Companion.m4087getMouseT8wyACA())) {
            return pointerSlop.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return pointerSlop.getTouchSlop();
    }
}
