package O0;

import G0.h;
import G0.k;
import J0.AbstractC1275j;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f7826a;

    /* renamed from: b, reason: collision with root package name */
    private final File f7827b;

    /* renamed from: c, reason: collision with root package name */
    private final File f7828c;

    /* renamed from: d, reason: collision with root package name */
    private final File f7829d;

    /* renamed from: e, reason: collision with root package name */
    private final File f7830e;

    /* renamed from: f, reason: collision with root package name */
    private final File f7831f;

    /* renamed from: g, reason: collision with root package name */
    private final File f7832g;

    public g(Context context) {
        String str;
        String d8 = k.f2916a.e(context).d();
        this.f7826a = d8;
        File filesDir = context.getFilesDir();
        this.f7827b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(d8);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File t8 = t(new File(filesDir, str));
        this.f7828c = t8;
        this.f7829d = t(new File(t8, "open-sessions"));
        this.f7830e = t(new File(t8, "reports"));
        this.f7831f = t(new File(t8, "priority-reports"));
        this.f7832g = t(new File(t8, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f7827b, str);
        if (file.exists() && v(file)) {
            h.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (this.f7827b.exists() && (list = this.f7827b.list(new FilenameFilter() { // from class: O0.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean s8;
                s8 = g.s(str, file, str2);
                return s8;
            }
        })) != null) {
            for (String str2 : list) {
                b(str2);
            }
        }
    }

    private File p(String str) {
        return u(new File(this.f7829d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File t(File file) {
        synchronized (g.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    h.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    h.f().d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static List w(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    static String x(String str) {
        if (str.length() > 40) {
            return AbstractC1275j.z(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f7826a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f7829d, str));
    }

    public List f() {
        return w(this.f7829d.list());
    }

    public File g(String str) {
        return new File(this.f7828c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return w(this.f7828c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f7832g, str);
    }

    public List j() {
        return w(this.f7832g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f7831f, str);
    }

    public List m() {
        return w(this.f7831f.listFiles());
    }

    public File n(String str) {
        return new File(this.f7830e, str);
    }

    public List o() {
        return w(this.f7830e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
