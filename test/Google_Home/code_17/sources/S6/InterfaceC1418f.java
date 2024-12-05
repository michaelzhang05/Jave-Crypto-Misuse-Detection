package S6;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: S6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1418f extends X, WritableByteChannel {
    C1417e buffer();

    InterfaceC1418f emitCompleteSegments();

    @Override // S6.X, java.io.Flushable
    void flush();

    OutputStream outputStream();

    InterfaceC1418f write(byte[] bArr);

    InterfaceC1418f write(byte[] bArr, int i8, int i9);

    InterfaceC1418f writeByte(int i8);

    InterfaceC1418f writeDecimalLong(long j8);

    InterfaceC1418f writeHexadecimalUnsignedLong(long j8);

    InterfaceC1418f writeInt(int i8);

    InterfaceC1418f writeShort(int i8);

    InterfaceC1418f writeUtf8(String str);
}
