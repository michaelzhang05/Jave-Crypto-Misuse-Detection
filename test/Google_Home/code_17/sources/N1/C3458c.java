package n1;

import O5.I;
import O5.InterfaceC1355k;
import O5.t;
import a6.InterfaceC1668n;
import android.util.Log;
import androidx.datastore.core.DataStore;
import j6.j;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l1.C3299b;
import org.json.JSONObject;
import u6.AbstractC4065c;
import u6.InterfaceC4063a;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3458c implements InterfaceC3463h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f35289g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final S5.g f35290a;

    /* renamed from: b, reason: collision with root package name */
    private final c1.e f35291b;

    /* renamed from: c, reason: collision with root package name */
    private final C3299b f35292c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3456a f35293d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1355k f35294e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4063a f35295f;

    /* renamed from: n1.c$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: n1.c$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStore f35296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DataStore dataStore) {
            super(0);
            this.f35296a = dataStore;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3462g invoke() {
            return new C3462g(this.f35296a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0800c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35297a;

        /* renamed from: b, reason: collision with root package name */
        Object f35298b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f35299c;

        /* renamed from: e, reason: collision with root package name */
        int f35301e;

        C0800c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35299c = obj;
            this.f35301e |= Integer.MIN_VALUE;
            return C3458c.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f35302a;

        /* renamed from: b, reason: collision with root package name */
        Object f35303b;

        /* renamed from: c, reason: collision with root package name */
        int f35304c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35305d;

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, S5.d dVar) {
            return ((d) create(jSONObject, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f35305d = obj;
            return dVar2;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0195 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.C3458c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35307a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35308b;

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, S5.d dVar) {
            return ((e) create(str, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            e eVar = new e(dVar);
            eVar.f35308b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f35307a == 0) {
                t.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f35308b));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3458c(S5.g backgroundDispatcher, c1.e firebaseInstallationsApi, C3299b appInfo, InterfaceC3456a configsFetcher, DataStore dataStore) {
        AbstractC3255y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3255y.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(configsFetcher, "configsFetcher");
        AbstractC3255y.i(dataStore, "dataStore");
        this.f35290a = backgroundDispatcher;
        this.f35291b = firebaseInstallationsApi;
        this.f35292c = appInfo;
        this.f35293d = configsFetcher;
        this.f35294e = O5.l.b(new b(dataStore));
        this.f35295f = AbstractC4065c.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3462g f() {
        return (C3462g) this.f35294e.getValue();
    }

    private final String g(String str) {
        return new j("/").f(str, "");
    }

    @Override // n1.InterfaceC3463h
    public Boolean a() {
        return f().g();
    }

    @Override // n1.InterfaceC3463h
    public C3225a b() {
        Integer e8 = f().e();
        if (e8 != null) {
            C3225a.C0782a c0782a = C3225a.f34131b;
            return C3225a.e(AbstractC3227c.s(e8.intValue(), EnumC3228d.f34141e));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x0051, B:35:0x00c1, B:49:0x0097), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[Catch: all -> 0x0162, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:33:0x00b3, B:38:0x00cc, B:47:0x008d, B:52:0x00a2), top: B:46:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x0051, B:35:0x00c1, B:49:0x0097), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0162, TRY_ENTER, TryCatch #0 {all -> 0x0162, blocks: (B:33:0x00b3, B:38:0x00cc, B:47:0x008d, B:52:0x00a2), top: B:46:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // n1.InterfaceC3463h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(S5.d r17) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C3458c.c(S5.d):java.lang.Object");
    }

    @Override // n1.InterfaceC3463h
    public Double d() {
        return f().f();
    }
}
