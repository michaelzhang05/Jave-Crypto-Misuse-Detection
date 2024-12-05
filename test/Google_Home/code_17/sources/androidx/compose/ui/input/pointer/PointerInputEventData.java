package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final boolean issuesEnterExit;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List list, long j12, long j13, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, z8, f8, i8, z9, list, j12, j13);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m4029component1J3iCeTQ() {
        return this.id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m4030component10F1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m4031component11F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m4032component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m4033component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m4034component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.issuesEnterExit;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m4035copyrc8HELY(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List<HistoricalChange> list, long j12, long j13) {
        return new PointerInputEventData(j8, j9, j10, j11, z8, f8, i8, z9, list, j12, j13, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m4003equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m2737equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m2737equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m4082equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && AbstractC3255y.d(this.historical, pointerInputEventData.historical) && Offset.m2737equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m2737equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m4036getIdJ3iCeTQ() {
        return this.id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m4037getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m4038getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m4039getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m4040getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m4041getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m4004hashCodeimpl(this.id) * 31) + androidx.collection.a.a(this.uptime)) * 31) + Offset.m2742hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m2742hashCodeimpl(this.position)) * 31) + androidx.compose.foundation.a.a(this.down)) * 31) + Float.floatToIntBits(this.pressure)) * 31) + PointerType.m4083hashCodeimpl(this.type)) * 31) + androidx.compose.foundation.a.a(this.issuesEnterExit)) * 31) + this.historical.hashCode()) * 31) + Offset.m2742hashCodeimpl(this.scrollDelta)) * 31) + Offset.m2742hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m4005toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m2748toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m2748toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m4084toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m2748toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m2748toStringimpl(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List<HistoricalChange> list, long j12, long j13) {
        this.id = j8;
        this.uptime = j9;
        this.positionOnScreen = j10;
        this.position = j11;
        this.down = z8;
        this.pressure = f8;
        this.type = i8;
        this.issuesEnterExit = z9;
        this.historical = list;
        this.scrollDelta = j12;
        this.originalEventPosition = j13;
    }

    public /* synthetic */ PointerInputEventData(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List list, long j12, long j13, int i9, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, z8, f8, i8, (i9 & 128) != 0 ? false : z9, (i9 & 256) != 0 ? new ArrayList() : list, (i9 & 512) != 0 ? Offset.Companion.m2756getZeroF1C5BW0() : j12, (i9 & 1024) != 0 ? Offset.Companion.m2756getZeroF1C5BW0() : j13, null);
    }
}
