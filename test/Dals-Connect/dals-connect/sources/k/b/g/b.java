package k.b.g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: SimpleLoggerFactory.java */
/* loaded from: classes2.dex */
public class b implements k.b.a {
    ConcurrentMap<String, k.b.b> a = new ConcurrentHashMap();

    public b() {
        a.r();
    }

    @Override // k.b.a
    public k.b.b a(String str) {
        k.b.b bVar = this.a.get(str);
        if (bVar != null) {
            return bVar;
        }
        a aVar = new a(str);
        k.b.b putIfAbsent = this.a.putIfAbsent(str, aVar);
        return putIfAbsent == null ? aVar : putIfAbsent;
    }
}
