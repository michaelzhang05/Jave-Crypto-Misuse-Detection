package J0;

import J0.B;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: J0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1189a implements T0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final T0.a f4338a = new C1189a();

    /* renamed from: J0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0088a implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0088a f4339a = new C0088a();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4340b = S0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4341c = S0.c.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4342d = S0.c.d("buildId");

        private C0088a() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.a.AbstractC0072a abstractC0072a, S0.e eVar) {
            eVar.a(f4340b, abstractC0072a.b());
            eVar.a(f4341c, abstractC0072a.d());
            eVar.a(f4342d, abstractC0072a.c());
        }
    }

    /* renamed from: J0.a$b */
    /* loaded from: classes3.dex */
    private static final class b implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f4343a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4344b = S0.c.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4345c = S0.c.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4346d = S0.c.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4347e = S0.c.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4348f = S0.c.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4349g = S0.c.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4350h = S0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4351i = S0.c.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4352j = S0.c.d("buildIdMappingForArch");

        private b() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.a aVar, S0.e eVar) {
            eVar.c(f4344b, aVar.d());
            eVar.a(f4345c, aVar.e());
            eVar.c(f4346d, aVar.g());
            eVar.c(f4347e, aVar.c());
            eVar.d(f4348f, aVar.f());
            eVar.d(f4349g, aVar.h());
            eVar.d(f4350h, aVar.i());
            eVar.a(f4351i, aVar.j());
            eVar.a(f4352j, aVar.b());
        }
    }

    /* renamed from: J0.a$c */
    /* loaded from: classes3.dex */
    private static final class c implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f4353a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4354b = S0.c.d(LeanbackPreferenceDialogFragment.ARG_KEY);

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4355c = S0.c.d("value");

        private c() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.c cVar, S0.e eVar) {
            eVar.a(f4354b, cVar.b());
            eVar.a(f4355c, cVar.c());
        }
    }

    /* renamed from: J0.a$d */
    /* loaded from: classes3.dex */
    private static final class d implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f4356a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4357b = S0.c.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4358c = S0.c.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4359d = S0.c.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4360e = S0.c.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4361f = S0.c.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4362g = S0.c.d("buildVersion");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4363h = S0.c.d("displayVersion");

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4364i = S0.c.d("session");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4365j = S0.c.d("ndkPayload");

        /* renamed from: k, reason: collision with root package name */
        private static final S0.c f4366k = S0.c.d("appExitInfo");

        private d() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B b8, S0.e eVar) {
            eVar.a(f4357b, b8.k());
            eVar.a(f4358c, b8.g());
            eVar.c(f4359d, b8.j());
            eVar.a(f4360e, b8.h());
            eVar.a(f4361f, b8.f());
            eVar.a(f4362g, b8.d());
            eVar.a(f4363h, b8.e());
            eVar.a(f4364i, b8.l());
            eVar.a(f4365j, b8.i());
            eVar.a(f4366k, b8.c());
        }
    }

    /* renamed from: J0.a$e */
    /* loaded from: classes3.dex */
    private static final class e implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f4367a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4368b = S0.c.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4369c = S0.c.d("orgId");

        private e() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.d dVar, S0.e eVar) {
            eVar.a(f4368b, dVar.b());
            eVar.a(f4369c, dVar.c());
        }
    }

    /* renamed from: J0.a$f */
    /* loaded from: classes3.dex */
    private static final class f implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f4370a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4371b = S0.c.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4372c = S0.c.d("contents");

        private f() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.d.b bVar, S0.e eVar) {
            eVar.a(f4371b, bVar.c());
            eVar.a(f4372c, bVar.b());
        }
    }

    /* renamed from: J0.a$g */
    /* loaded from: classes3.dex */
    private static final class g implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f4373a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4374b = S0.c.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4375c = S0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4376d = S0.c.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4377e = S0.c.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4378f = S0.c.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4379g = S0.c.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4380h = S0.c.d("developmentPlatformVersion");

        private g() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.a aVar, S0.e eVar) {
            eVar.a(f4374b, aVar.e());
            eVar.a(f4375c, aVar.h());
            eVar.a(f4376d, aVar.d());
            S0.c cVar = f4377e;
            aVar.g();
            eVar.a(cVar, null);
            eVar.a(f4378f, aVar.f());
            eVar.a(f4379g, aVar.b());
            eVar.a(f4380h, aVar.c());
        }
    }

    /* renamed from: J0.a$h */
    /* loaded from: classes3.dex */
    private static final class h implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final h f4381a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4382b = S0.c.d("clsId");

        private h() {
        }

        @Override // S0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (S0.e) obj2);
        }

        public void b(B.e.a.b bVar, S0.e eVar) {
            throw null;
        }
    }

    /* renamed from: J0.a$i */
    /* loaded from: classes3.dex */
    private static final class i implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final i f4383a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4384b = S0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4385c = S0.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4386d = S0.c.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4387e = S0.c.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4388f = S0.c.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4389g = S0.c.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4390h = S0.c.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4391i = S0.c.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4392j = S0.c.d("modelClass");

        private i() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.c cVar, S0.e eVar) {
            eVar.c(f4384b, cVar.b());
            eVar.a(f4385c, cVar.f());
            eVar.c(f4386d, cVar.c());
            eVar.d(f4387e, cVar.h());
            eVar.d(f4388f, cVar.d());
            eVar.e(f4389g, cVar.j());
            eVar.c(f4390h, cVar.i());
            eVar.a(f4391i, cVar.e());
            eVar.a(f4392j, cVar.g());
        }
    }

    /* renamed from: J0.a$j */
    /* loaded from: classes3.dex */
    private static final class j implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final j f4393a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4394b = S0.c.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4395c = S0.c.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4396d = S0.c.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4397e = S0.c.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4398f = S0.c.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4399g = S0.c.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final S0.c f4400h = S0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: i, reason: collision with root package name */
        private static final S0.c f4401i = S0.c.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final S0.c f4402j = S0.c.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final S0.c f4403k = S0.c.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final S0.c f4404l = S0.c.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final S0.c f4405m = S0.c.d("generatorType");

        private j() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e eVar, S0.e eVar2) {
            eVar2.a(f4394b, eVar.g());
            eVar2.a(f4395c, eVar.j());
            eVar2.a(f4396d, eVar.c());
            eVar2.d(f4397e, eVar.l());
            eVar2.a(f4398f, eVar.e());
            eVar2.e(f4399g, eVar.n());
            eVar2.a(f4400h, eVar.b());
            eVar2.a(f4401i, eVar.m());
            eVar2.a(f4402j, eVar.k());
            eVar2.a(f4403k, eVar.d());
            eVar2.a(f4404l, eVar.f());
            eVar2.c(f4405m, eVar.h());
        }
    }

    /* renamed from: J0.a$k */
    /* loaded from: classes3.dex */
    private static final class k implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final k f4406a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4407b = S0.c.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4408c = S0.c.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4409d = S0.c.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4410e = S0.c.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4411f = S0.c.d("uiOrientation");

        private k() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a aVar, S0.e eVar) {
            eVar.a(f4407b, aVar.d());
            eVar.a(f4408c, aVar.c());
            eVar.a(f4409d, aVar.e());
            eVar.a(f4410e, aVar.b());
            eVar.c(f4411f, aVar.f());
        }
    }

    /* renamed from: J0.a$l */
    /* loaded from: classes3.dex */
    private static final class l implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final l f4412a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4413b = S0.c.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4414c = S0.c.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4415d = S0.c.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4416e = S0.c.d("uuid");

        private l() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0076a abstractC0076a, S0.e eVar) {
            eVar.d(f4413b, abstractC0076a.b());
            eVar.d(f4414c, abstractC0076a.d());
            eVar.a(f4415d, abstractC0076a.c());
            eVar.a(f4416e, abstractC0076a.f());
        }
    }

    /* renamed from: J0.a$m */
    /* loaded from: classes3.dex */
    private static final class m implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final m f4417a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4418b = S0.c.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4419c = S0.c.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4420d = S0.c.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4421e = S0.c.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4422f = S0.c.d("binaries");

        private m() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b bVar, S0.e eVar) {
            eVar.a(f4418b, bVar.f());
            eVar.a(f4419c, bVar.d());
            eVar.a(f4420d, bVar.b());
            eVar.a(f4421e, bVar.e());
            eVar.a(f4422f, bVar.c());
        }
    }

    /* renamed from: J0.a$n */
    /* loaded from: classes3.dex */
    private static final class n implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final n f4423a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4424b = S0.c.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4425c = S0.c.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4426d = S0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4427e = S0.c.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4428f = S0.c.d("overflowCount");

        private n() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.c cVar, S0.e eVar) {
            eVar.a(f4424b, cVar.f());
            eVar.a(f4425c, cVar.e());
            eVar.a(f4426d, cVar.c());
            eVar.a(f4427e, cVar.b());
            eVar.c(f4428f, cVar.d());
        }
    }

    /* renamed from: J0.a$o */
    /* loaded from: classes3.dex */
    private static final class o implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final o f4429a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4430b = S0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4431c = S0.c.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4432d = S0.c.d("address");

        private o() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0080d abstractC0080d, S0.e eVar) {
            eVar.a(f4430b, abstractC0080d.d());
            eVar.a(f4431c, abstractC0080d.c());
            eVar.d(f4432d, abstractC0080d.b());
        }
    }

    /* renamed from: J0.a$p */
    /* loaded from: classes3.dex */
    private static final class p implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final p f4433a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4434b = S0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4435c = S0.c.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4436d = S0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        private p() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0082e abstractC0082e, S0.e eVar) {
            eVar.a(f4434b, abstractC0082e.d());
            eVar.c(f4435c, abstractC0082e.c());
            eVar.a(f4436d, abstractC0082e.b());
        }
    }

    /* renamed from: J0.a$q */
    /* loaded from: classes3.dex */
    private static final class q implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final q f4437a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4438b = S0.c.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4439c = S0.c.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4440d = S0.c.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4441e = S0.c.d(TypedValues.CycleType.S_WAVE_OFFSET);

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4442f = S0.c.d("importance");

        private q() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.a.b.AbstractC0082e.AbstractC0084b abstractC0084b, S0.e eVar) {
            eVar.d(f4438b, abstractC0084b.e());
            eVar.a(f4439c, abstractC0084b.f());
            eVar.a(f4440d, abstractC0084b.b());
            eVar.d(f4441e, abstractC0084b.d());
            eVar.c(f4442f, abstractC0084b.c());
        }
    }

    /* renamed from: J0.a$r */
    /* loaded from: classes3.dex */
    private static final class r implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final r f4443a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4444b = S0.c.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4445c = S0.c.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4446d = S0.c.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4447e = S0.c.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4448f = S0.c.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final S0.c f4449g = S0.c.d("diskUsed");

        private r() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.c cVar, S0.e eVar) {
            eVar.a(f4444b, cVar.b());
            eVar.c(f4445c, cVar.c());
            eVar.e(f4446d, cVar.g());
            eVar.c(f4447e, cVar.e());
            eVar.d(f4448f, cVar.f());
            eVar.d(f4449g, cVar.d());
        }
    }

    /* renamed from: J0.a$s */
    /* loaded from: classes3.dex */
    private static final class s implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final s f4450a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4451b = S0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4452c = S0.c.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4453d = S0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4454e = S0.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final S0.c f4455f = S0.c.d("log");

        private s() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d dVar, S0.e eVar) {
            eVar.d(f4451b, dVar.e());
            eVar.a(f4452c, dVar.f());
            eVar.a(f4453d, dVar.b());
            eVar.a(f4454e, dVar.c());
            eVar.a(f4455f, dVar.d());
        }
    }

    /* renamed from: J0.a$t */
    /* loaded from: classes3.dex */
    private static final class t implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final t f4456a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4457b = S0.c.d("content");

        private t() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.d.AbstractC0086d abstractC0086d, S0.e eVar) {
            eVar.a(f4457b, abstractC0086d.b());
        }
    }

    /* renamed from: J0.a$u */
    /* loaded from: classes3.dex */
    private static final class u implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final u f4458a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4459b = S0.c.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final S0.c f4460c = S0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final S0.c f4461d = S0.c.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final S0.c f4462e = S0.c.d("jailbroken");

        private u() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.AbstractC0087e abstractC0087e, S0.e eVar) {
            eVar.c(f4459b, abstractC0087e.c());
            eVar.a(f4460c, abstractC0087e.d());
            eVar.a(f4461d, abstractC0087e.b());
            eVar.e(f4462e, abstractC0087e.e());
        }
    }

    /* renamed from: J0.a$v */
    /* loaded from: classes3.dex */
    private static final class v implements S0.d {

        /* renamed from: a, reason: collision with root package name */
        static final v f4463a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final S0.c f4464b = S0.c.d("identifier");

        private v() {
        }

        @Override // S0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(B.e.f fVar, S0.e eVar) {
            eVar.a(f4464b, fVar.b());
        }
    }

    private C1189a() {
    }

    @Override // T0.a
    public void a(T0.b bVar) {
        d dVar = d.f4356a;
        bVar.a(B.class, dVar);
        bVar.a(C1190b.class, dVar);
        j jVar = j.f4393a;
        bVar.a(B.e.class, jVar);
        bVar.a(J0.h.class, jVar);
        g gVar = g.f4373a;
        bVar.a(B.e.a.class, gVar);
        bVar.a(J0.i.class, gVar);
        h hVar = h.f4381a;
        bVar.a(B.e.a.b.class, hVar);
        bVar.a(J0.j.class, hVar);
        v vVar = v.f4463a;
        bVar.a(B.e.f.class, vVar);
        bVar.a(w.class, vVar);
        u uVar = u.f4458a;
        bVar.a(B.e.AbstractC0087e.class, uVar);
        bVar.a(J0.v.class, uVar);
        i iVar = i.f4383a;
        bVar.a(B.e.c.class, iVar);
        bVar.a(J0.k.class, iVar);
        s sVar = s.f4450a;
        bVar.a(B.e.d.class, sVar);
        bVar.a(J0.l.class, sVar);
        k kVar = k.f4406a;
        bVar.a(B.e.d.a.class, kVar);
        bVar.a(J0.m.class, kVar);
        m mVar = m.f4417a;
        bVar.a(B.e.d.a.b.class, mVar);
        bVar.a(J0.n.class, mVar);
        p pVar = p.f4433a;
        bVar.a(B.e.d.a.b.AbstractC0082e.class, pVar);
        bVar.a(J0.r.class, pVar);
        q qVar = q.f4437a;
        bVar.a(B.e.d.a.b.AbstractC0082e.AbstractC0084b.class, qVar);
        bVar.a(J0.s.class, qVar);
        n nVar = n.f4423a;
        bVar.a(B.e.d.a.b.c.class, nVar);
        bVar.a(J0.p.class, nVar);
        b bVar2 = b.f4343a;
        bVar.a(B.a.class, bVar2);
        bVar.a(C1191c.class, bVar2);
        C0088a c0088a = C0088a.f4339a;
        bVar.a(B.a.AbstractC0072a.class, c0088a);
        bVar.a(C1192d.class, c0088a);
        o oVar = o.f4429a;
        bVar.a(B.e.d.a.b.AbstractC0080d.class, oVar);
        bVar.a(J0.q.class, oVar);
        l lVar = l.f4412a;
        bVar.a(B.e.d.a.b.AbstractC0076a.class, lVar);
        bVar.a(J0.o.class, lVar);
        c cVar = c.f4353a;
        bVar.a(B.c.class, cVar);
        bVar.a(J0.e.class, cVar);
        r rVar = r.f4443a;
        bVar.a(B.e.d.c.class, rVar);
        bVar.a(J0.t.class, rVar);
        t tVar = t.f4456a;
        bVar.a(B.e.d.AbstractC0086d.class, tVar);
        bVar.a(J0.u.class, tVar);
        e eVar = e.f4367a;
        bVar.a(B.d.class, eVar);
        bVar.a(J0.f.class, eVar);
        f fVar = f.f4370a;
        bVar.a(B.d.b.class, fVar);
        bVar.a(J0.g.class, fVar);
    }
}
