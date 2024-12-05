package com.bumptech.glide.m;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes.dex */
class a implements h {
    private final Set<i> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private boolean f8855b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8856c;

    @Override // com.bumptech.glide.m.h
    public void a(i iVar) {
        this.a.add(iVar);
        if (this.f8856c) {
            iVar.onDestroy();
        } else if (this.f8855b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    @Override // com.bumptech.glide.m.h
    public void b(i iVar) {
        this.a.remove(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f8856c = true;
        Iterator it = com.bumptech.glide.r.k.j(this.a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f8855b = true;
        Iterator it = com.bumptech.glide.r.k.j(this.a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f8855b = false;
        Iterator it = com.bumptech.glide.r.k.j(this.a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }
}
