package androidx.compose.foundation.text.modifiers;

import L5.x;
import M5.Q;
import Z5.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.b;
import androidx.compose.ui.node.h;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    private MultiParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private Function1 onPlaceholderLayout;
    private Function1 onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private Function1 semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, AbstractC3151p abstractC3151p) {
        this(annotatedString, textStyle, resolver, function1, i8, z8, i9, i10, list, function12, selectionController, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        AbstractC3159y.f(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        AbstractC3159y.i(semanticsPropertyReceiver, "<this>");
        Function1 function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new TextAnnotatedStringNode$applySemantics$1(this);
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, function1, 1, null);
    }

    public final void doInvalidations(boolean z8, boolean z9, boolean z10, boolean z11) {
        if (!isAttached()) {
            return;
        }
        if (z9 || (z8 && this.semanticsTextLayoutResult != null)) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (z9 || z10 || z11) {
            getLayoutCache().m985updateZNqEYIc(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if (z8) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        boolean z8;
        long m3007getUnspecified0d7_KjU;
        AbstractC3159y.i(contentDrawScope, "<this>");
        if (!isAttached()) {
            return;
        }
        SelectionController selectionController = this.selectionController;
        if (selectionController != null) {
            selectionController.draw(contentDrawScope);
        }
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        TextLayoutResult textLayoutResult = getLayoutCache().getTextLayoutResult();
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5124equalsimpl0(this.overflow, TextOverflow.Companion.m5133getVisiblegIe3tQ8())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            Rect m2775Recttz77jQw = RectKt.m2775Recttz77jQw(Offset.Companion.m2751getZeroF1C5BW0(), SizeKt.Size(IntSize.m5344getWidthimpl(textLayoutResult.m4665getSizeYbymL2g()), IntSize.m5343getHeightimpl(textLayoutResult.m4665getSizeYbymL2g())));
            canvas.save();
            T.o(canvas, m2775Recttz77jQw, 0, 2, null);
        }
        try {
            TextDecoration textDecoration = this.style.getTextDecoration();
            if (textDecoration == null) {
                textDecoration = TextDecoration.Companion.getNone();
            }
            TextDecoration textDecoration2 = textDecoration;
            Shadow shadow = this.style.getShadow();
            if (shadow == null) {
                shadow = Shadow.Companion.getNone();
            }
            Shadow shadow2 = shadow;
            DrawStyle drawStyle = this.style.getDrawStyle();
            if (drawStyle == null) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            Brush brush = this.style.getBrush();
            if (brush != null) {
                MultiParagraph.m4570painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                ColorProducer colorProducer = this.overrideColor;
                if (colorProducer != null) {
                    m3007getUnspecified0d7_KjU = colorProducer.mo1417invoke0d7_KjU();
                } else {
                    m3007getUnspecified0d7_KjU = Color.Companion.m3007getUnspecified0d7_KjU();
                }
                Color.Companion companion = Color.Companion;
                if (m3007getUnspecified0d7_KjU == companion.m3007getUnspecified0d7_KjU()) {
                    if (this.style.m4722getColor0d7_KjU() != companion.m3007getUnspecified0d7_KjU()) {
                        m3007getUnspecified0d7_KjU = this.style.m4722getColor0d7_KjU();
                    } else {
                        m3007getUnspecified0d7_KjU = companion.m2997getBlack0d7_KjU();
                    }
                }
                MultiParagraph.m4568paintLG529CI$default(multiParagraph, canvas, m3007getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
            if (z8) {
                canvas.restore();
            }
            List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
            if (list != null && !list.isEmpty()) {
                contentDrawScope.drawContent();
            }
        } catch (Throwable th) {
            if (z8) {
                canvas.restore();
            }
            throw th;
        }
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        AbstractC3159y.i(contentDrawScope, "contentDrawScope");
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return h.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return h.b(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i8, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "intrinsicMeasureScope");
        AbstractC3159y.i(measurable, "measurable");
        return maxIntrinsicHeight(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "intrinsicMeasureScope");
        AbstractC3159y.i(measurable, "measurable");
        return maxIntrinsicWidth(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo363measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3159y.i(measure, "$this$measure");
        AbstractC3159y.i(measurable, "measurable");
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measure);
        boolean m984layoutWithConstraintsK40F9xA = layoutCache.m984layoutWithConstraintsK40F9xA(j8, measure.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (m984layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Function1 function1 = this.onTextLayout;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            this.baselineCache = Q.k(x.a(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(a.d(textLayoutResult.getFirstBaseline()))), x.a(AlignmentLineKt.getLastBaseline(), Integer.valueOf(a.d(textLayoutResult.getLastBaseline()))));
        }
        Function1 function12 = this.onPlaceholderLayout;
        if (function12 != null) {
            function12.invoke(textLayoutResult.getPlaceholderRects());
        }
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(Constraints.Companion.m5154fixedJhjzzOo(IntSize.m5344getWidthimpl(textLayoutResult.m4665getSizeYbymL2g()), IntSize.m5343getHeightimpl(textLayoutResult.m4665getSizeYbymL2g())));
        int m5344getWidthimpl = IntSize.m5344getWidthimpl(textLayoutResult.m4665getSizeYbymL2g());
        int m5343getHeightimpl = IntSize.m5343getHeightimpl(textLayoutResult.m4665getSizeYbymL2g());
        Map<AlignmentLine, Integer> map = this.baselineCache;
        AbstractC3159y.f(map);
        return measure.layout(m5344getWidthimpl, m5343getHeightimpl, map, new TextAnnotatedStringNode$measure$1(mo4131measureBRTryo0));
    }

    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m1002measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        AbstractC3159y.i(measureScope, "measureScope");
        AbstractC3159y.i(measurable, "measurable");
        return mo363measure3p2s80s(measureScope, measurable, j8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i8, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "intrinsicMeasureScope");
        AbstractC3159y.i(measurable, "measurable");
        return minIntrinsicHeight(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "intrinsicMeasureScope");
        AbstractC3159y.i(measurable, "measurable");
        return minIntrinsicWidth(intrinsicMeasureScope, measurable, i8);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        b.a(this);
    }

    public final boolean updateCallbacks(Function1 function1, Function1 function12, SelectionController selectionController) {
        boolean z8;
        if (!AbstractC3159y.d(this.onTextLayout, function1)) {
            this.onTextLayout = function1;
            z8 = true;
        } else {
            z8 = false;
        }
        if (!AbstractC3159y.d(this.onPlaceholderLayout, function12)) {
            this.onPlaceholderLayout = function12;
            z8 = true;
        }
        if (!AbstractC3159y.d(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            return true;
        }
        return z8;
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle style) {
        AbstractC3159y.i(style, "style");
        boolean z8 = !AbstractC3159y.d(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        if (z8 || !style.hasSameDrawAffectingAttributes(this.style)) {
            return true;
        }
        return false;
    }

    /* renamed from: updateLayoutRelatedArgs-MPT68mk, reason: not valid java name */
    public final boolean m1003updateLayoutRelatedArgsMPT68mk(TextStyle style, List<AnnotatedString.Range<Placeholder>> list, int i8, int i9, boolean z8, FontFamily.Resolver fontFamilyResolver, int i10) {
        AbstractC3159y.i(style, "style");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        boolean z9 = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (!AbstractC3159y.d(this.placeholders, list)) {
            this.placeholders = list;
            z9 = true;
        }
        if (this.minLines != i8) {
            this.minLines = i8;
            z9 = true;
        }
        if (this.maxLines != i9) {
            this.maxLines = i9;
            z9 = true;
        }
        if (this.softWrap != z8) {
            this.softWrap = z8;
            z9 = true;
        }
        if (!AbstractC3159y.d(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z9 = true;
        }
        if (!TextOverflow.m5124equalsimpl0(this.overflow, i10)) {
            this.overflow = i10;
            return true;
        }
        return z9;
    }

    public final boolean updateText(AnnotatedString text) {
        AbstractC3159y.i(text, "text");
        if (AbstractC3159y.d(this.text, text)) {
            return false;
        }
        this.text = text;
        return true;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i8, boolean z8, int i9, int i10, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i11, AbstractC3151p abstractC3151p) {
        this(annotatedString, textStyle, resolver, (i11 & 8) != 0 ? null : function1, (i11 & 16) != 0 ? TextOverflow.Companion.m5131getClipgIe3tQ8() : i8, (i11 & 32) != 0 ? true : z8, (i11 & 64) != 0 ? Integer.MAX_VALUE : i9, (i11 & 128) != 0 ? 1 : i10, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : function12, (i11 & 1024) != 0 ? null : selectionController, (i11 & 2048) != 0 ? null : colorProducer, null);
    }

    private TextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i8, boolean z8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(style, "style");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.onTextLayout = function1;
        this.overflow = i8;
        this.softWrap = z8;
        this.maxLines = i9;
        this.minLines = i10;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache();
        layoutCache.setDensity$foundation_release(density);
        return layoutCache;
    }
}
