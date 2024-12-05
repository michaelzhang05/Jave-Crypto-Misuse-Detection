package androidx.compose.ui.layout;

import L5.I;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import i6.M;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntermediateLayoutModifierNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private LookaheadScope closestLookaheadScope;
    private IntermediateMeasurablePlaceable intermediateMeasurable;
    private final IntermediateMeasureScopeImpl intermediateMeasureScope = new IntermediateMeasureScopeImpl();
    private boolean isIntermediateChangeActive;
    private final LookaheadScopeImpl localLookaheadScope;
    private Constraints lookaheadConstraints;
    private X5.o measureBlock;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class IntermediateMeasurablePlaceable extends Placeable implements Measurable {
        private Measurable wrappedMeasurable;
        private Placeable wrappedPlaceable;

        public IntermediateMeasurablePlaceable(Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            Placeable placeable = this.wrappedPlaceable;
            AbstractC3159y.f(placeable);
            return placeable.get(alignmentLine);
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.wrappedMeasurable.getParentData();
        }

        public final Measurable getWrappedMeasurable() {
            return this.wrappedMeasurable;
        }

        public final Placeable getWrappedPlaceable() {
            return this.wrappedPlaceable;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i8) {
            return this.wrappedMeasurable.maxIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i8) {
            return this.wrappedMeasurable.maxIntrinsicWidth(i8);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4131measureBRTryo0(long j8) {
            Placeable mo4131measureBRTryo0;
            long mo4134getLookaheadSizeYbymL2g;
            if (IntermediateLayoutModifierNode.this.isIntermediateChangeActive()) {
                mo4131measureBRTryo0 = this.wrappedMeasurable.mo4131measureBRTryo0(j8);
                m4168setMeasurementConstraintsBRTryo0(j8);
                m4167setMeasuredSizeozmzZPI(IntSizeKt.IntSize(mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight()));
            } else {
                Measurable measurable = this.wrappedMeasurable;
                Constraints constraints = IntermediateLayoutModifierNode.this.lookaheadConstraints;
                AbstractC3159y.f(constraints);
                mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(constraints.m5152unboximpl());
                IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
                Constraints constraints2 = intermediateLayoutModifierNode.lookaheadConstraints;
                AbstractC3159y.f(constraints2);
                m4168setMeasurementConstraintsBRTryo0(constraints2.m5152unboximpl());
                if (intermediateLayoutModifierNode.isIntermediateChangeActive()) {
                    mo4134getLookaheadSizeYbymL2g = IntSizeKt.IntSize(mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight());
                } else {
                    mo4134getLookaheadSizeYbymL2g = intermediateLayoutModifierNode.intermediateMeasureScope.mo4134getLookaheadSizeYbymL2g();
                }
                m4167setMeasuredSizeozmzZPI(mo4134getLookaheadSizeYbymL2g);
            }
            this.wrappedPlaceable = mo4131measureBRTryo0;
            return this;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i8) {
            return this.wrappedMeasurable.minIntrinsicHeight(i8);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i8) {
            return this.wrappedMeasurable.minIntrinsicWidth(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4132placeAtf8xVGno(long j8, float f8, Function1 function1) {
            I i8;
            if (!IntermediateLayoutModifierNode.this.isIntermediateChangeActive()) {
                j8 = IntOffset.Companion.m5312getZeronOccac();
            }
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getNode().getCoordinator$ui_release();
            AbstractC3159y.f(coordinator$ui_release);
            Placeable.PlacementScope placementScope = coordinator$ui_release.getPlacementScope();
            if (function1 != null) {
                Placeable placeable = this.wrappedPlaceable;
                if (placeable != null) {
                    placementScope.m4178placeWithLayeraW9wM(placeable, j8, f8, function1);
                    i8 = I.f6487a;
                } else {
                    i8 = null;
                }
                if (i8 != null) {
                    return;
                }
            }
            Placeable placeable2 = this.wrappedPlaceable;
            if (placeable2 != null) {
                placementScope.m4173place70tqf50(placeable2, j8, f8);
                I i9 = I.f6487a;
            }
        }

        public final void setWrappedMeasurable(Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        public final void setWrappedPlaceable(Placeable placeable) {
            this.wrappedPlaceable = placeable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* loaded from: classes.dex */
    public final class IntermediateMeasureScopeImpl implements IntermediateMeasureScope, M {
        private long lookaheadSize = IntSize.Companion.m5349getZeroYbymL2g();

        public IntermediateMeasureScopeImpl() {
        }

        @Override // androidx.compose.ui.layout.IntermediateMeasureScope, i6.M
        public P5.g getCoroutineContext() {
            return IntermediateLayoutModifierNode.this.getCoroutineScope().getCoroutineContext();
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            AbstractC3159y.f(coordinator$ui_release);
            return coordinator$ui_release.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            AbstractC3159y.f(coordinator$ui_release);
            return coordinator$ui_release.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            AbstractC3159y.f(coordinator$ui_release);
            return coordinator$ui_release.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
            return IntermediateLayoutModifierNode.this.closestLookaheadScope.getLookaheadScopeCoordinates(placementScope);
        }

        @Override // androidx.compose.ui.layout.IntermediateMeasureScope
        /* renamed from: getLookaheadSize-YbymL2g, reason: not valid java name */
        public long mo4134getLookaheadSizeYbymL2g() {
            return this.lookaheadSize;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return false;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i8, final int i9, final Map<AlignmentLine, Integer> map, final Function1 function1) {
            final IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
            return new MeasureResult(i8, i9, map, function1, intermediateLayoutModifierNode) { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl$layout$1
                final /* synthetic */ Function1 $placementBlock;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ IntermediateLayoutModifierNode this$0;
                private final int width;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$placementBlock = function1;
                    this.this$0 = intermediateLayoutModifierNode;
                    this.width = i8;
                    this.height = i9;
                    this.alignmentLines = map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Function1 function12 = this.$placementBlock;
                    NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator$ui_release();
                    AbstractC3159y.f(coordinator$ui_release);
                    function12.invoke(coordinator$ui_release.getPlacementScope());
                }
            };
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        /* renamed from: localLookaheadPositionOf-dBAh8RU, reason: not valid java name */
        public /* synthetic */ long mo4135localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
            return f.a(this, layoutCoordinates, layoutCoordinates2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo441roundToPxR2X_6o(long j8) {
            return androidx.compose.ui.unit.a.a(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo442roundToPx0680j_4(float f8) {
            return androidx.compose.ui.unit.a.b(this, f8);
        }

        /* renamed from: setLookaheadSize-ozmzZPI, reason: not valid java name */
        public void m4136setLookaheadSizeozmzZPI(long j8) {
            this.lookaheadSize = j8;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo443toDpGaN1DYA(long j8) {
            return androidx.compose.ui.unit.b.a(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo444toDpu2uoSUM(float f8) {
            return androidx.compose.ui.unit.a.c(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo446toDpSizekrfVVM(long j8) {
            return androidx.compose.ui.unit.a.e(this, j8);
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
            return IntermediateLayoutModifierNode.this.closestLookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo447toPxR2X_6o(long j8) {
            return androidx.compose.ui.unit.a.f(this, j8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo448toPx0680j_4(float f8) {
            return androidx.compose.ui.unit.a.g(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return androidx.compose.ui.unit.a.h(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo449toSizeXkaWNTQ(long j8) {
            return androidx.compose.ui.unit.a.i(this, j8);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo450toSp0xMU5do(float f8) {
            return androidx.compose.ui.unit.b.b(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo451toSpkPz2Gy4(float f8) {
            return androidx.compose.ui.unit.a.j(this, f8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo445toDpu2uoSUM(int i8) {
            return androidx.compose.ui.unit.a.d(this, i8);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo452toSpkPz2Gy4(int i8) {
            return androidx.compose.ui.unit.a.k(this, i8);
        }
    }

    public IntermediateLayoutModifierNode(X5.o oVar) {
        this.measureBlock = oVar;
        LookaheadScopeImpl lookaheadScopeImpl = new LookaheadScopeImpl(new IntermediateLayoutModifierNode$localLookaheadScope$1(this));
        this.localLookaheadScope = lookaheadScopeImpl;
        this.closestLookaheadScope = lookaheadScopeImpl;
        this.isIntermediateChangeActive = true;
    }

    public final X5.o getMeasureBlock$ui_release() {
        return this.measureBlock;
    }

    /* renamed from: intermediateMeasure-Te-uZzU, reason: not valid java name */
    public final MeasureResult m4133intermediateMeasureTeuZzU(MeasureScope measureScope, Measurable measurable, long j8, long j9, long j10) {
        this.intermediateMeasureScope.m4136setLookaheadSizeozmzZPI(j9);
        this.lookaheadConstraints = Constraints.m5134boximpl(j10);
        IntermediateMeasurablePlaceable intermediateMeasurablePlaceable = this.intermediateMeasurable;
        if (intermediateMeasurablePlaceable == null) {
            intermediateMeasurablePlaceable = new IntermediateMeasurablePlaceable(measurable);
        }
        this.intermediateMeasurable = intermediateMeasurablePlaceable;
        intermediateMeasurablePlaceable.setWrappedMeasurable(measurable);
        return (MeasureResult) this.measureBlock.invoke(this.intermediateMeasureScope, intermediateMeasurablePlaceable, Constraints.m5134boximpl(j8));
    }

    public final boolean isIntermediateChangeActive() {
        return this.isIntermediateChangeActive;
    }

    public final int maxIntermediateIntrinsicHeight$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo4137measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                return (MeasureResult) IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5134boximpl(j8));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final int maxIntermediateIntrinsicWidth$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4137measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                return (MeasureResult) IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5134boximpl(j8));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.a(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.b(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo363measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        Placeable mo4131measureBRTryo0 = measurable.mo4131measureBRTryo0(j8);
        return MeasureScope.CC.q(measureScope, mo4131measureBRTryo0.getWidth(), mo4131measureBRTryo0.getHeight(), null, new IntermediateLayoutModifierNode$measure$1$1(mo4131measureBRTryo0), 4, null);
    }

    public final int minIntermediateIntrinsicHeight$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4137measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                return (MeasureResult) IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5134boximpl(j8));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    public final int minIntermediateIntrinsicWidth$ui_release(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4137measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                return (MeasureResult) IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5134boximpl(j8));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return LayoutModifierNode.CC.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadScopeImpl lookaheadScopeImpl;
        LookaheadScopeImpl lookaheadScopeImpl2;
        NodeChain nodes$ui_release;
        LookaheadDelegate lookaheadDelegate;
        NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
        if (coordinator$ui_release != null && (lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate()) != null) {
            lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates();
        } else {
            lookaheadLayoutCoordinates = null;
        }
        if (lookaheadLayoutCoordinates != null) {
            LayoutNode lookaheadRoot$ui_release = DelegatableNodeKt.requireLayoutNode(this).getLookaheadRoot$ui_release();
            if (lookaheadRoot$ui_release != null && lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
                lookaheadScopeImpl2 = new LookaheadScopeImpl(new IntermediateLayoutModifierNode$onAttach$2(lookaheadRoot$ui_release));
            } else {
                int m4343constructorimpl = NodeKind.m4343constructorimpl(512);
                if (getNode().isAttached()) {
                    Modifier.Node parent$ui_release = getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
                    IntermediateLayoutModifierNode intermediateLayoutModifierNode = null;
                    while (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4343constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    Modifier.Node node = parent$ui_release;
                                    while (node != null) {
                                        if (node instanceof IntermediateLayoutModifierNode) {
                                            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) node;
                                        } else if ((node.getKindSet$ui_release() & m4343constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                            int i8 = 0;
                                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        node = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector.add(node);
                                                            node = null;
                                                        }
                                                        mutableVector.add(delegate$ui_release);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        node = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    }
                    if (intermediateLayoutModifierNode == null || (lookaheadScopeImpl = intermediateLayoutModifierNode.localLookaheadScope) == null) {
                        lookaheadScopeImpl = this.localLookaheadScope;
                    }
                    lookaheadScopeImpl2 = lookaheadScopeImpl;
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            this.closestLookaheadScope = lookaheadScopeImpl2;
            return;
        }
        throw new IllegalStateException("could not fetch lookahead coordinates".toString());
    }

    public final void setIntermediateChangeActive(boolean z8) {
        this.isIntermediateChangeActive = z8;
    }

    public final void setMeasureBlock$ui_release(X5.o oVar) {
        this.measureBlock = oVar;
    }
}
