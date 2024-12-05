package com.google.gson.t.n;

import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import java.io.IOException;

/* compiled from: TreeTypeAdapter.java */
/* loaded from: classes2.dex */
public final class l<T> extends q<T> {
    private final o<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.i<T> f16950b;

    /* renamed from: c, reason: collision with root package name */
    final com.google.gson.e f16951c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.u.a<T> f16952d;

    /* renamed from: e, reason: collision with root package name */
    private final r f16953e;

    /* renamed from: f, reason: collision with root package name */
    private final l<T>.b f16954f = new b();

    /* renamed from: g, reason: collision with root package name */
    private q<T> f16955g;

    /* compiled from: TreeTypeAdapter.java */
    /* loaded from: classes2.dex */
    private final class b implements com.google.gson.n, com.google.gson.h {
        private b() {
        }
    }

    public l(o<T> oVar, com.google.gson.i<T> iVar, com.google.gson.e eVar, com.google.gson.u.a<T> aVar, r rVar) {
        this.a = oVar;
        this.f16950b = iVar;
        this.f16951c = eVar;
        this.f16952d = aVar;
        this.f16953e = rVar;
    }

    private q<T> e() {
        q<T> qVar = this.f16955g;
        if (qVar != null) {
            return qVar;
        }
        q<T> l = this.f16951c.l(this.f16953e, this.f16952d);
        this.f16955g = l;
        return l;
    }

    @Override // com.google.gson.q
    public T b(com.google.gson.stream.a aVar) throws IOException {
        if (this.f16950b == null) {
            return e().b(aVar);
        }
        com.google.gson.j a2 = com.google.gson.t.l.a(aVar);
        if (a2.w()) {
            return null;
        }
        return this.f16950b.a(a2, this.f16952d.getType(), this.f16954f);
    }

    @Override // com.google.gson.q
    public void d(com.google.gson.stream.c cVar, T t) throws IOException {
        o<T> oVar = this.a;
        if (oVar == null) {
            e().d(cVar, t);
        } else if (t == null) {
            cVar.c0();
        } else {
            com.google.gson.t.l.b(oVar.a(t, this.f16952d.getType(), this.f16954f), cVar);
        }
    }
}
