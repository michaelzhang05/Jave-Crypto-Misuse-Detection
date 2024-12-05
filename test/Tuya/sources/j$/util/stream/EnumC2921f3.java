package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2921f3 {
    public static final EnumC2921f3 DOUBLE_VALUE;
    public static final EnumC2921f3 INT_VALUE;
    public static final EnumC2921f3 LONG_VALUE;
    public static final EnumC2921f3 REFERENCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC2921f3[] f32541a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.util.stream.f3] */
    static {
        ?? r42 = new Enum("REFERENCE", 0);
        REFERENCE = r42;
        ?? r52 = new Enum("INT_VALUE", 1);
        INT_VALUE = r52;
        ?? r62 = new Enum("LONG_VALUE", 2);
        LONG_VALUE = r62;
        ?? r72 = new Enum("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = r72;
        f32541a = new EnumC2921f3[]{r42, r52, r62, r72};
    }

    public static EnumC2921f3 valueOf(String str) {
        return (EnumC2921f3) Enum.valueOf(EnumC2921f3.class, str);
    }

    public static EnumC2921f3[] values() {
        return (EnumC2921f3[]) f32541a.clone();
    }
}
