package androidx.compose.foundation.text.selection;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SelectionContainerKt$SelectionContainer$3$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $children;
    final /* synthetic */ SelectionManager $manager;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1668n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC1668n $children;
        final /* synthetic */ SelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC1668n interfaceC1668n, int i8, SelectionManager selectionManager) {
            super(2);
            this.$children = interfaceC1668n;
            this.$$dirty = i8;
            this.$manager = selectionManager;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i8) {
            Selection selection;
            Offset m1058getEndHandlePosition_m7T9E;
            ResolvedTextDirection direction;
            int i9;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1375295262, i8, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:98)");
            }
            this.$children.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
            if (TouchMode_androidKt.isInTouchMode() && this.$manager.getHasFocus() && (selection = this.$manager.getSelection()) != null) {
                SelectionManager selectionManager = this.$manager;
                List p8 = AbstractC1378t.p(Boolean.TRUE, Boolean.FALSE);
                int size = p8.size();
                for (int i10 = 0; i10 < size; i10 = i9 + 1) {
                    Boolean bool = (Boolean) p8.get(i10);
                    boolean booleanValue = bool.booleanValue();
                    composer.startReplaceableGroup(1157296644);
                    boolean changed = composer.changed(bool);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = selectionManager.handleDragObserver(booleanValue);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                    if (booleanValue) {
                        m1058getEndHandlePosition_m7T9E = selectionManager.m1059getStartHandlePosition_m7T9E();
                    } else {
                        m1058getEndHandlePosition_m7T9E = selectionManager.m1058getEndHandlePosition_m7T9E();
                    }
                    if (booleanValue) {
                        direction = selection.getStart().getDirection();
                    } else {
                        direction = selection.getEnd().getDirection();
                    }
                    if (m1058getEndHandlePosition_m7T9E != null) {
                        i9 = i10;
                        AndroidSelectionHandles_androidKt.m1011SelectionHandle8fL75g(m1058getEndHandlePosition_m7T9E.m2750unboximpl(), booleanValue, direction, selection.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(textDragObserver, null)), null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    } else {
                        i9 = i10;
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3$1(Modifier modifier, SelectionManager selectionManager, InterfaceC1668n interfaceC1668n, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$manager = selectionManager;
        this.$children = interfaceC1668n;
        this.$$dirty = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(935424596, i8, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:95)");
        }
        SimpleLayoutKt.SimpleLayout(this.$modifier.then(this.$manager.getModifier()), ComposableLambdaKt.composableLambda(composer, 1375295262, true, new AnonymousClass1(this.$children, this.$$dirty, this.$manager)), composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
