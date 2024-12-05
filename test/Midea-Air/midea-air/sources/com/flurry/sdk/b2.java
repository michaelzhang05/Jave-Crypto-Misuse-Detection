package com.flurry.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class b2 {
    private static String a = "FileUtil";

    /* loaded from: classes2.dex */
    static class a implements FilenameFilter {
        final /* synthetic */ Pattern a;

        a(Pattern pattern) {
            this.a = pattern;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return this.a.matcher(str).matches();
        }
    }

    public static File a() {
        return b0.a().getFilesDir();
    }

    public static boolean b(File file) {
        if (file == null || file.getAbsoluteFile() == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.mkdirs() || parentFile.isDirectory()) {
            return true;
        }
        d1.c(6, a, "Unable to create persistent dir: ".concat(String.valueOf(parentFile)));
        return false;
    }

    public static String[] c(File file, Pattern pattern) {
        if (!file.exists()) {
            return new String[0];
        }
        String[] list = file.list(new a(pattern));
        return list == null ? new String[0] : list;
    }

    @TargetApi(21)
    public static File d() {
        File file;
        Context a2 = b0.a();
        if (c2.g(21)) {
            file = a2.getNoBackupFilesDir();
        } else {
            file = new File(a2.getFilesDir().getPath() + File.separator + "no_backup");
        }
        return new File(file.getPath() + File.separator + ".flurryNoBackup");
    }

    public static boolean e(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        for (String str : file.list()) {
            if (!e(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(java.io.File r6) {
        /*
            r0 = 4
            r1 = 0
            if (r6 == 0) goto L61
            boolean r2 = r6.exists()
            if (r2 != 0) goto Lb
            goto L61
        Lb:
            java.lang.String r2 = com.flurry.sdk.b2.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Loading persistent data: "
            r3.<init>(r4)
            java.lang.String r4 = r6.getAbsolutePath()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.flurry.sdk.d1.c(r0, r2, r3)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L46
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r6.<init>()     // Catch: java.lang.Throwable -> L44
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L44
        L30:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L44
            if (r3 <= 0) goto L40
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L44
            r5 = 0
            r4.<init>(r2, r5, r3)     // Catch: java.lang.Throwable -> L44
            r6.append(r4)     // Catch: java.lang.Throwable -> L44
            goto L30
        L40:
            com.flurry.sdk.c2.f(r0)
            goto L54
        L44:
            r6 = move-exception
            goto L48
        L46:
            r6 = move-exception
            r0 = r1
        L48:
            r2 = 6
            java.lang.String r3 = com.flurry.sdk.b2.a     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "Error when loading persistent file"
            com.flurry.sdk.d1.d(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L5c
            com.flurry.sdk.c2.f(r0)
            r6 = r1
        L54:
            if (r6 == 0) goto L5b
            java.lang.String r6 = r6.toString()
            return r6
        L5b:
            return r1
        L5c:
            r6 = move-exception
            com.flurry.sdk.c2.f(r0)
            throw r6
        L61:
            java.lang.String r6 = com.flurry.sdk.b2.a
            java.lang.String r2 = "Persistent file doesn't exist."
            com.flurry.sdk.d1.c(r0, r6, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.b2.f(java.io.File):java.lang.String");
    }
}
