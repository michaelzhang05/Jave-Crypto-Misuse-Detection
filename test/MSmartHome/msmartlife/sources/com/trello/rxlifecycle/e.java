package com.trello.rxlifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UntilCorrespondingEventObservableTransformer.java */
/* loaded from: classes2.dex */
public final class e<T, R> implements b<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<R> f17347f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<R, R> f17348g;

    public e(rx.e<R> eVar, rx.m.e<R, R> eVar2) {
        this.f17347f = eVar;
        this.f17348g = eVar2;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.e<T> call(rx.e<T> eVar) {
        return eVar.P0(d.a(this.f17347f, this.f17348g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f17347f.equals(eVar.f17347f)) {
            return this.f17348g.equals(eVar.f17348g);
        }
        return false;
    }

    public int hashCode() {
        return (this.f17347f.hashCode() * 31) + this.f17348g.hashCode();
    }

    public String toString() {
        return "UntilCorrespondingEventObservableTransformer{sharedLifecycle=" + this.f17347f + ", correspondingEvents=" + this.f17348g + '}';
    }
}
