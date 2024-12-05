package x0;

import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x0.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4165I extends AbstractC4180o {

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC4180o f40566e = new C4165I(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f40567c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f40568d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4165I(Object[] objArr, int i8) {
        this.f40567c = objArr;
        this.f40568d = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4180o, x0.AbstractC4179n
    public int c(Object[] objArr, int i8) {
        System.arraycopy(this.f40567c, 0, objArr, i8, this.f40568d);
        return i8 + this.f40568d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public Object[] d() {
        return this.f40567c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public int e() {
        return this.f40568d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public int f() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i8) {
        w0.h.g(i8, this.f40568d);
        Object obj = this.f40567c[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f40568d;
    }
}
