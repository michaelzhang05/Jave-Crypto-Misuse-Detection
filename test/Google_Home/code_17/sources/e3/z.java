package e3;

import androidx.core.os.EnvironmentCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final z f31607b = new z("AMOUNTS", 0, "amounts");

    /* renamed from: c, reason: collision with root package name */
    public static final z f31608c = new z("DESCRIPTOR_CODE", 1, "descriptor_code");

    /* renamed from: d, reason: collision with root package name */
    public static final z f31609d = new z("UNKNOWN", 2, EnvironmentCompat.MEDIA_UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ z[] f31610e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ U5.a f31611f;

    /* renamed from: a, reason: collision with root package name */
    private final String f31612a;

    static {
        z[] a8 = a();
        f31610e = a8;
        f31611f = U5.b.a(a8);
    }

    private z(String str, int i8, String str2) {
        this.f31612a = str2;
    }

    private static final /* synthetic */ z[] a() {
        return new z[]{f31607b, f31608c, f31609d};
    }

    public static U5.a b() {
        return f31611f;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f31610e.clone();
    }

    public final String c() {
        return this.f31612a;
    }
}
