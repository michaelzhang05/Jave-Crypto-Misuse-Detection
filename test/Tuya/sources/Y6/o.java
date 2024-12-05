package y6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class o {
    public static final AbstractC3999a a(AbstractC3999a from, Function1 builderAction) {
        AbstractC3159y.i(from, "from");
        AbstractC3159y.i(builderAction, "builderAction");
        C4002d c4002d = new C4002d(from);
        builderAction.invoke(c4002d);
        return new n(c4002d.a(), c4002d.b());
    }

    public static /* synthetic */ AbstractC3999a b(AbstractC3999a abstractC3999a, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            abstractC3999a = AbstractC3999a.f39962d;
        }
        return a(abstractC3999a, function1);
    }
}
