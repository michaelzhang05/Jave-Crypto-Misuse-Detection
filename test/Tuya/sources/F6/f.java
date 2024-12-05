package F6;

import P6.C1282h;
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
    public static final f f2766c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Set f2767a;

    /* renamed from: b, reason: collision with root package name */
    private final O6.c f2768b;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f2769a = new ArrayList();

        public f a() {
            return new f(new LinkedHashSet(this.f2769a), null);
        }
    }

    f(Set set, O6.c cVar) {
        this.f2767a = set;
        this.f2768b = cVar;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + d((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static C1282h d(X509Certificate x509Certificate) {
        return C1282h.y(x509Certificate.getPublicKey().getEncoded()).E();
    }

    public void a(String str, List list) {
        List b8 = b(str);
        if (b8.isEmpty()) {
            return;
        }
        O6.c cVar = this.f2768b;
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
        Iterator it = this.f2767a.iterator();
        if (!it.hasNext()) {
            return emptyList;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f e(O6.c cVar) {
        if (G6.c.n(this.f2768b, cVar)) {
            return this;
        }
        return new f(this.f2767a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (G6.c.n(this.f2768b, fVar.f2768b) && this.f2767a.equals(fVar.f2767a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i8;
        O6.c cVar = this.f2768b;
        if (cVar != null) {
            i8 = cVar.hashCode();
        } else {
            i8 = 0;
        }
        return (i8 * 31) + this.f2767a.hashCode();
    }
}
