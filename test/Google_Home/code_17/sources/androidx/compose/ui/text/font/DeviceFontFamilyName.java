package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class DeviceFontFamilyName {
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m4773boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m4774constructorimpl(String str) {
        if (str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4775equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && AbstractC3255y.d(str, ((DeviceFontFamilyName) obj).m4779unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4776equalsimpl0(String str, String str2) {
        return AbstractC3255y.d(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4777hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4778toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m4775equalsimpl(this.name, obj);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m4777hashCodeimpl(this.name);
    }

    public String toString() {
        return m4778toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m4779unboximpl() {
        return this.name;
    }
}
