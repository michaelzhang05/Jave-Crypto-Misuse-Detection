package kotlin.reflect.x.internal.l0.l.w1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.r1;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes2.dex */
public final class q {

    /* compiled from: TypeSystemContext.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.values().length];
            iArr[r1.INVARIANT.ordinal()] = 1;
            iArr[r1.IN_VARIANCE.ordinal()] = 2;
            iArr[r1.OUT_VARIANCE.ordinal()] = 3;
            a = iArr;
        }
    }

    public static final u a(r1 r1Var) {
        l.f(r1Var, "<this>");
        int i2 = a.a[r1Var.ordinal()];
        if (i2 == 1) {
            return u.INV;
        }
        if (i2 == 2) {
            return u.IN;
        }
        if (i2 == 3) {
            return u.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
