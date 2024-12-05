package z6;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4060u {

    /* renamed from: a, reason: collision with root package name */
    private final Map f40567a = AbstractC4059t.a(16);

    /* renamed from: z6.u$a */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    public final Object a(v6.f descriptor, a key) {
        Object obj;
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(key, "key");
        Map map = (Map) this.f40567a.get(descriptor);
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

    public final Object b(v6.f descriptor, a key, Function0 defaultValue) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(key, "key");
        AbstractC3159y.i(defaultValue, "defaultValue");
        Object a8 = a(descriptor, key);
        if (a8 != null) {
            return a8;
        }
        Object invoke = defaultValue.invoke();
        c(descriptor, key, invoke);
        return invoke;
    }

    public final void c(v6.f descriptor, a key, Object value) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(key, "key");
        AbstractC3159y.i(value, "value");
        Map map = this.f40567a;
        Object obj = map.get(descriptor);
        if (obj == null) {
            obj = AbstractC4059t.a(2);
            map.put(descriptor, obj);
        }
        ((Map) obj).put(key, value);
    }
}
