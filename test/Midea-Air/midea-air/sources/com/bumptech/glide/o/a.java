package com.bumptech.glide.o;

import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry.java */
/* loaded from: classes.dex */
public class a {
    private final List<C0122a<?>> a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: com.bumptech.glide.o.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0122a<T> {
        private final Class<T> a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.d<T> f8883b;

        C0122a(Class<T> cls, com.bumptech.glide.load.d<T> dVar) {
            this.a = cls;
            this.f8883b = dVar;
        }

        boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, com.bumptech.glide.load.d<T> dVar) {
        this.a.add(new C0122a<>(cls, dVar));
    }

    public synchronized <T> com.bumptech.glide.load.d<T> b(Class<T> cls) {
        for (C0122a<?> c0122a : this.a) {
            if (c0122a.a(cls)) {
                return (com.bumptech.glide.load.d<T>) c0122a.f8883b;
            }
        }
        return null;
    }
}
