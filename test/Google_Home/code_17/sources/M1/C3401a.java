package m1;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m1.InterfaceC3402b;
import u6.AbstractC4065c;
import u6.InterfaceC4063a;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3401a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3401a f34695a = new C3401a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f34696b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0793a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4063a f34697a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC3402b f34698b;

        public C0793a(InterfaceC4063a mutex, InterfaceC3402b interfaceC3402b) {
            AbstractC3255y.i(mutex, "mutex");
            this.f34697a = mutex;
            this.f34698b = interfaceC3402b;
        }

        public final InterfaceC4063a a() {
            return this.f34697a;
        }

        public final InterfaceC3402b b() {
            return this.f34698b;
        }

        public final void c(InterfaceC3402b interfaceC3402b) {
            this.f34698b = interfaceC3402b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0793a)) {
                return false;
            }
            C0793a c0793a = (C0793a) obj;
            if (AbstractC3255y.d(this.f34697a, c0793a.f34697a) && AbstractC3255y.d(this.f34698b, c0793a.f34698b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f34697a.hashCode() * 31;
            InterfaceC3402b interfaceC3402b = this.f34698b;
            if (interfaceC3402b == null) {
                hashCode = 0;
            } else {
                hashCode = interfaceC3402b.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Dependency(mutex=" + this.f34697a + ", subscriber=" + this.f34698b + ')';
        }

        public /* synthetic */ C0793a(InterfaceC4063a interfaceC4063a, InterfaceC3402b interfaceC3402b, int i8, AbstractC3247p abstractC3247p) {
            this(interfaceC4063a, (i8 & 2) != 0 ? null : interfaceC3402b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f34699a;

        /* renamed from: b, reason: collision with root package name */
        Object f34700b;

        /* renamed from: c, reason: collision with root package name */
        Object f34701c;

        /* renamed from: d, reason: collision with root package name */
        Object f34702d;

        /* renamed from: e, reason: collision with root package name */
        Object f34703e;

        /* renamed from: f, reason: collision with root package name */
        Object f34704f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f34705g;

        /* renamed from: i, reason: collision with root package name */
        int f34707i;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34705g = obj;
            this.f34707i |= Integer.MIN_VALUE;
            return C3401a.this.c(this);
        }
    }

    private C3401a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC3402b.a subscriberName) {
        AbstractC3255y.i(subscriberName, "subscriberName");
        if (subscriberName != InterfaceC3402b.a.PERFORMANCE) {
            Map dependencies = f34696b;
            if (dependencies.containsKey(subscriberName)) {
                Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
                return;
            }
            AbstractC3255y.h(dependencies, "dependencies");
            dependencies.put(subscriberName, new C0793a(AbstractC4065c.a(true), null, 2, 0 == true ? 1 : 0));
            Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    private final C0793a b(InterfaceC3402b.a aVar) {
        Map dependencies = f34696b;
        AbstractC3255y.h(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            AbstractC3255y.h(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0793a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(InterfaceC3402b subscriber) {
        AbstractC3255y.i(subscriber, "subscriber");
        InterfaceC3402b.a b8 = subscriber.b();
        C0793a b9 = f34695a.b(b8);
        if (b9.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + b8 + " already registered.");
            return;
        }
        b9.c(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + b8 + " registered.");
        InterfaceC4063a.C0902a.c(b9.a(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a1 -> B:10:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(S5.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof m1.C3401a.b
            if (r0 == 0) goto L13
            r0 = r11
            m1.a$b r0 = (m1.C3401a.b) r0
            int r1 = r0.f34707i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34707i = r1
            goto L18
        L13:
            m1.a$b r0 = new m1.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f34705g
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f34707i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f34704f
            java.lang.Object r5 = r0.f34703e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f34702d
            u6.a r6 = (u6.InterfaceC4063a) r6
            java.lang.Object r7 = r0.f34701c
            m1.b$a r7 = (m1.InterfaceC3402b.a) r7
            java.lang.Object r8 = r0.f34700b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f34699a
            java.util.Map r9 = (java.util.Map) r9
            O5.t.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            O5.t.b(r11)
            java.util.Map r11 = m1.C3401a.f34696b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.AbstractC3255y.h(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = P5.Q.d(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            m1.b$a r7 = (m1.InterfaceC3402b.a) r7
            java.lang.Object r11 = r11.getValue()
            m1.a$a r11 = (m1.C3401a.C0793a) r11
            u6.a r6 = r11.a()
            r0.f34699a = r5
            r0.f34700b = r8
            r0.f34701c = r7
            r0.f34702d = r6
            r0.f34703e = r5
            r0.f34704f = r2
            r0.f34707i = r3
            java.lang.Object r11 = r6.a(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            m1.a r11 = m1.C3401a.f34695a     // Catch: java.lang.Throwable -> Lb0
            m1.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.d(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.d(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C3401a.c(S5.d):java.lang.Object");
    }

    public final InterfaceC3402b d(InterfaceC3402b.a subscriberName) {
        AbstractC3255y.i(subscriberName, "subscriberName");
        InterfaceC3402b b8 = b(subscriberName).b();
        if (b8 != null) {
            return b8;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
