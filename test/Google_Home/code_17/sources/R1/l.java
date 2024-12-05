package R1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f9600a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9601b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        N1.d dVar = N1.d.f7508e;
        linkedHashSet.add(dVar);
        N1.d dVar2 = N1.d.f7509f;
        linkedHashSet.add(dVar2);
        N1.d dVar3 = N1.d.f7510g;
        linkedHashSet.add(dVar3);
        N1.d dVar4 = N1.d.f7513j;
        linkedHashSet.add(dVar4);
        N1.d dVar5 = N1.d.f7514k;
        linkedHashSet.add(dVar5);
        N1.d dVar6 = N1.d.f7515l;
        linkedHashSet.add(dVar6);
        N1.d dVar7 = N1.d.f7511h;
        linkedHashSet.add(dVar7);
        N1.d dVar8 = N1.d.f7512i;
        linkedHashSet.add(dVar8);
        N1.d dVar9 = N1.d.f7516m;
        linkedHashSet.add(dVar9);
        f9600a = DesugarCollections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(dVar4);
        hashSet2.add(dVar5);
        hashSet3.add(dVar6);
        hashSet3.add(dVar);
        hashSet3.add(dVar7);
        hashSet3.add(dVar9);
        hashSet4.add(dVar2);
        hashSet5.add(dVar3);
        hashSet5.add(dVar8);
        hashMap.put(128, DesugarCollections.unmodifiableSet(hashSet));
        hashMap.put(Integer.valueOf(PsExtractor.AUDIO_STREAM), DesugarCollections.unmodifiableSet(hashSet2));
        hashMap.put(256, DesugarCollections.unmodifiableSet(hashSet3));
        hashMap.put(384, DesugarCollections.unmodifiableSet(hashSet4));
        hashMap.put(512, DesugarCollections.unmodifiableSet(hashSet5));
        f9601b = DesugarCollections.unmodifiableMap(hashMap);
    }

    private static void a(SecretKey secretKey, N1.d dVar) {
        try {
            if (dVar.c() == c2.e.f(secretKey.getEncoded())) {
                return;
            }
            throw new N1.u("The Content Encryption Key (CEK) length for " + dVar + " must be " + dVar.c() + " bits");
        } catch (c2.h e8) {
            throw new N1.u("The Content Encryption Key (CEK) is too long: " + e8.getMessage());
        }
    }

    public static byte[] b(N1.m mVar, c2.c cVar, c2.c cVar2, c2.c cVar3, c2.c cVar4, SecretKey secretKey, T1.c cVar5) {
        byte[] c8;
        a(secretKey, mVar.v());
        byte[] a8 = AbstractC1410a.a(mVar);
        if (!mVar.v().equals(N1.d.f7508e) && !mVar.v().equals(N1.d.f7509f) && !mVar.v().equals(N1.d.f7510g)) {
            if (!mVar.v().equals(N1.d.f7513j) && !mVar.v().equals(N1.d.f7514k) && !mVar.v().equals(N1.d.f7515l)) {
                if (!mVar.v().equals(N1.d.f7511h) && !mVar.v().equals(N1.d.f7512i)) {
                    if (mVar.v().equals(N1.d.f7516m)) {
                        c8 = C.a(secretKey, cVar2.a(), cVar3.a(), a8, cVar4.a());
                    } else {
                        throw new N1.f(e.b(mVar.v(), f9600a));
                    }
                } else {
                    c8 = AbstractC1411b.d(mVar, secretKey, cVar, cVar2, cVar3, cVar4, cVar5.d(), cVar5.f());
                }
            } else {
                c8 = AbstractC1412c.c(secretKey, cVar2.a(), cVar3.a(), a8, cVar4.a(), cVar5.d());
            }
        } else {
            c8 = AbstractC1411b.c(secretKey, cVar2.a(), cVar3.a(), a8, cVar4.a(), cVar5.d(), cVar5.f());
        }
        return n.b(mVar, c8);
    }

    public static N1.j c(N1.m mVar, byte[] bArr, SecretKey secretKey, c2.c cVar, T1.c cVar2) {
        byte[] h8;
        f f8;
        byte[] bArr2;
        a(secretKey, mVar.v());
        byte[] a8 = n.a(mVar, bArr);
        byte[] a9 = AbstractC1410a.a(mVar);
        if (!mVar.v().equals(N1.d.f7508e) && !mVar.v().equals(N1.d.f7509f) && !mVar.v().equals(N1.d.f7510g)) {
            if (!mVar.v().equals(N1.d.f7513j) && !mVar.v().equals(N1.d.f7514k) && !mVar.v().equals(N1.d.f7515l)) {
                if (!mVar.v().equals(N1.d.f7511h) && !mVar.v().equals(N1.d.f7512i)) {
                    if (mVar.v().equals(N1.d.f7516m)) {
                        c2.f fVar = new c2.f(null);
                        f8 = C.b(secretKey, fVar, a8, a9);
                        bArr2 = (byte[]) fVar.a();
                    } else {
                        throw new N1.f(e.b(mVar.v(), f9600a));
                    }
                } else {
                    h8 = AbstractC1411b.h(cVar2.b());
                    f8 = AbstractC1411b.g(mVar, secretKey, cVar, h8, a8, cVar2.d(), cVar2.f());
                }
            } else {
                c2.f fVar2 = new c2.f(AbstractC1412c.e(cVar2.b()));
                f8 = AbstractC1412c.d(secretKey, fVar2, a8, a9, cVar2.d());
                bArr2 = (byte[]) fVar2.a();
            }
            return new N1.j(mVar, cVar, c2.c.e(bArr2), c2.c.e(f8.b()), c2.c.e(f8.a()));
        }
        h8 = AbstractC1411b.h(cVar2.b());
        f8 = AbstractC1411b.f(secretKey, h8, a8, a9, cVar2.d(), cVar2.f());
        bArr2 = h8;
        return new N1.j(mVar, cVar, c2.c.e(bArr2), c2.c.e(f8.b()), c2.c.e(f8.a()));
    }

    public static SecretKey d(N1.d dVar, SecureRandom secureRandom) {
        Set set = f9600a;
        if (set.contains(dVar)) {
            byte[] bArr = new byte[c2.e.c(dVar.c())];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, "AES");
        }
        throw new N1.f(e.b(dVar, set));
    }
}
