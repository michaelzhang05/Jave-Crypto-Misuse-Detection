package com.uptodown.workers;

import E4.j;
import L5.I;
import L5.t;
import S4.i;
import W4.r;
import X4.C1498h;
import X4.D;
import X5.n;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.squareup.picasso.s;
import i2.InterfaceC2774b;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import l5.C3326n;
import l5.C3330r;
import l5.C3335w;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class PreRegisterWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30045b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f30046a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f30047a;

        /* loaded from: classes5.dex */
        public static final class a implements r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f30049a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ D f30050b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f30051c;

            a(PreRegisterWorker preRegisterWorker, D d8, int i8) {
                this.f30049a = preRegisterWorker;
                this.f30050b = d8;
                this.f30051c = i8;
            }

            @Override // W4.r
            public void c(int i8) {
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                this.f30049a.h(this.f30050b, appInfo, this.f30051c);
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f30047a == 0) {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                X4.I P8 = new C3312F(PreRegisterWorker.this.f30046a).P();
                if (!P8.b() && P8.d() != null) {
                    String d8 = P8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = P8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i8 = 0; i8 < length; i8++) {
                                D.a aVar = D.f12335f;
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                                AbstractC3159y.h(jSONObject2, "jsonArrayUpcomingReleases.getJSONObject(i)");
                                D b8 = aVar.b(jSONObject2);
                                arrayList.add(b8);
                                b8.h(PreRegisterWorker.this.f30046a);
                            }
                        }
                        C3326n a8 = C3326n.f34504t.a(PreRegisterWorker.this.f30046a);
                        a8.a();
                        ArrayList i9 = PreRegisterWorker.this.i(a8.p0(), a8);
                        a8.g();
                        Iterator it = i9.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            int i11 = i10 + 1;
                            D d10 = (D) it.next();
                            Iterator it2 = arrayList.iterator();
                            boolean z8 = false;
                            while (it2.hasNext()) {
                                if (d10.b() == ((D) it2.next()).b()) {
                                    z8 = true;
                                }
                            }
                            if (!z8) {
                                new i(PreRegisterWorker.this.f30046a, d10.b(), new a(PreRegisterWorker.this, d10, i10), N.a(C2812b0.b()));
                            }
                            i10 = i11;
                        }
                    }
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f30052a;

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f30052a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PreRegisterWorker preRegisterWorker = PreRegisterWorker.this;
                this.f30052a = 1;
                if (preRegisterWorker.f(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f30054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PreRegisterWorker f30056c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1498h f30057d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30058e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D f30059f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, PreRegisterWorker preRegisterWorker, C1498h c1498h, int i8, D d8, P5.d dVar) {
            super(2, dVar);
            this.f30055b = str;
            this.f30056c = preRegisterWorker;
            this.f30057d = c1498h;
            this.f30058e = i8;
            this.f30059f = d8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f30055b, this.f30056c, this.f30057d, this.f30058e, this.f30059f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            Q5.b.e();
            if (this.f30054a == 0) {
                t.b(obj);
                try {
                    bitmap = s.h().l(this.f30055b).g();
                } catch (IOException unused) {
                    bitmap = null;
                }
                C3335w.f34546a.o(this.f30056c.f30046a, this.f30057d, this.f30058e, bitmap, this.f30059f);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC2774b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ D f30062c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1498h f30063d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30064e;

        /* loaded from: classes5.dex */
        static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f30065a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f30066b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30067c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ D f30068d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C1498h f30069e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f30070f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PreRegisterWorker preRegisterWorker, String str, D d8, C1498h c1498h, int i8, P5.d dVar) {
                super(2, dVar);
                this.f30066b = preRegisterWorker;
                this.f30067c = str;
                this.f30068d = d8;
                this.f30069e = c1498h;
                this.f30070f = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f30066b, this.f30067c, this.f30068d, this.f30069e, this.f30070f, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f30065a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    PreRegisterWorker preRegisterWorker = this.f30066b;
                    String str = this.f30067c;
                    D d8 = this.f30068d;
                    C1498h c1498h = this.f30069e;
                    int i9 = this.f30070f;
                    this.f30065a = 1;
                    if (preRegisterWorker.g(str, d8, c1498h, i9, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        e(String str, D d8, C1498h c1498h, int i8) {
            this.f30061b = str;
            this.f30062c = d8;
            this.f30063d = c1498h;
            this.f30064e = i8;
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception exc) {
            C3335w.f34546a.o(PreRegisterWorker.this.f30046a, this.f30063d, this.f30064e, null, this.f30062c);
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(PreRegisterWorker.this, this.f30061b, this.f30062c, this.f30063d, this.f30064e, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreRegisterWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30046a = context;
        this.f30046a = j.f2274g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(String str, D d8, C1498h c1498h, int i8, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(str, this, c1498h, i8, d8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(D d8, C1498h c1498h, int i8) {
        String l02 = c1498h.l0();
        if (l02 != null) {
            s.h().l(l02).e(new e(l02, d8, c1498h, i8));
        } else {
            C3335w.f34546a.o(this.f30046a, c1498h, i8, null, d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList i(ArrayList arrayList, C3326n c3326n) {
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                D d8 = (D) it.next();
                Iterator it2 = arrayList.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    if (d8.b() == ((D) it2.next()).b()) {
                        i8++;
                    }
                }
                if (i8 > 1) {
                    d8.i(this.f30046a);
                    d8.h(this.f30046a);
                    z8 = true;
                }
            }
            if (z8) {
                new C3330r(this.f30046a).a("preregister_repeated");
                return c3326n.p0();
            }
            return arrayList;
        }
        return arrayList;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        try {
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new c(null), 3, null);
            return success;
        } catch (Exception e8) {
            e8.printStackTrace();
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            AbstractC3159y.h(failure, "failure()");
            return failure;
        }
    }
}
