package O1;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECKey;

/* loaded from: classes4.dex */
public abstract class q {
    public static int a(K1.p pVar) {
        if (pVar.equals(K1.p.f5830j) || pVar.equals(K1.p.f5831k)) {
            return 64;
        }
        if (pVar.equals(K1.p.f5832l)) {
            return 96;
        }
        if (pVar.equals(K1.p.f5833m)) {
            return 132;
        }
        throw new K1.f(e.d(pVar, r.f7750c));
    }

    public static Signature b(K1.p pVar, Provider provider) {
        String str = "SHA256withECDSA";
        if (!pVar.equals(K1.p.f5830j) && !pVar.equals(K1.p.f5831k)) {
            if (pVar.equals(K1.p.f5832l)) {
                str = "SHA384withECDSA";
            } else if (pVar.equals(K1.p.f5833m)) {
                str = "SHA512withECDSA";
            } else {
                throw new K1.f(e.d(pVar, r.f7750c));
            }
        }
        try {
            if (provider != null) {
                return Signature.getInstance(str, provider);
            }
            return Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e8) {
            throw new K1.f("Unsupported ECDSA algorithm: " + e8.getMessage(), e8);
        }
    }

    public static K1.p c(R1.a aVar) {
        if (aVar != null) {
            if (R1.a.f8627d.equals(aVar)) {
                return K1.p.f5830j;
            }
            if (R1.a.f8628e.equals(aVar)) {
                return K1.p.f5831k;
            }
            if (R1.a.f8630g.equals(aVar)) {
                return K1.p.f5832l;
            }
            if (R1.a.f8631h.equals(aVar)) {
                return K1.p.f5833m;
            }
            throw new K1.f("Unexpected curve: " + aVar);
        }
        throw new K1.f("The EC key curve is not supported, must be P-256, P-384 or P-521");
    }

    public static K1.p d(ECKey eCKey) {
        return c(R1.a.a(eCKey.getParams()));
    }

    public static byte[] e(byte[] bArr) {
        int i8;
        int i9;
        byte[] bArr2;
        int length = bArr.length / 2;
        int i10 = length;
        while (i10 > 0 && bArr[length - i10] == 0) {
            i10--;
        }
        int i11 = length - i10;
        if (bArr[i11] < 0) {
            i8 = i10 + 1;
        } else {
            i8 = i10;
        }
        int i12 = length;
        while (i12 > 0 && bArr[(length * 2) - i12] == 0) {
            i12--;
        }
        int i13 = (length * 2) - i12;
        if (bArr[i13] < 0) {
            i9 = i12 + 1;
        } else {
            i9 = i12;
        }
        int i14 = i8 + 4 + i9;
        if (i14 <= 255) {
            int i15 = 1;
            if (i14 < 128) {
                bArr2 = new byte[i8 + 6 + i9];
            } else {
                bArr2 = new byte[i8 + 7 + i9];
                bArr2[1] = -127;
                i15 = 2;
            }
            bArr2[0] = 48;
            bArr2[i15] = (byte) i14;
            bArr2[i15 + 1] = 2;
            bArr2[i15 + 2] = (byte) i8;
            int i16 = i15 + 3 + i8;
            System.arraycopy(bArr, i11, bArr2, i16 - i10, i10);
            bArr2[i16] = 2;
            bArr2[i16 + 1] = (byte) i9;
            System.arraycopy(bArr, i13, bArr2, ((i16 + 2) + i9) - i12, i12);
            return bArr2;
        }
        throw new K1.f("Invalid ECDSA signature format");
    }
}
