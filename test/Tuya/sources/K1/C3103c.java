package k1;

import L5.I;
import L5.t;
import X5.n;
import a1.InterfaceC1554e;
import android.util.Log;
import androidx.datastore.core.DataStore;
import g6.j;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import i1.C2768b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import r6.AbstractC3692c;
import r6.InterfaceC3690a;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3103c implements InterfaceC3108h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f33299g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final P5.g f33300a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1554e f33301b;

    /* renamed from: c, reason: collision with root package name */
    private final C2768b f33302c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3101a f33303d;

    /* renamed from: e, reason: collision with root package name */
    private final C3107g f33304e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3690a f33305f;

    /* renamed from: k1.c$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33306a;

        /* renamed from: b, reason: collision with root package name */
        Object f33307b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f33308c;

        /* renamed from: e, reason: collision with root package name */
        int f33310e;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33308c = obj;
            this.f33310e |= Integer.MIN_VALUE;
            return C3103c.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0770c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f33311a;

        /* renamed from: b, reason: collision with root package name */
        Object f33312b;

        /* renamed from: c, reason: collision with root package name */
        int f33313c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f33314d;

        C0770c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            C0770c c0770c = new C0770c(dVar);
            c0770c.f33314d = obj;
            return c0770c;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, P5.d dVar) {
            return ((C0770c) create(jSONObject, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0181 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.C3103c.C0770c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f33316a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33317b;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f33317b = obj;
            return dVar2;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, P5.d dVar) {
            return ((d) create(str, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f33316a == 0) {
                t.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f33317b));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3103c(P5.g backgroundDispatcher, InterfaceC1554e firebaseInstallationsApi, C2768b appInfo, InterfaceC3101a configsFetcher, DataStore dataStore) {
        AbstractC3159y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3159y.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(configsFetcher, "configsFetcher");
        AbstractC3159y.i(dataStore, "dataStore");
        this.f33300a = backgroundDispatcher;
        this.f33301b = firebaseInstallationsApi;
        this.f33302c = appInfo;
        this.f33303d = configsFetcher;
        this.f33304e = new C3107g(dataStore);
        this.f33305f = AbstractC3692c.b(false, 1, null);
    }

    private final String f(String str) {
        return new j("/").f(str, "");
    }

    @Override // k1.InterfaceC3108h
    public Boolean a() {
        return this.f33304e.g();
    }

    @Override // k1.InterfaceC3108h
    public C2758a b() {
        Integer e8 = this.f33304e.e();
        if (e8 != null) {
            C2758a.C0756a c0756a = C2758a.f31409b;
            return C2758a.e(AbstractC2760c.s(e8.intValue(), EnumC2761d.f31419e));
        }
        return null;
    }

    @Override // k1.InterfaceC3108h
    public Double c() {
        return this.f33304e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:26:0x004d, B:27:0x00ae, B:29:0x00b2, B:32:0x00bf, B:37:0x0088, B:39:0x0090, B:42:0x0096), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // k1.InterfaceC3108h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(P5.d r17) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C3103c.d(P5.d):java.lang.Object");
    }
}
