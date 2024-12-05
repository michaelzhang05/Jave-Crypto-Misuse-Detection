package com.facebook.t;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PersistedEvents.java */
/* loaded from: classes.dex */
class n implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private HashMap<com.facebook.t.a, List<c>> f9485f;

    /* compiled from: PersistedEvents.java */
    /* loaded from: classes.dex */
    static class b implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<com.facebook.t.a, List<c>> f9486f;

        private Object readResolve() {
            return new n(this.f9486f);
        }

        private b(HashMap<com.facebook.t.a, List<c>> hashMap) {
            this.f9486f = hashMap;
        }
    }

    public n() {
        this.f9485f = new HashMap<>();
    }

    private Object writeReplace() {
        return new b(this.f9485f);
    }

    public void a(com.facebook.t.a aVar, List<c> list) {
        if (!this.f9485f.containsKey(aVar)) {
            this.f9485f.put(aVar, list);
        } else {
            this.f9485f.get(aVar).addAll(list);
        }
    }

    public boolean b(com.facebook.t.a aVar) {
        return this.f9485f.containsKey(aVar);
    }

    public List<c> c(com.facebook.t.a aVar) {
        return this.f9485f.get(aVar);
    }

    public Set<com.facebook.t.a> d() {
        return this.f9485f.keySet();
    }

    public n(HashMap<com.facebook.t.a, List<c>> hashMap) {
        HashMap<com.facebook.t.a, List<c>> hashMap2 = new HashMap<>();
        this.f9485f = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
