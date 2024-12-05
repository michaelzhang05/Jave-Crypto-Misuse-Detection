package kotlin.reflect.x.internal.l0.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: UnsignedType.kt */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final n f19726f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f19727g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f19728h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f19729i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ n[] f19730j;

    /* renamed from: k, reason: collision with root package name */
    private final b f19731k;
    private final f l;
    private final b m;

    static {
        b e2 = b.e("kotlin/UByte");
        l.e(e2, "fromString(\"kotlin/UByte\")");
        f19726f = new n("UBYTE", 0, e2);
        b e3 = b.e("kotlin/UShort");
        l.e(e3, "fromString(\"kotlin/UShort\")");
        f19727g = new n("USHORT", 1, e3);
        b e4 = b.e("kotlin/UInt");
        l.e(e4, "fromString(\"kotlin/UInt\")");
        f19728h = new n("UINT", 2, e4);
        b e5 = b.e("kotlin/ULong");
        l.e(e5, "fromString(\"kotlin/ULong\")");
        f19729i = new n("ULONG", 3, e5);
        f19730j = d();
    }

    private n(String str, int i2, b bVar) {
        this.f19731k = bVar;
        f j2 = bVar.j();
        l.e(j2, "classId.shortClassName");
        this.l = j2;
        this.m = new b(bVar.h(), f.r(j2.f() + "Array"));
    }

    private static final /* synthetic */ n[] d() {
        return new n[]{f19726f, f19727g, f19728h, f19729i};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f19730j.clone();
    }

    public final b f() {
        return this.m;
    }

    public final b i() {
        return this.f19731k;
    }

    public final f n() {
        return this.l;
    }
}
