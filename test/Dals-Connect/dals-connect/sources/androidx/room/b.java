package androidx.room;

import java.util.Iterator;

/* compiled from: EntityDeletionOrUpdateAdapter.java */
/* loaded from: classes.dex */
public abstract class b<T> extends q {
    public b(j jVar) {
        super(jVar);
    }

    protected abstract void bind(c.q.a.f fVar, T t);

    @Override // androidx.room.q
    protected abstract String createQuery();

    public final int handle(T t) {
        c.q.a.f acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.p();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        c.q.a.f acquire = acquire();
        int i2 = 0;
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                i2 += acquire.p();
            }
            return i2;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        c.q.a.f acquire = acquire();
        try {
            int i2 = 0;
            for (T t : tArr) {
                bind(acquire, t);
                i2 += acquire.p();
            }
            return i2;
        } finally {
            release(acquire);
        }
    }
}
