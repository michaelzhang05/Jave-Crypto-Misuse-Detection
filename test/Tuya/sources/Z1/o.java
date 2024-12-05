package Z1;

import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static Provider f13248a;

    public static X509Certificate a(byte[] bArr) {
        try {
            return b(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static X509Certificate b(byte[] bArr) {
        CertificateFactory certificateFactory;
        if (bArr != null && bArr.length != 0) {
            Provider provider = f13248a;
            if (provider != null) {
                certificateFactory = CertificateFactory.getInstance("X.509", provider);
            } else {
                certificateFactory = CertificateFactory.getInstance("X.509");
            }
            Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            if (generateCertificate instanceof X509Certificate) {
                return (X509Certificate) generateCertificate;
            }
            throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
        }
        return null;
    }
}
