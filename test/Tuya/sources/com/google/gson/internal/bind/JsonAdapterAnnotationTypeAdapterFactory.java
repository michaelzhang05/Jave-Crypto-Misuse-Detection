package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import m1.b;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f17594a;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f17594a = cVar;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        b bVar = (b) typeToken.c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f17594a, gson, typeToken, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapter b(c cVar, Gson gson, TypeToken typeToken, b bVar) {
        TypeAdapter a8;
        Object a9 = cVar.b(TypeToken.a(bVar.value())).a();
        boolean nullSafe = bVar.nullSafe();
        if (a9 instanceof TypeAdapter) {
            a8 = (TypeAdapter) a9;
        } else if (a9 instanceof r) {
            a8 = ((r) a9).a(gson, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a9.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (a8 != null && nullSafe) {
            return a8.a();
        }
        return a8;
    }
}
