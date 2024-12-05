package U1;

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
    private final c2.c f10327l;

    /* renamed from: m, reason: collision with root package name */
    private final c2.c f10328m;

    /* renamed from: n, reason: collision with root package name */
    private final c2.c f10329n;

    /* renamed from: o, reason: collision with root package name */
    private final c2.c f10330o;

    /* renamed from: p, reason: collision with root package name */
    private final c2.c f10331p;

    /* renamed from: q, reason: collision with root package name */
    private final c2.c f10332q;

    /* renamed from: r, reason: collision with root package name */
    private final c2.c f10333r;

    /* renamed from: s, reason: collision with root package name */
    private final c2.c f10334s;

    /* renamed from: t, reason: collision with root package name */
    private final List f10335t;

    /* renamed from: u, reason: collision with root package name */
    private final PrivateKey f10336u;

    /* loaded from: classes4.dex */
    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final c2.c f10337a;

        /* renamed from: b, reason: collision with root package name */
        private final c2.c f10338b;

        /* renamed from: c, reason: collision with root package name */
        private final c2.c f10339c;

        public a(c2.c cVar, c2.c cVar2, c2.c cVar3) {
            if (cVar != null) {
                this.f10337a = cVar;
                if (cVar2 != null) {
                    this.f10338b = cVar2;
                    if (cVar3 != null) {
                        this.f10339c = cVar3;
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
    public l(c2.c r17, c2.c r18, c2.c r19, c2.c r20, c2.c r21, c2.c r22, c2.c r23, c2.c r24, java.util.List r25, java.security.PrivateKey r26, U1.h r27, java.util.Set r28, N1.a r29, java.lang.String r30, java.net.URI r31, c2.c r32, c2.c r33, java.util.List r34, java.security.KeyStore r35) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.l.<init>(c2.c, c2.c, c2.c, c2.c, c2.c, c2.c, c2.c, c2.c, java.util.List, java.security.PrivateKey, U1.h, java.util.Set, N1.a, java.lang.String, java.net.URI, c2.c, c2.c, java.util.List, java.security.KeyStore):void");
    }

    public static l r(Map map) {
        ArrayList arrayList;
        List e8;
        if (g.f10311d.equals(e.d(map))) {
            c2.c a8 = c2.k.a(map, "n");
            c2.c a9 = c2.k.a(map, "e");
            c2.c a10 = c2.k.a(map, "d");
            c2.c a11 = c2.k.a(map, TtmlNode.TAG_P);
            c2.c a12 = c2.k.a(map, CampaignEx.JSON_KEY_AD_Q);
            c2.c a13 = c2.k.a(map, "dp");
            c2.c a14 = c2.k.a(map, "dq");
            c2.c a15 = c2.k.a(map, "qi");
            if (map.containsKey("oth") && (e8 = c2.k.e(map, "oth")) != null) {
                arrayList = new ArrayList(e8.size());
                for (Object obj : e8) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        try {
                            arrayList.add(new a(c2.k.a(map2, CampaignEx.JSON_KEY_AD_R), c2.k.a(map2, "dq"), c2.k.a(map2, "t")));
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

    @Override // U1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        if (Objects.equals(this.f10327l, lVar.f10327l) && Objects.equals(this.f10328m, lVar.f10328m) && Objects.equals(this.f10329n, lVar.f10329n) && Objects.equals(this.f10330o, lVar.f10330o) && Objects.equals(this.f10331p, lVar.f10331p) && Objects.equals(this.f10332q, lVar.f10332q) && Objects.equals(this.f10333r, lVar.f10333r) && Objects.equals(this.f10334s, lVar.f10334s) && Objects.equals(this.f10335t, lVar.f10335t) && Objects.equals(this.f10336u, lVar.f10336u)) {
            return true;
        }
        return false;
    }

    @Override // U1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f10327l, this.f10328m, this.f10329n, this.f10330o, this.f10331p, this.f10332q, this.f10333r, this.f10334s, this.f10335t, this.f10336u);
    }

    @Override // U1.d
    public boolean k() {
        if (this.f10329n == null && this.f10330o == null && this.f10336u == null) {
            return false;
        }
        return true;
    }

    @Override // U1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("n", this.f10327l.toString());
        n8.put("e", this.f10328m.toString());
        c2.c cVar = this.f10329n;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        c2.c cVar2 = this.f10330o;
        if (cVar2 != null) {
            n8.put(TtmlNode.TAG_P, cVar2.toString());
        }
        c2.c cVar3 = this.f10331p;
        if (cVar3 != null) {
            n8.put(CampaignEx.JSON_KEY_AD_Q, cVar3.toString());
        }
        c2.c cVar4 = this.f10332q;
        if (cVar4 != null) {
            n8.put("dp", cVar4.toString());
        }
        c2.c cVar5 = this.f10333r;
        if (cVar5 != null) {
            n8.put("dq", cVar5.toString());
        }
        c2.c cVar6 = this.f10334s;
        if (cVar6 != null) {
            n8.put("qi", cVar6.toString());
        }
        List list = this.f10335t;
        if (list != null && !list.isEmpty()) {
            List a8 = c2.j.a();
            for (a aVar : this.f10335t) {
                Map l8 = c2.k.l();
                l8.put(CampaignEx.JSON_KEY_AD_R, aVar.f10337a.toString());
                l8.put("d", aVar.f10338b.toString());
                l8.put("t", aVar.f10339c.toString());
                a8.add(l8);
            }
            n8.put("oth", a8);
        }
        return n8;
    }

    public boolean q(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((X509Certificate) f().get(0)).getPublicKey();
            if (!this.f10328m.b().equals(rSAPublicKey.getPublicExponent())) {
                return false;
            }
            return this.f10327l.b().equals(rSAPublicKey.getModulus());
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
