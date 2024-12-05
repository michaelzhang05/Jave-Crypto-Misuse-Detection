package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3093a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f3093a.values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a();
        }
        this.f3093a.clear();
    }

    public final e0 b(String str) {
        f5.h.e(str, "key");
        return (e0) this.f3093a.get(str);
    }

    public final Set c() {
        return new HashSet(this.f3093a.keySet());
    }

    public final void d(String str, e0 e0Var) {
        f5.h.e(str, "key");
        f5.h.e(e0Var, "viewModel");
        e0 e0Var2 = (e0) this.f3093a.put(str, e0Var);
        if (e0Var2 != null) {
            e0Var2.d();
        }
    }
}
