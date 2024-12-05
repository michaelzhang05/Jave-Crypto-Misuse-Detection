package R1;

/* loaded from: classes4.dex */
public abstract class n {
    public static byte[] a(N1.m mVar, byte[] bArr) {
        N1.c u8 = mVar.u();
        if (u8 == null) {
            return bArr;
        }
        if (u8.equals(N1.c.f7506b)) {
            try {
                return c2.g.a(bArr);
            } catch (Exception e8) {
                throw new N1.f("Couldn't compress plain text: " + e8.getMessage(), e8);
            }
        }
        throw new N1.f("Unsupported compression algorithm: " + u8);
    }

    public static byte[] b(N1.m mVar, byte[] bArr) {
        N1.c u8 = mVar.u();
        if (u8 == null) {
            return bArr;
        }
        if (u8.equals(N1.c.f7506b)) {
            try {
                return c2.g.b(bArr);
            } catch (Exception e8) {
                throw new N1.f("Couldn't decompress plain text: " + e8.getMessage(), e8);
            }
        }
        throw new N1.f("Unsupported compression algorithm: " + u8);
    }
}
