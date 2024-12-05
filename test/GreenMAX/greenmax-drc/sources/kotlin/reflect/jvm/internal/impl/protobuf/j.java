package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes2.dex */
public class j extends k {

    /* renamed from: e, reason: collision with root package name */
    private final o f21935e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: f, reason: collision with root package name */
        private Map.Entry<K, j> f21936f;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f21936f.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            j value = this.f21936f.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof o) {
                return this.f21936f.getValue().d((o) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, j> entry) {
            this.f21936f = entry;
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f21937f;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f21937f = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f21937f.next();
            return next.getValue() instanceof j ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21937f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f21937f.remove();
        }
    }

    public o e() {
        return c(this.f21935e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
