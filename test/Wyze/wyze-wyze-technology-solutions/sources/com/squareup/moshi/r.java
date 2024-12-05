package com.squareup.moshi;

import com.squareup.moshi.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Moshi.java */
/* loaded from: classes2.dex */
public final class r {
    static final List<f.e> a;

    /* renamed from: b, reason: collision with root package name */
    private final List<f.e> f17296b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17297c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<c> f17298d = new ThreadLocal<>();

    /* renamed from: e, reason: collision with root package name */
    private final Map<Object, f<?>> f17299e = new LinkedHashMap();

    /* compiled from: Moshi.java */
    /* loaded from: classes2.dex */
    public static final class a {
        final List<f.e> a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f17300b = 0;

        public a a(f.e eVar) {
            if (eVar != null) {
                List<f.e> list = this.a;
                int i2 = this.f17300b;
                this.f17300b = i2 + 1;
                list.add(i2, eVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public r b() {
            return new r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Moshi.java */
    /* loaded from: classes2.dex */
    public static final class b<T> extends f<T> {
        final Type a;

        /* renamed from: b, reason: collision with root package name */
        final String f17301b;

        /* renamed from: c, reason: collision with root package name */
        final Object f17302c;

        /* renamed from: d, reason: collision with root package name */
        f<T> f17303d;

        b(Type type, String str, Object obj) {
            this.a = type;
            this.f17301b = str;
            this.f17302c = obj;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(i iVar) throws IOException {
            f<T> fVar = this.f17303d;
            if (fVar != null) {
                return fVar.fromJson(iVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, T t) throws IOException {
            f<T> fVar = this.f17303d;
            if (fVar != null) {
                fVar.toJson(oVar, (o) t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            f<T> fVar = this.f17303d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Moshi.java */
    /* loaded from: classes2.dex */
    public final class c {
        final List<b<?>> a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final Deque<b<?>> f17304b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        boolean f17305c;

        c() {
        }

        <T> void a(f<T> fVar) {
            this.f17304b.getLast().f17303d = fVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (this.f17305c) {
                return illegalArgumentException;
            }
            this.f17305c = true;
            if (this.f17304b.size() == 1 && this.f17304b.getFirst().f17301b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<b<?>> descendingIterator = this.f17304b.descendingIterator();
            while (descendingIterator.hasNext()) {
                b<?> next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.a);
                if (next.f17301b != null) {
                    sb.append(' ');
                    sb.append(next.f17301b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        void c(boolean z) {
            this.f17304b.removeLast();
            if (this.f17304b.isEmpty()) {
                r.this.f17298d.remove();
                if (z) {
                    synchronized (r.this.f17299e) {
                        int size = this.a.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            b<?> bVar = this.a.get(i2);
                            f<T> fVar = (f) r.this.f17299e.put(bVar.f17302c, bVar.f17303d);
                            if (fVar != 0) {
                                bVar.f17303d = fVar;
                                r.this.f17299e.put(bVar.f17302c, fVar);
                            }
                        }
                    }
                }
            }
        }

        <T> f<T> d(Type type, String str, Object obj) {
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                b<?> bVar = this.a.get(i2);
                if (bVar.f17302c.equals(obj)) {
                    this.f17304b.add(bVar);
                    f<T> fVar = (f<T>) bVar.f17303d;
                    return fVar != null ? fVar : bVar;
                }
            }
            b<?> bVar2 = new b<>(type, str, obj);
            this.a.add(bVar2);
            this.f17304b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        a = arrayList;
        arrayList.add(t.a);
        arrayList.add(d.a);
        arrayList.add(q.a);
        arrayList.add(com.squareup.moshi.a.a);
        arrayList.add(s.a);
        arrayList.add(com.squareup.moshi.c.a);
    }

    r(a aVar) {
        int size = aVar.a.size();
        List<f.e> list = a;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.a);
        arrayList.addAll(list);
        this.f17296b = Collections.unmodifiableList(arrayList);
        this.f17297c = aVar.f17300b;
    }

    private Object g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    public <T> f<T> c(Class<T> cls) {
        return e(cls, com.squareup.moshi.w.c.a);
    }

    public <T> f<T> d(Type type) {
        return e(type, com.squareup.moshi.w.c.a);
    }

    public <T> f<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, null);
    }

    public <T> f<T> f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set != null) {
            Type o = com.squareup.moshi.w.c.o(com.squareup.moshi.w.c.a(type));
            Object g2 = g(o, set);
            synchronized (this.f17299e) {
                f<T> fVar = (f) this.f17299e.get(g2);
                if (fVar != null) {
                    return fVar;
                }
                c cVar = this.f17298d.get();
                if (cVar == null) {
                    cVar = new c();
                    this.f17298d.set(cVar);
                }
                f<T> d2 = cVar.d(o, str, g2);
                try {
                    if (d2 != null) {
                        return d2;
                    }
                    try {
                        int size = this.f17296b.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            f<T> fVar2 = (f<T>) this.f17296b.get(i2).a(o, set, this);
                            if (fVar2 != null) {
                                cVar.a(fVar2);
                                cVar.c(true);
                                return fVar2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + com.squareup.moshi.w.c.t(o, set));
                    } catch (IllegalArgumentException e2) {
                        throw cVar.b(e2);
                    }
                } finally {
                    cVar.c(false);
                }
            }
        }
        throw new NullPointerException("annotations == null");
    }
}
