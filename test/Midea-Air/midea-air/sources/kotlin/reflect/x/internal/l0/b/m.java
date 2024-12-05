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
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f19720f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f19721g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f19722h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f19723i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ m[] f19724j;

    /* renamed from: k, reason: collision with root package name */
    private final b f19725k;
    private final f l;

    static {
        b e2 = b.e("kotlin/UByteArray");
        l.e(e2, "fromString(\"kotlin/UByteArray\")");
        f19720f = new m("UBYTEARRAY", 0, e2);
        b e3 = b.e("kotlin/UShortArray");
        l.e(e3, "fromString(\"kotlin/UShortArray\")");
        f19721g = new m("USHORTARRAY", 1, e3);
        b e4 = b.e("kotlin/UIntArray");
        l.e(e4, "fromString(\"kotlin/UIntArray\")");
        f19722h = new m("UINTARRAY", 2, e4);
        b e5 = b.e("kotlin/ULongArray");
        l.e(e5, "fromString(\"kotlin/ULongArray\")");
        f19723i = new m("ULONGARRAY", 3, e5);
        f19724j = d();
    }

    private m(String str, int i2, b bVar) {
        this.f19725k = bVar;
        f j2 = bVar.j();
        l.e(j2, "classId.shortClassName");
        this.l = j2;
    }

    private static final /* synthetic */ m[] d() {
        return new m[]{f19720f, f19721g, f19722h, f19723i};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f19724j.clone();
    }

    public final f f() {
        return this.l;
    }
}
