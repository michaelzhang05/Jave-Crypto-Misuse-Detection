package S5;

import S5.g;
import a6.InterfaceC1668n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final h f9825a = new h();

    private h() {
    }

    @Override // S5.g
    public Object fold(Object obj, InterfaceC1668n operation) {
        AbstractC3255y.i(operation, "operation");
        return obj;
    }

    @Override // S5.g
    public g.b get(g.c key) {
        AbstractC3255y.i(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // S5.g
    public g minusKey(g.c key) {
        AbstractC3255y.i(key, "key");
        return this;
    }

    @Override // S5.g
    public g plus(g context) {
        AbstractC3255y.i(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
