package e.h.a.j0;

import e.h.a.k0.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: FileDownloadRandomAccessFile.java */
/* loaded from: classes2.dex */
public class b implements e.h.a.j0.a {
    private final BufferedOutputStream a;

    /* renamed from: b, reason: collision with root package name */
    private final FileDescriptor f17882b;

    /* renamed from: c, reason: collision with root package name */
    private final RandomAccessFile f17883c;

    /* compiled from: FileDownloadRandomAccessFile.java */
    /* loaded from: classes2.dex */
    public static class a implements c.e {
        @Override // e.h.a.k0.c.e
        public e.h.a.j0.a a(File file) throws IOException {
            return new b(file);
        }

        @Override // e.h.a.k0.c.e
        public boolean b() {
            return true;
        }
    }

    b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f17883c = randomAccessFile;
        this.f17882b = randomAccessFile.getFD();
        this.a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // e.h.a.j0.a
    public void a(long j2) throws IOException {
        this.f17883c.setLength(j2);
    }

    @Override // e.h.a.j0.a
    public void b() throws IOException {
        this.a.flush();
        this.f17882b.sync();
    }

    @Override // e.h.a.j0.a
    public void c(long j2) throws IOException {
        this.f17883c.seek(j2);
    }

    @Override // e.h.a.j0.a
    public void close() throws IOException {
        this.a.close();
        this.f17883c.close();
    }

    @Override // e.h.a.j0.a
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.a.write(bArr, i2, i3);
    }
}
