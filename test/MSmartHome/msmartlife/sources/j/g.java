package j;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
/* loaded from: classes2.dex */
public interface g extends b0, WritableByteChannel {
    g B() throws IOException;

    g M(String str) throws IOException;

    g U(String str, int i2, int i3) throws IOException;

    long V(d0 d0Var) throws IOException;

    g W(long j2) throws IOException;

    f e();

    g f0(i iVar) throws IOException;

    @Override // j.b0, java.io.Flushable
    void flush() throws IOException;

    g m0(long j2) throws IOException;

    g n() throws IOException;

    g write(byte[] bArr) throws IOException;

    g write(byte[] bArr, int i2, int i3) throws IOException;

    g writeByte(int i2) throws IOException;

    g writeInt(int i2) throws IOException;

    g writeShort(int i2) throws IOException;
}
