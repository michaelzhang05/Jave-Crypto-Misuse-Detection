package com.bumptech.glide.load.n;

import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.m.d;
import com.bumptech.glide.load.n.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
class q<Model, Data> implements n<Model, Data> {
    private final List<n<Model, Data>> a;

    /* renamed from: b, reason: collision with root package name */
    private final c.h.j.g<List<Throwable>> f8735b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: classes.dex */
    static class a<Data> implements com.bumptech.glide.load.m.d<Data>, d.a<Data> {

        /* renamed from: f, reason: collision with root package name */
        private final List<com.bumptech.glide.load.m.d<Data>> f8736f;

        /* renamed from: g, reason: collision with root package name */
        private final c.h.j.g<List<Throwable>> f8737g;

        /* renamed from: h, reason: collision with root package name */
        private int f8738h;

        /* renamed from: i, reason: collision with root package name */
        private com.bumptech.glide.g f8739i;

        /* renamed from: j, reason: collision with root package name */
        private d.a<? super Data> f8740j;

        /* renamed from: k, reason: collision with root package name */
        private List<Throwable> f8741k;
        private boolean l;

        a(List<com.bumptech.glide.load.m.d<Data>> list, c.h.j.g<List<Throwable>> gVar) {
            this.f8737g = gVar;
            com.bumptech.glide.r.j.c(list);
            this.f8736f = list;
            this.f8738h = 0;
        }

        private void f() {
            if (this.l) {
                return;
            }
            if (this.f8738h < this.f8736f.size() - 1) {
                this.f8738h++;
                e(this.f8739i, this.f8740j);
            } else {
                com.bumptech.glide.r.j.d(this.f8741k);
                this.f8740j.c(new GlideException("Fetch failed", new ArrayList(this.f8741k)));
            }
        }

        @Override // com.bumptech.glide.load.m.d
        public Class<Data> a() {
            return this.f8736f.get(0).a();
        }

        @Override // com.bumptech.glide.load.m.d
        public void b() {
            List<Throwable> list = this.f8741k;
            if (list != null) {
                this.f8737g.a(list);
            }
            this.f8741k = null;
            Iterator<com.bumptech.glide.load.m.d<Data>> it = this.f8736f.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.m.d.a
        public void c(Exception exc) {
            ((List) com.bumptech.glide.r.j.d(this.f8741k)).add(exc);
            f();
        }

        @Override // com.bumptech.glide.load.m.d
        public void cancel() {
            this.l = true;
            Iterator<com.bumptech.glide.load.m.d<Data>> it = this.f8736f.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.m.d
        public com.bumptech.glide.load.a d() {
            return this.f8736f.get(0).d();
        }

        @Override // com.bumptech.glide.load.m.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f8739i = gVar;
            this.f8740j = aVar;
            this.f8741k = this.f8737g.b();
            this.f8736f.get(this.f8738h).e(gVar, this);
            if (this.l) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.m.d.a
        public void g(Data data) {
            if (data != null) {
                this.f8740j.g(data);
            } else {
                f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(List<n<Model, Data>> list, c.h.j.g<List<Throwable>> gVar) {
        this.a = list;
        this.f8735b = gVar;
    }

    @Override // com.bumptech.glide.load.n.n
    public boolean a(Model model) {
        Iterator<n<Model, Data>> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.n.n
    public n.a<Data> b(Model model, int i2, int i3, com.bumptech.glide.load.i iVar) {
        n.a<Data> b2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.f fVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n<Model, Data> nVar = this.a.get(i4);
            if (nVar.a(model) && (b2 = nVar.b(model, i2, i3, iVar)) != null) {
                fVar = b2.a;
                arrayList.add(b2.f8733c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f8735b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
