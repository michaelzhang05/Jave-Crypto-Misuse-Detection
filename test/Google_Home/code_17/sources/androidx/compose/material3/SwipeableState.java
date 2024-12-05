package androidx.compose.material3;

import O5.I;
import O5.r;
import O5.x;
import P5.Q;
import T5.b;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import g6.m;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final Companion Companion = new Companion(null);
    private final MutableState<Float> absoluteOffset;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final Function1 confirmStateChange;
    private final MutableState currentValue$delegate;
    private final DraggableState draggableState;
    private final MutableState isAnimationRunning$delegate;
    private final InterfaceC3706f latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableState<Float> offsetState;
    private final MutableState<Float> overflowState;
    private final MutableState resistance$delegate;
    private final MutableState thresholds$delegate;
    private final MutableState velocityThreshold$delegate;

    /* renamed from: androidx.compose.material3.SwipeableState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t8) {
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(AnimationSpec<Float> animationSpec, Function1 confirmStateChange) {
            AbstractC3255y.i(animationSpec, "animationSpec");
            AbstractC3255y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(SwipeableState$Companion$Saver$1.INSTANCE, new SwipeableState$Companion$Saver$2(animationSpec, confirmStateChange));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public SwipeableState(T t8, AnimationSpec<Float> animationSpec, Function1 confirmStateChange) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<Float> mutableStateOf$default3;
        MutableState<Float> mutableStateOf$default4;
        MutableState<Float> mutableStateOf$default5;
        MutableState<Float> mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        MutableState mutableStateOf$default10;
        AbstractC3255y.i(animationSpec, "animationSpec");
        AbstractC3255y.i(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isAnimationRunning$delegate = mutableStateOf$default2;
        Float valueOf = Float.valueOf(0.0f);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.offsetState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.overflowState = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.absoluteOffset = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Q.h(), null, 2, null);
        this.anchors$delegate = mutableStateOf$default7;
        final InterfaceC3706f snapshotFlow = SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.latestNonEmptyAnchorsFlow = AbstractC3708h.K(new InterfaceC3706f() { // from class: androidx.compose.material3.SwipeableState$special$$inlined$filter$1

            /* renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements InterfaceC3707g {
                final /* synthetic */ InterfaceC3707g $this_unsafeFlow;

                @f(c = "androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {224}, m = "emit")
                /* renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(S5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC3707g interfaceC3707g) {
                    this.$this_unsafeFlow = interfaceC3707g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // o6.InterfaceC3707g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, S5.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material3.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material3.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = T5.b.e()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        O5.t.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        O5.t.b(r6)
                        o6.g r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L49
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        O5.I r5 = O5.I.f8278a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, S5.d):java.lang.Object");
                }
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                Object collect = InterfaceC3706f.this.collect(new AnonymousClass2(interfaceC3707g), dVar);
                if (collect == b.e()) {
                    return collect;
                }
                return I.f8278a;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SwipeableState$thresholds$2.INSTANCE, null, 2, null);
        this.thresholds$delegate = mutableStateOf$default8;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.velocityThreshold$delegate = mutableStateOf$default9;
        mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.resistance$delegate = mutableStateOf$default10;
        this.draggableState = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f8, AnimationSpec<Float> animationSpec, S5.d dVar) {
        Object a8 = androidx.compose.foundation.gestures.a.a(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f8, animationSpec, null), dVar, 1, null);
        if (a8 == b.e()) {
            return a8;
        }
        return I.f8278a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$material3_release$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, S5.d dVar, int i8, Object obj2) {
        if (obj2 == null) {
            if ((i8 & 2) != 0) {
                animationSpec = swipeableState.animationSpec;
            }
            return swipeableState.animateTo$material3_release(obj, animationSpec, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getDirection$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getProgress$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getTargetValue$material3_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z8) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t8) {
        this.currentValue$delegate.setValue(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f8, S5.d dVar) {
        Object a8 = androidx.compose.foundation.gestures.a.a(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f8, this, null), dVar, 1, null);
        if (a8 == b.e()) {
            return a8;
        }
        return I.f8278a;
    }

    @ExperimentalMaterial3Api
    public final Object animateTo$material3_release(T t8, AnimationSpec<Float> animationSpec, S5.d dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(t8, this, animationSpec), dVar);
        if (collect == b.e()) {
            return collect;
        }
        return I.f8278a;
    }

    public final void ensureInit$material3_release(Map<Float, ? extends T> newAnchors) {
        Float offset;
        AbstractC3255y.i(newAnchors, "newAnchors");
        if (getAnchors$material3_release().isEmpty()) {
            offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset != null) {
                this.offsetState.setValue(offset);
                this.absoluteOffset.setValue(offset);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    public final Map<Float, T> getAnchors$material3_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.animationSpec;
    }

    public final Function1 getConfirmStateChange$material3_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final float getDirection$material3_release() {
        Float offset;
        offset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
        if (offset != null) {
            return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
        }
        return 0.0f;
    }

    public final DraggableState getDraggableState$material3_release() {
        return this.draggableState;
    }

    public final float getMaxBound$material3_release() {
        return this.maxBound;
    }

    public final float getMinBound$material3_release() {
        return this.minBound;
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final SwipeProgress<T> getProgress$material3_release() {
        List findBounds;
        Object currentValue;
        Object obj;
        float f8;
        r a8;
        findBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material3_release().keySet());
        int size = findBounds.size();
        if (size != 0) {
            if (size != 1) {
                if (getDirection$material3_release() > 0.0f) {
                    a8 = x.a(findBounds.get(0), findBounds.get(1));
                } else {
                    a8 = x.a(findBounds.get(1), findBounds.get(0));
                }
                float floatValue = ((Number) a8.a()).floatValue();
                float floatValue2 = ((Number) a8.b()).floatValue();
                obj = Q.i(getAnchors$material3_release(), Float.valueOf(floatValue));
                currentValue = Q.i(getAnchors$material3_release(), Float.valueOf(floatValue2));
                f8 = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
                return new SwipeProgress<>(obj, currentValue, f8);
            }
            Object i8 = Q.i(getAnchors$material3_release(), findBounds.get(0));
            currentValue = Q.i(getAnchors$material3_release(), findBounds.get(0));
            obj = i8;
        } else {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
        }
        f8 = 1.0f;
        return new SwipeProgress<>(obj, currentValue, f8);
    }

    public final ResistanceConfig getResistance$material3_release() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final T getTargetValue$material3_release() {
        Float offset;
        float floatValue;
        float computeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue2 = getOffset().getValue().floatValue();
            offset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
            if (offset != null) {
                floatValue = offset.floatValue();
            } else {
                floatValue = getOffset().getValue().floatValue();
            }
            computeTarget = SwipeableKt.computeTarget(floatValue2, floatValue, getAnchors$material3_release().keySet(), getThresholds$material3_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t8 = getAnchors$material3_release().get(Float.valueOf(computeTarget));
        if (t8 == null) {
            return getCurrentValue();
        }
        return t8;
    }

    public final InterfaceC1668n getThresholds$material3_release() {
        return (InterfaceC1668n) this.thresholds$delegate.getValue();
    }

    public final float getVelocityThreshold$material3_release() {
        return ((Number) this.velocityThreshold$delegate.getValue()).floatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float performDrag$material3_release(float f8) {
        float j8 = m.j(this.absoluteOffset.getValue().floatValue() + f8, this.minBound, this.maxBound) - this.absoluteOffset.getValue().floatValue();
        if (Math.abs(j8) > 0.0f) {
            this.draggableState.dispatchRawDelta(j8);
        }
        return j8;
    }

    public final Object performFling$material3_release(final float f8, S5.d dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new InterfaceC3707g(this) { // from class: androidx.compose.material3.SwipeableState$performFling$2
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // o6.InterfaceC3707g
            public final Object emit(Map<Float, ? extends T> map, S5.d dVar2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                AbstractC3255y.f(offset);
                float floatValue = offset.floatValue();
                computeTarget = SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.this$0.getThresholds$material3_release(), f8, this.this$0.getVelocityThreshold$material3_release());
                Object obj = map.get(kotlin.coroutines.jvm.internal.b.b(computeTarget));
                if (obj != null && ((Boolean) this.this$0.getConfirmStateChange$material3_release().invoke(obj)).booleanValue()) {
                    Object animateTo$material3_release$default = SwipeableState.animateTo$material3_release$default(this.this$0, obj, null, dVar2, 2, null);
                    return animateTo$material3_release$default == b.e() ? animateTo$material3_release$default : I.f8278a;
                }
                SwipeableState<T> swipeableState = this.this$0;
                animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material3_release(), dVar2);
                return animateInternalToOffset == b.e() ? animateInternalToOffset : I.f8278a;
            }
        }, dVar);
        if (collect == b.e()) {
            return collect;
        }
        return I.f8278a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processNewAnchors$material3_release(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, S5.d r12) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState.processNewAnchors$material3_release(java.util.Map, java.util.Map, S5.d):java.lang.Object");
    }

    public final void setAnchors$material3_release(Map<Float, ? extends T> map) {
        AbstractC3255y.i(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final void setMaxBound$material3_release(float f8) {
        this.maxBound = f8;
    }

    public final void setMinBound$material3_release(float f8) {
        this.minBound = f8;
    }

    public final void setResistance$material3_release(ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final void setThresholds$material3_release(InterfaceC1668n interfaceC1668n) {
        AbstractC3255y.i(interfaceC1668n, "<set-?>");
        this.thresholds$delegate.setValue(interfaceC1668n);
    }

    public final void setVelocityThreshold$material3_release(float f8) {
        this.velocityThreshold$delegate.setValue(Float.valueOf(f8));
    }

    @ExperimentalMaterial3Api
    public final Object snapTo$material3_release(T t8, S5.d dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$2(t8, this), dVar);
        if (collect == b.e()) {
            return collect;
        }
        return I.f8278a;
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i8, AbstractC3247p abstractC3247p) {
        this(obj, (i8 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec$material3_release() : animationSpec, (i8 & 4) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
