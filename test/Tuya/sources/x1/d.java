package X1;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class d extends f {
    /* JADX INFO: Access modifiers changed from: protected */
    public d(e eVar) {
        super(eVar);
    }

    @Override // X1.f
    public void a(Object obj, Object obj2) {
        ((T1.a) obj).add(obj2);
    }

    @Override // X1.f
    public Object c() {
        return new T1.a();
    }

    @Override // X1.f
    public Object d() {
        return new LinkedHashMap();
    }

    @Override // X1.f
    public void e(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // X1.f
    public f f(String str) {
        return this.f12209a.f12207c;
    }

    @Override // X1.f
    public f g(String str) {
        return this.f12209a.f12207c;
    }
}
