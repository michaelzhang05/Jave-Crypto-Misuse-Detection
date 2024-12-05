package X3;

import L5.I;
import L5.s;
import M5.AbstractC1246t;
import R1.b;
import i6.AbstractC2825i;
import i6.M;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: j, reason: collision with root package name */
    public static final a f12251j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final S3.e f12252a;

    /* renamed from: b, reason: collision with root package name */
    private final S3.h f12253b;

    /* renamed from: c, reason: collision with root package name */
    private final S3.m f12254c;

    /* renamed from: d, reason: collision with root package name */
    private final S3.b f12255d;

    /* renamed from: e, reason: collision with root package name */
    private final V3.i f12256e;

    /* renamed from: f, reason: collision with root package name */
    private final p f12257f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12258g;

    /* renamed from: h, reason: collision with root package name */
    private final U3.c f12259h;

    /* renamed from: i, reason: collision with root package name */
    private final P5.g f12260i;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final R1.d a(PublicKey publicKey, String str, R1.h hVar) {
            AbstractC3159y.i(publicKey, "publicKey");
            b.a c8 = new b.a(R1.a.f8627d, (ECPublicKey) publicKey).c(hVar);
            if (str == null || g6.n.u(str)) {
                str = null;
            }
            R1.b C8 = c8.b(str).a().C();
            AbstractC3159y.h(C8, "toPublicJWK(...)");
            return C8;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f12261a;

        /* renamed from: b, reason: collision with root package name */
        int f12262b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f12263c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f12264d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f12265e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PublicKey f12266f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f12267g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f12268h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ PublicKey f12269i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, g gVar, PublicKey publicKey, String str, String str2, PublicKey publicKey2, P5.d dVar) {
            super(2, dVar);
            this.f12264d = qVar;
            this.f12265e = gVar;
            this.f12266f = publicKey;
            this.f12267g = str;
            this.f12268h = str2;
            this.f12269i = publicKey2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f12264d, this.f12265e, this.f12266f, this.f12267g, this.f12268h, this.f12269i, dVar);
            bVar.f12263c = obj;
            return bVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            String str;
            q qVar;
            Object e8 = Q5.b.e();
            int i8 = this.f12262b;
            if (i8 != 0) {
                if (i8 == 1) {
                    q qVar2 = (q) this.f12261a;
                    str = (String) this.f12263c;
                    L5.t.b(obj);
                    qVar = qVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                g gVar = this.f12265e;
                PublicKey publicKey = this.f12269i;
                String str2 = this.f12268h;
                String str3 = this.f12267g;
                try {
                    s.a aVar = L5.s.f6511b;
                    b8 = L5.s.b(gVar.f12256e.a(gVar.g(), publicKey, str2, str3));
                } catch (Throwable th) {
                    s.a aVar2 = L5.s.f6511b;
                    b8 = L5.s.b(L5.t.a(th));
                }
                g gVar2 = this.f12265e;
                String str4 = this.f12268h;
                String str5 = this.f12267g;
                q qVar3 = this.f12264d;
                Throwable e9 = L5.s.e(b8);
                if (e9 != null) {
                    gVar2.f12259h.i(new RuntimeException(g6.n.e("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=" + str4 + "\n                    keyId=" + str5 + "\n                    sdkTransactionId=" + qVar3 + "\n                    "), e9));
                }
                Throwable e10 = L5.s.e(b8);
                if (e10 == null) {
                    str = (String) b8;
                    q qVar4 = this.f12264d;
                    S3.b bVar = this.f12265e.f12255d;
                    this.f12263c = str;
                    this.f12261a = qVar4;
                    this.f12262b = 1;
                    Object a8 = bVar.a(this);
                    if (a8 == e8) {
                        return e8;
                    }
                    qVar = qVar4;
                    obj = a8;
                } else {
                    throw new R3.b(e10);
                }
            }
            String b9 = ((S3.a) obj).b();
            String str6 = this.f12265e.f12258g;
            String o8 = g.f12251j.a(this.f12266f, this.f12267g, this.f12265e.h(this.f12268h)).o();
            AbstractC3159y.h(o8, "toJSONString(...)");
            return new c(str, qVar, b9, str6, o8, this.f12265e.f12257f.a());
        }
    }

    public g(S3.e deviceDataFactory, S3.h deviceParamNotAvailableFactory, S3.m securityChecker, S3.b appInfoRepository, V3.i jweEncrypter, p messageVersionRegistry, String sdkReferenceNumber, U3.c errorReporter, P5.g workContext) {
        AbstractC3159y.i(deviceDataFactory, "deviceDataFactory");
        AbstractC3159y.i(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        AbstractC3159y.i(securityChecker, "securityChecker");
        AbstractC3159y.i(appInfoRepository, "appInfoRepository");
        AbstractC3159y.i(jweEncrypter, "jweEncrypter");
        AbstractC3159y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        this.f12252a = deviceDataFactory;
        this.f12253b = deviceParamNotAvailableFactory;
        this.f12254c = securityChecker;
        this.f12255d = appInfoRepository;
        this.f12256e = jweEncrypter;
        this.f12257f = messageVersionRegistry;
        this.f12258g = sdkReferenceNumber;
        this.f12259h = errorReporter;
        this.f12260i = workContext;
    }

    @Override // X3.d
    public Object a(String str, PublicKey publicKey, String str2, q qVar, PublicKey publicKey2, P5.d dVar) {
        return AbstractC2825i.g(this.f12260i, new b(qVar, this, publicKey2, str2, str, publicKey, null), dVar);
    }

    public final String g() {
        JSONObject put = new JSONObject().put("DV", "1.1").put("DD", new JSONObject(this.f12252a.a())).put("DPNA", new JSONObject(this.f12253b.a()));
        List a8 = this.f12254c.a();
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(a8, 10));
        Iterator it = a8.iterator();
        while (it.hasNext()) {
            arrayList.add(((S3.n) it.next()).getId());
        }
        String jSONObject = put.put("SW", new JSONArray((Collection) arrayList)).toString();
        AbstractC3159y.h(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final R1.h h(String directoryServerId) {
        Object obj;
        AbstractC3159y.i(directoryServerId, "directoryServerId");
        Iterator<E> it = V3.e.b().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((V3.e) obj).c().contains(directoryServerId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        V3.e eVar = (V3.e) obj;
        if (eVar != null) {
            return eVar.d();
        }
        return R1.h.f8690b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(S3.e deviceDataFactory, S3.h deviceParamNotAvailableFactory, S3.m securityChecker, V3.g ephemeralKeyPairGenerator, S3.b appInfoRepository, p messageVersionRegistry, String sdkReferenceNumber, U3.c errorReporter, P5.g workContext) {
        this(deviceDataFactory, deviceParamNotAvailableFactory, securityChecker, appInfoRepository, new V3.b(ephemeralKeyPairGenerator, errorReporter), messageVersionRegistry, sdkReferenceNumber, errorReporter, workContext);
        AbstractC3159y.i(deviceDataFactory, "deviceDataFactory");
        AbstractC3159y.i(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        AbstractC3159y.i(securityChecker, "securityChecker");
        AbstractC3159y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3159y.i(appInfoRepository, "appInfoRepository");
        AbstractC3159y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
    }
}
