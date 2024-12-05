package P5;

import P5.g;
import X5.n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class h implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final h f7994a = new h();

    private h() {
    }

    @Override // P5.g
    public Object fold(Object obj, n operation) {
        AbstractC3159y.i(operation, "operation");
        return obj;
    }

    @Override // P5.g
    public g.b get(g.c key) {
        AbstractC3159y.i(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // P5.g
    public g minusKey(g.c key) {
        AbstractC3159y.i(key, "key");
        return this;
    }

    @Override // P5.g
    public g plus(g context) {
        AbstractC3159y.i(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
