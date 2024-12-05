package h6;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2761d {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2761d f31416b = new EnumC2761d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2761d f31417c = new EnumC2761d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2761d f31418d = new EnumC2761d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2761d f31419e = new EnumC2761d("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2761d f31420f = new EnumC2761d("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2761d f31421g = new EnumC2761d("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC2761d f31422h = new EnumC2761d("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC2761d[] f31423i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ R5.a f31424j;

    /* renamed from: a, reason: collision with root package name */
    private final TimeUnit f31425a;

    static {
        EnumC2761d[] a8 = a();
        f31423i = a8;
        f31424j = R5.b.a(a8);
    }

    private EnumC2761d(String str, int i8, TimeUnit timeUnit) {
        this.f31425a = timeUnit;
    }

    private static final /* synthetic */ EnumC2761d[] a() {
        return new EnumC2761d[]{f31416b, f31417c, f31418d, f31419e, f31420f, f31421g, f31422h};
    }

    public static EnumC2761d valueOf(String str) {
        return (EnumC2761d) Enum.valueOf(EnumC2761d.class, str);
    }

    public static EnumC2761d[] values() {
        return (EnumC2761d[]) f31423i.clone();
    }

    public final TimeUnit b() {
        return this.f31425a;
    }
}
