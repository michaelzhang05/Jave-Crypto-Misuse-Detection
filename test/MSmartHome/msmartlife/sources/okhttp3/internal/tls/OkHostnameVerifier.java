package okhttp3.internal.tls;

import j.f0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.text.u;
import kotlin.text.v;
import okhttp3.HttpUrl;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* compiled from: OkHostnameVerifier.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\bJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006\""}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", HttpUrl.FRAGMENT_ENCODE_SET, "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", HttpUrl.FRAGMENT_ENCODE_SET, "verifyIpAddress", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "verifyHostname", "asciiToLowercase", "(Ljava/lang/String;)Ljava/lang/String;", "isAscii", "(Ljava/lang/String;)Z", "pattern", "(Ljava/lang/String;Ljava/lang/String;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "type", HttpUrl.FRAGMENT_ENCODE_SET, "getSubjectAltNames", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "allSubjectAltNames", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "ALT_IPA_NAME", "I", "ALT_DNS_NAME", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        l.e(locale, "Locale.US");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
        List<String> i2;
        List<String> i3;
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!l.a(list.get(0), Integer.valueOf(type))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            i3 = t.i();
            return i3;
        } catch (CertificateParsingException unused) {
            i2 = t.i();
            return i2;
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) f0.b(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) {
        String asciiToLowercase = asciiToLowercase(hostname);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (l.a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        List<String> k0;
        l.f(certificate, "certificate");
        k0 = b0.k0(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
        return k0;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Certificate certificate;
        l.f(host, "host");
        l.f(session, "session");
        if (isAscii(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(host, (X509Certificate) certificate);
    }

    public final boolean verify(String host, X509Certificate certificate) {
        l.f(host, "host");
        l.f(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        boolean A;
        boolean l;
        boolean A2;
        boolean l2;
        boolean l3;
        boolean l4;
        boolean F;
        boolean A3;
        int R;
        boolean l5;
        int W;
        if (!(hostname == null || hostname.length() == 0)) {
            A = u.A(hostname, ".", false, 2, null);
            if (!A) {
                l = u.l(hostname, "..", false, 2, null);
                if (!l) {
                    if (!(pattern == null || pattern.length() == 0)) {
                        A2 = u.A(pattern, ".", false, 2, null);
                        if (!A2) {
                            l2 = u.l(pattern, "..", false, 2, null);
                            if (!l2) {
                                l3 = u.l(hostname, ".", false, 2, null);
                                if (!l3) {
                                    hostname = hostname + ".";
                                }
                                String str = hostname;
                                l4 = u.l(pattern, ".", false, 2, null);
                                if (!l4) {
                                    pattern = pattern + ".";
                                }
                                String asciiToLowercase = asciiToLowercase(pattern);
                                F = v.F(asciiToLowercase, "*", false, 2, null);
                                if (!F) {
                                    return l.a(str, asciiToLowercase);
                                }
                                A3 = u.A(asciiToLowercase, "*.", false, 2, null);
                                if (A3) {
                                    R = v.R(asciiToLowercase, '*', 1, false, 4, null);
                                    if (R != -1 || str.length() < asciiToLowercase.length() || l.a("*.", asciiToLowercase)) {
                                        return false;
                                    }
                                    String substring = asciiToLowercase.substring(1);
                                    l.e(substring, "(this as java.lang.String).substring(startIndex)");
                                    l5 = u.l(str, substring, false, 2, null);
                                    if (!l5) {
                                        return false;
                                    }
                                    int length = str.length() - substring.length();
                                    if (length > 0) {
                                        W = v.W(str, '.', length - 1, false, 4, null);
                                        if (W != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
