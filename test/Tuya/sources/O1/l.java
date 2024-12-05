package O1;

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
    public static final Set f7744a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f7745b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        K1.d dVar = K1.d.f5729e;
        linkedHashSet.add(dVar);
        K1.d dVar2 = K1.d.f5730f;
        linkedHashSet.add(dVar2);
        K1.d dVar3 = K1.d.f5731g;
        linkedHashSet.add(dVar3);
        K1.d dVar4 = K1.d.f5734j;
        linkedHashSet.add(dVar4);
        K1.d dVar5 = K1.d.f5735k;
        linkedHashSet.add(dVar5);
        K1.d dVar6 = K1.d.f5736l;
        linkedHashSet.add(dVar6);
        K1.d dVar7 = K1.d.f5732h;
        linkedHashSet.add(dVar7);
        K1.d dVar8 = K1.d.f5733i;
        linkedHashSet.add(dVar8);
        K1.d dVar9 = K1.d.f5737m;
        linkedHashSet.add(dVar9);
        f7744a = DesugarCollections.unmodifiableSet(linkedHashSet);
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
        f7745b = DesugarCollections.unmodifiableMap(hashMap);
    }

    private static void a(SecretKey secretKey, K1.d dVar) {
        try {
            if (dVar.c() == Z1.e.f(secretKey.getEncoded())) {
                return;
            }
            throw new K1.u("The Content Encryption Key (CEK) length for " + dVar + " must be " + dVar.c() + " bits");
        } catch (Z1.h e8) {
            throw new K1.u("The Content Encryption Key (CEK) is too long: " + e8.getMessage());
        }
    }

    public static byte[] b(K1.m mVar, Z1.c cVar, Z1.c cVar2, Z1.c cVar3, Z1.c cVar4, SecretKey secretKey, Q1.c cVar5) {
        byte[] c8;
        a(secretKey, mVar.v());
        byte[] a8 = AbstractC1272a.a(mVar);
        if (!mVar.v().equals(K1.d.f5729e) && !mVar.v().equals(K1.d.f5730f) && !mVar.v().equals(K1.d.f5731g)) {
            if (!mVar.v().equals(K1.d.f5734j) && !mVar.v().equals(K1.d.f5735k) && !mVar.v().equals(K1.d.f5736l)) {
                if (!mVar.v().equals(K1.d.f5732h) && !mVar.v().equals(K1.d.f5733i)) {
                    if (mVar.v().equals(K1.d.f5737m)) {
                        c8 = C.a(secretKey, cVar2.a(), cVar3.a(), a8, cVar4.a());
                    } else {
                        throw new K1.f(e.b(mVar.v(), f7744a));
                    }
                } else {
                    c8 = AbstractC1273b.d(mVar, secretKey, cVar, cVar2, cVar3, cVar4, cVar5.d(), cVar5.f());
                }
            } else {
                c8 = AbstractC1274c.c(secretKey, cVar2.a(), cVar3.a(), a8, cVar4.a(), cVar5.d());
            }
        } else {
            c8 = AbstractC1273b.c(secretKey, cVar2.a(), cVar3.a(), a8, cVar4.a(), cVar5.d(), cVar5.f());
        }
        return n.b(mVar, c8);
    }

    public static K1.j c(K1.m mVar, byte[] bArr, SecretKey secretKey, Z1.c cVar, Q1.c cVar2) {
        byte[] h8;
        f f8;
        byte[] bArr2;
        a(secretKey, mVar.v());
        byte[] a8 = n.a(mVar, bArr);
        byte[] a9 = AbstractC1272a.a(mVar);
        if (!mVar.v().equals(K1.d.f5729e) && !mVar.v().equals(K1.d.f5730f) && !mVar.v().equals(K1.d.f5731g)) {
            if (!mVar.v().equals(K1.d.f5734j) && !mVar.v().equals(K1.d.f5735k) && !mVar.v().equals(K1.d.f5736l)) {
                if (!mVar.v().equals(K1.d.f5732h) && !mVar.v().equals(K1.d.f5733i)) {
                    if (mVar.v().equals(K1.d.f5737m)) {
                        Z1.f fVar = new Z1.f(null);
                        f8 = C.b(secretKey, fVar, a8, a9);
                        bArr2 = (byte[]) fVar.a();
                    } else {
                        throw new K1.f(e.b(mVar.v(), f7744a));
                    }
                } else {
                    h8 = AbstractC1273b.h(cVar2.b());
                    f8 = AbstractC1273b.g(mVar, secretKey, cVar, h8, a8, cVar2.d(), cVar2.f());
                }
            } else {
                Z1.f fVar2 = new Z1.f(AbstractC1274c.e(cVar2.b()));
                f8 = AbstractC1274c.d(secretKey, fVar2, a8, a9, cVar2.d());
                bArr2 = (byte[]) fVar2.a();
            }
            return new K1.j(mVar, cVar, Z1.c.e(bArr2), Z1.c.e(f8.b()), Z1.c.e(f8.a()));
        }
        h8 = AbstractC1273b.h(cVar2.b());
        f8 = AbstractC1273b.f(secretKey, h8, a8, a9, cVar2.d(), cVar2.f());
        bArr2 = h8;
        return new K1.j(mVar, cVar, Z1.c.e(bArr2), Z1.c.e(f8.b()), Z1.c.e(f8.a()));
    }

    public static SecretKey d(K1.d dVar, SecureRandom secureRandom) {
        Set set = f7744a;
        if (set.contains(dVar)) {
            byte[] bArr = new byte[Z1.e.c(dVar.c())];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, "AES");
        }
        throw new K1.f(e.b(dVar, set));
    }
}
