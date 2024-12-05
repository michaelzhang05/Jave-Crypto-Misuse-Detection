package R1;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j$.util.Objects;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class l extends d {

    /* renamed from: l, reason: collision with root package name */
    private final Z1.c f8701l;

    /* renamed from: m, reason: collision with root package name */
    private final Z1.c f8702m;

    /* renamed from: n, reason: collision with root package name */
    private final Z1.c f8703n;

    /* renamed from: o, reason: collision with root package name */
    private final Z1.c f8704o;

    /* renamed from: p, reason: collision with root package name */
    private final Z1.c f8705p;

    /* renamed from: q, reason: collision with root package name */
    private final Z1.c f8706q;

    /* renamed from: r, reason: collision with root package name */
    private final Z1.c f8707r;

    /* renamed from: s, reason: collision with root package name */
    private final Z1.c f8708s;

    /* renamed from: t, reason: collision with root package name */
    private final List f8709t;

    /* renamed from: u, reason: collision with root package name */
    private final PrivateKey f8710u;

    /* loaded from: classes4.dex */
    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Z1.c f8711a;

        /* renamed from: b, reason: collision with root package name */
        private final Z1.c f8712b;

        /* renamed from: c, reason: collision with root package name */
        private final Z1.c f8713c;

        public a(Z1.c cVar, Z1.c cVar2, Z1.c cVar3) {
            if (cVar != null) {
                this.f8711a = cVar;
                if (cVar2 != null) {
                    this.f8712b = cVar2;
                    if (cVar3 != null) {
                        this.f8713c = cVar3;
                        return;
                    }
                    throw new IllegalArgumentException("The factor CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            throw new IllegalArgumentException("The prime factor must not be null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(Z1.c r17, Z1.c r18, Z1.c r19, Z1.c r20, Z1.c r21, Z1.c r22, Z1.c r23, Z1.c r24, java.util.List r25, java.security.PrivateKey r26, R1.h r27, java.util.Set r28, K1.a r29, java.lang.String r30, java.net.URI r31, Z1.c r32, Z1.c r33, java.util.List r34, java.security.KeyStore r35) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.l.<init>(Z1.c, Z1.c, Z1.c, Z1.c, Z1.c, Z1.c, Z1.c, Z1.c, java.util.List, java.security.PrivateKey, R1.h, java.util.Set, K1.a, java.lang.String, java.net.URI, Z1.c, Z1.c, java.util.List, java.security.KeyStore):void");
    }

    public static l q(Map map) {
        ArrayList arrayList;
        List e8;
        if (g.f8685d.equals(e.d(map))) {
            Z1.c a8 = Z1.k.a(map, "n");
            Z1.c a9 = Z1.k.a(map, "e");
            Z1.c a10 = Z1.k.a(map, "d");
            Z1.c a11 = Z1.k.a(map, TtmlNode.TAG_P);
            Z1.c a12 = Z1.k.a(map, CampaignEx.JSON_KEY_AD_Q);
            Z1.c a13 = Z1.k.a(map, "dp");
            Z1.c a14 = Z1.k.a(map, "dq");
            Z1.c a15 = Z1.k.a(map, "qi");
            if (map.containsKey("oth") && (e8 = Z1.k.e(map, "oth")) != null) {
                arrayList = new ArrayList(e8.size());
                for (Object obj : e8) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        try {
                            arrayList.add(new a(Z1.k.a(map2, CampaignEx.JSON_KEY_AD_R), Z1.k.a(map2, "dq"), Z1.k.a(map2, "t")));
                        } catch (IllegalArgumentException e9) {
                            throw new ParseException(e9.getMessage(), 0);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            try {
                return new l(a8, a9, a10, a11, a12, a13, a14, a15, arrayList, null, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be RSA", 0);
    }

    @Override // R1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        if (Objects.equals(this.f8701l, lVar.f8701l) && Objects.equals(this.f8702m, lVar.f8702m) && Objects.equals(this.f8703n, lVar.f8703n) && Objects.equals(this.f8704o, lVar.f8704o) && Objects.equals(this.f8705p, lVar.f8705p) && Objects.equals(this.f8706q, lVar.f8706q) && Objects.equals(this.f8707r, lVar.f8707r) && Objects.equals(this.f8708s, lVar.f8708s) && Objects.equals(this.f8709t, lVar.f8709t) && Objects.equals(this.f8710u, lVar.f8710u)) {
            return true;
        }
        return false;
    }

    @Override // R1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f8701l, this.f8702m, this.f8703n, this.f8704o, this.f8705p, this.f8706q, this.f8707r, this.f8708s, this.f8709t, this.f8710u);
    }

    @Override // R1.d
    public boolean l() {
        if (this.f8703n == null && this.f8704o == null && this.f8710u == null) {
            return false;
        }
        return true;
    }

    @Override // R1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("n", this.f8701l.toString());
        n8.put("e", this.f8702m.toString());
        Z1.c cVar = this.f8703n;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        Z1.c cVar2 = this.f8704o;
        if (cVar2 != null) {
            n8.put(TtmlNode.TAG_P, cVar2.toString());
        }
        Z1.c cVar3 = this.f8705p;
        if (cVar3 != null) {
            n8.put(CampaignEx.JSON_KEY_AD_Q, cVar3.toString());
        }
        Z1.c cVar4 = this.f8706q;
        if (cVar4 != null) {
            n8.put("dp", cVar4.toString());
        }
        Z1.c cVar5 = this.f8707r;
        if (cVar5 != null) {
            n8.put("dq", cVar5.toString());
        }
        Z1.c cVar6 = this.f8708s;
        if (cVar6 != null) {
            n8.put("qi", cVar6.toString());
        }
        List list = this.f8709t;
        if (list != null && !list.isEmpty()) {
            List a8 = Z1.j.a();
            for (a aVar : this.f8709t) {
                Map l8 = Z1.k.l();
                l8.put(CampaignEx.JSON_KEY_AD_R, aVar.f8711a.toString());
                l8.put("d", aVar.f8712b.toString());
                l8.put("t", aVar.f8713c.toString());
                a8.add(l8);
            }
            n8.put("oth", a8);
        }
        return n8;
    }

    public boolean p(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((X509Certificate) f().get(0)).getPublicKey();
            if (!this.f8702m.b().equals(rSAPublicKey.getPublicExponent())) {
                return false;
            }
            return this.f8701l.b().equals(rSAPublicKey.getModulus());
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
