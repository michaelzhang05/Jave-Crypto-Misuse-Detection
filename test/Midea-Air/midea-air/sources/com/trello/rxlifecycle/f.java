package com.trello.rxlifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UntilEventObservableTransformer.java */
/* loaded from: classes2.dex */
public final class f<T, R> implements b<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<R> f17349f;

    /* renamed from: g, reason: collision with root package name */
    final R f17350g;

    public f(rx.e<R> eVar, R r) {
        this.f17349f = eVar;
        this.f17350g = r;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.e<T> call(rx.e<T> eVar) {
        return eVar.P0(d.b(this.f17349f, this.f17350g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f17349f.equals(fVar.f17349f)) {
            return this.f17350g.equals(fVar.f17350g);
        }
        return false;
    }

    public int hashCode() {
        return (this.f17349f.hashCode() * 31) + this.f17350g.hashCode();
    }

    public String toString() {
        return "UntilEventObservableTransformer{lifecycle=" + this.f17349f + ", event=" + this.f17350g + '}';
    }
}
