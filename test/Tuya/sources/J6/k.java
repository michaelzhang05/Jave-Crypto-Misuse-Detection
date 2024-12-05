package J6;

import F6.v;
import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final v f5532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5533b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5534c;

    public k(v vVar, int i8, String str) {
        this.f5532a = vVar;
        this.f5533b = i8;
        this.f5534c = str;
    }

    public static k a(String str) {
        v vVar;
        int i8;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i8 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    vVar = v.HTTP_1_0;
                } else if (charAt == 1) {
                    vVar = v.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            vVar = v.HTTP_1_0;
            i8 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i9 = i8 + 3;
        if (str.length() >= i9) {
            try {
                int parseInt = Integer.parseInt(str.substring(i8, i9));
                if (str.length() > i9) {
                    if (str.charAt(i9) == ' ') {
                        str2 = str.substring(i8 + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                } else {
                    str2 = "";
                }
                return new k(vVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f5532a == v.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f5533b);
        if (this.f5534c != null) {
            sb.append(' ');
            sb.append(this.f5534c);
        }
        return sb.toString();
    }
}
