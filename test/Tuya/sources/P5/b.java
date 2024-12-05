package P5;

import P5.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class b implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f7986a;

    /* renamed from: b, reason: collision with root package name */
    private final g.c f7987b;

    public b(g.c baseKey, Function1 safeCast) {
        AbstractC3159y.i(baseKey, "baseKey");
        AbstractC3159y.i(safeCast, "safeCast");
        this.f7986a = safeCast;
        this.f7987b = baseKey instanceof b ? ((b) baseKey).f7987b : baseKey;
    }

    public final boolean a(g.c key) {
        AbstractC3159y.i(key, "key");
        if (key != this && this.f7987b != key) {
            return false;
        }
        return true;
    }

    public final g.b b(g.b element) {
        AbstractC3159y.i(element, "element");
        return (g.b) this.f7986a.invoke(element);
    }
}
