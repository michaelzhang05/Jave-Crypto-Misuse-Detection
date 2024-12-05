package Y1;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static int f13490c;

    /* renamed from: a, reason: collision with root package name */
    private int f13491a;

    /* renamed from: b, reason: collision with root package name */
    private d f13492b;

    static {
        int i8;
        if (System.getProperty("JSON_SMART_SIMPLE") != null) {
            i8 = 4032;
        } else {
            i8 = -1;
        }
        f13490c = i8;
    }

    public a(int i8) {
        this.f13491a = i8;
    }

    private d a() {
        if (this.f13492b == null) {
            this.f13492b = new d(this.f13491a);
        }
        return this.f13492b;
    }

    public Object b(String str) {
        return a().x(str);
    }
}
