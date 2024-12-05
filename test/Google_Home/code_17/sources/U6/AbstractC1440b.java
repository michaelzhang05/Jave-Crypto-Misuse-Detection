package U6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: U6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1440b extends AbstractC1460s {

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f10428c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    protected final byte[] f10429a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10430b;

    public AbstractC1440b(byte[] bArr, int i8) {
        if (bArr != null) {
            if (bArr.length == 0 && i8 != 0) {
                throw new IllegalArgumentException("zero length data with non-zero pad bits");
            }
            if (i8 <= 7 && i8 >= 0) {
                this.f10429a = H7.a.d(bArr);
                this.f10430b = i8;
                return;
            }
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        throw new NullPointerException("'data' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1440b u(int i8, InputStream inputStream) {
        if (i8 >= 1) {
            int read = inputStream.read();
            int i9 = i8 - 1;
            byte[] bArr = new byte[i9];
            if (i9 != 0) {
                if (J7.a.c(inputStream, bArr) == i9) {
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

    @Override // U6.AbstractC1460s, U6.AbstractC1455m
    public int hashCode() {
        byte[] bArr = this.f10429a;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((H7.a.l(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << this.f10430b)))) ^ this.f10430b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public boolean l(AbstractC1460s abstractC1460s) {
        if (!(abstractC1460s instanceof AbstractC1440b)) {
            return false;
        }
        AbstractC1440b abstractC1440b = (AbstractC1440b) abstractC1460s;
        if (this.f10430b != abstractC1440b.f10430b) {
            return false;
        }
        byte[] bArr = this.f10429a;
        byte[] bArr2 = abstractC1440b.f10429a;
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
        int i10 = this.f10430b;
        if (((byte) (b8 & (255 << i10))) != ((byte) (bArr2[i8] & (255 << i10)))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public AbstractC1460s r() {
        return new Q(this.f10429a, this.f10430b);
    }

    public String toString() {
        return z();
    }

    public byte[] v() {
        byte[] bArr = this.f10429a;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] d8 = H7.a.d(bArr);
        int length = this.f10429a.length - 1;
        d8[length] = (byte) (d8[length] & (255 << this.f10430b));
        return d8;
    }

    public byte[] y() {
        if (this.f10430b == 0) {
            return H7.a.d(this.f10429a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String z() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i8 = 0; i8 != encoded.length; i8++) {
                char[] cArr = f10428c;
                stringBuffer.append(cArr[(encoded[i8] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i8] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e8) {
            throw new r("Internal error encoding BitString: " + e8.getMessage(), e8);
        }
    }
}
