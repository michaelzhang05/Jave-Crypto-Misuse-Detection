package x6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class K extends T {

    /* renamed from: c, reason: collision with root package name */
    private final v6.f f39520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(t6.b kSerializer, t6.b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC3159y.i(kSerializer, "kSerializer");
        AbstractC3159y.i(vSerializer, "vSerializer");
        this.f39520c = new J(kSerializer.a(), vSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap p(Map map) {
        LinkedHashMap linkedHashMap;
        AbstractC3159y.i(map, "<this>");
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
    @Override // x6.AbstractC3935a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Map q(LinkedHashMap linkedHashMap) {
        AbstractC3159y.i(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // x6.T, t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return this.f39520c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap f() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashMap linkedHashMap) {
        AbstractC3159y.i(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashMap linkedHashMap, int i8) {
        AbstractC3159y.i(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Iterator i(Map map) {
        AbstractC3159y.i(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public int j(Map map) {
        AbstractC3159y.i(map, "<this>");
        return map.size();
    }
}
