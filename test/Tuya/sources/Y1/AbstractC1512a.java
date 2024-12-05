package Y1;

/* renamed from: Y1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1512a {

    /* renamed from: a, reason: collision with root package name */
    protected final int f12802a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC1512a f12803b;

    public AbstractC1512a(int i8) {
        this(i8, null);
    }

    public abstract void a(String str, Object obj);

    public abstract AbstractC1512a b(String str, String str2);

    public abstract AbstractC1512a c(String str);

    public abstract void d();

    public abstract void e(String str, String str2, String str3);

    public AbstractC1512a(int i8, AbstractC1512a abstractC1512a) {
        if (i8 != 589824 && i8 != 524288 && i8 != 458752 && i8 != 393216 && i8 != 327680 && i8 != 262144 && i8 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i8);
        }
        if (i8 == 17432576) {
            j.a(this);
        }
        this.f12802a = i8;
        this.f12803b = abstractC1512a;
    }
}
