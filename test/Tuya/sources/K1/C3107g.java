package k1;

import L5.I;
import L5.t;
import X5.n;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import i6.AbstractC2827j;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

/* renamed from: k1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3107g {

    /* renamed from: c, reason: collision with root package name */
    private static final b f33341c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Preferences.Key f33342d = PreferencesKeys.booleanKey("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    private static final Preferences.Key f33343e = PreferencesKeys.doubleKey("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    private static final Preferences.Key f33344f = PreferencesKeys.intKey("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    private static final Preferences.Key f33345g = PreferencesKeys.intKey("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    private static final Preferences.Key f33346h = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    private final DataStore f33347a;

    /* renamed from: b, reason: collision with root package name */
    private C3105e f33348b;

    /* renamed from: k1.g$a */
    /* loaded from: classes3.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f33349a;

        /* renamed from: b, reason: collision with root package name */
        int f33350b;

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
            C3107g c3107g;
            Object e8 = Q5.b.e();
            int i8 = this.f33350b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3107g = (C3107g) this.f33349a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3107g c3107g2 = C3107g.this;
                InterfaceC3358f data = c3107g2.f33347a.getData();
                this.f33349a = c3107g2;
                this.f33350b = 1;
                Object u8 = AbstractC3360h.u(data, this);
                if (u8 == e8) {
                    return e8;
                }
                c3107g = c3107g2;
                obj = u8;
            }
            c3107g.l(((Preferences) obj).toPreferences());
            return I.f6487a;
        }
    }

    /* renamed from: k1.g$b */
    /* loaded from: classes3.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.g$c */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f33352a;

        /* renamed from: c, reason: collision with root package name */
        int f33354c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33352a = obj;
            this.f33354c |= Integer.MIN_VALUE;
            return C3107g.this.h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.g$d */
    /* loaded from: classes3.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f33355a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33356b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f33357c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Preferences.Key f33358d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3107g f33359e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Preferences.Key key, C3107g c3107g, P5.d dVar) {
            super(2, dVar);
            this.f33357c = obj;
            this.f33358d = key;
            this.f33359e = c3107g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(this.f33357c, this.f33358d, this.f33359e, dVar);
            dVar2.f33356b = obj;
            return dVar2;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, P5.d dVar) {
            return ((d) create(mutablePreferences, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f33355a == 0) {
                t.b(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f33356b;
                Object obj2 = this.f33357c;
                if (obj2 != null) {
                    mutablePreferences.set(this.f33358d, obj2);
                } else {
                    mutablePreferences.remove(this.f33358d);
                }
                this.f33359e.l(mutablePreferences);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3107g(DataStore dataStore) {
        AbstractC3159y.i(dataStore, "dataStore");
        this.f33347a = dataStore;
        AbstractC2827j.b(null, new a(null), 1, null);
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
    public final java.lang.Object h(androidx.datastore.preferences.core.Preferences.Key r6, java.lang.Object r7, P5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof k1.C3107g.c
            if (r0 == 0) goto L13
            r0 = r8
            k1.g$c r0 = (k1.C3107g.c) r0
            int r1 = r0.f33354c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33354c = r1
            goto L18
        L13:
            k1.g$c r0 = new k1.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f33352a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f33354c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            L5.t.b(r8)     // Catch: java.io.IOException -> L29
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
            L5.t.b(r8)
            androidx.datastore.core.DataStore r8 = r5.f33347a     // Catch: java.io.IOException -> L29
            k1.g$d r2 = new k1.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f33354c = r3     // Catch: java.io.IOException -> L29
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
            L5.I r6 = L5.I.f6487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C3107g.h(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Preferences preferences) {
        this.f33348b = new C3105e((Boolean) preferences.get(f33342d), (Double) preferences.get(f33343e), (Integer) preferences.get(f33344f), (Integer) preferences.get(f33345g), (Long) preferences.get(f33346h));
    }

    public final boolean d() {
        C3105e c3105e = this.f33348b;
        C3105e c3105e2 = null;
        if (c3105e == null) {
            AbstractC3159y.y("sessionConfigs");
            c3105e = null;
        }
        Long b8 = c3105e.b();
        C3105e c3105e3 = this.f33348b;
        if (c3105e3 == null) {
            AbstractC3159y.y("sessionConfigs");
        } else {
            c3105e2 = c3105e3;
        }
        Integer a8 = c3105e2.a();
        if (b8 != null && a8 != null && (System.currentTimeMillis() - b8.longValue()) / 1000 < a8.intValue()) {
            return false;
        }
        return true;
    }

    public final Integer e() {
        C3105e c3105e = this.f33348b;
        if (c3105e == null) {
            AbstractC3159y.y("sessionConfigs");
            c3105e = null;
        }
        return c3105e.d();
    }

    public final Double f() {
        C3105e c3105e = this.f33348b;
        if (c3105e == null) {
            AbstractC3159y.y("sessionConfigs");
            c3105e = null;
        }
        return c3105e.e();
    }

    public final Boolean g() {
        C3105e c3105e = this.f33348b;
        if (c3105e == null) {
            AbstractC3159y.y("sessionConfigs");
            c3105e = null;
        }
        return c3105e.c();
    }

    public final Object i(Double d8, P5.d dVar) {
        Object h8 = h(f33343e, d8, dVar);
        if (h8 == Q5.b.e()) {
            return h8;
        }
        return I.f6487a;
    }

    public final Object j(Integer num, P5.d dVar) {
        Object h8 = h(f33345g, num, dVar);
        if (h8 == Q5.b.e()) {
            return h8;
        }
        return I.f6487a;
    }

    public final Object k(Long l8, P5.d dVar) {
        Object h8 = h(f33346h, l8, dVar);
        if (h8 == Q5.b.e()) {
            return h8;
        }
        return I.f6487a;
    }

    public final Object m(Integer num, P5.d dVar) {
        Object h8 = h(f33344f, num, dVar);
        if (h8 == Q5.b.e()) {
            return h8;
        }
        return I.f6487a;
    }

    public final Object n(Boolean bool, P5.d dVar) {
        Object h8 = h(f33342d, bool, dVar);
        if (h8 == Q5.b.e()) {
            return h8;
        }
        return I.f6487a;
    }
}
