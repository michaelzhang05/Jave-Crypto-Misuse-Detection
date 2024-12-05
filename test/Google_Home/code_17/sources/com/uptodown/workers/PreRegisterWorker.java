package com.uptodown.workers;

import H4.j;
import O5.t;
import V4.i;
import Z4.r;
import a5.C1632D;
import a5.C1641h;
import a5.I;
import a6.InterfaceC1668n;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.squareup.picasso.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l2.InterfaceC3309b;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3660F;
import o5.C3674n;
import o5.C3678r;
import o5.C3683w;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class PreRegisterWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31077b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31078a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31079a;

        /* loaded from: classes5.dex */
        public static final class a implements r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f31081a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1632D f31082b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f31083c;

            a(PreRegisterWorker preRegisterWorker, C1632D c1632d, int i8) {
                this.f31081a = preRegisterWorker;
                this.f31082b = c1632d;
                this.f31083c = i8;
            }

            @Override // Z4.r
            public void c(int i8) {
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                this.f31081a.h(this.f31082b, appInfo, this.f31083c);
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f31079a == 0) {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                I P8 = new C3660F(PreRegisterWorker.this.f31078a).P();
                if (!P8.b() && P8.d() != null) {
                    String d8 = P8.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = P8.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i8 = 0; i8 < length; i8++) {
                                C1632D.a aVar = C1632D.f13956f;
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                                AbstractC3255y.h(jSONObject2, "jsonArrayUpcomingReleases.getJSONObject(i)");
                                C1632D b8 = aVar.b(jSONObject2);
                                arrayList.add(b8);
                                b8.h(PreRegisterWorker.this.f31078a);
                            }
                        }
                        C3674n a8 = C3674n.f36505t.a(PreRegisterWorker.this.f31078a);
                        a8.a();
                        ArrayList i9 = PreRegisterWorker.this.i(a8.p0(), a8);
                        a8.l();
                        Iterator it = i9.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            int i11 = i10 + 1;
                            C1632D c1632d = (C1632D) it.next();
                            Iterator it2 = arrayList.iterator();
                            boolean z8 = false;
                            while (it2.hasNext()) {
                                if (c1632d.b() == ((C1632D) it2.next()).b()) {
                                    z8 = true;
                                }
                            }
                            if (!z8) {
                                new i(PreRegisterWorker.this.f31078a, c1632d.b(), new a(PreRegisterWorker.this, c1632d, i10), N.a(C3347b0.b()));
                            }
                            i10 = i11;
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31084a;

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f31084a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PreRegisterWorker preRegisterWorker = PreRegisterWorker.this;
                this.f31084a = 1;
                if (preRegisterWorker.f(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PreRegisterWorker f31088c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1641h f31089d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f31090e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C1632D f31091f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, PreRegisterWorker preRegisterWorker, C1641h c1641h, int i8, C1632D c1632d, S5.d dVar) {
            super(2, dVar);
            this.f31087b = str;
            this.f31088c = preRegisterWorker;
            this.f31089d = c1641h;
            this.f31090e = i8;
            this.f31091f = c1632d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f31087b, this.f31088c, this.f31089d, this.f31090e, this.f31091f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            T5.b.e();
            if (this.f31086a == 0) {
                t.b(obj);
                try {
                    bitmap = s.h().l(this.f31087b).g();
                } catch (IOException unused) {
                    bitmap = null;
                }
                C3683w.f36547a.o(this.f31088c.f31078a, this.f31089d, this.f31090e, bitmap, this.f31091f);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC3309b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31093b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1632D f31094c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1641h f31095d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f31096e;

        /* loaded from: classes5.dex */
        static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f31097a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f31098b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f31099c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C1632D f31100d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C1641h f31101e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f31102f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PreRegisterWorker preRegisterWorker, String str, C1632D c1632d, C1641h c1641h, int i8, S5.d dVar) {
                super(2, dVar);
                this.f31098b = preRegisterWorker;
                this.f31099c = str;
                this.f31100d = c1632d;
                this.f31101e = c1641h;
                this.f31102f = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f31098b, this.f31099c, this.f31100d, this.f31101e, this.f31102f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f31097a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    PreRegisterWorker preRegisterWorker = this.f31098b;
                    String str = this.f31099c;
                    C1632D c1632d = this.f31100d;
                    C1641h c1641h = this.f31101e;
                    int i9 = this.f31102f;
                    this.f31097a = 1;
                    if (preRegisterWorker.g(str, c1632d, c1641h, i9, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        e(String str, C1632D c1632d, C1641h c1641h, int i8) {
            this.f31093b = str;
            this.f31094c = c1632d;
            this.f31095d = c1641h;
            this.f31096e = i8;
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception exc) {
            C3683w.f36547a.o(PreRegisterWorker.this.f31078a, this.f31095d, this.f31096e, null, this.f31094c);
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(PreRegisterWorker.this, this.f31093b, this.f31094c, this.f31095d, this.f31096e, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreRegisterWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(params, "params");
        this.f31078a = context;
        this.f31078a = j.f3824g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(String str, C1632D c1632d, C1641h c1641h, int i8, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(str, this, c1641h, i8, c1632d, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(C1632D c1632d, C1641h c1641h, int i8) {
        String l02 = c1641h.l0();
        if (l02 != null) {
            s.h().l(l02).e(new e(l02, c1632d, c1641h, i8));
        } else {
            C3683w.f36547a.o(this.f31078a, c1641h, i8, null, c1632d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList i(ArrayList arrayList, C3674n c3674n) {
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                C1632D c1632d = (C1632D) it.next();
                Iterator it2 = arrayList.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    if (c1632d.b() == ((C1632D) it2.next()).b()) {
                        i8++;
                    }
                }
                if (i8 > 1) {
                    c1632d.i(this.f31078a);
                    c1632d.h(this.f31078a);
                    z8 = true;
                }
            }
            if (z8) {
                new C3678r(this.f31078a).a("preregister_repeated");
                return c3674n.p0();
            }
            return arrayList;
        }
        return arrayList;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        try {
            AbstractC3364k.d(N.a(C3347b0.b()), null, null, new c(null), 3, null);
            return success;
        } catch (Exception e8) {
            e8.printStackTrace();
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            AbstractC3255y.h(failure, "failure()");
            return failure;
        }
    }
}
