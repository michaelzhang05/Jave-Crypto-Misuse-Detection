package l1;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import d6.InterfaceC2759d;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class x implements com.google.firebase.sessions.a {

    /* renamed from: f, reason: collision with root package name */
    private static final c f34366f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC2759d f34367g = PreferenceDataStoreDelegateKt.preferencesDataStore$default(w.f34362a.a(), new ReplaceFileCorruptionHandler(b.f34375a), null, null, 12, null);

    /* renamed from: b, reason: collision with root package name */
    private final Context f34368b;

    /* renamed from: c, reason: collision with root package name */
    private final S5.g f34369c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f34370d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3706f f34371e;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34372a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l1.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0786a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f34374a;

            C0786a(x xVar) {
                this.f34374a = xVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(l lVar, S5.d dVar) {
                this.f34374a.f34370d.set(lVar);
                return O5.I.f8278a;
            }
        }

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
            int i8 = this.f34372a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3706f interfaceC3706f = x.this.f34371e;
                C0786a c0786a = new C0786a(x.this);
                this.f34372a = 1;
                if (interfaceC3706f.collect(c0786a, this) == e8) {
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

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34375a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Preferences invoke(CorruptionException ex) {
            AbstractC3255y.i(ex, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + v.f34361a.e() + '.', ex);
            return PreferencesFactory.createEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ h6.i[] f34376a = {U.h(new kotlin.jvm.internal.M(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore b(Context context) {
            return (DataStore) x.f34367g.getValue(context, f34376a[0]);
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f34377a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Preferences.Key f34378b = PreferencesKeys.stringKey("session_id");

        private d() {
        }

        public final Preferences.Key a() {
            return f34378b;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f34379a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34380b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34381c;

        e(S5.d dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f34379a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f34380b;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f34381c);
                Preferences createEmpty = PreferencesFactory.createEmpty();
                this.f34380b = null;
                this.f34379a = 1;
                if (interfaceC3707g.emit(createEmpty, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1669o
        public final Object invoke(InterfaceC3707g interfaceC3707g, Throwable th, S5.d dVar) {
            e eVar = new e(dVar);
            eVar.f34380b = interfaceC3707g;
            eVar.f34381c = th;
            return eVar.invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f34382a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f34383b;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f34384a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f34385b;

            /* renamed from: l1.x$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0787a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f34386a;

                /* renamed from: b, reason: collision with root package name */
                int f34387b;

                public C0787a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f34386a = obj;
                    this.f34387b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3707g interfaceC3707g, x xVar) {
                this.f34384a = interfaceC3707g;
                this.f34385b = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // o6.InterfaceC3707g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, S5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof l1.x.f.a.C0787a
                    if (r0 == 0) goto L13
                    r0 = r6
                    l1.x$f$a$a r0 = (l1.x.f.a.C0787a) r0
                    int r1 = r0.f34387b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f34387b = r1
                    goto L18
                L13:
                    l1.x$f$a$a r0 = new l1.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f34386a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f34387b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    O5.t.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    O5.t.b(r6)
                    o6.g r6 = r4.f34384a
                    androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                    l1.x r2 = r4.f34385b
                    l1.l r5 = l1.x.h(r2, r5)
                    r0.f34387b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    O5.I r5 = O5.I.f8278a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: l1.x.f.a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public f(InterfaceC3706f interfaceC3706f, x xVar) {
            this.f34382a = interfaceC3706f;
            this.f34383b = xVar;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f34382a.collect(new a(interfaceC3707g, this.f34383b), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34389a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34391c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f34392a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34393b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f34394c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, S5.d dVar) {
                super(2, dVar);
                this.f34394c = str;
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, S5.d dVar) {
                return ((a) create(mutablePreferences, dVar)).invokeSuspend(O5.I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                a aVar = new a(this.f34394c, dVar);
                aVar.f34393b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f34392a == 0) {
                    O5.t.b(obj);
                    ((MutablePreferences) this.f34393b).set(d.f34377a.a(), this.f34394c);
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, S5.d dVar) {
            super(2, dVar);
            this.f34391c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f34391c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f34389a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    DataStore b8 = x.f34366f.b(x.this.f34368b);
                    a aVar = new a(this.f34391c, null);
                    this.f34389a = 1;
                    if (PreferencesKt.edit(b8, aVar, this) == e8) {
                        return e8;
                    }
                }
            } catch (IOException e9) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e9);
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public x(Context context, S5.g backgroundDispatcher) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(backgroundDispatcher, "backgroundDispatcher");
        this.f34368b = context;
        this.f34369c = backgroundDispatcher;
        this.f34370d = new AtomicReference();
        this.f34371e = new f(AbstractC3708h.f(f34366f.b(context).getData(), new e(null)), this);
        AbstractC3364k.d(N.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l i(Preferences preferences) {
        return new l((String) preferences.get(d.f34377a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public String a() {
        l lVar = (l) this.f34370d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(String sessionId) {
        AbstractC3255y.i(sessionId, "sessionId");
        AbstractC3364k.d(N.a(this.f34369c), null, null, new g(sessionId, null), 3, null);
    }
}
