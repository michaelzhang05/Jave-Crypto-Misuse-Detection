package V1;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static int f11852c;

    /* renamed from: a, reason: collision with root package name */
    private int f11853a;

    /* renamed from: b, reason: collision with root package name */
    private d f11854b;

    static {
        int i8;
        if (System.getProperty("JSON_SMART_SIMPLE") != null) {
            i8 = 4032;
        } else {
            i8 = -1;
        }
        f11852c = i8;
    }

    public a(int i8) {
        this.f11853a = i8;
    }

    private d a() {
        if (this.f11854b == null) {
            this.f11854b = new d(this.f11853a);
        }
        return this.f11854b;
    }

    public Object b(String str) {
        return a().x(str);
    }
}
