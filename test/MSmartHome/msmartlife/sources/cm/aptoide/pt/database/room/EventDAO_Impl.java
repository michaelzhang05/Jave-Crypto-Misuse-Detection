package cm.aptoide.pt.database.room;

import android.database.Cursor;
import androidx.room.b;
import androidx.room.c;
import androidx.room.j;
import androidx.room.n;
import c.q.a.f;
import h.a.m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class EventDAO_Impl implements EventDAO {
    private final j __db;
    private final b<RoomEvent> __deletionAdapterOfRoomEvent;
    private final c<RoomEvent> __insertionAdapterOfRoomEvent;

    public EventDAO_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomEvent = new c<RoomEvent>(jVar) { // from class: cm.aptoide.pt.database.room.EventDAO_Impl.1
            @Override // androidx.room.q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `event` (`timestamp`,`eventName`,`action`,`context`,`data`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.c
            public void bind(f fVar, RoomEvent roomEvent) {
                fVar.F(1, roomEvent.getTimestamp());
                if (roomEvent.getEventName() == null) {
                    fVar.a0(2);
                } else {
                    fVar.m(2, roomEvent.getEventName());
                }
                fVar.F(3, roomEvent.getAction());
                if (roomEvent.getContext() == null) {
                    fVar.a0(4);
                } else {
                    fVar.m(4, roomEvent.getContext());
                }
                if (roomEvent.getData() == null) {
                    fVar.a0(5);
                } else {
                    fVar.m(5, roomEvent.getData());
                }
            }
        };
        this.__deletionAdapterOfRoomEvent = new b<RoomEvent>(jVar) { // from class: cm.aptoide.pt.database.room.EventDAO_Impl.2
            @Override // androidx.room.b, androidx.room.q
            public String createQuery() {
                return "DELETE FROM `event` WHERE `timestamp` = ?";
            }

            @Override // androidx.room.b
            public void bind(f fVar, RoomEvent roomEvent) {
                fVar.F(1, roomEvent.getTimestamp());
            }
        };
    }

    @Override // cm.aptoide.pt.database.room.EventDAO
    public void delete(RoomEvent roomEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomEvent.handle(roomEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.pt.database.room.EventDAO
    public m<List<RoomEvent>> getAll() {
        final androidx.room.m f2 = androidx.room.m.f("SELECT * FROM event", 0);
        return n.a(this.__db, false, new String[]{"event"}, new Callable<List<RoomEvent>>() { // from class: cm.aptoide.pt.database.room.EventDAO_Impl.3
            protected void finalize() {
                f2.z();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomEvent> call() throws Exception {
                Cursor b2 = androidx.room.t.c.b(EventDAO_Impl.this.__db, f2, false, null);
                try {
                    int b3 = androidx.room.t.b.b(b2, "timestamp");
                    int b4 = androidx.room.t.b.b(b2, "eventName");
                    int b5 = androidx.room.t.b.b(b2, "action");
                    int b6 = androidx.room.t.b.b(b2, "context");
                    int b7 = androidx.room.t.b.b(b2, "data");
                    ArrayList arrayList = new ArrayList(b2.getCount());
                    while (b2.moveToNext()) {
                        arrayList.add(new RoomEvent(b2.getLong(b3), b2.getString(b4), b2.getInt(b5), b2.getString(b6), b2.getString(b7)));
                    }
                    return arrayList;
                } finally {
                    b2.close();
                }
            }
        });
    }

    @Override // cm.aptoide.pt.database.room.EventDAO
    public void insert(RoomEvent roomEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomEvent.insert((c<RoomEvent>) roomEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
