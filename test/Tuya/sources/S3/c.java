package S3;

import L5.I;
import L5.InterfaceC1227k;
import L5.s;
import L5.t;
import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.MBridgeConstans;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class c implements S3.b {

    /* renamed from: c, reason: collision with root package name */
    private static final b f9023c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0190c f9024a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9025b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9026a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9026a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC0190c interfaceC0190c = c.this.f9024a;
                this.f9026a = 1;
                obj = interfaceC0190c.a(this);
                if (obj == e8) {
                    return e8;
                }
            }
            S3.a aVar = (S3.a) obj;
            if (aVar == null || c.this.f9025b != aVar.c()) {
                c.this.e();
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(Context context) {
            Object b8;
            try {
                s.a aVar = s.f6511b;
                b8 = s.b(Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            } catch (Throwable th) {
                s.a aVar2 = s.f6511b;
                b8 = s.b(t.a(th));
            }
            if (s.g(b8)) {
                b8 = -1;
            }
            return ((Number) b8).intValue();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: S3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0190c {

        /* renamed from: S3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC0190c {

            /* renamed from: d, reason: collision with root package name */
            private static final C0191a f9028d = new C0191a(null);

            /* renamed from: a, reason: collision with root package name */
            private final int f9029a;

            /* renamed from: b, reason: collision with root package name */
            private final P5.g f9030b;

            /* renamed from: c, reason: collision with root package name */
            private final InterfaceC1227k f9031c;

            /* renamed from: S3.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0191a {
                private C0191a() {
                }

                public /* synthetic */ C0191a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* renamed from: S3.c$c$a$b */
            /* loaded from: classes4.dex */
            static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f9032a;

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
                    if (this.f9032a == 0) {
                        t.b(obj);
                        int i8 = a.this.d().getInt("app_version", 0);
                        String string = a.this.d().getString(MBridgeConstans.SDK_APP_ID, null);
                        if (string == null) {
                            return null;
                        }
                        return new S3.a(string, i8);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* renamed from: S3.c$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0192c extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Context f9034a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0192c(Context context) {
                    super(0);
                    this.f9034a = context;
                }

                @Override // kotlin.jvm.functions.Function0
                public final SharedPreferences invoke() {
                    return this.f9034a.getSharedPreferences("app_info", 0);
                }
            }

            public a(Context context, int i8, P5.g workContext) {
                AbstractC3159y.i(context, "context");
                AbstractC3159y.i(workContext, "workContext");
                this.f9029a = i8;
                this.f9030b = workContext;
                this.f9031c = L5.l.b(new C0192c(context));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SharedPreferences d() {
                Object value = this.f9031c.getValue();
                AbstractC3159y.h(value, "getValue(...)");
                return (SharedPreferences) value;
            }

            @Override // S3.c.InterfaceC0190c
            public Object a(P5.d dVar) {
                return AbstractC2825i.g(this.f9030b, new b(null), dVar);
            }

            @Override // S3.c.InterfaceC0190c
            public void b(S3.a appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                d().edit().putInt("app_version", this.f9029a).putString(MBridgeConstans.SDK_APP_ID, appInfo.b()).apply();
            }
        }

        Object a(P5.d dVar);

        void b(S3.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9035a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9036b;

        /* renamed from: d, reason: collision with root package name */
        int f9038d;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9036b = obj;
            this.f9038d |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(InterfaceC0190c store, int i8, P5.g workContext) {
        AbstractC3159y.i(store, "store");
        AbstractC3159y.i(workContext, "workContext");
        this.f9024a = store;
        this.f9025b = i8;
        AbstractC2829k.d(N.a(workContext), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S3.a e() {
        String uuid = UUID.randomUUID().toString();
        AbstractC3159y.h(uuid, "toString(...)");
        S3.a aVar = new S3.a(uuid, this.f9025b);
        this.f9024a.b(aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // S3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(P5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof S3.c.d
            if (r0 == 0) goto L13
            r0 = r5
            S3.c$d r0 = (S3.c.d) r0
            int r1 = r0.f9038d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9038d = r1
            goto L18
        L13:
            S3.c$d r0 = new S3.c$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9036b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f9038d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f9035a
            S3.c r0 = (S3.c) r0
            L5.t.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            L5.t.b(r5)
            S3.c$c r5 = r4.f9024a
            r0.f9035a = r4
            r0.f9038d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            S3.a r5 = (S3.a) r5
            if (r5 != 0) goto L4e
            S3.a r5 = r0.e()
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.c.a(P5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, P5.g workContext) {
        this(context, f9023c.b(context), workContext);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i8, P5.g workContext) {
        this(new InterfaceC0190c.a(context, i8, workContext), i8, workContext);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(workContext, "workContext");
    }
}
