package R6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: R6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1331b extends AbstractC1351s {

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f8802c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    protected final byte[] f8803a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f8804b;

    public AbstractC1331b(byte[] bArr, int i8) {
        if (bArr != null) {
            if (bArr.length == 0 && i8 != 0) {
                throw new IllegalArgumentException("zero length data with non-zero pad bits");
            }
            if (i8 <= 7 && i8 >= 0) {
                this.f8803a = E7.a.d(bArr);
                this.f8804b = i8;
                return;
            }
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        throw new NullPointerException("'data' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1331b w(int i8, InputStream inputStream) {
        if (i8 >= 1) {
            int read = inputStream.read();
            int i9 = i8 - 1;
            byte[] bArr = new byte[i9];
            if (i9 != 0) {
                if (G7.a.c(inputStream, bArr) == i9) {
                    if (read > 0 && read < 8) {
                        byte b8 = bArr[i8 - 2];
                        if (b8 != ((byte) ((255 << read) & b8))) {
                            return new n0(bArr, read);
                        }
                    }
                } else {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
            }
            return new Q(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    @Override // R6.AbstractC1351s, R6.AbstractC1346m
    public int hashCode() {
        byte[] bArr = this.f8803a;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((E7.a.l(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << this.f8804b)))) ^ this.f8804b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public boolean m(AbstractC1351s abstractC1351s) {
        if (!(abstractC1351s instanceof AbstractC1331b)) {
            return false;
        }
        AbstractC1331b abstractC1331b = (AbstractC1331b) abstractC1351s;
        if (this.f8804b != abstractC1331b.f8804b) {
            return false;
        }
        byte[] bArr = this.f8803a;
        byte[] bArr2 = abstractC1331b.f8803a;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i8 = length - 1;
        if (i8 < 0) {
            return true;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (bArr[i9] != bArr2[i9]) {
                return false;
            }
        }
        byte b8 = bArr[i8];
        int i10 = this.f8804b;
        if (((byte) (b8 & (255 << i10))) != ((byte) (bArr2[i8] & (255 << i10)))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public AbstractC1351s u() {
        return new Q(this.f8803a, this.f8804b);
    }

    public byte[] x() {
        byte[] bArr = this.f8803a;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] d8 = E7.a.d(bArr);
        int length = this.f8803a.length - 1;
        d8[length] = (byte) (d8[length] & (255 << this.f8804b));
        return d8;
    }

    public byte[] y() {
        if (this.f8804b == 0) {
            return E7.a.d(this.f8803a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String z() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i8 = 0; i8 != encoded.length; i8++) {
                char[] cArr = f8802c;
                stringBuffer.append(cArr[(encoded[i8] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i8] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e8) {
            throw new r("Internal error encoding BitString: " + e8.getMessage(), e8);
        }
    }
}
