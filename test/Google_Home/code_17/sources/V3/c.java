package V3;

import O5.I;
import O5.InterfaceC1355k;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.MBridgeConstans;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.M;
import l6.N;

/* loaded from: classes4.dex */
public final class c implements V3.b {

    /* renamed from: c, reason: collision with root package name */
    private static final b f10666c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0215c f10667a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10668b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f10669a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f10669a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC0215c interfaceC0215c = c.this.f10667a;
                this.f10669a = 1;
                obj = interfaceC0215c.a(this);
                if (obj == e8) {
                    return e8;
                }
            }
            V3.a aVar = (V3.a) obj;
            if (aVar == null || c.this.f10668b != aVar.b()) {
                c.this.e();
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
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
                s.a aVar = s.f8302b;
                b8 = s.b(Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            if (s.g(b8)) {
                b8 = -1;
            }
            return ((Number) b8).intValue();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: V3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0215c {

        /* renamed from: V3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC0215c {

            /* renamed from: d, reason: collision with root package name */
            private static final C0216a f10671d = new C0216a(null);

            /* renamed from: a, reason: collision with root package name */
            private final int f10672a;

            /* renamed from: b, reason: collision with root package name */
            private final S5.g f10673b;

            /* renamed from: c, reason: collision with root package name */
            private final InterfaceC1355k f10674c;

            /* renamed from: V3.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0216a {
                private C0216a() {
                }

                public /* synthetic */ C0216a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            /* renamed from: V3.c$c$a$b */
            /* loaded from: classes4.dex */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f10675a;

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
                    if (this.f10675a == 0) {
                        t.b(obj);
                        int i8 = a.this.d().getInt("app_version", 0);
                        String string = a.this.d().getString(MBridgeConstans.SDK_APP_ID, null);
                        if (string == null) {
                            return null;
                        }
                        return new V3.a(string, i8);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* renamed from: V3.c$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0217c extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Context f10677a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0217c(Context context) {
                    super(0);
                    this.f10677a = context;
                }

                @Override // kotlin.jvm.functions.Function0
                public final SharedPreferences invoke() {
                    return this.f10677a.getSharedPreferences("app_info", 0);
                }
            }

            public a(Context context, int i8, S5.g workContext) {
                AbstractC3255y.i(context, "context");
                AbstractC3255y.i(workContext, "workContext");
                this.f10672a = i8;
                this.f10673b = workContext;
                this.f10674c = O5.l.b(new C0217c(context));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SharedPreferences d() {
                Object value = this.f10674c.getValue();
                AbstractC3255y.h(value, "getValue(...)");
                return (SharedPreferences) value;
            }

            @Override // V3.c.InterfaceC0215c
            public Object a(S5.d dVar) {
                return AbstractC3360i.g(this.f10673b, new b(null), dVar);
            }

            @Override // V3.c.InterfaceC0215c
            public void b(V3.a appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                d().edit().putInt("app_version", this.f10672a).putString(MBridgeConstans.SDK_APP_ID, appInfo.a()).apply();
            }
        }

        Object a(S5.d dVar);

        void b(V3.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f10678a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10679b;

        /* renamed from: d, reason: collision with root package name */
        int f10681d;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10679b = obj;
            this.f10681d |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    public c(InterfaceC0215c store, int i8, S5.g workContext) {
        AbstractC3255y.i(store, "store");
        AbstractC3255y.i(workContext, "workContext");
        this.f10667a = store;
        this.f10668b = i8;
        AbstractC3364k.d(N.a(workContext), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V3.a e() {
        String uuid = UUID.randomUUID().toString();
        AbstractC3255y.h(uuid, "toString(...)");
        V3.a aVar = new V3.a(uuid, this.f10668b);
        this.f10667a.b(aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // V3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V3.c.d
            if (r0 == 0) goto L13
            r0 = r5
            V3.c$d r0 = (V3.c.d) r0
            int r1 = r0.f10681d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10681d = r1
            goto L18
        L13:
            V3.c$d r0 = new V3.c$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10679b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f10681d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f10678a
            V3.c r0 = (V3.c) r0
            O5.t.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            O5.t.b(r5)
            V3.c$c r5 = r4.f10667a
            r0.f10678a = r4
            r0.f10681d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            V3.a r5 = (V3.a) r5
            if (r5 != 0) goto L4e
            V3.a r5 = r0.e()
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.c.a(S5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, S5.g workContext) {
        this(context, f10666c.b(context), workContext);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i8, S5.g workContext) {
        this(new InterfaceC0215c.a(context, i8, workContext), i8, workContext);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(workContext, "workContext");
    }
}
