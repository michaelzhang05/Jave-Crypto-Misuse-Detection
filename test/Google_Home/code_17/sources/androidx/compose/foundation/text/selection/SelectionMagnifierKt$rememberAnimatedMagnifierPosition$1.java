package androidx.compose.foundation.text.selection;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends l implements InterfaceC1668n {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function0 {
        final /* synthetic */ State<Offset> $targetValue$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<Offset> state) {
            super(0);
            this.$targetValue$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Offset.m2729boximpl(m1038invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
        public final long m1038invokeF1C5BW0() {
            return SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(this.$targetValue$delegate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, d dVar) {
        super(2, dVar);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, dVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            final M m8 = (M) this.L$0;
            InterfaceC3706f snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$targetValue$delegate));
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.2
                @Override // o6.InterfaceC3707g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return m1039emit3MmeM6k(((Offset) obj2).m2750unboximpl(), dVar);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m1039emit3MmeM6k(long j8, d dVar) {
                    if (OffsetKt.m2759isSpecifiedk4lQ0M(animatable.getValue().m2750unboximpl()) && OffsetKt.m2759isSpecifiedk4lQ0M(j8) && Offset.m2741getYimpl(animatable.getValue().m2750unboximpl()) != Offset.m2741getYimpl(j8)) {
                        AbstractC3364k.d(m8, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(animatable, j8, null), 3, null);
                        return I.f8278a;
                    }
                    Object snapTo = animatable.snapTo(Offset.m2729boximpl(j8), dVar);
                    if (snapTo == T5.b.e()) {
                        return snapTo;
                    }
                    return I.f8278a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(interfaceC3707g, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
