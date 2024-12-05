package L7;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import com.mbridge.msdk.foundation.tools.SameMD5;
import j6.AbstractC3202a;
import j6.C3205d;
import j6.n;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public abstract class b {

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6326a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            String valueOf;
            String s8 = (String) obj;
            AbstractC3255y.i(s8, "s");
            String lowerCase = s8.toLowerCase(Locale.ROOT);
            AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char charAt = lowerCase.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    Locale locale = Locale.getDefault();
                    AbstractC3255y.h(locale, "getDefault()");
                    valueOf = AbstractC3202a.e(charAt, locale);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb.append((Object) valueOf);
                String substring = lowerCase.substring(1);
                AbstractC3255y.h(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                return sb.toString();
            }
            return lowerCase;
        }
    }

    /* renamed from: L7.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0114b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0114b f6327a = new C0114b();

        public C0114b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            AbstractC3255y.h(format, "format(this, *args)");
            return format;
        }
    }

    public static final String a(String str) {
        AbstractC3255y.i(str, "<this>");
        return AbstractC1378t.w0(n.s0(str, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, a.f6326a, 30, null);
    }

    public static final String b(String str) {
        AbstractC3255y.i(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        byte[] bytes = str.getBytes(C3205d.f34020b);
        AbstractC3255y.h(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = messageDigest.digest(bytes);
        AbstractC3255y.h(bytes2, "bytes");
        return AbstractC1371l.x0(bytes2, "", null, null, 0, null, C0114b.f6327a, 30, null);
    }
}
