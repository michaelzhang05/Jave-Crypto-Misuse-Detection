package y6;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: y6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4004f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39987a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39988b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39989c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39990d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39991e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39992f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39993g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f39994h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f39995i;

    /* renamed from: j, reason: collision with root package name */
    private final String f39996j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f39997k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f39998l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f39999m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f40000n;

    public C4004f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String prettyPrintIndent, boolean z14, boolean z15, String classDiscriminator, boolean z16, boolean z17, s sVar, boolean z18, boolean z19) {
        AbstractC3159y.i(prettyPrintIndent, "prettyPrintIndent");
        AbstractC3159y.i(classDiscriminator, "classDiscriminator");
        this.f39987a = z8;
        this.f39988b = z9;
        this.f39989c = z10;
        this.f39990d = z11;
        this.f39991e = z12;
        this.f39992f = z13;
        this.f39993g = prettyPrintIndent;
        this.f39994h = z14;
        this.f39995i = z15;
        this.f39996j = classDiscriminator;
        this.f39997k = z16;
        this.f39998l = z17;
        this.f39999m = z18;
        this.f40000n = z19;
    }

    public final boolean a() {
        return this.f39997k;
    }

    public final boolean b() {
        return this.f39990d;
    }

    public final boolean c() {
        return this.f40000n;
    }

    public final String d() {
        return this.f39996j;
    }

    public final boolean e() {
        return this.f39994h;
    }

    public final boolean f() {
        return this.f39999m;
    }

    public final boolean g() {
        return this.f39987a;
    }

    public final boolean h() {
        return this.f39992f;
    }

    public final boolean i() {
        return this.f39988b;
    }

    public final s j() {
        return null;
    }

    public final boolean k() {
        return this.f39991e;
    }

    public final String l() {
        return this.f39993g;
    }

    public final boolean m() {
        return this.f39998l;
    }

    public final boolean n() {
        return this.f39995i;
    }

    public final boolean o() {
        return this.f39989c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f39987a + ", ignoreUnknownKeys=" + this.f39988b + ", isLenient=" + this.f39989c + ", allowStructuredMapKeys=" + this.f39990d + ", prettyPrint=" + this.f39991e + ", explicitNulls=" + this.f39992f + ", prettyPrintIndent='" + this.f39993g + "', coerceInputValues=" + this.f39994h + ", useArrayPolymorphism=" + this.f39995i + ", classDiscriminator='" + this.f39996j + "', allowSpecialFloatingPointValues=" + this.f39997k + ", useAlternativeNames=" + this.f39998l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f39999m + ", allowTrailingComma=" + this.f40000n + ')';
    }

    public /* synthetic */ C4004f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String str2, boolean z16, boolean z17, s sVar, boolean z18, boolean z19, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, (i8 & 4) != 0 ? false : z10, (i8 & 8) != 0 ? false : z11, (i8 & 16) != 0 ? false : z12, (i8 & 32) != 0 ? true : z13, (i8 & 64) != 0 ? "    " : str, (i8 & 128) != 0 ? false : z14, (i8 & 256) != 0 ? false : z15, (i8 & 512) != 0 ? "type" : str2, (i8 & 1024) != 0 ? false : z16, (i8 & 2048) == 0 ? z17 : true, (i8 & 4096) != 0 ? null : sVar, (i8 & 8192) != 0 ? false : z18, (i8 & 16384) == 0 ? z19 : false);
    }
}
