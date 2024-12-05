package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3069a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f3070b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3071c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f3071c = true;
        Map map = this.f3069a;
        if (map != null) {
            synchronized (map) {
                Iterator it = this.f3069a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        Set set = this.f3070b;
        if (set != null) {
            synchronized (set) {
                Iterator it2 = this.f3070b.iterator();
                while (it2.hasNext()) {
                    b((Closeable) it2.next());
                }
            }
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object c(String str) {
        Object obj;
        Map map = this.f3069a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f3069a.get(str);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object e(String str, Object obj) {
        Object obj2;
        synchronized (this.f3069a) {
            obj2 = this.f3069a.get(str);
            if (obj2 == null) {
                this.f3069a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f3071c) {
            b(obj);
        }
        return obj;
    }
}
