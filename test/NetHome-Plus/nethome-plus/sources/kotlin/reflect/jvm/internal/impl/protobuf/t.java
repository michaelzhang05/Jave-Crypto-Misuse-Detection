package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallSortedMap.java */
/* loaded from: classes2.dex */
public class t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private final int f21965f;

    /* renamed from: g, reason: collision with root package name */
    private List<t<K, V>.c> f21966g;

    /* renamed from: h, reason: collision with root package name */
    private Map<K, V> f21967h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21968i;

    /* renamed from: j, reason: collision with root package name */
    private volatile t<K, V>.e f21969j;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    static class a<FieldDescriptorType> extends t<FieldDescriptorType, Object> {
        a(int i2) {
            super(i2, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.t
        public void m() {
            if (!l()) {
                for (int i2 = 0; i2 < i(); i2++) {
                    Map.Entry<FieldDescriptorType, Object> h2 = h(i2);
                    if (((g.b) h2.getKey()).h()) {
                        h2.setValue(Collections.unmodifiableList((List) h2.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : j()) {
                    if (((g.b) entry.getKey()).h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.m();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((g.b) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public static class b {
        private static final Iterator<Object> a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f21970b = new C0374b();

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes2.dex */
        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0374b implements Iterable<Object> {
            C0374b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f21970b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    public class c implements Comparable<t<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private final K f21971f;

        /* renamed from: g, reason: collision with root package name */
        private V f21972g;

        c(t tVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean f(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f(this.f21971f, entry.getKey()) && f(this.f21972g, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f21972g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f21971f;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f21972g;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f21971f;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            t.this.f();
            V v2 = this.f21972g;
            this.f21972g = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f21971f);
            String valueOf2 = String.valueOf(this.f21972g);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        c(K k2, V v) {
            this.f21971f = k2;
            this.f21972g = v;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            t.this.p(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            t.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t.this.size();
        }

        /* synthetic */ e(t tVar, a aVar) {
            this();
        }
    }

    /* synthetic */ t(int i2, a aVar) {
        this(i2);
    }

    private int e(K k2) {
        int size = this.f21966g.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f21966g.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f21966g.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f21968i) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f21966g.isEmpty() || (this.f21966g instanceof ArrayList)) {
            return;
        }
        this.f21966g = new ArrayList(this.f21965f);
    }

    private SortedMap<K, V> k() {
        f();
        if (this.f21967h.isEmpty() && !(this.f21967h instanceof TreeMap)) {
            this.f21967h = new TreeMap();
        }
        return (SortedMap) this.f21967h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends g.b<FieldDescriptorType>> t<FieldDescriptorType, Object> n(int i2) {
        return new a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V q(int i2) {
        f();
        V value = this.f21966g.remove(i2).getValue();
        if (!this.f21967h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = k().entrySet().iterator();
            this.f21966g.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f21966g.isEmpty()) {
            this.f21966g.clear();
        }
        if (this.f21967h.isEmpty()) {
            return;
        }
        this.f21967h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f21967h.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f21969j == null) {
            this.f21969j = new e(this, null);
        }
        return this.f21969j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return this.f21966g.get(e2).getValue();
        }
        return this.f21967h.get(comparable);
    }

    public Map.Entry<K, V> h(int i2) {
        return this.f21966g.get(i2);
    }

    public int i() {
        return this.f21966g.size();
    }

    public Iterable<Map.Entry<K, V>> j() {
        return this.f21967h.isEmpty() ? b.b() : this.f21967h.entrySet();
    }

    public boolean l() {
        return this.f21968i;
    }

    public void m() {
        if (this.f21968i) {
            return;
        }
        this.f21967h = this.f21967h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21967h);
        this.f21968i = true;
    }

    public V p(K k2, V v) {
        f();
        int e2 = e(k2);
        if (e2 >= 0) {
            return this.f21966g.get(e2).setValue(v);
        }
        g();
        int i2 = -(e2 + 1);
        if (i2 >= this.f21965f) {
            return k().put(k2, v);
        }
        int size = this.f21966g.size();
        int i3 = this.f21965f;
        if (size == i3) {
            t<K, V>.c remove = this.f21966g.remove(i3 - 1);
            k().put(remove.getKey(), remove.getValue());
        }
        this.f21966g.add(i2, new c(k2, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return (V) q(e2);
        }
        if (this.f21967h.isEmpty()) {
            return null;
        }
        return this.f21967h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f21966g.size() + this.f21967h.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes2.dex */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f, reason: collision with root package name */
        private int f21974f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f21975g;

        /* renamed from: h, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f21976h;

        private d() {
            this.f21974f = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f21976h == null) {
                this.f21976h = t.this.f21967h.entrySet().iterator();
            }
            return this.f21976h;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f21975g = true;
            int i2 = this.f21974f + 1;
            this.f21974f = i2;
            if (i2 < t.this.f21966g.size()) {
                return (Map.Entry) t.this.f21966g.get(this.f21974f);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21974f + 1 < t.this.f21966g.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f21975g) {
                this.f21975g = false;
                t.this.f();
                if (this.f21974f < t.this.f21966g.size()) {
                    t tVar = t.this;
                    int i2 = this.f21974f;
                    this.f21974f = i2 - 1;
                    tVar.q(i2);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ d(t tVar, a aVar) {
            this();
        }
    }

    private t(int i2) {
        this.f21965f = i2;
        this.f21966g = Collections.emptyList();
        this.f21967h = Collections.emptyMap();
    }
}
