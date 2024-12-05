package I6;

import S6.C1420h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f4306c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Set f4307a;

    /* renamed from: b, reason: collision with root package name */
    private final R6.c f4308b;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f4309a = new ArrayList();

        public f a() {
            return new f(new LinkedHashSet(this.f4309a), null);
        }
    }

    f(Set set, R6.c cVar) {
        this.f4307a = set;
        this.f4308b = cVar;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + d((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static C1420h d(X509Certificate x509Certificate) {
        return C1420h.C(x509Certificate.getPublicKey().getEncoded()).I();
    }

    public void a(String str, List list) {
        List b8 = b(str);
        if (b8.isEmpty()) {
            return;
        }
        R6.c cVar = this.f4308b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (b8.size() > 0) {
                android.support.v4.media.a.a(b8.get(0));
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i9);
            sb.append("\n    ");
            sb.append(c(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size3 = b8.size();
        for (int i10 = 0; i10 < size3; i10++) {
            android.support.v4.media.a.a(b8.get(i10));
            sb.append("\n    ");
            sb.append((Object) null);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    List b(String str) {
        List emptyList = Collections.emptyList();
        Iterator it = this.f4307a.iterator();
        if (!it.hasNext()) {
            return emptyList;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f e(R6.c cVar) {
        if (J6.c.n(this.f4308b, cVar)) {
            return this;
        }
        return new f(this.f4307a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (J6.c.n(this.f4308b, fVar.f4308b) && this.f4307a.equals(fVar.f4307a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i8;
        R6.c cVar = this.f4308b;
        if (cVar != null) {
            i8 = cVar.hashCode();
        } else {
            i8 = 0;
        }
        return (i8 * 31) + this.f4307a.hashCode();
    }
}
