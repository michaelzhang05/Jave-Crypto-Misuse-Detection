package I6;

import java.io.IOException;

/* loaded from: classes5.dex */
public enum v {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");


    /* renamed from: a, reason: collision with root package name */
    private final String f4561a;

    v(String str) {
        this.f4561a = str;
    }

    public static v a(String str) {
        v vVar = HTTP_1_0;
        if (str.equals(vVar.f4561a)) {
            return vVar;
        }
        v vVar2 = HTTP_1_1;
        if (str.equals(vVar2.f4561a)) {
            return vVar2;
        }
        v vVar3 = HTTP_2;
        if (str.equals(vVar3.f4561a)) {
            return vVar3;
        }
        v vVar4 = SPDY_3;
        if (str.equals(vVar4.f4561a)) {
            return vVar4;
        }
        v vVar5 = QUIC;
        if (str.equals(vVar5.f4561a)) {
            return vVar5;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f4561a;
    }
}
