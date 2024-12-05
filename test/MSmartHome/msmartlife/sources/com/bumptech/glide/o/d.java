package com.bumptech.glide.o;

import com.bumptech.glide.r.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ModelToResourceClassCache.java */
/* loaded from: classes.dex */
public class d {
    private final AtomicReference<i> a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final c.e.a<i, List<Class<?>>> f8886b = new c.e.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        i andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f8886b) {
            list = this.f8886b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f8886b) {
            this.f8886b.put(new i(cls, cls2, cls3), list);
        }
    }
}
