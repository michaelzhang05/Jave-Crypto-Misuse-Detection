package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.access$getDefaultConstraints$p();
    private long apparentToRealOffset = IntOffset.Companion.m5317getZeronOccac();

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i8, int i9, float f8, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f8 = 0.0f;
                }
                placementScope.place(placeable, i8, i9, f8);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m4174place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j8, float f8, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    f8 = 0.0f;
                }
                placementScope.m4178place70tqf50(placeable, j8, f8);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i8, int i9, float f8, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f8 = 0.0f;
                }
                placementScope.placeRelative(placeable, i8, i9, f8);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m4175placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j8, float f8, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    f8 = 0.0f;
                }
                placementScope.m4181placeRelative70tqf50(placeable, j8, f8);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i8, int i9, float f8, Function1 function1, int i10, Object obj) {
            float f9;
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f9 = 0.0f;
                } else {
                    f9 = f8;
                }
                if ((i10 & 8) != 0) {
                    function1 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.placeRelativeWithLayer(placeable, i8, i9, f9, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m4176placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j8, float f8, Function1 function1, int i8, Object obj) {
            float f9;
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    f9 = 0.0f;
                } else {
                    f9 = f8;
                }
                if ((i8 & 4) != 0) {
                    function1 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.m4182placeRelativeWithLayeraW9wM(placeable, j8, f9, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i8, int i9, float f8, Function1 function1, int i10, Object obj) {
            float f9;
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    f9 = 0.0f;
                } else {
                    f9 = f8;
                }
                if ((i10 & 8) != 0) {
                    function1 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.placeWithLayer(placeable, i8, i9, f9, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m4177placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j8, float f8, Function1 function1, int i8, Object obj) {
            float f9;
            if (obj == null) {
                if ((i8 & 2) != 0) {
                    f9 = 0.0f;
                } else {
                    f9 = f8;
                }
                if ((i8 & 4) != 0) {
                    function1 = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.m4183placeWithLayeraW9wM(placeable, j8, f9, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i8, int i9, float f8) {
            long IntOffset = IntOffsetKt.IntOffset(i8, i9);
            long j8 = placeable.apparentToRealOffset;
            placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset) + IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(IntOffset) + IntOffset.m5308getYimpl(j8)), f8, null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m4178place70tqf50(Placeable placeable, long j8, float f8) {
            long j9 = placeable.apparentToRealOffset;
            placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(j8) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(j8) + IntOffset.m5308getYimpl(j9)), f8, null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m4179placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j8, float f8, Function1 function1) {
            long j9 = placeable.apparentToRealOffset;
            placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(j8) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(j8) + IntOffset.m5308getYimpl(j9)), f8, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m4180placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j8, float f8, Function1 function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j9 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(j8) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(j8) + IntOffset.m5308getYimpl(j9)), f8, function1);
            } else {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(j8));
                long j10 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset) + IntOffset.m5307getXimpl(j10), IntOffset.m5308getYimpl(IntOffset) + IntOffset.m5308getYimpl(j10)), f8, function1);
            }
        }

        public final void placeRelative(Placeable placeable, int i8, int i9, float f8) {
            long IntOffset = IntOffsetKt.IntOffset(i8, i9);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j8 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset) + IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(IntOffset) + IntOffset.m5308getYimpl(j8)), f8, null);
            } else {
                long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5307getXimpl(IntOffset), IntOffset.m5308getYimpl(IntOffset));
                long j9 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset2) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(IntOffset2) + IntOffset.m5308getYimpl(j9)), f8, null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m4181placeRelative70tqf50(Placeable placeable, long j8, float f8) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j9 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(j8) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(j8) + IntOffset.m5308getYimpl(j9)), f8, null);
            } else {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(j8));
                long j10 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset) + IntOffset.m5307getXimpl(j10), IntOffset.m5308getYimpl(IntOffset) + IntOffset.m5308getYimpl(j10)), f8, null);
            }
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i8, int i9, float f8, Function1 function1) {
            long IntOffset = IntOffsetKt.IntOffset(i8, i9);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j8 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset) + IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(IntOffset) + IntOffset.m5308getYimpl(j8)), f8, function1);
            } else {
                long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5307getXimpl(IntOffset), IntOffset.m5308getYimpl(IntOffset));
                long j9 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset2) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(IntOffset2) + IntOffset.m5308getYimpl(j9)), f8, function1);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m4182placeRelativeWithLayeraW9wM(Placeable placeable, long j8, float f8, Function1 function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j9 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(j8) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(j8) + IntOffset.m5308getYimpl(j9)), f8, function1);
            } else {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(j8));
                long j10 = placeable.apparentToRealOffset;
                placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset) + IntOffset.m5307getXimpl(j10), IntOffset.m5308getYimpl(IntOffset) + IntOffset.m5308getYimpl(j10)), f8, function1);
            }
        }

        public final void placeWithLayer(Placeable placeable, int i8, int i9, float f8, Function1 function1) {
            long IntOffset = IntOffsetKt.IntOffset(i8, i9);
            long j8 = placeable.apparentToRealOffset;
            placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset) + IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(IntOffset) + IntOffset.m5308getYimpl(j8)), f8, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m4183placeWithLayeraW9wM(Placeable placeable, long j8, float f8, Function1 function1) {
            long j9 = placeable.apparentToRealOffset;
            placeable.mo4137placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(j8) + IntOffset.m5307getXimpl(j9), IntOffset.m5308getYimpl(j8) + IntOffset.m5308getYimpl(j9)), f8, function1);
        }
    }

    private final void onMeasuredSizeChanged() {
        this.width = g6.m.k(IntSize.m5349getWidthimpl(this.measuredSize), Constraints.m5153getMinWidthimpl(this.measurementConstraints), Constraints.m5151getMaxWidthimpl(this.measurementConstraints));
        this.height = g6.m.k(IntSize.m5348getHeightimpl(this.measuredSize), Constraints.m5152getMinHeightimpl(this.measurementConstraints), Constraints.m5150getMaxHeightimpl(this.measurementConstraints));
        this.apparentToRealOffset = IntOffsetKt.IntOffset((this.width - IntSize.m5349getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m5348getHeightimpl(this.measuredSize)) / 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m4169getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m5348getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    public final long m4170getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m5349getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    public final long m4171getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public /* synthetic */ Object getParentData() {
        return h.a(this);
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo4137placeAtf8xVGno(long j8, float f8, Function1 function1);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m4172setMeasuredSizeozmzZPI(long j8) {
        if (!IntSize.m5347equalsimpl0(this.measuredSize, j8)) {
            this.measuredSize = j8;
            onMeasuredSizeChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m4173setMeasurementConstraintsBRTryo0(long j8) {
        if (!Constraints.m5144equalsimpl0(this.measurementConstraints, j8)) {
            this.measurementConstraints = j8;
            onMeasuredSizeChanged();
        }
    }
}
