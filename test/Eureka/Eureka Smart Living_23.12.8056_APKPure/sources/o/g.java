package o;

/* loaded from: classes.dex */
class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f8154a;

    /* renamed from: b, reason: collision with root package name */
    private int f8155b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f8154a = new Object[i6];
    }

    @Override // o.f
    public boolean a(Object obj) {
        int i6 = this.f8155b;
        Object[] objArr = this.f8154a;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f8155b = i6 + 1;
        return true;
    }

    @Override // o.f
    public Object b() {
        int i6 = this.f8155b;
        if (i6 <= 0) {
            return null;
        }
        int i7 = i6 - 1;
        Object[] objArr = this.f8154a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f8155b = i6 - 1;
        return obj;
    }

    @Override // o.f
    public void c(Object[] objArr, int i6) {
        if (i6 > objArr.length) {
            i6 = objArr.length;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            Object obj = objArr[i7];
            int i8 = this.f8155b;
            Object[] objArr2 = this.f8154a;
            if (i8 < objArr2.length) {
                objArr2[i8] = obj;
                this.f8155b = i8 + 1;
            }
        }
    }
}
