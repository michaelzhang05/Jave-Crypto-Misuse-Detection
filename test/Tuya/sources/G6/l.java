package g6;

import kotlin.jvm.internal.AbstractC3151p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f31324c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f31325d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f31326e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f31327f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f31328g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f31329h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f31330i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ l[] f31331j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ R5.a f31332k;

    /* renamed from: a, reason: collision with root package name */
    private final int f31333a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31334b;

    static {
        int i8 = 2;
        f31324c = new l("IGNORE_CASE", 0, i8, 0, 2, null);
        int i9 = 2;
        AbstractC3151p abstractC3151p = null;
        int i10 = 0;
        f31325d = new l("MULTILINE", 1, 8, i10, i9, abstractC3151p);
        int i11 = 2;
        AbstractC3151p abstractC3151p2 = null;
        int i12 = 0;
        f31326e = new l("LITERAL", i8, 16, i12, i11, abstractC3151p2);
        f31327f = new l("UNIX_LINES", 3, 1, i10, i9, abstractC3151p);
        f31328g = new l("COMMENTS", 4, 4, i12, i11, abstractC3151p2);
        f31329h = new l("DOT_MATCHES_ALL", 5, 32, i10, i9, abstractC3151p);
        f31330i = new l("CANON_EQ", 6, 128, i12, i11, abstractC3151p2);
        l[] a8 = a();
        f31331j = a8;
        f31332k = R5.b.a(a8);
    }

    private l(String str, int i8, int i9, int i10) {
        this.f31333a = i9;
        this.f31334b = i10;
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f31324c, f31325d, f31326e, f31327f, f31328g, f31329h, f31330i};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f31331j.clone();
    }

    public int b() {
        return this.f31333a;
    }

    /* synthetic */ l(String str, int i8, int i9, int i10, int i11, AbstractC3151p abstractC3151p) {
        this(str, i8, i9, (i11 & 2) != 0 ? i9 : i10);
    }
}
