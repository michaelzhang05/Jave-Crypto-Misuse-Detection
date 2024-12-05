package com.google.gson;

import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* loaded from: classes2.dex */
public abstract class q<T> {

    /* compiled from: TypeAdapter.java */
    /* loaded from: classes2.dex */
    class a extends q<T> {
        a() {
        }

        @Override // com.google.gson.q
        public T b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x0() == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            return (T) q.this.b(aVar);
        }

        @Override // com.google.gson.q
        public void d(com.google.gson.stream.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.c0();
            } else {
                q.this.d(cVar, t);
            }
        }
    }

    public final q<T> a() {
        return new a();
    }

    public abstract T b(com.google.gson.stream.a aVar) throws IOException;

    public final j c(T t) {
        try {
            com.google.gson.t.n.f fVar = new com.google.gson.t.n.f();
            d(fVar, t);
            return fVar.D0();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public abstract void d(com.google.gson.stream.c cVar, T t) throws IOException;
}
