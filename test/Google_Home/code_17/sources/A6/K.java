package A6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class K extends T {

    /* renamed from: c, reason: collision with root package name */
    private final y6.f f515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(w6.b kSerializer, w6.b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC3255y.i(kSerializer, "kSerializer");
        AbstractC3255y.i(vSerializer, "vSerializer");
        this.f515c = new J(kSerializer.a(), vSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap p(Map map) {
        LinkedHashMap linkedHashMap;
        AbstractC3255y.i(map, "<this>");
        if (map instanceof LinkedHashMap) {
            linkedHashMap = (LinkedHashMap) map;
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new LinkedHashMap(map);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Map q(LinkedHashMap linkedHashMap) {
        AbstractC3255y.i(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // A6.T, w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return this.f515c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap f() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashMap linkedHashMap) {
        AbstractC3255y.i(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashMap linkedHashMap, int i8) {
        AbstractC3255y.i(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Iterator i(Map map) {
        AbstractC3255y.i(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public int j(Map map) {
        AbstractC3255y.i(map, "<this>");
        return map.size();
    }
}
