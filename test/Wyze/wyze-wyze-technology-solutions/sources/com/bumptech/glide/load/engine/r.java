package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* loaded from: classes.dex */
final class r {
    private final Map<com.bumptech.glide.load.f, l<?>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.f, l<?>> f8596b = new HashMap();

    private Map<com.bumptech.glide.load.f, l<?>> b(boolean z) {
        return z ? this.f8596b : this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<?> a(com.bumptech.glide.load.f fVar, boolean z) {
        return b(z).get(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(com.bumptech.glide.load.f fVar, l<?> lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(com.bumptech.glide.load.f fVar, l<?> lVar) {
        Map<com.bumptech.glide.load.f, l<?>> b2 = b(lVar.p());
        if (lVar.equals(b2.get(fVar))) {
            b2.remove(fVar);
        }
    }
}
