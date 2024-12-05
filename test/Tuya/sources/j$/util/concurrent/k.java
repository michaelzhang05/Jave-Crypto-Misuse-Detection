package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final Object f32158a;

    /* renamed from: b, reason: collision with root package name */
    Object f32159b;

    /* renamed from: c, reason: collision with root package name */
    final ConcurrentHashMap f32160c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f32158a = obj;
        this.f32159b = obj2;
        this.f32160c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f32158a) || key.equals(obj2)) && (value == (obj3 = this.f32159b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f32158a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f32159b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f32158a.hashCode() ^ this.f32159b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f32159b;
        this.f32159b = obj;
        this.f32160c.put(this.f32158a, obj);
        return obj2;
    }

    public final String toString() {
        return u.b(this.f32158a, this.f32159b);
    }
}
