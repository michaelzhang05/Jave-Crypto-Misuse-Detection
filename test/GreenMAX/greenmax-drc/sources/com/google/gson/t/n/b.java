package com.google.gson.t.n;

import com.google.gson.q;
import com.google.gson.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class b implements r {

    /* renamed from: f, reason: collision with root package name */
    private final com.google.gson.t.c f16923f;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    private static final class a<E> extends q<Collection<E>> {
        private final q<E> a;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.gson.t.i<? extends Collection<E>> f16924b;

        public a(com.google.gson.e eVar, Type type, q<E> qVar, com.google.gson.t.i<? extends Collection<E>> iVar) {
            this.a = new m(eVar, qVar, type);
            this.f16924b = iVar;
        }

        @Override // com.google.gson.q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            Collection<E> a = this.f16924b.a();
            aVar.a();
            while (aVar.L()) {
                a.add(this.a.b(aVar));
            }
            aVar.z();
            return a;
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.c0();
                return;
            }
            cVar.f();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.d(cVar, it.next());
            }
            cVar.z();
        }
    }

    public b(com.google.gson.t.c cVar) {
        this.f16923f = cVar;
    }

    @Override // com.google.gson.r
    public <T> q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h2 = com.google.gson.t.b.h(type, rawType);
        return new a(eVar, h2, eVar.j(com.google.gson.u.a.get(h2)), this.f16923f.a(aVar));
    }
}
