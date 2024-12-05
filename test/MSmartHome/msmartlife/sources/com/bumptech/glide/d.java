package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.engine.a0.a;
import com.bumptech.glide.load.engine.a0.i;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.m.l;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: GlideBuilder.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private k f8328b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.z.e f8329c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.z.b f8330d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.engine.a0.h f8331e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.engine.b0.a f8332f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.engine.b0.a f8333g;

    /* renamed from: h, reason: collision with root package name */
    private a.InterfaceC0108a f8334h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.engine.a0.i f8335i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.m.d f8336j;
    private l.b m;
    private com.bumptech.glide.load.engine.b0.a n;
    private boolean o;
    private List<com.bumptech.glide.p.g<Object>> p;
    private boolean q;
    private final Map<Class<?>, j<?, ?>> a = new c.e.a();

    /* renamed from: k, reason: collision with root package name */
    private int f8337k = 4;
    private com.bumptech.glide.p.h l = new com.bumptech.glide.p.h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a(Context context) {
        if (this.f8332f == null) {
            this.f8332f = com.bumptech.glide.load.engine.b0.a.f();
        }
        if (this.f8333g == null) {
            this.f8333g = com.bumptech.glide.load.engine.b0.a.d();
        }
        if (this.n == null) {
            this.n = com.bumptech.glide.load.engine.b0.a.b();
        }
        if (this.f8335i == null) {
            this.f8335i = new i.a(context).a();
        }
        if (this.f8336j == null) {
            this.f8336j = new com.bumptech.glide.m.f();
        }
        if (this.f8329c == null) {
            int b2 = this.f8335i.b();
            if (b2 > 0) {
                this.f8329c = new com.bumptech.glide.load.engine.z.k(b2);
            } else {
                this.f8329c = new com.bumptech.glide.load.engine.z.f();
            }
        }
        if (this.f8330d == null) {
            this.f8330d = new com.bumptech.glide.load.engine.z.j(this.f8335i.a());
        }
        if (this.f8331e == null) {
            this.f8331e = new com.bumptech.glide.load.engine.a0.g(this.f8335i.d());
        }
        if (this.f8334h == null) {
            this.f8334h = new com.bumptech.glide.load.engine.a0.f(context);
        }
        if (this.f8328b == null) {
            this.f8328b = new k(this.f8331e, this.f8334h, this.f8333g, this.f8332f, com.bumptech.glide.load.engine.b0.a.h(), com.bumptech.glide.load.engine.b0.a.b(), this.o);
        }
        List<com.bumptech.glide.p.g<Object>> list = this.p;
        if (list == null) {
            this.p = Collections.emptyList();
        } else {
            this.p = Collections.unmodifiableList(list);
        }
        return new c(context, this.f8328b, this.f8331e, this.f8329c, this.f8330d, new l(this.m), this.f8336j, this.f8337k, this.l.T(), this.a, this.p, this.q);
    }

    public d b(com.bumptech.glide.load.engine.z.e eVar) {
        this.f8329c = eVar;
        return this;
    }

    public d c(com.bumptech.glide.p.h hVar) {
        this.l = hVar;
        return this;
    }

    public d d(com.bumptech.glide.load.engine.a0.h hVar) {
        this.f8331e = hVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(l.b bVar) {
        this.m = bVar;
    }
}
