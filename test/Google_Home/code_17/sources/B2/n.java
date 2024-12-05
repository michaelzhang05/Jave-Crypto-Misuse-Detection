package b2;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15173a;

    /* renamed from: b, reason: collision with root package name */
    protected n f15174b;

    public n(int i8) {
        this(i8, null);
    }

    public abstract AbstractC1961a a(String str, boolean z8);

    public abstract void b(C1963c c1963c);

    public abstract void c();

    public abstract AbstractC1961a d(int i8, E e8, String str, boolean z8);

    public n(int i8, n nVar) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15173a = i8;
        this.f15174b = nVar;
    }
}
