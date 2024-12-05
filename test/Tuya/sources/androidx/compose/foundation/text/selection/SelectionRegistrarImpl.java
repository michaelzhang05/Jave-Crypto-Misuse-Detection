package androidx.compose.foundation.text.selection;

import M5.AbstractC1246t;
import M5.Q;
import X5.n;
import X5.o;
import X5.q;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private Function1 afterSelectableUnsubscribe;
    private Function1 onPositionChangeCallback;
    private Function1 onSelectableChangeCallback;
    private q onSelectionUpdateCallback;
    private Function0 onSelectionUpdateEndCallback;
    private Function1 onSelectionUpdateSelectAll;
    private o onSelectionUpdateStartCallback;
    private boolean sorted;
    private final MutableState subselections$delegate;
    private final List<Selectable> _selectables = new ArrayList();
    private final Map<Long, Selectable> _selectableMap = new LinkedHashMap();
    private AtomicLong incrementId = new AtomicLong(1);

    public SelectionRegistrarImpl() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Q.h(), null, 2, null);
        this.subselections$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(n tmp0, Object obj, Object obj2) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final Function1 getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final Function1 getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final Function1 getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final q getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final Function0 getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final Function1 getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final o getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final Map<Long, Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final boolean getSorted$foundation_release() {
        return this.sorted;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Map<Long, Selection> getSubselections() {
        return (Map) this.subselections$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j8) {
        this.sorted = false;
        Function1 function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j8));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j8) {
        Function1 function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j8));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-5iVPX68 */
    public boolean mo1072notifySelectionUpdate5iVPX68(LayoutCoordinates layoutCoordinates, long j8, long j9, boolean z8, SelectionAdjustment adjustment) {
        AbstractC3159y.i(layoutCoordinates, "layoutCoordinates");
        AbstractC3159y.i(adjustment, "adjustment");
        q qVar = this.onSelectionUpdateCallback;
        if (qVar != null) {
            return ((Boolean) qVar.invoke(layoutCoordinates, Offset.m2724boximpl(j8), Offset.m2724boximpl(j9), Boolean.valueOf(z8), adjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        Function0 function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j8) {
        Function1 function1 = this.onSelectionUpdateSelectAll;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j8));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-d-4ec7I */
    public void mo1073notifySelectionUpdateStartd4ec7I(LayoutCoordinates layoutCoordinates, long j8, SelectionAdjustment adjustment) {
        AbstractC3159y.i(layoutCoordinates, "layoutCoordinates");
        AbstractC3159y.i(adjustment, "adjustment");
        o oVar = this.onSelectionUpdateStartCallback;
        if (oVar != null) {
            oVar.invoke(layoutCoordinates, Offset.m2724boximpl(j8), adjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(Function1 function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    public final void setOnPositionChangeCallback$foundation_release(Function1 function1) {
        this.onPositionChangeCallback = function1;
    }

    public final void setOnSelectableChangeCallback$foundation_release(Function1 function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(q qVar) {
        this.onSelectionUpdateCallback = qVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(Function0 function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(Function1 function1) {
        this.onSelectionUpdateSelectAll = function1;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(o oVar) {
        this.onSelectionUpdateStartCallback = oVar;
    }

    public final void setSorted$foundation_release(boolean z8) {
        this.sorted = z8;
    }

    public void setSubselections(Map<Long, Selection> map) {
        AbstractC3159y.i(map, "<set-?>");
        this.subselections$delegate.setValue(map);
    }

    public final List<Selectable> sort(LayoutCoordinates containerLayoutCoordinates) {
        AbstractC3159y.i(containerLayoutCoordinates, "containerLayoutCoordinates");
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final SelectionRegistrarImpl$sort$1 selectionRegistrarImpl$sort$1 = new SelectionRegistrarImpl$sort$1(containerLayoutCoordinates);
            AbstractC1246t.B(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int sort$lambda$2;
                    sort$lambda$2 = SelectionRegistrarImpl.sort$lambda$2(n.this, obj, obj2);
                    return sort$lambda$2;
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        AbstractC3159y.i(selectable, "selectable");
        if (selectable.getSelectableId() != 0) {
            if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
                this._selectableMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
                this._selectables.add(selectable);
                this.sorted = false;
                return selectable;
            }
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(Selectable selectable) {
        AbstractC3159y.i(selectable, "selectable");
        if (!this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            return;
        }
        this._selectables.remove(selectable);
        this._selectableMap.remove(Long.valueOf(selectable.getSelectableId()));
        Function1 function1 = this.afterSelectableUnsubscribe;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectable.getSelectableId()));
        }
    }
}
