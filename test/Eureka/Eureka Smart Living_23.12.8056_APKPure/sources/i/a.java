package i;

import i.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f6944e = new HashMap();

    public boolean contains(Object obj) {
        return this.f6944e.containsKey(obj);
    }

    @Override // i.b
    protected b.c j(Object obj) {
        return (b.c) this.f6944e.get(obj);
    }

    @Override // i.b
    public Object n(Object obj, Object obj2) {
        b.c j6 = j(obj);
        if (j6 != null) {
            return j6.f6950b;
        }
        this.f6944e.put(obj, m(obj, obj2));
        return null;
    }

    @Override // i.b
    public Object o(Object obj) {
        Object o6 = super.o(obj);
        this.f6944e.remove(obj);
        return o6;
    }

    public Map.Entry p(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f6944e.get(obj)).f6952d;
        }
        return null;
    }
}
