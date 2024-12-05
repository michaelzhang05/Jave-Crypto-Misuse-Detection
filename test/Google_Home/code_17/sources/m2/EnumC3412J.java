package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m2.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3412J {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3412J f34934b = new EnumC3412J("WeChatPayV1", 0, "wechat_pay_beta=v1");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC3412J[] f34935c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ U5.a f34936d;

    /* renamed from: a, reason: collision with root package name */
    private final String f34937a;

    static {
        EnumC3412J[] a8 = a();
        f34935c = a8;
        f34936d = U5.b.a(a8);
    }

    private EnumC3412J(String str, int i8, String str2) {
        this.f34937a = str2;
    }

    private static final /* synthetic */ EnumC3412J[] a() {
        return new EnumC3412J[]{f34934b};
    }

    public static EnumC3412J valueOf(String str) {
        return (EnumC3412J) Enum.valueOf(EnumC3412J.class, str);
    }

    public static EnumC3412J[] values() {
        return (EnumC3412J[]) f34935c.clone();
    }

    public final String b() {
        return this.f34937a;
    }
}
