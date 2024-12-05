package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.m.d;
import com.bumptech.glide.load.n.n;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public class v implements f, d.a<Object> {

    /* renamed from: f, reason: collision with root package name */
    private final f.a f8605f;

    /* renamed from: g, reason: collision with root package name */
    private final g<?> f8606g;

    /* renamed from: h, reason: collision with root package name */
    private int f8607h;

    /* renamed from: i, reason: collision with root package name */
    private int f8608i = -1;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.f f8609j;

    /* renamed from: k, reason: collision with root package name */
    private List<com.bumptech.glide.load.n.n<File, ?>> f8610k;
    private int l;
    private volatile n.a<?> m;
    private File n;
    private w o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(g<?> gVar, f.a aVar) {
        this.f8606g = gVar;
        this.f8605f = aVar;
    }

    private boolean b() {
        return this.l < this.f8610k.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        List<com.bumptech.glide.load.f> c2 = this.f8606g.c();
        boolean z = false;
        if (c2.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f8606g.m();
        if (m.isEmpty()) {
            if (File.class.equals(this.f8606g.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f8606g.i() + " to " + this.f8606g.q());
        }
        while (true) {
            if (this.f8610k != null && b()) {
                this.m = null;
                while (!z && b()) {
                    List<com.bumptech.glide.load.n.n<File, ?>> list = this.f8610k;
                    int i2 = this.l;
                    this.l = i2 + 1;
                    this.m = list.get(i2).b(this.n, this.f8606g.s(), this.f8606g.f(), this.f8606g.k());
                    if (this.m != null && this.f8606g.t(this.m.f8733c.a())) {
                        this.m.f8733c.e(this.f8606g.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f8608i + 1;
            this.f8608i = i3;
            if (i3 >= m.size()) {
                int i4 = this.f8607h + 1;
                this.f8607h = i4;
                if (i4 >= c2.size()) {
                    return false;
                }
                this.f8608i = 0;
            }
            com.bumptech.glide.load.f fVar = c2.get(this.f8607h);
            Class<?> cls = m.get(this.f8608i);
            this.o = new w(this.f8606g.b(), fVar, this.f8606g.o(), this.f8606g.s(), this.f8606g.f(), this.f8606g.r(cls), cls, this.f8606g.k());
            File b2 = this.f8606g.d().b(this.o);
            this.n = b2;
            if (b2 != null) {
                this.f8609j = fVar;
                this.f8610k = this.f8606g.j(b2);
                this.l = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.m.d.a
    public void c(Exception exc) {
        this.f8605f.d(this.o, exc, this.m.f8733c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.m;
        if (aVar != null) {
            aVar.f8733c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.m.d.a
    public void g(Object obj) {
        this.f8605f.i(this.f8609j, obj, this.m.f8733c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.o);
    }
}
