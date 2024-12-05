package P5;

import L5.I;
import L5.s;
import X5.n;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class f {
    public static final d a(n nVar, Object obj, d completion) {
        AbstractC3159y.i(nVar, "<this>");
        AbstractC3159y.i(completion, "completion");
        return new i(Q5.b.c(Q5.b.a(nVar, obj, completion)), Q5.b.e());
    }

    public static final void b(n nVar, Object obj, d completion) {
        AbstractC3159y.i(nVar, "<this>");
        AbstractC3159y.i(completion, "completion");
        d c8 = Q5.b.c(Q5.b.a(nVar, obj, completion));
        s.a aVar = s.f6511b;
        c8.resumeWith(s.b(I.f6487a));
    }
}
