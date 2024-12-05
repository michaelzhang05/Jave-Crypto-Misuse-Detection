package U1;

import N1.p;
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
    public static final a f10253d = new a("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* renamed from: e, reason: collision with root package name */
    public static final a f10254e = new a("secp256k1", "secp256k1", "1.3.132.0.10");

    /* renamed from: f, reason: collision with root package name */
    public static final a f10255f = new a("P-256K", "secp256k1", "1.3.132.0.10");

    /* renamed from: g, reason: collision with root package name */
    public static final a f10256g = new a("P-384", "secp384r1", "1.3.132.0.34");

    /* renamed from: h, reason: collision with root package name */
    public static final a f10257h = new a("P-521", "secp521r1", "1.3.132.0.35");

    /* renamed from: i, reason: collision with root package name */
    public static final a f10258i = new a("Ed25519", "Ed25519", null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f10259j = new a("Ed448", "Ed448", null);

    /* renamed from: k, reason: collision with root package name */
    public static final a f10260k = new a("X25519", "X25519", null);

    /* renamed from: l, reason: collision with root package name */
    public static final a f10261l = new a("X448", "X448", null);

    /* renamed from: a, reason: collision with root package name */
    private final String f10262a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10263b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10264c;

    public a(String str) {
        this(str, null, null);
    }

    public static a a(ECParameterSpec eCParameterSpec) {
        return c.a(eCParameterSpec);
    }

    public static Set b(p pVar) {
        if (p.f7609j.equals(pVar)) {
            return Collections.singleton(f10253d);
        }
        if (p.f7610k.equals(pVar)) {
            return Collections.singleton(f10254e);
        }
        if (p.f7611l.equals(pVar)) {
            return Collections.singleton(f10256g);
        }
        if (p.f7612m.equals(pVar)) {
            return Collections.singleton(f10257h);
        }
        if (p.f7616q.equals(pVar)) {
            return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(f10258i, f10259j)));
        }
        return null;
    }

    public static a e(String str) {
        if (str != null && !str.trim().isEmpty()) {
            a aVar = f10253d;
            if (str.equals(aVar.c())) {
                return aVar;
            }
            a aVar2 = f10255f;
            if (str.equals(aVar2.c())) {
                return aVar2;
            }
            a aVar3 = f10254e;
            if (str.equals(aVar3.c())) {
                return aVar3;
            }
            a aVar4 = f10256g;
            if (str.equals(aVar4.c())) {
                return aVar4;
            }
            a aVar5 = f10257h;
            if (str.equals(aVar5.c())) {
                return aVar5;
            }
            a aVar6 = f10258i;
            if (str.equals(aVar6.c())) {
                return aVar6;
            }
            a aVar7 = f10259j;
            if (str.equals(aVar7.c())) {
                return aVar7;
            }
            a aVar8 = f10260k;
            if (str.equals(aVar8.c())) {
                return aVar8;
            }
            a aVar9 = f10261l;
            if (str.equals(aVar9.c())) {
                return aVar9;
            }
            return new a(str);
        }
        throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
    }

    public String c() {
        return this.f10262a;
    }

    public String d() {
        return this.f10263b;
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
            this.f10262a = str;
            this.f10263b = str2;
            this.f10264c = str3;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }
}
