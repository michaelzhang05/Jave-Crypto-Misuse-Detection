package k5;

import java.text.Collator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f7207a = {"count(*)"};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f7208b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    private static Collator f7209c = null;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r3 = r5.getType(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r3 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r3 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r3 == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r3 == 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r3 = r5.getString(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r3 = r7.putString(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r7.freeLastRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r5.moveToNext() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = r5.getBlob(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r3 = r7.putBlob(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        r3 = r7.putDouble(r5.getDouble(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        r3 = r7.putLong(r5.getLong(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        r3 = r7.putNull(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        r5.moveToPosition(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r5.moveToPosition(r6) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r7.allocRow() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r2 >= r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(k5.d r5, int r6, android.database.CursorWindow r7) {
        /*
            if (r6 < 0) goto L7a
            int r0 = r5.getCount()
            if (r6 < r0) goto La
            goto L7a
        La:
            int r0 = r5.getPosition()
            int r1 = r5.getColumnCount()
            r7.clear()
            r7.setStartPosition(r6)
            r7.setNumColumns(r1)
            boolean r2 = r5.moveToPosition(r6)
            if (r2 == 0) goto L77
        L21:
            boolean r2 = r7.allocRow()
            if (r2 != 0) goto L28
            goto L77
        L28:
            r2 = 0
        L29:
            if (r2 >= r1) goto L6f
            int r3 = r5.getType(r2)
            if (r3 == 0) goto L62
            r4 = 1
            if (r3 == r4) goto L59
            r4 = 2
            if (r3 == r4) goto L50
            r4 = 4
            if (r3 == r4) goto L45
            java.lang.String r3 = r5.getString(r2)
            if (r3 == 0) goto L62
            boolean r3 = r7.putString(r3, r6, r2)
            goto L66
        L45:
            byte[] r3 = r5.getBlob(r2)
            if (r3 == 0) goto L62
            boolean r3 = r7.putBlob(r3, r6, r2)
            goto L66
        L50:
            double r3 = r5.getDouble(r2)
            boolean r3 = r7.putDouble(r3, r6, r2)
            goto L66
        L59:
            long r3 = r5.getLong(r2)
            boolean r3 = r7.putLong(r3, r6, r2)
            goto L66
        L62:
            boolean r3 = r7.putNull(r6, r2)
        L66:
            if (r3 != 0) goto L6c
            r7.freeLastRow()
            goto L6f
        L6c:
            int r2 = r2 + 1
            goto L29
        L6f:
            int r6 = r6 + 1
            boolean r2 = r5.moveToNext()
            if (r2 != 0) goto L21
        L77:
            r5.moveToPosition(r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.a(k5.d, int, android.database.CursorWindow):void");
    }
}
