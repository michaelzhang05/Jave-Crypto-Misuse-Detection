package com.airbnb.epoxy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModelList.java */
/* loaded from: classes.dex */
public class c0 extends ArrayList<s<?>> {

    /* renamed from: f, reason: collision with root package name */
    private boolean f7817f;

    /* renamed from: g, reason: collision with root package name */
    private d f7818g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelList.java */
    /* loaded from: classes.dex */
    public class b implements Iterator<s<?>> {

        /* renamed from: f, reason: collision with root package name */
        int f7819f;

        /* renamed from: g, reason: collision with root package name */
        int f7820g;

        /* renamed from: h, reason: collision with root package name */
        int f7821h;

        private b() {
            this.f7820g = -1;
            this.f7821h = ((ArrayList) c0.this).modCount;
        }

        final void a() {
            if (((ArrayList) c0.this).modCount != this.f7821h) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public s<?> next() {
            a();
            int i2 = this.f7819f;
            this.f7819f = i2 + 1;
            this.f7820g = i2;
            return c0.this.get(i2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7819f != c0.this.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f7820g >= 0) {
                a();
                try {
                    c0.this.remove(this.f7820g);
                    this.f7819f = this.f7820g;
                    this.f7820g = -1;
                    this.f7821h = ((ArrayList) c0.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelList.java */
    /* loaded from: classes.dex */
    public class c extends b implements ListIterator<s<?>> {
        c(int i2) {
            super();
            this.f7819f = i2;
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void add(s<?> sVar) {
            a();
            try {
                int i2 = this.f7819f;
                c0.this.add(i2, sVar);
                this.f7819f = i2 + 1;
                this.f7820g = -1;
                this.f7821h = ((ArrayList) c0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public s<?> previous() {
            a();
            int i2 = this.f7819f - 1;
            if (i2 >= 0) {
                this.f7819f = i2;
                this.f7820g = i2;
                return c0.this.get(i2);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(s<?> sVar) {
            if (this.f7820g >= 0) {
                a();
                try {
                    c0.this.set(this.f7820g, sVar);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7819f != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7819f;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7819f - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelList.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(int i2, int i3);

        void b(int i2, int i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(int i2) {
        super(i2);
    }

    private void h0(int i2, int i3) {
        d dVar;
        if (this.f7817f || (dVar = this.f7818g) == null) {
            return;
        }
        dVar.a(i2, i3);
    }

    private void j0(int i2, int i3) {
        d dVar;
        if (this.f7817f || (dVar = this.f7818g) == null) {
            return;
        }
        dVar.b(i2, i3);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends s<?>> collection) {
        h0(size(), collection.size());
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isEmpty()) {
            return;
        }
        j0(0, size());
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void add(int i2, s<?> sVar) {
        h0(i2, 1);
        super.add(i2, sVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean add(s<?> sVar) {
        h0(size(), 1);
        return super.add(sVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<s<?>> iterator() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k0() {
        if (!this.f7817f) {
            this.f7817f = true;
            return;
        }
        throw new IllegalStateException("Notifications already paused");
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public s<?> remove(int i2) {
        j0(i2, 1);
        return (s) super.remove(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<s<?>> listIterator() {
        return new c(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0() {
        if (this.f7817f) {
            this.f7817f = false;
            return;
        }
        throw new IllegalStateException("Notifications already resumed");
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public s<?> set(int i2, s<?> sVar) {
        s<?> sVar2 = (s) super.set(i2, sVar);
        if (sVar2.id() != sVar.id()) {
            j0(i2, 1);
            h0(i2, 1);
        }
        return sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0(d dVar) {
        this.f7818g = dVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        j0(i2, i3 - i2);
        super.removeRange(i2, i3);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public List<s<?>> subList(int i2, int i3) {
        if (i2 < 0 || i3 > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 <= i3) {
            return new e(this, i2, i3);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<s<?>> listIterator(int i2) {
        return new c(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        j0(indexOf, 1);
        super.remove(indexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends s<?>> collection) {
        h0(i2, collection.size());
        return super.addAll(i2, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelList.java */
    /* loaded from: classes.dex */
    public static class e extends AbstractList<s<?>> {

        /* renamed from: f, reason: collision with root package name */
        private final c0 f7824f;

        /* renamed from: g, reason: collision with root package name */
        private int f7825g;

        /* renamed from: h, reason: collision with root package name */
        private int f7826h;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ModelList.java */
        /* loaded from: classes.dex */
        public static final class a implements ListIterator<s<?>> {

            /* renamed from: f, reason: collision with root package name */
            private final e f7827f;

            /* renamed from: g, reason: collision with root package name */
            private final ListIterator<s<?>> f7828g;

            /* renamed from: h, reason: collision with root package name */
            private int f7829h;

            /* renamed from: i, reason: collision with root package name */
            private int f7830i;

            a(ListIterator<s<?>> listIterator, e eVar, int i2, int i3) {
                this.f7828g = listIterator;
                this.f7827f = eVar;
                this.f7829h = i2;
                this.f7830i = i2 + i3;
            }

            @Override // java.util.ListIterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void add(s<?> sVar) {
                this.f7828g.add(sVar);
                this.f7827f.w(true);
                this.f7830i++;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public s<?> next() {
                if (this.f7828g.nextIndex() < this.f7830i) {
                    return this.f7828g.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public s<?> previous() {
                if (this.f7828g.previousIndex() >= this.f7829h) {
                    return this.f7828g.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void set(s<?> sVar) {
                this.f7828g.set(sVar);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f7828g.nextIndex() < this.f7830i;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f7828g.previousIndex() >= this.f7829h;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f7828g.nextIndex() - this.f7829h;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                int previousIndex = this.f7828g.previousIndex();
                int i2 = this.f7829h;
                if (previousIndex >= i2) {
                    return previousIndex - i2;
                }
                return -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                this.f7828g.remove();
                this.f7827f.w(false);
                this.f7830i--;
            }
        }

        e(c0 c0Var, int i2, int i3) {
            this.f7824f = c0Var;
            ((AbstractList) this).modCount = ((ArrayList) c0Var).modCount;
            this.f7825g = i2;
            this.f7826h = i3 - i2;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int i2, s<?> sVar) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                if (i2 >= 0 && i2 <= this.f7826h) {
                    this.f7824f.add(i2 + this.f7825g, sVar);
                    this.f7826h++;
                    ((AbstractList) this).modCount = ((ArrayList) this.f7824f).modCount;
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i2, Collection<? extends s<?>> collection) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                if (i2 >= 0 && i2 <= this.f7826h) {
                    boolean addAll = this.f7824f.addAll(i2 + this.f7825g, collection);
                    if (addAll) {
                        this.f7826h += collection.size();
                        ((AbstractList) this).modCount = ((ArrayList) this.f7824f).modCount;
                    }
                    return addAll;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s<?> get(int i2) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                if (i2 >= 0 && i2 < this.f7826h) {
                    return this.f7824f.get(i2 + this.f7825g);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public s<?> remove(int i2) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                if (i2 >= 0 && i2 < this.f7826h) {
                    s<?> remove = this.f7824f.remove(i2 + this.f7825g);
                    this.f7826h--;
                    ((AbstractList) this).modCount = ((ArrayList) this.f7824f).modCount;
                    return remove;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<s<?>> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<s<?>> listIterator(int i2) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                if (i2 >= 0 && i2 <= this.f7826h) {
                    return new a(this.f7824f.listIterator(i2 + this.f7825g), this, this.f7825g, this.f7826h);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public s<?> set(int i2, s<?> sVar) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                if (i2 >= 0 && i2 < this.f7826h) {
                    return this.f7824f.set(i2 + this.f7825g, sVar);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i2, int i3) {
            if (i2 != i3) {
                if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                    c0 c0Var = this.f7824f;
                    int i4 = this.f7825g;
                    c0Var.removeRange(i2 + i4, i4 + i3);
                    this.f7826h -= i3 - i2;
                    ((AbstractList) this).modCount = ((ArrayList) this.f7824f).modCount;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                return this.f7826h;
            }
            throw new ConcurrentModificationException();
        }

        void w(boolean z) {
            if (z) {
                this.f7826h++;
            } else {
                this.f7826h--;
            }
            ((AbstractList) this).modCount = ((ArrayList) this.f7824f).modCount;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends s<?>> collection) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7824f).modCount) {
                boolean addAll = this.f7824f.addAll(this.f7825g + this.f7826h, collection);
                if (addAll) {
                    this.f7826h += collection.size();
                    ((AbstractList) this).modCount = ((ArrayList) this.f7824f).modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }
    }
}
