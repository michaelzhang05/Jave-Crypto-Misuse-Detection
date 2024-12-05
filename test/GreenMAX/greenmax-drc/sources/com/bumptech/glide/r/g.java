package com.bumptech.glide.r;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class g<T, Y> {
    private final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f8957b;

    /* renamed from: c, reason: collision with root package name */
    private long f8958c;

    /* renamed from: d, reason: collision with root package name */
    private long f8959d;

    public g(long j2) {
        this.f8957b = j2;
        this.f8958c = j2;
    }

    private void f() {
        m(this.f8958c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(T t) {
        return this.a.get(t);
    }

    public synchronized long h() {
        return this.f8958c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int i(Y y) {
        return 1;
    }

    protected void j(T t, Y y) {
    }

    public synchronized Y k(T t, Y y) {
        long i2 = i(y);
        if (i2 >= this.f8958c) {
            j(t, y);
            return null;
        }
        if (y != null) {
            this.f8959d += i2;
        }
        Y put = this.a.put(t, y);
        if (put != null) {
            this.f8959d -= i(put);
            if (!put.equals(y)) {
                j(t, put);
            }
        }
        f();
        return put;
    }

    public synchronized Y l(T t) {
        Y remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.f8959d -= i(remove);
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void m(long j2) {
        while (this.f8959d > j2) {
            Iterator<Map.Entry<T, Y>> it = this.a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f8959d -= i(value);
            T key = next.getKey();
            it.remove();
            j(key, value);
        }
    }
}
