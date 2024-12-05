package c.h.h;

import android.util.Base64;
import c.h.j.j;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2679b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2680c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f2681d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2682e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f2683f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = (String) j.c(str);
        this.f2679b = (String) j.c(str2);
        this.f2680c = (String) j.c(str3);
        this.f2681d = (List) j.c(list);
        this.f2683f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f2681d;
    }

    public int c() {
        return this.f2682e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f2683f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.f2679b;
    }

    public String g() {
        return this.f2680c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.f2679b + ", mQuery: " + this.f2680c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f2681d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2681d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2682e);
        return sb.toString();
    }
}
