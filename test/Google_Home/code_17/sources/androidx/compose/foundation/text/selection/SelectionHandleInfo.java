package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    private final Handle handle;
    private final long position;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j8, AbstractC3247p abstractC3247p) {
        this(handle, j8);
    }

    /* renamed from: copy-Uv8p0NA$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m1030copyUv8p0NA$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i8 & 2) != 0) {
            j8 = selectionHandleInfo.position;
        }
        return selectionHandleInfo.m1032copyUv8p0NA(handle, j8);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1031component2F1C5BW0() {
        return this.position;
    }

    /* renamed from: copy-Uv8p0NA, reason: not valid java name */
    public final SelectionHandleInfo m1032copyUv8p0NA(Handle handle, long j8) {
        AbstractC3255y.i(handle, "handle");
        return new SelectionHandleInfo(handle, j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m2737equalsimpl0(this.position, selectionHandleInfo.position);
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1033getPositionF1C5BW0() {
        return this.position;
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + Offset.m2742hashCodeimpl(this.position);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m2748toStringimpl(this.position)) + ')';
    }

    private SelectionHandleInfo(Handle handle, long j8) {
        AbstractC3255y.i(handle, "handle");
        this.handle = handle;
        this.position = j8;
    }
}
