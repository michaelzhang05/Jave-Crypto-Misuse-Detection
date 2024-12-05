package androidx.work.impl.constraints;

import androidx.work.impl.constraints.controllers.ConstraintController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class WorkConstraintsTracker$areAllConstraintsMet$1 extends AbstractC3160z implements Function1 {
    public static final WorkConstraintsTracker$areAllConstraintsMet$1 INSTANCE = new WorkConstraintsTracker$areAllConstraintsMet$1();

    WorkConstraintsTracker$areAllConstraintsMet$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(ConstraintController<?> it) {
        AbstractC3159y.i(it, "it");
        String simpleName = it.getClass().getSimpleName();
        AbstractC3159y.h(simpleName, "it.javaClass.simpleName");
        return simpleName;
    }
}
