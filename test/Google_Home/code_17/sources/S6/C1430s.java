package S6;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1430s extends AbstractC1423k {
    private final void m(Q q8) {
        if (!g(q8)) {
            return;
        }
        throw new IOException(q8 + " already exists.");
    }

    private final void n(Q q8) {
        if (g(q8)) {
            return;
        }
        throw new IOException(q8 + " doesn't exist.");
    }

    @Override // S6.AbstractC1423k
    public void a(Q source, Q target) {
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(target, "target");
        if (source.m().renameTo(target.m())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // S6.AbstractC1423k
    public void d(Q dir, boolean z8) {
        AbstractC3255y.i(dir, "dir");
        if (!dir.m().mkdir()) {
            C1422j h8 = h(dir);
            if (h8 != null && h8.c()) {
                if (!z8) {
                    return;
                }
                throw new IOException(dir + " already exist.");
            }
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override // S6.AbstractC1423k
    public void f(Q path, boolean z8) {
        AbstractC3255y.i(path, "path");
        if (!Thread.interrupted()) {
            File m8 = path.m();
            if (!m8.delete()) {
                if (!m8.exists()) {
                    if (z8) {
                        throw new FileNotFoundException("no such file: " + path);
                    }
                    return;
                }
                throw new IOException("failed to delete " + path);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // S6.AbstractC1423k
    public C1422j h(Q path) {
        AbstractC3255y.i(path, "path");
        File m8 = path.m();
        boolean isFile = m8.isFile();
        boolean isDirectory = m8.isDirectory();
        long lastModified = m8.lastModified();
        long length = m8.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !m8.exists()) {
            return null;
        }
        return new C1422j(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
    }

    @Override // S6.AbstractC1423k
    public AbstractC1421i i(Q file) {
        AbstractC3255y.i(file, "file");
        return new r(false, new RandomAccessFile(file.m(), CampaignEx.JSON_KEY_AD_R));
    }

    @Override // S6.AbstractC1423k
    public AbstractC1421i k(Q file, boolean z8, boolean z9) {
        AbstractC3255y.i(file, "file");
        if (z8 && z9) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z8) {
            m(file);
        }
        if (z9) {
            n(file);
        }
        return new r(true, new RandomAccessFile(file.m(), "rw"));
    }

    @Override // S6.AbstractC1423k
    public Z l(Q file) {
        AbstractC3255y.i(file, "file");
        return L.k(file.m());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
