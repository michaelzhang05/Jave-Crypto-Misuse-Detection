package U6;

/* renamed from: U6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1446e {

    /* renamed from: d, reason: collision with root package name */
    static final InterfaceC1444d[] f10436d = new InterfaceC1444d[0];

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1444d[] f10437a;

    /* renamed from: b, reason: collision with root package name */
    private int f10438b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10439c;

    public C1446e() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC1444d[] b(InterfaceC1444d[] interfaceC1444dArr) {
        if (interfaceC1444dArr.length < 1) {
            return f10436d;
        }
        return (InterfaceC1444d[]) interfaceC1444dArr.clone();
    }

    private void e(int i8) {
        InterfaceC1444d[] interfaceC1444dArr = new InterfaceC1444d[Math.max(this.f10437a.length, i8 + (i8 >> 1))];
        System.arraycopy(this.f10437a, 0, interfaceC1444dArr, 0, this.f10438b);
        this.f10437a = interfaceC1444dArr;
        this.f10439c = false;
    }

    public void a(InterfaceC1444d interfaceC1444d) {
        if (interfaceC1444d != null) {
            int length = this.f10437a.length;
            boolean z8 = true;
            int i8 = this.f10438b + 1;
            if (i8 <= length) {
                z8 = false;
            }
            if (this.f10439c | z8) {
                e(i8);
            }
            this.f10437a[this.f10438b] = interfaceC1444d;
            this.f10438b = i8;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1444d[] c() {
        int i8 = this.f10438b;
        if (i8 == 0) {
            return f10436d;
        }
        InterfaceC1444d[] interfaceC1444dArr = new InterfaceC1444d[i8];
        System.arraycopy(this.f10437a, 0, interfaceC1444dArr, 0, i8);
        return interfaceC1444dArr;
    }

    public InterfaceC1444d d(int i8) {
        if (i8 < this.f10438b) {
            return this.f10437a[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8 + " >= " + this.f10438b);
    }

    public int f() {
        return this.f10438b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1444d[] g() {
        int i8 = this.f10438b;
        if (i8 == 0) {
            return f10436d;
        }
        InterfaceC1444d[] interfaceC1444dArr = this.f10437a;
        if (interfaceC1444dArr.length == i8) {
            this.f10439c = true;
            return interfaceC1444dArr;
        }
        InterfaceC1444d[] interfaceC1444dArr2 = new InterfaceC1444d[i8];
        System.arraycopy(interfaceC1444dArr, 0, interfaceC1444dArr2, 0, i8);
        return interfaceC1444dArr2;
    }

    public C1446e(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f10437a = i8 == 0 ? f10436d : new InterfaceC1444d[i8];
        this.f10438b = 0;
        this.f10439c = false;
    }
}
