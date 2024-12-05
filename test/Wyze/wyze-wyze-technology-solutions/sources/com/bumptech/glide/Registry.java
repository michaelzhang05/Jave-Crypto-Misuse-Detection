package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.m.e;
import com.bumptech.glide.load.n.n;
import com.bumptech.glide.load.n.o;
import com.bumptech.glide.load.n.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Registry {
    private final p a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.o.a f8313b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.o.e f8314c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.o.f f8315d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.m.f f8316e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.o.h.f f8317f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.o.b f8318g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.o.d f8319h = new com.bumptech.glide.o.d();

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.o.c f8320i = new com.bumptech.glide.o.c();

    /* renamed from: j, reason: collision with root package name */
    private final c.h.j.g<List<Throwable>> f8321j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        c.h.j.g<List<Throwable>> e2 = com.bumptech.glide.r.l.a.e();
        this.f8321j = e2;
        this.a = new p(e2);
        this.f8313b = new com.bumptech.glide.o.a();
        this.f8314c = new com.bumptech.glide.o.e();
        this.f8315d = new com.bumptech.glide.o.f();
        this.f8316e = new com.bumptech.glide.load.m.f();
        this.f8317f = new com.bumptech.glide.load.o.h.f();
        this.f8318g = new com.bumptech.glide.o.b();
        r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f8314c.d(cls, cls2)) {
            for (Class cls5 : this.f8317f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f8314c.b(cls, cls4), this.f8317f.a(cls4, cls5), this.f8321j));
            }
        }
        return arrayList;
    }

    public <Data> Registry a(Class<Data> cls, com.bumptech.glide.load.d<Data> dVar) {
        this.f8313b.a(cls, dVar);
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, k<TResource> kVar) {
        this.f8315d.a(cls, kVar);
        return this;
    }

    public <Data, TResource> Registry c(Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.j<Data, TResource> jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public <Model, Data> Registry d(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        this.a.a(cls, cls2, oVar);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.j<Data, TResource> jVar) {
        this.f8314c.a(str, jVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b2 = this.f8318g.b();
        if (b2.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b2;
    }

    public <Data, TResource, Transcode> s<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s<Data, TResource, Transcode> a = this.f8320i.a(cls, cls2, cls3);
        if (this.f8320i.c(a)) {
            return null;
        }
        if (a == null) {
            List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f2 = f(cls, cls2, cls3);
            a = f2.isEmpty() ? null : new s<>(cls, cls2, cls3, f2, this.f8321j);
            this.f8320i.d(cls, cls2, cls3, a);
        }
        return a;
    }

    public <Model> List<n<Model, ?>> i(Model model) {
        List<n<Model, ?>> d2 = this.a.d(model);
        if (d2.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        return d2;
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f8319h.a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            Iterator<Class<?>> it = this.a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f8314c.d(it.next(), cls2)) {
                    if (!this.f8317f.b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.f8319h.b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    public <X> k<X> k(u<X> uVar) throws NoResultEncoderAvailableException {
        k<X> b2 = this.f8315d.b(uVar.e());
        if (b2 != null) {
            return b2;
        }
        throw new NoResultEncoderAvailableException(uVar.e());
    }

    public <X> com.bumptech.glide.load.m.e<X> l(X x) {
        return this.f8316e.a(x);
    }

    public <X> com.bumptech.glide.load.d<X> m(X x) throws NoSourceEncoderAvailableException {
        com.bumptech.glide.load.d<X> b2 = this.f8313b.b(x.getClass());
        if (b2 != null) {
            return b2;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    public boolean n(u<?> uVar) {
        return this.f8315d.b(uVar.e()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f8318g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a<?> aVar) {
        this.f8316e.b(aVar);
        return this;
    }

    public <TResource, Transcode> Registry q(Class<TResource> cls, Class<Transcode> cls2, com.bumptech.glide.load.o.h.e<TResource, Transcode> eVar) {
        this.f8317f.c(cls, cls2, eVar);
        return this;
    }

    public final Registry r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f8314c.e(arrayList);
        return this;
    }
}
