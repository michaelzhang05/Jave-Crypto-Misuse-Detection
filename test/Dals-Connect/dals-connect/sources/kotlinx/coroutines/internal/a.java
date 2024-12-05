package kotlinx.coroutines.internal;

/* compiled from: ArrayQueue.kt */
/* loaded from: classes2.dex */
public class a<T> {
    private Object[] a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private int f22204b;

    /* renamed from: c, reason: collision with root package name */
    private int f22205c;

    private final void b() {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        kotlin.collections.j.g(objArr, objArr2, 0, this.f22204b, 0, 10, null);
        Object[] objArr3 = this.a;
        int length2 = objArr3.length;
        int i2 = this.f22204b;
        kotlin.collections.j.g(objArr3, objArr2, length2 - i2, 0, i2, 4, null);
        this.a = objArr2;
        this.f22204b = 0;
        this.f22205c = length;
    }

    public final void a(T t) {
        Object[] objArr = this.a;
        int i2 = this.f22205c;
        objArr[i2] = t;
        int length = (objArr.length - 1) & (i2 + 1);
        this.f22205c = length;
        if (length == this.f22204b) {
            b();
        }
    }

    public final boolean c() {
        return this.f22204b == this.f22205c;
    }

    public final T d() {
        int i2 = this.f22204b;
        if (i2 == this.f22205c) {
            return null;
        }
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f22204b = (i2 + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
