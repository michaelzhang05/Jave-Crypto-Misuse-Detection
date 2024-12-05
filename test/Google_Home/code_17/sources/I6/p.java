package I6;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final C f4469a;

    /* renamed from: b, reason: collision with root package name */
    private final g f4470b;

    /* renamed from: c, reason: collision with root package name */
    private final List f4471c;

    /* renamed from: d, reason: collision with root package name */
    private final List f4472d;

    private p(C c8, g gVar, List list, List list2) {
        this.f4469a = c8;
        this.f4470b = gVar;
        this.f4471c = list;
        this.f4472d = list2;
    }

    public static p b(C c8, g gVar, List list, List list2) {
        if (c8 != null) {
            if (gVar != null) {
                return new p(c8, gVar, J6.c.q(list), J6.c.q(list2));
            }
            throw new NullPointerException("cipherSuite == null");
        }
        throw new NullPointerException("tlsVersion == null");
    }

    public static p c(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            g a8 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                C a9 = C.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    emptyList = J6.c.r(certificateArr);
                } else {
                    emptyList = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    emptyList2 = J6.c.r(localCertificates);
                } else {
                    emptyList2 = Collections.emptyList();
                }
                return new p(a9, a8, emptyList, emptyList2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public g a() {
        return this.f4470b;
    }

    public List d() {
        return this.f4472d;
    }

    public List e() {
        return this.f4471c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f4469a.equals(pVar.f4469a) || !this.f4470b.equals(pVar.f4470b) || !this.f4471c.equals(pVar.f4471c) || !this.f4472d.equals(pVar.f4472d)) {
            return false;
        }
        return true;
    }

    public C f() {
        return this.f4469a;
    }

    public int hashCode() {
        return ((((((527 + this.f4469a.hashCode()) * 31) + this.f4470b.hashCode()) * 31) + this.f4471c.hashCode()) * 31) + this.f4472d.hashCode();
    }
}
