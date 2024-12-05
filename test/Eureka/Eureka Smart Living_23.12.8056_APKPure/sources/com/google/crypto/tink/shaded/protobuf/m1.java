package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class m1 extends AbstractList implements d0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f5546a;

    /* loaded from: classes.dex */
    class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        ListIterator f5547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5548b;

        a(int i6) {
            this.f5548b = i6;
            this.f5547a = m1.this.f5546a.listIterator(i6);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f5547a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f5547a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f5547a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f5547a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f5547a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f5547a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f5550a;

        b() {
            this.f5550a = m1.this.f5546a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f5550a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5550a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public m1(d0 d0Var) {
        this.f5546a = d0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public d0 a() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public Object c(int i6) {
        return this.f5546a.c(i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public List e() {
        return this.f5546a.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void g(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i6) {
        return (String) this.f5546a.get(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i6) {
        return new a(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5546a.size();
    }
}
