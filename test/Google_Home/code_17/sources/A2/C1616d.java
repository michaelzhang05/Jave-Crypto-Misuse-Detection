package a2;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1616d extends AbstractC1618f {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1616d(C1617e c1617e) {
        super(c1617e);
    }

    @Override // a2.AbstractC1618f
    public void a(Object obj, Object obj2) {
        ((W1.a) obj).add(obj2);
    }

    @Override // a2.AbstractC1618f
    public Object c() {
        return new W1.a();
    }

    @Override // a2.AbstractC1618f
    public Object d() {
        return new LinkedHashMap();
    }

    @Override // a2.AbstractC1618f
    public void e(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // a2.AbstractC1618f
    public AbstractC1618f f(String str) {
        return this.f13830a.f13828c;
    }

    @Override // a2.AbstractC1618f
    public AbstractC1618f g(String str) {
        return this.f13830a.f13828c;
    }
}
