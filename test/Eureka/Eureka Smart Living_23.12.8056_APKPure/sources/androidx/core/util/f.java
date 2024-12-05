package androidx.core.util;

/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f2265a;

    /* renamed from: b, reason: collision with root package name */
    private int f2266b;

    public f(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2265a = new Object[i6];
    }

    private boolean c(Object obj) {
        for (int i6 = 0; i6 < this.f2266b; i6++) {
            if (this.f2265a[i6] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.e
    public boolean a(Object obj) {
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i6 = this.f2266b;
        Object[] objArr = this.f2265a;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f2266b = i6 + 1;
        return true;
    }

    @Override // androidx.core.util.e
    public Object b() {
        int i6 = this.f2266b;
        if (i6 <= 0) {
            return null;
        }
        int i7 = i6 - 1;
        Object[] objArr = this.f2265a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f2266b = i6 - 1;
        return obj;
    }
}
