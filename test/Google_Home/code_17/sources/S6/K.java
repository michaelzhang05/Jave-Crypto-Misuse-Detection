package S6;

import S6.Q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public class K extends C1430s {
    private final Long p(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // S6.C1430s, S6.AbstractC1423k
    public void a(Q source, Q target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(target, "target");
        try {
            Path n8 = source.n();
            Path n9 = target.n();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(n8, n9, AbstractC1434w.a(standardCopyOption), AbstractC1434w.a(standardCopyOption2));
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e8) {
            message = e8.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // S6.C1430s, S6.AbstractC1423k
    public C1422j h(Q path) {
        AbstractC3255y.i(path, "path");
        return o(path.n());
    }

    protected final C1422j o(Path nioPath) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        Path path;
        boolean isRegularFile;
        boolean isDirectory;
        Q q8;
        long size;
        FileTime creationTime;
        Long l8;
        FileTime lastModifiedTime;
        Long l9;
        FileTime lastAccessTime;
        AbstractC3255y.i(nioPath, "nioPath");
        Long l10 = null;
        try {
            Class a8 = AbstractC1431t.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) a8, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            if (isSymbolicLink) {
                path = Files.readSymbolicLink(nioPath);
            } else {
                path = null;
            }
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            if (path != null) {
                q8 = Q.a.f(Q.f9832b, path, false, 1, null);
            } else {
                q8 = null;
            }
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l8 = p(creationTime);
            } else {
                l8 = null;
            }
            lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l9 = p(lastModifiedTime);
            } else {
                l9 = null;
            }
            lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l10 = p(lastAccessTime);
            }
            return new C1422j(isRegularFile, isDirectory, q8, valueOf, l8, l9, l10, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // S6.C1430s
    public String toString() {
        return "NioSystemFileSystem";
    }
}
