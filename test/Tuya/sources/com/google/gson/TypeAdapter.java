package com.google.gson;

import java.io.IOException;
import p1.C3596a;
import p1.EnumC3597b;

/* loaded from: classes3.dex */
public abstract class TypeAdapter {
    public final TypeAdapter a() {
        return new TypeAdapter() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public Object b(C3596a c3596a) {
                if (c3596a.N() == EnumC3597b.NULL) {
                    c3596a.J();
                    return null;
                }
                return TypeAdapter.this.b(c3596a);
            }

            @Override // com.google.gson.TypeAdapter
            public void d(p1.c cVar, Object obj) {
                if (obj == null) {
                    cVar.x();
                } else {
                    TypeAdapter.this.d(cVar, obj);
                }
            }
        };
    }

    public abstract Object b(C3596a c3596a);

    public final f c(Object obj) {
        try {
            com.google.gson.internal.bind.a aVar = new com.google.gson.internal.bind.a();
            d(aVar, obj);
            return aVar.T();
        } catch (IOException e8) {
            throw new g(e8);
        }
    }

    public abstract void d(p1.c cVar, Object obj);
}
