package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public final class zzdkr {
    private static BigInteger a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static KeyPair b(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator b2 = zzdkx.f14788h.b("EC");
        b2.initialize(eCParameterSpec);
        return b2.generateKeyPair();
    }

    public static ECPrivateKey c(zzdkt zzdktVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) zzdkx.f14789i.b("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), e(zzdktVar)));
    }

    public static ECPublicKey d(zzdkt zzdktVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec e2 = e(zzdktVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        h(eCPoint, e2.getCurve());
        return (ECPublicKey) zzdkx.f14789i.b("EC").generatePublic(new ECPublicKeySpec(eCPoint, e2));
    }

    public static ECParameterSpec e(zzdkt zzdktVar) throws NoSuchAlgorithmException {
        int i2 = ot.f11951b[zzdktVar.ordinal()];
        if (i2 == 1) {
            return f("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 == 2) {
            return f("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        if (i2 == 3) {
            return f("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        String valueOf = String.valueOf(zzdktVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("curve not implemented:");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    private static ECParameterSpec f(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        h(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger a = a(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX != null && affineY != null) {
            if (affineX.signum() != -1 && affineX.compareTo(a) == -1) {
                if (affineY.signum() != -1 && affineY.compareTo(a) == -1) {
                    if (!affineY.multiply(affineY).mod(a).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(a))) {
                        throw new GeneralSecurityException("Point is not on curve");
                    }
                    return;
                }
                throw new GeneralSecurityException("y is out of range");
            }
            throw new GeneralSecurityException("x is out of range");
        }
        throw new GeneralSecurityException("point is at infinity");
    }

    public static byte[] i(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        h(eCPoint, eCPrivateKey.getParams().getCurve());
        ECParameterSpec params = eCPrivateKey.getParams();
        params.getCurve();
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, params));
        KeyAgreement b2 = zzdkx.f14787g.b("ECDH");
        b2.init(eCPrivateKey);
        try {
            b2.doPhase(generatePublic, true);
            byte[] generateSecret = b2.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(a(curve)) == -1) {
                BigInteger a = a(curve);
                BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(a);
                if (a.signum() == 1) {
                    BigInteger mod2 = mod.mod(a);
                    BigInteger bigInteger2 = null;
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    if (!mod2.equals(bigInteger3)) {
                        if (a.testBit(0) && a.testBit(1)) {
                            bigInteger2 = mod2.modPow(a.add(BigInteger.ONE).shiftRight(2), a);
                        } else if (a.testBit(0) && !a.testBit(1)) {
                            bigInteger2 = BigInteger.ONE;
                            BigInteger shiftRight = a.subtract(bigInteger2).shiftRight(1);
                            int i2 = 0;
                            while (true) {
                                BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(a);
                                if (mod3.equals(BigInteger.ZERO)) {
                                    break;
                                }
                                BigInteger modPow = mod3.modPow(shiftRight, a);
                                BigInteger bigInteger4 = BigInteger.ONE;
                                if (!modPow.add(bigInteger4).equals(a)) {
                                    if (modPow.equals(bigInteger4)) {
                                        bigInteger2 = bigInteger2.add(bigInteger4);
                                        i2++;
                                        if (i2 == 128 && !a.isProbablePrime(80)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                    } else {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    BigInteger shiftRight2 = a.add(bigInteger4).shiftRight(1);
                                    BigInteger bigInteger5 = bigInteger2;
                                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                        BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                        bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(a).multiply(mod3)).mod(a);
                                        BigInteger mod4 = multiply.add(multiply).mod(a);
                                        if (shiftRight2.testBit(bitLength)) {
                                            BigInteger mod5 = bigInteger5.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(a);
                                            bigInteger4 = bigInteger2.multiply(mod4).add(bigInteger5).mod(a);
                                            bigInteger5 = mod5;
                                        } else {
                                            bigInteger4 = mod4;
                                        }
                                    }
                                    bigInteger2 = bigInteger5;
                                }
                            }
                        }
                        if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(a).compareTo(mod2) != 0) {
                            throw new GeneralSecurityException("Could not find a modular square root");
                        }
                        bigInteger3 = bigInteger2;
                    }
                    if (true != bigInteger3.testBit(0)) {
                        a.subtract(bigInteger3).mod(a);
                    }
                    return generateSecret;
                }
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }

    public static int j(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }
}
