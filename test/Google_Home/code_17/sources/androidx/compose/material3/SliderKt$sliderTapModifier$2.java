package androidx.compose.material3;

import O5.I;
import O5.t;
import S5.d;
import S5.h;
import T5.b;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$2 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<Function0> $gestureEndAction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ int $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", l = {1129}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC1668n {
        final /* synthetic */ DraggableState $draggableState;
        final /* synthetic */ State<Function0> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ int $maxPx;
        final /* synthetic */ MutableState<Float> $pressOffset;
        final /* synthetic */ State<Float> $rawOffset;
        final /* synthetic */ M $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {1134}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03391 extends l implements InterfaceC1669o {
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ int $maxPx;
            final /* synthetic */ MutableState<Float> $pressOffset;
            final /* synthetic */ State<Float> $rawOffset;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03391(boolean z8, int i8, MutableState<Float> mutableState, State<Float> state, d dVar) {
                super(3, dVar);
                this.$isRtl = z8;
                this.$maxPx = i8;
                this.$pressOffset = mutableState;
                this.$rawOffset = state;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m1771invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m2750unboximpl(), (d) obj3);
            }

            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m1771invoked4ec7I(PressGestureScope pressGestureScope, long j8, d dVar) {
                C03391 c03391 = new C03391(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, dVar);
                c03391.L$0 = pressGestureScope;
                c03391.J$0 = j8;
                return c03391.invokeSuspend(I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                float m2740getXimpl;
                Object e8 = b.e();
                int i8 = this.label;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                        long j8 = this.J$0;
                        if (this.$isRtl) {
                            m2740getXimpl = this.$maxPx - Offset.m2740getXimpl(j8);
                        } else {
                            m2740getXimpl = Offset.m2740getXimpl(j8);
                        }
                        this.$pressOffset.setValue(kotlin.coroutines.jvm.internal.b.b(m2740getXimpl - this.$rawOffset.getValue().floatValue()));
                        this.label = 1;
                        if (pressGestureScope.awaitRelease(this) == e8) {
                            return e8;
                        }
                    }
                } catch (GestureCancellationException unused) {
                    this.$pressOffset.setValue(kotlin.coroutines.jvm.internal.b.b(0.0f));
                }
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3256z implements Function1 {
            final /* synthetic */ DraggableState $draggableState;
            final /* synthetic */ State<Function0> $gestureEndAction;
            final /* synthetic */ M $scope;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", l = {1141}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C03401 extends l implements InterfaceC1668n {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function0> $gestureEndAction;
                int label;

                /* JADX INFO: Access modifiers changed from: package-private */
                @f(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C03411 extends l implements InterfaceC1668n {
                    private /* synthetic */ Object L$0;
                    int label;

                    C03411(d dVar) {
                        super(2, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final d create(Object obj, d dVar) {
                        C03411 c03411 = new C03411(dVar);
                        c03411.L$0 = obj;
                        return c03411;
                    }

                    @Override // a6.InterfaceC1668n
                    public final Object invoke(DragScope dragScope, d dVar) {
                        return ((C03411) create(dragScope, dVar)).invokeSuspend(I.f8278a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        b.e();
                        if (this.label == 0) {
                            t.b(obj);
                            ((DragScope) this.L$0).dragBy(0.0f);
                            return I.f8278a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C03401(DraggableState draggableState, State<? extends Function0> state, d dVar) {
                    super(2, dVar);
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new C03401(this.$draggableState, this.$gestureEndAction, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = b.e();
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        DraggableState draggableState = this.$draggableState;
                        MutatePriority mutatePriority = MutatePriority.UserInput;
                        C03411 c03411 = new C03411(null);
                        this.label = 1;
                        if (draggableState.drag(mutatePriority, c03411, this) == e8) {
                            return e8;
                        }
                    }
                    this.$gestureEndAction.getValue().invoke();
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, d dVar) {
                    return ((C03401) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(M m8, DraggableState draggableState, State<? extends Function0> state) {
                super(1);
                this.$scope = m8;
                this.$draggableState = draggableState;
                this.$gestureEndAction = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m1772invokek4lQ0M(((Offset) obj).m2750unboximpl());
                return I.f8278a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1772invokek4lQ0M(long j8) {
                AbstractC3364k.d(this.$scope, null, null, new C03401(this.$draggableState, this.$gestureEndAction, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z8, int i8, MutableState<Float> mutableState, State<Float> state, M m8, DraggableState draggableState, State<? extends Function0> state2, d dVar) {
            super(2, dVar);
            this.$isRtl = z8;
            this.$maxPx = i8;
            this.$pressOffset = mutableState;
            this.$rawOffset = state;
            this.$scope = m8;
            this.$draggableState = draggableState;
            this.$gestureEndAction = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
            return ((AnonymousClass1) create(pointerInputScope, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C03391 c03391 = new C03391(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$draggableState, this.$gestureEndAction);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c03391, anonymousClass2, this, 3, null) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderTapModifier$2(boolean z8, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i8, boolean z9, MutableState<Float> mutableState, State<Float> state, State<? extends Function0> state2) {
        super(3);
        this.$enabled = z8;
        this.$draggableState = draggableState;
        this.$interactionSource = mutableInteractionSource;
        this.$maxPx = i8;
        this.$isRtl = z9;
        this.$pressOffset = mutableState;
        this.$rawOffset = state;
        this.$gestureEndAction = state2;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3255y.i(composed, "$this$composed");
        composer.startReplaceableGroup(2040469710);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2040469710, i8, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1124)");
        }
        if (this.$enabled) {
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f9825a, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{this.$draggableState, this.$interactionSource, Integer.valueOf(this.$maxPx), Boolean.valueOf(this.$isRtl)}, (InterfaceC1668n) new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, coroutineScope, this.$draggableState, this.$gestureEndAction, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composed;
    }
}
