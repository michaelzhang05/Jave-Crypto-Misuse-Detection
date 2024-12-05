package com.bumptech.glide.m;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: f, reason: collision with root package name */
    private final Set<com.bumptech.glide.p.l.i<?>> f8882f = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f8882f.clear();
    }

    public List<com.bumptech.glide.p.l.i<?>> b() {
        return com.bumptech.glide.r.k.j(this.f8882f);
    }

    public void c(com.bumptech.glide.p.l.i<?> iVar) {
        this.f8882f.add(iVar);
    }

    public void d(com.bumptech.glide.p.l.i<?> iVar) {
        this.f8882f.remove(iVar);
    }

    @Override // com.bumptech.glide.m.i
    public void onDestroy() {
        Iterator it = com.bumptech.glide.r.k.j(this.f8882f).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.p.l.i) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.m.i
    public void onStart() {
        Iterator it = com.bumptech.glide.r.k.j(this.f8882f).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.p.l.i) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.m.i
    public void onStop() {
        Iterator it = com.bumptech.glide.r.k.j(this.f8882f).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.p.l.i) it.next()).onStop();
        }
    }
}
