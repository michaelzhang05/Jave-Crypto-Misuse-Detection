package N1;

import java.io.Serializable;
import java.text.ParseException;

/* loaded from: classes4.dex */
public abstract class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private w f7525a = null;

    /* renamed from: b, reason: collision with root package name */
    private c2.c[] f7526b = null;

    public static c2.c[] e(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(".");
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = trim.indexOf(".", i8);
            if (indexOf2 != -1) {
                int i9 = indexOf2 + 1;
                int indexOf3 = trim.indexOf(".", i9);
                if (indexOf3 == -1) {
                    return new c2.c[]{new c2.c(trim.substring(0, indexOf)), new c2.c(trim.substring(i8, indexOf2)), new c2.c(trim.substring(i9))};
                }
                int i10 = indexOf3 + 1;
                int indexOf4 = trim.indexOf(".", i10);
                if (indexOf4 != -1) {
                    if (indexOf4 != -1 && trim.indexOf(".", indexOf4 + 1) != -1) {
                        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
                    }
                    return new c2.c[]{new c2.c(trim.substring(0, indexOf)), new c2.c(trim.substring(i8, indexOf2)), new c2.c(trim.substring(i9, indexOf3)), new c2.c(trim.substring(i10, indexOf4)), new c2.c(trim.substring(indexOf4 + 1))};
                }
                throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
            }
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
    }

    public String a() {
        if (this.f7526b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (c2.c cVar : this.f7526b) {
            if (sb.length() > 0) {
                sb.append('.');
            }
            if (cVar != null) {
                sb.append(cVar);
            }
        }
        return sb.toString();
    }

    public w b() {
        return this.f7525a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(c2.c... cVarArr) {
        this.f7526b = cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(w wVar) {
        this.f7525a = wVar;
    }
}