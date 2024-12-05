package x0;

import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import x0.AbstractC4179n;

/* renamed from: x0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4181p implements Map, Serializable, j$.util.Map {

    /* renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f40645d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient r f40646a;

    /* renamed from: b, reason: collision with root package name */
    private transient r f40647b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC4179n f40648c;

    /* renamed from: x0.p$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f40649a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f40650b;

        /* renamed from: c, reason: collision with root package name */
        int f40651c = 0;

        /* renamed from: d, reason: collision with root package name */
        boolean f40652d = false;

        /* renamed from: e, reason: collision with root package name */
        C0924a f40653e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x0.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0924a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f40654a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f40655b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f40656c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0924a(Object obj, Object obj2, Object obj3) {
                this.f40654a = obj;
                this.f40655b = obj2;
                this.f40656c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f40654a);
                String valueOf2 = String.valueOf(this.f40655b);
                String valueOf3 = String.valueOf(this.f40654a);
                String valueOf4 = String.valueOf(this.f40656c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i8) {
            this.f40650b = new Object[i8 * 2];
        }

        private AbstractC4181p a(boolean z8) {
            Object[] objArr;
            C0924a c0924a;
            C0924a c0924a2;
            if (z8 && (c0924a2 = this.f40653e) != null) {
                throw c0924a2.a();
            }
            int i8 = this.f40651c;
            if (this.f40649a == null) {
                objArr = this.f40650b;
            } else {
                if (this.f40652d) {
                    this.f40650b = Arrays.copyOf(this.f40650b, i8 * 2);
                }
                objArr = this.f40650b;
                if (!z8) {
                    objArr = d(objArr, this.f40651c);
                    if (objArr.length < this.f40650b.length) {
                        i8 = objArr.length >>> 1;
                    }
                }
                f(objArr, i8, this.f40649a);
            }
            this.f40652d = true;
            J i9 = J.i(i8, objArr, this);
            if (z8 && (c0924a = this.f40653e) != null) {
                throw c0924a.a();
            }
            return i9;
        }

        private void c(int i8) {
            int i9 = i8 * 2;
            Object[] objArr = this.f40650b;
            if (i9 > objArr.length) {
                this.f40650b = Arrays.copyOf(objArr, AbstractC4179n.b.a(objArr.length, i9));
                this.f40652d = false;
            }
        }

        private Object[] d(Object[] objArr, int i8) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                Object obj = objArr[i9 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i9);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i8 - bitSet.cardinality()) * 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8 * 2) {
                if (bitSet.get(i10 >>> 1)) {
                    i10 += 2;
                } else {
                    int i12 = i11 + 1;
                    int i13 = i10 + 1;
                    Object obj2 = objArr[i10];
                    Objects.requireNonNull(obj2);
                    objArr2[i11] = obj2;
                    i11 += 2;
                    i10 += 2;
                    Object obj3 = objArr[i13];
                    Objects.requireNonNull(obj3);
                    objArr2[i12] = obj3;
                }
            }
            return objArr2;
        }

        static void f(Object[] objArr, int i8, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = i9 * 2;
                Object obj = objArr[i10];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i10 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i9] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i8, AbstractC4163G.a(comparator).e(z.d()));
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = i11 * 2;
                objArr[i12] = entryArr[i11].getKey();
                objArr[i12 + 1] = entryArr[i11].getValue();
            }
        }

        public AbstractC4181p b() {
            return a(true);
        }

        public a e(Object obj, Object obj2) {
            c(this.f40651c + 1);
            AbstractC4172g.a(obj, obj2);
            Object[] objArr = this.f40650b;
            int i8 = this.f40651c;
            objArr[i8 * 2] = obj;
            objArr[(i8 * 2) + 1] = obj2;
            this.f40651c = i8 + 1;
            return this;
        }
    }

    public static AbstractC4181p g() {
        return J.f40569h;
    }

    abstract r a();

    abstract r b();

    abstract AbstractC4179n c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public r entrySet() {
        r rVar = this.f40646a;
        if (rVar == null) {
            r a8 = a();
            this.f40646a = a8;
            return a8;
        }
        return rVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return z.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r keySet() {
        r rVar = this.f40647b;
        if (rVar == null) {
            r b8 = b();
            this.f40647b = b8;
            return b8;
        }
        return rVar;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC4179n values() {
        AbstractC4179n abstractC4179n = this.f40648c;
        if (abstractC4179n == null) {
            AbstractC4179n c8 = c();
            this.f40648c = c8;
            return c8;
        }
        return abstractC4179n;
    }

    @Override // java.util.Map
    public int hashCode() {
        return M.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
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
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return z.c(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
