package g3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f6712b = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f6713a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o3.d f6714a;

        a(o3.d dVar) {
            this.f6714a = dVar;
        }

        @Override // g3.j.b
        public h a(Class cls) {
            try {
                return new i(this.f6714a, cls);
            } catch (IllegalArgumentException e6) {
                throw new GeneralSecurityException("Primitive type not supported", e6);
            }
        }

        @Override // g3.j.b
        public Set b() {
            return this.f6714a.i();
        }

        @Override // g3.j.b
        public h c() {
            o3.d dVar = this.f6714a;
            return new i(dVar, dVar.b());
        }

        @Override // g3.j.b
        public Class d() {
            return this.f6714a.getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        h a(Class cls);

        Set b();

        h c();

        Class d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        this.f6713a = new ConcurrentHashMap();
    }

    private static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    private static b b(o3.d dVar) {
        return new a(dVar);
    }

    private synchronized b d(String str) {
        if (!this.f6713a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (b) this.f6713a.get(str);
    }

    private h e(String str, Class cls) {
        b d6 = d(str);
        if (cls == null) {
            return d6.c();
        }
        if (d6.b().contains(cls)) {
            return d6.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d6.d() + ", supported primitives: " + i(d6.b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r5.f6713a.putIfAbsent(r0, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void h(g3.j.b r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            g3.h r0 = r6.c()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.ConcurrentMap r1 = r5.f6713a     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6f
            g3.j$b r1 = (g3.j.b) r1     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L60
            java.lang.Class r2 = r1.d()     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r3 = r6.d()     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L22
            goto L60
        L22:
            java.util.logging.Logger r7 = g3.j.f6712b     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            r7.warning(r2)     // Catch: java.lang.Throwable -> L6f
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6f
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r0 = r1.d()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L6f
            r1 = 1
            r3[r1] = r0     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r6 = r6.d()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L6f
            r0 = 2
            r3[r0] = r6     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            throw r7     // Catch: java.lang.Throwable -> L6f
        L60:
            if (r7 != 0) goto L68
            java.util.concurrent.ConcurrentMap r7 = r5.f6713a     // Catch: java.lang.Throwable -> L6f
            r7.putIfAbsent(r0, r6)     // Catch: java.lang.Throwable -> L6f
            goto L6d
        L68:
            java.util.concurrent.ConcurrentMap r7 = r5.f6713a     // Catch: java.lang.Throwable -> L6f
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L6f
        L6d:
            monitor-exit(r5)
            return
        L6f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.j.h(g3.j$b, boolean):void");
    }

    private static String i(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z5 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z5) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z5 = false;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h c(String str, Class cls) {
        return e(str, (Class) a(cls));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h f(String str) {
        return d(str).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g(o3.d dVar) {
        if (!dVar.a().a()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(String str) {
        return this.f6713a.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(j jVar) {
        this.f6713a = new ConcurrentHashMap(jVar.f6713a);
    }
}
