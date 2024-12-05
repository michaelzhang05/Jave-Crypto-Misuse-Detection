package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    private final Handle handle;
    private final long position;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j8, AbstractC3151p abstractC3151p) {
        this(handle, j8);
    }

    /* renamed from: copy-Uv8p0NA$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m1025copyUv8p0NA$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i8 & 2) != 0) {
            j8 = selectionHandleInfo.position;
        }
        return selectionHandleInfo.m1027copyUv8p0NA(handle, j8);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1026component2F1C5BW0() {
        return this.position;
    }

    /* renamed from: copy-Uv8p0NA, reason: not valid java name */
    public final SelectionHandleInfo m1027copyUv8p0NA(Handle handle, long j8) {
        AbstractC3159y.i(handle, "handle");
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
        return this.handle == selectionHandleInfo.handle && Offset.m2732equalsimpl0(this.position, selectionHandleInfo.position);
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1028getPositionF1C5BW0() {
        return this.position;
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + Offset.m2737hashCodeimpl(this.position);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m2743toStringimpl(this.position)) + ')';
    }

    private SelectionHandleInfo(Handle handle, long j8) {
        AbstractC3159y.i(handle, "handle");
        this.handle = handle;
        this.position = j8;
    }
}
