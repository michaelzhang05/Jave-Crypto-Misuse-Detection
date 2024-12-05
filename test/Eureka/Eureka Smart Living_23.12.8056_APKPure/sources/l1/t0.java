package l1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    private static final String f7329c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    static int f7330d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static final a f7331e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f7332f;

    /* renamed from: g, reason: collision with root package name */
    private static final a f7333g;

    /* renamed from: h, reason: collision with root package name */
    private static final a f7334h;

    /* renamed from: i, reason: collision with root package name */
    private static final a f7335i;

    /* renamed from: j, reason: collision with root package name */
    private static final List f7336j;

    /* renamed from: a, reason: collision with root package name */
    private final int f7337a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7338b;

    /* loaded from: classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: l1.o0
            @Override // l1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.I(sQLiteDatabase);
            }
        };
        f7331e = aVar;
        a aVar2 = new a() { // from class: l1.p0
            @Override // l1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.J(sQLiteDatabase);
            }
        };
        f7332f = aVar2;
        a aVar3 = new a() { // from class: l1.q0
            @Override // l1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f7333g = aVar3;
        a aVar4 = new a() { // from class: l1.r0
            @Override // l1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.L(sQLiteDatabase);
            }
        };
        f7334h = aVar4;
        a aVar5 = new a() { // from class: l1.s0
            @Override // l1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.M(sQLiteDatabase);
            }
        };
        f7335i = aVar5;
        f7336j = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(Context context, String str, int i6) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i6);
        this.f7338b = false;
        this.f7337a = i6;
    }

    private void H(SQLiteDatabase sQLiteDatabase) {
        if (this.f7338b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f7329c);
    }

    private void N(SQLiteDatabase sQLiteDatabase, int i6) {
        H(sQLiteDatabase);
        O(sQLiteDatabase, 0, i6);
    }

    private void O(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        List list = f7336j;
        if (i7 <= list.size()) {
            while (i6 < i7) {
                ((a) f7336j.get(i6)).a(sQLiteDatabase);
                i6++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i6 + " to " + i7 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f7338b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        N(sQLiteDatabase, this.f7337a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        N(sQLiteDatabase, i7);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        H(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i7) {
        H(sQLiteDatabase);
        O(sQLiteDatabase, i6, i7);
    }
}
