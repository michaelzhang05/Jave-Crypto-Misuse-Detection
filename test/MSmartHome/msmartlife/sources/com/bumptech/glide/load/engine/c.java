package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.m.d;
import com.bumptech.glide.load.n.n;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public class c implements f, d.a<Object> {

    /* renamed from: f, reason: collision with root package name */
    private final List<com.bumptech.glide.load.f> f8497f;

    /* renamed from: g, reason: collision with root package name */
    private final g<?> f8498g;

    /* renamed from: h, reason: collision with root package name */
    private final f.a f8499h;

    /* renamed from: i, reason: collision with root package name */
    private int f8500i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.f f8501j;

    /* renamed from: k, reason: collision with root package name */
    private List<com.bumptech.glide.load.n.n<File, ?>> f8502k;
    private int l;
    private volatile n.a<?> m;
    private File n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.l < this.f8502k.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        while (true) {
            boolean z = false;
            if (this.f8502k != null && b()) {
                this.m = null;
                while (!z && b()) {
                    List<com.bumptech.glide.load.n.n<File, ?>> list = this.f8502k;
                    int i2 = this.l;
                    this.l = i2 + 1;
                    this.m = list.get(i2).b(this.n, this.f8498g.s(), this.f8498g.f(), this.f8498g.k());
                    if (this.m != null && this.f8498g.t(this.m.f8733c.a())) {
                        this.m.f8733c.e(this.f8498g.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f8500i + 1;
            this.f8500i = i3;
            if (i3 >= this.f8497f.size()) {
                return false;
            }
            com.bumptech.glide.load.f fVar = this.f8497f.get(this.f8500i);
            File b2 = this.f8498g.d().b(new d(fVar, this.f8498g.o()));
            this.n = b2;
            if (b2 != null) {
                this.f8501j = fVar;
                this.f8502k = this.f8498g.j(b2);
                this.l = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.m.d.a
    public void c(Exception exc) {
        this.f8499h.d(this.f8501j, exc, this.m.f8733c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
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
        this.f8499h.i(this.f8501j, obj, this.m.f8733c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f8501j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<com.bumptech.glide.load.f> list, g<?> gVar, f.a aVar) {
        this.f8500i = -1;
        this.f8497f = list;
        this.f8498g = gVar;
        this.f8499h = aVar;
    }
}
