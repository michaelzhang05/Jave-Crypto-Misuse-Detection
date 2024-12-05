package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import p1.C3596a;
import p1.EnumC3597b;

/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f17585a;

    /* loaded from: classes3.dex */
    private static final class Adapter<E> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f17586a;

        /* renamed from: b, reason: collision with root package name */
        private final h f17587b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, h hVar) {
            this.f17586a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f17587b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(C3596a c3596a) {
            if (c3596a.N() == EnumC3597b.NULL) {
                c3596a.J();
                return null;
            }
            Collection collection = (Collection) this.f17587b.a();
            c3596a.a();
            while (c3596a.t()) {
                collection.add(this.f17586a.b(c3596a));
            }
            c3596a.h();
            return collection;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p1.c cVar, Collection collection) {
            if (collection == null) {
                cVar.x();
                return;
            }
            cVar.e();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f17586a.d(cVar, it.next());
            }
            cVar.h();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f17585a = cVar;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type d8 = typeToken.d();
        Class c8 = typeToken.c();
        if (!Collection.class.isAssignableFrom(c8)) {
            return null;
        }
        Type h8 = b.h(d8, c8);
        return new Adapter(gson, h8, gson.k(TypeToken.b(h8)), this.f17585a.b(typeToken));
    }
}
