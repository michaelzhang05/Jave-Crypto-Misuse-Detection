package l1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import d1.i;
import g1.a;
import g1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m1.b;

/* loaded from: classes.dex */
public class m0 implements l1.d, m1.b, l1.c {

    /* renamed from: f, reason: collision with root package name */
    private static final b1.b f7304f = b1.b.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final t0 f7305a;

    /* renamed from: b, reason: collision with root package name */
    private final n1.a f7306b;

    /* renamed from: c, reason: collision with root package name */
    private final n1.a f7307c;

    /* renamed from: d, reason: collision with root package name */
    private final e f7308d;

    /* renamed from: e, reason: collision with root package name */
    private final y4.a f7309e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f7310a;

        /* renamed from: b, reason: collision with root package name */
        final String f7311b;

        private c(String str, String str2) {
            this.f7310a = str;
            this.f7311b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        Object a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(n1.a aVar, n1.a aVar2, e eVar, t0 t0Var, y4.a aVar3) {
        this.f7305a = t0Var;
        this.f7306b = aVar;
        this.f7307c = aVar2;
        this.f7308d = eVar;
        this.f7309e = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long A0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean B0(d1.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long o02 = o0(sQLiteDatabase, oVar);
        return o02 == null ? Boolean.FALSE : (Boolean) Z0(j0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{o02.toString()}), new b() { // from class: l1.x
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List C0(SQLiteDatabase sQLiteDatabase) {
        return (List) Z0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: l1.j0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                List D0;
                D0 = m0.D0((Cursor) obj);
                return D0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List D0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(d1.o.a().b(cursor.getString(1)).d(o1.a.b(cursor.getInt(2))).c(T0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List E0(d1.o oVar, SQLiteDatabase sQLiteDatabase) {
        List R0 = R0(sQLiteDatabase, oVar, this.f7308d.d());
        for (b1.d dVar : b1.d.values()) {
            if (dVar != oVar.d()) {
                int d6 = this.f7308d.d() - R0.size();
                if (d6 <= 0) {
                    break;
                }
                R0.addAll(R0(sQLiteDatabase, oVar.f(dVar), d6));
            }
        }
        return r0(R0, S0(sQLiteDatabase, R0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g1.a F0(Map map, a.C0100a c0100a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b f02 = f0(cursor.getInt(1));
            long j6 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(g1.c.c().c(f02).b(j6).a());
        }
        U0(c0100a, map);
        c0100a.e(n0());
        c0100a.d(k0());
        c0100a.c((String) this.f7309e.get());
        return c0100a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g1.a G0(String str, final Map map, final a.C0100a c0100a, SQLiteDatabase sQLiteDatabase) {
        return (g1.a) Z0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: l1.z
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                g1.a F0;
                F0 = m0.this.F0(map, c0100a, (Cursor) obj);
                return F0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H0(List list, d1.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j6 = cursor.getLong(0);
            boolean z5 = cursor.getInt(7) != 0;
            i.a k6 = d1.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            k6.h(z5 ? new d1.h(X0(cursor.getString(4)), cursor.getBlob(5)) : new d1.h(X0(cursor.getString(4)), V0(j6)));
            if (!cursor.isNull(6)) {
                k6.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j6, oVar, k6.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object I0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j6 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j6));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j6), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long J0(d1.i iVar, d1.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (q0()) {
            D(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long h02 = h0(sQLiteDatabase, oVar);
        int e6 = this.f7308d.e();
        byte[] a6 = iVar.e().a();
        boolean z5 = a6.length <= e6;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(h02));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z5));
        contentValues.put("payload", z5 ? a6 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z5) {
            int ceil = (int) Math.ceil(a6.length / e6);
            for (int i6 = 1; i6 <= ceil; i6++) {
                byte[] copyOfRange = Arrays.copyOfRange(a6, (i6 - 1) * e6, Math.min(i6 * e6, a6.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i6));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] K0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i6 += blob.length;
        }
        byte[] bArr = new byte[i6];
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            byte[] bArr2 = (byte[]) arrayList.get(i8);
            System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
            i7 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object L0(Cursor cursor) {
        while (cursor.moveToNext()) {
            D(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object M0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        Z0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: l1.u
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object L0;
                L0 = m0.this.L0((Cursor) obj);
                return L0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean N0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object O0(String str, c.b bVar, long j6, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) Z0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new b() { // from class: l1.t
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Boolean N0;
                N0 = m0.N0((Cursor) obj);
                return N0;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j6));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object P0(long j6, d1.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j6));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(o1.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(o1.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object Q0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f7306b.a()).execute();
        return null;
    }

    private List R0(SQLiteDatabase sQLiteDatabase, final d1.o oVar, int i6) {
        final ArrayList arrayList = new ArrayList();
        Long o02 = o0(sQLiteDatabase, oVar);
        if (o02 == null) {
            return arrayList;
        }
        Z0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{o02.toString()}, null, null, null, String.valueOf(i6)), new b() { // from class: l1.v
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object H0;
                H0 = m0.this.H0(arrayList, oVar, (Cursor) obj);
                return H0;
            }
        });
        return arrayList;
    }

    private Map S0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i6 = 0; i6 < list.size(); i6++) {
            sb.append(((k) list.get(i6)).c());
            if (i6 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Z0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: l1.r
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object I0;
                I0 = m0.I0(hashMap, (Cursor) obj);
                return I0;
            }
        });
        return hashMap;
    }

    private static byte[] T0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void U0(a.C0100a c0100a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0100a.a(g1.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] V0(long j6) {
        return (byte[]) Z0(j0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num"), new b() { // from class: l1.y
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                byte[] K0;
                K0 = m0.K0((Cursor) obj);
                return K0;
            }
        });
    }

    private Object W0(d dVar, b bVar) {
        long a6 = this.f7307c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e6) {
                if (this.f7307c.a() >= this.f7308d.b() + a6) {
                    return bVar.apply(e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static b1.b X0(String str) {
        return str == null ? f7304f : b1.b.b(str);
    }

    private static String Y0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object Z0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b f0(int i6) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i6 == bVar.a()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i6 == bVar2.a()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i6 == bVar3.a()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i6 == bVar4.a()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i6 == bVar5.a()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i6 == bVar6.a()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i6 == bVar7.a()) {
            return bVar7;
        }
        h1.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i6));
        return bVar;
    }

    private void g0(final SQLiteDatabase sQLiteDatabase) {
        W0(new d() { // from class: l1.g0
            @Override // l1.m0.d
            public final Object a() {
                Object u02;
                u02 = m0.u0(sQLiteDatabase);
                return u02;
            }
        }, new b() { // from class: l1.h0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object v02;
                v02 = m0.v0((Throwable) obj);
                return v02;
            }
        });
    }

    private long h0(SQLiteDatabase sQLiteDatabase, d1.o oVar) {
        Long o02 = o0(sQLiteDatabase, oVar);
        if (o02 != null) {
            return o02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(o1.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private g1.b k0() {
        return g1.b.b().b(g1.e.c().b(i0()).c(e.f7289a.f()).a()).a();
    }

    private long l0() {
        return j0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long m0() {
        return j0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private g1.f n0() {
        final long a6 = this.f7306b.a();
        return (g1.f) p0(new b() { // from class: l1.c0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                g1.f z02;
                z02 = m0.z0(a6, (SQLiteDatabase) obj);
                return z02;
            }
        });
    }

    private Long o0(SQLiteDatabase sQLiteDatabase, d1.o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(o1.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) Z0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: l1.b0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Long A0;
                A0 = m0.A0((Cursor) obj);
                return A0;
            }
        });
    }

    private boolean q0() {
        return l0() * m0() >= this.f7308d.f();
    }

    private List r0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.c()))) {
                i.a l6 = kVar.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(kVar.c()))) {
                    l6.c(cVar.f7310a, cVar.f7311b);
                }
                listIterator.set(k.a(kVar.c(), kVar.d(), l6.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s0(Cursor cursor) {
        while (cursor.moveToNext()) {
            D(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer t0(long j6, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j6)};
        Z0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: l1.q
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object s02;
                s02 = m0.this.s0((Cursor) obj);
                return s02;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object u0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object v0(Throwable th) {
        throw new m1.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase w0(Throwable th) {
        throw new m1.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long x0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g1.f y0(long j6, Cursor cursor) {
        cursor.moveToNext();
        return g1.f.c().c(cursor.getLong(0)).b(j6).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g1.f z0(final long j6, SQLiteDatabase sQLiteDatabase) {
        return (g1.f) Z0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: l1.d0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                g1.f y02;
                y02 = m0.y0(j6, (Cursor) obj);
                return y02;
            }
        });
    }

    @Override // l1.c
    public void D(final long j6, final c.b bVar, final String str) {
        p0(new b() { // from class: l1.l0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object O0;
                O0 = m0.O0(str, bVar, j6, (SQLiteDatabase) obj);
                return O0;
            }
        });
    }

    @Override // l1.d
    public void E(final d1.o oVar, final long j6) {
        p0(new b() { // from class: l1.m
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object P0;
                P0 = m0.P0(j6, oVar, (SQLiteDatabase) obj);
                return P0;
            }
        });
    }

    @Override // l1.d
    public Iterable F() {
        return (Iterable) p0(new b() { // from class: l1.l
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                List C0;
                C0 = m0.C0((SQLiteDatabase) obj);
                return C0;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7305a.close();
    }

    @Override // l1.d
    public int f() {
        final long a6 = this.f7306b.a() - this.f7308d.c();
        return ((Integer) p0(new b() { // from class: l1.i0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Integer t02;
                t02 = m0.this.t0(a6, (SQLiteDatabase) obj);
                return t02;
            }
        })).intValue();
    }

    @Override // m1.b
    public Object g(b.a aVar) {
        SQLiteDatabase j02 = j0();
        g0(j02);
        try {
            Object a6 = aVar.a();
            j02.setTransactionSuccessful();
            return a6;
        } finally {
            j02.endTransaction();
        }
    }

    @Override // l1.d
    public void h(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            j0().compileStatement("DELETE FROM events WHERE _id in " + Y0(iterable)).execute();
        }
    }

    @Override // l1.d
    public k i(final d1.o oVar, final d1.i iVar) {
        h1.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) p0(new b() { // from class: l1.a0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Long J0;
                J0 = m0.this.J0(iVar, oVar, (SQLiteDatabase) obj);
                return J0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    long i0() {
        return l0() * m0();
    }

    @Override // l1.d
    public long j(d1.o oVar) {
        return ((Long) Z0(j0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(o1.a.a(oVar.d()))}), new b() { // from class: l1.f0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Long x02;
                x02 = m0.x0((Cursor) obj);
                return x02;
            }
        })).longValue();
    }

    SQLiteDatabase j0() {
        final t0 t0Var = this.f7305a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) W0(new d() { // from class: l1.w
            @Override // l1.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, new b() { // from class: l1.e0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase w02;
                w02 = m0.w0((Throwable) obj);
                return w02;
            }
        });
    }

    Object p0(b bVar) {
        SQLiteDatabase j02 = j0();
        j02.beginTransaction();
        try {
            Object apply = bVar.apply(j02);
            j02.setTransactionSuccessful();
            return apply;
        } finally {
            j02.endTransaction();
        }
    }

    @Override // l1.c
    public void q() {
        p0(new b() { // from class: l1.n
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Object Q0;
                Q0 = m0.this.Q0((SQLiteDatabase) obj);
                return Q0;
            }
        });
    }

    @Override // l1.d
    public Iterable s(final d1.o oVar) {
        return (Iterable) p0(new b() { // from class: l1.o
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                List E0;
                E0 = m0.this.E0(oVar, (SQLiteDatabase) obj);
                return E0;
            }
        });
    }

    @Override // l1.d
    public boolean v(final d1.o oVar) {
        return ((Boolean) p0(new b() { // from class: l1.k0
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                Boolean B0;
                B0 = m0.this.B0(oVar, (SQLiteDatabase) obj);
                return B0;
            }
        })).booleanValue();
    }

    @Override // l1.c
    public g1.a w() {
        final a.C0100a e6 = g1.a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (g1.a) p0(new b() { // from class: l1.s
            @Override // l1.m0.b
            public final Object apply(Object obj) {
                g1.a G0;
                G0 = m0.this.G0(str, hashMap, e6, (SQLiteDatabase) obj);
                return G0;
            }
        });
    }

    @Override // l1.d
    public void z(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Y0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            p0(new b() { // from class: l1.p
                @Override // l1.m0.b
                public final Object apply(Object obj) {
                    Object M0;
                    M0 = m0.this.M0(str, str2, (SQLiteDatabase) obj);
                    return M0;
                }
            });
        }
    }
}
