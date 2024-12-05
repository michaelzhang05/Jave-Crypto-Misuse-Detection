package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CircularFifoQueue.java */
/* loaded from: classes2.dex */
public final class w0<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private transient E[] f19325f;

    /* renamed from: g, reason: collision with root package name */
    private transient int f19326g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f19327h;

    /* renamed from: i, reason: collision with root package name */
    private transient boolean f19328i;

    /* renamed from: j, reason: collision with root package name */
    private final int f19329j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularFifoQueue.java */
    /* loaded from: classes2.dex */
    public class a implements Iterator<E> {

        /* renamed from: f, reason: collision with root package name */
        private int f19330f;

        /* renamed from: g, reason: collision with root package name */
        private int f19331g = -1;

        /* renamed from: h, reason: collision with root package name */
        private boolean f19332h;

        a() {
            this.f19330f = w0.this.f19326g;
            this.f19332h = w0.this.f19328i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19332h || this.f19330f != w0.this.f19327h;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                this.f19332h = false;
                int i2 = this.f19330f;
                this.f19331g = i2;
                this.f19330f = w0.this.M(i2);
                return (E) w0.this.f19325f[this.f19331g];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int i2 = this.f19331g;
            if (i2 != -1) {
                if (i2 == w0.this.f19326g) {
                    w0.this.remove();
                    this.f19331g = -1;
                    return;
                }
                int i3 = this.f19331g + 1;
                if (w0.this.f19326g >= this.f19331g || i3 >= w0.this.f19327h) {
                    while (i3 != w0.this.f19327h) {
                        if (i3 >= w0.this.f19329j) {
                            w0.this.f19325f[i3 - 1] = w0.this.f19325f[0];
                            i3 = 0;
                        } else {
                            w0.this.f19325f[w0.this.L(i3)] = w0.this.f19325f[i3];
                            i3 = w0.this.M(i3);
                        }
                    }
                } else {
                    System.arraycopy(w0.this.f19325f, i3, w0.this.f19325f, this.f19331g, w0.this.f19327h - i3);
                }
                this.f19331g = -1;
                w0 w0Var = w0.this;
                w0Var.f19327h = w0Var.L(w0Var.f19327h);
                w0.this.f19325f[w0.this.f19327h] = null;
                w0.this.f19328i = false;
                this.f19330f = w0.this.L(this.f19330f);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public w0() {
        this(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(int i2) {
        int i3 = i2 - 1;
        return i3 < 0 ? this.f19329j - 1 : i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int M(int i2) {
        int i3 = i2 + 1;
        if (i3 >= this.f19329j) {
            return 0;
        }
        return i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f19325f = (E[]) new Object[this.f19329j];
        int readInt = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            ((E[]) this.f19325f)[i2] = objectInputStream.readObject();
        }
        this.f19326g = 0;
        boolean z = readInt == this.f19329j;
        this.f19328i = z;
        if (z) {
            this.f19327h = 0;
        } else {
            this.f19327h = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean N() {
        return size() == this.f19329j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e2) {
        if (e2 != null) {
            if (N()) {
                remove();
            }
            E[] eArr = this.f19325f;
            int i2 = this.f19327h;
            int i3 = i2 + 1;
            this.f19327h = i3;
            eArr[i2] = e2;
            if (i3 >= this.f19329j) {
                this.f19327h = 0;
            }
            if (this.f19327h == this.f19326g) {
                this.f19328i = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f19328i = false;
        this.f19326g = 0;
        this.f19327h = 0;
        Arrays.fill(this.f19325f, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        return add(e2);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f19325f[this.f19326g];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (!isEmpty()) {
            E[] eArr = this.f19325f;
            int i2 = this.f19326g;
            E e2 = eArr[i2];
            if (e2 != null) {
                int i3 = i2 + 1;
                this.f19326g = i3;
                eArr[i2] = null;
                if (i3 >= this.f19329j) {
                    this.f19326g = 0;
                }
                this.f19328i = false;
            }
            return e2;
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i2 = this.f19327h;
        int i3 = this.f19326g;
        if (i2 < i3) {
            return (this.f19329j - i3) + i2;
        }
        if (i2 != i3) {
            return i2 - i3;
        }
        if (this.f19328i) {
            return this.f19329j;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(int i2) {
        this.f19326g = 0;
        this.f19327h = 0;
        this.f19328i = false;
        if (i2 > 0) {
            E[] eArr = (E[]) new Object[i2];
            this.f19325f = eArr;
            this.f19329j = eArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }
}
