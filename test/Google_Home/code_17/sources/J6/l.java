package j6;

import kotlin.jvm.internal.AbstractC3247p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f34051c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f34052d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f34053e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f34054f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f34055g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f34056h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f34057i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ l[] f34058j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ U5.a f34059k;

    /* renamed from: a, reason: collision with root package name */
    private final int f34060a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34061b;

    static {
        int i8 = 2;
        f34051c = new l("IGNORE_CASE", 0, i8, 0, 2, null);
        int i9 = 2;
        AbstractC3247p abstractC3247p = null;
        int i10 = 0;
        f34052d = new l("MULTILINE", 1, 8, i10, i9, abstractC3247p);
        int i11 = 2;
        AbstractC3247p abstractC3247p2 = null;
        int i12 = 0;
        f34053e = new l("LITERAL", i8, 16, i12, i11, abstractC3247p2);
        f34054f = new l("UNIX_LINES", 3, 1, i10, i9, abstractC3247p);
        f34055g = new l("COMMENTS", 4, 4, i12, i11, abstractC3247p2);
        f34056h = new l("DOT_MATCHES_ALL", 5, 32, i10, i9, abstractC3247p);
        f34057i = new l("CANON_EQ", 6, 128, i12, i11, abstractC3247p2);
        l[] a8 = a();
        f34058j = a8;
        f34059k = U5.b.a(a8);
    }

    private l(String str, int i8, int i9, int i10) {
        this.f34060a = i9;
        this.f34061b = i10;
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f34051c, f34052d, f34053e, f34054f, f34055g, f34056h, f34057i};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f34058j.clone();
    }

    public int b() {
        return this.f34060a;
    }

    /* synthetic */ l(String str, int i8, int i9, int i10, int i11, AbstractC3247p abstractC3247p) {
        this(str, i8, i9, (i11 & 2) != 0 ? i9 : i10);
    }
}
