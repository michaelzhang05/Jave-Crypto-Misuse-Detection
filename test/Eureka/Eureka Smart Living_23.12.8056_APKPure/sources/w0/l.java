package w0;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private k f9731a = new k();

    public String a(Context context, String str, String str2) {
        String absolutePath = new File(context.getFilesDir().getParentFile(), "databases").getAbsolutePath();
        File file = new File(absolutePath);
        if (!file.isDirectory() && !file.mkdir()) {
            throw new Exception("Cannot create dir" + absolutePath);
        }
        String c6 = this.f9731a.c(context, str);
        File file2 = new File(c6);
        if (file2.exists()) {
            return c6.concat("/").concat(str2);
        }
        throw new Exception("Folder " + file2 + " does not exist");
    }
}
