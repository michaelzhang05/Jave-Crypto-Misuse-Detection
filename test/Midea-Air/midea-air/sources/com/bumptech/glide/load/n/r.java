package com.bumptech.glide.load.n;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.n.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public class r {
    private static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final n<Object, Object> f8742b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final List<b<?, ?>> f8743c;

    /* renamed from: d, reason: collision with root package name */
    private final c f8744d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<b<?, ?>> f8745e;

    /* renamed from: f, reason: collision with root package name */
    private final c.h.j.g<List<Throwable>> f8746f;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.n.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.n.n
        public n.a<Object> b(Object obj, int i2, int i3, com.bumptech.glide.load.i iVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {
        private final Class<Model> a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f8747b;

        /* renamed from: c, reason: collision with root package name */
        final o<? extends Model, ? extends Data> f8748c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.f8747b = cls2;
            this.f8748c = oVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f8747b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public <Model, Data> q<Model, Data> a(List<n<Model, Data>> list, c.h.j.g<List<Throwable>> gVar) {
            return new q<>(list, gVar);
        }
    }

    public r(c.h.j.g<List<Throwable>> gVar) {
        this(gVar, a);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f8743c;
        list.add(z ? list.size() : 0, bVar);
    }

    private <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        return (n) com.bumptech.glide.r.j.d(bVar.f8748c.b(this));
    }

    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f8742b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized <Model, Data> n<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f8743c) {
                if (this.f8745e.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f8745e.add(bVar);
                    arrayList.add(c(bVar));
                    this.f8745e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f8744d.a(arrayList, this.f8746f);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (z) {
                return f();
            }
            throw new Registry.NoModelLoaderAvailableException(cls, cls2);
        } catch (Throwable th) {
            this.f8745e.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model> List<n<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f8743c) {
                if (!this.f8745e.contains(bVar) && bVar.a(cls)) {
                    this.f8745e.add(bVar);
                    arrayList.add(c(bVar));
                    this.f8745e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f8745e.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f8743c) {
            if (!arrayList.contains(bVar.f8747b) && bVar.a(cls)) {
                arrayList.add(bVar.f8747b);
            }
        }
        return arrayList;
    }

    r(c.h.j.g<List<Throwable>> gVar, c cVar) {
        this.f8743c = new ArrayList();
        this.f8745e = new HashSet();
        this.f8746f = gVar;
        this.f8744d = cVar;
    }
}
