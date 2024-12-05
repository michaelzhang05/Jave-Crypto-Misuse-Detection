package com.airbnb.epoxy;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: BoundViewHolders.java */
/* loaded from: classes.dex */
public class e implements Iterable<u> {

    /* renamed from: f, reason: collision with root package name */
    private final c.e.d<u> f7836f = new c.e.d<>();

    /* compiled from: BoundViewHolders.java */
    /* loaded from: classes.dex */
    private class b implements Iterator<u> {

        /* renamed from: f, reason: collision with root package name */
        private int f7837f;

        private b() {
            this.f7837f = 0;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u next() {
            if (hasNext()) {
                c.e.d dVar = e.this.f7836f;
                int i2 = this.f7837f;
                this.f7837f = i2 + 1;
                return (u) dVar.p(i2);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7837f < e.this.f7836f.n();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public void b(u uVar) {
        this.f7836f.k(uVar.getItemId(), uVar);
    }

    public void f(u uVar) {
        this.f7836f.l(uVar.getItemId());
    }

    @Override // java.lang.Iterable
    public Iterator<u> iterator() {
        return new b();
    }

    public int size() {
        return this.f7836f.n();
    }
}
