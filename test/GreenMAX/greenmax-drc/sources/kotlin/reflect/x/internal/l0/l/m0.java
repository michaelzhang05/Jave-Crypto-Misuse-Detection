package kotlin.reflect.x.internal.l0.l;

import java.util.Iterator;
import kotlin.collections.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.x.internal.l0.l.w1.k;
import kotlin.reflect.x.internal.l0.l.w1.l;
import kotlin.text.r;

/* compiled from: KotlinType.kt */
/* loaded from: classes2.dex */
public abstract class m0 extends q1 implements k, l {
    public m0() {
        super(null);
    }

    public abstract m0 V0(boolean z);

    public abstract m0 W0(a1 a1Var);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            r.f(sb, "[", kotlin.reflect.x.internal.l0.h.c.s(kotlin.reflect.x.internal.l0.h.c.f20764j, it.next(), null, 2, null), "] ");
        }
        sb.append(O0());
        if (!M0().isEmpty()) {
            b0.Z(M0(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (P0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
