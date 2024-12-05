package I7;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import com.mbridge.msdk.foundation.tools.SameMD5;
import g6.AbstractC2725a;
import g6.C2728d;
import g6.n;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public abstract class b {

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4331a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            String valueOf;
            String s8 = (String) obj;
            AbstractC3159y.i(s8, "s");
            String lowerCase = s8.toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char charAt = lowerCase.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    Locale locale = Locale.getDefault();
                    AbstractC3159y.h(locale, "getDefault()");
                    valueOf = AbstractC2725a.e(charAt, locale);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb.append((Object) valueOf);
                String substring = lowerCase.substring(1);
                AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                return sb.toString();
            }
            return lowerCase;
        }
    }

    /* renamed from: I7.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0071b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0071b f4332a = new C0071b();

        public C0071b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            AbstractC3159y.h(format, "format(this, *args)");
            return format;
        }
    }

    public static final String a(String str) {
        AbstractC3159y.i(str, "<this>");
        return AbstractC1246t.w0(n.s0(str, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, a.f4331a, 30, null);
    }

    public static final String b(String str) {
        AbstractC3159y.i(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        byte[] bytes = str.getBytes(C2728d.f31293b);
        AbstractC3159y.h(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = messageDigest.digest(bytes);
        AbstractC3159y.h(bytes2, "bytes");
        return AbstractC1239l.x0(bytes2, "", null, null, 0, null, C0071b.f4332a, 30, null);
    }
}
