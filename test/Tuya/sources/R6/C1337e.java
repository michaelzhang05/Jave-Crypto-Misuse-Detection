package R6;

/* renamed from: R6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1337e {

    /* renamed from: d, reason: collision with root package name */
    static final InterfaceC1335d[] f8810d = new InterfaceC1335d[0];

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1335d[] f8811a;

    /* renamed from: b, reason: collision with root package name */
    private int f8812b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8813c;

    public C1337e() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC1335d[] b(InterfaceC1335d[] interfaceC1335dArr) {
        if (interfaceC1335dArr.length < 1) {
            return f8810d;
        }
        return (InterfaceC1335d[]) interfaceC1335dArr.clone();
    }

    private void e(int i8) {
        InterfaceC1335d[] interfaceC1335dArr = new InterfaceC1335d[Math.max(this.f8811a.length, i8 + (i8 >> 1))];
        System.arraycopy(this.f8811a, 0, interfaceC1335dArr, 0, this.f8812b);
        this.f8811a = interfaceC1335dArr;
        this.f8813c = false;
    }

    public void a(InterfaceC1335d interfaceC1335d) {
        if (interfaceC1335d != null) {
            int length = this.f8811a.length;
            boolean z8 = true;
            int i8 = this.f8812b + 1;
            if (i8 <= length) {
                z8 = false;
            }
            if (this.f8813c | z8) {
                e(i8);
            }
            this.f8811a[this.f8812b] = interfaceC1335d;
            this.f8812b = i8;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1335d[] c() {
        int i8 = this.f8812b;
        if (i8 == 0) {
            return f8810d;
        }
        InterfaceC1335d[] interfaceC1335dArr = new InterfaceC1335d[i8];
        System.arraycopy(this.f8811a, 0, interfaceC1335dArr, 0, i8);
        return interfaceC1335dArr;
    }

    public InterfaceC1335d d(int i8) {
        if (i8 < this.f8812b) {
            return this.f8811a[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8 + " >= " + this.f8812b);
    }

    public int f() {
        return this.f8812b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1335d[] g() {
        int i8 = this.f8812b;
        if (i8 == 0) {
            return f8810d;
        }
        InterfaceC1335d[] interfaceC1335dArr = this.f8811a;
        if (interfaceC1335dArr.length == i8) {
            this.f8813c = true;
            return interfaceC1335dArr;
        }
        InterfaceC1335d[] interfaceC1335dArr2 = new InterfaceC1335d[i8];
        System.arraycopy(interfaceC1335dArr, 0, interfaceC1335dArr2, 0, i8);
        return interfaceC1335dArr2;
    }

    public C1337e(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f8811a = i8 == 0 ? f8810d : new InterfaceC1335d[i8];
        this.f8812b = 0;
        this.f8813c = false;
    }
}
