package C6;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: C6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1049u {

    /* renamed from: a, reason: collision with root package name */
    private final Map f1685a = AbstractC1048t.a(16);

    /* renamed from: C6.u$a */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    public final Object a(y6.f descriptor, a key) {
        Object obj;
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(key, "key");
        Map map = (Map) this.f1685a.get(descriptor);
        if (map != null) {
            obj = map.get(key);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(y6.f descriptor, a key, Function0 defaultValue) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(defaultValue, "defaultValue");
        Object a8 = a(descriptor, key);
        if (a8 != null) {
            return a8;
        }
        Object invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final void c(y6.f descriptor, a key, Object value) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(value, "value");
        Map map = this.f1685a;
        Object obj = map.get(descriptor);
        if (obj == null) {
            obj = AbstractC1048t.a(2);
            map.put(descriptor, obj);
        }
        ((Map) obj).put(key, value);
    }
}
