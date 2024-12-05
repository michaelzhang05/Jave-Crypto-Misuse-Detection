package C;

import D.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import s.C3982c;
import u.i;
import x.C4152a;
import x.C4153b;
import x.C4154c;
import x.C4155d;
import x.C4156e;
import y.AbstractC4194a;

/* loaded from: classes3.dex */
public class M implements InterfaceC1010d, D.b, InterfaceC1009c {

    /* renamed from: f, reason: collision with root package name */
    private static final C3982c f1099f = C3982c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final W f1100a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f1101b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f1102c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1011e f1103d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f1104e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f1105a;

        /* renamed from: b, reason: collision with root package name */
        final String f1106b;

        private c(String str, String str2) {
            this.f1105a = str;
            this.f1106b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface d {
        Object a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(E.a aVar, E.a aVar2, AbstractC1011e abstractC1011e, W w8, L5.a aVar3) {
        this.f1100a = w8;
        this.f1101b = aVar;
        this.f1102c = aVar2;
        this.f1103d = abstractC1011e;
        this.f1104e = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object A0(String str, C4154c.b bVar, long j8, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) L0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: C.y
            @Override // C.M.b
            public final Object apply(Object obj) {
                Boolean z02;
                z02 = M.z0((Cursor) obj);
                return z02;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j8));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j8 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object B0(long j8, u.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j8));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(F.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(F.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object C0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f1101b.a()).execute();
        return null;
    }

    private List D0(SQLiteDatabase sQLiteDatabase, final u.p pVar, int i8) {
        final ArrayList arrayList = new ArrayList();
        Long a02 = a0(sQLiteDatabase, pVar);
        if (a02 == null) {
            return arrayList;
        }
        L0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{a02.toString()}, null, null, null, String.valueOf(i8)), new b() { // from class: C.v
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object t02;
                t02 = M.this.t0(arrayList, pVar, (Cursor) obj);
                return t02;
            }
        });
        return arrayList;
    }

    private Map E0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((AbstractC1017k) list.get(i8)).c());
            if (i8 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        L0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: C.z
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object u02;
                u02 = M.u0(hashMap, (Cursor) obj);
                return u02;
            }
        });
        return hashMap;
    }

    private static byte[] F0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void G0(C4152a.C0920a c0920a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0920a.a(C4155d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] H0(long j8) {
        return (byte[]) L0(W().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j8)}, null, null, "sequence_num"), new b() { // from class: C.B
            @Override // C.M.b
            public final Object apply(Object obj) {
                byte[] w02;
                w02 = M.w0((Cursor) obj);
                return w02;
            }
        });
    }

    private Object I0(d dVar, b bVar) {
        long a8 = this.f1102c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e8) {
                if (this.f1102c.a() >= this.f1103d.b() + a8) {
                    return bVar.apply(e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static C3982c J0(String str) {
        if (str == null) {
            return f1099f;
        }
        return C3982c.b(str);
    }

    private static String K0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC1017k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object L0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private C4154c.b S(int i8) {
        C4154c.b bVar = C4154c.b.REASON_UNKNOWN;
        if (i8 == bVar.getNumber()) {
            return bVar;
        }
        C4154c.b bVar2 = C4154c.b.MESSAGE_TOO_OLD;
        if (i8 == bVar2.getNumber()) {
            return bVar2;
        }
        C4154c.b bVar3 = C4154c.b.CACHE_FULL;
        if (i8 == bVar3.getNumber()) {
            return bVar3;
        }
        C4154c.b bVar4 = C4154c.b.PAYLOAD_TOO_BIG;
        if (i8 == bVar4.getNumber()) {
            return bVar4;
        }
        C4154c.b bVar5 = C4154c.b.MAX_RETRIES_REACHED;
        if (i8 == bVar5.getNumber()) {
            return bVar5;
        }
        C4154c.b bVar6 = C4154c.b.INVALID_PAYLOD;
        if (i8 == bVar6.getNumber()) {
            return bVar6;
        }
        C4154c.b bVar7 = C4154c.b.SERVER_ERROR;
        if (i8 == bVar7.getNumber()) {
            return bVar7;
        }
        AbstractC4194a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i8));
        return bVar;
    }

    private void T(final SQLiteDatabase sQLiteDatabase) {
        I0(new d() { // from class: C.l
            @Override // C.M.d
            public final Object a() {
                Object g02;
                g02 = M.g0(sQLiteDatabase);
                return g02;
            }
        }, new b() { // from class: C.w
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object h02;
                h02 = M.h0((Throwable) obj);
                return h02;
            }
        });
    }

    private long U(SQLiteDatabase sQLiteDatabase, u.p pVar) {
        Long a02 = a0(sQLiteDatabase, pVar);
        if (a02 != null) {
            return a02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(F.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private C4153b X() {
        return C4153b.b().b(C4156e.c().b(V()).c(AbstractC1011e.f1140a.f()).a()).a();
    }

    private long Y() {
        return W().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private x.f Z() {
        final long a8 = this.f1101b.a();
        return (x.f) b0(new b() { // from class: C.C
            @Override // C.M.b
            public final Object apply(Object obj) {
                x.f l02;
                l02 = M.l0(a8, (SQLiteDatabase) obj);
                return l02;
            }
        });
    }

    private Long a0(SQLiteDatabase sQLiteDatabase, u.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(F.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) L0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: C.x
            @Override // C.M.b
            public final Object apply(Object obj) {
                Long m02;
                m02 = M.m0((Cursor) obj);
                return m02;
            }
        });
    }

    private boolean c0() {
        if (Y() * getPageSize() >= this.f1103d.f()) {
            return true;
        }
        return false;
    }

    private List d0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1017k abstractC1017k = (AbstractC1017k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC1017k.c()))) {
                i.a p8 = abstractC1017k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC1017k.c()))) {
                    p8.c(cVar.f1105a, cVar.f1106b);
                }
                listIterator.set(AbstractC1017k.a(abstractC1017k.c(), abstractC1017k.d(), p8.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object e0(Cursor cursor) {
        while (cursor.moveToNext()) {
            a(cursor.getInt(0), C4154c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer f0(long j8, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j8)};
        L0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: C.r
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object e02;
                e02 = M.this.e0((Cursor) obj);
                return e02;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private long getPageSize() {
        return W().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h0(Throwable th) {
        throw new D.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase i0(Throwable th) {
        throw new D.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long j0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x.f k0(long j8, Cursor cursor) {
        cursor.moveToNext();
        return x.f.c().c(cursor.getLong(0)).b(j8).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x.f l0(final long j8, SQLiteDatabase sQLiteDatabase) {
        return (x.f) L0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: C.D
            @Override // C.M.b
            public final Object apply(Object obj) {
                x.f k02;
                k02 = M.k0(j8, (Cursor) obj);
                return k02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long m0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean n0(u.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long a02 = a0(sQLiteDatabase, pVar);
        if (a02 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) L0(W().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{a02.toString()}), new b() { // from class: C.t
            @Override // C.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List o0(SQLiteDatabase sQLiteDatabase) {
        return (List) L0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: C.J
            @Override // C.M.b
            public final Object apply(Object obj) {
                List p02;
                p02 = M.p0((Cursor) obj);
                return p02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List p0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(u.p.a().b(cursor.getString(1)).d(F.a.b(cursor.getInt(2))).c(F0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q0(u.p pVar, SQLiteDatabase sQLiteDatabase) {
        List D02 = D0(sQLiteDatabase, pVar, this.f1103d.d());
        for (s.f fVar : s.f.values()) {
            if (fVar != pVar.d()) {
                int d8 = this.f1103d.d() - D02.size();
                if (d8 <= 0) {
                    break;
                }
                D02.addAll(D0(sQLiteDatabase, pVar.f(fVar), d8));
            }
        }
        return d0(D02, E0(sQLiteDatabase, D02));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C4152a r0(Map map, C4152a.C0920a c0920a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C4154c.b S8 = S(cursor.getInt(1));
            long j8 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C4154c.c().c(S8).b(j8).a());
        }
        G0(c0920a, map);
        return c0920a.e(Z()).d(X()).c((String) this.f1104e.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C4152a s0(String str, final Map map, final C4152a.C0920a c0920a, SQLiteDatabase sQLiteDatabase) {
        return (C4152a) L0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: C.A
            @Override // C.M.b
            public final Object apply(Object obj) {
                C4152a r02;
                r02 = M.this.r0(map, c0920a, (Cursor) obj);
                return r02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object t0(List list, u.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z8 = false;
            long j8 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z8 = true;
            }
            i.a o8 = u.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z8) {
                o8.h(new u.h(J0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                o8.h(new u.h(J0(cursor.getString(4)), H0(j8)));
            }
            if (!cursor.isNull(6)) {
                o8.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                o8.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                o8.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                o8.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                o8.k(cursor.getBlob(11));
            }
            list.add(AbstractC1017k.a(j8, pVar, o8.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object u0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j8 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j8));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j8), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long v0(u.i iVar, u.p pVar, SQLiteDatabase sQLiteDatabase) {
        boolean z8;
        byte[] bArr;
        if (c0()) {
            a(1L, C4154c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long U8 = U(sQLiteDatabase, pVar);
        int e8 = this.f1103d.e();
        byte[] a8 = iVar.e().a();
        if (a8.length <= e8) {
            z8 = true;
        } else {
            z8 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(U8));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z8));
        if (z8) {
            bArr = a8;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z8) {
            int ceil = (int) Math.ceil(a8.length / e8);
            for (int i8 = 1; i8 <= ceil; i8++) {
                byte[] copyOfRange = Arrays.copyOfRange(a8, (i8 - 1) * e8, Math.min(i8 * e8, a8.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i8));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] w0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i8 += blob.length;
        }
        byte[] bArr = new byte[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
            i9 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x0(Cursor cursor) {
        while (cursor.moveToNext()) {
            a(cursor.getInt(0), C4154c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object y0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        L0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: C.u
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object x02;
                x02 = M.this.x0((Cursor) obj);
                return x02;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean z0(Cursor cursor) {
        boolean z8;
        if (cursor.getCount() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }

    @Override // C.InterfaceC1010d
    public void B(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + K0(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        b0(new b() { // from class: C.K
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object y02;
                y02 = M.this.y0(str, str2, (SQLiteDatabase) obj);
                return y02;
            }
        });
    }

    long V() {
        return Y() * getPageSize();
    }

    SQLiteDatabase W() {
        final W w8 = this.f1100a;
        Objects.requireNonNull(w8);
        return (SQLiteDatabase) I0(new d() { // from class: C.E
            @Override // C.M.d
            public final Object a() {
                return W.this.getWritableDatabase();
            }
        }, new b() { // from class: C.F
            @Override // C.M.b
            public final Object apply(Object obj) {
                SQLiteDatabase i02;
                i02 = M.i0((Throwable) obj);
                return i02;
            }
        });
    }

    @Override // C.InterfaceC1009c
    public void a(final long j8, final C4154c.b bVar, final String str) {
        b0(new b() { // from class: C.q
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object A02;
                A02 = M.A0(str, bVar, j8, (SQLiteDatabase) obj);
                return A02;
            }
        });
    }

    @Override // C.InterfaceC1009c
    public void b() {
        b0(new b() { // from class: C.p
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object C02;
                C02 = M.this.C0((SQLiteDatabase) obj);
                return C02;
            }
        });
    }

    Object b0(b bVar) {
        SQLiteDatabase W7 = W();
        W7.beginTransaction();
        try {
            Object apply = bVar.apply(W7);
            W7.setTransactionSuccessful();
            return apply;
        } finally {
            W7.endTransaction();
        }
    }

    @Override // C.InterfaceC1010d
    public int c() {
        final long a8 = this.f1101b.a() - this.f1103d.c();
        return ((Integer) b0(new b() { // from class: C.I
            @Override // C.M.b
            public final Object apply(Object obj) {
                Integer f02;
                f02 = M.this.f0(a8, (SQLiteDatabase) obj);
                return f02;
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1100a.close();
    }

    @Override // C.InterfaceC1010d
    public void e(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        W().compileStatement("DELETE FROM events WHERE _id in " + K0(iterable)).execute();
    }

    @Override // D.b
    public Object f(b.a aVar) {
        SQLiteDatabase W7 = W();
        T(W7);
        try {
            Object execute = aVar.execute();
            W7.setTransactionSuccessful();
            return execute;
        } finally {
            W7.endTransaction();
        }
    }

    @Override // C.InterfaceC1009c
    public C4152a g() {
        final C4152a.C0920a e8 = C4152a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C4152a) b0(new b() { // from class: C.s
            @Override // C.M.b
            public final Object apply(Object obj) {
                C4152a s02;
                s02 = M.this.s0(str, hashMap, e8, (SQLiteDatabase) obj);
                return s02;
            }
        });
    }

    @Override // C.InterfaceC1010d
    public Iterable j(final u.p pVar) {
        return (Iterable) b0(new b() { // from class: C.L
            @Override // C.M.b
            public final Object apply(Object obj) {
                List q02;
                q02 = M.this.q0(pVar, (SQLiteDatabase) obj);
                return q02;
            }
        });
    }

    @Override // C.InterfaceC1010d
    public Iterable k() {
        return (Iterable) b0(new b() { // from class: C.G
            @Override // C.M.b
            public final Object apply(Object obj) {
                List o02;
                o02 = M.o0((SQLiteDatabase) obj);
                return o02;
            }
        });
    }

    @Override // C.InterfaceC1010d
    public void p(final u.p pVar, final long j8) {
        b0(new b() { // from class: C.o
            @Override // C.M.b
            public final Object apply(Object obj) {
                Object B02;
                B02 = M.B0(j8, pVar, (SQLiteDatabase) obj);
                return B02;
            }
        });
    }

    @Override // C.InterfaceC1010d
    public boolean q(final u.p pVar) {
        return ((Boolean) b0(new b() { // from class: C.n
            @Override // C.M.b
            public final Object apply(Object obj) {
                Boolean n02;
                n02 = M.this.n0(pVar, (SQLiteDatabase) obj);
                return n02;
            }
        })).booleanValue();
    }

    @Override // C.InterfaceC1010d
    public long r(u.p pVar) {
        return ((Long) L0(W().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(F.a.a(pVar.d()))}), new b() { // from class: C.H
            @Override // C.M.b
            public final Object apply(Object obj) {
                Long j02;
                j02 = M.j0((Cursor) obj);
                return j02;
            }
        })).longValue();
    }

    @Override // C.InterfaceC1010d
    public AbstractC1017k t(final u.p pVar, final u.i iVar) {
        AbstractC4194a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long longValue = ((Long) b0(new b() { // from class: C.m
            @Override // C.M.b
            public final Object apply(Object obj) {
                Long v02;
                v02 = M.this.v0(iVar, pVar, (SQLiteDatabase) obj);
                return v02;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC1017k.a(longValue, pVar, iVar);
    }
}
