package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerInputChangeEventProducer {
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    /* loaded from: classes.dex */
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j8, long j9, boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this(j8, j9, z8, i8);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m4021getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        /* renamed from: getType-T8wyACA, reason: not valid java name */
        public final int m4022getTypeT8wyACA() {
            return this.type;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j8, long j9, boolean z8, int i8) {
            this.uptime = j8;
            this.positionOnScreen = j9;
            this.down = z8;
            this.type = i8;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long j8;
        boolean down;
        long mo4088screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i8 = 0; i8 < size; i8++) {
            PointerInputEventData pointerInputEventData = pointers.get(i8);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m4031getIdJ3iCeTQ());
            if (pointerInputData == null) {
                j8 = pointerInputEventData.getUptime();
                mo4088screenToLocalMKHz9U = pointerInputEventData.m4033getPositionF1C5BW0();
                down = false;
            } else {
                long uptime = pointerInputData.getUptime();
                j8 = uptime;
                down = pointerInputData.getDown();
                mo4088screenToLocalMKHz9U = positionCalculator.mo4088screenToLocalMKHz9U(pointerInputData.m4021getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m4031getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m4031getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m4033getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), j8, mo4088screenToLocalMKHz9U, down, false, pointerInputEventData.m4036getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m4035getScrollDeltaF1C5BW0(), pointerInputEventData.m4032getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(pointerInputEventData.m4031getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m4034getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m4036getTypeT8wyACA(), null));
            } else {
                this.previousPointerInputData.remove(pointerInputEventData.m4031getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
