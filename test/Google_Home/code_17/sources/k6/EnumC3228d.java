package k6;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3228d {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3228d f34138b = new EnumC3228d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3228d f34139c = new EnumC3228d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3228d f34140d = new EnumC3228d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3228d f34141e = new EnumC3228d("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3228d f34142f = new EnumC3228d("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3228d f34143g = new EnumC3228d("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3228d f34144h = new EnumC3228d("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC3228d[] f34145i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ U5.a f34146j;

    /* renamed from: a, reason: collision with root package name */
    private final TimeUnit f34147a;

    static {
        EnumC3228d[] a8 = a();
        f34145i = a8;
        f34146j = U5.b.a(a8);
    }

    private EnumC3228d(String str, int i8, TimeUnit timeUnit) {
        this.f34147a = timeUnit;
    }

    private static final /* synthetic */ EnumC3228d[] a() {
        return new EnumC3228d[]{f34138b, f34139c, f34140d, f34141e, f34142f, f34143g, f34144h};
    }

    public static EnumC3228d valueOf(String str) {
        return (EnumC3228d) Enum.valueOf(EnumC3228d.class, str);
    }

    public static EnumC3228d[] values() {
        return (EnumC3228d[]) f34145i.clone();
    }

    public final TimeUnit b() {
        return this.f34147a;
    }
}
