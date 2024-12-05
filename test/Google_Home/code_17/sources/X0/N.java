package x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N extends r {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f40597c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(Object obj) {
        this.f40597c = w0.h.i(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return w.c(this.f40597c);
    }

    @Override // x0.AbstractC4179n
    int c(Object[] objArr, int i8) {
        objArr[i8] = this.f40597c;
        return i8 + 1;
    }

    @Override // x0.AbstractC4179n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f40597c.equals(obj);
    }

    @Override // x0.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f40597c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f40597c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
