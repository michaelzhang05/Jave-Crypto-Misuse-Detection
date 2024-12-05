package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d extends f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f17559a = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof d) || !((d) obj).f17559a.equals(this.f17559a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f17559a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f17559a.iterator();
    }

    public void p(f fVar) {
        if (fVar == null) {
            fVar = h.f17560a;
        }
        this.f17559a.add(fVar);
    }
}
