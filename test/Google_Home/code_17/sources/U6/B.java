package U6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class B extends AbstractC1438a {
    public B(int i8, C1446e c1446e) {
        super(true, i8, v(c1446e));
    }

    private static byte[] v(C1446e c1446e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != c1446e.f(); i8++) {
            try {
                byteArrayOutputStream.write(((AbstractC1455m) c1446e.d(i8)).k("BER"));
            } catch (IOException e8) {
                throw new r("malformed object: " + e8, e8);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        int i8;
        if (this.f10425a) {
            i8 = 96;
        } else {
            i8 = 64;
        }
        c1459q.o(z8, i8, this.f10426b, this.f10427c);
    }
}