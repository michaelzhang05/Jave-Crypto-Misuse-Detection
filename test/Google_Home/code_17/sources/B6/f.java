package B6;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1031a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1032b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1033c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1034d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1035e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1036f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1037g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1038h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1039i;

    /* renamed from: j, reason: collision with root package name */
    private final String f1040j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f1041k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f1042l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1043m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f1044n;

    public f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String prettyPrintIndent, boolean z14, boolean z15, String classDiscriminator, boolean z16, boolean z17, s sVar, boolean z18, boolean z19) {
        AbstractC3255y.i(prettyPrintIndent, "prettyPrintIndent");
        AbstractC3255y.i(classDiscriminator, "classDiscriminator");
        this.f1031a = z8;
        this.f1032b = z9;
        this.f1033c = z10;
        this.f1034d = z11;
        this.f1035e = z12;
        this.f1036f = z13;
        this.f1037g = prettyPrintIndent;
        this.f1038h = z14;
        this.f1039i = z15;
        this.f1040j = classDiscriminator;
        this.f1041k = z16;
        this.f1042l = z17;
        this.f1043m = z18;
        this.f1044n = z19;
    }

    public final boolean a() {
        return this.f1041k;
    }

    public final boolean b() {
        return this.f1034d;
    }

    public final boolean c() {
        return this.f1044n;
    }

    public final String d() {
        return this.f1040j;
    }

    public final boolean e() {
        return this.f1038h;
    }

    public final boolean f() {
        return this.f1043m;
    }

    public final boolean g() {
        return this.f1031a;
    }

    public final boolean h() {
        return this.f1036f;
    }

    public final boolean i() {
        return this.f1032b;
    }

    public final s j() {
        return null;
    }

    public final boolean k() {
        return this.f1035e;
    }

    public final String l() {
        return this.f1037g;
    }

    public final boolean m() {
        return this.f1042l;
    }

    public final boolean n() {
        return this.f1039i;
    }

    public final boolean o() {
        return this.f1033c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f1031a + ", ignoreUnknownKeys=" + this.f1032b + ", isLenient=" + this.f1033c + ", allowStructuredMapKeys=" + this.f1034d + ", prettyPrint=" + this.f1035e + ", explicitNulls=" + this.f1036f + ", prettyPrintIndent='" + this.f1037g + "', coerceInputValues=" + this.f1038h + ", useArrayPolymorphism=" + this.f1039i + ", classDiscriminator='" + this.f1040j + "', allowSpecialFloatingPointValues=" + this.f1041k + ", useAlternativeNames=" + this.f1042l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f1043m + ", allowTrailingComma=" + this.f1044n + ')';
    }

    public /* synthetic */ f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String str2, boolean z16, boolean z17, s sVar, boolean z18, boolean z19, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, (i8 & 4) != 0 ? false : z10, (i8 & 8) != 0 ? false : z11, (i8 & 16) != 0 ? false : z12, (i8 & 32) != 0 ? true : z13, (i8 & 64) != 0 ? "    " : str, (i8 & 128) != 0 ? false : z14, (i8 & 256) != 0 ? false : z15, (i8 & 512) != 0 ? "type" : str2, (i8 & 1024) != 0 ? false : z16, (i8 & 2048) == 0 ? z17 : true, (i8 & 4096) != 0 ? null : sVar, (i8 & 8192) != 0 ? false : z18, (i8 & 16384) == 0 ? z19 : false);
    }
}
