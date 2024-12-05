package b2;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1961a {

    /* renamed from: a, reason: collision with root package name */
    protected final int f15087a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC1961a f15088b;

    public AbstractC1961a(int i8) {
        this(i8, null);
    }

    public abstract void a(String str, Object obj);

    public abstract AbstractC1961a b(String str, String str2);

    public abstract AbstractC1961a c(String str);

    public abstract void d();

    public abstract void e(String str, String str2, String str3);

    public AbstractC1961a(int i8, AbstractC1961a abstractC1961a) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f15087a = i8;
        this.f15088b = abstractC1961a;
    }
}
