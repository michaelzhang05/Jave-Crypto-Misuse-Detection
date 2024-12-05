package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes2.dex */
public class u extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: f, reason: collision with root package name */
    private final m f21979f;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes2.dex */
    class a implements ListIterator<String> {

        /* renamed from: f, reason: collision with root package name */
        ListIterator<String> f21980f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f21981g;

        a(int i2) {
            this.f21981g = i2;
            this.f21980f = u.this.f21979f.listIterator(i2);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f21980f.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f21980f.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21980f.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21980f.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21980f.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21980f.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes2.dex */
    class b implements Iterator<String> {

        /* renamed from: f, reason: collision with root package name */
        Iterator<String> f21983f;

        b() {
            this.f21983f = u.this.f21979f.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f21983f.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21983f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public u(m mVar) {
        this.f21979f = mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m E() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void G(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        return this.f21979f.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21979f.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> t() {
        return this.f21979f.t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d y(int i2) {
        return this.f21979f.y(i2);
    }
}
