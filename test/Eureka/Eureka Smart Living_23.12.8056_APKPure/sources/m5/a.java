package m5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f7908a = new ArrayList();

    /* renamed from: m5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0120a {

        /* renamed from: a, reason: collision with root package name */
        public Pattern f7909a;

        /* renamed from: b, reason: collision with root package name */
        public Pattern f7910b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f7911c;

        /* renamed from: d, reason: collision with root package name */
        public Pattern f7912d;

        /* JADX WARN: Removed duplicated region for block: B:13:0x006e A[Catch: NumberFormatException -> 0x0086, TryCatch #0 {NumberFormatException -> 0x0086, blocks: (B:28:0x000a, B:31:0x0011, B:4:0x001e, B:6:0x0024, B:8:0x0056, B:11:0x005d, B:13:0x006e, B:16:0x0077, B:19:0x0083, B:21:0x006a, B:22:0x0027, B:24:0x002f, B:25:0x0048, B:26:0x004f, B:3:0x001c), top: B:27:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[Catch: NumberFormatException -> 0x0086, TryCatch #0 {NumberFormatException -> 0x0086, blocks: (B:28:0x000a, B:31:0x0011, B:4:0x001e, B:6:0x0024, B:8:0x0056, B:11:0x005d, B:13:0x006e, B:16:0x0077, B:19:0x0083, B:21:0x006a, B:22:0x0027, B:24:0x002f, B:25:0x0048, B:26:0x004f, B:3:0x001c), top: B:27:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[Catch: NumberFormatException -> 0x0086, TryCatch #0 {NumberFormatException -> 0x0086, blocks: (B:28:0x000a, B:31:0x0011, B:4:0x001e, B:6:0x0024, B:8:0x0056, B:11:0x005d, B:13:0x006e, B:16:0x0077, B:19:0x0083, B:21:0x006a, B:22:0x0027, B:24:0x002f, B:25:0x0048, B:26:0x004f, B:3:0x001c), top: B:27:0x000a }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0120a(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            /*
                r5 = this;
                r5.<init>()
                r0 = 0
                java.lang.String r1 = "*"
                r2 = 2
                r3 = 0
                if (r6 == 0) goto L1c
                boolean r4 = r1.equals(r6)     // Catch: java.lang.NumberFormatException -> L86
                if (r4 == 0) goto L11
                goto L1c
            L11:
                java.lang.String r6 = r5.b(r6, r0)     // Catch: java.lang.NumberFormatException -> L86
                java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r2)     // Catch: java.lang.NumberFormatException -> L86
                r5.f7909a = r6     // Catch: java.lang.NumberFormatException -> L86
                goto L1e
            L1c:
                r5.f7909a = r3     // Catch: java.lang.NumberFormatException -> L86
            L1e:
                boolean r6 = r1.equals(r7)     // Catch: java.lang.NumberFormatException -> L86
                if (r6 == 0) goto L27
                r5.f7910b = r3     // Catch: java.lang.NumberFormatException -> L86
                goto L54
            L27:
                java.lang.String r6 = "*."
                boolean r6 = r7.startsWith(r6)     // Catch: java.lang.NumberFormatException -> L86
                if (r6 == 0) goto L4f
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L86
                r6.<init>()     // Catch: java.lang.NumberFormatException -> L86
                java.lang.String r4 = "([a-z0-9.-]*\\.)?"
                r6.append(r4)     // Catch: java.lang.NumberFormatException -> L86
                java.lang.String r7 = r7.substring(r2)     // Catch: java.lang.NumberFormatException -> L86
                java.lang.String r7 = r5.b(r7, r0)     // Catch: java.lang.NumberFormatException -> L86
                r6.append(r7)     // Catch: java.lang.NumberFormatException -> L86
                java.lang.String r6 = r6.toString()     // Catch: java.lang.NumberFormatException -> L86
            L48:
                java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r2)     // Catch: java.lang.NumberFormatException -> L86
                r5.f7910b = r6     // Catch: java.lang.NumberFormatException -> L86
                goto L54
            L4f:
                java.lang.String r6 = r5.b(r7, r0)     // Catch: java.lang.NumberFormatException -> L86
                goto L48
            L54:
                if (r8 == 0) goto L6a
                boolean r6 = r1.equals(r8)     // Catch: java.lang.NumberFormatException -> L86
                if (r6 == 0) goto L5d
                goto L6a
            L5d:
                r6 = 10
                int r6 = java.lang.Integer.parseInt(r8, r6)     // Catch: java.lang.NumberFormatException -> L86
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L86
                r5.f7911c = r6     // Catch: java.lang.NumberFormatException -> L86
                goto L6c
            L6a:
                r5.f7911c = r3     // Catch: java.lang.NumberFormatException -> L86
            L6c:
                if (r9 == 0) goto L83
                java.lang.String r6 = "/*"
                boolean r6 = r6.equals(r9)     // Catch: java.lang.NumberFormatException -> L86
                if (r6 == 0) goto L77
                goto L83
            L77:
                r6 = 1
                java.lang.String r6 = r5.b(r9, r6)     // Catch: java.lang.NumberFormatException -> L86
                java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.NumberFormatException -> L86
                r5.f7912d = r6     // Catch: java.lang.NumberFormatException -> L86
                goto L85
            L83:
                r5.f7912d = r3     // Catch: java.lang.NumberFormatException -> L86
            L85:
                return
            L86:
                java.net.MalformedURLException r6 = new java.net.MalformedURLException
                java.lang.String r7 = "Port must be a number"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m5.a.C0120a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        private String b(String str, boolean z5) {
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < str.length(); i6++) {
                char charAt = str.charAt(i6);
                if (charAt == '*' && z5) {
                    sb.append(".");
                } else if ("\\.[]{}()^$?+|".indexOf(charAt) > -1) {
                    sb.append('\\');
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        public boolean a(Uri uri) {
            try {
                Pattern pattern = this.f7909a;
                if (pattern != null && !pattern.matcher(uri.getScheme()).matches()) {
                    return false;
                }
                Pattern pattern2 = this.f7910b;
                if (pattern2 != null && !pattern2.matcher(uri.getHost()).matches()) {
                    return false;
                }
                Integer num = this.f7911c;
                if (num != null && !num.equals(Integer.valueOf(uri.getPort()))) {
                    return false;
                }
                Pattern pattern3 = this.f7912d;
                if (pattern3 != null) {
                    if (!pattern3.matcher(uri.getPath()).matches()) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e6) {
                o.a("CordovaAllowList", e6.toString());
                return false;
            }
        }
    }

    public void a(String str, boolean z5) {
        String str2 = "*";
        if (this.f7908a != null) {
            try {
                if (str.compareTo("*") == 0) {
                    o.a("CordovaAllowList", "Unlimited access to network resources");
                    this.f7908a = null;
                    return;
                }
                Matcher matcher = Pattern.compile("^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?").matcher(str);
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    String group2 = matcher.group(4);
                    if ((!"file".equals(group) && !"content".equals(group)) || group2 != null) {
                        str2 = group2;
                    }
                    String group3 = matcher.group(8);
                    String group4 = matcher.group(9);
                    if (group != null) {
                        this.f7908a.add(new C0120a(group, str2, group3, group4));
                    } else {
                        this.f7908a.add(new C0120a("http", str2, group3, group4));
                        this.f7908a.add(new C0120a("https", str2, group3, group4));
                    }
                }
            } catch (Exception unused) {
                o.b("CordovaAllowList", "Failed to add origin %s", str);
            }
        }
    }

    public boolean b(String str) {
        if (this.f7908a == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        Iterator it = this.f7908a.iterator();
        while (it.hasNext()) {
            if (((C0120a) it.next()).a(parse)) {
                return true;
            }
        }
        return false;
    }
}
