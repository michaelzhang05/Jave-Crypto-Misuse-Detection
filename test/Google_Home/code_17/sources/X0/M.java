package x0;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class M {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f40592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f40593b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x0.M$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0922a extends AbstractC4167b {

            /* renamed from: c, reason: collision with root package name */
            final Iterator f40594c;

            /* renamed from: d, reason: collision with root package name */
            final Iterator f40595d;

            C0922a() {
                this.f40594c = a.this.f40592a.iterator();
                this.f40595d = a.this.f40593b.iterator();
            }

            @Override // x0.AbstractC4167b
            protected Object a() {
                if (this.f40594c.hasNext()) {
                    return this.f40594c.next();
                }
                while (this.f40595d.hasNext()) {
                    Object next = this.f40595d.next();
                    if (!a.this.f40592a.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f40592a = set;
            this.f40593b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return new C0922a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!this.f40592a.contains(obj) && !this.f40593b.contains(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            if (this.f40592a.isEmpty() && this.f40593b.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f40592a.size();
            Iterator it = this.f40593b.iterator();
            while (it.hasNext()) {
                if (!this.f40592a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract S iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Set set) {
        int i8;
        int i9 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i8 = obj.hashCode();
            } else {
                i8 = 0;
            }
            i9 = ~(~(i9 + i8));
        }
        return i9;
    }

    public static b c(Set set, Set set2) {
        w0.h.j(set, "set1");
        w0.h.j(set2, "set2");
        return new a(set, set2);
    }
}
