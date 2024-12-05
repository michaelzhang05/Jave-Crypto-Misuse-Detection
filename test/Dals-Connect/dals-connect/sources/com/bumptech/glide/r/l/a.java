package com.bumptech.glide.r.l;

import android.util.Log;
import c.h.j.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {
    private static final g<Object> a = new C0126a();

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.r.l.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0126a implements g<Object> {
        C0126a() {
        }

        @Override // com.bumptech.glide.r.l.a.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.r.l.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // com.bumptech.glide.r.l.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public static final class e<T> implements c.h.j.g<T> {
        private final d<T> a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f8964b;

        /* renamed from: c, reason: collision with root package name */
        private final c.h.j.g<T> f8965c;

        e(c.h.j.g<T> gVar, d<T> dVar, g<T> gVar2) {
            this.f8965c = gVar;
            this.a = dVar;
            this.f8964b = gVar2;
        }

        @Override // c.h.j.g
        public boolean a(T t) {
            if (t instanceof f) {
                ((f) t).n().b(true);
            }
            this.f8964b.a(t);
            return this.f8965c.a(t);
        }

        @Override // c.h.j.g
        public T b() {
            T b2 = this.f8965c.b();
            if (b2 == null) {
                b2 = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b2.getClass());
                }
            }
            if (b2 instanceof f) {
                b2.n().b(false);
            }
            return (T) b2;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface f {
        com.bumptech.glide.r.l.c n();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface g<T> {
        void a(T t);
    }

    private static <T extends f> c.h.j.g<T> a(c.h.j.g<T> gVar, d<T> dVar) {
        return b(gVar, dVar, c());
    }

    private static <T> c.h.j.g<T> b(c.h.j.g<T> gVar, d<T> dVar, g<T> gVar2) {
        return new e(gVar, dVar, gVar2);
    }

    private static <T> g<T> c() {
        return (g<T>) a;
    }

    public static <T extends f> c.h.j.g<T> d(int i2, d<T> dVar) {
        return a(new i(i2), dVar);
    }

    public static <T> c.h.j.g<List<T>> e() {
        return f(20);
    }

    public static <T> c.h.j.g<List<T>> f(int i2) {
        return b(new i(i2), new b(), new c());
    }
}
