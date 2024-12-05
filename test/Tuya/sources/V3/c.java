package V3;

import K1.m;
import K1.w;
import L5.s;
import L5.t;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11899d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final K1.d f11900e = K1.d.f5729e;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11901a;

    /* renamed from: b, reason: collision with root package name */
    private byte f11902b;

    /* renamed from: c, reason: collision with root package name */
    private byte f11903c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public c(boolean z8, byte b8, byte b9) {
        this.f11901a = z8;
        this.f11902b = b8;
        this.f11903c = b9;
    }

    @Override // V3.k
    public JSONObject G(String message, SecretKey secretKey) {
        AbstractC3159y.i(message, "message");
        AbstractC3159y.i(secretKey, "secretKey");
        JSONObject b8 = b(message, secretKey);
        e(b8);
        byte b9 = (byte) (this.f11903c + 1);
        this.f11903c = b9;
        if (b9 != 0) {
            return b8;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero".toString());
    }

    @Override // V3.k
    public String V(JSONObject challengeRequest, SecretKey secretKey) {
        AbstractC3159y.i(challengeRequest, "challengeRequest");
        AbstractC3159y.i(secretKey, "secretKey");
        String string = challengeRequest.getString("acsTransID");
        AbstractC3159y.h(string, "getString(...)");
        K1.m a8 = a(string);
        Y y8 = Y.f33766a;
        String format = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.f11902b)}, 1));
        AbstractC3159y.h(format, "format(locale, format, *args)");
        challengeRequest.put("sdkCounterStoA", format);
        K1.n nVar = new K1.n(a8, new w(challengeRequest.toString()));
        K1.d v8 = a8.v();
        AbstractC3159y.h(v8, "getEncryptionMethod(...)");
        nVar.g(new o(d(secretKey, v8), this.f11902b));
        byte b8 = (byte) (this.f11902b + 1);
        this.f11902b = b8;
        if (b8 != 0) {
            String t8 = nVar.t();
            AbstractC3159y.h(t8, "serialize(...)");
            return t8;
        }
        throw new IllegalArgumentException("SDK to ACS counter is zero".toString());
    }

    public final K1.m a(String keyId) {
        AbstractC3159y.i(keyId, "keyId");
        K1.m d8 = new m.a(K1.i.f5760l, f11900e).m(keyId).d();
        AbstractC3159y.h(d8, "build(...)");
        return d8;
    }

    public final JSONObject b(String message, SecretKey secretKey) {
        AbstractC3159y.i(message, "message");
        AbstractC3159y.i(secretKey, "secretKey");
        K1.n r8 = K1.n.r(message);
        K1.d v8 = r8.p().v();
        AbstractC3159y.h(v8, "getEncryptionMethod(...)");
        r8.f(new L1.a(c(secretKey, v8)));
        return new JSONObject(r8.b().toString());
    }

    public final byte[] c(SecretKey secretKey, K1.d encryptionMethod) {
        AbstractC3159y.i(secretKey, "secretKey");
        AbstractC3159y.i(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        K1.d dVar = K1.d.f5734j;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, encoded.length - (dVar.c() / 8), encoded.length);
            AbstractC3159y.f(copyOfRange);
            return copyOfRange;
        }
        AbstractC3159y.f(encoded);
        return encoded;
    }

    public final byte[] d(SecretKey secretKey, K1.d encryptionMethod) {
        AbstractC3159y.i(secretKey, "secretKey");
        AbstractC3159y.i(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        K1.d dVar = K1.d.f5734j;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, dVar.c() / 8);
            AbstractC3159y.f(copyOfRange);
            return copyOfRange;
        }
        AbstractC3159y.f(encoded);
        return encoded;
    }

    public final void e(JSONObject cres) {
        Object b8;
        AbstractC3159y.i(cres, "cres");
        if (!this.f11901a) {
            return;
        }
        if (cres.has("acsCounterAtoS")) {
            try {
                s.a aVar = s.f6511b;
                String string = cres.getString("acsCounterAtoS");
                AbstractC3159y.h(string, "getString(...)");
                b8 = s.b(Byte.valueOf(Byte.parseByte(string)));
            } catch (Throwable th) {
                s.a aVar2 = s.f6511b;
                b8 = s.b(t.a(th));
            }
            if (s.e(b8) == null) {
                byte byteValue = ((Number) b8).byteValue();
                if (this.f11903c == byteValue) {
                    return;
                }
                throw new Y3.c(Y3.f.f13167i, "Counters are not equal. SDK counter: " + ((int) this.f11903c) + ", ACS counter: " + ((int) byteValue));
            }
            throw Y3.c.f13132d.a("acsCounterAtoS");
        }
        throw Y3.c.f13132d.b("acsCounterAtoS");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11901a == cVar.f11901a && this.f11902b == cVar.f11902b && this.f11903c == cVar.f11903c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z8 = this.f11901a;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return (((r02 * 31) + this.f11902b) * 31) + this.f11903c;
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.f11901a + ", counterSdkToAcs=" + ((int) this.f11902b) + ", counterAcsToSdk=" + ((int) this.f11903c) + ")";
    }

    public c(boolean z8) {
        this(z8, (byte) 0, (byte) 0);
    }
}
