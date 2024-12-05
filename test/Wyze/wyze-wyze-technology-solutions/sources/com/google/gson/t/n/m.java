package com.google.gson.t.n;

import com.google.gson.q;
import com.google.gson.t.n.i;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes2.dex */
public final class m<T> extends q<T> {
    private final com.google.gson.e a;

    /* renamed from: b, reason: collision with root package name */
    private final q<T> f16956b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f16957c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(com.google.gson.e eVar, q<T> qVar, Type type) {
        this.a = eVar;
        this.f16956b = qVar;
        this.f16957c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.q
    public T b(com.google.gson.stream.a aVar) throws IOException {
        return this.f16956b.b(aVar);
    }

    @Override // com.google.gson.q
    public void d(com.google.gson.stream.c cVar, T t) throws IOException {
        q<T> qVar = this.f16956b;
        Type e2 = e(this.f16957c, t);
        if (e2 != this.f16957c) {
            qVar = this.a.j(com.google.gson.u.a.get(e2));
            if (qVar instanceof i.b) {
                q<T> qVar2 = this.f16956b;
                if (!(qVar2 instanceof i.b)) {
                    qVar = qVar2;
                }
            }
        }
        qVar.d(cVar, t);
    }
}
