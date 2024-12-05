package C;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    private static final String f1112c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    static int f1113d = 7;

    /* renamed from: e, reason: collision with root package name */
    private static final a f1114e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f1115f;

    /* renamed from: g, reason: collision with root package name */
    private static final a f1116g;

    /* renamed from: h, reason: collision with root package name */
    private static final a f1117h;

    /* renamed from: i, reason: collision with root package name */
    private static final a f1118i;

    /* renamed from: j, reason: collision with root package name */
    private static final a f1119j;

    /* renamed from: k, reason: collision with root package name */
    private static final a f1120k;

    /* renamed from: l, reason: collision with root package name */
    private static final List f1121l;

    /* renamed from: a, reason: collision with root package name */
    private final int f1122a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1123b;

    /* loaded from: classes3.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: C.O
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.s(sQLiteDatabase);
            }
        };
        f1114e = aVar;
        a aVar2 = new a() { // from class: C.P
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.u(sQLiteDatabase);
            }
        };
        f1115f = aVar2;
        a aVar3 = new a() { // from class: C.Q
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f1116g = aVar3;
        a aVar4 = new a() { // from class: C.S
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.x(sQLiteDatabase);
            }
        };
        f1117h = aVar4;
        a aVar5 = new a() { // from class: C.T
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.y(sQLiteDatabase);
            }
        };
        f1118i = aVar5;
        a aVar6 = new a() { // from class: C.U
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f1119j = aVar6;
        a aVar7 = new a() { // from class: C.V
            @Override // C.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.D(sQLiteDatabase);
            }
        };
        f1120k = aVar7;
        f1121l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(Context context, String str, int i8) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i8);
        this.f1123b = false;
        this.f1122a = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void E(SQLiteDatabase sQLiteDatabase, int i8) {
        o(sQLiteDatabase);
        F(sQLiteDatabase, 0, i8);
    }

    private void F(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        List list = f1121l;
        if (i9 <= list.size()) {
            while (i8 < i9) {
                ((a) f1121l.get(i8)).a(sQLiteDatabase);
                i8++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i8 + " to " + i9 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void o(SQLiteDatabase sQLiteDatabase) {
        if (!this.f1123b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f1112c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f1123b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        E(sQLiteDatabase, this.f1122a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        E(sQLiteDatabase, i9);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        o(sQLiteDatabase);
        F(sQLiteDatabase, i8, i9);
    }
}
