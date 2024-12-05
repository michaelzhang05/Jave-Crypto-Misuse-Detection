package P6;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: P6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1280f extends X, WritableByteChannel {
    C1279e buffer();

    InterfaceC1280f emitCompleteSegments();

    @Override // P6.X, java.io.Flushable
    void flush();

    OutputStream outputStream();

    InterfaceC1280f write(byte[] bArr);

    InterfaceC1280f write(byte[] bArr, int i8, int i9);

    InterfaceC1280f writeByte(int i8);

    InterfaceC1280f writeDecimalLong(long j8);

    InterfaceC1280f writeHexadecimalUnsignedLong(long j8);

    InterfaceC1280f writeInt(int i8);

    InterfaceC1280f writeShort(int i8);

    InterfaceC1280f writeUtf8(String str);
}
