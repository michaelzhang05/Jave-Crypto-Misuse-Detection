package c.f.b;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
class g<T> implements f<T> {
    private final Object[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f2470b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i2) {
        if (i2 > 0) {
            this.a = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // c.f.b.f
    public boolean a(T t) {
        int i2 = this.f2470b;
        Object[] objArr = this.a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t;
        this.f2470b = i2 + 1;
        return true;
    }

    @Override // c.f.b.f
    public T b() {
        int i2 = this.f2470b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.f2470b = i2 - 1;
        return t;
    }

    @Override // c.f.b.f
    public void c(T[] tArr, int i2) {
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            T t = tArr[i3];
            int i4 = this.f2470b;
            Object[] objArr = this.a;
            if (i4 < objArr.length) {
                objArr[i4] = t;
                this.f2470b = i4 + 1;
            }
        }
    }
}
