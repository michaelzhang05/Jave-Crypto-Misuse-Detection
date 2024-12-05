package androidx.compose.material;

import O5.I;
import S5.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* renamed from: androidx.compose.material.DismissState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DismissValue it) {
            AbstractC3255y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<DismissState, DismissValue> Saver(Function1 confirmStateChange) {
            AbstractC3255y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(DismissState$Companion$Saver$1.INSTANCE, new DismissState$Companion$Saver$2(confirmStateChange));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, Function1 function1, int i8, AbstractC3247p abstractC3247p) {
        this(dismissValue, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }

    public final Object dismiss(DismissDirection dismissDirection, d dVar) {
        DismissValue dismissValue;
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, dismissValue, null, dVar, 2, null);
        if (animateTo$default == T5.b.e()) {
            return animateTo$default;
        }
        return I.f8278a;
    }

    public final DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        if (getOffset().getValue().floatValue() > 0.0f) {
            return DismissDirection.StartToEnd;
        }
        return DismissDirection.EndToStart;
    }

    public final boolean isDismissed(DismissDirection direction) {
        DismissValue dismissValue;
        AbstractC3255y.i(direction, "direction");
        DismissValue currentValue = getCurrentValue();
        if (direction == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        if (currentValue == dismissValue) {
            return true;
        }
        return false;
    }

    public final Object reset(d dVar) {
        Object animateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, null, dVar, 2, null);
        if (animateTo$default == T5.b.e()) {
            return animateTo$default;
        }
        return I.f8278a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissState(DismissValue initialValue, Function1 confirmStateChange) {
        super(initialValue, null, confirmStateChange, 2, null);
        AbstractC3255y.i(initialValue, "initialValue");
        AbstractC3255y.i(confirmStateChange, "confirmStateChange");
    }
}
