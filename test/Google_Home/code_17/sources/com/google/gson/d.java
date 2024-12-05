package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d extends f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f18614a = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof d) || !((d) obj).f18614a.equals(this.f18614a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f18614a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f18614a.iterator();
    }

    public void m(f fVar) {
        if (fVar == null) {
            fVar = h.f18615a;
        }
        this.f18614a.add(fVar);
    }
}
