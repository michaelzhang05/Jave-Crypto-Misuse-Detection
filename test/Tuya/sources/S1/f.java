package S1;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    protected static HashMap f8962a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    protected static HashMap f8963b = new HashMap();

    static {
        a(Object.class, h.class);
        a(Object.class, g.class);
    }

    public static void a(Class cls, Class cls2) {
        synchronized (f8962a) {
            try {
                LinkedHashSet linkedHashSet = (LinkedHashSet) f8962a.get(cls);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    f8962a.put(cls, linkedHashSet);
                }
                linkedHashSet.add(cls2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
