package x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K extends r {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f40583h;

    /* renamed from: i, reason: collision with root package name */
    static final K f40584i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f40585c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f40586d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f40587e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f40588f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f40589g;

    static {
        Object[] objArr = new Object[0];
        f40583h = objArr;
        f40584i = new K(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f40585c = objArr;
        this.f40586d = i8;
        this.f40587e = objArr2;
        this.f40588f = i9;
        this.f40589g = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return k().iterator();
    }

    @Override // x0.AbstractC4179n
    int c(Object[] objArr, int i8) {
        System.arraycopy(this.f40585c, 0, objArr, i8, this.f40589g);
        return i8 + this.f40589g;
    }

    @Override // x0.AbstractC4179n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f40587e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c8 = AbstractC4178m.c(obj);
        while (true) {
            int i8 = c8 & this.f40588f;
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c8 = i8 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public Object[] d() {
        return this.f40585c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public int e() {
        return this.f40589g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public int f() {
        return 0;
    }

    @Override // x0.r, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f40586d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // x0.AbstractC4179n
    public boolean j() {
        return false;
    }

    @Override // x0.r
    AbstractC4180o q() {
        return AbstractC4180o.m(this.f40585c, this.f40589g);
    }

    @Override // x0.r
    boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f40589g;
    }
}
