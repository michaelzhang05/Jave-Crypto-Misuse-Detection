package R1;

import K1.p;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8627d = new a("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* renamed from: e, reason: collision with root package name */
    public static final a f8628e = new a("secp256k1", "secp256k1", "1.3.132.0.10");

    /* renamed from: f, reason: collision with root package name */
    public static final a f8629f = new a("P-256K", "secp256k1", "1.3.132.0.10");

    /* renamed from: g, reason: collision with root package name */
    public static final a f8630g = new a("P-384", "secp384r1", "1.3.132.0.34");

    /* renamed from: h, reason: collision with root package name */
    public static final a f8631h = new a("P-521", "secp521r1", "1.3.132.0.35");

    /* renamed from: i, reason: collision with root package name */
    public static final a f8632i = new a("Ed25519", "Ed25519", null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f8633j = new a("Ed448", "Ed448", null);

    /* renamed from: k, reason: collision with root package name */
    public static final a f8634k = new a("X25519", "X25519", null);

    /* renamed from: l, reason: collision with root package name */
    public static final a f8635l = new a("X448", "X448", null);

    /* renamed from: a, reason: collision with root package name */
    private final String f8636a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8637b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8638c;

    public a(String str) {
        this(str, null, null);
    }

    public static a a(ECParameterSpec eCParameterSpec) {
        return c.a(eCParameterSpec);
    }

    public static Set b(p pVar) {
        if (p.f5830j.equals(pVar)) {
            return Collections.singleton(f8627d);
        }
        if (p.f5831k.equals(pVar)) {
            return Collections.singleton(f8628e);
        }
        if (p.f5832l.equals(pVar)) {
            return Collections.singleton(f8630g);
        }
        if (p.f5833m.equals(pVar)) {
            return Collections.singleton(f8631h);
        }
        if (p.f5837q.equals(pVar)) {
            return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(f8632i, f8633j)));
        }
        return null;
    }

    public static a e(String str) {
        if (str != null && !str.trim().isEmpty()) {
            a aVar = f8627d;
            if (str.equals(aVar.c())) {
                return aVar;
            }
            a aVar2 = f8629f;
            if (str.equals(aVar2.c())) {
                return aVar2;
            }
            a aVar3 = f8628e;
            if (str.equals(aVar3.c())) {
                return aVar3;
            }
            a aVar4 = f8630g;
            if (str.equals(aVar4.c())) {
                return aVar4;
            }
            a aVar5 = f8631h;
            if (str.equals(aVar5.c())) {
                return aVar5;
            }
            a aVar6 = f8632i;
            if (str.equals(aVar6.c())) {
                return aVar6;
            }
            a aVar7 = f8633j;
            if (str.equals(aVar7.c())) {
                return aVar7;
            }
            a aVar8 = f8634k;
            if (str.equals(aVar8.c())) {
                return aVar8;
            }
            a aVar9 = f8635l;
            if (str.equals(aVar9.c())) {
                return aVar9;
            }
            return new a(str);
        }
        throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
    }

    public String c() {
        return this.f8636a;
    }

    public String d() {
        return this.f8637b;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public ECParameterSpec f() {
        return c.b(this);
    }

    public int hashCode() {
        return Objects.hash(c());
    }

    public String toString() {
        return c();
    }

    public a(String str, String str2, String str3) {
        if (str != null) {
            this.f8636a = str;
            this.f8637b = str2;
            this.f8638c = str3;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }
}
