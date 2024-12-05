package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m3949constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m4068constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m3955calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m3955calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.Companion.m3974getScroll7fucELk();
                            case 9:
                                return PointerEventType.Companion.m3969getEnter7fucELk();
                            case 10:
                                return PointerEventType.Companion.m3970getExit7fucELk();
                            default:
                                return PointerEventType.Companion.m3975getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.Companion.m3971getMove7fucELk();
                }
                return PointerEventType.Companion.m3973getRelease7fucELk();
            }
            return PointerEventType.Companion.m3972getPress7fucELk();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            PointerInputChange pointerInputChange = list.get(i8);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m3973getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m3972getPress7fucELk();
            }
        }
        return PointerEventType.Companion.m3971getMove7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> list, MotionEvent motionEvent) {
        boolean z8;
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (AbstractC3159y.d(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            PointerInputChange pointerInputChange = list.get(i8);
            longSparseArray.put(pointerInputChange.m4014getIdJ3iCeTQ(), pointerInputChange);
            long m4014getIdJ3iCeTQ = pointerInputChange.m4014getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long m4016getPositionF1C5BW0 = pointerInputChange.m4016getPositionF1C5BW0();
            long m4016getPositionF1C5BW02 = pointerInputChange.m4016getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int m4019getTypeT8wyACA = pointerInputChange.m4019getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i9 = i8;
            if (internalPointerEvent != null && internalPointerEvent.m3945issuesEnterExitEvent0FcD4WY(pointerInputChange.m4014getIdJ3iCeTQ())) {
                z8 = true;
            } else {
                z8 = false;
            }
            arrayList.add(new PointerInputEventData(m4014getIdJ3iCeTQ, uptimeMillis, m4016getPositionF1C5BW0, m4016getPositionF1C5BW02, pressed, pressure, m4019getTypeT8wyACA, z8, null, 0L, 0L, 1792, null));
            i8 = i9 + 1;
        }
        return new PointerEvent(list, new InternalPointerEvent(longSparseArray, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m3956getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m3957getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m3958getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m3959setTypeEhbLWgg$ui_release(int i8) {
        this.type = i8;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }
}
