package androidx.compose.foundation.text;

import O5.r;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {
    private static final r EmptyInlineContent = new r(AbstractC1378t.m(), AbstractC1378t.m());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(AnnotatedString text, List<AnnotatedString.Range<InterfaceC1669o>> inlineContents, Composer composer, int i8) {
        AbstractC3255y.i(text, "text");
        AbstractC3255y.i(inlineContents, "inlineContents");
        Composer startRestartGroup = composer.startRestartGroup(-1794596951);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1794596951, i8, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:70)");
        }
        int size = inlineContents.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            AnnotatedString.Range<InterfaceC1669o> range = inlineContents.get(i10);
            InterfaceC1669o component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                    return g.a(this, intrinsicMeasureScope, list, i11);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                    return g.b(this, intrinsicMeasureScope, list, i11);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo137measure3p2s80s(MeasureScope Layout, List<? extends Measurable> children, long j8) {
                    AbstractC3255y.i(Layout, "$this$Layout");
                    AbstractC3255y.i(children, "children");
                    ArrayList arrayList = new ArrayList(children.size());
                    int size2 = children.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList.add(children.get(i11).mo4136measureBRTryo0(j8));
                    }
                    return MeasureScope.CC.q(Layout, Constraints.m5151getMaxWidthimpl(j8), Constraints.m5150getMaxHeightimpl(j8), null, new AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$measure$1(arrayList), 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                    return g.c(this, intrinsicMeasureScope, list, i11);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i11) {
                    return g.d(this, intrinsicMeasureScope, list, i11);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i9);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl, annotatedStringResolveInlineContentKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            component1.invoke(text.subSequence(component2, component3).getText(), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            i10++;
            i9 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AnnotatedStringResolveInlineContentKt$InlineChildren$2(text, inlineContents, i8));
        }
    }

    public static final boolean hasInlineContent(AnnotatedString annotatedString) {
        AbstractC3255y.i(annotatedString, "<this>");
        return annotatedString.hasStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    public static final r resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        AbstractC3255y.i(annotatedString, "<this>");
        if (map != null && !map.isEmpty()) {
            List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = stringAnnotations.size();
            for (int i8 = 0; i8 < size; i8++) {
                AnnotatedString.Range<String> range = stringAnnotations.get(i8);
                InlineTextContent inlineTextContent = map.get(range.getItem());
                if (inlineTextContent != null) {
                    arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                    arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
                }
            }
            return new r(arrayList, arrayList2);
        }
        return EmptyInlineContent;
    }
}
