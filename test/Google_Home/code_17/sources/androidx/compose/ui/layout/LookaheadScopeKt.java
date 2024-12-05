package androidx.compose.ui.layout;

import a6.InterfaceC1669o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;

/* loaded from: classes.dex */
public final class LookaheadScopeKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @UiComposable
    public static final void LookaheadScope(InterfaceC1669o interfaceC1669o, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1078066484);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(interfaceC1669o)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078066484, i9, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LookaheadScopeImpl(null, 1, 0 == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) rememberedValue;
            LookaheadScopeKt$LookaheadScope$1 lookaheadScopeKt$LookaheadScope$1 = LookaheadScopeKt$LookaheadScope$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-692256719);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(lookaheadScopeKt$LookaheadScope$1);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2505initimpl(m2501constructorimpl, LookaheadScopeKt$LookaheadScope$2$1.INSTANCE);
            Updater.m2508setimpl(m2501constructorimpl, lookaheadScopeImpl, LookaheadScopeKt$LookaheadScope$2$2.INSTANCE);
            interfaceC1669o.invoke(lookaheadScopeImpl, startRestartGroup, Integer.valueOf(((i9 << 3) & 112) | 8));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LookaheadScopeKt$LookaheadScope$4(interfaceC1669o, i8));
        }
    }

    @ExperimentalComposeUiApi
    public static final Modifier intermediateLayout(Modifier modifier, InterfaceC1669o interfaceC1669o) {
        return modifier.then(new IntermediateLayoutElement(interfaceC1669o));
    }
}
