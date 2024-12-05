package com.squareup.moshi.w;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.i;
import com.squareup.moshi.o;
import java.io.IOException;

/* compiled from: NonNullJsonAdapter.java */
/* loaded from: classes2.dex */
public final class a<T> extends f<T> {
    private final f<T> a;

    public a(f<T> fVar) {
        this.a = fVar;
    }

    @Override // com.squareup.moshi.f
    public T fromJson(i iVar) throws IOException {
        if (iVar.i0() != i.b.NULL) {
            return this.a.fromJson(iVar);
        }
        throw new JsonDataException("Unexpected null at " + iVar.c());
    }

    @Override // com.squareup.moshi.f
    public void toJson(o oVar, T t) throws IOException {
        if (t != null) {
            this.a.toJson(oVar, (o) t);
            return;
        }
        throw new JsonDataException("Unexpected null at " + oVar.c());
    }

    public String toString() {
        return this.a + ".nonNull()";
    }
}
