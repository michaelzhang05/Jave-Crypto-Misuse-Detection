package w0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4121d {

    /* renamed from: w0.d$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f40323a;

        /* renamed from: b, reason: collision with root package name */
        private final a f40324b;

        /* renamed from: c, reason: collision with root package name */
        private a f40325c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f40326d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f40327e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w0.d$b$a */
        /* loaded from: classes3.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            String f40328a;

            /* renamed from: b, reason: collision with root package name */
            Object f40329b;

            /* renamed from: c, reason: collision with root package name */
            a f40330c;

            private a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f40325c.f40330c = aVar;
            this.f40325c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f40329b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() != 0) {
                    return false;
                }
                return true;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof g) {
                return !((g) obj).c();
            }
            if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                return false;
            }
            return true;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.f40326d
                boolean r2 = r8.f40327e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.f40323a
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                w0.d$b$a r4 = r8.f40324b
                w0.d$b$a r4 = r4.f40330c
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L62
                java.lang.Object r6 = r4.f40329b
                if (r6 != 0) goto L25
                if (r1 != 0) goto L5f
                goto L2d
            L25:
                if (r2 == 0) goto L2d
                boolean r7 = d(r6)
                if (r7 != 0) goto L5f
            L2d:
                r3.append(r5)
                java.lang.String r5 = r4.f40328a
                if (r5 == 0) goto L3c
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L3c:
                if (r6 == 0) goto L5a
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5a
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L5d
            L5a:
                r3.append(r6)
            L5d:
                java.lang.String r5 = ", "
            L5f:
                w0.d$b$a r4 = r4.f40330c
                goto L1c
            L62:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w0.AbstractC4121d.b.toString():java.lang.String");
        }

        private b(String str) {
            a aVar = new a();
            this.f40324b = aVar;
            this.f40325c = aVar;
            this.f40326d = false;
            this.f40327e = false;
            this.f40323a = (String) h.i(str);
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
