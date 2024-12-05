package com.uptodown.workers;

import O5.t;
import S5.d;
import a5.I;
import a5.Q;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3660F;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class GetUserDataWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31066b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31067a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.workers.GetUserDataWorker$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0708a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f31068a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f31069b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0708a(Context context, d dVar) {
                super(2, dVar);
                this.f31069b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0708a(this.f31069b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String d8;
                int i8;
                T5.b.e();
                if (this.f31068a == 0) {
                    t.b(obj);
                    I q02 = new C3660F(this.f31069b).q0();
                    if (!q02.b() && (d8 = q02.d()) != null && d8.length() != 0) {
                        String d9 = q02.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            Q e8 = Q.f14058k.e(this.f31069b);
                            JSONObject jsonObjectData = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (e8 != null) {
                                Context context = this.f31069b;
                                AbstractC3255y.h(jsonObjectData, "jsonObjectData");
                                e8.l(context, jsonObjectData);
                            }
                            if (e8 != null) {
                                e8.H(this.f31069b);
                            }
                        }
                    }
                    if (q02.e() == 401) {
                        Q.f14058k.a(this.f31069b);
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((C0708a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f31070a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f31071b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Z4.I f31072c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Z4.I i8, d dVar) {
                super(2, dVar);
                this.f31071b = context;
                this.f31072c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new b(this.f31071b, this.f31072c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String d8;
                int i8;
                T5.b.e();
                if (this.f31070a == 0) {
                    t.b(obj);
                    I q02 = new C3660F(this.f31071b).q0();
                    if (!q02.b() && (d8 = q02.d()) != null && d8.length() != 0) {
                        String d9 = q02.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            Q e8 = Q.f14058k.e(this.f31071b);
                            JSONObject jsonObjectData = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (e8 != null) {
                                Context context = this.f31071b;
                                AbstractC3255y.h(jsonObjectData, "jsonObjectData");
                                e8.l(context, jsonObjectData);
                            }
                            if (e8 != null) {
                                e8.H(this.f31071b);
                            }
                            if (e8 != null) {
                                this.f31072c.a();
                            }
                        }
                    }
                    if (q02.e() == 401) {
                        Q.f14058k.a(this.f31071b);
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        private a() {
        }

        public final Object a(Context context, d dVar) {
            Object g8 = AbstractC3360i.g(C3347b0.b(), new C0708a(context, null), dVar);
            if (g8 == T5.b.e()) {
                return g8;
            }
            return O5.I.f8278a;
        }

        public final Object b(Context context, Z4.I i8, d dVar) {
            Object g8 = AbstractC3360i.g(C3347b0.b(), new b(context, i8, null), dVar);
            if (g8 == T5.b.e()) {
                return g8;
            }
            return O5.I.f8278a;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31073a;

        b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f31073a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = GetUserDataWorker.f31066b;
                Context context = GetUserDataWorker.this.f31067a;
                this.f31073a = 1;
                if (aVar.a(context, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserDataWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(params, "params");
        this.f31067a = context;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new b(null), 3, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        return success;
    }
}
