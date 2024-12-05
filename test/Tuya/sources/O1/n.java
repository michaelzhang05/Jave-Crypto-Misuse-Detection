package O1;

/* loaded from: classes4.dex */
public abstract class n {
    public static byte[] a(K1.m mVar, byte[] bArr) {
        K1.c u8 = mVar.u();
        if (u8 == null) {
            return bArr;
        }
        if (u8.equals(K1.c.f5727b)) {
            try {
                return Z1.g.a(bArr);
            } catch (Exception e8) {
                throw new K1.f("Couldn't compress plain text: " + e8.getMessage(), e8);
            }
        }
        throw new K1.f("Unsupported compression algorithm: " + u8);
    }

    public static byte[] b(K1.m mVar, byte[] bArr) {
        K1.c u8 = mVar.u();
        if (u8 == null) {
            return bArr;
        }
        if (u8.equals(K1.c.f5727b)) {
            try {
                return Z1.g.b(bArr);
            } catch (Exception e8) {
                throw new K1.f("Couldn't decompress plain text: " + e8.getMessage(), e8);
            }
        }
        throw new K1.f("Unsupported compression algorithm: " + u8);
    }
}
