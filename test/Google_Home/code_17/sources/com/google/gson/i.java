package com.google.gson;

import java.util.Set;

/* loaded from: classes4.dex */
public final class i extends f {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.g f18616a = new com.google.gson.internal.g(false);

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof i) || !((i) obj).f18616a.equals(this.f18616a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f18616a.hashCode();
    }

    public void m(String str, f fVar) {
        com.google.gson.internal.g gVar = this.f18616a;
        if (fVar == null) {
            fVar = h.f18615a;
        }
        gVar.put(str, fVar);
    }

    public Set n() {
        return this.f18616a.entrySet();
    }
}
