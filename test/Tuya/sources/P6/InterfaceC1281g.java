package P6;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: P6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1281g extends Z, ReadableByteChannel {
    C1279e buffer();

    boolean exhausted();

    C1279e i();

    InputStream inputStream();

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j8);

    C1282h readByteString(long j8);

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

    boolean s(long j8, C1282h c1282h);

    void skip(long j8);
}
