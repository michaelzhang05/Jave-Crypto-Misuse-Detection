package N1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final d f7508e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f7509f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f7510g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f7511h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f7512i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f7513j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f7514k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f7515l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f7516m;

    /* renamed from: d, reason: collision with root package name */
    private final int f7517d;

    static {
        x xVar = x.REQUIRED;
        f7508e = new d("A128CBC-HS256", xVar, 256);
        x xVar2 = x.OPTIONAL;
        f7509f = new d("A192CBC-HS384", xVar2, 384);
        f7510g = new d("A256CBC-HS512", xVar, 512);
        f7511h = new d("A128CBC+HS256", xVar2, 256);
        f7512i = new d("A256CBC+HS512", xVar2, 512);
        x xVar3 = x.RECOMMENDED;
        f7513j = new d("A128GCM", xVar3, 128);
        f7514k = new d("A192GCM", xVar2, PsExtractor.AUDIO_STREAM);
        f7515l = new d("A256GCM", xVar3, 256);
        f7516m = new d("XC20P", xVar2, 256);
    }

    public d(String str, x xVar, int i8) {
        super(str, xVar);
        this.f7517d = i8;
    }

    public static d d(String str) {
        d dVar = f7508e;
        if (str.equals(dVar.a())) {
            return dVar;
        }
        d dVar2 = f7509f;
        if (str.equals(dVar2.a())) {
            return dVar2;
        }
        d dVar3 = f7510g;
        if (str.equals(dVar3.a())) {
            return dVar3;
        }
        d dVar4 = f7513j;
        if (str.equals(dVar4.a())) {
            return dVar4;
        }
        d dVar5 = f7514k;
        if (str.equals(dVar5.a())) {
            return dVar5;
        }
        d dVar6 = f7515l;
        if (str.equals(dVar6.a())) {
            return dVar6;
        }
        d dVar7 = f7511h;
        if (str.equals(dVar7.a())) {
            return dVar7;
        }
        d dVar8 = f7512i;
        if (str.equals(dVar8.a())) {
            return dVar8;
        }
        d dVar9 = f7516m;
        if (str.equals(dVar9.a())) {
            return dVar9;
        }
        return new d(str);
    }

    public int c() {
        return this.f7517d;
    }

    public d(String str) {
        this(str, null, 0);
    }
}
