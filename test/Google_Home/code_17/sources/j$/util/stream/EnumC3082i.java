package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3082i {
    public static final EnumC3082i CONCURRENT;
    public static final EnumC3082i IDENTITY_FINISH;
    public static final EnumC3082i UNORDERED;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC3082i[] f33752a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j$.util.stream.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j$.util.stream.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.util.stream.i, java.lang.Enum] */
    static {
        ?? r32 = new Enum("CONCURRENT", 0);
        CONCURRENT = r32;
        ?? r42 = new Enum("UNORDERED", 1);
        UNORDERED = r42;
        ?? r52 = new Enum("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = r52;
        f33752a = new EnumC3082i[]{r32, r42, r52};
    }

    public static EnumC3082i valueOf(String str) {
        return (EnumC3082i) Enum.valueOf(EnumC3082i.class, str);
    }

    public static EnumC3082i[] values() {
        return (EnumC3082i[]) f33752a.clone();
    }
}
