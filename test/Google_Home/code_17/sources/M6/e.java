package M6;

import I6.l;
import I6.q;
import I6.r;
import I6.x;
import I6.z;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f7217a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    public static long a(q qVar) {
        return j(qVar.a("Content-Length"));
    }

    public static long b(z zVar) {
        return a(zVar.o());
    }

    public static boolean c(z zVar) {
        if (zVar.E().g().equals("HEAD")) {
            return false;
        }
        int g8 = zVar.g();
        if (((g8 >= 100 && g8 < 200) || g8 == 204 || g8 == 304) && b(zVar) == -1 && !"chunked".equalsIgnoreCase(zVar.m("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static boolean d(q qVar) {
        return k(qVar).contains("*");
    }

    public static boolean e(z zVar) {
        return d(zVar.o());
    }

    public static int f(String str, int i8) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    public static void g(l lVar, r rVar, q qVar) {
        if (lVar == l.f4458a) {
            return;
        }
        List f8 = I6.k.f(rVar, qVar);
        if (f8.isEmpty()) {
            return;
        }
        lVar.b(rVar, f8);
    }

    public static int h(String str, int i8, String str2) {
        while (i8 < str.length() && str2.indexOf(str.charAt(i8)) == -1) {
            i8++;
        }
        return i8;
    }

    public static int i(String str, int i8) {
        char charAt;
        while (i8 < str.length() && ((charAt = str.charAt(i8)) == ' ' || charAt == '\t')) {
            i8++;
        }
        return i8;
    }

    private static long j(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static Set k(q qVar) {
        Set emptySet = Collections.emptySet();
        int e8 = qVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            if ("Vary".equalsIgnoreCase(qVar.c(i8))) {
                String f8 = qVar.f(i8);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : f8.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    private static Set l(z zVar) {
        return k(zVar.o());
    }

    public static q m(q qVar, q qVar2) {
        Set k8 = k(qVar2);
        if (k8.isEmpty()) {
            return new q.a().d();
        }
        q.a aVar = new q.a();
        int e8 = qVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            String c8 = qVar.c(i8);
            if (k8.contains(c8)) {
                aVar.a(c8, qVar.f(i8));
            }
        }
        return aVar.d();
    }

    public static q n(z zVar) {
        return m(zVar.v().E().d(), zVar.o());
    }

    public static boolean o(z zVar, q qVar, x xVar) {
        for (String str : l(zVar)) {
            if (!J6.c.n(qVar.g(str), xVar.e(str))) {
                return false;
            }
        }
        return true;
    }
}
