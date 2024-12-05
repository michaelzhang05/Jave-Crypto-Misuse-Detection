package Z3;

import j$.util.Objects;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13404a = new c();

    private c() {
    }

    public static final boolean a(Object obj, Object obj2) {
        return AbstractC3159y.d(obj, obj2);
    }

    public static final int b(Object... values) {
        AbstractC3159y.i(values, "values");
        return Objects.hash(Arrays.copyOf(values, values.length));
    }
}
