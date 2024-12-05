package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class UncloseableOutputStream extends OutputStream {
    private final FileOutputStream fileOutputStream;

    public UncloseableOutputStream(FileOutputStream fileOutputStream) {
        AbstractC3159y.i(fileOutputStream, "fileOutputStream");
        this.fileOutputStream = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.fileOutputStream.flush();
    }

    public final FileOutputStream getFileOutputStream() {
        return this.fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.fileOutputStream.write(i8);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b8) {
        AbstractC3159y.i(b8, "b");
        this.fileOutputStream.write(b8);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i8, int i9) {
        AbstractC3159y.i(bytes, "bytes");
        this.fileOutputStream.write(bytes, i8, i9);
    }
}
