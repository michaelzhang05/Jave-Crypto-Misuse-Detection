package j;

import kotlin.text.Charsets;

/* compiled from: -Platform.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final byte[] a(String str) {
        kotlin.jvm.internal.l.f(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(Charsets.f21561b);
        kotlin.jvm.internal.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        kotlin.jvm.internal.l.f(bArr, "$this$toUtf8String");
        return new String(bArr, Charsets.f21561b);
    }
}
