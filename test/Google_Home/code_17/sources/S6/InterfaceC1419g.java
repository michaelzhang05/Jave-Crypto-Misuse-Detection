package S6;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: S6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1419g extends Z, ReadableByteChannel {
    C1417e buffer();

    boolean d(long j8, C1420h c1420h);

    boolean exhausted();

    C1417e i();

    InputStream inputStream();

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j8);

    C1420h readByteString(long j8);

    long readDecimalLong();

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readUtf8(long j8);

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j8);

    void require(long j8);

    void skip(long j8);
}
