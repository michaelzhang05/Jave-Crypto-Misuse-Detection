package x1;

import E1.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3862e {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f39106a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f39107b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f39108c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f39109d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f39110e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f39111f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f39112g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static String a(String str, String str2) {
        g.d(str, "HTML is null or empty");
        int[][] d8 = d(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (f(str, sb, f39107b, str2, d8)) {
            return sb.toString();
        }
        if (c(str, sb, f39106a, str2, d8)) {
            return sb.toString();
        }
        if (f(str, sb, f39109d, str2, d8)) {
            return sb.toString();
        }
        if (c(str, sb, f39108c, str2, d8)) {
            return sb.toString();
        }
        if (f(str, sb, f39111f, str2, d8)) {
            return sb.toString();
        }
        if (c(str, sb, f39110e, str2, d8)) {
            return sb.toString();
        }
        if (c(str, sb, f39112g, str2, d8)) {
            return sb.toString();
        }
        return str2 + str;
    }

    private static boolean b(int i8, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i8 >= iArr2[0] && i8 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean c(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i8 = 0;
        while (matcher.find(i8)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!b(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i8 = end;
        }
        return false;
    }

    private static int[][] d(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int indexOf = str.indexOf("<!--", i8);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i8 = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i8 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(String str, String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean f(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i8 = 0;
        while (matcher.find(i8)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!b(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i8 = end;
        }
        return false;
    }
}
