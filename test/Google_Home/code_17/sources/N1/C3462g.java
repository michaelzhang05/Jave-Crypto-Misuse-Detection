package n1;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3362j;
import l6.M;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* renamed from: n1.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3462g {

    /* renamed from: c, reason: collision with root package name */
    private static final b f35333c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Preferences.Key f35334d = PreferencesKeys.booleanKey("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    private static final Preferences.Key f35335e = PreferencesKeys.doubleKey("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    private static final Preferences.Key f35336f = PreferencesKeys.intKey("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    private static final Preferences.Key f35337g = PreferencesKeys.intKey("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    private static final Preferences.Key f35338h = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    private final DataStore f35339a;

    /* renamed from: b, reason: collision with root package name */
    private C3460e f35340b;

    /* renamed from: n1.g$a */
    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f35341a;

        /* renamed from: b, reason: collision with root package name */
        int f35342b;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3462g c3462g;
            Object e8 = T5.b.e();
            int i8 = this.f35342b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3462g = (C3462g) this.f35341a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3462g c3462g2 = C3462g.this;
                InterfaceC3706f data = c3462g2.f35339a.getData();
                this.f35341a = c3462g2;
                this.f35342b = 1;
                Object w8 = AbstractC3708h.w(data, this);
                if (w8 == e8) {
                    return e8;
                }
                c3462g = c3462g2;
                obj = w8;
            }
            c3462g.l(((Preferences) obj).toPreferences());
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: n1.g$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35344a;

        /* renamed from: c, reason: collision with root package name */
        int f35346c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35344a = obj;
            this.f35346c |= Integer.MIN_VALUE;
            return C3462g.this.h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35347a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35348b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f35349c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f35350d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3462g f35351e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Preferences.Key key, C3462g c3462g, S5.d dVar) {
            super(2, dVar);
            this.f35349c = obj;
            this.f35350d = key;
            this.f35351e = c3462g;
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, S5.d dVar) {
            return ((d) create(mutablePreferences, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(this.f35349c, this.f35350d, this.f35351e, dVar);
            dVar2.f35348b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f35347a == 0) {
                t.b(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f35348b;
                Object obj2 = this.f35349c;
                if (obj2 != null) {
                    mutablePreferences.set(this.f35350d, obj2);
                } else {
                    mutablePreferences.remove(this.f35350d);
                }
                this.f35351e.l(mutablePreferences);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3462g(DataStore dataStore) {
        AbstractC3255y.i(dataStore, "dataStore");
        this.f35339a = dataStore;
        AbstractC3362j.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(androidx.datastore.preferences.core.Preferences.Key r6, java.lang.Object r7, S5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof n1.C3462g.c
            if (r0 == 0) goto L13
            r0 = r8
            n1.g$c r0 = (n1.C3462g.c) r0
            int r1 = r0.f35346c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35346c = r1
            goto L18
        L13:
            n1.g$c r0 = new n1.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f35344a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f35346c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            O5.t.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            O5.t.b(r8)
            androidx.datastore.core.DataStore r8 = r5.f35339a     // Catch: java.io.IOException -> L29
            n1.g$d r2 = new n1.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f35346c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            O5.I r6 = O5.I.f8278a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C3462g.h(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Preferences preferences) {
        this.f35340b = new C3460e((Boolean) preferences.get(f35334d), (Double) preferences.get(f35335e), (Integer) preferences.get(f35336f), (Integer) preferences.get(f35337g), (Long) preferences.get(f35338h));
    }

    public final boolean d() {
        C3460e c3460e = this.f35340b;
        C3460e c3460e2 = null;
        if (c3460e == null) {
            AbstractC3255y.y("sessionConfigs");
            c3460e = null;
        }
        Long b8 = c3460e.b();
        C3460e c3460e3 = this.f35340b;
        if (c3460e3 == null) {
            AbstractC3255y.y("sessionConfigs");
        } else {
            c3460e2 = c3460e3;
        }
        Integer a8 = c3460e2.a();
        if (b8 != null && a8 != null && (System.currentTimeMillis() - b8.longValue()) / 1000 < a8.intValue()) {
            return false;
        }
        return true;
    }

    public final Integer e() {
        C3460e c3460e = this.f35340b;
        if (c3460e == null) {
            AbstractC3255y.y("sessionConfigs");
            c3460e = null;
        }
        return c3460e.d();
    }

    public final Double f() {
        C3460e c3460e = this.f35340b;
        if (c3460e == null) {
            AbstractC3255y.y("sessionConfigs");
            c3460e = null;
        }
        return c3460e.e();
    }

    public final Boolean g() {
        C3460e c3460e = this.f35340b;
        if (c3460e == null) {
            AbstractC3255y.y("sessionConfigs");
            c3460e = null;
        }
        return c3460e.c();
    }

    public final Object i(Double d8, S5.d dVar) {
        Object h8 = h(f35335e, d8, dVar);
        if (h8 == T5.b.e()) {
            return h8;
        }
        return I.f8278a;
    }

    public final Object j(Integer num, S5.d dVar) {
        Object h8 = h(f35337g, num, dVar);
        if (h8 == T5.b.e()) {
            return h8;
        }
        return I.f8278a;
    }

    public final Object k(Long l8, S5.d dVar) {
        Object h8 = h(f35338h, l8, dVar);
        if (h8 == T5.b.e()) {
            return h8;
        }
        return I.f8278a;
    }

    public final Object m(Integer num, S5.d dVar) {
        Object h8 = h(f35336f, num, dVar);
        if (h8 == T5.b.e()) {
            return h8;
        }
        return I.f8278a;
    }

    public final Object n(Boolean bool, S5.d dVar) {
        Object h8 = h(f35334d, bool, dVar);
        if (h8 == T5.b.e()) {
            return h8;
        }
        return I.f8278a;
    }
}
