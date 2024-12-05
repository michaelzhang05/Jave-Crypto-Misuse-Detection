package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.k;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public class e extends ContextWrapper {
    static final j<?, ?> a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.z.b f8338b;

    /* renamed from: c, reason: collision with root package name */
    private final Registry f8339c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.p.l.e f8340d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.p.h f8341e;

    /* renamed from: f, reason: collision with root package name */
    private final List<com.bumptech.glide.p.g<Object>> f8342f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Class<?>, j<?, ?>> f8343g;

    /* renamed from: h, reason: collision with root package name */
    private final k f8344h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8345i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8346j;

    public e(Context context, com.bumptech.glide.load.engine.z.b bVar, Registry registry, com.bumptech.glide.p.l.e eVar, com.bumptech.glide.p.h hVar, Map<Class<?>, j<?, ?>> map, List<com.bumptech.glide.p.g<Object>> list, k kVar, boolean z, int i2) {
        super(context.getApplicationContext());
        this.f8338b = bVar;
        this.f8339c = registry;
        this.f8340d = eVar;
        this.f8341e = hVar;
        this.f8342f = list;
        this.f8343g = map;
        this.f8344h = kVar;
        this.f8345i = z;
        this.f8346j = i2;
    }

    public <X> com.bumptech.glide.p.l.j<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f8340d.a(imageView, cls);
    }

    public com.bumptech.glide.load.engine.z.b b() {
        return this.f8338b;
    }

    public List<com.bumptech.glide.p.g<Object>> c() {
        return this.f8342f;
    }

    public com.bumptech.glide.p.h d() {
        return this.f8341e;
    }

    public <T> j<?, T> e(Class<T> cls) {
        j<?, T> jVar = (j) this.f8343g.get(cls);
        if (jVar == null) {
            for (Map.Entry<Class<?>, j<?, ?>> entry : this.f8343g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    jVar = (j) entry.getValue();
                }
            }
        }
        return jVar == null ? (j<?, T>) a : jVar;
    }

    public k f() {
        return this.f8344h;
    }

    public int g() {
        return this.f8346j;
    }

    public Registry h() {
        return this.f8339c;
    }

    public boolean i() {
        return this.f8345i;
    }
}
