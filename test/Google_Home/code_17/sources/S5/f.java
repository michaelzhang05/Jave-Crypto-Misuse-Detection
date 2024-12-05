package S5;

import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class f {
    public static final d a(InterfaceC1668n interfaceC1668n, Object obj, d completion) {
        AbstractC3255y.i(interfaceC1668n, "<this>");
        AbstractC3255y.i(completion, "completion");
        return new i(T5.b.c(T5.b.a(interfaceC1668n, obj, completion)), T5.b.e());
    }

    public static final void b(InterfaceC1668n interfaceC1668n, Object obj, d completion) {
        AbstractC3255y.i(interfaceC1668n, "<this>");
        AbstractC3255y.i(completion, "completion");
        d c8 = T5.b.c(T5.b.a(interfaceC1668n, obj, completion));
        s.a aVar = s.f8302b;
        c8.resumeWith(s.b(I.f8278a));
    }
}
