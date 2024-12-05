package M0;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final File f6859a;

    /* renamed from: b, reason: collision with root package name */
    private final File f6860b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6861c;

    /* renamed from: d, reason: collision with root package name */
    private final File f6862d;

    /* renamed from: e, reason: collision with root package name */
    private final File f6863e;

    /* renamed from: f, reason: collision with root package name */
    private final File f6864f;

    public f(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.f6859a = filesDir;
        if (v()) {
            StringBuilder sb = new StringBuilder();
            sb.append(".com.google.firebase.crashlytics.files.v2");
            sb.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb.append(u(processName));
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q8 = q(new File(filesDir, str));
        this.f6860b = q8;
        this.f6861c = q(new File(q8, "open-sessions"));
        this.f6862d = q(new File(q8, "reports"));
        this.f6863e = q(new File(q8, "priority-reports"));
        this.f6864f = q(new File(q8, "native-reports"));
    }

    private void a(File file) {
        if (file.exists() && s(file)) {
            E0.f.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private File n(String str) {
        return r(new File(this.f6861c, str));
    }

    private static synchronized File q(File file) {
        synchronized (f.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    E0.f.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    E0.f.f().d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File r(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                s(file2);
            }
        }
        return file.delete();
    }

    private static List t(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private static boolean v() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public void b() {
        a(new File(this.f6859a, ".com.google.firebase.crashlytics"));
        a(new File(this.f6859a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.f6859a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.f6861c, str));
    }

    public List d() {
        return t(this.f6861c.list());
    }

    public File e(String str) {
        return new File(this.f6860b, str);
    }

    public List f(FilenameFilter filenameFilter) {
        return t(this.f6860b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f6864f, str);
    }

    public List h() {
        return t(this.f6864f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), "native"));
    }

    public File j(String str) {
        return new File(this.f6863e, str);
    }

    public List k() {
        return t(this.f6863e.listFiles());
    }

    public File l(String str) {
        return new File(this.f6862d, str);
    }

    public List m() {
        return t(this.f6862d.listFiles());
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}
