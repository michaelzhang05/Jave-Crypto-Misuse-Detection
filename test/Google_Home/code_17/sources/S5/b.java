package S5;

import S5.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class b implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f9817a;

    /* renamed from: b, reason: collision with root package name */
    private final g.c f9818b;

    public b(g.c baseKey, Function1 safeCast) {
        AbstractC3255y.i(baseKey, "baseKey");
        AbstractC3255y.i(safeCast, "safeCast");
        this.f9817a = safeCast;
        this.f9818b = baseKey instanceof b ? ((b) baseKey).f9818b : baseKey;
    }

    public final boolean a(g.c key) {
        AbstractC3255y.i(key, "key");
        if (key != this && this.f9818b != key) {
            return false;
        }
        return true;
    }

    public final g.b b(g.b element) {
        AbstractC3255y.i(element, "element");
        return (g.b) this.f9817a.invoke(element);
    }
}
