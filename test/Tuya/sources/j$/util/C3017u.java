package j$.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3017u implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map f32684a;

    /* renamed from: b, reason: collision with root package name */
    private transient java.util.Set f32685b;

    /* renamed from: c, reason: collision with root package name */
    private transient java.util.Set f32686c;

    /* renamed from: d, reason: collision with root package name */
    private transient java.util.Collection f32687d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3017u(java.util.Map map) {
        map.getClass();
        this.f32684a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f32684a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f32684a.containsValue(obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, j$.util.n] */
    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f32686c == null) {
            this.f32686c = new C2887n(this.f32684a.entrySet());
        }
        return this.f32686c;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f32684a.equals(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        AbstractC2877d.q(this.f32684a, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f32684a.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return AbstractC2877d.s(this.f32684a, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f32684a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f32684a.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f32685b == null) {
            this.f32685b = DesugarCollections.unmodifiableSet(this.f32684a.keySet());
        }
        return this.f32685b;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f32684a.size();
    }

    public final String toString() {
        return this.f32684a.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f32687d == null) {
            this.f32687d = DesugarCollections.unmodifiableCollection(this.f32684a.values());
        }
        return this.f32687d;
    }
}
