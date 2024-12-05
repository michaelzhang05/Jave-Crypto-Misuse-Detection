package N1;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final a f7643a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7644b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7645c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f7646d;

    /* renamed from: e, reason: collision with root package name */
    private final c2.c f7647e;

    /* renamed from: f, reason: collision with root package name */
    private final r f7648f;

    /* loaded from: classes4.dex */
    public enum a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public w(String str) {
        if (str != null) {
            this.f7644b = null;
            this.f7645c = str;
            this.f7646d = null;
            this.f7647e = null;
            this.f7648f = null;
            this.f7643a = a.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, c2.m.f15571a);
        }
        return null;
    }

    private static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(c2.m.f15571a);
        }
        return null;
    }

    public c2.c c() {
        c2.c cVar = this.f7647e;
        if (cVar != null) {
            return cVar;
        }
        return c2.c.e(d());
    }

    public byte[] d() {
        byte[] bArr = this.f7646d;
        if (bArr != null) {
            return bArr;
        }
        c2.c cVar = this.f7647e;
        if (cVar != null) {
            return cVar.a();
        }
        return b(toString());
    }

    public String toString() {
        String str = this.f7645c;
        if (str != null) {
            return str;
        }
        r rVar = this.f7648f;
        if (rVar != null) {
            if (rVar.a() != null) {
                return this.f7648f.a();
            }
            return this.f7648f.m();
        }
        Map map = this.f7644b;
        if (map != null) {
            return c2.k.o(map);
        }
        byte[] bArr = this.f7646d;
        if (bArr != null) {
            return a(bArr);
        }
        c2.c cVar = this.f7647e;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public w(byte[] bArr) {
        if (bArr != null) {
            this.f7644b = null;
            this.f7645c = null;
            this.f7646d = bArr;
            this.f7647e = null;
            this.f7648f = null;
            this.f7643a = a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public w(c2.c cVar) {
        if (cVar != null) {
            this.f7644b = null;
            this.f7645c = null;
            this.f7646d = null;
            this.f7647e = cVar;
            this.f7648f = null;
            this.f7643a = a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}
