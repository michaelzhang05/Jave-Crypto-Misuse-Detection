package o5;

import android.net.Uri;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8278a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8279b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8281d;

    private f(Uri uri, String str, String str2, boolean z5) {
        this.f8278a = uri;
        this.f8279b = str;
        this.f8280c = str2;
        this.f8281d = z5;
    }

    public static String a(String str) {
        return "__cdvfile_" + str + "__";
    }

    public static f b(Uri uri) {
        int indexOf;
        if (!uri.toString().contains("__cdvfile_")) {
            return null;
        }
        String path = uri.getPath();
        if (path.length() < 1 || (indexOf = path.indexOf(47, 1)) < 0) {
            return null;
        }
        String substring = path.substring(1, indexOf).substring(10).substring(0, r1.length() - 2);
        String substring2 = path.substring(indexOf);
        return new f(uri, substring, substring2, substring2.charAt(substring2.length() - 1) == '/');
    }

    public static f c(String str) {
        return b(Uri.parse(str));
    }

    public String toString() {
        return this.f8278a.toString();
    }
}
