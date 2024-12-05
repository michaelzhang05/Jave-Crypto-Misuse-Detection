package kotlin.reflect.x.internal.l0.l;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;

/* compiled from: TypeAttributeTranslator.kt */
/* loaded from: classes2.dex */
public interface z0 {

    /* compiled from: TypeAttributeTranslator.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ a1 a(z0 z0Var, g gVar, e1 e1Var, m mVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i2 & 2) != 0) {
                e1Var = null;
            }
            if ((i2 & 4) != 0) {
                mVar = null;
            }
            return z0Var.a(gVar, e1Var, mVar);
        }
    }

    a1 a(g gVar, e1 e1Var, m mVar);
}
