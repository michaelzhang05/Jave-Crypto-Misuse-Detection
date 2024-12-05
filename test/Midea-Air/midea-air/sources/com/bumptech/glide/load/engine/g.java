package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.n.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class g<Transcode> {
    private final List<n.a<?>> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.f> f8510b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f8511c;

    /* renamed from: d, reason: collision with root package name */
    private Object f8512d;

    /* renamed from: e, reason: collision with root package name */
    private int f8513e;

    /* renamed from: f, reason: collision with root package name */
    private int f8514f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f8515g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f8516h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.i f8517i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, com.bumptech.glide.load.l<?>> f8518j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f8519k;
    private boolean l;
    private boolean m;
    private com.bumptech.glide.load.f n;
    private com.bumptech.glide.g o;
    private j p;
    private boolean q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f8511c = null;
        this.f8512d = null;
        this.n = null;
        this.f8515g = null;
        this.f8519k = null;
        this.f8517i = null;
        this.o = null;
        this.f8518j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.f8510b.clear();
        this.m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.engine.z.b b() {
        return this.f8511c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.bumptech.glide.load.f> c() {
        if (!this.m) {
            this.m = true;
            this.f8510b.clear();
            List<n.a<?>> g2 = g();
            int size = g2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> aVar = g2.get(i2);
                if (!this.f8510b.contains(aVar.a)) {
                    this.f8510b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.f8732b.size(); i3++) {
                    if (!this.f8510b.contains(aVar.f8732b.get(i3))) {
                        this.f8510b.add(aVar.f8732b.get(i3));
                    }
                }
            }
        }
        return this.f8510b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.engine.a0.a d() {
        return this.f8516h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j e() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f8514f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List i2 = this.f8511c.h().i(this.f8512d);
            int size = i2.size();
            for (int i3 = 0; i3 < size; i3++) {
                n.a<?> b2 = ((com.bumptech.glide.load.n.n) i2.get(i3)).b(this.f8512d, this.f8513e, this.f8514f, this.f8517i);
                if (b2 != null) {
                    this.a.add(b2);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Data> s<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f8511c.h().h(cls, this.f8515g, this.f8519k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f8512d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.bumptech.glide.load.n.n<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f8511c.h().i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.i k() {
        return this.f8517i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.g l() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.f8511c.h().j(this.f8512d.getClass(), this.f8515g, this.f8519k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> com.bumptech.glide.load.k<Z> n(u<Z> uVar) {
        return this.f8511c.h().k(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.f o() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <X> com.bumptech.glide.load.d<X> p(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f8511c.h().m(x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> q() {
        return this.f8519k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> com.bumptech.glide.load.l<Z> r(Class<Z> cls) {
        com.bumptech.glide.load.l<Z> lVar = (com.bumptech.glide.load.l) this.f8518j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.l<?>>> it = this.f8518j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.bumptech.glide.load.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (com.bumptech.glide.load.l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (this.f8518j.isEmpty() && this.q) {
            throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        }
        return com.bumptech.glide.load.o.b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.f8513e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void u(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.f fVar, int i2, int i3, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, com.bumptech.glide.load.i iVar, Map<Class<?>, com.bumptech.glide.load.l<?>> map, boolean z, boolean z2, h.e eVar2) {
        this.f8511c = eVar;
        this.f8512d = obj;
        this.n = fVar;
        this.f8513e = i2;
        this.f8514f = i3;
        this.p = jVar;
        this.f8515g = cls;
        this.f8516h = eVar2;
        this.f8519k = cls2;
        this.o = gVar;
        this.f8517i = iVar;
        this.f8518j = map;
        this.q = z;
        this.r = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v(u<?> uVar) {
        return this.f8511c.h().n(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(com.bumptech.glide.load.f fVar) {
        List<n.a<?>> g2 = g();
        int size = g2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (g2.get(i2).a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
