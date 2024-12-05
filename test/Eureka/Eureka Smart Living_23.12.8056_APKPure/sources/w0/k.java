package w0;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private j f9730a = new j();

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r11.f9730a.m(r10).equals("db") != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r12, java.lang.String r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k.a(android.content.Context, java.lang.String, java.util.ArrayList):void");
    }

    public void b(Context context, String str, ArrayList arrayList) {
        String c6 = c(context, str);
        File file = new File(c6);
        if (!file.exists()) {
            throw new Exception("Folder " + file + " does not exist");
        }
        String[] list = file.list();
        int length = list.length;
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = list[i6];
            if (!str2.contains("SQLite.db")) {
                if (arrayList.size() > 0) {
                    str2 = "";
                    if (str2.length() > 0 && !this.f9730a.k(c6, str2).booleanValue()) {
                        throw new Exception("Failed in delete " + str2);
                    }
                } else {
                    str2 = "";
                    if (str2.length() > 0) {
                        throw new Exception("Failed in delete " + str2);
                    }
                    continue;
                }
            }
        }
    }

    public String c(Context context, String str) {
        String concat;
        String str2;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        String absolutePath2 = new File(context.getFilesDir().getParentFile(), "databases").getAbsolutePath();
        if (str.equals("default")) {
            return absolutePath2;
        }
        if (str.equalsIgnoreCase("cache")) {
            return context.getCacheDir().getAbsolutePath();
        }
        String[] split = str.split("/", 2);
        if (split.length != 2) {
            return absolutePath;
        }
        if (split[0].equals("files")) {
            concat = absolutePath.concat("/");
            str2 = split[1];
        } else {
            if (!split[0].equals("databases")) {
                throw new Exception("Folder " + str + " not allowed");
            }
            concat = absolutePath2.concat("/");
            str2 = split[1];
        }
        return concat.concat(str2);
    }

    public String[] d(Context context, String str) {
        String absolutePath = new File(context.getFilesDir().getParentFile(), "databases").getAbsolutePath();
        File file = new File(absolutePath);
        if (!file.isDirectory() && !file.mkdir()) {
            throw new Exception("Cannot create dir" + absolutePath);
        }
        File file2 = new File(c(context, str));
        if (file2.exists()) {
            return file2.list();
        }
        throw new Exception("Folder " + file2 + " does not exist");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r8.f9730a.m(r3).equals("db") != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.content.Context r9, java.lang.String r10, java.util.ArrayList r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k.e(android.content.Context, java.lang.String, java.util.ArrayList):void");
    }
}
