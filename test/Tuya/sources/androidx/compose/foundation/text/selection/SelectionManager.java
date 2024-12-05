package androidx.compose.foundation.text.selection;

import L5.I;
import L5.r;
import M5.Q;
import P5.d;
import X5.o;
import X5.q;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.R0;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class SelectionManager {
    private final MutableState<Selection> _selection;
    private ClipboardManager clipboardManager;
    private LayoutCoordinates containerLayoutCoordinates;
    private final MutableState currentDragPosition$delegate;
    private final MutableState dragBeginPosition$delegate;
    private final MutableState dragTotalDistance$delegate;
    private final MutableState draggingHandle$delegate;
    private final MutableState endHandlePosition$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MutableState hasFocus$delegate;
    private Function1 onSelectionChange;
    private Offset previousPosition;
    private final SelectionRegistrarImpl selectionRegistrar;
    private final MutableState startHandlePosition$delegate;
    private TextToolbar textToolbar;
    private boolean touchMode;

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f6487a;
        }

        public final void invoke(long j8) {
            Selection selection;
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection2 = SelectionManager.this.getSelection();
            if ((selection2 == null || (start = selection2.getStart()) == null || j8 != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j8 != end.getSelectableId())) {
                return;
            }
            SelectionManager.this.updateHandleOffsets();
            SelectionManager.this.updateSelectionToolbarPosition();
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends AbstractC3160z implements o {
        AnonymousClass2() {
            super(3);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m1057invoked4ec7I((LayoutCoordinates) obj, ((Offset) obj2).m2745unboximpl(), (SelectionAdjustment) obj3);
            return I.f6487a;
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final void m1057invoked4ec7I(LayoutCoordinates layoutCoordinates, long j8, SelectionAdjustment selectionMode) {
            AbstractC3159y.i(layoutCoordinates, "layoutCoordinates");
            AbstractC3159y.i(selectionMode, "selectionMode");
            Offset m1042convertToContainerCoordinatesQ7Q5hAU = SelectionManager.this.m1042convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j8);
            if (m1042convertToContainerCoordinatesQ7Q5hAU != null) {
                SelectionManager.this.m1048startSelection9KIMszo(m1042convertToContainerCoordinatesQ7Q5hAU.m2745unboximpl(), false, selectionMode);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends AbstractC3160z implements Function1 {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f6487a;
        }

        public final void invoke(long j8) {
            SelectionManager selectionManager = SelectionManager.this;
            r selectAll$foundation_release = selectionManager.selectAll$foundation_release(j8, selectionManager.getSelection());
            Selection selection = (Selection) selectAll$foundation_release.a();
            Map<Long, Selection> map = (Map) selectAll$foundation_release.b();
            if (!AbstractC3159y.d(selection, SelectionManager.this.getSelection())) {
                SelectionManager.this.selectionRegistrar.setSubselections(map);
                SelectionManager.this.getOnSelectionChange().invoke(selection);
            }
            SelectionManager.this.getFocusRequester().requestFocus();
            SelectionManager.this.hideSelectionToolbar$foundation_release();
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends AbstractC3160z implements q {
        AnonymousClass4() {
            super(5);
        }

        @Override // X5.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m1058invoke5iVPX68((LayoutCoordinates) obj, ((Offset) obj2).m2745unboximpl(), ((Offset) obj3).m2745unboximpl(), ((Boolean) obj4).booleanValue(), (SelectionAdjustment) obj5);
        }

        /* renamed from: invoke-5iVPX68, reason: not valid java name */
        public final Boolean m1058invoke5iVPX68(LayoutCoordinates layoutCoordinates, long j8, long j9, boolean z8, SelectionAdjustment selectionMode) {
            AbstractC3159y.i(layoutCoordinates, "layoutCoordinates");
            AbstractC3159y.i(selectionMode, "selectionMode");
            return Boolean.valueOf(SelectionManager.this.m1056updateSelectionRHHTvR4$foundation_release(SelectionManager.this.m1042convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j8), SelectionManager.this.m1042convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j9), z8, selectionMode));
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends AbstractC3160z implements Function0 {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1059invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1059invoke() {
            SelectionManager.this.showSelectionToolbar$foundation_release();
            SelectionManager.this.setDraggingHandle(null);
            SelectionManager.this.m1043setCurrentDragPosition_kEHs6E(null);
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends AbstractC3160z implements Function1 {
        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f6487a;
        }

        public final void invoke(long j8) {
            if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j8))) {
                SelectionManager.this.onRelease();
                SelectionManager.this.setSelection(null);
            }
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends AbstractC3160z implements Function1 {
        AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f6487a;
        }

        public final void invoke(long j8) {
            Selection selection;
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection2 = SelectionManager.this.getSelection();
            if ((selection2 == null || (start = selection2.getStart()) == null || j8 != start.getSelectableId()) && ((selection = SelectionManager.this.getSelection()) == null || (end = selection.getEnd()) == null || j8 != end.getSelectableId())) {
                return;
            }
            SelectionManager.this.m1047setStartHandlePosition_kEHs6E(null);
            SelectionManager.this.m1046setEndHandlePosition_kEHs6E(null);
        }
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrar) {
        MutableState<Selection> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        AbstractC3159y.i(selectionRegistrar, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrar;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selection = mutableStateOf$default;
        this.touchMode = true;
        this.onSelectionChange = SelectionManager$onSelectionChange$1.INSTANCE;
        this.focusRequester = new FocusRequester();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default2;
        Offset.Companion companion = Offset.Companion;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2724boximpl(companion.m2751getZeroF1C5BW0()), null, 2, null);
        this.dragBeginPosition$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2724boximpl(companion.m2751getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.startHandlePosition$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = mutableStateOf$default8;
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new AnonymousClass1());
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new AnonymousClass2());
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new AnonymousClass3());
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new AnonymousClass4());
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new AnonymousClass5());
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new AnonymousClass6());
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-Q7Q5hAU, reason: not valid java name */
    public final Offset m1042convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long j8) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 != null && layoutCoordinates2.isAttached()) {
            return Offset.m2724boximpl(requireContainerCoordinates$foundation_release().mo4139localPositionOfR5De75A(layoutCoordinates, j8));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1 function1, d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(function1, null), dVar);
        if (awaitEachGesture == Q5.b.e()) {
            return awaitEachGesture;
        }
        return I.f6487a;
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection selection = getSelection();
        if (selection == null) {
            return Rect.Companion.getZero();
        }
        Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
        Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
        if (anchorSelectable$foundation_release != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null) {
            if (anchorSelectable$foundation_release2 != null && (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) != null) {
                LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
                if (layoutCoordinates3 != null && layoutCoordinates3.isAttached()) {
                    long mo4139localPositionOfR5De75A = layoutCoordinates3.mo4139localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo1011getHandlePositiondBAh8RU(selection, true));
                    long mo4139localPositionOfR5De75A2 = layoutCoordinates3.mo4139localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo1011getHandlePositiondBAh8RU(selection, false));
                    long mo4140localToRootMKHz9U = layoutCoordinates3.mo4140localToRootMKHz9U(mo4139localPositionOfR5De75A);
                    long mo4140localToRootMKHz9U2 = layoutCoordinates3.mo4140localToRootMKHz9U(mo4139localPositionOfR5De75A2);
                    return new Rect(Math.min(Offset.m2735getXimpl(mo4140localToRootMKHz9U), Offset.m2735getXimpl(mo4140localToRootMKHz9U2)), Math.min(Offset.m2736getYimpl(layoutCoordinates3.mo4140localToRootMKHz9U(layoutCoordinates3.mo4139localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m2736getYimpl(layoutCoordinates3.mo4140localToRootMKHz9U(layoutCoordinates3.mo4139localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m2735getXimpl(mo4140localToRootMKHz9U), Offset.m2735getXimpl(mo4140localToRootMKHz9U2)), Math.max(Offset.m2736getYimpl(mo4140localToRootMKHz9U), Offset.m2736getYimpl(mo4140localToRootMKHz9U2)) + ((float) (SelectionHandlesKt.getHandleHeight() * 4.0d)));
                }
                return Rect.Companion.getZero();
            }
            return Rect.Companion.getZero();
        }
        return Rect.Companion.getZero();
    }

    private final boolean getShouldShowMagnifier() {
        if (getDraggingHandle() != null) {
            return true;
        }
        return false;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0 function0) {
        if (getHasFocus()) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, I.f6487a, new SelectionManager$onClearSelectionRequested$1(this, function0, null));
        }
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1043setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m1044setDragBeginPositionk4lQ0M(long j8) {
        this.dragBeginPosition$delegate.setValue(Offset.m2724boximpl(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m1045setDragTotalDistancek4lQ0M(long j8) {
        this.dragTotalDistance$delegate.setValue(Offset.m2724boximpl(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1046setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1047setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m1048startSelection9KIMszo(long j8, boolean z8, SelectionAdjustment selectionAdjustment) {
        m1055updateSelection3R_tFg$foundation_release(j8, j8, null, z8, selectionAdjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selectable selectable;
        Selectable selectable2;
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        Offset offset = null;
        if (selection != null && (start = selection.getStart()) != null) {
            selectable = getAnchorSelectable$foundation_release(start);
        } else {
            selectable = null;
        }
        if (selection != null && (end = selection.getEnd()) != null) {
            selectable2 = getAnchorSelectable$foundation_release(end);
        } else {
            selectable2 = null;
        }
        if (selectable != null) {
            layoutCoordinates = selectable.getLayoutCoordinates();
        } else {
            layoutCoordinates = null;
        }
        if (selectable2 != null) {
            layoutCoordinates2 = selectable2.getLayoutCoordinates();
        } else {
            layoutCoordinates2 = null;
        }
        if (selection != null && layoutCoordinates3 != null && layoutCoordinates3.isAttached() && layoutCoordinates != null && layoutCoordinates2 != null) {
            long mo4139localPositionOfR5De75A = layoutCoordinates3.mo4139localPositionOfR5De75A(layoutCoordinates, selectable.mo1011getHandlePositiondBAh8RU(selection, true));
            long mo4139localPositionOfR5De75A2 = layoutCoordinates3.mo4139localPositionOfR5De75A(layoutCoordinates2, selectable2.mo1011getHandlePositiondBAh8RU(selection, false));
            Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates3);
            Offset m2724boximpl = Offset.m2724boximpl(mo4139localPositionOfR5De75A);
            m2724boximpl.m2745unboximpl();
            if (!SelectionManagerKt.m1065containsInclusiveUv8p0NA(visibleBounds, mo4139localPositionOfR5De75A) && getDraggingHandle() != Handle.SelectionStart) {
                m2724boximpl = null;
            }
            m1047setStartHandlePosition_kEHs6E(m2724boximpl);
            Offset m2724boximpl2 = Offset.m2724boximpl(mo4139localPositionOfR5De75A2);
            m2724boximpl2.m2745unboximpl();
            if (SelectionManagerKt.m1065containsInclusiveUv8p0NA(visibleBounds, mo4139localPositionOfR5De75A2) || getDraggingHandle() == Handle.SelectionEnd) {
                offset = m2724boximpl2;
            }
            m1046setEndHandlePosition_kEHs6E(offset);
            return;
        }
        m1047setStartHandlePosition_kEHs6E(null);
        m1046setEndHandlePosition_kEHs6E(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        TextToolbarStatus textToolbarStatus;
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if (textToolbar != null) {
                textToolbarStatus = textToolbar.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1049contextMenuOpenAdjustmentk4lQ0M(long j8) {
        boolean z8;
        Selection selection = getSelection();
        if (selection != null) {
            z8 = TextRange.m4686getCollapsedimpl(selection.m1019toTextRanged9O1mEE());
        } else {
            z8 = true;
        }
        if (z8) {
            m1048startSelection9KIMszo(j8, true, SelectionAdjustment.Companion.getWord());
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null && (clipboardManager = this.clipboardManager) != null) {
            clipboardManager.setText(selectedText$foundation_release);
        }
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchor) {
        AbstractC3159y.i(anchor, "anchor");
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(anchor.getSelectableId()));
    }

    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1050getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1051getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m2745unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1052getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m2745unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1053getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final Modifier getModifier() {
        Modifier modifier = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifier, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.focusRequester), new SelectionManager$modifier$3(this)), false, null, 3, null), new SelectionManager$modifier$4(this));
        if (getShouldShowMagnifier()) {
            modifier = SelectionManager_androidKt.selectionMagnifier(modifier, this);
        }
        return onKeyEvent.then(modifier);
    }

    public final Function1 getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString plus;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection == null) {
            return null;
        }
        int size = sort.size();
        for (int i8 = 0; i8 < size; i8++) {
            Selectable selectable = sort.get(i8);
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                if (annotatedString != null && (plus = annotatedString.plus(currentSelectedText)) != null) {
                    currentSelectedText = plus;
                }
                if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                    return currentSelectedText;
                }
                annotatedString = currentSelectedText;
            }
        }
        return annotatedString;
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1054getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    public final TextDragObserver handleDragObserver(final boolean z8) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1043setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo925onDownk4lQ0M(long j8) {
                Selection.AnchorInfo end;
                LayoutCoordinates layoutCoordinates;
                Handle handle;
                Selection selection = SelectionManager.this.getSelection();
                if (selection == null) {
                    return;
                }
                if (z8) {
                    end = selection.getStart();
                } else {
                    end = selection.getEnd();
                }
                Selectable anchorSelectable$foundation_release = SelectionManager.this.getAnchorSelectable$foundation_release(end);
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long m1029getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1029getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo1011getHandlePositiondBAh8RU(selection, z8));
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m1043setCurrentDragPosition_kEHs6E(Offset.m2724boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo4139localPositionOfR5De75A(layoutCoordinates, m1029getAdjustedCoordinatesk4lQ0M)));
                SelectionManager selectionManager2 = SelectionManager.this;
                if (z8) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                selectionManager2.setDraggingHandle(handle);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo926onDragk4lQ0M(long j8) {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m1045setDragTotalDistancek4lQ0M(Offset.m2740plusMKHz9U(selectionManager.m1052getDragTotalDistanceF1C5BW0$foundation_release(), j8));
                long m2740plusMKHz9U = Offset.m2740plusMKHz9U(SelectionManager.this.m1051getDragBeginPositionF1C5BW0$foundation_release(), SelectionManager.this.m1052getDragTotalDistanceF1C5BW0$foundation_release());
                if (SelectionManager.this.m1056updateSelectionRHHTvR4$foundation_release(Offset.m2724boximpl(m2740plusMKHz9U), Offset.m2724boximpl(SelectionManager.this.m1051getDragBeginPositionF1C5BW0$foundation_release()), z8, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    SelectionManager.this.m1044setDragBeginPositionk4lQ0M(m2740plusMKHz9U);
                    SelectionManager.this.m1045setDragTotalDistancek4lQ0M(Offset.Companion.m2751getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo927onStartk4lQ0M(long j8) {
                long mo1011getHandlePositiondBAh8RU;
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                AbstractC3159y.f(selection);
                Selectable selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                LayoutCoordinates layoutCoordinates = null;
                if (z8) {
                    if (selectable != null) {
                        layoutCoordinates = selectable.getLayoutCoordinates();
                    }
                    AbstractC3159y.f(layoutCoordinates);
                } else {
                    if (selectable2 != null) {
                        layoutCoordinates = selectable2.getLayoutCoordinates();
                    }
                    AbstractC3159y.f(layoutCoordinates);
                }
                if (z8) {
                    AbstractC3159y.f(selectable);
                    mo1011getHandlePositiondBAh8RU = selectable.mo1011getHandlePositiondBAh8RU(selection, true);
                } else {
                    AbstractC3159y.f(selectable2);
                    mo1011getHandlePositiondBAh8RU = selectable2.mo1011getHandlePositiondBAh8RU(selection, false);
                }
                long m1029getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1029getAdjustedCoordinatesk4lQ0M(mo1011getHandlePositiondBAh8RU);
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m1044setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo4139localPositionOfR5De75A(layoutCoordinates, m1029getAdjustedCoordinatesk4lQ0M));
                SelectionManager.this.m1045setDragTotalDistancek4lQ0M(Offset.Companion.m2751getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1043setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1043setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbarStatus textToolbarStatus;
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if (textToolbar2 != null) {
                textToolbarStatus = textToolbar2.getStatus();
            } else {
                textToolbarStatus = null;
            }
            if (textToolbarStatus == TextToolbarStatus.Shown && (textToolbar = this.textToolbar) != null) {
                textToolbar.hide();
            }
        }
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(Q.h());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3562performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3571getTextHandleMove5zf0vsI());
            }
        }
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                return layoutCoordinates;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final r selectAll$foundation_release(long j8, Selection selection) {
        HapticFeedback hapticFeedback;
        Selection selection2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection3 = null;
        for (int i8 = 0; i8 < size; i8++) {
            Selectable selectable = sort.get(i8);
            if (selectable.getSelectableId() == j8) {
                selection2 = selectable.getSelectAllSelection();
            } else {
                selection2 = null;
            }
            if (selection2 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selection2);
            }
            selection3 = SelectionManagerKt.merge(selection3, selection2);
        }
        if (!AbstractC3159y.d(selection3, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3562performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3571getTextHandleMove5zf0vsI());
        }
        return new r(selection3, linkedHashMap);
    }

    public final void setClipboardManager(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        Offset offset;
        this.containerLayoutCoordinates = layoutCoordinates;
        if (getHasFocus() && getSelection() != null) {
            if (layoutCoordinates != null) {
                offset = Offset.m2724boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates));
            } else {
                offset = null;
            }
            if (!AbstractC3159y.d(this.previousPosition, offset)) {
                this.previousPosition = offset;
                updateHandleOffsets();
                updateSelectionToolbarPosition();
            }
        }
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        AbstractC3159y.i(focusRequester, "<set-?>");
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z8) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setOnSelectionChange(Function1 function1) {
        AbstractC3159y.i(function1, "<set-?>");
        this.onSelectionChange = function1;
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setTouchMode(boolean z8) {
        this.touchMode = z8;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus() && getSelection() != null && (textToolbar = this.textToolbar) != null) {
            R0.a(textToolbar, getContentRect(), new SelectionManager$showSelectionToolbar$1$1(this), null, null, null, 28, null);
        }
    }

    /* renamed from: updateSelection-3R_-tFg$foundation_release, reason: not valid java name */
    public final boolean m1055updateSelection3R_tFg$foundation_release(long j8, long j9, Offset offset, boolean z8, SelectionAdjustment adjustment) {
        Handle handle;
        Offset m2724boximpl;
        AbstractC3159y.i(adjustment, "adjustment");
        if (z8) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        setDraggingHandle(handle);
        if (z8) {
            m2724boximpl = Offset.m2724boximpl(j8);
        } else {
            m2724boximpl = Offset.m2724boximpl(j9);
        }
        m1043setCurrentDragPosition_kEHs6E(m2724boximpl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        int i8 = 0;
        boolean z9 = false;
        while (i8 < size) {
            Selectable selectable = sort.get(i8);
            int i9 = i8;
            Selection selection2 = selection;
            r mo1013updateSelectionqCDeeow = selectable.mo1013updateSelectionqCDeeow(j8, j9, offset, z8, requireContainerCoordinates$foundation_release(), adjustment, this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection selection3 = (Selection) mo1013updateSelectionqCDeeow.a();
            boolean booleanValue = ((Boolean) mo1013updateSelectionqCDeeow.b()).booleanValue();
            if (!z9 && !booleanValue) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (selection3 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selection3);
            }
            selection = SelectionManagerKt.merge(selection2, selection3);
            i8 = i9 + 1;
        }
        Selection selection4 = selection;
        if (!AbstractC3159y.d(selection4, getSelection())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3562performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3571getTextHandleMove5zf0vsI());
            }
            this.selectionRegistrar.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selection4);
        }
        return z9;
    }

    /* renamed from: updateSelection-RHHTvR4$foundation_release, reason: not valid java name */
    public final boolean m1056updateSelectionRHHTvR4$foundation_release(Offset offset, Offset offset2, boolean z8, SelectionAdjustment adjustment) {
        Selection selection;
        long selectableId;
        Offset m1042convertToContainerCoordinatesQ7Q5hAU;
        long j8;
        AbstractC3159y.i(adjustment, "adjustment");
        if (offset == null || (selection = getSelection()) == null) {
            return false;
        }
        if (z8) {
            selectableId = selection.getEnd().getSelectableId();
        } else {
            selectableId = selection.getStart().getSelectableId();
        }
        Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selectableId));
        if (selectable == null) {
            m1042convertToContainerCoordinatesQ7Q5hAU = null;
        } else {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            AbstractC3159y.f(layoutCoordinates);
            m1042convertToContainerCoordinatesQ7Q5hAU = m1042convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, SelectionHandlesKt.m1029getAdjustedCoordinatesk4lQ0M(selectable.mo1011getHandlePositiondBAh8RU(selection, !z8)));
        }
        if (m1042convertToContainerCoordinatesQ7Q5hAU == null) {
            return false;
        }
        long m2745unboximpl = m1042convertToContainerCoordinatesQ7Q5hAU.m2745unboximpl();
        if (z8) {
            j8 = offset.m2745unboximpl();
        } else {
            j8 = m2745unboximpl;
        }
        if (!z8) {
            m2745unboximpl = offset.m2745unboximpl();
        }
        return m1055updateSelection3R_tFg$foundation_release(j8, m2745unboximpl, offset2, z8, adjustment);
    }
}
