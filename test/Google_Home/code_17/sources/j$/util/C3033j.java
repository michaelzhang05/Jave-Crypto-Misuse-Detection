package j$.util;

import j$.util.Map;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3033j implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map f33422a;

    /* renamed from: b, reason: collision with root package name */
    final Object f33423b = this;

    /* renamed from: c, reason: collision with root package name */
    private transient java.util.Set f33424c;

    /* renamed from: d, reason: collision with root package name */
    private transient java.util.Set f33425d;

    /* renamed from: e, reason: collision with root package name */
    private transient java.util.Collection f33426e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3033j(java.util.Map map) {
        this.f33422a = (java.util.Map) Objects.requireNonNull(map);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f33423b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f33423b) {
            this.f33422a.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        r5 = r3;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r5, java.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f33423b
            monitor-enter(r0)
            java.util.Map r1 = r4.f33422a     // Catch: java.lang.Throwable -> L41
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r1.compute(r5, r6)     // Catch: java.lang.Throwable -> L41
            goto L3f
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3b
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L41
        L16:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L41
        L1a:
            java.lang.Object r3 = r6.apply(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L31
            if (r2 == 0) goto L2a
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L28:
            r5 = r3
            goto L3f
        L2a:
            java.lang.Object r2 = r1.putIfAbsent(r5, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L1a
            goto L28
        L31:
            if (r2 == 0) goto L39
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L39:
            r5 = 0
            goto L3f
        L3b:
            java.lang.Object r5 = j$.util.Map.CC.$default$compute(r1, r5, r6)     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return r5
        L41:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C3033j.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object $default$computeIfAbsent;
        Object apply;
        synchronized (this.f33423b) {
            java.util.Map map = this.f33422a;
            if (map instanceof Map) {
                $default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj2 = concurrentMap.get(obj);
                $default$computeIfAbsent = (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj2;
            } else {
                $default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return $default$computeIfAbsent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        r5 = r3;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r5, java.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f33423b
            monitor-enter(r0)
            java.util.Map r1 = r4.f33422a     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r1.computeIfPresent(r5, r6)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L36
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L3c
            j$.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L3c
        L19:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L34
            java.lang.Object r3 = r6.apply(r5, r2)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L2c
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L19
            goto L32
        L2c:
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L19
        L32:
            r5 = r3
            goto L3a
        L34:
            r5 = 0
            goto L3a
        L36:
            java.lang.Object r5 = j$.util.Map.CC.$default$computeIfPresent(r1, r5, r6)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r5
        L3c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C3033j.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f33423b) {
            containsKey = this.f33422a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f33423b) {
            containsValue = this.f33422a.containsValue(obj);
        }
        return containsValue;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [j$.util.h, java.util.Set] */
    @Override // java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set;
        synchronized (this.f33423b) {
            try {
                if (this.f33425d == null) {
                    this.f33425d = new C3031h(this.f33422a.entrySet(), this.f33423b);
                }
                set = this.f33425d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f33423b) {
            equals = this.f33422a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f33423b) {
            AbstractC3027d.q(this.f33422a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f33423b) {
            obj2 = this.f33422a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object s8;
        synchronized (this.f33423b) {
            s8 = AbstractC3027d.s(this.f33422a, obj, obj2);
        }
        return s8;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f33423b) {
            hashCode = this.f33422a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f33423b) {
            isEmpty = this.f33422a.isEmpty();
        }
        return isEmpty;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [j$.util.h, java.util.Set] */
    @Override // java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set;
        synchronized (this.f33423b) {
            try {
                if (this.f33424c == null) {
                    this.f33424c = new C3031h(this.f33422a.keySet(), this.f33423b);
                }
                set = this.f33424c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r1.remove(r5, r2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        if (r1.replace(r5, r2, r3) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
    
        r6 = r3;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, java.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f33423b
            monitor-enter(r0)
            java.util.Map r1 = r4.f33422a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L44
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L46
            j$.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L46
            j$.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L46
        L1c:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L46
        L20:
            if (r2 == 0) goto L38
            java.lang.Object r3 = r7.apply(r2, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = r3
            goto L3e
        L30:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = 0
            goto L3e
        L38:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L20
        L3e:
            r5 = r6
            goto L44
        L40:
            java.lang.Object r5 = j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C3033j.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f33423b) {
            put = this.f33422a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f33423b) {
            this.f33422a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object t8;
        synchronized (this.f33423b) {
            t8 = AbstractC3027d.t(this.f33422a, obj, obj2);
        }
        return t8;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f33423b) {
            remove = this.f33422a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f33423b) {
            java.util.Map map = this.f33422a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f33423b) {
            java.util.Map map = this.f33422a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f33423b) {
            java.util.Map map = this.f33422a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f33423b) {
            java.util.Map map = this.f33422a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.t tVar = new j$.util.concurrent.t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(tVar);
                } else {
                    j$.util.concurrent.u.a(concurrentMap, tVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f33423b) {
            size = this.f33422a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f33423b) {
            obj = this.f33422a.toString();
        }
        return obj;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection;
        synchronized (this.f33423b) {
            try {
                if (this.f33426e == null) {
                    this.f33426e = new C3031h(this.f33422a.values(), this.f33423b);
                }
                collection = this.f33426e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return collection;
    }
}