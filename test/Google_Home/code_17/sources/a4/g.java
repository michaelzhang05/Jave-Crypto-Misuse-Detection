package a4;

import O5.I;
import O5.s;
import P5.AbstractC1378t;
import U1.b;
import a6.InterfaceC1668n;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: j, reason: collision with root package name */
    public static final a f13872j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final V3.e f13873a;

    /* renamed from: b, reason: collision with root package name */
    private final V3.h f13874b;

    /* renamed from: c, reason: collision with root package name */
    private final V3.m f13875c;

    /* renamed from: d, reason: collision with root package name */
    private final V3.b f13876d;

    /* renamed from: e, reason: collision with root package name */
    private final Y3.i f13877e;

    /* renamed from: f, reason: collision with root package name */
    private final p f13878f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13879g;

    /* renamed from: h, reason: collision with root package name */
    private final X3.c f13880h;

    /* renamed from: i, reason: collision with root package name */
    private final S5.g f13881i;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final U1.d a(PublicKey publicKey, String str, U1.h hVar) {
            AbstractC3255y.i(publicKey, "publicKey");
            b.a c8 = new b.a(U1.a.f10253d, (ECPublicKey) publicKey).c(hVar);
            if (str == null || j6.n.u(str)) {
                str = null;
            }
            U1.b B8 = c8.b(str).a().B();
            AbstractC3255y.h(B8, "toPublicJWK(...)");
            return B8;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f13882a;

        /* renamed from: b, reason: collision with root package name */
        int f13883b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f13884c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f13885d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f13886e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PublicKey f13887f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f13888g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f13889h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ PublicKey f13890i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, g gVar, PublicKey publicKey, String str, String str2, PublicKey publicKey2, S5.d dVar) {
            super(2, dVar);
            this.f13885d = qVar;
            this.f13886e = gVar;
            this.f13887f = publicKey;
            this.f13888g = str;
            this.f13889h = str2;
            this.f13890i = publicKey2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(this.f13885d, this.f13886e, this.f13887f, this.f13888g, this.f13889h, this.f13890i, dVar);
            bVar.f13884c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            String str;
            q qVar;
            Object e8 = T5.b.e();
            int i8 = this.f13883b;
            if (i8 != 0) {
                if (i8 == 1) {
                    q qVar2 = (q) this.f13882a;
                    str = (String) this.f13884c;
                    O5.t.b(obj);
                    qVar = qVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                g gVar = this.f13886e;
                PublicKey publicKey = this.f13890i;
                String str2 = this.f13889h;
                String str3 = this.f13888g;
                try {
                    s.a aVar = O5.s.f8302b;
                    b8 = O5.s.b(gVar.f13877e.a(gVar.g(), publicKey, str2, str3));
                } catch (Throwable th) {
                    s.a aVar2 = O5.s.f8302b;
                    b8 = O5.s.b(O5.t.a(th));
                }
                g gVar2 = this.f13886e;
                String str4 = this.f13889h;
                String str5 = this.f13888g;
                q qVar3 = this.f13885d;
                Throwable e9 = O5.s.e(b8);
                if (e9 != null) {
                    gVar2.f13880h.l(new RuntimeException(j6.n.e("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=" + str4 + "\n                    keyId=" + str5 + "\n                    sdkTransactionId=" + qVar3 + "\n                    "), e9));
                }
                Throwable e10 = O5.s.e(b8);
                if (e10 == null) {
                    str = (String) b8;
                    q qVar4 = this.f13885d;
                    V3.b bVar = this.f13886e.f13876d;
                    this.f13884c = str;
                    this.f13882a = qVar4;
                    this.f13883b = 1;
                    Object a8 = bVar.a(this);
                    if (a8 == e8) {
                        return e8;
                    }
                    qVar = qVar4;
                    obj = a8;
                } else {
                    throw new U3.b(e10);
                }
            }
            String a9 = ((V3.a) obj).a();
            String str6 = this.f13886e.f13879g;
            String o8 = g.f13872j.a(this.f13887f, this.f13888g, this.f13886e.h(this.f13889h)).o();
            AbstractC3255y.h(o8, "toJSONString(...)");
            return new c(str, qVar, a9, str6, o8, this.f13886e.f13878f.a());
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public g(V3.e deviceDataFactory, V3.h deviceParamNotAvailableFactory, V3.m securityChecker, V3.b appInfoRepository, Y3.i jweEncrypter, p messageVersionRegistry, String sdkReferenceNumber, X3.c errorReporter, S5.g workContext) {
        AbstractC3255y.i(deviceDataFactory, "deviceDataFactory");
        AbstractC3255y.i(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        AbstractC3255y.i(securityChecker, "securityChecker");
        AbstractC3255y.i(appInfoRepository, "appInfoRepository");
        AbstractC3255y.i(jweEncrypter, "jweEncrypter");
        AbstractC3255y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        this.f13873a = deviceDataFactory;
        this.f13874b = deviceParamNotAvailableFactory;
        this.f13875c = securityChecker;
        this.f13876d = appInfoRepository;
        this.f13877e = jweEncrypter;
        this.f13878f = messageVersionRegistry;
        this.f13879g = sdkReferenceNumber;
        this.f13880h = errorReporter;
        this.f13881i = workContext;
    }

    @Override // a4.d
    public Object a(String str, PublicKey publicKey, String str2, q qVar, PublicKey publicKey2, S5.d dVar) {
        return AbstractC3360i.g(this.f13881i, new b(qVar, this, publicKey2, str2, str, publicKey, null), dVar);
    }

    public final String g() {
        JSONObject put = new JSONObject().put("DV", "1.1").put("DD", new JSONObject(this.f13873a.a())).put("DPNA", new JSONObject(this.f13874b.a()));
        List a8 = this.f13875c.a();
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(a8, 10));
        Iterator it = a8.iterator();
        while (it.hasNext()) {
            arrayList.add(((V3.n) it.next()).getId());
        }
        String jSONObject = put.put("SW", new JSONArray((Collection) arrayList)).toString();
        AbstractC3255y.h(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final U1.h h(String directoryServerId) {
        Object obj;
        AbstractC3255y.i(directoryServerId, "directoryServerId");
        Iterator<E> it = Y3.e.b().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Y3.e) obj).c().contains(directoryServerId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Y3.e eVar = (Y3.e) obj;
        if (eVar != null) {
            return eVar.d();
        }
        return U1.h.f10316b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(V3.e deviceDataFactory, V3.h deviceParamNotAvailableFactory, V3.m securityChecker, Y3.g ephemeralKeyPairGenerator, V3.b appInfoRepository, p messageVersionRegistry, String sdkReferenceNumber, X3.c errorReporter, S5.g workContext) {
        this(deviceDataFactory, deviceParamNotAvailableFactory, securityChecker, appInfoRepository, new Y3.b(ephemeralKeyPairGenerator, errorReporter), messageVersionRegistry, sdkReferenceNumber, errorReporter, workContext);
        AbstractC3255y.i(deviceDataFactory, "deviceDataFactory");
        AbstractC3255y.i(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        AbstractC3255y.i(securityChecker, "securityChecker");
        AbstractC3255y.i(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        AbstractC3255y.i(appInfoRepository, "appInfoRepository");
        AbstractC3255y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
    }
}
