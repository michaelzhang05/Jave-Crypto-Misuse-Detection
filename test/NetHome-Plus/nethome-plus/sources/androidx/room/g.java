package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public class g {
    private static final String[] a = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: c, reason: collision with root package name */
    final String[] f1625c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Set<String>> f1626d;

    /* renamed from: e, reason: collision with root package name */
    final j f1627e;

    /* renamed from: h, reason: collision with root package name */
    volatile c.q.a.f f1630h;

    /* renamed from: i, reason: collision with root package name */
    private b f1631i;

    /* renamed from: j, reason: collision with root package name */
    private final f f1632j;
    private h l;

    /* renamed from: f, reason: collision with root package name */
    AtomicBoolean f1628f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f1629g = false;

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    final c.b.a.b.b<c, d> f1633k = new c.b.a.b.b<>();
    Runnable m = new a();

    /* renamed from: b, reason: collision with root package name */
    final HashMap<String, Integer> f1624b = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor query = g.this.f1627e.query(new c.q.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                g.this.f1630h.p();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock closeLock = g.this.f1627e.getCloseLock();
            Set<Integer> set = null;
            try {
                try {
                    closeLock.lock();
                } finally {
                    closeLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
            if (g.this.c()) {
                if (g.this.f1628f.compareAndSet(true, false)) {
                    if (g.this.f1627e.inTransaction()) {
                        return;
                    }
                    j jVar = g.this.f1627e;
                    if (jVar.mWriteAheadLoggingEnabled) {
                        c.q.a.b N = jVar.getOpenHelper().N();
                        N.g();
                        try {
                            set = a();
                            N.G();
                            N.S();
                        } catch (Throwable th) {
                            N.S();
                            throw th;
                        }
                    } else {
                        set = a();
                    }
                    if (set == null || set.isEmpty()) {
                        return;
                    }
                    synchronized (g.this.f1633k) {
                        Iterator<Map.Entry<c, d>> it = g.this.f1633k.iterator();
                        while (it.hasNext()) {
                            it.next().getValue().a(set);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class b {
        final long[] a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f1635b;

        /* renamed from: c, reason: collision with root package name */
        final int[] f1636c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1637d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1638e;

        b(int i2) {
            long[] jArr = new long[i2];
            this.a = jArr;
            boolean[] zArr = new boolean[i2];
            this.f1635b = zArr;
            this.f1636c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f1637d && !this.f1638e) {
                    int length = this.a.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1;
                        if (i2 < length) {
                            boolean z = this.a[i2] > 0;
                            boolean[] zArr = this.f1635b;
                            if (z != zArr[i2]) {
                                int[] iArr = this.f1636c;
                                if (!z) {
                                    i3 = 2;
                                }
                                iArr[i2] = i3;
                            } else {
                                this.f1636c[i2] = 0;
                            }
                            zArr[i2] = z;
                            i2++;
                        } else {
                            this.f1638e = true;
                            this.f1637d = false;
                            return this.f1636c;
                        }
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.a;
                    long j2 = jArr[i2];
                    jArr[i2] = 1 + j2;
                    if (j2 == 0) {
                        this.f1637d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        this.f1637d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        void d() {
            synchronized (this) {
                this.f1638e = false;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        final String[] a;

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class d {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f1639b;

        /* renamed from: c, reason: collision with root package name */
        final c f1640c;

        /* renamed from: d, reason: collision with root package name */
        private final Set<String> f1641d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f1640c = cVar;
            this.a = iArr;
            this.f1639b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f1641d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f1641d = null;
        }

        void a(Set<Integer> set) {
            int length = this.a.length;
            Set<String> set2 = null;
            for (int i2 = 0; i2 < length; i2++) {
                if (set.contains(Integer.valueOf(this.a[i2]))) {
                    if (length == 1) {
                        set2 = this.f1641d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f1639b[i2]);
                    }
                }
            }
            if (set2 != null) {
                this.f1640c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f1639b.length == 1) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (strArr[i2].equalsIgnoreCase(this.f1639b[0])) {
                        set = this.f1641d;
                        break;
                    }
                    i2++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f1639b;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            String str2 = strArr2[i3];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f1640c.b(set);
            }
        }
    }

    public g(j jVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f1627e = jVar;
        this.f1631i = new b(strArr.length);
        this.f1626d = map2;
        this.f1632j = new f(jVar);
        int length = strArr.length;
        this.f1625c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f1624b.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.f1625c[i2] = str2.toLowerCase(locale);
            } else {
                this.f1625c[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f1624b.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f1624b;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f1626d.containsKey(lowerCase)) {
                hashSet.addAll(this.f1626d.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(c.q.a.b bVar, int i2) {
        bVar.l("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f1625c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.l(sb.toString());
        }
    }

    private void l(c.q.a.b bVar, int i2) {
        String str = this.f1625c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.l(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d z;
        String[] h2 = h(cVar.a);
        int[] iArr = new int[h2.length];
        int length = h2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Integer num = this.f1624b.get(h2[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + h2[i2]);
            }
        }
        d dVar = new d(cVar, iArr, h2);
        synchronized (this.f1633k) {
            z = this.f1633k.z(cVar, dVar);
        }
        if (z == null && this.f1631i.b(iArr)) {
            m();
        }
    }

    boolean c() {
        if (!this.f1627e.isOpen()) {
            return false;
        }
        if (!this.f1629g) {
            this.f1627e.getOpenHelper().N();
        }
        if (this.f1629g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(c.q.a.b bVar) {
        synchronized (this) {
            if (this.f1629g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.l("PRAGMA temp_store = MEMORY;");
            bVar.l("PRAGMA recursive_triggers='ON';");
            bVar.l("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            n(bVar);
            this.f1630h = bVar.q("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f1629g = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.f1633k) {
            Iterator<Map.Entry<c, d>> it = this.f1633k.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f1628f.compareAndSet(false, true)) {
            this.f1627e.getQueryExecutor().execute(this.m);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(c cVar) {
        d D;
        synchronized (this.f1633k) {
            D = this.f1633k.D(cVar);
        }
        if (D == null || !this.f1631i.c(D.a)) {
            return;
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Context context, String str) {
        this.l = new h(context, str, this, this.f1627e.getQueryExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        h hVar = this.l;
        if (hVar != null) {
            hVar.a();
            this.l = null;
        }
    }

    void m() {
        if (this.f1627e.isOpen()) {
            n(this.f1627e.getOpenHelper().N());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(c.q.a.b bVar) {
        if (bVar.e0()) {
            return;
        }
        while (true) {
            try {
                Lock closeLock = this.f1627e.getCloseLock();
                closeLock.lock();
                try {
                    int[] a2 = this.f1631i.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    bVar.g();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                j(bVar, i2);
                            } else if (i3 == 2) {
                                l(bVar, i2);
                            }
                        } finally {
                        }
                    }
                    bVar.G();
                    bVar.S();
                    this.f1631i.d();
                } finally {
                    closeLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }
}
