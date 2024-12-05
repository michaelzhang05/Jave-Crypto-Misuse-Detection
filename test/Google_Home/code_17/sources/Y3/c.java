package Y3;

import N1.m;
import N1.w;
import O5.s;
import O5.t;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f13537d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final N1.d f13538e = N1.d.f7508e;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13539a;

    /* renamed from: b, reason: collision with root package name */
    private byte f13540b;

    /* renamed from: c, reason: collision with root package name */
    private byte f13541c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public c(boolean z8, byte b8, byte b9) {
        this.f13539a = z8;
        this.f13540b = b8;
        this.f13541c = b9;
    }

    @Override // Y3.k
    public JSONObject J(String message, SecretKey secretKey) {
        AbstractC3255y.i(message, "message");
        AbstractC3255y.i(secretKey, "secretKey");
        JSONObject b8 = b(message, secretKey);
        e(b8);
        byte b9 = (byte) (this.f13541c + 1);
        this.f13541c = b9;
        if (b9 != 0) {
            return b8;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero".toString());
    }

    @Override // Y3.k
    public String U(JSONObject challengeRequest, SecretKey secretKey) {
        AbstractC3255y.i(challengeRequest, "challengeRequest");
        AbstractC3255y.i(secretKey, "secretKey");
        String string = challengeRequest.getString("acsTransID");
        AbstractC3255y.h(string, "getString(...)");
        N1.m a8 = a(string);
        Y y8 = Y.f34167a;
        String format = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.f13540b)}, 1));
        AbstractC3255y.h(format, "format(locale, format, *args)");
        challengeRequest.put("sdkCounterStoA", format);
        N1.n nVar = new N1.n(a8, new w(challengeRequest.toString()));
        N1.d v8 = a8.v();
        AbstractC3255y.h(v8, "getEncryptionMethod(...)");
        nVar.g(new o(d(secretKey, v8), this.f13540b));
        byte b8 = (byte) (this.f13540b + 1);
        this.f13540b = b8;
        if (b8 != 0) {
            String t8 = nVar.t();
            AbstractC3255y.h(t8, "serialize(...)");
            return t8;
        }
        throw new IllegalArgumentException("SDK to ACS counter is zero".toString());
    }

    public final N1.m a(String keyId) {
        AbstractC3255y.i(keyId, "keyId");
        N1.m d8 = new m.a(N1.i.f7539l, f13538e).m(keyId).d();
        AbstractC3255y.h(d8, "build(...)");
        return d8;
    }

    public final JSONObject b(String message, SecretKey secretKey) {
        AbstractC3255y.i(message, "message");
        AbstractC3255y.i(secretKey, "secretKey");
        N1.n s8 = N1.n.s(message);
        N1.d v8 = s8.q().v();
        AbstractC3255y.h(v8, "getEncryptionMethod(...)");
        s8.f(new O1.a(c(secretKey, v8)));
        return new JSONObject(s8.b().toString());
    }

    public final byte[] c(SecretKey secretKey, N1.d encryptionMethod) {
        AbstractC3255y.i(secretKey, "secretKey");
        AbstractC3255y.i(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        N1.d dVar = N1.d.f7513j;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, encoded.length - (dVar.c() / 8), encoded.length);
            AbstractC3255y.f(copyOfRange);
            return copyOfRange;
        }
        AbstractC3255y.f(encoded);
        return encoded;
    }

    public final byte[] d(SecretKey secretKey, N1.d encryptionMethod) {
        AbstractC3255y.i(secretKey, "secretKey");
        AbstractC3255y.i(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        N1.d dVar = N1.d.f7513j;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, dVar.c() / 8);
            AbstractC3255y.f(copyOfRange);
            return copyOfRange;
        }
        AbstractC3255y.f(encoded);
        return encoded;
    }

    public final void e(JSONObject cres) {
        Object b8;
        AbstractC3255y.i(cres, "cres");
        if (!this.f13539a) {
            return;
        }
        if (cres.has("acsCounterAtoS")) {
            try {
                s.a aVar = s.f8302b;
                String string = cres.getString("acsCounterAtoS");
                AbstractC3255y.h(string, "getString(...)");
                b8 = s.b(Byte.valueOf(Byte.parseByte(string)));
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            if (s.e(b8) == null) {
                byte byteValue = ((Number) b8).byteValue();
                if (this.f13541c == byteValue) {
                    return;
                }
                throw new b4.c(b4.f.f15452i, "Counters are not equal. SDK counter: " + ((int) this.f13541c) + ", ACS counter: " + ((int) byteValue));
            }
            throw b4.c.f15417d.a("acsCounterAtoS");
        }
        throw b4.c.f15417d.b("acsCounterAtoS");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13539a == cVar.f13539a && this.f13540b == cVar.f13540b && this.f13541c == cVar.f13541c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z8 = this.f13539a;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return (((r02 * 31) + this.f13540b) * 31) + this.f13541c;
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.f13539a + ", counterSdkToAcs=" + ((int) this.f13540b) + ", counterAcsToSdk=" + ((int) this.f13541c) + ")";
    }

    public c(boolean z8) {
        this(z8, (byte) 0, (byte) 0);
    }
}
