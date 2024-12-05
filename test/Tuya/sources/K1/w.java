package K1;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final a f5864a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5865b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5866c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f5867d;

    /* renamed from: e, reason: collision with root package name */
    private final Z1.c f5868e;

    /* renamed from: f, reason: collision with root package name */
    private final r f5869f;

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
            this.f5865b = null;
            this.f5866c = str;
            this.f5867d = null;
            this.f5868e = null;
            this.f5869f = null;
            this.f5864a = a.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, Z1.m.f13247a);
        }
        return null;
    }

    private static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(Z1.m.f13247a);
        }
        return null;
    }

    public Z1.c c() {
        Z1.c cVar = this.f5868e;
        if (cVar != null) {
            return cVar;
        }
        return Z1.c.e(d());
    }

    public byte[] d() {
        byte[] bArr = this.f5867d;
        if (bArr != null) {
            return bArr;
        }
        Z1.c cVar = this.f5868e;
        if (cVar != null) {
            return cVar.a();
        }
        return b(toString());
    }

    public String toString() {
        String str = this.f5866c;
        if (str != null) {
            return str;
        }
        r rVar = this.f5869f;
        if (rVar != null) {
            if (rVar.a() != null) {
                return this.f5869f.a();
            }
            return this.f5869f.m();
        }
        Map map = this.f5865b;
        if (map != null) {
            return Z1.k.o(map);
        }
        byte[] bArr = this.f5867d;
        if (bArr != null) {
            return a(bArr);
        }
        Z1.c cVar = this.f5868e;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public w(byte[] bArr) {
        if (bArr != null) {
            this.f5865b = null;
            this.f5866c = null;
            this.f5867d = bArr;
            this.f5868e = null;
            this.f5869f = null;
            this.f5864a = a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public w(Z1.c cVar) {
        if (cVar != null) {
            this.f5865b = null;
            this.f5866c = null;
            this.f5867d = null;
            this.f5868e = cVar;
            this.f5869f = null;
            this.f5864a = a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}
