package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.m.d;
import com.bumptech.glide.load.n.n;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public class y implements f, d.a<Object>, f.a {

    /* renamed from: f, reason: collision with root package name */
    private final g<?> f8621f;

    /* renamed from: g, reason: collision with root package name */
    private final f.a f8622g;

    /* renamed from: h, reason: collision with root package name */
    private int f8623h;

    /* renamed from: i, reason: collision with root package name */
    private c f8624i;

    /* renamed from: j, reason: collision with root package name */
    private Object f8625j;

    /* renamed from: k, reason: collision with root package name */
    private volatile n.a<?> f8626k;
    private d l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(g<?> gVar, f.a aVar) {
        this.f8621f = gVar;
        this.f8622g = aVar;
    }

    private void b(Object obj) {
        long b2 = com.bumptech.glide.r.f.b();
        try {
            com.bumptech.glide.load.d<X> p = this.f8621f.p(obj);
            e eVar = new e(p, obj, this.f8621f.k());
            this.l = new d(this.f8626k.a, this.f8621f.o());
            this.f8621f.d().a(this.l, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.l + ", data: " + obj + ", encoder: " + p + ", duration: " + com.bumptech.glide.r.f.a(b2));
            }
            this.f8626k.f8733c.b();
            this.f8624i = new c(Collections.singletonList(this.f8626k.a), this.f8621f, this);
        } catch (Throwable th) {
            this.f8626k.f8733c.b();
            throw th;
        }
    }

    private boolean e() {
        return this.f8623h < this.f8621f.g().size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        Object obj = this.f8625j;
        if (obj != null) {
            this.f8625j = null;
            b(obj);
        }
        c cVar = this.f8624i;
        if (cVar != null && cVar.a()) {
            return true;
        }
        this.f8624i = null;
        this.f8626k = null;
        boolean z = false;
        while (!z && e()) {
            List<n.a<?>> g2 = this.f8621f.g();
            int i2 = this.f8623h;
            this.f8623h = i2 + 1;
            this.f8626k = g2.get(i2);
            if (this.f8626k != null && (this.f8621f.e().c(this.f8626k.f8733c.d()) || this.f8621f.t(this.f8626k.f8733c.a()))) {
                this.f8626k.f8733c.e(this.f8621f.l(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.m.d.a
    public void c(Exception exc) {
        this.f8622g.d(this.l, exc, this.f8626k.f8733c, this.f8626k.f8733c.d());
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f8626k;
        if (aVar != null) {
            aVar.f8733c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d(com.bumptech.glide.load.f fVar, Exception exc, com.bumptech.glide.load.m.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f8622g.d(fVar, exc, dVar, this.f8626k.f8733c.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.m.d.a
    public void g(Object obj) {
        j e2 = this.f8621f.e();
        if (obj != null && e2.c(this.f8626k.f8733c.d())) {
            this.f8625j = obj;
            this.f8622g.f();
        } else {
            this.f8622g.i(this.f8626k.a, obj, this.f8626k.f8733c, this.f8626k.f8733c.d(), this.l);
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void i(com.bumptech.glide.load.f fVar, Object obj, com.bumptech.glide.load.m.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.f fVar2) {
        this.f8622g.i(fVar, obj, dVar, this.f8626k.f8733c.d(), fVar);
    }
}
