package j;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
/* loaded from: classes2.dex */
public interface h extends d0, ReadableByteChannel {
    long A(i iVar) throws IOException;

    long C() throws IOException;

    String E(long j2) throws IOException;

    boolean Q(long j2, i iVar) throws IOException;

    String R(Charset charset) throws IOException;

    i X() throws IOException;

    String b0() throws IOException;

    byte[] d0(long j2) throws IOException;

    f e();

    long h0(b0 b0Var) throws IOException;

    f j();

    i k(long j2) throws IOException;

    void l0(long j2) throws IOException;

    long o0() throws IOException;

    InputStream p0();

    h peek();

    int r0(t tVar) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j2) throws IOException;

    byte[] s() throws IOException;

    void skip(long j2) throws IOException;

    long t(i iVar) throws IOException;

    boolean u() throws IOException;

    void y(f fVar, long j2) throws IOException;
}
