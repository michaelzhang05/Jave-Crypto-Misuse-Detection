package com.google.gson;

import java.io.IOException;
import s1.C3990a;
import s1.EnumC3991b;

/* loaded from: classes4.dex */
public abstract class TypeAdapter {
    public final TypeAdapter a() {
        return new TypeAdapter() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public Object b(C3990a c3990a) {
                if (c3990a.N() == EnumC3991b.NULL) {
                    c3990a.J();
                    return null;
                }
                return TypeAdapter.this.b(c3990a);
            }

            @Override // com.google.gson.TypeAdapter
            public void d(s1.c cVar, Object obj) {
                if (obj == null) {
                    cVar.A();
                } else {
                    TypeAdapter.this.d(cVar, obj);
                }
            }
        };
    }

    public abstract Object b(C3990a c3990a);

    public final f c(Object obj) {
        try {
            com.google.gson.internal.bind.a aVar = new com.google.gson.internal.bind.a();
            d(aVar, obj);
            return aVar.T();
        } catch (IOException e8) {
            throw new g(e8);
        }
    }

    public abstract void d(s1.c cVar, Object obj);
}
