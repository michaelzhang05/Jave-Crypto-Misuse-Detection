package N4;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g6.AbstractC2725a;
import g6.C2728d;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7201a = new d();

    private d() {
    }

    private final String a(String str, String str2) {
        Charset forName = Charset.forName(C.UTF8_NAME);
        AbstractC3159y.h(forName, "forName(charsetName)");
        byte[] bytes = str.getBytes(forName);
        AbstractC3159y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return b(bytes, str2);
    }

    private final String b(byte[] bArr, String str) {
        try {
            byte[] bytes = MessageDigest.getInstance(str).digest(bArr);
            StringBuilder sb = new StringBuilder();
            AbstractC3159y.h(bytes, "bytes");
            for (byte b8 : bytes) {
                String num = Integer.toString((b8 & 255) + 256, AbstractC2725a.a(16));
                AbstractC3159y.h(num, "toString(this, checkRadix(radix))");
                String substring = num.substring(1);
                AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
            }
            return sb.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final String c(String text) {
        AbstractC3159y.i(text, "text");
        return a(text, "SHA-256");
    }

    public final String d(byte[] byteArray) {
        AbstractC3159y.i(byteArray, "byteArray");
        return b(byteArray, "SHA-256");
    }

    public final String e(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
            messageDigest = null;
        }
        if (messageDigest != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                while (bigInteger.length() < 64) {
                    bigInteger = '0' + bigInteger;
                }
                return bigInteger;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return null;
    }

    public final String f(String s8) {
        AbstractC3159y.i(s8, "s");
        byte[] bytes = s8.getBytes(C2728d.f31293b);
        AbstractC3159y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return g(bytes);
    }

    public final String g(byte[] s8) {
        AbstractC3159y.i(s8, "s");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(s8);
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                Y y8 = Y.f33766a;
                bigInteger = String.format("0%s", Arrays.copyOf(new Object[]{bigInteger}, 1));
                AbstractC3159y.h(bigInteger, "format(format, *args)");
            }
            return bigInteger;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final String h(String path) {
        AbstractC3159y.i(path, "path");
        String str = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[8192];
            FileInputStream fileInputStream = new FileInputStream(path);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (true) {
                str = bigInteger;
                AbstractC3159y.f(str);
                if (str.length() >= 32) {
                    break;
                }
                Y y8 = Y.f33766a;
                bigInteger = String.format("0%s", Arrays.copyOf(new Object[]{str}, 1));
                AbstractC3159y.h(bigInteger, "format(format, *args)");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return str;
    }
}
