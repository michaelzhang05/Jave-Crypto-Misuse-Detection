package c.f.b.k;

import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r8 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x003e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x003c, code lost:
    
        if (r8 == 2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0507 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d1  */
    /* JADX WARN: Type inference failed for: r2v56, types: [c.f.b.k.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [c.f.b.k.e] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(c.f.b.k.f r37, c.f.b.d r38, int r39, int r40, c.f.b.k.c r41) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.b.a(c.f.b.k.f, c.f.b.d, int, int, c.f.b.k.c):void");
    }

    public static void b(f fVar, c.f.b.d dVar, ArrayList<e> arrayList, int i2) {
        c[] cVarArr;
        int i3;
        int i4;
        if (i2 == 0) {
            i3 = fVar.O0;
            cVarArr = fVar.R0;
            i4 = 0;
        } else {
            int i5 = fVar.P0;
            cVarArr = fVar.Q0;
            i3 = i5;
            i4 = 2;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            c cVar = cVarArr[i6];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.a)) {
                a(fVar, dVar, i2, i4, cVar);
            }
        }
    }
}
