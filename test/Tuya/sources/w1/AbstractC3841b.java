package w1;

import java.util.Map;
import s1.AbstractC3733a;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3841b implements InterfaceC3842c {

    /* renamed from: a, reason: collision with root package name */
    protected Map f38946a;

    /* renamed from: b, reason: collision with root package name */
    protected String[][] f38947b;

    @Override // w1.InterfaceC3842c
    public void a(String str, Object obj) {
        if (this.f38946a.containsKey(str)) {
            ((AbstractC3733a) this.f38946a.get(str)).d(obj);
            return;
        }
        throw new u1.c(str + " not found");
    }

    @Override // w1.InterfaceC3842c
    public Object c(String str) {
        if (this.f38946a.containsKey(str)) {
            return ((AbstractC3733a) this.f38946a.get(str)).c();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.List r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            java.lang.String[][] r2 = r8.f38947b
            int r2 = r2.length
            if (r1 >= r2) goto L7c
            int r2 = r9.size()
            if (r1 >= r2) goto L7c
            java.lang.Object r2 = r9.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L79
            int r3 = r2.length()
            if (r3 <= 0) goto L79
            r3 = 0
            r4 = 0
        L1d:
            java.lang.String[][] r5 = r8.f38947b
            r5 = r5[r1]
            int r6 = r5.length
            if (r3 >= r6) goto L79
            r5 = r5[r3]
            java.util.Map r6 = r8.f38946a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5d
            java.util.Map r6 = r8.f38946a     // Catch: java.lang.Exception -> L45
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Exception -> L45
            s1.a r6 = (s1.AbstractC3733a) r6     // Catch: java.lang.Exception -> L45
            java.lang.String r7 = r6.e(r2, r4)     // Catch: java.lang.Exception -> L45
            r6.a(r7)     // Catch: java.lang.Exception -> L45
            int r5 = r7.length()     // Catch: java.lang.Exception -> L45
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L1d
        L45:
            r9 = move-exception
            u1.a r0 = new u1.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to decode "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r9)
            throw r0
        L5d:
            u1.a r9 = new u1.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field not found: '"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L79:
            int r1 = r1 + 1
            goto L2
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.AbstractC3841b.d(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        r0.add(r3);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List e() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            java.lang.String[][] r3 = r8.f38947b
            int r3 = r3.length
            if (r2 >= r3) goto L78
            java.lang.String r3 = ""
            r4 = 0
        Lf:
            java.lang.String[][] r5 = r8.f38947b
            r5 = r5[r2]
            int r6 = r5.length
            if (r4 >= r6) goto L72
            r5 = r5[r4]
            java.util.Map r6 = r8.f38946a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L56
            java.util.Map r6 = r8.f38946a     // Catch: java.lang.Exception -> L3e
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Exception -> L3e
            s1.a r6 = (s1.AbstractC3733a) r6     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r7.<init>()     // Catch: java.lang.Exception -> L3e
            r7.append(r3)     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = r6.b()     // Catch: java.lang.Exception -> L3e
            r7.append(r3)     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Exception -> L3e
            int r4 = r4 + 1
            goto Lf
        L3e:
            r0 = move-exception
            u1.b r1 = new u1.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to encode "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L56:
            u1.b r0 = new u1.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Field not found: '"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L72:
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.AbstractC3841b.e():java.util.List");
    }
}
