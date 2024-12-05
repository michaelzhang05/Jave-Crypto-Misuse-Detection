package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2161b extends AbstractC2190f4 {

    /* renamed from: d, reason: collision with root package name */
    private String f16427d;

    /* renamed from: e, reason: collision with root package name */
    private Set f16428e;

    /* renamed from: f, reason: collision with root package name */
    private Map f16429f;

    /* renamed from: g, reason: collision with root package name */
    private Long f16430g;

    /* renamed from: h, reason: collision with root package name */
    private Long f16431h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2161b(r4 r4Var) {
        super(r4Var);
    }

    private final G4 n(Integer num) {
        if (this.f16429f.containsKey(num)) {
            return (G4) this.f16429f.get(num);
        }
        G4 g42 = new G4(this, this.f16427d, null);
        this.f16429f.put(num, g42);
        return g42;
    }

    private final boolean o(int i8, int i9) {
        G4 g42 = (G4) this.f16429f.get(Integer.valueOf(i8));
        if (g42 == null) {
            return false;
        }
        return G4.b(g42).get(i9);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2190f4
    protected final boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:2|(2:4|(2:6|7)(1:521))(2:522|523))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:496|(1:498)(1:500)|499)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:455|(6:456|457|458|459|460|(1:463)(1:462))|464)|44|(1:46)(6:284|(12:286|287|288|289|290|(6:439|299|300|(3:395|(6:398|(2:434|435)(2:402|(8:408|409|(4:412|(2:414|415)(1:417)|416|410)|418|419|(4:422|(3:424|425|426)(1:428)|427|420)|429|430)(4:404|405|406|407))|431|432|407|396)|437)|302|303)|(4:292|(1:294)|295|296)|299|300|(0)|302|303)(1:454)|304|(10:307|(3:311|(4:314|(5:316|317|(1:319)(1:323)|320|321)(1:324)|322|312)|325)|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(3:381|382|383)(1:385)|384|371)|386)|387|305)|393|394)|47|(3:179|(4:182|(10:184|185|(1:187)(1:281)|188|(11:190|191|192|193|194|195|196|197|198|199|(4:201|(11:202|203|204|205|206|207|208|(3:210|211|212)(1:254)|213|214|(1:217)(1:216))|218|219)(4:261|262|253|219))(1:280)|220|(4:223|(3:241|242|243)(6:225|226|(2:227|(2:229|(1:231)(2:232|233))(2:239|240))|(1:235)|236|237)|238|221)|244|245|246)(1:282)|247|180)|283)|49|50|(3:77|(6:80|(8:82|83|84|85|86|87|88|(3:(9:90|91|92|93|94|(1:96)(1:153)|97|98|(1:101)(1:100))|102|103)(4:160|161|152|103))(1:177)|104|(2:105|(2:107|(3:143|144|145)(8:109|(2:110|(4:112|(3:114|(1:116)(1:139)|117)(1:140)|118|(1:1)(2:122|(1:124)(2:125|126)))(2:141|142))|133|(1:135)(1:137)|136|128|129|130))(0))|146|78)|178)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:504|505))|520|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0a30, code lost:
    
        if (r13 != false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0910, code lost:
    
        if (r13 == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0764, code lost:
    
        if (r5 != null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x02f0, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x01bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x01be, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x022b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x022c, code lost:
    
        r18 = "audience_id";
        r19 = com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0234, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0229, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0231, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0172, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_LEAVE, TryCatch #18 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:455:0x01c4, B:456:0x01c9, B:458:0x01d3, B:459:0x01e3, B:460:0x020f, B:473:0x01f2, B:476:0x0202, B:479:0x0208, B:467:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x01c4 A[Catch: all -> 0x01ba, SQLiteException -> 0x01bd, TRY_ENTER, TryCatch #18 {all -> 0x01ba, blocks: (B:40:0x01a6, B:42:0x01ac, B:455:0x01c4, B:456:0x01c9, B:458:0x01d3, B:459:0x01e3, B:460:0x020f, B:473:0x01f2, B:476:0x0202, B:479:0x0208, B:467:0x0235), top: B:39:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x081d  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m(java.lang.String r64, java.util.List r65, java.util.List r66, java.lang.Long r67, java.lang.Long r68) {
        /*
            Method dump skipped, instructions count: 2790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2161b.m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
