package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p1.C3596a;
import p1.EnumC3597b;
import p1.c;

/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final r f17582c = new r() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            Type d8 = typeToken.d();
            if (!(d8 instanceof GenericArrayType) && (!(d8 instanceof Class) || !((Class) d8).isArray())) {
                return null;
            }
            Type g8 = b.g(d8);
            return new ArrayTypeAdapter(gson, gson.k(TypeToken.b(g8)), b.k(g8));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Class f17583a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f17584b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f17584b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f17583a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public Object b(C3596a c3596a) {
        if (c3596a.N() == EnumC3597b.NULL) {
            c3596a.J();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c3596a.a();
        while (c3596a.t()) {
            arrayList.add(this.f17584b.b(c3596a));
        }
        c3596a.h();
        int size = arrayList.size();
        if (this.f17583a.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.f17583a, size);
            for (int i8 = 0; i8 < size; i8++) {
                Array.set(newInstance, i8, arrayList.get(i8));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f17583a, size));
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.x();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i8 = 0; i8 < length; i8++) {
            this.f17584b.d(cVar, Array.get(obj, i8));
        }
        cVar.h();
    }
}
