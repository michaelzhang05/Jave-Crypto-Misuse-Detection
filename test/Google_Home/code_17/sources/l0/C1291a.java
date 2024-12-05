package L0;

import L0.F;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1291a implements V0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final V0.a f5334a = new C1291a();

    /* renamed from: L0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0099a implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0099a f5335a = new C0099a();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5336b = U0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5337c = U0.c.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5338d = U0.c.d("buildId");

        private C0099a() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a.AbstractC0081a abstractC0081a, U0.e eVar) {
            eVar.g(f5336b, abstractC0081a.b());
            eVar.g(f5337c, abstractC0081a.d());
            eVar.g(f5338d, abstractC0081a.c());
        }
    }

    /* renamed from: L0.a$b */
    /* loaded from: classes3.dex */
    private static final class b implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f5339a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5340b = U0.c.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5341c = U0.c.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5342d = U0.c.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5343e = U0.c.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5344f = U0.c.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5345g = U0.c.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final U0.c f5346h = U0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: i, reason: collision with root package name */
        private static final U0.c f5347i = U0.c.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final U0.c f5348j = U0.c.d("buildIdMappingForArch");

        private b() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a aVar, U0.e eVar) {
            eVar.c(f5340b, aVar.d());
            eVar.g(f5341c, aVar.e());
            eVar.c(f5342d, aVar.g());
            eVar.c(f5343e, aVar.c());
            eVar.b(f5344f, aVar.f());
            eVar.b(f5345g, aVar.h());
            eVar.b(f5346h, aVar.i());
            eVar.g(f5347i, aVar.j());
            eVar.g(f5348j, aVar.b());
        }
    }

    /* renamed from: L0.a$c */
    /* loaded from: classes3.dex */
    private static final class c implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f5349a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5350b = U0.c.d(LeanbackPreferenceDialogFragment.ARG_KEY);

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5351c = U0.c.d("value");

        private c() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.c cVar, U0.e eVar) {
            eVar.g(f5350b, cVar.b());
            eVar.g(f5351c, cVar.c());
        }
    }

    /* renamed from: L0.a$d */
    /* loaded from: classes3.dex */
    private static final class d implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f5352a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5353b = U0.c.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5354c = U0.c.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5355d = U0.c.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5356e = U0.c.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5357f = U0.c.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5358g = U0.c.d("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        private static final U0.c f5359h = U0.c.d("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        private static final U0.c f5360i = U0.c.d("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final U0.c f5361j = U0.c.d("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        private static final U0.c f5362k = U0.c.d("session");

        /* renamed from: l, reason: collision with root package name */
        private static final U0.c f5363l = U0.c.d("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        private static final U0.c f5364m = U0.c.d("appExitInfo");

        private d() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F f8, U0.e eVar) {
            eVar.g(f5353b, f8.m());
            eVar.g(f5354c, f8.i());
            eVar.c(f5355d, f8.l());
            eVar.g(f5356e, f8.j());
            eVar.g(f5357f, f8.h());
            eVar.g(f5358g, f8.g());
            eVar.g(f5359h, f8.d());
            eVar.g(f5360i, f8.e());
            eVar.g(f5361j, f8.f());
            eVar.g(f5362k, f8.n());
            eVar.g(f5363l, f8.k());
            eVar.g(f5364m, f8.c());
        }
    }

    /* renamed from: L0.a$e */
    /* loaded from: classes3.dex */
    private static final class e implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f5365a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5366b = U0.c.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5367c = U0.c.d("orgId");

        private e() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d dVar, U0.e eVar) {
            eVar.g(f5366b, dVar.b());
            eVar.g(f5367c, dVar.c());
        }
    }

    /* renamed from: L0.a$f */
    /* loaded from: classes3.dex */
    private static final class f implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f5368a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5369b = U0.c.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5370c = U0.c.d("contents");

        private f() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d.b bVar, U0.e eVar) {
            eVar.g(f5369b, bVar.c());
            eVar.g(f5370c, bVar.b());
        }
    }

    /* renamed from: L0.a$g */
    /* loaded from: classes3.dex */
    private static final class g implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f5371a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5372b = U0.c.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5373c = U0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5374d = U0.c.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5375e = U0.c.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5376f = U0.c.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5377g = U0.c.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final U0.c f5378h = U0.c.d("developmentPlatformVersion");

        private g() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a aVar, U0.e eVar) {
            eVar.g(f5372b, aVar.e());
            eVar.g(f5373c, aVar.h());
            eVar.g(f5374d, aVar.d());
            U0.c cVar = f5375e;
            aVar.g();
            eVar.g(cVar, null);
            eVar.g(f5376f, aVar.f());
            eVar.g(f5377g, aVar.b());
            eVar.g(f5378h, aVar.c());
        }
    }

    /* renamed from: L0.a$h */
    /* loaded from: classes3.dex */
    private static final class h implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final h f5379a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5380b = U0.c.d("clsId");

        private h() {
        }

        @Override // U0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (U0.e) obj2);
        }

        public void b(F.e.a.b bVar, U0.e eVar) {
            throw null;
        }
    }

    /* renamed from: L0.a$i */
    /* loaded from: classes3.dex */
    private static final class i implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final i f5381a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5382b = U0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5383c = U0.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5384d = U0.c.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5385e = U0.c.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5386f = U0.c.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5387g = U0.c.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final U0.c f5388h = U0.c.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final U0.c f5389i = U0.c.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final U0.c f5390j = U0.c.d("modelClass");

        private i() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.c cVar, U0.e eVar) {
            eVar.c(f5382b, cVar.b());
            eVar.g(f5383c, cVar.f());
            eVar.c(f5384d, cVar.c());
            eVar.b(f5385e, cVar.h());
            eVar.b(f5386f, cVar.d());
            eVar.d(f5387g, cVar.j());
            eVar.c(f5388h, cVar.i());
            eVar.g(f5389i, cVar.e());
            eVar.g(f5390j, cVar.g());
        }
    }

    /* renamed from: L0.a$j */
    /* loaded from: classes3.dex */
    private static final class j implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final j f5391a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5392b = U0.c.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5393c = U0.c.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5394d = U0.c.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5395e = U0.c.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5396f = U0.c.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5397g = U0.c.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final U0.c f5398h = U0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: i, reason: collision with root package name */
        private static final U0.c f5399i = U0.c.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final U0.c f5400j = U0.c.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final U0.c f5401k = U0.c.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final U0.c f5402l = U0.c.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final U0.c f5403m = U0.c.d("generatorType");

        private j() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e eVar, U0.e eVar2) {
            eVar2.g(f5392b, eVar.g());
            eVar2.g(f5393c, eVar.j());
            eVar2.g(f5394d, eVar.c());
            eVar2.b(f5395e, eVar.l());
            eVar2.g(f5396f, eVar.e());
            eVar2.d(f5397g, eVar.n());
            eVar2.g(f5398h, eVar.b());
            eVar2.g(f5399i, eVar.m());
            eVar2.g(f5400j, eVar.k());
            eVar2.g(f5401k, eVar.d());
            eVar2.g(f5402l, eVar.f());
            eVar2.c(f5403m, eVar.h());
        }
    }

    /* renamed from: L0.a$k */
    /* loaded from: classes3.dex */
    private static final class k implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final k f5404a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5405b = U0.c.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5406c = U0.c.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5407d = U0.c.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5408e = U0.c.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5409f = U0.c.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5410g = U0.c.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final U0.c f5411h = U0.c.d("uiOrientation");

        private k() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a aVar, U0.e eVar) {
            eVar.g(f5405b, aVar.f());
            eVar.g(f5406c, aVar.e());
            eVar.g(f5407d, aVar.g());
            eVar.g(f5408e, aVar.c());
            eVar.g(f5409f, aVar.d());
            eVar.g(f5410g, aVar.b());
            eVar.c(f5411h, aVar.h());
        }
    }

    /* renamed from: L0.a$l */
    /* loaded from: classes3.dex */
    private static final class l implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final l f5412a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5413b = U0.c.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5414c = U0.c.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5415d = U0.c.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5416e = U0.c.d("uuid");

        private l() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0085a abstractC0085a, U0.e eVar) {
            eVar.b(f5413b, abstractC0085a.b());
            eVar.b(f5414c, abstractC0085a.d());
            eVar.g(f5415d, abstractC0085a.c());
            eVar.g(f5416e, abstractC0085a.f());
        }
    }

    /* renamed from: L0.a$m */
    /* loaded from: classes3.dex */
    private static final class m implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final m f5417a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5418b = U0.c.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5419c = U0.c.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5420d = U0.c.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5421e = U0.c.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5422f = U0.c.d("binaries");

        private m() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b bVar, U0.e eVar) {
            eVar.g(f5418b, bVar.f());
            eVar.g(f5419c, bVar.d());
            eVar.g(f5420d, bVar.b());
            eVar.g(f5421e, bVar.e());
            eVar.g(f5422f, bVar.c());
        }
    }

    /* renamed from: L0.a$n */
    /* loaded from: classes3.dex */
    private static final class n implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final n f5423a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5424b = U0.c.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5425c = U0.c.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5426d = U0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5427e = U0.c.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5428f = U0.c.d("overflowCount");

        private n() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.c cVar, U0.e eVar) {
            eVar.g(f5424b, cVar.f());
            eVar.g(f5425c, cVar.e());
            eVar.g(f5426d, cVar.c());
            eVar.g(f5427e, cVar.b());
            eVar.c(f5428f, cVar.d());
        }
    }

    /* renamed from: L0.a$o */
    /* loaded from: classes3.dex */
    private static final class o implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final o f5429a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5430b = U0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5431c = U0.c.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5432d = U0.c.d("address");

        private o() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0089d abstractC0089d, U0.e eVar) {
            eVar.g(f5430b, abstractC0089d.d());
            eVar.g(f5431c, abstractC0089d.c());
            eVar.b(f5432d, abstractC0089d.b());
        }
    }

    /* renamed from: L0.a$p */
    /* loaded from: classes3.dex */
    private static final class p implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final p f5433a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5434b = U0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5435c = U0.c.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5436d = U0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        private p() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0091e abstractC0091e, U0.e eVar) {
            eVar.g(f5434b, abstractC0091e.d());
            eVar.c(f5435c, abstractC0091e.c());
            eVar.g(f5436d, abstractC0091e.b());
        }
    }

    /* renamed from: L0.a$q */
    /* loaded from: classes3.dex */
    private static final class q implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final q f5437a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5438b = U0.c.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5439c = U0.c.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5440d = U0.c.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5441e = U0.c.d(TypedValues.CycleType.S_WAVE_OFFSET);

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5442f = U0.c.d("importance");

        private q() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0091e.AbstractC0093b abstractC0093b, U0.e eVar) {
            eVar.b(f5438b, abstractC0093b.e());
            eVar.g(f5439c, abstractC0093b.f());
            eVar.g(f5440d, abstractC0093b.b());
            eVar.b(f5441e, abstractC0093b.d());
            eVar.c(f5442f, abstractC0093b.c());
        }
    }

    /* renamed from: L0.a$r */
    /* loaded from: classes3.dex */
    private static final class r implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final r f5443a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5444b = U0.c.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5445c = U0.c.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5446d = U0.c.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5447e = U0.c.d("defaultProcess");

        private r() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.c cVar, U0.e eVar) {
            eVar.g(f5444b, cVar.d());
            eVar.c(f5445c, cVar.c());
            eVar.c(f5446d, cVar.b());
            eVar.d(f5447e, cVar.e());
        }
    }

    /* renamed from: L0.a$s */
    /* loaded from: classes3.dex */
    private static final class s implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final s f5448a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5449b = U0.c.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5450c = U0.c.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5451d = U0.c.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5452e = U0.c.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5453f = U0.c.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5454g = U0.c.d("diskUsed");

        private s() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.c cVar, U0.e eVar) {
            eVar.g(f5449b, cVar.b());
            eVar.c(f5450c, cVar.c());
            eVar.d(f5451d, cVar.g());
            eVar.c(f5452e, cVar.e());
            eVar.b(f5453f, cVar.f());
            eVar.b(f5454g, cVar.d());
        }
    }

    /* renamed from: L0.a$t */
    /* loaded from: classes3.dex */
    private static final class t implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final t f5455a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5456b = U0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5457c = U0.c.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5458d = U0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5459e = U0.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final U0.c f5460f = U0.c.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final U0.c f5461g = U0.c.d("rollouts");

        private t() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d dVar, U0.e eVar) {
            eVar.b(f5456b, dVar.f());
            eVar.g(f5457c, dVar.g());
            eVar.g(f5458d, dVar.b());
            eVar.g(f5459e, dVar.c());
            eVar.g(f5460f, dVar.d());
            eVar.g(f5461g, dVar.e());
        }
    }

    /* renamed from: L0.a$u */
    /* loaded from: classes3.dex */
    private static final class u implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final u f5462a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5463b = U0.c.d("content");

        private u() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0096d abstractC0096d, U0.e eVar) {
            eVar.g(f5463b, abstractC0096d.b());
        }
    }

    /* renamed from: L0.a$v */
    /* loaded from: classes3.dex */
    private static final class v implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final v f5464a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5465b = U0.c.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5466c = U0.c.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5467d = U0.c.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5468e = U0.c.d("templateVersion");

        private v() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0097e abstractC0097e, U0.e eVar) {
            eVar.g(f5465b, abstractC0097e.d());
            eVar.g(f5466c, abstractC0097e.b());
            eVar.g(f5467d, abstractC0097e.c());
            eVar.b(f5468e, abstractC0097e.e());
        }
    }

    /* renamed from: L0.a$w */
    /* loaded from: classes3.dex */
    private static final class w implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final w f5469a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5470b = U0.c.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5471c = U0.c.d("variantId");

        private w() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0097e.b bVar, U0.e eVar) {
            eVar.g(f5470b, bVar.b());
            eVar.g(f5471c, bVar.c());
        }
    }

    /* renamed from: L0.a$x */
    /* loaded from: classes3.dex */
    private static final class x implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final x f5472a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5473b = U0.c.d("assignments");

        private x() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.f fVar, U0.e eVar) {
            eVar.g(f5473b, fVar.b());
        }
    }

    /* renamed from: L0.a$y */
    /* loaded from: classes3.dex */
    private static final class y implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final y f5474a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5475b = U0.c.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final U0.c f5476c = U0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final U0.c f5477d = U0.c.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final U0.c f5478e = U0.c.d("jailbroken");

        private y() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.AbstractC0098e abstractC0098e, U0.e eVar) {
            eVar.c(f5475b, abstractC0098e.c());
            eVar.g(f5476c, abstractC0098e.d());
            eVar.g(f5477d, abstractC0098e.b());
            eVar.d(f5478e, abstractC0098e.e());
        }
    }

    /* renamed from: L0.a$z */
    /* loaded from: classes3.dex */
    private static final class z implements U0.d {

        /* renamed from: a, reason: collision with root package name */
        static final z f5479a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final U0.c f5480b = U0.c.d("identifier");

        private z() {
        }

        @Override // U0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.f fVar, U0.e eVar) {
            eVar.g(f5480b, fVar.b());
        }
    }

    private C1291a() {
    }

    @Override // V0.a
    public void a(V0.b bVar) {
        d dVar = d.f5352a;
        bVar.a(F.class, dVar);
        bVar.a(C1292b.class, dVar);
        j jVar = j.f5391a;
        bVar.a(F.e.class, jVar);
        bVar.a(L0.h.class, jVar);
        g gVar = g.f5371a;
        bVar.a(F.e.a.class, gVar);
        bVar.a(L0.i.class, gVar);
        h hVar = h.f5379a;
        bVar.a(F.e.a.b.class, hVar);
        bVar.a(L0.j.class, hVar);
        z zVar = z.f5479a;
        bVar.a(F.e.f.class, zVar);
        bVar.a(A.class, zVar);
        y yVar = y.f5474a;
        bVar.a(F.e.AbstractC0098e.class, yVar);
        bVar.a(L0.z.class, yVar);
        i iVar = i.f5381a;
        bVar.a(F.e.c.class, iVar);
        bVar.a(L0.k.class, iVar);
        t tVar = t.f5455a;
        bVar.a(F.e.d.class, tVar);
        bVar.a(L0.l.class, tVar);
        k kVar = k.f5404a;
        bVar.a(F.e.d.a.class, kVar);
        bVar.a(L0.m.class, kVar);
        m mVar = m.f5417a;
        bVar.a(F.e.d.a.b.class, mVar);
        bVar.a(L0.n.class, mVar);
        p pVar = p.f5433a;
        bVar.a(F.e.d.a.b.AbstractC0091e.class, pVar);
        bVar.a(L0.r.class, pVar);
        q qVar = q.f5437a;
        bVar.a(F.e.d.a.b.AbstractC0091e.AbstractC0093b.class, qVar);
        bVar.a(L0.s.class, qVar);
        n nVar = n.f5423a;
        bVar.a(F.e.d.a.b.c.class, nVar);
        bVar.a(L0.p.class, nVar);
        b bVar2 = b.f5339a;
        bVar.a(F.a.class, bVar2);
        bVar.a(C1293c.class, bVar2);
        C0099a c0099a = C0099a.f5335a;
        bVar.a(F.a.AbstractC0081a.class, c0099a);
        bVar.a(C1294d.class, c0099a);
        o oVar = o.f5429a;
        bVar.a(F.e.d.a.b.AbstractC0089d.class, oVar);
        bVar.a(L0.q.class, oVar);
        l lVar = l.f5412a;
        bVar.a(F.e.d.a.b.AbstractC0085a.class, lVar);
        bVar.a(L0.o.class, lVar);
        c cVar = c.f5349a;
        bVar.a(F.c.class, cVar);
        bVar.a(C1295e.class, cVar);
        r rVar = r.f5443a;
        bVar.a(F.e.d.a.c.class, rVar);
        bVar.a(L0.t.class, rVar);
        s sVar = s.f5448a;
        bVar.a(F.e.d.c.class, sVar);
        bVar.a(L0.u.class, sVar);
        u uVar = u.f5462a;
        bVar.a(F.e.d.AbstractC0096d.class, uVar);
        bVar.a(L0.v.class, uVar);
        x xVar = x.f5472a;
        bVar.a(F.e.d.f.class, xVar);
        bVar.a(L0.y.class, xVar);
        v vVar = v.f5464a;
        bVar.a(F.e.d.AbstractC0097e.class, vVar);
        bVar.a(L0.w.class, vVar);
        w wVar = w.f5469a;
        bVar.a(F.e.d.AbstractC0097e.b.class, wVar);
        bVar.a(L0.x.class, wVar);
        e eVar = e.f5365a;
        bVar.a(F.d.class, eVar);
        bVar.a(C1296f.class, eVar);
        f fVar = f.f5368a;
        bVar.a(F.d.b.class, fVar);
        bVar.a(C1297g.class, fVar);
    }
}
