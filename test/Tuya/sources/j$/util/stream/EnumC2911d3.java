package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC2911d3 {
    public static final EnumC2911d3 OP;
    public static final EnumC2911d3 SPLITERATOR;
    public static final EnumC2911d3 STREAM;
    public static final EnumC2911d3 TERMINAL_OP;
    public static final EnumC2911d3 UPSTREAM_TERMINAL_OP;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC2911d3[] f32506a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.util.stream.d3] */
    static {
        ?? r52 = new Enum("SPLITERATOR", 0);
        SPLITERATOR = r52;
        ?? r62 = new Enum("STREAM", 1);
        STREAM = r62;
        ?? r72 = new Enum("OP", 2);
        OP = r72;
        ?? r8 = new Enum("TERMINAL_OP", 3);
        TERMINAL_OP = r8;
        ?? r9 = new Enum("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = r9;
        f32506a = new EnumC2911d3[]{r52, r62, r72, r8, r9};
    }

    public static EnumC2911d3 valueOf(String str) {
        return (EnumC2911d3) Enum.valueOf(EnumC2911d3.class, str);
    }

    public static EnumC2911d3[] values() {
        return (EnumC2911d3[]) f32506a.clone();
    }
}
