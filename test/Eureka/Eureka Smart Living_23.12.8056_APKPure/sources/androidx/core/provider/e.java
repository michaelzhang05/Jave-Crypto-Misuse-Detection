package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f2185a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2186b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2187c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2188d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2189e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f2190f;

    public e(String str, String str2, String str3, List list) {
        this.f2185a = (String) androidx.core.util.h.f(str);
        this.f2186b = (String) androidx.core.util.h.f(str2);
        this.f2187c = (String) androidx.core.util.h.f(str3);
        this.f2188d = (List) androidx.core.util.h.f(list);
        this.f2190f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f2188d;
    }

    public int c() {
        return this.f2189e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f2190f;
    }

    public String e() {
        return this.f2185a;
    }

    public String f() {
        return this.f2186b;
    }

    public String g() {
        return this.f2187c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2185a + ", mProviderPackage: " + this.f2186b + ", mQuery: " + this.f2187c + ", mCertificates:");
        for (int i6 = 0; i6 < this.f2188d.size(); i6++) {
            sb.append(" [");
            List list = (List) this.f2188d.get(i6);
            for (int i7 = 0; i7 < list.size(); i7++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i7), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2189e);
        return sb.toString();
    }
}
