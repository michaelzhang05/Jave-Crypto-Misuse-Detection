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
import s1.C3990a;
import s1.EnumC3991b;
import s1.c;

/* loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final r f18637c = new r() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
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
    private final Class f18638a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f18639b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f18639b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f18638a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public Object b(C3990a c3990a) {
        if (c3990a.N() == EnumC3991b.NULL) {
            c3990a.J();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c3990a.a();
        while (c3990a.v()) {
            arrayList.add(this.f18639b.b(c3990a));
        }
        c3990a.m();
        int size = arrayList.size();
        if (this.f18638a.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.f18638a, size);
            for (int i8 = 0; i8 < size; i8++) {
                Array.set(newInstance, i8, arrayList.get(i8));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f18638a, size));
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.A();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj);
        for (int i8 = 0; i8 < length; i8++) {
            this.f18639b.d(cVar, Array.get(obj, i8));
        }
        cVar.m();
    }
}
