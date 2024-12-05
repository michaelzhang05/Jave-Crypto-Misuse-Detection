package i.a.g;

import i.a.d;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: DNSEntry.java */
/* loaded from: classes2.dex */
public abstract class b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18279b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18280c;

    /* renamed from: d, reason: collision with root package name */
    private final i.a.g.s.e f18281d;

    /* renamed from: e, reason: collision with root package name */
    private final i.a.g.s.d f18282e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f18283f;

    /* renamed from: g, reason: collision with root package name */
    final Map<d.a, String> f18284g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, i.a.g.s.e eVar, i.a.g.s.d dVar, boolean z) {
        String str2;
        String str3;
        this.f18279b = str;
        this.f18281d = eVar;
        this.f18282e = dVar;
        this.f18283f = z;
        Map<d.a, String> K = q.K(c());
        this.f18284g = K;
        String str4 = K.get(d.a.Domain);
        String str5 = K.get(d.a.Protocol);
        String str6 = K.get(d.a.Application);
        String lowerCase = K.get(d.a.Instance).toLowerCase();
        StringBuilder sb = new StringBuilder();
        int length = str6.length();
        String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str2 = "_" + str6 + ".";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        if (str5.length() > 0) {
            str3 = "_" + str5 + ".";
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str3);
        sb.append(str4);
        sb.append(".");
        String sb2 = sb.toString();
        this.f18280c = sb2;
        StringBuilder sb3 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str7 = lowerCase + ".";
        }
        sb3.append(str7);
        sb3.append(sb2);
        this.a = sb3.toString().toLowerCase();
    }

    public int a(b bVar) {
        byte[] w = w();
        byte[] w2 = bVar.w();
        int min = Math.min(w.length, w2.length);
        for (int i2 = 0; i2 < min; i2++) {
            if (w[i2] > w2[i2]) {
                return 1;
            }
            if (w[i2] < w2[i2]) {
                return -1;
            }
        }
        return w.length - w2.length;
    }

    public String b() {
        String str = this.a;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String c() {
        String str = this.f18279b;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public Map<d.a, String> d() {
        return Collections.unmodifiableMap(this.f18284g);
    }

    public i.a.g.s.d e() {
        i.a.g.s.d dVar = this.f18282e;
        return dVar != null ? dVar : i.a.g.s.d.CLASS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return b().equals(bVar.b()) && f().equals(bVar.f()) && e() == bVar.e();
    }

    public i.a.g.s.e f() {
        i.a.g.s.e eVar = this.f18281d;
        return eVar != null ? eVar : i.a.g.s.e.TYPE_IGNORE;
    }

    public String g() {
        String str = d().get(d.a.Subtype);
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String h() {
        String str = this.f18280c;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public int hashCode() {
        return b().hashCode() + f().d() + e().f();
    }

    public boolean i() {
        if (!this.f18284g.get(d.a.Application).equals("dns-sd")) {
            return false;
        }
        String str = this.f18284g.get(d.a.Instance);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    public abstract boolean j(long j2);

    public boolean k() {
        return q() || r();
    }

    public boolean l(b bVar) {
        return b().equals(bVar.b()) && t(bVar.f()) && s(bVar.e());
    }

    public boolean m(b bVar) {
        return bVar != null && bVar.e() == e();
    }

    public boolean n(b bVar) {
        return bVar != null && bVar.f() == f();
    }

    public boolean o() {
        return this.f18284g.get(d.a.Application).equals("dns-sd") && this.f18284g.get(d.a.Instance).equals("_services");
    }

    public boolean p() {
        return this.f18283f;
    }

    public boolean q() {
        return this.f18284g.get(d.a.Domain).endsWith("in-addr.arpa");
    }

    public boolean r() {
        return this.f18284g.get(d.a.Domain).endsWith("ip6.arpa");
    }

    public boolean s(i.a.g.s.d dVar) {
        i.a.g.s.d dVar2 = i.a.g.s.d.CLASS_ANY;
        return dVar2 == dVar || dVar2 == e() || e().equals(dVar);
    }

    public boolean t(i.a.g.s.e eVar) {
        return f().equals(eVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" type: ");
        sb2.append(f());
        sb.append(sb2.toString());
        sb.append(", class: " + e());
        sb.append(this.f18283f ? "-unique," : ",");
        sb.append(" name: " + this.f18279b);
        x(sb);
        sb.append("]");
        return sb.toString();
    }

    public boolean u(b bVar) {
        return g().equals(bVar.g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(c().getBytes("UTF8"));
        dataOutputStream.writeShort(f().d());
        dataOutputStream.writeShort(e().f());
    }

    protected byte[] w() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            v(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x(StringBuilder sb) {
    }
}
