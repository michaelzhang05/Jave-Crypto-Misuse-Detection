package j1;

import android.util.Log;
import j$.util.DesugarCollections;
import j1.InterfaceC3048b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r6.AbstractC3692c;
import r6.InterfaceC3690a;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3047a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3047a f32719a = new C3047a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f32720b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0763a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3690a f32721a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC3048b f32722b;

        public C0763a(InterfaceC3690a mutex, InterfaceC3048b interfaceC3048b) {
            AbstractC3159y.i(mutex, "mutex");
            this.f32721a = mutex;
            this.f32722b = interfaceC3048b;
        }

        public final InterfaceC3690a a() {
            return this.f32721a;
        }

        public final InterfaceC3048b b() {
            return this.f32722b;
        }

        public final void c(InterfaceC3048b interfaceC3048b) {
            this.f32722b = interfaceC3048b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0763a)) {
                return false;
            }
            C0763a c0763a = (C0763a) obj;
            if (AbstractC3159y.d(this.f32721a, c0763a.f32721a) && AbstractC3159y.d(this.f32722b, c0763a.f32722b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f32721a.hashCode() * 31;
            InterfaceC3048b interfaceC3048b = this.f32722b;
            if (interfaceC3048b == null) {
                hashCode = 0;
            } else {
                hashCode = interfaceC3048b.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Dependency(mutex=" + this.f32721a + ", subscriber=" + this.f32722b + ')';
        }

        public /* synthetic */ C0763a(InterfaceC3690a interfaceC3690a, InterfaceC3048b interfaceC3048b, int i8, AbstractC3151p abstractC3151p) {
            this(interfaceC3690a, (i8 & 2) != 0 ? null : interfaceC3048b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f32723a;

        /* renamed from: b, reason: collision with root package name */
        Object f32724b;

        /* renamed from: c, reason: collision with root package name */
        Object f32725c;

        /* renamed from: d, reason: collision with root package name */
        Object f32726d;

        /* renamed from: e, reason: collision with root package name */
        Object f32727e;

        /* renamed from: f, reason: collision with root package name */
        Object f32728f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f32729g;

        /* renamed from: i, reason: collision with root package name */
        int f32731i;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32729g = obj;
            this.f32731i |= Integer.MIN_VALUE;
            return C3047a.this.c(this);
        }
    }

    private C3047a() {
    }

    private final C0763a b(InterfaceC3048b.a aVar) {
        Map dependencies = f32720b;
        AbstractC3159y.h(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            AbstractC3159y.h(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0763a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(InterfaceC3048b.a subscriberName) {
        AbstractC3159y.i(subscriberName, "subscriberName");
        Map dependencies = f32720b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
            return;
        }
        AbstractC3159y.h(dependencies, "dependencies");
        dependencies.put(subscriberName, new C0763a(AbstractC3692c.a(true), null, 2, 0 == true ? 1 : 0));
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
    public final java.lang.Object c(P5.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof j1.C3047a.b
            if (r0 == 0) goto L13
            r0 = r11
            j1.a$b r0 = (j1.C3047a.b) r0
            int r1 = r0.f32731i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32731i = r1
            goto L18
        L13:
            j1.a$b r0 = new j1.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f32729g
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f32731i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f32728f
            java.lang.Object r5 = r0.f32727e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f32726d
            r6.a r6 = (r6.InterfaceC3690a) r6
            java.lang.Object r7 = r0.f32725c
            j1.b$a r7 = (j1.InterfaceC3048b.a) r7
            java.lang.Object r8 = r0.f32724b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f32723a
            java.util.Map r9 = (java.util.Map) r9
            L5.t.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            L5.t.b(r11)
            java.util.Map r11 = j1.C3047a.f32720b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.AbstractC3159y.h(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = M5.Q.d(r5)
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
            j1.b$a r7 = (j1.InterfaceC3048b.a) r7
            java.lang.Object r11 = r11.getValue()
            j1.a$a r11 = (j1.C3047a.C0763a) r11
            r6.a r6 = r11.a()
            r0.f32723a = r5
            r0.f32724b = r8
            r0.f32725c = r7
            r0.f32726d = r6
            r0.f32727e = r5
            r0.f32728f = r2
            r0.f32731i = r3
            java.lang.Object r11 = r6.b(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            j1.a r11 = j1.C3047a.f32719a     // Catch: java.lang.Throwable -> Lb0
            j1.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
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
        throw new UnsupportedOperationException("Method not decompiled: j1.C3047a.c(P5.d):java.lang.Object");
    }

    public final InterfaceC3048b d(InterfaceC3048b.a subscriberName) {
        AbstractC3159y.i(subscriberName, "subscriberName");
        InterfaceC3048b b8 = b(subscriberName).b();
        if (b8 != null) {
            return b8;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void e(InterfaceC3048b subscriber) {
        AbstractC3159y.i(subscriber, "subscriber");
        InterfaceC3048b.a c8 = subscriber.c();
        C0763a b8 = b(c8);
        if (b8.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + c8 + " already registered.");
            return;
        }
        b8.c(subscriber);
        InterfaceC3690a.C0867a.c(b8.a(), null, 1, null);
    }
}
