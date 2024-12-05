package K1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final d f5729e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f5730f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f5731g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f5732h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f5733i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f5734j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f5735k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f5736l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f5737m;

    /* renamed from: d, reason: collision with root package name */
    private final int f5738d;

    static {
        x xVar = x.REQUIRED;
        f5729e = new d("A128CBC-HS256", xVar, 256);
        x xVar2 = x.OPTIONAL;
        f5730f = new d("A192CBC-HS384", xVar2, 384);
        f5731g = new d("A256CBC-HS512", xVar, 512);
        f5732h = new d("A128CBC+HS256", xVar2, 256);
        f5733i = new d("A256CBC+HS512", xVar2, 512);
        x xVar3 = x.RECOMMENDED;
        f5734j = new d("A128GCM", xVar3, 128);
        f5735k = new d("A192GCM", xVar2, PsExtractor.AUDIO_STREAM);
        f5736l = new d("A256GCM", xVar3, 256);
        f5737m = new d("XC20P", xVar2, 256);
    }

    public d(String str, x xVar, int i8) {
        super(str, xVar);
        this.f5738d = i8;
    }

    public static d d(String str) {
        d dVar = f5729e;
        if (str.equals(dVar.a())) {
            return dVar;
        }
        d dVar2 = f5730f;
        if (str.equals(dVar2.a())) {
            return dVar2;
        }
        d dVar3 = f5731g;
        if (str.equals(dVar3.a())) {
            return dVar3;
        }
        d dVar4 = f5734j;
        if (str.equals(dVar4.a())) {
            return dVar4;
        }
        d dVar5 = f5735k;
        if (str.equals(dVar5.a())) {
            return dVar5;
        }
        d dVar6 = f5736l;
        if (str.equals(dVar6.a())) {
            return dVar6;
        }
        d dVar7 = f5732h;
        if (str.equals(dVar7.a())) {
            return dVar7;
        }
        d dVar8 = f5733i;
        if (str.equals(dVar8.a())) {
            return dVar8;
        }
        d dVar9 = f5737m;
        if (str.equals(dVar9.a())) {
            return dVar9;
        }
        return new d(str);
    }

    public int c() {
        return this.f5738d;
    }

    public d(String str) {
        this(str, null, 0);
    }
}
