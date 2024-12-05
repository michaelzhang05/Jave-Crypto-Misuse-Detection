package L5;

import L5.s;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class t {
    public static final Object a(Throwable exception) {
        AbstractC3159y.i(exception, "exception");
        return new s.b(exception);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof s.b)) {
        } else {
            throw ((s.b) obj).f6513a;
        }
    }
}
