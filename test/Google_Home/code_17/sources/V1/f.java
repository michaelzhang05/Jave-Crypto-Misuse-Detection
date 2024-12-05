package V1;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    protected static HashMap f10605a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    protected static HashMap f10606b = new HashMap();

    static {
        a(Object.class, h.class);
        a(Object.class, g.class);
    }

    public static void a(Class cls, Class cls2) {
        synchronized (f10605a) {
            try {
                LinkedHashSet linkedHashSet = (LinkedHashSet) f10605a.get(cls);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    f10605a.put(cls, linkedHashSet);
                }
                linkedHashSet.add(cls2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
