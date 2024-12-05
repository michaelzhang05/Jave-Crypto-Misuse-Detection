package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

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

    public /* synthetic */ PointerInputEventData(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List list, long j12, long j13, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, z8, f8, i8, z9, list, j12, j13);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m4024component1J3iCeTQ() {
        return this.id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m4025component10F1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m4026component11F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m4027component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m4028component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m4029component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.issuesEnterExit;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m4030copyrc8HELY(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List<HistoricalChange> list, long j12, long j13) {
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
        return PointerId.m3998equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m2732equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m2732equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m4077equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && AbstractC3159y.d(this.historical, pointerInputEventData.historical) && Offset.m2732equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m2732equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m4031getIdJ3iCeTQ() {
        return this.id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m4032getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m4033getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m4034getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m4035getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m4036getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m3999hashCodeimpl(this.id) * 31) + androidx.collection.a.a(this.uptime)) * 31) + Offset.m2737hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m2737hashCodeimpl(this.position)) * 31) + androidx.compose.foundation.a.a(this.down)) * 31) + Float.floatToIntBits(this.pressure)) * 31) + PointerType.m4078hashCodeimpl(this.type)) * 31) + androidx.compose.foundation.a.a(this.issuesEnterExit)) * 31) + this.historical.hashCode()) * 31) + Offset.m2737hashCodeimpl(this.scrollDelta)) * 31) + Offset.m2737hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m4000toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m2743toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m2743toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m4079toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m2743toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m2743toStringimpl(this.originalEventPosition)) + ')';
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

    public /* synthetic */ PointerInputEventData(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List list, long j12, long j13, int i9, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, z8, f8, i8, (i9 & 128) != 0 ? false : z9, (i9 & 256) != 0 ? new ArrayList() : list, (i9 & 512) != 0 ? Offset.Companion.m2751getZeroF1C5BW0() : j12, (i9 & 1024) != 0 ? Offset.Companion.m2751getZeroF1C5BW0() : j13, null);
    }
}
