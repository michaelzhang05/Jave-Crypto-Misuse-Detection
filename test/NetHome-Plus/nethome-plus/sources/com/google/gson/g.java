package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes2.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: f, reason: collision with root package name */
    private final List<j> f16844f = new ArrayList();

    public void D(j jVar) {
        if (jVar == null) {
            jVar = k.a;
        }
        this.f16844f.add(jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f16844f.equals(this.f16844f));
    }

    public int hashCode() {
        return this.f16844f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f16844f.iterator();
    }
}
