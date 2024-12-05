package b3;

import androidx.core.os.EnvironmentCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final z f14601b = new z("AMOUNTS", 0, "amounts");

    /* renamed from: c, reason: collision with root package name */
    public static final z f14602c = new z("DESCRIPTOR_CODE", 1, "descriptor_code");

    /* renamed from: d, reason: collision with root package name */
    public static final z f14603d = new z("UNKNOWN", 2, EnvironmentCompat.MEDIA_UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ z[] f14604e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14605f;

    /* renamed from: a, reason: collision with root package name */
    private final String f14606a;

    static {
        z[] a8 = a();
        f14604e = a8;
        f14605f = R5.b.a(a8);
    }

    private z(String str, int i8, String str2) {
        this.f14606a = str2;
    }

    private static final /* synthetic */ z[] a() {
        return new z[]{f14601b, f14602c, f14603d};
    }

    public static R5.a b() {
        return f14605f;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f14604e.clone();
    }

    public final String c() {
        return this.f14606a;
    }
}
