package k.b.f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: SubstituteLoggerFactory.java */
/* loaded from: classes2.dex */
public class h implements k.b.a {
    boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, g> f19448b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final LinkedBlockingQueue<k.b.e.d> f19449c = new LinkedBlockingQueue<>();

    @Override // k.b.a
    public synchronized k.b.b a(String str) {
        g gVar;
        gVar = this.f19448b.get(str);
        if (gVar == null) {
            gVar = new g(str, this.f19449c, this.a);
            this.f19448b.put(str, gVar);
        }
        return gVar;
    }

    public void b() {
        this.f19448b.clear();
        this.f19449c.clear();
    }

    public LinkedBlockingQueue<k.b.e.d> c() {
        return this.f19449c;
    }

    public List<g> d() {
        return new ArrayList(this.f19448b.values());
    }

    public void e() {
        this.a = true;
    }
}
